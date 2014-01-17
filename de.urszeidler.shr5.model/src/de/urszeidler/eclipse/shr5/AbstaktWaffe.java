/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstakt Waffe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstaktWaffe#getSchadenscode <em>Schadenscode</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstaktWaffe#getSchadesTyp <em>Schades Typ</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstaktWaffe#getPraezision <em>Praezision</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstaktWaffe#getDurchschlagsKraft <em>Durchschlags Kraft</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstaktWaffe()
 * @model abstract="true"
 * @generated
 */
public interface AbstaktWaffe extends AbstraktGegenstand {
	/**
	 * Returns the value of the '<em><b>Schadenscode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schadenscode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schadenscode</em>' attribute.
	 * @see #setSchadenscode(String)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstaktWaffe_Schadenscode()
	 * @model
	 * @generated
	 */
	String getSchadenscode();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbstaktWaffe#getSchadenscode <em>Schadenscode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schadenscode</em>' attribute.
	 * @see #getSchadenscode()
	 * @generated
	 */
	void setSchadenscode(String value);

	/**
	 * Returns the value of the '<em><b>Schades Typ</b></em>' attribute.
	 * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.SchadensTyp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schades Typ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schades Typ</em>' attribute.
	 * @see de.urszeidler.eclipse.shr5.SchadensTyp
	 * @see #setSchadesTyp(SchadensTyp)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstaktWaffe_SchadesTyp()
	 * @model
	 * @generated
	 */
	SchadensTyp getSchadesTyp();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbstaktWaffe#getSchadesTyp <em>Schades Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schades Typ</em>' attribute.
	 * @see de.urszeidler.eclipse.shr5.SchadensTyp
	 * @see #getSchadesTyp()
	 * @generated
	 */
	void setSchadesTyp(SchadensTyp value);

	/**
	 * Returns the value of the '<em><b>Praezision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Praezision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Praezision</em>' attribute.
	 * @see #setPraezision(int)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstaktWaffe_Praezision()
	 * @model
	 * @generated
	 */
	int getPraezision();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbstaktWaffe#getPraezision <em>Praezision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Praezision</em>' attribute.
	 * @see #getPraezision()
	 * @generated
	 */
	void setPraezision(int value);

	/**
	 * Returns the value of the '<em><b>Durchschlags Kraft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Durchschlags Kraft</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durchschlags Kraft</em>' attribute.
	 * @see #setDurchschlagsKraft(int)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstaktWaffe_DurchschlagsKraft()
	 * @model
	 * @generated
	 */
	int getDurchschlagsKraft();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbstaktWaffe#getDurchschlagsKraft <em>Durchschlags Kraft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durchschlags Kraft</em>' attribute.
	 * @see #getDurchschlagsKraft()
	 * @generated
	 */
	void setDurchschlagsKraft(int value);

} // AbstaktWaffe
