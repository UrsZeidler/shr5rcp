/**
 */
package de.urszeidler.eclipse.shr5.runtime.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.Fahrzeug;
import de.urszeidler.eclipse.shr5.InterfaceModus;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5.runtime.Vehicle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.VehicleImpl#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.VehicleImpl#getVehicleCondition <em>Vehicle Condition</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.VehicleImpl#getModus <em>Modus</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.VehicleImpl#getCurrentSpeed <em>Current Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VehicleImpl<V extends Fahrzeug> extends AbstractExtendetDataAwareImpl implements Vehicle<V> {
    /**
     * The cached value of the '{@link #getVehicle() <em>Vehicle</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVehicle()
     * @generated
     * @ordered
     */
    protected V vehicle;

    /**
     * The default value of the '{@link #getVehicleCondition() <em>Vehicle Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVehicleCondition()
     * @generated
     * @ordered
     */
    protected static final int VEHICLE_CONDITION_EDEFAULT = 0;
    /**
     * The cached value of the '{@link #getVehicleCondition() <em>Vehicle Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVehicleCondition()
     * @generated
     * @ordered
     */
    protected int vehicleCondition = VEHICLE_CONDITION_EDEFAULT;
    /**
     * The default value of the '{@link #getModus() <em>Modus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModus()
     * @generated
     * @ordered
     */
    protected static final InterfaceModus MODUS_EDEFAULT = InterfaceModus.AUGMENTED_REALITY;
    /**
     * The cached value of the '{@link #getModus() <em>Modus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModus()
     * @generated
     * @ordered
     */
    protected InterfaceModus modus = MODUS_EDEFAULT;
    /**
     * The default value of the '{@link #getCurrentSpeed() <em>Current Speed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentSpeed()
     * @generated
     * @ordered
     */
    protected static final int CURRENT_SPEED_EDEFAULT = 0;
    /**
     * The cached value of the '{@link #getCurrentSpeed() <em>Current Speed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentSpeed()
     * @generated
     * @ordered
     */
    protected int currentSpeed = CURRENT_SPEED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VehicleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RuntimePackage.Literals.VEHICLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public V getVehicle() {
        if (vehicle != null && vehicle.eIsProxy()) {
            InternalEObject oldVehicle = (InternalEObject)vehicle;
            vehicle = (V)eResolveProxy(oldVehicle);
            if (vehicle != oldVehicle) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.VEHICLE__VEHICLE, oldVehicle, vehicle));
            }
        }
        return vehicle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public V basicGetVehicle() {
        return vehicle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVehicle(V newVehicle) {
        V oldVehicle = vehicle;
        vehicle = newVehicle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.VEHICLE__VEHICLE, oldVehicle, vehicle));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getVehicleCondition() {
        return vehicleCondition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVehicleCondition(int newVehicleCondition) {
        int oldVehicleCondition = vehicleCondition;
        vehicleCondition = newVehicleCondition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.VEHICLE__VEHICLE_CONDITION, oldVehicleCondition, vehicleCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterfaceModus getModus() {
        return modus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModus(InterfaceModus newModus) {
        InterfaceModus oldModus = modus;
        modus = newModus == null ? MODUS_EDEFAULT : newModus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.VEHICLE__MODUS, oldModus, modus));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCurrentSpeed(int newCurrentSpeed) {
        int oldCurrentSpeed = currentSpeed;
        currentSpeed = newCurrentSpeed;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.VEHICLE__CURRENT_SPEED, oldCurrentSpeed, currentSpeed));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RuntimePackage.VEHICLE__VEHICLE:
                if (resolve) return getVehicle();
                return basicGetVehicle();
            case RuntimePackage.VEHICLE__VEHICLE_CONDITION:
                return getVehicleCondition();
            case RuntimePackage.VEHICLE__MODUS:
                return getModus();
            case RuntimePackage.VEHICLE__CURRENT_SPEED:
                return getCurrentSpeed();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RuntimePackage.VEHICLE__VEHICLE:
                setVehicle((V)newValue);
                return;
            case RuntimePackage.VEHICLE__VEHICLE_CONDITION:
                setVehicleCondition((Integer)newValue);
                return;
            case RuntimePackage.VEHICLE__MODUS:
                setModus((InterfaceModus)newValue);
                return;
            case RuntimePackage.VEHICLE__CURRENT_SPEED:
                setCurrentSpeed((Integer)newValue);
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
            case RuntimePackage.VEHICLE__VEHICLE:
                setVehicle((V)null);
                return;
            case RuntimePackage.VEHICLE__VEHICLE_CONDITION:
                setVehicleCondition(VEHICLE_CONDITION_EDEFAULT);
                return;
            case RuntimePackage.VEHICLE__MODUS:
                setModus(MODUS_EDEFAULT);
                return;
            case RuntimePackage.VEHICLE__CURRENT_SPEED:
                setCurrentSpeed(CURRENT_SPEED_EDEFAULT);
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
            case RuntimePackage.VEHICLE__VEHICLE:
                return vehicle != null;
            case RuntimePackage.VEHICLE__VEHICLE_CONDITION:
                return vehicleCondition != VEHICLE_CONDITION_EDEFAULT;
            case RuntimePackage.VEHICLE__MODUS:
                return modus != MODUS_EDEFAULT;
            case RuntimePackage.VEHICLE__CURRENT_SPEED:
                return currentSpeed != CURRENT_SPEED_EDEFAULT;
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
        result.append(" (vehicleCondition: ");
        result.append(vehicleCondition);
        result.append(", modus: ");
        result.append(modus);
        result.append(", currentSpeed: ");
        result.append(currentSpeed);
        result.append(')');
        return result.toString();
    }

} //VehicleImpl
