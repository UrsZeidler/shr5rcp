/**
 * 
 */
package de.urszeidler.emf.commons.ui.editor;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

/**
 * @author urs
 *
 */
public class EObjectEditorInput implements IEditorInput {
	private EObject eobject;
	private EditingDomain editingDomain;
	public  EObjectEditorInput(EObject eobject) {
		super();
		this.eobject = eobject;
	}

	public EObjectEditorInput(EObject eobject, EditingDomain editingDomain) {
		this(eobject);
		this.editingDomain = editingDomain;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorInput#exists()
	 */
	@Override
	public boolean exists() {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
	 */
	@Override
	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorInput#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return eobject.eClass().getName();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorInput#getPersistable()
	 */
	@Override
	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;// eobject.eResource().getURIFragment(eobject);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorInput#getToolTipText()
	 */
	@Override
	public String getToolTipText() {
		return eobject.eClass().getName();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
    @Override
	public Object getAdapter(Class adapter) {
	       if (adapter.equals(EObject.class)) {
	            return eobject;
	        }
	    
		return Platform.getAdapterManager().getAdapter(this, adapter);

	}

	public EObject getEobject() {
		return eobject;
	}

	public void setEobject(EObject eobject) {
		this.eobject = eobject;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EObjectEditorInput) {
			EObjectEditorInput ei = (EObjectEditorInput) obj;
			if(ei.getEobject()==null)
				return eobject==null;
			if(eobject==null)
				return ei.getEobject()==null;
			
			return ei.getEobject().equals(eobject);
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((this.eobject == null) ? 0 : this.eobject.hashCode());
	return result;
	}

	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

}
