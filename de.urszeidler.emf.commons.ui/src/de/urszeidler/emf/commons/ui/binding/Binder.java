/**
 * 
 */
package de.urszeidler.emf.commons.ui.binding;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.databinding.edit.IEMFEditValueProperty;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;

/**
 * A Basic Binding toolkit
 * @author urs
 * 
 */
public class Binder {

	/**
	 * @param observeValue
	 * @param observeEditable
	 * @param aUpdateStrategie 
	 */
	public static void bindObservable(IObservableValue<?> observeValue, ISWTObservableValue<?> observeEditable,DataBindingContext dbc, UpdateValueStrategy targetToModelUpdate, UpdateValueStrategy<?,?> modelToTargetUpdate) {
		Binding binding = dbc.bindValue(observeEditable, observeValue, targetToModelUpdate, targetToModelUpdate);
		dbc.addBinding(binding);
	}

	
	/**
	 * a basic bind method
	 * 
	 * @param textProp
	 * @param widget
	 * @param object
	 * @param dbc
	 * @param property
	 * @param targetToModelUpdate
	 * @param modelToTargetUpdate
	 * @return 
	 */
	public static Binding bind(IWidgetValueProperty textProp, Widget widget, Object object, DataBindingContext dbc,
			IValueProperty property, UpdateValueStrategy targetToModelUpdate, UpdateValueStrategy modelToTargetUpdate) {
		IObservableValue uiObs = textProp.observeDelayed(400, widget);
		IObservableValue<?> mObs;

		if (object instanceof IObservableValue) {
			mObs = property.observeDetail((IObservableValue) object);
		} else {
			mObs = property.observe(object);
		}

		Binding bindValue = dbc.bindValue(uiObs, mObs, targetToModelUpdate, modelToTargetUpdate);
		return bindValue;
	}

	/**
	 * 
	 * @param textProp
	 * @param widget
	 * @param object
	 * @param dbc
	 * @param targetToModelUpdate
	 * @param modelToTargetUpdate
	 * @param editingDomain
	 * @param feature
	 * @return 
	 */
	public static Binding bind(IWidgetValueProperty textProp, Widget widget, Object object, DataBindingContext dbc,
			UpdateValueStrategy targetToModelUpdate, UpdateValueStrategy modelToTargetUpdate,
			EditingDomain editingDomain, EStructuralFeature feature) {
		if(editingDomain==null)
			return bind(textProp, widget, object, dbc, targetToModelUpdate, modelToTargetUpdate, feature);
		
		
		IEMFEditValueProperty property = EMFEditProperties.value(editingDomain, feature);
		return bind(textProp, widget, object, dbc, property, targetToModelUpdate, modelToTargetUpdate);
	}

	/**
	 * 
	 * @param textProp
	 * @param widget
	 * @param object
	 * @param dbc
	 * @param targetToModelUpdate
	 * @param modelToTargetUpdate
	 * @param feature
	 * @return 
	 */
	public static Binding bind(IWidgetValueProperty textProp, Widget widget, Object object, DataBindingContext dbc,
			UpdateValueStrategy targetToModelUpdate, UpdateValueStrategy modelToTargetUpdate,
			 EStructuralFeature feature) {
		IEMFValueProperty property = EMFProperties.value(feature);

		return bind(textProp, widget, object, dbc, property, targetToModelUpdate, modelToTargetUpdate);
	}

	/**
	 * 
	 * @param textProp
	 * @param widget
	 * @param object
	 * @param dbc
	 * @param targetToModelUpdate
	 * @param modelToTargetUpdate
	 * @param editingDomain
	 * @param path
	 */
	public static void bind(IWidgetValueProperty textProp, Widget widget, Object object, DataBindingContext dbc,
			UpdateValueStrategy targetToModelUpdate, UpdateValueStrategy modelToTargetUpdate,
			EditingDomain editingDomain, FeaturePath path) {

		IEMFEditValueProperty property = EMFEditProperties.value(editingDomain, path);
		bind(textProp, widget, object, dbc, property, targetToModelUpdate, modelToTargetUpdate);
	}

	/**
	 * 
	 * @param textProp
	 * @param widget
	 * @param object
	 * @param dbc
	 * @param targetToModelUpdate
	 * @param modelToTargetUpdate
	 * @param path
	 */
	public static void bind(IWidgetValueProperty textProp, Widget widget, Object object, DataBindingContext dbc,
			UpdateValueStrategy targetToModelUpdate, UpdateValueStrategy modelToTargetUpdate,
			 FeaturePath path) {
		IEMFValueProperty property = EMFProperties.value(path);
		bind(textProp, widget, object, dbc, property, targetToModelUpdate, modelToTargetUpdate);
	}

	/**
	 * 
	 * @param label
	 * @param object
	 * @param dbc
	 * @param targetToModelUpdate
	 * @param modelToTargetUpdate
	 * @param editingDomain
	 * @param path
	 */
	public static void bindLabel(Label label, Object object, DataBindingContext dbc,
			UpdateValueStrategy<String, String> targetToModelUpdate, UpdateValueStrategy<String, String> modelToTargetUpdate,
			EditingDomain editingDomain, FeaturePath path) {
		IWidgetValueProperty<Label, String> textProp = WidgetProperties.text();

		IEMFEditValueProperty property = EMFEditProperties.value(editingDomain, path);
		bind(textProp, label, object, dbc, property, null, modelToTargetUpdate);
	}

	/**
	 * 
	 * @param label
	 * @param object
	 * @param dbc
	 * @param targetToModelUpdate
	 * @param modelToTargetUpdate
	 * @param path
	 */
	public static void bindLabel(Label label, Object object, DataBindingContext dbc,
			UpdateValueStrategy<String, String> targetToModelUpdate, UpdateValueStrategy<String, String> modelToTargetUpdate,
			FeaturePath path) {
		IWidgetValueProperty<Label, String> textProp = WidgetProperties.text();

		IEMFValueProperty property = EMFProperties.value(path);
		bind(textProp, label, object, dbc, property, null, modelToTargetUpdate);
	}

	/**
	 * 
	 * @param text
	 * @param object
	 * @param dbc
	 * @param targetToModelUpdate
	 * @param modelToTargetUpdate
	 * @param editingDomain
	 * @param path
	 */
	public static void bindText(Text text, Object object, DataBindingContext dbc, UpdateValueStrategy<String, String> targetToModelUpdate,
			UpdateValueStrategy<String, String> modelToTargetUpdate, EditingDomain editingDomain, FeaturePath path) {
		IWidgetValueProperty<Text, String> textProp = WidgetProperties.text(SWT.Modify);

		IEMFEditValueProperty property = EMFEditProperties.value(editingDomain, path);
		bind(textProp, text, object, dbc, property, targetToModelUpdate, modelToTargetUpdate);
	}

	/**
	 * 
	 * @param text
	 * @param object
	 * @param dbc
	 * @param targetToModelUpdate
	 * @param modelToTargetUpdate
	 * @param path
	 */
	public static void bindText(Text text, Object object, DataBindingContext dbc, UpdateValueStrategy<String, String> targetToModelUpdate,
			UpdateValueStrategy<String, String> modelToTargetUpdate, FeaturePath path) {
		IWidgetValueProperty<Text,String> textProp = WidgetProperties.text(SWT.Modify);

		IEMFValueProperty property = EMFProperties.value(path);
		bind(textProp, text, object, dbc, property, targetToModelUpdate, modelToTargetUpdate);
	}

	
	/**
	 * 
	 * @param text
	 * @param object
	 * @param dbc
	 * @param targetToModelUpdate
	 * @param modelToTargetUpdate
	 * @param editingDomain
	 * @param feature
	 */
	public static void bindText(Text text, Object object, DataBindingContext dbc,
			UpdateValueStrategy<String, String> targetToModelUpdate, UpdateValueStrategy<String, String> modelToTargetUpdate,
			EditingDomain editingDomain, EStructuralFeature feature) {
		IWidgetValueProperty<Text, String> textProp = WidgetProperties.text(SWT.Modify);
		IEMFEditValueProperty property = EMFEditProperties.value(editingDomain, feature);

		bind(textProp, text,object, dbc, property, targetToModelUpdate, modelToTargetUpdate);
	}

	
	
}
