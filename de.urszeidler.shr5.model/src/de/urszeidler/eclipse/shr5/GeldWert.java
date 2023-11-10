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
 * <!-- begin-model-doc -->
 * This defines any object having a money value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeldWert#getWert <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeldWert#getVerfuegbarkeit <em>Verfuegbarkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeldWert#getWertValue <em>Wert Value</em>}</li>
 * </ul>
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
     * <!-- begin-model-doc -->
     * The calculated money value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wert</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeldWert_Wert()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
	BigDecimal getWert();

	/**
     * Returns the value of the '<em><b>Verfuegbarkeit</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verfuegbarkeit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The availability for the object.
     * <!-- end-model-doc -->
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

    /**
     * Returns the value of the '<em><b>Wert Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This is the setable value, it is used to calculate the wert property.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wert Value</em>' attribute.
     * @see #setWertValue(BigDecimal)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGeldWert_WertValue()
     * @model
     * @generated
     */
    BigDecimal getWertValue();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.GeldWert#getWertValue <em>Wert Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wert Value</em>' attribute.
     * @see #getWertValue()
     * @generated
     */
    void setWertValue(BigDecimal value);

} // GeldWert
