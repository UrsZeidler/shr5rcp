/**
 * 
 */
package de.urszeidler.emf.commons.ui.dialogs;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.urszeidler.emf.commons.ui.util.EmfFormBuilder;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;

/**
 * @author urs
 *
 */
public class GenericEObjectDialog extends SimpleEObjectDialog {

	private EmfFormBuilder emfFormBuilder;
	private FormToolkit toolkit;

	public GenericEObjectDialog(Shell parentShell, EObject eObject, AdapterFactoryItemDelegator itemDelegator, ILabelProvider labelprovider, ReferenceManager mananger) {
		super(parentShell, eObject);
		
		toolkit = new FormToolkit(Display.getCurrent());
	
		
		emfFormBuilder = new EmfFormBuilder(toolkit, itemDelegator,
				labelprovider, null);
		emfFormBuilder.setManager(mananger);
		//emfFormBuilder.setBorderStyle(SWT.NONE);

	}

	/**
	 * Create the Dialog area
	 * 
	 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createDialogArea(Composite parent) {
		Composite dialogComposite = (Composite) super.createDialogArea(parent);
		toolkit.adapt(dialogComposite);
		toolkit.paintBordersFor(dialogComposite);

		dialogComposite.setLayout(new GridLayout(3, false));
		
		emfFormBuilder.addAllEntries(eObject.eClass());
		emfFormBuilder.buildinComposite(ctx, dialogComposite, eObject);
		
		return dialogComposite;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IconAndMessageDialog#getImage()
	 */
	@Override
	protected Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean close() {
		toolkit.dispose();
		emfFormBuilder.dispose();
		return super.close();
	}
}
