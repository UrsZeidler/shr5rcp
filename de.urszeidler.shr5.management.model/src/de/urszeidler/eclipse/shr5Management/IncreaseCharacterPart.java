/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Increase Character Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getIncreaseCharacterPart()
 * @model
 * @generated
 */
public interface IncreaseCharacterPart extends Advancement {
	/**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(EClass)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getIncreaseCharacterPart_Type()
     * @model required="true"
     * @generated
     */
	EClass getType();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
	void setType(EClass value);

} // IncreaseCharacterPart
