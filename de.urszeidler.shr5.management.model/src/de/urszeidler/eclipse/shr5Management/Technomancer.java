/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technomancer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Technomancer#getResonanz <em>Resonanz</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Technomancer#getComplexForms <em>Complex Forms</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getTechnomancer()
 * @model
 * @generated
 */
public interface Technomancer extends SpecialType {
	/**
     * Returns the value of the '<em><b>Resonanz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resonanz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Resonanz</em>' attribute.
     * @see #setResonanz(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getTechnomancer_Resonanz()
     * @model
     * @generated
     */
	int getResonanz();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Technomancer#getResonanz <em>Resonanz</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resonanz</em>' attribute.
     * @see #getResonanz()
     * @generated
     */
	void setResonanz(int value);

	/**
     * Returns the value of the '<em><b>Complex Forms</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Forms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Complex Forms</em>' attribute.
     * @see #setComplexForms(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getTechnomancer_ComplexForms()
     * @model
     * @generated
     */
	int getComplexForms();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Technomancer#getComplexForms <em>Complex Forms</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Complex Forms</em>' attribute.
     * @see #getComplexForms()
     * @generated
     */
	void setComplexForms(int value);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model contextRequired="true"
     * @generated
     */
	int calcComplexFormsSpend(ManagedCharacter context);

} // Technomancer
