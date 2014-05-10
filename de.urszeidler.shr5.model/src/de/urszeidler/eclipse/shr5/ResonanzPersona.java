/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resonanz Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getResonanz <em>Resonanz</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getResonanzBasis <em>Resonanz Basis</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getResonanzPersona()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ResonanzPersona extends ActiveMatixDevice {
	/**
     * Returns the value of the '<em><b>Resonanz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resonanz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Resonanz</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getResonanzPersona_Resonanz()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
	int getResonanz();

	/**
     * Returns the value of the '<em><b>Resonanz Basis</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resonanz Basis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Resonanz Basis</em>' attribute.
     * @see #setResonanzBasis(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getResonanzPersona_ResonanzBasis()
     * @model
     * @generated
     */
	int getResonanzBasis();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getResonanzBasis <em>Resonanz Basis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resonanz Basis</em>' attribute.
     * @see #getResonanzBasis()
     * @generated
     */
	void setResonanzBasis(int value);

} // ResonanzPersona
