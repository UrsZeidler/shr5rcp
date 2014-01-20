/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spellcaster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Spellcaster#getSpellPoints <em>Spell Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getSpellcaster()
 * @model
 * @generated
 */
public interface Spellcaster extends Adept {
	/**
     * Returns the value of the '<em><b>Spell Points</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spell Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Spell Points</em>' attribute.
     * @see #setSpellPoints(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getSpellcaster_SpellPoints()
     * @model
     * @generated
     */
	int getSpellPoints();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Spellcaster#getSpellPoints <em>Spell Points</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Spell Points</em>' attribute.
     * @see #getSpellPoints()
     * @generated
     */
	void setSpellPoints(int value);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model contextRequired="true"
     * @generated
     */
	int calcSpellPointsSpend(ManagedCharacter context);

} // Spellcaster
