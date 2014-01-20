/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Initation#getStufe <em>Stufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Initation#getErlernt <em>Erlernt</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getInitation()
 * @model
 * @generated
 */
public interface Initation extends EObject {
	/**
     * Returns the value of the '<em><b>Stufe</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stufe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Stufe</em>' attribute.
     * @see #setStufe(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getInitation_Stufe()
     * @model
     * @generated
     */
	int getStufe();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Initation#getStufe <em>Stufe</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stufe</em>' attribute.
     * @see #getStufe()
     * @generated
     */
	void setStufe(int value);

	/**
     * Returns the value of the '<em><b>Erlernt</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Erlernt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Erlernt</em>' reference.
     * @see #setErlernt(MetaMagie)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getInitation_Erlernt()
     * @model
     * @generated
     */
	MetaMagie getErlernt();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Initation#getErlernt <em>Erlernt</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Erlernt</em>' reference.
     * @see #getErlernt()
     * @generated
     */
	void setErlernt(MetaMagie value);

} // Initation
