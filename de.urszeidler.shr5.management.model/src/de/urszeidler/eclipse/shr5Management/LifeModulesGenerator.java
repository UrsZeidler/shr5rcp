/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Life Modules Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifeModulesGenerator#getNationality <em>Nationality</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifeModulesGenerator#getFormativeYears <em>Formative Years</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifeModulesGenerator#getTeenYears <em>Teen Years</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifeModulesGenerator#getFurtherEducation <em>Further Education</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifeModulesGenerator#getRealLife <em>Real Life</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifeModulesGenerator#getModuleKarmaCost <em>Module Karma Cost</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifeModulesGenerator#getStartingAge <em>Starting Age</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifeModulesGenerator()
 * @model
 * @generated
 */
public interface LifeModulesGenerator extends KarmaGenerator<LifeModulesSystem> {
    /**
     * Returns the value of the '<em><b>Nationality</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nationality</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nationality</em>' reference.
     * @see #setNationality(LifeModule)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifeModulesGenerator_Nationality()
     * @model required="true"
     * @generated
     */
    LifeModule getNationality();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.LifeModulesGenerator#getNationality <em>Nationality</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nationality</em>' reference.
     * @see #getNationality()
     * @generated
     */
    void setNationality(LifeModule value);

    /**
     * Returns the value of the '<em><b>Formative Years</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Formative Years</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Formative Years</em>' reference.
     * @see #setFormativeYears(LifeModule)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifeModulesGenerator_FormativeYears()
     * @model required="true"
     * @generated
     */
    LifeModule getFormativeYears();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.LifeModulesGenerator#getFormativeYears <em>Formative Years</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Formative Years</em>' reference.
     * @see #getFormativeYears()
     * @generated
     */
    void setFormativeYears(LifeModule value);

    /**
     * Returns the value of the '<em><b>Teen Years</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Teen Years</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Teen Years</em>' reference.
     * @see #setTeenYears(LifeModule)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifeModulesGenerator_TeenYears()
     * @model required="true"
     * @generated
     */
    LifeModule getTeenYears();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.LifeModulesGenerator#getTeenYears <em>Teen Years</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Teen Years</em>' reference.
     * @see #getTeenYears()
     * @generated
     */
    void setTeenYears(LifeModule value);

    /**
     * Returns the value of the '<em><b>Further Education</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Further Education</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Further Education</em>' reference.
     * @see #setFurtherEducation(LifeModule)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifeModulesGenerator_FurtherEducation()
     * @model
     * @generated
     */
    LifeModule getFurtherEducation();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.LifeModulesGenerator#getFurtherEducation <em>Further Education</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Further Education</em>' reference.
     * @see #getFurtherEducation()
     * @generated
     */
    void setFurtherEducation(LifeModule value);

    /**
     * Returns the value of the '<em><b>Real Life</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5Management.LifeModule}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Real Life</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Real Life</em>' reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifeModulesGenerator_RealLife()
     * @model required="true"
     * @generated
     */
    EList<LifeModule> getRealLife();

    /**
     * Returns the value of the '<em><b>Module Karma Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Module Karma Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Module Karma Cost</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifeModulesGenerator_ModuleKarmaCost()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getModuleKarmaCost();

    /**
     * Returns the value of the '<em><b>Starting Age</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Starting Age</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Starting Age</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifeModulesGenerator_StartingAge()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getStartingAge();

} // LifeModulesGenerator
