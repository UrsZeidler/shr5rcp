/**
 * 
 */
package de.urszeidler.shr5.ecp.editor.pages.character;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.wb.swt.ResourceManager;

import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;

import de.urszeidler.eclipse.shr5.CredstickTransaction;
import de.urszeidler.eclipse.shr5.IntervallVertrag;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Vertrag;
import de.urszeidler.eclipse.shr5Management.CharacterDiary;
import de.urszeidler.eclipse.shr5Management.ContractPayment;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.dialogs.PayFineDialog;
import de.urszeidler.shr5.ecp.editor.pages.AbstractShr5Page;
import de.urszeidler.shr5.ecp.editor.widgets.TreeTableWidget;

/**
 * @author urs
 */
public class CharacterDiaryPage extends AbstractShr5Page<CharacterDiary> {
    private CharacterDiary object;
    private EditingDomain editingDomain;
    protected DataBindingContext m_bindingContext;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public CharacterDiaryPage(String id, String title) {
        super(id, title);
    }

    /**
     * The main contructor.
     * 
     * @param editor
     * @param id
     * @param title
     * @param object
     * @param editingDomain
     * @param manager
     */
    public CharacterDiaryPage(FormEditor editor, String id, String title, CharacterDiary object, EditingDomain editingDomain, ReferenceManager manager) {
        super(editor, id, title);
        this.object = object;
        this.editingDomain = editingDomain;
        this.mananger = manager;

    }

    /**
     * Create contents of the form.
     * 
     * @param managedForm
     */
    @Override
    protected void createFormContent(IManagedForm managedForm) {
        final FormToolkit toolkit = managedForm.getToolkit();
        ScrolledForm form = managedForm.getForm();
        form.setText(labelprovider.getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        Action action = new Action(null,ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/newyen.png")) {
            @Override
            public void run() {
                PlayerCharacter character = (PlayerCharacter)object.eContainer();
                PayFineDialog payFineDialog = new PayFineDialog(getEditor().getSite().getShell(), character, object.getCharacterDate());
                if (payFineDialog.open() == org.eclipse.jface.dialogs.Dialog.OK) {
                    List<ContractPayment> payments = payFineDialog.getPayments();
                    if(payments==null)
                        return;
                    for (ContractPayment contractPayment : payments) {
                        IntervallVertrag contractToPay = (IntervallVertrag)contractPayment.getContractToPay();
                        if(contractPayment.isPayed())
                            continue;
                        Date paymentDate = getPaymentDate(contractToPay);
                        Date date = paymentDate != null ? paymentDate : contractToPay.getBegin();

                        Date nextDate = PayFineDialog.getNextPayment(contractToPay, date).getTime();
                        BigDecimal wert = contractToPay.getWert();
                        CredstickTransaction transaction = Shr5Factory.eINSTANCE.createCredstickTransaction();
                        transaction.setAmount(wert.negate());
                        transaction.setDate(nextDate);
                        transaction.setDescription(contractPayment.getMessage());
                        payFineDialog.getSelectedCredstick().getTransactionlog().add(transaction);

                        contractPayment.setDate(nextDate);
                        contractPayment.setPayed(true);
                        object.getEntries().add(contractPayment);
                    }
                }
            }
        };
        action.setToolTipText("Pay all contracts.");
        Action syncDiaryAction = new Action(null,ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/sync-time.png")) {
            @Override
            public void run() {
                ManagedCharacter character = (ManagedCharacter)object.eContainer();
                object.setCharacterDate(ShadowrunManagmentTools.findCorrenspondingDate(character));
            }
        };
        syncDiaryAction.setToolTipText("Sync the diary Date.");
        form.getToolBarManager().add(syncDiaryAction);
        form.getToolBarManager().add(action);
        form.getToolBarManager().update(true);

        toolkit.paintBordersFor(body);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        Group grpCurrentDate = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpCurrentDate.setLayout(new GridLayout(3, false));
        grpCurrentDate.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
        grpCurrentDate.setText("Personal Diary");
        managedForm.getToolkit().adapt(grpCurrentDate);
        managedForm.getToolkit().paintBordersFor(grpCurrentDate);

        Composite composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite.setLayout(new GridLayout(6, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        managedForm.getToolkit().adapt(composite);
        managedForm.getToolkit().paintBordersFor(composite);

        initDataBindings();
        createFormBuilder(managedForm);

        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CHARACTER_DIARY__CHARACTER_DATE, grpCurrentDate, new DateEntryFactory(toolkit));
//        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.CHARACTER_DIARY__ENTRIES, grpCurrentDate, createControllGridData(300));
        
        Composite compositeEigenschaften = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        compositeEigenschaften.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        compositeEigenschaften.setLayout(new FillLayout(SWT.HORIZONTAL));
        toolkit.adapt(compositeEigenschaften);
        toolkit.paintBordersFor(compositeEigenschaften);

        
        TreeTableWidget treeTableWidgetEigenschaften = new TreeTableWidget(compositeEigenschaften,labelprovider.getText(object.eClass()),
                SWT.NONE, object, Shr5managementPackage.Literals.CHARACTER_DIARY__ENTRIES, toolkit, mananger, editingDomain, this,this);
        managedForm.getToolkit().adapt(treeTableWidgetEigenschaften);
        managedForm.getToolkit().paintBordersFor(treeTableWidgetEigenschaften);
        
        
        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);
        managedForm.reflow(true);
    }


    private Date getPaymentDate(final Vertrag contractToPay) {
        ImmutableList<ContractPayment> sortedList = FluentIterable.from(object.getEntries()).filter(ContractPayment.class)
                .filter(new Predicate<ContractPayment>() {

                    @Override
                    public boolean apply(ContractPayment input) {
                        return input.getContractToPay()==contractToPay;
                    }
                }).toSortedList(new Comparator<ContractPayment>() {

                    @Override
                    public int compare(ContractPayment o2, ContractPayment o1) {
                        if(o1==null && o2==null)
                            return 0;
                        if(o1.getDate()==null)
                            return -1;
                        if(o2==null)
                            return 1;
                      return o1.getDate().compareTo(o2.getDate());                   
                    }
                });
        if (sortedList.isEmpty())
            return null;
        else
           return sortedList.get(0).getDate();
    }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        m_bindingContext = bindingContext;
        //
        return bindingContext;
    }
}
