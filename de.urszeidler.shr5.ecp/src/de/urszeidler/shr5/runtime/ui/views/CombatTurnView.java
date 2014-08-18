/**
 * 
 */
package de.urszeidler.shr5.runtime.ui.views;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.SWTResourceManager;

import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.PhaseCmd;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayAdapterFactory;
import de.urszeidler.eclipse.shr5.runtime.util.RuntimeAdapterFactory;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementAdapterFactory;
import de.urszeidler.shr5.ecp.service.CombatViewer;
import de.urszeidler.shr5.ecp.service.ScriptService;
import de.urszeidler.shr5.runtime.ui.widgets.BasicActionPanelWidget;
import de.urszeidler.shr5.runtime.ui.widgets.CombatTurnList;

/**
 * @author urs
 */
public class CombatTurnView extends ViewPart implements  CombatViewer {

    public class HandlungsContenProvider implements IContentProvider, ITreeContentProvider {

        public HandlungsContenProvider(CombatTurn kampfrunde) {
        }

        @Override
        public void dispose() {

        }

        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

            rootContentProvider.inputChanged(viewer, oldInput, newInput);

        }

        @Override
        public Object[] getChildren(Object parentElement) {
            if (parentElement instanceof CombatTurn) {
                CombatTurn kr = (CombatTurn)parentElement;
                EList<InitativePass> phasen = kr.getActionPhases();

                return phasen.toArray();
            } else
                return rootContentProvider.getChildren(parentElement);
        }

        @Override
        public Object getParent(Object element) {
            if (element instanceof PhaseCmd) {
                return combatTurn;
            }
            return rootContentProvider.getChildren(element);
        }

        @Override
        public boolean hasChildren(Object element) {
            if (element instanceof CombatTurn) {
                CombatTurn kr = (CombatTurn)element;
                EList<InitativePass> phasen = kr.getActionPhases();

                return phasen.size() > 0;
            }
            return rootContentProvider.hasChildren(element);
        }

        @Override
        public Object[] getElements(Object inputElement) {
            return getChildren(inputElement);
        }

    }

    private AdapterFactoryItemDelegator itemDelegator;
    private LabelProvider labelProvider;
    private CombatTurn combatTurn;
    private ComposedAdapterFactory adapterFactory;
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

    }

    public static final String ID = "de.urszeidler.test.CombatTurnnView";

    private SashForm top = null;
    private Composite composite_bottom = null;
    private BasicActionPanelWidget basicActionPanel = null;
    // private HandlungsContenProvider contentProvider;

    // private Tree tree;
    //
    // private TreeViewer treeViewer;

    // private WritableValue phaseSelection = new WritableValue();
    // private WritableValue runtimeCharacterSelection = new WritableValue();

    private CombatTurnList combatTurnList;
    private ScriptService scriptService;

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

        basicActionPanel.getActionPanel().getButton_do().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                executeCurrentCommand();
//                ISelection selection = basicActionPanel.getActionPanel().getTreeViewer().getSelection();
//                if (!selection.isEmpty()) {
//                    InitativePass currentTurn = combatTurn.getCurrentTurn();
//                    if (selection instanceof IStructuredSelection) {
//                        IStructuredSelection is = (IStructuredSelection)selection;
//                        Object firstElement = is.getFirstElement();
//                        if (firstElement instanceof SubjectCommand) {
//                            SubjectCommand sc = (SubjectCommand)firstElement;
//
//                            sc.setSubject(currentTurn.getSubject());
//                            scriptService.executeCommand(sc);
//                        }
//
//                    }
//                }
            }
        });

        // contentProvider = new HandlungsContenProvider(kampfrunde);
        // treeViewer.setContentProvider(contentProvider);
        // treeViewer.setLabelProvider(labelProvider);
        //
        // treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
        //
        // @Override
        // public void selectionChanged(SelectionChangedEvent event) {
        //
        // ISelection selection = event.getSelection();
        // if (selection instanceof IStructuredSelection) {
        // IStructuredSelection ss = (IStructuredSelection)selection;
        // Object firstElement = ss.getFirstElement();
        // if (firstElement instanceof InitativePass) {
        // currentPhase = (InitativePass)firstElement;
        // RuntimeCharacter subject = currentPhase.getSubject();
        // if (subject == null)
        // return;
        //
        // basicActionPanel.setPhase(currentPhase);
        // setPersonaHandlung(currentPhase);
        // // phaseSelection.setValue(personaHandlung);
        // // ManagedCharacter persona = subject.getCharacter();
        // // runtimePersonSelectionProvider.setSelection(new StructuredSelection(subject));
        // // runtimeCharacterSelection.setValue(subject);
        // //
        // // setPersonaHandlung(personaHandlung);
        // //
        // // phaseSelectionProvider.setSelection(new StructuredSelection(persona));
        // //
        // // if (subject.getRightHand() == null)
        // // rhSelectionProvider.setSelection(new EmptySelection());
        // // else
        // // rhSelectionProvider.setSelection(new StructuredSelection(subject.getRightHand()));
        // //
        // // if (subject.getLeftHand() == null)
        // // lhSelectionProvider.setSelection(new EmptySelection());
        // // else
        // // lhSelectionProvider.setSelection(new StructuredSelection(subject.getLeftHand()));
        //
        // }
        // }
        // }
        // });

        createActions();
    }

    private void createActions() {
        // Action action1 = new Action() {
        // public void run() {
        // // showMessage("Action 1 executed");
        // // currentPhase.redo();
        // if (combatTurn != null)
        // combatTurn.redo();
        //
        // setCombatTurn(combatTurn);
        // }
        // };
        // action1.setText("Sort");
        // action1.setToolTipText("sort tooltip");
        // action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_ELCL_STOP));
        // getViewSite().getActionBars().getToolBarManager().add(action1);

        Action action1 = new Action() {
            public void run() {
                executeCurrentCommand();
            }

        };
        // action1.setText("Sort");
        action1.setToolTipText("sort tooltip");
        action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_ELCL_SYNCED));
//        getViewSite().getActionBars().getToolBarManager().add(action1);

    }

    protected void executeCurrentCommand() {
        if (combatTurn != null && combatTurn.getCurrentTurn() != null) {
            combatTurn.doTurn();
            setInitativePass(combatTurn.getCurrentTurn());
        }
    }

    
    /**
     * initalise the actionTreeviewer
     * 
     * @param personaHandlung2
     */
    private void setInitativePass(InitativePass personaHandlung2) {
        basicActionPanel.setPhase(combatTurn.getCurrentTurn());

        if (personaHandlung2 == null)
            return;
//        List<EObject> list = createCharacterCommands(personaHandlung2);

        basicActionPanel.getActionPanel().getTreeViewer().setInput(personaHandlung2);
    }

//    private List<EObject> createCharacterCommands(InitativePass personaHandlung2) {
//        IEditingDomainItemProvider editingDomainItemProvider = (IEditingDomainItemProvider)adapterFactory.adapt(personaHandlung2,
//                IEditingDomainItemProvider.class);
//
//        Collection<?> newChildDescriptors = editingDomainItemProvider.getNewChildDescriptors(personaHandlung2, null, null);
//        List<EObject> list = new ArrayList<EObject>();
//        Set<Class<?>> set = new HashSet<Class<?>>();
//        for (Object object : newChildDescriptors) {
//            if (object instanceof CommandParameter) {
//                CommandParameter cp = (CommandParameter)object;
//                if (GameplayPackage.eINSTANCE.getCommand_SubCommands().equals(cp.feature)) {
//                    // list.add(cp.getEValue());
//                    if (set.add(cp.getEValue().getClass()))
//                        list.add(cp.getEValue());
//                }
//            }
//        }
//        return list;
//    }

    /*
     * (non-Javadoc) Method declared on IViewPart.
     */
    public void init(IViewSite site) throws PartInitException {
        // site.getPage().addSelectionListener(this);
        super.init(site);
        scriptService = (ScriptService)site.getService(ScriptService.class);
        scriptService.registerCombatViewer(this);

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

        // tree = new Tree(composite_bottom, SWT.NONE);
        // tree.setLayoutData(gridData1);
        // treeViewer = new TreeViewer(tree);
    }

    @Override
    public void dispose() {
        // tree.dispose();
//        getSite().getPage().removeSelectionListener(this);
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

    }


//    private void selectionChanged(IWorkbenchPart part, ISelection selection) {
//        if (selection instanceof IStructuredSelection) {
//            IStructuredSelection ss = (IStructuredSelection)selection;
//            Object firstElement = ss.getFirstElement();
//            if (firstElement instanceof CombatTurn) {
//                CombatTurn kr = (CombatTurn)firstElement;
//                setCombatTurn(kr);
//            }
//            // selectionProvider.setSelection(selection);
//        }
//
//    }

    @Override
    public void setCombatTurn(CombatTurn kr) {
        // treeViewer.setInput(kr);
        combatTurn = kr;
       // combatTurn.setCmdCallback(this);
        combatTurnList.setCombatTurn(kr);
        setInitativePass(kr.getCurrentTurn());
        // basicActionPanel.setPhase(kr.getCurrentTurn());

        // IObservableValue detailValue = EMFObservables.observeValue(Realm.getDefault(), combatTurn,
        // GameplayPackage.Literals.COMBAT_TURN__CURRENT_TURN);
        // detailValue.addValueChangeListener(this);

    }

 
}
