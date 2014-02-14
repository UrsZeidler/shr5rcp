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
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5Management.Adept;
import de.urszeidler.eclipse.shr5Management.Advancement;
import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.Attributes;
import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem;
import de.urszeidler.eclipse.shr5Management.CharacterGroup;
import de.urszeidler.eclipse.shr5Management.Connection;
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
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.PersonaValueChange;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.PriorityCategorie;
import de.urszeidler.eclipse.shr5Management.PrioritySystem;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Sex;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.ShrMgmtList;
import de.urszeidler.eclipse.shr5Management.Skill;
import de.urszeidler.eclipse.shr5Management.SpecialType;
import de.urszeidler.eclipse.shr5Management.Spellcaster;
import de.urszeidler.eclipse.shr5Management.Technomancer;
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
    private EClass shrMgmtListEClass = null;

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
        Shr5managementPackageImpl theShr5managementPackage = (Shr5managementPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Shr5managementPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Shr5managementPackageImpl());

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
	public EClass getManagedCharacter() {
        return managedCharacterEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getManagedCharacter_Persona() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getManagedCharacter_Changes() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getManagedCharacter_ChracterSource() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getManagedCharacter_Inventar() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getManagedCharacter_Contracts() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getManagedCharacter_Sex() {
        return (EAttribute)managedCharacterEClass.getEStructuralFeatures().get(9);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getManagedCharacter_Connections() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getManagedCharacter_Vehicels() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getManagedCharacter_ChoosenLifestyle() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getManagedCharacter_NativeLanguage() {
        return (EReference)managedCharacterEClass.getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getManagedCharacter_StreetCred() {
        return (EAttribute)managedCharacterEClass.getEStructuralFeatures().get(10);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getManagedCharacter_Notoriety() {
        return (EAttribute)managedCharacterEClass.getEStructuralFeatures().get(11);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getManagedCharacter_NotorietyBasic() {
        return (EAttribute)managedCharacterEClass.getEStructuralFeatures().get(12);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getManagedCharacter_PublicAwareness() {
        return (EAttribute)managedCharacterEClass.getEStructuralFeatures().get(13);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getManagedCharacter_KarmaGaint() {
        return (EAttribute)managedCharacterEClass.getEStructuralFeatures().get(14);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getManagedCharacter_CurrentKarma() {
        return (EAttribute)managedCharacterEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCharacterGeneratorSystem() {
        return characterGeneratorSystemEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCharacterGeneratorSystem_Instructions() {
        return (EReference)characterGeneratorSystemEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCharacterGeneratorSystem_CharacterAdvancements() {
        return (EReference)characterGeneratorSystemEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCharacterGeneratorSystem_LifestyleToStartMoney() {
        return (EReference)characterGeneratorSystemEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPrioritySystem() {
        return prioritySystemEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getPrioritySystem_Priorities() {
        return (EReference)prioritySystemEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPrioritySystem_KarmaPoints() {
        return (EAttribute)prioritySystemEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getNonPlayerCharacter() {
        return nonPlayerCharacterEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getChanges() {
        return changesEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getChanges_Date() {
        return (EAttribute)changesEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChanges_KarmaCost() {
        return (EAttribute)changesEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChanges_Character() {
        return (EReference)changesEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChanges_ChangeApplied() {
        return (EAttribute)changesEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChanges_DateApplied() {
        return (EAttribute)changesEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getChanges__ApplyChanges() {
        return changesEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getKarmaGaint() {
        return karmaGaintEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getKarmaGaint_Karma() {
        return (EAttribute)karmaGaintEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFreeStyle() {
        return freeStyleEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPriorityCategorie() {
        return priorityCategorieEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPriorityCategorie_CategorieName() {
        return (EAttribute)priorityCategorieEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getShr5System() {
        return shr5SystemEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getShr5System_KarmaToResourceFactor() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getShr5System_KarmaToMagicFactor() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getShr5System_NumberOfMaxAttributes() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getShr5System_KnowlegeSkillFactor() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getShr5System_CharismaToConnectionFactor() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShr5System_MaxResourceToKeep() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShr5System_MaxKarmaToResources() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShr5System_MaxKarmaToKeep() {
        return (EAttribute)shr5SystemEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMetaType() {
        return metaTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMetaType_ChoosableTypes() {
        return (EReference)metaTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getMetaType_SpecialPoints() {
        return (EAttribute)metaTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EOperation getMetaType__CalcSpecialPointsSpend__ManagedCharacter() {
        return metaTypeEClass.getEOperations().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAttributes() {
        return attributesEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAttributes_AttibutePoints() {
        return (EAttribute)attributesEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EOperation getAttributes__CalcAttributesSpend__ManagedCharacter() {
        return attributesEClass.getEOperations().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSkill() {
        return skillEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSkill_SkillPoints() {
        return (EAttribute)skillEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSkill_GroupPoints() {
        return (EAttribute)skillEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EOperation getSkill__CalcSkillSpend__ManagedCharacter() {
        return skillEClass.getEOperations().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EOperation getSkill__CalcGroupSpend__ManagedCharacter() {
        return skillEClass.getEOperations().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EOperation getSkill__CalcKnowledgeSkillSpend__ManagedCharacter() {
        return skillEClass.getEOperations().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EOperation getSkill__CalcKnowledgeSkillPoints__ManagedCharacter() {
        return skillEClass.getEOperations().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getResourcen() {
        return resourcenEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getResourcen_Resource() {
        return (EAttribute)resourcenEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EOperation getResourcen__CalcResourceSpend__ManagedCharacter() {
        return resourcenEClass.getEOperations().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSpecialType() {
        return specialTypeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSpecialType_SelectableTypes() {
        return (EReference)specialTypeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpecialType_SkillValue() {
        return (EAttribute)specialTypeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpecialType_SkillNumber() {
        return (EAttribute)specialTypeEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSpecialType_SelectableSkills() {
        return (EReference)specialTypeEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSpecialType_SelectableSkillGroups() {
        return (EReference)specialTypeEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EOperation getSpecialType__CalcSkillsSpend__ManagedCharacter() {
        return specialTypeEClass.getEOperations().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getTechnomancer() {
        return technomancerEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTechnomancer_Resonanz() {
        return (EAttribute)technomancerEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getTechnomancer_ComplexForms() {
        return (EAttribute)technomancerEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EOperation getTechnomancer__CalcComplexFormsSpend__ManagedCharacter() {
        return technomancerEClass.getEOperations().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSpellcaster() {
        return spellcasterEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSpellcaster_SpellPoints() {
        return (EAttribute)spellcasterEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EOperation getSpellcaster__CalcSpellPointsSpend__ManagedCharacter() {
        return spellcasterEClass.getEOperations().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAdept() {
        return adeptEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAdept_Magic() {
        return (EAttribute)adeptEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getAdept__CalcPowerPointsSpend__ManagedCharacter() {
        return adeptEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCharacterGenerator() {
        return characterGeneratorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCharacterGenerator_Character() {
        return (EReference)characterGeneratorEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCharacterGenerator_Generator() {
        return (EReference)characterGeneratorEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCharacterGenerator_State() {
        return (EAttribute)characterGeneratorEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCharacterGenerator_SelectedGroup() {
        return (EReference)characterGeneratorEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCharacterGenerator_CharacterName() {
        return (EAttribute)characterGeneratorEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getCharacterGenerator_CurrentInstruction() {
        return (EAttribute)characterGeneratorEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getFreeStyleGenerator() {
        return freeStyleGeneratorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getFreeStyleGenerator_FreestyleGenerator() {
        return (EReference)freeStyleGeneratorEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFreeStyleGenerator_SelectedPersona() {
        return (EReference)freeStyleGeneratorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFreeStyleGenerator_SelectedSpecies() {
        return (EReference)freeStyleGeneratorEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFreeStyleGenerator_SelectedType() {
        return (EReference)freeStyleGeneratorEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getShr5Generator() {
        return shr5GeneratorEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getShr5Generator_Resourcen() {
        return (EReference)shr5GeneratorEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getShr5Generator_Skills() {
        return (EReference)shr5GeneratorEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getShr5Generator_Attribute() {
        return (EReference)shr5GeneratorEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getShr5Generator_MetaType() {
        return (EReference)shr5GeneratorEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getShr5Generator_Magic() {
        return (EReference)shr5GeneratorEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getShr5Generator_KarmaToResource() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getShr5Generator_KarmaSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getShr5Generator_Shr5Generator() {
        return (EReference)shr5GeneratorEClass.getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShr5Generator_AttributeSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShr5Generator_ResourceSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShr5Generator_ConnectionSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShr5Generator_SkillPointSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShr5Generator_SpecialPointSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShr5Generator_GroupPointSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShr5Generator_KnownlegePointSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShr5Generator_SpellPointSpend() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShr5Generator_StartKarma() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getShr5Generator_StartResources() {
        return (EAttribute)shr5GeneratorEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EOperation getShr5Generator__HasCategoryOnlyOnce__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(0);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getShr5Generator__HasSpendAllPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EOperation getShr5Generator__HasNotMoreMaxAttributes__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(2);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getShr5Generator__HasSpendAllAttributesPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getShr5Generator__HasSpendAllSkillPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getShr5Generator__HasSpendAllSpecialPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getShr5Generator__HasSpendAllSpecialTypePoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getShr5Generator__HasSpendAllConnectionPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getShr5Generator__HasSpendAllResourcePoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getShr5Generator__HasSpendAllMagicSkillsPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getShr5Generator__HasSpendAllMagicPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getShr5Generator__HasSpendAllGroupPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getShr5Generator__HasSpendAllKnowlegeSkillPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getShr5Generator__HasSpendAllKarmaPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getShr5Generator__HasSpendAllSpellPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getShr5Generator__HasSpendAllPowerPoints__DiagnosticChain_Map() {
        return shr5GeneratorEClass.getEOperations().get(15);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAttributeChange() {
        return attributeChangeEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeChange_Attibute() {
        return (EReference)attributeChangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPlayerCharacter() {
        return playerCharacterEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMudan() {
        return mudanEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getCharacterGroup() {
        return characterGroupEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getCharacterGroup_Members() {
        return (EReference)characterGroupEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getConnection() {
        return connectionEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConnection_Influence() {
        return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getConnection_Loyality() {
        return (EAttribute)connectionEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getConnection_Character() {
        return (EReference)connectionEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPersonaChange() {
        return personaChangeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPersonaChange_Changeable() {
        return (EReference)personaChangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getPersonaValueChange() {
        return personaValueChangeEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPersonaValueChange_From() {
        return (EAttribute)personaValueChangeEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getPersonaValueChange_To() {
        return (EAttribute)personaValueChangeEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getGeneratorStateToEStringMapEntry() {
        return generatorStateToEStringMapEntryEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGeneratorStateToEStringMapEntry_Key() {
        return (EAttribute)generatorStateToEStringMapEntryEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getGeneratorStateToEStringMapEntry_Value() {
        return (EAttribute)generatorStateToEStringMapEntryEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getAdvancement() {
        return advancementEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getAdvancement_KarmaFactor() {
        return (EAttribute)advancementEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getIncreaseCharacterPart() {
        return increaseCharacterPartEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getIncreaseCharacterPart_Type() {
        return (EReference)increaseCharacterPartEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLifestyleToStartMoney() {
        return lifestyleToStartMoneyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLifestyleToStartMoney_NumberOfW() {
        return (EAttribute)lifestyleToStartMoneyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLifestyleToStartMoney_MoneyFactor() {
        return (EAttribute)lifestyleToStartMoneyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLifestyleToStartMoney_LifeStyles() {
        return (EReference)lifestyleToStartMoneyEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getShrMgmtList() {
        return shrMgmtListEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getShrMgmtList_Entries() {
        return (EReference)shrMgmtListEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getGeneratorState() {
        return generatorStateEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EEnum getSex() {
        return sexEEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
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

        characterGeneratorSystemEClass = createEClass(CHARACTER_GENERATOR_SYSTEM);
        createEReference(characterGeneratorSystemEClass, CHARACTER_GENERATOR_SYSTEM__INSTRUCTIONS);
        createEReference(characterGeneratorSystemEClass, CHARACTER_GENERATOR_SYSTEM__CHARACTER_ADVANCEMENTS);
        createEReference(characterGeneratorSystemEClass, CHARACTER_GENERATOR_SYSTEM__LIFESTYLE_TO_START_MONEY);

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

        shr5SystemEClass = createEClass(SHR5_SYSTEM);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__KARMA_TO_RESOURCE_FACTOR);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__KARMA_TO_MAGIC_FACTOR);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__NUMBER_OF_MAX_ATTRIBUTES);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__KNOWLEGE_SKILL_FACTOR);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__CHARISMA_TO_CONNECTION_FACTOR);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__MAX_RESOURCE_TO_KEEP);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__MAX_KARMA_TO_RESOURCES);
        createEAttribute(shr5SystemEClass, SHR5_SYSTEM__MAX_KARMA_TO_KEEP);

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
        createEReference(shr5GeneratorEClass, SHR5_GENERATOR__SHR5_GENERATOR);
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
        createEOperation(shr5GeneratorEClass, SHR5_GENERATOR___HAS_SPEND_ALL_POINTS__DIAGNOSTICCHAIN_MAP);
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

        shrMgmtListEClass = createEClass(SHR_MGMT_LIST);
        createEReference(shrMgmtListEClass, SHR_MGMT_LIST__ENTRIES);

        // Create enums
        generatorStateEEnum = createEEnum(GENERATOR_STATE);
        sexEEnum = createEEnum(SEX);
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

        // Set bounds for type parameters

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
        freeStyleGeneratorEClass.getESuperTypes().add(this.getCharacterGenerator());
        shr5GeneratorEClass.getESuperTypes().add(this.getCharacterGenerator());
        attributeChangeEClass.getESuperTypes().add(this.getPersonaValueChange());
        playerCharacterEClass.getESuperTypes().add(this.getManagedCharacter());
        mudanEClass.getESuperTypes().add(this.getSpecialType());
        characterGroupEClass.getESuperTypes().add(theShr5Package.getBeschreibbar());
        personaChangeEClass.getESuperTypes().add(this.getPersonaValueChange());
        personaValueChangeEClass.getESuperTypes().add(this.getChanges());
        increaseCharacterPartEClass.getESuperTypes().add(this.getAdvancement());
        shrMgmtListEClass.getESuperTypes().add(theShr5Package.getBeschreibbar());

        // Initialize classes, features, and operations; add parameters
        initEClass(managedCharacterEClass, ManagedCharacter.class, "ManagedCharacter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getManagedCharacter_Persona(), theShr5Package.getAbstraktPersona(), null, "persona", null, 1, 1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getManagedCharacter_Changes(), this.getChanges(), this.getChanges_Character(), "changes", null, 0, -1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getManagedCharacter_ChracterSource(), this.getCharacterGenerator(), this.getCharacterGenerator_Character(), "chracterSource", null, 1, 1, ManagedCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

        initEClass(characterGeneratorSystemEClass, CharacterGeneratorSystem.class, "CharacterGeneratorSystem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCharacterGeneratorSystem_Instructions(), this.getGeneratorStateToEStringMapEntry(), null, "instructions", null, 0, -1, CharacterGeneratorSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCharacterGeneratorSystem_CharacterAdvancements(), this.getAdvancement(), null, "characterAdvancements", null, 0, -1, CharacterGeneratorSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCharacterGeneratorSystem_LifestyleToStartMoney(), this.getLifestyleToStartMoney(), null, "lifestyleToStartMoney", null, 0, -1, CharacterGeneratorSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
        initEAttribute(getPriorityCategorie_CategorieName(), ecorePackage.getEString(), "categorieName", null, 1, 1, PriorityCategorie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(shr5SystemEClass, Shr5System.class, "Shr5System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getShr5System_KarmaToResourceFactor(), ecorePackage.getEInt(), "karmaToResourceFactor", null, 1, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_KarmaToMagicFactor(), ecorePackage.getEInt(), "karmaToMagicFactor", null, 1, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_NumberOfMaxAttributes(), ecorePackage.getEInt(), "numberOfMaxAttributes", null, 1, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_KnowlegeSkillFactor(), ecorePackage.getEInt(), "knowlegeSkillFactor", null, 1, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_CharismaToConnectionFactor(), ecorePackage.getEInt(), "charismaToConnectionFactor", null, 1, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_MaxResourceToKeep(), ecorePackage.getEInt(), "maxResourceToKeep", null, 1, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_MaxKarmaToResources(), ecorePackage.getEInt(), "maxKarmaToResources", null, 1, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5System_MaxKarmaToKeep(), ecorePackage.getEInt(), "maxKarmaToKeep", null, 0, 1, Shr5System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
        initEReference(getCharacterGenerator_Generator(), this.getCharacterGeneratorSystem(), null, "generator", null, 1, 1, CharacterGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCharacterGenerator_State(), this.getGeneratorState(), "state", null, 0, 1, CharacterGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCharacterGenerator_SelectedGroup(), this.getCharacterGroup(), null, "selectedGroup", null, 1, 1, CharacterGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCharacterGenerator_CharacterName(), ecorePackage.getEString(), "characterName", null, 0, 1, CharacterGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
        initEReference(getShr5Generator_Shr5Generator(), this.getShr5System(), null, "shr5Generator", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_AttributeSpend(), ecorePackage.getEInt(), "attributeSpend", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_ResourceSpend(), ecorePackage.getEInt(), "resourceSpend", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_ConnectionSpend(), ecorePackage.getEInt(), "connectionSpend", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_SkillPointSpend(), ecorePackage.getEInt(), "skillPointSpend", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_SpecialPointSpend(), ecorePackage.getEInt(), "specialPointSpend", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_GroupPointSpend(), ecorePackage.getEInt(), "groupPointSpend", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_KnownlegePointSpend(), ecorePackage.getEInt(), "knownlegePointSpend", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_SpellPointSpend(), ecorePackage.getEInt(), "spellPointSpend", null, 0, 1, Shr5Generator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_StartKarma(), ecorePackage.getEInt(), "startKarma", null, 0, 1, Shr5Generator.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getShr5Generator_StartResources(), ecorePackage.getEInt(), "startResources", null, 0, 1, Shr5Generator.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = initEOperation(getShr5Generator__HasCategoryOnlyOnce__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasCategoryOnlyOnce", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(ecorePackage.getEMap());
        EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getShr5Generator__HasSpendAllPoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasSpendAllPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
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

        initEClass(shrMgmtListEClass, ShrMgmtList.class, "ShrMgmtList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getShrMgmtList_Entries(), ecorePackage.getEObject(), null, "entries", null, 0, -1, ShrMgmtList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

        // Create resource
        createResource(eNS_URI);
    }

} //Shr5managementPackageImpl
