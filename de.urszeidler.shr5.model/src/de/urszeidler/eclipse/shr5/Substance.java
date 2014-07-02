/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Substance#getVector <em>Vector</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Substance#getSpeed <em>Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSubstance()
 * @model abstract="true"
 * @generated
 */
public interface Substance extends Beschreibbar, Quelle, GeldWert, Menge {
    /**
     * Returns the value of the '<em><b>Vector</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.SubstanceVector}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vector</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vector</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.SubstanceVector
     * @see #setVector(SubstanceVector)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSubstance_Vector()
     * @model
     * @generated
     */
    SubstanceVector getVector();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Substance#getVector <em>Vector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vector</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.SubstanceVector
     * @see #getVector()
     * @generated
     */
    void setVector(SubstanceVector value);

    /**
     * Returns the value of the '<em><b>Speed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Speed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Speed</em>' attribute.
     * @see #setSpeed(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSubstance_Speed()
     * @model
     * @generated
     */
    String getSpeed();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Substance#getSpeed <em>Speed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Speed</em>' attribute.
     * @see #getSpeed()
     * @generated
     */
    void setSpeed(String value);

} // Substance
