/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona Fertigkeit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaFertigkeit#getFertigkeit <em>Fertigkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaFertigkeit#getSpezialisierungen <em>Spezialisierungen</em>}</li>
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

    /**
     * Returns the value of the '<em><b>Spezialisierungen</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Spezialisierung}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Spezialisierungen</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Spezialisierungen</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaFertigkeit_Spezialisierungen()
     * @model
     * @generated
     */
    EList<Spezialisierung> getSpezialisierungen();

} // PersonaFertigkeit
