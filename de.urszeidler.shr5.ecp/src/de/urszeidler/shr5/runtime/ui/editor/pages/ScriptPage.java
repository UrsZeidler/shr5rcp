package de.urszeidler.shr5.runtime.ui.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
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
import org.eclipse.zest.core.viewers.AbstractZoomableViewer;
import org.eclipse.zest.core.viewers.EntityConnectionData;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.viewers.IGraphEntityContentProvider;
import org.eclipse.zest.core.viewers.IZoomableWorkbenchPart;
import org.eclipse.zest.core.viewers.ZoomContributionViewItem;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.pages.AbstractShr5Page;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;
import de.urszeidler.shr5.ecp.editor.widgets.TreeTableWidget;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.ScriptingFactory;
import de.urszeidler.shr5.scripting.ScriptingPackage;

public class ScriptPage extends AbstractShr5Page<Script> {
    private Script object;
    private EditingDomain editingDomain;

    protected DataBindingContext m_bindingContext;
    public class ZestNodeContentProvider extends ArrayContentProvider  implements IGraphEntityContentProvider {

        @Override
        public Object[] getConnectedTo(Object entity) {
          if (entity instanceof Placement) {
              Placement node = (Placement) entity;
            return node.getNextPlacements().toArray();
          }
          throw new RuntimeException("Type not supported");
        }
      } 
    
    public class ZestLabelProvider extends LabelProvider{
        @Override
        public String getText(Object element) {

            if (element instanceof EntityConnectionData) {
//              EntityConnectionData test = (EntityConnectionData) element;
              return "";
            }
            return AdapterFactoryUtil.getInstance().getLabelProvider().getText(element);
        }
        
        @Override
        public Image getImage(Object element) {
            return AdapterFactoryUtil.getInstance().getLabelProvider().getImage(element);
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
//        sctnScriptGraph.setDescriptionControl(toolBar);
        toolBar.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, false, 1, 1));
        managedForm.getToolkit().adapt(toolBar);
        managedForm.getToolkit().paintBordersFor(toolBar);
        
        
        final GraphViewer graphViewer = new GraphViewer(composite, SWT.NONE);
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

        ZoomContributionViewItem zoomContributionViewItem = new ZoomContributionViewItem(new IZoomableWorkbenchPart(){
            @Override
            public AbstractZoomableViewer getZoomableViewer() {
                return graphViewer;
            }
        });
        zoomContributionViewItem.fill(toolBar, 0);
        
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
