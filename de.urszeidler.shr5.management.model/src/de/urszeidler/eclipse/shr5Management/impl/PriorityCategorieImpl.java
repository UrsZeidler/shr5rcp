/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.eclipse.shr5Management.PriorityCategorie;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Priority Categorie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PriorityCategorieImpl#getCategorieName <em>Categorie Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PriorityCategorieImpl extends MinimalEObjectImpl.Container implements PriorityCategorie {
	/**
	 * The default value of the '{@link #getCategorieName() <em>Categorie Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieName()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORIE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategorieName() <em>Categorie Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieName()
	 * @generated
	 * @ordered
	 */
	protected String categorieName = CATEGORIE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriorityCategorieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shr5managementPackage.Literals.PRIORITY_CATEGORIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategorieName() {
		return categorieName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorieName(String newCategorieName) {
		String oldCategorieName = categorieName;
		categorieName = newCategorieName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PRIORITY_CATEGORIE__CATEGORIE_NAME, oldCategorieName, categorieName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shr5managementPackage.PRIORITY_CATEGORIE__CATEGORIE_NAME:
				return getCategorieName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Shr5managementPackage.PRIORITY_CATEGORIE__CATEGORIE_NAME:
				setCategorieName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Shr5managementPackage.PRIORITY_CATEGORIE__CATEGORIE_NAME:
				setCategorieName(CATEGORIE_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Shr5managementPackage.PRIORITY_CATEGORIE__CATEGORIE_NAME:
				return CATEGORIE_NAME_EDEFAULT == null ? categorieName != null : !CATEGORIE_NAME_EDEFAULT.equals(categorieName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (categorieName: ");
		result.append(categorieName);
		result.append(')');
		return result.toString();
	}

} //PriorityCategorieImpl
