/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Sensor#getFunctions <em>Functions</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Sensor#getRating <em>Rating</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Sensor#getCapacityValue <em>Capacity Value</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Capacity, Beschreibbar, Quelle, GeldWert {
    /**
     * Returns the value of the '<em><b>Functions</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.SensorFunction}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Functions</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSensor_Functions()
     * @model
     * @generated
     */
    EList<SensorFunction> getFunctions();

    /**
     * Returns the value of the '<em><b>Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rating</em>' attribute.
     * @see #setRating(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSensor_Rating()
     * @model
     * @generated
     */
    int getRating();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Sensor#getRating <em>Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rating</em>' attribute.
     * @see #getRating()
     * @generated
     */
    void setRating(int value);

    /**
     * Returns the value of the '<em><b>Capacity Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capacity Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capacity Value</em>' attribute.
     * @see #setCapacityValue(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSensor_CapacityValue()
     * @model
     * @generated
     */
    int getCapacityValue();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Sensor#getCapacityValue <em>Capacity Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capacity Value</em>' attribute.
     * @see #getCapacityValue()
     * @generated
     */
    void setCapacityValue(int value);

} // Sensor
