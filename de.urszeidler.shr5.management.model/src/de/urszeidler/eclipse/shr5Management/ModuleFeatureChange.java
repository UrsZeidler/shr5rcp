/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Feature Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Set a feature like native language to the given value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleFeatureChange#getFeature <em>Feature</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleFeatureChange#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleFeatureChange()
 * @model
 * @generated
 */
public interface ModuleFeatureChange extends ModuleChange {
    /**
     * Returns the value of the '<em><b>Feature</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feature</em>' reference.
     * @see #setFeature(EReference)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleFeatureChange_Feature()
     * @model
     * @generated
     */
    EReference getFeature();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ModuleFeatureChange#getFeature <em>Feature</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Feature</em>' reference.
     * @see #getFeature()
     * @generated
     */
    void setFeature(EReference value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' reference.
     * @see #setValue(EObject)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleFeatureChange_Value()
     * @model
     * @generated
     */
    EObject getValue();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ModuleFeatureChange#getValue <em>Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' reference.
     * @see #getValue()
     * @generated
     */
    void setValue(EObject value);

} // ModuleFeatureChange
