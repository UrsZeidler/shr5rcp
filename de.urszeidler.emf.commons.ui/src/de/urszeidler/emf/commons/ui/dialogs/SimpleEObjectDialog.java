package de.urszeidler.emf.commons.ui.dialogs;

import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IconAndMessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import de.urszeidler.emf.commons.ui.binding.BindingToolkit;

public abstract class SimpleEObjectDialog extends IconAndMessageDialog {

	protected static final int MIN_DIALOG_WIDTH = 350;
	protected static final int MIN_DIALOG_HEIGHT = 250;

	protected BindingToolkit binding;
	protected final EMFDataBindingContext ctx = new EMFDataBindingContext();
	protected final EObject eObject;
	
	public SimpleEObjectDialog(Shell parentShell, EObject eObject) {
		super(parentShell);
		this.eObject = eObject;
	}

	public EObject getEObject() {
		return eObject;
	}

	/**
	 * @see org.eclipse.ui.dialogs.SelectionDialog#configureShell(org.eclipse.swt.widgets.Shell)
	 */
	@Override
	protected void configureShell(Shell shell) {
		shell.setMinimumSize(MIN_DIALOG_WIDTH, MIN_DIALOG_HEIGHT);	
		super.configureShell(shell);
	}

	/**
	 * Create the dialog area and the button bar for the receiver.
	 * 
	 * @param parent
	 */
	protected void createDialogAndButtonArea(Composite parent) {
		createMessageArea(parent);
		new Label(parent,SWT.NULL);
		dialogArea = createDialogArea(parent);
		buttonBar = createButtonBar(parent);
		// Apply to the parent so that the message gets it too.
		applyDialogFont(parent);
	}

}