package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage.Literals;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.runtime.GruntRuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.shr5.ecp.binding.PathToImageConverter;
import de.urszeidler.shr5.runtime.ui.widgets.StateMonitorWidget.MonitorType;

/**
 * 
 */

/**
 * @author urs
 */
public class BasicActionPanelWidget extends Composite implements IValueChangeListener {
    private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

    private DataBindingContext m_bindingContext;

    private Composite composite_state = null;
    private Composite composite_info = null;
    private Composite composite_action = null;
    // private ActionPanel actionPanel;
    private ActionPanelWidgets actionPanel = null;
    private Composite composite_name = null;
    private Label label_image = null;
    private Label label = null;
    private Label label_Phase = null;
    private WritableValue phase = new WritableValue();
    private WritableValue character = new WritableValue();
    private WritableValue persona = new WritableValue();

    private Label lblName;

    private StateMonitorWidget stateMonitorWidgetPhysical;
    private StateMonitorWidget stateMonitorWidgetMental;
    private StateMonitorWidget stateMonitorOverdead;

    private Group grpPhysical;
    private Group grpMental;
    private Group grpExra;


    // private ActionPhaseCmd phase1 = GameplayFactory.eINSTANCE.createActionPhaseCmd();

    public BasicActionPanelWidget(Composite parent, int style) {
        super(parent, style);
        initialize();
        m_bindingContext = initDataBindings();
        phase.addValueChangeListener(this);
     }

    private void initialize() {
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);

        GridLayout gridLayout = new GridLayout();
        gridLayout.horizontalSpacing = 2;
        gridLayout.verticalSpacing = 2;
        gridLayout.marginWidth = 2;
        gridLayout.marginHeight = 2;
        gridLayout.numColumns = 3;
        this.setLayout(gridLayout);
        createComposite_state();
        createComposite_info();
        createComposite_action();
    }

    @Override
    public void dispose() {
       phase.removeValueChangeListener(this);
       character.removeValueChangeListener(this);
       persona.removeValueChangeListener(this);
       
       phase.dispose();
       character.dispose();
       persona.dispose();
        super.dispose();
    }
    
    /**
     * This method initializes composite_state
     */
    private void createComposite_state() {
        GridLayout gridLayout4 = new GridLayout();
        gridLayout4.horizontalSpacing = 0;
        gridLayout4.marginWidth = 0;
        gridLayout4.marginHeight = 0;
        gridLayout4.verticalSpacing = 0;
        GridData gridData = new GridData();
        gridData.verticalSpan = 3;
        gridData.verticalAlignment = GridData.FILL;
        gridData.grabExcessVerticalSpace = true;
        gridData.horizontalAlignment = GridData.BEGINNING;
        composite_state = new Composite(this, SWT.NONE);
        toolkit.adapt(composite_state);
        toolkit.paintBordersFor(composite_state);
        
        composite_state.setLayoutData(gridData);
        composite_state.setLayout(gridLayout4);
        
//        if (character.getValue() instanceof GruntRuntimeCharacter) {
//            //GruntRuntimeCharacter grc = (GruntRuntimeCharacter)character.getValue();
//            return;
//        }
        
        grpPhysical = new Group(composite_state, SWT.NONE);
        grpPhysical.setLayout(new FillLayout(SWT.HORIZONTAL));
        grpPhysical.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        grpPhysical.setText("Physical");
        toolkit.adapt(grpPhysical);
        toolkit.paintBordersFor(grpPhysical);
        stateMonitorWidgetPhysical = new StateMonitorWidget(grpPhysical, SWT.NONE);
        stateMonitorWidgetPhysical.setType(MonitorType.physical);
        
        grpMental = new Group(composite_state, SWT.NONE);
        grpMental.setLayout(new FillLayout(SWT.HORIZONTAL));
        grpMental.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        grpMental.setText("Mental");
        toolkit.adapt(grpMental);
        toolkit.paintBordersFor(grpMental);
        stateMonitorWidgetMental = new StateMonitorWidget(grpMental, SWT.NONE);
        stateMonitorWidgetMental.setType(MonitorType.mental);
        
        grpExra = new Group(composite_state, SWT.NONE);
        grpExra.setLayout(new FillLayout(SWT.HORIZONTAL));
        grpExra.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        grpExra.setText("overflow");
        toolkit.adapt(grpExra);
        toolkit.paintBordersFor(grpExra);
        stateMonitorOverdead = new StateMonitorWidget(grpExra, SWT.NONE,3,false);
        stateMonitorOverdead.setType(MonitorType.overflow);
    }

    /**
     * This method initializes composite_info
     */
    private void createComposite_info() {
        GridData gridData6 = new GridData();
        gridData6.heightHint = 32;
        gridData6.widthHint = 32;
        GridLayout gridLayout2 = new GridLayout();
        gridLayout2.verticalSpacing = 0;
        gridLayout2.marginWidth = 0;
        gridLayout2.marginHeight = 0;
        gridLayout2.horizontalSpacing = 0;
        gridLayout2.numColumns = 2;
        GridData gridData1 = new GridData();
        gridData1.horizontalSpan = 2;
        gridData1.verticalAlignment = GridData.CENTER;
        gridData1.grabExcessHorizontalSpace = true;
        gridData1.horizontalAlignment = GridData.FILL;
        composite_info = new Composite(this, SWT.NONE);
        composite_info.setLayoutData(gridData1);
        composite_info.setLayout(gridLayout2);
        toolkit.adapt(composite_info);
        toolkit.paintBordersFor(composite_info);

        
        createComposite_name();

        label_image = new Label(composite_info, SWT.BORDER);
        label_image.setText("image");
        label_image.setLayoutData(gridData6);

    }

    /**
     * This method initializes composite_action
     */
    private void createComposite_action() {
        GridData gridData2 = new GridData();
        gridData2.horizontalAlignment = GridData.FILL;
        gridData2.horizontalSpan = 2;
        gridData2.verticalSpan = 2;
        gridData2.grabExcessHorizontalSpace = true;
        gridData2.grabExcessVerticalSpace = false;
        gridData2.verticalAlignment = SWT.FILL;
        composite_action = new Composite(this, SWT.NONE);
        toolkit.adapt(composite_action);
        toolkit.paintBordersFor(composite_action);

        composite_action.setLayout(new FillLayout(SWT.HORIZONTAL));
        composite_action.setLayoutData(gridData2);

        actionPanel = new ActionPanelWidgets(composite_action, SWT.NONE);
    }

    // /**
    // * This method initializes actionPanel1
    // *
    // */
    // private void createActionPanel1() {
    // GridData gridData4 = new GridData();
    // gridData4.horizontalAlignment = GridData.FILL;
    // gridData4.grabExcessHorizontalSpace = true;
    // gridData4.grabExcessVerticalSpace = true;
    // gridData4.verticalAlignment = GridData.FILL;
    // actionPanel = new ActionPanel(composite_action, SWT.NONE);
    // //actionPanel.setLayoutData(gridData4);
    // }

    /**
     * This method initializes composite_name
     */
    private void createComposite_name() {
        GridLayout gridLayout3 = new GridLayout();
        gridLayout3.verticalSpacing = 2;
        gridLayout3.marginWidth = 2;
        gridLayout3.marginHeight = 2;
        gridLayout3.horizontalSpacing = 2;
        gridLayout3.numColumns = 2;
        GridData gridData5 = new GridData();
        gridData5.horizontalAlignment = GridData.FILL;
        gridData5.grabExcessHorizontalSpace = true;
        gridData5.verticalAlignment = GridData.FILL;
        composite_name = new Composite(composite_info, SWT.NONE);
        toolkit.adapt(composite_name);
        toolkit.paintBordersFor(composite_name);

        composite_name.setLayoutData(gridData5);
        // composite_name.setBackground(new Color(Display.getCurrent(), 85, 235, 231));

        composite_name.setLayout(gridLayout3);
        label = new Label(composite_name, SWT.NONE);
        label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
        label.setText("Phase :");
        // Label filler = new Label(composite_name, SWT.NONE);
        label_Phase = new Label(composite_name, SWT.NONE);
        label_Phase.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        label_Phase.setText("Label");
        // new Label(composite_name, SWT.NONE);

        lblName = new Label(composite_name, SWT.NONE);
        lblName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        lblName.setText("Name");
  
    }

    public Label getLabel_image() {
        return label_image;
    }

    // public Label getLabel_name() {
    // return label_name;
    // }

    public ActionPanelWidgets getActionPanel() {
        return actionPanel;
    }

    // public Label getLabel1() {
    // return label1;
    // }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue observeTextLabelObserveWidget = WidgetProperties.text().observe(label_Phase);
        IObservableValue phase1PhaseObserveValue = EMFObservables.observeDetailValue(bindingContext.getValidationRealm(), phase,
                Literals.PHASE_CMD__PHASE);
        bindingContext.bindValue(observeTextLabelObserveWidget, phase1PhaseObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER),
                new EMFUpdateValueStrategy());
        //
        //

        IWidgetValueProperty image = WidgetProperties.image();
        ISWTObservableValue observedImage = image.observe(label_image);
        IObservableValue observeValue = EMFObservables.observeDetailValue(bindingContext.getValidationRealm(), persona,
                Shr5Package.Literals.BESCHREIBBAR__IMAGE);

        IConverter converter = null;

        converter = new PathToImageConverter(String.class, Image.class, 32);
        UpdateValueStrategy toModel = new UpdateValueStrategy();
        UpdateValueStrategy toWidget = new UpdateValueStrategy().setConverter(converter);
        bindingContext.bindValue(observedImage, observeValue, toModel, toWidget);
        //
        //
        IObservableValue observeTextLabel_nameObserveWidget_1 = WidgetProperties.text().observe(lblName);
        IObservableValue characterNameObserveValue = EMFObservables.observeDetailValue(bindingContext.getValidationRealm(), persona,
                Shr5Package.Literals.BESCHREIBBAR__NAME);
        bindingContext.bindValue(observeTextLabel_nameObserveWidget_1, characterNameObserveValue, new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy());
        //
        if(stateMonitorWidgetMental!=null){
        ISWTObservableValue observe = new DamageStateValueProperty().observe(stateMonitorWidgetMental);
        IObservableValue observeValue1 = EMFObservables.observeDetailValue(bindingContext.getValidationRealm(), character,
                RuntimePackage.Literals.PHYICAL_STATE__MENTAL_DAMAGE);
        bindingContext.bindValue(observe, observeValue1,new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy());

        }
        if(stateMonitorWidgetPhysical!=null){
        ISWTObservableValue observe = new DamageStateValueProperty().observe(stateMonitorWidgetPhysical);
        IObservableValue observeValue1 = EMFObservables.observeDetailValue(bindingContext.getValidationRealm(), character,
                RuntimePackage.Literals.PHYICAL_STATE__PHYSICAL_DAMAGE);
        bindingContext.bindValue(observe, observeValue1, new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy());

        }
        if(stateMonitorOverdead!=null){
        ISWTObservableValue observe = new DamageStateValueProperty().observe(stateMonitorOverdead);
        IObservableValue observeValue1 = EMFObservables.observeDetailValue(bindingContext.getValidationRealm(), character,
                RuntimePackage.Literals.PHYICAL_STATE__OVER_DEAD);
        bindingContext.bindValue(observe, observeValue1, new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy());
        }
       
        
        return bindingContext;
    }

    @Override
    public void handleValueChange(ValueChangeEvent event) {
        Object value = event.getObservableValue().getValue();
        if (value instanceof InitativePass) {
            InitativePass apc = (InitativePass)value;
            AbstraktPersona persona2 = apc.getSubject().getCharacter().getPersona();
            KoerperPersona koerperPersona = (KoerperPersona)persona2;
            stateMonitorWidgetMental.setMaxConditions(koerperPersona.getZustandGeistigMax());
            stateMonitorWidgetPhysical.setMaxConditions(koerperPersona.getZustandKoerperlichMax());
            stateMonitorOverdead.setMaxConditions(koerperPersona.getZustandGrenze());
            grpPhysical.layout(true);
            grpMental.layout(true);
            grpExra.layout(true);
            composite_state.layout(true);
            actionPanel.setCharacter(apc);
            character.setValue(apc.getSubject());
            persona.setValue(persona2);
            
            if (apc.getSubject() instanceof GruntRuntimeCharacter) {
                grpMental.setVisible(false); //stateMonitorWidgetMental.setVisible(false);
            }else
                grpMental.setVisible(true); //stateMonitorWidgetMental.setVisible(true);

        }

    }

    public void setPhase(InitativePass phase1) {
        this.phase.setValue(phase1);
    }
} // @jve:decl-index=0:visual-constraint="10,10"
