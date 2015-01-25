package de.urszeidler.shr5.runtime.ui.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.zest.core.viewers.EntityConnectionData;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.viewers.IEntityConnectionStyleProvider;
import org.eclipse.zest.core.viewers.IEntityStyleProvider;
import org.eclipse.zest.core.viewers.IGraphEntityContentProvider;
import org.eclipse.zest.core.viewers.IGraphEntityRelationshipContentProvider;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.editor.actions.ExportObjectAction;
import de.urszeidler.shr5.ecp.editor.pages.AbstractShr5Page;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;
import de.urszeidler.shr5.ecp.editor.widgets.TreeTableWidget;
import de.urszeidler.shr5.ecp.preferences.PreferenceConstants;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.PlacementOptions;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.ScriptingFactory;
import de.urszeidler.shr5.scripting.ScriptingPackage;

public class ScriptPage extends AbstractShr5Page<Script> {
    private Script object;
    private EditingDomain editingDomain;

    protected DataBindingContext m_bindingContext;
    private IObservableList observeList;
    private Color combatColor = ColorConstants.red;
    private Color combatColorF = ColorConstants.white;
    private IPreferenceStore store = Activator.getDefault().getPreferenceStore();

    public class ZestRelationContentProvider extends ArrayContentProvider implements IGraphEntityRelationshipContentProvider {

        @Override
        public Object[] getRelationships(Object source, Object dest) {
            return null;
        }

    }

    public class ZestNodeContentProvider extends ArrayContentProvider implements IGraphEntityContentProvider {

        @Override
        public Object[] getConnectedTo(Object entity) {
            if (entity instanceof Placement) {
                Placement node = (Placement)entity;
                return node.getNextPlacements().toArray();
            }
            throw new RuntimeException("Type not supported");
        }
    }

    public class ZestLabelProvider extends LabelProvider implements IEntityConnectionStyleProvider,IEntityStyleProvider {
        @Override
        public String getText(Object element) {

            if (element instanceof EntityConnectionData) {
                // EntityConnectionData test = (EntityConnectionData) element;
                return "";
            }
            return AdapterFactoryUtil.getInstance().getLabelProvider().getText(element);
        }

        @Override
        public Image getImage(Object element) {
            return AdapterFactoryUtil.getInstance().getLabelProvider().getImage(element);
        }

        @Override
        public int getConnectionStyle(Object src, Object dest) {
            return ZestStyles.CONNECTIONS_DIRECTED;
        }

        @Override
        public Color getColor(Object src, Object dest) {
            return null;
        }

        @Override
        public Color getHighlightColor(Object src, Object dest) {
            return null;
        }

        @Override
        public int getLineWidth(Object src, Object dest) {
            return -1;
        }

        @Override
        public IFigure getTooltip(Object entity) {
            if (entity instanceof Placement) {
                Placement p = (Placement)entity;
                Label label = new Label();
                label.setText(p.getBeschreibung());
                return label;
            }
            return null;
        }

        @Override
        public Color getNodeHighlightColor(Object entity) {
            return null;
        }

        @Override
        public Color getBorderColor(Object entity) {
            return null;
        }

        @Override
        public Color getBorderHighlightColor(Object entity) {
            return null;
        }

        @Override
        public int getBorderWidth(Object entity) {
            return 1;
        }

        @Override
        public Color getBackgroundColour(Object entity) {
            if (entity instanceof Placement) {
                Placement p = (Placement)entity;
                if(p.getOptions().contains(PlacementOptions.COMBAT))
                    return SWTResourceManager.getColor(PreferenceConverter.getColor(store, PreferenceConstants.SCRIPT_GRAPH_COLOR_BG+PlacementOptions.COMBAT));// combatColorF;combatColor;
            
                EList<EEnumLiteral> eLiterals = ScriptingPackage.Literals.PLACEMENT_OPTIONS.getELiterals();
                for (EEnumLiteral eEnumLiteral : eLiterals) {
                    if(p.getOptions().contains(eEnumLiteral.getInstance()))
                        return SWTResourceManager.getColor(PreferenceConverter.getColor(store, PreferenceConstants.SCRIPT_GRAPH_COLOR_BG+eEnumLiteral.getName()));
                     }
            }
            return null;
        }

        @Override
        public Color getForegroundColour(Object entity) {
            if (entity instanceof Placement) {
                Placement p = (Placement)entity;
                if(p.getOptions().contains(PlacementOptions.COMBAT))
                    return SWTResourceManager.getColor(PreferenceConverter.getColor(store, PreferenceConstants.SCRIPT_GRAPH_COLOR_FG+PlacementOptions.COMBAT));// combatColorF;

                EList<EEnumLiteral> eLiterals = ScriptingPackage.Literals.PLACEMENT_OPTIONS.getELiterals();
                for (EEnumLiteral eEnumLiteral : eLiterals) {
                    if(p.getOptions().contains(eEnumLiteral.getInstance()))
                        return SWTResourceManager.getColor(PreferenceConverter.getColor(store, PreferenceConstants.SCRIPT_GRAPH_COLOR_FG+eEnumLiteral.getName()));
                     }
            }
            return null;
        }

        @Override
        public boolean fisheyeNode(Object entity) {
            return false;
        }
    }

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public ScriptPage(String id, String title) {
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
    public ScriptPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        this.object = ScriptingFactory.eINSTANCE.createScript();
    }

    public ScriptPage(FormEditor editor, String id, String title, Script object, EditingDomain editingDomain, ReferenceManager manager) {
        super(editor, id, title, manager);
        this.object = object;
        this.editingDomain = editingDomain;
    }

    @Override
    public void dispose() {
        observeList.dispose();
        super.dispose();
    }

    /**
     * Create contents of the form.
     * 
     * @param managedForm
     */
    @Override
    protected void createFormContent(IManagedForm managedForm) {
        FormToolkit toolkit = managedForm.getToolkit();
        ScrolledForm form = managedForm.getForm();
        LabelProvider labelProvider = AdapterFactoryUtil.getInstance().getLabelProvider();
        form.setText(labelProvider.getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        form.getToolBarManager().add(new ExportObjectAction(form.getShell(), object));
        form.getToolBarManager().update(true);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(managedForm.getForm().getBody(), SWT.NONE, object, toolkit, editingDomain);
        beschreibbarWidget.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        managedForm.getToolkit().adapt(beschreibbarWidget);
        managedForm.getToolkit().paintBordersFor(beschreibbarWidget);

        Composite composite_2 = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        composite_2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        managedForm.getToolkit().adapt(composite_2);
        managedForm.getToolkit().paintBordersFor(composite_2);
        composite_2.setLayout(new GridLayout(3, false));

        Section sctnScriptGraph = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnScriptGraph.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnScriptGraph);
        sctnScriptGraph.setText("Script graph");
        sctnScriptGraph.setExpanded(true);

        Composite composite = managedForm.getToolkit().createComposite(sctnScriptGraph, SWT.NONE);
        sctnScriptGraph.setClient(composite);
        managedForm.getToolkit().paintBordersFor(composite);
        composite.setLayout(new GridLayout(1, false));

        ToolBar toolBar = new ToolBar(composite, SWT.FLAT | SWT.RIGHT);
        // sctnScriptGraph.setDescriptionControl(toolBar);
        toolBar.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, false, 1, 1));
        managedForm.getToolkit().adapt(toolBar);
        managedForm.getToolkit().paintBordersFor(toolBar);

        final GraphViewer graphViewer = new GraphViewer(composite, SWT.NONE);
        graphViewer.addDoubleClickListener(this);
        Control control = graphViewer.getControl();
        GridData gd_control = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        gd_control.minimumHeight = 200;
        control.setLayoutData(gd_control);

        Composite composite_1 = managedForm.getToolkit().createComposite(managedForm.getForm().getBody(), SWT.NONE);
        composite_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
        managedForm.getToolkit().paintBordersFor(composite_1);
        composite_1.setLayout(new GridLayout(2, true));

        TreeTableWidget treeTableWidget = new TreeTableWidget(composite_1, labelProvider.getText(ScriptingPackage.Literals.SCRIPT__PLACEMENTS),
                SWT.NONE, object, ScriptingPackage.Literals.SCRIPT__PLACEMENTS, toolkit, mananger, editingDomain, this);
        GridData gd_treeTableWidget = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
        gd_treeTableWidget.heightHint = 200;
        treeTableWidget.setLayoutData(gd_treeTableWidget);
        treeTableWidget.setSize(584, 133);
        managedForm.getToolkit().adapt(treeTableWidget);
        managedForm.getToolkit().paintBordersFor(treeTableWidget);

        treeTableWidget = new TreeTableWidget(composite_1, labelProvider.getText(ScriptingPackage.Literals.SCRIPT__ALL_TEAMS), SWT.NONE, object,
                ScriptingPackage.Literals.SCRIPT__ALL_TEAMS, toolkit, mananger, editingDomain, this);
        treeTableWidget.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
        managedForm.getToolkit().adapt(treeTableWidget);
        managedForm.getToolkit().paintBordersFor(treeTableWidget);

        m_bindingContext = initDataBindings();

        createFormBuilder(managedForm);

        emfFormBuilder.addTextEntry(ScriptingPackage.Literals.SCRIPT__ENTRY, composite_2);
        LayoutAlgorithm layout = new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
        graphViewer.setContentProvider(new ZestNodeContentProvider());
        graphViewer.setLabelProvider(new ZestLabelProvider());
        graphViewer.setInput(object.getPlacements());
        graphViewer.setLayoutAlgorithm(layout, true);
        graphViewer.applyLayout();

//        ZoomContributionViewItem zoomContributionViewItem = new ZoomContributionViewItem(new IZoomableWorkbenchPart() {
//            @Override
//            public AbstractZoomableViewer getZoomableViewer() {
//                return graphViewer;
//            }
//        });
//        zoomContributionViewItem.fill(toolBar, 0);
        observeList = EMFObservables.observeList(m_bindingContext.getValidationRealm(), object, ScriptingPackage.Literals.SCRIPT__PLACEMENTS);
        observeList.addChangeListener(new IChangeListener() {

            @Override
            public void handleChange(ChangeEvent event) {
                graphViewer.setInput(object.getPlacements());
            }
        });

        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);
        managedForm.reflow(true);

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
