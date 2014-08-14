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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Shr5Package.Literals;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.Initative;
import de.urszeidler.shr5.ecp.binding.PathToImageConverter;

/**
 * @author urs
 */
public class EditableInitativeComposite extends Composite implements IValueChangeListener {
//    private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

    protected DataBindingContext m_bindingContext;

    protected WritableValue nameable = new WritableValue();
    // private Beschreibbar character = Shr5Factory.eINSTANCE.createBioWare();

   // private Group mainGroup = null;
    private Label label_image = null;
    private Label label_name = null;
    //private String grouname;
    //protected ToolBar actionBar;

    private GridLayout gridLayout1;

    private Image background;

    private Initative ini;
    private Text txtNewText;
    private Button btnCheckButton;


    public EditableInitativeComposite(Composite parent, int style,Initative ini) {
        super(parent, style);
        nameable.addValueChangeListener(this);
        this.ini = ini;

        initialize();
        this.nameable.setValue(ini.getSubject().getCharacter().getPersona());
    }

    private void initialize() {
//        addDisposeListener(new DisposeListener() {
//            public void widgetDisposed(DisposeEvent e) {
//                toolkit.dispose();
//               
//            }
//        });
//        toolkit.adapt(this);
//        toolkit.paintBordersFor(this);

        
        gridLayout1 = new GridLayout();
        gridLayout1.numColumns = 5;
        gridLayout1.marginHeight = 0;
        gridLayout1.marginTop = 0;
        gridLayout1.marginBottom = 5;
        gridLayout1.horizontalSpacing = 0;
        gridLayout1.verticalSpacing = 0;
        createMainGroup();
        this.setLayout(gridLayout1);
        this.pack();
        new Label(this, SWT.NONE);
    }

    /**
     * This method initializes mainGroup
     */
    private void createMainGroup() {
        GridData gridData3 = new GridData();
        gridData3.widthHint = 100;
        gridData3.minimumWidth = 20;
        gridData3.verticalAlignment = GridData.CENTER;
        gridData3.grabExcessHorizontalSpace = true;
        gridData3.horizontalAlignment = SWT.FILL;
        GridData gridData2 = new GridData();
        gridData2.heightHint = 24;
        gridData2.widthHint = 24;
        GridData gridData = new GridData();
        gridData.widthHint = 193;
        gridData.horizontalAlignment = GridData.FILL;
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = false;
        gridData.verticalAlignment = GridData.FILL;
        label_image = new Label(this,SWT.BORDER);
        label_image.setLayoutData(gridData2);
        label_name =  new Label(this, SWT.NONE);
        label_name.setAlignment(SWT.LEFT);
        label_name.setLayoutData(gridData3);
        txtNewText =  new Text(this, SWT.NONE);
        txtNewText.setText("1000 ");
        GridData gd_txtNewText = new GridData(SWT.RIGHT, SWT.CENTER, true, false, 1, 1);
        gd_txtNewText.widthHint = 40;
        txtNewText.setLayoutData(gd_txtNewText);
        btnCheckButton = new Button(this, SWT.CHECK);
        btnCheckButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        btnCheckButton.setText("sease");
       

        m_bindingContext = initDataBindings();
    }


    public Label getLabel_image() {
        return label_image;
    }

    public Label getLabel_name() {
        return label_name;
    }

    @Override
    public void dispose() {
        nameable.removeValueChangeListener(this);
        nameable.dispose();
        super.dispose();
    }

    @Override
    public void handleValueChange(ValueChangeEvent event) {
        System.err.println("----");
        //updateToolbar();
    }
//
//    public void setNameable(Initative ini) {
//        this.ini = ini;
//        this.nameable.setValue(ini.getSubject());
//        
//    }
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

        
        //
        IObservableValue observeTextTxtNewTextObserveWidget = WidgetProperties.text(SWT.Modify).observeDelayed(200, txtNewText);
        IObservableValue iniIniObserveValue = EMFObservables.observeValue(ini, GameplayPackage.Literals.INITATIVE__INI);
        bindingContext.bindValue(observeTextTxtNewTextObserveWidget, iniIniObserveValue, new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy());
        //
        IObservableValue observeSelectionBtnCheckButtonObserveWidget = WidgetProperties.selection().observe(btnCheckButton);
        IObservableValue iniSizeInitativeObserveValue = EMFObservables.observeValue(ini, GameplayPackage.Literals.INITATIVE__SIZE_INITATIVE);
        bindingContext.bindValue(observeSelectionBtnCheckButtonObserveWidget, iniSizeInitativeObserveValue, new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy());
        //
        return bindingContext;
    }
}
