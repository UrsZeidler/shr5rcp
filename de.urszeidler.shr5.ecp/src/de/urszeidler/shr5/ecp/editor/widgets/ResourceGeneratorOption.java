package de.urszeidler.shr5.ecp.editor.widgets;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.shr5.ecp.editor.pages.Messages;

public class ResourceGeneratorOption extends Composite {
    private static final String EMPTY = ""; //$NON-NLS-1$

    private DataBindingContext m_bindingContext;

    private FormToolkit toolkit;// = new FormToolkit(Display.getCurrent());
    private Resourcen object;
    private ManagedCharacter context;
    private EditingDomain editingDomain;
    private Label lblspend;
    private Label lblleft;

    private int minSize = 50;

    private EStructuralFeature shr5GeneratorResourceSpend;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public ResourceGeneratorOption(Composite parent, int style) {
        super(parent, style);
        toolkit = new FormToolkit(Display.getCurrent());
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });
        createWidgets();
    }

    /**
     * EAttribute shr5GeneratorResourceSpend = Literals.SHR5_GENERATOR__RESOURCE_SPEND;
     * The main contructor.
     * 
     * @param parent
     * @param style
     * @param object
     * @param context
     * @param toolkit
     * @param editingDomain
     */
    public ResourceGeneratorOption(Composite parent, int style, Resourcen object, ManagedCharacter context, FormToolkit toolkit,
            EditingDomain editingDomain, EStructuralFeature resourcesSpend) {
        super(parent, style);
        this.toolkit = toolkit;
        this.object = object;
        this.context = context;
        this.editingDomain = editingDomain;
        this.shr5GeneratorResourceSpend = resourcesSpend;
        createWidgets();
    }

    private void createWidgets() {
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);
        GridLayout gridLayout = new GridLayout(3, false);
        gridLayout.horizontalSpacing = 10;
        setLayout(gridLayout);

        toolkit.createLabel(this, Messages.GeneratorOption_resource_spend, SWT.NONE);

        lblspend = new Label(this, SWT.NONE);
        GridData gd_lblspend = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_lblspend.widthHint = minSize;
        lblspend.setLayoutData(gd_lblspend);
        toolkit.adapt(lblspend, true, true);
        lblspend.setText(Messages.GeneratorOption_spend_to_much);

        lblleft = new Label(this, SWT.NONE);
        GridData gd_lblleft = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_lblleft.widthHint = minSize;
        lblleft.setLayoutData(gd_lblleft);
        toolkit.adapt(lblleft, true, true);
        lblleft.setText(EMPTY);
        m_bindingContext = initDataBindings();
        internalBinding(m_bindingContext);
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        //

        //
        return bindingContext;
    }

    private void internalBinding(DataBindingContext bindingContext) {
        IObservableValue observeTextLblspendObserveWidget = WidgetProperties.text().observe(lblspend);
        IObservableValue objectAttibutePointsSpendObserveValue = EMFEditObservables.observeValue(editingDomain, context.getChracterSource(),
                shr5GeneratorResourceSpend);

        EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
        // modelToTarget.setAfterGetValidator(resourceInRangeValidator);
        // modelToTarget.setConverter(new Converter(Integer.class, String.class) {
        // @Override
        // public Object convert(Object fromObject) {
        // int calcAttributesSpend = object.calcResourceSpend(context);
        // return "spend :" + calcAttributesSpend + "";
        // }
        // });
        Binding bindValue = bindingContext.bindValue(observeTextLblspendObserveWidget, objectAttibutePointsSpendObserveValue,
                new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), modelToTarget);
        ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);
        //
        IObservableValue observeTextLblleftObserveWidget = WidgetProperties.text().observe(lblleft);
        IObservableValue objectAttibutePointsLeftObserveValue = EMFEditObservables.observeValue(editingDomain, context.getChracterSource(),
                shr5GeneratorResourceSpend);

        modelToTarget = new EMFUpdateValueStrategy();
        modelToTarget.setConverter(new Converter(Integer.class, String.class) {
            @SuppressWarnings("unchecked")
            @Override
            public Object convert(Object fromObject) {
                CharacterGenerator<?> generator = context.getChracterSource();
                if (generator instanceof Shr5Generator) {
                    Shr5Generator sr5g = (Shr5Generator)generator;
                    return ShadowrunManagmentTools.calcResourcesLeft(sr5g) + EMPTY;
                } else if (generator instanceof KarmaGenerator) {
                    KarmaGenerator<Shr5System> kg = (KarmaGenerator<Shr5System>)generator;
                    return ShadowrunManagmentTools.calcResourcesLeft(kg) + EMPTY;
                }
                return 0 + EMPTY;
            }
        });
        bindingContext.bindValue(observeTextLblleftObserveWidget, objectAttibutePointsLeftObserveValue, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), modelToTarget);
    }
}
