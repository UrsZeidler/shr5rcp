/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defens Test Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The defense test.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd#getAttackersHits <em>Attackers Hits</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getDefensTestCmd()
 * @model
 * @generated
 */
public interface DefensTestCmd extends ProbeCommand {
    /**
     * Returns the value of the '<em><b>Attackers Hits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attackers Hits</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The hits to defend against.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Attackers Hits</em>' attribute.
     * @see #setAttackersHits(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getDefensTestCmd_AttackersHits()
     * @model
     * @generated
     */
    int getAttackersHits();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd#getAttackersHits <em>Attackers Hits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attackers Hits</em>' attribute.
     * @see #getAttackersHits()
     * @generated
     */
    void setAttackersHits(int value);

} // DefensTestCmd
