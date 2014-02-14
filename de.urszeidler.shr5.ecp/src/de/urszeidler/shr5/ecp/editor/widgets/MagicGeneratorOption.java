package de.urszeidler.shr5.ecp.editor.widgets;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.MysticAdept;
import de.urszeidler.eclipse.shr5.Zauberer;
import de.urszeidler.eclipse.shr5Management.Adept;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage.Literals;
import de.urszeidler.eclipse.shr5Management.SpecialType;
import de.urszeidler.eclipse.shr5Management.Spellcaster;
import de.urszeidler.eclipse.shr5Management.Technomancer;
import de.urszeidler.shr5.ecp.editor.pages.Messages;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

public class MagicGeneratorOption extends Composite {
    private static final String EMPTY = ""; //$NON-NLS-1$

    private DataBindingContext m_bindingContext;

    private FormToolkit toolkit;// = new FormToolkit(Display.getCurrent());
    private SpecialType object;
    private ManagedCharacter context;
    private EditingDomain editingDomain;
    private Label lblspend;
    private Label lblleft;
    private Label lblSpellSpend;
    private Label lblSpellLeft;
    private Label lblCFormSpend;
    private Label lblCFormLeft;

    private int minSize = 40;

    private Label lblSpellSpend1;

    private Label lblSpellLeft1;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public MagicGeneratorOption(Composite parent, int style) {
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
     * The main contructor.
     * 
     * @param parent
     * @param style
     * @param object
     * @param context
     * @param toolkit
     * @param editingDomain
     */
    public MagicGeneratorOption(Composite parent, int style, SpecialType object, ManagedCharacter context, FormToolkit toolkit,
            EditingDomain editingDomain) {
        super(parent, style);
        this.toolkit = toolkit;
        this.object = object;
        this.context = context;
        this.editingDomain = editingDomain;
        createWidgets();
    }

    private void createWidgets() {
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);
        GridLayout gridLayout = new GridLayout(3, false);
        gridLayout.horizontalSpacing = 10;
        setLayout(gridLayout);

        toolkit.createLabel(this, Messages.GeneratorOption_m_skills_spend, SWT.NONE);

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

        AbstraktPersona persona = context.getPersona();
        if (persona instanceof KiAdept) {
            toolkit.createLabel(this, "Kipower spend :", SWT.NONE);

            lblSpellSpend1 = new Label(this, SWT.NONE);
            toolkit.adapt(lblSpellSpend1, true, true);
            lblSpellSpend1.setText(Messages.GeneratorOption_spend_to_much);
            gd_lblleft = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
            gd_lblleft.widthHint = minSize;
            lblSpellSpend1.setLayoutData(gd_lblleft);

            lblSpellLeft1 = new Label(this, SWT.NONE);
            toolkit.adapt(lblSpellLeft1, true, true);
            lblSpellLeft1.setText(EMPTY);
            gd_lblleft = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
            gd_lblleft.widthHint = minSize;
            lblSpellLeft1.setLayoutData(gd_lblleft);
        }

        if (persona instanceof Zauberer) {
            toolkit.createLabel(this, Messages.GeneratorOption_spells_spend, SWT.NONE);

            lblSpellSpend = new Label(this, SWT.NONE);
            toolkit.adapt(lblSpellSpend, true, true);
            lblSpellSpend.setText(Messages.GeneratorOption_spend_to_much);
            gd_lblleft = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
            gd_lblleft.widthHint = minSize;
            lblSpellSpend.setLayoutData(gd_lblleft);

            lblSpellLeft = new Label(this, SWT.NONE);
            toolkit.adapt(lblSpellLeft, true, true);
            lblSpellLeft.setText(EMPTY);
            gd_lblleft = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
            gd_lblleft.widthHint = minSize;
            lblSpellLeft.setLayoutData(gd_lblleft);

        }

        if (persona instanceof de.urszeidler.eclipse.shr5.Technomancer) {
            toolkit.createLabel(this, Messages.GeneratorOption_complex_forms_spend, SWT.NONE);
            lblCFormSpend = new Label(this, SWT.NONE);
            toolkit.adapt(lblCFormSpend, true, true);
            lblCFormSpend.setText(Messages.GeneratorOption_spend_to_much);
            gd_lblleft = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
            gd_lblleft.widthHint = minSize;
            lblCFormSpend.setLayoutData(gd_lblleft);

            lblCFormLeft = new Label(this, SWT.NONE);
            toolkit.adapt(lblCFormLeft, true, true);
            lblCFormLeft.setText(EMPTY);
            gd_lblleft = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
            gd_lblleft.widthHint = minSize;
            lblCFormLeft.setLayoutData(gd_lblleft);

        }

        // if (object instanceof Spellcaster) {
        //
        // } else if (object instanceof Technomancer) {
        //
        // }

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
                Literals.SHR5_GENERATOR__KARMA_SPEND);

        EMFUpdateValueStrategy modelToTarget = new EMFUpdateValueStrategy();
        modelToTarget.setConverter(new Converter(Integer.class, String.class) {
            @Override
            public Object convert(Object fromObject) {
                int calcAttributesSpend = object.calcSkillsSpend(context);
                return calcAttributesSpend + EMPTY;
            }
        });
        bindingContext.bindValue(observeTextLblspendObserveWidget, objectAttibutePointsSpendObserveValue, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), modelToTarget);
        //
        IObservableValue observeTextLblleftObserveWidget = WidgetProperties.text().observe(lblleft);
        IObservableValue objectAttibutePointsLeftObserveValue = EMFEditObservables.observeValue(editingDomain, context.getChracterSource(),
                Literals.SHR5_GENERATOR__KARMA_SPEND);

        modelToTarget = new EMFUpdateValueStrategy();
        modelToTarget.setConverter(new Converter(Integer.class, String.class) {
            @Override
            public Object convert(Object fromObject) {
                int calcAttributesSpend = object.calcSkillsSpend(context);
                return (object.getSkillNumber() - calcAttributesSpend + EMPTY);
            }
        });
        bindingContext.bindValue(observeTextLblleftObserveWidget, objectAttibutePointsLeftObserveValue, new UpdateValueStrategy(
                UpdateValueStrategy.POLICY_NEVER), modelToTarget);
        // --
        AbstraktPersona persona = context.getPersona();
        if (persona instanceof Zauberer) {
            final Spellcaster sc = (Spellcaster)object;
            observeTextLblspendObserveWidget = WidgetProperties.text().observe(lblSpellSpend);
            objectAttibutePointsSpendObserveValue = EMFEditObservables.observeValue(editingDomain, context.getChracterSource(),
                    Literals.SHR5_GENERATOR__SPELL_POINT_SPEND);

            modelToTarget = new EMFUpdateValueStrategy();
            Binding bindValue = bindingContext.bindValue(observeTextLblspendObserveWidget, objectAttibutePointsSpendObserveValue,
                    new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), modelToTarget);
            ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);
            //
            observeTextLblleftObserveWidget = WidgetProperties.text().observe(lblSpellLeft);
            objectAttibutePointsLeftObserveValue = EMFEditObservables.observeValue(editingDomain, context.getChracterSource(),
                    Literals.SHR5_GENERATOR__SPELL_POINT_SPEND);

            modelToTarget = new EMFUpdateValueStrategy();
            modelToTarget.setConverter(new Converter(Integer.class, String.class) {
                @Override
                public Object convert(Object fromObject) {
                    int calcAttributesSpend = sc.calcSpellPointsSpend(context);
                    return (((Spellcaster)object).getSpellPoints() - calcAttributesSpend + EMPTY);
                }
            });
            bindingContext.bindValue(observeTextLblleftObserveWidget, objectAttibutePointsLeftObserveValue, new UpdateValueStrategy(
                    UpdateValueStrategy.POLICY_NEVER), modelToTarget);
        }

        if (persona instanceof KiAdept) {
            final KiAdept ka = (KiAdept)persona;

            observeTextLblspendObserveWidget = WidgetProperties.text().observe(lblSpellSpend1);
            objectAttibutePointsSpendObserveValue = EMFEditObservables.observeValue(editingDomain, context.getChracterSource(),
                    Literals.SHR5_GENERATOR__SPELL_POINT_SPEND);

            modelToTarget = new EMFUpdateValueStrategy();
            modelToTarget.setConverter(new Converter(Integer.class, String.class) {
                @Override
                public Object convert(Object fromObject) {
                    // int calcPowerpointsSpend =((Adept)object) .calcPowerPointsSpend(context);
                    String powerPointsToFloat = ShadowrunEditingTools.powerPointsToFloat(Math.abs(getBasePowerPoints(ka)));
                    System.out.println("--" + powerPointsToFloat);
                    return powerPointsToFloat;
                }

            });
            Binding bindValue = bindingContext.bindValue(observeTextLblspendObserveWidget, objectAttibutePointsSpendObserveValue,
                    new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), modelToTarget);
            ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);
            //
            observeTextLblleftObserveWidget = WidgetProperties.text().observe(lblSpellLeft1);
            objectAttibutePointsLeftObserveValue = EMFEditObservables.observeValue(editingDomain, context.getChracterSource(),
                    Literals.SHR5_GENERATOR__SPELL_POINT_SPEND);

            modelToTarget = new EMFUpdateValueStrategy();
            modelToTarget.setConverter(new Converter(Integer.class, String.class) {
                @Override
                public Object convert(Object fromObject) {
                    int calcPowerpointsSpend = ((Adept)object).calcPowerPointsSpend(context);
                    int basePowerpoints = getBasePowerPoints(ka);
                    System.out.println(calcPowerpointsSpend + "   " + basePowerpoints);
                    return ShadowrunEditingTools.powerPointsToFloat(Math.abs(basePowerpoints) - Math.abs(calcPowerpointsSpend));
                }
            });
            bindingContext.bindValue(observeTextLblleftObserveWidget, objectAttibutePointsLeftObserveValue, new UpdateValueStrategy(
                    UpdateValueStrategy.POLICY_NEVER), modelToTarget);

        }
        if (persona instanceof Zauberer) {
            Zauberer z = (Zauberer)persona;
            final Spellcaster sc = (Spellcaster)object;
            observeTextLblspendObserveWidget = WidgetProperties.text().observe(lblSpellSpend);
            objectAttibutePointsSpendObserveValue = EMFEditObservables.observeValue(editingDomain, context.getChracterSource(),
                    Literals.SHR5_GENERATOR__SPELL_POINT_SPEND);

            modelToTarget = new EMFUpdateValueStrategy();
            Binding bindValue = bindingContext.bindValue(observeTextLblspendObserveWidget, objectAttibutePointsSpendObserveValue,
                    new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), modelToTarget);
            ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);
            //
            observeTextLblleftObserveWidget = WidgetProperties.text().observe(lblSpellLeft);
            objectAttibutePointsLeftObserveValue = EMFEditObservables.observeValue(editingDomain, context.getChracterSource(),
                    Literals.SHR5_GENERATOR__SPELL_POINT_SPEND);

            modelToTarget = new EMFUpdateValueStrategy();
            modelToTarget.setConverter(new Converter(Integer.class, String.class) {
                @Override
                public Object convert(Object fromObject) {
                    int calcAttributesSpend = sc.calcSpellPointsSpend(context);
                    return (((Spellcaster)object).getSpellPoints() - calcAttributesSpend + EMPTY);
                }
            });
            bindingContext.bindValue(observeTextLblleftObserveWidget, objectAttibutePointsLeftObserveValue, new UpdateValueStrategy(
                    UpdateValueStrategy.POLICY_NEVER), modelToTarget);

        }

        // ---
        if (object instanceof Technomancer) {
            final Technomancer sc = (Technomancer)object;
            observeTextLblspendObserveWidget = WidgetProperties.text().observe(lblCFormSpend);
            objectAttibutePointsSpendObserveValue = EMFEditObservables.observeValue(editingDomain, context.getChracterSource(),
                    Literals.SHR5_GENERATOR__SPELL_POINT_SPEND);

            modelToTarget = new EMFUpdateValueStrategy();
            Binding bindValue = bindingContext.bindValue(observeTextLblspendObserveWidget, objectAttibutePointsSpendObserveValue,
                    new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), modelToTarget);
            ControlDecorationSupport.create(bindValue, SWT.TOP | SWT.LEFT);
            //
            observeTextLblleftObserveWidget = WidgetProperties.text().observe(lblCFormLeft);
            objectAttibutePointsLeftObserveValue = EMFEditObservables.observeValue(editingDomain, context.getChracterSource(),
                    Literals.SHR5_GENERATOR__SPELL_POINT_SPEND);

            modelToTarget = new EMFUpdateValueStrategy();
            modelToTarget.setConverter(new Converter(Integer.class, String.class) {
                @Override
                public Object convert(Object fromObject) {
                    int calcAttributesSpend = sc.calcComplexFormsSpend(context);
                    return (((Technomancer)object).getComplexForms() - calcAttributesSpend + EMPTY);
                }
            });
            bindingContext.bindValue(observeTextLblleftObserveWidget, objectAttibutePointsLeftObserveValue, new UpdateValueStrategy(
                    UpdateValueStrategy.POLICY_NEVER), modelToTarget);

        }

    }

    protected int getBasePowerPoints(KiAdept ka) {
        if (ka instanceof MysticAdept) {
            int sum = 0;
            MysticAdept ma = (MysticAdept)ka;
            EList<KiKraft> kikraft = ma.getKikraft();
            for (KiKraft kraft : kikraft) {
                sum = sum + kraft.getKraftpunkte();
            }
            sum = (int)Math.floor(sum / 100f);

            return sum * 100;
        }
        int magieBasis = ka.getMagieBasis() * 100;
        return magieBasis;
    }
}
