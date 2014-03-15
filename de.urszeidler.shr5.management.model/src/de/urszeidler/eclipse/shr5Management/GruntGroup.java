/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.common.util.EList;

import de.urszeidler.eclipse.shr5.Beschreibbar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grunt Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a grunt group.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.GruntGroup#getMembers <em>Members</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.GruntGroup#getLeader <em>Leader</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.GruntGroup#getProfessionalRating <em>Professional Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getGruntGroup()
 * @model
 * @generated
 */
public interface GruntGroup extends Beschreibbar {
    /**
     * Returns the value of the '<em><b>Members</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5Management.GruntMembers}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Members</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getGruntGroup_Members()
     * @model containment="true"
     * @generated
     */
    EList<GruntMembers> getMembers();

    /**
     * Returns the value of the '<em><b>Leader</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Leader</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Leader</em>' containment reference.
     * @see #setLeader(GruntMembers)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getGruntGroup_Leader()
     * @model containment="true" required="true"
     * @generated
     */
    GruntMembers getLeader();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.GruntGroup#getLeader <em>Leader</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Leader</em>' containment reference.
     * @see #getLeader()
     * @generated
     */
    void setLeader(GruntMembers value);

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
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getGruntGroup_ProfessionalRating()
     * @model
     * @generated
     */
    int getProfessionalRating();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.GruntGroup#getProfessionalRating <em>Professional Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Professional Rating</em>' attribute.
     * @see #getProfessionalRating()
     * @generated
     */
    void setProfessionalRating(int value);

} // GruntGroup
