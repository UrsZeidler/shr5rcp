package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
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

import de.urszeidler.eclipse.shr5.Drug;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Substance;
import de.urszeidler.eclipse.shr5.Toxin;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;

public class SubstancePage extends AbstractShr5Page<Substance> {
    private Substance object;
    private EditingDomain editingDomain;

    protected DataBindingContext m_bindingContext;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public SubstancePage(String id, String title) {
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
    public SubstancePage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        this.object = Shr5Factory.eINSTANCE.createToxin();
    }

    public SubstancePage(FormEditor editor, String id, String title, Substance object) {
        super(editor, id, title);
        this.object = object;

    }

    /**
     * The main constructor.
     * 
     * @param editor
     * @param id
     * @param title
     * @param object
     * @param editingDomain
     * @param manager
     */
    public SubstancePage(FormEditor editor, String id, String title, Substance object, EditingDomain editingDomain, ReferenceManager manager) {
        super(editor, id, title, manager);
        this.object = object;
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
        form.setText(AdapterFactoryUtil.getInstance().getLabelProvider().getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(managedForm.getForm().getBody(), SWT.NONE, object, toolkit, editingDomain);
        // gd_beschreibbarWidget.widthHint = 0;
        beschreibbarWidget.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        managedForm.getToolkit().adapt(beschreibbarWidget);
        managedForm.getToolkit().paintBordersFor(beschreibbarWidget);

        Section sctnNewSection = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnNewSection.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnNewSection);
        sctnNewSection.setText(Messages.SubstancePage_attributes);
        sctnNewSection.setExpanded(true);

        Composite composite_1 = managedForm.getToolkit().createComposite(sctnNewSection, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(composite_1);
        sctnNewSection.setClient(composite_1);
        composite_1.setLayout(new GridLayout(6, false));

        Composite composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite.setLayout(new FillLayout(SWT.HORIZONTAL));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(composite);
        managedForm.getToolkit().paintBordersFor(composite);

        Group grpWert = new Group(composite, SWT.NONE);
        grpWert.setText(Messages.ObjectPage_price);
        managedForm.getToolkit().adapt(grpWert);
        managedForm.getToolkit().paintBordersFor(grpWert);
        grpWert.setLayout(new GridLayout(9, false));

        Group grpQuelle = new Group(composite, SWT.NONE);
        grpQuelle.setText(Messages.ObjectPage_source);
        managedForm.getToolkit().adapt(grpQuelle);
        managedForm.getToolkit().paintBordersFor(grpQuelle);
        grpQuelle.setLayout(new GridLayout(6, false));

        m_bindingContext = initDataBindings();

        {
            createFormBuilder(managedForm);

            emfFormBuilder.addTextEntry(Shr5Package.Literals.GELD_WERT__WERT_VALUE, grpWert);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.GELD_WERT__VERFUEGBARKEIT, grpWert);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MENGE__ANZAHL, grpWert);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.MENGE__PRO_ANZAHL, grpWert);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.GELD_WERT__WERT, grpWert);

            emfFormBuilder.addTextEntry(Shr5Package.Literals.QUELLE__SRC_BOOK, grpQuelle);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.QUELLE__PAGE, grpQuelle);

            emfFormBuilder.addTextEntry(Shr5Package.Literals.SUBSTANCE__VECTOR, composite_1);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.SUBSTANCE__SPEED, composite_1);
            if (object instanceof Toxin) {
                emfFormBuilder.addTextEntry(Shr5Package.Literals.TOXIN__POWER, composite_1);
                emfFormBuilder.addTextEntry(Shr5Package.Literals.TOXIN__PENETRATION, composite_1);
                emfFormBuilder.addTextEntry(Shr5Package.Literals.TOXIN__EFFECT, composite_1);
            } else if (object instanceof Drug) {
                emfFormBuilder.addTextEntry(Shr5Package.Literals.DRUG__ADDICTION_TYPE, composite_1);
                emfFormBuilder.addTextEntry(Shr5Package.Literals.DRUG__DURATION, composite_1);
            }
        }
        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);
        managedForm.reflow(true);
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        return bindingContext;
    }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }
}
