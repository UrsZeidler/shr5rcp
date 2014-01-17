/**
 * 
 */
package de.urszeidler.shr5.ecp.widgets;

import java.net.URL;
import java.util.Collection;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.edit.internal.swt.Activator;
import org.eclipse.emf.ecp.edit.internal.swt.actions.AddReferenceAction;
import org.eclipse.emf.ecp.edit.internal.swt.actions.DeleteReferenceAction;
import org.eclipse.emf.ecp.edit.internal.swt.controls.ControlMessages;
import org.eclipse.emf.ecp.edit.internal.swt.controls.SingleControl;
import org.eclipse.emf.ecp.edit.spi.util.ECPModelElementChangeListener;
import org.eclipse.emf.ecp.internal.ui.Messages;
import org.eclipse.emf.ecp.internal.wizards.SelectModelElementWizard;
import org.eclipse.emf.ecp.ui.common.CompositeFactory;
import org.eclipse.emf.ecp.ui.common.SelectionComposite;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;

/**
 * @author urs
 *
 */
public class AttributModifikatorWidget extends SingleControl {

	/**
	 * 
	 */
	public AttributModifikatorWidget() {
	}

	private Composite linkComposite;

	private Link hyperlink;

	private Label imageHyperlink;

	protected ComposedAdapterFactory composedAdapterFactory;

	// private AdapterFactoryLabelProvider adapterFactoryLabelProvider;

	// private ShortLabelProvider shortLabelProvider;

	private ECPModelElementChangeListener modelElementChangeListener;

	private Label unsetLabel;

	private StackLayout stackLayout;

	private Composite mainComposite;

	private Button[] buttons;

	protected AdapterFactoryItemDelegator adapterFactoryItemDelegator;

	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	protected void fillControlComposite(Composite composite) {
		int numColumns = 1 + getNumButtons();
		if (isEmbedded()) {
			numColumns = 1;
		}
		if (!isEmbedded() && getStructuralFeature().isUnsettable()) {
			numColumns++;
		}
		final Composite parent = new Composite(composite, SWT.NONE);
		parent.setBackground(composite.getBackground());
		GridLayoutFactory.fillDefaults().numColumns(numColumns).spacing(0, 0).equalWidth(false).applyTo(parent);
		GridDataFactory.fillDefaults().grab(true, false).align(SWT.FILL, SWT.BEGINNING).applyTo(parent);
		mainComposite = new Composite(parent, SWT.NONE);
		mainComposite.setBackground(parent.getBackground());
		GridDataFactory.fillDefaults().grab(true, false).align(SWT.FILL, SWT.CENTER).applyTo(mainComposite);

		stackLayout = new StackLayout();
		mainComposite.setLayout(stackLayout);

		unsetLabel = new Label(mainComposite, SWT.NONE);
		unsetLabel.setText(ControlMessages.LinkControl_NotSet);
		unsetLabel.setBackground(mainComposite.getBackground());
		unsetLabel.setForeground(getSystemColor(SWT.COLOR_DARK_GRAY));
		unsetLabel.setAlignment(SWT.CENTER);

		linkComposite = new Composite(mainComposite, SWT.NONE);
		linkComposite.setLayout(new GridLayout(2, false));
		linkComposite.setBackground(mainComposite.getBackground());

		createHyperlink();
		GridDataFactory.fillDefaults().grab(true, false).align(SWT.FILL, SWT.CENTER).applyTo(linkComposite);
		if (getModelElementContext().getModelElement().eIsSet(getStructuralFeature())) {
			stackLayout.topControl = linkComposite;
		} else {
			stackLayout.topControl = unsetLabel;
		}
		if (!isEmbedded()) {
			buttons = createButtons(parent);
		}
	}

	protected int getNumButtons() {
		return 2;
	}

	@SuppressWarnings({ "restriction", "deprecation" })
	protected Button[] createButtons(Composite composite) {
		final Button[] buttons = new Button[2];
		buttons[0] = createButtonForAction(new DeleteReferenceAction(getModelElementContext(),
			getItemPropertyDescriptor(), getStructuralFeature()), composite);
		buttons[1] = createButtonForAction(new AddReferenceAction(getModelElementContext(),
			getItemPropertyDescriptor(), getStructuralFeature()){
			@Override
			public void run() {
				//Object eobject = getModelValue().getValue();
				
				EObject eobject = getModelElementContext().getModelElement();
				Collection<?> allElements = getItemPropertyDescriptor().getChoiceOfValues(eobject);

				final SelectModelElementWizard wizard = new SelectModelElementWizard("Select Elements",
					Messages.NewModelElementWizard_WizardTitle_AddModelElement,
					Messages.ModelelementSelectionDialog_DialogTitle,
					Messages.ModelelementSelectionDialog_DialogMessage_SearchPattern, EObject.class);

				final SelectionComposite<TableViewer> tableSelectionComposite = CompositeFactory
					.getTableSelectionComposite(allElements.toArray());
				wizard.setCompositeProvider(tableSelectionComposite);

				final WizardDialog wd = new WizardDialog(Display.getCurrent().getActiveShell(), wizard);
				EObject eObject = null;
				final int result = wd.open();
				if (result == Window.OK) {
					final Object[] selection = tableSelectionComposite.getSelection();
					if (selection == null || selection.length == 0) {
						return ;
					}
					eObject = (EObject) selection[0];
				}else
					return;
				
				final EObject selectedEObject = eObject;// getModelElementContext().getExistingElementFor((EReference) getFeature());
				if (selectedEObject == null) {
					return;
				}
				getModelElementContext().addModelElement(selectedEObject, (EReference) getFeature());
				updateChangeListener(selectedEObject);
				Notification notification = new NotificationImpl(Notification.SET, true, false);
				modelElementChangeListener.notifyChanged(notification );
				//getModelElementContext().openInNewContext(selectedEObject);
			}
			
		}, composite);
//		buttons[2] = createButtonForAction(new NewReferenceAction(getModelElementContext(),
//			getItemPropertyDescriptor(), getStructuralFeature()), composite);
		return buttons;
	}

	private void createHyperlink() {
		composedAdapterFactory = new ComposedAdapterFactory(new AdapterFactory[] {
			new ReflectiveItemProviderAdapterFactory(),
			new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE) });
		adapterFactoryItemDelegator = new AdapterFactoryItemDelegator(composedAdapterFactory);
		// adapterFactoryLabelProvider = new AdapterFactoryLabelProvider(composedAdapterFactory);
		// shortLabelProvider = new ShortLabelProvider(composedAdapterFactory);

		imageHyperlink = new Label(linkComposite, SWT.NONE);
		imageHyperlink.setBackground(linkComposite.getBackground());

		hyperlink = new Link(linkComposite, SWT.NONE);
		hyperlink.setData(CUSTOM_VARIANT, "org_eclipse_emf_ecp_control_reference"); //$NON-NLS-1$
		hyperlink.setBackground(linkComposite.getBackground());
		hyperlink.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				super.widgetDefaultSelected(e);
				widgetSelected(e);
			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
				linkClicked((EObject) getModelValue().getValue());
			}

		});
		GridDataFactory.fillDefaults().grab(true, false).align(SWT.FILL, SWT.BEGINNING).applyTo(hyperlink);

	}

	/**
	 * This code is called whenever the link of the link widget is clicked. You can overwrite this to change the
	 * behavior.
	 * 
	 * @param value the EObject that is linked
	 */
	protected void linkClicked(EObject value) {
		getModelElementContext().openInNewContext(value);
	}

	/**
	 * {@inheritDoc}
	 */
	public void setEditable(boolean isEditable) {
		if (!isEmbedded()) {
			for (final Button button : buttons) {
				button.setVisible(isEditable);
			}
		}
		mainComposite.getParent().layout();
	}

	@Override
	public Binding bindValue() {

		final IObservableValue value = SWTObservables.observeText(hyperlink);

		final Binding binding = getDataBindingContext().bindValue(value, getModelValue(), new UpdateValueStrategy() {

			@Override
			public Object convert(Object value) {
				return getModelValue().getValue();
			}
		}, new UpdateValueStrategy() {
			@Override
			public Object convert(Object value) {
				updateChangeListener((EObject) value);
				return "<a>" + getLinkText(value) + "</a>"; //$NON-NLS-1$ //$NON-NLS-2$
			}
		});
		final IObservableValue tooltipValue = SWTObservables.observeTooltipText(hyperlink);
		getDataBindingContext().bindValue(tooltipValue, getModelValue(), new UpdateValueStrategy() {

			@Override
			public Object convert(Object value) {
				return getModelValue().getValue();
			}
		}, new UpdateValueStrategy() {
			@Override
			public Object convert(Object value) {
				return getLinkText(value);
			}
		});

		final IObservableValue imageValue = SWTObservables.observeImage(imageHyperlink);
		getDataBindingContext().bindValue(imageValue, getModelValue(), new UpdateValueStrategy() {

			@Override
			public Object convert(Object value) {
				return getModelValue().getValue();
			}
		}, new UpdateValueStrategy() {
			@Override
			public Object convert(Object value) {
				return getImage(value);
			}
		});

		return null;
	}

	protected Object getImage(Object value) {
		return Activator.getImage((URL) adapterFactoryItemDelegator.getImage(value));
	}

	protected Object getLinkText(Object value) {
		final String linkName = adapterFactoryItemDelegator.getText(value);
		return linkName == null ? "" : linkName; //$NON-NLS-1$
	}

	private void updateChangeListener(final EObject value) {
		if (modelElementChangeListener != null) {
			if (modelElementChangeListener.getTarget().equals(value)) {
				return;
			}
			modelElementChangeListener.remove();
			modelElementChangeListener = null;
		}
		if (value == null) {
			if (stackLayout.topControl != unsetLabel) {
				stackLayout.topControl = unsetLabel;
				mainComposite.layout();
			}

		} else {
			if (stackLayout.topControl != linkComposite) {
				stackLayout.topControl = linkComposite;
				mainComposite.layout();
			}

			modelElementChangeListener = new ECPModelElementChangeListener(value) {

				@Override
				public void onChange(Notification notification) {
					Display.getDefault().syncExec(new Runnable() {

						public void run() {
							getDataBindingContext().updateTargets();
							linkComposite.layout();

						}

					});

				}
			};

		}

	}

	@Override
	public void dispose() {
		// adapterFactoryItemDelegator.dispose();
		composedAdapterFactory.dispose();
		// shortLabelProvider.dispose();
		if (modelElementChangeListener != null) {
			modelElementChangeListener.remove();
		}
		hyperlink.dispose();
		super.dispose();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.edit.internal.swt.controls.SingleControl#getUnsetLabelText()
	 */
	@Override
	protected String getUnsetLabelText() {
		return ControlMessages.LinkControl_NoLinkSetClickToSetLink;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.edit.internal.swt.controls.SingleControl#getUnsetButtonTooltip()
	 */
	@Override
	protected String getUnsetButtonTooltip() {
		return ControlMessages.LinkControl_UnsetLink;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecp.edit.internal.swt.util.SWTControl#getControlForTooltip()
	 */
	@Override
	protected Control[] getControlsForTooltip() {
		return new Control[] { hyperlink, imageHyperlink };
	}
}
