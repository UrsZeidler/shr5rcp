/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;

import de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe;
import de.urszeidler.eclipse.shr5.FeuerModus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ranged Attack Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ranged attack.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd#getModus <em>Modus</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd#getRange <em>Range</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd#getWeapon <em>Weapon</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd#getNumberOfShoots <em>Number Of Shoots</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getRangedAttackCmd()
 * @model
 * @generated
 */
public interface RangedAttackCmd extends OpposedSkillTestCmd {
    /**
     * Returns the value of the '<em><b>Modus</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.FeuerModus}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modus</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modus</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.FeuerModus
     * @see #setModus(FeuerModus)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getRangedAttackCmd_Modus()
     * @model
     * @generated
     */
    FeuerModus getModus();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd#getModus <em>Modus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Modus</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.FeuerModus
     * @see #getModus()
     * @generated
     */
    void setModus(FeuerModus value);

    /**
     * Returns the value of the '<em><b>Range</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Range</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Range</em>' attribute.
     * @see #setRange(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getRangedAttackCmd_Range()
     * @model
     * @generated
     */
    int getRange();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd#getRange <em>Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Range</em>' attribute.
     * @see #getRange()
     * @generated
     */
    void setRange(int value);

    /**
     * Returns the value of the '<em><b>Weapon</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Weapon</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Weapon</em>' reference.
     * @see #setWeapon(AbstaktFernKampfwaffe)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getRangedAttackCmd_Weapon()
     * @model
     * @generated
     */
    AbstaktFernKampfwaffe getWeapon();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd#getWeapon <em>Weapon</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Weapon</em>' reference.
     * @see #getWeapon()
     * @generated
     */
    void setWeapon(AbstaktFernKampfwaffe value);

    /**
     * Returns the value of the '<em><b>Number Of Shoots</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number of shoots beeing fired.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Number Of Shoots</em>' attribute.
     * @see #setNumberOfShoots(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getRangedAttackCmd_NumberOfShoots()
     * @model
     * @generated
     */
    int getNumberOfShoots();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd#getNumberOfShoots <em>Number Of Shoots</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Number Of Shoots</em>' attribute.
     * @see #getNumberOfShoots()
     * @generated
     */
    void setNumberOfShoots(int value);

} // RangedAttackCmd
