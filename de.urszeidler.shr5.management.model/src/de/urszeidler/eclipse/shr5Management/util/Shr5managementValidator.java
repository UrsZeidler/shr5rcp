/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.util;

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
import de.urszeidler.eclipse.shr5Management.ModelPlugin;
import de.urszeidler.eclipse.shr5Management.Mudan;
import de.urszeidler.eclipse.shr5Management.NonPlayerCharacter;
import de.urszeidler.eclipse.shr5Management.PersonaValueChange;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.PriorityCategorie;
import de.urszeidler.eclipse.shr5Management.PrioritySystem;
import de.urszeidler.eclipse.shr5Management.QuallityChange;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Sex;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.Skill;
import de.urszeidler.eclipse.shr5Management.SpecialType;
import de.urszeidler.eclipse.shr5Management.Spellcaster;
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
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_POINTS = 2;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Not More Max Attributes' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final int SHR5_GENERATOR__HAS_NOT_MORE_MAX_ATTRIBUTES = 3;

	/**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Attributes Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_ATTRIBUTES_POINTS = 4;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Skill Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_SKILL_POINTS = 5;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Special Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_SPECIAL_POINTS = 6;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Special Type Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_SPECIAL_TYPE_POINTS = 7;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Connection Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_CONNECTION_POINTS = 8;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Resource Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_RESOURCE_POINTS = 9;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Magic Skills Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_MAGIC_SKILLS_POINTS = 10;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Magic Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_MAGIC_POINTS = 11;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Group Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_GROUP_POINTS = 12;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Knowlege Skill Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_KNOWLEGE_SKILL_POINTS = 13;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Karma Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_KARMA_POINTS = 14;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Spell Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_SPELL_POINTS = 15;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Spend All Power Points' of 'Shr5 Generator'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int SHR5_GENERATOR__HAS_SPEND_ALL_POWER_POINTS = 16;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 16;

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
                return validateCharacterGenerator((CharacterGenerator)value, diagnostics, context);
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
            case Shr5managementPackage.FERTIGKEIT_CHANGE:
                return validateFertigkeitChange((FertigkeitChange)value, diagnostics, context);
            case Shr5managementPackage.PERSONA_VALUE_CHANGE:
                return validatePersonaValueChange((PersonaValueChange)value, diagnostics, context);
            case Shr5managementPackage.GENERATOR_STATE_TO_ESTRING_MAP_ENTRY:
                return validateGeneratorStateToEStringMapEntry((Map.Entry<?, ?>)value, diagnostics, context);
            case Shr5managementPackage.ADVANCEMENT:
                return validateAdvancement((Advancement)value, diagnostics, context);
            case Shr5managementPackage.INCREASE_CHARACTER_PART:
                return validateIncreaseCharacterPart((IncreaseCharacterPart)value, diagnostics, context);
            case Shr5managementPackage.CHANGE_QUALLITY:
                return validateChangeQuallity((ChangeQuallity)value, diagnostics, context);
            case Shr5managementPackage.QUALLITY_CHANGE:
                return validateQuallityChange((QuallityChange)value, diagnostics, context);
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY:
                return validateLifestyleToStartMoney((LifestyleToStartMoney)value, diagnostics, context);
            case Shr5managementPackage.GENERATOR_STATE:
                return validateGeneratorState((GeneratorState)value, diagnostics, context);
            case Shr5managementPackage.SEX:
                return validateSex((Sex)value, diagnostics, context);
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
	public boolean validateCharacterGenerator(CharacterGenerator characterGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
        if (result || diagnostics != null) result &= validateShr5Generator_hasCategoryOnlyOnce(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasSpendAllPoints(shr5Generator, diagnostics, context);
        if (result || diagnostics != null) result &= validateShr5Generator_hasNotMoreMaxAttributes(shr5Generator, diagnostics, context);
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
     * Validates the hasSpendAllPoints constraint of '<em>Shr5 Generator</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateShr5Generator_hasSpendAllPoints(Shr5Generator shr5Generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return shr5Generator.hasSpendAllPoints(diagnostics, context);
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
	public boolean validateFertigkeitChange(FertigkeitChange fertigkeitChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(fertigkeitChange, diagnostics, context);
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
	public boolean validateChangeQuallity(ChangeQuallity changeQuallity, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(changeQuallity, diagnostics, context);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean validateQuallityChange(QuallityChange quallityChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(quallityChange, diagnostics, context);
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
