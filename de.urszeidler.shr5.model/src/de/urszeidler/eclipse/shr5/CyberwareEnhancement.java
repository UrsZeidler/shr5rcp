/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cyberware Enhancement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an enhancements for a cyberware.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.CyberwareEnhancement#getCapacityUse <em>Capacity Use</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.CyberwareEnhancement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberwareEnhancement()
 * @model
 * @generated
 */
public interface CyberwareEnhancement extends GeldWert, AbstraktModifikatoren {
    /**
     * Returns the value of the '<em><b>Capacity Use</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capacity Use</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capacity Use</em>' attribute.
     * @see #setCapacityUse(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberwareEnhancement_CapacityUse()
     * @model
     * @generated
     */
    int getCapacityUse();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.CyberwareEnhancement#getCapacityUse <em>Capacity Use</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capacity Use</em>' attribute.
     * @see #getCapacityUse()
     * @generated
     */
    void setCapacityUse(int value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.CyberwareType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.CyberwareType
     * @see #setType(CyberwareType)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCyberwareEnhancement_Type()
     * @model
     * @generated
     */
    CyberwareType getType();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.CyberwareEnhancement#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.CyberwareType
     * @see #getType()
     * @generated
     */
    void setType(CyberwareType value);

} // CyberwareEnhancement
