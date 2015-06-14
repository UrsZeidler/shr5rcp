package de.urszeidler.shr5.ecp.editor.pages;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.urszeidler.commons.functors.Predicate;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;
import de.urszeidler.shr5.ecp.util.List2TreeContentProvider;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

public class SourceBookPage extends AbstractShr5Page<SourceBook> {
    private SourceBook object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;
    
    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public SourceBookPage(String id, String title) {
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
    public SourceBookPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        this.object = Shr5Factory.eINSTANCE.createSourceBook();
    }

    public SourceBookPage(FormEditor editor, String id, String title, SourceBook object) {
        super(editor, id, title);
        this.object = object;

    }
    public SourceBookPage(FormEditor editor, String id, String title, SourceBook object, EditingDomain editingDomain, ReferenceManager manager) {
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
        form.setText(AdapterFactoryUtil.getInstance().getLabelProvider().getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(managedForm.getForm().getBody(), SWT.NONE, object, toolkit, editingDomain);
        beschreibbarWidget.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
        managedForm.getToolkit().adapt(beschreibbarWidget);
        managedForm.getToolkit().paintBordersFor(beschreibbarWidget);

        Section sctnData = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        sctnData.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        managedForm.getToolkit().paintBordersFor(sctnData);
        sctnData.setText("data");
        sctnData.setExpanded(true);
        
        Composite composite_1 = managedForm.getToolkit().createComposite(sctnData, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(composite_1);
        sctnData.setClient(composite_1);
        composite_1.setLayout(new GridLayout(9, false));

        Section sctnContent = managedForm.getToolkit().createSection(managedForm.getForm().getBody(), Section.TWISTIE | Section.TITLE_BAR);
        GridData gd_sctnContent = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
        gd_sctnContent.widthHint = 444;
        gd_sctnContent.heightHint = 350;
        sctnContent.setLayoutData(gd_sctnContent);
        managedForm.getToolkit().paintBordersFor(sctnContent);
        sctnContent.setText("content");
        sctnContent.setExpanded(true);
        
        Composite composite = managedForm.getToolkit().createComposite(sctnContent, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(composite);
        sctnContent.setClient(composite);
        TreeColumnLayout layout = new TreeColumnLayout();
        composite.setLayout(layout);//new GridLayout());
        
        TreeViewer treeViewer = new TreeViewer(composite, SWT.BORDER);
        treeViewer.setContentProvider(new List2TreeContentProvider());
        treeViewer.addDoubleClickListener(this);
        treeViewer.addSelectionChangedListener(this);
        Tree tree = treeViewer.getTree();
        tree.setSortDirection(SWT.UP);
        tree.setLinesVisible(true);
        tree.setHeaderVisible(true);
        managedForm.getToolkit().paintBordersFor(tree);
        
        TreeViewerColumn treeViewerColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
        TreeColumn trclmnName = treeViewerColumn.getColumn();
        trclmnName.setWidth(450);
        trclmnName.setText("name");
        treeViewerColumn.setLabelProvider(new ColumnLabelProvider(){
            public org.eclipse.swt.graphics.Image getImage(Object element) {
                return labelprovider.getImage(element);
            };
            @Override
            public String getText(Object element) {
                return labelprovider.getText(element);
            }
        });
        
        TreeViewerColumn treeViewerColumn_1 = new TreeViewerColumn(treeViewer, SWT.NONE);
        TreeColumn trclmnPage = treeViewerColumn_1.getColumn();
        trclmnPage.setWidth(15);
        trclmnPage.setAlignment(SWT.RIGHT);
        trclmnPage.setText("page");
        treeViewerColumn_1.setLabelProvider(new ColumnLabelProvider(){
            @Override
            public String getText(Object element) {
                if (element instanceof Quelle) {
                    Quelle q = (Quelle)element;
                    return q.getPage();
                }
                return super.getText(element);
            }
        });
        
        layout.setColumnData(trclmnName, new ColumnWeightData(90));
        layout.setColumnData(trclmnPage, new ColumnWeightData(10));
        
        Label lblTheContentOf = managedForm.getToolkit().createLabel(sctnContent, "The content of the sourcebook.", SWT.NONE);
        sctnContent.setDescriptionControl(lblTheContentOf);

        treeViewer.setInput(getObjectsFromSource());

        createFormBuilder(managedForm);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.SOURCE_BOOK__CODE, composite_1);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.SOURCE_BOOK__START_SHR_TIME, composite_1, new DateEntryFactory(toolkit));
        emfFormBuilder.addTextEntry(Shr5Package.Literals.SOURCE_BOOK__END_SHR_TIME, composite_1, new DateEntryFactory(toolkit));

        m_bindingContext = initDataBindings();
        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);
        
         
         
         managedForm.reflow(true);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private List<EObject> getObjectsFromSource() {
        
      List<EObject> a = ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (input instanceof Quelle) {
                    Quelle input2 = (Quelle)input;
                    return object.equals(input2.getSrcBook()) && ( (input2.eContainer() instanceof ShrList)|| (input2.eContainer() instanceof FertigkeitsGruppe));
                }
                return false;
            }
        });
      
      Comparator<Quelle> ca = new  Comparator<Quelle>(){

        @Override
        public int compare(Quelle o1, Quelle o2) {
            if(o1.getPage()!=null){
                int parseInt = Integer.parseInt(o1.getPage());
                if(o2.getPage()!=null)
                    return parseInt -Integer.parseInt(o2.getPage());
                return -1;                
            }
            if(o2.getPage()!=null){
                int parseInt = Integer.parseInt(o2.getPage());
                if(o1.getPage()!=null)
                    return parseInt - Integer.parseInt(o1.getPage());
                return 1;
            }
             return 0;   
        }};
        
    Collections.sort((List )a,ca);
      
      
        return a;
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
