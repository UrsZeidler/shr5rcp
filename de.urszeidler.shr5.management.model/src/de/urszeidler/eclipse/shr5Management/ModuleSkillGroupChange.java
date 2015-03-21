/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Skill Group Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleSkillGroupChange#getSkillGroup <em>Skill Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleSkillGroupChange()
 * @model
 * @generated
 */
public interface ModuleSkillGroupChange extends ModuleTypeChange<FertigkeitsGruppe> {
    /**
     * Returns the value of the '<em><b>Skill Group</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Skill Group</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Skill Group</em>' reference.
     * @see #setSkillGroup(FertigkeitsGruppe)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleSkillGroupChange_SkillGroup()
     * @model
     * @generated
     */
    FertigkeitsGruppe getSkillGroup();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ModuleSkillGroupChange#getSkillGroup <em>Skill Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skill Group</em>' reference.
     * @see #getSkillGroup()
     * @generated
     */
    void setSkillGroup(FertigkeitsGruppe value);

} // ModuleSkillGroupChange
