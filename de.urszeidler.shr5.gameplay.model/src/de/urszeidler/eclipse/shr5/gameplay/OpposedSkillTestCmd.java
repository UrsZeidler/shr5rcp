/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;

import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opposed Skill Test Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd#getObject <em>Object</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd#getObjectSkill <em>Object Skill</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getOpposedSkillTestCmd()
 * @model
 * @generated
 */
public interface OpposedSkillTestCmd extends SkillTestCmd {
    /**
     * Returns the value of the '<em><b>Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object</em>' reference.
     * @see #setObject(RuntimeCharacter)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getOpposedSkillTestCmd_Object()
     * @model
     * @generated
     */
    RuntimeCharacter getObject();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd#getObject <em>Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object</em>' reference.
     * @see #getObject()
     * @generated
     */
    void setObject(RuntimeCharacter value);

    /**
     * Returns the value of the '<em><b>Object Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object Skill</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object Skill</em>' reference.
     * @see #setObjectSkill(PersonaFertigkeit)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getOpposedSkillTestCmd_ObjectSkill()
     * @model
     * @generated
     */
    PersonaFertigkeit getObjectSkill();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd#getObjectSkill <em>Object Skill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object Skill</em>' reference.
     * @see #getObjectSkill()
     * @generated
     */
    void setObjectSkill(PersonaFertigkeit value);

} // OpposedSkillTestCmd
