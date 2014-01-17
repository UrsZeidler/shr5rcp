/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Critter Kraft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.CritterKraft#getArt <em>Art</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.CritterKraft#getHandlung <em>Handlung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.CritterKraft#getReichweite <em>Reichweite</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.CritterKraft#getDauer <em>Dauer</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCritterKraft()
 * @model
 * @generated
 */
public interface CritterKraft extends MagischeMods {

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
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCritterKraft_Art()
	 * @model
	 * @generated
	 */
	ZauberArt getArt();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.CritterKraft#getArt <em>Art</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art</em>' attribute.
	 * @see de.urszeidler.eclipse.shr5.ZauberArt
	 * @see #getArt()
	 * @generated
	 */
	void setArt(ZauberArt value);

	/**
	 * Returns the value of the '<em><b>Handlung</b></em>' attribute.
	 * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.CritterHandlung}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlung</em>' attribute.
	 * @see de.urszeidler.eclipse.shr5.CritterHandlung
	 * @see #setHandlung(CritterHandlung)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCritterKraft_Handlung()
	 * @model
	 * @generated
	 */
	CritterHandlung getHandlung();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.CritterKraft#getHandlung <em>Handlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handlung</em>' attribute.
	 * @see de.urszeidler.eclipse.shr5.CritterHandlung
	 * @see #getHandlung()
	 * @generated
	 */
	void setHandlung(CritterHandlung value);

	/**
	 * Returns the value of the '<em><b>Reichweite</b></em>' attribute.
	 * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.CritterReichweite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reichweite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reichweite</em>' attribute.
	 * @see de.urszeidler.eclipse.shr5.CritterReichweite
	 * @see #setReichweite(CritterReichweite)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCritterKraft_Reichweite()
	 * @model
	 * @generated
	 */
	CritterReichweite getReichweite();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.CritterKraft#getReichweite <em>Reichweite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reichweite</em>' attribute.
	 * @see de.urszeidler.eclipse.shr5.CritterReichweite
	 * @see #getReichweite()
	 * @generated
	 */
	void setReichweite(CritterReichweite value);

	/**
	 * Returns the value of the '<em><b>Dauer</b></em>' attribute.
	 * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.CritterDauer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dauer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dauer</em>' attribute.
	 * @see de.urszeidler.eclipse.shr5.CritterDauer
	 * @see #setDauer(CritterDauer)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCritterKraft_Dauer()
	 * @model
	 * @generated
	 */
	CritterDauer getDauer();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.CritterKraft#getDauer <em>Dauer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dauer</em>' attribute.
	 * @see de.urszeidler.eclipse.shr5.CritterDauer
	 * @see #getDauer()
	 * @generated
	 */
	void setDauer(CritterDauer value);
} // CritterKraft
