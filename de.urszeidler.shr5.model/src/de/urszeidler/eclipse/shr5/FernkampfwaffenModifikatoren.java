/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fernkampfwaffen Modifikatoren</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Modificators for ranged weapons.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#getSmartgun <em>Smartgun</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#getRueckstoss <em>Rueckstoss</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#isLasterPointer <em>Laster Pointer</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#isSchalldaempfer <em>Schalldaempfer</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#getVergroesserung <em>Vergroesserung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#getSichtverbesserung <em>Sichtverbesserung</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getFernkampfwaffenModifikatoren()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FernkampfwaffenModifikatoren extends ModifikatorAttribute {
	/**
     * Returns the value of the '<em><b>Smartgun</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.SmartgunType}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smartgun</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Smartgun</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.SmartgunType
     * @see #setSmartgun(SmartgunType)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFernkampfwaffenModifikatoren_Smartgun()
     * @model
     * @generated
     */
	SmartgunType getSmartgun();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#getSmartgun <em>Smartgun</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Smartgun</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.SmartgunType
     * @see #getSmartgun()
     * @generated
     */
	void setSmartgun(SmartgunType value);

	/**
     * Returns the value of the '<em><b>Rueckstoss</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rueckstoss</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Rueckstoss</em>' attribute.
     * @see #setRueckstoss(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFernkampfwaffenModifikatoren_Rueckstoss()
     * @model
     * @generated
     */
	int getRueckstoss();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#getRueckstoss <em>Rueckstoss</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rueckstoss</em>' attribute.
     * @see #getRueckstoss()
     * @generated
     */
	void setRueckstoss(int value);

	/**
     * Returns the value of the '<em><b>Laster Pointer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Laster Pointer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Laster Pointer</em>' attribute.
     * @see #setLasterPointer(boolean)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFernkampfwaffenModifikatoren_LasterPointer()
     * @model
     * @generated
     */
	boolean isLasterPointer();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#isLasterPointer <em>Laster Pointer</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Laster Pointer</em>' attribute.
     * @see #isLasterPointer()
     * @generated
     */
	void setLasterPointer(boolean value);

	/**
     * Returns the value of the '<em><b>Schalldaempfer</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schalldaempfer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Schalldaempfer</em>' attribute.
     * @see #setSchalldaempfer(boolean)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFernkampfwaffenModifikatoren_Schalldaempfer()
     * @model
     * @generated
     */
	boolean isSchalldaempfer();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#isSchalldaempfer <em>Schalldaempfer</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schalldaempfer</em>' attribute.
     * @see #isSchalldaempfer()
     * @generated
     */
	void setSchalldaempfer(boolean value);

	/**
     * Returns the value of the '<em><b>Vergroesserung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vergroesserung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Vergroesserung</em>' attribute.
     * @see #setVergroesserung(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFernkampfwaffenModifikatoren_Vergroesserung()
     * @model
     * @generated
     */
	int getVergroesserung();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#getVergroesserung <em>Vergroesserung</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vergroesserung</em>' attribute.
     * @see #getVergroesserung()
     * @generated
     */
	void setVergroesserung(int value);

    /**
     * Returns the value of the '<em><b>Sichtverbesserung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sichtverbesserung</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sichtverbesserung</em>' attribute.
     * @see #setSichtverbesserung(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFernkampfwaffenModifikatoren_Sichtverbesserung()
     * @model
     * @generated
     */
    int getSichtverbesserung();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.FernkampfwaffenModifikatoren#getSichtverbesserung <em>Sichtverbesserung</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sichtverbesserung</em>' attribute.
     * @see #getSichtverbesserung()
     * @generated
     */
    void setSichtverbesserung(int value);

} // FernkampfwaffenModifikatoren
