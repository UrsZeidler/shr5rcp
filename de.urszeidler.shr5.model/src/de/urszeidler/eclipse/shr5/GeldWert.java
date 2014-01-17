/**
 */
package de.urszeidler.eclipse.shr5;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geld Wert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeldWert#getWert <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeldWert#getVerfuegbarkeit <em>Verfuegbarkeit</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeldWert()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GeldWert extends EObject {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wert</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #setWert(BigDecimal)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeldWert_Wert()
	 * @model
	 * @generated
	 */
	BigDecimal getWert();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.GeldWert#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #getWert()
	 * @generated
	 */
	void setWert(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Verfuegbarkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verfuegbarkeit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verfuegbarkeit</em>' attribute.
	 * @see #setVerfuegbarkeit(String)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeldWert_Verfuegbarkeit()
	 * @model
	 * @generated
	 */
	String getVerfuegbarkeit();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.GeldWert#getVerfuegbarkeit <em>Verfuegbarkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verfuegbarkeit</em>' attribute.
	 * @see #getVerfuegbarkeit()
	 * @generated
	 */
	void setVerfuegbarkeit(String value);

} // GeldWert
