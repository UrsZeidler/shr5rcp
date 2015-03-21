/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Type Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleTypeChange#getGrade <em>Grade</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleTypeChange#getSelected <em>Selected</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleTypeChange#getSelectOne <em>Select One</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleTypeChange()
 * @model abstract="true"
 * @generated
 */
public interface ModuleTypeChange<T> extends ModuleChange {
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
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleTypeChange_Grade()
     * @model
     * @generated
     */
    int getGrade();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ModuleTypeChange#getGrade <em>Grade</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Grade</em>' attribute.
     * @see #getGrade()
     * @generated
     */
    void setGrade(int value);

    /**
     * Returns the value of the '<em><b>Selected</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selected</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selected</em>' reference.
     * @see #setSelected(Object)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleTypeChange_Selected()
     * @model kind="reference"
     * @generated
     */
    T getSelected();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ModuleTypeChange#getSelected <em>Selected</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selected</em>' reference.
     * @see #getSelected()
     * @generated
     */
    void setSelected(T value);

    /**
     * Returns the value of the '<em><b>Select One</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Select One</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Select One</em>' reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleTypeChange_SelectOne()
     * @model kind="reference"
     * @generated
     */
    EList<T> getSelectOne();

} // ModuleTypeChange
