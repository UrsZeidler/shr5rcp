/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anwendbar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Anwendbar#getFertigkeit <em>Fertigkeit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAnwendbar()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Anwendbar extends EObject {
	/**
	 * Returns the value of the '<em><b>Fertigkeit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fertigkeit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fertigkeit</em>' reference.
	 * @see #setFertigkeit(Fertigkeit)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAnwendbar_Fertigkeit()
	 * @model
	 * @generated
	 */
	Fertigkeit getFertigkeit();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Anwendbar#getFertigkeit <em>Fertigkeit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fertigkeit</em>' reference.
	 * @see #getFertigkeit()
	 * @generated
	 */
	void setFertigkeit(Fertigkeit value);

} // Anwendbar
