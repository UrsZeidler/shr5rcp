/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5Management.*;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import de.urszeidler.eclipse.shr5Management.Adept;
import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.Attributes;
import de.urszeidler.eclipse.shr5Management.CharacterAdvancementSystem;
import de.urszeidler.eclipse.shr5Management.CharacterGroup;
import de.urszeidler.eclipse.shr5Management.Connection;
import de.urszeidler.eclipse.shr5Management.FreeStyle;
import de.urszeidler.eclipse.shr5Management.FreeStyleGenerator;
import de.urszeidler.eclipse.shr5Management.GamemasterManagement;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.GruntGroup;
import de.urszeidler.eclipse.shr5Management.GruntMembers;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.KarmaGaint;
import de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney;
import de.urszeidler.eclipse.shr5Management.MetaType;
import de.urszeidler.eclipse.shr5Management.Mudan;
import de.urszeidler.eclipse.shr5Management.NonPlayerCharacter;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.PlayerManagement;
import de.urszeidler.eclipse.shr5Management.QuellenConstrain;
import de.urszeidler.eclipse.shr5Management.QuellenConstrainType;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Sex;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.Skill;
import de.urszeidler.eclipse.shr5Management.Spellcaster;
import de.urszeidler.eclipse.shr5Management.Technomancer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Shr5managementFactoryImpl extends EFactoryImpl implements Shr5managementFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static Shr5managementFactory init() {
        try {
            Shr5managementFactory theShr5managementFactory = (Shr5managementFactory)EPackage.Registry.INSTANCE.getEFactory(Shr5managementPackage.eNS_URI);
            if (theShr5managementFactory != null) {
                return theShr5managementFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new Shr5managementFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shr5managementFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case Shr5managementPackage.NON_PLAYER_CHARACTER: return createNonPlayerCharacter();
            case Shr5managementPackage.KARMA_GAINT: return createKarmaGaint();
            case Shr5managementPackage.FREE_STYLE: return createFreeStyle();
            case Shr5managementPackage.SHR5_SYSTEM: return createShr5System();
            case Shr5managementPackage.META_TYPE: return createMetaType();
            case Shr5managementPackage.ATTRIBUTES: return createAttributes();
            case Shr5managementPackage.SKILL: return createSkill();
            case Shr5managementPackage.RESOURCEN: return createResourcen();
            case Shr5managementPackage.TECHNOMANCER: return createTechnomancer();
            case Shr5managementPackage.SPELLCASTER: return createSpellcaster();
            case Shr5managementPackage.ADEPT: return createAdept();
            case Shr5managementPackage.FREE_STYLE_GENERATOR: return createFreeStyleGenerator();
            case Shr5managementPackage.SHR5_GENERATOR: return createShr5Generator();
            case Shr5managementPackage.ATTRIBUTE_CHANGE: return createAttributeChange();
            case Shr5managementPackage.PLAYER_CHARACTER: return createPlayerCharacter();
            case Shr5managementPackage.MUDAN: return createMudan();
            case Shr5managementPackage.CHARACTER_GROUP: return createCharacterGroup();
            case Shr5managementPackage.CONNECTION: return createConnection();
            case Shr5managementPackage.PERSONA_CHANGE: return createPersonaChange();
            case Shr5managementPackage.GENERATOR_STATE_TO_ESTRING_MAP_ENTRY: return (EObject)createGeneratorStateToEStringMapEntry();
            case Shr5managementPackage.INCREASE_CHARACTER_PART: return createIncreaseCharacterPart();
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY: return createLifestyleToStartMoney();
            case Shr5managementPackage.GRUNT_GROUP: return createGruntGroup();
            case Shr5managementPackage.GRUNT_MEMBERS: return createGruntMembers();
            case Shr5managementPackage.PLAYER_MANAGEMENT: return createPlayerManagement();
            case Shr5managementPackage.GAMEMASTER_MANAGEMENT: return createGamemasterManagement();
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM: return createCharacterAdvancementSystem();
            case Shr5managementPackage.SHR5_KARMA_GENERATOR: return createShr5KarmaGenerator();
            case Shr5managementPackage.QUELLEN_CONSTRAIN: return createQuellenConstrain();
            case Shr5managementPackage.PACK: return createPack();
            case Shr5managementPackage.CHARACTER_DIARY: return createCharacterDiary();
            case Shr5managementPackage.DIARY_ENTRY: return createDiaryEntry();
            case Shr5managementPackage.CONTRACT_PAYMENT: return createContractPayment();
            case Shr5managementPackage.CHARACTER_CHANGE: return createCharacterChange();
            case Shr5managementPackage.SUM_TO_TEN_GENERATOR: return createSumToTenGenerator();
            case Shr5managementPackage.LIFE_MODULES_GENERATOR: return createLifeModulesGenerator();
            case Shr5managementPackage.LIFE_MODULES_SYSTEM: return createLifeModulesSystem();
            case Shr5managementPackage.LIFE_MODULE: return createLifeModule();
            case Shr5managementPackage.MODULE_SKILL_CHANGE: return createModuleSkillChange();
            case Shr5managementPackage.MODULE_TEACHABLE_CHANGE: return createModuleTeachableChange();
            case Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE: return createModuleAttributeChange();
            case Shr5managementPackage.MODULE_FEATURE_CHANGE: return createModuleFeatureChange();
            case Shr5managementPackage.MODULE_SKILL_GROUP_CHANGE: return createModuleSkillGroupChange();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case Shr5managementPackage.GENERATOR_STATE:
                return createGeneratorStateFromString(eDataType, initialValue);
            case Shr5managementPackage.SEX:
                return createSexFromString(eDataType, initialValue);
            case Shr5managementPackage.QUELLEN_CONSTRAIN_TYPE:
                return createQuellenConstrainTypeFromString(eDataType, initialValue);
            case Shr5managementPackage.LIFE_MODULE_TYPE:
                return createLifeModuleTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case Shr5managementPackage.GENERATOR_STATE:
                return convertGeneratorStateToString(eDataType, instanceValue);
            case Shr5managementPackage.SEX:
                return convertSexToString(eDataType, instanceValue);
            case Shr5managementPackage.QUELLEN_CONSTRAIN_TYPE:
                return convertQuellenConstrainTypeToString(eDataType, instanceValue);
            case Shr5managementPackage.LIFE_MODULE_TYPE:
                return convertLifeModuleTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NonPlayerCharacter createNonPlayerCharacter() {
        NonPlayerCharacterImpl nonPlayerCharacter = new NonPlayerCharacterImpl();
        return nonPlayerCharacter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public KarmaGaint createKarmaGaint() {
        KarmaGaintImpl karmaGaint = new KarmaGaintImpl();
        return karmaGaint;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FreeStyle createFreeStyle() {
        FreeStyleImpl freeStyle = new FreeStyleImpl();
        return freeStyle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shr5System createShr5System() {
        Shr5SystemImpl shr5System = new Shr5SystemImpl();
        return shr5System;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MetaType createMetaType() {
        MetaTypeImpl metaType = new MetaTypeImpl();
        return metaType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Attributes createAttributes() {
        AttributesImpl attributes = new AttributesImpl();
        return attributes;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Skill createSkill() {
        SkillImpl skill = new SkillImpl();
        return skill;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Resourcen createResourcen() {
        ResourcenImpl resourcen = new ResourcenImpl();
        return resourcen;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Technomancer createTechnomancer() {
        TechnomancerImpl technomancer = new TechnomancerImpl();
        return technomancer;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Spellcaster createSpellcaster() {
        SpellcasterImpl spellcaster = new SpellcasterImpl();
        return spellcaster;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Adept createAdept() {
        AdeptImpl adept = new AdeptImpl();
        return adept;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FreeStyleGenerator createFreeStyleGenerator() {
        FreeStyleGeneratorImpl freeStyleGenerator = new FreeStyleGeneratorImpl();
        return freeStyleGenerator;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shr5Generator createShr5Generator() {
        Shr5GeneratorImpl shr5Generator = new Shr5GeneratorImpl();
        return shr5Generator;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AttributeChange createAttributeChange() {
        AttributeChangeImpl attributeChange = new AttributeChangeImpl();
        return attributeChange;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PlayerCharacter createPlayerCharacter() {
        PlayerCharacterImpl playerCharacter = new PlayerCharacterImpl();
        return playerCharacter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Mudan createMudan() {
        MudanImpl mudan = new MudanImpl();
        return mudan;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CharacterGroup createCharacterGroup() {
        CharacterGroupImpl characterGroup = new CharacterGroupImpl();
        return characterGroup;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Connection createConnection() {
        ConnectionImpl connection = new ConnectionImpl();
        return connection;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PersonaChange createPersonaChange() {
        PersonaChangeImpl personaChange = new PersonaChangeImpl();
        return personaChange;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Map.Entry<GeneratorState, String> createGeneratorStateToEStringMapEntry() {
        GeneratorStateToEStringMapEntryImpl generatorStateToEStringMapEntry = new GeneratorStateToEStringMapEntryImpl();
        return generatorStateToEStringMapEntry;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public IncreaseCharacterPart createIncreaseCharacterPart() {
        IncreaseCharacterPartImpl increaseCharacterPart = new IncreaseCharacterPartImpl();
        return increaseCharacterPart;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LifestyleToStartMoney createLifestyleToStartMoney() {
        LifestyleToStartMoneyImpl lifestyleToStartMoney = new LifestyleToStartMoneyImpl();
        return lifestyleToStartMoney;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GruntGroup createGruntGroup() {
        GruntGroupImpl gruntGroup = new GruntGroupImpl();
        return gruntGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GruntMembers createGruntMembers() {
        GruntMembersImpl gruntMembers = new GruntMembersImpl();
        return gruntMembers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PlayerManagement createPlayerManagement() {
        PlayerManagementImpl playerManagement = new PlayerManagementImpl();
        return playerManagement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GamemasterManagement createGamemasterManagement() {
        GamemasterManagementImpl gamemasterManagement = new GamemasterManagementImpl();
        return gamemasterManagement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CharacterAdvancementSystem createCharacterAdvancementSystem() {
        CharacterAdvancementSystemImpl characterAdvancementSystem = new CharacterAdvancementSystemImpl();
        return characterAdvancementSystem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Shr5KarmaGenerator createShr5KarmaGenerator() {
        Shr5KarmaGeneratorImpl shr5KarmaGenerator = new Shr5KarmaGeneratorImpl();
        return shr5KarmaGenerator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuellenConstrain createQuellenConstrain() {
        QuellenConstrainImpl quellenConstrain = new QuellenConstrainImpl();
        return quellenConstrain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Pack createPack() {
        PackImpl pack = new PackImpl();
        return pack;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CharacterDiary createCharacterDiary() {
        CharacterDiaryImpl characterDiary = new CharacterDiaryImpl();
        return characterDiary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiaryEntry createDiaryEntry() {
        DiaryEntryImpl diaryEntry = new DiaryEntryImpl();
        return diaryEntry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ContractPayment createContractPayment() {
        ContractPaymentImpl contractPayment = new ContractPaymentImpl();
        return contractPayment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CharacterChange createCharacterChange() {
        CharacterChangeImpl characterChange = new CharacterChangeImpl();
        return characterChange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SumToTenGenerator createSumToTenGenerator() {
        SumToTenGeneratorImpl sumToTenGenerator = new SumToTenGeneratorImpl();
        return sumToTenGenerator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LifeModulesGenerator createLifeModulesGenerator() {
        LifeModulesGeneratorImpl lifeModulesGenerator = new LifeModulesGeneratorImpl();
        return lifeModulesGenerator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LifeModulesSystem createLifeModulesSystem() {
        LifeModulesSystemImpl lifeModulesSystem = new LifeModulesSystemImpl();
        return lifeModulesSystem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LifeModule createLifeModule() {
        LifeModuleImpl lifeModule = new LifeModuleImpl();
        return lifeModule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModuleSkillChange createModuleSkillChange() {
        ModuleSkillChangeImpl moduleSkillChange = new ModuleSkillChangeImpl();
        return moduleSkillChange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModuleTeachableChange createModuleTeachableChange() {
        ModuleTeachableChangeImpl moduleTeachableChange = new ModuleTeachableChangeImpl();
        return moduleTeachableChange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModuleAttributeChange createModuleAttributeChange() {
        ModuleAttributeChangeImpl moduleAttributeChange = new ModuleAttributeChangeImpl();
        return moduleAttributeChange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModuleFeatureChange createModuleFeatureChange() {
        ModuleFeatureChangeImpl moduleFeatureChange = new ModuleFeatureChangeImpl();
        return moduleFeatureChange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModuleSkillGroupChange createModuleSkillGroupChange() {
        ModuleSkillGroupChangeImpl moduleSkillGroupChange = new ModuleSkillGroupChangeImpl();
        return moduleSkillGroupChange;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public GeneratorState createGeneratorStateFromString(EDataType eDataType, String initialValue) {
        GeneratorState result = GeneratorState.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertGeneratorStateToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Sex createSexFromString(EDataType eDataType, String initialValue) {
        Sex result = Sex.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertSexToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuellenConstrainType createQuellenConstrainTypeFromString(EDataType eDataType, String initialValue) {
        QuellenConstrainType result = QuellenConstrainType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertQuellenConstrainTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LifeModuleType createLifeModuleTypeFromString(EDataType eDataType, String initialValue) {
        LifeModuleType result = LifeModuleType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLifeModuleTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shr5managementPackage getShr5managementPackage() {
        return (Shr5managementPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static Shr5managementPackage getPackage() {
        return Shr5managementPackage.eINSTANCE;
    }

} //Shr5managementFactoryImpl
