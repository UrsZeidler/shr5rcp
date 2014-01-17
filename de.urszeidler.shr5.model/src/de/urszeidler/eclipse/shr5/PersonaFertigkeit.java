/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona Fertigkeit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaFertigkeit#getFertigkeit <em>Fertigkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaFertigkeit#getStufe <em>Stufe</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaFertigkeit()
 * @model
 * @generated
 */
public interface PersonaFertigkeit extends EObject {
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
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaFertigkeit_Stufe()
	 * @model
	 * @generated
	 */
	int getStufe();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.PersonaFertigkeit#getStufe <em>Stufe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stufe</em>' attribute.
	 * @see #getStufe()
	 * @generated
	 */
	void setStufe(int value);

} // PersonaFertigkeit
