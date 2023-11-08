package de.urszeidler.emf.commons.ui.util;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.property.IProperty;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

public class FormbuilderEntry {

	public interface EntryFactory{		
		void createEntry(Composite container, FormbuilderEntry entry, EObject object, DataBindingContext dbc, EmfFormBuilder emfFormBuilder);
	}
	
	EObject innerObject;
    String label;
	EStructuralFeature feature;
	UpdateValueStrategy modelToTarget;
	UpdateValueStrategy targetTomodel;
	GridData controlGridData;
	GridData labelGridData;
	IProperty property;
	IObservable observable;
	IObservable uiObservable;
	FeaturePath path;
	private Composite parent;
	private EntryFactory entryFactory;

	public FormbuilderEntry(String label, EStructuralFeature feature, UpdateValueStrategy modelToTarget,
			UpdateValueStrategy targetTomodel) {
		super();
		this.label = label;
		this.feature = feature;
		this.modelToTarget = modelToTarget;
		this.targetTomodel = targetTomodel;
	}

	// private Entry(String label, EStructuralFeature property) {
	// this.label = label;
	// this.property = property;
	//
	// }

	public FormbuilderEntry(String label, EStructuralFeature property, EMFUpdateValueStrategy modelToTarget,
			EMFUpdateValueStrategy targetTomodel, GridData controlGridData) {
		this.label = label;
		this.feature = property;
		this.modelToTarget = modelToTarget;
		this.targetTomodel = targetTomodel;
		this.controlGridData = controlGridData;
	}

	public FormbuilderEntry(String label, EStructuralFeature feature, UpdateValueStrategy modelToTarget,
			UpdateValueStrategy targetTomodel, Composite parent) {
		this(label, feature, modelToTarget, targetTomodel);
		this.parent = parent;
	}

	public FormbuilderEntry(String label, EStructuralFeature feature, UpdateValueStrategy modelToTarget,
            UpdateValueStrategy targetTomodel, Composite parent, GridData controlGridData) {
	    this(label, feature, modelToTarget, targetTomodel);
        this.parent = parent;
        this.controlGridData = controlGridData;
    }

    /**
	 * @return the feature
	 */
	public EStructuralFeature getFeature() {
		return feature;
	}

	public IProperty getProperty() {
		return property;
	}

	public IObservable getObservable() {
		return observable;
	}

	public IObservable getUiObservable() {
		return uiObservable;
	}
	

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public UpdateValueStrategy getModelToTarget() {
		return modelToTarget;
	}

	public void setModelToTarget(UpdateValueStrategy modelToTarget) {
		this.modelToTarget = modelToTarget;
	}

	public UpdateValueStrategy getTargetTomodel() {
		return targetTomodel;
	}

	public void setTargetTomodel(UpdateValueStrategy targetTomodel) {
		this.targetTomodel = targetTomodel;
	}

	public GridData getControlGridData() {
		return controlGridData;
	}

	public void setControlGridData(GridData controlGridData) {
		this.controlGridData = controlGridData;
	}

	public GridData getLabelGridData() {
		return labelGridData;
	}

	public void setLabelGridData(GridData labelGridData) {
		this.labelGridData = labelGridData;
	}

	public void setFeature(EStructuralFeature feature) {
		this.feature = feature;
	}

	public void setProperty(IProperty property) {
		this.property = property;
	}

	public void setObservable(IObservable observable) {
		this.observable = observable;
	}

	public void setUiObservable(IObservable uiObservable) {
		this.uiObservable = uiObservable;
	}

	public Composite getParent() {
		return parent;
	}

	public void setParent(Composite parent) {
		this.parent = parent;
	}

	public EntryFactory getEntryFactory() {
		return entryFactory;
	}

	public void setEntryFactory(EntryFactory entryFactory) {
		this.entryFactory = entryFactory;
	}
	
    public EObject getInnerObject() {
        return innerObject;
    }


}