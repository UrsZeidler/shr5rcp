/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The basic matic device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixDevice#getPan <em>Pan</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getMatrixDevice()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MatrixDevice extends MatrixAttributes {
    /**
     * Returns the value of the '<em><b>Pan</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link de.urszeidler.eclipse.shr5.PersonalAreaNetwork#getMaster <em>Master</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pan</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pan</em>' containment reference.
     * @see #setPan(PersonalAreaNetwork)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMatrixDevice_Pan()
     * @see de.urszeidler.eclipse.shr5.PersonalAreaNetwork#getMaster
     * @model opposite="master" containment="true"
     * @generated
     */
    PersonalAreaNetwork getPan();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.MatrixDevice#getPan <em>Pan</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pan</em>' containment reference.
     * @see #getPan()
     * @generated
     */
    void setPan(PersonalAreaNetwork value);

} // MatrixDevice
