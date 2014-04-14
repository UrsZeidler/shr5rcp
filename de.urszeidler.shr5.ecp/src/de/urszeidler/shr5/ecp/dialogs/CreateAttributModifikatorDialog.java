/**
 * 
 */
package de.urszeidler.shr5.ecp.dialogs;



import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.Modifizierbar;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.binding.BindingToolkit;
import de.urszeidler.emf.commons.ui.binding.PlainBindingToolkit;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;
import de.urszeidler.emf.commons.ui.dialogs.SimpleEObjectDialog;
import de.urszeidler.emf.commons.ui.util.NullObject;
import de.urszeidler.emf.commons.ui.util.converter.ReferenceToStringConverter;
import de.urszeidler.shr5.ecp.editor.widgets.AttributModifikatorWertWidget;



/**
 * @author urs
 * 
 */
public class CreateAttributModifikatorDialog extends SimpleEObjectDialog {

	private final Modifizierbar modifizierbar;

	
	protected final class SimpleBindingToolkit extends PlainBindingToolkit implements BindingToolkit {
		public SimpleBindingToolkit(EMFDataBindingContext ctx, EObject eObject) {
			super(ctx, eObject);
		}


		@Override
		public IObservableValue bindFeature(Text text, EReference feature) {
			IObservableValue observeValue = EMFObservables.observeValue(eObject, feature);
			ISWTObservableValue observeEditable = SWTObservables.observeText(text, SWT.Modify);
			UpdateValueStrategy updateStrategie = new EMFUpdateValueStrategy();
			updateStrategie.setConverter(new ReferenceToStringConverter(AdapterFactoryUtil.getInstance().getLabelProvider()));
			Binding binding = ctx.bindValue(observeEditable, observeValue, null, updateStrategie);
			ctx.addBinding(binding);

			return observeValue;
		}
	}
	
	public CreateAttributModifikatorDialog(Shell parentShell, AttributModifikatorWert object, Modifizierbar modifizierbar) {
		super(parentShell, object);
		binding = new SimpleBindingToolkit(ctx, eObject);
		this.modifizierbar = modifizierbar;
		this.message = "Einen Attributs Modifikator bestimmen";
	}

	
	@Override
	protected Control createDialogArea(Composite parent) {
		// create a composite with standard margins and spacing
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
		layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
		layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
		layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		applyDialogFont(composite);

		AttributModifikatorWertWidget widget = new AttributModifikatorWertWidget(composite, SWT.NORMAL, binding) {
			@Override
			protected void createContent(BindingToolkit bindingToolkit) {
				createattributContent(bindingToolkit);
				createwertContent(bindingToolkit);
			}

			@Override
			protected void handleattributChooseBtnClick() {
				((AttributModifikatorWert) eObject).setModifiziertes(modifizierbar);

				Adapter pd = AdapterFactoryUtil.getInstance().getAdapterFactory().adapt(eObject,
						IItemPropertySource.class);
				ItemProviderAdapter ipd = (ItemProviderAdapter) pd;
				IItemPropertyDescriptor itemPropertyDescriptor = ipd.getPropertyDescriptor(eObject,
						Shr5Package.eINSTANCE.getAttributModifikatorWert_Attribut());

				Object[] array = NullObject.toChoises( itemPropertyDescriptor.getChoiceOfValues(eObject));
				
				OwnChooseDialog dialog = new OwnChooseDialog(getShell(),array);
				dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
				int open = dialog.open();
				if (open == Dialog.OK) {
					Object[] result = dialog.getResult();
					if (result.length > 0)
						((AttributModifikatorWert) eObject).setAttribut((EAttribute) result[0]);
					else
					((AttributModifikatorWert) eObject).setModifiziertes(null);
					
//					Notification notification = new NotificationImpl(Notification.SET, true, false);
//					eObject.eNotify(notification);
				}
			}
		};
		widget.setLayoutData(new GridData(GridData.FILL_BOTH));

		return composite;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.dialogs.IconAndMessageDialog#getImage()
	 */
	@Override
	protected Image getImage() {
		return getQuestionImage();
	}

}
