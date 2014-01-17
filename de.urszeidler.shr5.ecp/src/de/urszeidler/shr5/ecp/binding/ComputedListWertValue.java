/**
 * 
 */
package de.urszeidler.shr5.ecp.binding;

import java.math.BigDecimal;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.ComputedValue;

import de.urszeidler.eclipse.shr5.GeldWert;



public final class ComputedListWertValue extends ComputedValue {
	private final IObservableList observeValue;

	public ComputedListWertValue(IObservableList observeValue) {
		this.observeValue = observeValue;
	}

	@Override
	protected Object calculate() {
		return calcListenNormWert(observeValue);
	}

	private Object calcListenNormWert(IObservableList observeValue) {
		BigDecimal summ = new BigDecimal(0);
		for (int i = 0; i < observeValue.size(); i++) {
			GeldWert abstaktGegenstand = (GeldWert) observeValue.get(i);
			if (abstaktGegenstand.getWert() != null)
				summ = summ.add(abstaktGegenstand.getWert());
		}
		return summ;
	}
}