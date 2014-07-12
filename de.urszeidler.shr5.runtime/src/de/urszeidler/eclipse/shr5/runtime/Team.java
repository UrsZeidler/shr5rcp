/**
 */
package de.urszeidler.eclipse.shr5.runtime;

import de.urszeidler.eclipse.shr5.Beschreibbar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.Team#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends Beschreibbar {
    /**
     * Returns the value of the '<em><b>Members</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Members</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getTeam_Members()
     * @model containment="true"
     * @generated
     */
    EList<RuntimeCharacter> getMembers();

} // Team
