/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5Management.Adept;
import de.urszeidler.eclipse.shr5Management.Advancement;
import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.Attributes;
import de.urszeidler.eclipse.shr5Management.ChangeQuallity;
import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem;
import de.urszeidler.eclipse.shr5Management.CharacterGroup;
import de.urszeidler.eclipse.shr5Management.Connection;
import de.urszeidler.eclipse.shr5Management.FertigkeitChange;
import de.urszeidler.eclipse.shr5Management.FreeStyle;
import de.urszeidler.eclipse.shr5Management.FreeStyleGenerator;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.KarmaGaint;
import de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.MetaType;
import de.urszeidler.eclipse.shr5Management.Mudan;
import de.urszeidler.eclipse.shr5Management.NonPlayerCharacter;
import de.urszeidler.eclipse.shr5Management.PersonaValueChange;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.PriorityCategorie;
import de.urszeidler.eclipse.shr5Management.PrioritySystem;
import de.urszeidler.eclipse.shr5Management.QuallityChange;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.Skill;
import de.urszeidler.eclipse.shr5Management.SpecialType;
import de.urszeidler.eclipse.shr5Management.Spellcaster;
import de.urszeidler.eclipse.shr5Management.Technomancer;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage
 * @generated
 */
public class Shr5managementSwitch<T> extends Switch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static Shr5managementPackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shr5managementSwitch() {
        if (modelPackage == null) {
            modelPackage = Shr5managementPackage.eINSTANCE;
        }
    }

	/**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case Shr5managementPackage.MANAGED_CHARACTER: {
                ManagedCharacter managedCharacter = (ManagedCharacter)theEObject;
                T result = caseManagedCharacter(managedCharacter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM: {
                CharacterGeneratorSystem characterGeneratorSystem = (CharacterGeneratorSystem)theEObject;
                T result = caseCharacterGeneratorSystem(characterGeneratorSystem);
                if (result == null) result = caseBeschreibbar(characterGeneratorSystem);
                if (result == null) result = caseQuelle(characterGeneratorSystem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.PRIORITY_SYSTEM: {
                PrioritySystem prioritySystem = (PrioritySystem)theEObject;
                T result = casePrioritySystem(prioritySystem);
                if (result == null) result = caseCharacterGeneratorSystem(prioritySystem);
                if (result == null) result = caseBeschreibbar(prioritySystem);
                if (result == null) result = caseQuelle(prioritySystem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.NON_PLAYER_CHARACTER: {
                NonPlayerCharacter nonPlayerCharacter = (NonPlayerCharacter)theEObject;
                T result = caseNonPlayerCharacter(nonPlayerCharacter);
                if (result == null) result = caseManagedCharacter(nonPlayerCharacter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.CHANGES: {
                Changes changes = (Changes)theEObject;
                T result = caseChanges(changes);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.KARMA_GAINT: {
                KarmaGaint karmaGaint = (KarmaGaint)theEObject;
                T result = caseKarmaGaint(karmaGaint);
                if (result == null) result = caseChanges(karmaGaint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.FREE_STYLE: {
                FreeStyle freeStyle = (FreeStyle)theEObject;
                T result = caseFreeStyle(freeStyle);
                if (result == null) result = caseCharacterGeneratorSystem(freeStyle);
                if (result == null) result = caseBeschreibbar(freeStyle);
                if (result == null) result = caseQuelle(freeStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.PRIORITY_CATEGORIE: {
                PriorityCategorie priorityCategorie = (PriorityCategorie)theEObject;
                T result = casePriorityCategorie(priorityCategorie);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.SHR5_SYSTEM: {
                Shr5System shr5System = (Shr5System)theEObject;
                T result = caseShr5System(shr5System);
                if (result == null) result = casePrioritySystem(shr5System);
                if (result == null) result = caseCharacterGeneratorSystem(shr5System);
                if (result == null) result = caseBeschreibbar(shr5System);
                if (result == null) result = caseQuelle(shr5System);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.META_TYPE: {
                MetaType metaType = (MetaType)theEObject;
                T result = caseMetaType(metaType);
                if (result == null) result = casePriorityCategorie(metaType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.ATTRIBUTES: {
                Attributes attributes = (Attributes)theEObject;
                T result = caseAttributes(attributes);
                if (result == null) result = casePriorityCategorie(attributes);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.SKILL: {
                Skill skill = (Skill)theEObject;
                T result = caseSkill(skill);
                if (result == null) result = casePriorityCategorie(skill);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.RESOURCEN: {
                Resourcen resourcen = (Resourcen)theEObject;
                T result = caseResourcen(resourcen);
                if (result == null) result = casePriorityCategorie(resourcen);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.SPECIAL_TYPE: {
                SpecialType specialType = (SpecialType)theEObject;
                T result = caseSpecialType(specialType);
                if (result == null) result = casePriorityCategorie(specialType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.TECHNOMANCER: {
                Technomancer technomancer = (Technomancer)theEObject;
                T result = caseTechnomancer(technomancer);
                if (result == null) result = caseSpecialType(technomancer);
                if (result == null) result = casePriorityCategorie(technomancer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.SPELLCASTER: {
                Spellcaster spellcaster = (Spellcaster)theEObject;
                T result = caseSpellcaster(spellcaster);
                if (result == null) result = caseAdept(spellcaster);
                if (result == null) result = caseSpecialType(spellcaster);
                if (result == null) result = casePriorityCategorie(spellcaster);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.ADEPT: {
                Adept adept = (Adept)theEObject;
                T result = caseAdept(adept);
                if (result == null) result = caseSpecialType(adept);
                if (result == null) result = casePriorityCategorie(adept);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.CHARACTER_GENERATOR: {
                CharacterGenerator characterGenerator = (CharacterGenerator)theEObject;
                T result = caseCharacterGenerator(characterGenerator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.FREE_STYLE_GENERATOR: {
                FreeStyleGenerator freeStyleGenerator = (FreeStyleGenerator)theEObject;
                T result = caseFreeStyleGenerator(freeStyleGenerator);
                if (result == null) result = caseCharacterGenerator(freeStyleGenerator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.SHR5_GENERATOR: {
                Shr5Generator shr5Generator = (Shr5Generator)theEObject;
                T result = caseShr5Generator(shr5Generator);
                if (result == null) result = caseCharacterGenerator(shr5Generator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.ATTRIBUTE_CHANGE: {
                AttributeChange attributeChange = (AttributeChange)theEObject;
                T result = caseAttributeChange(attributeChange);
                if (result == null) result = casePersonaValueChange(attributeChange);
                if (result == null) result = caseKarmaGaint(attributeChange);
                if (result == null) result = caseChanges(attributeChange);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.PLAYER_CHARACTER: {
                PlayerCharacter playerCharacter = (PlayerCharacter)theEObject;
                T result = casePlayerCharacter(playerCharacter);
                if (result == null) result = caseManagedCharacter(playerCharacter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.MUDAN: {
                Mudan mudan = (Mudan)theEObject;
                T result = caseMudan(mudan);
                if (result == null) result = caseSpecialType(mudan);
                if (result == null) result = casePriorityCategorie(mudan);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.CHARACTER_GROUP: {
                CharacterGroup characterGroup = (CharacterGroup)theEObject;
                T result = caseCharacterGroup(characterGroup);
                if (result == null) result = caseBeschreibbar(characterGroup);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.CONNECTION: {
                Connection connection = (Connection)theEObject;
                T result = caseConnection(connection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.FERTIGKEIT_CHANGE: {
                FertigkeitChange fertigkeitChange = (FertigkeitChange)theEObject;
                T result = caseFertigkeitChange(fertigkeitChange);
                if (result == null) result = casePersonaValueChange(fertigkeitChange);
                if (result == null) result = caseKarmaGaint(fertigkeitChange);
                if (result == null) result = caseChanges(fertigkeitChange);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.PERSONA_VALUE_CHANGE: {
                PersonaValueChange personaValueChange = (PersonaValueChange)theEObject;
                T result = casePersonaValueChange(personaValueChange);
                if (result == null) result = caseKarmaGaint(personaValueChange);
                if (result == null) result = caseChanges(personaValueChange);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.GENERATOR_STATE_TO_ESTRING_MAP_ENTRY: {
                @SuppressWarnings("unchecked") Map.Entry<GeneratorState, String> generatorStateToEStringMapEntry = (Map.Entry<GeneratorState, String>)theEObject;
                T result = caseGeneratorStateToEStringMapEntry(generatorStateToEStringMapEntry);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.ADVANCEMENT: {
                Advancement advancement = (Advancement)theEObject;
                T result = caseAdvancement(advancement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.INCREASE_CHARACTER_PART: {
                IncreaseCharacterPart increaseCharacterPart = (IncreaseCharacterPart)theEObject;
                T result = caseIncreaseCharacterPart(increaseCharacterPart);
                if (result == null) result = caseAdvancement(increaseCharacterPart);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.CHANGE_QUALLITY: {
                ChangeQuallity changeQuallity = (ChangeQuallity)theEObject;
                T result = caseChangeQuallity(changeQuallity);
                if (result == null) result = caseAdvancement(changeQuallity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.QUALLITY_CHANGE: {
                QuallityChange quallityChange = (QuallityChange)theEObject;
                T result = caseQuallityChange(quallityChange);
                if (result == null) result = caseKarmaGaint(quallityChange);
                if (result == null) result = caseChanges(quallityChange);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY: {
                LifestyleToStartMoney lifestyleToStartMoney = (LifestyleToStartMoney)theEObject;
                T result = caseLifestyleToStartMoney(lifestyleToStartMoney);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Managed Character</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Managed Character</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseManagedCharacter(ManagedCharacter object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Character Generator System</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Character Generator System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCharacterGeneratorSystem(CharacterGeneratorSystem object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Priority System</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Priority System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePrioritySystem(PrioritySystem object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Non Player Character</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Non Player Character</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseNonPlayerCharacter(NonPlayerCharacter object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Changes</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Changes</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseChanges(Changes object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Karma Gaint</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Karma Gaint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseKarmaGaint(KarmaGaint object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Free Style</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Free Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFreeStyle(FreeStyle object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Priority Categorie</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Priority Categorie</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePriorityCategorie(PriorityCategorie object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Shr5 System</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shr5 System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseShr5System(Shr5System object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Meta Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Meta Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMetaType(MetaType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Attributes</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attributes</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAttributes(Attributes object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Skill</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Skill</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSkill(Skill object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Resourcen</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Resourcen</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseResourcen(Resourcen object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Special Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Special Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSpecialType(SpecialType object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Technomancer</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Technomancer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseTechnomancer(Technomancer object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Spellcaster</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spellcaster</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSpellcaster(Spellcaster object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Adept</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Adept</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAdept(Adept object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Character Generator</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Character Generator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCharacterGenerator(CharacterGenerator object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Free Style Generator</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Free Style Generator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFreeStyleGenerator(FreeStyleGenerator object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Shr5 Generator</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shr5 Generator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseShr5Generator(Shr5Generator object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Change</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Change</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAttributeChange(AttributeChange object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Player Character</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Player Character</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePlayerCharacter(PlayerCharacter object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Mudan</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mudan</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMudan(Mudan object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Character Group</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Character Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseCharacterGroup(CharacterGroup object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseConnection(Connection object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Fertigkeit Change</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fertigkeit Change</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseFertigkeitChange(FertigkeitChange object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Persona Value Change</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Persona Value Change</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T casePersonaValueChange(PersonaValueChange object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Generator State To EString Map Entry</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generator State To EString Map Entry</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseGeneratorStateToEStringMapEntry(Map.Entry<GeneratorState, String> object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Advancement</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Advancement</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAdvancement(Advancement object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Increase Character Part</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Increase Character Part</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseIncreaseCharacterPart(IncreaseCharacterPart object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Change Quallity</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Change Quallity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseChangeQuallity(ChangeQuallity object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Quallity Change</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Quallity Change</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseQuallityChange(QuallityChange object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Lifestyle To Start Money</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Lifestyle To Start Money</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLifestyleToStartMoney(LifestyleToStartMoney object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Beschreibbar</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Beschreibbar</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseBeschreibbar(Beschreibbar object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Quelle</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Quelle</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseQuelle(Quelle object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
	@Override
	public T defaultCase(EObject object) {
        return null;
    }

} //Shr5managementSwitch
