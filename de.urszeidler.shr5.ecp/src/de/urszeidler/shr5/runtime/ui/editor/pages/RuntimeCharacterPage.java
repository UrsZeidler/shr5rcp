/**
 * 
 */
package de.urszeidler.shr5.runtime.ui.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.domain.EditingDomain;
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
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage.Literals;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.binding.PathToImageConverter;
import de.urszeidler.shr5.ecp.editor.pages.AbstractShr5Page;
import de.urszeidler.shr5.runtime.ui.widgets.DamageStateValueProperty;
import de.urszeidler.shr5.runtime.ui.widgets.StateMonitorWidget;

/**
 * @author urs
 *
 */
public class RuntimeCharacterPage extends AbstractShr5Page<RuntimeCharacter>  {
    private RuntimeCharacter object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;
    private Label lblName;
    private Label lblImage;
    private StateMonitorWidget stateMonitorWidgetPhysical;
    private StateMonitorWidget stateMonitorWidgetMental;

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

    public RuntimeCharacterPage(FormEditor editor, String id, String title, RuntimeCharacter object, EditingDomain editingDomain, ReferenceManager manager) {
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
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
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
        monitor.setLayout(new GridLayout(2, false));
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

        
        m_bindingContext = initDataBindings();
        AbstraktPersona persona2= object.getCharacter().getPersona();
        stateMonitorWidgetMental.setMaxConditions(((KoerperPersona)persona2).getZustandGeistigMax());
        stateMonitorWidgetPhysical.setMaxConditions(((KoerperPersona)persona2).getZustandKoerperlichMax());

        
        createFormBuilder(managedForm);

        emfFormBuilder.addTextEntry(RuntimePackage.Literals.RUNTIME_CHARACTER__IN_USE, composite_3);
        emfFormBuilder.addSeperatorEntry(composite_3);
        
        emfFormBuilder.addTextEntry(RuntimePackage.Literals.RUNTIME_CHARACTER__ARMOR, composite_3);
        emfFormBuilder.addTextEntry(RuntimePackage.Literals.RUNTIME_CHARACTER__LEFT_HAND, composite_3);
        emfFormBuilder.addTextEntry(RuntimePackage.Literals.RUNTIME_CHARACTER__RIGHT_HAND, composite_3);
        
        
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
        IObservableValue objectNameObserveValue = EMFEditProperties.value(editingDomain, FeaturePath.fromList(Literals.RUNTIME_CHARACTER__CHARACTER, Shr5managementPackage.Literals.MANAGED_CHARACTER__PERSONA, Shr5Package.Literals.BESCHREIBBAR__NAME)).observe(object);
        bindingContext.bindValue(observeTextLblNameObserveWidget, objectNameObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        //
        
        //

        IWidgetValueProperty image = WidgetProperties.image();
        ISWTObservableValue observedImage = image.observe(lblImage);
        IObservableValue observeValue = EMFEditProperties.value(editingDomain, FeaturePath.fromList(Literals.RUNTIME_CHARACTER__CHARACTER, Shr5managementPackage.Literals.MANAGED_CHARACTER__PERSONA, Shr5Package.Literals.BESCHREIBBAR__IMAGE)).observe(object);
                

        IConverter converter = null;

        converter = new PathToImageConverter(String.class, Image.class, 32);
        UpdateValueStrategy toModel = new UpdateValueStrategy();
        UpdateValueStrategy toWidget = new UpdateValueStrategy().setConverter(converter);
        bindingContext.bindValue(observedImage, observeValue, toModel, toWidget);
        //

        if(stateMonitorWidgetMental!=null){
        ISWTObservableValue observe = new DamageStateValueProperty().observe(stateMonitorWidgetMental);
        IObservableValue observeValue1 = EMFObservables.observeValue(bindingContext.getValidationRealm(), object,
                RuntimePackage.Literals.PHYICAL_STATE__MENTAL_DAMAGE);
        bindingContext.bindValue(observe, observeValue1, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());

        }
        if(stateMonitorWidgetPhysical!=null){
        ISWTObservableValue observe = new DamageStateValueProperty().observe(stateMonitorWidgetPhysical);
        IObservableValue observeValue1 = EMFObservables.observeValue(bindingContext.getValidationRealm(), object,
                RuntimePackage.Literals.PHYICAL_STATE__PHYSICAL_DAMAGE);
        bindingContext.bindValue(observe, observeValue1, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());

        }

        return bindingContext;
    }
}
