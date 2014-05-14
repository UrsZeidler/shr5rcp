/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumer Soft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.ConsumerSoft#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getConsumerSoft()
 * @model
 * @generated
 */
public interface ConsumerSoft extends BasicProgram {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.ProgramType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.ProgramType
     * @see #setType(ProgramType)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getConsumerSoft_Type()
     * @model
     * @generated
     */
    ProgramType getType();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.ConsumerSoft#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.ProgramType
     * @see #getType()
     * @generated
     */
    void setType(ProgramType value);

} // ConsumerSoft
