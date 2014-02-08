/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona Fertigkeit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaFertigkeit#getFertigkeit <em>Fertigkeit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaFertigkeit()
 * @model
 * @generated
 */
public interface PersonaFertigkeit extends Steigerbar {
	/**
     * Returns the value of the '<em><b>Fertigkeit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fertigkeit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Fertigkeit</em>' reference.
     * @see #setFertigkeit(Fertigkeit)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaFertigkeit_Fertigkeit()
     * @model
     * @generated
     */
	Fertigkeit getFertigkeit();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.PersonaFertigkeit#getFertigkeit <em>Fertigkeit</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fertigkeit</em>' reference.
     * @see #getFertigkeit()
     * @generated
     */
	void setFertigkeit(Fertigkeit value);

} // PersonaFertigkeit
