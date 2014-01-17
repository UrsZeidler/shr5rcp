/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getCharacter <em>Character</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getGenerator <em>Generator</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getState <em>State</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getSelectedGroup <em>Selected Group</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getCharacterName <em>Character Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getCurrentInstruction <em>Current Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterGenerator()
 * @model abstract="true"
 * @generated
 */
public interface CharacterGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Character</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getChracterSource <em>Chracter Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character</em>' reference.
	 * @see #setCharacter(ManagedCharacter)
	 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterGenerator_Character()
	 * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getChracterSource
	 * @model opposite="chracterSource" required="true"
	 * @generated
	 */
	ManagedCharacter getCharacter();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getCharacter <em>Character</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character</em>' reference.
	 * @see #getCharacter()
	 * @generated
	 */
	void setCharacter(ManagedCharacter value);

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' reference.
	 * @see #setGenerator(CharacterGeneratorSystem)
	 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterGenerator_Generator()
	 * @model required="true"
	 * @generated
	 */
	CharacterGeneratorSystem getGenerator();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getGenerator <em>Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(CharacterGeneratorSystem value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5Management.GeneratorState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see de.urszeidler.eclipse.shr5Management.GeneratorState
	 * @see #setState(GeneratorState)
	 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterGenerator_State()
	 * @model
	 * @generated
	 */
	GeneratorState getState();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see de.urszeidler.eclipse.shr5Management.GeneratorState
	 * @see #getState()
	 * @generated
	 */
	void setState(GeneratorState value);

	/**
	 * Returns the value of the '<em><b>Selected Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Group</em>' reference.
	 * @see #setSelectedGroup(CharacterGroup)
	 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterGenerator_SelectedGroup()
	 * @model required="true"
	 * @generated
	 */
	CharacterGroup getSelectedGroup();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getSelectedGroup <em>Selected Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Group</em>' reference.
	 * @see #getSelectedGroup()
	 * @generated
	 */
	void setSelectedGroup(CharacterGroup value);

	/**
	 * Returns the value of the '<em><b>Character Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Name</em>' attribute.
	 * @see #setCharacterName(String)
	 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterGenerator_CharacterName()
	 * @model
	 * @generated
	 */
	String getCharacterName();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getCharacterName <em>Character Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Name</em>' attribute.
	 * @see #getCharacterName()
	 * @generated
	 */
	void setCharacterName(String value);

	/**
	 * Returns the value of the '<em><b>Current Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Instruction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Instruction</em>' attribute.
	 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getCharacterGenerator_CurrentInstruction()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getCurrentInstruction();

} // CharacterGenerator
