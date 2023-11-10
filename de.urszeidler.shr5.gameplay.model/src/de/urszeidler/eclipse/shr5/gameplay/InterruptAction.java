/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interrupt Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.InterruptAction#getIniCost <em>Ini Cost</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.InterruptAction#getInterruptType <em>Interrupt Type</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getInterruptAction()
 * @model
 * @generated
 */
public interface InterruptAction extends SubjectCommand {

    /**
     * Returns the value of the '<em><b>Ini Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ini Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ini Cost</em>' attribute.
     * @see #setIniCost(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getInterruptAction_IniCost()
     * @model
     * @generated
     */
    int getIniCost();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.InterruptAction#getIniCost <em>Ini Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ini Cost</em>' attribute.
     * @see #getIniCost()
     * @generated
     */
    void setIniCost(int value);

    /**
     * Returns the value of the '<em><b>Interrupt Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.gameplay.InterruptType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interrupt Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interrupt Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.gameplay.InterruptType
     * @see #setInterruptType(InterruptType)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getInterruptAction_InterruptType()
     * @model
     * @generated
     */
    InterruptType getInterruptType();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.InterruptAction#getInterruptType <em>Interrupt Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interrupt Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.gameplay.InterruptType
     * @see #getInterruptType()
     * @generated
     */
    void setInterruptType(InterruptType value);
} // InterruptAction
