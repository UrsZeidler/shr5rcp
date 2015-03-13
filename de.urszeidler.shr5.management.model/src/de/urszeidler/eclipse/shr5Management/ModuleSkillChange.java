/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Spezialisierung;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Skill Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleSkillChange#getSkillgroup <em>Skillgroup</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleSkillChange#getSkill <em>Skill</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleSkillChange#getSpecalism <em>Specalism</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleSkillChange()
 * @model
 * @generated
 */
public interface ModuleSkillChange extends ModuleChange {
    /**
     * Returns the value of the '<em><b>Skillgroup</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Skillgroup</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Skillgroup</em>' containment reference.
     * @see #setSkillgroup(PersonaFertigkeitsGruppe)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleSkillChange_Skillgroup()
     * @model containment="true"
     * @generated
     */
    PersonaFertigkeitsGruppe getSkillgroup();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ModuleSkillChange#getSkillgroup <em>Skillgroup</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skillgroup</em>' containment reference.
     * @see #getSkillgroup()
     * @generated
     */
    void setSkillgroup(PersonaFertigkeitsGruppe value);

    /**
     * Returns the value of the '<em><b>Skill</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Skill</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Skill</em>' containment reference.
     * @see #setSkill(PersonaFertigkeit)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleSkillChange_Skill()
     * @model containment="true"
     * @generated
     */
    PersonaFertigkeit getSkill();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ModuleSkillChange#getSkill <em>Skill</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skill</em>' containment reference.
     * @see #getSkill()
     * @generated
     */
    void setSkill(PersonaFertigkeit value);

    /**
     * Returns the value of the '<em><b>Specalism</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specalism</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specalism</em>' containment reference.
     * @see #setSpecalism(Spezialisierung)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleSkillChange_Specalism()
     * @model containment="true"
     * @generated
     */
    Spezialisierung getSpecalism();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ModuleSkillChange#getSpecalism <em>Specalism</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specalism</em>' containment reference.
     * @see #getSpecalism()
     * @generated
     */
    void setSpecalism(Spezialisierung value);

} // ModuleSkillChange
