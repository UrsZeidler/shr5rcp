/**
 * 
 */
package de.urszeidler.emf.commons.ui.util;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.databinding.viewers.IViewerObservableList;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import de.urszeidler.commons.functors.Transformer;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;

/**
 * @author urs
 * 
 */
public class DefaultReferenceManager implements ReferenceManager, ILabelProvider {
	protected AdapterFactoryItemDelegator itemDelegator;

	public DefaultReferenceManager(AdapterFactoryItemDelegator itemDelegator) {
		this.itemDelegator = itemDelegator;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager#handleAdd
	 * (de.urszeidler.emf.commons.ui.util.EmfFormBuilder.Entry,
	 * org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public Object handleAdd(FormbuilderEntry e, EObject object) {
		Object newObject = provideObject(e, object);
		if (newObject == null)
			return null;

		IObservable observable = e.getObservable();
		if (observable instanceof IObservableList) {
			IObservableList ol = (IObservableList) observable;
			if (newObject instanceof Collection<?>) {
				Collection<?> col = (Collection<?>) newObject;
				ol.addAll(col);
			} else
				ol.add(newObject);
		}
		return newObject;
	}

	/**
	 * must provide the objects to add to the feature, or null for no action
	 * 
	 * @param e
	 * @param object
	 * @return
	 */
	protected Object provideObject(FormbuilderEntry e, EObject object) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seede.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager#
	 * handleRemove(de.urszeidler.emf.commons.ui.util.EmfFormBuilder.Entry,
	 * org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public void handleRemove(FormbuilderEntry e, EObject object) {
		if (!shouldRemove(e, object))
			return;

		IObservable uiObservable = e.getUiObservable();
		if (uiObservable instanceof IViewerObservableList) {
			IViewerObservableList vol = (IViewerObservableList) uiObservable;
			ISelection selection = vol.getViewer().getSelection();
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection ss = (IStructuredSelection) selection;
				List list = ss.toList();
				IObservable observable = e.getObservable();
				if (observable instanceof IObservableList) {
					IObservableList ol = (IObservableList) observable;
					ol.removeAll(list);
				}
			}

		}

	}

	/**
	 * can provide the information if delete should be done or not, default is
	 * should remove in every case
	 * 
	 * @param e
	 * @param object
	 * @return
	 */
	protected boolean shouldRemove(FormbuilderEntry e, EObject object) {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seede.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager#
	 * handleManage(de.urszeidler.emf.commons.ui.util.EmfFormBuilder.Entry,
	 * org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public void handleManage(FormbuilderEntry e, EObject object) {
		IItemPropertyDescriptor propertyDescriptor = itemDelegator.getPropertyDescriptor(object, e.getFeature());
		List<?> values = (List<?>) propertyDescriptor.getChoiceOfValues(object);
		Shell shell = PlatformUI.isWorkbenchRunning() ? PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell():
		Display.getCurrent().getActiveShell();

		if (e.feature instanceof EReference) {
			EReference ref = (EReference) e.feature;
			if (ref.isContainment()) {
			} else {
				if (ref.isMany()) {
					handleManyFeature(e, object, values, shell);
				} else {
					handleSingleReference(e, values, shell);
				}
			}
		} else if (e.feature instanceof EAttribute) {
			EAttribute att = (EAttribute) e.feature;
			if (att.isMany())
				handleManyFeature(e, object, values, shell);
			else
				handleSingleReference(e, values, shell);
		}
	}

	private void handleManyFeature(FormbuilderEntry e, EObject object, List<?> values, Shell shell) {
		FeatureEditorDialog featureEditorDialog = new FeatureEditorDialog(shell, this, object, e.getFeature(), "", values);
		int result = featureEditorDialog.open();
		if (result == Window.OK) {
			EList<?> eList = featureEditorDialog.getResult();
			IObservable observable = e.getObservable();
			if (observable instanceof IObservableList) {
				IObservableList ol = (IObservableList) observable;
				ol.clear();
				ol.addAll(eList);
			} else if (observable instanceof IObservableValue) {
				IObservableValue ov = (IObservableValue) observable;

			}
		}
	}

    /**
     * Shows a dialog for selecting and set the value in the observer.
     * @param e
     * @param values
     * @param shell
     */
    protected void handleSingleReference(FormbuilderEntry e, Collection<?> values, Shell shell) {
        Object[] choises = NullObject.toChoises(values);
        
        OwnChooseDialog dialog = new OwnChooseDialog(shell, choises);
        dialog.setLabelProvider(this);
        if (dialog.open() == Dialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length == 1) {
                IObservable observable = e.getObservable();
                if (observable instanceof IObservableValue) {
                    IObservableValue ov = (IObservableValue) observable;
                    if (result[0].getClass() == NullObject.class)
                        ov.setValue(null);
                    else
                        ov.setValue(result[0]);
                }
            }
        }
    }

    /**
     * Shows a dialog for selecting and set the value in the observer.
     * @param e
     * @param values
     * @param shell
     */
    protected void handleSingleReference(Transformer transformer, FormbuilderEntry e, Collection<?> values, Shell shell) {
        Object[] choises = NullObject.toChoises(values);
        OwnChooseDialog dialog = new OwnChooseDialog(shell, choises);
        dialog.setLabelProvider(this);
        if (dialog.open() == Dialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length == 1) {
                IObservable observable = e.getObservable();
                if (observable instanceof IObservableValue) {
                    IObservableValue ov = (IObservableValue) observable;
                    if (result[0].getClass() == NullObject.class)
                        ov.setValue(null);
                    else
                        ov.setValue(transformer.transform(result[0]));
                }
            }
        }
    }

	protected void handleManageEnum(FormbuilderEntry e, EObject object) {

	}

	private void handleManageReference(EReference e, EObject object) {
		// TODO Auto-generated method stub

	}

	@Override
	public Image getImage(Object element) {
		return ExtendedImageRegistry.getInstance().getImage(itemDelegator.getImage(element));// (Image)
																								// itemDelegator.getImage(element);
	}

	@Override
	public String getText(Object element) {
		return itemDelegator.getText(element);
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

}
