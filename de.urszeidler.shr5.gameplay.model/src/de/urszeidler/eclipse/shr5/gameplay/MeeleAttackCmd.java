/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;

import de.urszeidler.eclipse.shr5.Nahkampfwaffe;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meele Attack Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The meele attack.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd#getWeapon <em>Weapon</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getMeeleAttackCmd()
 * @model
 * @generated
 */
public interface MeeleAttackCmd extends OpposedSkillTestCmd {
    /**
     * Returns the value of the '<em><b>Weapon</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Weapon</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Weapon</em>' reference.
     * @see #setWeapon(Nahkampfwaffe)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getMeeleAttackCmd_Weapon()
     * @model required="true"
     * @generated
     */
    Nahkampfwaffe getWeapon();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd#getWeapon <em>Weapon</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Weapon</em>' reference.
     * @see #getWeapon()
     * @generated
     */
    void setWeapon(Nahkampfwaffe value);

} // MeeleAttackCmd
