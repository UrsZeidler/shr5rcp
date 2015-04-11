/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.SensorFunction#getMaxRange <em>Max Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSensorFunction()
 * @model
 * @generated
 */
public interface SensorFunction extends Beschreibbar, Quelle {
    /**
     * Returns the value of the '<em><b>Max Range</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Range</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Range</em>' attribute.
     * @see #setMaxRange(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSensorFunction_MaxRange()
     * @model
     * @generated
     */
    int getMaxRange();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.SensorFunction#getMaxRange <em>Max Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Range</em>' attribute.
     * @see #getMaxRange()
     * @generated
     */
    void setMaxRange(int value);

} // SensorFunction
