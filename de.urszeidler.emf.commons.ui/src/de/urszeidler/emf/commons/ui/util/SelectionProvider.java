package de.urszeidler.emf.commons.ui.util;

import org.eclipse.core.commands.common.EventManager;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.IPostSelectionProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;



/**
	 * A selection provider/listener for a view. It is a selection provider
	 * for this view's site.
	 */
	public class SelectionProvider<E> implements IPostSelectionProvider {

		/**
		 * 
		 */
//		private final BeschreibungView beschreibungView;


		private SelectionManager fSelectionListener = new SelectionManager();

		private SelectionManager fPostSelectionListeners = new SelectionManager();

		private ISelection selection;
		
		private class SelectionManager extends EventManager {
			/**
			 * 
			 * @param listener
			 *            listen
			 */
			public void addSelectionChangedListener(
					ISelectionChangedListener listener) {
				addListenerObject(listener);
			}

			/**
			 * 
			 * @param listener
			 *            listen
			 */
			public void removeSelectionChangedListener(
					ISelectionChangedListener listener) {
				removeListenerObject(listener);
			}

			/**
			 * 
			 * @param event
			 *            the event
			 */
			public void selectionChanged(final SelectionChangedEvent event) {
				// pass on the notification to listeners
				Object[] listeners = getListeners();
				for (int i = 0; i < listeners.length; ++i) {
					final ISelectionChangedListener l = (ISelectionChangedListener) listeners[i];
					Platform.run(new SafeRunnable() {
						public void run() {
							l.selectionChanged(event);
						}
					});
				}
			}

		}


		/*
		 * (non-Javadoc) Method declared on ISelectionProvider.
		 */
		public void addSelectionChangedListener(
				ISelectionChangedListener listener) {
			fSelectionListener.addSelectionChangedListener(listener);
		}

		/*
		 * (non-Javadoc) Method declared on ISelectionProvider.
		 */
		public ISelection getSelection() {
			if(selection!=null)
				return selection;
			else
				return StructuredSelection.EMPTY;
		}

		@SuppressWarnings("unchecked")
		public E getSelectedObject(){
		if (selection instanceof StructuredSelection) {
			StructuredSelection ss = (StructuredSelection) selection;
			return (E) ss.getFirstElement();
			
		}
		return null;
		}
		/*
		 * (non-Javadoc) Method declared on ISelectionProvider.
		 */
		public void removeSelectionChangedListener(
				ISelectionChangedListener listener) {
			fSelectionListener.removeSelectionChangedListener(listener);
		}

		/**
		 * The selection has changed. Process the event, notifying selection
		 * listeners and post selection listeners.
		 * 
		 * @param event
		 *            the change
		 */
		public void selectionChanged(final SelectionChangedEvent event) {
			fSelectionListener.selectionChanged(event);
		}

		/**
		 * The selection has changed, so notify any post-selection listeners.
		 * 
		 * @param event
		 *            the change
		 */
		public void postSelectionChanged(final SelectionChangedEvent event) {
			fPostSelectionListeners.selectionChanged(event);			
		}

		/*
		 * (non-Javadoc) Method declared on ISelectionProvider.
		 */
		public void setSelection(ISelection selection) {
			this.selection = selection;
			this.fSelectionListener.selectionChanged(new SelectionChangedEvent(this, selection));
			// get the selection provider from the current page
//			IPage currentPage = getCurrentPage();
//			// during workbench startup we may be in a state when
//			// there is no current page
//			if (currentPage == null) {
//				return;
//			}
//			IPageSite site = getPageSite(currentPage);
//			if (site == null) {
//				return;
//			}
//			ISelectionProvider selProvider = getSite().getSelectionProvider();
//			// and set its selection
//			if (selProvider != null) {
//				selProvider.setSelection(selection);
//			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.jface.viewers.IPostSelectionProvider#addPostSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener)
		 */
		public void addPostSelectionChangedListener(
				ISelectionChangedListener listener) {
			fPostSelectionListeners.addSelectionChangedListener(listener);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.jface.viewers.IPostSelectionProvider#removePostSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener)
		 */
		public void removePostSelectionChangedListener(
				ISelectionChangedListener listener) {
			fPostSelectionListeners.removeSelectionChangedListener(listener);
		}
	}