/**
 * 
 */
package de.urszeidler.eclipse.shr5.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import de.urszeidler.eclipse.shr5.provider.Shr5ItemProviderAdapterFactory;

/**
 * Exteds the normal item adapter factory to supply some custom implentations
 * 
 * @author urs
 */
public class ExtendedShadowrunAdapterFactory extends Shr5ItemProviderAdapterFactory {
	/**
	 * The singleton reflective instance.
	 */
	protected ModifikatorItemProvider reflectiveItemProviderAdapter;

	/**
		 */
	public Adapter createModifikatorItemProvider() {
		if (reflectiveItemProviderAdapter == null) {
			reflectiveItemProviderAdapter = new ModifikatorItemProvider(this);
		}

		return reflectiveItemProviderAdapter;
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == EcorePackage.eINSTANCE) {
			return true;
		}

		return super.isFactoryForType(object);
	}

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		if (target instanceof EAttribute) {
			return createModifikatorItemProvider();
		}
		if (target instanceof EReference) {
			return createModifikatorItemProvider();
		}

		return modelSwitch.doSwitch((EObject) target);
	}

	public void dispose() {
		if (reflectiveItemProviderAdapter != null) {
			reflectiveItemProviderAdapter.dispose();
		}

		super.dispose();
	}

}
