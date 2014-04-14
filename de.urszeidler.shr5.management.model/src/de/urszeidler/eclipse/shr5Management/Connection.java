/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A connection refers to a managed character and has the loy and influence value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Connection#getInfluence <em>Influence</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Connection#getLoyality <em>Loyality</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Connection#getCharacter <em>Character</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
     * Returns the value of the '<em><b>Influence</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Influence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Influence</em>' attribute.
     * @see #setInfluence(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getConnection_Influence()
     * @model
     * @generated
     */
	int getInfluence();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Connection#getInfluence <em>Influence</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Influence</em>' attribute.
     * @see #getInfluence()
     * @generated
     */
	void setInfluence(int value);

	/**
     * Returns the value of the '<em><b>Loyality</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loyality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Loyality</em>' attribute.
     * @see #setLoyality(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getConnection_Loyality()
     * @model
     * @generated
     */
	int getLoyality();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Connection#getLoyality <em>Loyality</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loyality</em>' attribute.
     * @see #getLoyality()
     * @generated
     */
	void setLoyality(int value);

	/**
     * Returns the value of the '<em><b>Character</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Character</em>' reference.
     * @see #setCharacter(ManagedCharacter)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getConnection_Character()
     * @model required="true"
     * @generated
     */
	ManagedCharacter getCharacter();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Connection#getCharacter <em>Character</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Character</em>' reference.
     * @see #getCharacter()
     * @generated
     */
	void setCharacter(ManagedCharacter value);

} // Connection
