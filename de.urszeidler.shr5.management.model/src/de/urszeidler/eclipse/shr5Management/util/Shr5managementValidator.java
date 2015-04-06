/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.util;

import de.urszeidler.eclipse.shr5Management.*;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

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
import de.urszeidler.eclipse.shr5Management.LifeModuleType;
import de.urszeidler.eclipse.shr5Management.LifeModulesGenerator;
import de.urszeidler.eclipse.shr5Management.LifeModulesSystem;
import de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.MetaType;
import de.urszeidler.eclipse.shr5Management.ModelPlugin;
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
import de.urszeidler.eclipse.shr5Management.QuellenConstrainType;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Sex;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage
 * @generated
 */
public class Shr5managementValidator extends EObjectValidator {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final Shr5managementValidator INSTANCE = new Shr5managementValidator();

	/**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
	public static final String DIAGNOSTIC_SOURCE = "de.urszeidler.eclipse.shr5Management";

	/**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Category Only Once' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final int SHR5_GENERATOR__HAS_CATEGORY_ONLY_ONCE = 1;

	/**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Not More Max Attributes' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final int SHR5_GENERATOR__HAS_NOT_MORE_MAX_ATTRIBUTES = 2;

	/**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Attributes Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_ATTRIBUTES_POINTS = 3;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Skill Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_SKILL_POINTS = 4;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Special Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_SPECIAL_POINTS = 5;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Special Type Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_SPECIAL_TYPE_POINTS = 6;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Connection Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_CONNECTION_POINTS = 7;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Resource Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_RESOURCE_POINTS = 8;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Magic Skills Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_MAGIC_SKILLS_POINTS = 9;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Magic Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_MAGIC_POINTS = 10;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Group Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_GROUP_POINTS = 11;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Knowlege Skill Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_KNOWLEGE_SKILL_POINTS = 12;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Karma Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_KARMA_POINTS = 13;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Spell Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_SPELL_POINTS = 14;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Power Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_POWER_POINTS = 15;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Points' of 'Shr5 Rule Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_RULE_GENERATOR__HAS_SPEND_ALL_POINTS = 16;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Not More Max Attributes' of 'Shr5 Rule Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_RULE_GENERATOR__HAS_NOT_MORE_MAX_ATTRIBUTES = 17;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has No Skills Over Max' of 'Shr5 Rule Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_RULE_GENERATOR__HAS_NO_SKILLS_OVER_MAX = 18;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Not More Specalism' of 'Shr5 Rule Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_RULE_GENERATOR__HAS_NOT_MORE_SPECALISM = 19;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has No Attributes Over Species Att' of 'Shr5 Rule Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_RULE_GENERATOR__HAS_NO_ATTRIBUTES_OVER_SPECIES_ATT = 20;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has No Constrain Voilation' of 'Shr5 Rule Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_RULE_GENERATOR__HAS_NO_CONSTRAIN_VOILATION = 21;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Lifestyle Choosen' of 'Shr5 Rule Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_RULE_GENERATOR__HAS_LIFESTYLE_CHOOSEN = 22;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Only Allowed Sources' of 'Shr5 Rule Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_RULE_GENERATOR__HAS_ONLY_ALLOWED_SOURCES = 23;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Ki Power Over Limit' of 'Shr5 Rule Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_RULE_GENERATOR__HAS_KI_POWER_OVER_LIMIT = 24;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Basic Violations' of 'Shr5 Rule Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_RULE_GENERATOR__HAS_BASIC_VIOLATIONS = 25;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Karma Points' of 'Karma Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int KARMA_GENERATOR__HAS_SPEND_ALL_KARMA_POINTS = 26;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Resources' of 'Karma Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int KARMA_GENERATOR__HAS_SPEND_ALL_RESOURCES = 27;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Sum To Ten' of 'Sum To Ten Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SUM_TO_TEN_GENERATOR__HAS_SUM_TO_TEN = 28;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 28;

	/**
     * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shr5managementValidator() {
        super();
    }

	/**
     * Returns the package of this validator switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EPackage getEPackage() {
      return Shr5managementPackage.eINSTANCE;
    }

	/**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
        switch (classifierID) {
            case Shr5managementPackage.MANAGED_CHARACTER:
                return validateManagedCharacter((ManagedCharacter)value, diagnostics, context);
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM:
                return validateCharacterGeneratorSystem((CharacterGeneratorSystem)value, diagnostics, context);
            case Shr5managementPackage.PRIORITY_SYSTEM:
                return validatePrioritySystem((PrioritySystem)value, diagnostics, context);
            case Shr5managementPackage.NON_PLAYER_CHARACTER:
                return validateNonPlayerCharacter((NonPlayerCharacter)value, diagnostics, context);
            case Shr5managementPackage.CHANGES:
                return validateChanges((Changes)value, diagnostics, context);
            case Shr5managementPackage.KARMA_GAINT:
                return validateKarmaGaint((KarmaGaint)value, diagnostics, context);
            case Shr5managementPackage.FREE_STYLE:
                return validateFreeStyle((FreeStyle)value, diagnostics, context);
            case Shr5managementPackage.PRIORITY_CATEGORIE:
                return validatePriorityCategorie((PriorityCategorie)value, diagnostics, context);
            case Shr5managementPackage.SHR5_SYSTEM:
                return validateShr5System((Shr5System)value, diagnostics, context);
            case Shr5managementPackage.META_TYPE:
                return validateMetaType((MetaType)value, diagnostics, context);
            case Shr5managementPackage.ATTRIBUTES:
                return validateAttributes((Attributes)value, diagnostics, context);
            case Shr5managementPackage.SKILL:
                return validateSkill((Skill)value, diagnostics, context);
            case Shr5managementPackage.RESOURCEN:
                return validateResourcen((Resourcen)value, diagnostics, context);
            case Shr5managementPackage.SPECIAL_TYPE:
                return validateSpecialType((SpecialType)value, diagnostics, context);
            case Shr5managementPackage.TECHNOMANCER:
                return validateTechnomancer((Technomancer)value, diagnostics, context);
            case Shr5managementPackage.SPELLCASTER:
                return validateSpellcaster((Spellcaster)value, diagnostics, context);
            case Shr5managementPackage.ADEPT:
                return validateAdept((Adept)value, diagnostics, context);
            case Shr5managementPackage.CHARACTER_GENERATOR:
                return validateCharacterGenerator((CharacterGenerator<?>)value, diagnostics, context);
            case Shr5managementPackage.FREE_STYLE_GENERATOR:
                return validateFreeStyleGenerator((FreeStyleGenerator)value, diagnostics, context);
            case Shr5managementPackage.SHR5_GENERATOR:
                return validateShr5Generator((Shr5Generator)value, diagnostics, context);
            case Shr5managementPackage.ATTRIBUTE_CHANGE:
                return validateAttributeChange((AttributeChange)value, diagnostics, context);
            case Shr5managementPackage.PLAYER_CHARACTER:
                return validatePlayerCharacter((PlayerCharacter)value, diagnostics, context);
            case Shr5managementPackage.MUDAN:
                return validateMudan((Mudan)value, diagnostics, context);
            case Shr5managementPackage.CHARACTER_GROUP:
                return validateCharacterGroup((CharacterGroup)value, diagnostics, context);
            case Shr5managementPackage.CONNECTION:
                return validateConnection((Connection)value, diagnostics, context);
            case Shr5managementPackage.PERSONA_CHANGE:
                return validatePersonaChange((PersonaChange)value, diagnostics, context);
            case Shr5managementPackage.PERSONA_VALUE_CHANGE:
                return validatePersonaValueChange((PersonaValueChange)value, diagnostics, context);
            case Shr5managementPackage.GENERATOR_STATE_TO_ESTRING_MAP_ENTRY:
                return validateGeneratorStateToEStringMapEntry((Map.Entry<?, ?>)value, diagnostics, context);
            case Shr5managementPackage.ADVANCEMENT:
                return validateAdvancement((Advancement)value, diagnostics, context);
            case Shr5managementPackage.INCREASE_CHARACTER_PART:
                return validateIncreaseCharacterPart((IncreaseCharacterPart)value, diagnostics, context);
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY:
                return validateLifestyleToStartMoney((LifestyleToStartMoney)value, diagnostics, context);
            case Shr5managementPackage.GRUNT_GROUP:
                return validateGruntGroup((GruntGroup)value, diagnostics, context);
            case Shr5managementPackage.GRUNT_MEMBERS:
                return validateGruntMembers((GruntMembers)value, diagnostics, context);
            case Shr5managementPackage.PLAYER_MANAGEMENT:
                return validatePlayerManagement((PlayerManagement)value, diagnostics, context);
            case Shr5managementPackage.GAMEMASTER_MANAGEMENT:
                return validateGamemasterManagement((GamemasterManagement)value, diagnostics, context);
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM:
                return validateCharacterAdvancementSystem((CharacterAdvancementSystem)value, diagnostics, context);
            case Shr5managementPackage.SHR5_RULE_GENERATOR:
                return validateShr5RuleGenerator((Shr5RuleGenerator<?>)value, diagnostics, context);
            case Shr5managementPackage.KARMA_GENERATOR:
                return validateKarmaGenerator((KarmaGenerator<?>)value, diagnostics, context);
            case Shr5managementPackage.QUELLEN_CONSTRAIN:
                return validateQuellenConstrain((QuellenConstrain)value, diagnostics, context);
            case Shr5managementPackage.PACK:
                return validatePack((Pack)value, diagnostics, context);
            case Shr5managementPackage.CHARACTER_DIARY:
                return validateCharacterDiary((CharacterDiary)value, diagnostics, context);
            case Shr5managementPackage.DIARY_ENTRY:
                return validateDiaryEntry((DiaryEntry)value, diagnostics, context);
            case Shr5managementPackage.CONTRACT_PAYMENT:
                return validateContractPayment((ContractPayment)value, diagnostics, context);
            case Shr5managementPackage.CHARACTER_CHANGE:
                return validateCharacterChange((CharacterChange)value, diagnostics, context);
            case Shr5managementPackage.SUM_TO_TEN_GENERATOR:
                return validateSumToTenGenerator((SumToTenGenerator)value, diagnostics, context);
            case Shr5managementPackage.LIFE_MODULES_GENERATOR:
                return validateLifeModulesGenerator((LifeModulesGenerator)value, diagnostics, context);
            case Shr5managementPackage.LIFE_MODULES_SYSTEM:
                return validateLifeModulesSystem((LifeModulesSystem)value, diagnostics, context);
            case Shr5managementPackage.LIFE_MODULE:
                return validateLifeModule((LifeModule)value, diagnostics, context);
            case Shr5managementPackage.MODULE_CHANGE:
                return validateModuleChange((ModuleChange)value, diagnostics, context);
            case Shr5managementPackage.MODULE_SKILL_CHANGE:
                return validateModuleSkillChange((ModuleSkillChange)value, diagnostics, context);
            case Shr5managementPackage.MODULE_TEACHABLE_CHANGE:
                return validateModuleTeachableChange((ModuleTeachableChange)value, diagnostics, context);
            case Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE:
                return validateModuleAttributeChange((ModuleAttributeChange)value, diagnostics, context);
            case Shr5managementPackage.MODULE_FEATURE_CHANGE:
                return validateModuleFeatureChange((ModuleFeatureChange)value, diagnostics, context);
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE:
                return validateModuleSkillGroupChange((ModuleSkillGroupChange)value, diagnostics, context);
            case Shr5managementPackage.MODULE_TYPE_CHANGE:
                return validateModuleTypeChange((ModuleTypeChange<?>)value, diagnostics, context);
            case Shr5managementPackage.SHR5_KARMA_GENERATOR:
                return validateShr5KarmaGenerator((Shr5KarmaGenerator)value, diagnostics, context);
            case Shr5managementPackage.TRAINING_RATE:
                return validateTrainingRate((TrainingRate)value, diagnostics, context);
            case Shr5managementPackage.RANGE_TABLE_ENTRY:
                return validateRangeTableEntry((RangeTableEntry)value, diagnostics, context);
            case Shr5managementPackage.RANGE_TABLE:
                return validateRangeTable((RangeTable<?>)value, diagnostics, context);
            case Shr5managementPackage.GENERATOR_STATE:
                return validateGeneratorState((GeneratorState)value, diagnostics, context);
            case Shr5managementPackage.SEX:
                return validateSex((Sex)value, diagnostics, context);
            case Shr5managementPackage.QUELLEN_CONSTRAIN_TYPE:
                return validateQuellenConstrainType((QuellenConstrainType)value, diagnostics, context);
            case Shr5managementPackage.LIFE_MODULE_TYPE:
                return validateLifeModuleType((LifeModuleType)value, diagnostics, context);
            default:
                return true;
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateManagedCharacter(ManagedCharacter managedCharacter, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(managedCharacter, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCharacterGeneratorSystem(CharacterGeneratorSystem characterGeneratorSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(characterGeneratorSystem, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validatePrioritySystem(PrioritySystem prioritySystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(prioritySystem, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateNonPlayerCharacter(NonPlayerCharacter nonPlayerCharacter, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(nonPlayerCharacter, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateChanges(Changes changes, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(changes, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateKarmaGaint(KarmaGaint karmaGaint, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(karmaGaint, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateFreeStyle(FreeStyle freeStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(freeStyle, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validatePriorityCategorie(PriorityCategorie priorityCategorie, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(priorityCategorie, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateShr5System(Shr5System shr5System, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(shr5System, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateMetaType(MetaType metaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(metaType, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAttributes(Attributes attributes, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(attributes, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSkill(Skill skill, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(skill, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateResourcen(Resourcen resourcen, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(resourcen, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSpecialType(SpecialType specialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(specialType, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateTechnomancer(Technomancer technomancer, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(technomancer, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSpellcaster(Spellcaster spellcaster, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(spellcaster, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAdept(Adept adept, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(adept, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCharacterGenerator(CharacterGenerator<?> characterGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(characterGenerator, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateFreeStyleGenerator(FreeStyleGenerator freeStyleGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(freeStyleGenerator, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateShr5Generator(Shr5Generator shr5Generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(shr5Generator, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasSpendAllPoints(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasNotMoreMaxAttributes(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoSkillsOverMax(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNotMoreSpecalism(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoAttributesOverSpeciesAtt(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoConstrainVoilation(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasLifestyleChoosen(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasOnlyAllowedSources(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasKiPowerOverLimit(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasBasicViolations(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasCategoryOnlyOnce(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllAttributesPoints(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllSkillPoints(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllSpecialPoints(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllSpecialTypePoints(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllConnectionPoints(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllResourcePoints(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllMagicSkillsPoints(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllMagicPoints(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllGroupPoints(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllKnowlegeSkillPoints(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllKarmaPoints(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllSpellPoints(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllPowerPoints(shr5Generator, diagnostics, context);
        return result;
    }

	/**
     * Validates the hasCategoryOnlyOnce constraint of '<em>Shr5 Generator</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateShr5Generator_hasCategoryOnlyOnce(Shr5Generator shr5Generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5Generator.hasCategoryOnlyOnce(diagnostics, context);
    }

	/**
     * Validates the hasNotMoreMaxAttributes constraint of '<em>Shr5 Generator</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateShr5Generator_hasNotMoreMaxAttributes(Shr5Generator shr5Generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5Generator.hasNotMoreMaxAttributes(diagnostics, context);
    }

	/**
     * Validates the hasSpendAllAttributesPoints constraint of '<em>Shr5 Generator</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateShr5Generator_hasSpendAllAttributesPoints(Shr5Generator shr5Generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5Generator.hasSpendAllAttributesPoints(diagnostics, context);
    }

	/**
     * Validates the hasSpendAllSkillPoints constraint of '<em>Shr5 Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5Generator_hasSpendAllSkillPoints(Shr5Generator shr5Generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5Generator.hasSpendAllSkillPoints(diagnostics, context);
    }

    /**
     * Validates the hasSpendAllSpecialPoints constraint of '<em>Shr5 Generator</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateShr5Generator_hasSpendAllSpecialPoints(Shr5Generator shr5Generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5Generator.hasSpendAllSpecialPoints(diagnostics, context);
    }

	/**
     * Validates the hasSpendAllSpecialTypePoints constraint of '<em>Shr5 Generator</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateShr5Generator_hasSpendAllSpecialTypePoints(Shr5Generator shr5Generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5Generator.hasSpendAllSpecialTypePoints(diagnostics, context);
    }

	/**
     * Validates the hasSpendAllConnectionPoints constraint of '<em>Shr5 Generator</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateShr5Generator_hasSpendAllConnectionPoints(Shr5Generator shr5Generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5Generator.hasSpendAllConnectionPoints(diagnostics, context);
    }

	/**
     * Validates the hasSpendAllResourcePoints constraint of '<em>Shr5 Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5Generator_hasSpendAllResourcePoints(Shr5Generator shr5Generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5Generator.hasSpendAllResourcePoints(diagnostics, context);
    }

    /**
     * Validates the hasSpendAllMagicSkillsPoints constraint of '<em>Shr5 Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5Generator_hasSpendAllMagicSkillsPoints(Shr5Generator shr5Generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5Generator.hasSpendAllMagicSkillsPoints(diagnostics, context);
    }

    /**
     * Validates the hasSpendAllMagicPoints constraint of '<em>Shr5 Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5Generator_hasSpendAllMagicPoints(Shr5Generator shr5Generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5Generator.hasSpendAllMagicPoints(diagnostics, context);
    }

    /**
     * Validates the hasSpendAllGroupPoints constraint of '<em>Shr5 Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5Generator_hasSpendAllGroupPoints(Shr5Generator shr5Generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5Generator.hasSpendAllGroupPoints(diagnostics, context);
    }

    /**
     * Validates the hasSpendAllKnowlegeSkillPoints constraint of '<em>Shr5 Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5Generator_hasSpendAllKnowlegeSkillPoints(Shr5Generator shr5Generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5Generator.hasSpendAllKnowlegeSkillPoints(diagnostics, context);
    }

    /**
     * Validates the hasSpendAllKarmaPoints constraint of '<em>Shr5 Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5Generator_hasSpendAllKarmaPoints(Shr5Generator shr5Generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5Generator.hasSpendAllKarmaPoints(diagnostics, context);
    }

    /**
     * Validates the hasSpendAllSpellPoints constraint of '<em>Shr5 Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5Generator_hasSpendAllSpellPoints(Shr5Generator shr5Generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5Generator.hasSpendAllSpellPoints(diagnostics, context);
    }

    /**
     * Validates the hasSpendAllPowerPoints constraint of '<em>Shr5 Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5Generator_hasSpendAllPowerPoints(Shr5Generator shr5Generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5Generator.hasSpendAllPowerPoints(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAttributeChange(AttributeChange attributeChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(attributeChange, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validatePlayerCharacter(PlayerCharacter playerCharacter, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(playerCharacter, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateMudan(Mudan mudan, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(mudan, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateCharacterGroup(CharacterGroup characterGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(characterGroup, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(connection, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePersonaChange(PersonaChange personaChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(personaChange, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validatePersonaValueChange(PersonaValueChange personaValueChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(personaValueChange, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateGeneratorStateToEStringMapEntry(Map.Entry<?, ?> generatorStateToEStringMapEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint((EObject)generatorStateToEStringMapEntry, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateAdvancement(Advancement advancement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(advancement, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateIncreaseCharacterPart(IncreaseCharacterPart increaseCharacterPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(increaseCharacterPart, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLifestyleToStartMoney(LifestyleToStartMoney lifestyleToStartMoney, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(lifestyleToStartMoney, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateGruntGroup(GruntGroup gruntGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(gruntGroup, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateGruntMembers(GruntMembers gruntMembers, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(gruntMembers, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePlayerManagement(PlayerManagement playerManagement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(playerManagement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateGamemasterManagement(GamemasterManagement gamemasterManagement, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(gamemasterManagement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCharacterAdvancementSystem(CharacterAdvancementSystem characterAdvancementSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(characterAdvancementSystem, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5RuleGenerator(Shr5RuleGenerator<?> shr5RuleGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(shr5RuleGenerator, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(shr5RuleGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(shr5RuleGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(shr5RuleGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(shr5RuleGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(shr5RuleGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(shr5RuleGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(shr5RuleGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(shr5RuleGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasSpendAllPoints(shr5RuleGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNotMoreMaxAttributes(shr5RuleGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoSkillsOverMax(shr5RuleGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNotMoreSpecalism(shr5RuleGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoAttributesOverSpeciesAtt(shr5RuleGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoConstrainVoilation(shr5RuleGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasLifestyleChoosen(shr5RuleGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasOnlyAllowedSources(shr5RuleGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasKiPowerOverLimit(shr5RuleGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasBasicViolations(shr5RuleGenerator, diagnostics, context);
        return result;
    }

    /**
     * Validates the hasSpendAllPoints constraint of '<em>Shr5 Rule Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5RuleGenerator_hasSpendAllPoints(Shr5RuleGenerator<?> shr5RuleGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5RuleGenerator.hasSpendAllPoints(diagnostics, context);
    }

    /**
     * Validates the hasNotMoreMaxAttributes constraint of '<em>Shr5 Rule Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5RuleGenerator_hasNotMoreMaxAttributes(Shr5RuleGenerator<?> shr5RuleGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5RuleGenerator.hasNotMoreMaxAttributes(diagnostics, context);
    }

    /**
     * Validates the hasNoSkillsOverMax constraint of '<em>Shr5 Rule Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5RuleGenerator_hasNoSkillsOverMax(Shr5RuleGenerator<?> shr5RuleGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5RuleGenerator.hasNoSkillsOverMax(diagnostics, context);
    }

    /**
     * Validates the hasNotMoreSpecalism constraint of '<em>Shr5 Rule Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5RuleGenerator_hasNotMoreSpecalism(Shr5RuleGenerator<?> shr5RuleGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5RuleGenerator.hasNotMoreSpecalism(diagnostics, context);
    }

    /**
     * Validates the hasNoAttributesOverSpeciesAtt constraint of '<em>Shr5 Rule Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5RuleGenerator_hasNoAttributesOverSpeciesAtt(Shr5RuleGenerator<?> shr5RuleGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5RuleGenerator.hasNoAttributesOverSpeciesAtt(diagnostics, context);
    }

    /**
     * Validates the hasNoConstrainVoilation constraint of '<em>Shr5 Rule Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5RuleGenerator_hasNoConstrainVoilation(Shr5RuleGenerator<?> shr5RuleGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5RuleGenerator.hasNoConstrainVoilation(diagnostics, context);
    }

    /**
     * Validates the hasLifestyleChoosen constraint of '<em>Shr5 Rule Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5RuleGenerator_hasLifestyleChoosen(Shr5RuleGenerator<?> shr5RuleGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5RuleGenerator.hasLifestyleChoosen(diagnostics, context);
    }

    /**
     * Validates the hasOnlyAllowedSources constraint of '<em>Shr5 Rule Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5RuleGenerator_hasOnlyAllowedSources(Shr5RuleGenerator<?> shr5RuleGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5RuleGenerator.hasOnlyAllowedSources(diagnostics, context);
    }

    /**
     * Validates the hasKiPowerOverLimit constraint of '<em>Shr5 Rule Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5RuleGenerator_hasKiPowerOverLimit(Shr5RuleGenerator<?> shr5RuleGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5RuleGenerator.hasKiPowerOverLimit(diagnostics, context);
    }

    /**
     * Validates the hasBasicViolations constraint of '<em>Shr5 Rule Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5RuleGenerator_hasBasicViolations(Shr5RuleGenerator<?> shr5RuleGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5RuleGenerator.hasBasicViolations(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateShr5KarmaGenerator(Shr5KarmaGenerator shr5KarmaGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(shr5KarmaGenerator, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasSpendAllPoints(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNotMoreMaxAttributes(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoSkillsOverMax(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNotMoreSpecalism(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoAttributesOverSpeciesAtt(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoConstrainVoilation(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasLifestyleChoosen(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasOnlyAllowedSources(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasKiPowerOverLimit(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasBasicViolations(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateKarmaGenerator_hasSpendAllKarmaPoints(shr5KarmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateKarmaGenerator_hasSpendAllResources(shr5KarmaGenerator, diagnostics, context);
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateTrainingRate(TrainingRate trainingRate, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(trainingRate, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRangeTableEntry(RangeTableEntry rangeTableEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(rangeTableEntry, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRangeTable(RangeTable<?> rangeTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(rangeTable, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateQuellenConstrain(QuellenConstrain quellenConstrain, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(quellenConstrain, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validatePack(Pack pack, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(pack, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCharacterDiary(CharacterDiary characterDiary, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(characterDiary, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDiaryEntry(DiaryEntry diaryEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(diaryEntry, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateContractPayment(ContractPayment contractPayment, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(contractPayment, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateCharacterChange(CharacterChange characterChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(characterChange, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSumToTenGenerator(SumToTenGenerator sumToTenGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(sumToTenGenerator, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasSpendAllPoints(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasNotMoreMaxAttributes(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoSkillsOverMax(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNotMoreSpecalism(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoAttributesOverSpeciesAtt(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoConstrainVoilation(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasLifestyleChoosen(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasOnlyAllowedSources(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasKiPowerOverLimit(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasBasicViolations(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasCategoryOnlyOnce(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllAttributesPoints(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllSkillPoints(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllSpecialPoints(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllSpecialTypePoints(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllConnectionPoints(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllResourcePoints(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllMagicSkillsPoints(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllMagicPoints(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllGroupPoints(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllKnowlegeSkillPoints(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllKarmaPoints(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllSpellPoints(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllPowerPoints(sumToTenGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateSumToTenGenerator_hasSumToTen(sumToTenGenerator, diagnostics, context);
        return result;
    }

    /**
     * Validates the hasSumToTen constraint of '<em>Sum To Ten Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSumToTenGenerator_hasSumToTen(SumToTenGenerator sumToTenGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return sumToTenGenerator.hasSumToTen(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLifeModulesGenerator(LifeModulesGenerator lifeModulesGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(lifeModulesGenerator, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasSpendAllPoints(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNotMoreMaxAttributes(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoSkillsOverMax(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNotMoreSpecalism(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoAttributesOverSpeciesAtt(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoConstrainVoilation(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasLifestyleChoosen(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasOnlyAllowedSources(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasKiPowerOverLimit(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasBasicViolations(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateKarmaGenerator_hasSpendAllKarmaPoints(lifeModulesGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateKarmaGenerator_hasSpendAllResources(lifeModulesGenerator, diagnostics, context);
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLifeModulesSystem(LifeModulesSystem lifeModulesSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(lifeModulesSystem, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLifeModule(LifeModule lifeModule, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(lifeModule, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateModuleChange(ModuleChange moduleChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(moduleChange, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateModuleSkillChange(ModuleSkillChange moduleSkillChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(moduleSkillChange, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateModuleTeachableChange(ModuleTeachableChange moduleTeachableChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(moduleTeachableChange, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateModuleAttributeChange(ModuleAttributeChange moduleAttributeChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(moduleAttributeChange, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateModuleFeatureChange(ModuleFeatureChange moduleFeatureChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(moduleFeatureChange, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateModuleSkillGroupChange(ModuleSkillGroupChange moduleSkillGroupChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(moduleSkillGroupChange, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateModuleTypeChange(ModuleTypeChange<?> moduleTypeChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(moduleTypeChange, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateKarmaGenerator(KarmaGenerator<?> karmaGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(karmaGenerator, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasSpendAllPoints(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNotMoreMaxAttributes(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoSkillsOverMax(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNotMoreSpecalism(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoAttributesOverSpeciesAtt(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasNoConstrainVoilation(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasLifestyleChoosen(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasOnlyAllowedSources(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasKiPowerOverLimit(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5RuleGenerator_hasBasicViolations(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateKarmaGenerator_hasSpendAllKarmaPoints(karmaGenerator, diagnostics, context);
        if (result || diagnostics != null) result &= validateKarmaGenerator_hasSpendAllResources(karmaGenerator, diagnostics, context);
        return result;
    }

    /**
     * Validates the hasSpendAllKarmaPoints constraint of '<em>Karma Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateKarmaGenerator_hasSpendAllKarmaPoints(KarmaGenerator<?> karmaGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return karmaGenerator.hasSpendAllKarmaPoints(diagnostics, context);
    }

    /**
     * Validates the hasSpendAllResources constraint of '<em>Karma Generator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateKarmaGenerator_hasSpendAllResources(KarmaGenerator<?> karmaGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return karmaGenerator.hasSpendAllResources(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateGeneratorState(GeneratorState generatorState, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateSex(Sex sex, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateQuellenConstrainType(QuellenConstrainType quellenConstrainType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLifeModuleType(LifeModuleType lifeModuleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return true;
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ResourceLocator getResourceLocator() {
        return ModelPlugin.INSTANCE;
    }

} //Shr5managementValidator
