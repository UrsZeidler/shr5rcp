package de.urszeidler.shr5.runtime.ui.views;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.nebula.jface.cdatetime.CDateTimeObservableValue;
import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.part.ViewPart;

import de.urszeidler.eclipse.shr5.Shr5Package.Literals;
import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.ExecutionStack;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayAdapterFactory;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5.runtime.Team;
import de.urszeidler.eclipse.shr5.runtime.util.RuntimeAdapterFactory;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementAdapterFactory;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;
import de.urszeidler.shr5.ecp.dialogs.FeatureEditorDialogWert;
import de.urszeidler.shr5.ecp.service.ScriptService;
import de.urszeidler.shr5.ecp.service.ScriptViewer;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.ScriptingFactory;
import de.urszeidler.shr5.scripting.ScriptingPackage;

public class RuntimeScriptView extends ViewPart implements ScriptViewer {

    private final class TimeTracker extends Job {
        private TimeTracker(String name) {
            super(name);
        }

        @Override
        protected IStatus run(IProgressMonitor monitor) {
            if (!isTimetracking)
                return Status.OK_STATUS;
                schedule(1000);
            if (placement1 != null)
                if (placement1.getActualDate() != null)
                    placement1.setActualDate(new Date(placement1.getActualDate().getTime() + 1000));
            return Status.OK_STATUS;
        }
    }

    private DataBindingContext m_bindingContext;

    public static final String ID = "de.urszeidler.shr5.runtime.ui.views.RuntimeScriptView"; //$NON-NLS-1$
    private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
    private Placement placement1 = ScriptingFactory.eINSTANCE.createPlacement();
    private WritableValue placement = new WritableValue(); // ScriptingFactory.eINSTANCE.createPlacement();
    private boolean isTimetracking;

    private Label lblName;
    private StyledText styledText;
    private StyledText styledText_1;

    private StyledText styledText_2;

    private Action startCombatAction;

    private Action switchPlacementAction;

    private Action startTimetrackingAction;

    private ComposedAdapterFactory adapterFactory;

    private AdapterFactoryItemDelegator itemDelegator;

    private AdapterFactoryContentProvider rootContentProvider;

    private AdapterFactoryContentProvider actionListContentProvider;

    private LabelProvider labelProvider;

    private CDateTime dateTime_1;

    private CDateTime dateTime;

    private ScriptService scriptService;
    private Table table;
    private TableViewer tableViewer;

    private Script script;

    private ExecutionStack commandStack;

    private WritableValue protocol = new WritableValue();
    private WritableList characters = new WritableList();
    private TableViewer treeViewer;

    public RuntimeScriptView() {

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
        };

    }

    /*
     * (non-Javadoc) Method declared on IViewPart.
     */
    public void init(IViewSite site) throws PartInitException {
        // site.getPage().addSelectionListener(this);
        super.init(site);
        scriptService = (ScriptService)site.getService(ScriptService.class);
        scriptService.registerScriptViewer(this);

        placement1 = scriptService.getPlacement();
        placement.setValue(placement1);
    }

    /**
     * Create contents of the view part.
     * 
     * @param parent
     */
    @Override
    public void createPartControl(Composite parent) {

        Composite composite = formToolkit.createComposite(parent, SWT.NONE);
        formToolkit.paintBordersFor(composite);
        {
            TableWrapLayout twl_composite = new TableWrapLayout();
            twl_composite.makeColumnsEqualWidth = true;
            composite.setLayout(twl_composite);
        }

        // BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(composite, SWT.NONE, placement, formToolkit, null);
        // GridData gd_beschreibbarWidget = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);

        Composite composite_1 = formToolkit.createComposite(composite, SWT.NONE);
        composite_1.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP, 1, 1));

        formToolkit.paintBordersFor(composite_1);
        {
            TableWrapLayout twl_composite_1 = new TableWrapLayout();
            twl_composite_1.numColumns = 2;
            composite_1.setLayout(twl_composite_1);
        }

        Label lblImg = formToolkit.createLabel(composite_1, "img", SWT.NONE);
        lblImg.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE, 1, 1));
        lblImg.setBounds(0, 0, 70, 17);

        lblName = formToolkit.createLabel(composite_1, "New Label", SWT.NONE);
        lblName.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE, 1, 1));
        lblName.setSize(70, 17);

        // ----
        Composite composite_7 = formToolkit.createComposite(composite, SWT.NONE);
        composite_7.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP, 1, 1));
        formToolkit.paintBordersFor(composite_7);
        {
            TableWrapLayout twl_composite_7 = new TableWrapLayout();
            twl_composite_7.numColumns = 1;
            composite_7.setLayout(twl_composite_7);
        }

        Section sctnNewSection = formToolkit.createSection(composite_7, Section.TWISTIE | Section.TITLE_BAR);
        sctnNewSection.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP, 1, 1));
        formToolkit.paintBordersFor(sctnNewSection);
        sctnNewSection.setText("Actions");
        sctnNewSection.setExpanded(true);

        Composite composite_11 = formToolkit.createComposite(sctnNewSection, SWT.NONE);
        formToolkit.paintBordersFor(composite_11);
        sctnNewSection.setClient(composite_11);
        composite_11.setLayout(new GridLayout(1, false));
        
        Composite composite_13 = new Composite(composite_11, SWT.NONE);
        GridData gd_composite_13 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_composite_13.heightHint = 128;
        gd_composite_13.widthHint = 371;
        composite_13.setLayoutData(gd_composite_13);
        formToolkit.adapt(composite_13);
        formToolkit.paintBordersFor(composite_13);
        composite_13.setLayout(new TableColumnLayout());
        
        treeViewer = new TableViewer(composite_13, SWT.BORDER);
        Table tree = treeViewer.getTable();
//        tree.setHeaderVisible(true);
//        tree.setLinesVisible(true);
        formToolkit.paintBordersFor(tree);

        Composite composite_8 = formToolkit.createComposite(composite, SWT.NONE);
        composite_8.setLayout(new GridLayout(2, false));
        composite_8.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP, 1, 1));
        formToolkit.paintBordersFor(composite_8);

        Composite composite_9 = formToolkit.createComposite(composite_8, SWT.NONE);
        {
            TableWrapLayout twl_composite_9 = new TableWrapLayout();
            twl_composite_9.topMargin = 0;
            twl_composite_9.makeColumnsEqualWidth = true;
            twl_composite_9.numColumns = 1;
            composite_9.setLayout(twl_composite_9);
        }
        GridData gd_composite_9 = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
        gd_composite_9.widthHint = 223;
        composite_9.setLayoutData(gd_composite_9);
        formToolkit.paintBordersFor(composite_9);

        Section sctnBackground = formToolkit.createSection(composite_9, Section.TWISTIE | Section.TITLE_BAR);
        sctnBackground.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.MIDDLE, 1, 1));
        sctnBackground.setSize(1183, 116);
        formToolkit.paintBordersFor(sctnBackground);
        sctnBackground.setText("Background");
        sctnBackground.setExpanded(true);

        Composite composite_2 = formToolkit.createComposite(sctnBackground, SWT.NONE);
        formToolkit.paintBordersFor(composite_2);
        sctnBackground.setClient(composite_2);
        composite_2.setLayout(new GridLayout(1, false));

        styledText = new StyledText(composite_2, SWT.READ_ONLY | SWT.WRAP);
        GridData gd_styledText = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        gd_styledText.minimumHeight = 80;
        styledText.setLayoutData(gd_styledText);
        formToolkit.adapt(styledText);
        formToolkit.paintBordersFor(styledText);

        Composite composite_10 = formToolkit.createComposite(composite_8, SWT.NONE);
        composite_10.setLayout(new FillLayout(SWT.HORIZONTAL));
        composite_10.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
        formToolkit.paintBordersFor(composite_10);

        Section sctnActions = formToolkit.createSection(composite_10, Section.TWISTIE | Section.TITLE_BAR);

        formToolkit.paintBordersFor(sctnActions);
        sctnActions.setText("TimeTracking");
        sctnActions.setExpanded(true);

        Composite composite_5 = formToolkit.createComposite(sctnActions, SWT.NONE);
        formToolkit.paintBordersFor(composite_5);
        sctnActions.setClient(composite_5);
        composite_5.setLayout(new GridLayout(2, false));

        dateTime = new CDateTime(composite_5, CDT.SPINNER | CDT.COMPACT | CDT.DATE_LONG);
        dateTime.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        formToolkit.adapt(dateTime);
        formToolkit.paintBordersFor(dateTime);
        new Label(composite_5, SWT.NONE);

        dateTime_1 = new CDateTime(composite_5, CDT.BORDER | CDT.SPINNER | CDT.CLOCK_24_HOUR | CDT.COMPACT | CDT.SIMPLE | CDT.TIME_MEDIUM) {

        };

        dateTime_1.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
        formToolkit.adapt(dateTime_1);
        formToolkit.paintBordersFor(dateTime_1);

        Composite composite_6 = formToolkit.createComposite(composite_5, SWT.NONE);
        composite_6.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        composite_6.setLayout(new GridLayout(1, false));
        formToolkit.paintBordersFor(composite_6);
        new Label(composite_5, SWT.NONE);
        new Label(composite_5, SWT.NONE);

        // Button btnNewButton = formToolkit.createButton(composite_6, "New Button", SWT.NONE);

        Section sctnInTheirFace = formToolkit.createSection(composite_9, Section.TWISTIE | Section.TITLE_BAR);
        sctnInTheirFace.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP, 1, 1));
        formToolkit.paintBordersFor(sctnInTheirFace);
        sctnInTheirFace.setText("In their face");
        sctnInTheirFace.setExpanded(true);

        Composite composite_3 = formToolkit.createComposite(sctnInTheirFace, SWT.NONE);
        formToolkit.paintBordersFor(composite_3);
        sctnInTheirFace.setClient(composite_3);
        composite_3.setLayout(new GridLayout(1, false));

        styledText_1 = new StyledText(composite_3, SWT.READ_ONLY | SWT.WRAP);
        GridData gd_styledText_1 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        gd_styledText_1.minimumHeight = 80;
        gd_styledText_1.widthHint = 120;
        styledText_1.setLayoutData(gd_styledText_1);
        styledText_1.setEditable(false);
        styledText_1.setAlwaysShowScrollBars(false);
        formToolkit.adapt(styledText_1);
        formToolkit.paintBordersFor(styledText_1);

        Section sctnDebugging = formToolkit.createSection(composite_9, Section.TWISTIE | Section.TITLE_BAR);
        sctnDebugging.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP, 1, 1));
        sctnInTheirFace.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP, 1, 1));
        formToolkit.paintBordersFor(sctnInTheirFace);
        sctnDebugging.setText("Debugging");
        sctnDebugging.setExpanded(true);

        Composite composite_4 = formToolkit.createComposite(sctnDebugging, SWT.NONE);
        formToolkit.paintBordersFor(composite_4);
        sctnDebugging.setClient(composite_4);
        composite_4.setLayout(new GridLayout(1, false));

        styledText_2 = new StyledText(composite_4, SWT.READ_ONLY | SWT.WRAP);
        GridData gd_styledText_2 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        gd_styledText_2.minimumHeight = 80;
        gd_styledText_2.widthHint = 120;
        styledText_2.setLayoutData(gd_styledText_2);
        styledText_2.setEditable(false);
        styledText_2.setAlwaysShowScrollBars(false);
        formToolkit.adapt(styledText_2);
        formToolkit.paintBordersFor(styledText_2);

        Composite composite_12 = new Composite(composite, SWT.NONE);
        composite_12.setLayout(new GridLayout(1, false));
        TableWrapData twd_composite_12 = new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP, 1, 1);
        twd_composite_12.grabHorizontal = true;
        twd_composite_12.heightHint = 198;
        composite_12.setLayoutData(twd_composite_12);
        formToolkit.adapt(composite_12);
        formToolkit.paintBordersFor(composite_12);

        tableViewer = new TableViewer(composite_12, SWT.BORDER | SWT.FULL_SELECTION);
        table = tableViewer.getTable();
        GridData gd_table = new GridData(SWT.LEFT, SWT.FILL, false, true, 1, 1);
        gd_table.widthHint = 652;
        table.setLayoutData(gd_table);
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
        tableViewer.setSorter(new ViewerSorter() {
            @Override
            public int compare(Viewer viewer, Object e1, Object e2) {
                if (e1 instanceof Command) {
                    Command cmd = (Command)e1;
                    if (e2 instanceof Command) {
                        Command cmd1 = (Command)e2;
                        if (cmd.getDate() == null)
                            return -1;
                        if (cmd1.getDate() == null)
                            return 1;

                        if (cmd1.getDate().getTime() > cmd.getDate().getTime())
                            return 1;
                        else
                            return -1;
                    }
                }
                return super.compare(viewer, e1, e2);
            }

        });
        formToolkit.paintBordersFor(table);
        
        TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
        TableColumn tblclmnDate = tableViewerColumn.getColumn();
        tblclmnDate.setWidth(56);
        tblclmnDate.setText("done");
        
        TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
        TableColumn tblclmnDate_1 = tableViewerColumn_1.getColumn();
        tblclmnDate_1.setWidth(100);
        tblclmnDate_1.setText("date");
        
        TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
        TableColumn tblclmnName = tableViewerColumn_2.getColumn();
        tblclmnName.setWidth(100);
        tblclmnName.setText("name");

        createActions();
        initializeToolBar();
        initializeMenu();
        m_bindingContext = initDataBindings1();
        m_bindingContext = initDataBindings2();
        m_bindingContext = initDataBindings();
    }

    @Override
    public void dispose() {
        placement.dispose();
        super.dispose();
    }

    /**
     * Create the actions.
     */
    private void createActions() {
        startCombatAction = new Action() {
            @SuppressWarnings("unchecked")
            public void run() {
                CombatTurn combatTurn = GameplayFactory.eINSTANCE.createCombatTurn();
                combatTurn.setDate(placement1.getActualDate());
                List<Object> choiceOfValues = new ArrayList<Object>();

                EList<Team> teams = placement1.getTeams();
                for (Team team : teams) {
                    choiceOfValues.addAll(team.getMembers());
                }
                if (placement1.getScript() != null)
                    choiceOfValues.addAll(placement1.getScript().getPlayer().getMembers());

                FeatureEditorDialogWert dialogWert = new FeatureEditorDialogWert(getSite().getShell(), labelProvider, combatTurn,
                        GameplayPackage.Literals.COMBAT_TURN__COMBATANTS, "Select combatans", choiceOfValues);
                if (dialogWert.open() == Dialog.OK)
                    combatTurn.getCombatants().addAll((Collection<? extends RuntimeCharacter>)dialogWert.getResult());

                placement1.getScript().getCommandStack().setCurrentCommand(combatTurn);
                placement1.getScript().getCommandStack().redo();
                scriptService.setCombatTurn(combatTurn);
            }
        };
        startCombatAction.setText("Start combat");
        startCombatAction.setToolTipText("start the combat");
        startCombatAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_TOOL_FORWARD));

        switchPlacementAction = new Action() {
            public void run() {
                EList<Placement> nextPlacements = placement1.getNextPlacements();

                OwnChooseDialog dialog = new OwnChooseDialog(getSite().getShell(), nextPlacements.toArray(new Object[]{}), "titel", "message");
                dialog.setLabelProvider(labelProvider);
                int open = dialog.open();
                if (open == Dialog.OK) {
                    Object[] result = dialog.getResult();
                    if (result.length > 0) {
                        Placement eo = (Placement)result[0];
                        scriptService.setPlacement(eo);
                        GameplayFactory.eINSTANCE.createSetFeatureCommand();
                        
                    }
                }

            }
        };
        switchPlacementAction.setText("switch placement");
        switchPlacementAction.setToolTipText("switch placement");
        switchPlacementAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJ_ELEMENT));

        startTimetrackingAction = new Action() {
            private boolean isTimetracking;
            private Job timeTrackJob;

            public void run() {
                if (isTimetracking) {
                    isTimetracking = false;
                } else {
                    isTimetracking = true;
                    if (timeTrackJob == null) {
                        timeTrackJob = new TimeTracker("timetrack");
                        timeTrackJob.setSystem(true);
                    }
                    timeTrackJob.schedule();
                }
            }
        };
        startTimetrackingAction.setText("start timetracking");
        startTimetrackingAction.setToolTipText("sort tooltip");
        startTimetrackingAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJ_ADD));

    }

    /**
     * Initialize the toolbar.
     */
    private void initializeToolBar() {
        IToolBarManager toolbarManager = getViewSite().getActionBars().getToolBarManager();
        toolbarManager.add(startCombatAction);
        toolbarManager.add(switchPlacementAction);
        toolbarManager.add(startTimetrackingAction);
    }

    /**
     * Initialize the menu.
     */
    private void initializeMenu() {
        IMenuManager menuManager = getViewSite().getActionBars().getMenuManager();
        menuManager.add(startCombatAction);
        menuManager.add(switchPlacementAction);
    }

    @Override
    public void setFocus() {
        // Set the focus
    }

    @Override
    public void setPlacement(Placement placement) {
        this.placement1 = placement;
        Script script2 = placement.getScript();
        this.placement.setValue(placement1);
        if (placement1.getActualDate() == null)
            placement1.setActualDate(placement1.getStartDate());
        
        EList<Team> teams = placement.getTeams();
        Team player = script2.getPlayer();
        characters.addAll(player.getMembers());
        for (Team team : teams) {
            characters.addAll(team.getMembers());
        }

    }

    @Override
    public void setScript(Script script) {
        this.script = script;
        commandStack = script.getCommandStack();
        protocol.setValue(commandStack.getProtocol());// = commandStack.getProtocol();
    }

    // @Override
    // public void selectionChanged(IWorkbenchPart part, ISelection selection) {
    // if (selection instanceof IStructuredSelection) {
    // IStructuredSelection ss = (IStructuredSelection)selection;
    // Object firstElement = ss.getFirstElement();
    // if (firstElement instanceof Placement) {
    // placement1 = (Placement)firstElement;
    // initDataBindings1();
    // }
    // // selectionProvider.setSelection(selection);
    // }
    // }

    protected DataBindingContext initDataBindings1() {
        DataBindingContext bindingContext = new DataBindingContext();
        Realm realm = Realm.getDefault();
        //
        IObservableValue observeTextLblNameObserveWidget = WidgetProperties.text().observe(lblName);
        IObservableValue placementNameObserveValue = EMFObservables.observeDetailValue(realm, placement, Literals.BESCHREIBBAR__NAME);
        bindingContext.bindValue(observeTextLblNameObserveWidget, placementNameObserveValue,
                new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        //
        IObservableValue observeTextStyledTextObserveWidget = WidgetProperties.text(SWT.Modify).observe(styledText);
        IObservableValue placementBackgroundObserveValue = EMFObservables.observeDetailValue(realm, placement,
                ScriptingPackage.Literals.PLACEMENT__BACKGROUND);
        bindingContext.bindValue(observeTextStyledTextObserveWidget, placementBackgroundObserveValue, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        //
        IObservableValue observeTextStyledText_1ObserveWidget = WidgetProperties.text(SWT.Modify).observe(styledText_1);
        IObservableValue placementInTheirFaceObserveValue = EMFObservables.observeDetailValue(realm, placement,
                ScriptingPackage.Literals.PLACEMENT__IN_THEIR_FACE);
        bindingContext.bindValue(observeTextStyledText_1ObserveWidget, placementInTheirFaceObserveValue, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        //
        IObservableValue observeTextStyledText_2ObserveWidget = WidgetProperties.text(SWT.Modify).observe(styledText_2);
        IObservableValue placementDebuggingObserveValue = EMFObservables.observeDetailValue(realm, placement,
                ScriptingPackage.Literals.PLACEMENT__DEBUGGING);
        bindingContext.bindValue(observeTextStyledText_2ObserveWidget, placementDebuggingObserveValue, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        //

        //
        IObservableValue observeLocationDatewidgetObserveWidget = new CDateTimeObservableValue(dateTime_1);
        IObservableValue currentChangeDateObserveValue = EMFObservables.observeDetailValue(realm, placement,
                ScriptingPackage.Literals.TIME_FRAME__ACTUAL_DATE);
        bindingContext.bindValue(observeLocationDatewidgetObserveWidget, currentChangeDateObserveValue, null, null);
        //
        //
        IObservableValue observeLocationDatewidgetObserveWidget1 = new CDateTimeObservableValue(dateTime);
        IObservableValue currentChangeDateObserveValue1 = EMFObservables.observeDetailValue(realm, placement,
                ScriptingPackage.Literals.TIME_FRAME__ACTUAL_DATE);
        bindingContext.bindValue(observeLocationDatewidgetObserveWidget1, currentChangeDateObserveValue1, null, null);
        //

        return bindingContext;
    }

    protected DataBindingContext initDataBindings2() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
        IObservableMap[] observeMaps = EMFObservables.observeMaps(listContentProvider.getKnownElements(), new EStructuralFeature[]{
                GameplayPackage.Literals.COMMAND__EXECUTED, GameplayPackage.Literals.COMMAND__DATE,GameplayPackage.Literals.COMMAND__EXECUTED });
        tableViewer.setLabelProvider(new ObservableMapLabelProvider(observeMaps) {
            @Override
            public String getColumnText(Object element, int columnIndex) {
                if (columnIndex == 2) {

                    return labelProvider.getText(element);
                }
                return super.getColumnText(element, columnIndex);
            }

        });
        tableViewer.setContentProvider(listContentProvider);
        //
        IObservableList protocolCommandsObserveList = EMFObservables.observeDetailList(Realm.getDefault(), protocol,
                GameplayPackage.Literals.EXECUTION_PROTOCOL__COMMANDS);
        tableViewer.setInput(protocolCommandsObserveList);
        //
        return bindingContext;
    }
    
    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
        IObservableMap[] observeMaps = EMFObservables.observeMaps(listContentProvider.getKnownElements(), new EStructuralFeature[]{
                RuntimePackage.Literals.RUNTIME_CHARACTER__CHARACTER });
        treeViewer.setLabelProvider(new ObservableMapLabelProvider(observeMaps) {
            @Override
            public String getColumnText(Object element, int columnIndex) {
                if (columnIndex == 0) {

                    return labelProvider.getText(element);
                }
                return super.getColumnText(element, columnIndex);
            }

        });
        treeViewer.setContentProvider(listContentProvider);
        //
//        IObservableList protocolCommandsObserveList = EMFObservables.observeDetailList(Realm.getDefault(), protocol,
//                GameplayPackage.Literals.EXECUTION_PROTOCOL__COMMANDS);
//        tableViewer.setInput(protocolCommandsObserveList);
        //
        treeViewer.setInput(characters);
        //
        return bindingContext;
    }
}
