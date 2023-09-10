/**
 * 
 */
package de.urszeidler.shr5.ecp.editor.widgets;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.BaseMagischePersona;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.Technomancer;
import de.urszeidler.eclipse.shr5.Zauberer;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.shr5.ecp.binding.ModificatedAttributeLabelValue;
import de.urszeidler.shr5.ecp.editor.pages.Messages;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

/**
 * A UI tollkit for personas
 * 
 * @author urs
 */
public class PersonaUIToolkit {

    /**
     * Converts the int value to the float the essens represent.
     * 
     * @author urs
     */
    private final class EssenzConverter extends Converter {
        private EssenzConverter(Object fromType, Object toType) {
            super(fromType, toType);
        }

        @Override
        public Object convert(Object fromObject) {
            if (fromObject instanceof Integer) {

                return ShadowrunEditingTools.powerPointsToFloat((Integer)fromObject);
                // Integer v = (Integer) fromObject;
                // float f = v / 100;
                // return "" + f;
            }
            return null;
        }
    }

    protected AdapterFactoryItemDelegator itemDelegator = AdapterFactoryUtil.getInstance().getItemDelegator();
    protected FormToolkit toolkit;
    protected DataBindingContext ctx;
    protected AbstraktPersona eObject;
    protected EditingDomain editingDomain;

    private boolean karmaMode = false;
    private ManagedCharacter character;

    public PersonaUIToolkit(DataBindingContext ctx, IObservableValue selection, AbstraktPersona object, EditingDomain editingDomain,
            FormToolkit toolkit) {
        super();
        if (ctx == null)
            this.ctx = new DataBindingContext();
        else
            this.ctx = ctx;
        // this.selection = selection;
        eObject = object;
        this.editingDomain = editingDomain;
        this.toolkit = toolkit;
    }

    public PersonaUIToolkit(DataBindingContext ctx, IObservableValue selection, ManagedCharacter character, EditingDomain editingDomain,
            FormToolkit toolkit) {
        super();
        if (ctx == null)
            this.ctx = new DataBindingContext();
        else
            this.ctx = ctx;
        // this.selection = selection;
        karmaMode = true;
        this.character = character;
        eObject = character.getPersona();
        this.editingDomain = editingDomain;
        this.toolkit = toolkit;
    }

    private void createEssenzWidget(Composite client) {
        EAttribute attribute = Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__ESSENZ;
        getToolkit().createLabel(client, toFeatureName(attribute, eObject));// itemDelegator.getText(attribute));

        Label text = getToolkit().createLabel(client, "");//$NON-NLS-1$ 
        IObservableValue observeValue = createObservableValue(attribute);
        ISWTObservableValue observeEditable = WidgetProperties.text().observe(text);

        EMFUpdateValueStrategy updateStrategie1 = new EMFUpdateValueStrategy();
        updateStrategie1.setConverter(new EssenzConverter(1, 1));
		Binding binding = ctx.bindValue(observeEditable, observeValue, null, updateStrategie1);
        ctx.addBinding(binding);

        getToolkit().createLabel(client, ""); //$NON-NLS-1$
        getToolkit().createLabel(client, "");//$NON-NLS-1$ 
    }

    private void createAttributeWidget(final EAttribute basefeature, final EAttribute calcFeature, Composite client) {
        getToolkit().createLabel(client, toFeatureName(calcFeature, eObject));// itemDelegator.getText(calcFeature));

//        final Text text = getToolkit().createText(client, "_", SWT.BORDER);//$NON-NLS-1$ 
        
        final Spinner text = new Spinner(client, SWT.BORDER);
        GridData gd_spinner = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_spinner.widthHint = 40;
        text.setLayoutData(gd_spinner);
        getToolkit().adapt(text);
        getToolkit().paintBordersFor(text);
        text.setMinimum(0);

        
        setDefaultLayout(text);

        IObservableValue calcObserveValue = createObservableValue(calcFeature);
        EMFUpdateValueStrategy updateStrategie;
        if (karmaMode)
            updateStrategie = new EMFUpdateValueStrategy() {
                protected IStatus doSet(IObservableValue observableValue, Object value) {
                    int aValue = ShadowrunManagmentTools.changeAttributeByAdvacement(character, basefeature, (Integer)value);// (Integer)value);
                    text.setSelection(aValue);
//                    text.setText(Integer.toString(aValue));
                    return Status.OK_STATUS;
                }

            };
        else
            updateStrategie = new EMFUpdateValueStrategy();

        final IObservableValue feature = bindTextFeature(text, basefeature, updateStrategie);
        ComputedValue computedValue = new ModificatedAttributeLabelValue(calcObserveValue, feature);
        Label label2 = getToolkit().createLabel(client, "");//$NON-NLS-1$ 
//        setDefaultLayout(label2);

        bindObservable(computedValue, WidgetProperties.text().observe(label2));

        final Spezies spezies = eObject.getSpezies();
        if (ShadowrunTools.base2SpeciesMin(basefeature) != null && spezies != null) {
            text.setMinimum((Integer)spezies.eGet(ShadowrunTools.base2SpeciesMin(basefeature)));
            Label minMaxLabel = getToolkit().createLabel(client, "");
            ComputedValue computedValue2 = new ComputedValue() {

                @Override
                protected Object calculate() {
                    return String.format("[%s/%s]", spezies.eGet(ShadowrunTools.base2SpeciesMin(basefeature)),
                            spezies.eGet(ShadowrunTools.base2SpeciesMax(basefeature)));
                }
            };
            bindObservable(computedValue2, WidgetProperties.text().observe(minMaxLabel));
        }
    }

    private IObservableValue bindTextFeature(Spinner spinner, EAttribute basefeature,
            EMFUpdateValueStrategy targetToModel) {
        IObservableValue observeWidget = WidgetProperties.spinnerSelection().observe(spinner);
        IObservableValue observeValue = EMFEditObservables.observeValue(editingDomain, eObject, basefeature);
        
        Binding binding = ctx.bindValue(observeWidget, observeValue, targetToModel, new EMFUpdateValueStrategy());
        ctx.addBinding(binding);

        return observeValue;
    }

    private void bindObservable(IObservableValue observeValue, ISWTObservableValue observeText) {
        bindObservable(observeValue, observeText, new EMFUpdateValueStrategy());

    }

    /**
     * The the min width.
     * 
     * @param text
     */
    private void setDefaultLayout(Control text) {
        GridData gridData = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gridData.widthHint = 16;

        text.setLayoutData(gridData);
    }

    private void createAttributeWidgetRO(final EAttribute basefeature, final EAttribute calcFeature, Composite client) {
        getToolkit().createLabel(client, toFeatureName(calcFeature, eObject));// itemDelegator.getText(calcFeature));

        Label text = getToolkit().createLabel(client, "__");//$NON-NLS-1$ 
        setDefaultLayout(text);
        final IObservableValue feature = bindLabelFeature(text, basefeature, new EMFUpdateValueStrategy());
        IObservableValue calcObserveValue = createObservableValue(calcFeature);
        ComputedValue computedValue = new ModificatedAttributeLabelValue(calcObserveValue, feature);

        Label label2 = getToolkit().createLabel(client, "");//$NON-NLS-1$ 
//        setDefaultLayout(label2);
        bindObservable(computedValue, WidgetProperties.text().observe(label2));
        label2 = getToolkit().createLabel(client, "");//$NON-NLS-1$ 

    }

    private void createReaktionAttWidgets(EAttribute basefeature, EAttribute calcFeature, Composite client) {

        getToolkit().createLabel(client, toFeatureName(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE, eObject));
        Label label = getToolkit().createLabel(client, "ini");//$NON-NLS-1$ 
        setDefaultLayout(label);
        bindLabelFeature(label, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE, new EMFUpdateValueStrategy());
        final IObservableValue reaktWValue = createObservableValue(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL);
        ComputedValue computedValue = new ComputedValue() {

            @Override
            protected Object calculate() {
                return reaktWValue.getValue() + Messages.PersonaUIToolkit_dice;
            }
        };

        Label label2 = getToolkit().createLabel(client, "");//$NON-NLS-1$ 
        bindObservable(computedValue, WidgetProperties.text().observe(label2));
        label2 = getToolkit().createLabel(client, "");//$NON-NLS-1$ 
    }

    /**
     * Creates bound widget for the koeperlichen attributes.
     * 
     * @param client
     */
    public void createKoerperlicheAttributes(Composite client) {
        createAttributeWidget(Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__KONSTITUTION,
                client);
        createAttributeWidget(Shr5Package.Literals.ABSTRAKT_PERSONA__STAERKE_BASIS, Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__STAERKE, client);
        createAttributeWidget(Shr5Package.Literals.ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS,
                Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT, client);
        createAttributeWidget(Shr5Package.Literals.ABSTRAKT_PERSONA__REAKTION_BASIS, Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__REAKTION, client);
    }

    /**
     * Creates bound widget for the koeperlichen attributes.
     * 
     * @param client
     */
    public void createKoerperlicheAttributesRO(Composite client) {
        createAttributeWidgetRO(Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__KONSTITUTION,
                client);
        createAttributeWidgetRO(Shr5Package.Literals.ABSTRAKT_PERSONA__STAERKE_BASIS, Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__STAERKE, client);
        createAttributeWidgetRO(Shr5Package.Literals.ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS,
                Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT, client);
        createAttributeWidgetRO(Shr5Package.Literals.ABSTRAKT_PERSONA__REAKTION_BASIS, Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__REAKTION, client);
    }

    /**
     * Creates bound widget for the koeperlichen attributes.
     * 
     * @param client
     */
    public void createLimits(Composite client) {
        createAttributeWidgetRO(Shr5Package.Literals.CHRAKTER_LIMITS__KOERPERLICH, Shr5Package.Literals.CHRAKTER_LIMITS__KOERPERLICH, client);
        createAttributeWidgetRO(Shr5Package.Literals.CHRAKTER_LIMITS__GEISTIG, Shr5Package.Literals.CHRAKTER_LIMITS__GEISTIG, client);
        createAttributeWidgetRO(Shr5Package.Literals.CHRAKTER_LIMITS__SOZIAL, Shr5Package.Literals.CHRAKTER_LIMITS__SOZIAL, client);

    }

    /**
     * Creates bound widget for the koeperlichen attributes.
     * 
     * @param client
     */
    public void createSpezielleAttributes(Composite client) {
        createEssenzWidget(client);
        createReaktionAttWidgets(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE, client);

        createAttributeWidgetRO(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN, client);
        createAttributeWidget(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__EDGE_BASIS, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__EDGE_BASIS, client);

        createAttributeWidgetRO(Shr5Package.Literals.PANZERUNG__PANZER, Shr5Package.Literals.PANZERUNG__PANZER, client);

        if (eObject instanceof BaseMagischePersona) {
            createAttributeWidget(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE_BASIS, Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE, client);

        } else if (eObject instanceof Technomancer) {
            createAttributeWidget(Shr5Package.Literals.RESONANZ_PERSONA__RESONANZ_BASIS, Shr5Package.Literals.RESONANZ_PERSONA__RESONANZ, client);
        }
        // if(eObject instanceof Zauberer)
        // createAttributeWidgetRO(Shr5Package.Literals.ZAUBERER__ENZUG, Shr5Package.Literals.ZAUBERER__ENZUG, client);

    }

    /**
     * Creates bound widget for the koeperlichen attributes.
     * 
     * @param client
     */
    public void createSpezielleAttributesRO(Composite client) {
        createEssenzWidget(client);
        createReaktionAttWidgets(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE, client);

        createAttributeWidgetRO(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN, client);
        createAttributeWidgetRO(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__EDGE_BASIS, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__EDGE_BASIS, client);

        createAttributeWidgetRO(Shr5Package.Literals.PANZERUNG__PANZER, Shr5Package.Literals.PANZERUNG__PANZER, client);

        if (eObject instanceof BaseMagischePersona) {
            createAttributeWidgetRO(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE_BASIS, Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE,
                    client);

        } else if (eObject instanceof Technomancer) {
            createAttributeWidgetRO(Shr5Package.Literals.RESONANZ_PERSONA__RESONANZ_BASIS, Shr5Package.Literals.RESONANZ_PERSONA__RESONANZ, client);
        }
        if (eObject instanceof Zauberer)
            createAttributeWidgetRO(Shr5Package.Literals.ZAUBERER__ENZUG, Shr5Package.Literals.ZAUBERER__ENZUG, client);

    }

    /**
     * Creates bound widget for the koeperlichen attributes.
     * 
     * @param client
     */
    public void createGeistigeAttributes(Composite client) {
        createAttributeWidget(Shr5Package.Literals.ABSTRAKT_PERSONA__CHARISMA_BASIS, Shr5Package.Literals.GEISTIGE_ATTRIBUTE__CHARISMA, client);
        createAttributeWidget(Shr5Package.Literals.ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS, Shr5Package.Literals.GEISTIGE_ATTRIBUTE__WILLENSKRAFT,
                client);
        createAttributeWidget(Shr5Package.Literals.ABSTRAKT_PERSONA__INTUITION_BASIS, Shr5Package.Literals.GEISTIGE_ATTRIBUTE__INTUITION, client);
        createAttributeWidget(Shr5Package.Literals.ABSTRAKT_PERSONA__LOGIK_BASIS, Shr5Package.Literals.GEISTIGE_ATTRIBUTE__LOGIK, client);
    }

    /**
     * Creates bound widget for the koeperlichen attributes.
     * 
     * @param client
     */
    public void createGeistigeAttributesRO(Composite client) {
        createAttributeWidgetRO(Shr5Package.Literals.ABSTRAKT_PERSONA__CHARISMA_BASIS, Shr5Package.Literals.GEISTIGE_ATTRIBUTE__CHARISMA, client);
        createAttributeWidgetRO(Shr5Package.Literals.ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS, Shr5Package.Literals.GEISTIGE_ATTRIBUTE__WILLENSKRAFT,
                client);
        createAttributeWidgetRO(Shr5Package.Literals.ABSTRAKT_PERSONA__INTUITION_BASIS, Shr5Package.Literals.GEISTIGE_ATTRIBUTE__INTUITION, client);
        createAttributeWidgetRO(Shr5Package.Literals.ABSTRAKT_PERSONA__LOGIK_BASIS, Shr5Package.Literals.GEISTIGE_ATTRIBUTE__LOGIK, client);
    }

//    private IObservableValue bindTextFeature(Text text, EAttribute feature, EMFUpdateValueStrategy updateStrategie,
//            EMFUpdateValueStrategy targetToModel) {
//        IObservableValue observeValue = createObservableValue(feature);
//        ISWTObservableValue observeEditable = WidgetProperties.text().observe(text, SWT.Modify);
//        Binding binding = ctx.bindValue(observeEditable, observeValue, targetToModel, updateStrategie);
//        ctx.addBinding(binding);
//
//        return observeValue;
//
//    }

    /**
     * binds a label to the feature
     * 
     * @param formText
     * @return
     */
    private IObservableValue bindLabelFeature(Label formText, EStructuralFeature feature, EMFUpdateValueStrategy updateStrategie) {
        IObservableValue observeValue = createObservableValue(feature);
        ISWTObservableValue observeEditable = WidgetProperties.text().observe(formText);
        bindObservable(observeValue, observeEditable, updateStrategie);
        return observeValue;
    }

    /**
     * create an observable for a feature, uses the selection if there is one,
     * or the editing Domain
     * 
     * @param feature
     * @return
     */
    private IObservableValue createObservableValue(EStructuralFeature feature) {
        if (editingDomain != null)
            return EMFEditObservables.observeValue(editingDomain, eObject, feature);
        return EMFObservables.observeValue(ctx.getValidationRealm(), eObject, feature);
    }

    /**
     * @param observeValue
     * @param observeEditable
     * @param aUpdateStrategie
     */
    private void bindObservable(IObservableValue observeValue, ISWTObservableValue observeEditable, UpdateValueStrategy aUpdateStrategie) {
        Binding binding = ctx.bindValue(observeEditable, observeValue, new EMFUpdateValueStrategy(), aUpdateStrategie);
        ctx.addBinding(binding);
    }

    private FormToolkit getToolkit() {
        return toolkit;
    }

    /**
     * Returns the localized feature name.
     * 
     * @param e
     * @param object
     * @return
     */
    private String toFeatureName(EStructuralFeature feature, final EObject object) {
        IItemPropertyDescriptor propertyDescriptor = itemDelegator.getPropertyDescriptor(object, feature);
        String displayName = propertyDescriptor.getDisplayName(feature);
        return displayName;
    }

}
