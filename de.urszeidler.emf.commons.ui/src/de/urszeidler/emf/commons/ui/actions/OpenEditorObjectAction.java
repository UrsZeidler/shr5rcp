package de.urszeidler.emf.commons.ui.actions;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;

import de.urszeidler.emf.commons.ui.editor.EObjectEditorInput;

public abstract class OpenEditorObjectAction implements IObjectActionDelegate {

	protected Shell shell;
	protected EObject eObject;
	protected IWorkbenchPart part;

	public OpenEditorObjectAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
		part = targetPart;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IEditorInput input = new EObjectEditorInput(eObject);
		try {

			part.getSite().getPage().openEditor(input, getEditorId());
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected abstract String getEditorId();

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			Object object = ss.getFirstElement();
			if (object instanceof EObject) {
				EObject eo = (EObject) object;
				eObject = eo;
			}
		}

	}

}