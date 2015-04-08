/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.util;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5Management.Adept;
import de.urszeidler.eclipse.shr5Management.Advancement;
import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.Attributes;
import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.CharacterAdvancementSystem;
import de.urszeidler.eclipse.shr5Management.CharacterChange;
import de.urszeidler.eclipse.shr5Management.CharacterDiary;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem;
import de.urszeidler.eclipse.shr5Management.CharacterGroup;
import de.urszeidler.eclipse.shr5Management.Connection;
import de.urszeidler.eclipse.shr5Management.ContractPayment;
import de.urszeidler.eclipse.shr5Management.DiaryEntry;
import de.urszeidler.eclipse.shr5Management.FreeStyle;
import de.urszeidler.eclipse.shr5Management.FreeStyleGenerator;
import de.urszeidler.eclipse.shr5Management.GamemasterManagement;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.GruntGroup;
import de.urszeidler.eclipse.shr5Management.GruntMembers;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.KarmaGaint;
import de.urszeidler.eclipse.shr5Management.KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.LifeModule;
import de.urszeidler.eclipse.shr5Management.LifeModulesGenerator;
import de.urszeidler.eclipse.shr5Management.LifeModulesSystem;
import de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.MetaType;
import de.urszeidler.eclipse.shr5Management.ModuleAttributeChange;
import de.urszeidler.eclipse.shr5Management.ModuleChange;
import de.urszeidler.eclipse.shr5Management.ModuleFeatureChange;
import de.urszeidler.eclipse.shr5Management.ModuleSkillChange;
import de.urszeidler.eclipse.shr5Management.ModuleSkillGroupChange;
import de.urszeidler.eclipse.shr5Management.ModuleTeachableChange;
import de.urszeidler.eclipse.shr5Management.ModuleTypeChange;
import de.urszeidler.eclipse.shr5Management.Mudan;
import de.urszeidler.eclipse.shr5Management.NonPlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Pack;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.PersonaValueChange;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.PlayerManagement;
import de.urszeidler.eclipse.shr5Management.PriorityCategorie;
import de.urszeidler.eclipse.shr5Management.PrioritySystem;
import de.urszeidler.eclipse.shr5Management.QuellenConstrain;
import de.urszeidler.eclipse.shr5Management.RangeTable;
import de.urszeidler.eclipse.shr5Management.RangeTableEntry;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.Skill;
import de.urszeidler.eclipse.shr5Management.SpecialType;
import de.urszeidler.eclipse.shr5Management.Spellcaster;
import de.urszeidler.eclipse.shr5Management.SumToTenGenerator;
import de.urszeidler.eclipse.shr5Management.Technomancer;
import de.urszeidler.eclipse.shr5Management.TrainingRate;
import de.urszeidler.eclipse.shr5Management.TrainingsTime;

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
public class Shr5managementSwitch<T1> extends Switch<T1> {
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case Shr5managementPackage.MANAGED_CHARACTER: {
                ManagedCharacter managedCharacter = (ManagedCharacter)theEObject;
                T1 result = caseManagedCharacter(managedCharacter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM: {
                CharacterGeneratorSystem characterGeneratorSystem = (CharacterGeneratorSystem)theEObject;
                T1 result = caseCharacterGeneratorSystem(characterGeneratorSystem);
                if (result == null) result = caseBeschreibbar(characterGeneratorSystem);
                if (result == null) result = caseQuelle(characterGeneratorSystem);
                if (result == null) result = caseIdentifiable(characterGeneratorSystem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.PRIORITY_SYSTEM: {
                PrioritySystem prioritySystem = (PrioritySystem)theEObject;
                T1 result = casePrioritySystem(prioritySystem);
                if (result == null) result = caseCharacterGeneratorSystem(prioritySystem);
                if (result == null) result = caseBeschreibbar(prioritySystem);
                if (result == null) result = caseQuelle(prioritySystem);
                if (result == null) result = caseIdentifiable(prioritySystem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.NON_PLAYER_CHARACTER: {
                NonPlayerCharacter nonPlayerCharacter = (NonPlayerCharacter)theEObject;
                T1 result = caseNonPlayerCharacter(nonPlayerCharacter);
                if (result == null) result = caseManagedCharacter(nonPlayerCharacter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.CHANGES: {
                Changes changes = (Changes)theEObject;
                T1 result = caseChanges(changes);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.KARMA_GAINT: {
                KarmaGaint karmaGaint = (KarmaGaint)theEObject;
                T1 result = caseKarmaGaint(karmaGaint);
                if (result == null) result = caseChanges(karmaGaint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.FREE_STYLE: {
                FreeStyle freeStyle = (FreeStyle)theEObject;
                T1 result = caseFreeStyle(freeStyle);
                if (result == null) result = caseCharacterGeneratorSystem(freeStyle);
                if (result == null) result = caseBeschreibbar(freeStyle);
                if (result == null) result = caseQuelle(freeStyle);
                if (result == null) result = caseIdentifiable(freeStyle);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.PRIORITY_CATEGORIE: {
                PriorityCategorie priorityCategorie = (PriorityCategorie)theEObject;
                T1 result = casePriorityCategorie(priorityCategorie);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.SHR5_SYSTEM: {
                Shr5System shr5System = (Shr5System)theEObject;
                T1 result = caseShr5System(shr5System);
                if (result == null) result = casePrioritySystem(shr5System);
                if (result == null) result = caseCharacterGeneratorSystem(shr5System);
                if (result == null) result = caseBeschreibbar(shr5System);
                if (result == null) result = caseQuelle(shr5System);
                if (result == null) result = caseIdentifiable(shr5System);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.META_TYPE: {
                MetaType metaType = (MetaType)theEObject;
                T1 result = caseMetaType(metaType);
                if (result == null) result = casePriorityCategorie(metaType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.ATTRIBUTES: {
                Attributes attributes = (Attributes)theEObject;
                T1 result = caseAttributes(attributes);
                if (result == null) result = casePriorityCategorie(attributes);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.SKILL: {
                Skill skill = (Skill)theEObject;
                T1 result = caseSkill(skill);
                if (result == null) result = casePriorityCategorie(skill);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.RESOURCEN: {
                Resourcen resourcen = (Resourcen)theEObject;
                T1 result = caseResourcen(resourcen);
                if (result == null) result = casePriorityCategorie(resourcen);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.SPECIAL_TYPE: {
                SpecialType specialType = (SpecialType)theEObject;
                T1 result = caseSpecialType(specialType);
                if (result == null) result = casePriorityCategorie(specialType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.TECHNOMANCER: {
                Technomancer technomancer = (Technomancer)theEObject;
                T1 result = caseTechnomancer(technomancer);
                if (result == null) result = caseSpecialType(technomancer);
                if (result == null) result = casePriorityCategorie(technomancer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.SPELLCASTER: {
                Spellcaster spellcaster = (Spellcaster)theEObject;
                T1 result = caseSpellcaster(spellcaster);
                if (result == null) result = caseAdept(spellcaster);
                if (result == null) result = caseSpecialType(spellcaster);
                if (result == null) result = casePriorityCategorie(spellcaster);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.ADEPT: {
                Adept adept = (Adept)theEObject;
                T1 result = caseAdept(adept);
                if (result == null) result = caseSpecialType(adept);
                if (result == null) result = casePriorityCategorie(adept);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.CHARACTER_GENERATOR: {
                CharacterGenerator<?> characterGenerator = (CharacterGenerator<?>)theEObject;
                T1 result = caseCharacterGenerator(characterGenerator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.FREE_STYLE_GENERATOR: {
                FreeStyleGenerator freeStyleGenerator = (FreeStyleGenerator)theEObject;
                T1 result = caseFreeStyleGenerator(freeStyleGenerator);
                if (result == null) result = caseCharacterGenerator(freeStyleGenerator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.SHR5_GENERATOR: {
                Shr5Generator shr5Generator = (Shr5Generator)theEObject;
                T1 result = caseShr5Generator(shr5Generator);
                if (result == null) result = caseShr5RuleGenerator(shr5Generator);
                if (result == null) result = caseCharacterGenerator(shr5Generator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.ATTRIBUTE_CHANGE: {
                AttributeChange attributeChange = (AttributeChange)theEObject;
                T1 result = caseAttributeChange(attributeChange);
                if (result == null) result = casePersonaValueChange(attributeChange);
                if (result == null) result = caseChanges(attributeChange);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.PLAYER_CHARACTER: {
                PlayerCharacter playerCharacter = (PlayerCharacter)theEObject;
                T1 result = casePlayerCharacter(playerCharacter);
                if (result == null) result = caseManagedCharacter(playerCharacter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.MUDAN: {
                Mudan mudan = (Mudan)theEObject;
                T1 result = caseMudan(mudan);
                if (result == null) result = caseSpecialType(mudan);
                if (result == null) result = casePriorityCategorie(mudan);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.CHARACTER_GROUP: {
                CharacterGroup characterGroup = (CharacterGroup)theEObject;
                T1 result = caseCharacterGroup(characterGroup);
                if (result == null) result = caseBeschreibbar(characterGroup);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.CONNECTION: {
                Connection connection = (Connection)theEObject;
                T1 result = caseConnection(connection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.PERSONA_CHANGE: {
                PersonaChange personaChange = (PersonaChange)theEObject;
                T1 result = casePersonaChange(personaChange);
                if (result == null) result = casePersonaValueChange(personaChange);
                if (result == null) result = caseChanges(personaChange);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.PERSONA_VALUE_CHANGE: {
                PersonaValueChange personaValueChange = (PersonaValueChange)theEObject;
                T1 result = casePersonaValueChange(personaValueChange);
                if (result == null) result = caseChanges(personaValueChange);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.GENERATOR_STATE_TO_ESTRING_MAP_ENTRY: {
                @SuppressWarnings("unchecked") Map.Entry<GeneratorState, String> generatorStateToEStringMapEntry = (Map.Entry<GeneratorState, String>)theEObject;
                T1 result = caseGeneratorStateToEStringMapEntry(generatorStateToEStringMapEntry);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.ADVANCEMENT: {
                Advancement advancement = (Advancement)theEObject;
                T1 result = caseAdvancement(advancement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.INCREASE_CHARACTER_PART: {
                IncreaseCharacterPart increaseCharacterPart = (IncreaseCharacterPart)theEObject;
                T1 result = caseIncreaseCharacterPart(increaseCharacterPart);
                if (result == null) result = caseAdvancement(increaseCharacterPart);
                if (result == null) result = caseRangeTable(increaseCharacterPart);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY: {
                LifestyleToStartMoney lifestyleToStartMoney = (LifestyleToStartMoney)theEObject;
                T1 result = caseLifestyleToStartMoney(lifestyleToStartMoney);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.GRUNT_GROUP: {
                GruntGroup gruntGroup = (GruntGroup)theEObject;
                T1 result = caseGruntGroup(gruntGroup);
                if (result == null) result = caseBeschreibbar(gruntGroup);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.GRUNT_MEMBERS: {
                GruntMembers gruntMembers = (GruntMembers)theEObject;
                T1 result = caseGruntMembers(gruntMembers);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.PLAYER_MANAGEMENT: {
                PlayerManagement playerManagement = (PlayerManagement)theEObject;
                T1 result = casePlayerManagement(playerManagement);
                if (result == null) result = caseBeschreibbar(playerManagement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.GAMEMASTER_MANAGEMENT: {
                GamemasterManagement gamemasterManagement = (GamemasterManagement)theEObject;
                T1 result = caseGamemasterManagement(gamemasterManagement);
                if (result == null) result = casePlayerManagement(gamemasterManagement);
                if (result == null) result = caseBeschreibbar(gamemasterManagement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM: {
                CharacterAdvancementSystem characterAdvancementSystem = (CharacterAdvancementSystem)theEObject;
                T1 result = caseCharacterAdvancementSystem(characterAdvancementSystem);
                if (result == null) result = caseBeschreibbar(characterAdvancementSystem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.SHR5_RULE_GENERATOR: {
                Shr5RuleGenerator<?> shr5RuleGenerator = (Shr5RuleGenerator<?>)theEObject;
                T1 result = caseShr5RuleGenerator(shr5RuleGenerator);
                if (result == null) result = caseCharacterGenerator(shr5RuleGenerator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.KARMA_GENERATOR: {
                KarmaGenerator<?> karmaGenerator = (KarmaGenerator<?>)theEObject;
                T1 result = caseKarmaGenerator(karmaGenerator);
                if (result == null) result = caseShr5RuleGenerator(karmaGenerator);
                if (result == null) result = caseCharacterGenerator(karmaGenerator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.QUELLEN_CONSTRAIN: {
                QuellenConstrain quellenConstrain = (QuellenConstrain)theEObject;
                T1 result = caseQuellenConstrain(quellenConstrain);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.PACK: {
                Pack pack = (Pack)theEObject;
                T1 result = casePack(pack);
                if (result == null) result = caseBeschreibbar(pack);
                if (result == null) result = caseQuelle(pack);
                if (result == null) result = caseGeldWert(pack);
                if (result == null) result = caseIdentifiable(pack);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.CHARACTER_DIARY: {
                CharacterDiary characterDiary = (CharacterDiary)theEObject;
                T1 result = caseCharacterDiary(characterDiary);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.DIARY_ENTRY: {
                DiaryEntry diaryEntry = (DiaryEntry)theEObject;
                T1 result = caseDiaryEntry(diaryEntry);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.CONTRACT_PAYMENT: {
                ContractPayment contractPayment = (ContractPayment)theEObject;
                T1 result = caseContractPayment(contractPayment);
                if (result == null) result = caseDiaryEntry(contractPayment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.CHARACTER_CHANGE: {
                CharacterChange characterChange = (CharacterChange)theEObject;
                T1 result = caseCharacterChange(characterChange);
                if (result == null) result = caseDiaryEntry(characterChange);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.SUM_TO_TEN_GENERATOR: {
                SumToTenGenerator sumToTenGenerator = (SumToTenGenerator)theEObject;
                T1 result = caseSumToTenGenerator(sumToTenGenerator);
                if (result == null) result = caseShr5Generator(sumToTenGenerator);
                if (result == null) result = caseShr5RuleGenerator(sumToTenGenerator);
                if (result == null) result = caseCharacterGenerator(sumToTenGenerator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.LIFE_MODULES_GENERATOR: {
                LifeModulesGenerator lifeModulesGenerator = (LifeModulesGenerator)theEObject;
                T1 result = caseLifeModulesGenerator(lifeModulesGenerator);
                if (result == null) result = caseKarmaGenerator(lifeModulesGenerator);
                if (result == null) result = caseShr5RuleGenerator(lifeModulesGenerator);
                if (result == null) result = caseCharacterGenerator(lifeModulesGenerator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.LIFE_MODULES_SYSTEM: {
                LifeModulesSystem lifeModulesSystem = (LifeModulesSystem)theEObject;
                T1 result = caseLifeModulesSystem(lifeModulesSystem);
                if (result == null) result = caseShr5System(lifeModulesSystem);
                if (result == null) result = casePrioritySystem(lifeModulesSystem);
                if (result == null) result = caseCharacterGeneratorSystem(lifeModulesSystem);
                if (result == null) result = caseBeschreibbar(lifeModulesSystem);
                if (result == null) result = caseQuelle(lifeModulesSystem);
                if (result == null) result = caseIdentifiable(lifeModulesSystem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.LIFE_MODULE: {
                LifeModule lifeModule = (LifeModule)theEObject;
                T1 result = caseLifeModule(lifeModule);
                if (result == null) result = caseBeschreibbar(lifeModule);
                if (result == null) result = caseQuelle(lifeModule);
                if (result == null) result = caseIdentifiable(lifeModule);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.MODULE_CHANGE: {
                ModuleChange moduleChange = (ModuleChange)theEObject;
                T1 result = caseModuleChange(moduleChange);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.MODULE_SKILL_CHANGE: {
                ModuleSkillChange moduleSkillChange = (ModuleSkillChange)theEObject;
                T1 result = caseModuleSkillChange(moduleSkillChange);
                if (result == null) result = caseModuleTypeChange(moduleSkillChange);
                if (result == null) result = caseModuleChange(moduleSkillChange);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.MODULE_TEACHABLE_CHANGE: {
                ModuleTeachableChange moduleTeachableChange = (ModuleTeachableChange)theEObject;
                T1 result = caseModuleTeachableChange(moduleTeachableChange);
                if (result == null) result = caseModuleTypeChange(moduleTeachableChange);
                if (result == null) result = caseModuleChange(moduleTeachableChange);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE: {
                ModuleAttributeChange moduleAttributeChange = (ModuleAttributeChange)theEObject;
                T1 result = caseModuleAttributeChange(moduleAttributeChange);
                if (result == null) result = caseModuleTypeChange(moduleAttributeChange);
                if (result == null) result = caseModuleChange(moduleAttributeChange);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.MODULE_FEATURE_CHANGE: {
                ModuleFeatureChange moduleFeatureChange = (ModuleFeatureChange)theEObject;
                T1 result = caseModuleFeatureChange(moduleFeatureChange);
                if (result == null) result = caseModuleChange(moduleFeatureChange);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE: {
                ModuleSkillGroupChange moduleSkillGroupChange = (ModuleSkillGroupChange)theEObject;
                T1 result = caseModuleSkillGroupChange(moduleSkillGroupChange);
                if (result == null) result = caseModuleTypeChange(moduleSkillGroupChange);
                if (result == null) result = caseModuleChange(moduleSkillGroupChange);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.MODULE_TYPE_CHANGE: {
                ModuleTypeChange<?> moduleTypeChange = (ModuleTypeChange<?>)theEObject;
                T1 result = caseModuleTypeChange(moduleTypeChange);
                if (result == null) result = caseModuleChange(moduleTypeChange);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.SHR5_KARMA_GENERATOR: {
                Shr5KarmaGenerator shr5KarmaGenerator = (Shr5KarmaGenerator)theEObject;
                T1 result = caseShr5KarmaGenerator(shr5KarmaGenerator);
                if (result == null) result = caseKarmaGenerator(shr5KarmaGenerator);
                if (result == null) result = caseShr5RuleGenerator(shr5KarmaGenerator);
                if (result == null) result = caseCharacterGenerator(shr5KarmaGenerator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.TRAINING_RATE: {
                TrainingRate trainingRate = (TrainingRate)theEObject;
                T1 result = caseTrainingRate(trainingRate);
                if (result == null) result = caseRangeTableEntry(trainingRate);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.RANGE_TABLE_ENTRY: {
                RangeTableEntry rangeTableEntry = (RangeTableEntry)theEObject;
                T1 result = caseRangeTableEntry(rangeTableEntry);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.RANGE_TABLE: {
                RangeTable<?> rangeTable = (RangeTable<?>)theEObject;
                T1 result = caseRangeTable(rangeTable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case Shr5managementPackage.TRAININGS_TIME: {
                TrainingsTime trainingsTime = (TrainingsTime)theEObject;
                T1 result = caseTrainingsTime(trainingsTime);
                if (result == null) result = caseCharacterChange(trainingsTime);
                if (result == null) result = caseDiaryEntry(trainingsTime);
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
	public T1 caseManagedCharacter(ManagedCharacter object) {
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
	public T1 caseCharacterGeneratorSystem(CharacterGeneratorSystem object) {
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
	public T1 casePrioritySystem(PrioritySystem object) {
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
	public T1 caseNonPlayerCharacter(NonPlayerCharacter object) {
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
	public T1 caseChanges(Changes object) {
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
	public T1 caseKarmaGaint(KarmaGaint object) {
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
	public T1 caseFreeStyle(FreeStyle object) {
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
	public T1 casePriorityCategorie(PriorityCategorie object) {
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
	public T1 caseShr5System(Shr5System object) {
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
	public T1 caseMetaType(MetaType object) {
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
	public T1 caseAttributes(Attributes object) {
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
	public T1 caseSkill(Skill object) {
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
	public T1 caseResourcen(Resourcen object) {
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
	public T1 caseSpecialType(SpecialType object) {
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
	public T1 caseTechnomancer(Technomancer object) {
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
	public T1 caseSpellcaster(Spellcaster object) {
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
	public T1 caseAdept(Adept object) {
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
	public <G extends CharacterGeneratorSystem> T1 caseCharacterGenerator(CharacterGenerator<G> object) {
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
	public T1 caseFreeStyleGenerator(FreeStyleGenerator object) {
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
	public T1 caseShr5Generator(Shr5Generator object) {
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
	public T1 caseAttributeChange(AttributeChange object) {
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
	public T1 casePlayerCharacter(PlayerCharacter object) {
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
	public T1 caseMudan(Mudan object) {
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
	public T1 caseCharacterGroup(CharacterGroup object) {
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
	public T1 caseConnection(Connection object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Persona Change</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Persona Change</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 casePersonaChange(PersonaChange object) {
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
	public T1 casePersonaValueChange(PersonaValueChange object) {
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
	public T1 caseGeneratorStateToEStringMapEntry(Map.Entry<GeneratorState, String> object) {
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
	public T1 caseAdvancement(Advancement object) {
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
	public T1 caseIncreaseCharacterPart(IncreaseCharacterPart object) {
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
    public T1 caseLifestyleToStartMoney(LifestyleToStartMoney object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Grunt Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Grunt Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseGruntGroup(GruntGroup object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Grunt Members</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Grunt Members</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseGruntMembers(GruntMembers object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Player Management</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Player Management</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 casePlayerManagement(PlayerManagement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gamemaster Management</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gamemaster Management</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseGamemasterManagement(GamemasterManagement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Character Advancement System</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Character Advancement System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseCharacterAdvancementSystem(CharacterAdvancementSystem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Shr5 Rule Generator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shr5 Rule Generator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public <G extends Shr5System> T1 caseShr5RuleGenerator(Shr5RuleGenerator<G> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Shr5 Karma Generator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Shr5 Karma Generator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseShr5KarmaGenerator(Shr5KarmaGenerator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Training Rate</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Training Rate</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseTrainingRate(TrainingRate object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Range Table Entry</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Range Table Entry</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseRangeTableEntry(RangeTableEntry object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Range Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Range Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public <E extends RangeTableEntry> T1 caseRangeTable(RangeTable<E> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Trainings Time</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Trainings Time</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseTrainingsTime(TrainingsTime object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Quellen Constrain</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Quellen Constrain</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseQuellenConstrain(QuellenConstrain object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pack</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pack</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 casePack(Pack object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Character Diary</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Character Diary</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseCharacterDiary(CharacterDiary object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diary Entry</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diary Entry</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseDiaryEntry(DiaryEntry object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Contract Payment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Contract Payment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseContractPayment(ContractPayment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Character Change</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Character Change</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseCharacterChange(CharacterChange object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sum To Ten Generator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sum To Ten Generator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseSumToTenGenerator(SumToTenGenerator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Life Modules Generator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Life Modules Generator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseLifeModulesGenerator(LifeModulesGenerator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Life Modules System</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Life Modules System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseLifeModulesSystem(LifeModulesSystem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Life Module</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Life Module</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseLifeModule(LifeModule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module Change</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module Change</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseModuleChange(ModuleChange object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module Skill Change</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module Skill Change</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseModuleSkillChange(ModuleSkillChange object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module Teachable Change</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module Teachable Change</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseModuleTeachableChange(ModuleTeachableChange object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module Attribute Change</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module Attribute Change</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseModuleAttributeChange(ModuleAttributeChange object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module Feature Change</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module Feature Change</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseModuleFeatureChange(ModuleFeatureChange object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module Skill Group Change</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module Skill Group Change</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseModuleSkillGroupChange(ModuleSkillGroupChange object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Module Type Change</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Module Type Change</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public <T> T1 caseModuleTypeChange(ModuleTypeChange<T> object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Karma Generator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Karma Generator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public <G extends Shr5System> T1 caseKarmaGenerator(KarmaGenerator<G> object) {
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
	public T1 caseBeschreibbar(Beschreibbar object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseIdentifiable(Identifiable object) {
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
	public T1 caseQuelle(Quelle object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Geld Wert</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Geld Wert</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T1 caseGeldWert(GeldWert object) {
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
	public T1 defaultCase(EObject object) {
        return null;
    }

} //Shr5managementSwitch
