package de.urszeidler.shr5.ecp.editor.pages;



import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.LabelProvider;
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
import org.eclipse.ui.forms.widgets.Section;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Geist;
import de.urszeidler.eclipse.shr5.KomplexeForm;
import de.urszeidler.eclipse.shr5.MetaMagie;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;
import de.urszeidler.shr5.scripting.Handout;
import de.urszeidler.shr5.scripting.ScriptingPackage;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.emf.databinding.edit.EMFEditObservables;

import de.urszeidler.shr5.scripting.ScriptingPackage.Literals;

/**
 * Use for object that is only a {@link Beschreibbar}.
 * 
 * @author urs
 */
public class VariousDescriptionPage extends AbstractShr5Page<Beschreibbar> {
    private Handout object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;
    private Text txtLocationtext;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public VariousDescriptionPage(String id, String title) {
        super(id, title);
    }

    /**
     * Create the form page.
     * 
     * @param editor
     * @param id
     * @param title
     * @wbp.parser.constructor
     * @wbp.eval.method.parameter id "Some id"
     * @wbp.eval.method.parameter title "Some title"
     */
    public VariousDescriptionPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        // this.object = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();
    }

    public VariousDescriptionPage(FormEditor editor, String id, String title, Beschreibbar object, EditingDomain editingDomain,
            ReferenceManager mananger1) {
        super(editor, id, title, mananger1);
        this.object = (Handout)object;
        this.editingDomain = editingDomain;

    }

    /**
     * Create contents of the form.
     * 
     * @param managedForm
     */
    @Override
    protected void createFormContent(IManagedForm managedForm) {
        FormToolkit toolkit = managedForm.getToolkit();
        ScrolledForm form = managedForm.getForm();
        LabelProvider labelProvider = AdapterFactoryUtil.getInstance().getLabelProvider();
        form.setText(labelProvider.getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(managedForm.getForm().getBody(), SWT.NONE, object, toolkit, editingDomain);
        // gd_beschreibbarWidget.widthHint = 0;
        beschreibbarWidget.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        managedForm.getToolkit().adapt(beschreibbarWidget);
        managedForm.getToolkit().paintBordersFor(beschreibbarWidget);

        Group grpGegenstand = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpGegenstand.setLayout(new GridLayout(3, false));
        grpGegenstand.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(grpGegenstand);
        managedForm.getToolkit().paintBordersFor(grpGegenstand);

        Composite composite_Additional = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite_Additional.setLayout(new GridLayout(3, false));
        composite_Additional.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        managedForm.getToolkit().adapt(composite_Additional);
        managedForm.getToolkit().paintBordersFor(composite_Additional);

        Composite composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite.setLayout(new FillLayout(SWT.HORIZONTAL));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(composite);
        managedForm.getToolkit().paintBordersFor(composite);

        // Group grpWert = new Group(composite, SWT.NONE);
        // grpWert.setText(Messages.ObjectPage_price);
        // managedForm.getToolkit().adapt(grpWert);
        // managedForm.getToolkit().paintBordersFor(grpWert);
        // grpWert.setLayout(new GridLayout(9, false));
        if (object instanceof Handout)
            buildUrlWidget(managedForm, grpGegenstand);
        m_bindingContext = initDataBindings();
        createFormBuilder(managedForm);

        grpGegenstand.setText(labelProvider.getText(object.eClass()));

        if (object instanceof Handout) {
            Handout ho = (Handout)object;
            emfFormBuilder.addTextEntry(ScriptingPackage.Literals.HANDOUT__TYPE, grpGegenstand);
        }

        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);

        managedForm.reflow(true);
    }

    /**
     * @param managedForm
     * @param grpGegenstand
     */
    private void buildUrlWidget(IManagedForm managedForm, Group grpGegenstand) {
        Label lblLocation = new Label(grpGegenstand, SWT.NONE);
        lblLocation.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().adapt(lblLocation, true, true);
        lblLocation.setText("location");

        txtLocationtext = new Text(grpGegenstand, SWT.BORDER);
        txtLocationtext.setText("locationText");
        txtLocationtext.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(txtLocationtext, true, true);

        Button btnSelect = new Button(grpGegenstand, SWT.NONE);
        btnSelect.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                Handout h = (Handout)object;
                switch (h.getType()) {
                    case WEBPAGE:
                        break;
                    case IMAGE:
                    case DOCUMENT:
                        String name= new FileDialog(Display.getDefault().getActiveShell(), SWT.OPEN).open();
                        if (name != null){
                            Handout ho = (Handout)object;
                            ho.setUrl(name);
                        }                         
                        break;

                    default:
                        break;
                }
            }
        });
        managedForm.getToolkit().adapt(btnSelect, true, true);
        btnSelect.setText("select");
    }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        if (object instanceof Handout) {
            //
            IObservableValue observeTextTxtLocationtextObserveWidget = WidgetProperties.text(SWT.Modify).observeDelayed(200, txtLocationtext);
            IObservableValue objectUrlObserveValue = EMFEditObservables.observeValue(editingDomain, object, Literals.HANDOUT__URL);
            bindingContext.bindValue(observeTextTxtLocationtextObserveWidget, objectUrlObserveValue, null, null);
            //
        }
        return bindingContext;
    }
}
