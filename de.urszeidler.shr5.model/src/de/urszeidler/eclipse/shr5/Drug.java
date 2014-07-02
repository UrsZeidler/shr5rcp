/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drug</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Drug#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Drug#getAddictionType <em>Addiction Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getDrug()
 * @model
 * @generated
 */
public interface Drug extends Substance, Modifizierbar {
    /**
     * Returns the value of the '<em><b>Duration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Duration</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Duration</em>' attribute.
     * @see #setDuration(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getDrug_Duration()
     * @model
     * @generated
     */
    String getDuration();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Drug#getDuration <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Duration</em>' attribute.
     * @see #getDuration()
     * @generated
     */
    void setDuration(String value);

    /**
     * Returns the value of the '<em><b>Addiction Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.AddictionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Addiction Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Addiction Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.AddictionType
     * @see #setAddictionType(AddictionType)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getDrug_AddictionType()
     * @model
     * @generated
     */
    AddictionType getAddictionType();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Drug#getAddictionType <em>Addiction Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Addiction Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.AddictionType
     * @see #getAddictionType()
     * @generated
     */
    void setAddictionType(AddictionType value);

} // Drug
