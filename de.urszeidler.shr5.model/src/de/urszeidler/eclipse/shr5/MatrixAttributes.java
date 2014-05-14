/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the interface for all passive matix devices.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getGeraetestufe <em>Geraetestufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getFirewall <em>Firewall</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getDatenverarbeitung <em>Datenverarbeitung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getCurrentModus <em>Current Modus</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getMatrixAttributes()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MatrixAttributes extends MatixConditionMonitor {
    /**
     * Returns the value of the '<em><b>Geraetestufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Geraetestufe</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Geraetestufe</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMatrixAttributes_Geraetestufe()
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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMatrixAttributes_Firewall()
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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMatrixAttributes_Datenverarbeitung()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getDatenverarbeitung();

    /**
     * Returns the value of the '<em><b>Current Modus</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.InterfaceModus}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Modus</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current Modus</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.InterfaceModus
     * @see #setCurrentModus(InterfaceModus)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMatrixAttributes_CurrentModus()
     * @model
     * @generated
     */
    InterfaceModus getCurrentModus();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getCurrentModus <em>Current Modus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current Modus</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.InterfaceModus
     * @see #getCurrentModus()
     * @generated
     */
    void setCurrentModus(InterfaceModus value);

} // MatrixAttributes
