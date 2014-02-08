package de.urszeidler.shr5.ecp.editor.pages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.TreeTableWidget;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

public class CharacterAdvancement extends AbstractShr5Page<ManagedCharacter> {
    private ManagedCharacter object;
    private EditingDomain editingDomain;
    private Collection<EClass> selectableChanges;
    private Composite composite_form;
    private DataBindingContext m_bindingContext;
    private ComboViewer comboViewer;
    private Combo combo;
    private Changes currentChange;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public CharacterAdvancement(String id, String title) {
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
    public CharacterAdvancement(FormEditor editor, String id, String title) {
        super(editor, id, title);
        object = Shr5managementFactory.eINSTANCE.createPlayerCharacter();

        initalizeData();

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
    public CharacterAdvancement(FormEditor editor, String id, String title, ManagedCharacter object, EditingDomain editingDomain,
            ReferenceManager manager) {
        super(editor, id, title);
        this.object = object;
        this.editingDomain = editingDomain;
        this.mananger = manager;
        initalizeData();

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
        form.setText("Empty FormPage");
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        Group grpAddAnAdvacment = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpAddAnAdvacment.setLayout(new GridLayout(2, true));
        grpAddAnAdvacment.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        grpAddAnAdvacment.setText("Add an advacment");
        managedForm.getToolkit().adapt(grpAddAnAdvacment);
        managedForm.getToolkit().paintBordersFor(grpAddAnAdvacment);

      final  Composite composite_1 = new Composite(grpAddAnAdvacment, SWT.NONE);
        composite_1.setLayout(new GridLayout(2, false));
        composite_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(composite_1);
        managedForm.getToolkit().paintBordersFor(composite_1);

        Label lblType = managedForm.getToolkit().createLabel(composite_1, "type", SWT.NONE);
        lblType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

        comboViewer = new ComboViewer(composite_1, SWT.NONE);
        comboViewer.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
        comboViewer.setContentProvider(new ArrayContentProvider());
        comboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(SelectionChangedEvent event) {
                buildDetail( toolkit, event.getSelection());
            }
        });

        comboViewer.setInput(selectableChanges);
        combo = comboViewer.getCombo();
        combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(combo);

        final Composite composite_2 = new Composite(grpAddAnAdvacment, SWT.NONE);
        composite_2.setLayout(new FillLayout(SWT.HORIZONTAL));
        GridData gd_composite_2 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 5);
        gd_composite_2.heightHint = 200;
        composite_2.setLayoutData(gd_composite_2);


        managedForm.getToolkit().adapt(composite_2);
        managedForm.getToolkit().paintBordersFor(composite_2);

        composite_form = new Composite(composite_2, SWT.NONE);
        composite_form.setLayout(new GridLayout(3, false));
        managedForm.getToolkit().adapt(composite_form);
        managedForm.getToolkit().paintBordersFor(composite_form);

        ToolBar toolBar = new ToolBar(grpAddAnAdvacment, SWT.FLAT | SWT.RIGHT);
        managedForm.getToolkit().adapt(toolBar);
        managedForm.getToolkit().paintBordersFor(toolBar);

        ToolItem tltmDo = new ToolItem(toolBar, SWT.NONE);
        tltmDo.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                applyChange();
                combo.setEnabled(true);
                
            }
        });
        tltmDo.setText("do");
        
        ToolItem tltmCancel = new ToolItem(toolBar, SWT.NONE);
        tltmCancel.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                object.getChanges().remove(currentChange);
                combo.setEnabled(true);
            }
        });
        tltmCancel.setText("cancel");
        
        Label lblNewLabel = new Label(grpAddAnAdvacment, SWT.NONE);
        lblNewLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 2));
        managedForm.getToolkit().adapt(lblNewLabel, true, true);
        new Label(grpAddAnAdvacment, SWT.NONE);

   Composite composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        composite.setLayout(new FillLayout(SWT.HORIZONTAL));
        managedForm.getToolkit().adapt(composite);
        managedForm.getToolkit().paintBordersFor(composite);

        TreeTableWidget treeTableWidget = new TreeTableWidget(composite, "The list of changes", SWT.NONE, object,
                Shr5managementPackage.Literals.MANAGED_CHARACTER__CHANGES, toolkit, mananger, editingDomain);
        managedForm.getToolkit().adapt(treeTableWidget);
        managedForm.getToolkit().paintBordersFor(treeTableWidget);

        Group grpSummary = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpSummary.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        grpSummary.setText("Summary");
        managedForm.getToolkit().adapt(grpSummary);
        managedForm.getToolkit().paintBordersFor(grpSummary);

        m_bindingContext = initDataBindings();
        // --------
        createFormBuilder(managedForm);

    }

    protected void applyChange() {
        if(currentChange!=null){
            currentChange.applyChanges();
        }
        
    }

    protected void buildDetail( FormToolkit toolkit, ISelection selection) {
        Composite parent = composite_form.getParent();
        composite_form.dispose();
        composite_form = new Composite(parent, SWT.NONE);
        composite_form.setLayout(new GridLayout(3, false));
        composite_form.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        toolkit.adapt(composite_form);
        toolkit.paintBordersFor(composite_form);
        combo.setEnabled(false);
        
        StructuredSelection ss = (StructuredSelection)selection;
        EClass eClass = (EClass)ss.getFirstElement();

        currentChange =(Changes) eClass.getEPackage().getEFactoryInstance().create(eClass);
        object.getChanges().add(currentChange);
        
        
        emfFormBuilder = new EmfFormBuilder(toolkit, AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil.getInstance()
                .getLabelProvider(), getEditingDomain());
        emfFormBuilder.setManager(mananger);
        emfFormBuilder.setBorderStyle(SWT.NONE);

        List<EStructuralFeature> eAllStructuralFeatures = new ArrayList<EStructuralFeature>( eClass.getEAllStructuralFeatures());
        eAllStructuralFeatures.remove(Shr5managementPackage.Literals.CHANGES__CHARACTER);
        emfFormBuilder.addAllEntries(eAllStructuralFeatures, composite_form);

        emfFormBuilder.buildinComposite(m_bindingContext, composite_form, currentChange);
        composite_form.layout();
        parent.layout();
        //grpAddAnAdvacment.layout();

    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        return bindingContext;
    }

    private void initalizeData() {
        selectableChanges = ShadowrunEditingTools.provideNewClassTypes(object, Shr5managementPackage.Literals.MANAGED_CHARACTER__CHANGES,
                editingDomain);
    }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }
}
