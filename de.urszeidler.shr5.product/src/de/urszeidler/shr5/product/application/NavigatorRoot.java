package de.urszeidler.shr5.product.application;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.IElementFactory;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.model.IWorkbenchAdapter;

/**
 * Custom NavigatorRoot.
 */
public class NavigatorRoot implements IAdaptable, IPersistableElement, IElementFactory {
	
	/**
	 * Instantiates a new navigator root.
	 */
	public NavigatorRoot() {
	}

	/** {@inheritDoc} */
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter == IPersistableElement.class) {
			return this;
		}
		if (adapter == IWorkbenchAdapter.class) {
			return ResourcesPlugin.getWorkspace().getRoot().getAdapter(adapter);
		}
		return null;
	}

	/** {@inheritDoc} */
	public String getFactoryId() {
		return this.getClass().getCanonicalName();
	}

	/** {@inheritDoc} */
	public void saveState(IMemento memento) {
		// TODO Auto-generated method stub
		return;
	}

	/** {@inheritDoc} */
	public IAdaptable createElement(IMemento memento) {
		return ResourcesPlugin.getWorkspace().getRoot();
	}
}