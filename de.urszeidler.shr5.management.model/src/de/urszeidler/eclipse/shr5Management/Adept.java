/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The generator system option for a ki adept.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Adept#getMagic <em>Magic</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getAdept()
 * @model
 * @generated
 */
public interface Adept extends SpecialType {
	/**
     * Returns the value of the '<em><b>Magic</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Magic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Magic</em>' attribute.
     * @see #setMagic(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getAdept_Magic()
     * @model
     * @generated
     */
	int getMagic();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Adept#getMagic <em>Magic</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Magic</em>' attribute.
     * @see #getMagic()
     * @generated
     */
	void setMagic(int value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model contextRequired="true"
     * @generated
     */
    int calcPowerPointsSpend(ManagedCharacter context);

} // Adept
