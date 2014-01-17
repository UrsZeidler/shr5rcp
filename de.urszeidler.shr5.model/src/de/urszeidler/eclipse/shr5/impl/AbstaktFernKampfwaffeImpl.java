/**
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe;
import de.urszeidler.eclipse.shr5.Reichweite;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstakt Fern Kampfwaffe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstaktFernKampfwaffeImpl#getReichweite <em>Reichweite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstaktFernKampfwaffeImpl extends AbstaktWaffeImpl implements AbstaktFernKampfwaffe {
	/**
	 * The cached value of the '{@link #getReichweite() <em>Reichweite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReichweite()
	 * @generated
	 * @ordered
	 */
	protected Reichweite reichweite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstaktFernKampfwaffeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shr5Package.Literals.ABSTAKT_FERN_KAMPFWAFFE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reichweite getReichweite() {
		if (reichweite != null && reichweite.eIsProxy()) {
			InternalEObject oldReichweite = (InternalEObject)reichweite;
			reichweite = (Reichweite)eResolveProxy(oldReichweite);
			if (reichweite != oldReichweite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.ABSTAKT_FERN_KAMPFWAFFE__REICHWEITE, oldReichweite, reichweite));
			}
		}
		return reichweite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reichweite basicGetReichweite() {
		return reichweite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReichweite(Reichweite newReichweite) {
		Reichweite oldReichweite = reichweite;
		reichweite = newReichweite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTAKT_FERN_KAMPFWAFFE__REICHWEITE, oldReichweite, reichweite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shr5Package.ABSTAKT_FERN_KAMPFWAFFE__REICHWEITE:
				if (resolve) return getReichweite();
				return basicGetReichweite();
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
			case Shr5Package.ABSTAKT_FERN_KAMPFWAFFE__REICHWEITE:
				setReichweite((Reichweite)newValue);
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
			case Shr5Package.ABSTAKT_FERN_KAMPFWAFFE__REICHWEITE:
				setReichweite((Reichweite)null);
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
			case Shr5Package.ABSTAKT_FERN_KAMPFWAFFE__REICHWEITE:
				return reichweite != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstaktFernKampfwaffeImpl
