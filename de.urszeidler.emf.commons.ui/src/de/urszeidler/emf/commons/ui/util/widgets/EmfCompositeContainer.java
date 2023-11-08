package de.urszeidler.emf.commons.ui.util.widgets;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.list.IListProperty;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.viewers.IViewerObservableList;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.typed.ViewerProperties;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry;

public class EmfCompositeContainer extends Composite {

    private FormToolkit toolkit;
    private ReferenceManager manager;
    private ISelectionChangedListener selectionChangeListener;
    private IBaseLabelProvider labelProvider;
    private EditingDomain editingDomain;
    private FormbuilderEntry entry;
    private EObject object;
    private IDoubleClickListener dblListener;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public EmfCompositeContainer(Composite parent, int style) {
        super(parent, style);
        toolkit = new FormToolkit(Display.getCurrent());

        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });
        createWidget();

    }

    public EmfCompositeContainer(Composite parent, int style, IBaseLabelProvider labelProvider, EditingDomain editingDomain, FormbuilderEntry entry,
            EObject object, ReferenceManager manager, FormToolkit toolkit,IDoubleClickListener dblListner,ISelectionChangedListener changeListner) {
        super(parent, style);
        this.labelProvider = labelProvider;
        this.editingDomain = editingDomain;
        this.entry = entry;
        this.object = object;
        this.toolkit = toolkit;
        this.manager = manager;
        
        this.selectionChangeListener = changeListner;
        this.dblListener = dblListner;

        createWidget();
    }

    private void createWidget() {
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);
        GridLayout gridLayout = new GridLayout(2, false);
        gridLayout.verticalSpacing = 0;
        gridLayout.marginWidth = 0;
        gridLayout.horizontalSpacing = 0;
        gridLayout.marginHeight = 0;
        setLayout(gridLayout);

        final TableViewer treeViewer = new TableViewer(this, SWT.BORDER);
        final Table tree = treeViewer.getTable();
        tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        toolkit.paintBordersFor(tree);
        if (dblListener != null)
            treeViewer.addDoubleClickListener(dblListener);

        
        treeViewer.setLabelProvider(labelProvider);
        ObservableListContentProvider<?> provider = new ObservableListContentProvider();
        treeViewer.setContentProvider(provider);
        if (selectionChangeListener != null)
            treeViewer.addSelectionChangedListener(selectionChangeListener);


        IViewerObservableList<?> uiObs = ViewerProperties.multipleSelection().observe(treeViewer);
        entry.setUiObservable(uiObs);
        IListProperty property = null;
        EStructuralFeature feature = entry.getFeature();
        if (editingDomain != null)
            property = EMFEditProperties.list(editingDomain, feature);
        else
            property = EMFProperties.list(feature);

        IObservableList<?> mObs = property.observe(object);
        entry.setObservable(mObs);
        treeViewer.setInput(mObs);

        Composite btn_composite = toolkit.createComposite(this, SWT.NONE);
        btn_composite.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
        toolkit.paintBordersFor(btn_composite);
        GridLayout gl_btn_composite = new GridLayout(1, false);
        gl_btn_composite.marginHeight = 0;
        gl_btn_composite.horizontalSpacing = 0;
        gl_btn_composite.marginWidth = 0;
        gl_btn_composite.verticalSpacing = 0;
        btn_composite.setLayout(gl_btn_composite);

        boolean create = (feature instanceof EReference) && (((EReference)feature).isContainment());

        if (create) {
            Button button = toolkit.createButton(btn_composite, "", SWT.NONE);
            button.setToolTipText("Add entry");
            button.setImage(ResourceManager.getPluginImage("de.urszeidler.emf.commons.ui", "icons/add.png"));
            button.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent e) {
                    if (manager != null)
                        manager.handleAdd(entry, object);
                    treeViewer.refresh(true);

                }
            });
            button.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));

            Button button_1 = toolkit.createButton(btn_composite, "", SWT.NONE);
            button_1.setToolTipText("remove selected entry");
            button_1.setImage(ResourceManager.getPluginImage("de.urszeidler.emf.commons.ui", "icons/remove.png"));
            button_1.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent e) {
                    if (manager != null)
                        manager.handleRemove(entry, object);
                }
            });
            button_1.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        } else {
            Button button = toolkit.createButton(btn_composite, "", SWT.NONE);
            button.setImage(ResourceManager.getPluginImage("de.urszeidler.emf.commons.ui", "icons/manage.png"));
            button.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent e) {
                    if (manager != null)
                        manager.handleManage(entry, object);
                    treeViewer.refresh(true);
                }
            });
            button.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        }

        // this.pack();
    }
    
    
}
