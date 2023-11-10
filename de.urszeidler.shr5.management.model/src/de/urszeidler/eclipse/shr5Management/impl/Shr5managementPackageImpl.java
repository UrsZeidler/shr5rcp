/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.urszeidler.eclipse.shr5.Shr5Package;
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
import de.urszeidler.eclipse.shr5Management.PersonaMartialArtChange;
import de.urszeidler.eclipse.shr5Management.PersonaValueChange;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.PlayerManagement;
import de.urszeidler.eclipse.shr5Management.PriorityCategorie;
import de.urszeidler.eclipse.shr5Management.PrioritySystem;
import de.urszeidler.eclipse.shr5Management.QuellenConstrain;
import de.urszeidler.eclipse.shr5Management.QuellenConstrainType;
import de.urszeidler.eclipse.shr5Management.RangeTable;
import de.urszeidler.eclipse.shr5Management.RangeTableEntry;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Sex;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.Skill;
import de.urszeidler.eclipse.shr5Management.SpecialType;
import de.urszeidler.eclipse.shr5Management.Spellcaster;
import de.urszeidler.eclipse.shr5Management.SumToTenGenerator;
import de.urszeidler.eclipse.shr5Management.Technomancer;
import de.urszeidler.eclipse.shr5Management.TrainingRange;
import de.urszeidler.eclipse.shr5Management.TrainingRate;
import de.urszeidler.eclipse.shr5Management.TrainingsTime;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Shr5managementPackageImpl extends EPackageImpl implements Shr5managementPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass managedCharacterEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass characterGeneratorSystemEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass prioritySystemEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass nonPlayerCharacterEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass changesEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass karmaGaintEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass freeStyleEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass priorityCategorieEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass shr5SystemEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass metaTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass attributesEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass skillEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass resourcenEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass specialTypeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass technomancerEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass spellcasterEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass adeptEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass characterGeneratorEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass freeStyleGeneratorEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass shr5GeneratorEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass attributeChangeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass playerCharacterEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mudanEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass characterGroupEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass connectionEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass personaChangeEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass personaValueChangeEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass generatorStateToEStringMapEntryEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass advancementEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass increaseCharacterPartEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lifestyleToStartMoneyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gruntGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gruntMembersEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass playerManagementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gamemasterManagementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass characterAdvancementSystemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass shr5RuleGeneratorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass shr5KarmaGeneratorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass trainingRateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rangeTableEntryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rangeTableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass trainingsTimeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass personaMartialArtChangeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass trainingRangeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass quellenConstrainEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass packEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass characterDiaryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass diaryEntryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contractPaymentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass characterChangeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sumToTenGeneratorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lifeModulesGeneratorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lifeModulesSystemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lifeModuleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleChangeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleSkillChangeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleTeachableChangeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleAttributeChangeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleFeatureChangeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleSkillGroupChangeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass moduleTypeChangeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass karmaGeneratorEClass = null;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum generatorStateEEnum = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EEnum sexEEnum = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum quellenConstrainTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum lifeModuleTypeEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private Shr5managementPackageImpl() {
        super(eNS_URI, Shr5managementFactory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link Shr5managementPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static Shr5managementPackage init() {
        if (isInited) return (Shr5managementPackage)EPackage.Registry.INSTANCE.getEPackage(Shr5managementPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredShr5managementPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        Shr5managementPackageImpl theShr5managementPackage = registeredShr5managementPackage instanceof Shr5managementPackageImpl ? (Shr5managementPackageImpl)registeredShr5managementPackage : new Shr5managementPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        Shr5Package.eINSTANCE.eClass();

        // Create package meta-data objects
        theShr5managementPackage.createPackageContents();

        // Initialize created meta-data
        theShr5managementPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theShr5managementPackage,
             new EValidator.Descriptor() {
                 @Override
                 public EValidator getEValidator() {
                     return Shr5managementValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theShr5managementPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(Shr5managementPackage.eNS_URI, theShr5managementPackage);
        return theShr5managementPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getManagedCharacter() {
        return managedCharacterEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getManagedCharacter_Persona() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getManagedCharacter_Changes() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getManagedCharacter_ChracterSource() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getManagedCharacter_Inventar() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getManagedCharacter_Contracts() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getManagedCharacter_Sex() {
        return (EAttribute)managedCharacterEClass.getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getManagedCharacter_Connections() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getManagedCharacter_Vehicels() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getManagedCharacter_ChoosenLifestyle() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getManagedCharacter_NativeLanguage() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getManagedCharacter_StreetCred() {
        return (EAttribute)managedCharacterEClass.getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getManagedCharacter_Notoriety() {
        return (EAttribute)managedCharacterEClass.getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getManagedCharacter_NotorietyBasic() {
        return (EAttribute)managedCharacterEClass.getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getManagedCharacter_PublicAwareness() {
        return (EAttribute)managedCharacterEClass.getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getManagedCharacter_KarmaGaint() {
        return (EAttribute)managedCharacterEClass.getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getManagedCharacter_CurrentKarma() {
        return (EAttribute)managedCharacterEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getManagedCharacter_GeneratorSrc() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getManagedCharacter_Height() {
        return (EAttribute)managedCharacterEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getManagedCharacter_Dateofbirth() {
        return (EAttribute)managedCharacterEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getManagedCharacter_Weight() {
        return (EAttribute)managedCharacterEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getCharacterGeneratorSystem() {
        return characterGeneratorSystemEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getCharacterGeneratorSystem_Instructions() {
        return (EReference)characterGeneratorSystemEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getCharacterGeneratorSystem_CharacterAdvancements() {
        return (EReference)characterGeneratorSystemEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCharacterGeneratorSystem_AdditionalConstrains() {
        return (EReference)characterGeneratorSystemEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCharacterGeneratorSystem_LifestyleToStartMoney() {
        return (EReference)characterGeneratorSystemEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getPrioritySystem() {
        return prioritySystemEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getPrioritySystem_Priorities() {
        return (EReference)prioritySystemEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getPrioritySystem_KarmaPoints() {
        return (EAttribute)prioritySystemEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getNonPlayerCharacter() {
        return nonPlayerCharacterEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getChanges() {
        return changesEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getChanges_Date() {
        return (EAttribute)changesEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getChanges_KarmaCost() {
        return (EAttribute)changesEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getChanges_Character() {
        return (EReference)changesEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getChanges_ChangeApplied() {
        return (EAttribute)changesEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getChanges_DateApplied() {
        return (EAttribute)changesEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getChanges__ApplyChanges() {
        return changesEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getKarmaGaint() {
        return karmaGaintEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getKarmaGaint_Karma() {
        return (EAttribute)karmaGaintEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getFreeStyle() {
        return freeStyleEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getPriorityCategorie() {
        return priorityCategorieEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getPriorityCategorie_CategorieName() {
        return (EAttribute)priorityCategorieEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPriorityCategorie_Cost() {
        return (EAttribute)priorityCategorieEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getShr5System() {
        return shr5SystemEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getShr5System_KarmaToResourceFactor() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getShr5System_KarmaToMagicFactor() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getShr5System_NumberOfMaxAttributes() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getShr5System_KnowlegeSkillFactor() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getShr5System_CharismaToConnectionFactor() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5System_MaxResourceToKeep() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5System_MaxKarmaToResources() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5System_MaxKarmaToKeep() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5System_SkillMax() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5System_NumberOfSpecalism() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5System_KarmaToConnectionFactor() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5System_BoundSprititServiceCost() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getShr5System_ApplicableGenerators() {
        return (EReference)shr5SystemEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5System_MaxConnectionRating() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5System_FreeMartialArtTechniques() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5System_MaxMartialArtStyles() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5System_SumToTenValue() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getMetaType() {
        return metaTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getMetaType_ChoosableTypes() {
        return (EReference)metaTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getMetaType_SpecialPoints() {
        return (EAttribute)metaTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EOperation getMetaType__CalcSpecialPointsSpend__ManagedCharacter() {
        return metaTypeEClass.getEOperations().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getAttributes() {
        return attributesEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getAttributes_AttibutePoints() {
        return (EAttribute)attributesEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EOperation getAttributes__CalcAttributesSpend__ManagedCharacter() {
        return attributesEClass.getEOperations().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getSkill() {
        return skillEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getSkill_SkillPoints() {
        return (EAttribute)skillEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getSkill_GroupPoints() {
        return (EAttribute)skillEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EOperation getSkill__CalcSkillSpend__ManagedCharacter() {
        return skillEClass.getEOperations().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EOperation getSkill__CalcGroupSpend__ManagedCharacter() {
        return skillEClass.getEOperations().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EOperation getSkill__CalcKnowledgeSkillSpend__ManagedCharacter() {
        return skillEClass.getEOperations().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EOperation getSkill__CalcKnowledgeSkillPoints__ManagedCharacter() {
        return skillEClass.getEOperations().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getResourcen() {
        return resourcenEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getResourcen_Resource() {
        return (EAttribute)resourcenEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EOperation getResourcen__CalcResourceSpend__ManagedCharacter() {
        return resourcenEClass.getEOperations().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getSpecialType() {
        return specialTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getSpecialType_SelectableTypes() {
        return (EReference)specialTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getSpecialType_SkillValue() {
        return (EAttribute)specialTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getSpecialType_SkillNumber() {
        return (EAttribute)specialTypeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getSpecialType_SelectableSkills() {
        return (EReference)specialTypeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getSpecialType_SelectableSkillGroups() {
        return (EReference)specialTypeEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EOperation getSpecialType__CalcSkillsSpend__ManagedCharacter() {
        return specialTypeEClass.getEOperations().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getTechnomancer() {
        return technomancerEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getTechnomancer_Resonanz() {
        return (EAttribute)technomancerEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getTechnomancer_ComplexForms() {
        return (EAttribute)technomancerEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EOperation getTechnomancer__CalcComplexFormsSpend__ManagedCharacter() {
        return technomancerEClass.getEOperations().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getSpellcaster() {
        return spellcasterEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getSpellcaster_SpellPoints() {
        return (EAttribute)spellcasterEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EOperation getSpellcaster__CalcSpellPointsSpend__ManagedCharacter() {
        return spellcasterEClass.getEOperations().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getAdept() {
        return adeptEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getAdept_Magic() {
        return (EAttribute)adeptEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getAdept__CalcPowerPointsSpend__ManagedCharacter() {
        return adeptEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getCharacterGenerator() {
        return characterGeneratorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getCharacterGenerator_Character() {
        return (EReference)characterGeneratorEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getCharacterGenerator_Generator() {
        return (EReference)characterGeneratorEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getCharacterGenerator_State() {
        return (EAttribute)characterGeneratorEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getCharacterGenerator_SelectedGroup() {
        return (EReference)characterGeneratorEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getCharacterGenerator_CharacterName() {
        return (EAttribute)characterGeneratorEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getCharacterGenerator_CurrentInstruction() {
        return (EAttribute)characterGeneratorEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getFreeStyleGenerator() {
        return freeStyleGeneratorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getFreeStyleGenerator_FreestyleGenerator() {
        return (EReference)freeStyleGeneratorEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFreeStyleGenerator_SelectedPersona() {
        return (EReference)freeStyleGeneratorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFreeStyleGenerator_SelectedSpecies() {
        return (EReference)freeStyleGeneratorEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFreeStyleGenerator_SelectedType() {
        return (EReference)freeStyleGeneratorEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getShr5Generator() {
        return shr5GeneratorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getShr5Generator_Resourcen() {
        return (EReference)shr5GeneratorEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getShr5Generator_Skills() {
        return (EReference)shr5GeneratorEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getShr5Generator_Attribute() {
        return (EReference)shr5GeneratorEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getShr5Generator_MetaType() {
        return (EReference)shr5GeneratorEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getShr5Generator_Magic() {
        return (EReference)shr5GeneratorEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getShr5Generator_KarmaToResource() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getShr5Generator_KarmaSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5Generator_AttributeSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5Generator_ResourceSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5Generator_ConnectionSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5Generator_SkillPointSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5Generator_SpecialPointSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5Generator_GroupPointSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5Generator_KnownlegePointSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5Generator_SpellPointSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5Generator_StartKarma() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getShr5Generator_StartResources() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EOperation getShr5Generator__HasCategoryOnlyOnce__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EOperation getShr5Generator__HasNotMoreMaxAttributes__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5Generator__HasSpendAllAttributesPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5Generator__HasSpendAllSkillPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5Generator__HasSpendAllSpecialPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5Generator__HasSpendAllSpecialTypePoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5Generator__HasSpendAllConnectionPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5Generator__HasSpendAllResourcePoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5Generator__HasSpendAllMagicSkillsPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5Generator__HasSpendAllMagicPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5Generator__HasSpendAllGroupPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5Generator__HasSpendAllKnowlegeSkillPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5Generator__HasSpendAllKarmaPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5Generator__HasSpendAllSpellPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5Generator__HasSpendAllPowerPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(14);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getAttributeChange() {
        return attributeChangeEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAttributeChange_Attibute() {
        return (EReference)attributeChangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getPlayerCharacter() {
        return playerCharacterEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPlayerCharacter_Diary() {
        return (EReference)playerCharacterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPlayerCharacter_Age() {
        return (EAttribute)playerCharacterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getMudan() {
        return mudanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getCharacterGroup() {
        return characterGroupEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getCharacterGroup_Members() {
        return (EReference)characterGroupEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getConnection() {
        return connectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getConnection_Influence() {
        return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getConnection_Loyality() {
        return (EAttribute)connectionEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getConnection_Character() {
        return (EReference)connectionEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPersonaChange() {
        return personaChangeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPersonaChange_Changeable() {
        return (EReference)personaChangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getPersonaValueChange() {
        return personaValueChangeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getPersonaValueChange_From() {
        return (EAttribute)personaValueChangeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getPersonaValueChange_To() {
        return (EAttribute)personaValueChangeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getGeneratorStateToEStringMapEntry() {
        return generatorStateToEStringMapEntryEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getGeneratorStateToEStringMapEntry_Key() {
        return (EAttribute)generatorStateToEStringMapEntryEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getGeneratorStateToEStringMapEntry_Value() {
        return (EAttribute)generatorStateToEStringMapEntryEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getAdvancement() {
        return advancementEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EAttribute getAdvancement_KarmaFactor() {
        return (EAttribute)advancementEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EClass getIncreaseCharacterPart() {
        return increaseCharacterPartEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EReference getIncreaseCharacterPart_Type() {
        return (EReference)increaseCharacterPartEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLifestyleToStartMoney() {
        return lifestyleToStartMoneyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLifestyleToStartMoney_NumberOfW() {
        return (EAttribute)lifestyleToStartMoneyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLifestyleToStartMoney_MoneyFactor() {
        return (EAttribute)lifestyleToStartMoneyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLifestyleToStartMoney_LifeStyles() {
        return (EReference)lifestyleToStartMoneyEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGruntGroup() {
        return gruntGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGruntGroup_Members() {
        return (EReference)gruntGroupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGruntGroup_Leader() {
        return (EReference)gruntGroupEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGruntGroup_ProfessionalRating() {
        return (EAttribute)gruntGroupEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGruntMembers() {
        return gruntMembersEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGruntMembers_Count() {
        return (EAttribute)gruntMembersEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGruntMembers_Nsc() {
        return (EReference)gruntMembersEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPlayerManagement() {
        return playerManagementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPlayerManagement_Groups() {
        return (EReference)playerManagementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPlayerManagement_Generators() {
        return (EReference)playerManagementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPlayerManagement_Entries() {
        return (EReference)playerManagementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGamemasterManagement() {
        return gamemasterManagementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGamemasterManagement_Grunts() {
        return (EReference)gamemasterManagementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCharacterAdvancementSystem() {
        return characterAdvancementSystemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCharacterAdvancementSystem_CharacterAdvancements() {
        return (EReference)characterAdvancementSystemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getShr5RuleGenerator() {
        return shr5RuleGeneratorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getShr5RuleGenerator_AllowedSources() {
        return (EReference)shr5RuleGeneratorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5RuleGenerator__HasSpendAllPoints__DiagnosticChain_Map() {
        return shr5RuleGeneratorEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5RuleGenerator__HasNotMoreMaxAttributes__DiagnosticChain_Map() {
        return shr5RuleGeneratorEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5RuleGenerator__HasNoSkillsOverMax__DiagnosticChain_Map() {
        return shr5RuleGeneratorEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5RuleGenerator__HasNotMoreSpecalism__DiagnosticChain_Map() {
        return shr5RuleGeneratorEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5RuleGenerator__HasNoAttributesOverSpeciesAtt__DiagnosticChain_Map() {
        return shr5RuleGeneratorEClass.getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5RuleGenerator__HasNoConstrainVoilation__DiagnosticChain_Map() {
        return shr5RuleGeneratorEClass.getEOperations().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5RuleGenerator__HasLifestyleChoosen__DiagnosticChain_Map() {
        return shr5RuleGeneratorEClass.getEOperations().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5RuleGenerator__HasOnlyAllowedSources__DiagnosticChain_Map() {
        return shr5RuleGeneratorEClass.getEOperations().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5RuleGenerator__HasKiPowerOverLimit__DiagnosticChain_Map() {
        return shr5RuleGeneratorEClass.getEOperations().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getShr5RuleGenerator__HasBasicViolations__DiagnosticChain_Map() {
        return shr5RuleGeneratorEClass.getEOperations().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getShr5KarmaGenerator() {
        return shr5KarmaGeneratorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTrainingRate() {
        return trainingRateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTrainingRate_Factor() {
        return (EAttribute)trainingRateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTrainingRate_TimeUnit() {
        return (EAttribute)trainingRateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRangeTableEntry() {
        return rangeTableEntryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRangeTableEntry_From() {
        return (EAttribute)rangeTableEntryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRangeTableEntry_To() {
        return (EAttribute)rangeTableEntryEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRangeTable() {
        return rangeTableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRangeTable_RangeTableEntries() {
        return (EReference)rangeTableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTrainingsTime() {
        return trainingsTimeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTrainingsTime_DaysTrained() {
        return (EAttribute)trainingsTimeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTrainingsTime_DaysRemains() {
        return (EAttribute)trainingsTimeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTrainingsTime_TrainingComplete() {
        return (EAttribute)trainingsTimeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTrainingsTime_Training() {
        return (EReference)trainingsTimeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getTrainingsTime__HasValidRange__DiagnosticChain_Map() {
        return trainingsTimeEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPersonaMartialArtChange() {
        return personaMartialArtChangeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPersonaMartialArtChange_Style() {
        return (EReference)personaMartialArtChangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPersonaMartialArtChange_Technique() {
        return (EReference)personaMartialArtChangeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTrainingRange() {
        return trainingRangeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTrainingRange_Start() {
        return (EAttribute)trainingRangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTrainingRange_End() {
        return (EAttribute)trainingRangeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTrainingRange_DaysTrained() {
        return (EAttribute)trainingRangeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTrainingRange_TrainingTime() {
        return (EReference)trainingRangeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getQuellenConstrain() {
        return quellenConstrainEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getQuellenConstrain_Source() {
        return (EReference)quellenConstrainEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getQuellenConstrain_Targets() {
        return (EReference)quellenConstrainEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getQuellenConstrain_ConstrainType() {
        return (EAttribute)quellenConstrainEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPack() {
        return packEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPack_Items() {
        return (EReference)packEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCharacterDiary() {
        return characterDiaryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCharacterDiary_CharacterDate() {
        return (EAttribute)characterDiaryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCharacterDiary_Entries() {
        return (EReference)characterDiaryEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDiaryEntry() {
        return diaryEntryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDiaryEntry_Date() {
        return (EAttribute)diaryEntryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDiaryEntry_Message() {
        return (EAttribute)diaryEntryEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getContractPayment() {
        return contractPaymentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getContractPayment_ContractToPay() {
        return (EReference)contractPaymentEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getContractPayment_Payed() {
        return (EAttribute)contractPaymentEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCharacterChange() {
        return characterChangeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCharacterChange_Change() {
        return (EReference)characterChangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSumToTenGenerator() {
        return sumToTenGeneratorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getSumToTenGenerator__HasSumToTen__DiagnosticChain_Map() {
        return sumToTenGeneratorEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLifeModulesGenerator() {
        return lifeModulesGeneratorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLifeModulesGenerator_Nationality() {
        return (EReference)lifeModulesGeneratorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLifeModulesGenerator_FormativeYears() {
        return (EReference)lifeModulesGeneratorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLifeModulesGenerator_TeenYears() {
        return (EReference)lifeModulesGeneratorEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLifeModulesGenerator_FurtherEducation() {
        return (EReference)lifeModulesGeneratorEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLifeModulesGenerator_RealLife() {
        return (EReference)lifeModulesGeneratorEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLifeModulesGenerator_ModuleKarmaCost() {
        return (EAttribute)lifeModulesGeneratorEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLifeModulesGenerator_StartingAge() {
        return (EAttribute)lifeModulesGeneratorEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLifeModulesSystem() {
        return lifeModulesSystemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLifeModulesSystem_Modules() {
        return (EReference)lifeModulesSystemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLifeModulesSystem_KnowlegeSkillMax() {
        return (EAttribute)lifeModulesSystemEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLifeModule() {
        return lifeModuleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLifeModule_KarmaCost() {
        return (EAttribute)lifeModuleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLifeModule_CharacterChanges() {
        return (EReference)lifeModuleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLifeModule_ModuleType() {
        return (EAttribute)lifeModuleEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLifeModule_Time() {
        return (EAttribute)lifeModuleEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModuleChange() {
        return moduleChangeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModuleSkillChange() {
        return moduleSkillChangeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModuleSkillChange_Skill() {
        return (EReference)moduleSkillChangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModuleTeachableChange() {
        return moduleTeachableChangeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModuleTeachableChange_Teachable() {
        return (EReference)moduleTeachableChangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModuleAttributeChange() {
        return moduleAttributeChangeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModuleAttributeChange_Attribute() {
        return (EReference)moduleAttributeChangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModuleFeatureChange() {
        return moduleFeatureChangeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModuleFeatureChange_Feature() {
        return (EReference)moduleFeatureChangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModuleFeatureChange_Value() {
        return (EReference)moduleFeatureChangeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModuleSkillGroupChange() {
        return moduleSkillGroupChangeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModuleSkillGroupChange_SkillGroup() {
        return (EReference)moduleSkillGroupChangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModuleTypeChange() {
        return moduleTypeChangeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getModuleTypeChange_Grade() {
        return (EAttribute)moduleTypeChangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModuleTypeChange_Selected() {
        return (EReference)moduleTypeChangeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModuleTypeChange_SelectOne() {
        return (EReference)moduleTypeChangeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getKarmaGenerator() {
        return karmaGeneratorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getKarmaGenerator_MetaType() {
        return (EReference)karmaGeneratorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getKarmaGenerator_CharacterConcept() {
        return (EReference)karmaGeneratorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getKarmaGenerator_KarmaToResource() {
        return (EAttribute)karmaGeneratorEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getKarmaGenerator_KarmaSpend() {
        return (EAttribute)karmaGeneratorEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getKarmaGenerator_ResourceSpend() {
        return (EAttribute)karmaGeneratorEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getKarmaGenerator_StartKarma() {
        return (EAttribute)karmaGeneratorEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getKarmaGenerator_StartResources() {
        return (EAttribute)karmaGeneratorEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getKarmaGenerator_ChoiseKarmaCost() {
        return (EAttribute)karmaGeneratorEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getKarmaGenerator__HasSpendAllKarmaPoints__DiagnosticChain_Map() {
        return karmaGeneratorEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getKarmaGenerator__HasSpendAllResources__DiagnosticChain_Map() {
        return karmaGeneratorEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EEnum getGeneratorState() {
        return generatorStateEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EEnum getSex() {
        return sexEEnum;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getQuellenConstrainType() {
        return quellenConstrainTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getLifeModuleType() {
        return lifeModuleTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Shr5managementFactory getShr5managementFactory() {
        return (Shr5managementFactory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isCreated = false;

	/**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        managedCharacterEClass = createEClass(MANAGED_CHARACTER);
        createEReference(managedCharacterEClass, MANAGED_CHARACTER__PERSONA);
        createEReference(managedCharacterEClass, MANAGED_CHARACTER__CHANGES);
        createEReference(managedCharacterEClass, MANAGED_CHARACTER__CHRACTER_SOURCE);
        createEReference(managedCharacterEClass, MANAGED_CHARACTER__INVENTAR);
        createEReference(managedCharacterEClass, MANAGED_CHARACTER__CONTRACTS);
        createEReference(managedCharacterEClass, MANAGED_CHARACTER__CONNECTIONS);
        createEReference(managedCharacterEClass, MANAGED_CHARACTER__VEHICELS);
        createEReference(managedCharacterEClass, MANAGED_CHARACTER__CHOOSEN_LIFESTYLE);
        createEReference(managedCharacterEClass, MANAGED_CHARACTER__NATIVE_LANGUAGE);
        createEAttribute(managedCharacterEClass, MANAGED_CHARACTER__SEX);
        createEAttribute(managedCharacterEClass, MANAGED_CHARACTER__STREET_CRED);
        createEAttribute(managedCharacterEClass, MANAGED_CHARACTER__NOTORIETY);
        createEAttribute(managedCharacterEClass, MANAGED_CHARACTER__NOTORIETY_BASIC);
        createEAttribute(managedCharacterEClass, MANAGED_CHARACTER__PUBLIC_AWARENESS);
        createEAttribute(managedCharacterEClass, MANAGED_CHARACTER__KARMA_GAINT);
        createEAttribute(managedCharacterEClass, MANAGED_CHARACTER__CURRENT_KARMA);
        createEReference(managedCharacterEClass, MANAGED_CHARACTER__GENERATOR_SRC);
        createEAttribute(managedCharacterEClass, MANAGED_CHARACTER__HEIGHT);
        createEAttribute(managedCharacterEClass, MANAGED_CHARACTER__DATEOFBIRTH);
        createEAttribute(managedCharacterEClass, MANAGED_CHARACTER__WEIGHT);

        characterGeneratorSystemEClass = createEClass(CHARACTER_GENERATOR_SYSTEM);
        createEReference(characterGeneratorSystemEClass, CHARACTER_GENERATOR_SYSTEM__INSTRUCTIONS);
        createEReference(characterGeneratorSystemEClass, CHARACTER_GENERATOR_SYSTEM__LIFESTYLE_TO_START_MONEY);
        createEReference(characterGeneratorSystemEClass, CHARACTER_GENERATOR_SYSTEM__CHARACTER_ADVANCEMENTS);
        createEReference(characterGeneratorSystemEClass, CHARACTER_GENERATOR_SYSTEM__ADDITIONAL_CONSTRAINS);

        prioritySystemEClass = createEClass(PRIORITY_SYSTEM);
        createEReference(prioritySystemEClass, PRIORITY_SYSTEM__PRIORITIES);
        createEAttribute(prioritySystemEClass, PRIORITY_SYSTEM__KARMA_POINTS);

        nonPlayerCharacterEClass = createEClass(NON_PLAYER_CHARACTER);

        changesEClass = createEClass(CHANGES);
        createEAttribute(changesEClass, CHANGES__DATE);
        createEAttribute(changesEClass, CHANGES__KARMA_COST);
        createEReference(changesEClass, CHANGES__CHARACTER);
        createEAttribute(changesEClass, CHANGES__CHANGE_APPLIED);
        createEAttribute(changesEClass, CHANGES__DATE_APPLIED);
        createEOperation(changesEClass, CHANGES___APPLY_CHANGES);

        karmaGaintEClass = createEClass(KARMA_GAINT);
        createEAttribute(karmaGaintEClass, KARMA_GAINT__KARMA);

        freeStyleEClass = createEClass(FREE_STYLE);

        priorityCategorieEClass = createEClass(PRIORITY_CATEGORIE);
        createEAttribute(priorityCategorieEClass, PRIORITY_CATEGORIE__CATEGORIE_NAME);
        createEAttribute(priorityCategorieEClass, PRIORITY_CATEGORIE__COST);

        shr5SystemEClass = createEClass(SHR5_SYSTEM);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__KARMA_TO_RESOURCE_FACTOR);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__KARMA_TO_MAGIC_FACTOR);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__NUMBER_OF_MAX_ATTRIBUTES);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__KNOWLEGE_SKILL_FACTOR);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__CHARISMA_TO_CONNECTION_FACTOR);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__MAX_RESOURCE_TO_KEEP);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__MAX_KARMA_TO_RESOURCES);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__MAX_KARMA_TO_KEEP);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__SKILL_MAX);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__NUMBER_OF_SPECALISM);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__KARMA_TO_CONNECTION_FACTOR);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__BOUND_SPRITIT_SERVICE_COST);
        createEReference(shr5SystemEClass, SHR5_SYSTEM__APPLICABLE_GENERATORS);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__MAX_CONNECTION_RATING);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__FREE_MARTIAL_ART_TECHNIQUES);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__MAX_MARTIAL_ART_STYLES);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__SUM_TO_TEN_VALUE);

        metaTypeEClass = createEClass(META_TYPE);
        createEReference(metaTypeEClass, META_TYPE__CHOOSABLE_TYPES);
        createEAttribute(metaTypeEClass, META_TYPE__SPECIAL_POINTS);
        createEOperation(metaTypeEClass, META_TYPE___CALC_SPECIAL_POINTS_SPEND__MANAGEDCHARACTER);

        attributesEClass = createEClass(ATTRIBUTES);
        createEAttribute(attributesEClass, ATTRIBUTES__ATTIBUTE_POINTS);
        createEOperation(attributesEClass, ATTRIBUTES___CALC_ATTRIBUTES_SPEND__MANAGEDCHARACTER);

        skillEClass = createEClass(SKILL);
        createEAttribute(skillEClass, SKILL__SKILL_POINTS);
        createEAttribute(skillEClass, SKILL__GROUP_POINTS);
        createEOperation(skillEClass, SKILL___CALC_SKILL_SPEND__MANAGEDCHARACTER);
        createEOperation(skillEClass, SKILL___CALC_GROUP_SPEND__MANAGEDCHARACTER);
        createEOperation(skillEClass, SKILL___CALC_KNOWLEDGE_SKILL_SPEND__MANAGEDCHARACTER);
        createEOperation(skillEClass, SKILL___CALC_KNOWLEDGE_SKILL_POINTS__MANAGEDCHARACTER);

        resourcenEClass = createEClass(RESOURCEN);
        createEAttribute(resourcenEClass, RESOURCEN__RESOURCE);
        createEOperation(resourcenEClass, RESOURCEN___CALC_RESOURCE_SPEND__MANAGEDCHARACTER);

        specialTypeEClass = createEClass(SPECIAL_TYPE);
        createEReference(specialTypeEClass, SPECIAL_TYPE__SELECTABLE_TYPES);
        createEAttribute(specialTypeEClass, SPECIAL_TYPE__SKILL_VALUE);
        createEAttribute(specialTypeEClass, SPECIAL_TYPE__SKILL_NUMBER);
        createEReference(specialTypeEClass, SPECIAL_TYPE__SELECTABLE_SKILLS);
        createEReference(specialTypeEClass, SPECIAL_TYPE__SELECTABLE_SKILL_GROUPS);
        createEOperation(specialTypeEClass, SPECIAL_TYPE___CALC_SKILLS_SPEND__MANAGEDCHARACTER);

        technomancerEClass = createEClass(TECHNOMANCER);
        createEAttribute(technomancerEClass, TECHNOMANCER__RESONANZ);
        createEAttribute(technomancerEClass, TECHNOMANCER__COMPLEX_FORMS);
        createEOperation(technomancerEClass, TECHNOMANCER___CALC_COMPLEX_FORMS_SPEND__MANAGEDCHARACTER);

        spellcasterEClass = createEClass(SPELLCASTER);
        createEAttribute(spellcasterEClass, SPELLCASTER__SPELL_POINTS);
        createEOperation(spellcasterEClass, SPELLCASTER___CALC_SPELL_POINTS_SPEND__MANAGEDCHARACTER);

        adeptEClass = createEClass(ADEPT);
        createEAttribute(adeptEClass, ADEPT__MAGIC);
        createEOperation(adeptEClass, ADEPT___CALC_POWER_POINTS_SPEND__MANAGEDCHARACTER);

        characterGeneratorEClass = createEClass(CHARACTER_GENERATOR);
        createEReference(characterGeneratorEClass, CHARACTER_GENERATOR__CHARACTER);
        createEReference(characterGeneratorEClass, CHARACTER_GENERATOR__GENERATOR);
        createEAttribute(characterGeneratorEClass, CHARACTER_GENERATOR__STATE);
        createEReference(characterGeneratorEClass, CHARACTER_GENERATOR__SELECTED_GROUP);
        createEAttribute(characterGeneratorEClass, CHARACTER_GENERATOR__CHARACTER_NAME);
        createEAttribute(characterGeneratorEClass, CHARACTER_GENERATOR__CURRENT_INSTRUCTION);

        freeStyleGeneratorEClass = createEClass(FREE_STYLE_GENERATOR);
        createEReference(freeStyleGeneratorEClass, FREE_STYLE_GENERATOR__FREESTYLE_GENERATOR);
        createEReference(freeStyleGeneratorEClass, FREE_STYLE_GENERATOR__SELECTED_PERSONA);
        createEReference(freeStyleGeneratorEClass, FREE_STYLE_GENERATOR__SELECTED_SPECIES);
        createEReference(freeStyleGeneratorEClass, FREE_STYLE_GENERATOR__SELECTED_TYPE);

        shr5GeneratorEClass = createEClass(SHR5_GENERATOR);
        createEReference(shr5GeneratorEClass, SHR5_GENERATOR__RESOURCEN);
        createEReference(shr5GeneratorEClass, SHR5_GENERATOR__SKILLS);
        createEReference(shr5GeneratorEClass, SHR5_GENERATOR__ATTRIBUTE);
        createEReference(shr5GeneratorEClass, SHR5_GENERATOR__META_TYPE);
        createEReference(shr5GeneratorEClass, SHR5_GENERATOR__MAGIC);
        createEAttribute(shr5GeneratorEClass, SHR5_GENERATOR__KARMA_TO_RESOURCE);
        createEAttribute(shr5GeneratorEClass, SHR5_GENERATOR__KARMA_SPEND);
        createEAttribute(shr5GeneratorEClass, SHR5_GENERATOR__ATTRIBUTE_SPEND);
        createEAttribute(shr5GeneratorEClass, SHR5_GENERATOR__RESOURCE_SPEND);
        createEAttribute(shr5GeneratorEClass, SHR5_GENERATOR__CONNECTION_SPEND);
        createEAttribute(shr5GeneratorEClass, SHR5_GENERATOR__SKILL_POINT_SPEND);
        createEAttribute(shr5GeneratorEClass, SHR5_GENERATOR__SPECIAL_POINT_SPEND);
        createEAttribute(shr5GeneratorEClass, SHR5_GENERATOR__GROUP_POINT_SPEND);
        createEAttribute(shr5GeneratorEClass, SHR5_GENERATOR__KNOWNLEGE_POINT_SPEND);
        createEAttribute(shr5GeneratorEClass, SHR5_GENERATOR__SPELL_POINT_SPEND);
        createEAttribute(shr5GeneratorEClass, SHR5_GENERATOR__START_KARMA);
        createEAttribute(shr5GeneratorEClass, SHR5_GENERATOR__START_RESOURCES);
        createEOperation(shr5GeneratorEClass, SHR5_GENERATOR___HAS_CATEGORY_ONLY_ONCE__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5GeneratorEClass, SHR5_GENERATOR___HAS_NOT_MORE_MAX_ATTRIBUTES__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5GeneratorEClass, SHR5_GENERATOR___HAS_SPEND_ALL_ATTRIBUTES_POINTS__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5GeneratorEClass, SHR5_GENERATOR___HAS_SPEND_ALL_SKILL_POINTS__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5GeneratorEClass, SHR5_GENERATOR___HAS_SPEND_ALL_SPECIAL_POINTS__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5GeneratorEClass, SHR5_GENERATOR___HAS_SPEND_ALL_SPECIAL_TYPE_POINTS__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5GeneratorEClass, SHR5_GENERATOR___HAS_SPEND_ALL_CONNECTION_POINTS__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5GeneratorEClass, SHR5_GENERATOR___HAS_SPEND_ALL_RESOURCE_POINTS__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5GeneratorEClass, SHR5_GENERATOR___HAS_SPEND_ALL_MAGIC_SKILLS_POINTS__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5GeneratorEClass, SHR5_GENERATOR___HAS_SPEND_ALL_MAGIC_POINTS__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5GeneratorEClass, SHR5_GENERATOR___HAS_SPEND_ALL_GROUP_POINTS__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5GeneratorEClass, SHR5_GENERATOR___HAS_SPEND_ALL_KNOWLEGE_SKILL_POINTS__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5GeneratorEClass, SHR5_GENERATOR___HAS_SPEND_ALL_KARMA_POINTS__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5GeneratorEClass, SHR5_GENERATOR___HAS_SPEND_ALL_SPELL_POINTS__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5GeneratorEClass, SHR5_GENERATOR___HAS_SPEND_ALL_POWER_POINTS__DIAGNOSTICCHAIN_MAP);

        attributeChangeEClass = createEClass(ATTRIBUTE_CHANGE);
        createEReference(attributeChangeEClass, ATTRIBUTE_CHANGE__ATTIBUTE);

        playerCharacterEClass = createEClass(PLAYER_CHARACTER);
        createEReference(playerCharacterEClass, PLAYER_CHARACTER__DIARY);
        createEAttribute(playerCharacterEClass, PLAYER_CHARACTER__AGE);

        mudanEClass = createEClass(MUDAN);

        characterGroupEClass = createEClass(CHARACTER_GROUP);
        createEReference(characterGroupEClass, CHARACTER_GROUP__MEMBERS);

        connectionEClass = createEClass(CONNECTION);
        createEAttribute(connectionEClass, CONNECTION__INFLUENCE);
        createEAttribute(connectionEClass, CONNECTION__LOYALITY);
        createEReference(connectionEClass, CONNECTION__CHARACTER);

        personaChangeEClass = createEClass(PERSONA_CHANGE);
        createEReference(personaChangeEClass, PERSONA_CHANGE__CHANGEABLE);

        personaValueChangeEClass = createEClass(PERSONA_VALUE_CHANGE);
        createEAttribute(personaValueChangeEClass, PERSONA_VALUE_CHANGE__FROM);
        createEAttribute(personaValueChangeEClass, PERSONA_VALUE_CHANGE__TO);

        generatorStateToEStringMapEntryEClass = createEClass(GENERATOR_STATE_TO_ESTRING_MAP_ENTRY);
        createEAttribute(generatorStateToEStringMapEntryEClass, GENERATOR_STATE_TO_ESTRING_MAP_ENTRY__KEY);
        createEAttribute(generatorStateToEStringMapEntryEClass, GENERATOR_STATE_TO_ESTRING_MAP_ENTRY__VALUE);

        advancementEClass = createEClass(ADVANCEMENT);
        createEAttribute(advancementEClass, ADVANCEMENT__KARMA_FACTOR);

        increaseCharacterPartEClass = createEClass(INCREASE_CHARACTER_PART);
        createEReference(increaseCharacterPartEClass, INCREASE_CHARACTER_PART__TYPE);

        lifestyleToStartMoneyEClass = createEClass(LIFESTYLE_TO_START_MONEY);
        createEAttribute(lifestyleToStartMoneyEClass, LIFESTYLE_TO_START_MONEY__NUMBER_OF_W);
        createEAttribute(lifestyleToStartMoneyEClass, LIFESTYLE_TO_START_MONEY__MONEY_FACTOR);
        createEReference(lifestyleToStartMoneyEClass, LIFESTYLE_TO_START_MONEY__LIFE_STYLES);

        gruntGroupEClass = createEClass(GRUNT_GROUP);
        createEReference(gruntGroupEClass, GRUNT_GROUP__MEMBERS);
        createEReference(gruntGroupEClass, GRUNT_GROUP__LEADER);
        createEAttribute(gruntGroupEClass, GRUNT_GROUP__PROFESSIONAL_RATING);

        gruntMembersEClass = createEClass(GRUNT_MEMBERS);
        createEAttribute(gruntMembersEClass, GRUNT_MEMBERS__COUNT);
        createEReference(gruntMembersEClass, GRUNT_MEMBERS__NSC);

        playerManagementEClass = createEClass(PLAYER_MANAGEMENT);
        createEReference(playerManagementEClass, PLAYER_MANAGEMENT__GROUPS);
        createEReference(playerManagementEClass, PLAYER_MANAGEMENT__GENERATORS);
        createEReference(playerManagementEClass, PLAYER_MANAGEMENT__ENTRIES);

        gamemasterManagementEClass = createEClass(GAMEMASTER_MANAGEMENT);
        createEReference(gamemasterManagementEClass, GAMEMASTER_MANAGEMENT__GRUNTS);

        characterAdvancementSystemEClass = createEClass(CHARACTER_ADVANCEMENT_SYSTEM);
        createEReference(characterAdvancementSystemEClass, CHARACTER_ADVANCEMENT_SYSTEM__CHARACTER_ADVANCEMENTS);

        shr5RuleGeneratorEClass = createEClass(SHR5_RULE_GENERATOR);
        createEReference(shr5RuleGeneratorEClass, SHR5_RULE_GENERATOR__ALLOWED_SOURCES);
        createEOperation(shr5RuleGeneratorEClass, SHR5_RULE_GENERATOR___HAS_SPEND_ALL_POINTS__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5RuleGeneratorEClass, SHR5_RULE_GENERATOR___HAS_NOT_MORE_MAX_ATTRIBUTES__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5RuleGeneratorEClass, SHR5_RULE_GENERATOR___HAS_NO_SKILLS_OVER_MAX__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5RuleGeneratorEClass, SHR5_RULE_GENERATOR___HAS_NOT_MORE_SPECALISM__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5RuleGeneratorEClass, SHR5_RULE_GENERATOR___HAS_NO_ATTRIBUTES_OVER_SPECIES_ATT__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5RuleGeneratorEClass, SHR5_RULE_GENERATOR___HAS_NO_CONSTRAIN_VOILATION__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5RuleGeneratorEClass, SHR5_RULE_GENERATOR___HAS_LIFESTYLE_CHOOSEN__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5RuleGeneratorEClass, SHR5_RULE_GENERATOR___HAS_ONLY_ALLOWED_SOURCES__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5RuleGeneratorEClass, SHR5_RULE_GENERATOR___HAS_KI_POWER_OVER_LIMIT__DIAGNOSTICCHAIN_MAP);
        createEOperation(shr5RuleGeneratorEClass, SHR5_RULE_GENERATOR___HAS_BASIC_VIOLATIONS__DIAGNOSTICCHAIN_MAP);

        karmaGeneratorEClass = createEClass(KARMA_GENERATOR);
        createEReference(karmaGeneratorEClass, KARMA_GENERATOR__META_TYPE);
        createEReference(karmaGeneratorEClass, KARMA_GENERATOR__CHARACTER_CONCEPT);
        createEAttribute(karmaGeneratorEClass, KARMA_GENERATOR__KARMA_TO_RESOURCE);
        createEAttribute(karmaGeneratorEClass, KARMA_GENERATOR__KARMA_SPEND);
        createEAttribute(karmaGeneratorEClass, KARMA_GENERATOR__RESOURCE_SPEND);
        createEAttribute(karmaGeneratorEClass, KARMA_GENERATOR__START_KARMA);
        createEAttribute(karmaGeneratorEClass, KARMA_GENERATOR__START_RESOURCES);
        createEAttribute(karmaGeneratorEClass, KARMA_GENERATOR__CHOISE_KARMA_COST);
        createEOperation(karmaGeneratorEClass, KARMA_GENERATOR___HAS_SPEND_ALL_KARMA_POINTS__DIAGNOSTICCHAIN_MAP);
        createEOperation(karmaGeneratorEClass, KARMA_GENERATOR___HAS_SPEND_ALL_RESOURCES__DIAGNOSTICCHAIN_MAP);

        quellenConstrainEClass = createEClass(QUELLEN_CONSTRAIN);
        createEReference(quellenConstrainEClass, QUELLEN_CONSTRAIN__SOURCE);
        createEReference(quellenConstrainEClass, QUELLEN_CONSTRAIN__TARGETS);
        createEAttribute(quellenConstrainEClass, QUELLEN_CONSTRAIN__CONSTRAIN_TYPE);

        packEClass = createEClass(PACK);
        createEReference(packEClass, PACK__ITEMS);

        characterDiaryEClass = createEClass(CHARACTER_DIARY);
        createEAttribute(characterDiaryEClass, CHARACTER_DIARY__CHARACTER_DATE);
        createEReference(characterDiaryEClass, CHARACTER_DIARY__ENTRIES);

        diaryEntryEClass = createEClass(DIARY_ENTRY);
        createEAttribute(diaryEntryEClass, DIARY_ENTRY__DATE);
        createEAttribute(diaryEntryEClass, DIARY_ENTRY__MESSAGE);

        contractPaymentEClass = createEClass(CONTRACT_PAYMENT);
        createEReference(contractPaymentEClass, CONTRACT_PAYMENT__CONTRACT_TO_PAY);
        createEAttribute(contractPaymentEClass, CONTRACT_PAYMENT__PAYED);

        characterChangeEClass = createEClass(CHARACTER_CHANGE);
        createEReference(characterChangeEClass, CHARACTER_CHANGE__CHANGE);

        sumToTenGeneratorEClass = createEClass(SUM_TO_TEN_GENERATOR);
        createEOperation(sumToTenGeneratorEClass, SUM_TO_TEN_GENERATOR___HAS_SUM_TO_TEN__DIAGNOSTICCHAIN_MAP);

        lifeModulesGeneratorEClass = createEClass(LIFE_MODULES_GENERATOR);
        createEReference(lifeModulesGeneratorEClass, LIFE_MODULES_GENERATOR__NATIONALITY);
        createEReference(lifeModulesGeneratorEClass, LIFE_MODULES_GENERATOR__FORMATIVE_YEARS);
        createEReference(lifeModulesGeneratorEClass, LIFE_MODULES_GENERATOR__TEEN_YEARS);
        createEReference(lifeModulesGeneratorEClass, LIFE_MODULES_GENERATOR__FURTHER_EDUCATION);
        createEReference(lifeModulesGeneratorEClass, LIFE_MODULES_GENERATOR__REAL_LIFE);
        createEAttribute(lifeModulesGeneratorEClass, LIFE_MODULES_GENERATOR__MODULE_KARMA_COST);
        createEAttribute(lifeModulesGeneratorEClass, LIFE_MODULES_GENERATOR__STARTING_AGE);

        lifeModulesSystemEClass = createEClass(LIFE_MODULES_SYSTEM);
        createEReference(lifeModulesSystemEClass, LIFE_MODULES_SYSTEM__MODULES);
        createEAttribute(lifeModulesSystemEClass, LIFE_MODULES_SYSTEM__KNOWLEGE_SKILL_MAX);

        lifeModuleEClass = createEClass(LIFE_MODULE);
        createEAttribute(lifeModuleEClass, LIFE_MODULE__KARMA_COST);
        createEReference(lifeModuleEClass, LIFE_MODULE__CHARACTER_CHANGES);
        createEAttribute(lifeModuleEClass, LIFE_MODULE__MODULE_TYPE);
        createEAttribute(lifeModuleEClass, LIFE_MODULE__TIME);

        moduleChangeEClass = createEClass(MODULE_CHANGE);

        moduleSkillChangeEClass = createEClass(MODULE_SKILL_CHANGE);
        createEReference(moduleSkillChangeEClass, MODULE_SKILL_CHANGE__SKILL);

        moduleTeachableChangeEClass = createEClass(MODULE_TEACHABLE_CHANGE);
        createEReference(moduleTeachableChangeEClass, MODULE_TEACHABLE_CHANGE__TEACHABLE);

        moduleAttributeChangeEClass = createEClass(MODULE_ATTRIBUTE_CHANGE);
        createEReference(moduleAttributeChangeEClass, MODULE_ATTRIBUTE_CHANGE__ATTRIBUTE);

        moduleFeatureChangeEClass = createEClass(MODULE_FEATURE_CHANGE);
        createEReference(moduleFeatureChangeEClass, MODULE_FEATURE_CHANGE__FEATURE);
        createEReference(moduleFeatureChangeEClass, MODULE_FEATURE_CHANGE__VALUE);

        moduleSkillGroupChangeEClass = createEClass(MODULE_SKILL_GROUP_CHANGE);
        createEReference(moduleSkillGroupChangeEClass, MODULE_SKILL_GROUP_CHANGE__SKILL_GROUP);

        moduleTypeChangeEClass = createEClass(MODULE_TYPE_CHANGE);
        createEAttribute(moduleTypeChangeEClass, MODULE_TYPE_CHANGE__GRADE);
        createEReference(moduleTypeChangeEClass, MODULE_TYPE_CHANGE__SELECTED);
        createEReference(moduleTypeChangeEClass, MODULE_TYPE_CHANGE__SELECT_ONE);

        shr5KarmaGeneratorEClass = createEClass(SHR5_KARMA_GENERATOR);

        trainingRateEClass = createEClass(TRAINING_RATE);
        createEAttribute(trainingRateEClass, TRAINING_RATE__FACTOR);
        createEAttribute(trainingRateEClass, TRAINING_RATE__TIME_UNIT);

        rangeTableEntryEClass = createEClass(RANGE_TABLE_ENTRY);
        createEAttribute(rangeTableEntryEClass, RANGE_TABLE_ENTRY__FROM);
        createEAttribute(rangeTableEntryEClass, RANGE_TABLE_ENTRY__TO);

        rangeTableEClass = createEClass(RANGE_TABLE);
        createEReference(rangeTableEClass, RANGE_TABLE__RANGE_TABLE_ENTRIES);

        trainingsTimeEClass = createEClass(TRAININGS_TIME);
        createEAttribute(trainingsTimeEClass, TRAININGS_TIME__DAYS_TRAINED);
        createEAttribute(trainingsTimeEClass, TRAININGS_TIME__DAYS_REMAINS);
        createEAttribute(trainingsTimeEClass, TRAININGS_TIME__TRAINING_COMPLETE);
        createEReference(trainingsTimeEClass, TRAININGS_TIME__TRAINING);
        createEOperation(trainingsTimeEClass, TRAININGS_TIME___HAS_VALID_RANGE__DIAGNOSTICCHAIN_MAP);

        personaMartialArtChangeEClass = createEClass(PERSONA_MARTIAL_ART_CHANGE);
        createEReference(personaMartialArtChangeEClass, PERSONA_MARTIAL_ART_CHANGE__STYLE);
        createEReference(personaMartialArtChangeEClass, PERSONA_MARTIAL_ART_CHANGE__TECHNIQUE);

        trainingRangeEClass = createEClass(TRAINING_RANGE);
        createEAttribute(trainingRangeEClass, TRAINING_RANGE__START);
        createEAttribute(trainingRangeEClass, TRAINING_RANGE__END);
        createEAttribute(trainingRangeEClass, TRAINING_RANGE__DAYS_TRAINED);
        createEReference(trainingRangeEClass, TRAINING_RANGE__TRAINING_TIME);

        // Create enums
        generatorStateEEnum = createEEnum(GENERATOR_STATE);
        sexEEnum = createEEnum(SEX);
        quellenConstrainTypeEEnum = createEEnum(QUELLEN_CONSTRAIN_TYPE);
        lifeModuleTypeEEnum = createEEnum(LIFE_MODULE_TYPE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isInitialized = false;

	/**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        Shr5Package theShr5Package = (Shr5Package)EPackage.Registry.INSTANCE.getEPackage(Shr5Package.eNS_URI);

        // Create type parameters
        ETypeParameter characterGeneratorEClass_G = addETypeParameter(characterGeneratorEClass, "G");
        ETypeParameter shr5RuleGeneratorEClass_G = addETypeParameter(shr5RuleGeneratorEClass, "G");
        ETypeParameter karmaGeneratorEClass_G = addETypeParameter(karmaGeneratorEClass, "G");
        ETypeParameter moduleTypeChangeEClass_T = addETypeParameter(moduleTypeChangeEClass, "T");
        ETypeParameter rangeTableEClass_E = addETypeParameter(rangeTableEClass, "E");

        // Set bounds for type parameters
        EGenericType g1 = createEGenericType(this.getCharacterGeneratorSystem());
        characterGeneratorEClass_G.getEBounds().add(g1);
        g1 = createEGenericType(this.getShr5System());
        shr5RuleGeneratorEClass_G.getEBounds().add(g1);
        g1 = createEGenericType(this.getShr5System());
        karmaGeneratorEClass_G.getEBounds().add(g1);
        g1 = createEGenericType(this.getRangeTableEntry());
        rangeTableEClass_E.getEBounds().add(g1);

        // Add supertypes to classes
        characterGeneratorSystemEClass.getESuperTypes().add(theShr5Package.getBeschreibbar());
        characterGeneratorSystemEClass.getESuperTypes().add(theShr5Package.getQuelle());
        prioritySystemEClass.getESuperTypes().add(this.getCharacterGeneratorSystem());
        nonPlayerCharacterEClass.getESuperTypes().add(this.getManagedCharacter());
        karmaGaintEClass.getESuperTypes().add(this.getChanges());
        freeStyleEClass.getESuperTypes().add(this.getCharacterGeneratorSystem());
        shr5SystemEClass.getESuperTypes().add(this.getPrioritySystem());
        metaTypeEClass.getESuperTypes().add(this.getPriorityCategorie());
        attributesEClass.getESuperTypes().add(this.getPriorityCategorie());
        skillEClass.getESuperTypes().add(this.getPriorityCategorie());
        resourcenEClass.getESuperTypes().add(this.getPriorityCategorie());
        specialTypeEClass.getESuperTypes().add(this.getPriorityCategorie());
        technomancerEClass.getESuperTypes().add(this.getSpecialType());
        spellcasterEClass.getESuperTypes().add(this.getAdept());
        adeptEClass.getESuperTypes().add(this.getSpecialType());
        g1 = createEGenericType(this.getCharacterGenerator());
        EGenericType g2 = createEGenericType(this.getFreeStyle());
        g1.getETypeArguments().add(g2);
        freeStyleGeneratorEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getShr5RuleGenerator());
        g2 = createEGenericType(this.getShr5System());
        g1.getETypeArguments().add(g2);
        shr5GeneratorEClass.getEGenericSuperTypes().add(g1);
        attributeChangeEClass.getESuperTypes().add(this.getPersonaValueChange());
        playerCharacterEClass.getESuperTypes().add(this.getManagedCharacter());
        mudanEClass.getESuperTypes().add(this.getSpecialType());
        characterGroupEClass.getESuperTypes().add(theShr5Package.getBeschreibbar());
        personaChangeEClass.getESuperTypes().add(this.getPersonaValueChange());
        personaValueChangeEClass.getESuperTypes().add(this.getChanges());
        g1 = createEGenericType(this.getAdvancement());
        increaseCharacterPartEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getRangeTable());
        g2 = createEGenericType(this.getTrainingRate());
        g1.getETypeArguments().add(g2);
        increaseCharacterPartEClass.getEGenericSuperTypes().add(g1);
        gruntGroupEClass.getESuperTypes().add(theShr5Package.getBeschreibbar());
        playerManagementEClass.getESuperTypes().add(theShr5Package.getBeschreibbar());
        gamemasterManagementEClass.getESuperTypes().add(this.getPlayerManagement());
        characterAdvancementSystemEClass.getESuperTypes().add(theShr5Package.getBeschreibbar());
        g1 = createEGenericType(this.getCharacterGenerator());
        g2 = createEGenericType(shr5RuleGeneratorEClass_G);
        g1.getETypeArguments().add(g2);
        shr5RuleGeneratorEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getShr5RuleGenerator());
        g2 = createEGenericType(karmaGeneratorEClass_G);
        g1.getETypeArguments().add(g2);
        karmaGeneratorEClass.getEGenericSuperTypes().add(g1);
        packEClass.getESuperTypes().add(theShr5Package.getBeschreibbar());
        packEClass.getESuperTypes().add(theShr5Package.getQuelle());
        packEClass.getESuperTypes().add(theShr5Package.getGeldWert());
        contractPaymentEClass.getESuperTypes().add(this.getDiaryEntry());
        characterChangeEClass.getESuperTypes().add(this.getDiaryEntry());
        sumToTenGeneratorEClass.getESuperTypes().add(this.getShr5Generator());
        g1 = createEGenericType(this.getKarmaGenerator());
        g2 = createEGenericType(this.getLifeModulesSystem());
        g1.getETypeArguments().add(g2);
        lifeModulesGeneratorEClass.getEGenericSuperTypes().add(g1);
        lifeModulesSystemEClass.getESuperTypes().add(this.getShr5System());
        lifeModuleEClass.getESuperTypes().add(theShr5Package.getBeschreibbar());
        lifeModuleEClass.getESuperTypes().add(theShr5Package.getQuelle());
        g1 = createEGenericType(this.getModuleTypeChange());
        g2 = createEGenericType(theShr5Package.getFertigkeit());
        g1.getETypeArguments().add(g2);
        moduleSkillChangeEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getModuleTypeChange());
        g2 = createEGenericType(theShr5Package.getErlernbar());
        g1.getETypeArguments().add(g2);
        moduleTeachableChangeEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getModuleTypeChange());
        g2 = createEGenericType(ecorePackage.getEAttribute());
        g1.getETypeArguments().add(g2);
        moduleAttributeChangeEClass.getEGenericSuperTypes().add(g1);
        moduleFeatureChangeEClass.getESuperTypes().add(this.getModuleChange());
        g1 = createEGenericType(this.getModuleTypeChange());
        g2 = createEGenericType(theShr5Package.getFertigkeitsGruppe());
        g1.getETypeArguments().add(g2);
        moduleSkillGroupChangeEClass.getEGenericSuperTypes().add(g1);
        moduleTypeChangeEClass.getESuperTypes().add(this.getModuleChange());
        g1 = createEGenericType(this.getKarmaGenerator());
        g2 = createEGenericType(this.getShr5System());
        g1.getETypeArguments().add(g2);
        shr5KarmaGeneratorEClass.getEGenericSuperTypes().add(g1);
        trainingRateEClass.getESuperTypes().add(this.getRangeTableEntry());
        trainingsTimeEClass.getESuperTypes().add(this.getCharacterChange());
        personaMartialArtChangeEClass.getESuperTypes().add(this.getPersonaChange());

        // Initialize classes, features, and operations; add parameters
        initEClass(managedCharacterEClass, ManagedCharacter.class, "ManagedCharacter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getManagedCharacter_Persona(), theShr5Package.getAbstraktPersona(), null, "persona", null, 1, 1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getManagedCharacter_Changes(), this.getChanges(), this.getChanges_Character(), "changes", null, 0, -1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        g1 = createEGenericType(this.getCharacterGenerator());
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        initEReference(getManagedCharacter_ChracterSource(), g1, this.getCharacterGenerator_Character(), "chracterSource", null, 1, 1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getManagedCharacter_Inventar(), theShr5Package.getAbstraktGegenstand(), null, "inventar", null, 0, -1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getManagedCharacter_Contracts(), theShr5Package.getVertrag(), null, "contracts", null, 0, -1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getManagedCharacter_Connections(), this.getConnection(), null, "connections", null, 0, -1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getManagedCharacter_Vehicels(), theShr5Package.getFahrzeug(), null, "vehicels", null, 0, -1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getManagedCharacter_ChoosenLifestyle(), theShr5Package.getLifestyle(), null, "choosenLifestyle", null, 1, 1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getManagedCharacter_NativeLanguage(), theShr5Package.getSprachfertigkeit(), null, "nativeLanguage", null, 1, 1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManagedCharacter_Sex(), this.getSex(), "sex", null, 1, 1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManagedCharacter_StreetCred(), ecorePackage.getEInt(), "streetCred", null, 0, 1, ManagedCharacter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManagedCharacter_Notoriety(), ecorePackage.getEInt(), "notoriety", null, 0, 1, ManagedCharacter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManagedCharacter_NotorietyBasic(), ecorePackage.getEInt(), "notorietyBasic", null, 0, 1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManagedCharacter_PublicAwareness(), ecorePackage.getEInt(), "publicAwareness", null, 0, 1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManagedCharacter_KarmaGaint(), ecorePackage.getEInt(), "karmaGaint", null, 0, 1, ManagedCharacter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManagedCharacter_CurrentKarma(), ecorePackage.getEInt(), "currentKarma", null, 0, 1, ManagedCharacter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        g1 = createEGenericType(this.getCharacterGenerator());
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        initEReference(getManagedCharacter_GeneratorSrc(), g1, null, "generatorSrc", null, 0, 1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManagedCharacter_Height(), ecorePackage.getEInt(), "height", null, 0, 1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManagedCharacter_Dateofbirth(), theShr5Package.getShrDate(), "dateofbirth", null, 0, 1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getManagedCharacter_Weight(), ecorePackage.getEInt(), "weight", null, 0, 1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(characterGeneratorSystemEClass, CharacterGeneratorSystem.class, "CharacterGeneratorSystem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCharacterGeneratorSystem_Instructions(), this.getGeneratorStateToEStringMapEntry(), null, "instructions", null, 0, -1, CharacterGeneratorSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCharacterGeneratorSystem_LifestyleToStartMoney(), this.getLifestyleToStartMoney(), null, "lifestyleToStartMoney", null, 0, -1, CharacterGeneratorSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCharacterGeneratorSystem_CharacterAdvancements(), this.getCharacterAdvancementSystem(), null, "characterAdvancements", null, 1, 1, CharacterGeneratorSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCharacterGeneratorSystem_AdditionalConstrains(), this.getQuellenConstrain(), null, "additionalConstrains", null, 0, -1, CharacterGeneratorSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(prioritySystemEClass, PrioritySystem.class, "PrioritySystem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPrioritySystem_Priorities(), this.getPriorityCategorie(), null, "priorities", null, 0, -1, PrioritySystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPrioritySystem_KarmaPoints(), ecorePackage.getEInt(), "karmaPoints", null, 0, 1, PrioritySystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(nonPlayerCharacterEClass, NonPlayerCharacter.class, "NonPlayerCharacter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(changesEClass, Changes.class, "Changes", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getChanges_Date(), theShr5Package.getShrDate(), "date", null, 0, 1, Changes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChanges_KarmaCost(), ecorePackage.getEInt(), "karmaCost", null, 0, 1, Changes.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getChanges_Character(), this.getManagedCharacter(), this.getManagedCharacter_Changes(), "character", null, 0, 1, Changes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChanges_ChangeApplied(), ecorePackage.getEBoolean(), "changeApplied", "false", 0, 1, Changes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChanges_DateApplied(), theShr5Package.getShrDate(), "dateApplied", null, 0, 1, Changes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getChanges__ApplyChanges(), null, "applyChanges", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(karmaGaintEClass, KarmaGaint.class, "KarmaGaint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getKarmaGaint_Karma(), ecorePackage.getEInt(), "karma", null, 1, 1, KarmaGaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(freeStyleEClass, FreeStyle.class, "FreeStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(priorityCategorieEClass, PriorityCategorie.class, "PriorityCategorie", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPriorityCategorie_CategorieName(), ecorePackage.getEString(), "categorieName", null, 0, 1, PriorityCategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPriorityCategorie_Cost(), ecorePackage.getEInt(), "cost", null, 0, 1, PriorityCategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(shr5SystemEClass, Shr5System.class, "Shr5System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getShr5System_KarmaToResourceFactor(), ecorePackage.getEInt(), "karmaToResourceFactor", null, 1, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_KarmaToMagicFactor(), ecorePackage.getEInt(), "karmaToMagicFactor", null, 1, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_NumberOfMaxAttributes(), ecorePackage.getEInt(), "numberOfMaxAttributes", null, 1, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_KnowlegeSkillFactor(), ecorePackage.getEInt(), "knowlegeSkillFactor", null, 1, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_CharismaToConnectionFactor(), ecorePackage.getEInt(), "charismaToConnectionFactor", null, 1, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_MaxResourceToKeep(), ecorePackage.getEInt(), "maxResourceToKeep", null, 1, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_MaxKarmaToResources(), ecorePackage.getEInt(), "maxKarmaToResources", null, 1, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_MaxKarmaToKeep(), ecorePackage.getEInt(), "maxKarmaToKeep", null, 0, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_SkillMax(), ecorePackage.getEInt(), "skillMax", null, 0, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_NumberOfSpecalism(), ecorePackage.getEInt(), "numberOfSpecalism", null, 0, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_KarmaToConnectionFactor(), ecorePackage.getEInt(), "karmaToConnectionFactor", null, 0, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_BoundSprititServiceCost(), ecorePackage.getEInt(), "boundSprititServiceCost", null, 0, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getShr5System_ApplicableGenerators(), ecorePackage.getEClass(), null, "applicableGenerators", null, 0, -1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_MaxConnectionRating(), ecorePackage.getEInt(), "maxConnectionRating", null, 0, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_FreeMartialArtTechniques(), ecorePackage.getEInt(), "freeMartialArtTechniques", null, 0, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_MaxMartialArtStyles(), ecorePackage.getEInt(), "maxMartialArtStyles", null, 0, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_SumToTenValue(), ecorePackage.getEInt(), "sumToTenValue", "10", 0, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(metaTypeEClass, MetaType.class, "MetaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMetaType_ChoosableTypes(), theShr5Package.getSpezies(), null, "choosableTypes", null, 1, 1, MetaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMetaType_SpecialPoints(), ecorePackage.getEInt(), "specialPoints", null, 0, 1, MetaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = initEOperation(getMetaType__CalcSpecialPointsSpend__ManagedCharacter(), ecorePackage.getEInt(), "calcSpecialPointsSpend", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getManagedCharacter(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(attributesEClass, Attributes.class, "Attributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAttributes_AttibutePoints(), ecorePackage.getEInt(), "attibutePoints", null, 1, 1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = initEOperation(getAttributes__CalcAttributesSpend__ManagedCharacter(), ecorePackage.getEInt(), "calcAttributesSpend", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getManagedCharacter(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(skillEClass, Skill.class, "Skill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSkill_SkillPoints(), ecorePackage.getEInt(), "skillPoints", null, 1, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSkill_GroupPoints(), ecorePackage.getEInt(), "groupPoints", null, 1, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = initEOperation(getSkill__CalcSkillSpend__ManagedCharacter(), ecorePackage.getEInt(), "calcSkillSpend", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getManagedCharacter(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getSkill__CalcGroupSpend__ManagedCharacter(), ecorePackage.getEInt(), "calcGroupSpend", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getManagedCharacter(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getSkill__CalcKnowledgeSkillSpend__ManagedCharacter(), ecorePackage.getEInt(), "calcKnowledgeSkillSpend", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getManagedCharacter(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getSkill__CalcKnowledgeSkillPoints__ManagedCharacter(), ecorePackage.getEInt(), "calcKnowledgeSkillPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getManagedCharacter(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(resourcenEClass, Resourcen.class, "Resourcen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getResourcen_Resource(), ecorePackage.getEInt(), "resource", null, 1, 1, Resourcen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = initEOperation(getResourcen__CalcResourceSpend__ManagedCharacter(), ecorePackage.getEInt(), "calcResourceSpend", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getManagedCharacter(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(specialTypeEClass, SpecialType.class, "SpecialType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSpecialType_SelectableTypes(), ecorePackage.getEClass(), null, "selectableTypes", null, 1, 1, SpecialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpecialType_SkillValue(), ecorePackage.getEInt(), "skillValue", null, 0, 1, SpecialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSpecialType_SkillNumber(), ecorePackage.getEInt(), "skillNumber", null, 0, 1, SpecialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSpecialType_SelectableSkills(), theShr5Package.getFertigkeit(), null, "selectableSkills", null, 0, -1, SpecialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSpecialType_SelectableSkillGroups(), theShr5Package.getFertigkeitsGruppe(), null, "selectableSkillGroups", null, 0, -1, SpecialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = initEOperation(getSpecialType__CalcSkillsSpend__ManagedCharacter(), ecorePackage.getEInt(), "calcSkillsSpend", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getManagedCharacter(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(technomancerEClass, Technomancer.class, "Technomancer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTechnomancer_Resonanz(), ecorePackage.getEInt(), "resonanz", null, 0, 1, Technomancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTechnomancer_ComplexForms(), ecorePackage.getEInt(), "complexForms", null, 0, 1, Technomancer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = initEOperation(getTechnomancer__CalcComplexFormsSpend__ManagedCharacter(), ecorePackage.getEInt(), "calcComplexFormsSpend", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getManagedCharacter(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(spellcasterEClass, Spellcaster.class, "Spellcaster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSpellcaster_SpellPoints(), ecorePackage.getEInt(), "spellPoints", null, 0, 1, Spellcaster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = initEOperation(getSpellcaster__CalcSpellPointsSpend__ManagedCharacter(), ecorePackage.getEInt(), "calcSpellPointsSpend", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getManagedCharacter(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(adeptEClass, Adept.class, "Adept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAdept_Magic(), ecorePackage.getEInt(), "magic", null, 0, 1, Adept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = initEOperation(getAdept__CalcPowerPointsSpend__ManagedCharacter(), ecorePackage.getEInt(), "calcPowerPointsSpend", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getManagedCharacter(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(characterGeneratorEClass, CharacterGenerator.class, "CharacterGenerator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCharacterGenerator_Character(), this.getManagedCharacter(), this.getManagedCharacter_ChracterSource(), "character", null, 1, 1, CharacterGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        g1 = createEGenericType(characterGeneratorEClass_G);
        initEReference(getCharacterGenerator_Generator(), g1, null, "generator", null, 1, 1, CharacterGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCharacterGenerator_State(), this.getGeneratorState(), "state", null, 0, 1, CharacterGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCharacterGenerator_SelectedGroup(), this.getCharacterGroup(), null, "selectedGroup", null, 1, 1, CharacterGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCharacterGenerator_CharacterName(), ecorePackage.getEString(), "characterName", null, 1, 1, CharacterGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCharacterGenerator_CurrentInstruction(), ecorePackage.getEString(), "currentInstruction", null, 0, 1, CharacterGenerator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(freeStyleGeneratorEClass, FreeStyleGenerator.class, "FreeStyleGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFreeStyleGenerator_FreestyleGenerator(), this.getFreeStyle(), null, "freestyleGenerator", null, 0, 1, FreeStyleGenerator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getFreeStyleGenerator_SelectedPersona(), theShr5Package.getAbstraktPersona(), null, "selectedPersona", null, 0, 1, FreeStyleGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFreeStyleGenerator_SelectedSpecies(), theShr5Package.getSpezies(), null, "selectedSpecies", null, 0, 1, FreeStyleGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFreeStyleGenerator_SelectedType(), ecorePackage.getEClass(), null, "selectedType", null, 0, 1, FreeStyleGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(shr5GeneratorEClass, Shr5Generator.class, "Shr5Generator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getShr5Generator_Resourcen(), this.getResourcen(), null, "resourcen", null, 1, 1, Shr5Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getShr5Generator_Skills(), this.getSkill(), null, "skills", null, 1, 1, Shr5Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getShr5Generator_Attribute(), this.getAttributes(), null, "attribute", null, 1, 1, Shr5Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getShr5Generator_MetaType(), this.getMetaType(), null, "metaType", null, 1, 1, Shr5Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getShr5Generator_Magic(), this.getSpecialType(), null, "magic", null, 1, 1, Shr5Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_KarmaToResource(), ecorePackage.getEInt(), "karmaToResource", null, 0, 1, Shr5Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_KarmaSpend(), ecorePackage.getEInt(), "karmaSpend", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_AttributeSpend(), ecorePackage.getEInt(), "attributeSpend", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_ResourceSpend(), ecorePackage.getEInt(), "resourceSpend", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_ConnectionSpend(), ecorePackage.getEInt(), "connectionSpend", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_SkillPointSpend(), ecorePackage.getEInt(), "skillPointSpend", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_SpecialPointSpend(), ecorePackage.getEInt(), "specialPointSpend", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_GroupPointSpend(), ecorePackage.getEInt(), "groupPointSpend", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_KnownlegePointSpend(), ecorePackage.getEInt(), "knownlegePointSpend", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_SpellPointSpend(), ecorePackage.getEInt(), "spellPointSpend", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_StartKarma(), ecorePackage.getEInt(), "startKarma", null, 0, 1, Shr5Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_StartResources(), ecorePackage.getEInt(), "startResources", null, 0, 1, Shr5Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = initEOperation(getShr5Generator__HasCategoryOnlyOnce__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasCategoryOnlyOnce", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5Generator__HasNotMoreMaxAttributes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasNotMoreMaxAttributes", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5Generator__HasSpendAllAttributesPoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSpendAllAttributesPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5Generator__HasSpendAllSkillPoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSpendAllSkillPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5Generator__HasSpendAllSpecialPoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSpendAllSpecialPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5Generator__HasSpendAllSpecialTypePoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSpendAllSpecialTypePoints", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5Generator__HasSpendAllConnectionPoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSpendAllConnectionPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5Generator__HasSpendAllResourcePoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSpendAllResourcePoints", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5Generator__HasSpendAllMagicSkillsPoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSpendAllMagicSkillsPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5Generator__HasSpendAllMagicPoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSpendAllMagicPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5Generator__HasSpendAllGroupPoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSpendAllGroupPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5Generator__HasSpendAllKnowlegeSkillPoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSpendAllKnowlegeSkillPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5Generator__HasSpendAllKarmaPoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSpendAllKarmaPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5Generator__HasSpendAllSpellPoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSpendAllSpellPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5Generator__HasSpendAllPowerPoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSpendAllPowerPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(attributeChangeEClass, AttributeChange.class, "AttributeChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAttributeChange_Attibute(), ecorePackage.getEAttribute(), null, "attibute", null, 0, 1, AttributeChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(playerCharacterEClass, PlayerCharacter.class, "PlayerCharacter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPlayerCharacter_Diary(), this.getCharacterDiary(), null, "diary", null, 1, 1, PlayerCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPlayerCharacter_Age(), ecorePackage.getEInt(), "age", null, 0, 1, PlayerCharacter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(mudanEClass, Mudan.class, "Mudan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(characterGroupEClass, CharacterGroup.class, "CharacterGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCharacterGroup_Members(), this.getManagedCharacter(), null, "members", null, 0, -1, CharacterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConnection_Influence(), ecorePackage.getEInt(), "influence", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnection_Loyality(), ecorePackage.getEInt(), "loyality", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConnection_Character(), this.getManagedCharacter(), null, "character", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(personaChangeEClass, PersonaChange.class, "PersonaChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPersonaChange_Changeable(), theShr5Package.getErlernbar(), null, "changeable", null, 1, 1, PersonaChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(personaValueChangeEClass, PersonaValueChange.class, "PersonaValueChange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPersonaValueChange_From(), ecorePackage.getEInt(), "from", null, 1, 1, PersonaValueChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPersonaValueChange_To(), ecorePackage.getEInt(), "to", null, 1, 1, PersonaValueChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(generatorStateToEStringMapEntryEClass, Map.Entry.class, "GeneratorStateToEStringMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGeneratorStateToEStringMapEntry_Key(), this.getGeneratorState(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeneratorStateToEStringMapEntry_Value(), ecorePackage.getEString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(advancementEClass, Advancement.class, "Advancement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAdvancement_KarmaFactor(), ecorePackage.getEInt(), "karmaFactor", null, 1, 1, Advancement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(increaseCharacterPartEClass, IncreaseCharacterPart.class, "IncreaseCharacterPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIncreaseCharacterPart_Type(), ecorePackage.getEClass(), null, "type", null, 1, 1, IncreaseCharacterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(lifestyleToStartMoneyEClass, LifestyleToStartMoney.class, "LifestyleToStartMoney", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLifestyleToStartMoney_NumberOfW(), ecorePackage.getEInt(), "numberOfW", null, 0, 1, LifestyleToStartMoney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLifestyleToStartMoney_MoneyFactor(), ecorePackage.getEInt(), "moneyFactor", null, 0, 1, LifestyleToStartMoney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLifestyleToStartMoney_LifeStyles(), theShr5Package.getLifestyle(), null, "lifeStyles", null, 0, -1, LifestyleToStartMoney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(gruntGroupEClass, GruntGroup.class, "GruntGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGruntGroup_Members(), this.getGruntMembers(), null, "members", null, 0, -1, GruntGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGruntGroup_Leader(), this.getGruntMembers(), null, "leader", null, 1, 1, GruntGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGruntGroup_ProfessionalRating(), ecorePackage.getEInt(), "professionalRating", null, 0, 1, GruntGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(gruntMembersEClass, GruntMembers.class, "GruntMembers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGruntMembers_Count(), ecorePackage.getEInt(), "count", null, 1, 1, GruntMembers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGruntMembers_Nsc(), this.getNonPlayerCharacter(), null, "nsc", null, 1, 1, GruntMembers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(playerManagementEClass, PlayerManagement.class, "PlayerManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPlayerManagement_Groups(), this.getCharacterGroup(), null, "groups", null, 0, -1, PlayerManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        g1 = createEGenericType(this.getCharacterGenerator());
        g2 = createEGenericType(this.getCharacterGeneratorSystem());
        g1.getETypeArguments().add(g2);
        initEReference(getPlayerManagement_Generators(), g1, null, "generators", null, 0, -1, PlayerManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPlayerManagement_Entries(), this.getPlayerManagement(), null, "entries", null, 0, -1, PlayerManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(gamemasterManagementEClass, GamemasterManagement.class, "GamemasterManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGamemasterManagement_Grunts(), this.getGruntGroup(), null, "grunts", null, 0, -1, GamemasterManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(characterAdvancementSystemEClass, CharacterAdvancementSystem.class, "CharacterAdvancementSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCharacterAdvancementSystem_CharacterAdvancements(), this.getAdvancement(), null, "characterAdvancements", null, 0, -1, CharacterAdvancementSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(shr5RuleGeneratorEClass, Shr5RuleGenerator.class, "Shr5RuleGenerator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getShr5RuleGenerator_AllowedSources(), theShr5Package.getSourceBook(), null, "allowedSources", null, 0, -1, Shr5RuleGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = initEOperation(getShr5RuleGenerator__HasSpendAllPoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSpendAllPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5RuleGenerator__HasNotMoreMaxAttributes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasNotMoreMaxAttributes", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5RuleGenerator__HasNoSkillsOverMax__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasNoSkillsOverMax", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5RuleGenerator__HasNotMoreSpecalism__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasNotMoreSpecalism", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5RuleGenerator__HasNoAttributesOverSpeciesAtt__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasNoAttributesOverSpeciesAtt", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5RuleGenerator__HasNoConstrainVoilation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasNoConstrainVoilation", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5RuleGenerator__HasLifestyleChoosen__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasLifestyleChoosen", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5RuleGenerator__HasOnlyAllowedSources__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasOnlyAllowedSources", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5RuleGenerator__HasKiPowerOverLimit__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasKiPowerOverLimit", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5RuleGenerator__HasBasicViolations__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasBasicViolations", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(karmaGeneratorEClass, KarmaGenerator.class, "KarmaGenerator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getKarmaGenerator_MetaType(), this.getMetaType(), null, "metaType", null, 1, 1, KarmaGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getKarmaGenerator_CharacterConcept(), this.getSpecialType(), null, "characterConcept", null, 1, 1, KarmaGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKarmaGenerator_KarmaToResource(), ecorePackage.getEInt(), "karmaToResource", null, 0, 1, KarmaGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKarmaGenerator_KarmaSpend(), ecorePackage.getEInt(), "karmaSpend", null, 0, 1, KarmaGenerator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getKarmaGenerator_ResourceSpend(), ecorePackage.getEInt(), "resourceSpend", null, 0, 1, KarmaGenerator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getKarmaGenerator_StartKarma(), ecorePackage.getEInt(), "startKarma", null, 0, 1, KarmaGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKarmaGenerator_StartResources(), ecorePackage.getEInt(), "startResources", null, 0, 1, KarmaGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKarmaGenerator_ChoiseKarmaCost(), ecorePackage.getEInt(), "choiseKarmaCost", null, 0, 1, KarmaGenerator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        op = initEOperation(getKarmaGenerator__HasSpendAllKarmaPoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSpendAllKarmaPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getKarmaGenerator__HasSpendAllResources__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSpendAllResources", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(quellenConstrainEClass, QuellenConstrain.class, "QuellenConstrain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getQuellenConstrain_Source(), theShr5Package.getQuelle(), null, "source", null, 1, 1, QuellenConstrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getQuellenConstrain_Targets(), theShr5Package.getQuelle(), null, "targets", null, 0, -1, QuellenConstrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getQuellenConstrain_ConstrainType(), this.getQuellenConstrainType(), "constrainType", null, 0, 1, QuellenConstrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(packEClass, Pack.class, "Pack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPack_Items(), theShr5Package.getQuelle(), null, "items", null, 0, -1, Pack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(characterDiaryEClass, CharacterDiary.class, "CharacterDiary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCharacterDiary_CharacterDate(), theShr5Package.getShrDate(), "characterDate", null, 0, 1, CharacterDiary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCharacterDiary_Entries(), this.getDiaryEntry(), null, "entries", null, 0, -1, CharacterDiary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(diaryEntryEClass, DiaryEntry.class, "DiaryEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDiaryEntry_Date(), theShr5Package.getShrDate(), "date", null, 0, 1, DiaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiaryEntry_Message(), ecorePackage.getEString(), "message", null, 0, 1, DiaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(contractPaymentEClass, ContractPayment.class, "ContractPayment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContractPayment_ContractToPay(), theShr5Package.getVertrag(), null, "contractToPay", null, 1, 1, ContractPayment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getContractPayment_Payed(), ecorePackage.getEBoolean(), "payed", null, 0, 1, ContractPayment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(characterChangeEClass, CharacterChange.class, "CharacterChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCharacterChange_Change(), this.getChanges(), null, "change", null, 1, 1, CharacterChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sumToTenGeneratorEClass, SumToTenGenerator.class, "SumToTenGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        op = initEOperation(getSumToTenGenerator__HasSumToTen__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSumToTen", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(lifeModulesGeneratorEClass, LifeModulesGenerator.class, "LifeModulesGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLifeModulesGenerator_Nationality(), this.getLifeModule(), null, "nationality", null, 1, 1, LifeModulesGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLifeModulesGenerator_FormativeYears(), this.getLifeModule(), null, "formativeYears", null, 1, 1, LifeModulesGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLifeModulesGenerator_TeenYears(), this.getLifeModule(), null, "teenYears", null, 1, 1, LifeModulesGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLifeModulesGenerator_FurtherEducation(), this.getLifeModule(), null, "furtherEducation", null, 0, 1, LifeModulesGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLifeModulesGenerator_RealLife(), this.getLifeModule(), null, "realLife", null, 1, -1, LifeModulesGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLifeModulesGenerator_ModuleKarmaCost(), ecorePackage.getEInt(), "moduleKarmaCost", null, 0, 1, LifeModulesGenerator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getLifeModulesGenerator_StartingAge(), ecorePackage.getEInt(), "startingAge", null, 0, 1, LifeModulesGenerator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(lifeModulesSystemEClass, LifeModulesSystem.class, "LifeModulesSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLifeModulesSystem_Modules(), this.getLifeModule(), null, "modules", null, 0, -1, LifeModulesSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLifeModulesSystem_KnowlegeSkillMax(), ecorePackage.getEInt(), "knowlegeSkillMax", null, 0, 1, LifeModulesSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(lifeModuleEClass, LifeModule.class, "LifeModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLifeModule_KarmaCost(), ecorePackage.getEInt(), "karmaCost", null, 1, 1, LifeModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLifeModule_CharacterChanges(), this.getModuleChange(), null, "characterChanges", null, 0, -1, LifeModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLifeModule_ModuleType(), this.getLifeModuleType(), "moduleType", null, 0, 1, LifeModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLifeModule_Time(), ecorePackage.getEInt(), "time", null, 0, 1, LifeModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(moduleChangeEClass, ModuleChange.class, "ModuleChange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(moduleSkillChangeEClass, ModuleSkillChange.class, "ModuleSkillChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModuleSkillChange_Skill(), theShr5Package.getFertigkeit(), null, "skill", null, 0, 1, ModuleSkillChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(moduleTeachableChangeEClass, ModuleTeachableChange.class, "ModuleTeachableChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModuleTeachableChange_Teachable(), theShr5Package.getErlernbar(), null, "teachable", null, 0, 1, ModuleTeachableChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(moduleAttributeChangeEClass, ModuleAttributeChange.class, "ModuleAttributeChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModuleAttributeChange_Attribute(), ecorePackage.getEAttribute(), null, "attribute", null, 1, 1, ModuleAttributeChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(moduleFeatureChangeEClass, ModuleFeatureChange.class, "ModuleFeatureChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModuleFeatureChange_Feature(), ecorePackage.getEReference(), null, "feature", null, 0, 1, ModuleFeatureChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getModuleFeatureChange_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, ModuleFeatureChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(moduleSkillGroupChangeEClass, ModuleSkillGroupChange.class, "ModuleSkillGroupChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModuleSkillGroupChange_SkillGroup(), theShr5Package.getFertigkeitsGruppe(), null, "skillGroup", null, 0, 1, ModuleSkillGroupChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(moduleTypeChangeEClass, ModuleTypeChange.class, "ModuleTypeChange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getModuleTypeChange_Grade(), ecorePackage.getEInt(), "grade", null, 0, 1, ModuleTypeChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        g1 = createEGenericType(moduleTypeChangeEClass_T);
        initEReference(getModuleTypeChange_Selected(), g1, null, "selected", null, 0, 1, ModuleTypeChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        g1 = createEGenericType(moduleTypeChangeEClass_T);
        initEReference(getModuleTypeChange_SelectOne(), g1, null, "selectOne", null, 0, -1, ModuleTypeChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(shr5KarmaGeneratorEClass, Shr5KarmaGenerator.class, "Shr5KarmaGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(trainingRateEClass, TrainingRate.class, "TrainingRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTrainingRate_Factor(), ecorePackage.getEInt(), "factor", null, 0, 1, TrainingRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTrainingRate_TimeUnit(), theShr5Package.getTimeUnits(), "timeUnit", null, 0, 1, TrainingRate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rangeTableEntryEClass, RangeTableEntry.class, "RangeTableEntry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRangeTableEntry_From(), ecorePackage.getEInt(), "from", null, 0, 1, RangeTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRangeTableEntry_To(), ecorePackage.getEInt(), "to", null, 0, 1, RangeTableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rangeTableEClass, RangeTable.class, "RangeTable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = createEGenericType(rangeTableEClass_E);
        initEReference(getRangeTable_RangeTableEntries(), g1, null, "rangeTableEntries", null, 0, -1, RangeTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(trainingsTimeEClass, TrainingsTime.class, "TrainingsTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTrainingsTime_DaysTrained(), ecorePackage.getEInt(), "daysTrained", null, 0, 1, TrainingsTime.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getTrainingsTime_DaysRemains(), ecorePackage.getEInt(), "daysRemains", null, 0, 1, TrainingsTime.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getTrainingsTime_TrainingComplete(), ecorePackage.getEBoolean(), "trainingComplete", null, 0, 1, TrainingsTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTrainingsTime_Training(), this.getTrainingRange(), this.getTrainingRange_TrainingTime(), "training", null, 0, -1, TrainingsTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = initEOperation(getTrainingsTime__HasValidRange__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasValidRange", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(personaMartialArtChangeEClass, PersonaMartialArtChange.class, "PersonaMartialArtChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPersonaMartialArtChange_Style(), theShr5Package.getMartialartStyle(), null, "style", null, 0, 1, PersonaMartialArtChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPersonaMartialArtChange_Technique(), theShr5Package.getMartialartTechnique(), null, "technique", null, 0, 1, PersonaMartialArtChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(trainingRangeEClass, TrainingRange.class, "TrainingRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTrainingRange_Start(), theShr5Package.getShrDate(), "start", null, 0, 1, TrainingRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTrainingRange_End(), theShr5Package.getShrDate(), "end", null, 0, 1, TrainingRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTrainingRange_DaysTrained(), ecorePackage.getEInt(), "daysTrained", null, 0, 1, TrainingRange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getTrainingRange_TrainingTime(), this.getTrainingsTime(), this.getTrainingsTime_Training(), "trainingTime", null, 0, 1, TrainingRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(generatorStateEEnum, GeneratorState.class, "GeneratorState");
        addEEnumLiteral(generatorStateEEnum, GeneratorState.NEW);
        addEEnumLiteral(generatorStateEEnum, GeneratorState.READY_FOR_CREATION);
        addEEnumLiteral(generatorStateEEnum, GeneratorState.COMMITED);
        addEEnumLiteral(generatorStateEEnum, GeneratorState.PERSONA_CREATED);

        initEEnum(sexEEnum, Sex.class, "Sex");
        addEEnumLiteral(sexEEnum, Sex.FEMALE);
        addEEnumLiteral(sexEEnum, Sex.MALE);
        addEEnumLiteral(sexEEnum, Sex.UNDEFINDE);
        addEEnumLiteral(sexEEnum, Sex.NONE);

        initEEnum(quellenConstrainTypeEEnum, QuellenConstrainType.class, "QuellenConstrainType");
        addEEnumLiteral(quellenConstrainTypeEEnum, QuellenConstrainType.NOT_TOGETHER);
        addEEnumLiteral(quellenConstrainTypeEEnum, QuellenConstrainType.NEED_ONE_OF);

        initEEnum(lifeModuleTypeEEnum, LifeModuleType.class, "LifeModuleType");
        addEEnumLiteral(lifeModuleTypeEEnum, LifeModuleType.NATIONALITY);
        addEEnumLiteral(lifeModuleTypeEEnum, LifeModuleType.FORMATIVE_YEARS);
        addEEnumLiteral(lifeModuleTypeEEnum, LifeModuleType.TEEN_YEARS);
        addEEnumLiteral(lifeModuleTypeEEnum, LifeModuleType.FURTHER_EDUCATION);
        addEEnumLiteral(lifeModuleTypeEEnum, LifeModuleType.REAL_LIFE);

        // Create resource
        createResource(eNS_URI);
    }

} //Shr5managementPackageImpl
