/**
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.Modifizierbar;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribut Modifikator Wert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AttributModifikatorWertImpl#getAttribut <em>Attribut</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AttributModifikatorWertImpl#getWert <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AttributModifikatorWertImpl#getModifiziertes <em>Modifiziertes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributModifikatorWertImpl extends MinimalEObjectImpl.Container implements AttributModifikatorWert {
	/**
     * The cached value of the '{@link #getAttribut() <em>Attribut</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAttribut()
     * @generated
     * @ordered
     */
	protected EAttribute attribut;

	/**
     * The default value of the '{@link #getWert() <em>Wert</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWert()
     * @generated
     * @ordered
     */
	protected static final int WERT_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getWert() <em>Wert</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWert()
     * @generated
     * @ordered
     */
	protected int wert = WERT_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AttributModifikatorWertImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.ATTRIBUT_MODIFIKATOR_WERT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAttribut() {
        if (attribut != null && attribut.eIsProxy()) {
            InternalEObject oldAttribut = (InternalEObject)attribut;
            attribut = (EAttribute)eResolveProxy(oldAttribut);
            if (attribut != oldAttribut) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__ATTRIBUT, oldAttribut, attribut));
            }
        }
        return attribut;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute basicGetAttribut() {
        return attribut;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setAttribut(EAttribute newAttribut) {
		EAttribute oldAttribut = attribut;
		attribut = newAttribut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__ATTRIBUT, oldAttribut, attribut));
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getWert() {
        return wert;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setWert(int newWert) {
        int oldWert = wert;
        wert = newWert;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__WERT, oldWert, wert));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Modifizierbar getModifiziertes() {
        if (eContainerFeatureID() != Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES) return null;
        return (Modifizierbar)eInternalContainer();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetModifiziertes(Modifizierbar newModifiziertes, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newModifiziertes, Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES, msgs);
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setModifiziertes(Modifizierbar newModifiziertes) {
        if (newModifiziertes != eInternalContainer() || (eContainerFeatureID() != Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES && newModifiziertes != null)) {
            if (EcoreUtil.isAncestor(this, newModifiziertes))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newModifiziertes != null)
                msgs = ((InternalEObject)newModifiziertes).eInverseAdd(this, Shr5Package.MODIFIZIERBAR__MODS, Modifizierbar.class, msgs);
            msgs = basicSetModifiziertes(newModifiziertes, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES, newModifiziertes, newModifiziertes));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetModifiziertes((Modifizierbar)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES:
                return basicSetModifiziertes(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES:
                return eInternalContainer().eInverseRemove(this, Shr5Package.MODIFIZIERBAR__MODS, Modifizierbar.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__ATTRIBUT:
                if (resolve) return getAttribut();
                return basicGetAttribut();
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__WERT:
                return getWert();
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES:
                return getModifiziertes();
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
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__ATTRIBUT:
                setAttribut((EAttribute)newValue);
                return;
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__WERT:
                setWert((Integer)newValue);
                return;
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES:
                setModifiziertes((Modifizierbar)newValue);
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
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__ATTRIBUT:
                setAttribut((EAttribute)null);
                return;
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__WERT:
                setWert(WERT_EDEFAULT);
                return;
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES:
                setModifiziertes((Modifizierbar)null);
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
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__ATTRIBUT:
                return attribut != null;
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__WERT:
                return wert != WERT_EDEFAULT;
            case Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES:
                return getModifiziertes() != null;
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
        result.append(" (wert: ");
        result.append(wert);
        result.append(')');
        return result.toString();
    }

} //AttributModifikatorWertImpl
