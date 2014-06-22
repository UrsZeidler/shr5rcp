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

import de.urszeidler.eclipse.shr5.AutoSoft;
import de.urszeidler.eclipse.shr5.CommonProgram;
import de.urszeidler.eclipse.shr5.ConsumerSoft;
import de.urszeidler.eclipse.shr5.Datasoft;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SkillSoft;
import de.urszeidler.eclipse.shr5.Software;
import de.urszeidler.eclipse.shr5.SoftwareAgent;
import de.urszeidler.eclipse.shr5.Tutorsoft;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;

public class SoftwarePage extends AbstractShr5Page<Software> {
    private Software object;
    private EditingDomain editingDomain;
    private DataBindingContext m_bindingContext;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public SoftwarePage(String id, String title) {
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
    public SoftwarePage(FormEditor editor, String id, String title) {
        super(editor, id, title);
    }

    public SoftwarePage(FormEditor editor, String id, String title, Software object, EditingDomain editingDomain, ReferenceManager manager) {
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
        LabelProvider labelProvider = AdapterFactoryUtil.getInstance().getLabelProvider();
        form.setText(labelProvider.getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);

        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(managedForm.getForm().getBody(), SWT.NONE, object, toolkit, editingDomain);
        GridData gd_beschreibbarWidget = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);

        beschreibbarWidget.setLayoutData(gd_beschreibbarWidget);
        managedForm.getToolkit().adapt(beschreibbarWidget);
        managedForm.getToolkit().paintBordersFor(beschreibbarWidget);

        Group grpGegenstand = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpGegenstand.setLayout(new GridLayout(6, false));
        grpGegenstand.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(grpGegenstand);
        managedForm.getToolkit().paintBordersFor(grpGegenstand);

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

        createFormBuilder(managedForm);

        grpGegenstand.setText(labelProvider.getText(object.eClass()));

        if (object instanceof SkillSoft) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.SKILL_SOFT__RATING, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.SKILL_SOFT__SKILL, grpGegenstand);
        } else if (object instanceof AutoSoft) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.AUTO_SOFT__RATING, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.AUTO_SOFT__MODEL, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.AUTO_SOFT__SKILL, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.AUTO_SOFT__WEAPON, grpGegenstand);
        } else if (object instanceof ConsumerSoft) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.CONSUMER_SOFT__TYPE, grpGegenstand);
        } else if (object instanceof Datasoft) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.DATASOFT__SKILL, grpGegenstand);
        } else if (object instanceof Tutorsoft) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.TUTORSOFT__RATING, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.TUTORSOFT__SKILL, grpGegenstand);
        } else if (object instanceof SoftwareAgent) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.SOFTWARE_AGENT__RATING, grpGegenstand);
        } else if (object instanceof CommonProgram) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.COMMON_PROGRAM__PROGRAM_TYPE, grpGegenstand);
        }

        emfFormBuilder.addTextEntry(Shr5Package.Literals.GELD_WERT__WERT_VALUE, grpWert);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.GELD_WERT__VERFUEGBARKEIT, grpWert);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.GELD_WERT__WERT, grpWert);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.QUELLE__SRC_BOOK, grpQuelle);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.QUELLE__PAGE, grpQuelle);

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
