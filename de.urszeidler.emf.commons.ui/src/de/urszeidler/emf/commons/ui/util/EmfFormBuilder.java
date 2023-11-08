/**
 * <copyright>
 *
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: FormBuilder.java,v 1.1 2009/06/06 16:04:12 tschindl Exp $
 */
package de.urszeidler.emf.commons.ui.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.property.list.IListProperty;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.databinding.edit.IEMFEditValueProperty;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.jface.databinding.viewers.IViewerObservableList;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.typed.ViewerProperties;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ImageHyperlink;

import de.urszeidler.commons.Trio;
import de.urszeidler.emf.commons.ui.binding.Binder;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry.EntryFactory;
import de.urszeidler.emf.commons.ui.util.converter.EnumConverter;
import de.urszeidler.emf.commons.ui.util.converter.ReferenceConverter;
import de.urszeidler.emf.commons.ui.util.widgets.EmfCompositeContainer;
import de.urszeidler.emf.commons.ui.validators.EmptyStringValidator;

/**
 * Helper class which builds a two column form with labels and text-fields
 * 
 * @param <P>
 *            the value property type
 */
public class EmfFormBuilder {
	private List<FormbuilderEntry> entries = new ArrayList<FormbuilderEntry>();
	private final FormToolkit toolkit;
	private GridData multiLabelGridData;
	private GridData multiControlGridData;
	private GridData controlGridData;
	private GridData labelGridData;
	private int border = SWT.BORDER;
	private String nullString = "[null]";
	protected ILabelProvider labelProvider;
	protected ComposedAdapterFactory adapterFactory;
	protected AdapterFactoryItemDelegator itemDelegator;
	protected EditingDomain editingDomain;

	/**
	 * @author urs
	 */
	public interface ReferenceManager {

		void handleManage(FormbuilderEntry e, EObject object);

		void handleRemove(FormbuilderEntry e, EObject object);

		Object handleAdd(FormbuilderEntry e, EObject object);

	}

	protected ReferenceManager manager;
	private ISelectionChangedListener selectionChangeListener;
	private boolean useHyperLink = true;
	private IDoubleClickListener dblListner = null;

	// public EmfFormBuilder(FormToolkit toolkit) {
	// this.toolkit = toolkit;
	// }

	public EmfFormBuilder(FormToolkit toolkit,
			AdapterFactoryItemDelegator itemDelegator,
			EditingDomain editingDomain) {
		super();
		this.toolkit = toolkit;
		this.itemDelegator = itemDelegator;
		this.editingDomain = editingDomain;
		manager = new DefaultReferenceManager(itemDelegator);
	}

	public EmfFormBuilder(FormToolkit toolkit,
			AdapterFactoryItemDelegator itemDelegator,
			ILabelProvider labelProvider, EditingDomain editingDomain) {
		super();
		this.toolkit = toolkit;
		this.itemDelegator = itemDelegator;
		this.editingDomain = editingDomain;
		this.labelProvider = labelProvider;
		manager = new DefaultReferenceManager(itemDelegator);
	}

	/**
	 * Add a seperator entry
	 * 
	 * @return the created entry
	 * @since 1.0
	 */
	public FormbuilderEntry addSeperatorEntry() {
		FormbuilderEntry entry = new FormbuilderEntry(null, null, null, null);
		entries.add(entry);
		return entry;
	}

	/**
	 * Add a seperator entry
	 * 
	 * @return the created entry
	 */
	public FormbuilderEntry addSeperatorEntry(Composite parent) {
		FormbuilderEntry entry = new FormbuilderEntry(null, null, null, null,
				parent);
		entries.add(entry);
		return entry;
	}

	/**
	 * Adds all direct features of the given eclass as entries.
	 * 
	 * @param parent
	 *            the parent composite
	 * @since 1.0
	 */
	public void addAllEntries(EClass eclass, Composite parent) {

		EList<EStructuralFeature> eStructuralFeatures = eclass
				.getEStructuralFeatures();
		for (EStructuralFeature eStructuralFeature : eStructuralFeatures) {
			// String label = labelProvider.getText(eStructuralFeature);
			addTextEntry(eStructuralFeature, parent);
		}

	}

	/**
	 * Adds all direct features of the given eclass as entries.
	 * 
	 * @param parent
	 *            the parent composite
	 */
	public void addAllEntries(
			List<? extends EStructuralFeature> eStructuralFeatures,
			Composite parent) {
		for (EStructuralFeature eStructuralFeature : eStructuralFeatures) {
			// String label = labelProvider.getText(eStructuralFeature);
			addTextEntry(eStructuralFeature, parent);
		}

	}

	/**
	 * Adds all direct features of the given eclass as entries.
	 */
	public void addAllEntries(EClass eclass) {
		addAllEntries(eclass, null);
	}

	/**
	 * Add a text entry
	 * 
	 * @param label
	 *            the label to display
	 * @param property
	 *            the property to bind
	 * @param nullMessage
	 *            the message shown when the property gets set to null
	 */
	public void addTextEntry(String label, EStructuralFeature property,
			String nullMessage) {
		entries.add(new FormbuilderEntry(label, property,
				new EMFUpdateValueStrategy()
						.setBeforeSetValidator(new EmptyStringValidator(
								nullMessage)), new EMFUpdateValueStrategy()));
	}

	/**
	 * Add a text entry
	 * 
	 * @param label
	 *            the label to display
	 * @param property
	 *            the property to bind
	 * @param nullMessage
	 *            the message shown when the property gets set to null
	 * @since 1.0
	 */
	public void addTextEntry(String label, EStructuralFeature property,
			String nullMessage, Composite parent) {
		entries.add(new FormbuilderEntry(label, property,
				new EMFUpdateValueStrategy()
						.setBeforeSetValidator(new EmptyStringValidator(
								nullMessage)), new EMFUpdateValueStrategy(),
				parent));
	}

	/**
	 * Add a text entry, and the text will be the localized feature name.
	 * 
	 * @param property
	 *            the property to bind
	 * @param nullMessage
	 *            the message shown when the property gets set to null
	 * @since 1.0
	 */
	public void addTextEntry(EStructuralFeature property, String nullMessage,
			Composite parent) {
		entries.add(new FormbuilderEntry(null, property,
				new EMFUpdateValueStrategy()
						.setBeforeSetValidator(new EmptyStringValidator(
								nullMessage)), new EMFUpdateValueStrategy(),
				parent));
	}

	/**
	 * Add a text entry
	 * 
	 * @param label
	 *            the label to display
	 * @param property
	 *            the property to bind
	 * @param nullMessage
	 *            the message shown when the property gets set to null
	 */
	public void addTextEntry(String label, EStructuralFeature property) {
		entries.add(new FormbuilderEntry(label, property,
				new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy()));
	}

	/**
	 * Add a text entry
	 * 
	 * @param label
	 *            the label to display
	 * @param property
	 *            the property to bind
	 * @param nullMessage
	 *            the message shown when the property gets set to null
	 * @since 1.0
	 */
	public void addTextEntry(String label, EStructuralFeature property,
			Composite parent, EntryFactory factory) {
		FormbuilderEntry e = new FormbuilderEntry(label, property,
						new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy(),
						parent);
		entries.add(e);
		e.setEntryFactory(factory);
	}

	/**
	 * Add a text entry
	 * 
	 * @param label
	 *            the label to display
	 * @param property
	 *            the property to bind
	 * @param nullMessage
	 *            the message shown when the property gets set to null
	 * @since 1.0
	 */
	public void addTextEntry(String label, EStructuralFeature property,
			Composite parent) {
		FormbuilderEntry e = new FormbuilderEntry(label, property,
						new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy(),
						parent);
		entries.add(e);		
	}

    /**
     * Add a text entry
     * 
     * @param property
     *            the property to bind
     * @param nullMessage
     *            the message shown when the property gets set to null
     * @since 1.0
     */
    public void addTextEntry(EObject innerObject, EStructuralFeature property, Composite parent) {
        FormbuilderEntry e = new FormbuilderEntry(null, property,
                new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy(),
                parent);
        e.innerObject = innerObject;
        entries.add(e);
    }

    /**
     * Add a text entry
     * 
     * @param property
     *            the property to bind
     * @param nullMessage
     *            the message shown when the property gets set to null
     * @since 1.0
     */
    public void addTextEntry(EStructuralFeature property, Composite parent) {
        entries.add(new FormbuilderEntry(null, property,
                new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy(),
                parent));
    }

	/**
	 * Add a text entry
	 * 
	 * @param property
	 *            the property to bind
	 * @param nullMessage
	 *            the message shown when the property gets set to null
	 * @since 1.0
	 */
	public void addTextEntry(EStructuralFeature property, Composite parent, EntryFactory factory) {
		FormbuilderEntry e = new FormbuilderEntry(null, property,
				new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy(),
				parent);
		entries.add(e);
		e.setEntryFactory(factory);
		
	}

	/**
	 * Add a text entry
	 * 
	 * @param property
	 *            the property to bind
	 * @param nullMessage
	 *            the message shown when the property gets set to null
	 * @since 1.0
	 */
	public void addTextEntry(EStructuralFeature property, Composite parent,
			GridData controlGridData) {
		entries.add(new FormbuilderEntry((String) null, property,
				new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy(),
				parent, controlGridData));
	}

	/**
	 * Add a text entry
	 * 
	 * @param label
	 *            the label to display
	 * @param property
	 *            the property to bind
	 * @param modelToTarget
	 * @param targetToModel
	 * @param nullMessage
	 *            the message shown when the property gets set to null
	 */
	public void addTextEntry(String label, EStructuralFeature property,
			UpdateValueStrategy modelToTarget, UpdateValueStrategy targetToModel) {
		entries.add(new FormbuilderEntry(label, property, modelToTarget,
				targetToModel));
	}

	public void addTextEntry(String label, EStructuralFeature property,
			GridData controlGridData) {
		entries.add(new FormbuilderEntry(label, property,
				new EMFUpdateValueStrategy(), new EMFUpdateValueStrategy(),
				controlGridData));

	}

	public void addEntry(FormbuilderEntry entry) {
		entries.add(entry);
	}

	/**
	 * Build a two column form with the elements added build a container(in
	 * parent) holding the widgets
	 * 
	 * @param dbc
	 *            the databinding context
	 * @param parent
	 *            the parent the form is created on
	 * @param object
	 *            the object to bind
	 * @return the form container
	 */
	public Composite build(DataBindingContext dbc, Composite parent,
			EObject object) {
		Composite container = createMainCompsite(parent);
		container.setLayout(new GridLayout(3, false));

		buildinComposite(dbc, container, object);

		return container;
	}

	/**
	 * build the widget in the container, expect the container to have a grid
	 * layout
	 * 
	 * @param dbc
	 * @param object
	 * @param container
	 */
	public void buildinComposite(DataBindingContext dbc, Composite parent,
			EObject object) {
		initLayoutData();

		for (FormbuilderEntry e : entries) {
			Control ctr = null;

			Composite container;
			if (e.getParent() != null)
				container = e.getParent();
			else
				container = parent;

			if (e.feature == null) {
				createSeperator(container, e);
				continue;
			}

			if(e.getEntryFactory()!=null){
				e.getEntryFactory().createEntry(container, e, object, dbc,this);
				continue;
			}
			
			EClassifier eType = e.feature.getEType();
			if (e.feature instanceof EReference) {
				createReference(container, e, object, dbc);
			} else if (eType instanceof EEnum) {
				ctr = createEEnum(container, e, object, dbc);

			} else if (eType.getInstanceClassName().equals("boolean")) {
				ctr = createBoolean(container, e, object, dbc);
			} else if (e.feature.isMany()) {

				// Label l = createLabel(container);
				// if (e.label != null)
				// l.setText(e.label);
				// else {
				// String featureName = toFeatureName(e, object);
				// l.setText(featureName);
				// }
				// EmfCompositeContainer emfCompositeContainer = new
				// EmfCompositeContainer(container, border, labelProvider,
				// editingDomain, e, object,
				// manager, toolkit);
				// layoutMultiRow(e, null, emfCompositeContainer);
				ctr = createMultiContainer(container, e, object);

				// Trio<TableViewer, Composite, Label> row =
				// createTableRow(container, e, object);
				//
				// createManageButton(e, object, row.getObjectB());
				// layoutMultiRow(e, row.getObjectC(), row.getObjectB());
				// ctr = row.getObjectA().getControl();

			} else
				ctr = createText(container, e, object, dbc);

			if (ctr != null)
				ctr.setEnabled(e.feature.isChangeable());

		}
	}

	private void createSeperator(Composite container, FormbuilderEntry e) {
		Composite separator = toolkit.createCompositeSeparator(container);
		if (e.labelGridData != null) {
			separator.setLayoutData(GridDataFactory.copyData(e.labelGridData));
		} else {
			GridData multiLabelGridData = new GridData();
			multiLabelGridData.horizontalSpan = 3;
			// multiLabelGridData.verticalSpan = 1;
			multiLabelGridData.verticalAlignment = GridData.BEGINNING;
			multiLabelGridData.heightHint = 1;
			separator.setLayoutData(multiLabelGridData);
		}

	}

	/**
	 * initalise the gridData if necessary
	 */
	private void initLayoutData() {
		if (multiLabelGridData == null) {
			multiLabelGridData = new GridData();
			multiLabelGridData.horizontalSpan = 1;
			multiLabelGridData.verticalSpan = 3;
			multiLabelGridData.verticalAlignment = GridData.BEGINNING;
		}
		if (multiControlGridData == null) {
			multiControlGridData = new GridData();
			multiControlGridData.horizontalSpan = 2;
			multiControlGridData.verticalSpan = 3;
			multiControlGridData.grabExcessHorizontalSpace = true;
			multiControlGridData.horizontalAlignment = GridData.FILL;
			multiControlGridData.heightHint = 65;
		}
		if (controlGridData == null) {
			controlGridData = new GridData();
			controlGridData.horizontalSpan = 2;
			controlGridData.grabExcessHorizontalSpace = true;
			controlGridData.horizontalAlignment = GridData.FILL;
		}
	}

	/**
	 * Creates a check button as boolean widget.
	 * 
	 * @param container
	 * @param e
	 * @param object
	 * @param dbc
	 * @return
	 */
	private Control createBoolean(Composite container, FormbuilderEntry e,
			EObject object, DataBindingContext dbc) {
		Label l = createLabel(container);
		l.setText("");
		String featureName = e.label;
		if (e.label == null)
			featureName = toFeatureName(e, object);
		l.setText(featureName);
		l.setToolTipText(toTooltipName(e, object));

		Button btnTest = createButton(container, featureName, SWT.CHECK);
		Binder.bind(WidgetProperties.buttonSelection(), btnTest, object, dbc,
				e.targetTomodel, e.modelToTarget, editingDomain, e.feature);
		layoutRow(e, l, btnTest);
		return btnTest;
	}

	private Control createText(Composite container, FormbuilderEntry e,
			EObject object, DataBindingContext dbc) {
	    IItemPropertyDescriptor descriptor;
        if(e.innerObject==null)	    
	        descriptor = itemDelegator
				.getPropertyDescriptor(object, e.feature);
	    else
	        descriptor = itemDelegator
            .getPropertyDescriptor(e.innerObject, e.feature);
	    
		if (!e.feature.isMany()) {
			Label l = createConfiguredLable(container, e, object);

			if (descriptor.isMultiLine(object)) {
				IWidgetValueProperty textProp = WidgetProperties
						.text(SWT.Modify);
				Text text = createMultiWrapText(container);
				
				if(e.innerObject==null)
				Binder.bind(textProp, text, object, dbc, e.targetTomodel,
						e.modelToTarget, editingDomain, e.feature);
				else
	                Binder.bind(textProp, text, e.innerObject, dbc, e.targetTomodel,
	                        e.modelToTarget, editingDomain, e.feature);
				    
				//TODO

				// text.setLayoutData(GridDataFactory.copyData(multiControlGridData));
				// l.setLayoutData(GridDataFactory.copyData(multiLabelGridData));
				layoutMultiRow(e, l, text);
				return text;
			} else {

				IWidgetValueProperty textProp = WidgetProperties
						.text(SWT.Modify);
				Text text = createText(container);

				Binder.bind(textProp, text, object, dbc, e.targetTomodel,
						e.modelToTarget, editingDomain, e.feature);

				layoutRow(e, l, text);
				return text;
			}
		} else {

		}
		return null;
	}

	/**
	 * layout the row normal
	 * 
	 * @param e
	 * @param l
	 * @param inputWidget
	 */
	public void layoutRow(FormbuilderEntry e, Label l, Control inputWidget) {
		if (e.labelGridData != null) {
			l.setLayoutData(GridDataFactory.copyData(e.labelGridData));
		} else {
			if (labelGridData != null)
				l.setLayoutData(GridDataFactory.copyData(labelGridData));
		}
		if (e.controlGridData != null) {
			inputWidget.setLayoutData(GridDataFactory
					.copyData(e.controlGridData));
		} else
			inputWidget
					.setLayoutData(GridDataFactory.copyData(controlGridData));

	}

	/**
	 * layout the row as multi widget
	 * 
	 * @param e
	 * @param l
	 * @param inputWidget
	 */
	public void layoutMultiRow(FormbuilderEntry e, Label l, Control inputWidget) {
		if (l != null) {
			if (e.labelGridData != null) {
				l.setLayoutData(GridDataFactory.copyData(e.labelGridData));
			} else {
				if (multiLabelGridData != null)
					l.setLayoutData(GridDataFactory
							.copyData(multiLabelGridData));
			}
		}
		if (inputWidget != null) {
			if (e.controlGridData != null) {
				inputWidget.setLayoutData(GridDataFactory
						.copyData(e.controlGridData));
			} else
				inputWidget.setLayoutData(GridDataFactory
						.copyData(multiControlGridData));
		}
	}

	private Control createEEnum(Composite container, FormbuilderEntry e,
			EObject object, DataBindingContext dbc) {
		final EEnum eenum = ((EEnum) e.feature.getEType());
		if (!e.feature.isMany()) {
			Label l = createConfiguredLable(container, e, object);

			Combo combo = new Combo(container, SWT.READ_ONLY);
			ComboViewer countryViewer = new ComboViewer(combo);

			LabelProvider labelProvider2 = createLabelProvider(e, object);
			countryViewer.setLabelProvider(labelProvider2);
			countryViewer
					.setContentProvider(ArrayContentProvider.getInstance());

			countryViewer.setInput(((EEnum) e.feature.getEType())
					.getELiterals());

			IViewerObservableValue<?> uiObs = ViewerProperties.singleSelection().observe(countryViewer);
			e.uiObservable = uiObs;
			IEMFValueProperty property = null;
			if (editingDomain != null)
				property = EMFEditProperties.value(editingDomain, e.feature);
			else
				property = EMFProperties.value(e.feature);
			e.property = property;

			IObservableValue mObs;// = property.observe(object);// EMFObservables.observeDetailValue(Realm.getDefault(),
		     if(e.innerObject==null)
		            mObs = property.observe(object);
		        else
		            mObs = property.observe(e.innerObject);

			
			EMFUpdateValueStrategy updateValueStrategy = new EMFUpdateValueStrategy();
			updateValueStrategy.setConverter(new EnumConverter(eenum));// ,e.feature,itemDelegator,object));
			dbc.bindValue(uiObs, mObs, updateValueStrategy, updateValueStrategy);
			layoutRow(e, l, combo);
			return combo;
		} else {
			createMultiContainer(container, e, object);
			// Trio<TableViewer, Composite, Label> row =
			// createTableRow(container, e, object);
			// createManageButton(e, object, row.getObjectB());
			// layoutRow(e, row.getObjectC(), row.getObjectB());
		}

		return null;
	}

	/**
	 * Get the tooltip.
	 * 
	 * @param e
	 * @param object
	 * @return
	 */
	public String toTooltipName(FormbuilderEntry e, EObject object) {
		IItemPropertyDescriptor propertyDescriptor = itemDelegator
				.getPropertyDescriptor(object, e.feature);
		if (propertyDescriptor == null)
			return itemDelegator.getText(e.feature);

		String displayName = propertyDescriptor.getDescription(e.getFeature());
		return displayName;
	}

	/**
	 * Creates the label provider for comboboxes and for tables.
	 * 
	 * @param e
	 * @param object
	 * @return
	 */
	public LabelProvider createLabelProvider(FormbuilderEntry e, EObject object) {
		IItemPropertyDescriptor descriptor = itemDelegator
				.getPropertyDescriptor(object, e.feature);
		if (descriptor == null)
			return null;
		final IItemLabelProvider labelProvider1 = descriptor
				.getLabelProvider(object);
		LabelProvider labelProvider2 = new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof EEnumLiteral) {
					EEnumLiteral elit = (EEnumLiteral) element;
					String text = labelProvider1.getText(elit.getInstance());
					return text;

				} else
					return labelProvider1.getText(element);
			}

		};
		return labelProvider2;
	}

	/**
	 * Creates a single reference as a hyperlink label.
	 * 
	 * @param container
	 * @param e
	 * @param object
	 * @param dbc
	 * @return
	 */
	private Control createReferenceLink(Composite container,
			final FormbuilderEntry e, final EObject object,
			DataBindingContext dbc) {

		Label l = createConfiguredLable(container, e, object);

		final ImageHyperlink srcLink = createLinkWidget(container);

		srcLink.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e1) {
				handleManage(e, object);
			}

			public void linkEntered(HyperlinkEvent e) {
			}

			public void linkExited(HyperlinkEvent e) {
			}
		});

		// ISWTObservableValue uiObs = SWTObservables.observeText(srcLink);
		IValueProperty property = null;
		if (editingDomain != null)
			property = EMFEditProperties.value(editingDomain, e.feature);
		else
			property = EMFProperties.value(e.feature);

        final IObservableValue mObs;
        Object value;
        if (e.innerObject == null) {
            mObs = property.observe(object);
            value = object.eGet(e.feature);
        } else {
            mObs = property.observe(e.innerObject);
            value = e.innerObject.eGet(e.feature);
        }	     

	        String element = value == null ? nullString : labelProvider
	                .getText(value);
	        srcLink.setText(element);
	        srcLink.setImage(labelProvider.getImage(value));


	      
//	      final IObservableValue mObs = property.observe(object);
		e.observable = mObs;

		mObs.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				Object value = event.getObservableValue().getValue();
				srcLink.setText(value == null ? nullString : labelProvider
						.getText(value));
				srcLink.setImage(labelProvider.getImage(value));
			}
		});

		layoutRow(e, l, srcLink);
		return srcLink;
	}

	private ImageHyperlink createLinkWidget(Composite container) {
		if (toolkit == null)
			return new ImageHyperlink(container, SWT.NONE);
		else {
			ImageHyperlink srcLink = toolkit.createImageHyperlink(container,
					SWT.NONE);
			toolkit.paintBordersFor(srcLink);
			return srcLink;
		}
	}

	/**
	 * Returns the localized feature name.
	 * 
	 * @param e
	 * @param object
	 * @return
	 */
	public String toFeatureName(final FormbuilderEntry e, final EObject object) {
		IItemPropertyDescriptor propertyDescriptor = itemDelegator
				.getPropertyDescriptor(object, e.feature);
		if (propertyDescriptor == null)
			return itemDelegator.getText(e.feature);

		String displayName = propertyDescriptor.getDisplayName(e.getFeature());
		return displayName;
	}

	private Control createReference(Composite container,
			final FormbuilderEntry e, final EObject object,
			DataBindingContext dbc) {
		IItemPropertyDescriptor descriptor = itemDelegator
				.getPropertyDescriptor(object, e.feature);
		// TODO : there could also be an singel reference with is a
		// containments, so we need another widget.
		if (!e.feature.isMany()) {
			if (useHyperLink)
				return createReferenceLink(container, e, object, dbc);
			else
				return createReferenceComboBox(container, e, object, dbc,
						descriptor);

		} else {

			EmfCompositeContainer emfCompositeContainer = createMultiContainer(
					container, e, object);
			return emfCompositeContainer;

			// Trio<TableViewer, Composite, Label> row =
			// createTableRow(container, e, object);
			//
			// if (((EReference)e.feature).isContainment()) {
			// createAddRemoveButtons(e, object, row.getObjectB(),
			// row.getObjectA());
			// } else {
			// createManageButton(e, object, row.getObjectB());
			// }
			// // layoutRow(e, row.getObjectC(), row.getObjectB());
			// layoutMultiRow(e, row.getObjectC(), row.getObjectB());
			//
			// return row.getObjectA().getControl();
		}
		// return null;
	}

	private EmfCompositeContainer createMultiContainer(Composite container,
			final FormbuilderEntry e, final EObject object) {
		Label l = createConfiguredLable(container, e, object);
		ILabelProvider labelProvider1 = null;
		if (e.feature.getEType().eClass().equals(EcorePackage.Literals.EENUM)) {
			labelProvider1 = createLabelProvider(e, object);
			if (labelProvider1 == null)
				labelProvider1 = labelProvider;
		} else
			labelProvider1 = labelProvider;

		EmfCompositeContainer emfCompositeContainer = new EmfCompositeContainer(
				container, SWT.NONE, labelProvider1, editingDomain, e, object,
				manager, toolkit, dblListner, selectionChangeListener);
		layoutMultiRow(e, l, emfCompositeContainer);
		return emfCompositeContainer;
	}

	/**
	 * @param container
	 * @param e
	 * @param object
	 * @return
	 */
	public Label createConfiguredLable(Composite container,
			final FormbuilderEntry e, final EObject object) {
		Label l = createLabel(container);
		if (e.label != null) {
			l.setText(e.label);
			if (!e.label.isEmpty())
				l.setToolTipText(toTooltipName(e, object));
		} else {
			String featureName = toFeatureName(e, object);
			l.setText(featureName);
			l.setToolTipText(toTooltipName(e, object));
		}
		return l;
	}

	/**
	 * Create the reference as a combobox.
	 * 
	 * @param container
	 * @param e
	 * @param object
	 * @param dbc
	 * @param descriptor
	 * @return
	 */
	private Control createReferenceComboBox(Composite container,
			final FormbuilderEntry e, final EObject object,
			DataBindingContext dbc, IItemPropertyDescriptor descriptor) {
		if (descriptor == null)
			return null;

		Label l = createConfiguredLable(container, e, object);

		Combo combo = new Combo(container, SWT.READ_ONLY);
		ComboViewer countryViewer = new ComboViewer(combo);

		if (labelProvider != null)
			countryViewer.setLabelProvider(labelProvider);
		countryViewer.setContentProvider(ArrayContentProvider.getInstance());
		countryViewer.setInput(NullObject.toChoises(descriptor
				.getChoiceOfValues(object)));

		IViewerObservableValue uiObs = ViewerProperties.singleSelection().observe(countryViewer);

		IEMFEditValueProperty property = EMFEditProperties.value(editingDomain,
				e.feature);
		
		IObservableValue mObs = null;
		if(e.innerObject==null)
		    mObs = property.observe(object);
		else
		    mObs = property.observe(e.innerObject);
		
		EMFUpdateValueStrategy updateValueStrategy = new EMFUpdateValueStrategy();
		updateValueStrategy.setConverter(new ReferenceConverter());
		
		dbc.bindValue(uiObs, mObs, updateValueStrategy, e.modelToTarget);
		layoutRow(e, l, combo);
		return combo;
	}

	/**
	 * creates an table row, the label the table etc
	 * 
	 * @param container
	 * @param e
	 * @param object
	 * @return a trio with the table and filler label and the composite for the
	 *         buttons
	 */
	private Trio<TableViewer, Composite, Label> createTableRow(
			Composite container, final FormbuilderEntry e, final EObject object) {
		Label l = createConfiguredLable(container, e, object);

		int style = SWT.SINGLE | border | SWT.H_SCROLL | SWT.V_SCROLL
				| SWT.FULL_SELECTION | SWT.HIDE_SELECTION;

		Table table = toolkit.createTable(container, style);

		TableViewer tableViewer = new TableViewer(table);
		tableViewer.setUseHashlookup(true);
		tableViewer.setColumnProperties(new String[] { "name" });

		LabelProvider labelProvider1 = createLabelProvider(e, object);
		if (labelProvider1 != null)
			tableViewer.setLabelProvider(labelProvider1);
		else if (labelProvider != null)
			tableViewer.setLabelProvider(labelProvider);

		ObservableListContentProvider provider = new ObservableListContentProvider();
		tableViewer.setContentProvider(provider);

		if (selectionChangeListener != null)
			tableViewer.addSelectionChangedListener(selectionChangeListener);

		IViewerObservableList<?> uiObs = ViewerProperties.multipleSelection().observe(tableViewer);
		e.uiObservable = uiObs;
		IListProperty property = null;
		if (editingDomain != null)
			property = EMFEditProperties.list(editingDomain, e.feature);
		else
			property = EMFProperties.list(e.feature);

		e.property = property;

		IObservableList mObs = property.observe(object);
		e.observable = mObs;

		tableViewer.setInput(mObs);
		layoutMultiRow(e, l, table);

		l = createLabel(container);
		Composite composite = createComposite(container);
		GridLayout layout = new GridLayout(4, false);
		layout.marginBottom = 0;
		layout.marginHeight = 0;
		layout.marginRight = 0;
		layout.marginLeft = 0;
		layout.marginTop = 0;
		layout.marginWidth = 0;
		composite.setLayout(layout);

		Trio<TableViewer, Composite, Label> trio = new Trio<TableViewer, Composite, Label>(
				tableViewer, composite, l);
		return trio;
	}

	/**
	 * creates the manage button in the composite an a proper layout
	 * 
	 * @param e
	 * @param object
	 * @param composite
	 * @param table
	 */
	private void createManageButton(final FormbuilderEntry e,
			final EObject object, Composite composite) {
		Label filler5 = createLabel(composite);
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		filler5.setLayoutData(gridData);
		filler5 = createLabel(composite);

		filler5 = createLabel(composite);

		Button button_add = createButton(composite, "Manage", SWT.PUSH);
		button_add.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent se) {
				handleManage(e, object);
			}
		});
	}

	/**
	 * @param e
	 * @param object
	 * @param composite
	 * @param table
	 */
	private void createAddRemoveButtons(final FormbuilderEntry e,
			final EObject object, Composite composite, final TableViewer table) {
		Label filler5 = createLabel(composite);
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;

		filler5.setLayoutData(gridData);
		filler5 = createLabel(composite);
		Button button_add = createButton(composite, "+", SWT.PUSH);
		Button button_delete = createButton(composite, "-", SWT.PUSH);

		button_add.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent se) {
				handleAdd(e, object);
				table.refresh(true);
			}
		});
		button_delete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent se) {
				handleRemove(e, object);
			}

		});
	}

	protected void handleManage(FormbuilderEntry e, EObject object) {
		if (manager != null)
			manager.handleManage(e, object);
	}

	protected void handleRemove(FormbuilderEntry e, EObject object) {
		if (manager != null)
			manager.handleRemove(e, object);
	}

	protected void handleAdd(FormbuilderEntry e, EObject object) {
		if (manager != null)
			manager.handleAdd(e, object);

	}

	private Button createButton(Composite container, String text, int style) {
		if (toolkit == null) {
			Button button = new Button(container, style);
			button.setText(text);
			return button;
		} else
			return toolkit.createButton(container, text, style);
	}

	private Table createTable(Composite container, int style) {
		if (toolkit == null)
			return new Table(container, style);
		else
			return toolkit.createTable(container, style);
	}

	private Widget createIntegerWidget(Composite container) {
		if (toolkit == null)
			return new Text(container, border);
		else
			return toolkit.createText(container, "", border);
	}

	/**
	 * Helper method to create a multi line text field.
	 * 
	 * @param container
	 * @return
	 */
	private Text createMultiWrapText(Composite container) {
		Text t = null;
		if (toolkit == null)
			t = new Text(container, border | SWT.MULTI | SWT.WRAP);
		else
			t = toolkit.createText(container, "", border | SWT.MULTI | SWT.WRAP
					| SWT.V_SCROLL);

		return t;
	}

	/**
	 * @param container
	 * @return
	 */
	private Text createText(Composite container) {
		if (toolkit == null) {

			return new Text(container, border);
		} else
			return toolkit.createText(container, "", border);
	}

	/**
	 * @param container
	 * @return
	 */
	public Label createLabel(Composite container) {
		if (toolkit == null)
			return new Label(container, SWT.NONE);
		else
			return toolkit.createLabel(container, "", SWT.NONE);
	}

	/**
	 * @param parent
	 * @return
	 */
	private Composite createMainCompsite(Composite parent) {
		if (toolkit == null)
			return new Composite(parent, SWT.NONE);
		else
			return toolkit.createComposite(parent, SWT.NONE);
	}

	/**
	 * Disposes all the obervables.
	 */
	public void dispose() {
		for (FormbuilderEntry e : entries) {
			if (e.observable != null) {
				e.observable.dispose();
			}
			if (e.uiObservable != null) {
				e.uiObservable.dispose();
			}
		}
	}

	/**
	 * @param parent
	 * @return
	 */
	private Composite createComposite(Composite parent) {
		if (toolkit == null)
			return new Composite(parent, SWT.NONE);
		else
			return toolkit.createComposite(parent, SWT.NONE);
	}

	public void setMultiLabelGridData(GridData multiLabelGridData) {
		this.multiLabelGridData = multiLabelGridData;
	}

	public void setMultiControlGridData(GridData multiControlGridData) {
		this.multiControlGridData = multiControlGridData;
	}

	/**
	 * The controll grid data overriding the default one.
	 * 
	 * @param controlGridData
	 */
	public void setControlGridData(GridData controlGridData) {
		this.controlGridData = controlGridData;
	}

	/**
	 * Set an ReferenceMananger to handle the buttons.
	 * 
	 * @param manager
	 */
	public void setManager(ReferenceManager manager) {
		this.manager = manager;
	}

	/**
	 * An optional selection listner for the referenceTableWidget.
	 * 
	 * @param selectionChangeListener
	 */
	public void setSelectionChangeListener(
			ISelectionChangedListener selectionChangeListener) {
		this.selectionChangeListener = selectionChangeListener;
	}

	public void setBorderStyle(int none) {
		border = none;
	}

	public void setNullString(String nullString) {
		this.nullString = nullString;
	}

	public void setUseHyperLink(boolean useHyperLink) {
		this.useHyperLink = useHyperLink;
	}

	public void setDblListner(IDoubleClickListener dblListner) {
		this.dblListner = dblListner;
	}

}