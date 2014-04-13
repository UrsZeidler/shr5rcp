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
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.TreeTableWidget;

/**
 * This is a basic generic page to display eObjects in an form with an
 * emfformbilder.
 */
public class ManagedCharacterPage extends FormPage {
    private DataBindingContext m_bindingContext;

    protected ManagedCharacter object;
    protected EditingDomain editingDomain;
    protected ReferenceManager mananger;
    protected EmfFormBuilder emfFormBuilder;

    public ManagedCharacterPage(String id, String title) {
        super(id, title);
    }

    public ManagedCharacterPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        object = Shr5managementFactory.eINSTANCE.createPlayerCharacter();
    }

    /**
     * This is the main constructor usable for the editor.
     * 
     * @param editor
     * @param id
     * @param title
     * @param object
     * the object to display
     * @param editingDomain
     * the main edting domain
     * @param manager
     * the mananger for refrenece features
     */
    public ManagedCharacterPage(FormEditor editor, String id, String title, ManagedCharacter object, EditingDomain editingDomain,
            ReferenceManager manager) {
        super(editor, id, title);
        this.object = object;
        this.editingDomain = editingDomain;
        this.mananger = manager;
    }

    @Override
    public void dispose() {
        if (emfFormBuilder != null)
            emfFormBuilder.dispose();
        super.dispose();
    }

    /**
     * Simple Factory method to create the formbuilder.
     * 
     * @param managedForm
     */
    protected void createFormBuilder(IManagedForm managedForm) {
        emfFormBuilder = new EmfFormBuilder(managedForm.getToolkit(), AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil
                .getInstance().getLabelProvider(), editingDomain);
        emfFormBuilder.setManager(mananger);
        emfFormBuilder.setBorderStyle(SWT.NONE);

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

        Group grpAllgemein = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpAllgemein.setLayout(new GridLayout(2, true));
        grpAllgemein.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        grpAllgemein.setText("Allgemein");
        managedForm.getToolkit().adapt(grpAllgemein);
        managedForm.getToolkit().paintBordersFor(grpAllgemein);

        Composite composite_left = new Composite(grpAllgemein, SWT.NONE);
        composite_left.setLayout(new GridLayout(3, false));
        composite_left.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        managedForm.getToolkit().adapt(composite_left);
        managedForm.getToolkit().paintBordersFor(composite_left);

        Composite composite_right = new Composite(grpAllgemein, SWT.NONE);
        composite_right.setLayout(new GridLayout(3, false));
        composite_right.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        managedForm.getToolkit().adapt(composite_right);
        managedForm.getToolkit().paintBordersFor(composite_right);

        Composite composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite.setLayout(new FillLayout(SWT.HORIZONTAL));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        managedForm.getToolkit().adapt(composite);
        managedForm.getToolkit().paintBordersFor(composite);

        TreeTableWidget treeTableWidgetInventar = new TreeTableWidget(composite, "Inventar", SWT.NONE, object,
                Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR, toolkit, mananger, editingDomain);
        managedForm.getToolkit().adapt(treeTableWidgetInventar);
        managedForm.getToolkit().paintBordersFor(treeTableWidgetInventar);

        Composite composite_1 = new Composite(composite, SWT.NONE);
        managedForm.getToolkit().adapt(composite_1);
        managedForm.getToolkit().paintBordersFor(composite_1);
        composite_1.setLayout(new FillLayout(SWT.VERTICAL));

        TreeTableWidget treeTableWidgetConnections = new TreeTableWidget(composite_1, "Connections", SWT.NONE, object,
                Shr5managementPackage.Literals.MANAGED_CHARACTER__CONNECTIONS, toolkit, mananger, editingDomain);
        managedForm.getToolkit().adapt(treeTableWidgetConnections);
        managedForm.getToolkit().paintBordersFor(treeTableWidgetConnections);

        TreeTableWidget treeTableWidget_1 = new TreeTableWidget(composite_1, "Contracts", SWT.NONE, object,
                Shr5managementPackage.Literals.MANAGED_CHARACTER__CONTRACTS, toolkit, mananger, editingDomain);
        managedForm.getToolkit().adapt(treeTableWidget_1);
        managedForm.getToolkit().paintBordersFor(treeTableWidget_1);

        TreeTableWidget treeTableWidget = new TreeTableWidget(composite_1, "Vehicles", SWT.NONE, object,
                Shr5managementPackage.Literals.MANAGED_CHARACTER__VEHICELS, toolkit, mananger, editingDomain);
        managedForm.getToolkit().adapt(treeTableWidget);
        managedForm.getToolkit().paintBordersFor(treeTableWidget);

        m_bindingContext = initDataBindings();
        // +++++

        createFormBuilder(managedForm);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MANAGED_CHARACTER__SEX, composite_left);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MANAGED_CHARACTER__NATIVE_LANGUAGE, composite_left);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MANAGED_CHARACTER__CHOOSEN_LIFESTYLE, composite_left);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MANAGED_CHARACTER__KARMA_GAINT, composite_right);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MANAGED_CHARACTER__CURRENT_KARMA, composite_right);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.MANAGED_CHARACTER__NOTORIETY, composite_right);

        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);
        managedForm.reflow(true);

    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        return bindingContext;
    }
}