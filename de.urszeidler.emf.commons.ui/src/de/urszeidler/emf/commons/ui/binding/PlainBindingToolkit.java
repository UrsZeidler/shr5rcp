/**
 * 
 */
package de.urszeidler.emf.commons.ui.binding;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;

/**
 * @author urs
 *
 */
public abstract class PlainBindingToolkit implements BindingToolkit {
	protected final EMFDataBindingContext ctx;
	protected final EObject eObject; 
	public PlainBindingToolkit(EMFDataBindingContext ctx, EObject eObject) {
		this.ctx = ctx;
		this.eObject = eObject;
	}
	@Override
	public IObservableValue<?> bindTextFeature(Text text, EStructuralFeature feature) {
		IObservableValue<?> observeValue = EMFObservables.observeValue(eObject, feature);
		ISWTObservableValue<String> observeEditable = WidgetProperties.text(SWT.Modify).observe(text);
		UpdateValueStrategy updateStrategie = new EMFUpdateValueStrategy();
		Binding binding = ctx.bindValue(observeEditable, observeValue, updateStrategie, updateStrategie);
		ctx.addBinding(binding);
	
		return observeValue;
	}
	@Override
	public IObservableValue bindFeature(Button btn, EStructuralFeature feature) {
		IObservableValue observeValue = EMFObservables.observeValue(eObject, feature);
	
		ISWTObservableValue observeEditable = WidgetProperties.buttonSelection().observe(btn);
	
		UpdateValueStrategy updateStrategie = new EMFUpdateValueStrategy();
		Binding binding = ctx.bindValue(observeEditable, observeValue, updateStrategie, updateStrategie);
		ctx.addBinding(binding);
	
		return observeValue;
	}
	@Override
	public IObservableValue<?> bindFeature(Text text, EReference feature) {
		IObservableValue<?> observeValue = EMFObservables.observeValue(eObject, feature);
		ISWTObservableValue<String> observeEditable = WidgetProperties.text(SWT.Modify).observe(text);
		UpdateValueStrategy updateStrategie = new EMFUpdateValueStrategy();
		Binding binding = ctx.bindValue(observeEditable, observeValue, updateStrategie, updateStrategie);
		ctx.addBinding(binding);

		return observeValue;
	}

}
