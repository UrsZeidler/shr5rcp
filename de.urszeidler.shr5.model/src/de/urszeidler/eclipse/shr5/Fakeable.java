/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fakeable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fakeable#getStufe <em>Stufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fakeable#isGefaelscht <em>Gefaelscht</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getFakeable()
 * @model abstract="true"
 * @generated
 */
public interface Fakeable extends Vertrag {
    /**
     * Returns the value of the '<em><b>Stufe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stufe</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stufe</em>' attribute.
     * @see #setStufe(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFakeable_Stufe()
     * @model
     * @generated
     */
    int getStufe();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Fakeable#getStufe <em>Stufe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stufe</em>' attribute.
     * @see #getStufe()
     * @generated
     */
    void setStufe(int value);

    /**
     * Returns the value of the '<em><b>Gefaelscht</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gefaelscht</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gefaelscht</em>' attribute.
     * @see #setGefaelscht(boolean)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFakeable_Gefaelscht()
     * @model
     * @generated
     */
    boolean isGefaelscht();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Fakeable#isGefaelscht <em>Gefaelscht</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gefaelscht</em>' attribute.
     * @see #isGefaelscht()
     * @generated
     */
    void setGefaelscht(boolean value);

} // Fakeable
