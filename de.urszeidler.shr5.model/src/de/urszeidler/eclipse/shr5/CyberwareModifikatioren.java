/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cyberware Modifikatioren</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Collects the cyberware related modificators.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.CyberwareModifikatioren#isDirectNeuralInterface <em>Direct Neural Interface</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.CyberwareModifikatioren#isUniversalDataConnector <em>Universal Data Connector</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.CyberwareModifikatioren#getControlRig <em>Control Rig</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.CyberwareModifikatioren#getSimRig <em>Sim Rig</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberwareModifikatioren()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CyberwareModifikatioren extends ModifikatorAttribute {
    /**
     * Returns the value of the '<em><b>Direct Neural Interface</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defnies a DNI.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Direct Neural Interface</em>' attribute.
     * @see #setDirectNeuralInterface(boolean)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberwareModifikatioren_DirectNeuralInterface()
     * @model
     * @generated
     */
    boolean isDirectNeuralInterface();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.CyberwareModifikatioren#isDirectNeuralInterface <em>Direct Neural Interface</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Direct Neural Interface</em>' attribute.
     * @see #isDirectNeuralInterface()
     * @generated
     */
    void setDirectNeuralInterface(boolean value);

    /**
     * Returns the value of the '<em><b>Universal Data Connector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines the UDC.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Universal Data Connector</em>' attribute.
     * @see #setUniversalDataConnector(boolean)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberwareModifikatioren_UniversalDataConnector()
     * @model
     * @generated
     */
    boolean isUniversalDataConnector();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.CyberwareModifikatioren#isUniversalDataConnector <em>Universal Data Connector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Universal Data Connector</em>' attribute.
     * @see #isUniversalDataConnector()
     * @generated
     */
    void setUniversalDataConnector(boolean value);

    /**
     * Returns the value of the '<em><b>Control Rig</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines a rigger controll. The value is the grade.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Control Rig</em>' attribute.
     * @see #setControlRig(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberwareModifikatioren_ControlRig()
     * @model
     * @generated
     */
    int getControlRig();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.CyberwareModifikatioren#getControlRig <em>Control Rig</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Rig</em>' attribute.
     * @see #getControlRig()
     * @generated
     */
    void setControlRig(int value);

    /**
     * Returns the value of the '<em><b>Sim Rig</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sim Rig</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sim Rig</em>' attribute.
     * @see #setSimRig(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberwareModifikatioren_SimRig()
     * @model
     * @generated
     */
    int getSimRig();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.CyberwareModifikatioren#getSimRig <em>Sim Rig</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sim Rig</em>' attribute.
     * @see #getSimRig()
     * @generated
     */
    void setSimRig(int value);

} // CyberwareModifikatioren
