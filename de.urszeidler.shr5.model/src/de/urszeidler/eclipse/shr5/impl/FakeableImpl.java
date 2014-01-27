/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.Fakeable;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fakeable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FakeableImpl#getStufe <em>Stufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FakeableImpl#isGefaelscht <em>Gefaelscht</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FakeableImpl extends VertragImpl implements Fakeable {
    /**
     * The default value of the '{@link #getStufe() <em>Stufe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStufe()
     * @generated
     * @ordered
     */
    protected static final int STUFE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getStufe() <em>Stufe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStufe()
     * @generated
     * @ordered
     */
    protected int stufe = STUFE_EDEFAULT;

    /**
     * The default value of the '{@link #isGefaelscht() <em>Gefaelscht</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isGefaelscht()
     * @generated
     * @ordered
     */
    protected static final boolean GEFAELSCHT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isGefaelscht() <em>Gefaelscht</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isGefaelscht()
     * @generated
     * @ordered
     */
    protected boolean gefaelscht = GEFAELSCHT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FakeableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.FAKEABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getStufe() {
        return stufe;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStufe(int newStufe) {
        int oldStufe = stufe;
        stufe = newStufe;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAKEABLE__STUFE, oldStufe, stufe));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isGefaelscht() {
        return gefaelscht;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGefaelscht(boolean newGefaelscht) {
        boolean oldGefaelscht = gefaelscht;
        gefaelscht = newGefaelscht;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAKEABLE__GEFAELSCHT, oldGefaelscht, gefaelscht));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.FAKEABLE__STUFE:
                return getStufe();
            case Shr5Package.FAKEABLE__GEFAELSCHT:
                return isGefaelscht();
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
            case Shr5Package.FAKEABLE__STUFE:
                setStufe((Integer)newValue);
                return;
            case Shr5Package.FAKEABLE__GEFAELSCHT:
                setGefaelscht((Boolean)newValue);
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
            case Shr5Package.FAKEABLE__STUFE:
                setStufe(STUFE_EDEFAULT);
                return;
            case Shr5Package.FAKEABLE__GEFAELSCHT:
                setGefaelscht(GEFAELSCHT_EDEFAULT);
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
            case Shr5Package.FAKEABLE__STUFE:
                return stufe != STUFE_EDEFAULT;
            case Shr5Package.FAKEABLE__GEFAELSCHT:
                return gefaelscht != GEFAELSCHT_EDEFAULT;
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
        result.append(" (stufe: ");
        result.append(stufe);
        result.append(", gefaelscht: ");
        result.append(gefaelscht);
        result.append(')');
        return result.toString();
    }

} //FakeableImpl
