/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zauber</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Zauber#getArt <em>Art</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Zauber#getReichweite <em>Reichweite</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Zauber#getSchaden <em>Schaden</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Zauber#getDauer <em>Dauer</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Zauber#getEntzug <em>Entzug</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Zauber#getKategorie <em>Kategorie</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Zauber#getMerkmale <em>Merkmale</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getZauber()
 * @model
 * @generated
 */
public interface Zauber extends Beschreibbar, Quelle {
	/**
     * Returns the value of the '<em><b>Art</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.ZauberArt}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Art</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Art</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.ZauberArt
     * @see #setArt(ZauberArt)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getZauber_Art()
     * @model
     * @generated
     */
	ZauberArt getArt();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Zauber#getArt <em>Art</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Art</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.ZauberArt
     * @see #getArt()
     * @generated
     */
	void setArt(ZauberArt value);

	/**
     * Returns the value of the '<em><b>Reichweite</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.ZauberReichweite}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reichweite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Reichweite</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.ZauberReichweite
     * @see #setReichweite(ZauberReichweite)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getZauber_Reichweite()
     * @model
     * @generated
     */
	ZauberReichweite getReichweite();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Zauber#getReichweite <em>Reichweite</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reichweite</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.ZauberReichweite
     * @see #getReichweite()
     * @generated
     */
	void setReichweite(ZauberReichweite value);

	/**
     * Returns the value of the '<em><b>Schaden</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schaden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Schaden</em>' attribute.
     * @see #setSchaden(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getZauber_Schaden()
     * @model
     * @generated
     */
	String getSchaden();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Zauber#getSchaden <em>Schaden</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schaden</em>' attribute.
     * @see #getSchaden()
     * @generated
     */
	void setSchaden(String value);

	/**
     * Returns the value of the '<em><b>Dauer</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.ZauberDauer}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dauer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Dauer</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.ZauberDauer
     * @see #setDauer(ZauberDauer)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getZauber_Dauer()
     * @model
     * @generated
     */
	ZauberDauer getDauer();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Zauber#getDauer <em>Dauer</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dauer</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.ZauberDauer
     * @see #getDauer()
     * @generated
     */
	void setDauer(ZauberDauer value);

	/**
     * Returns the value of the '<em><b>Entzug</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entzug</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Entzug</em>' attribute.
     * @see #setEntzug(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getZauber_Entzug()
     * @model required="true"
     * @generated
     */
	String getEntzug();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Zauber#getEntzug <em>Entzug</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entzug</em>' attribute.
     * @see #getEntzug()
     * @generated
     */
	void setEntzug(String value);

	/**
     * Returns the value of the '<em><b>Kategorie</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kategorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Kategorie</em>' attribute.
     * @see #setKategorie(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getZauber_Kategorie()
     * @model required="true"
     * @generated
     */
	String getKategorie();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Zauber#getKategorie <em>Kategorie</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kategorie</em>' attribute.
     * @see #getKategorie()
     * @generated
     */
	void setKategorie(String value);

	/**
     * Returns the value of the '<em><b>Merkmale</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merkmale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Merkmale</em>' attribute.
     * @see #setMerkmale(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getZauber_Merkmale()
     * @model
     * @generated
     */
	String getMerkmale();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Zauber#getMerkmale <em>Merkmale</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Merkmale</em>' attribute.
     * @see #getMerkmale()
     * @generated
     */
	void setMerkmale(String value);

} // Zauber
