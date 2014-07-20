/**
 * 
 */
package de.urszeidler.shr5.runtime.ui.views;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.PhaseCmd;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayAdapterFactory;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.util.RuntimeAdapterFactory;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementAdapterFactory;
import de.urszeidler.shr5.runtime.ui.widgets.BasicActionPanelWidget;
import de.urszeidler.shr5.runtime.ui.widgets.CombatTurnList;

import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

/**
 * @author urs
 */
public class CombatTurnView extends ViewPart implements ISelectionListener {
    public abstract class SelectionListenerImplementation implements SelectionListener {

        @Override
        public void widgetDefaultSelected(SelectionEvent e) {
            // TODO Auto-generated method stub

        }
    }

    public class EmptySelection implements ISelection {

        @Override
        public boolean isEmpty() {
            return true;
        }

    }

    public class HandlungsContenProvider implements IContentProvider, ITreeContentProvider {

        public HandlungsContenProvider(CombatTurn kampfrunde) {
            // TODO Auto-generated constructor stub
        }

        @Override
        public void dispose() {
            // TODO Auto-generated method stub

        }

        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

            rootContentProvider.inputChanged(viewer, oldInput, newInput);

            // TableItem[] items = table_handlungen.getItems();
            // for (TableItem tableItem : items) {
            //
            //
            //
            // GridPanel gridPanel = new GridPanel(table_handlungen, SWT.NONE);
            //
            // TableEditor editor = new TableEditor(table_handlungen);
            // editor.grabHorizontal = editor.grabVertical = true;
            // editor.minimumHeight = 160;
            // editor.setEditor(gridPanel, tableItem, 0);
            // }

        }

        @Override
        public Object[] getChildren(Object parentElement) {
            if (parentElement instanceof CombatTurn) {
                CombatTurn kr = (CombatTurn)parentElement;
                EList<PhaseCmd> phasen = kr.getActionPhases();

                return phasen.toArray();
            } else
                return rootContentProvider.getChildren(parentElement);
        }

        @Override
        public Object getParent(Object element) {
            if (element instanceof PhaseCmd) {
                PhaseCmd new_name = (PhaseCmd)element;
                return kampfrunde;
            }
            return rootContentProvider.getChildren(element);
        }

        @Override
        public boolean hasChildren(Object element) {
            if (element instanceof CombatTurn) {
                CombatTurn kr = (CombatTurn)element;
                EList<PhaseCmd> phasen = kr.getActionPhases();

                return phasen.size() > 0;
            }
            return rootContentProvider.hasChildren(element);
        }

        @Override
        public Object[] getElements(Object inputElement) {
            return getChildren(inputElement);
        }

    }

    public class SimpleListContenProvider implements IContentProvider, ITreeContentProvider {
        private AdapterFactoryContentProvider delegateContentProvider;

        public SimpleListContenProvider(AdapterFactoryContentProvider delegateContentProvider) {
            super();
            this.delegateContentProvider = delegateContentProvider;
        }

        @Override
        public void dispose() {
            // TODO Auto-generated method stub

        }

        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

            delegateContentProvider.inputChanged(viewer, oldInput, newInput);

        }

        @Override
        public Object[] getChildren(Object parentElement) {
            if (parentElement instanceof Collection<?>) {
                Collection<?> list = (Collection<?>)parentElement;
                return list.toArray();
            }
            return delegateContentProvider.getChildren(parentElement);
        }

        @Override
        public Object getParent(Object element) {
            return delegateContentProvider.getParent(element);
        }

        @Override
        public boolean hasChildren(Object element) {
            if (element instanceof Collection<?>) {
                Collection<?> list = (Collection<?>)element;
                return list.size() > 0;

            }
            return delegateContentProvider.hasChildren(element);
        }

        @Override
        public Object[] getElements(Object inputElement) {
            return getChildren(inputElement);
        }

    }

    // private SelectionProvider selectionProvider = new SelectionProvider();
    //
    // private SelectionProvider phaseSelectionProvider = new SelectionProvider();
    // private SelectionProvider rhSelectionProvider = new SelectionProvider();
    // private SelectionProvider lhSelectionProvider = new SelectionProvider();
    // private SelectionProvider runtimePersonSelectionProvider = new SelectionProvider();
    //
    // private EMFDataBindingContext ctx;
    //
    // private EMFUpdateValueStrategy updateStrategie;

    private AdapterFactoryItemDelegator itemDelegator;

    private LabelProvider labelProvider;

    // private BeschreibungUIToolkit personaToolkit;

    private CombatTurn kampfrunde;

    private ComposedAdapterFactory adapterFactory;

    // private GegenstandsUIToolkit rhGegenstandsUIToolkit;
    //
    // private GegenstandsUIToolkit lhGegenstandsUIToolkit;
    // private AbstaktPersona persona;
    private InitativePass currentPhase;

    // private GenericUItoolkit genericUItoolkit;

    private AdapterFactoryContentProvider rootContentProvider;

    private AdapterFactoryContentProvider actionListContentProvider;

    public CombatTurnView() {
        super();

        adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
        adapterFactory.addAdapterFactory(new GameplayAdapterFactory());
        adapterFactory.addAdapterFactory(new RuntimeAdapterFactory());
        adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
        // adapterFactory.addAdapterFactory(new ExtendedShadowrunAdapterFactory());
        adapterFactory.addAdapterFactory(new Shr5managementAdapterFactory());
        adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
        itemDelegator = new AdapterFactoryItemDelegator(adapterFactory);

        rootContentProvider = new AdapterFactoryContentProvider(adapterFactory);
        actionListContentProvider = new AdapterFactoryContentProvider(adapterFactory);

        labelProvider = new LabelProvider() {
            @Override
            public String getText(Object object) {
                return itemDelegator.getText(object);
            }

            @Override
            public Image getImage(Object object) {
                if (object instanceof InitativePass) {
                    InitativePass phc = (InitativePass)object;
                    if (phc.getSubject() == null)
                        return null;

                    return ExtendedImageRegistry.getInstance().getImage(itemDelegator.getImage(phc.getSubject().getCharacter()));
                }

                return ExtendedImageRegistry.getInstance().getImage(itemDelegator.getImage(object));
            }
        };

        // ctx = new EMFDataBindingContext(SWTObservables.getRealm(Display.getCurrent()));
        // updateStrategie = new EMFUpdateValueStrategy();
        // itemDelegator = AdapterFactoryUtil.getInstance().getItemDelegator();
        // labelProvider = AdapterFactoryUtil.getInstance().getLabelProvider();

        // personaToolkit =
        // new BeschreibungUIToolkit(updateStrategie, new
        // FormToolkit(Display.getCurrent()), ctx,
        // runtimePersonSelectionProvider);

        // new PersonaUIToolkit(updateStrategie, new FormToolkit(Display.getCurrent()), ctx, phaseSelectionProvider);
        // rhGegenstandsUIToolkit = new GegenstandsUIToolkit(updateStrategie, new FormToolkit(Display.getCurrent()), ctx,
        // rhSelectionProvider);
        // lhGegenstandsUIToolkit = new GegenstandsUIToolkit(updateStrategie, new FormToolkit(Display.getCurrent()), ctx,
        // lhSelectionProvider);
        //
        // genericUItoolkit = new GenericUItoolkit(updateStrategie, new FormToolkit(Display.getCurrent()), ctx,
        // runtimePersonSelectionProvider);

    }

    public static final String ID = "de.urszeidler.test.CombatTurnnView";

    private SashForm top = null;

    private Composite composite_bottom = null;

    private BasicActionPanelWidget basicActionPanel = null;

    // private Table table_handlungen = null;
    //
    // private TableViewer tableViewer = null;

    private HandlungsContenProvider contentProvider;

    private Tree tree;

    private TreeViewer treeViewer;

    private WritableValue phaseSelection = new WritableValue();
    private WritableValue runtimeCharacterSelection = new WritableValue();

    private CombatTurnList combatTurnList;

    //
    // private Adapter kampfrundenAdapter = new CombatTurnnAdapter();

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets
     * .Composite)
     */
    @Override
    public void createPartControl(Composite arg0) {
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 1;
        top = new SashForm(arg0, SWT.NONE);
        top.setLayout(gridLayout);

        GridData gridData = new GridData();
        gridData.horizontalAlignment = GridData.FILL;
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = true;
        gridData.verticalAlignment = GridData.FILL;
        // top.setLayoutData(gridData);
        top.setOrientation(SWT.VERTICAL);

        createBasicActionPanel();
        createComposite_bottom();

        basicActionPanel.getActionPanel().getTreeViewer().setContentProvider(new SimpleListContenProvider(actionListContentProvider));
        basicActionPanel.getActionPanel().getTreeViewer().setLabelProvider(labelProvider);

        contentProvider = new HandlungsContenProvider(kampfrunde);
        treeViewer.setContentProvider(contentProvider);
        treeViewer.setLabelProvider(labelProvider);

        treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

            @Override
            public void selectionChanged(SelectionChangedEvent event) {

                ISelection selection = event.getSelection();
                if (selection instanceof IStructuredSelection) {
                    IStructuredSelection ss = (IStructuredSelection)selection;
                    Object firstElement = ss.getFirstElement();
                    if (firstElement instanceof InitativePass) {
                        currentPhase = (InitativePass)firstElement;
                        RuntimeCharacter subject = currentPhase.getSubject();
                        if (subject == null)
                            return;

                        basicActionPanel.setPhase(currentPhase);
                        setPersonaHandlung(currentPhase);
                        // phaseSelection.setValue(personaHandlung);
                        // ManagedCharacter persona = subject.getCharacter();
                        // runtimePersonSelectionProvider.setSelection(new StructuredSelection(subject));
                        // runtimeCharacterSelection.setValue(subject);
                        //
                        // setPersonaHandlung(personaHandlung);
                        //
                        // phaseSelectionProvider.setSelection(new StructuredSelection(persona));
                        //
                        // if (subject.getRightHand() == null)
                        // rhSelectionProvider.setSelection(new EmptySelection());
                        // else
                        // rhSelectionProvider.setSelection(new StructuredSelection(subject.getRightHand()));
                        //
                        // if (subject.getLeftHand() == null)
                        // lhSelectionProvider.setSelection(new EmptySelection());
                        // else
                        // lhSelectionProvider.setSelection(new StructuredSelection(subject.getLeftHand()));

                    }
                }
            }
        });

        createActions();
    }

    private void createActions() {
        Action action1 = new Action() {
            public void run() {
                // showMessage("Action 1 executed");
                // currentPhase.redo();
                if (kampfrunde != null)
                    kampfrunde.redo();

                setTempCombatTurn(kampfrunde);
            }
        };
        action1.setText("Sort");
        action1.setToolTipText("sort tooltip");
        action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_ELCL_STOP));
        getViewSite().getActionBars().getToolBarManager().add(action1);
    }

    /**
     * initalise the actionTreeviewer
     * 
     * @param personaHandlung2
     */
    protected void setPersonaHandlung(InitativePass personaHandlung2) {

        IEditingDomainItemProvider editingDomainItemProvider = (IEditingDomainItemProvider)adapterFactory.adapt(personaHandlung2,
                IEditingDomainItemProvider.class);

        Collection<?> newChildDescriptors = editingDomainItemProvider.getNewChildDescriptors(personaHandlung2, null, null);
        List<EObject> list = new ArrayList<EObject>();
        Set<Class<?>> set = new HashSet<Class<?>>();
        for (Object object : newChildDescriptors) {
            if (object instanceof CommandParameter) {
                CommandParameter cp = (CommandParameter)object;
                if (GameplayPackage.eINSTANCE.getCommand_SubCommands().equals(cp.feature)) {
                    // list.add(cp.getEValue());
                    if (set.add(cp.getEValue().getClass()))
                        list.add(cp.getEValue());
                }
            }
        }

        basicActionPanel.getActionPanel().getTreeViewer().setInput(list);
    }

    // protected void setPeronaActions(AbstaktPersona persona2) {
    //
    // }

    /*
     * (non-Javadoc) Method declared on IViewPart.
     */
    public void init(IViewSite site) throws PartInitException {
        site.getPage().addSelectionListener(this);
        super.init(site);
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
     */
    @Override
    public void setFocus() {
    }

    /**
     * This method initializes composite_bottom
     */
    private void createComposite_bottom() {
        GridData gridData1 = new GridData();
        gridData1.horizontalAlignment = GridData.FILL;
        gridData1.grabExcessHorizontalSpace = true;
        gridData1.grabExcessVerticalSpace = true;
        gridData1.verticalAlignment = GridData.FILL;
        composite_bottom = new Composite(top, SWT.NONE);
        composite_bottom.setLayout(new GridLayout());

        ScrolledComposite scrolledComposite = new ScrolledComposite(composite_bottom, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
        scrolledComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
        scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        scrolledComposite.setExpandHorizontal(true);
        scrolledComposite.setExpandVertical(true);

        combatTurnList = new CombatTurnList(scrolledComposite, SWT.NONE);
        scrolledComposite.setContent(combatTurnList);
        // scrolledComposite.setMinSize(20,20);

        tree = new Tree(composite_bottom, SWT.NONE);
        tree.setLayoutData(gridData1);
        treeViewer = new TreeViewer(tree);
    }

    @Override
    public void dispose() {
        tree.dispose();
        getSite().getPage().removeSelectionListener(this);
        super.dispose();
    }

    /**
     * This method initializes basicActionPanel
     */
    private void createBasicActionPanel() {
        GridData gridData = new GridData();
        gridData.horizontalAlignment = GridData.FILL;
        gridData.verticalAlignment = GridData.CENTER;
        basicActionPanel = new BasicActionPanelWidget(top, SWT.NONE);
        basicActionPanel.setLayoutData(gridData);

        // EMFObservables.observeDetailValue(ctx.getValidationRealm(), phaseSelection,
        // GameplayPackage.Literals.PHASE_CMD__PHASE
        // );
        // basicActionPanel.getLabel_image() FeaturePath.fromList()

        // ActionPanelBinder.bindBasic(basicActionPanel, personaToolkit);
        // ActionPanelBinder.bindBasic(basicActionPanel, rhGegenstandsUIToolkit, lhGegenstandsUIToolkit);
        // ActionPanelBinder.bindRuntimePerson(basicActionPanel.getStateMonitor(), genericUItoolkit);
        //
        // basicActionPanel.getActionPanel().getButton_change_rh().addSelectionListener(
        // new SelectionListenerImplementation() {
        //
        // @Override
        // public void widgetSelected(SelectionEvent e) {
        // // Object choosen = personaToolkit.handleSingleReferenceChoosen(shadowrunPackage.eINSTANCE
        // // .getAbstaktPersona_RechteHand());
        // // SetObjectFeatureCommand changeCommand = CommandFactory.createChangeCommand(choosen,
        // // shadowrunPackage.eINSTANCE.getAbstaktPersona_RechteHand());
        // // changeCommand.setObject(persona);
        // // FreieHandlungWrapper handlungWrapper = commandstackFactory.eINSTANCE
        // // .createFreieHandlungWrapper();
        // // handlungWrapper.setWrappedCommand(changeCommand);
        // // handlungWrapper.setSubject(personaHandlung.getSubject());
        // //
        // // personaHandlung.setFreie(handlungWrapper);
        // // handlungWrapper.redo();
        // }
        //
        // });
        //
        // basicActionPanel.getActionPanel().getButton_change_lh().addSelectionListener(
        // new SelectionListenerImplementation() {
        //
        // @Override
        // public void widgetSelected(SelectionEvent e) {
        //
        // // Object choosen = personaToolkit.handleSingleReferenceChoosen(shadowrunPackage.eINSTANCE
        // // .getAbstaktPersona_LinkeHand());
        // // SetObjectFeatureCommand changeCommand = CommandFactory.createChangeCommand(choosen,
        // // shadowrunPackage.eINSTANCE.getAbstaktPersona_LinkeHand());
        // // changeCommand.setObject(persona);
        // // changeCommand.redo();
        //
        // }
        // });
        //
        // basicActionPanel.getActionPanel().getButton_use_rh().addSelectionListener(
        // new SelectionListenerImplementation() {
        //
        // @Override
        // public void widgetSelected(SelectionEvent e) {
        // // CommandFactory.createDefaultCommand(persona.getRechteHand(), personaHandlung);
        //
        // }
        // });
        //
        // basicActionPanel.getActionPanel().getButton_use_lh().addSelectionListener(
        // new SelectionListenerImplementation() {
        // @Override
        // public void widgetSelected(SelectionEvent e) {
        // // CommandFactory.createDefaultCommand(persona.getLinkeHand(), personaHandlung);
        //
        // }
        //
        // });
    }

    // public void addPostSelectionChangedListener(ISelectionChangedListener listener) {
    // selectionProvider.addPostSelectionChangedListener(listener);
    // }
    //
    // public void addSelectionChangedListener(ISelectionChangedListener listener) {
    // selectionProvider.addSelectionChangedListener(listener);
    // }
    //
    // public ISelection getSelection() {
    // return selectionProvider.getSelection();
    // }
    //
    // public void postSelectionChanged(SelectionChangedEvent event) {
    // selectionProvider.postSelectionChanged(event);
    // }
    //
    // public void removePostSelectionChangedListener(ISelectionChangedListener listener) {
    // selectionProvider.removePostSelectionChangedListener(listener);
    // }
    //
    // public void removeSelectionChangedListener(ISelectionChangedListener listener) {
    // selectionProvider.removeSelectionChangedListener(listener);
    // }
    //
    // public void selectionChanged(SelectionChangedEvent event) {
    // selectionProvider.selectionChanged(event);
    // }
    //
    // public void setSelection(ISelection selection) {
    // selectionProvider.setSelection(selection);
    // }

    @Override
    public void selectionChanged(IWorkbenchPart part, ISelection selection) {
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection ss = (IStructuredSelection)selection;
            Object firstElement = ss.getFirstElement();
            if (firstElement instanceof CombatTurn) {
                CombatTurn kr = (CombatTurn)firstElement;
                setTempCombatTurn(kr);
            }
            // selectionProvider.setSelection(selection);
        }

    }

    private void setTempCombatTurn(CombatTurn kr) {
        treeViewer.setInput(kr);
        kampfrunde = kr;
        combatTurnList.setCombatTurn(kr);
    }

}
