/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schutzgeist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Schutzgeist#getVorteile <em>Vorteile</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Schutzgeist#getNachteile <em>Nachteile</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSchutzgeist()
 * @model
 * @generated
 */
public interface Schutzgeist extends MagischeMods {
	/**
	 * Returns the value of the '<em><b>Vorteile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vorteile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vorteile</em>' attribute.
	 * @see #setVorteile(String)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSchutzgeist_Vorteile()
	 * @model
	 * @generated
	 */
	String getVorteile();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Schutzgeist#getVorteile <em>Vorteile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vorteile</em>' attribute.
	 * @see #getVorteile()
	 * @generated
	 */
	void setVorteile(String value);

	/**
	 * Returns the value of the '<em><b>Nachteile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nachteile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachteile</em>' attribute.
	 * @see #setNachteile(String)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSchutzgeist_Nachteile()
	 * @model
	 * @generated
	 */
	String getNachteile();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Schutzgeist#getNachteile <em>Nachteile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachteile</em>' attribute.
	 * @see #getNachteile()
	 * @generated
	 */
	void setNachteile(String value);

} // Schutzgeist
