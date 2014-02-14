/**
 * 
 */
package de.urszeidler.shr5.ecp.editor.widgets;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
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
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.eclipse.shr5.BaseMagischePersona;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Technomancer;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.shr5.ecp.binding.ModificatedAttributeLabelValue;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

/**
 * A UI tollkit for personas
 * 
 * @author urs
 * 
 */
public class PersonaUIToolkit {

	/**
	 * Converts the int value to the float the essens represent.
	 * 
	 * @author urs
	 * 
	 */
	private final class EssenzConverter extends Converter {
		private EssenzConverter(Object fromType, Object toType) {
			super(fromType, toType);
		}

		@Override
		public Object convert(Object fromObject) {
			if (fromObject instanceof Integer) {
			    
			    return ShadowrunEditingTools.powerPointsToFloat((Integer) fromObject);
//				Integer v = (Integer) fromObject;
//				float f = v / 100;
//				return "" + f;
			}
			return null;
		}
	}

	protected AdapterFactoryItemDelegator itemDelegator = AdapterFactoryUtil.getInstance().getItemDelegator();
	protected FormToolkit toolkit;
	protected DataBindingContext ctx;
	protected EObject eObject;
	protected EditingDomain editingDomain;

	public PersonaUIToolkit(DataBindingContext ctx, IObservableValue selection, EObject object, EditingDomain editingDomain,
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

	//
	// private void createBodyIndexWidget(Composite client) {
	// // shadowrunPackage.eINSTANCE.getAbstaktPersona_EssenzBase(),,
	//
	// EAttribute attribute =
	// shadowrunPackage.eINSTANCE.getBodyIndex_BodyIndex();
	// Label label = getToolkit().createLabel(client,
	// itemDelegator.getText(attribute));
	// createLayoutForLabel(label, client);
	//
	// Label text = getToolkit().createLabel(client, "");
	// IObservableValue observeValue = createObservableValue(attribute);//
	// EMFObservables.observeValue(eObject,
	// // attribute);
	// ISWTObservableValue observeEditable = SWTObservables.observeText(text);
	//
	// EMFUpdateValueStrategy updateStrategie1 = new EMFUpdateValueStrategy();
	// updateStrategie1.setConverter(new Converter(1, 1) {
	//
	// @Override
	// public Object convert(Object fromObject) {
	// if (fromObject instanceof Integer) {
	// Integer v = (Integer) fromObject;
	// float f = v / 100;
	// return "" + f;
	// }
	// return null;
	// }
	// });
	// bindObservable(observeValue, observeEditable, updateStrategie1);
	// getToolkit().createLabel(client, "");
	// }
	//
	private void createEssenzWidget(Composite client) {
		EAttribute attribute = Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__ESSENZ;
		getToolkit().createLabel(client,toFeatureName(attribute,eObject));// itemDelegator.getText(attribute));

		Label text = getToolkit().createLabel(client, "");
		IObservableValue observeValue = createObservableValue(attribute);
		ISWTObservableValue observeEditable = SWTObservables.observeText(text);

		EMFUpdateValueStrategy updateStrategie1 = new EMFUpdateValueStrategy();
		updateStrategie1.setConverter(new EssenzConverter(1, 1));
		bindObservable(observeValue, observeEditable, updateStrategie1);
		// Binding binding = ctx.bindValue(observeEditable, observeValue,
		// updateStrategie1, updateStrategie1);
		// ctx.addBinding(binding);
		getToolkit().createLabel(client, "");
	}

	private void createAttributeWidget(final EAttribute basefeature, final EAttribute calcFeature, Composite client) {
		getToolkit().createLabel(client, toFeatureName(calcFeature, eObject));// itemDelegator.getText(calcFeature));

		Text text = getToolkit().createText(client, "__", SWT.NONE);
		setDefaultLayout(text);

		IObservableValue calcObserveValue = createObservableValue(calcFeature);
		final IObservableValue feature = bindTextFeature(text, basefeature, new EMFUpdateValueStrategy());
		ComputedValue computedValue = new ModificatedAttributeLabelValue(calcObserveValue, feature);
		Label label2 = getToolkit().createLabel(client, "");
		setDefaultLayout(label2);

		bindObservable(computedValue, SWTObservables.observeText(label2));
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
		GridData gridData = new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1);
		gridData.widthHint = 28;

		text.setLayoutData(gridData);
	}

	private void createAttributeWidgetRO(final EAttribute basefeature, final EAttribute calcFeature, Composite client) {
		getToolkit().createLabel(client, toFeatureName(calcFeature,eObject));// itemDelegator.getText(calcFeature));

		Label text = getToolkit().createLabel(client, "_____");
		setDefaultLayout(text);
		final IObservableValue feature = bindLabelFeature(text, basefeature, new EMFUpdateValueStrategy());
		IObservableValue calcObserveValue = createObservableValue(calcFeature);
		ComputedValue computedValue = new ModificatedAttributeLabelValue(calcObserveValue, feature);

		Label label2 = getToolkit().createLabel(client, "");
		setDefaultLayout(label2);
		bindObservable(computedValue, SWTObservables.observeText(label2));
	}

	private void createReaktionAttWidgets(EAttribute basefeature, EAttribute calcFeature, Composite client) {

		getToolkit().createLabel(client, toFeatureName(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE,eObject));
		Label label = getToolkit().createLabel(client, "ini");
		bindLabelFeature(label, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE, new EMFUpdateValueStrategy());
		final IObservableValue reaktWValue = createObservableValue(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL);
		ComputedValue computedValue = new ComputedValue() {

			@Override
			protected Object calculate() {
				return reaktWValue.getValue() + "W";
			}
		};

		Label label2 = getToolkit().createLabel(client, "");
		bindObservable(computedValue, SWTObservables.observeText(label2));

	}

	// /**
	// * @param client
	// */
	// public void createBeschreibungWidget(Composite client) {
	// GridLayout glayout = new GridLayout();
	// glayout.marginWidth = glayout.marginHeight = 1;
	// glayout.numColumns = 5;
	// client.setLayout(glayout);
	//
	// Label nameLabel = getToolkit().createLabel(client, "Name ");
	// GridData td = new GridData();
	// td.horizontalSpan = 1;
	// nameLabel.setLayoutData(td);
	// Text nameText = getToolkit().createText(client, "namen");
	// td = new GridData();
	// td.horizontalSpan = 3;
	// td.grabExcessHorizontalSpace = true;
	// td.horizontalAlignment = GridData.FILL;
	// nameText.setLayoutData(td);
	// bindTextFeature(nameText,
	// shadowrunPackage.eINSTANCE.getBeschreibbar_Name());
	//
	// Label iconLabel = getToolkit().createLabel(client, "icon");
	// td = new GridData();
	// td.horizontalSpan = 1;
	// td.verticalSpan = 2;
	// td.minimumHeight = 128;
	// td.widthHint = 128;
	// td.grabExcessVerticalSpace = true;
	// td.verticalAlignment = GridData.BEGINNING;
	// td.horizontalAlignment = GridData.END;
	// iconLabel.setLayoutData(td);
	//
	//
	//
	// //MyImageLabelObserver labelObserver = new
	// MyImageLabelObserver(iconLabel);
	// bindImageLabel(iconLabel,
	// shadowrunPackage.eINSTANCE.getBeschreibbar_Image());
	//
	// Text formText = getToolkit().createText(client, "beschreibung", SWT.MULTI
	// | SWT.WRAP);
	// td = new GridData();
	// td.horizontalSpan = 4;
	// td.verticalSpan = 2;
	// td.grabExcessHorizontalSpace = true;
	// td.grabExcessVerticalSpace = true;
	// td.verticalAlignment = GridData.FILL;
	// td.horizontalAlignment = GridData.FILL;
	//
	// formText.setLayoutData(td);
	// bindTextFeature(formText,
	// shadowrunPackage.eINSTANCE.getBeschreibbar_Beschreibung());
	//
	// Composite createComposite = getToolkit().createComposite(client);
	// td = new GridData();
	// td.horizontalSpan = 5;
	// td.verticalSpan = 1;
	// td.grabExcessHorizontalSpace = true;
	// td.grabExcessVerticalSpace = true;
	// td.verticalAlignment = GridData.FILL;
	// td.horizontalAlignment = GridData.FILL;
	// createComposite.setLayoutData(td);
	//
	// TableWrapLayout layout = new TableWrapLayout();
	// layout.topMargin = 5;
	// layout.leftMargin = 5;
	// layout.rightMargin = 2;
	// layout.bottomMargin = 2;
	// layout.numColumns = 3;
	// createComposite.setLayout(layout);
	//
	// createSingleReferenceWidget(shadowrunPackage.eINSTANCE.getAbstaktPersona_Spezies(),
	// createComposite);
	// }
	//
	/**
	 * Creates bound widget for the koeperlichen attributes.
	 * 
	 * @param client
	 */
	public void createKoerperlicheAttributes(Composite client) {
		createAttributeWidget(Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS,
				Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__KONSTITUTION, client);
		createAttributeWidget(Shr5Package.Literals.ABSTRAKT_PERSONA__STAERKE_BASIS,
				Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__STAERKE, client);
		createAttributeWidget(Shr5Package.Literals.ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS,
				Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT, client);
		createAttributeWidget(Shr5Package.Literals.ABSTRAKT_PERSONA__REAKTION_BASIS,
				Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__REAKTION, client);
	}

	/**
	 * Creates bound widget for the koeperlichen attributes.
	 * 
	 * @param client
	 */
	public void createLimits(Composite client) {
		createAttributeWidgetRO(Shr5Package.Literals.CHRAKTER_LIMITS__KOERPERLICH,
				Shr5Package.Literals.CHRAKTER_LIMITS__KOERPERLICH, client);
		createAttributeWidgetRO(Shr5Package.Literals.CHRAKTER_LIMITS__GEISTIG, Shr5Package.Literals.CHRAKTER_LIMITS__GEISTIG,
				client);
		createAttributeWidgetRO(Shr5Package.Literals.CHRAKTER_LIMITS__SOZIAL, Shr5Package.Literals.CHRAKTER_LIMITS__SOZIAL,
				client);

	}

	/**
	 * Creates bound widget for the koeperlichen attributes.
	 * 
	 * @param client
	 */
	public void createSpezielleAttributes(Composite client) {
		createEssenzWidget(client);
		createReaktionAttWidgets(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE,
				Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE, client);

		createAttributeWidgetRO(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN,
				Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN, client);
		createAttributeWidget(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__EDGE_BASIS,
				Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__EDGE_BASIS, client);

		createAttributeWidgetRO(Shr5Package.Literals.PANZERUNG__PANZER, Shr5Package.Literals.PANZERUNG__PANZER, client);

		if (eObject instanceof BaseMagischePersona) {
			createAttributeWidget(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE_BASIS,
					Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE, client);

		} else if (eObject instanceof Technomancer) {
			createAttributeWidget(Shr5Package.Literals.RESONANZ_PERSONA__RESONANZ_BASIS,
					Shr5Package.Literals.RESONANZ_PERSONA__RESONANZ, client);
		}

	}

	/**
	 * Creates bound widget for the koeperlichen attributes.
	 * 
	 * @param client
	 */
	public void createGeistigeAttributes(Composite client) {
		createAttributeWidget(Shr5Package.Literals.ABSTRAKT_PERSONA__CHARISMA_BASIS,
				Shr5Package.Literals.GEISTIGE_ATTRIBUTE__CHARISMA, client);
		createAttributeWidget(Shr5Package.Literals.ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS,
				Shr5Package.Literals.GEISTIGE_ATTRIBUTE__WILLENSKRAFT, client);
		createAttributeWidget(Shr5Package.Literals.ABSTRAKT_PERSONA__INTUITION_BASIS,
				Shr5Package.Literals.GEISTIGE_ATTRIBUTE__INTUITION, client);
		createAttributeWidget(Shr5Package.Literals.ABSTRAKT_PERSONA__LOGIK_BASIS, Shr5Package.Literals.GEISTIGE_ATTRIBUTE__LOGIK,
				client);
	}

	private IObservableValue bindTextFeature(Text text, EAttribute feature, EMFUpdateValueStrategy updateStrategie) {
		IObservableValue observeValue = createObservableValue(feature);
		ISWTObservableValue observeEditable = SWTObservables.observeText(text, SWT.Modify);
		bindObservable(observeValue, observeEditable, updateStrategie);
		return observeValue;

	}

	/**
	 * binds a label to the feature
	 * 
	 * @param formText
	 * @return
	 */
	private IObservableValue bindLabelFeature(Label formText, EStructuralFeature feature, EMFUpdateValueStrategy updateStrategie) {
		IObservableValue observeValue = createObservableValue(feature);
		ISWTObservableValue observeEditable = SWTObservables.observeText(formText);
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
	private void bindObservable(IObservableValue observeValue, ISWTObservableValue observeEditable,
			UpdateValueStrategy aUpdateStrategie) {
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
