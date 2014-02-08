/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fertigkeit Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.FertigkeitChange#getSkill <em>Skill</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.FertigkeitChange#getSkillGroup <em>Skill Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getFertigkeitChange()
 * @model
 * @generated
 */
public interface FertigkeitChange extends PersonaValueChange {

    /**
     * Returns the value of the '<em><b>Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Skill</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Skill</em>' reference.
     * @see #setSkill(PersonaFertigkeit)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getFertigkeitChange_Skill()
     * @model
     * @generated
     */
    PersonaFertigkeit getSkill();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.FertigkeitChange#getSkill <em>Skill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skill</em>' reference.
     * @see #getSkill()
     * @generated
     */
    void setSkill(PersonaFertigkeit value);

    /**
     * Returns the value of the '<em><b>Skill Group</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Skill Group</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Skill Group</em>' reference.
     * @see #setSkillGroup(PersonaFertigkeitsGruppe)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getFertigkeitChange_SkillGroup()
     * @model
     * @generated
     */
    PersonaFertigkeitsGruppe getSkillGroup();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.FertigkeitChange#getSkillGroup <em>Skill Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skill Group</em>' reference.
     * @see #getSkillGroup()
     * @generated
     */
    void setSkillGroup(PersonaFertigkeitsGruppe value);
} // FertigkeitChange
