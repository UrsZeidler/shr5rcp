/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gegenstand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A basic item.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Gegenstand#getKategorie <em>Kategorie</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Gegenstand#getStufe <em>Stufe</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getGegenstand()
 * @model
 * @generated
 */
public interface Gegenstand extends AbstraktGegenstand {
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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGegenstand_Kategorie()
     * @model
     * @generated
     */
	String getKategorie();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Gegenstand#getKategorie <em>Kategorie</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kategorie</em>' attribute.
     * @see #getKategorie()
     * @generated
     */
	void setKategorie(String value);

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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGegenstand_Stufe()
     * @model
     * @generated
     */
	int getStufe();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Gegenstand#getStufe <em>Stufe</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stufe</em>' attribute.
     * @see #getStufe()
     * @generated
     */
	void setStufe(int value);

} // Gegenstand
