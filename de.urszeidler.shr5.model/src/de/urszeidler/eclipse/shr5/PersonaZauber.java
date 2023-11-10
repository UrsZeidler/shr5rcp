/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona Zauber</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaZauber#getStufe <em>Stufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaZauber#getFormel <em>Formel</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaZauber()
 * @model
 * @generated
 */
public interface PersonaZauber extends Erlernbar {
	/**
     * Returns the value of the '<em><b>Stufe</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stufe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Stufe</em>' attribute.
     * @see #setStufe(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaZauber_Stufe()
     * @model required="true"
     * @generated
     */
	int getStufe();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.PersonaZauber#getStufe <em>Stufe</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stufe</em>' attribute.
     * @see #getStufe()
     * @generated
     */
	void setStufe(int value);

	/**
     * Returns the value of the '<em><b>Formel</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Formel</em>' reference.
     * @see #setFormel(Zauber)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaZauber_Formel()
     * @model required="true"
     * @generated
     */
	Zauber getFormel();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.PersonaZauber#getFormel <em>Formel</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Formel</em>' reference.
     * @see #getFormel()
     * @generated
     */
	void setFormel(Zauber value);

} // PersonaZauber
