/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.common.util.EList;

import de.urszeidler.eclipse.shr5.Beschreibbar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The player management comtaints character groups and generators. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.PlayerManagement#getGroups <em>Groups</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.PlayerManagement#getGenerators <em>Generators</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.PlayerManagement#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPlayerManagement()
 * @model
 * @generated
 */
public interface PlayerManagement extends Beschreibbar {
    /**
     * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5Management.CharacterGroup}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Groups</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPlayerManagement_Groups()
     * @model containment="true"
     * @generated
     */
    EList<CharacterGroup> getGroups();

    /**
     * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5Management.CharacterGenerator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Generators</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generators</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPlayerManagement_Generators()
     * @model containment="true"
     * @generated
     */
    EList<CharacterGenerator> getGenerators();

    /**
     * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5Management.PlayerManagement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entries</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPlayerManagement_Entries()
     * @model containment="true"
     * @generated
     */
    EList<PlayerManagement> getEntries();

} // PlayerManagement
