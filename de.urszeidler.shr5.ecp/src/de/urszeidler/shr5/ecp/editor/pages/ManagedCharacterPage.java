package de.urszeidler.shr5.ecp.editor.pages;

import java.util.Collection;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.Fahrzeug;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Vertrag;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Pack;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.NullObject;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.ShrReferenceManager;
import de.urszeidler.shr5.ecp.editor.actions.ActionM2TDialog;
import de.urszeidler.shr5.ecp.editor.widgets.TreeTableWidget;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

import org.eclipse.wb.swt.ResourceManager;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.FluentIterable;

/**
 * This is a basic generic page to display eObjects in an form with an
 * emfformbilder.
 */
public class ManagedCharacterPage extends AbstractShr5Page<ManagedCharacter> {
    private DataBindingContext m_bindingContext;

    protected ManagedCharacter object;
    protected EditingDomain editingDomain;

    // protected ReferenceManager mananger;
    // protected EmfFormBuilder emfFormBuilder;

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

    // @Override
    // public void dispose() {
    // if (emfFormBuilder != null)
    // emfFormBuilder.dispose();
    // super.dispose();
    // }

    // /**
    // * Simple Factory method to create the formbuilder.
    // *
    // * @param managedForm
    // */
    // protected void createFormBuilder(IManagedForm managedForm) {
    // emfFormBuilder = new EmfFormBuilder(managedForm.getToolkit(), AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil
    // .getInstance().getLabelProvider(), editingDomain);
    // emfFormBuilder.setManager(mananger);
    // emfFormBuilder.setBorderStyle(SWT.NONE);
    //
    // }

    /**
     * Create contents of the form.
     * 
     * @param managedForm
     */
    @Override
    protected void createFormContent(IManagedForm managedForm) {
        FormToolkit toolkit = managedForm.getToolkit();
        final ScrolledForm form = managedForm.getForm();
        form.setText(AdapterFactoryUtil.getInstance().getLabelProvider().getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        form.getToolBarManager().add(new ActionM2TDialog(form.getShell(), object));
        form.getToolBarManager().update(true);

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

        TreeTableWidget treeTableWidgetInventar = new TreeTableWidget(composite,
                featureName(Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR), SWT.NONE, object,
                Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR, toolkit, mananger, editingDomain, this);
        managedForm.getToolkit().adapt(treeTableWidgetInventar);
        managedForm.getToolkit().paintBordersFor(treeTableWidgetInventar);
        // we use the toolbar for the packs to add
        ToolBar optionalToolbar = treeTableWidgetInventar.getOptionalToolbar();
        optionalToolbar.setVisible(true);
        ToolItem toolItem = new ToolItem(optionalToolbar, SWT.PUSH);
        toolItem.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/add_pack_action.gif"));
        toolItem.setToolTipText("Adds a pack to the character.");
        toolItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (mananger instanceof ShrReferenceManager) {
                    ShrReferenceManager srm = (ShrReferenceManager)mananger;
                    Collection<EObject> collection = ItemPropertyDescriptor.getReachableObjectsOfType(object, Shr5managementPackage.Literals.PACK);
                    collection = srm.filterProvidedObjects(collection);
//                    collection = FluentIterable.from(collection).filter(
//                            Predicates.or(Predicates.instanceOf(AbstraktGegenstand.class), Predicates.instanceOf(Vertrag.class))).toList();

                    OwnChooseDialog dialog = new OwnChooseDialog(getEditorSite().getShell(), NullObject.toChoises(collection), "Select a pack", "");
                    dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());

                    int result = dialog.open();
                    if (result == Window.OK) {
                        Object[] list = dialog.getResult();

                        if (list != null && list.length == 1 && list[0] instanceof EObject) {
                            EObject eo = (EObject)list[0];
                            if (eo instanceof Pack) {
                                Pack p = (Pack)eo;
                                EList<Quelle> items = p.getItems();
                                for (Quelle item : items) {
                                    EObject copy = ShrReferenceManager.copyWithParentId(item);
                                    if (item instanceof AbstraktGegenstand) {
                                        object.getInventar().add((AbstraktGegenstand)copy);
                                    } else if (item instanceof Vertrag) {
                                        object.getContracts().add((Vertrag)copy);
                                    } else if (item instanceof Fahrzeug) {
                                        object.getVehicels().add((Fahrzeug)copy);
                                    }
                                }
                            }
                        }
                    }
                }

            }
        });

        Composite composite_1 = new Composite(composite, SWT.NONE);
        managedForm.getToolkit().adapt(composite_1);
        managedForm.getToolkit().paintBordersFor(composite_1);
        composite_1.setLayout(new FillLayout(SWT.VERTICAL));

        TreeTableWidget treeTableWidgetConnections = new TreeTableWidget(composite_1,
                featureName(Shr5managementPackage.Literals.MANAGED_CHARACTER__CONNECTIONS), SWT.NONE, object,
                Shr5managementPackage.Literals.MANAGED_CHARACTER__CONNECTIONS, toolkit, mananger, editingDomain, this);
        managedForm.getToolkit().adapt(treeTableWidgetConnections);
        managedForm.getToolkit().paintBordersFor(treeTableWidgetConnections);

        TreeTableWidget treeTableWidget_1 = new TreeTableWidget(composite_1,
                featureName(Shr5managementPackage.Literals.MANAGED_CHARACTER__CONTRACTS), SWT.NONE, object,
                Shr5managementPackage.Literals.MANAGED_CHARACTER__CONTRACTS, toolkit, mananger, editingDomain, this);
        managedForm.getToolkit().adapt(treeTableWidget_1);
        managedForm.getToolkit().paintBordersFor(treeTableWidget_1);

        TreeTableWidget treeTableWidget = new TreeTableWidget(composite_1, featureName(Shr5managementPackage.Literals.MANAGED_CHARACTER__VEHICELS),
                SWT.NONE, object, Shr5managementPackage.Literals.MANAGED_CHARACTER__VEHICELS, toolkit, mananger, editingDomain, this);
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

    private String featureName(EStructuralFeature feature) {
        return ShadowrunEditingTools.toFeatureName(object, feature);
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        return bindingContext;
    }

    // @Override
    // public void doubleClick(DoubleClickEvent event) {
    // ISelection selection = event.getSelection();
    // ShadowrunEditingTools.openEditorForFirstSelection(selection);
    // }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }
}