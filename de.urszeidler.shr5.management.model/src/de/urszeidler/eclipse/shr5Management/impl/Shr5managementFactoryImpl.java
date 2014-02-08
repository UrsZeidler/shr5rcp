/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

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
import de.urszeidler.eclipse.shr5Management.ChangeQuallity;
import de.urszeidler.eclipse.shr5Management.CharacterGroup;
import de.urszeidler.eclipse.shr5Management.Connection;
import de.urszeidler.eclipse.shr5Management.FreeStyle;
import de.urszeidler.eclipse.shr5Management.FreeStyleGenerator;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.KarmaGaint;
import de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney;
import de.urszeidler.eclipse.shr5Management.MetaType;
import de.urszeidler.eclipse.shr5Management.Mudan;
import de.urszeidler.eclipse.shr5Management.NonPlayerCharacter;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Sex;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
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
            case Shr5managementPackage.CHANGE_QUALLITY: return createChangeQuallity();
            case Shr5managementPackage.LIFESTYLE_TO_START_MONEY: return createLifestyleToStartMoney();
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
	public ChangeQuallity createChangeQuallity() {
        ChangeQuallityImpl changeQuallity = new ChangeQuallityImpl();
        return changeQuallity;
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
