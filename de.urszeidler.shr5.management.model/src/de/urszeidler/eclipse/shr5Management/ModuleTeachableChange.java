/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import de.urszeidler.eclipse.shr5.Erlernbar;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleTeachableChange#getSelectOne <em>Select One</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.ModuleTeachableChange#getGrade <em>Grade</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleTeachableChange()
 * @model
 * @generated
 */
public interface ModuleTeachableChange extends ModuleChange {
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

    /**
     * Returns the value of the '<em><b>Select One</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Erlernbar}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Select One</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Select One</em>' reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleTeachableChange_SelectOne()
     * @model
     * @generated
     */
    EList<Erlernbar> getSelectOne();

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
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getModuleTeachableChange_Grade()
     * @model
     * @generated
     */
    int getGrade();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.ModuleTeachableChange#getGrade <em>Grade</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Grade</em>' attribute.
     * @see #getGrade()
     * @generated
     */
    void setGrade(int value);

} // ModuleTeachableChange
