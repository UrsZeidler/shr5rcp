package de.urszeidler.emf.commons.ui.actions;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;

public abstract class OpenHibernateResource implements IWorkbenchWindowActionDelegate {

	protected IWorkbenchWindow window;

	public OpenHibernateResource() {
		super();
	}
	
	/**
	 * Open an editor with the given id with an hibernate url.
	 * 
	 * @param datastorename the storage name 
	 * @param objectName the object name to load
	 * @param editorId the editor id
	 */
	protected void openEditor(String datastorename, String objectName, String editorId) {
		URI uri = URI.createURI("hibernate://?dsname=" + datastorename+"&query=FROM "+objectName);
	
		try {
			IEditorInput input = new URIEditorInput(uri);
			window.getActivePage().openEditor(input, editorId);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Selection in the workbench has been changed. We can change the state of
	 * the 'real' action here if we want, but this can only happen after the
	 * delegate has been created.
	 * 
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

	/**
	 * We can use this method to dispose of any system resources we previously
	 * allocated.
	 * 
	 * @see IWorkbenchWindowActionDelegate#dispose
	 */
	public void dispose() {
	}

	/**
	 * We will cache window object in order to be able to provide parent shell
	 * for the message dialog.
	 * 
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

}