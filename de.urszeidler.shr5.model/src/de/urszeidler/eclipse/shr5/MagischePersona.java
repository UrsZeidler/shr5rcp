/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Magische Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.MagischePersona#getMentor <em>Mentor</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getMagischePersona()
 * @model abstract="true"
 * @generated
 */
public interface MagischePersona extends KoerperPersona, BaseMagischePersona {

	/**
	 * Returns the value of the '<em><b>Mentor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mentor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mentor</em>' reference.
	 * @see #setMentor(Schutzgeist)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getMagischePersona_Mentor()
	 * @model
	 * @generated
	 */
	Schutzgeist getMentor();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.MagischePersona#getMentor <em>Mentor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mentor</em>' reference.
	 * @see #getMentor()
	 * @generated
	 */
	void setMentor(Schutzgeist value);
} // MagischePersona
