/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Quelle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character Generator System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem#getCharacterAdvancements <em>Character Advancements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterGeneratorSystem()
 * @model abstract="true"
 * @generated
 */
public interface CharacterGeneratorSystem extends Beschreibbar, Quelle {

	/**
     * Returns the value of the '<em><b>Instructions</b></em>' map.
     * The key is of type {@link de.urszeidler.eclipse.shr5Management.GeneratorState},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Instructions</em>' map.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterGeneratorSystem_Instructions()
     * @model mapType="de.urszeidler.eclipse.shr5Management.GeneratorStateToEStringMapEntry<de.urszeidler.eclipse.shr5Management.GeneratorState, org.eclipse.emf.ecore.EString>"
     * @generated
     */
	EMap<GeneratorState, String> getInstructions();

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
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterGeneratorSystem_CharacterAdvancements()
     * @model containment="true"
     * @generated
     */
	EList<Advancement> getCharacterAdvancements();
} // CharacterGeneratorSystem
