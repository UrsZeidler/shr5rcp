/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Quelle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Life Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifeModule#getKarmaCost <em>Karma Cost</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifeModule#getCharacterChanges <em>Character Changes</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifeModule#getModuleType <em>Module Type</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifeModule#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifeModule()
 * @model
 * @generated
 */
public interface LifeModule extends Beschreibbar, Quelle {
    /**
     * Returns the value of the '<em><b>Karma Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Karma Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Karma Cost</em>' attribute.
     * @see #setKarmaCost(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifeModule_KarmaCost()
     * @model required="true"
     * @generated
     */
    int getKarmaCost();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.LifeModule#getKarmaCost <em>Karma Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Karma Cost</em>' attribute.
     * @see #getKarmaCost()
     * @generated
     */
    void setKarmaCost(int value);

    /**
     * Returns the value of the '<em><b>Character Changes</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5Management.ModuleChange}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Character Changes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Character Changes</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifeModule_CharacterChanges()
     * @model containment="true"
     * @generated
     */
    EList<ModuleChange> getCharacterChanges();

    /**
     * Returns the value of the '<em><b>Module Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5Management.LifeModuleType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Module Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Module Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.LifeModuleType
     * @see #setModuleType(LifeModuleType)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifeModule_ModuleType()
     * @model
     * @generated
     */
    LifeModuleType getModuleType();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.LifeModule#getModuleType <em>Module Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Module Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.LifeModuleType
     * @see #getModuleType()
     * @generated
     */
    void setModuleType(LifeModuleType value);

    /**
     * Returns the value of the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The time in years, can be zero.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Time</em>' attribute.
     * @see #setTime(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifeModule_Time()
     * @model
     * @generated
     */
    int getTime();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.LifeModule#getTime <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time</em>' attribute.
     * @see #getTime()
     * @generated
     */
    void setTime(int value);

} // LifeModule
