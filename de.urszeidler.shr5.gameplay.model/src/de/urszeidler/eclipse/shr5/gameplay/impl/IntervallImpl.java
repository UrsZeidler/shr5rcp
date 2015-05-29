/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.eclipse.shr5.TimeUnits;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.Intervall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intervall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.IntervallImpl#getQuantities <em>Quantities</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.IntervallImpl#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntervallImpl extends MinimalEObjectImpl.Container implements Intervall {
    /**
     * The default value of the '{@link #getQuantities() <em>Quantities</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQuantities()
     * @generated
     * @ordered
     */
    protected static final int QUANTITIES_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getQuantities() <em>Quantities</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQuantities()
     * @generated
     * @ordered
     */
    protected int quantities = QUANTITIES_EDEFAULT;

    /**
     * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnits()
     * @generated
     * @ordered
     */
    protected static final TimeUnits UNITS_EDEFAULT = TimeUnits.SEC;

    /**
     * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnits()
     * @generated
     * @ordered
     */
    protected TimeUnits units = UNITS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IntervallImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.INTERVALL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getQuantities() {
        return quantities;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setQuantities(int newQuantities) {
        int oldQuantities = quantities;
        quantities = newQuantities;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.INTERVALL__QUANTITIES, oldQuantities, quantities));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeUnits getUnits() {
        return units;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnits(TimeUnits newUnits) {
        TimeUnits oldUnits = units;
        units = newUnits == null ? UNITS_EDEFAULT : newUnits;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.INTERVALL__UNITS, oldUnits, units));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GameplayPackage.INTERVALL__QUANTITIES:
                return getQuantities();
            case GameplayPackage.INTERVALL__UNITS:
                return getUnits();
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
            case GameplayPackage.INTERVALL__QUANTITIES:
                setQuantities((Integer)newValue);
                return;
            case GameplayPackage.INTERVALL__UNITS:
                setUnits((TimeUnits)newValue);
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
            case GameplayPackage.INTERVALL__QUANTITIES:
                setQuantities(QUANTITIES_EDEFAULT);
                return;
            case GameplayPackage.INTERVALL__UNITS:
                setUnits(UNITS_EDEFAULT);
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
            case GameplayPackage.INTERVALL__QUANTITIES:
                return quantities != QUANTITIES_EDEFAULT;
            case GameplayPackage.INTERVALL__UNITS:
                return units != UNITS_EDEFAULT;
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
        result.append(" (quantities: ");
        result.append(quantities);
        result.append(", units: ");
        result.append(units);
        result.append(')');
        return result.toString();
    }

} //IntervallImpl
