/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import de.urszeidler.eclipse.shr5.Spezies;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.MetaType#getChoosableTypes <em>Choosable Types</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.MetaType#getSpecialPoints <em>Special Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getMetaType()
 * @model
 * @generated
 */
public interface MetaType extends PriorityCategorie {
	/**
     * Returns the value of the '<em><b>Choosable Types</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choosable Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Choosable Types</em>' reference.
     * @see #setChoosableTypes(Spezies)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getMetaType_ChoosableTypes()
     * @model required="true"
     * @generated
     */
	Spezies getChoosableTypes();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.MetaType#getChoosableTypes <em>Choosable Types</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Choosable Types</em>' reference.
     * @see #getChoosableTypes()
     * @generated
     */
	void setChoosableTypes(Spezies value);

	/**
     * Returns the value of the '<em><b>Special Points</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Special Points</em>' attribute.
     * @see #setSpecialPoints(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getMetaType_SpecialPoints()
     * @model
     * @generated
     */
	int getSpecialPoints();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.MetaType#getSpecialPoints <em>Special Points</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Special Points</em>' attribute.
     * @see #getSpecialPoints()
     * @generated
     */
	void setSpecialPoints(int value);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model contextRequired="true"
     * @generated
     */
	int calcSpecialPointsSpend(ManagedCharacter context);

} // MetaType
