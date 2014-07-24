/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interrupt Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.InterruptAction#getIniCost <em>Ini Cost</em>}</li>
 * </ul>
 * </p>
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
} // InterruptAction
