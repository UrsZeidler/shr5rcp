/**
 * 
 */
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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Shr5Package.Literals;
import de.urszeidler.shr5.ecp.binding.PathToImageConverter;

/**
 * @author urs
 */
public abstract class NameableComposite extends Composite implements IValueChangeListener {
    private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

    protected DataBindingContext m_bindingContext;

    protected WritableValue nameable = new WritableValue();
    // private Beschreibbar character = Shr5Factory.eINSTANCE.createBioWare();

    private Group mainGroup = null;
    private Label label_image = null;
    private Label label_name = null;
    private Button button_use = null;
    private Button button_use1 = null;
    private Button button_change = null;
    private String grouname;
    protected ToolBar actionBar;
    protected GridLayout gridLayout1;

    public NameableComposite(Composite parent, int style, String groupName) {
        super(parent, style);
        this.grouname = groupName;
        nameable.addValueChangeListener(this);
        initialize();
    }

    private void initialize() {
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
               
            }
        });
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);

        
        gridLayout1 = new GridLayout();
        gridLayout1.marginWidth = 1;
        gridLayout1.marginHeight = 0;
        gridLayout1.marginTop = 0;
        gridLayout1.marginBottom = 2;
        gridLayout1.horizontalSpacing = 0;
        gridLayout1.verticalSpacing = 0;
        createMainGroup();
        this.setLayout(gridLayout1);
        this.pack();

    }

    /**
     * This method initializes mainGroup
     */
    private void createMainGroup() {
        GridData gridData3 = new GridData();
        gridData3.widthHint = 300;
        gridData3.minimumWidth = 20;
        gridData3.verticalAlignment = GridData.CENTER;
        gridData3.grabExcessHorizontalSpace = true;
        gridData3.horizontalAlignment = SWT.LEFT;
        GridLayout gridLayout = new GridLayout();
        gridLayout.marginHeight = 2;
        gridLayout.marginWidth = 2;
        gridLayout.numColumns = 3;
        gridLayout.verticalSpacing = 0;
        gridLayout.horizontalSpacing = 0;
        GridData gridData2 = new GridData();
        gridData2.heightHint = 24;
        gridData2.widthHint = 24;
        GridData gridData = new GridData();
        gridData.widthHint = 193;
        gridData.horizontalAlignment = GridData.FILL;
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = false;
        gridData.verticalAlignment = GridData.FILL;
        mainGroup = new Group(this, SWT.NONE);
        toolkit.adapt(mainGroup);
        toolkit.paintBordersFor(mainGroup);


        mainGroup.setText(grouname);
        mainGroup.setLayout(gridLayout);
        mainGroup.setLayoutData(gridData);
        label_image = toolkit.createLabel(mainGroup, "",SWT.BORDER);
        label_image.setLayoutData(gridData2);
        label_name = toolkit.createLabel(mainGroup,"", SWT.NONE);
        label_name.setAlignment(SWT.LEFT);
        label_name.setLayoutData(gridData3);

        createActionbar();
        
        
       updateToolbar();
        // ToolItem toolItem = new ToolItem(actionBar, SWT.NONE);
        // toolItem.setText("1");
        //
        // ToolItem toolItem_1 = new ToolItem(actionBar, SWT.NONE);
        // toolItem_1.setText("2");
        m_bindingContext = initDataBindings();
    }

    protected void createActionbar() {
        actionBar = new ToolBar(mainGroup, SWT.BORDER | SWT.FLAT);
        toolkit.adapt(actionBar);
        toolkit.paintBordersFor(actionBar);
//        mainGroup.layout(true);
    }

    public Button getButton_change() {
        return button_change;
    }

    public Button getButton_use() {
        return button_use;
    }

    public Button getButton_use1() {
        return button_use1;
    }

    public Label getLabel_image() {
        return label_image;
    }

    public Label getLabel_name() {
        return label_name;
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue observeTextLabel_nameObserveWidget_1 = WidgetProperties.text().observe(label_name);
        IObservableValue characterNameObserveValue = EMFObservables.observeDetailValue(bindingContext.getValidationRealm(), nameable,
                Literals.BESCHREIBBAR__NAME);
        bindingContext.bindValue(observeTextLabel_nameObserveWidget_1, characterNameObserveValue, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        //

        IWidgetValueProperty image = WidgetProperties.image();
        ISWTObservableValue observedImage = image.observe(label_image);
        IObservableValue observeValue = EMFObservables.observeDetailValue(bindingContext.getValidationRealm(), nameable,
                Shr5Package.Literals.BESCHREIBBAR__IMAGE);

        IConverter converter = null;

        converter = new PathToImageConverter(String.class, Image.class, 24);
        UpdateValueStrategy toModel = new UpdateValueStrategy();
        UpdateValueStrategy toWidget = new UpdateValueStrategy().setConverter(converter);
        bindingContext.bindValue(observedImage, observeValue, toModel, toWidget);
        //

        return bindingContext;
    }

    @Override
    public void dispose() {
        nameable.removeValueChangeListener(this);
        nameable.dispose();
        super.dispose();
    }

    @Override
    public void handleValueChange(ValueChangeEvent event) {
        //updateToolbar();
    }

    protected void updateToolbar() {
//        ToolItem tltmI = new ToolItem(actionBar, SWT.NONE);
//        tltmI.setToolTipText("Intercept");
//        tltmI.setText("I");
//        tltmI.addSelectionListener(new SelectionAdapter(){
//            @Override
//            public void widgetSelected(SelectionEvent e) {
//                InterruptAction interruptAction = GameplayFactory.eINSTANCE.createInterruptAction();
//                interruptAction.setIniCost(-5);
//                
//            }
//            
//        });
//        
//        ToolItem tltmD = new ToolItem(actionBar, SWT.NONE);
//        tltmD.setToolTipText("Doge");
//        tltmD.setText("d");
//        
//        ToolItem tltmB = new ToolItem(actionBar, SWT.NONE);
//        tltmB.setToolTipText("Block");
//        tltmB.setText("b");
//        
//        ToolItem tltmP = new ToolItem(actionBar, SWT.NONE);
//        tltmP.setToolTipText("Parry");
//        tltmP.setText("p");
//        
//        ToolItem tltmFb = new ToolItem(actionBar, SWT.NONE);
//        tltmFb.setToolTipText("full block");
//        tltmFb.setText("fb");
//        
//        ToolItem tltmFc = new ToolItem(actionBar, SWT.NONE);
//        tltmFc.setToolTipText("full cover");
//        tltmFc.setText("fc");

    }

    public void setNameable(Beschreibbar nameable) {
        this.nameable.setValue(nameable);
    }

    //
    // public void setNameable(WritableValue character, EReference references) {
    // //this.character = character;
    // this.reference = references;
    // Object value = EMFObservables.observeDetailValue(Realm.getDefault(), character, references);
    // nameable.setValue(value);
    // }

}
