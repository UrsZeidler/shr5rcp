/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Quelle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character Generator System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The basic character generator system defines the advacements system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem#getLifestyleToStartMoney <em>Lifestyle To Start Money</em>}</li>
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
     * Returns the value of the '<em><b>Character Advancements</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Advancements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Character Advancements</em>' reference.
     * @see #setCharacterAdvancements(CharacterAdvancementSystem)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterGeneratorSystem_CharacterAdvancements()
     * @model required="true"
     * @generated
     */
	CharacterAdvancementSystem getCharacterAdvancements();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem#getCharacterAdvancements <em>Character Advancements</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Character Advancements</em>' reference.
     * @see #getCharacterAdvancements()
     * @generated
     */
    void setCharacterAdvancements(CharacterAdvancementSystem value);

    /**
     * Returns the value of the '<em><b>Lifestyle To Start Money</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lifestyle To Start Money</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lifestyle To Start Money</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterGeneratorSystem_LifestyleToStartMoney()
     * @model containment="true"
     * @generated
     */
    EList<LifestyleToStartMoney> getLifestyleToStartMoney();
} // CharacterGeneratorSystem
