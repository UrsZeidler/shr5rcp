/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribut Modifikator Wert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * die Modifikation
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.AttributModifikatorWert#getAttribut <em>Attribut</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AttributModifikatorWert#getWert <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AttributModifikatorWert#getModifiziertes <em>Modifiziertes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAttributModifikatorWert()
 * @model
 * @generated
 */
public interface AttributModifikatorWert extends EObject {
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
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAttributModifikatorWert_Attribut()
	 * @model
	 * @generated
	 */
	EAttribute getAttribut();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AttributModifikatorWert#getAttribut <em>Attribut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribut</em>' reference.
	 * @see #getAttribut()
	 * @generated
	 */
	void setAttribut(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wert</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #setWert(int)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAttributModifikatorWert_Wert()
	 * @model
	 * @generated
	 */
	int getWert();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AttributModifikatorWert#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #getWert()
	 * @generated
	 */
	void setWert(int value);

	/**
	 * Returns the value of the '<em><b>Modifiziertes</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.urszeidler.eclipse.shr5.Modifizierbar#getMods <em>Mods</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifiziertes</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiziertes</em>' container reference.
	 * @see #setModifiziertes(Modifizierbar)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAttributModifikatorWert_Modifiziertes()
	 * @see de.urszeidler.eclipse.shr5.Modifizierbar#getMods
	 * @model opposite="mods" transient="false"
	 * @generated
	 */
	Modifizierbar getModifiziertes();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AttributModifikatorWert#getModifiziertes <em>Modifiziertes</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifiziertes</em>' container reference.
	 * @see #getModifiziertes()
	 * @generated
	 */
	void setModifiziertes(Modifizierbar value);

} // AttributModifikatorWert
