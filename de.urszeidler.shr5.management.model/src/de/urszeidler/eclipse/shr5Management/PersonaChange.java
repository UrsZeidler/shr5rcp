/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import de.urszeidler.eclipse.shr5.Erlernbar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.PersonaChange#getChangeable <em>Changeable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPersonaChange()
 * @model
 * @generated
 */
public interface PersonaChange extends PersonaValueChange {
    /**
     * Returns the value of the '<em><b>Changeable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Changeable</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Changeable</em>' reference.
     * @see #setChangeable(Erlernbar)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPersonaChange_Changeable()
     * @model required="true"
     * @generated
     */
    Erlernbar getChangeable();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.PersonaChange#getChangeable <em>Changeable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Changeable</em>' reference.
     * @see #getChangeable()
     * @generated
     */
    void setChangeable(Erlernbar value);

} // PersonaChange
