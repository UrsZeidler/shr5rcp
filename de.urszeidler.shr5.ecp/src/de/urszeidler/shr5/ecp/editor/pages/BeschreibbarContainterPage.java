package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.actions.ActionM2TDialog;
import de.urszeidler.shr5.ecp.editor.actions.ExportObjectAction;
import de.urszeidler.shr5.ecp.editor.actions.ImportObjectAction;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;
import de.urszeidler.shr5.ecp.editor.widgets.TreeTableWidget;

public class BeschreibbarContainterPage extends AbstractShr5Page<Beschreibbar> {
    private Beschreibbar object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;
    private EReference eReference;
    private String titel;
    private EReference[] eReferences = null;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public BeschreibbarContainterPage(String id, String title) {
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
    public BeschreibbarContainterPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        this.object = Shr5managementFactory.eINSTANCE.createCharacterGroup();
    }

    public BeschreibbarContainterPage(FormEditor editor, String id, String title, Beschreibbar object, EditingDomain editingDomain,
            ReferenceManager manager, EReference ref, String refTitel) {
        super(editor, id, title);
        this.object = object;
        this.editingDomain = editingDomain;
        this.mananger = manager;

        this.eReference = ref;
        this.titel = refTitel;

    }

    public BeschreibbarContainterPage(FormEditor editor, String id, String title, Beschreibbar object, EditingDomain editingDomain,
            ReferenceManager manager, EReference... ref) {
        super(editor, id, title);
        this.object = object;
        this.editingDomain = editingDomain;
        this.mananger = manager;

        this.eReferences = ref;
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
        form.getToolBarManager().add(new ActionM2TDialog(form.getShell(), object));
        form.getToolBarManager().add(new ExportObjectAction(form.getShell(), object));
        form.getToolBarManager().add(new ImportObjectAction(form.getShell(), object));
        form.getToolBarManager().update(true);

        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(managedForm.getForm().getBody(), SWT.NONE, object, toolkit, editingDomain);
        GridData gd_beschreibbarWidget = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
        beschreibbarWidget.setLayoutData(gd_beschreibbarWidget);
        managedForm.getToolkit().adapt(beschreibbarWidget);
        managedForm.getToolkit().paintBordersFor(beschreibbarWidget);

        if (eReferences == null) {
            TreeTableWidget treeTableWidget = new TreeTableWidget(managedForm.getForm().getBody(), titel, SWT.NONE, object, eReference, toolkit,
                    mananger, editingDomain, this);
            treeTableWidget.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
            managedForm.getToolkit().adapt(treeTableWidget);
            managedForm.getToolkit().paintBordersFor(treeTableWidget);
        } else {
            Composite composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);
            composite.setLayout(new GridLayout(eReferences.length == 1 ? 1 : 2, true));
            composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
            managedForm.getToolkit().adapt(composite);
            managedForm.getToolkit().paintBordersFor(composite);

            for (EReference ref : eReferences) {
                String refname = AdapterFactoryUtil.getInstance().getLabelProvider().getText(ref);
                TreeTableWidget treeTableWidget = new TreeTableWidget(composite, refname, SWT.NONE, object, ref, toolkit, mananger, editingDomain,
                        this);
                treeTableWidget.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
                managedForm.getToolkit().adapt(treeTableWidget);
                managedForm.getToolkit().paintBordersFor(treeTableWidget);
            }
        }
        m_bindingContext = initDataBindings();
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
