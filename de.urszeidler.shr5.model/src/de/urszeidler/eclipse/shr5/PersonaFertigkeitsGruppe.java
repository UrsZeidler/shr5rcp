/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona Fertigkeits Gruppe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe#getGruppe <em>Gruppe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe#getStufe <em>Stufe</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaFertigkeitsGruppe()
 * @model
 * @generated
 */
public interface PersonaFertigkeitsGruppe extends EObject {
	/**
     * Returns the value of the '<em><b>Gruppe</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gruppe</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Gruppe</em>' reference.
     * @see #setGruppe(FertigkeitsGruppe)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaFertigkeitsGruppe_Gruppe()
     * @model
     * @generated
     */
	FertigkeitsGruppe getGruppe();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe#getGruppe <em>Gruppe</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gruppe</em>' reference.
     * @see #getGruppe()
     * @generated
     */
	void setGruppe(FertigkeitsGruppe value);

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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaFertigkeitsGruppe_Stufe()
     * @model
     * @generated
     */
	int getStufe();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe#getStufe <em>Stufe</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stufe</em>' attribute.
     * @see #getStufe()
     * @generated
     */
	void setStufe(int value);

} // PersonaFertigkeitsGruppe
