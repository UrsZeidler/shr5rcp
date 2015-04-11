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

import de.urszeidler.eclipse.shr5.Bodenfahrzeug;
import de.urszeidler.eclipse.shr5.Drohne;
import de.urszeidler.eclipse.shr5.Fahrzeug;
import de.urszeidler.eclipse.shr5.PassagierFahrzeug;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;

public class VehiclePage extends AbstractShr5Page<Fahrzeug> {
    private Fahrzeug object;
    private EditingDomain editingDomain;
    private DataBindingContext m_bindingContext;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public VehiclePage(String id, String title) {
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
    public VehiclePage(FormEditor editor, String id, String title) {
        super(editor, id, title);
    }

    public VehiclePage(FormEditor editor, String id, String title, Fahrzeug object, EditingDomain editingDomain, ReferenceManager manager) {
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
        addFillToolbar(form.getToolBarManager(), object, form.getShell());
        form.getToolBarManager().update(true);

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

        emfFormBuilder.addTextEntry(Shr5Package.Literals.FAHRZEUG__HANDLING, grpGegenstand);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.FAHRZEUG__BESCHLEUNIGUNG, grpGegenstand);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.FAHRZEUG__GESCHWINDIGKEIT, grpGegenstand);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.FAHRZEUG__PILOT, grpGegenstand);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.FAHRZEUG__RUMPF, grpGegenstand);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.FAHRZEUG__PANZER, grpGegenstand);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.FAHRZEUG__SENSOR, grpGegenstand);
        // emfFormBuilder.addTextEntry(Shr5Package.Literals.FAHRZEUG_ZUSTAND__ZUSTAND_MAX, grpGegenstand);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.FAHRZEUG__MODIFIZIERUNGEN, grpGegenstand);

        if (object instanceof Drohne) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.DROHNE__PROGRAM_SLOT_COUNT, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.DROHNE__STORED_PROGRAMS, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.DROHNE__RUNNING_PROGRAMS, grpGegenstand);
        } else if (object instanceof PassagierFahrzeug) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.PASSAGIER_FAHRZEUG__SITZE, grpGegenstand);
        }
        if (object instanceof Bodenfahrzeug) {
            emfFormBuilder.addTextEntry(Shr5Package.Literals.BODENFAHRZEUG__GESCHWINDIGKEIT_GELAENDE, grpGegenstand);
            emfFormBuilder.addTextEntry(Shr5Package.Literals.BODENFAHRZEUG__HANDLING_GELAENDE, grpGegenstand);
        }
        emfFormBuilder.addTextEntry(Shr5Package.Literals.FAHRZEUG__WEAPON_MOUNTS, grpGegenstand, new LabelEntry());

        addWertFeatures(grpWert);
        addSourceFeature(grpQuelle);

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
