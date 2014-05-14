/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Matix Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * All active Matrix defice are defined thou this interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.ActiveMatixDevice#getAngriff <em>Angriff</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ActiveMatixDevice#getSchleicher <em>Schleicher</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getActiveMatixDevice()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ActiveMatixDevice extends MatrixAttributes {
    /**
     * Returns the value of the '<em><b>Angriff</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Angriff</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Angriff</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getActiveMatixDevice_Angriff()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getAngriff();

    /**
     * Returns the value of the '<em><b>Schleicher</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schleicher</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schleicher</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getActiveMatixDevice_Schleicher()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getSchleicher();

} // ActiveMatixDevice
