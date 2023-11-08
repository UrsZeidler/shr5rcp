/**
 * 
 */
package de.urszeidler.emf.commons.ui.binding;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.ComputedValue;


/**
 * Observes a IObservableList for the size
 * @author urs
 *
 */
public final class ComputedListSizeValue extends ComputedValue<Integer> {
	private final IObservableList<?> observeValue;

	public ComputedListSizeValue(IObservableList<?> observeValue) {
		this.observeValue = observeValue;
	}

	@Override
	protected Integer calculate() {
		return observeValue.size();
	}
}