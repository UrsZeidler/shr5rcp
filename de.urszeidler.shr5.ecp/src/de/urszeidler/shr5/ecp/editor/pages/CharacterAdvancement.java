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

import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.TreeTableWidget;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;
import de.urszeidler.shr5.ecp.editor.widgets.CharacterAdvacementWidget;

public class CharacterAdvancement extends AbstractShr5Page<ManagedCharacter> {
    private ManagedCharacter object;
    private EditingDomain editingDomain;
    private DataBindingContext m_bindingContext;

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
        object.setPersona(Shr5Factory.eINSTANCE.createMudanPersona());

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
        form.setText("Character advacements");
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        Composite composite_advacements = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite_advacements.setLayout(new FillLayout(SWT.HORIZONTAL));
        GridData gd_composite_advacements = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
        gd_composite_advacements.heightHint = 106;
        composite_advacements.setLayoutData(gd_composite_advacements);
        managedForm.getToolkit().adapt(composite_advacements);
        managedForm.getToolkit().paintBordersFor(composite_advacements);

        CharacterAdvacementWidget characterAdvacementWidget = new CharacterAdvacementWidget(composite_advacements, SWT.NONE, editingDomain, object,
                toolkit);
        managedForm.getToolkit().adapt(characterAdvacementWidget);
        managedForm.getToolkit().paintBordersFor(characterAdvacementWidget);

        Composite composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
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
