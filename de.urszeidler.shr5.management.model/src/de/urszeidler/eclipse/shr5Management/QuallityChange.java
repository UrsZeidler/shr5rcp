/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import de.urszeidler.eclipse.shr5.PersonaEigenschaft;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quallity Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.QuallityChange#getQuallity <em>Quallity</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.QuallityChange#isAdded <em>Added</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getQuallityChange()
 * @model
 * @generated
 */
public interface QuallityChange extends Changes {

    /**
     * Returns the value of the '<em><b>Quallity</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Quallity</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Quallity</em>' reference.
     * @see #setQuallity(PersonaEigenschaft)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getQuallityChange_Quallity()
     * @model required="true"
     * @generated
     */
    PersonaEigenschaft getQuallity();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.QuallityChange#getQuallity <em>Quallity</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Quallity</em>' reference.
     * @see #getQuallity()
     * @generated
     */
    void setQuallity(PersonaEigenschaft value);

    /**
     * Returns the value of the '<em><b>Added</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Added</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Added</em>' attribute.
     * @see #setAdded(boolean)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getQuallityChange_Added()
     * @model
     * @generated
     */
    boolean isAdded();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.QuallityChange#isAdded <em>Added</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Added</em>' attribute.
     * @see #isAdded()
     * @generated
     */
    void setAdded(boolean value);
} // QuallityChange
