/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.common.util.EList;

import de.urszeidler.eclipse.shr5.Beschreibbar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.CharacterGroup#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterGroup()
 * @model
 * @generated
 */
public interface CharacterGroup extends Beschreibbar {
	/**
     * Returns the value of the '<em><b>Members</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5Management.ManagedCharacter}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Members</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterGroup_Members()
     * @model containment="true"
     * @generated
     */
	EList<ManagedCharacter> getMembers();

} // CharacterGroup
