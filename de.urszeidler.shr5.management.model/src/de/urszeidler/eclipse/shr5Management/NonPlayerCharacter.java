/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Player Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.NonPlayerCharacter#getProfessionalRating <em>Professional Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getNonPlayerCharacter()
 * @model
 * @generated
 */
public interface NonPlayerCharacter extends ManagedCharacter {

    /**
     * Returns the value of the '<em><b>Professional Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Professional Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Professional Rating</em>' attribute.
     * @see #setProfessionalRating(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getNonPlayerCharacter_ProfessionalRating()
     * @model
     * @generated
     */
    int getProfessionalRating();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.NonPlayerCharacter#getProfessionalRating <em>Professional Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Professional Rating</em>' attribute.
     * @see #getProfessionalRating()
     * @generated
     */
    void setProfessionalRating(int value);
} // NonPlayerCharacter
