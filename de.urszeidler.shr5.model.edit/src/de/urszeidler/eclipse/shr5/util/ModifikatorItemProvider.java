/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.urszeidler.eclipse.shr5.util;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;

/**
 * This is the item provider adapter for a
 * {@link de.urszeidler.eclipse.shadowrun.AbstaktFernKampfwaffe} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated not
 */
public class ModifikatorItemProvider extends ReflectiveItemProvider implements
		IItemLabelProvider {

	protected ModifikatorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public String getText(Object object) {
		EObject eObject = (EObject) object;
		EClass eClass = eObject.eClass();
		EStructuralFeature feature = getLabelFeature(eClass);
		if (feature != null) {
			Object value = eObject.eGet(feature);
			if (value != null) {
				return value.toString();
			}
		}
		return "";

	}


}
