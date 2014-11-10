package de.urszeidler.shr5.runtime.ui.views;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.conversion.IConverter;
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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.nebula.jface.cdatetime.CDateTimeObservableValue;
import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Shr5Package.Literals;
import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.CommandWrapper;
import de.urszeidler.eclipse.shr5.gameplay.ComplexAction;
import de.urszeidler.eclipse.shr5.gameplay.DamageTest;
import de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.ExecutionProtocol;
import de.urszeidler.eclipse.shr5.gameplay.ExecutionStack;
import de.urszeidler.eclipse.shr5.gameplay.FreeAction;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.InterruptAction;
import de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.SemanticAction;
import de.urszeidler.eclipse.shr5.gameplay.SetExtendetData;
import de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand;
import de.urszeidler.eclipse.shr5.gameplay.SimpleAction;
import de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;
import de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5.runtime.Team;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.Sex;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;
import de.urszeidler.emf.commons.ui.util.DefaultReferenceManager;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.binding.PathToImageConverter;
import de.urszeidler.shr5.ecp.dialogs.FeatureEditorDialogWert;
import de.urszeidler.shr5.ecp.service.ScriptService;
import de.urszeidler.shr5.ecp.service.ScriptViewer;
import de.urszeidler.shr5.ecp.util.DefaultLabelProvider;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;
import de.urszeidler.shr5.runtime.ui.dialogs.CheckInitative;
import de.urszeidler.shr5.runtime.ui.dialogs.DamageProbeFinishedDialog;
import de.urszeidler.shr5.runtime.ui.dialogs.ProbeDialog;
import de.urszeidler.shr5.runtime.ui.dialogs.ProbeDialog.ProbeExecutionState;
import de.urszeidler.shr5.runtime.ui.dialogs.TimetrackingDialog;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.ScriptHistory;
import de.urszeidler.shr5.scripting.ScriptingFactory;
import de.urszeidler.shr5.scripting.ScriptingPackage;

public class RuntimeScriptView extends ViewPart implements ScriptViewer, CommandCallback {

    private final class TimeTracker extends Job {
        private boolean isTimetracking;

        private TimeTracker(String name) {
            super(name);
        }

        @Override
        protected IStatus run(IProgressMonitor monitor) {
            if (!isTimetracking)
                return Status.OK_STATUS;
            int delay = 1000;
            if (timeTrackFactor > 1)
                delay = (int)((1 / timeTrackFactor) * 1000L);

            schedule(delay);
            Placement plac = (Placement)placement1;// .getValue();

            if (plac != null)
                if (plac.getActualDate() != null)
                    plac.setActualDate(new Date((long)(plac.getActualDate().getTime() + (delay * timeTrackFactor))));
            return Status.OK_STATUS;
        }
    }

    private Adapter adapter = new EContentAdapter() {

        @SuppressWarnings("unchecked")
        public void notifyChanged(Notification notification) {
            super.notifyChanged(notification);
            Object notifier = notification.getNotifier();
            Object feature = notification.getFeature();
            if (notifier instanceof CommandWrapper || notifier instanceof ComplexAction || notifier instanceof SimpleAction
                    || notifier instanceof FreeAction || notifier instanceof ScriptHistory || notifier instanceof RuntimeCharacter
                    || notifier instanceof ExecutionProtocol || notifier instanceof ExecutionStack)
                return;

            if (notifier instanceof CombatTurn) {
                CombatTurn ct = (CombatTurn)notifier;
                if (GameplayPackage.Literals.COMBAT_TURN__CURRENT_TURN.equals(feature)) {
                    if (ct.getCurrentTurn() == null)
                        return;
                    String message = String.format(Messages.RuntimeScriptView_protocol_combat_turn_start_info, labelProvider.getText(ct
                            .getCurrentTurn().getSubject()), ct.getCurrentTurn().getSubject().getCharacter().getSex() == Sex.FEMALE
                            ? Messages.RuntimeScriptView_sex_femal : Messages.RuntimeScriptView_sex_mal, ct.getCurrentTurn().getTurn(), ct
                            .getCurrentTurn().getPhase());
                    scriptService.sendMessage(ct.getCurrentTurn().getSubject(), message);
                    printedProtocol.add(0, message);
                } else if (GameplayPackage.Literals.COMMAND__EXECUTING.equals(feature))
                    if (ct.isExecuted())
                        printedProtocol.add(0, String.format(Messages.RuntimeScriptView_protocol_combat_turn_end, ct.getDate(), ct.getSequence()));
                    else
                        printedProtocol.add(0, String.format(Messages.RuntimeScriptView_protocol_combatturn_start, ct.getDate(), ct.getSequence()));
                return;
            } else if (notifier instanceof InitativePass) {
                InitativePass ip = (InitativePass)notifier;
                if (GameplayPackage.Literals.COMMAND__EXECUTED.equals(feature))
                    if (ip.isExecuted()) {

                        TreeIterator<EObject> eAllContents = ip.eAllContents();
                        if (!eAllContents.hasNext())
                            printedProtocol.add(0,
                                    String.format(Messages.RuntimeScriptView_protocol_pass, ip.getDate(), labelProvider.getText(ip.getSubject())));

                        for (Iterator<EObject> iterator = ip.eAllContents(); iterator.hasNext();) {
                            EObject eo = iterator.next();
                            if(eo instanceof ComplexAction || eo instanceof SimpleAction
                                    || eo instanceof FreeAction)
                                continue;
                            if (eo instanceof Command) {
                                Command cmd = (Command)eo;
                                String text = printCommand(cmd);
                                printedProtocol.add(0, text);
                            }
                        }
                        return;
                    } // else if (GameplayPackage.Literals.COMMAND__EXECUTING.equals(feature))
                      // if (ip.isExecuting()) {
                      // printedProtocol.add(
                      // 0,
                      // String.format("%s has %s %d turn at %d phase", labelProvider.getText(ip.getSubject()), ip.getSubject()
                      // .getCharacter().getSex() == Sex.FEMALE ? "her" : "his", ip.getPhase(), ip.getTurn()));
                      // }
            }

            if (GameplayPackage.Literals.COMMAND__EXECUTED.equals(feature)) {
                if (notifier instanceof InterruptAction) {
                    InterruptAction ia = (InterruptAction)notifier;
                    if (ia.isExecuted()) {
                        String text = printCommand(ia);
                        printedProtocol.add(0, text);
                        return;
                    }
                }
                if (notifier.equals(commandStack.getCurrentCommand())) {
                    Command notifier1 = (Command)notifier;
                    if (notifier1.isExecuted() && !notifier1.isHidden()) {
                        String text = printCommand(notifier1);
                        printedProtocol.add(0, text);
                    }
                }
            }
        }
    };

    protected DataBindingContext m_bindingContext;

    public static final String ID = "de.urszeidler.shr5.runtime.ui.views.RuntimeScriptView"; //$NON-NLS-1$

    protected static final String COMBAT_PERSPECTIVE = "de.urszeidler.shr5.product.application.CombatPerspective"; //$NON-NLS-1$
    protected static final String RUNTIME_PERSPECTIVE = "de.urszeidler.shr5.product.application.RuntimePerspective"; //$NON-NLS-1$
    private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
    private Placement placement1 = ScriptingFactory.eINSTANCE.createPlacement();
    private WritableValue placement = new WritableValue(); // ScriptingFactory.eINSTANCE.createPlacement();
    // protected boolean isTimetracking;
    private TimeTracker timeTrackJob;

    private double timeTrackFactor = 1;
    private Label lblName;
    private StyledText styledText;
    private StyledText styledText_1;

    private StyledText styledText_2;

    // private Action startCombatAction;

    // private Action switchPlacementAction;

    // private Action startTimetrackingAction;

    private ComposedAdapterFactory adapterFactory;

    private AdapterFactoryItemDelegator itemDelegator;

    // private AdapterFactoryContentProvider rootContentProvider;

    // private AdapterFactoryContentProvider actionListContentProvider;

    private LabelProvider labelProvider;

    private CDateTime dateTime_1;

    private CDateTime dateTime;

    private ScriptService scriptService;

    // private Script script;
    // private WritableValue selectedCharacter = new WritableValue();
    private ExecutionStack commandStack;
    // private ExecutionProtocol protocol1;
    private WritableValue history = new WritableValue();
    private WritableValue protocol = new WritableValue();
    private WritableList characters = new WritableList();
    // private WritableList printedProtocol = new WritableList();

    private TableViewer characterViewer;
    private TableViewer treeViewer_commandProtokoll;

    private TableViewer treeViewer_Commands;

    // private Action executeAction;
    private Label lblDesc;

    private Label lblImg;

    private Section sctnActionSection;

    private Section sctnBackground;

    private Section sctnTimeTracking;

    private Section sctnInTheirFace;

    private Section sctnDebugging;

    private Label lblDatetimelong;

    private IObservableList printedProtocol;
    private Table tree;

    public RuntimeScriptView() {

        adapterFactory = AdapterFactoryUtil.getInstance().getAdapterFactory();
        itemDelegator = new AdapterFactoryItemDelegator(adapterFactory);

        // actionListContentProvider = new AdapterFactoryContentProvider(adapterFactory);
        labelProvider = new LabelProvider() {
            @Override
            public Image getImage(Object element) {
                return ExtendedImageRegistry.getInstance().getImage(itemDelegator.getImage(element));
            }

            @Override
            public String getText(Object object) {
                return itemDelegator.getText(object);
            }
        };

        timeTrackJob = new TimeTracker("timetrack"); //$NON-NLS-1$
        timeTrackJob.setSystem(true);
    }

    /*
     * (non-Javadoc) Method declared on IViewPart.
     */
    public void init(IViewSite site) throws PartInitException {
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

        ScrolledComposite scrolledComposite = new ScrolledComposite(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
        formToolkit.adapt(scrolledComposite);
        formToolkit.paintBordersFor(scrolledComposite);
        scrolledComposite.setExpandHorizontal(true);
        scrolledComposite.setExpandVertical(true);

        Composite composite = formToolkit.createComposite(scrolledComposite, SWT.NONE);
        formToolkit.paintBordersFor(composite);
        {
            TableWrapLayout twl_composite = new TableWrapLayout();
            twl_composite.makeColumnsEqualWidth = true;
            composite.setLayout(twl_composite);
        }

        Composite composite_1 = formToolkit.createComposite(composite, SWT.BORDER);
        composite_1.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP, 1, 1));

        formToolkit.paintBordersFor(composite_1);
        {
            TableWrapLayout twl_composite_1 = new TableWrapLayout();
            twl_composite_1.numColumns = 2;
            composite_1.setLayout(twl_composite_1);
        }

        lblImg = formToolkit.createLabel(composite_1, "", SWT.NONE); //$NON-NLS-1$
        lblImg.setLayoutData(new TableWrapData(TableWrapData.RIGHT, TableWrapData.MIDDLE, 2, 1));
        // lblImg.setBounds(0, 0, 32, 32);
        lblImg.setSize(96, 96);
        lblImg.setText("         "); //$NON-NLS-1$
        lblImg.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/interrupt-1.png")); //$NON-NLS-1$ //$NON-NLS-2$

        lblName = formToolkit.createLabel(composite_1, "New Label", SWT.NONE); //$NON-NLS-1$
        lblName.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.MIDDLE, 1, 1));
        lblName.setSize(96, 96);

        lblDesc = new Label(composite_1, SWT.NONE);
        lblDesc.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP, 1, 1));
        formToolkit.adapt(lblDesc, true, true);
        lblDesc.setText("desc"); //$NON-NLS-1$
        // new Label(composite_1, SWT.NONE);

        // ----
        Composite composite_7 = formToolkit.createComposite(composite, SWT.NONE);
        composite_7.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP, 3, 1));
        formToolkit.paintBordersFor(composite_7);
        {
            TableWrapLayout twl_composite_7 = new TableWrapLayout();
            twl_composite_7.numColumns = 1;
            composite_7.setLayout(twl_composite_7);
        }

        sctnActionSection = formToolkit.createSection(composite_7, Section.TWISTIE | Section.TITLE_BAR);
        sctnActionSection.setDescription(Messages.RuntimeScriptView_section_action_desc);
        sctnActionSection.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP, 1, 1));
        formToolkit.paintBordersFor(sctnActionSection);
        sctnActionSection.setText(Messages.RuntimeScriptView_section_action);
        sctnActionSection.setExpanded(true);

        Composite composite_11 = formToolkit.createComposite(sctnActionSection, SWT.NONE);
        formToolkit.paintBordersFor(composite_11);
        sctnActionSection.setClient(composite_11);
        composite_11.setLayout(new GridLayout(3, false));

        Composite composite_13 = new Composite(composite_11, SWT.NONE);
        GridData gd_composite_13 = new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1);
        gd_composite_13.heightHint = 128;
        gd_composite_13.widthHint = 200;
        composite_13.setLayoutData(gd_composite_13);
        formToolkit.adapt(composite_13);
        formToolkit.paintBordersFor(composite_13);
        composite_13.setLayout(new TableColumnLayout());

        characterViewer = new TableViewer(composite_13, SWT.BORDER);
        // characterViewer.addSelectionChangedListener(new ISelectionChangedListener() {
        //
        // @Override
        // public void selectionChanged(SelectionChangedEvent event) {
        // // ISelection selection = treeViewer.getSelection();
        // // EObject firstEObject = ShadowrunEditingTools.extractFirstEObject(selection);
        //
        // // RuntimeCharacter value = (RuntimeCharacter)firstEObject;
        // // List<EClass> commands = GameplayTools.getCharacterCommands();// createCharacterCommands(value);
        // // treeViewer_Commands.setInput(commands);
        //
        // }
        // });
        final Table characterTable = characterViewer.getTable();
        characterTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDoubleClick(MouseEvent e) {
                ISelection selection = characterViewer.getSelection();
                ShadowrunEditingTools.openEditorForFirstSelection(selection);;
            }
        });
        formToolkit.paintBordersFor(characterTable);

        Composite composite_12 = new Composite(composite_11, SWT.NONE);
        GridData gd_composite_12 = new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1);
        gd_composite_12.heightHint = 128;
        gd_composite_12.widthHint = 200;
        composite_12.setLayoutData(gd_composite_12);
        composite_12.setLayout(new TableColumnLayout());
        // gd_composite_12.widthHint = 196;
        // composite_12.setLayoutData(gd_composite_12);
        formToolkit.adapt(composite_12);
        formToolkit.paintBordersFor(composite_12);

        treeViewer_Commands = new TableViewer(composite_12, SWT.BORDER | SWT.FULL_SELECTION);
        Table tree_2 = treeViewer_Commands.getTable();
        GridData gd_tree_2 = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
        gd_tree_2.heightHint = 128;
        // gd_tree_2.widthHint = 196;
        tree_2.setLayoutData(gd_tree_2);
        treeViewer_Commands.setContentProvider(ArrayContentProvider.getInstance());// new SimpleListContenProvider(actionListContentProvider));
        treeViewer_Commands.setLabelProvider(new DefaultLabelProvider());
        List<EClass> commands = GameplayTools.getCharacterCommands();// createCharacterCommands(value);
        treeViewer_Commands.setInput(commands);

        formToolkit.paintBordersFor(tree_2);

        Composite composite_15 = formToolkit.createComposite(composite_11, SWT.NONE);
        composite_15.setLayout(new FillLayout(SWT.HORIZONTAL));
        composite_15.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        formToolkit.paintBordersFor(composite_15);

        ToolBar toolBar = new ToolBar(composite_15, SWT.BORDER | SWT.FLAT | SWT.RIGHT | SWT.VERTICAL);
        formToolkit.adapt(toolBar);
        formToolkit.paintBordersFor(toolBar);

        final ToolItem tltmTimeTrackingItem = new ToolItem(toolBar, SWT.NONE);
        tltmTimeTrackingItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (timeTrackJob.isTimetracking) {
                    timeTrackJob.isTimetracking = false;
                    tltmTimeTrackingItem.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/time-tracking.png")); //$NON-NLS-1$ //$NON-NLS-2$
                    tltmTimeTrackingItem.setText(Messages.RuntimeScriptView_time_tracking_action_start);
                } else {
                    TimetrackingDialog timetrackingDialog = new TimetrackingDialog(getSite().getShell(), timeTrackFactor);
                    if (timetrackingDialog.open() == Dialog.CANCEL)
                        return;
                    timeTrackFactor = timetrackingDialog.getFactor();
                    timeTrackJob.isTimetracking = true;
                    timeTrackJob.schedule();
                    tltmTimeTrackingItem.setText(Messages.RuntimeScriptView_time_tracking_action_stop);
                    tltmTimeTrackingItem.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/time-tracking-off.png")); //$NON-NLS-1$ //$NON-NLS-2$
                }
            }
        });
        tltmTimeTrackingItem.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/time-tracking.png")); //$NON-NLS-1$ //$NON-NLS-2$
        tltmTimeTrackingItem.setText(Messages.RuntimeScriptView_time_tracking_action_start);

        ToolItem tltmStartcombatturn = new ToolItem(toolBar, SWT.NONE);
        tltmStartcombatturn.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/start-combat.png")); //$NON-NLS-1$ //$NON-NLS-2$
        tltmStartcombatturn.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                startCombatTurn();
            }
        });
        tltmStartcombatturn.setText(Messages.RuntimeScriptView_startCombatTurn_action);

        ToolItem tltmExecuteaction = new ToolItem(toolBar, SWT.NONE);
        tltmExecuteaction.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/execute-command.png")); //$NON-NLS-1$ //$NON-NLS-2$
        tltmExecuteaction.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                ISelection selection = treeViewer_Commands.getSelection();
                EClass eObject = (EClass)ShadowrunEditingTools.extractFirstEObject(selection);
                if (eObject != null) {
                    SubjectCommand command = (SubjectCommand)GameplayFactory.eINSTANCE.create(eObject);
                    command.setSubject((RuntimeCharacter)ShadowrunEditingTools.extractFirstEObject(characterViewer.getSelection()));
                    scriptService.executeCommand(command);// (Command)eObject);
                }
            }
        });
        tltmExecuteaction.setText(Messages.RuntimeScriptView_execute_action);

        ToolItem tltmSendMessage = new ToolItem(toolBar, SWT.NONE);
        tltmSendMessage.setToolTipText(Messages.RuntimeScriptView_tltmSendMessage_toolTipText);
        tltmSendMessage.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/talk.png"));
        tltmSendMessage.setText(Messages.RuntimeScriptView_tltmSendMessage_text);
        tltmSendMessage.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                EObject eObject = ShadowrunEditingTools.extractFirstEObject(characterViewer.getSelection());
                if (eObject instanceof RuntimeCharacter) {
                    RuntimeCharacter character = (RuntimeCharacter)eObject;
                    InputDialog inputDialog = new InputDialog(getSite().getShell(),"Send a message","Send a message to "+labelProvider.getText(character),"a message",null);
                    if(inputDialog.open()==Dialog.OK){                       
                        scriptService.sendMessage(character, inputDialog.getValue());
                    }
                }
            }
        });

        ToolItem tltmSwitchplacement = new ToolItem(toolBar, SWT.NONE);
        tltmSwitchplacement.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/switch-placement.png")); //$NON-NLS-1$ //$NON-NLS-2$
        tltmSwitchplacement.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                switchPlacement();
            }
        });
        tltmSwitchplacement.setText(Messages.RuntimeScriptView_switch_action);

        lblDatetimelong = formToolkit.createLabel(composite_11, "", SWT.NONE); //$NON-NLS-1$
        lblDatetimelong.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));

        Composite composite_8 = formToolkit.createComposite(composite, SWT.NONE);
        composite_8.setLayout(new GridLayout(2, false));
        composite_8.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP, 4, 1));
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

        sctnBackground = formToolkit.createSection(composite_9, Section.TWISTIE | Section.TITLE_BAR);
        sctnBackground.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.MIDDLE, 1, 1));
        sctnBackground.setSize(1183, 116);
        formToolkit.paintBordersFor(sctnBackground);
        sctnBackground.setText(Messages.RuntimeScriptView_section_background);
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

        sctnTimeTracking = formToolkit.createSection(composite_10, Section.TWISTIE | Section.TITLE_BAR);
        sctnTimeTracking.setDescription(Messages.RuntimeScriptView_section_timetracking_description);

        formToolkit.paintBordersFor(sctnTimeTracking);
        sctnTimeTracking.setText(Messages.RuntimeScriptView_section_timetracking);
        sctnTimeTracking.setExpanded(true);

        Composite composite_5 = formToolkit.createComposite(sctnTimeTracking, SWT.NONE);
        formToolkit.paintBordersFor(composite_5);
        sctnTimeTracking.setClient(composite_5);
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

        sctnInTheirFace = formToolkit.createSection(composite_9, Section.TWISTIE | Section.TITLE_BAR);
        sctnInTheirFace.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP, 1, 1));
        formToolkit.paintBordersFor(sctnInTheirFace);
        sctnInTheirFace.setText(Messages.RuntimeScriptView_section_in_their_face);
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

        sctnDebugging = formToolkit.createSection(composite_9, Section.TWISTIE | Section.TITLE_BAR);
        sctnDebugging.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP, 1, 1));
        sctnInTheirFace.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP, 1, 1));
        formToolkit.paintBordersFor(sctnInTheirFace);
        sctnDebugging.setText(Messages.RuntimeScriptView_section_debugging);
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

        Section sctnProtocol = formToolkit.createSection(composite, Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
        TableWrapData twd_sctnProtocol = new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB, 1, 1);
        twd_sctnProtocol.heightHint = 218;
        sctnProtocol.setLayoutData(twd_sctnProtocol);
        formToolkit.paintBordersFor(sctnProtocol);
        sctnProtocol.setText(Messages.RuntimeScriptView_section_protocol);

        Composite composite_14 = new Composite(sctnProtocol, SWT.NONE);
        sctnProtocol.setClient(composite_14);
        formToolkit.adapt(composite_14);
        formToolkit.paintBordersFor(composite_14);
        composite_14.setLayout(new FillLayout(SWT.HORIZONTAL));

        // Composite composite_14 = formToolkit.createComposite(composite, SWT.NONE);
        // composite_14.setLayout(new FillLayout(SWT.HORIZONTAL));
        // TableWrapData twd_composite_14 = new TableWrapData(TableWrapData.FILL, TableWrapData.FILL, 1, 1);
        // twd_composite_14.heightHint = 239;
        // composite_14.setLayoutData(twd_composite_14);
        // formToolkit.paintBordersFor(composite_14);

        treeViewer_commandProtokoll = new TableViewer(composite_14, SWT.BORDER);
        tree = treeViewer_commandProtokoll.getTable();
        tree.setHeaderVisible(false);
        formToolkit.paintBordersFor(tree);

        composite.pack(true);
        scrolledComposite.setContent(composite);
        scrolledComposite.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

        m_bindingContext = initDataBindings1();

    }

    @Override
    public void dispose() {
        placement.dispose();
        protocol.dispose();
        characters.dispose();
        super.dispose();
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

        characters.clear();
        EList<Team> teams = placement.getTeams();
        Team player = script2.getPlayer();
        characters.addAll(player.getMembers());
        for (Team team : teams) {
            characters.addAll(team.getMembers());
        }
        sctnActionSection.setExpanded(true);
        sctnBackground.setExpanded(true);
        sctnDebugging.setExpanded(false);
        sctnInTheirFace.setExpanded(false);
        sctnTimeTracking.setEnabled(true);
    }

    @Override
    public void setScript(Script script) {
        commandStack = script.getHistory().getCommandStack();
        protocol.setValue(commandStack.getProtocol());
        history.setValue(script.getHistory());
        if (!script.eAdapters().contains(adapter))
            script.eAdapters().add(adapter);
    }

    @Override
    public void sendMessage(RuntimeCharacter character, String message) {
        // don't send messages to our self
    }

    protected DataBindingContext initDataBindings1() {
        DataBindingContext bindingContext = new DataBindingContext();
        Realm realm = Realm.getDefault();
        ECPProject defaultEcpProject = Activator.getDefault().getDefaultEcpProject();
        EditingDomain editingDomain = defaultEcpProject.getEditingDomain();

        //

        IWidgetValueProperty image = WidgetProperties.image();
        ISWTObservableValue observedImage = image.observe(lblImg);
        IObservableValue observeValue = EMFObservables.observeDetailValue(realm, placement, Shr5Package.Literals.BESCHREIBBAR__IMAGE);

        IConverter converter = null;

        converter = new PathToImageConverter(String.class, Image.class, 48);
        UpdateValueStrategy toModel = new UpdateValueStrategy();
        UpdateValueStrategy toWidget = new UpdateValueStrategy().setConverter(converter);
        bindingContext.bindValue(observedImage, observeValue, toModel, toWidget);
        //

        //
        IObservableValue observeTextLblDescObserveWidget = WidgetProperties.text().observe(lblDesc);
        IObservableValue placement1BeschreibungObserveValue = EMFObservables
                .observeDetailValue(realm, placement, Literals.BESCHREIBBAR__BESCHREIBUNG);
        bindingContext.bindValue(observeTextLblDescObserveWidget, placement1BeschreibungObserveValue, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
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
        IObservableValue observeDateTimeObserveWidget = WidgetProperties.text().observe(lblDatetimelong);
        IObservableValue observeDetailValue = EMFObservables.observeDetailValue(realm, placement, ScriptingPackage.Literals.TIME_FRAME__ACTUAL_DATE);
        EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
        final DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT);
        modelToTarget.setConverter(new Converter(Date.class,String.class) {
            
            @Override
            public Object convert(Object fromObject) {
                return dateTimeInstance.format(fromObject);
            }
        });
        bindingContext.bindValue(observeDateTimeObserveWidget, observeDetailValue, null, modelToTarget);

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

        printedProtocol = EMFEditObservables.observeDetailList(realm, editingDomain, history,
                ScriptingPackage.Literals.SCRIPT_HISTORY__WRITTEN_PROTOKOL);
        // IEMFEditListProperty list = EMFEditProperties.list(editingDomain, ScriptingPackage.Literals.SCRIPT_HISTORY__WRITTEN_PROTOKOL);
        // printedProtocol = list.observe(observeDetailValue2);
        //

        ObservableListContentProvider listProtocolProvider = new ObservableListContentProvider();
        treeViewer_commandProtokoll.setContentProvider(listProtocolProvider);
        treeViewer_commandProtokoll.setInput(printedProtocol);
        treeViewer_commandProtokoll.setLabelProvider(labelProvider);

        //
        ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
        IObservableMap[] observeMaps = EMFObservables.observeMaps(listContentProvider.getKnownElements(),
                new EStructuralFeature[]{ RuntimePackage.Literals.RUNTIME_CHARACTER__CHARACTER });
        characterViewer.setLabelProvider(new ObservableMapLabelProvider(observeMaps) {
            @Override
            public String getColumnText(Object element, int columnIndex) {
                if (columnIndex == 0) {

                    return labelProvider.getText(element);
                }
                return super.getColumnText(element, columnIndex);
            }

            @Override
            public Image getColumnImage(Object element, int columnIndex) {
                if (columnIndex == 0) {
                    return labelProvider.getImage(element);
                }
                return super.getColumnImage(element, columnIndex);
            }

            @Override
            public Image getImage(Object element) {
                return labelProvider.getImage(element);
            }

            @Override
            public String getText(Object element) {
                return labelProvider.getText(element);
            }
        });
        characterViewer.setContentProvider(listContentProvider);
        characterViewer.setInput(characters);
        //
        return bindingContext;
    }

    @Override
    public CommandCallback getCmdCallback() {
        return this;
    }

    @SuppressWarnings("unchecked")
    protected void startCombatTurn() {
        timeTrackJob.isTimetracking = false;
        CombatTurn combatTurn = GameplayFactory.eINSTANCE.createCombatTurn();
        combatTurn.setDate(placement1.getActualDate());
        combatTurn.setCmdCallback(RuntimeScriptView.this);
        List<Object> choiceOfValues = new ArrayList<Object>();

        EList<Team> teams = placement1.getTeams();
        for (Team team : teams) {
            choiceOfValues.addAll(team.getMembers());
        }
        if (placement1.getScript() != null)
            choiceOfValues.addAll(placement1.getScript().getPlayer().getMembers());

        FeatureEditorDialogWert dialogWert = new FeatureEditorDialogWert(getSite().getShell(), labelProvider, combatTurn,
                GameplayPackage.Literals.COMBAT_TURN__COMBATANTS, Messages.RuntimeScriptView_dialog_select_combatans_titel, choiceOfValues);
        if (dialogWert.open() == Dialog.OK)
            combatTurn.getCombatants().addAll((Collection<? extends RuntimeCharacter>)dialogWert.getResult());
        else
            return;

        sctnActionSection.setExpanded(false);
        // scriptService.executeCommand(combatTurn);
        scriptService.setCombatTurn(combatTurn);
    }

    /**
     * Start a new combat turn with the given characters.
     * 
     * @param combatants
     */
    protected void contiueCombatTurn(Collection<? extends RuntimeCharacter> combatants) {
        timeTrackJob.isTimetracking = false;
        CombatTurn combatTurn = GameplayFactory.eINSTANCE.createCombatTurn();
        combatTurn.setDate(placement1.getActualDate());
        combatTurn.setCmdCallback(RuntimeScriptView.this);

        combatTurn.getCombatants().addAll(combatants);
        scriptService.setCombatTurn(combatTurn);
    }

    /**
     * Returns a formated history line.
     * 
     * @param cmd
     * @return
     */
    private String printCommand(Command cmd) {
        return String.format(Messages.RuntimeScriptView_protocol_basic_command, cmd.getDate(), labelProvider.getText(cmd),
                ShadowrunEditingTools.command2String(cmd));
    }

    @SuppressWarnings("unchecked")
    private void switchPlacement() {
        EList<Placement> nextPlacements = placement1.getNextPlacements();

        OwnChooseDialog dialog = new OwnChooseDialog(getSite().getShell(), nextPlacements.toArray(new Object[]{}),
                Messages.RuntimeScriptView_choose_placement_dialog_titel, Messages.RuntimeScriptView_choose_placement_dialog_message);
        dialog.setLabelProvider(labelProvider);
        int open = dialog.open();
        if (open == Dialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0) {
                Placement eo = (Placement)result[0];
                SetFeatureCommand command = GameplayFactory.eINSTANCE.createSetFeatureCommand();
                command.setDate(placement1.getActualDate());
                scriptService.setPlacement(eo);
                printedProtocol.add(0,
                        String.format(Messages.RuntimeScriptView_protocol_switch_placement, placement1.getActualDate(), labelProvider.getText(eo)));
            }
        }
    }

    @Override
    public void beforeExecute(Command cmd, EStructuralFeature... eStructuralFeatures) {
        if (cmd instanceof SemanticAction) {
            return;
        }
        ProbeDialog d = new ProbeDialog(getSite().getShell(), cmd, labelProvider, itemDelegator, new DefaultReferenceManager(itemDelegator),
                Messages.RuntimeScriptView_probedialog_titel_before_execute, ProbeExecutionState.beforeExecute, eStructuralFeatures);
        d.open();

    }

    @Override
    public void beforeSubcommands(Command cmd, EStructuralFeature... eStructuralFeatures) {
        ProbeDialog d = new ProbeDialog(getSite().getShell(), cmd, labelProvider, itemDelegator, new DefaultReferenceManager(itemDelegator),
                Messages.RuntimeScriptView_probedialog_titel_before_subcommand, ProbeExecutionState.beforeSubcommands, eStructuralFeatures);
        d.open();

    }

    @Override
    public void prepareCommand(Command cmd, EStructuralFeature... eStructuralFeatures) {
        if (cmd instanceof CommandWrapper || cmd instanceof SimpleAction || cmd instanceof SemanticAction)
            return;
        if (cmd instanceof CombatTurn) {
            CombatTurn ct = (CombatTurn)cmd;
            new CheckInitative(getSite().getShell(), ct).open();
            return;
        } else if (cmd instanceof MeeleAttackCmd) {
            MeeleAttackCmd mc = (MeeleAttackCmd)cmd;
            if (mc.getSubject() != null && mc.getWeapon() != null && mc.getSkill() != null && mc.getObject() != null)
                return;

            ProbeDialog genericEObjectDialog = new ProbeDialog(getSite().getShell(), cmd, labelProvider, itemDelegator, new DefaultReferenceManager(
                    itemDelegator), Messages.RuntimeScriptView_probedialog_titel_prepare_command, ProbeExecutionState.prepare,
                    GameplayPackage.Literals.SUBJECT_COMMAND__SUBJECT, GameplayPackage.Literals.MEELE_ATTACK_CMD__WEAPON,
                    GameplayPackage.Literals.SKILL_TEST_CMD__SKILL, GameplayPackage.Literals.OPPOSED_SKILL_TEST_CMD__OBJECT,
                    GameplayPackage.Literals.PROBE_COMMAND__MODS, GameplayPackage.Literals.PROBE__PUSH_THE_LIMIT);

            genericEObjectDialog.open();
            return;
        } else if (cmd instanceof RangedAttackCmd) {
            RangedAttackCmd rc = (RangedAttackCmd)cmd;
            // if (rc.getSubject() != null && rc.getWeapon() != null && rc.getSkill() != null && rc.getObject() != null)
            // return;

            ProbeDialog genericEObjectDialog = new ProbeDialog(getSite().getShell(), cmd, labelProvider, itemDelegator, new DefaultReferenceManager(
                    itemDelegator), Messages.RuntimeScriptView_probedialog_titel_prepare_command, ProbeExecutionState.prepare, eStructuralFeatures);
            // GameplayPackage.Literals.SUBJECT_COMMAND__SUBJECT,
            // GameplayPackage.Literals.RANGED_ATTACK_CMD__WEAPON, GameplayPackage.Literals.RANGED_ATTACK_CMD__RANGE,
            // GameplayPackage.Literals.SKILL_TEST_CMD__SKILL, GameplayPackage.Literals.OPPOSED_SKILL_TEST_CMD__OBJECT,
            // GameplayPackage.Literals.PROBE_COMMAND__MODS);
            genericEObjectDialog.open();
            return;
        } else if (cmd instanceof DamageTest) {
            ProbeDialog genericEObjectDialog = new ProbeDialog(getSite().getShell(), cmd, labelProvider, itemDelegator, new DefaultReferenceManager(
                    itemDelegator), Messages.RuntimeScriptView_probedialog_titel_prepare_command, ProbeExecutionState.prepare,
                    GameplayPackage.Literals.SUBJECT_COMMAND__SUBJECT, GameplayPackage.Literals.DAMAGE_TEST__DAMAGE,
                    GameplayPackage.Literals.DAMAGE_TEST__DV, GameplayPackage.Literals.PROBE_COMMAND__MODS,
                    GameplayPackage.Literals.PROBE__PUSH_THE_LIMIT);
            genericEObjectDialog.open();
            return;
        } else if (cmd instanceof DefensTestCmd) {
            ProbeDialog genericEObjectDialog = new ProbeDialog(getSite().getShell(), cmd, labelProvider, itemDelegator, new DefaultReferenceManager(
                    itemDelegator), Messages.RuntimeScriptView_probedialog_titel_prepare_command, ProbeExecutionState.prepare,
                    GameplayPackage.Literals.SUBJECT_COMMAND__SUBJECT, GameplayPackage.Literals.DEFENS_TEST_CMD__ATTACKERS_HITS,
                    GameplayPackage.Literals.PROBE_COMMAND__MODS, GameplayPackage.Literals.PROBE__PUSH_THE_LIMIT);
            genericEObjectDialog.open();
            return;
        } else if (cmd instanceof SetFeatureCommand) {
            // SetFeatureCommand sf = (SetFeatureCommand)cmd;
            // ProbeDialog d = new ProbeDialog(getSite().getShell(), cmd, labelProvider, itemDelegator, new DefaultReferenceManager(itemDelegator),
            // "prepare", ProbeExecutionState.prepare,eStructuralFeatures);
            // d.open();
            return;
        } else if (cmd instanceof SetExtendetData) {
            // SetExtendetData new_name = (SetExtendetData)cmd;
            return;
        } else if (cmd instanceof OpposedSkillTestCmd) {

        } else if (cmd instanceof SkillTestCmd) {
            ProbeDialog d = new ProbeDialog(getSite().getShell(), cmd, labelProvider, itemDelegator, new DefaultReferenceManager(itemDelegator),
                    Messages.RuntimeScriptView_probedialog_titel_prepare_command, ProbeExecutionState.prepare,
                    GameplayPackage.Literals.SUBJECT_COMMAND__SUBJECT, GameplayPackage.Literals.SKILL_TEST_CMD__SKILL,
                    GameplayPackage.Literals.PROBE__LIMIT, GameplayPackage.Literals.SUCCES_TEST__THRESHOLDS,
                    GameplayPackage.Literals.PROBE_COMMAND__MODS, GameplayPackage.Literals.PROBE__PUSH_THE_LIMIT,
                    GameplayPackage.Literals.COMMAND__HIDDEN);
            d.open();
            return;
        }
        ProbeDialog d = new ProbeDialog(getSite().getShell(), cmd, labelProvider, itemDelegator, new DefaultReferenceManager(itemDelegator),
                Messages.RuntimeScriptView_probedialog_titel_prepare_command, ProbeExecutionState.prepare, eStructuralFeatures);
        d.open();
        return;
        // GenericEObjectDialog genericEObjectDialog = new GenericEObjectDialog(getSite().getShell(), cmd, itemDelegator, labelProvider,
        // new DefaultReferenceManager(itemDelegator));
        // // GenericEObjectDialog genericEObjectDialog = new GenericEObjectDialog(getSite().getShell(), cmd, itemDelegator, labelProvider,
        // // new DefaultReferenceManager(itemDelegator));
        // genericEObjectDialog.open();
    }

    @Override
    public void afterCommand(Command cmd, EStructuralFeature... eStructuralFeatures) {
        if (cmd instanceof CommandWrapper)
            return;
        if (cmd instanceof CombatTurn) {
            CombatTurn ct = (CombatTurn)cmd;
            ((Placement)placement.getValue()).setActualDate(new Date(ct.getDate().getTime() + 3000));

            if (MessageDialog.openQuestion(getSite().getShell(), Messages.RuntimeScriptView_continue_combat_dialog_titel,
                    Messages.RuntimeScriptView_continue_combat_dialog_message)) {
                EList<RuntimeCharacter> combatants = ct.getCombatants();
                contiueCombatTurn(combatants);
            } else {
                try {
                    PlatformUI.getWorkbench().showPerspective(RUNTIME_PERSPECTIVE, PlatformUI.getWorkbench().getActiveWorkbenchWindow());
                } catch (WorkbenchException e) {
                    Activator.logError(e);
                }
            }

            return;
        } else if (cmd instanceof DamageTest) {
            new DamageProbeFinishedDialog(getSite().getShell(), cmd, labelProvider).open();
            return;
        } else if (cmd instanceof SetFeatureCommand) {
            SetFeatureCommand sf = (SetFeatureCommand)cmd;
            ProbeDialog d = new ProbeDialog(getSite().getShell(), cmd, labelProvider, itemDelegator, new DefaultReferenceManager(itemDelegator),
                    Messages.RuntimeScriptView_probedialog_titel_prepare_command, ProbeExecutionState.prepare, eStructuralFeatures);
            d.open();
        }

        // ProbeFinishedDialog probeFinishedDialog = new ProbeFinishedDialog(getSite().getShell(), cmd, labelProvider);
        // probeFinishedDialog.open();

        ProbeDialog d = new ProbeDialog(getSite().getShell(), cmd, labelProvider, itemDelegator, new DefaultReferenceManager(itemDelegator),
                Messages.RuntimeScriptView_probedialog_titel_finished_command, ProbeExecutionState.afterExecute);
        d.open();

        // GenericEObjectDialog genericEObjectDialog = new GenericEObjectDialog(getSite().getShell(), cmd, itemDelegator, labelProvider,
        // new DefaultReferenceManager(itemDelegator));
        // genericEObjectDialog.open();

    }

}
