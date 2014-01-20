/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nahkampfwaffe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Nahkampfwaffe#getReichweite <em>Reichweite</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getNahkampfwaffe()
 * @model
 * @generated
 */
public interface Nahkampfwaffe extends AbstaktWaffe {
	/**
     * Returns the value of the '<em><b>Reichweite</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reichweite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Reichweite</em>' attribute.
     * @see #setReichweite(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getNahkampfwaffe_Reichweite()
     * @model
     * @generated
     */
	int getReichweite();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Nahkampfwaffe#getReichweite <em>Reichweite</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reichweite</em>' attribute.
     * @see #getReichweite()
     * @generated
     */
	void setReichweite(int value);

} // Nahkampfwaffe
