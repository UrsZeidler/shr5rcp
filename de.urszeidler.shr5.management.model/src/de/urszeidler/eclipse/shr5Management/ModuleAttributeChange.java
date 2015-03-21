/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Attribute Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Define an attribute change.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleAttributeChange#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleAttributeChange()
 * @model
 * @generated
 */
public interface ModuleAttributeChange extends ModuleTypeChange<EAttribute> {
    /**
     * Returns the value of the '<em><b>Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute</em>' reference.
     * @see #setAttribute(EAttribute)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleAttributeChange_Attribute()
     * @model required="true"
     * @generated
     */
    EAttribute getAttribute();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ModuleAttributeChange#getAttribute <em>Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute</em>' reference.
     * @see #getAttribute()
     * @generated
     */
    void setAttribute(EAttribute value);

} // ModuleAttributeChange
