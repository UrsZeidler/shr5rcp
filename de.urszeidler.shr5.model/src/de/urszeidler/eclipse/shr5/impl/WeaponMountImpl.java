/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.AbstaktWaffe;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.WeaponMount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weapon Mount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.WeaponMountImpl#getWeapon <em>Weapon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeaponMountImpl extends FahrzeugModifikationImpl implements WeaponMount {
    /**
     * The cached value of the '{@link #getWeapon() <em>Weapon</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeapon()
     * @generated
     * @ordered
     */
    protected AbstaktWaffe weapon;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WeaponMountImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.WEAPON_MOUNT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AbstaktWaffe getWeapon() {
        return weapon;
    }

    @Override
    public BigDecimal getWert() {
        BigDecimal wert = super.getWert();
        if(wert!=null && getWeapon()!=null && getWeapon().getWert()!=null)
            wert = wert.add(getWeapon().getWert());
        
        return wert;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWeapon(AbstaktWaffe newWeapon, NotificationChain msgs) {
        AbstaktWaffe oldWeapon = weapon;
        weapon = newWeapon;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5Package.WEAPON_MOUNT__WEAPON, oldWeapon, newWeapon);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWeapon(AbstaktWaffe newWeapon) {
        if (newWeapon != weapon) {
            NotificationChain msgs = null;
            if (weapon != null)
                msgs = ((InternalEObject)weapon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5Package.WEAPON_MOUNT__WEAPON, null, msgs);
            if (newWeapon != null)
                msgs = ((InternalEObject)newWeapon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Shr5Package.WEAPON_MOUNT__WEAPON, null, msgs);
            msgs = basicSetWeapon(newWeapon, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.WEAPON_MOUNT__WEAPON, newWeapon, newWeapon));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.WEAPON_MOUNT__WEAPON:
                return basicSetWeapon(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.WEAPON_MOUNT__WEAPON:
                return getWeapon();
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
            case Shr5Package.WEAPON_MOUNT__WEAPON:
                setWeapon((AbstaktWaffe)newValue);
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
            case Shr5Package.WEAPON_MOUNT__WEAPON:
                setWeapon((AbstaktWaffe)null);
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
            case Shr5Package.WEAPON_MOUNT__WEAPON:
                return weapon != null;
        }
        return super.eIsSet(featureID);
    }

} //WeaponMountImpl
