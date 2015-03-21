/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import de.urszeidler.eclipse.shr5.Erlernbar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Teachable Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Will be used for the quallities, specalism ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleTeachableChange#getTeachable <em>Teachable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleTeachableChange()
 * @model
 * @generated
 */
public interface ModuleTeachableChange extends ModuleTypeChange<Erlernbar> {
    /**
     * Returns the value of the '<em><b>Teachable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Teachable</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Teachable</em>' reference.
     * @see #setTeachable(Erlernbar)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleTeachableChange_Teachable()
     * @model
     * @generated
     */
    Erlernbar getTeachable();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ModuleTeachableChange#getTeachable <em>Teachable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Teachable</em>' reference.
     * @see #getTeachable()
     * @generated
     */
    void setTeachable(Erlernbar value);

} // ModuleTeachableChange
