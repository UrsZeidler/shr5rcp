package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;

/**
 * This pages handles {@link Spezies}.
 * 
 * @author urs
 */
public class SpeziesPage extends AbstractShr5Page<Spezies> {
    private Spezies object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public SpeziesPage(String id, String title) {
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
    public SpeziesPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        this.object = Shr5Factory.eINSTANCE.createSpezies();
    }

    public SpeziesPage(FormEditor editor, String id, String title, Spezies object) {
        super(editor, id, title);
        this.object = object;

    }

    public SpeziesPage(FormEditor editor, String id, String title, Spezies object, EditingDomain editingDomain, ReferenceManager manager) {
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
        GridData gd_beschreibbarWidget = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);


        beschreibbarWidget.setLayoutData(gd_beschreibbarWidget);
        managedForm.getToolkit().adapt(beschreibbarWidget);
        managedForm.getToolkit().paintBordersFor(beschreibbarWidget);

        Group grpSpeziesBasis = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpSpeziesBasis.setLayout(new GridLayout(6, false));
        grpSpeziesBasis.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        grpSpeziesBasis.setText(Messages.ObjectPage_species_basic);
        managedForm.getToolkit().adapt(grpSpeziesBasis);
        managedForm.getToolkit().paintBordersFor(grpSpeziesBasis);

        Group grpLaufmodifikator = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpLaufmodifikator.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        grpLaufmodifikator.setText(Messages.ObjectPage_movement);
        managedForm.getToolkit().adapt(grpLaufmodifikator);
        managedForm.getToolkit().paintBordersFor(grpLaufmodifikator);
        grpLaufmodifikator.setLayout(new GridLayout(9, false));

        Group grpQuelle = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpQuelle.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        grpQuelle.setText(Messages.ObjectPage_source);
        managedForm.getToolkit().adapt(grpQuelle);
        managedForm.getToolkit().paintBordersFor(grpQuelle);
        grpQuelle.setLayout(new GridLayout(6, false));

        m_bindingContext = initDataBindings();

        createFormBuilder(managedForm);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__KONSTITUTION_MIN, grpSpeziesBasis);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__KONSTITUTION_MAX, grpSpeziesBasis);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__GESCHICKLICHKEIT_MIN, grpSpeziesBasis);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__GESCHICKLICHKEIT_MAX, grpSpeziesBasis);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__REAKTION_MIN, grpSpeziesBasis);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__REAKTION_MAX, grpSpeziesBasis);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__STAERKE_MIN, grpSpeziesBasis);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__STAERKE_MAX, grpSpeziesBasis);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__CHARISMA_MIN, grpSpeziesBasis);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__CHARISMA_MAX, grpSpeziesBasis);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__INTUITION_MIN, grpSpeziesBasis);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__INTUITION_MAX, grpSpeziesBasis);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__LOGIK_MIN, grpSpeziesBasis);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__LOGIK_MAX, grpSpeziesBasis);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__WILLENSKRAFT_MIN, grpSpeziesBasis);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__WILLENSKRAFT_MAX, grpSpeziesBasis);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__EDGE_MIN, grpSpeziesBasis);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__EDGE_MAX, grpSpeziesBasis);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__MAGIE_MIN, grpSpeziesBasis);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__MAGIE_MAX, grpSpeziesBasis);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__RESONANZ_MIN, grpSpeziesBasis);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__RESONANZ_MAX, grpSpeziesBasis);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__ESSENZ_MIN, grpSpeziesBasis);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__ESSENZ_MAX, grpSpeziesBasis);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__LAUFEN, grpLaufmodifikator);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__RENNEN, grpLaufmodifikator);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.SPEZIES__SPRINTEN, grpLaufmodifikator);

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
