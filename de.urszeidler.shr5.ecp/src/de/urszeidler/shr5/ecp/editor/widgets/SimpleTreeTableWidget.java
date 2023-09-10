package de.urszeidler.shr5.ecp.editor.widgets;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.property.list.IListProperty;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.databinding.viewers.IViewerObservableList;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.databinding.viewers.typed.ViewerProperties;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.rcp.databinding.EMFBeansListObservableFactory;
import org.eclipse.wb.rcp.databinding.EMFTreeObservableLabelProvider;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry;

public class SimpleTreeTableWidget extends Composite {

    private FormToolkit toolkit;// = new FormToolkit(Display.getCurrent());

    private EObject object;
    private EStructuralFeature feature;
    private EditingDomain editingDomain;
    private ISelectionChangedListener selectionChangeListener;
    private IDoubleClickListener dblListener;

    private IObservableList objectList;

    private IViewerObservableList selectionObserver;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public SimpleTreeTableWidget(Composite parent, int style) {
        super(parent, style);
        toolkit = new FormToolkit(Display.getCurrent());
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });

        createWidgets();

    }

    public SimpleTreeTableWidget(Composite parent, String titel, int style, EObject object, EReference modifizierbarMods, FormToolkit toolkit,
            ReferenceManager mananger, EditingDomain editingDomain, IDoubleClickListener dblListner) {
        super(parent, style);
        this.toolkit = toolkit;
        this.object = object;
        this.feature = modifizierbarMods;
        this.editingDomain = editingDomain;
        this.dblListener = dblListner;

        createWidgets();
    }


    public SimpleTreeTableWidget(Composite parent, String titel, int style, EObject object, EReference modifizierbarMods, FormToolkit toolkit,
            ReferenceManager mananger, EditingDomain editingDomain, ISelectionChangedListener selectionChangeListener, IDoubleClickListener dblListner) {
        super(parent, style);
        this.toolkit = toolkit;
        this.object = object;
        this.feature = modifizierbarMods;
        this.editingDomain = editingDomain;
        this.selectionChangeListener = selectionChangeListener;
        this.dblListener = dblListner;

        createWidgets();
    }

    private void createWidgets() {
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);

        setLayout(new FillLayout(SWT.HORIZONTAL));

 
        Composite composite = new Composite(this, SWT.NONE);
        toolkit.adapt(composite);
        toolkit.paintBordersFor(composite);

        composite.setLayout(new TreeColumnLayout());

        final TreeViewer treeViewer = new TreeViewer(composite, SWT.BORDER | SWT.MULTI);
        if (selectionChangeListener != null)
            treeViewer.addSelectionChangedListener(selectionChangeListener);
        if (dblListener != null)
            treeViewer.addDoubleClickListener(dblListener);
        Tree tree = treeViewer.getTree();
        tree.setLinesVisible(true);
        toolkit.paintBordersFor(tree);
        tree.setToolTipText(toTooltipName());


        EMFBeansListObservableFactory treeObservableFactory = new EMFBeansListObservableFactory(object.getClass(), feature);
        ObservableListTreeContentProvider treeContentProvider = new ObservableListTreeContentProvider(treeObservableFactory, null);

        EStructuralFeature nameFeature = null;
        EStructuralFeature imageFeature = null;

        EClassifier eType = feature.getEType();
        if (eType instanceof EClass) {
            EClass ec = (EClass)eType;
            if (ec.getEAllSuperTypes().contains(Shr5Package.Literals.BESCHREIBBAR)) {
                nameFeature = Shr5Package.Literals.BESCHREIBBAR__NAME;
                imageFeature = Shr5Package.Literals.BESCHREIBBAR__IMAGE;
            } else if (ec.equals(Shr5Package.Literals.ATTRIBUT_MODIFIKATOR_WERT)) {
                nameFeature = Shr5Package.Literals.ATTRIBUT_MODIFIKATOR_WERT__WERT;
            }
        }

        treeViewer.setLabelProvider(new EMFTreeObservableLabelProvider(treeContentProvider.getKnownElements(), nameFeature, imageFeature) {
            @Override
            public String getText(Object element) {
                return AdapterFactoryUtil.getInstance().getLabelProvider().getText(element);
            }

            @Override
            public Image getImage(Object element) {
                return AdapterFactoryUtil.getInstance().getLabelProvider().getImage(element);
            }

        });

        treeViewer.setContentProvider(treeContentProvider);
        selectionObserver = ViewerProperties.multipleSelection().observe(treeViewer);

         IListProperty property = null;
        if (editingDomain != null)
            property = EMFEditProperties.list(editingDomain, feature);
        else
            property = EMFProperties.list(feature);

        objectList = property.observe(object);
        treeViewer.setInput(objectList);
        final FormbuilderEntry e1 = new FormbuilderEntry(null, feature, null, null);
        e1.setObservable(objectList);
        e1.setUiObservable(selectionObserver);
    }

    /**
     * Removes the selected elements.
     */
    public void removeSelectedElement() {
        ISelection selection = selectionObserver.getViewer().getSelection();
        if (selection instanceof StructuredSelection) {
            StructuredSelection ss = (StructuredSelection)selection;
            for (Object object : ShadowrunTools.toIterable(ss.iterator())) {
                objectList.remove(object);
            } 
        }
    }
    
    /**
     * Get the tooltip.
     * 
     * @param e
     * @param object
     * @return
     */
    private String toTooltipName() {
        IItemPropertyDescriptor propertyDescriptor = AdapterFactoryUtil.getInstance().getItemDelegator().getPropertyDescriptor(object, feature);
        if (propertyDescriptor == null)
            return AdapterFactoryUtil.getInstance().getItemDelegator().getText(feature);

        String displayName = propertyDescriptor.getDescription(feature);
        return displayName;
    }

}
