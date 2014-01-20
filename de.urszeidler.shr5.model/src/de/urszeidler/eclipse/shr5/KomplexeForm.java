/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Komplexe Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.KomplexeForm#getZiel <em>Ziel</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.KomplexeForm#getDauer <em>Dauer</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.KomplexeForm#getSchwund <em>Schwund</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getKomplexeForm()
 * @model
 * @generated
 */
public interface KomplexeForm extends Quelle, Beschreibbar {
	/**
     * Returns the value of the '<em><b>Ziel</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.ResonanzZiel}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ziel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ziel</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.ResonanzZiel
     * @see #setZiel(ResonanzZiel)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getKomplexeForm_Ziel()
     * @model
     * @generated
     */
	ResonanzZiel getZiel();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.KomplexeForm#getZiel <em>Ziel</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ziel</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.ResonanzZiel
     * @see #getZiel()
     * @generated
     */
	void setZiel(ResonanzZiel value);

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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getKomplexeForm_Dauer()
     * @model
     * @generated
     */
	ZauberDauer getDauer();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.KomplexeForm#getDauer <em>Dauer</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dauer</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.ZauberDauer
     * @see #getDauer()
     * @generated
     */
	void setDauer(ZauberDauer value);

	/**
     * Returns the value of the '<em><b>Schwund</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schwund</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Schwund</em>' attribute.
     * @see #setSchwund(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getKomplexeForm_Schwund()
     * @model
     * @generated
     */
	String getSchwund();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.KomplexeForm#getSchwund <em>Schwund</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schwund</em>' attribute.
     * @see #getSchwund()
     * @generated
     */
	void setSchwund(String value);

} // KomplexeForm
