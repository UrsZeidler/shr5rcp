/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shr5 System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKarmaToResourceFactor <em>Karma To Resource Factor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKarmaToMagicFactor <em>Karma To Magic Factor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getNumberOfMaxAttributes <em>Number Of Max Attributes</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKnowlegeSkillFactor <em>Knowlege Skill Factor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5System#getCharismaToConnectionFactor <em>Charisma To Connection Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System()
 * @model
 * @generated
 */
public interface Shr5System extends PrioritySystem {

	/**
     * Returns the value of the '<em><b>Karma To Resource Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Karma To Resource Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Karma To Resource Factor</em>' attribute.
     * @see #setKarmaToResourceFactor(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_KarmaToResourceFactor()
     * @model required="true"
     * @generated
     */
	int getKarmaToResourceFactor();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKarmaToResourceFactor <em>Karma To Resource Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Karma To Resource Factor</em>' attribute.
     * @see #getKarmaToResourceFactor()
     * @generated
     */
	void setKarmaToResourceFactor(int value);

	/**
     * Returns the value of the '<em><b>Karma To Magic Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Karma To Magic Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Karma To Magic Factor</em>' attribute.
     * @see #setKarmaToMagicFactor(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_KarmaToMagicFactor()
     * @model required="true"
     * @generated
     */
	int getKarmaToMagicFactor();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKarmaToMagicFactor <em>Karma To Magic Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Karma To Magic Factor</em>' attribute.
     * @see #getKarmaToMagicFactor()
     * @generated
     */
	void setKarmaToMagicFactor(int value);

	/**
     * Returns the value of the '<em><b>Number Of Max Attributes</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Max Attributes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Number Of Max Attributes</em>' attribute.
     * @see #setNumberOfMaxAttributes(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_NumberOfMaxAttributes()
     * @model required="true"
     * @generated
     */
	int getNumberOfMaxAttributes();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getNumberOfMaxAttributes <em>Number Of Max Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Number Of Max Attributes</em>' attribute.
     * @see #getNumberOfMaxAttributes()
     * @generated
     */
	void setNumberOfMaxAttributes(int value);

	/**
     * Returns the value of the '<em><b>Knowlege Skill Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knowlege Skill Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Knowlege Skill Factor</em>' attribute.
     * @see #setKnowlegeSkillFactor(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_KnowlegeSkillFactor()
     * @model required="true"
     * @generated
     */
	int getKnowlegeSkillFactor();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKnowlegeSkillFactor <em>Knowlege Skill Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Knowlege Skill Factor</em>' attribute.
     * @see #getKnowlegeSkillFactor()
     * @generated
     */
	void setKnowlegeSkillFactor(int value);

	/**
     * Returns the value of the '<em><b>Charisma To Connection Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charisma To Connection Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Charisma To Connection Factor</em>' attribute.
     * @see #setCharismaToConnectionFactor(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5System_CharismaToConnectionFactor()
     * @model required="true"
     * @generated
     */
	int getCharismaToConnectionFactor();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getCharismaToConnectionFactor <em>Charisma To Connection Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Charisma To Connection Factor</em>' attribute.
     * @see #getCharismaToConnectionFactor()
     * @generated
     */
	void setCharismaToConnectionFactor(int value);
} // Shr5System
