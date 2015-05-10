package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.eclipse.shr5.Cyberdeck;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry.EntryFactory;
import de.urszeidler.shr5.ecp.editor.widgets.WidgetTools;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

public class CyberdeckWidget extends Composite {

    private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
    private DataBindingContext m_bindingContext;
    private Cyberdeck object;
    private Label lblZugriffbasis;
    private EditingDomain editingDomain;
    private TableViewer treeViewer;
    private EmfFormBuilder emfFormBuilder;
    private EmfFormBuilder emfFormBuilder1;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     * @param editingDomain
     */
    public CyberdeckWidget(Composite parent, int style, Cyberdeck object, EditingDomain editingDomain) {
        super(parent, style);
        this.object = object;
        this.editingDomain = editingDomain;
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
                emfFormBuilder.dispose();
                emfFormBuilder1.dispose();

            }
        });
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);
        EntryFactory labelFactory = WidgetTools.createLabelExtreyFactory(editingDomain);

        emfFormBuilder = new EmfFormBuilder(toolkit, AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil.getInstance()
                .getLabelProvider(), editingDomain);
        emfFormBuilder.setBorderStyle(SWT.NONE);

        emfFormBuilder1 = new EmfFormBuilder(toolkit, AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil.getInstance()
                .getLabelProvider(), editingDomain);
        // emfFormBuilder1.setManager(mananger);
        emfFormBuilder1.setBorderStyle(SWT.NONE);
        if (object.getPan() == null)
            object.setPan(Shr5Factory.eINSTANCE.createPersonalAreaNetwork());

        // composite_runtime.layout(true,true);

        setLayout(new GridLayout(3, false));

        Composite composite_1 = new Composite(this, SWT.NONE);
        composite_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 3, 1));
        toolkit.adapt(composite_1);
        toolkit.paintBordersFor(composite_1);
        composite_1.setLayout(new GridLayout(3, false));

        treeViewer = new TableViewer(composite_1, SWT.BORDER);
        final Table table = treeViewer.getTable();
        table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
        toolkit.paintBordersFor(table);

        Composite composite = toolkit.createComposite(composite_1, SWT.NONE);
        composite.setToolTipText("up");
        composite.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, false, false, 1, 1));
        composite.setLayout(new GridLayout(1, false));
        toolkit.paintBordersFor(composite);

        Button btnUp = toolkit.createButton(composite, "", SWT.NONE);
        btnUp.setToolTipText("up");
        btnUp.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/up.png"));
        btnUp.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                int selectionIndex = table.getSelectionIndex();
                if (selectionIndex > 0)
                    CyberdeckWidget.this.object.getConfiguration().move(selectionIndex - 1, selectionIndex);

                treeViewer.refresh(true);
            }
        });
        Button btnDown = toolkit.createButton(composite, "", SWT.NONE);
        btnDown.setToolTipText("down");
        btnDown.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/down.png"));
        btnDown.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                int selectionIndex = table.getSelectionIndex();
                if (selectionIndex < 3)
                    CyberdeckWidget.this.object.getConfiguration().move(selectionIndex + 1, selectionIndex);
                treeViewer.refresh(true);
            }
        });

        m_bindingContext = initDataBindings();

        emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_ATTRIBUTES__DATENVERARBEITUNG, this, labelFactory);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_ATTRIBUTES__FIREWALL, this, labelFactory);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.ACTIVE_MATIX_DEVICE__ANGRIFF, this, labelFactory);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.ACTIVE_MATIX_DEVICE__SCHLEICHER, this, labelFactory);

        emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_ATTRIBUTES__CURRENT_MODUS, this);
        // new Label(this, SWT.NONE);
        // new Label(this, SWT.NONE);
        // new Label(this, SWT.NONE);

        // emfFormBuilder.addTextEntry(Shr5Package.Literals.CYBERDECK__CONFIGURATION, this);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.CYBERDECK__RUNNING_PROGRAMS, this, WidgetTools.createControllGridData(80));

        emfFormBuilder1.addTextEntry(Shr5Package.Literals.PERSONAL_AREA_NETWORK__SLAVES, this, WidgetTools.createControllGridData(80));
        emfFormBuilder1.addTextEntry(Shr5Package.Literals.PERSONAL_AREA_NETWORK__SLAVE_MAX, this, labelFactory);

        emfFormBuilder.buildinComposite(m_bindingContext, this, object);

        emfFormBuilder1.buildinComposite(m_bindingContext, this, object.getPan());

        lblZugriffbasis = new Label(this, SWT.NONE);
        toolkit.adapt(lblZugriffbasis, true, true);
        lblZugriffbasis.setText("Matrix Zustand");

        new StateMonitorWidget(this, SWT.NONE, object.getMatrixZustandMax(), false);
        new Label(this, SWT.NONE);

    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //

        //
        // EMFEditBeansListObservableFactory treeObservableFactory = new EMFEditBeansListObservableFactory(EAttribute.class, editingDomain,
        // Literals.EMODEL_ELEMENT__EANNOTATIONS);
        // EMFTreeBeanAdvisor treeAdvisor = new EMFTreeBeanAdvisor(null, Literals.EMODEL_ELEMENT__EANNOTATIONS, null);
        // ObservableListTreeContentProvider treeContentProvider = new ObservableListTreeContentProvider(treeObservableFactory, treeAdvisor);

        ObservableListContentProvider listContentProvider = new ObservableListContentProvider();

        IObservableMap[] observeMaps = EMFObservables.observeMaps(listContentProvider.getKnownElements(),
                new EStructuralFeature[]{ Shr5Package.Literals.CYBERDECK__CONFIGURATION });

        treeViewer.setLabelProvider(new ObservableMapLabelProvider(observeMaps) {
            @Override
            public String getColumnText(Object element, int columnIndex) {
                return getText(element);
            }

            @Override
            public String getText(Object element) {
                if (element instanceof EAttribute) {
                    EAttribute ea = (EAttribute)element;
                    Object value = object.eGet(ea);
                    int indexOf = object.getConfiguration().indexOf(ea);
                    String attributeLabel = getAttributeLabel(indexOf);

                    String featureName = ShadowrunEditingTools.toFeatureName(object, ea);
                    return attributeLabel + ": " + value + " " + featureName;
                }
                return super.getText(element);
            }

        });
        treeViewer.setContentProvider(listContentProvider);
        //
        IObservableList objectConfigurationObserveList = EMFEditObservables.observeList(Realm.getDefault(), editingDomain, object,
                Shr5Package.Literals.CYBERDECK__CONFIGURATION);
        treeViewer.setInput(objectConfigurationObserveList);
        //
        return bindingContext;
    }

    protected String getAttributeLabel(int indexOf) {
        switch (indexOf) {
            case 0:
                return ShadowrunEditingTools.toFeatureName(object, Shr5Package.Literals.MATRIX_ATTRIBUTES__FIREWALL);
            case 1:
                return ShadowrunEditingTools.toFeatureName(object, Shr5Package.Literals.MATRIX_ATTRIBUTES__DATENVERARBEITUNG);
            case 2:
                return ShadowrunEditingTools.toFeatureName(object, Shr5Package.Literals.ACTIVE_MATIX_DEVICE__SCHLEICHER);
            case 3:
                return ShadowrunEditingTools.toFeatureName(object, Shr5Package.Literals.ACTIVE_MATIX_DEVICE__ANGRIFF);

            default:
                return "";
        }

    }
}
