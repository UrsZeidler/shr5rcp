package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5.RiggerCommandConsole;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Shr5Package.Literals;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;

public class RiggerCommandConsoleWidget extends Composite {

    private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
    private DataBindingContext m_bindingContext;
    private RiggerCommandConsole object;
    private Label lblZugriffbasis;
    private Scale scale;
    private Label label;
    private EditingDomain editingDomain;
    private Label lblZugriffbasis1;
    private StateMonitorWidget stateMonitorWidget;
    
    /**
     * Create the composite.
     * @param parent
     * @param style
     * @param editingDomain 
     */
    public RiggerCommandConsoleWidget(Composite parent, int style,RiggerCommandConsole object, EditingDomain editingDomain) {
        super(parent, style);
        this.object = object;
        this.editingDomain = editingDomain;
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);
        EmfFormBuilder emfFormBuilder = new EmfFormBuilder(toolkit, AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil
                .getInstance().getLabelProvider(), editingDomain);
        emfFormBuilder.setBorderStyle(SWT.NONE);

        EmfFormBuilder emfFormBuilder1 = new EmfFormBuilder(toolkit, AdapterFactoryUtil.getInstance().getItemDelegator(), AdapterFactoryUtil
                .getInstance().getLabelProvider(), editingDomain);
//        emfFormBuilder1.setManager(mananger);
        emfFormBuilder1.setBorderStyle(SWT.NONE);
        if(object.getPan()==null)
            object.setPan(Shr5Factory.eINSTANCE.createPersonalAreaNetwork());

        
//        composite_runtime.layout(true,true);

        
        setLayout(new GridLayout(3, false));
        
        lblZugriffbasis = new Label(this, SWT.NONE);
        toolkit.adapt(lblZugriffbasis, true, true);
        lblZugriffbasis.setText("ZugriffBasis");
        
        scale = new Scale(this, SWT.NONE);
        GridData gd_scale = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_scale.widthHint = 103;
        scale.setLayoutData(gd_scale);
        toolkit.adapt(scale, true, true);
        
        label = toolkit.createLabel(this, " ", SWT.NONE);
        
        m_bindingContext = initDataBindings();
        
        emfFormBuilder.addTextEntry(Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__ZUGRIFF,this);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__RAUSCHUNTERDRUECKUNG,this);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_ATTRIBUTES__DATENVERARBEITUNG,this);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_ATTRIBUTES__FIREWALL,this);        
        emfFormBuilder.addTextEntry(Shr5Package.Literals.MATRIX_ATTRIBUTES__CURRENT_MODUS,this);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__RUNNING_PROGRAMS, this);

        emfFormBuilder1.addTextEntry(Shr5Package.Literals.PERSONAL_AREA_NETWORK__SLAVES, this);
        emfFormBuilder1.addTextEntry(Shr5Package.Literals.PERSONAL_AREA_NETWORK__SLAVE_MAX, this);

        emfFormBuilder.buildinComposite(m_bindingContext, this, object);
        emfFormBuilder1.buildinComposite(m_bindingContext, this,object.getPan());
        
        lblZugriffbasis1 = new Label(this, SWT.NONE);
        toolkit.adapt(lblZugriffbasis1, true, true);
        lblZugriffbasis1.setText("Matrix Zustand");

        stateMonitorWidget = new StateMonitorWidget(this, SWT.NONE, object.getMatrixZustandMax(), false);

    }
    
    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue observeSelectionScaleObserveWidget = WidgetProperties.selection().observe(scale);
        IObservableValue objectZugriffBasisObserveValue = EMFObservables.observeValue(object, Literals.RIGGER_COMMAND_CONSOLE__ZUGRIFF_BASIS);
        bindingContext.bindValue(observeSelectionScaleObserveWidget, objectZugriffBasisObserveValue, new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy());
        //
        IObservableValue observeMaxScaleObserveWidget = WidgetProperties.maximum().observe(scale);
        IObservableValue objectDeviceRatingObserveValue = EMFObservables.observeValue(object, Literals.ABSTRACT_MATRIX_DEVICE__DEVICE_RATING);
        bindingContext.bindValue(observeMaxScaleObserveWidget, objectDeviceRatingObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        //
        return bindingContext;
    }
}
