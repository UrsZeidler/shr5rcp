/**
 * 
 */
package de.urszeidler.shr5.runtime.ui.views;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;

import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.ComplexAction;
import de.urszeidler.eclipse.shr5.gameplay.FreeAction;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.PhaseCmd;
import de.urszeidler.eclipse.shr5.gameplay.SemanticAction;
import de.urszeidler.eclipse.shr5.gameplay.SemanticType;
import de.urszeidler.eclipse.shr5.gameplay.SetExtendetData;
import de.urszeidler.eclipse.shr5.gameplay.SimpleAction;
import de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.runtime.ExtendetData;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.shr5.ecp.service.CombatViewer;
import de.urszeidler.shr5.ecp.service.ScriptService;
import de.urszeidler.shr5.runtime.ui.widgets.BasicActionPanelWidget;
import de.urszeidler.shr5.runtime.ui.widgets.CombatTurnList;

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

    public class SimpleActionDropdownSelectionListener extends DropdownSelectionListener<SimpleAction> {
        private InitativePass iniPass;

        public SimpleActionDropdownSelectionListener(ToolItem dropdown, InitativePass iniPass) {
            super(dropdown);
            this.iniPass = iniPass;
            // menuManager.setRemoveAllWhenShown(true);
        }

        public void add(String item, final SimpleAction simpleAction) {
            MenuItem menuItem = new MenuItem(menu, SWT.NONE);
            menuItem.setText(item);

            menuItem.addSelectionListener(new SelectionAdapter() {
                public void widgetSelected(SelectionEvent event) {
                    // InitativePass initativePass = combatTurn.getCurrentTurn();
                    simpleAction.setSubject(iniPass.getSubject());
                    GameplayTools.insertSimpleAction(iniPass, simpleAction);

                    // if (complexAction.equals(SET_LEFT_HAND)) {
                    // InitativePass initativePass = combatTurn.getCurrentTurn();
                    // SetFeatureCommand featureCommand = ShadowrunEditingTools.changeItem(initativePass.getSubject(),
                    // RuntimePackage.Literals.RUNTIME_CHARACTER__LEFT_HAND, getSite().getShell());
                    // SimpleAction simpleAction = GameplayTools.getSimpleAction(initativePass);
                    // simpleAction.getSubCommands().add(featureCommand);
                    // }
                }
            });
        }

    }

    public abstract class DropdownSelectionListener<A> extends SelectionAdapter {
        protected ToolItem dropdown;
        protected Menu menu;

        public DropdownSelectionListener(ToolItem dropdown) {
            this.dropdown = dropdown;
            menu = new Menu(dropdown.getParent().getShell());
        }

        public void widgetSelected(SelectionEvent event) {
            if (event.detail == SWT.ARROW) {
                ToolItem item = (ToolItem)event.widget;
                Rectangle rect = item.getBounds();
                Point pt = item.getParent().toDisplay(new Point(rect.x, rect.y));
                menu.setLocation(pt.x, pt.y + rect.height);
                menu.setVisible(true);
            } else {
                System.out.println(dropdown.getText() + " Pressed"); //$NON-NLS-1$
            }
        }

        public abstract void add(String item, final A action);
    }

    public class FreeActionDropdownSelectionListner extends DropdownSelectionListener<FreeAction> {

        public FreeActionDropdownSelectionListner(ToolItem dropdown) {
            super(dropdown);
        }

        @Override
        public void add(String item, final FreeAction action) {
            MenuItem menuItem = new MenuItem(menu, SWT.NONE);
            menuItem.setText(item);
            if (action == null)
                menuItem.setEnabled(false);

            menuItem.addSelectionListener(new SelectionAdapter() {
                public void widgetSelected(SelectionEvent event) {
                    // MenuItem selected = (MenuItem) event.widget;
                    InitativePass initativePass = combatTurn.getCurrentTurn();
                    action.setSubject(initativePass.getSubject());
                    initativePass.setFreeAction(action);
                    // dropdown.setText(selected.getText());
                }
            });
        }
    }

    public class ComplexActionDropdownSelectionListener extends DropdownSelectionListener<ComplexAction> {

        public ComplexActionDropdownSelectionListener(ToolItem dropdown) {
            super(dropdown);
        }

        @Override
        public void add(String item, final ComplexAction complexAction) {
            MenuItem menuItem = new MenuItem(menu, SWT.NONE);
            menuItem.setText(item);
            if (complexAction == null)
                menuItem.setEnabled(false);

            menuItem.addSelectionListener(new SelectionAdapter() {
                public void widgetSelected(SelectionEvent event) {
                    // MenuItem selected = (MenuItem) event.widget;
                    InitativePass initativePass = combatTurn.getCurrentTurn();
                    complexAction.setSubject(initativePass.getSubject());
                    initativePass.setAction(complexAction);
                    // dropdown.setText(selected.getText());
                }
            });
        }

        // public void widgetSelected(SelectionEvent event) {
        // if (event.detail == SWT.ARROW) {
        // ToolItem item = (ToolItem)event.widget;
        // Rectangle rect = item.getBounds();
        // Point pt = item.getParent().toDisplay(new Point(rect.x, rect.y));
        // menu.setLocation(pt.x, pt.y + rect.height);
        // menu.setVisible(true);
        // } else {
        // System.out.println(dropdown.getText() + " Pressed");
        // }
        // }

    }

    private AdapterFactoryItemDelegator itemDelegator;
    private LabelProvider labelProvider;
    private CombatTurn combatTurn;
    private ComposedAdapterFactory adapterFactory;
    private AdapterFactoryContentProvider rootContentProvider;
    private AdapterFactoryContentProvider actionListContentProvider;
    public static final String ID = "de.urszeidler.test.CombatTurnnView"; //$NON-NLS-1$

    private SashForm top_1;
    private Composite composite_bottom = null;
    private BasicActionPanelWidget basicActionPanel = null;
    private CombatTurnList combatTurnList;
    private ScriptService scriptService;
    private ToolItem tltmD;
    private ToolItem tltmSimple;
    private ToolItem tltmS;

    public CombatTurnView() {
        super();

        adapterFactory = AdapterFactoryUtil.getInstance().getAdapterFactory();
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
        basicActionPanel.getActionPanel().refreshToolbar();
        ToolBar toolBar = basicActionPanel.getActionPanel().getToolBar();
        createToolbarItems(toolBar, personaHandlung2);
        toolBar.getParent().layout(true);
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

    // private void createMenuManager(){
    //
    // menuManager = new MenuManager();
    //
    //
    // MenuManager menuManagerSimpleActions = new MenuManager();
    // menuManagerSimpleActions.add(new Action("change") {
    // @Override
    // public void run() {
    // InitativePass initativePass = combatTurn.getCurrentTurn();
    // SetFeatureCommand featureCommand = ShadowrunEditingTools.changeItem(initativePass.getSubject(),
    // RuntimePackage.Literals.RUNTIME_CHARACTER__LEFT_HAND, getSite().getShell());
    // SimpleAction simpleAction = GameplayTools.getSimpleAction(initativePass);
    // simpleAction.getSubCommands().add(featureCommand);
    // }
    // @Override
    // public boolean isEnabled() {
    // return super.isEnabled();
    // }
    // });
    //
    // }

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
        top_1.setWeights(new int[]{ 210, 210 });
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
        basicActionPanel.getActionPanel().getTreeViewer().setAutoExpandLevel(TreeViewer.ALL_LEVELS);
        basicActionPanel.setLayoutData(gridData);

        ToolBar toolBar = basicActionPanel.getActionPanel().getToolBar();
        createToolbarItems(toolBar, null);
    }

    /**
     * @param toolBar
     * @param iniPass
     */
    protected void createToolbarItems(ToolBar toolBar, final InitativePass iniPass) {
        RuntimeCharacter character = null;
        if(iniPass!=null)
            character = iniPass.getSubject();
        
        tltmD = new ToolItem(toolBar, SWT.NONE);
        tltmD.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                executeCurrentCommand();
            }
        });
        tltmD.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/execute-command.png")); //$NON-NLS-1$ //$NON-NLS-2$
        tltmD.setToolTipText(Messages.CombatTurnView_tooltip_execute);
        {
            tltmS = new ToolItem(toolBar, SWT.DROP_DOWN);
            tltmS.setText(Messages.CombatTurnView_text_complex_action);
            ComplexActionDropdownSelectionListener listenerOne = new ComplexActionDropdownSelectionListener(tltmS);
            SkillTestCmd skillTestCmd = GameplayFactory.eINSTANCE.createSkillTestCmd();
            // skillTestCmd.setSubject(initativePass.getSubject());
            ComplexAction complexAction = GameplayFactory.eINSTANCE.createComplexAction();
            complexAction.getSubCommands().add(skillTestCmd);
            listenerOne.add(Messages.CombatTurnView_text_skill_test, complexAction);
            SkillTestCmd skillTestCmd1 = GameplayFactory.eINSTANCE.createOpposedSkillTestCmd();
            // skillTestCmd.setSubject(initativePass.getSubject());
            ComplexAction complexAction1 = GameplayFactory.eINSTANCE.createComplexAction();
            complexAction1.getSubCommands().add(skillTestCmd1);
            listenerOne.add(Messages.CombatTurnView_text_opposed_skill_test, complexAction1);
            // listenerOne.add("Cast Spell", null);
            // listenerOne.add("Charge Attack", null);
            // listenerOne.add("Astral Projection", null);

            // listenerOne.add("oppsed");

            tltmS.addSelectionListener(listenerOne);

        }

        {
            tltmSimple = new ToolItem(toolBar, SWT.DROP_DOWN);
            tltmSimple.setText(Messages.CombatTurnView_text_simpleAction);
            SimpleActionDropdownSelectionListener listenerOne = new SimpleActionDropdownSelectionListener(tltmSimple, iniPass);
            SimpleAction simpleAction = GameplayFactory.eINSTANCE.createSimpleAction();
            listenerOne.add("1", simpleAction); //$NON-NLS-1$
            tltmSimple.addSelectionListener(listenerOne);

        }
        {
            ToolItem tltmFree = new ToolItem(toolBar, SWT.DROP_DOWN);
            tltmFree.setText(Messages.CombatTurnView_text_free_action);
            FreeActionDropdownSelectionListner listenerOne = new FreeActionDropdownSelectionListner(tltmFree);
            
            FreeAction freeAction = GameplayFactory.eINSTANCE.createFreeAction();
            SemanticAction semanticAction = GameplayFactory.eINSTANCE.createSemanticAction();
            semanticAction.setType(SemanticType.TALK);
            freeAction.getSubCommands().add(semanticAction);
            listenerOne.add(Messages.CombatTurnView_text_say_action, freeAction);
            
            freeAction = GameplayFactory.eINSTANCE.createFreeAction();
            semanticAction = GameplayFactory.eINSTANCE.createSemanticAction();
            semanticAction.setType(SemanticType.TALK);
            freeAction.getSubCommands().add(semanticAction);
            listenerOne.add(Messages.CombatTurnView_text_gestrure_action, freeAction);
            
//            tltmFree.addSelectionListener(listenerOne);            
            
            
            freeAction = GameplayFactory.eINSTANCE.createFreeAction();
            SetExtendetData setExtendetData = GameplayFactory.eINSTANCE.createSetExtendetData();
            setExtendetData.setDataAware(character);
            ExtendetData  data = RuntimeFactory.eINSTANCE.createExtendetData();
            data.setEObject(character);
            data.setEFeature(RuntimePackage.Literals.NAHKAMP_MODIFIKATIONEN__CHARACTER_PRONE);
            setExtendetData.setData(data);
            setExtendetData.setValue(true);
            freeAction.getSubCommands().add(setExtendetData);
            listenerOne.add(Messages.CombatTurnView_text_drop_prone_action, freeAction);
            
            freeAction = GameplayFactory.eINSTANCE.createFreeAction();
            listenerOne.add(Messages.CombatTurnView_text_kneel_action, freeAction);
            tltmFree.addSelectionListener(listenerOne);

        }

    }

    @Override
    public void setCombatTurn(CombatTurn kr) {
        combatTurn = kr;
        combatTurnList.setCombatTurn(kr);
        setInitativePass(kr.getCurrentTurn());
    }

}
