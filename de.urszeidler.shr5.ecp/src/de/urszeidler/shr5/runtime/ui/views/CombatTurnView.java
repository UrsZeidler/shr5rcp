/**
 * 
 */
package de.urszeidler.shr5.runtime.ui.views;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.IContentProvider;
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
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.SWTResourceManager;

import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.PhaseCmd;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayAdapterFactory;
import de.urszeidler.eclipse.shr5.runtime.util.RuntimeAdapterFactory;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementAdapterFactory;
import de.urszeidler.shr5.ecp.service.CombatViewer;
import de.urszeidler.shr5.ecp.service.ScriptService;
import de.urszeidler.shr5.runtime.ui.widgets.BasicActionPanelWidget;
import de.urszeidler.shr5.runtime.ui.widgets.CombatTurnList;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.wb.swt.ResourceManager;

/**
 * @author urs
 */
public class CombatTurnView extends ViewPart implements CombatViewer {

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

    private SashForm top_1;
    private Composite composite_bottom = null;
    private BasicActionPanelWidget basicActionPanel = null;
    private CombatTurnList combatTurnList;
    private ScriptService scriptService;
    private ToolItem tltmD;
    private ToolItem toolItem;

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
        top_1 = new SashForm(arg0, SWT.NONE);
        top_1.setLayout(gridLayout);

        GridData gridData = new GridData();
        gridData.horizontalAlignment = GridData.FILL;
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = true;
        gridData.verticalAlignment = GridData.FILL;
        top_1.setOrientation(SWT.VERTICAL);

        createBasicActionPanel();
        createComposite_bottom();

        basicActionPanel.getActionPanel().getTreeViewer().setContentProvider(new SimpleListContenProvider(actionListContentProvider));
        basicActionPanel.getActionPanel().getTreeViewer().setLabelProvider(labelProvider);

//        basicActionPanel.getActionPanel().getButton_do().addSelectionListener(new SelectionAdapter() {
//            @Override
//            public void widgetSelected(SelectionEvent e) {
//                executeCurrentCommand();
//            }
//        });
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
 
        basicActionPanel.getActionPanel().getTreeViewer().setInput(personaHandlung2);
    }

    /*
     * (non-Javadoc) Method declared on IViewPart.
     */
    public void init(IViewSite site) throws PartInitException {
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
        composite_bottom = new Composite(top_1, SWT.NONE);
        composite_bottom.setLayout(new GridLayout());

        ScrolledComposite scrolledComposite = new ScrolledComposite(composite_bottom, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
        scrolledComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
        scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        scrolledComposite.setExpandHorizontal(true);
        scrolledComposite.setExpandVertical(true);

        combatTurnList = new CombatTurnList(scrolledComposite, SWT.NONE);
        scrolledComposite.setContent(combatTurnList);
        top_1.setWeights(new int[] {283, 169});
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    /**
     * This method initializes basicActionPanel
     */
    private void createBasicActionPanel() {
        GridData gridData = new GridData();
        gridData.horizontalAlignment = GridData.FILL;
        gridData.verticalAlignment = GridData.CENTER;
        basicActionPanel = new BasicActionPanelWidget(top_1, SWT.NONE);
        basicActionPanel.setLayoutData(gridData);
        
        tltmD = new ToolItem(basicActionPanel.getActionPanel().getToolBar(), SWT.NONE);
        tltmD.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                executeCurrentCommand();
            }
        });
        tltmD.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/execute-command.png"));
        tltmD.setToolTipText("execute");
        {
            toolItem = new ToolItem(basicActionPanel.getActionPanel().getToolBar(), SWT.SEPARATOR);
        }
    }

    @Override
    public void setCombatTurn(CombatTurn kr) {
        combatTurn = kr;
        combatTurnList.setCombatTurn(kr);
        setInitativePass(kr.getCurrentTurn());
    }

}
