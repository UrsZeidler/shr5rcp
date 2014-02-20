/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credstick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Credstick#getCurrenValue <em>Curren Value</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Credstick#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCredstick()
 * @model
 * @generated
 */
public interface Credstick extends AbstraktGegenstand {
    /**
     * Returns the value of the '<em><b>Curren Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Curren Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Curren Value</em>' attribute.
     * @see #setCurrenValue(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCredstick_CurrenValue()
     * @model
     * @generated
     */
    int getCurrenValue();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Credstick#getCurrenValue <em>Curren Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Curren Value</em>' attribute.
     * @see #getCurrenValue()
     * @generated
     */
    void setCurrenValue(int value);

    /**
     * Returns the value of the '<em><b>Max Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Value</em>' attribute.
     * @see #setMaxValue(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCredstick_MaxValue()
     * @model
     * @generated
     */
    int getMaxValue();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Credstick#getMaxValue <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Value</em>' attribute.
     * @see #getMaxValue()
     * @generated
     */
    void setMaxValue(int value);

} // Credstick
