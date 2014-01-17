/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5Management.Advancement;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advancement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.AdvancementImpl#getKarmaFactor <em>Karma Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AdvancementImpl extends MinimalEObjectImpl.Container implements Advancement {
	/**
	 * The default value of the '{@link #getKarmaFactor() <em>Karma Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKarmaFactor()
	 * @generated
	 * @ordered
	 */
	protected static final int KARMA_FACTOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKarmaFactor() <em>Karma Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKarmaFactor()
	 * @generated
	 * @ordered
	 */
	protected int karmaFactor = KARMA_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvancementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shr5managementPackage.Literals.ADVANCEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKarmaFactor() {
		return karmaFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKarmaFactor(int newKarmaFactor) {
		int oldKarmaFactor = karmaFactor;
		karmaFactor = newKarmaFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.ADVANCEMENT__KARMA_FACTOR, oldKarmaFactor, karmaFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shr5managementPackage.ADVANCEMENT__KARMA_FACTOR:
				return getKarmaFactor();
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
			case Shr5managementPackage.ADVANCEMENT__KARMA_FACTOR:
				setKarmaFactor((Integer)newValue);
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
			case Shr5managementPackage.ADVANCEMENT__KARMA_FACTOR:
				setKarmaFactor(KARMA_FACTOR_EDEFAULT);
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
			case Shr5managementPackage.ADVANCEMENT__KARMA_FACTOR:
				return karmaFactor != KARMA_FACTOR_EDEFAULT;
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
		result.append(" (karmaFactor: ");
		result.append(karmaFactor);
		result.append(')');
		return result.toString();
	}

} //AdvancementImpl
