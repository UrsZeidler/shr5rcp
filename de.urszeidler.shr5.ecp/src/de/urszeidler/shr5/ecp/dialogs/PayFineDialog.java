package de.urszeidler.shr5.ecp.dialogs;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.databinding.viewers.typed.ViewerProperties;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.wb.swt.ResourceManager;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;

import de.urszeidler.eclipse.shr5.Credstick;
import de.urszeidler.eclipse.shr5.IntervallVertrag;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.ContractPayment;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.shr5.ecp.util.DefaultLabelProvider;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;
import de.urszeidler.shr5.runtime.ui.views.SimpleListContenProvider;

public class PayFineDialog extends TitleAreaDialog {
    private DataBindingContext m_bindingContext;

    private PlayerCharacter character;
    private ILabelProvider labelProvider = new DefaultLabelProvider();
    private WritableList contracts = new WritableList();
    private WritableValue selectedCredstick = new WritableValue();
    private CheckboxTreeViewer checkboxTreeViewer;
    private ComboViewer comboViewer;

    private CDateTime dateTime;

    private Date baseDate;

    private List<ContractPayment> payments;


    /**
     * Create the dialog.
     * 
     * @param parentShell
     * @wbp.parser.constructor
     */
    public PayFineDialog(Shell parentShell) {
        super(parentShell);
    }

    /**
     * Create the dialog.
     * 
     * @param parentShell
     * @param date
     */
    public PayFineDialog(Shell parentShell, PlayerCharacter character, Date date) {
        super(parentShell);
        this.character = character;
        this.baseDate = date;
    }

    /**
     * Create contents of the dialog.
     * 
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        setTitleImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/title_banner-pay.png"));
        Composite area = (Composite)super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayout(new GridLayout(2, false));
        GridData gd_container = new GridData(GridData.FILL_BOTH);
        gd_container.heightHint = 178;
        container.setLayoutData(gd_container);

        Label lblDate = new Label(container, SWT.NONE);
        lblDate.setText("date");

        dateTime = new CDateTime(container, CDT.DROP_DOWN | CDT.DATE_SHORT);
        if (baseDate != null)
            dateTime.setSelection(baseDate);
        dateTime.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                Date date = dateTime.getSelection();
                if (date != null)
                    updateToDate(date);

                updateState();
            }
        });
        dateTime.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

        checkboxTreeViewer = new CheckboxTreeViewer(container, SWT.BORDER);
        checkboxTreeViewer.addCheckStateListener(new ICheckStateListener() {
            public void checkStateChanged(CheckStateChangedEvent event) {
                updateState();
            }
        });
        checkboxTreeViewer.setLabelProvider(labelProvider);
        Tree tree = checkboxTreeViewer.getTree();
        tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 2));
        checkboxTreeViewer.setContentProvider(new SimpleListContenProvider(new AdapterFactoryContentProvider(AdapterFactoryUtil.getInstance()
                .getAdapterFactory())));
        //
        checkboxTreeViewer.setInput(contracts);

        Composite composite = new Composite(container, SWT.NONE);
        composite.setLayout(new GridLayout(1, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));

        Label lblCredstick = new Label(container, SWT.NONE);
        lblCredstick.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblCredstick.setText("credstick");

        comboViewer = new ComboViewer(container, SWT.NONE);
        comboViewer.setLabelProvider(labelProvider);
        comboViewer.setContentProvider(ArrayContentProvider.getInstance());
        comboViewer.setInput(FluentIterable.from(character.getInventar()).filter(Credstick.class).toList());
        comboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                updateState();
            }
        });
        Combo combo_credstick = comboViewer.getCombo();
        combo_credstick.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        return area;
    }

    private void updateState() {
        StringBuffer errors = new StringBuffer();

        final Date selection = dateTime.getSelection();
        if (selectedCredstick.getValue() == null)
            errors.append("select credstick\n");
        if (selection == null)
            errors.append("select date\n");
        if (checkboxTreeViewer.getCheckedElements().length == 0)
            errors.append("select contract\n");

        if (errors.length() > 0) {
            setErrorMessage(errors.toString());
            return;
        }
        setErrorMessage(null);

        Function<IntervallVertrag, ContractPayment> function = new Function<IntervallVertrag, ContractPayment>() {

            @Override
            public ContractPayment apply(IntervallVertrag input) {
                ContractPayment contractPayment = Shr5managementFactory.eINSTANCE.createContractPayment();
                contractPayment.setContractToPay(input);
                contractPayment.setMessage(String.format("Pay for %s", labelProvider.getText(input)));
                return contractPayment;
            }
        };

        payments = new ArrayList<ContractPayment>(checkboxTreeViewer.getCheckedElements().length);
        for (Object o : checkboxTreeViewer.getCheckedElements()) {
            IntervallVertrag iv = (IntervallVertrag)o;
            ContractPayment payment = function.apply(iv);
            payments.add(payment);
        }
        
        ImmutableList<String> list = FluentIterable.from(payments).transform(ShadowrunEditingTools.eObject2StringTransformer()).toList();
        setMessage(list.toString());
    }

    private void updateToDate(final Date date) {
        ImmutableList<IntervallVertrag> list = FluentIterable.from(character.getContracts()).filter(IntervallVertrag.class)
                .filter(new Predicate<IntervallVertrag>() {

                    @Override
                    public boolean apply(IntervallVertrag input) {
                        
                        Date begin = getLastPaymentDate(input,date);//input.getBegin();
                        if(begin==null)
                            return false;
                        
                        Calendar instance = getNextPayment(input, begin);
                        return instance.getTime().after(date);
                    }
                }).toList();// .copyInto(contracts);
        checkboxTreeViewer.setInput(list);
    }

    private Date getLastPaymentDate(IntervallVertrag input, Date date) {
        ImmutableList<ContractPayment> lastpay = FluentIterable.from(character.getDiary().getEntries()).filter(ContractPayment.class).toSortedList(new Comparator<ContractPayment>() {
            @Override
            public int compare(ContractPayment o1, ContractPayment o2) {
                if(o1.getDate()!=null && o2.getDate()!=null)
                    return o1.getDate().compareTo(o2.getDate())*-1;
                return 0;
            }
        });
        if(lastpay.isEmpty())
            return input.getBegin();
        else
            return lastpay.get(0).getDate();
    }

    /**
     * Create contents of the button bar.
     * 
     * @param parent
     */
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
        m_bindingContext = initDataBindings();
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        return new Point(450, 320);
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue observeSingleSelectionComboViewer = ViewerProperties.singleSelection().observe(comboViewer);
        bindingContext.bindValue(observeSingleSelectionComboViewer, selectedCredstick, null, null);
        //
        return bindingContext;
    }

    public List<ContractPayment> getPayments() {
        return payments;
    }

    public Credstick getSelectedCredstick() {
        return (Credstick)selectedCredstick.getValue();
    }

    /**
     * @param input
     * @param begin
     * @return
     */
    public static Calendar getNextPayment(IntervallVertrag input, Date begin) {
        int faelligkeitsIntervall = input.getFaelligkeitsIntervall();
        Calendar instance = Calendar.getInstance();
        instance.setTime(begin);
        int field = 0;
        switch (input.getUnit()) {
            case DAY:
                field = Calendar.DAY_OF_YEAR;
                break;
            case WEEK:
                field = Calendar.WEEK_OF_YEAR;
                break;
            case MONTH:
                field = Calendar.MONTH;
                break;
            case YEAR:
                field = Calendar.YEAR;
                break;

            default:
                break;
        }
        instance.add(field, faelligkeitsIntervall);
        return instance;
    }

}
