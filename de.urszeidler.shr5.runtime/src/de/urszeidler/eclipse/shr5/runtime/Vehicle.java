/**
 */
package de.urszeidler.eclipse.shr5.runtime;

import de.urszeidler.eclipse.shr5.Fahrzeug;
import de.urszeidler.eclipse.shr5.InterfaceModus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.Vehicle#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.Vehicle#getVehicleCondition <em>Vehicle Condition</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.Vehicle#getModus <em>Modus</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.Vehicle#getCurrentSpeed <em>Current Speed</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getVehicle()
 * @model abstract="true"
 * @generated
 */
public interface Vehicle<V extends Fahrzeug> extends AbstractExtendetDataAware {
    /**
     * Returns the value of the '<em><b>Vehicle</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vehicle</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vehicle</em>' reference.
     * @see #setVehicle(Fahrzeug)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getVehicle_Vehicle()
     * @model required="true"
     * @generated
     */
    V getVehicle();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.Vehicle#getVehicle <em>Vehicle</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vehicle</em>' reference.
     * @see #getVehicle()
     * @generated
     */
    void setVehicle(V value);

    /**
     * Returns the value of the '<em><b>Vehicle Condition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vehicle Condition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vehicle Condition</em>' attribute.
     * @see #setVehicleCondition(int)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getVehicle_VehicleCondition()
     * @model
     * @generated
     */
    int getVehicleCondition();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.Vehicle#getVehicleCondition <em>Vehicle Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vehicle Condition</em>' attribute.
     * @see #getVehicleCondition()
     * @generated
     */
    void setVehicleCondition(int value);

    /**
     * Returns the value of the '<em><b>Modus</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.InterfaceModus}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modus</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modus</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.InterfaceModus
     * @see #setModus(InterfaceModus)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getVehicle_Modus()
     * @model
     * @generated
     */
    InterfaceModus getModus();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.Vehicle#getModus <em>Modus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Modus</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.InterfaceModus
     * @see #getModus()
     * @generated
     */
    void setModus(InterfaceModus value);

    /**
     * Returns the value of the '<em><b>Current Speed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Speed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current Speed</em>' attribute.
     * @see #setCurrentSpeed(int)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getVehicle_CurrentSpeed()
     * @model
     * @generated
     */
    int getCurrentSpeed();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.Vehicle#getCurrentSpeed <em>Current Speed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current Speed</em>' attribute.
     * @see #getCurrentSpeed()
     * @generated
     */
    void setCurrentSpeed(int value);

} // Vehicle
