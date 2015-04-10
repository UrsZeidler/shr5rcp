package de.urszeidler.shr5.ecp.editor.widgets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.rcp.databinding.EMFBeansListObservableFactory;
import org.eclipse.wb.rcp.databinding.EMFTreeObservableLabelProvider;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry;
import de.urszeidler.shr5.ecp.editor.pages.Messages;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

public class TreeTableWidget extends Composite {

    private ReferenceManager manager;
    private FormToolkit toolkit;// = new FormToolkit(Display.getCurrent());

    private EObject object;
    private EStructuralFeature feature;
    private EditingDomain editingDomain;
    private String titel;
    private ISelectionChangedListener selectionChangeListener;
    private IDoubleClickListener dblListener;
    // TODO: an enum for the editing state when we want only delete or only add for example
    private boolean readOnly = false;
    private ToolBar optionalToolbar;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public TreeTableWidget(Composite parent, int style) {
        super(parent, style);
        toolkit = new FormToolkit(Display.getCurrent());
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });

        createWidgets();

    }

    public TreeTableWidget(Composite parent, String titel, int style, EObject object, EReference modifizierbarMods, FormToolkit toolkit,
            ReferenceManager mananger, EditingDomain editingDomain, IDoubleClickListener dblListner) {
        super(parent, style);
        this.toolkit = toolkit;
        this.object = object;
        this.feature = modifizierbarMods;
        this.manager = mananger;
        this.editingDomain = editingDomain;
        this.titel = titel;
        this.dblListener = dblListner;

        createWidgets();
    }

    public TreeTableWidget(Composite parent, String titel, int style, EObject object, EReference modifizierbarMods, FormToolkit toolkit,
            ReferenceManager mananger, EditingDomain editingDomain, IDoubleClickListener dblListner, boolean readOnly) {
        super(parent, style);
        this.toolkit = toolkit;
        this.object = object;
        this.feature = modifizierbarMods;
        this.manager = mananger;
        this.editingDomain = editingDomain;
        this.titel = titel;
        this.dblListener = dblListner;
        this.readOnly = readOnly;

        createWidgets();
    }

    public TreeTableWidget(Composite parent, String titel, int style, EObject object, EReference modifizierbarMods, FormToolkit toolkit,
            ReferenceManager mananger, EditingDomain editingDomain, ISelectionChangedListener selectionChangeListener, IDoubleClickListener dblListner) {
        super(parent, style);
        this.toolkit = toolkit;
        this.object = object;
        this.feature = modifizierbarMods;
        this.manager = mananger;
        this.editingDomain = editingDomain;
        this.titel = titel;
        this.selectionChangeListener = selectionChangeListener;
        this.dblListener = dblListner;

        createWidgets();
    }

    public TreeTableWidget(Composite parent, String titel, int style, EObject object, EReference modifizierbarMods, FormToolkit toolkit,
            ReferenceManager mananger, EditingDomain editingDomain, ISelectionChangedListener selectionChangeListener,
            IDoubleClickListener dblListner, boolean readOnly) {
        super(parent, style);
        this.toolkit = toolkit;
        this.object = object;
        this.feature = modifizierbarMods;
        this.manager = mananger;
        this.editingDomain = editingDomain;
        this.titel = titel;
        this.selectionChangeListener = selectionChangeListener;
        this.dblListener = dblListner;
        this.readOnly = readOnly;
        createWidgets();
    }

    private void createWidgets() {
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);

        setLayout(new FillLayout(SWT.HORIZONTAL));

        Section sctnNewSection = toolkit.createSection(this, Section.EXPANDED | Section.TWISTIE | Section.TITLE_BAR);
        toolkit.paintBordersFor(sctnNewSection);
        sctnNewSection.setText(titel);
        sctnNewSection.setExpanded(true);

        Composite composite = new Composite(sctnNewSection, SWT.NONE);
        toolkit.adapt(composite);
        toolkit.paintBordersFor(composite);
        sctnNewSection.setClient(composite);

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

        ToolBar toolBar = new ToolBar(sctnNewSection, SWT.FLAT | SWT.RIGHT);
        toolkit.adapt(toolBar);
        toolkit.paintBordersFor(toolBar);
        sctnNewSection.setDescriptionControl(toolBar);
        toolBar.setVisible(!readOnly);

        ToolItem tltmNewItem = new ToolItem(toolBar, SWT.NONE);
        tltmNewItem.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/addButton.png"));
        tltmNewItem.setText(Messages.TreeTableWidget_add_element);
        tltmNewItem.setToolTipText(String.format(Messages.TreeTableWidget_add_element_tooltip, AdapterFactoryUtil.getInstance().getLabelProvider()
                .getText(feature.getEType()), AdapterFactoryUtil.getInstance().getLabelProvider().getText(feature)));

        ToolItem tltmNewItem_1 = new ToolItem(toolBar, SWT.NONE);
        tltmNewItem_1.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/removeButton.png"));
        tltmNewItem_1.setText(Messages.TreeTableWidget_remove_element);
        tltmNewItem_1.setToolTipText(Messages.TreeTableWidget_remove_element_tooltip);

        EMFBeansListObservableFactory treeObservableFactory = new EMFBeansListObservableFactory(object.getClass(), feature);
        ObservableListTreeContentProvider treeContentProvider = new ObservableListTreeContentProvider(treeObservableFactory, null);

        EStructuralFeature imageFeature = null;

        EClassifier eType = feature.getEType();
        List<EStructuralFeature> featureList = new ArrayList<EStructuralFeature>();
        if (eType instanceof EClass) {
            EClass ec = (EClass)eType;
            if (ec.getEAllSuperTypes().contains(Shr5Package.Literals.BESCHREIBBAR)) {
                imageFeature = Shr5Package.Literals.BESCHREIBBAR__IMAGE;
            }

            Collection<EClass> provideNewClassTypes = ShadowrunEditingTools.provideNewClassTypes(object, feature, editingDomain);
            for (EClass eClass : provideNewClassTypes) {
                featureList.addAll(eClass.getEAllStructuralFeatures());
            }
        }
        treeViewer.setLabelProvider(new EMFTreeObservableLabelProvider(treeContentProvider.getKnownElements(), imageFeature, featureList) {
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
        IViewerObservableList uiObs = ViewersObservables.observeMultiSelection(treeViewer);

        optionalToolbar = new ToolBar(sctnNewSection, SWT.FLAT | SWT.RIGHT);
        // toolkit.adapt(optionalToolbar);
        // toolkit.paintBordersFor(optionalToolbar);
        optionalToolbar.setVisible(false);
        sctnNewSection.setTextClient(optionalToolbar);
        IListProperty property = null;
        if (editingDomain != null)
            property = EMFEditProperties.list(editingDomain, feature);
        else
            property = EMFProperties.list(feature);

        IObservableList mObs = property.observe(object);
        treeViewer.setInput(mObs);
        final FormbuilderEntry e1 = new FormbuilderEntry(null, feature, null, null);
        e1.setObservable(mObs);
        e1.setUiObservable(uiObs);
        tltmNewItem.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (manager != null) {
                    manager.handleAdd(e1, object);
                }
            }
        });

        tltmNewItem_1.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                manager.handleRemove(e1, object);
            }
        });
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

    public ToolBar getOptionalToolbar() {
        return optionalToolbar;
    }

}
