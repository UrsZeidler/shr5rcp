/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Holds the substance inthe inventory.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.SubstanceContainer#getSubstance <em>Substance</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSubstanceContainer()
 * @model
 * @generated
 */
public interface SubstanceContainer extends AbstraktGegenstand {
    /**
     * Returns the value of the '<em><b>Substance</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Substance</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Substance</em>' containment reference.
     * @see #setSubstance(Substance)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSubstanceContainer_Substance()
     * @model containment="true"
     * @generated
     */
    Substance getSubstance();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.SubstanceContainer#getSubstance <em>Substance</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Substance</em>' containment reference.
     * @see #getSubstance()
     * @generated
     */
    void setSubstance(Substance value);

} // SubstanceContainer
