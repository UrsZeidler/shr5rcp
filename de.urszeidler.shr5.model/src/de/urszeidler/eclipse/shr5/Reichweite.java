/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reichweite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The range.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Reichweite#getMin <em>Min</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Reichweite#getKurz <em>Kurz</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Reichweite#getMittel <em>Mittel</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Reichweite#getWeit <em>Weit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Reichweite#getExtrem <em>Extrem</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getReichweite()
 * @model
 * @generated
 */
public interface Reichweite extends Beschreibbar, Identifiable {
	/**
     * Returns the value of the '<em><b>Min</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Min</em>' attribute.
     * @see #setMin(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getReichweite_Min()
     * @model required="true"
     * @generated
     */
	int getMin();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Reichweite#getMin <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min</em>' attribute.
     * @see #getMin()
     * @generated
     */
	void setMin(int value);

	/**
     * Returns the value of the '<em><b>Kurz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kurz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Kurz</em>' attribute.
     * @see #setKurz(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getReichweite_Kurz()
     * @model required="true"
     * @generated
     */
	int getKurz();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Reichweite#getKurz <em>Kurz</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kurz</em>' attribute.
     * @see #getKurz()
     * @generated
     */
	void setKurz(int value);

	/**
     * Returns the value of the '<em><b>Mittel</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mittel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Mittel</em>' attribute.
     * @see #setMittel(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getReichweite_Mittel()
     * @model required="true"
     * @generated
     */
	int getMittel();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Reichweite#getMittel <em>Mittel</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mittel</em>' attribute.
     * @see #getMittel()
     * @generated
     */
	void setMittel(int value);

	/**
     * Returns the value of the '<em><b>Weit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Weit</em>' attribute.
     * @see #setWeit(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getReichweite_Weit()
     * @model required="true"
     * @generated
     */
	int getWeit();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Reichweite#getWeit <em>Weit</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Weit</em>' attribute.
     * @see #getWeit()
     * @generated
     */
	void setWeit(int value);

	/**
     * Returns the value of the '<em><b>Extrem</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Extrem</em>' attribute.
     * @see #setExtrem(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getReichweite_Extrem()
     * @model required="true"
     * @generated
     */
	int getExtrem();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Reichweite#getExtrem <em>Extrem</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extrem</em>' attribute.
     * @see #getExtrem()
     * @generated
     */
	void setExtrem(int value);

} // Reichweite
