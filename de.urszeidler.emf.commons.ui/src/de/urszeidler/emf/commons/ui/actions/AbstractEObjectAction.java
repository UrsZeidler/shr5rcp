package de.urszeidler.emf.commons.ui.actions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public abstract class AbstractEObjectAction<E extends EObject> implements IObjectActionDelegate,IEditorActionDelegate{

	protected EObject currentEObject;
	protected Shell shell;
	private Job job;

	public AbstractEObjectAction() {
		super();
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	
	}

	@Override
	public void run(IAction action) {
		
		job = new Job(getJobName()) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
	
				return doAction(monitor);
			}
		};
		
		job.setUser(true);
		job.schedule();
	}

	protected abstract IStatus doAction(IProgressMonitor monitor);

	protected abstract String getJobName();

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			StructuredSelection ss = (StructuredSelection) selection;
			Object firstElement = ss.getFirstElement();
			if (firstElement instanceof EObject) {
				EObject eo = (EObject) firstElement;
				currentEObject = eo;
				return;
			}
		}
		currentEObject = null;
	}

	@Override
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		// TODO Auto-generated method stub
		
	}

	
	@SuppressWarnings("unchecked")
	public E getEObject() {
		return (E) currentEObject;
	}
	
	public void setObject(E eObject) {
		currentEObject = eObject;
	}

	public Job getJob() {
		return job;
	}
}