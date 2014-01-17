/**
 * 
 */
package de.urszeidler.shr5.ecp.widgets;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.core.databinding.observable.list.ListDiff;
import org.eclipse.core.databinding.observable.list.ListDiffVisitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.internal.swt.Activator;
import org.eclipse.emf.ecp.edit.internal.swt.actions.ECPSWTAction;
import org.eclipse.emf.ecp.edit.internal.swt.controls.ControlMessages;
import org.eclipse.emf.ecp.edit.internal.swt.controls.ReferenceMultiControlTester;
import org.eclipse.emf.ecp.edit.internal.swt.util.ECPObservableValue;
import org.eclipse.emf.ecp.edit.internal.swt.util.SWTControl;
import org.eclipse.emf.ecp.edit.spi.ECPControl;
import org.eclipse.emf.ecp.edit.spi.ECPControlDescription;
import org.eclipse.emf.ecp.edit.spi.ECPControlFactory;
import org.eclipse.emf.ecp.edit.spi.util.ECPApplicableTester;
import org.eclipse.emf.ecp.edit.spi.util.ECPStaticApplicableTester;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

/**
 * @author urs
 *
 */
@Deprecated
@SuppressWarnings("restriction")
public class BeschreibbarTableWidget extends SWTControl {

	public BeschreibbarTableWidget() {
		super();
	}


	private static final String ICONS_ARROW_DOWN_PNG = "icons/arrow_down.png";//$NON-NLS-1$
	private static final String ICONS_ARROW_UP_PNG = "icons/arrow_up.png";//$NON-NLS-1$

	private IObservableList model;
	private IListChangeListener changeListener;
	// list of controls
	private final List<WidgetWrapper> widgetWrappers = new ArrayList<WidgetWrapper>();
	private final List<ECPSWTAction> toolBarActions = new ArrayList<ECPSWTAction>();
	private Composite mainComposite;
	private Composite sectionComposite;
	private ECPControlDescription controlDescription;
	private Class<?> supportedClassType;
	private ECPSWTAction[] actions;

	private Button unsetButton;
	private Label tooltipLabel;



	private void findControlDescription(IItemPropertyDescriptor itemPropertyDescriptor, EObject eObject) {
		int bestPriority = -1;
		final ECPControlFactory controlFactory = Activator.getDefault().getECPControlFactory();
		if (controlFactory == null) {
			Activator.getDefault().ungetECPControlFactory();
			return;
		}
		for (final ECPControlDescription description : controlFactory.getControlDescriptors()) {
			for (final ECPApplicableTester tester : description.getTester()) {
				if (ECPStaticApplicableTester.class.isInstance(tester)) {
					final ECPStaticApplicableTester test = (ECPStaticApplicableTester) tester;
					final int priority = getTesterPriority(test, itemPropertyDescriptor, eObject);
					if (bestPriority < priority) {
						bestPriority = priority;
						controlDescription = description;
						supportedClassType = test.getSupportedClassType();
					}
				} else {
					continue;
				}
			}
		}
		Activator.getDefault().ungetECPControlFactory();
	}


	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	protected void fillControlComposite(Composite parent) {

		findControlDescription(getItemPropertyDescriptor(), getModelElementContext().getModelElement());
		actions = instantiateActions();

		mainComposite = new Composite(parent, SWT.BORDER);
		mainComposite.setBackground(parent.getBackground());
		GridDataFactory.fillDefaults().grab(true, false).align(SWT.FILL, SWT.BEGINNING).applyTo(mainComposite);
		GridLayoutFactory.fillDefaults().numColumns(1).equalWidth(false).applyTo(mainComposite);

		// TOOLBAR
		createButtonBar();
		// SEPERATOR
		final Label seperator = new Label(mainComposite, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridDataFactory.fillDefaults().grab(true, false).align(SWT.FILL, SWT.BEGINNING).span(3, 1).applyTo(seperator);

		model = EMFEditObservables.observeList(getModelElementContext().getEditingDomain(), getModelElementContext()
			.getModelElement(), getStructuralFeature());

		final ScrolledComposite scrolledComposite = new ScrolledComposite(mainComposite, SWT.V_SCROLL);
		scrolledComposite.setExpandVertical(true);
		scrolledComposite.setExpandHorizontal(true);
		GridDataFactory.fillDefaults().grab(true, true).align(SWT.FILL, SWT.FILL).hint(SWT.DEFAULT, 150)
			.minSize(SWT.DEFAULT, 150).span(3, 1).applyTo(scrolledComposite);

		sectionComposite = new Composite(scrolledComposite, SWT.NONE);
		sectionComposite.setBackground(parent.getBackground());
		GridLayoutFactory.fillDefaults().numColumns(1).equalWidth(false).spacing(0, 5).applyTo(sectionComposite);

		changeListener = new IListChangeListener() {

			public void handleListChange(ListChangeEvent event) {
				final ListDiff diff = event.diff;
				diff.accept(new ListDiffVisitor() {

					int widthBeforeChange = -1; // initial negative value

					@Override
					public void handleRemove(int index, Object element) {
						updateIndicesAfterRemove(index);
						triggerScrollbarUpdate();
						updateTargets();
					}

					private void updateTargets() {
						for (final WidgetWrapper widgetWrapper : widgetWrappers) {
							widgetWrapper.widget.getDataBindingContext().updateTargets();
						}
					}

					@Override
					public void handleAdd(int index, Object element) {
						addControl();
						sectionComposite.layout();
						triggerScrollbarUpdate();
						updateTargets();
					}

					@Override
					public void handleMove(int oldIndex, int newIndex, Object element) {
						updateTargets();
					}

					@Override
					public void handleReplace(int index, Object oldElement, Object newElement) {
						// do nothing
					}

					private void triggerScrollbarUpdate() {
						final int widthAfterChange = sectionComposite.getSize().x;
						if (widthBeforeChange != widthAfterChange) {
							scrolledComposite.setMinHeight(sectionComposite.computeSize(widthAfterChange, SWT.DEFAULT).y);
							widthBeforeChange = widthAfterChange;
						}
					}
				});
			}
		};
		model.addListChangeListener(changeListener);
		for (int i = 0; i < model.size(); i++) {
			addControl();
		}
		refreshSection();

		scrolledComposite.setMinSize(sectionComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		scrolledComposite.setContent(sectionComposite);

	}

	@Override
	protected Button getCustomUnsetButton() {
		return unsetButton;
	}

	private void isFull() {
		final int upperBound = getStructuralFeature().getUpperBound();
		final boolean full = model.size() >= upperBound && upperBound != -1;
		for (final Action action : toolBarActions) {
			action.setEnabled(!full);
		}
	}

	private void addControl() {

		final ECPObservableValue modelValue = new ECPObservableValue(model, widgetWrappers.size(), supportedClassType);
		final WidgetWrapper h = new WidgetWrapper(modelValue);

		h.createControl(sectionComposite, SWT.NONE);
		widgetWrappers.add(h);
	}

	/**
	 * Returns the {@link SWTControl}.
	 * 
	 * @return the created {@link SWTControl}
	 */
	private SWTControl getSingleInstance() {
		try {
			// final Constructor<? extends ECPControl> widgetConstructor = controlDescription.getControlClass()
			// .getConstructor(boolean.class, IItemPropertyDescriptor.class, EStructuralFeature.class,
			// ECPControlContext.class, boolean.class);
			//
			// return (SWTControl) widgetConstructor.newInstance(false, getItemPropertyDescriptor(),
			// getStructuralFeature(), getModelElementContext(), true);
			final Constructor<? extends ECPControl> widgetConstructor = controlDescription.getControlClass()
				.getConstructor();

			final SWTControl control = (SWTControl) widgetConstructor.newInstance();
			control.init(getModelElementContext(), getDomainModelReference());
			control.setEmbedded(true);
			return control;
		} catch (final IllegalArgumentException ex) {
			Activator.logException(ex);
		} catch (final InstantiationException ex) {
			Activator.logException(ex);
		} catch (final IllegalAccessException ex) {
			Activator.logException(ex);
		} catch (final InvocationTargetException ex) {
			Activator.logException(ex);
		} catch (final SecurityException ex) {
			Activator.logException(ex);
		} catch (final NoSuchMethodException ex) {
			Activator.logException(ex);
		}
		return null;
	}

	private void refreshSection() {
		int widgetSize = 150;
		if (widgetWrappers.size() > 0) {
			widgetSize = widgetWrappers.size()
				* (widgetWrappers.get(0).composite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y + 5);
		}
		sectionComposite.setSize(sectionComposite.getSize().x, widgetSize < 150 ? 150 : widgetSize);
		sectionComposite.layout();
		isFull();
	}

	private void createButtonBar() {
		final Composite toolbarComposite = new Composite(mainComposite, SWT.NONE);
		toolbarComposite.setBackground(mainComposite.getBackground());
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.BEGINNING).grab(true, false).applyTo(toolbarComposite);

		int colNum = actions.length + 1;
		if (!isEmbedded() && getStructuralFeature().isUnsettable()) {
			colNum++;
		}

		GridLayoutFactory.fillDefaults().numColumns(colNum).equalWidth(false).applyTo(toolbarComposite);

		tooltipLabel = new Label(toolbarComposite, SWT.NONE);
		tooltipLabel.setBackground(mainComposite.getBackground());
		GridDataFactory.fillDefaults().grab(true, false).align(SWT.FILL, SWT.BEGINNING).applyTo(tooltipLabel);

		for (final ECPSWTAction action : actions) {
			action.setEnabled(isEditable());
			createButtonForAction(action, toolbarComposite);
		}

		if (!isEmbedded() && getStructuralFeature().isUnsettable()) {
			unsetButton = new Button(toolbarComposite, SWT.PUSH);
			unsetButton.setToolTipText(getUnsetButtonTooltip());
			unsetButton.setImage(Activator.getImage("icons/delete.png")); //$NON-NLS-1$
		}
	}

	/**
	 * This class is the common wrapper for multi controls. It adds a remove, move up and move down button.
	 * 
	 * @author Eugen Neufeld
	 * 
	 */
	private final class WidgetWrapper {

		private ECPObservableValue modelValue;

		private Composite composite;

		private SWTControl widget;

		public WidgetWrapper(ECPObservableValue modelValue) {
			this.modelValue = modelValue;
		}

		private WidgetWrapper getThis() {
			return this;
		}

		void createControl(Composite parent, int style) {
			composite = new Composite(parent, style);
			composite.setBackgroundMode(SWT.INHERIT_FORCE);
			composite.setBackground(parent.getBackground());
			GridLayoutFactory.fillDefaults().numColumns(4).spacing(2, 0).applyTo(composite);
			GridDataFactory.fillDefaults().grab(true, false).align(SWT.FILL, SWT.BEGINNING).applyTo(composite);

			widget = getSingleInstance();
			widget.setObservableValue(modelValue);
			final Composite createControl = widget.createControl(composite);

			GridDataFactory.fillDefaults().grab(true, false).align(SWT.FILL, SWT.BEGINNING).applyTo(createControl);

			createDeleteButton(composite);
			if (getStructuralFeature().isOrdered()) {
				createUpDownButtons(composite);
			}

		}

		/**
		 * Initializes the delete button.
		 */
		private void createDeleteButton(Composite composite) {
			final Button delB = new Button(composite, SWT.PUSH);
			delB.setImage(Activator.getImage("icons/delete.png")); //$NON-NLS-1$
			delB.addSelectionListener(new SelectionAdapter() {

				/*
				 * (non-Javadoc)
				 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
				 */
				@Override
				public void widgetSelected(SelectionEvent e) {

					getModelElementContext()
						.getEditingDomain()
						.getCommandStack()
						.execute(
							RemoveCommand.create(getModelElementContext().getEditingDomain(), getModelElementContext()
								.getModelElement(), getStructuralFeature(), modelValue.getValue()));
				}

			});
		}

		/**
		 * Initializes the up/down buttons.
		 */
		private void createUpDownButtons(Composite composite) {
			final Image up = Activator.getImage(ICONS_ARROW_UP_PNG);
			final Image down = Activator.getImage(ICONS_ARROW_DOWN_PNG);

			final Button upB = new Button(composite, SWT.PUSH);
			upB.setImage(up);
			upB.addSelectionListener(new SelectionAdapter() {
				/*
				 * (non-Javadoc)
				 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
				 */
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (getThis().getModelValue().getIndex() == 0) {
						return;
					}
					final int currentIndex = getThis().getModelValue().getIndex();

					getModelElementContext()
						.getEditingDomain()
						.getCommandStack()
						.execute(
							new MoveCommand(getModelElementContext().getEditingDomain(), getModelElementContext()
								.getModelElement(), getStructuralFeature(), currentIndex, currentIndex - 1));

				}
			});
			final Button downB = new Button(composite, SWT.PUSH);
			downB.setImage(down);
			downB.addSelectionListener(new SelectionAdapter() {
				/*
				 * (non-Javadoc)
				 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
				 */
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (getThis().getModelValue().getIndex() + 1 == model.size()) {
						return;
					}
					final int currentIndex = getThis().getModelValue().getIndex();

					getModelElementContext()
						.getEditingDomain()
						.getCommandStack()
						.execute(
							new MoveCommand(getModelElementContext().getEditingDomain(), getModelElementContext()
								.getModelElement(), getStructuralFeature(), currentIndex, currentIndex + 1));

				}
			});
		}

		/**
		 * @return the modelValue
		 */
		ECPObservableValue getModelValue() {
			return modelValue;
		}

		public void dispose() {
			composite.dispose();
			modelValue.dispose();
			composite = null;
			modelValue = null;
			widget = null;
		}
	}

	private void updateIndicesAfterRemove(int indexRemoved) {
		final WidgetWrapper wrapper = widgetWrappers.remove(widgetWrappers.size() - 1);
		wrapper.composite.dispose();
	}

	/**
	 * {@inheritDoc}
	 */
	/**
	 * {@inheritDoc}
	 */
	public void handleValidation(Diagnostic diagnostic) {
		if (validationLabel == null) {
			return;
		}
		if (diagnostic.getSeverity() == Diagnostic.ERROR || diagnostic.getSeverity() == Diagnostic.WARNING) {
			final Image image = Activator.getImage(VALIDATION_ERROR_ICON);
			validationLabel.setImage(image);
			validationLabel.setToolTipText(diagnostic.getMessage());
		}
	}

	/**
	 * {@inheritDoc}
	 */
	/**
	 * {@inheritDoc}
	 */
	public void resetValidation() {
		if (validationLabel == null || validationLabel.isDisposed()) {
			return;
		}
		validationLabel.setImage(null);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void dispose() {

		model.removeListChangeListener(changeListener);
		model.dispose();

		for (final WidgetWrapper helper : widgetWrappers) {
			helper.dispose();
		}
		mainComposite.dispose();
	}

	@Override
	public Binding bindValue() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setEditable(boolean isEditable) {
		for (final ECPSWTAction action : actions) {
			action.setEnabled(isEditable);
		}
	}

	@Override
	protected Control[] getControlsForTooltip() {
		return new Control[] { tooltipLabel };
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated
	 */
	@Deprecated
	public boolean showLabel() {
		return true;
	}
	
	
	

	protected ECPSWTAction[] instantiateActions() {
		final ECPSWTAction[] actions = new ECPSWTAction[2];
//		actions[0] = new AddReferenceAction(getModelElementContext(), getItemPropertyDescriptor(),
//			getStructuralFeature());
//		actions[1] = new NewReferenceAction(getModelElementContext(), getItemPropertyDescriptor(),
//			getStructuralFeature());
		return actions;
	}



	protected int getTesterPriority(ECPStaticApplicableTester tester, IItemPropertyDescriptor itemPropertyDescriptor,
		EObject eObject) {
		return ReferenceMultiControlTester.getTesterPriority(tester,
			(EStructuralFeature) itemPropertyDescriptor.getFeature(eObject), eObject);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.edit.internal.swt.util.SWTControl#getUnsetLabelText()
	 */
	@Override
	protected String getUnsetLabelText() {
		return ControlMessages.ReferenceMultiControl_NotSetClickToSet;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.edit.internal.swt.util.SWTControl#getUnsetButtonTooltip()
	 */
	@Override
	protected String getUnsetButtonTooltip() {
		return ControlMessages.ReferenceMultiControl_Unset;
	}
}
