/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Attributes#getAttibutePoints <em>Attibute Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getAttributes()
 * @model
 * @generated
 */
public interface Attributes extends PriorityCategorie {
	/**
	 * Returns the value of the '<em><b>Attibute Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attibute Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attibute Points</em>' attribute.
	 * @see #setAttibutePoints(int)
	 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getAttributes_AttibutePoints()
	 * @model required="true"
	 * @generated
	 */
	int getAttibutePoints();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Attributes#getAttibutePoints <em>Attibute Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attibute Points</em>' attribute.
	 * @see #getAttibutePoints()
	 * @generated
	 */
	void setAttibutePoints(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true"
	 * @generated
	 */
	int calcAttributesSpend(ManagedCharacter context);

} // Attributes
