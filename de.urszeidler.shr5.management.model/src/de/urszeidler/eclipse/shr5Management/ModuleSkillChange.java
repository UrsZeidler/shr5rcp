/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import de.urszeidler.eclipse.shr5.Fertigkeit;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Skill Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleSkillChange#getGrade <em>Grade</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleSkillChange#getSkill <em>Skill</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleSkillChange#getSelectOne <em>Select One</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleSkillChange()
 * @model
 * @generated
 */
public interface ModuleSkillChange extends ModuleChange {
    /**
     * Returns the value of the '<em><b>Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Skill</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Skill</em>' reference.
     * @see #setSkill(Fertigkeit)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleSkillChange_Skill()
     * @model
     * @generated
     */
    Fertigkeit getSkill();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ModuleSkillChange#getSkill <em>Skill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skill</em>' reference.
     * @see #getSkill()
     * @generated
     */
    void setSkill(Fertigkeit value);

    /**
     * Returns the value of the '<em><b>Grade</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Grade</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Grade</em>' attribute.
     * @see #setGrade(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleSkillChange_Grade()
     * @model
     * @generated
     */
    int getGrade();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ModuleSkillChange#getGrade <em>Grade</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Grade</em>' attribute.
     * @see #getGrade()
     * @generated
     */
    void setGrade(int value);

    /**
     * Returns the value of the '<em><b>Select One</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Fertigkeit}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Select One</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Select One</em>' reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleSkillChange_SelectOne()
     * @model
     * @generated
     */
    EList<Fertigkeit> getSelectOne();

} // ModuleSkillChange
