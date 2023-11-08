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
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.emf.commons.ui.binding.Binder;
import de.urszeidler.emf.commons.ui.validators.EmptyStringValidator;

/**
 * Helper class which builds a two column form with labels and text-fields
 * 
 * @param <P>
 *            the value property type
 */
public class FormBuilder<P extends IValueProperty> {
	private class Entry {
		private String label;
		private P property;
		private String nullMessage;
		private boolean wrap;

		private Entry(String label, P property, String nullMessage, boolean wrap) {
			this.label = label;
			this.property = property;
			this.nullMessage = nullMessage;
			this.wrap = wrap;
		}
	}

	private List<Entry> entries = new ArrayList<Entry>();
	private final FormToolkit toolkit;

	public FormBuilder(FormToolkit toolkit) {
		this.toolkit = toolkit;
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
	public void addTextEntry(String label, P property, String nullMessage) {
		entries.add(new Entry(label, property, nullMessage, false));
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
	public void addWrapTextEntry(String label, P property, String nullMessage) {
		entries.add(new Entry(label, property, nullMessage, true));
	}

	/**
	 * Build a two column form with the elements added
	 * 
	 * @param dbc
	 *            the databinding context
	 * @param parent
	 *            the parent the form is created on
	 * @param object
	 *            the object to bind
	 * @return the form container
	 */
	public Composite build(DataBindingContext dbc, Composite parent, Object object) {
		Composite container = createMainCompsite(parent);
		container.setLayout(new GridLayout(2, false));

		IWidgetValueProperty<?,String> textProp = WidgetProperties.text(SWT.Modify);
		//IWidgetValueProperty singleSelectionIndex = WidgetProperties.singleSelectionIndex();
		for (Entry e : entries) {

			Label l = createLabel(container);
			l.setText(e.label);

			Widget t = createWidget(container, e);
			Binder.bind(textProp, t, object, dbc, e.property, new EMFUpdateValueStrategy().setBeforeSetValidator(new EmptyStringValidator(
					e.nullMessage)), null);
			
//			IObservableValue uiObs = textProp.observeDelayed(400, t);
//			
//			
//			
//			IObservableValue mObs;
//
//			if (object instanceof IObservableValue) {
//				mObs = e.property.observeDetail((IObservableValue) object);
//			} else {
//				mObs = e.property.observe(object);
//			}
//			Binder
//			
//			dbc.bindValue(uiObs, mObs, new EMFUpdateValueStrategy().setBeforeSetValidator(new EmptyStringValidator(
//					e.nullMessage)), null);
		}

		return container;
	}

	/**
	 * @param container
	 * @param entry
	 * @return
	 */
	private Widget createWidget(Composite container, Entry entry) {
		Text t = null;
		if (entry.wrap) {
			t = createWrapText(container);
			GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
			layoutData.verticalSpan = 2;
			t.setLayoutData(layoutData);
		} else {
			t = createText(container);
			t.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		}
		return t;
	}

	private Text createWrapText(Composite container) {
		Text t = null;
		if (toolkit == null)
			t = new Text(container, SWT.BORDER | SWT.MULTI | SWT.WRAP);
		else
			t = toolkit.createText(container, "", SWT.BORDER| SWT.MULTI | SWT.WRAP  );

		return t;
	}

	/**
	 * @param container
	 * @return
	 */
	private Text createText(Composite container) {
		if (toolkit == null)
			return new Text(container, SWT.BORDER);
		else
			return toolkit.createText(container, "", SWT.BORDER);
	}

	/**
	 * @param container
	 * @return
	 */
	private Label createLabel(Composite container) {
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
}