/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cyberware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Cyberware#getPersona <em>Persona</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Cyberware#getEinbau <em>Einbau</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberware()
 * @model
 * @generated
 */
public interface Cyberware extends Koerpermods, GeldWert {
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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberware_Persona()
     * @model
     * @generated
     */
	AbstraktPersona getPersona();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Cyberware#getPersona <em>Persona</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Persona</em>' reference.
     * @see #getPersona()
     * @generated
     */
	void setPersona(AbstraktPersona value);

	/**
     * Returns the value of the '<em><b>Einbau</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.AbstraktGegenstand}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Einbau</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Einbau</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberware_Einbau()
     * @model containment="true"
     * @generated
     */
	EList<AbstraktGegenstand> getEinbau();

} // Cyberware
