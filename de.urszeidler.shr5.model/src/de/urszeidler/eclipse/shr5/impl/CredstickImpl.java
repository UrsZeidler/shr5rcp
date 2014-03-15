/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.Credstick;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credstick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CredstickImpl#getCurrenValue <em>Curren Value</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CredstickImpl#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CredstickImpl extends AbstraktGegenstandImpl implements Credstick {
    /**
     * The default value of the '{@link #getCurrenValue() <em>Curren Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrenValue()
     * @generated
     * @ordered
     */
    protected static final int CURREN_VALUE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getCurrenValue() <em>Curren Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrenValue()
     * @generated
     * @ordered
     */
    protected int currenValue = CURREN_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
    protected static final int MAX_VALUE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
    protected int maxValue = MAX_VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CredstickImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.CREDSTICK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getCurrenValue() {
        return currenValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCurrenValue(int newCurrenValue) {
        int oldCurrenValue = currenValue;
        currenValue = newCurrenValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CREDSTICK__CURREN_VALUE, oldCurrenValue, currenValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaxValue() {
        return maxValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxValue(int newMaxValue) {
        int oldMaxValue = maxValue;
        maxValue = newMaxValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CREDSTICK__MAX_VALUE, oldMaxValue, maxValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.CREDSTICK__CURREN_VALUE:
                return getCurrenValue();
            case Shr5Package.CREDSTICK__MAX_VALUE:
                return getMaxValue();
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
            case Shr5Package.CREDSTICK__CURREN_VALUE:
                setCurrenValue((Integer)newValue);
                return;
            case Shr5Package.CREDSTICK__MAX_VALUE:
                setMaxValue((Integer)newValue);
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
            case Shr5Package.CREDSTICK__CURREN_VALUE:
                setCurrenValue(CURREN_VALUE_EDEFAULT);
                return;
            case Shr5Package.CREDSTICK__MAX_VALUE:
                setMaxValue(MAX_VALUE_EDEFAULT);
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
            case Shr5Package.CREDSTICK__CURREN_VALUE:
                return currenValue != CURREN_VALUE_EDEFAULT;
            case Shr5Package.CREDSTICK__MAX_VALUE:
                return maxValue != MAX_VALUE_EDEFAULT;
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
        result.append(" (currenValue: ");
        result.append(currenValue);
        result.append(", maxValue: ");
        result.append(maxValue);
        result.append(')');
        return result.toString();
    }

} //CredstickImpl
