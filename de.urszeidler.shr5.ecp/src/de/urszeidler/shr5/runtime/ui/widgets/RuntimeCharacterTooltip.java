/**
 * 
 */
package de.urszeidler.shr5.runtime.ui.widgets;

import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.runtime.ExtendetData;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.shr5.ecp.binding.PathToImageConverter;

/**
 * @author urs
 */
public class RuntimeCharacterTooltip extends ToolTip {
    private Shell parentShell;

    private StateMonitorWidget stateMonitorWidgetPhysical;
    private StateMonitorWidget stateMonitorWidgetMental;
    private StateMonitorWidget stateMonitorWidgetOverDead;

    private Label lblName;
    private Label label_image;
    private ToolBarManager extendetDataToolbar;
    private RuntimeCharacter runtimeCharacter;

    // private Table table;

    /**
     */
    public RuntimeCharacterTooltip(Control control) {
        super(control);
        this.parentShell = control.getShell();

    }

    public RuntimeCharacterTooltip(Control control, RuntimeCharacter subject) {
        this(control);
        this.runtimeCharacter = subject;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.jface.window.ToolTip#createToolTipContentArea(org.eclipse.swt.widgets.Event, org.eclipse.swt.widgets.Composite)
     */
    /**
     * @wbp.parser.entryPoint
     */

    protected Composite createToolTipContentArea(Event event, Composite parent) {
        // Object object = event.data;

        Composite comp = new Composite(parent, SWT.NONE);
        comp.setLayout(new GridLayout(1, false));

        lblName = new Label(comp, SWT.NONE);
        lblName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        lblName.setText("titel");

        Composite composite = new Composite(comp, SWT.NONE);
        composite.setLayout(new GridLayout(4, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

        label_image = new Label(composite, SWT.NONE);
        label_image.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));

        Group grpPhysical = new Group(composite, SWT.NONE);
        grpPhysical.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
        grpPhysical.setSize(66, 82);
        grpPhysical.setText("physical");

        Group grpMental = new Group(composite, SWT.NONE);
        grpMental.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
        grpMental.setText("mental");

        Group grpRest = new Group(composite, SWT.NONE);
        grpRest.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
        grpRest.setText("Extra");
        grpPhysical.setLayout(new FillLayout(SWT.HORIZONTAL));

        stateMonitorWidgetPhysical = new StateMonitorWidget(grpPhysical, SWT.NONE);
        grpMental.setLayout(new FillLayout(SWT.HORIZONTAL));
        stateMonitorWidgetMental = new StateMonitorWidget(grpMental, SWT.NONE);
        grpRest.setLayout(new FillLayout(SWT.HORIZONTAL));
        stateMonitorWidgetOverDead = new StateMonitorWidget(grpRest, SWT.NONE, 3, false);

        Group grpExtendedData = new Group(comp, SWT.NONE);
        grpExtendedData.setLayout(new FillLayout(SWT.HORIZONTAL));
        grpExtendedData.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        grpExtendedData.setText("extended data");

        if (runtimeCharacter != null && runtimeCharacter.getCharacter() != null && runtimeCharacter.getCharacter().getPersona() != null) {
            AbstraktPersona persona2 = runtimeCharacter.getCharacter().getPersona();
            KoerperPersona koerperPersona = (KoerperPersona)persona2;
            stateMonitorWidgetMental.setMaxConditions(koerperPersona.getZustandGeistigMax());
            stateMonitorWidgetPhysical.setMaxConditions(koerperPersona.getZustandKoerperlichMax());
            stateMonitorWidgetOverDead.setMaxConditions(koerperPersona.getZustandGrenze());
        }
        extendetDataToolbar = new ToolBarManager(SWT.VERTICAL);

        LabelProvider labelProvider = AdapterFactoryUtil.getInstance().getLabelProvider();

        Set<Entry<ExtendetData, Object>> entrySet = runtimeCharacter.getExtendetData().entrySet();
        for (Entry<ExtendetData, Object> entry : entrySet) {
            ExtendetData key = entry.getKey();
            if (key.getEObject() != null) {
                extendetDataToolbar.add(new Action(labelProvider.getText(key.getEObject()) + " " + labelProvider.getText(key.getEFeature()) + "  "
                        + entry.getValue()) {
                });
            }
        }
        ToolBar createControl = extendetDataToolbar.createControl(grpExtendedData);
        
        grpExtendedData.layout(true, true);        

        // Composite composite_1 = new Composite(comp, SWT.NONE);
        // composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));
        // composite_1.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));

        // TableViewer tableViewer = new TableViewer(composite_1, SWT.BORDER | SWT.FULL_SELECTION);
        // table = tableViewer.getTable();
        //
        // TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
        // TableColumn tblclmnData = tableViewerColumn.getColumn();
        // tblclmnData.setWidth(150);
        // tblclmnData.setText("data");
        // tableViewerColumn.setLabelProvider(new CellLabelProvider() {
        // @Override
        // public void update(ViewerCell cell) {
        // Entry<ExtendetData, Object> element = (Entry<ExtendetData,Object>)cell.getElement();
        // cell.setText(element.getKey().toString());
        // }
        // });
        //
        // TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
        // TableColumn tblclmnValue = tableViewerColumn_1.getColumn();
        // tblclmnValue.setWidth(100);
        // tblclmnValue.setText("value");
        // tableViewerColumn_1.setLabelProvider(new CellLabelProvider() {
        //
        // @Override
        // public void update(ViewerCell cell) {
        // Entry<ExtendetData, Object> element = (Entry<ExtendetData,Object>)cell.getElement();
        // cell.setText(element.getValue().toString());
        // }
        // });
        //
        // tableViewer.setContentProvider(new SimpleListContenProvider(new
        // AdapterFactoryContentProvider(AdapterFactoryUtil.getInstance().getAdapterFactory())));
        // tableViewer.setInput(runtimeCharacter.getExtendetData().entrySet());
        // tableViewer.set

        initDataBindings();
        return comp;
    }

    // protected Composite createContentArea(Composite parent) {
    // return new Composite(parent, SWT.NONE);
    // }

    protected void openHelp() {
        parentShell.setFocus();
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //

        IWidgetValueProperty image = WidgetProperties.image();
        ISWTObservableValue observedImage = image.observe(label_image);
        IObservableValue observeValue = EMFObservables.observeValue(bindingContext.getValidationRealm(),
                runtimeCharacter.getCharacter().getPersona(), Shr5Package.Literals.BESCHREIBBAR__IMAGE);

        IConverter converter = null;

        converter = new PathToImageConverter(String.class, Image.class, 32);
        UpdateValueStrategy toModel = new UpdateValueStrategy();
        UpdateValueStrategy toWidget = new UpdateValueStrategy().setConverter(converter);
        bindingContext.bindValue(observedImage, observeValue, toModel, toWidget);
        //
        //
        IObservableValue observeTextLabel_nameObserveWidget_1 = WidgetProperties.text().observe(lblName);
        IObservableValue characterNameObserveValue = EMFObservables.observeValue(bindingContext.getValidationRealm(), runtimeCharacter.getCharacter()
                .getPersona(), Shr5Package.Literals.BESCHREIBBAR__NAME);
        bindingContext.bindValue(observeTextLabel_nameObserveWidget_1, characterNameObserveValue, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        //
        if (stateMonitorWidgetMental != null) {
            ISWTObservableValue observe = new DamageStateValueProperty().observe(stateMonitorWidgetMental);
            IObservableValue observeValue1 = EMFObservables.observeValue(bindingContext.getValidationRealm(), runtimeCharacter,
                    RuntimePackage.Literals.PHYICAL_STATE__MENTAL_DAMAGE);
            bindingContext.bindValue(observe, observeValue1, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());

        }
        if (stateMonitorWidgetPhysical != null) {
            ISWTObservableValue observe = new DamageStateValueProperty().observe(stateMonitorWidgetPhysical);
            IObservableValue observeValue1 = EMFObservables.observeValue(bindingContext.getValidationRealm(), runtimeCharacter,
                    RuntimePackage.Literals.PHYICAL_STATE__PHYSICAL_DAMAGE);
            bindingContext.bindValue(observe, observeValue1, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        }
        if (stateMonitorWidgetOverDead != null) {
            ISWTObservableValue observe = new DamageStateValueProperty().observe(stateMonitorWidgetOverDead);
            IObservableValue observeValue1 = EMFObservables.observeValue(bindingContext.getValidationRealm(), runtimeCharacter,
                    RuntimePackage.Literals.PHYICAL_STATE__OVER_DEAD);
            bindingContext.bindValue(observe, observeValue1, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), new EMFUpdateValueStrategy());
        }

        return bindingContext;
    }
}
