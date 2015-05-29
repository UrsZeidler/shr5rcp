/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;

import de.urszeidler.eclipse.shr5.Fertigkeit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill Test Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A skill test.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd#getSkill <em>Skill</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSkillTestCmd()
 * @model
 * @generated
 */
public interface SkillTestCmd extends ProbeCommand {
    /**
     * Returns the value of the '<em><b>Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Skill</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The skill beeing tested.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Skill</em>' reference.
     * @see #setSkill(Fertigkeit)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSkillTestCmd_Skill()
     * @model required="true"
     * @generated
     */
    Fertigkeit getSkill();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd#getSkill <em>Skill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skill</em>' reference.
     * @see #getSkill()
     * @generated
     */
    void setSkill(Fertigkeit value);

} // SkillTestCmd
