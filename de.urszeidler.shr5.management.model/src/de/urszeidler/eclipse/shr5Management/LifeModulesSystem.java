/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Life Modules System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifeModulesSystem#getModules <em>Modules</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifeModulesSystem#getKnowlegeSkillMax <em>Knowlege Skill Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifeModulesSystem()
 * @model
 * @generated
 */
public interface LifeModulesSystem extends Shr5System {
    /**
     * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5Management.LifeModule}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modules</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifeModulesSystem_Modules()
     * @model containment="true"
     * @generated
     */
    EList<LifeModule> getModules();

    /**
     * Returns the value of the '<em><b>Knowlege Skill Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Knowlege Skill Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Knowlege Skill Max</em>' attribute.
     * @see #setKnowlegeSkillMax(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifeModulesSystem_KnowlegeSkillMax()
     * @model
     * @generated
     */
    int getKnowlegeSkillMax();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.LifeModulesSystem#getKnowlegeSkillMax <em>Knowlege Skill Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Knowlege Skill Max</em>' attribute.
     * @see #getKnowlegeSkillMax()
     * @generated
     */
    void setKnowlegeSkillMax(int value);

} // LifeModulesSystem
