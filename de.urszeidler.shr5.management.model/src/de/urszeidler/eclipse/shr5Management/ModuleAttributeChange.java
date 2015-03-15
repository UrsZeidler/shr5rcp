/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleAttributeChange#getGrade <em>Grade</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleAttributeChange#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleAttributeChange#getSelectOne <em>Select One</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleAttributeChange()
 * @model
 * @generated
 */
public interface ModuleAttributeChange extends ModuleChange {
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
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleAttributeChange_Grade()
     * @model
     * @generated
     */
    int getGrade();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ModuleAttributeChange#getGrade <em>Grade</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Grade</em>' attribute.
     * @see #getGrade()
     * @generated
     */
    void setGrade(int value);

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

    /**
     * Returns the value of the '<em><b>Select One</b></em>' reference list.
     * The list contents are of type {@link org.eclipse.emf.ecore.EAttribute}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Select One</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Select One</em>' reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleAttributeChange_SelectOne()
     * @model
     * @generated
     */
    EList<EAttribute> getSelectOne();

} // ModuleAttributeChange
