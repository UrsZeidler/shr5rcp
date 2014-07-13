/**
 */
package de.urszeidler.eclipse.shr5.runtime;

import de.urszeidler.eclipse.shr5Management.GruntGroup;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grunt Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.GruntTeam#getGruntGroup <em>Grunt Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getGruntTeam()
 * @model
 * @generated
 */
public interface GruntTeam extends Team {

    /**
     * Returns the value of the '<em><b>Grunt Group</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Grunt Group</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Grunt Group</em>' reference.
     * @see #setGruntGroup(GruntGroup)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getGruntTeam_GruntGroup()
     * @model required="true"
     * @generated
     */
    GruntGroup getGruntGroup();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.GruntTeam#getGruntGroup <em>Grunt Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Grunt Group</em>' reference.
     * @see #getGruntGroup()
     * @generated
     */
    void setGruntGroup(GruntGroup value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void buildMembers();
} // GruntTeam
