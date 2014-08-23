package de.urszeidler.shr5.runtime.ui.dialogs;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
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
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.shr5.ecp.binding.PathToImageConverter;
import de.urszeidler.shr5.runtime.ui.widgets.DamageStateValueProperty;
import de.urszeidler.shr5.runtime.ui.widgets.StateMonitorWidget;

public class DamageProbeFinishedDialog extends TitleAreaDialog {
    private DataBindingContext m_bindingContext;

    private Command probe;
    private Beschreibbar desc;
    private Label lblImage;
    private Label lblName;
    private Label lblProbetext;
    private Label lblProberesult;

    private LabelProvider labelProvider;
    private Text txtProbe;
    private Composite composite;
    private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

    private StateMonitorWidget stateMonitorWidgetMental;
    private StateMonitorWidget stateMonitorWidgetPhysical;

    private RuntimeCharacter character;

    private StateMonitorWidget stateMonitorWidgetOverDead;
    private Composite composite_state;

    /**
     * Create the dialog.
     * 
     * @param parentShell
     * @wbp.parser.constructor
     */
    public DamageProbeFinishedDialog(Shell parentShell, Command probe) {
        super(parentShell);
        setHelpAvailable(false);
        this.probe = probe;
        if (probe instanceof SubjectCommand) {
            SubjectCommand sc = (SubjectCommand)probe;
            desc = sc.getSubject().getCharacter().getPersona();
            character = sc.getSubject();
        }
    }

    public DamageProbeFinishedDialog(Shell shell, Command cmd, LabelProvider labelProvider) {
        this(shell, cmd);
        this.labelProvider = labelProvider;
    }

    /**
     * Create contents of the dialog.
     * 
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        setTitle("Damage probe finished");
        
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

        lblProberesult = new Label(container, SWT.NONE);
        lblProberesult.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
        lblProberesult.setText(GameplayTools.printCommand(probe));

        composite = new Composite(container, SWT.NONE);
        composite.setLayout(new GridLayout(4, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
        formToolkit.adapt(composite);
        formToolkit.paintBordersFor(composite);

        ExpandableComposite xpndblcmpstPhysical = formToolkit.createExpandableComposite(composite, ExpandableComposite.TWISTIE);
        formToolkit.paintBordersFor(xpndblcmpstPhysical);
        xpndblcmpstPhysical.setText("physical");
        xpndblcmpstPhysical.setExpanded(true);

        stateMonitorWidgetPhysical = new StateMonitorWidget(xpndblcmpstPhysical, SWT.NONE);

        xpndblcmpstPhysical.setClient(stateMonitorWidgetPhysical);

        ExpandableComposite xpndblcmpstMental = formToolkit.createExpandableComposite(composite, ExpandableComposite.TWISTIE);
        xpndblcmpstMental.setText("mental");
        xpndblcmpstMental.setExpanded(true);

        stateMonitorWidgetMental = new StateMonitorWidget(xpndblcmpstMental, SWT.NONE);
        xpndblcmpstMental.setClient(stateMonitorWidgetMental);

        ExpandableComposite xpndblcmpstOverdead = formToolkit.createExpandableComposite(composite, ExpandableComposite.TWISTIE);
        formToolkit.paintBordersFor(xpndblcmpstOverdead);
        xpndblcmpstOverdead.setText("overdead");
        xpndblcmpstOverdead.setExpanded(true);

        stateMonitorWidgetOverDead = new StateMonitorWidget(xpndblcmpstOverdead, SWT.NONE);
        xpndblcmpstOverdead.setClient(stateMonitorWidgetOverDead);
        
        composite_state = formToolkit.createComposite(composite, SWT.NONE);
        formToolkit.paintBordersFor(composite_state);
        composite_state.setLayout(new GridLayout(1, false));

        if (character != null && character.getCharacter() != null && character.getCharacter().getPersona() != null) {
            AbstraktPersona persona2 = character.getCharacter().getPersona();
            KoerperPersona koerperPersona = (KoerperPersona)persona2;
            stateMonitorWidgetMental.setMaxConditions(koerperPersona.getZustandGeistigMax());
            stateMonitorWidgetPhysical.setMaxConditions(koerperPersona.getZustandKoerperlichMax());
            stateMonitorWidgetOverDead.setMaxConditions(koerperPersona.getZustandGrenze());
        }

        return area;
    }

    /**
     * Create contents of the button bar.
     * 
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
        return new Point(448, 399);
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

        if (stateMonitorWidgetMental != null) {
            ISWTObservableValue observe = new DamageStateValueProperty().observe(stateMonitorWidgetMental);
            IObservableValue observeValue1 = EMFObservables.observeValue(bindingContext.getValidationRealm(), character,
                    RuntimePackage.Literals.PHYICAL_STATE__MENTAL_DAMAGE);
            bindingContext.bindValue(observe, observeValue1, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());

        }
        if (stateMonitorWidgetPhysical != null) {
            ISWTObservableValue observe = new DamageStateValueProperty().observe(stateMonitorWidgetPhysical);
            IObservableValue observeValue1 = EMFObservables.observeValue(bindingContext.getValidationRealm(), character,
                    RuntimePackage.Literals.PHYICAL_STATE__PHYSICAL_DAMAGE);
            bindingContext.bindValue(observe, observeValue1, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());

        }
        if (stateMonitorWidgetOverDead != null) {
            ISWTObservableValue observe = new DamageStateValueProperty().observe(stateMonitorWidgetOverDead);
            IObservableValue observeValue1 = EMFObservables.observeValue(bindingContext.getValidationRealm(), character,
                    RuntimePackage.Literals.PHYICAL_STATE__OVER_DEAD);
            bindingContext.bindValue(observe, observeValue1, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());

        }

        return bindingContext;
    }
}
