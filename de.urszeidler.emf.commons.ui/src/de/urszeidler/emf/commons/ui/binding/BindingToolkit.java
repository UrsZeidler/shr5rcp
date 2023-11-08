package de.urszeidler.emf.commons.ui.binding;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
/**
 * this is a simple binding interface to indirect the binding 
 * from the widget it self
 * @author urs
 *
 */
public interface BindingToolkit {

	IObservableValue<?> bindTextFeature(Text text, EStructuralFeature feature);
	IObservableValue<?> bindFeature(Text text, EReference feature);
	IObservableValue<?> bindFeature(Button btn, EStructuralFeature feature);

}
