/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Skill#getSkillPoints <em>Skill Points</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Skill#getGroupPoints <em>Group Points</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getSkill()
 * @model
 * @generated
 */
public interface Skill extends PriorityCategorie {
	/**
     * Returns the value of the '<em><b>Skill Points</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Skill Points</em>' attribute.
     * @see #setSkillPoints(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getSkill_SkillPoints()
     * @model required="true"
     * @generated
     */
	int getSkillPoints();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Skill#getSkillPoints <em>Skill Points</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skill Points</em>' attribute.
     * @see #getSkillPoints()
     * @generated
     */
	void setSkillPoints(int value);

	/**
     * Returns the value of the '<em><b>Group Points</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Group Points</em>' attribute.
     * @see #setGroupPoints(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getSkill_GroupPoints()
     * @model required="true"
     * @generated
     */
	int getGroupPoints();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Skill#getGroupPoints <em>Group Points</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group Points</em>' attribute.
     * @see #getGroupPoints()
     * @generated
     */
	void setGroupPoints(int value);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model contextRequired="true"
     * @generated
     */
	int calcSkillSpend(ManagedCharacter context);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model contextRequired="true"
     * @generated
     */
	int calcGroupSpend(ManagedCharacter context);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model contextRequired="true"
     * @generated
     */
	int calcKnowledgeSkillSpend(ManagedCharacter context);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model contextRequired="true"
     * @generated
     */
	int calcKnowledgeSkillPoints(ManagedCharacter context);

} // Skill
