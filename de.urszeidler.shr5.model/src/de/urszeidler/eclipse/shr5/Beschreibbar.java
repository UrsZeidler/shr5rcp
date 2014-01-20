/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beschreibbar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Beschreibbar#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Beschreibbar#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Beschreibbar#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getBeschreibbar()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Beschreibbar extends EObject {
	/**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getBeschreibbar_Name()
     * @model required="true"
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Beschreibbar#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

	/**
     * Returns the value of the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beschreibung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Beschreibung</em>' attribute.
     * @see #setBeschreibung(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getBeschreibbar_Beschreibung()
     * @model
     * @generated
     */
	String getBeschreibung();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Beschreibbar#getBeschreibung <em>Beschreibung</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Beschreibung</em>' attribute.
     * @see #getBeschreibung()
     * @generated
     */
	void setBeschreibung(String value);

	/**
     * Returns the value of the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Image</em>' attribute.
     * @see #setImage(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getBeschreibbar_Image()
     * @model
     * @generated
     */
	String getImage();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Beschreibbar#getImage <em>Image</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Image</em>' attribute.
     * @see #getImage()
     * @generated
     */
	void setImage(String value);

} // Beschreibbar
