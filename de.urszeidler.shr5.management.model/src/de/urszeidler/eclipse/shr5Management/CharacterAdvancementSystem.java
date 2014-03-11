/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import de.urszeidler.eclipse.shr5.Beschreibbar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character Advancement System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.CharacterAdvancementSystem#getCharacterAdvancements <em>Character Advancements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterAdvancementSystem()
 * @model
 * @generated
 */
public interface CharacterAdvancementSystem extends Beschreibbar {
    /**
     * Returns the value of the '<em><b>Character Advancements</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5Management.Advancement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Character Advancements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Character Advancements</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterAdvancementSystem_CharacterAdvancements()
     * @model containment="true"
     * @generated
     */
    EList<Advancement> getCharacterAdvancements();

} // CharacterAdvancementSystem
