/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bodenfahrzeug</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Bodenfahrzeug#getHandlingGelaende <em>Handling Gelaende</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Bodenfahrzeug#getGeschwindigkeitGelände <em>Geschwindigkeit Gelände</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getBodenfahrzeug()
 * @model
 * @generated
 */
public interface Bodenfahrzeug extends PassagierFahrzeug {
	/**
     * Returns the value of the '<em><b>Handling Gelaende</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handling Gelaende</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Handling Gelaende</em>' attribute.
     * @see #setHandlingGelaende(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getBodenfahrzeug_HandlingGelaende()
     * @model
     * @generated
     */
	int getHandlingGelaende();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Bodenfahrzeug#getHandlingGelaende <em>Handling Gelaende</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Handling Gelaende</em>' attribute.
     * @see #getHandlingGelaende()
     * @generated
     */
	void setHandlingGelaende(int value);

	/**
     * Returns the value of the '<em><b>Geschwindigkeit Gelände</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geschwindigkeit Gelände</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Geschwindigkeit Gelände</em>' attribute.
     * @see #setGeschwindigkeitGelände(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getBodenfahrzeug_GeschwindigkeitGelände()
     * @model
     * @generated
     */
	int getGeschwindigkeitGelände();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Bodenfahrzeug#getGeschwindigkeitGelände <em>Geschwindigkeit Gelände</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Geschwindigkeit Gelände</em>' attribute.
     * @see #getGeschwindigkeitGelände()
     * @generated
     */
	void setGeschwindigkeitGelände(int value);

} // Bodenfahrzeug
