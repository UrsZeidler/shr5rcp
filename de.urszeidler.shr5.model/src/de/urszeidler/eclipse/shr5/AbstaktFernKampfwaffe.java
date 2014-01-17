/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstakt Fern Kampfwaffe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe#getReichweite <em>Reichweite</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstaktFernKampfwaffe()
 * @model abstract="true"
 * @generated
 */
public interface AbstaktFernKampfwaffe extends AbstaktWaffe {
	/**
	 * Returns the value of the '<em><b>Reichweite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reichweite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reichweite</em>' reference.
	 * @see #setReichweite(Reichweite)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstaktFernKampfwaffe_Reichweite()
	 * @model required="true"
	 * @generated
	 */
	Reichweite getReichweite();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe#getReichweite <em>Reichweite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reichweite</em>' reference.
	 * @see #getReichweite()
	 * @generated
	 */
	void setReichweite(Reichweite value);

} // AbstaktFernKampfwaffe
