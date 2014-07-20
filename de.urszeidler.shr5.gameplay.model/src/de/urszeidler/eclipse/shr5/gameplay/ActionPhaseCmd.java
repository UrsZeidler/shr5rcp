/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Phase Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.ActionPhaseCmd#getTurn <em>Turn</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.ActionPhaseCmd#isSizeInitative <em>Size Initative</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getActionPhaseCmd()
 * @model
 * @generated
 */
public interface ActionPhaseCmd extends SubjectCommand, PhaseCmd {

    /**
     * Returns the value of the '<em><b>Turn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Turn</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Turn</em>' attribute.
     * @see #setTurn(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getActionPhaseCmd_Turn()
     * @model
     * @generated
     */
    int getTurn();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.ActionPhaseCmd#getTurn <em>Turn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Turn</em>' attribute.
     * @see #getTurn()
     * @generated
     */
    void setTurn(int value);

    /**
     * Returns the value of the '<em><b>Size Initative</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Size Initative</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size Initative</em>' attribute.
     * @see #setSizeInitative(boolean)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getActionPhaseCmd_SizeInitative()
     * @model default="false"
     * @generated
     */
    boolean isSizeInitative();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.ActionPhaseCmd#isSizeInitative <em>Size Initative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size Initative</em>' attribute.
     * @see #isSizeInitative()
     * @generated
     */
    void setSizeInitative(boolean value);
} // ActionPhaseCmd
