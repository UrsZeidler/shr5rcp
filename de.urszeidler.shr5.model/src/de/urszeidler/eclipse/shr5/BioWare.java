/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bio Ware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.BioWare#getPersona <em>Persona</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getBioWare()
 * @model
 * @generated
 */
public interface BioWare extends Koerpermods, GeldWert {
	/**
     * Returns the value of the '<em><b>Persona</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persona</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Persona</em>' reference.
     * @see #setPersona(AbstraktPersona)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getBioWare_Persona()
     * @model
     * @generated
     */
	AbstraktPersona getPersona();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.BioWare#getPersona <em>Persona</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Persona</em>' reference.
     * @see #getPersona()
     * @generated
     */
	void setPersona(AbstraktPersona value);

} // BioWare
