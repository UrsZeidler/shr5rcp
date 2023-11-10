/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona Komplex Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaKomplexForm#getForm <em>Form</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaKomplexForm#getStufe <em>Stufe</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaKomplexForm()
 * @model
 * @generated
 */
public interface PersonaKomplexForm extends Erlernbar {
	/**
     * Returns the value of the '<em><b>Form</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Form</em>' reference.
     * @see #setForm(KomplexeForm)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaKomplexForm_Form()
     * @model required="true"
     * @generated
     */
	KomplexeForm getForm();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.PersonaKomplexForm#getForm <em>Form</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Form</em>' reference.
     * @see #getForm()
     * @generated
     */
	void setForm(KomplexeForm value);

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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getPersonaKomplexForm_Stufe()
     * @model required="true"
     * @generated
     */
	int getStufe();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.PersonaKomplexForm#getStufe <em>Stufe</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stufe</em>' attribute.
     * @see #getStufe()
     * @generated
     */
	void setStufe(int value);

} // PersonaKomplexForm
