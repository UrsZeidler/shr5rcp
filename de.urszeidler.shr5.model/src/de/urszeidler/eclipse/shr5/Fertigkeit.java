/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fertigkeit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fertigkeit#getKategorie <em>Kategorie</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fertigkeit#isAusweichen <em>Ausweichen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fertigkeit#getAttribut <em>Attribut</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fertigkeit#getSpezialisierungen <em>Spezialisierungen</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getFertigkeit()
 * @model
 * @generated
 */
public interface Fertigkeit extends Beschreibbar, Quelle {
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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFertigkeit_Kategorie()
     * @model
     * @generated
     */
	String getKategorie();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Fertigkeit#getKategorie <em>Kategorie</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kategorie</em>' attribute.
     * @see #getKategorie()
     * @generated
     */
	void setKategorie(String value);

	/**
     * Returns the value of the '<em><b>Ausweichen</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ausweichen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Ausweichen</em>' attribute.
     * @see #setAusweichen(boolean)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFertigkeit_Ausweichen()
     * @model
     * @generated
     */
	boolean isAusweichen();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Fertigkeit#isAusweichen <em>Ausweichen</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ausweichen</em>' attribute.
     * @see #isAusweichen()
     * @generated
     */
	void setAusweichen(boolean value);

	/**
     * Returns the value of the '<em><b>Attribut</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribut</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Attribut</em>' reference.
     * @see #setAttribut(EAttribute)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFertigkeit_Attribut()
     * @model
     * @generated
     */
	EAttribute getAttribut();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Fertigkeit#getAttribut <em>Attribut</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribut</em>' reference.
     * @see #getAttribut()
     * @generated
     */
	void setAttribut(EAttribute value);

	/**
     * Returns the value of the '<em><b>Spezialisierungen</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spezialisierungen</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Spezialisierungen</em>' attribute list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFertigkeit_Spezialisierungen()
     * @model
     * @generated
     */
	EList<String> getSpezialisierungen();

} // Fertigkeit
