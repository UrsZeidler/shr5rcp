package de.urszeidler.shr5.runtime.ui.views;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.part.ViewPart;

import de.urszeidler.eclipse.shr5.Shr5Package.Literals;
import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.ScriptingFactory;
import de.urszeidler.shr5.scripting.ScriptingPackage;

import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.swt.layout.GridData;

import de.urszeidler.shr5.ecp.editor.widgets.TreeTableWidget;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.wb.rcp.databinding.EMFBeansListObservableFactory;
import de.urszeidler.eclipse.shr5.runtime.Team;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import org.eclipse.wb.rcp.databinding.EMFTreeBeanAdvisor;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.wb.rcp.databinding.EMFTreeObservableLabelProvider;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.swt.widgets.Button;

public class RuntimeScriptView extends ViewPart implements ISelectionListener {
    private DataBindingContext m_bindingContext;

    public static final String ID = "de.urszeidler.shr5.runtime.ui.views.RuntimeScriptView"; //$NON-NLS-1$
    private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
    private Placement placement = ScriptingFactory.eINSTANCE.createPlacement();
    private Label lblName;
    private StyledText styledText;
    private StyledText styledText_1;

    private StyledText styledText_2;

    private Action startCombatAction;

    private Action switchPlacementAction;
    public RuntimeScriptView() {
    }

    
    /*
     * (non-Javadoc) Method declared on IViewPart.
     */
    public void init(IViewSite site) throws PartInitException {
        site.getPage().addSelectionListener(this);
        super.init(site);
    }

    /**
     * Create contents of the view part.
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
        //GridData gd_beschreibbarWidget = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);

        
        Composite composite_1 = formToolkit.createComposite(composite, SWT.NONE);
 
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
        
        Composite composite_8 = formToolkit.createComposite(composite, SWT.NONE);
        composite_8.setLayout(new GridLayout(2, false));
        composite_8.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP, 1, 1));
        formToolkit.paintBordersFor(composite_8);
        
        Composite composite_9 = formToolkit.createComposite(composite_8, SWT.NONE);
        {
            TableWrapLayout twl_composite_9 = new TableWrapLayout();
            twl_composite_9.topMargin = 0;
            twl_composite_9.makeColumnsEqualWidth = true;
            twl_composite_9.numColumns = 1;
            composite_9.setLayout(twl_composite_9);
        }
        GridData gd_composite_9 = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
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
        
        CDateTime dateTime_1 = new CDateTime(composite_5, CDT.BORDER | CDT.SPINNER | CDT.TAB_FIELDS | CDT.CLOCK_24_HOUR | CDT.CLOCK_DISCRETE | CDT.SIMPLE | CDT.DATE_SHORT | CDT.TIME_MEDIUM);
        dateTime_1.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
        formToolkit.adapt(dateTime_1);
        formToolkit.paintBordersFor(dateTime_1);
        
        Composite composite_6 = formToolkit.createComposite(composite_5, SWT.NONE);
        composite_6.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        composite_6.setLayout(new GridLayout(1, false));
        formToolkit.paintBordersFor(composite_6);
        
        Button btnNewButton = formToolkit.createButton(composite_6, "New Button", SWT.NONE);
        
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
        

   
        createActions();
        initializeToolBar();
        initializeMenu();
        m_bindingContext = initDataBindings();
    }

    /**
     * Create the actions.
     */
    private void createActions() {
        startCombatAction = new Action() {
            public void run() {
              
            }
        };
        startCombatAction.setText("Start combat");
        startCombatAction.setToolTipText("start the combat");
        startCombatAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_TOOL_FORWARD));
        
        switchPlacementAction = new Action() {
            public void run() {
              
            }
        };
        switchPlacementAction.setText("Sort");
        switchPlacementAction.setToolTipText("sort tooltip");
        switchPlacementAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJ_ELEMENT));

    }

    /**
     * Initialize the toolbar.
     */
    private void initializeToolBar() {
        IToolBarManager toolbarManager = getViewSite().getActionBars().getToolBarManager();
        toolbarManager.add(startCombatAction);
        toolbarManager.add(switchPlacementAction);
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
    public void selectionChanged(IWorkbenchPart part, ISelection selection) {
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection ss = (IStructuredSelection)selection;
            Object firstElement = ss.getFirstElement();
            if (firstElement instanceof Placement) {
                placement = (Placement)firstElement;
                initDataBindings();
            }
            // selectionProvider.setSelection(selection);
        }
    }
    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue observeTextLblNameObserveWidget = WidgetProperties.text().observe(lblName);
        IObservableValue placementNameObserveValue = EMFObservables.observeValue(placement, Literals.BESCHREIBBAR__NAME);
        bindingContext.bindValue(observeTextLblNameObserveWidget, placementNameObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        //
        IObservableValue observeTextStyledTextObserveWidget = WidgetProperties.text(SWT.Modify).observe(styledText);
        IObservableValue placementBackgroundObserveValue = EMFObservables.observeValue(placement, ScriptingPackage.Literals.PLACEMENT__BACKGROUND);
        bindingContext.bindValue(observeTextStyledTextObserveWidget, placementBackgroundObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        //
        IObservableValue observeTextStyledText_1ObserveWidget = WidgetProperties.text(SWT.Modify).observe(styledText_1);
        IObservableValue placementInTheirFaceObserveValue = EMFObservables.observeValue(placement, ScriptingPackage.Literals.PLACEMENT__IN_THEIR_FACE);
        bindingContext.bindValue(observeTextStyledText_1ObserveWidget, placementInTheirFaceObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        //
        IObservableValue observeTextStyledText_2ObserveWidget = WidgetProperties.text(SWT.Modify).observe(styledText_2);
        IObservableValue placementDebuggingObserveValue = EMFObservables.observeValue(placement, ScriptingPackage.Literals.PLACEMENT__DEBUGGING);
        bindingContext.bindValue(observeTextStyledText_2ObserveWidget, placementDebuggingObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        //
        return bindingContext;
    }
}
