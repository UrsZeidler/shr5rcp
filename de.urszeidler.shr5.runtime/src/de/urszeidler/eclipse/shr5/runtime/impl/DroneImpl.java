/**
 */
package de.urszeidler.eclipse.shr5.runtime.impl;

import de.urszeidler.eclipse.shr5.Drohne;

import de.urszeidler.eclipse.shr5.runtime.Drone;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DroneImpl extends VehicleImpl<Drohne> implements Drone {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DroneImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RuntimePackage.Literals.DRONE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setVehicle(Drohne newVehicle) {
        super.setVehicle(newVehicle);
    }

} //DroneImpl
