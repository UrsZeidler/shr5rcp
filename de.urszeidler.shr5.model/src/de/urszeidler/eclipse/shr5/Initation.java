/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Initation#getErlernt <em>Erlernt</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getInitation()
 * @model
 * @generated
 */
public interface Initation extends Steigerbar {
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
