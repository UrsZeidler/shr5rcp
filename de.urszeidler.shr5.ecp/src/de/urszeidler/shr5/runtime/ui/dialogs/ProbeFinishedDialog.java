package de.urszeidler.shr5.runtime.ui.dialogs;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.shr5.ecp.binding.PathToImageConverter;

public class ProbeFinishedDialog extends TitleAreaDialog {
    private DataBindingContext m_bindingContext;

    private Command probe;
    private Beschreibbar desc;
    private Label lblImage;
    private Label lblName;
    private Label lblProbetext;
    private Label lblProberesult;

    private LabelProvider labelProvider;
    private Text txtProbe;

    /**
     * Create the dialog.
     * @param parentShell
     * @wbp.parser.constructor
     */
    public ProbeFinishedDialog(Shell parentShell,Command probe) {
        super(parentShell);
        setHelpAvailable(false);
        this.probe = probe;
        if (probe instanceof SubjectCommand) {
            SubjectCommand sc = (SubjectCommand)probe;
            desc = sc.getSubject().getCharacter().getPersona();
        }
    }

    public ProbeFinishedDialog(Shell shell, Command cmd, LabelProvider labelProvider) {
        this(shell, cmd);
        this.labelProvider = labelProvider;
    }

    /**
     * Create contents of the dialog.
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        setTitle("Probe finished");
        Composite area = (Composite)super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayout(new GridLayout(2, false));
        container.setLayoutData(new GridData(GridData.FILL_BOTH));
        
        lblImage = new Label(container, SWT.NONE);
        GridData gd_lblImage = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_lblImage.widthHint = 32;
        gd_lblImage.heightHint = 32;
        lblImage.setLayoutData(gd_lblImage);
        lblImage.setText("Image");
        
        lblName = new Label(container, SWT.NONE);
        lblName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        lblName.setText("name");
        
        txtProbe = new Text(container, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI);
        txtProbe.setEnabled(false);
        txtProbe.setText(labelProvider.getText(probe));
        GridData gd_txtProbe = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 3);
        gd_txtProbe.heightHint = 53;
        txtProbe.setLayoutData(gd_txtProbe);
        
//        lblProbetext = new Label(container, SWT.WRAP);
//        GridData gd_lblProbetext = new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 2);
//        gd_lblProbetext.heightHint = 27;
//        lblProbetext.setLayoutData(gd_lblProbetext);
//        lblProbetext.setText(labelProvider.getText(probe));
        
        lblProberesult = new Label(container, SWT.NONE);
        lblProberesult.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
        lblProberesult.setText(GameplayTools.printCommand(probe));
        new Label(container, SWT.NONE);
        new Label(container, SWT.NONE);

        return area;
    }

    /**
     * Create contents of the button bar.
     * @param parent
     */
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
        m_bindingContext = initDataBindings();
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        return new Point(450, 300);
    }
    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue observeTextLblNameObserveWidget = WidgetProperties.text().observe(lblName);
        IObservableValue objectNameObserveValue = EMFProperties.value(
               
                FeaturePath.fromList(Shr5Package.Literals.BESCHREIBBAR__NAME)).observe(desc);
        bindingContext.bindValue(observeTextLblNameObserveWidget, objectNameObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER),
                new EMFUpdateValueStrategy());
 
        
        //
        IWidgetValueProperty image = WidgetProperties.image();
        ISWTObservableValue observedImage = image.observe(lblImage);
        IObservableValue observeValue = EMFProperties.value(
                
                FeaturePath.fromList(Shr5Package.Literals.BESCHREIBBAR__IMAGE)).observe(desc);

        IConverter converter = null;

        converter = new PathToImageConverter(String.class, Image.class, 32);
        UpdateValueStrategy toModel = new UpdateValueStrategy();
        UpdateValueStrategy toWidget = new UpdateValueStrategy().setConverter(converter);
        bindingContext.bindValue(observedImage, observeValue, toModel, toWidget);

        
        
        //
//        IObservableValue observeTextLblProberesultObserveWidget = WidgetProperties.text().observe(lblProberesult);
//        IObservableValue successesProbeObserveValue = EMFProperties.value(                
//                FeaturePath.fromList(GameplayPackage.Literals.PROBE__SUCCESSES)).observe(probe);
//
//        bindingContext.bindValue(observeTextLblProberesultObserveWidget, successesProbeObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy(){
//            @Override
//            public Object convert(Object value) {
//                 return  labelProvider.getText(value);// GameplayTools.printCommand((Command)value);
//            }
//        });
//        //
//        IObservableValue observeTextLblProbetextObserveWidget = WidgetProperties.text().observe(lblProbetext);
//        bindingContext.bindValue(observeTextLblProbetextObserveWidget, successesProbeObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy(){
//            @Override
//            public Object convert(Object value) {
//                return GameplayTools.printCommand((Command)value);
//            }
//        });
        //
        return bindingContext;
    }
}
