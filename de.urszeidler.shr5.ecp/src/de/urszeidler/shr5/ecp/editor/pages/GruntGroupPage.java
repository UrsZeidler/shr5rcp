package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
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

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.GruntGroup;
import de.urszeidler.eclipse.shr5Management.GruntMembers;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;
import de.urszeidler.shr5.ecp.editor.widgets.TreeTableWidget;

public class GruntGroupPage extends AbstractShr5Page<GruntGroup> {
    private GruntGroup object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;


    private Composite detail;
    private Composite composite_detail;

    // private Table table;
    // private TableViewer tableViewer;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public GruntGroupPage(String id, String title) {
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
    public GruntGroupPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        this.object = Shr5managementFactory.eINSTANCE.createGruntGroup();
    }

    public GruntGroupPage(FormEditor editor, String id, String title, GruntGroup object, EditingDomain editingDomain, ReferenceManager manager) {
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
        final FormToolkit toolkit = managedForm.getToolkit();
        ScrolledForm form = managedForm.getForm();
        form.setText(AdapterFactoryUtil.getInstance().getLabelProvider().getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(managedForm.getForm().getBody(), SWT.NONE, object, toolkit, editingDomain);
        GridData gd_beschreibbarWidget = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
        gd_beschreibbarWidget.widthHint = 0;
        gd_beschreibbarWidget.heightHint = 0;
        beschreibbarWidget.setLayoutData(gd_beschreibbarWidget);
        managedForm.getToolkit().adapt(beschreibbarWidget);
        managedForm.getToolkit().paintBordersFor(beschreibbarWidget);

        Composite composite_professional_rating = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite_professional_rating.setLayout(new GridLayout(3, false));
        composite_professional_rating.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().adapt(composite_professional_rating);
        managedForm.getToolkit().paintBordersFor(composite_professional_rating);

        Group grpLeader = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpLeader.setLayout(new FillLayout(SWT.HORIZONTAL));
        grpLeader.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        grpLeader.setText("Leader");
        managedForm.getToolkit().adapt(grpLeader);
        managedForm.getToolkit().paintBordersFor(grpLeader);
        if (object.getLeader() == null) {
            object.setLeader(Shr5managementFactory.eINSTANCE.createGruntMembers());
        }

        Composite composite_grunt_groups = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite_grunt_groups.setLayout(new GridLayout(2, true));
        composite_grunt_groups.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
        managedForm.getToolkit().adapt(composite_grunt_groups);
        managedForm.getToolkit().paintBordersFor(composite_grunt_groups);

        ISelectionChangedListener selectionChange= new ISelectionChangedListener() {            
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
              Object element = ( (IStructuredSelection) event.getSelection()).getFirstElement();
              if (element != null) {
                  if (detail != null) {
                      detail.dispose();
                  }
                  detail = createDetail(composite_detail, toolkit, (GruntMembers)element);

                  composite_detail.getParent().layout(true, true);
                  detail.layout(true, true);
              }  
            }
        };
        TreeTableWidget treeTableWidget = new TreeTableWidget(composite_grunt_groups, "Grunts Members", SWT.NONE, object,
                Shr5managementPackage.Literals.GRUNT_GROUP__MEMBERS, toolkit, mananger, editingDomain,selectionChange,this);
        treeTableWidget.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

        managedForm.getToolkit().adapt(treeTableWidget);
        managedForm.getToolkit().paintBordersFor(treeTableWidget);

        Composite composite = managedForm.getToolkit().createComposite(composite_grunt_groups, SWT.NONE);
        composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        composite.setLayout(new GridLayout(1, false));
        managedForm.getToolkit().paintBordersFor(composite);

        composite_detail = managedForm.getToolkit().createComposite(composite, SWT.NONE);
        composite_detail.setLayout(new FillLayout(SWT.HORIZONTAL));
        composite_detail.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        managedForm.getToolkit().paintBordersFor(composite_detail);

        m_bindingContext = initDataBindings();
        ownBinding(m_bindingContext);
        createDetail(grpLeader, managedForm.getToolkit(), object.getLeader());

        createFormBuilder(managedForm);
        emfFormBuilder.addTextEntry(Shr5managementPackage.Literals.GRUNT_GROUP__PROFESSIONAL_RATING, composite_professional_rating);

        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);

        managedForm.reflow(true);
    }

    private Composite createDetail(Composite composite, FormToolkit formToolkit, GruntMembers gruntMenbers) {
        Composite composite_detail = formToolkit.createComposite(composite, SWT.NONE);
        composite_detail.setLayout(new GridLayout(3, false));
        formToolkit.paintBordersFor(composite_detail);

        EmfFormBuilder builder = new EmfFormBuilder(formToolkit, AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil
                .getInstance().getLabelProvider(), editingDomain);
        builder.setBorderStyle(SWT.NONE);
        builder.addAllEntries(Shr5managementPackage.Literals.GRUNT_MEMBERS);

        builder.buildinComposite(m_bindingContext, composite_detail, gruntMenbers);

        composite.layout(true, true);
        return composite_detail;
    }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }

    /**
     * @param bindingContext
     */
    private void ownBinding(DataBindingContext bindingContext) {
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        return bindingContext;
    }
}
