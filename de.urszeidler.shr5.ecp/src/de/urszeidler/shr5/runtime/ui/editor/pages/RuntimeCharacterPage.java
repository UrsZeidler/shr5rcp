/**
 * 
 */
package de.urszeidler.shr5.runtime.ui.editor.pages;

import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayAdapterFactory;
import de.urszeidler.eclipse.shr5.runtime.ExtendetData;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage.Literals;
import de.urszeidler.eclipse.shr5.runtime.util.RuntimeAdapterFactory;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementAdapterFactory;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.binding.PathToImageConverter;
import de.urszeidler.shr5.ecp.editor.actions.OpenCharacterByRuntimeEditorAction;
import de.urszeidler.shr5.ecp.editor.pages.AbstractShr5Page;
import de.urszeidler.shr5.runtime.ui.widgets.DamageStateValueProperty;
import de.urszeidler.shr5.runtime.ui.widgets.StateMonitorWidget;

/**
 * @author urs
 */
public class RuntimeCharacterPage extends AbstractShr5Page<RuntimeCharacter> {
    private RuntimeCharacter object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;
    private Label lblName;
    private Label lblImage;
    private StateMonitorWidget stateMonitorWidgetPhysical;
    private StateMonitorWidget stateMonitorWidgetMental;
    private StateMonitorWidget stateMonitorWidgetOverDead;
    private AdapterFactoryContentProvider actionListContentProvider;
    private ComposedAdapterFactory adapterFactory;
    private AdapterFactoryItemDelegator itemDelegator;
//    private Text formText;
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
    public RuntimeCharacterPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        this.object = RuntimeFactory.eINSTANCE.createRuntimeCharacter();
    }

    public RuntimeCharacterPage(FormEditor editor, String id, String title, RuntimeCharacter object, EditingDomain editingDomain,
            ReferenceManager manager) {
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
        adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
        adapterFactory.addAdapterFactory(new GameplayAdapterFactory());
        adapterFactory.addAdapterFactory(new RuntimeAdapterFactory());
        adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
        // adapterFactory.addAdapterFactory(new ExtendedShadowrunAdapterFactory());
        adapterFactory.addAdapterFactory(new Shr5managementAdapterFactory());
        adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
        itemDelegator = new AdapterFactoryItemDelegator(adapterFactory);
        actionListContentProvider = new AdapterFactoryContentProvider(adapterFactory);
        
        
        FormToolkit toolkit = managedForm.getToolkit();
        ScrolledForm form = managedForm.getForm();
        Composite body = form.getBody();
        
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        form.getToolBarManager().add(new OpenCharacterByRuntimeEditorAction(object));
        form.getToolBarManager().update(true);
        
        
        LabelProvider labelProvider = AdapterFactoryUtil.getInstance().getLabelProvider();
        form.setText(labelProvider.getText(object));
        {
            managedForm.getForm().getBody().setLayout(new TableWrapLayout());
        }

        Composite composite = managedForm.getToolkit().createComposite(managedForm.getForm().getBody(), SWT.NONE);
        composite.setLayout(new GridLayout(2, false));
        composite.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP, 1, 1));
        managedForm.getToolkit().paintBordersFor(composite);

        lblImage = managedForm.getToolkit().createLabel(composite, "image", SWT.NONE);
        GridData gd_lblImage = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_lblImage.heightHint = 32;
        gd_lblImage.widthHint = 32;
        lblImage.setLayoutData(gd_lblImage);

        lblName = managedForm.getToolkit().createLabel(composite, "name", SWT.NONE);

        Composite composite_1 = managedForm.getToolkit().createComposite(managedForm.getForm().getBody(), SWT.NONE);
        composite_1.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP, 1, 1));
        managedForm.getToolkit().paintBordersFor(composite_1);
        {
            TableWrapLayout twl_composite_1 = new TableWrapLayout();
            twl_composite_1.numColumns = 2;
            composite_1.setLayout(twl_composite_1);
        }

        Composite composite_3 = managedForm.getToolkit().createComposite(composite_1, SWT.NONE);
        composite_3.setLayout(new GridLayout(3, false));
        composite_3.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP, 1, 1));
        managedForm.getToolkit().paintBordersFor(composite_3);

        Composite monitor = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        monitor.setLayout(new GridLayout(4, false));
        monitor.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP, 1, 1));
        managedForm.getToolkit().adapt(monitor);
        managedForm.getToolkit().paintBordersFor(monitor);

        Group grpPhysical = new Group(monitor, SWT.NONE);
        grpPhysical.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
        grpPhysical.setText("Physical");
        managedForm.getToolkit().adapt(grpPhysical);
        managedForm.getToolkit().paintBordersFor(grpPhysical);
        grpPhysical.setLayout(new FillLayout(SWT.HORIZONTAL));

        stateMonitorWidgetPhysical = new StateMonitorWidget(grpPhysical, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(stateMonitorWidgetPhysical);

        Group grpMental = new Group(monitor, SWT.NONE);
        grpMental.setLayout(new FillLayout(SWT.HORIZONTAL));
        grpMental.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
        grpMental.setText("Mental");
        managedForm.getToolkit().adapt(grpMental);
        managedForm.getToolkit().paintBordersFor(grpMental);

        stateMonitorWidgetMental = new StateMonitorWidget(grpMental, SWT.NONE);
        managedForm.getToolkit().paintBordersFor(stateMonitorWidgetMental);
        
        
        Group grpOverDead = new Group(monitor, SWT.NONE);
        grpOverDead.setLayout(new FillLayout(SWT.HORIZONTAL));
        grpOverDead.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
        grpOverDead.setText("Overdead");
        managedForm.getToolkit().adapt(grpOverDead);
        managedForm.getToolkit().paintBordersFor(grpOverDead);

        stateMonitorWidgetOverDead = new StateMonitorWidget(grpOverDead, SWT.NONE,3,false);

        if (object != null && object.getCharacter() != null && object.getCharacter().getPersona() != null) {
            AbstraktPersona persona2 = object.getCharacter().getPersona();
            KoerperPersona koerperPersona = (KoerperPersona)persona2;
            stateMonitorWidgetMental.setMaxConditions(koerperPersona.getZustandGeistigMax());
            stateMonitorWidgetPhysical.setMaxConditions(koerperPersona.getZustandKoerperlichMax());
            stateMonitorWidgetOverDead.setMaxConditions(koerperPersona.getZustandGrenze());
        }
        
        Group grpState = new Group(monitor, SWT.NONE);
        grpState.setLayout(new GridLayout(3, false));
        grpState.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
        grpState.setText("State");
        managedForm.getToolkit().adapt(grpState);
        managedForm.getToolkit().paintBordersFor(grpState);

        ToolBarManager extendetDataToolbar = new ToolBarManager(SWT.HORIZONTAL);
        Set<Entry<ExtendetData, Object>> entrySet = object.getExtendetData().entrySet();
        for (Entry<ExtendetData, Object> entry : entrySet) {
            ExtendetData key = entry.getKey();
            if (key.getEObject() != null) {
                extendetDataToolbar.add(new Action(labelProvider.getText(key.getEObject()) + " " + labelProvider.getText(key.getEFeature()) + "  "
                        + entry.getValue()) {
                });
            }
        }
        ToolBar toolbar = extendetDataToolbar.createControl(managedForm.getForm().getBody());
        managedForm.getToolkit().adapt(toolbar);
        managedForm.getToolkit().paintBordersFor(toolbar);
        
        
//        formText = managedForm.getToolkit().createText(managedForm.getForm().getBody(), "",SWT.MULTI);
//        formText.setEditable(false);
//        TableWrapData twd_formText = new TableWrapData(TableWrapData.FILL, TableWrapData.FILL_GRAB, 5, 1);
//        twd_formText.heightHint = 74;
//        formText.setLayoutData(twd_formText);

        
        Composite composite_2 = new Composite(managedForm.getForm().getBody(), SWT.NONE);
        TableWrapData twd_composite_2 = new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB, 1, 1);
        twd_composite_2.heightHint = 142;
        composite_2.setLayoutData(twd_composite_2);
        managedForm.getToolkit().adapt(composite_2);
        managedForm.getToolkit().paintBordersFor(composite_2);
        composite_2.setLayout(new GridLayout(1, false));
        

        
        
        m_bindingContext = initDataBindings();

        createFormBuilder(managedForm);
        GridData controlGridData = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 3);
        controlGridData.heightHint = 150;

        emfFormBuilder.addTextEntry(RuntimePackage.Literals.RUNTIME_CHARACTER__IN_USE, composite_3,controlGridData);
        emfFormBuilder.addSeperatorEntry(composite_3);

        emfFormBuilder.addTextEntry(RuntimePackage.Literals.RUNTIME_CHARACTER__ARMOR, composite_3);
        emfFormBuilder.addTextEntry(RuntimePackage.Literals.RUNTIME_CHARACTER__LEFT_HAND, composite_3);
        emfFormBuilder.addTextEntry(RuntimePackage.Literals.RUNTIME_CHARACTER__RIGHT_HAND, composite_3);
        // emfFormBuilder.addSeperatorEntry(composite_3);
        emfFormBuilder.addTextEntry(RuntimePackage.Literals.RUNTIME_CHARACTER__USED_EDGE, grpState);
        emfFormBuilder.addTextEntry(RuntimePackage.Literals.PHYICAL_STATE__ZUSTAND, grpState);
        
        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);
           

        managedForm.reflow(true);
    }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue observeTextLblNameObserveWidget = WidgetProperties.text().observe(lblName);
        IObservableValue objectNameObserveValue = EMFEditProperties.value(
                editingDomain,
                FeaturePath.fromList(Literals.RUNTIME_CHARACTER__CHARACTER, Shr5managementPackage.Literals.MANAGED_CHARACTER__PERSONA,
                        Shr5Package.Literals.BESCHREIBBAR__NAME)).observe(object);
        bindingContext.bindValue(observeTextLblNameObserveWidget, objectNameObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER),
                new EMFUpdateValueStrategy());
        //
//        IObservableValue observeTextObserveWidget = WidgetProperties.text().observe(formText);
//        IObservableValue objectExtendetObserveValue = EMFEditProperties.value(
//                editingDomain,
//                FeaturePath.fromList(Literals.EXTENDET_DATA_AWARE__EXTENDET_DATA)).observe(object);
//        bindingContext.bindValue(observeTextObserveWidget, objectExtendetObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER),
//                new EMFUpdateValueStrategy(){
//            @Override
//            public Object convert(Object value) {
//                return value.toString();
//                //return super.convert(value);
//            }
//            
//        });

        //

        IWidgetValueProperty image = WidgetProperties.image();
        ISWTObservableValue observedImage = image.observe(lblImage);
        IObservableValue observeValue = EMFEditProperties.value(
                editingDomain,
                FeaturePath.fromList(Literals.RUNTIME_CHARACTER__CHARACTER, Shr5managementPackage.Literals.MANAGED_CHARACTER__PERSONA,
                        Shr5Package.Literals.BESCHREIBBAR__IMAGE)).observe(object);

        IConverter converter = null;

        converter = new PathToImageConverter(String.class, Image.class, 32);
        UpdateValueStrategy toModel = new UpdateValueStrategy();
        UpdateValueStrategy toWidget = new UpdateValueStrategy().setConverter(converter);
        bindingContext.bindValue(observedImage, observeValue, toModel, toWidget);
        //

        if (stateMonitorWidgetMental != null) {
            ISWTObservableValue observe = new DamageStateValueProperty().observe(stateMonitorWidgetMental);
            IObservableValue observeValue1 = EMFObservables.observeValue(bindingContext.getValidationRealm(), object,
                    RuntimePackage.Literals.PHYICAL_STATE__MENTAL_DAMAGE);
            bindingContext.bindValue(observe, observeValue1, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        }
        if (stateMonitorWidgetPhysical != null) {
            ISWTObservableValue observe = new DamageStateValueProperty().observe(stateMonitorWidgetPhysical);
            IObservableValue observeValue1 = EMFObservables.observeValue(bindingContext.getValidationRealm(), object,
                    RuntimePackage.Literals.PHYICAL_STATE__PHYSICAL_DAMAGE);
            bindingContext.bindValue(observe, observeValue1, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        }
        if (stateMonitorWidgetOverDead != null) {
            ISWTObservableValue observe = new DamageStateValueProperty().observe(stateMonitorWidgetOverDead);
            IObservableValue observeValue1 = EMFObservables.observeValue(bindingContext.getValidationRealm(), object,
                    RuntimePackage.Literals.PHYICAL_STATE__OVER_DEAD);
            bindingContext.bindValue(observe, observeValue1, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        }

        return bindingContext;
    }
}
