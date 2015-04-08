/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona Value Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.PersonaValueChange#getFrom <em>From</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.PersonaValueChange#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPersonaValueChange()
 * @model abstract="true"
 * @generated
 */
public interface PersonaValueChange extends Changes {
	/**
     * Returns the value of the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' attribute.
     * @see #setFrom(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPersonaValueChange_From()
     * @model required="true"
     * @generated
     */
	int getFrom();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.PersonaValueChange#getFrom <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' attribute.
     * @see #getFrom()
     * @generated
     */
	void setFrom(int value);

	/**
     * Returns the value of the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>To</em>' attribute.
     * @see #setTo(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPersonaValueChange_To()
     * @model required="true"
     * @generated
     */
	int getTo();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.PersonaValueChange#getTo <em>To</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>To</em>' attribute.
     * @see #getTo()
     * @generated
     */
	void setTo(int value);

} // PersonaValueChange
