package de.urszeidler.shr5.ecp.binding;

import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;


public final class ModificatedAttributeLabelValue extends ComputedValue {
	// private final EAttribute basefeature;
	// private final EAttribute calcFeature;
	private final IObservableValue feature;
	private final IObservableValue calcObserveValue;

	// private ComputedValueExtension(EAttribute basefeature, EAttribute
	// calcFeature, IObservableValue feature) {
	// this.basefeature = basefeature;
	// this.calcFeature = calcFeature;
	// this.feature = feature;
	// this.calcObserveValue = null;
	// }

	public ModificatedAttributeLabelValue(IObservableValue calcObserveValue, IObservableValue feature) {
		this.calcObserveValue = calcObserveValue;
		// this.basefeature = basefeature;
		// this.calcFeature = null;// calcFeature;
		this.feature = feature;
	}

	@Override
	protected Object calculate() {
		// System.out.println(persona);
		String str = "";
		Object calcValue = calcObserveValue.getValue();
		Object value = feature.getValue();
		if (calcValue != null)
			if (!calcValue.equals(value))
				str = "(" + calcValue + ")";

		// if (eObject == null) {
		// if (selectionProvider != null) {
		// ISelection selection2 = selectionProvider.getSelection();
		// if (selection2 instanceof IStructuredSelection) {
		// IStructuredSelection ss = (IStructuredSelection) selection2;
		// Object firstElement = ss.getFirstElement();
		// if (firstElement instanceof AbstaktPersona) {
		// AbstaktPersona ap = (AbstaktPersona) firstElement;
		// if (!ap.eGet(calcFeature).equals(feature.getValue()))
		// str = "(" + ap.eGet(calcFeature) + ")";
		// }
		// }
		// }
		// } else if (!eObject.eGet(calcFeature).equals(feature.getValue()))
		// str = "(" + eObject.eGet(calcFeature) + ")";
		//
		return str;
	}
}
