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
 * Defines the interface for all passive matix devices.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixDevice#getGeraetestufe <em>Geraetestufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixDevice#getFirewall <em>Firewall</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixDevice#getDatenverarbeitung <em>Datenverarbeitung</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getMatrixDevice()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MatrixDevice extends MatixConditionMonitor {
    /**
     * Returns the value of the '<em><b>Geraetestufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Geraetestufe</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Geraetestufe</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMatrixDevice_Geraetestufe()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getGeraetestufe();

    /**
     * Returns the value of the '<em><b>Firewall</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Firewall</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Firewall</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMatrixDevice_Firewall()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getFirewall();

    /**
     * Returns the value of the '<em><b>Datenverarbeitung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Datenverarbeitung</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Datenverarbeitung</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMatrixDevice_Datenverarbeitung()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getDatenverarbeitung();

} // MatrixDevice
