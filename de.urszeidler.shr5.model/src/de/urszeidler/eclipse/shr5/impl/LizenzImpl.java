/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.Lizenz;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Sin;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lizenz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.LizenzImpl#getLizenGegenstand <em>Lizen Gegenstand</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.LizenzImpl#getLizenzTraeger <em>Lizenz Traeger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LizenzImpl extends FakeableImpl implements Lizenz {
    /**
     * The default value of the '{@link #getLizenGegenstand() <em>Lizen Gegenstand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLizenGegenstand()
     * @generated
     * @ordered
     */
    protected static final String LIZEN_GEGENSTAND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLizenGegenstand() <em>Lizen Gegenstand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLizenGegenstand()
     * @generated
     * @ordered
     */
    protected String lizenGegenstand = LIZEN_GEGENSTAND_EDEFAULT;

    /**
     * The cached value of the '{@link #getLizenzTraeger() <em>Lizenz Traeger</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLizenzTraeger()
     * @generated
     * @ordered
     */
    protected Sin lizenzTraeger;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LizenzImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.LIZENZ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLizenGegenstand() {
        return lizenGegenstand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLizenGegenstand(String newLizenGegenstand) {
        String oldLizenGegenstand = lizenGegenstand;
        lizenGegenstand = newLizenGegenstand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.LIZENZ__LIZEN_GEGENSTAND, oldLizenGegenstand, lizenGegenstand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sin getLizenzTraeger() {
        if (lizenzTraeger != null && lizenzTraeger.eIsProxy()) {
            InternalEObject oldLizenzTraeger = (InternalEObject)lizenzTraeger;
            lizenzTraeger = (Sin)eResolveProxy(oldLizenzTraeger);
            if (lizenzTraeger != oldLizenzTraeger) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.LIZENZ__LIZENZ_TRAEGER, oldLizenzTraeger, lizenzTraeger));
            }
        }
        return lizenzTraeger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sin basicGetLizenzTraeger() {
        return lizenzTraeger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLizenzTraeger(Sin newLizenzTraeger) {
        Sin oldLizenzTraeger = lizenzTraeger;
        lizenzTraeger = newLizenzTraeger;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.LIZENZ__LIZENZ_TRAEGER, oldLizenzTraeger, lizenzTraeger));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.LIZENZ__LIZEN_GEGENSTAND:
                return getLizenGegenstand();
            case Shr5Package.LIZENZ__LIZENZ_TRAEGER:
                if (resolve) return getLizenzTraeger();
                return basicGetLizenzTraeger();
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
            case Shr5Package.LIZENZ__LIZEN_GEGENSTAND:
                setLizenGegenstand((String)newValue);
                return;
            case Shr5Package.LIZENZ__LIZENZ_TRAEGER:
                setLizenzTraeger((Sin)newValue);
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
            case Shr5Package.LIZENZ__LIZEN_GEGENSTAND:
                setLizenGegenstand(LIZEN_GEGENSTAND_EDEFAULT);
                return;
            case Shr5Package.LIZENZ__LIZENZ_TRAEGER:
                setLizenzTraeger((Sin)null);
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
            case Shr5Package.LIZENZ__LIZEN_GEGENSTAND:
                return LIZEN_GEGENSTAND_EDEFAULT == null ? lizenGegenstand != null : !LIZEN_GEGENSTAND_EDEFAULT.equals(lizenGegenstand);
            case Shr5Package.LIZENZ__LIZENZ_TRAEGER:
                return lizenzTraeger != null;
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
        result.append(" (lizenGegenstand: ");
        result.append(lizenGegenstand);
        result.append(')');
        return result.toString();
    }

} //LizenzImpl
