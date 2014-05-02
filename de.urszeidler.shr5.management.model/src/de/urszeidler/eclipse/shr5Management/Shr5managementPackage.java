/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementFactory
 * @model kind="package"
 * @generated
 */
public interface Shr5managementPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "shr5Management";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://urszeidler.de/shr5mngt/1.0";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "shr5mngt";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	Shr5managementPackage eINSTANCE = de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl.init();

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl <em>Managed Character</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getManagedCharacter()
     * @generated
     */
	int MANAGED_CHARACTER = 0;

	/**
     * The feature id for the '<em><b>Persona</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MANAGED_CHARACTER__PERSONA = 0;

	/**
     * The feature id for the '<em><b>Changes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MANAGED_CHARACTER__CHANGES = 1;

	/**
     * The feature id for the '<em><b>Chracter Source</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MANAGED_CHARACTER__CHRACTER_SOURCE = 2;

	/**
     * The feature id for the '<em><b>Inventar</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MANAGED_CHARACTER__INVENTAR = 3;

	/**
     * The feature id for the '<em><b>Contracts</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MANAGED_CHARACTER__CONTRACTS = 4;

	/**
     * The feature id for the '<em><b>Connections</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MANAGED_CHARACTER__CONNECTIONS = 5;

	/**
     * The feature id for the '<em><b>Vehicels</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MANAGED_CHARACTER__VEHICELS = 6;

	/**
     * The feature id for the '<em><b>Choosen Lifestyle</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MANAGED_CHARACTER__CHOOSEN_LIFESTYLE = 7;

	/**
     * The feature id for the '<em><b>Native Language</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MANAGED_CHARACTER__NATIVE_LANGUAGE = 8;

    /**
     * The feature id for the '<em><b>Sex</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MANAGED_CHARACTER__SEX = 9;

	/**
     * The feature id for the '<em><b>Street Cred</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MANAGED_CHARACTER__STREET_CRED = 10;

	/**
     * The feature id for the '<em><b>Notoriety</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MANAGED_CHARACTER__NOTORIETY = 11;

	/**
     * The feature id for the '<em><b>Notoriety Basic</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MANAGED_CHARACTER__NOTORIETY_BASIC = 12;

	/**
     * The feature id for the '<em><b>Public Awareness</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MANAGED_CHARACTER__PUBLIC_AWARENESS = 13;

	/**
     * The feature id for the '<em><b>Karma Gaint</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MANAGED_CHARACTER__KARMA_GAINT = 14;

	/**
     * The feature id for the '<em><b>Current Karma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANAGED_CHARACTER__CURRENT_KARMA = 15;

    /**
     * The feature id for the '<em><b>Generator Src</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANAGED_CHARACTER__GENERATOR_SRC = 16;

    /**
     * The number of structural features of the '<em>Managed Character</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MANAGED_CHARACTER_FEATURE_COUNT = 17;

	/**
     * The number of operations of the '<em>Managed Character</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MANAGED_CHARACTER_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorSystemImpl <em>Character Generator System</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorSystemImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getCharacterGeneratorSystem()
     * @generated
     */
	int CHARACTER_GENERATOR_SYSTEM = 1;

	/**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GENERATOR_SYSTEM__BESCHREIBUNG = Shr5Package.BESCHREIBBAR__BESCHREIBUNG;

	/**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GENERATOR_SYSTEM__IMAGE = Shr5Package.BESCHREIBBAR__IMAGE;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GENERATOR_SYSTEM__NAME = Shr5Package.BESCHREIBBAR__NAME;

	/**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_GENERATOR_SYSTEM__PARENT_ID = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GENERATOR_SYSTEM__PAGE = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GENERATOR_SYSTEM__SRC_BOOK = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Instructions</b></em>' map.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GENERATOR_SYSTEM__INSTRUCTIONS = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Lifestyle To Start Money</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_GENERATOR_SYSTEM__LIFESTYLE_TO_START_MONEY = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Character Advancements</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GENERATOR_SYSTEM__CHARACTER_ADVANCEMENTS = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Character Generator System</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GENERATOR_SYSTEM_FEATURE_COUNT = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 6;

	/**
     * The number of operations of the '<em>Character Generator System</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GENERATOR_SYSTEM_OPERATION_COUNT = Shr5Package.BESCHREIBBAR_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.PrioritySystemImpl <em>Priority System</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.PrioritySystemImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getPrioritySystem()
     * @generated
     */
	int PRIORITY_SYSTEM = 2;

	/**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRIORITY_SYSTEM__BESCHREIBUNG = CHARACTER_GENERATOR_SYSTEM__BESCHREIBUNG;

	/**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRIORITY_SYSTEM__IMAGE = CHARACTER_GENERATOR_SYSTEM__IMAGE;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRIORITY_SYSTEM__NAME = CHARACTER_GENERATOR_SYSTEM__NAME;

	/**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIORITY_SYSTEM__PARENT_ID = CHARACTER_GENERATOR_SYSTEM__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRIORITY_SYSTEM__PAGE = CHARACTER_GENERATOR_SYSTEM__PAGE;

	/**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRIORITY_SYSTEM__SRC_BOOK = CHARACTER_GENERATOR_SYSTEM__SRC_BOOK;

	/**
     * The feature id for the '<em><b>Instructions</b></em>' map.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRIORITY_SYSTEM__INSTRUCTIONS = CHARACTER_GENERATOR_SYSTEM__INSTRUCTIONS;

	/**
     * The feature id for the '<em><b>Lifestyle To Start Money</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIORITY_SYSTEM__LIFESTYLE_TO_START_MONEY = CHARACTER_GENERATOR_SYSTEM__LIFESTYLE_TO_START_MONEY;

    /**
     * The feature id for the '<em><b>Character Advancements</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRIORITY_SYSTEM__CHARACTER_ADVANCEMENTS = CHARACTER_GENERATOR_SYSTEM__CHARACTER_ADVANCEMENTS;

    /**
     * The feature id for the '<em><b>Priorities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRIORITY_SYSTEM__PRIORITIES = CHARACTER_GENERATOR_SYSTEM_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Karma Points</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRIORITY_SYSTEM__KARMA_POINTS = CHARACTER_GENERATOR_SYSTEM_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Priority System</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRIORITY_SYSTEM_FEATURE_COUNT = CHARACTER_GENERATOR_SYSTEM_FEATURE_COUNT + 2;

	/**
     * The number of operations of the '<em>Priority System</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRIORITY_SYSTEM_OPERATION_COUNT = CHARACTER_GENERATOR_SYSTEM_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.NonPlayerCharacterImpl <em>Non Player Character</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.NonPlayerCharacterImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getNonPlayerCharacter()
     * @generated
     */
	int NON_PLAYER_CHARACTER = 3;

	/**
     * The feature id for the '<em><b>Persona</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NON_PLAYER_CHARACTER__PERSONA = MANAGED_CHARACTER__PERSONA;

	/**
     * The feature id for the '<em><b>Changes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NON_PLAYER_CHARACTER__CHANGES = MANAGED_CHARACTER__CHANGES;

	/**
     * The feature id for the '<em><b>Chracter Source</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NON_PLAYER_CHARACTER__CHRACTER_SOURCE = MANAGED_CHARACTER__CHRACTER_SOURCE;

	/**
     * The feature id for the '<em><b>Inventar</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NON_PLAYER_CHARACTER__INVENTAR = MANAGED_CHARACTER__INVENTAR;

	/**
     * The feature id for the '<em><b>Contracts</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NON_PLAYER_CHARACTER__CONTRACTS = MANAGED_CHARACTER__CONTRACTS;

	/**
     * The feature id for the '<em><b>Connections</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NON_PLAYER_CHARACTER__CONNECTIONS = MANAGED_CHARACTER__CONNECTIONS;

	/**
     * The feature id for the '<em><b>Vehicels</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NON_PLAYER_CHARACTER__VEHICELS = MANAGED_CHARACTER__VEHICELS;

	/**
     * The feature id for the '<em><b>Choosen Lifestyle</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NON_PLAYER_CHARACTER__CHOOSEN_LIFESTYLE = MANAGED_CHARACTER__CHOOSEN_LIFESTYLE;

	/**
     * The feature id for the '<em><b>Native Language</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NON_PLAYER_CHARACTER__NATIVE_LANGUAGE = MANAGED_CHARACTER__NATIVE_LANGUAGE;

    /**
     * The feature id for the '<em><b>Sex</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NON_PLAYER_CHARACTER__SEX = MANAGED_CHARACTER__SEX;

	/**
     * The feature id for the '<em><b>Street Cred</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NON_PLAYER_CHARACTER__STREET_CRED = MANAGED_CHARACTER__STREET_CRED;

	/**
     * The feature id for the '<em><b>Notoriety</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NON_PLAYER_CHARACTER__NOTORIETY = MANAGED_CHARACTER__NOTORIETY;

	/**
     * The feature id for the '<em><b>Notoriety Basic</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NON_PLAYER_CHARACTER__NOTORIETY_BASIC = MANAGED_CHARACTER__NOTORIETY_BASIC;

	/**
     * The feature id for the '<em><b>Public Awareness</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NON_PLAYER_CHARACTER__PUBLIC_AWARENESS = MANAGED_CHARACTER__PUBLIC_AWARENESS;

	/**
     * The feature id for the '<em><b>Karma Gaint</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NON_PLAYER_CHARACTER__KARMA_GAINT = MANAGED_CHARACTER__KARMA_GAINT;

	/**
     * The feature id for the '<em><b>Current Karma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PLAYER_CHARACTER__CURRENT_KARMA = MANAGED_CHARACTER__CURRENT_KARMA;

    /**
     * The feature id for the '<em><b>Generator Src</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NON_PLAYER_CHARACTER__GENERATOR_SRC = MANAGED_CHARACTER__GENERATOR_SRC;

    /**
     * The number of structural features of the '<em>Non Player Character</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NON_PLAYER_CHARACTER_FEATURE_COUNT = MANAGED_CHARACTER_FEATURE_COUNT + 0;

	/**
     * The number of operations of the '<em>Non Player Character</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int NON_PLAYER_CHARACTER_OPERATION_COUNT = MANAGED_CHARACTER_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.ChangesImpl <em>Changes</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.ChangesImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getChanges()
     * @generated
     */
	int CHANGES = 4;

	/**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHANGES__DATE = 0;

	/**
     * The feature id for the '<em><b>Karma Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__KARMA_COST = 1;

    /**
     * The feature id for the '<em><b>Character</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__CHARACTER = 2;

    /**
     * The feature id for the '<em><b>Change Applied</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__CHANGE_APPLIED = 3;

    /**
     * The feature id for the '<em><b>Date Applied</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES__DATE_APPLIED = 4;

    /**
     * The number of structural features of the '<em>Changes</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHANGES_FEATURE_COUNT = 5;

	/**
     * The operation id for the '<em>Apply Changes</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHANGES___APPLY_CHANGES = 0;

    /**
     * The number of operations of the '<em>Changes</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHANGES_OPERATION_COUNT = 1;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.KarmaGaintImpl <em>Karma Gaint</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.KarmaGaintImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getKarmaGaint()
     * @generated
     */
	int KARMA_GAINT = 5;

	/**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KARMA_GAINT__DATE = CHANGES__DATE;

	/**
     * The feature id for the '<em><b>Karma Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KARMA_GAINT__KARMA_COST = CHANGES__KARMA_COST;

    /**
     * The feature id for the '<em><b>Character</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KARMA_GAINT__CHARACTER = CHANGES__CHARACTER;

    /**
     * The feature id for the '<em><b>Change Applied</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KARMA_GAINT__CHANGE_APPLIED = CHANGES__CHANGE_APPLIED;

    /**
     * The feature id for the '<em><b>Date Applied</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KARMA_GAINT__DATE_APPLIED = CHANGES__DATE_APPLIED;

    /**
     * The feature id for the '<em><b>Karma</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KARMA_GAINT__KARMA = CHANGES_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Karma Gaint</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KARMA_GAINT_FEATURE_COUNT = CHANGES_FEATURE_COUNT + 1;

	/**
     * The operation id for the '<em>Apply Changes</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KARMA_GAINT___APPLY_CHANGES = CHANGES___APPLY_CHANGES;

    /**
     * The number of operations of the '<em>Karma Gaint</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int KARMA_GAINT_OPERATION_COUNT = CHANGES_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.FreeStyleImpl <em>Free Style</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.FreeStyleImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getFreeStyle()
     * @generated
     */
	int FREE_STYLE = 6;

	/**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE__BESCHREIBUNG = CHARACTER_GENERATOR_SYSTEM__BESCHREIBUNG;

	/**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE__IMAGE = CHARACTER_GENERATOR_SYSTEM__IMAGE;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE__NAME = CHARACTER_GENERATOR_SYSTEM__NAME;

	/**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FREE_STYLE__PARENT_ID = CHARACTER_GENERATOR_SYSTEM__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE__PAGE = CHARACTER_GENERATOR_SYSTEM__PAGE;

	/**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE__SRC_BOOK = CHARACTER_GENERATOR_SYSTEM__SRC_BOOK;

	/**
     * The feature id for the '<em><b>Instructions</b></em>' map.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE__INSTRUCTIONS = CHARACTER_GENERATOR_SYSTEM__INSTRUCTIONS;

	/**
     * The feature id for the '<em><b>Lifestyle To Start Money</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FREE_STYLE__LIFESTYLE_TO_START_MONEY = CHARACTER_GENERATOR_SYSTEM__LIFESTYLE_TO_START_MONEY;

    /**
     * The feature id for the '<em><b>Character Advancements</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE__CHARACTER_ADVANCEMENTS = CHARACTER_GENERATOR_SYSTEM__CHARACTER_ADVANCEMENTS;

    /**
     * The number of structural features of the '<em>Free Style</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE_FEATURE_COUNT = CHARACTER_GENERATOR_SYSTEM_FEATURE_COUNT + 0;

	/**
     * The number of operations of the '<em>Free Style</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE_OPERATION_COUNT = CHARACTER_GENERATOR_SYSTEM_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.PriorityCategorieImpl <em>Priority Categorie</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.PriorityCategorieImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getPriorityCategorie()
     * @generated
     */
	int PRIORITY_CATEGORIE = 7;

	/**
     * The feature id for the '<em><b>Categorie Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRIORITY_CATEGORIE__CATEGORIE_NAME = 0;

	/**
     * The feature id for the '<em><b>Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIORITY_CATEGORIE__COST = 1;

    /**
     * The number of structural features of the '<em>Priority Categorie</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRIORITY_CATEGORIE_FEATURE_COUNT = 2;

	/**
     * The number of operations of the '<em>Priority Categorie</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PRIORITY_CATEGORIE_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.Shr5SystemImpl <em>Shr5 System</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5SystemImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getShr5System()
     * @generated
     */
	int SHR5_SYSTEM = 8;

	/**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_SYSTEM__BESCHREIBUNG = PRIORITY_SYSTEM__BESCHREIBUNG;

	/**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_SYSTEM__IMAGE = PRIORITY_SYSTEM__IMAGE;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_SYSTEM__NAME = PRIORITY_SYSTEM__NAME;

	/**
     * The feature id for the '<em><b>Parent Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_SYSTEM__PARENT_ID = PRIORITY_SYSTEM__PARENT_ID;

    /**
     * The feature id for the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_SYSTEM__PAGE = PRIORITY_SYSTEM__PAGE;

	/**
     * The feature id for the '<em><b>Src Book</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_SYSTEM__SRC_BOOK = PRIORITY_SYSTEM__SRC_BOOK;

	/**
     * The feature id for the '<em><b>Instructions</b></em>' map.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_SYSTEM__INSTRUCTIONS = PRIORITY_SYSTEM__INSTRUCTIONS;

	/**
     * The feature id for the '<em><b>Lifestyle To Start Money</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_SYSTEM__LIFESTYLE_TO_START_MONEY = PRIORITY_SYSTEM__LIFESTYLE_TO_START_MONEY;

    /**
     * The feature id for the '<em><b>Character Advancements</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_SYSTEM__CHARACTER_ADVANCEMENTS = PRIORITY_SYSTEM__CHARACTER_ADVANCEMENTS;

    /**
     * The feature id for the '<em><b>Priorities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_SYSTEM__PRIORITIES = PRIORITY_SYSTEM__PRIORITIES;

	/**
     * The feature id for the '<em><b>Karma Points</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_SYSTEM__KARMA_POINTS = PRIORITY_SYSTEM__KARMA_POINTS;

	/**
     * The feature id for the '<em><b>Karma To Resource Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_SYSTEM__KARMA_TO_RESOURCE_FACTOR = PRIORITY_SYSTEM_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Karma To Magic Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_SYSTEM__KARMA_TO_MAGIC_FACTOR = PRIORITY_SYSTEM_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Number Of Max Attributes</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_SYSTEM__NUMBER_OF_MAX_ATTRIBUTES = PRIORITY_SYSTEM_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Knowlege Skill Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_SYSTEM__KNOWLEGE_SKILL_FACTOR = PRIORITY_SYSTEM_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Charisma To Connection Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_SYSTEM__CHARISMA_TO_CONNECTION_FACTOR = PRIORITY_SYSTEM_FEATURE_COUNT + 4;

	/**
     * The feature id for the '<em><b>Max Resource To Keep</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_SYSTEM__MAX_RESOURCE_TO_KEEP = PRIORITY_SYSTEM_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Max Karma To Resources</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_SYSTEM__MAX_KARMA_TO_RESOURCES = PRIORITY_SYSTEM_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Max Karma To Keep</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_SYSTEM__MAX_KARMA_TO_KEEP = PRIORITY_SYSTEM_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Skill Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_SYSTEM__SKILL_MAX = PRIORITY_SYSTEM_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Number Of Specalism</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_SYSTEM__NUMBER_OF_SPECALISM = PRIORITY_SYSTEM_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Karma To Connection Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_SYSTEM__KARMA_TO_CONNECTION_FACTOR = PRIORITY_SYSTEM_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Bound Spritit Service Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_SYSTEM__BOUND_SPRITIT_SERVICE_COST = PRIORITY_SYSTEM_FEATURE_COUNT + 11;

    /**
     * The number of structural features of the '<em>Shr5 System</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_SYSTEM_FEATURE_COUNT = PRIORITY_SYSTEM_FEATURE_COUNT + 12;

	/**
     * The number of operations of the '<em>Shr5 System</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_SYSTEM_OPERATION_COUNT = PRIORITY_SYSTEM_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.MetaTypeImpl <em>Meta Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.MetaTypeImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getMetaType()
     * @generated
     */
	int META_TYPE = 9;

	/**
     * The feature id for the '<em><b>Categorie Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int META_TYPE__CATEGORIE_NAME = PRIORITY_CATEGORIE__CATEGORIE_NAME;

	/**
     * The feature id for the '<em><b>Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int META_TYPE__COST = PRIORITY_CATEGORIE__COST;

    /**
     * The feature id for the '<em><b>Choosable Types</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int META_TYPE__CHOOSABLE_TYPES = PRIORITY_CATEGORIE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Special Points</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int META_TYPE__SPECIAL_POINTS = PRIORITY_CATEGORIE_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Meta Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int META_TYPE_FEATURE_COUNT = PRIORITY_CATEGORIE_FEATURE_COUNT + 2;

	/**
     * The operation id for the '<em>Calc Special Points Spend</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int META_TYPE___CALC_SPECIAL_POINTS_SPEND__MANAGEDCHARACTER = PRIORITY_CATEGORIE_OPERATION_COUNT + 0;

	/**
     * The number of operations of the '<em>Meta Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int META_TYPE_OPERATION_COUNT = PRIORITY_CATEGORIE_OPERATION_COUNT + 1;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.AttributesImpl <em>Attributes</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.AttributesImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getAttributes()
     * @generated
     */
	int ATTRIBUTES = 10;

	/**
     * The feature id for the '<em><b>Categorie Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUTES__CATEGORIE_NAME = PRIORITY_CATEGORIE__CATEGORIE_NAME;

	/**
     * The feature id for the '<em><b>Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTES__COST = PRIORITY_CATEGORIE__COST;

    /**
     * The feature id for the '<em><b>Attibute Points</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUTES__ATTIBUTE_POINTS = PRIORITY_CATEGORIE_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Attributes</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUTES_FEATURE_COUNT = PRIORITY_CATEGORIE_FEATURE_COUNT + 1;

	/**
     * The operation id for the '<em>Calc Attributes Spend</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUTES___CALC_ATTRIBUTES_SPEND__MANAGEDCHARACTER = PRIORITY_CATEGORIE_OPERATION_COUNT + 0;

	/**
     * The number of operations of the '<em>Attributes</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUTES_OPERATION_COUNT = PRIORITY_CATEGORIE_OPERATION_COUNT + 1;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.SkillImpl <em>Skill</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.SkillImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getSkill()
     * @generated
     */
	int SKILL = 11;

	/**
     * The feature id for the '<em><b>Categorie Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SKILL__CATEGORIE_NAME = PRIORITY_CATEGORIE__CATEGORIE_NAME;

	/**
     * The feature id for the '<em><b>Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL__COST = PRIORITY_CATEGORIE__COST;

    /**
     * The feature id for the '<em><b>Skill Points</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SKILL__SKILL_POINTS = PRIORITY_CATEGORIE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Group Points</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SKILL__GROUP_POINTS = PRIORITY_CATEGORIE_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Skill</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SKILL_FEATURE_COUNT = PRIORITY_CATEGORIE_FEATURE_COUNT + 2;

	/**
     * The operation id for the '<em>Calc Skill Spend</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SKILL___CALC_SKILL_SPEND__MANAGEDCHARACTER = PRIORITY_CATEGORIE_OPERATION_COUNT + 0;

	/**
     * The operation id for the '<em>Calc Group Spend</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SKILL___CALC_GROUP_SPEND__MANAGEDCHARACTER = PRIORITY_CATEGORIE_OPERATION_COUNT + 1;

	/**
     * The operation id for the '<em>Calc Knowledge Skill Spend</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SKILL___CALC_KNOWLEDGE_SKILL_SPEND__MANAGEDCHARACTER = PRIORITY_CATEGORIE_OPERATION_COUNT + 2;

	/**
     * The operation id for the '<em>Calc Knowledge Skill Points</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SKILL___CALC_KNOWLEDGE_SKILL_POINTS__MANAGEDCHARACTER = PRIORITY_CATEGORIE_OPERATION_COUNT + 3;

	/**
     * The number of operations of the '<em>Skill</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SKILL_OPERATION_COUNT = PRIORITY_CATEGORIE_OPERATION_COUNT + 4;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.ResourcenImpl <em>Resourcen</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.ResourcenImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getResourcen()
     * @generated
     */
	int RESOURCEN = 12;

	/**
     * The feature id for the '<em><b>Categorie Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCEN__CATEGORIE_NAME = PRIORITY_CATEGORIE__CATEGORIE_NAME;

	/**
     * The feature id for the '<em><b>Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCEN__COST = PRIORITY_CATEGORIE__COST;

    /**
     * The feature id for the '<em><b>Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCEN__RESOURCE = PRIORITY_CATEGORIE_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Resourcen</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCEN_FEATURE_COUNT = PRIORITY_CATEGORIE_FEATURE_COUNT + 1;

	/**
     * The operation id for the '<em>Calc Resource Spend</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCEN___CALC_RESOURCE_SPEND__MANAGEDCHARACTER = PRIORITY_CATEGORIE_OPERATION_COUNT + 0;

	/**
     * The number of operations of the '<em>Resourcen</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int RESOURCEN_OPERATION_COUNT = PRIORITY_CATEGORIE_OPERATION_COUNT + 1;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.SpecialTypeImpl <em>Special Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.SpecialTypeImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getSpecialType()
     * @generated
     */
	int SPECIAL_TYPE = 13;

	/**
     * The feature id for the '<em><b>Categorie Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIAL_TYPE__CATEGORIE_NAME = PRIORITY_CATEGORIE__CATEGORIE_NAME;

	/**
     * The feature id for the '<em><b>Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPECIAL_TYPE__COST = PRIORITY_CATEGORIE__COST;

    /**
     * The feature id for the '<em><b>Selectable Types</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIAL_TYPE__SELECTABLE_TYPES = PRIORITY_CATEGORIE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Skill Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIAL_TYPE__SKILL_VALUE = PRIORITY_CATEGORIE_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Skill Number</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIAL_TYPE__SKILL_NUMBER = PRIORITY_CATEGORIE_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Selectable Skills</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIAL_TYPE__SELECTABLE_SKILLS = PRIORITY_CATEGORIE_FEATURE_COUNT + 3;

	/**
     * The feature id for the '<em><b>Selectable Skill Groups</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIAL_TYPE__SELECTABLE_SKILL_GROUPS = PRIORITY_CATEGORIE_FEATURE_COUNT + 4;

	/**
     * The number of structural features of the '<em>Special Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIAL_TYPE_FEATURE_COUNT = PRIORITY_CATEGORIE_FEATURE_COUNT + 5;

	/**
     * The operation id for the '<em>Calc Skills Spend</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIAL_TYPE___CALC_SKILLS_SPEND__MANAGEDCHARACTER = PRIORITY_CATEGORIE_OPERATION_COUNT + 0;

	/**
     * The number of operations of the '<em>Special Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPECIAL_TYPE_OPERATION_COUNT = PRIORITY_CATEGORIE_OPERATION_COUNT + 1;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.TechnomancerImpl <em>Technomancer</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.TechnomancerImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getTechnomancer()
     * @generated
     */
	int TECHNOMANCER = 14;

	/**
     * The feature id for the '<em><b>Categorie Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__CATEGORIE_NAME = SPECIAL_TYPE__CATEGORIE_NAME;

	/**
     * The feature id for the '<em><b>Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TECHNOMANCER__COST = SPECIAL_TYPE__COST;

    /**
     * The feature id for the '<em><b>Selectable Types</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__SELECTABLE_TYPES = SPECIAL_TYPE__SELECTABLE_TYPES;

	/**
     * The feature id for the '<em><b>Skill Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__SKILL_VALUE = SPECIAL_TYPE__SKILL_VALUE;

	/**
     * The feature id for the '<em><b>Skill Number</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__SKILL_NUMBER = SPECIAL_TYPE__SKILL_NUMBER;

	/**
     * The feature id for the '<em><b>Selectable Skills</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__SELECTABLE_SKILLS = SPECIAL_TYPE__SELECTABLE_SKILLS;

	/**
     * The feature id for the '<em><b>Selectable Skill Groups</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__SELECTABLE_SKILL_GROUPS = SPECIAL_TYPE__SELECTABLE_SKILL_GROUPS;

	/**
     * The feature id for the '<em><b>Resonanz</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__RESONANZ = SPECIAL_TYPE_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Complex Forms</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER__COMPLEX_FORMS = SPECIAL_TYPE_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Technomancer</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER_FEATURE_COUNT = SPECIAL_TYPE_FEATURE_COUNT + 2;

	/**
     * The operation id for the '<em>Calc Skills Spend</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER___CALC_SKILLS_SPEND__MANAGEDCHARACTER = SPECIAL_TYPE___CALC_SKILLS_SPEND__MANAGEDCHARACTER;

	/**
     * The operation id for the '<em>Calc Complex Forms Spend</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER___CALC_COMPLEX_FORMS_SPEND__MANAGEDCHARACTER = SPECIAL_TYPE_OPERATION_COUNT + 0;

	/**
     * The number of operations of the '<em>Technomancer</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TECHNOMANCER_OPERATION_COUNT = SPECIAL_TYPE_OPERATION_COUNT + 1;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.AdeptImpl <em>Adept</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.AdeptImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getAdept()
     * @generated
     */
	int ADEPT = 16;

	/**
     * The feature id for the '<em><b>Categorie Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADEPT__CATEGORIE_NAME = SPECIAL_TYPE__CATEGORIE_NAME;

	/**
     * The feature id for the '<em><b>Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADEPT__COST = SPECIAL_TYPE__COST;

    /**
     * The feature id for the '<em><b>Selectable Types</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADEPT__SELECTABLE_TYPES = SPECIAL_TYPE__SELECTABLE_TYPES;

	/**
     * The feature id for the '<em><b>Skill Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADEPT__SKILL_VALUE = SPECIAL_TYPE__SKILL_VALUE;

	/**
     * The feature id for the '<em><b>Skill Number</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADEPT__SKILL_NUMBER = SPECIAL_TYPE__SKILL_NUMBER;

	/**
     * The feature id for the '<em><b>Selectable Skills</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADEPT__SELECTABLE_SKILLS = SPECIAL_TYPE__SELECTABLE_SKILLS;

	/**
     * The feature id for the '<em><b>Selectable Skill Groups</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADEPT__SELECTABLE_SKILL_GROUPS = SPECIAL_TYPE__SELECTABLE_SKILL_GROUPS;

	/**
     * The feature id for the '<em><b>Magic</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADEPT__MAGIC = SPECIAL_TYPE_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Adept</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADEPT_FEATURE_COUNT = SPECIAL_TYPE_FEATURE_COUNT + 1;

	/**
     * The operation id for the '<em>Calc Skills Spend</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADEPT___CALC_SKILLS_SPEND__MANAGEDCHARACTER = SPECIAL_TYPE___CALC_SKILLS_SPEND__MANAGEDCHARACTER;

	/**
     * The operation id for the '<em>Calc Power Points Spend</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADEPT___CALC_POWER_POINTS_SPEND__MANAGEDCHARACTER = SPECIAL_TYPE_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Adept</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADEPT_OPERATION_COUNT = SPECIAL_TYPE_OPERATION_COUNT + 1;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.SpellcasterImpl <em>Spellcaster</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.SpellcasterImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getSpellcaster()
     * @generated
     */
	int SPELLCASTER = 15;

	/**
     * The feature id for the '<em><b>Categorie Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPELLCASTER__CATEGORIE_NAME = ADEPT__CATEGORIE_NAME;

	/**
     * The feature id for the '<em><b>Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPELLCASTER__COST = ADEPT__COST;

    /**
     * The feature id for the '<em><b>Selectable Types</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPELLCASTER__SELECTABLE_TYPES = ADEPT__SELECTABLE_TYPES;

	/**
     * The feature id for the '<em><b>Skill Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPELLCASTER__SKILL_VALUE = ADEPT__SKILL_VALUE;

	/**
     * The feature id for the '<em><b>Skill Number</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPELLCASTER__SKILL_NUMBER = ADEPT__SKILL_NUMBER;

	/**
     * The feature id for the '<em><b>Selectable Skills</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPELLCASTER__SELECTABLE_SKILLS = ADEPT__SELECTABLE_SKILLS;

	/**
     * The feature id for the '<em><b>Selectable Skill Groups</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPELLCASTER__SELECTABLE_SKILL_GROUPS = ADEPT__SELECTABLE_SKILL_GROUPS;

	/**
     * The feature id for the '<em><b>Magic</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPELLCASTER__MAGIC = ADEPT__MAGIC;

	/**
     * The feature id for the '<em><b>Spell Points</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPELLCASTER__SPELL_POINTS = ADEPT_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Spellcaster</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPELLCASTER_FEATURE_COUNT = ADEPT_FEATURE_COUNT + 1;

	/**
     * The operation id for the '<em>Calc Skills Spend</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPELLCASTER___CALC_SKILLS_SPEND__MANAGEDCHARACTER = ADEPT___CALC_SKILLS_SPEND__MANAGEDCHARACTER;

	/**
     * The operation id for the '<em>Calc Power Points Spend</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SPELLCASTER___CALC_POWER_POINTS_SPEND__MANAGEDCHARACTER = ADEPT___CALC_POWER_POINTS_SPEND__MANAGEDCHARACTER;

    /**
     * The operation id for the '<em>Calc Spell Points Spend</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPELLCASTER___CALC_SPELL_POINTS_SPEND__MANAGEDCHARACTER = ADEPT_OPERATION_COUNT + 0;

	/**
     * The number of operations of the '<em>Spellcaster</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SPELLCASTER_OPERATION_COUNT = ADEPT_OPERATION_COUNT + 1;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorImpl <em>Character Generator</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getCharacterGenerator()
     * @generated
     */
	int CHARACTER_GENERATOR = 17;

	/**
     * The feature id for the '<em><b>Character</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GENERATOR__CHARACTER = 0;

	/**
     * The feature id for the '<em><b>Generator</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GENERATOR__GENERATOR = 1;

	/**
     * The feature id for the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GENERATOR__STATE = 2;

	/**
     * The feature id for the '<em><b>Selected Group</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GENERATOR__SELECTED_GROUP = 3;

	/**
     * The feature id for the '<em><b>Character Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GENERATOR__CHARACTER_NAME = 4;

	/**
     * The feature id for the '<em><b>Current Instruction</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GENERATOR__CURRENT_INSTRUCTION = 5;

	/**
     * The number of structural features of the '<em>Character Generator</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GENERATOR_FEATURE_COUNT = 6;

	/**
     * The number of operations of the '<em>Character Generator</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GENERATOR_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.FreeStyleGeneratorImpl <em>Free Style Generator</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.FreeStyleGeneratorImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getFreeStyleGenerator()
     * @generated
     */
	int FREE_STYLE_GENERATOR = 18;

	/**
     * The feature id for the '<em><b>Character</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE_GENERATOR__CHARACTER = CHARACTER_GENERATOR__CHARACTER;

	/**
     * The feature id for the '<em><b>Generator</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE_GENERATOR__GENERATOR = CHARACTER_GENERATOR__GENERATOR;

	/**
     * The feature id for the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE_GENERATOR__STATE = CHARACTER_GENERATOR__STATE;

	/**
     * The feature id for the '<em><b>Selected Group</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE_GENERATOR__SELECTED_GROUP = CHARACTER_GENERATOR__SELECTED_GROUP;

	/**
     * The feature id for the '<em><b>Character Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE_GENERATOR__CHARACTER_NAME = CHARACTER_GENERATOR__CHARACTER_NAME;

	/**
     * The feature id for the '<em><b>Current Instruction</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE_GENERATOR__CURRENT_INSTRUCTION = CHARACTER_GENERATOR__CURRENT_INSTRUCTION;

	/**
     * The feature id for the '<em><b>Freestyle Generator</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE_GENERATOR__FREESTYLE_GENERATOR = CHARACTER_GENERATOR_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Selected Persona</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FREE_STYLE_GENERATOR__SELECTED_PERSONA = CHARACTER_GENERATOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Selected Species</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FREE_STYLE_GENERATOR__SELECTED_SPECIES = CHARACTER_GENERATOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Selected Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FREE_STYLE_GENERATOR__SELECTED_TYPE = CHARACTER_GENERATOR_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Free Style Generator</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE_GENERATOR_FEATURE_COUNT = CHARACTER_GENERATOR_FEATURE_COUNT + 4;

	/**
     * The number of operations of the '<em>Free Style Generator</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int FREE_STYLE_GENERATOR_OPERATION_COUNT = CHARACTER_GENERATOR_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.Shr5RuleGeneratorImpl <em>Shr5 Rule Generator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5RuleGeneratorImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getShr5RuleGenerator()
     * @generated
     */
    int SHR5_RULE_GENERATOR = 36;

    /**
     * The feature id for the '<em><b>Character</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_RULE_GENERATOR__CHARACTER = CHARACTER_GENERATOR__CHARACTER;

    /**
     * The feature id for the '<em><b>Generator</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_RULE_GENERATOR__GENERATOR = CHARACTER_GENERATOR__GENERATOR;

    /**
     * The feature id for the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_RULE_GENERATOR__STATE = CHARACTER_GENERATOR__STATE;

    /**
     * The feature id for the '<em><b>Selected Group</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_RULE_GENERATOR__SELECTED_GROUP = CHARACTER_GENERATOR__SELECTED_GROUP;

    /**
     * The feature id for the '<em><b>Character Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_RULE_GENERATOR__CHARACTER_NAME = CHARACTER_GENERATOR__CHARACTER_NAME;

    /**
     * The feature id for the '<em><b>Current Instruction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_RULE_GENERATOR__CURRENT_INSTRUCTION = CHARACTER_GENERATOR__CURRENT_INSTRUCTION;

    /**
     * The feature id for the '<em><b>Shr5 Generator</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_RULE_GENERATOR__SHR5_GENERATOR = CHARACTER_GENERATOR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Shr5 Rule Generator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_RULE_GENERATOR_FEATURE_COUNT = CHARACTER_GENERATOR_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Has Spend All Points</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_RULE_GENERATOR___HAS_SPEND_ALL_POINTS__DIAGNOSTICCHAIN_MAP = CHARACTER_GENERATOR_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Has Not More Max Attributes</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_RULE_GENERATOR___HAS_NOT_MORE_MAX_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = CHARACTER_GENERATOR_OPERATION_COUNT + 1;

    /**
     * The operation id for the '<em>Has No Skills Over Max</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_RULE_GENERATOR___HAS_NO_SKILLS_OVER_MAX__DIAGNOSTICCHAIN_MAP = CHARACTER_GENERATOR_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Has Not More Specalism</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_RULE_GENERATOR___HAS_NOT_MORE_SPECALISM__DIAGNOSTICCHAIN_MAP = CHARACTER_GENERATOR_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Has No Attributes Over Species Att</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_RULE_GENERATOR___HAS_NO_ATTRIBUTES_OVER_SPECIES_ATT__DIAGNOSTICCHAIN_MAP = CHARACTER_GENERATOR_OPERATION_COUNT + 4;

    /**
     * The number of operations of the '<em>Shr5 Rule Generator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_RULE_GENERATOR_OPERATION_COUNT = CHARACTER_GENERATOR_OPERATION_COUNT + 5;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl <em>Shr5 Generator</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getShr5Generator()
     * @generated
     */
	int SHR5_GENERATOR = 19;

	/**
     * The feature id for the '<em><b>Character</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR__CHARACTER = SHR5_RULE_GENERATOR__CHARACTER;

	/**
     * The feature id for the '<em><b>Generator</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR__GENERATOR = SHR5_RULE_GENERATOR__GENERATOR;

	/**
     * The feature id for the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR__STATE = SHR5_RULE_GENERATOR__STATE;

	/**
     * The feature id for the '<em><b>Selected Group</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR__SELECTED_GROUP = SHR5_RULE_GENERATOR__SELECTED_GROUP;

	/**
     * The feature id for the '<em><b>Character Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR__CHARACTER_NAME = SHR5_RULE_GENERATOR__CHARACTER_NAME;

	/**
     * The feature id for the '<em><b>Current Instruction</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR__CURRENT_INSTRUCTION = SHR5_RULE_GENERATOR__CURRENT_INSTRUCTION;

	/**
     * The feature id for the '<em><b>Shr5 Generator</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR__SHR5_GENERATOR = SHR5_RULE_GENERATOR__SHR5_GENERATOR;

    /**
     * The feature id for the '<em><b>Resourcen</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR__RESOURCEN = SHR5_RULE_GENERATOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Skills</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR__SKILLS = SHR5_RULE_GENERATOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR__ATTRIBUTE = SHR5_RULE_GENERATOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Meta Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR__META_TYPE = SHR5_RULE_GENERATOR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Magic</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR__MAGIC = SHR5_RULE_GENERATOR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Karma To Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR__KARMA_TO_RESOURCE = SHR5_RULE_GENERATOR_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Karma Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR__KARMA_SPEND = SHR5_RULE_GENERATOR_FEATURE_COUNT + 6;

	/**
     * The feature id for the '<em><b>Attribute Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR__ATTRIBUTE_SPEND = SHR5_RULE_GENERATOR_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Resource Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR__RESOURCE_SPEND = SHR5_RULE_GENERATOR_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Connection Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR__CONNECTION_SPEND = SHR5_RULE_GENERATOR_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Skill Point Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR__SKILL_POINT_SPEND = SHR5_RULE_GENERATOR_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Special Point Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR__SPECIAL_POINT_SPEND = SHR5_RULE_GENERATOR_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Group Point Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR__GROUP_POINT_SPEND = SHR5_RULE_GENERATOR_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Knownlege Point Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR__KNOWNLEGE_POINT_SPEND = SHR5_RULE_GENERATOR_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Spell Point Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR__SPELL_POINT_SPEND = SHR5_RULE_GENERATOR_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Start Karma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR__START_KARMA = SHR5_RULE_GENERATOR_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Start Resources</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR__START_RESOURCES = SHR5_RULE_GENERATOR_FEATURE_COUNT + 16;

    /**
     * The number of structural features of the '<em>Shr5 Generator</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR_FEATURE_COUNT = SHR5_RULE_GENERATOR_FEATURE_COUNT + 17;

	/**
     * The operation id for the '<em>Has Spend All Points</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR___HAS_SPEND_ALL_POINTS__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR___HAS_SPEND_ALL_POINTS__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Has No Skills Over Max</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR___HAS_NO_SKILLS_OVER_MAX__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR___HAS_NO_SKILLS_OVER_MAX__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Has Not More Specalism</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR___HAS_NOT_MORE_SPECALISM__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR___HAS_NOT_MORE_SPECALISM__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Has No Attributes Over Species Att</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR___HAS_NO_ATTRIBUTES_OVER_SPECIES_ATT__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR___HAS_NO_ATTRIBUTES_OVER_SPECIES_ATT__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Has Category Only Once</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR___HAS_CATEGORY_ONLY_ONCE__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR_OPERATION_COUNT + 0;

    /**
     * The operation id for the '<em>Has Not More Max Attributes</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR___HAS_NOT_MORE_MAX_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR_OPERATION_COUNT + 1;

	/**
     * The operation id for the '<em>Has Spend All Attributes Points</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR___HAS_SPEND_ALL_ATTRIBUTES_POINTS__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR_OPERATION_COUNT + 2;

    /**
     * The operation id for the '<em>Has Spend All Skill Points</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR___HAS_SPEND_ALL_SKILL_POINTS__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR_OPERATION_COUNT + 3;

    /**
     * The operation id for the '<em>Has Spend All Special Points</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR___HAS_SPEND_ALL_SPECIAL_POINTS__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR_OPERATION_COUNT + 4;

    /**
     * The operation id for the '<em>Has Spend All Special Type Points</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR___HAS_SPEND_ALL_SPECIAL_TYPE_POINTS__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR_OPERATION_COUNT + 5;

    /**
     * The operation id for the '<em>Has Spend All Connection Points</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR___HAS_SPEND_ALL_CONNECTION_POINTS__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR_OPERATION_COUNT + 6;

    /**
     * The operation id for the '<em>Has Spend All Resource Points</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR___HAS_SPEND_ALL_RESOURCE_POINTS__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR_OPERATION_COUNT + 7;

    /**
     * The operation id for the '<em>Has Spend All Magic Skills Points</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR___HAS_SPEND_ALL_MAGIC_SKILLS_POINTS__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR_OPERATION_COUNT + 8;

    /**
     * The operation id for the '<em>Has Spend All Magic Points</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR___HAS_SPEND_ALL_MAGIC_POINTS__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR_OPERATION_COUNT + 9;

    /**
     * The operation id for the '<em>Has Spend All Group Points</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR___HAS_SPEND_ALL_GROUP_POINTS__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR_OPERATION_COUNT + 10;

    /**
     * The operation id for the '<em>Has Spend All Knowlege Skill Points</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR___HAS_SPEND_ALL_KNOWLEGE_SKILL_POINTS__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR_OPERATION_COUNT + 11;

    /**
     * The operation id for the '<em>Has Spend All Karma Points</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR___HAS_SPEND_ALL_KARMA_POINTS__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR_OPERATION_COUNT + 12;

    /**
     * The operation id for the '<em>Has Spend All Spell Points</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR___HAS_SPEND_ALL_SPELL_POINTS__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR_OPERATION_COUNT + 13;

    /**
     * The operation id for the '<em>Has Spend All Power Points</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_GENERATOR___HAS_SPEND_ALL_POWER_POINTS__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR_OPERATION_COUNT + 14;

    /**
     * The number of operations of the '<em>Shr5 Generator</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SHR5_GENERATOR_OPERATION_COUNT = SHR5_RULE_GENERATOR_OPERATION_COUNT + 15;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.PersonaValueChangeImpl <em>Persona Value Change</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.PersonaValueChangeImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getPersonaValueChange()
     * @generated
     */
	int PERSONA_VALUE_CHANGE = 26;

	/**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_VALUE_CHANGE__DATE = CHANGES__DATE;

	/**
     * The feature id for the '<em><b>Karma Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_VALUE_CHANGE__KARMA_COST = CHANGES__KARMA_COST;

    /**
     * The feature id for the '<em><b>Character</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_VALUE_CHANGE__CHARACTER = CHANGES__CHARACTER;

    /**
     * The feature id for the '<em><b>Change Applied</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_VALUE_CHANGE__CHANGE_APPLIED = CHANGES__CHANGE_APPLIED;

    /**
     * The feature id for the '<em><b>Date Applied</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_VALUE_CHANGE__DATE_APPLIED = CHANGES__DATE_APPLIED;

    /**
     * The feature id for the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_VALUE_CHANGE__FROM = CHANGES_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_VALUE_CHANGE__TO = CHANGES_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>Persona Value Change</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_VALUE_CHANGE_FEATURE_COUNT = CHANGES_FEATURE_COUNT + 2;

	/**
     * The operation id for the '<em>Apply Changes</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_VALUE_CHANGE___APPLY_CHANGES = CHANGES___APPLY_CHANGES;

    /**
     * The number of operations of the '<em>Persona Value Change</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PERSONA_VALUE_CHANGE_OPERATION_COUNT = CHANGES_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.AttributeChangeImpl <em>Attribute Change</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.AttributeChangeImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getAttributeChange()
     * @generated
     */
	int ATTRIBUTE_CHANGE = 20;

	/**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUTE_CHANGE__DATE = PERSONA_VALUE_CHANGE__DATE;

	/**
     * The feature id for the '<em><b>Karma Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_CHANGE__KARMA_COST = PERSONA_VALUE_CHANGE__KARMA_COST;

    /**
     * The feature id for the '<em><b>Character</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_CHANGE__CHARACTER = PERSONA_VALUE_CHANGE__CHARACTER;

    /**
     * The feature id for the '<em><b>Change Applied</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_CHANGE__CHANGE_APPLIED = PERSONA_VALUE_CHANGE__CHANGE_APPLIED;

    /**
     * The feature id for the '<em><b>Date Applied</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_CHANGE__DATE_APPLIED = PERSONA_VALUE_CHANGE__DATE_APPLIED;

    /**
     * The feature id for the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUTE_CHANGE__FROM = PERSONA_VALUE_CHANGE__FROM;

	/**
     * The feature id for the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUTE_CHANGE__TO = PERSONA_VALUE_CHANGE__TO;

	/**
     * The feature id for the '<em><b>Attibute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_CHANGE__ATTIBUTE = PERSONA_VALUE_CHANGE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Attribute Change</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUTE_CHANGE_FEATURE_COUNT = PERSONA_VALUE_CHANGE_FEATURE_COUNT + 1;

	/**
     * The operation id for the '<em>Apply Changes</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_CHANGE___APPLY_CHANGES = PERSONA_VALUE_CHANGE___APPLY_CHANGES;

    /**
     * The number of operations of the '<em>Attribute Change</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUTE_CHANGE_OPERATION_COUNT = PERSONA_VALUE_CHANGE_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.PlayerCharacterImpl <em>Player Character</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.PlayerCharacterImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getPlayerCharacter()
     * @generated
     */
	int PLAYER_CHARACTER = 21;

	/**
     * The feature id for the '<em><b>Persona</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PLAYER_CHARACTER__PERSONA = MANAGED_CHARACTER__PERSONA;

	/**
     * The feature id for the '<em><b>Changes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PLAYER_CHARACTER__CHANGES = MANAGED_CHARACTER__CHANGES;

	/**
     * The feature id for the '<em><b>Chracter Source</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PLAYER_CHARACTER__CHRACTER_SOURCE = MANAGED_CHARACTER__CHRACTER_SOURCE;

	/**
     * The feature id for the '<em><b>Inventar</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PLAYER_CHARACTER__INVENTAR = MANAGED_CHARACTER__INVENTAR;

	/**
     * The feature id for the '<em><b>Contracts</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PLAYER_CHARACTER__CONTRACTS = MANAGED_CHARACTER__CONTRACTS;

	/**
     * The feature id for the '<em><b>Connections</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PLAYER_CHARACTER__CONNECTIONS = MANAGED_CHARACTER__CONNECTIONS;

	/**
     * The feature id for the '<em><b>Vehicels</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PLAYER_CHARACTER__VEHICELS = MANAGED_CHARACTER__VEHICELS;

	/**
     * The feature id for the '<em><b>Choosen Lifestyle</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PLAYER_CHARACTER__CHOOSEN_LIFESTYLE = MANAGED_CHARACTER__CHOOSEN_LIFESTYLE;

	/**
     * The feature id for the '<em><b>Native Language</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PLAYER_CHARACTER__NATIVE_LANGUAGE = MANAGED_CHARACTER__NATIVE_LANGUAGE;

    /**
     * The feature id for the '<em><b>Sex</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PLAYER_CHARACTER__SEX = MANAGED_CHARACTER__SEX;

	/**
     * The feature id for the '<em><b>Street Cred</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PLAYER_CHARACTER__STREET_CRED = MANAGED_CHARACTER__STREET_CRED;

	/**
     * The feature id for the '<em><b>Notoriety</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PLAYER_CHARACTER__NOTORIETY = MANAGED_CHARACTER__NOTORIETY;

	/**
     * The feature id for the '<em><b>Notoriety Basic</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PLAYER_CHARACTER__NOTORIETY_BASIC = MANAGED_CHARACTER__NOTORIETY_BASIC;

	/**
     * The feature id for the '<em><b>Public Awareness</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PLAYER_CHARACTER__PUBLIC_AWARENESS = MANAGED_CHARACTER__PUBLIC_AWARENESS;

	/**
     * The feature id for the '<em><b>Karma Gaint</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PLAYER_CHARACTER__KARMA_GAINT = MANAGED_CHARACTER__KARMA_GAINT;

	/**
     * The feature id for the '<em><b>Current Karma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAYER_CHARACTER__CURRENT_KARMA = MANAGED_CHARACTER__CURRENT_KARMA;

    /**
     * The feature id for the '<em><b>Generator Src</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAYER_CHARACTER__GENERATOR_SRC = MANAGED_CHARACTER__GENERATOR_SRC;

    /**
     * The number of structural features of the '<em>Player Character</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PLAYER_CHARACTER_FEATURE_COUNT = MANAGED_CHARACTER_FEATURE_COUNT + 0;

	/**
     * The number of operations of the '<em>Player Character</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PLAYER_CHARACTER_OPERATION_COUNT = MANAGED_CHARACTER_OPERATION_COUNT + 0;


	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.MudanImpl <em>Mudan</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.MudanImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getMudan()
     * @generated
     */
	int MUDAN = 22;

	/**
     * The feature id for the '<em><b>Categorie Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN__CATEGORIE_NAME = SPECIAL_TYPE__CATEGORIE_NAME;

	/**
     * The feature id for the '<em><b>Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MUDAN__COST = SPECIAL_TYPE__COST;

    /**
     * The feature id for the '<em><b>Selectable Types</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN__SELECTABLE_TYPES = SPECIAL_TYPE__SELECTABLE_TYPES;

	/**
     * The feature id for the '<em><b>Skill Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN__SKILL_VALUE = SPECIAL_TYPE__SKILL_VALUE;

	/**
     * The feature id for the '<em><b>Skill Number</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN__SKILL_NUMBER = SPECIAL_TYPE__SKILL_NUMBER;

	/**
     * The feature id for the '<em><b>Selectable Skills</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN__SELECTABLE_SKILLS = SPECIAL_TYPE__SELECTABLE_SKILLS;

	/**
     * The feature id for the '<em><b>Selectable Skill Groups</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN__SELECTABLE_SKILL_GROUPS = SPECIAL_TYPE__SELECTABLE_SKILL_GROUPS;

	/**
     * The number of structural features of the '<em>Mudan</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_FEATURE_COUNT = SPECIAL_TYPE_FEATURE_COUNT + 0;

	/**
     * The operation id for the '<em>Calc Skills Spend</em>' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN___CALC_SKILLS_SPEND__MANAGEDCHARACTER = SPECIAL_TYPE___CALC_SKILLS_SPEND__MANAGEDCHARACTER;

	/**
     * The number of operations of the '<em>Mudan</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MUDAN_OPERATION_COUNT = SPECIAL_TYPE_OPERATION_COUNT + 0;


	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGroupImpl <em>Character Group</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.CharacterGroupImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getCharacterGroup()
     * @generated
     */
	int CHARACTER_GROUP = 23;

	/**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GROUP__BESCHREIBUNG = Shr5Package.BESCHREIBBAR__BESCHREIBUNG;

	/**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GROUP__IMAGE = Shr5Package.BESCHREIBBAR__IMAGE;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GROUP__NAME = Shr5Package.BESCHREIBBAR__NAME;

	/**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GROUP__MEMBERS = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Character Group</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GROUP_FEATURE_COUNT = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 1;

	/**
     * The number of operations of the '<em>Character Group</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CHARACTER_GROUP_OPERATION_COUNT = Shr5Package.BESCHREIBBAR_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.ConnectionImpl <em>Connection</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.ConnectionImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getConnection()
     * @generated
     */
	int CONNECTION = 24;

	/**
     * The feature id for the '<em><b>Influence</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONNECTION__INFLUENCE = 0;

	/**
     * The feature id for the '<em><b>Loyality</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONNECTION__LOYALITY = 1;

	/**
     * The feature id for the '<em><b>Character</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONNECTION__CHARACTER = 2;

	/**
     * The number of structural features of the '<em>Connection</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
     * The number of operations of the '<em>Connection</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.PersonaChangeImpl <em>Persona Change</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.PersonaChangeImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getPersonaChange()
     * @generated
     */
    int PERSONA_CHANGE = 25;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_CHANGE__DATE = PERSONA_VALUE_CHANGE__DATE;

    /**
     * The feature id for the '<em><b>Karma Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_CHANGE__KARMA_COST = PERSONA_VALUE_CHANGE__KARMA_COST;

    /**
     * The feature id for the '<em><b>Character</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_CHANGE__CHARACTER = PERSONA_VALUE_CHANGE__CHARACTER;

    /**
     * The feature id for the '<em><b>Change Applied</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_CHANGE__CHANGE_APPLIED = PERSONA_VALUE_CHANGE__CHANGE_APPLIED;

    /**
     * The feature id for the '<em><b>Date Applied</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_CHANGE__DATE_APPLIED = PERSONA_VALUE_CHANGE__DATE_APPLIED;

    /**
     * The feature id for the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_CHANGE__FROM = PERSONA_VALUE_CHANGE__FROM;

    /**
     * The feature id for the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_CHANGE__TO = PERSONA_VALUE_CHANGE__TO;

    /**
     * The feature id for the '<em><b>Changeable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_CHANGE__CHANGEABLE = PERSONA_VALUE_CHANGE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Persona Change</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_CHANGE_FEATURE_COUNT = PERSONA_VALUE_CHANGE_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Apply Changes</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_CHANGE___APPLY_CHANGES = PERSONA_VALUE_CHANGE___APPLY_CHANGES;

    /**
     * The number of operations of the '<em>Persona Change</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_CHANGE_OPERATION_COUNT = PERSONA_VALUE_CHANGE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.GeneratorStateToEStringMapEntryImpl <em>Generator State To EString Map Entry</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.GeneratorStateToEStringMapEntryImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getGeneratorStateToEStringMapEntry()
     * @generated
     */
	int GENERATOR_STATE_TO_ESTRING_MAP_ENTRY = 27;

	/**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERATOR_STATE_TO_ESTRING_MAP_ENTRY__KEY = 0;

	/**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERATOR_STATE_TO_ESTRING_MAP_ENTRY__VALUE = 1;

	/**
     * The number of structural features of the '<em>Generator State To EString Map Entry</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERATOR_STATE_TO_ESTRING_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
     * The number of operations of the '<em>Generator State To EString Map Entry</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int GENERATOR_STATE_TO_ESTRING_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.AdvancementImpl <em>Advancement</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.AdvancementImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getAdvancement()
     * @generated
     */
	int ADVANCEMENT = 28;

	/**
     * The feature id for the '<em><b>Karma Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADVANCEMENT__KARMA_FACTOR = 0;

	/**
     * The number of structural features of the '<em>Advancement</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADVANCEMENT_FEATURE_COUNT = 1;

	/**
     * The number of operations of the '<em>Advancement</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ADVANCEMENT_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.IncreaseCharacterPartImpl <em>Increase Character Part</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.IncreaseCharacterPartImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getIncreaseCharacterPart()
     * @generated
     */
	int INCREASE_CHARACTER_PART = 29;

	/**
     * The feature id for the '<em><b>Karma Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INCREASE_CHARACTER_PART__KARMA_FACTOR = ADVANCEMENT__KARMA_FACTOR;

	/**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INCREASE_CHARACTER_PART__TYPE = ADVANCEMENT_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Increase Character Part</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INCREASE_CHARACTER_PART_FEATURE_COUNT = ADVANCEMENT_FEATURE_COUNT + 1;

	/**
     * The number of operations of the '<em>Increase Character Part</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int INCREASE_CHARACTER_PART_OPERATION_COUNT = ADVANCEMENT_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.LifestyleToStartMoneyImpl <em>Lifestyle To Start Money</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.LifestyleToStartMoneyImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getLifestyleToStartMoney()
     * @generated
     */
    int LIFESTYLE_TO_START_MONEY = 30;

    /**
     * The feature id for the '<em><b>Number Of W</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE_TO_START_MONEY__NUMBER_OF_W = 0;

    /**
     * The feature id for the '<em><b>Money Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE_TO_START_MONEY__MONEY_FACTOR = 1;

    /**
     * The feature id for the '<em><b>Life Styles</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE_TO_START_MONEY__LIFE_STYLES = 2;

    /**
     * The number of structural features of the '<em>Lifestyle To Start Money</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE_TO_START_MONEY_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Lifestyle To Start Money</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIFESTYLE_TO_START_MONEY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.GruntGroupImpl <em>Grunt Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.GruntGroupImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getGruntGroup()
     * @generated
     */
    int GRUNT_GROUP = 31;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_GROUP__BESCHREIBUNG = Shr5Package.BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_GROUP__IMAGE = Shr5Package.BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_GROUP__NAME = Shr5Package.BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_GROUP__MEMBERS = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Leader</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_GROUP__LEADER = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Professional Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_GROUP__PROFESSIONAL_RATING = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Grunt Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_GROUP_FEATURE_COUNT = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Grunt Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_GROUP_OPERATION_COUNT = Shr5Package.BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.GruntMembersImpl <em>Grunt Members</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.GruntMembersImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getGruntMembers()
     * @generated
     */
    int GRUNT_MEMBERS = 32;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_MEMBERS__COUNT = 0;

    /**
     * The feature id for the '<em><b>Nsc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_MEMBERS__NSC = 1;

    /**
     * The number of structural features of the '<em>Grunt Members</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_MEMBERS_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Grunt Members</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_MEMBERS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.PlayerManagementImpl <em>Player Management</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.PlayerManagementImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getPlayerManagement()
     * @generated
     */
    int PLAYER_MANAGEMENT = 33;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAYER_MANAGEMENT__BESCHREIBUNG = Shr5Package.BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAYER_MANAGEMENT__IMAGE = Shr5Package.BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAYER_MANAGEMENT__NAME = Shr5Package.BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Groups</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAYER_MANAGEMENT__GROUPS = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Generators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAYER_MANAGEMENT__GENERATORS = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Entries</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAYER_MANAGEMENT__ENTRIES = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Player Management</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAYER_MANAGEMENT_FEATURE_COUNT = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Player Management</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLAYER_MANAGEMENT_OPERATION_COUNT = Shr5Package.BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.GamemasterManagementImpl <em>Gamemaster Management</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.GamemasterManagementImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getGamemasterManagement()
     * @generated
     */
    int GAMEMASTER_MANAGEMENT = 34;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GAMEMASTER_MANAGEMENT__BESCHREIBUNG = PLAYER_MANAGEMENT__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GAMEMASTER_MANAGEMENT__IMAGE = PLAYER_MANAGEMENT__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GAMEMASTER_MANAGEMENT__NAME = PLAYER_MANAGEMENT__NAME;

    /**
     * The feature id for the '<em><b>Groups</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GAMEMASTER_MANAGEMENT__GROUPS = PLAYER_MANAGEMENT__GROUPS;

    /**
     * The feature id for the '<em><b>Generators</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GAMEMASTER_MANAGEMENT__GENERATORS = PLAYER_MANAGEMENT__GENERATORS;

    /**
     * The feature id for the '<em><b>Entries</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GAMEMASTER_MANAGEMENT__ENTRIES = PLAYER_MANAGEMENT__ENTRIES;

    /**
     * The feature id for the '<em><b>Grunts</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GAMEMASTER_MANAGEMENT__GRUNTS = PLAYER_MANAGEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Gamemaster Management</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GAMEMASTER_MANAGEMENT_FEATURE_COUNT = PLAYER_MANAGEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Gamemaster Management</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GAMEMASTER_MANAGEMENT_OPERATION_COUNT = PLAYER_MANAGEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.CharacterAdvancementSystemImpl <em>Character Advancement System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.CharacterAdvancementSystemImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getCharacterAdvancementSystem()
     * @generated
     */
    int CHARACTER_ADVANCEMENT_SYSTEM = 35;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_ADVANCEMENT_SYSTEM__BESCHREIBUNG = Shr5Package.BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_ADVANCEMENT_SYSTEM__IMAGE = Shr5Package.BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_ADVANCEMENT_SYSTEM__NAME = Shr5Package.BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Character Advancements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_ADVANCEMENT_SYSTEM__CHARACTER_ADVANCEMENTS = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Character Advancement System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_ADVANCEMENT_SYSTEM_FEATURE_COUNT = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Character Advancement System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHARACTER_ADVANCEMENT_SYSTEM_OPERATION_COUNT = Shr5Package.BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.impl.Shr5KarmaGeneratorImpl <em>Shr5 Karma Generator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5KarmaGeneratorImpl
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getShr5KarmaGenerator()
     * @generated
     */
    int SHR5_KARMA_GENERATOR = 37;

    /**
     * The feature id for the '<em><b>Character</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR__CHARACTER = SHR5_RULE_GENERATOR__CHARACTER;

    /**
     * The feature id for the '<em><b>Generator</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR__GENERATOR = SHR5_RULE_GENERATOR__GENERATOR;

    /**
     * The feature id for the '<em><b>State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR__STATE = SHR5_RULE_GENERATOR__STATE;

    /**
     * The feature id for the '<em><b>Selected Group</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR__SELECTED_GROUP = SHR5_RULE_GENERATOR__SELECTED_GROUP;

    /**
     * The feature id for the '<em><b>Character Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR__CHARACTER_NAME = SHR5_RULE_GENERATOR__CHARACTER_NAME;

    /**
     * The feature id for the '<em><b>Current Instruction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR__CURRENT_INSTRUCTION = SHR5_RULE_GENERATOR__CURRENT_INSTRUCTION;

    /**
     * The feature id for the '<em><b>Shr5 Generator</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR__SHR5_GENERATOR = SHR5_RULE_GENERATOR__SHR5_GENERATOR;

    /**
     * The feature id for the '<em><b>Meta Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR__META_TYPE = SHR5_RULE_GENERATOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Character Concept</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR__CHARACTER_CONCEPT = SHR5_RULE_GENERATOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Karma To Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR__KARMA_TO_RESOURCE = SHR5_RULE_GENERATOR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Karma Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR__KARMA_SPEND = SHR5_RULE_GENERATOR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Resource Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR__RESOURCE_SPEND = SHR5_RULE_GENERATOR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Start Karma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR__START_KARMA = SHR5_RULE_GENERATOR_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Start Resources</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR__START_RESOURCES = SHR5_RULE_GENERATOR_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Shr5 Karma Generator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR_FEATURE_COUNT = SHR5_RULE_GENERATOR_FEATURE_COUNT + 7;

    /**
     * The operation id for the '<em>Has Spend All Points</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR___HAS_SPEND_ALL_POINTS__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR___HAS_SPEND_ALL_POINTS__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Has Not More Max Attributes</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR___HAS_NOT_MORE_MAX_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR___HAS_NOT_MORE_MAX_ATTRIBUTES__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Has No Skills Over Max</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR___HAS_NO_SKILLS_OVER_MAX__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR___HAS_NO_SKILLS_OVER_MAX__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Has Not More Specalism</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR___HAS_NOT_MORE_SPECALISM__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR___HAS_NOT_MORE_SPECALISM__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Has No Attributes Over Species Att</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR___HAS_NO_ATTRIBUTES_OVER_SPECIES_ATT__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR___HAS_NO_ATTRIBUTES_OVER_SPECIES_ATT__DIAGNOSTICCHAIN_MAP;

    /**
     * The operation id for the '<em>Has Spend All Karma Points</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR___HAS_SPEND_ALL_KARMA_POINTS__DIAGNOSTICCHAIN_MAP = SHR5_RULE_GENERATOR_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Shr5 Karma Generator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SHR5_KARMA_GENERATOR_OPERATION_COUNT = SHR5_RULE_GENERATOR_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.GeneratorState <em>Generator State</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.GeneratorState
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getGeneratorState()
     * @generated
     */
	int GENERATOR_STATE = 38;


	/**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5Management.Sex <em>Sex</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.Sex
     * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getSex()
     * @generated
     */
	int SEX = 39;


	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter <em>Managed Character</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Managed Character</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter
     * @generated
     */
	EClass getManagedCharacter();

	/**
     * Returns the meta object for the containment reference '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getPersona <em>Persona</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Persona</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getPersona()
     * @see #getManagedCharacter()
     * @generated
     */
	EReference getManagedCharacter_Persona();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getChanges <em>Changes</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Changes</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getChanges()
     * @see #getManagedCharacter()
     * @generated
     */
	EReference getManagedCharacter_Changes();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getChracterSource <em>Chracter Source</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Chracter Source</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getChracterSource()
     * @see #getManagedCharacter()
     * @generated
     */
	EReference getManagedCharacter_ChracterSource();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getInventar <em>Inventar</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Inventar</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getInventar()
     * @see #getManagedCharacter()
     * @generated
     */
	EReference getManagedCharacter_Inventar();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getContracts <em>Contracts</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Contracts</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getContracts()
     * @see #getManagedCharacter()
     * @generated
     */
	EReference getManagedCharacter_Contracts();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getSex <em>Sex</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sex</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getSex()
     * @see #getManagedCharacter()
     * @generated
     */
	EAttribute getManagedCharacter_Sex();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getConnections <em>Connections</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Connections</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getConnections()
     * @see #getManagedCharacter()
     * @generated
     */
	EReference getManagedCharacter_Connections();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getVehicels <em>Vehicels</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Vehicels</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getVehicels()
     * @see #getManagedCharacter()
     * @generated
     */
	EReference getManagedCharacter_Vehicels();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getChoosenLifestyle <em>Choosen Lifestyle</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Choosen Lifestyle</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getChoosenLifestyle()
     * @see #getManagedCharacter()
     * @generated
     */
	EReference getManagedCharacter_ChoosenLifestyle();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getNativeLanguage <em>Native Language</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Native Language</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getNativeLanguage()
     * @see #getManagedCharacter()
     * @generated
     */
	EReference getManagedCharacter_NativeLanguage();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getStreetCred <em>Street Cred</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Street Cred</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getStreetCred()
     * @see #getManagedCharacter()
     * @generated
     */
	EAttribute getManagedCharacter_StreetCred();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getNotoriety <em>Notoriety</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Notoriety</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getNotoriety()
     * @see #getManagedCharacter()
     * @generated
     */
	EAttribute getManagedCharacter_Notoriety();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getNotorietyBasic <em>Notoriety Basic</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Notoriety Basic</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getNotorietyBasic()
     * @see #getManagedCharacter()
     * @generated
     */
	EAttribute getManagedCharacter_NotorietyBasic();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getPublicAwareness <em>Public Awareness</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Public Awareness</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getPublicAwareness()
     * @see #getManagedCharacter()
     * @generated
     */
	EAttribute getManagedCharacter_PublicAwareness();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getKarmaGaint <em>Karma Gaint</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Karma Gaint</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getKarmaGaint()
     * @see #getManagedCharacter()
     * @generated
     */
	EAttribute getManagedCharacter_KarmaGaint();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getCurrentKarma <em>Current Karma</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Current Karma</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getCurrentKarma()
     * @see #getManagedCharacter()
     * @generated
     */
    EAttribute getManagedCharacter_CurrentKarma();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getGeneratorSrc <em>Generator Src</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Generator Src</em>'.
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getGeneratorSrc()
     * @see #getManagedCharacter()
     * @generated
     */
    EReference getManagedCharacter_GeneratorSrc();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem <em>Character Generator System</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Character Generator System</em>'.
     * @see de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem
     * @generated
     */
	EClass getCharacterGeneratorSystem();

	/**
     * Returns the meta object for the map '{@link de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem#getInstructions <em>Instructions</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>Instructions</em>'.
     * @see de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem#getInstructions()
     * @see #getCharacterGeneratorSystem()
     * @generated
     */
	EReference getCharacterGeneratorSystem_Instructions();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem#getCharacterAdvancements <em>Character Advancements</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Character Advancements</em>'.
     * @see de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem#getCharacterAdvancements()
     * @see #getCharacterGeneratorSystem()
     * @generated
     */
	EReference getCharacterGeneratorSystem_CharacterAdvancements();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem#getLifestyleToStartMoney <em>Lifestyle To Start Money</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Lifestyle To Start Money</em>'.
     * @see de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem#getLifestyleToStartMoney()
     * @see #getCharacterGeneratorSystem()
     * @generated
     */
    EReference getCharacterGeneratorSystem_LifestyleToStartMoney();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.PrioritySystem <em>Priority System</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Priority System</em>'.
     * @see de.urszeidler.eclipse.shr5Management.PrioritySystem
     * @generated
     */
	EClass getPrioritySystem();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5Management.PrioritySystem#getPriorities <em>Priorities</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Priorities</em>'.
     * @see de.urszeidler.eclipse.shr5Management.PrioritySystem#getPriorities()
     * @see #getPrioritySystem()
     * @generated
     */
	EReference getPrioritySystem_Priorities();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.PrioritySystem#getKarmaPoints <em>Karma Points</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Karma Points</em>'.
     * @see de.urszeidler.eclipse.shr5Management.PrioritySystem#getKarmaPoints()
     * @see #getPrioritySystem()
     * @generated
     */
	EAttribute getPrioritySystem_KarmaPoints();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.NonPlayerCharacter <em>Non Player Character</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Non Player Character</em>'.
     * @see de.urszeidler.eclipse.shr5Management.NonPlayerCharacter
     * @generated
     */
	EClass getNonPlayerCharacter();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.Changes <em>Changes</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Changes</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Changes
     * @generated
     */
	EClass getChanges();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Changes#getDate <em>Date</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Changes#getDate()
     * @see #getChanges()
     * @generated
     */
	EAttribute getChanges_Date();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost <em>Karma Cost</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Karma Cost</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost()
     * @see #getChanges()
     * @generated
     */
    EAttribute getChanges_KarmaCost();

    /**
     * Returns the meta object for the container reference '{@link de.urszeidler.eclipse.shr5Management.Changes#getCharacter <em>Character</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Character</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Changes#getCharacter()
     * @see #getChanges()
     * @generated
     */
    EReference getChanges_Character();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Changes#isChangeApplied <em>Change Applied</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Change Applied</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Changes#isChangeApplied()
     * @see #getChanges()
     * @generated
     */
    EAttribute getChanges_ChangeApplied();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Changes#getDateApplied <em>Date Applied</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date Applied</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Changes#getDateApplied()
     * @see #getChanges()
     * @generated
     */
    EAttribute getChanges_DateApplied();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Changes#applyChanges() <em>Apply Changes</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Apply Changes</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Changes#applyChanges()
     * @generated
     */
    EOperation getChanges__ApplyChanges();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.KarmaGaint <em>Karma Gaint</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Karma Gaint</em>'.
     * @see de.urszeidler.eclipse.shr5Management.KarmaGaint
     * @generated
     */
	EClass getKarmaGaint();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.KarmaGaint#getKarma <em>Karma</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Karma</em>'.
     * @see de.urszeidler.eclipse.shr5Management.KarmaGaint#getKarma()
     * @see #getKarmaGaint()
     * @generated
     */
	EAttribute getKarmaGaint_Karma();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.FreeStyle <em>Free Style</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Free Style</em>'.
     * @see de.urszeidler.eclipse.shr5Management.FreeStyle
     * @generated
     */
	EClass getFreeStyle();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.PriorityCategorie <em>Priority Categorie</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Priority Categorie</em>'.
     * @see de.urszeidler.eclipse.shr5Management.PriorityCategorie
     * @generated
     */
	EClass getPriorityCategorie();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.PriorityCategorie#getCategorieName <em>Categorie Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Categorie Name</em>'.
     * @see de.urszeidler.eclipse.shr5Management.PriorityCategorie#getCategorieName()
     * @see #getPriorityCategorie()
     * @generated
     */
	EAttribute getPriorityCategorie_CategorieName();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.PriorityCategorie#getCost <em>Cost</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cost</em>'.
     * @see de.urszeidler.eclipse.shr5Management.PriorityCategorie#getCost()
     * @see #getPriorityCategorie()
     * @generated
     */
    EAttribute getPriorityCategorie_Cost();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.Shr5System <em>Shr5 System</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Shr5 System</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5System
     * @generated
     */
	EClass getShr5System();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKarmaToResourceFactor <em>Karma To Resource Factor</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Karma To Resource Factor</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5System#getKarmaToResourceFactor()
     * @see #getShr5System()
     * @generated
     */
	EAttribute getShr5System_KarmaToResourceFactor();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKarmaToMagicFactor <em>Karma To Magic Factor</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Karma To Magic Factor</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5System#getKarmaToMagicFactor()
     * @see #getShr5System()
     * @generated
     */
	EAttribute getShr5System_KarmaToMagicFactor();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getNumberOfMaxAttributes <em>Number Of Max Attributes</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number Of Max Attributes</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5System#getNumberOfMaxAttributes()
     * @see #getShr5System()
     * @generated
     */
	EAttribute getShr5System_NumberOfMaxAttributes();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKnowlegeSkillFactor <em>Knowlege Skill Factor</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Knowlege Skill Factor</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5System#getKnowlegeSkillFactor()
     * @see #getShr5System()
     * @generated
     */
	EAttribute getShr5System_KnowlegeSkillFactor();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getCharismaToConnectionFactor <em>Charisma To Connection Factor</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Charisma To Connection Factor</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5System#getCharismaToConnectionFactor()
     * @see #getShr5System()
     * @generated
     */
	EAttribute getShr5System_CharismaToConnectionFactor();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getMaxResourceToKeep <em>Max Resource To Keep</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Resource To Keep</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5System#getMaxResourceToKeep()
     * @see #getShr5System()
     * @generated
     */
    EAttribute getShr5System_MaxResourceToKeep();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getMaxKarmaToResources <em>Max Karma To Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Karma To Resources</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5System#getMaxKarmaToResources()
     * @see #getShr5System()
     * @generated
     */
    EAttribute getShr5System_MaxKarmaToResources();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getMaxKarmaToKeep <em>Max Karma To Keep</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Karma To Keep</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5System#getMaxKarmaToKeep()
     * @see #getShr5System()
     * @generated
     */
    EAttribute getShr5System_MaxKarmaToKeep();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getSkillMax <em>Skill Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Skill Max</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5System#getSkillMax()
     * @see #getShr5System()
     * @generated
     */
    EAttribute getShr5System_SkillMax();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getNumberOfSpecalism <em>Number Of Specalism</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number Of Specalism</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5System#getNumberOfSpecalism()
     * @see #getShr5System()
     * @generated
     */
    EAttribute getShr5System_NumberOfSpecalism();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getKarmaToConnectionFactor <em>Karma To Connection Factor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Karma To Connection Factor</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5System#getKarmaToConnectionFactor()
     * @see #getShr5System()
     * @generated
     */
    EAttribute getShr5System_KarmaToConnectionFactor();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5System#getBoundSprititServiceCost <em>Bound Spritit Service Cost</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Bound Spritit Service Cost</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5System#getBoundSprititServiceCost()
     * @see #getShr5System()
     * @generated
     */
    EAttribute getShr5System_BoundSprititServiceCost();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.MetaType <em>Meta Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Meta Type</em>'.
     * @see de.urszeidler.eclipse.shr5Management.MetaType
     * @generated
     */
	EClass getMetaType();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.MetaType#getChoosableTypes <em>Choosable Types</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Choosable Types</em>'.
     * @see de.urszeidler.eclipse.shr5Management.MetaType#getChoosableTypes()
     * @see #getMetaType()
     * @generated
     */
	EReference getMetaType_ChoosableTypes();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.MetaType#getSpecialPoints <em>Special Points</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Special Points</em>'.
     * @see de.urszeidler.eclipse.shr5Management.MetaType#getSpecialPoints()
     * @see #getMetaType()
     * @generated
     */
	EAttribute getMetaType_SpecialPoints();

	/**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.MetaType#calcSpecialPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Special Points Spend</em>}' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the '<em>Calc Special Points Spend</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.MetaType#calcSpecialPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
     * @generated
     */
	EOperation getMetaType__CalcSpecialPointsSpend__ManagedCharacter();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.Attributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attributes</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Attributes
     * @generated
     */
	EClass getAttributes();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Attributes#getAttibutePoints <em>Attibute Points</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attibute Points</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Attributes#getAttibutePoints()
     * @see #getAttributes()
     * @generated
     */
	EAttribute getAttributes_AttibutePoints();

	/**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Attributes#calcAttributesSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Attributes Spend</em>}' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the '<em>Calc Attributes Spend</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Attributes#calcAttributesSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
     * @generated
     */
	EOperation getAttributes__CalcAttributesSpend__ManagedCharacter();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.Skill <em>Skill</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Skill</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Skill
     * @generated
     */
	EClass getSkill();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Skill#getSkillPoints <em>Skill Points</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Skill Points</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Skill#getSkillPoints()
     * @see #getSkill()
     * @generated
     */
	EAttribute getSkill_SkillPoints();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Skill#getGroupPoints <em>Group Points</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group Points</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Skill#getGroupPoints()
     * @see #getSkill()
     * @generated
     */
	EAttribute getSkill_GroupPoints();

	/**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Skill#calcSkillSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Skill Spend</em>}' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the '<em>Calc Skill Spend</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Skill#calcSkillSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
     * @generated
     */
	EOperation getSkill__CalcSkillSpend__ManagedCharacter();

	/**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Skill#calcGroupSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Group Spend</em>}' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the '<em>Calc Group Spend</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Skill#calcGroupSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
     * @generated
     */
	EOperation getSkill__CalcGroupSpend__ManagedCharacter();

	/**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Skill#calcKnowledgeSkillSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Knowledge Skill Spend</em>}' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the '<em>Calc Knowledge Skill Spend</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Skill#calcKnowledgeSkillSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
     * @generated
     */
	EOperation getSkill__CalcKnowledgeSkillSpend__ManagedCharacter();

	/**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Skill#calcKnowledgeSkillPoints(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Knowledge Skill Points</em>}' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the '<em>Calc Knowledge Skill Points</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Skill#calcKnowledgeSkillPoints(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
     * @generated
     */
	EOperation getSkill__CalcKnowledgeSkillPoints__ManagedCharacter();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.Resourcen <em>Resourcen</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resourcen</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Resourcen
     * @generated
     */
	EClass getResourcen();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Resourcen#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Resourcen#getResource()
     * @see #getResourcen()
     * @generated
     */
	EAttribute getResourcen_Resource();

	/**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Resourcen#calcResourceSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Resource Spend</em>}' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the '<em>Calc Resource Spend</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Resourcen#calcResourceSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
     * @generated
     */
	EOperation getResourcen__CalcResourceSpend__ManagedCharacter();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.SpecialType <em>Special Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Special Type</em>'.
     * @see de.urszeidler.eclipse.shr5Management.SpecialType
     * @generated
     */
	EClass getSpecialType();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.SpecialType#getSelectableTypes <em>Selectable Types</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Selectable Types</em>'.
     * @see de.urszeidler.eclipse.shr5Management.SpecialType#getSelectableTypes()
     * @see #getSpecialType()
     * @generated
     */
	EReference getSpecialType_SelectableTypes();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.SpecialType#getSkillValue <em>Skill Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Skill Value</em>'.
     * @see de.urszeidler.eclipse.shr5Management.SpecialType#getSkillValue()
     * @see #getSpecialType()
     * @generated
     */
	EAttribute getSpecialType_SkillValue();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.SpecialType#getSkillNumber <em>Skill Number</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Skill Number</em>'.
     * @see de.urszeidler.eclipse.shr5Management.SpecialType#getSkillNumber()
     * @see #getSpecialType()
     * @generated
     */
	EAttribute getSpecialType_SkillNumber();

	/**
     * Returns the meta object for the reference list '{@link de.urszeidler.eclipse.shr5Management.SpecialType#getSelectableSkills <em>Selectable Skills</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Selectable Skills</em>'.
     * @see de.urszeidler.eclipse.shr5Management.SpecialType#getSelectableSkills()
     * @see #getSpecialType()
     * @generated
     */
	EReference getSpecialType_SelectableSkills();

	/**
     * Returns the meta object for the reference list '{@link de.urszeidler.eclipse.shr5Management.SpecialType#getSelectableSkillGroups <em>Selectable Skill Groups</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Selectable Skill Groups</em>'.
     * @see de.urszeidler.eclipse.shr5Management.SpecialType#getSelectableSkillGroups()
     * @see #getSpecialType()
     * @generated
     */
	EReference getSpecialType_SelectableSkillGroups();

	/**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.SpecialType#calcSkillsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Skills Spend</em>}' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the '<em>Calc Skills Spend</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.SpecialType#calcSkillsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
     * @generated
     */
	EOperation getSpecialType__CalcSkillsSpend__ManagedCharacter();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.Technomancer <em>Technomancer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Technomancer</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Technomancer
     * @generated
     */
	EClass getTechnomancer();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Technomancer#getResonanz <em>Resonanz</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resonanz</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Technomancer#getResonanz()
     * @see #getTechnomancer()
     * @generated
     */
	EAttribute getTechnomancer_Resonanz();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Technomancer#getComplexForms <em>Complex Forms</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Complex Forms</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Technomancer#getComplexForms()
     * @see #getTechnomancer()
     * @generated
     */
	EAttribute getTechnomancer_ComplexForms();

	/**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Technomancer#calcComplexFormsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Complex Forms Spend</em>}' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the '<em>Calc Complex Forms Spend</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Technomancer#calcComplexFormsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
     * @generated
     */
	EOperation getTechnomancer__CalcComplexFormsSpend__ManagedCharacter();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.Spellcaster <em>Spellcaster</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Spellcaster</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Spellcaster
     * @generated
     */
	EClass getSpellcaster();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Spellcaster#getSpellPoints <em>Spell Points</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Spell Points</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Spellcaster#getSpellPoints()
     * @see #getSpellcaster()
     * @generated
     */
	EAttribute getSpellcaster_SpellPoints();

	/**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Spellcaster#calcSpellPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Spell Points Spend</em>}' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the '<em>Calc Spell Points Spend</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Spellcaster#calcSpellPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
     * @generated
     */
	EOperation getSpellcaster__CalcSpellPointsSpend__ManagedCharacter();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.Adept <em>Adept</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Adept</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Adept
     * @generated
     */
	EClass getAdept();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Adept#getMagic <em>Magic</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Magic</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Adept#getMagic()
     * @see #getAdept()
     * @generated
     */
	EAttribute getAdept_Magic();

	/**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Adept#calcPowerPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Power Points Spend</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Calc Power Points Spend</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Adept#calcPowerPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
     * @generated
     */
    EOperation getAdept__CalcPowerPointsSpend__ManagedCharacter();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator <em>Character Generator</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Character Generator</em>'.
     * @see de.urszeidler.eclipse.shr5Management.CharacterGenerator
     * @generated
     */
	EClass getCharacterGenerator();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getCharacter <em>Character</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Character</em>'.
     * @see de.urszeidler.eclipse.shr5Management.CharacterGenerator#getCharacter()
     * @see #getCharacterGenerator()
     * @generated
     */
	EReference getCharacterGenerator_Character();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getGenerator <em>Generator</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Generator</em>'.
     * @see de.urszeidler.eclipse.shr5Management.CharacterGenerator#getGenerator()
     * @see #getCharacterGenerator()
     * @generated
     */
	EReference getCharacterGenerator_Generator();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getState <em>State</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>State</em>'.
     * @see de.urszeidler.eclipse.shr5Management.CharacterGenerator#getState()
     * @see #getCharacterGenerator()
     * @generated
     */
	EAttribute getCharacterGenerator_State();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getSelectedGroup <em>Selected Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Selected Group</em>'.
     * @see de.urszeidler.eclipse.shr5Management.CharacterGenerator#getSelectedGroup()
     * @see #getCharacterGenerator()
     * @generated
     */
	EReference getCharacterGenerator_SelectedGroup();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getCharacterName <em>Character Name</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Character Name</em>'.
     * @see de.urszeidler.eclipse.shr5Management.CharacterGenerator#getCharacterName()
     * @see #getCharacterGenerator()
     * @generated
     */
	EAttribute getCharacterGenerator_CharacterName();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getCurrentInstruction <em>Current Instruction</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Current Instruction</em>'.
     * @see de.urszeidler.eclipse.shr5Management.CharacterGenerator#getCurrentInstruction()
     * @see #getCharacterGenerator()
     * @generated
     */
	EAttribute getCharacterGenerator_CurrentInstruction();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator <em>Free Style Generator</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Free Style Generator</em>'.
     * @see de.urszeidler.eclipse.shr5Management.FreeStyleGenerator
     * @generated
     */
	EClass getFreeStyleGenerator();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getFreestyleGenerator <em>Freestyle Generator</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Freestyle Generator</em>'.
     * @see de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getFreestyleGenerator()
     * @see #getFreeStyleGenerator()
     * @generated
     */
	EReference getFreeStyleGenerator_FreestyleGenerator();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getSelectedPersona <em>Selected Persona</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Selected Persona</em>'.
     * @see de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getSelectedPersona()
     * @see #getFreeStyleGenerator()
     * @generated
     */
    EReference getFreeStyleGenerator_SelectedPersona();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getSelectedSpecies <em>Selected Species</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Selected Species</em>'.
     * @see de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getSelectedSpecies()
     * @see #getFreeStyleGenerator()
     * @generated
     */
    EReference getFreeStyleGenerator_SelectedSpecies();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getSelectedType <em>Selected Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Selected Type</em>'.
     * @see de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getSelectedType()
     * @see #getFreeStyleGenerator()
     * @generated
     */
    EReference getFreeStyleGenerator_SelectedType();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator <em>Shr5 Generator</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Shr5 Generator</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator
     * @generated
     */
	EClass getShr5Generator();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getResourcen <em>Resourcen</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Resourcen</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getResourcen()
     * @see #getShr5Generator()
     * @generated
     */
	EReference getShr5Generator_Resourcen();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSkills <em>Skills</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Skills</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getSkills()
     * @see #getShr5Generator()
     * @generated
     */
	EReference getShr5Generator_Skills();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Attribute</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getAttribute()
     * @see #getShr5Generator()
     * @generated
     */
	EReference getShr5Generator_Attribute();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getMetaType <em>Meta Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Meta Type</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getMetaType()
     * @see #getShr5Generator()
     * @generated
     */
	EReference getShr5Generator_MetaType();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getMagic <em>Magic</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Magic</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getMagic()
     * @see #getShr5Generator()
     * @generated
     */
	EReference getShr5Generator_Magic();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getKarmaToResource <em>Karma To Resource</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Karma To Resource</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getKarmaToResource()
     * @see #getShr5Generator()
     * @generated
     */
	EAttribute getShr5Generator_KarmaToResource();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getKarmaSpend <em>Karma Spend</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Karma Spend</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getKarmaSpend()
     * @see #getShr5Generator()
     * @generated
     */
	EAttribute getShr5Generator_KarmaSpend();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getAttributeSpend <em>Attribute Spend</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attribute Spend</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getAttributeSpend()
     * @see #getShr5Generator()
     * @generated
     */
    EAttribute getShr5Generator_AttributeSpend();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getResourceSpend <em>Resource Spend</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource Spend</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getResourceSpend()
     * @see #getShr5Generator()
     * @generated
     */
    EAttribute getShr5Generator_ResourceSpend();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getConnectionSpend <em>Connection Spend</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connection Spend</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getConnectionSpend()
     * @see #getShr5Generator()
     * @generated
     */
    EAttribute getShr5Generator_ConnectionSpend();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSkillPointSpend <em>Skill Point Spend</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Skill Point Spend</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getSkillPointSpend()
     * @see #getShr5Generator()
     * @generated
     */
    EAttribute getShr5Generator_SkillPointSpend();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpecialPointSpend <em>Special Point Spend</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Special Point Spend</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpecialPointSpend()
     * @see #getShr5Generator()
     * @generated
     */
    EAttribute getShr5Generator_SpecialPointSpend();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getGroupPointSpend <em>Group Point Spend</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Group Point Spend</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getGroupPointSpend()
     * @see #getShr5Generator()
     * @generated
     */
    EAttribute getShr5Generator_GroupPointSpend();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getKnownlegePointSpend <em>Knownlege Point Spend</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Knownlege Point Spend</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getKnownlegePointSpend()
     * @see #getShr5Generator()
     * @generated
     */
    EAttribute getShr5Generator_KnownlegePointSpend();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpellPointSpend <em>Spell Point Spend</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Spell Point Spend</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpellPointSpend()
     * @see #getShr5Generator()
     * @generated
     */
    EAttribute getShr5Generator_SpellPointSpend();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getStartKarma <em>Start Karma</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Start Karma</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getStartKarma()
     * @see #getShr5Generator()
     * @generated
     */
    EAttribute getShr5Generator_StartKarma();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getStartResources <em>Start Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Start Resources</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getStartResources()
     * @see #getShr5Generator()
     * @generated
     */
    EAttribute getShr5Generator_StartResources();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasCategoryOnlyOnce(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Category Only Once</em>}' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Category Only Once</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasCategoryOnlyOnce(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
	EOperation getShr5Generator__HasCategoryOnlyOnce__DiagnosticChain_Map();

	/**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasNotMoreMaxAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Not More Max Attributes</em>}' operation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Not More Max Attributes</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasNotMoreMaxAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
	EOperation getShr5Generator__HasNotMoreMaxAttributes__DiagnosticChain_Map();

	/**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllAttributesPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Attributes Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Spend All Attributes Points</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllAttributesPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5Generator__HasSpendAllAttributesPoints__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSkillPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Skill Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Spend All Skill Points</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSkillPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5Generator__HasSpendAllSkillPoints__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpecialPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Special Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Spend All Special Points</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpecialPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5Generator__HasSpendAllSpecialPoints__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpecialTypePoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Special Type Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Spend All Special Type Points</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpecialTypePoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5Generator__HasSpendAllSpecialTypePoints__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllConnectionPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Connection Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Spend All Connection Points</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllConnectionPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5Generator__HasSpendAllConnectionPoints__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllResourcePoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Resource Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Spend All Resource Points</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllResourcePoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5Generator__HasSpendAllResourcePoints__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllMagicSkillsPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Magic Skills Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Spend All Magic Skills Points</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllMagicSkillsPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5Generator__HasSpendAllMagicSkillsPoints__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllMagicPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Magic Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Spend All Magic Points</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllMagicPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5Generator__HasSpendAllMagicPoints__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllGroupPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Group Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Spend All Group Points</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllGroupPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5Generator__HasSpendAllGroupPoints__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllKnowlegeSkillPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Knowlege Skill Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Spend All Knowlege Skill Points</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllKnowlegeSkillPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5Generator__HasSpendAllKnowlegeSkillPoints__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllKarmaPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Karma Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Spend All Karma Points</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllKarmaPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5Generator__HasSpendAllKarmaPoints__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpellPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Spell Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Spend All Spell Points</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpellPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5Generator__HasSpendAllSpellPoints__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllPowerPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Power Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Spend All Power Points</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllPowerPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5Generator__HasSpendAllPowerPoints__DiagnosticChain_Map();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.AttributeChange <em>Attribute Change</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Change</em>'.
     * @see de.urszeidler.eclipse.shr5Management.AttributeChange
     * @generated
     */
	EClass getAttributeChange();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.AttributeChange#getAttibute <em>Attibute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Attibute</em>'.
     * @see de.urszeidler.eclipse.shr5Management.AttributeChange#getAttibute()
     * @see #getAttributeChange()
     * @generated
     */
    EReference getAttributeChange_Attibute();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.PlayerCharacter <em>Player Character</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Player Character</em>'.
     * @see de.urszeidler.eclipse.shr5Management.PlayerCharacter
     * @generated
     */
	EClass getPlayerCharacter();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.Mudan <em>Mudan</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mudan</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Mudan
     * @generated
     */
	EClass getMudan();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.CharacterGroup <em>Character Group</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Character Group</em>'.
     * @see de.urszeidler.eclipse.shr5Management.CharacterGroup
     * @generated
     */
	EClass getCharacterGroup();

	/**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5Management.CharacterGroup#getMembers <em>Members</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Members</em>'.
     * @see de.urszeidler.eclipse.shr5Management.CharacterGroup#getMembers()
     * @see #getCharacterGroup()
     * @generated
     */
	EReference getCharacterGroup_Members();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.Connection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connection</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Connection
     * @generated
     */
	EClass getConnection();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Connection#getInfluence <em>Influence</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Influence</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Connection#getInfluence()
     * @see #getConnection()
     * @generated
     */
	EAttribute getConnection_Influence();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Connection#getLoyality <em>Loyality</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Loyality</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Connection#getLoyality()
     * @see #getConnection()
     * @generated
     */
	EAttribute getConnection_Loyality();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.Connection#getCharacter <em>Character</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Character</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Connection#getCharacter()
     * @see #getConnection()
     * @generated
     */
	EReference getConnection_Character();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.PersonaChange <em>Persona Change</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Persona Change</em>'.
     * @see de.urszeidler.eclipse.shr5Management.PersonaChange
     * @generated
     */
    EClass getPersonaChange();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.PersonaChange#getChangeable <em>Changeable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Changeable</em>'.
     * @see de.urszeidler.eclipse.shr5Management.PersonaChange#getChangeable()
     * @see #getPersonaChange()
     * @generated
     */
    EReference getPersonaChange_Changeable();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.PersonaValueChange <em>Persona Value Change</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Persona Value Change</em>'.
     * @see de.urszeidler.eclipse.shr5Management.PersonaValueChange
     * @generated
     */
	EClass getPersonaValueChange();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.PersonaValueChange#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>From</em>'.
     * @see de.urszeidler.eclipse.shr5Management.PersonaValueChange#getFrom()
     * @see #getPersonaValueChange()
     * @generated
     */
	EAttribute getPersonaValueChange_From();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.PersonaValueChange#getTo <em>To</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>To</em>'.
     * @see de.urszeidler.eclipse.shr5Management.PersonaValueChange#getTo()
     * @see #getPersonaValueChange()
     * @generated
     */
	EAttribute getPersonaValueChange_To();

	/**
     * Returns the meta object for class '{@link java.util.Map.Entry <em>Generator State To EString Map Entry</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generator State To EString Map Entry</em>'.
     * @see java.util.Map.Entry
     * @model keyDataType="de.urszeidler.eclipse.shr5Management.GeneratorState" keyRequired="true"
     *        valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true"
     * @generated
     */
	EClass getGeneratorStateToEStringMapEntry();

	/**
     * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see java.util.Map.Entry
     * @see #getGeneratorStateToEStringMapEntry()
     * @generated
     */
	EAttribute getGeneratorStateToEStringMapEntry_Key();

	/**
     * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see java.util.Map.Entry
     * @see #getGeneratorStateToEStringMapEntry()
     * @generated
     */
	EAttribute getGeneratorStateToEStringMapEntry_Value();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.Advancement <em>Advancement</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Advancement</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Advancement
     * @generated
     */
	EClass getAdvancement();

	/**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Advancement#getKarmaFactor <em>Karma Factor</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Karma Factor</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Advancement#getKarmaFactor()
     * @see #getAdvancement()
     * @generated
     */
	EAttribute getAdvancement_KarmaFactor();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart <em>Increase Character Part</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Increase Character Part</em>'.
     * @see de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart
     * @generated
     */
	EClass getIncreaseCharacterPart();

	/**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart#getType()
     * @see #getIncreaseCharacterPart()
     * @generated
     */
	EReference getIncreaseCharacterPart_Type();

	/**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney <em>Lifestyle To Start Money</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Lifestyle To Start Money</em>'.
     * @see de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney
     * @generated
     */
    EClass getLifestyleToStartMoney();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney#getNumberOfW <em>Number Of W</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number Of W</em>'.
     * @see de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney#getNumberOfW()
     * @see #getLifestyleToStartMoney()
     * @generated
     */
    EAttribute getLifestyleToStartMoney_NumberOfW();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney#getMoneyFactor <em>Money Factor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Money Factor</em>'.
     * @see de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney#getMoneyFactor()
     * @see #getLifestyleToStartMoney()
     * @generated
     */
    EAttribute getLifestyleToStartMoney_MoneyFactor();

    /**
     * Returns the meta object for the reference list '{@link de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney#getLifeStyles <em>Life Styles</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Life Styles</em>'.
     * @see de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney#getLifeStyles()
     * @see #getLifestyleToStartMoney()
     * @generated
     */
    EReference getLifestyleToStartMoney_LifeStyles();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.GruntGroup <em>Grunt Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Grunt Group</em>'.
     * @see de.urszeidler.eclipse.shr5Management.GruntGroup
     * @generated
     */
    EClass getGruntGroup();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5Management.GruntGroup#getMembers <em>Members</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Members</em>'.
     * @see de.urszeidler.eclipse.shr5Management.GruntGroup#getMembers()
     * @see #getGruntGroup()
     * @generated
     */
    EReference getGruntGroup_Members();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.eclipse.shr5Management.GruntGroup#getLeader <em>Leader</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Leader</em>'.
     * @see de.urszeidler.eclipse.shr5Management.GruntGroup#getLeader()
     * @see #getGruntGroup()
     * @generated
     */
    EReference getGruntGroup_Leader();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.GruntGroup#getProfessionalRating <em>Professional Rating</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Professional Rating</em>'.
     * @see de.urszeidler.eclipse.shr5Management.GruntGroup#getProfessionalRating()
     * @see #getGruntGroup()
     * @generated
     */
    EAttribute getGruntGroup_ProfessionalRating();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.GruntMembers <em>Grunt Members</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Grunt Members</em>'.
     * @see de.urszeidler.eclipse.shr5Management.GruntMembers
     * @generated
     */
    EClass getGruntMembers();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.GruntMembers#getCount <em>Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Count</em>'.
     * @see de.urszeidler.eclipse.shr5Management.GruntMembers#getCount()
     * @see #getGruntMembers()
     * @generated
     */
    EAttribute getGruntMembers_Count();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.GruntMembers#getNsc <em>Nsc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Nsc</em>'.
     * @see de.urszeidler.eclipse.shr5Management.GruntMembers#getNsc()
     * @see #getGruntMembers()
     * @generated
     */
    EReference getGruntMembers_Nsc();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.PlayerManagement <em>Player Management</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Player Management</em>'.
     * @see de.urszeidler.eclipse.shr5Management.PlayerManagement
     * @generated
     */
    EClass getPlayerManagement();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5Management.PlayerManagement#getGroups <em>Groups</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Groups</em>'.
     * @see de.urszeidler.eclipse.shr5Management.PlayerManagement#getGroups()
     * @see #getPlayerManagement()
     * @generated
     */
    EReference getPlayerManagement_Groups();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5Management.PlayerManagement#getGenerators <em>Generators</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Generators</em>'.
     * @see de.urszeidler.eclipse.shr5Management.PlayerManagement#getGenerators()
     * @see #getPlayerManagement()
     * @generated
     */
    EReference getPlayerManagement_Generators();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5Management.PlayerManagement#getEntries <em>Entries</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entries</em>'.
     * @see de.urszeidler.eclipse.shr5Management.PlayerManagement#getEntries()
     * @see #getPlayerManagement()
     * @generated
     */
    EReference getPlayerManagement_Entries();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.GamemasterManagement <em>Gamemaster Management</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gamemaster Management</em>'.
     * @see de.urszeidler.eclipse.shr5Management.GamemasterManagement
     * @generated
     */
    EClass getGamemasterManagement();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5Management.GamemasterManagement#getGrunts <em>Grunts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Grunts</em>'.
     * @see de.urszeidler.eclipse.shr5Management.GamemasterManagement#getGrunts()
     * @see #getGamemasterManagement()
     * @generated
     */
    EReference getGamemasterManagement_Grunts();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.CharacterAdvancementSystem <em>Character Advancement System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Character Advancement System</em>'.
     * @see de.urszeidler.eclipse.shr5Management.CharacterAdvancementSystem
     * @generated
     */
    EClass getCharacterAdvancementSystem();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5Management.CharacterAdvancementSystem#getCharacterAdvancements <em>Character Advancements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Character Advancements</em>'.
     * @see de.urszeidler.eclipse.shr5Management.CharacterAdvancementSystem#getCharacterAdvancements()
     * @see #getCharacterAdvancementSystem()
     * @generated
     */
    EReference getCharacterAdvancementSystem_CharacterAdvancements();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator <em>Shr5 Rule Generator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Shr5 Rule Generator</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator
     * @generated
     */
    EClass getShr5RuleGenerator();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#getShr5Generator <em>Shr5 Generator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Shr5 Generator</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#getShr5Generator()
     * @see #getShr5RuleGenerator()
     * @generated
     */
    EReference getShr5RuleGenerator_Shr5Generator();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasSpendAllPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Spend All Points</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasSpendAllPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5RuleGenerator__HasSpendAllPoints__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNotMoreMaxAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Not More Max Attributes</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Not More Max Attributes</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNotMoreMaxAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5RuleGenerator__HasNotMoreMaxAttributes__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNoSkillsOverMax(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has No Skills Over Max</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has No Skills Over Max</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNoSkillsOverMax(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5RuleGenerator__HasNoSkillsOverMax__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNotMoreSpecalism(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Not More Specalism</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Not More Specalism</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNotMoreSpecalism(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5RuleGenerator__HasNotMoreSpecalism__DiagnosticChain_Map();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNoAttributesOverSpeciesAtt(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has No Attributes Over Species Att</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has No Attributes Over Species Att</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNoAttributesOverSpeciesAtt(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5RuleGenerator__HasNoAttributesOverSpeciesAtt__DiagnosticChain_Map();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator <em>Shr5 Karma Generator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Shr5 Karma Generator</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator
     * @generated
     */
    EClass getShr5KarmaGenerator();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getMetaType <em>Meta Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Meta Type</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getMetaType()
     * @see #getShr5KarmaGenerator()
     * @generated
     */
    EReference getShr5KarmaGenerator_MetaType();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getCharacterConcept <em>Character Concept</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Character Concept</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getCharacterConcept()
     * @see #getShr5KarmaGenerator()
     * @generated
     */
    EReference getShr5KarmaGenerator_CharacterConcept();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaToResource <em>Karma To Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Karma To Resource</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaToResource()
     * @see #getShr5KarmaGenerator()
     * @generated
     */
    EAttribute getShr5KarmaGenerator_KarmaToResource();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend <em>Karma Spend</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Karma Spend</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @see #getShr5KarmaGenerator()
     * @generated
     */
    EAttribute getShr5KarmaGenerator_KarmaSpend();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getResourceSpend <em>Resource Spend</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource Spend</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getResourceSpend()
     * @see #getShr5KarmaGenerator()
     * @generated
     */
    EAttribute getShr5KarmaGenerator_ResourceSpend();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getStartKarma <em>Start Karma</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Start Karma</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getStartKarma()
     * @see #getShr5KarmaGenerator()
     * @generated
     */
    EAttribute getShr5KarmaGenerator_StartKarma();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getStartResources <em>Start Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Start Resources</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getStartResources()
     * @see #getShr5KarmaGenerator()
     * @generated
     */
    EAttribute getShr5KarmaGenerator_StartResources();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#hasSpendAllKarmaPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Karma Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Spend All Karma Points</em>' operation.
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#hasSpendAllKarmaPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated
     */
    EOperation getShr5KarmaGenerator__HasSpendAllKarmaPoints__DiagnosticChain_Map();

    /**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5Management.GeneratorState <em>Generator State</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Generator State</em>'.
     * @see de.urszeidler.eclipse.shr5Management.GeneratorState
     * @generated
     */
	EEnum getGeneratorState();

	/**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5Management.Sex <em>Sex</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Sex</em>'.
     * @see de.urszeidler.eclipse.shr5Management.Sex
     * @generated
     */
	EEnum getSex();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	Shr5managementFactory getShr5managementFactory();

	/**
     * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
     * @generated
     */
	interface Literals {
		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl <em>Managed Character</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getManagedCharacter()
         * @generated
         */
		EClass MANAGED_CHARACTER = eINSTANCE.getManagedCharacter();

		/**
         * The meta object literal for the '<em><b>Persona</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MANAGED_CHARACTER__PERSONA = eINSTANCE.getManagedCharacter_Persona();

		/**
         * The meta object literal for the '<em><b>Changes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MANAGED_CHARACTER__CHANGES = eINSTANCE.getManagedCharacter_Changes();

		/**
         * The meta object literal for the '<em><b>Chracter Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MANAGED_CHARACTER__CHRACTER_SOURCE = eINSTANCE.getManagedCharacter_ChracterSource();

		/**
         * The meta object literal for the '<em><b>Inventar</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MANAGED_CHARACTER__INVENTAR = eINSTANCE.getManagedCharacter_Inventar();

		/**
         * The meta object literal for the '<em><b>Contracts</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MANAGED_CHARACTER__CONTRACTS = eINSTANCE.getManagedCharacter_Contracts();

		/**
         * The meta object literal for the '<em><b>Sex</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute MANAGED_CHARACTER__SEX = eINSTANCE.getManagedCharacter_Sex();

		/**
         * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MANAGED_CHARACTER__CONNECTIONS = eINSTANCE.getManagedCharacter_Connections();

		/**
         * The meta object literal for the '<em><b>Vehicels</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MANAGED_CHARACTER__VEHICELS = eINSTANCE.getManagedCharacter_Vehicels();

		/**
         * The meta object literal for the '<em><b>Choosen Lifestyle</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MANAGED_CHARACTER__CHOOSEN_LIFESTYLE = eINSTANCE.getManagedCharacter_ChoosenLifestyle();

		/**
         * The meta object literal for the '<em><b>Native Language</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MANAGED_CHARACTER__NATIVE_LANGUAGE = eINSTANCE.getManagedCharacter_NativeLanguage();

		/**
         * The meta object literal for the '<em><b>Street Cred</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute MANAGED_CHARACTER__STREET_CRED = eINSTANCE.getManagedCharacter_StreetCred();

		/**
         * The meta object literal for the '<em><b>Notoriety</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute MANAGED_CHARACTER__NOTORIETY = eINSTANCE.getManagedCharacter_Notoriety();

		/**
         * The meta object literal for the '<em><b>Notoriety Basic</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute MANAGED_CHARACTER__NOTORIETY_BASIC = eINSTANCE.getManagedCharacter_NotorietyBasic();

		/**
         * The meta object literal for the '<em><b>Public Awareness</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute MANAGED_CHARACTER__PUBLIC_AWARENESS = eINSTANCE.getManagedCharacter_PublicAwareness();

		/**
         * The meta object literal for the '<em><b>Karma Gaint</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute MANAGED_CHARACTER__KARMA_GAINT = eINSTANCE.getManagedCharacter_KarmaGaint();

		/**
         * The meta object literal for the '<em><b>Current Karma</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MANAGED_CHARACTER__CURRENT_KARMA = eINSTANCE.getManagedCharacter_CurrentKarma();

        /**
         * The meta object literal for the '<em><b>Generator Src</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MANAGED_CHARACTER__GENERATOR_SRC = eINSTANCE.getManagedCharacter_GeneratorSrc();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorSystemImpl <em>Character Generator System</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorSystemImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getCharacterGeneratorSystem()
         * @generated
         */
		EClass CHARACTER_GENERATOR_SYSTEM = eINSTANCE.getCharacterGeneratorSystem();

		/**
         * The meta object literal for the '<em><b>Instructions</b></em>' map feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CHARACTER_GENERATOR_SYSTEM__INSTRUCTIONS = eINSTANCE.getCharacterGeneratorSystem_Instructions();

		/**
         * The meta object literal for the '<em><b>Character Advancements</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CHARACTER_GENERATOR_SYSTEM__CHARACTER_ADVANCEMENTS = eINSTANCE.getCharacterGeneratorSystem_CharacterAdvancements();

		/**
         * The meta object literal for the '<em><b>Lifestyle To Start Money</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CHARACTER_GENERATOR_SYSTEM__LIFESTYLE_TO_START_MONEY = eINSTANCE.getCharacterGeneratorSystem_LifestyleToStartMoney();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.PrioritySystemImpl <em>Priority System</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.PrioritySystemImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getPrioritySystem()
         * @generated
         */
		EClass PRIORITY_SYSTEM = eINSTANCE.getPrioritySystem();

		/**
         * The meta object literal for the '<em><b>Priorities</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference PRIORITY_SYSTEM__PRIORITIES = eINSTANCE.getPrioritySystem_Priorities();

		/**
         * The meta object literal for the '<em><b>Karma Points</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PRIORITY_SYSTEM__KARMA_POINTS = eINSTANCE.getPrioritySystem_KarmaPoints();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.NonPlayerCharacterImpl <em>Non Player Character</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.NonPlayerCharacterImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getNonPlayerCharacter()
         * @generated
         */
		EClass NON_PLAYER_CHARACTER = eINSTANCE.getNonPlayerCharacter();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.ChangesImpl <em>Changes</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.ChangesImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getChanges()
         * @generated
         */
		EClass CHANGES = eINSTANCE.getChanges();

		/**
         * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CHANGES__DATE = eINSTANCE.getChanges_Date();

		/**
         * The meta object literal for the '<em><b>Karma Cost</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANGES__KARMA_COST = eINSTANCE.getChanges_KarmaCost();

        /**
         * The meta object literal for the '<em><b>Character</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CHANGES__CHARACTER = eINSTANCE.getChanges_Character();

        /**
         * The meta object literal for the '<em><b>Change Applied</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANGES__CHANGE_APPLIED = eINSTANCE.getChanges_ChangeApplied();

        /**
         * The meta object literal for the '<em><b>Date Applied</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHANGES__DATE_APPLIED = eINSTANCE.getChanges_DateApplied();

        /**
         * The meta object literal for the '<em><b>Apply Changes</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation CHANGES___APPLY_CHANGES = eINSTANCE.getChanges__ApplyChanges();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.KarmaGaintImpl <em>Karma Gaint</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.KarmaGaintImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getKarmaGaint()
         * @generated
         */
		EClass KARMA_GAINT = eINSTANCE.getKarmaGaint();

		/**
         * The meta object literal for the '<em><b>Karma</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute KARMA_GAINT__KARMA = eINSTANCE.getKarmaGaint_Karma();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.FreeStyleImpl <em>Free Style</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.FreeStyleImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getFreeStyle()
         * @generated
         */
		EClass FREE_STYLE = eINSTANCE.getFreeStyle();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.PriorityCategorieImpl <em>Priority Categorie</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.PriorityCategorieImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getPriorityCategorie()
         * @generated
         */
		EClass PRIORITY_CATEGORIE = eINSTANCE.getPriorityCategorie();

		/**
         * The meta object literal for the '<em><b>Categorie Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PRIORITY_CATEGORIE__CATEGORIE_NAME = eINSTANCE.getPriorityCategorie_CategorieName();

		/**
         * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PRIORITY_CATEGORIE__COST = eINSTANCE.getPriorityCategorie_Cost();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.Shr5SystemImpl <em>Shr5 System</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5SystemImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getShr5System()
         * @generated
         */
		EClass SHR5_SYSTEM = eINSTANCE.getShr5System();

		/**
         * The meta object literal for the '<em><b>Karma To Resource Factor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SHR5_SYSTEM__KARMA_TO_RESOURCE_FACTOR = eINSTANCE.getShr5System_KarmaToResourceFactor();

		/**
         * The meta object literal for the '<em><b>Karma To Magic Factor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SHR5_SYSTEM__KARMA_TO_MAGIC_FACTOR = eINSTANCE.getShr5System_KarmaToMagicFactor();

		/**
         * The meta object literal for the '<em><b>Number Of Max Attributes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SHR5_SYSTEM__NUMBER_OF_MAX_ATTRIBUTES = eINSTANCE.getShr5System_NumberOfMaxAttributes();

		/**
         * The meta object literal for the '<em><b>Knowlege Skill Factor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SHR5_SYSTEM__KNOWLEGE_SKILL_FACTOR = eINSTANCE.getShr5System_KnowlegeSkillFactor();

		/**
         * The meta object literal for the '<em><b>Charisma To Connection Factor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SHR5_SYSTEM__CHARISMA_TO_CONNECTION_FACTOR = eINSTANCE.getShr5System_CharismaToConnectionFactor();

		/**
         * The meta object literal for the '<em><b>Max Resource To Keep</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_SYSTEM__MAX_RESOURCE_TO_KEEP = eINSTANCE.getShr5System_MaxResourceToKeep();

        /**
         * The meta object literal for the '<em><b>Max Karma To Resources</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_SYSTEM__MAX_KARMA_TO_RESOURCES = eINSTANCE.getShr5System_MaxKarmaToResources();

        /**
         * The meta object literal for the '<em><b>Max Karma To Keep</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_SYSTEM__MAX_KARMA_TO_KEEP = eINSTANCE.getShr5System_MaxKarmaToKeep();

        /**
         * The meta object literal for the '<em><b>Skill Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_SYSTEM__SKILL_MAX = eINSTANCE.getShr5System_SkillMax();

        /**
         * The meta object literal for the '<em><b>Number Of Specalism</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_SYSTEM__NUMBER_OF_SPECALISM = eINSTANCE.getShr5System_NumberOfSpecalism();

        /**
         * The meta object literal for the '<em><b>Karma To Connection Factor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_SYSTEM__KARMA_TO_CONNECTION_FACTOR = eINSTANCE.getShr5System_KarmaToConnectionFactor();

        /**
         * The meta object literal for the '<em><b>Bound Spritit Service Cost</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_SYSTEM__BOUND_SPRITIT_SERVICE_COST = eINSTANCE.getShr5System_BoundSprititServiceCost();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.MetaTypeImpl <em>Meta Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.MetaTypeImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getMetaType()
         * @generated
         */
		EClass META_TYPE = eINSTANCE.getMetaType();

		/**
         * The meta object literal for the '<em><b>Choosable Types</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference META_TYPE__CHOOSABLE_TYPES = eINSTANCE.getMetaType_ChoosableTypes();

		/**
         * The meta object literal for the '<em><b>Special Points</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute META_TYPE__SPECIAL_POINTS = eINSTANCE.getMetaType_SpecialPoints();

		/**
         * The meta object literal for the '<em><b>Calc Special Points Spend</b></em>' operation.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EOperation META_TYPE___CALC_SPECIAL_POINTS_SPEND__MANAGEDCHARACTER = eINSTANCE.getMetaType__CalcSpecialPointsSpend__ManagedCharacter();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.AttributesImpl <em>Attributes</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.AttributesImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getAttributes()
         * @generated
         */
		EClass ATTRIBUTES = eINSTANCE.getAttributes();

		/**
         * The meta object literal for the '<em><b>Attibute Points</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ATTRIBUTES__ATTIBUTE_POINTS = eINSTANCE.getAttributes_AttibutePoints();

		/**
         * The meta object literal for the '<em><b>Calc Attributes Spend</b></em>' operation.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EOperation ATTRIBUTES___CALC_ATTRIBUTES_SPEND__MANAGEDCHARACTER = eINSTANCE.getAttributes__CalcAttributesSpend__ManagedCharacter();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.SkillImpl <em>Skill</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.SkillImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getSkill()
         * @generated
         */
		EClass SKILL = eINSTANCE.getSkill();

		/**
         * The meta object literal for the '<em><b>Skill Points</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SKILL__SKILL_POINTS = eINSTANCE.getSkill_SkillPoints();

		/**
         * The meta object literal for the '<em><b>Group Points</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SKILL__GROUP_POINTS = eINSTANCE.getSkill_GroupPoints();

		/**
         * The meta object literal for the '<em><b>Calc Skill Spend</b></em>' operation.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EOperation SKILL___CALC_SKILL_SPEND__MANAGEDCHARACTER = eINSTANCE.getSkill__CalcSkillSpend__ManagedCharacter();

		/**
         * The meta object literal for the '<em><b>Calc Group Spend</b></em>' operation.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EOperation SKILL___CALC_GROUP_SPEND__MANAGEDCHARACTER = eINSTANCE.getSkill__CalcGroupSpend__ManagedCharacter();

		/**
         * The meta object literal for the '<em><b>Calc Knowledge Skill Spend</b></em>' operation.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EOperation SKILL___CALC_KNOWLEDGE_SKILL_SPEND__MANAGEDCHARACTER = eINSTANCE.getSkill__CalcKnowledgeSkillSpend__ManagedCharacter();

		/**
         * The meta object literal for the '<em><b>Calc Knowledge Skill Points</b></em>' operation.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EOperation SKILL___CALC_KNOWLEDGE_SKILL_POINTS__MANAGEDCHARACTER = eINSTANCE.getSkill__CalcKnowledgeSkillPoints__ManagedCharacter();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.ResourcenImpl <em>Resourcen</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.ResourcenImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getResourcen()
         * @generated
         */
		EClass RESOURCEN = eINSTANCE.getResourcen();

		/**
         * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute RESOURCEN__RESOURCE = eINSTANCE.getResourcen_Resource();

		/**
         * The meta object literal for the '<em><b>Calc Resource Spend</b></em>' operation.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EOperation RESOURCEN___CALC_RESOURCE_SPEND__MANAGEDCHARACTER = eINSTANCE.getResourcen__CalcResourceSpend__ManagedCharacter();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.SpecialTypeImpl <em>Special Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.SpecialTypeImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getSpecialType()
         * @generated
         */
		EClass SPECIAL_TYPE = eINSTANCE.getSpecialType();

		/**
         * The meta object literal for the '<em><b>Selectable Types</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SPECIAL_TYPE__SELECTABLE_TYPES = eINSTANCE.getSpecialType_SelectableTypes();

		/**
         * The meta object literal for the '<em><b>Skill Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPECIAL_TYPE__SKILL_VALUE = eINSTANCE.getSpecialType_SkillValue();

		/**
         * The meta object literal for the '<em><b>Skill Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPECIAL_TYPE__SKILL_NUMBER = eINSTANCE.getSpecialType_SkillNumber();

		/**
         * The meta object literal for the '<em><b>Selectable Skills</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SPECIAL_TYPE__SELECTABLE_SKILLS = eINSTANCE.getSpecialType_SelectableSkills();

		/**
         * The meta object literal for the '<em><b>Selectable Skill Groups</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SPECIAL_TYPE__SELECTABLE_SKILL_GROUPS = eINSTANCE.getSpecialType_SelectableSkillGroups();

		/**
         * The meta object literal for the '<em><b>Calc Skills Spend</b></em>' operation.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EOperation SPECIAL_TYPE___CALC_SKILLS_SPEND__MANAGEDCHARACTER = eINSTANCE.getSpecialType__CalcSkillsSpend__ManagedCharacter();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.TechnomancerImpl <em>Technomancer</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.TechnomancerImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getTechnomancer()
         * @generated
         */
		EClass TECHNOMANCER = eINSTANCE.getTechnomancer();

		/**
         * The meta object literal for the '<em><b>Resonanz</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TECHNOMANCER__RESONANZ = eINSTANCE.getTechnomancer_Resonanz();

		/**
         * The meta object literal for the '<em><b>Complex Forms</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TECHNOMANCER__COMPLEX_FORMS = eINSTANCE.getTechnomancer_ComplexForms();

		/**
         * The meta object literal for the '<em><b>Calc Complex Forms Spend</b></em>' operation.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EOperation TECHNOMANCER___CALC_COMPLEX_FORMS_SPEND__MANAGEDCHARACTER = eINSTANCE.getTechnomancer__CalcComplexFormsSpend__ManagedCharacter();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.SpellcasterImpl <em>Spellcaster</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.SpellcasterImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getSpellcaster()
         * @generated
         */
		EClass SPELLCASTER = eINSTANCE.getSpellcaster();

		/**
         * The meta object literal for the '<em><b>Spell Points</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SPELLCASTER__SPELL_POINTS = eINSTANCE.getSpellcaster_SpellPoints();

		/**
         * The meta object literal for the '<em><b>Calc Spell Points Spend</b></em>' operation.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EOperation SPELLCASTER___CALC_SPELL_POINTS_SPEND__MANAGEDCHARACTER = eINSTANCE.getSpellcaster__CalcSpellPointsSpend__ManagedCharacter();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.AdeptImpl <em>Adept</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.AdeptImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getAdept()
         * @generated
         */
		EClass ADEPT = eINSTANCE.getAdept();

		/**
         * The meta object literal for the '<em><b>Magic</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ADEPT__MAGIC = eINSTANCE.getAdept_Magic();

		/**
         * The meta object literal for the '<em><b>Calc Power Points Spend</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation ADEPT___CALC_POWER_POINTS_SPEND__MANAGEDCHARACTER = eINSTANCE.getAdept__CalcPowerPointsSpend__ManagedCharacter();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorImpl <em>Character Generator</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getCharacterGenerator()
         * @generated
         */
		EClass CHARACTER_GENERATOR = eINSTANCE.getCharacterGenerator();

		/**
         * The meta object literal for the '<em><b>Character</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CHARACTER_GENERATOR__CHARACTER = eINSTANCE.getCharacterGenerator_Character();

		/**
         * The meta object literal for the '<em><b>Generator</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CHARACTER_GENERATOR__GENERATOR = eINSTANCE.getCharacterGenerator_Generator();

		/**
         * The meta object literal for the '<em><b>State</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CHARACTER_GENERATOR__STATE = eINSTANCE.getCharacterGenerator_State();

		/**
         * The meta object literal for the '<em><b>Selected Group</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CHARACTER_GENERATOR__SELECTED_GROUP = eINSTANCE.getCharacterGenerator_SelectedGroup();

		/**
         * The meta object literal for the '<em><b>Character Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CHARACTER_GENERATOR__CHARACTER_NAME = eINSTANCE.getCharacterGenerator_CharacterName();

		/**
         * The meta object literal for the '<em><b>Current Instruction</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CHARACTER_GENERATOR__CURRENT_INSTRUCTION = eINSTANCE.getCharacterGenerator_CurrentInstruction();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.FreeStyleGeneratorImpl <em>Free Style Generator</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.FreeStyleGeneratorImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getFreeStyleGenerator()
         * @generated
         */
		EClass FREE_STYLE_GENERATOR = eINSTANCE.getFreeStyleGenerator();

		/**
         * The meta object literal for the '<em><b>Freestyle Generator</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference FREE_STYLE_GENERATOR__FREESTYLE_GENERATOR = eINSTANCE.getFreeStyleGenerator_FreestyleGenerator();

		/**
         * The meta object literal for the '<em><b>Selected Persona</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FREE_STYLE_GENERATOR__SELECTED_PERSONA = eINSTANCE.getFreeStyleGenerator_SelectedPersona();

        /**
         * The meta object literal for the '<em><b>Selected Species</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FREE_STYLE_GENERATOR__SELECTED_SPECIES = eINSTANCE.getFreeStyleGenerator_SelectedSpecies();

        /**
         * The meta object literal for the '<em><b>Selected Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FREE_STYLE_GENERATOR__SELECTED_TYPE = eINSTANCE.getFreeStyleGenerator_SelectedType();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl <em>Shr5 Generator</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getShr5Generator()
         * @generated
         */
		EClass SHR5_GENERATOR = eINSTANCE.getShr5Generator();

		/**
         * The meta object literal for the '<em><b>Resourcen</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SHR5_GENERATOR__RESOURCEN = eINSTANCE.getShr5Generator_Resourcen();

		/**
         * The meta object literal for the '<em><b>Skills</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SHR5_GENERATOR__SKILLS = eINSTANCE.getShr5Generator_Skills();

		/**
         * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SHR5_GENERATOR__ATTRIBUTE = eINSTANCE.getShr5Generator_Attribute();

		/**
         * The meta object literal for the '<em><b>Meta Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SHR5_GENERATOR__META_TYPE = eINSTANCE.getShr5Generator_MetaType();

		/**
         * The meta object literal for the '<em><b>Magic</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SHR5_GENERATOR__MAGIC = eINSTANCE.getShr5Generator_Magic();

		/**
         * The meta object literal for the '<em><b>Karma To Resource</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SHR5_GENERATOR__KARMA_TO_RESOURCE = eINSTANCE.getShr5Generator_KarmaToResource();

		/**
         * The meta object literal for the '<em><b>Karma Spend</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SHR5_GENERATOR__KARMA_SPEND = eINSTANCE.getShr5Generator_KarmaSpend();

		/**
         * The meta object literal for the '<em><b>Attribute Spend</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_GENERATOR__ATTRIBUTE_SPEND = eINSTANCE.getShr5Generator_AttributeSpend();

        /**
         * The meta object literal for the '<em><b>Resource Spend</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_GENERATOR__RESOURCE_SPEND = eINSTANCE.getShr5Generator_ResourceSpend();

        /**
         * The meta object literal for the '<em><b>Connection Spend</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_GENERATOR__CONNECTION_SPEND = eINSTANCE.getShr5Generator_ConnectionSpend();

        /**
         * The meta object literal for the '<em><b>Skill Point Spend</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_GENERATOR__SKILL_POINT_SPEND = eINSTANCE.getShr5Generator_SkillPointSpend();

        /**
         * The meta object literal for the '<em><b>Special Point Spend</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_GENERATOR__SPECIAL_POINT_SPEND = eINSTANCE.getShr5Generator_SpecialPointSpend();

        /**
         * The meta object literal for the '<em><b>Group Point Spend</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_GENERATOR__GROUP_POINT_SPEND = eINSTANCE.getShr5Generator_GroupPointSpend();

        /**
         * The meta object literal for the '<em><b>Knownlege Point Spend</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_GENERATOR__KNOWNLEGE_POINT_SPEND = eINSTANCE.getShr5Generator_KnownlegePointSpend();

        /**
         * The meta object literal for the '<em><b>Spell Point Spend</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_GENERATOR__SPELL_POINT_SPEND = eINSTANCE.getShr5Generator_SpellPointSpend();

        /**
         * The meta object literal for the '<em><b>Start Karma</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_GENERATOR__START_KARMA = eINSTANCE.getShr5Generator_StartKarma();

        /**
         * The meta object literal for the '<em><b>Start Resources</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_GENERATOR__START_RESOURCES = eINSTANCE.getShr5Generator_StartResources();

        /**
         * The meta object literal for the '<em><b>Has Category Only Once</b></em>' operation.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EOperation SHR5_GENERATOR___HAS_CATEGORY_ONLY_ONCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5Generator__HasCategoryOnlyOnce__DiagnosticChain_Map();

		/**
         * The meta object literal for the '<em><b>Has Not More Max Attributes</b></em>' operation.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EOperation SHR5_GENERATOR___HAS_NOT_MORE_MAX_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5Generator__HasNotMoreMaxAttributes__DiagnosticChain_Map();

		/**
         * The meta object literal for the '<em><b>Has Spend All Attributes Points</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_GENERATOR___HAS_SPEND_ALL_ATTRIBUTES_POINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5Generator__HasSpendAllAttributesPoints__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Has Spend All Skill Points</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_GENERATOR___HAS_SPEND_ALL_SKILL_POINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5Generator__HasSpendAllSkillPoints__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Has Spend All Special Points</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_GENERATOR___HAS_SPEND_ALL_SPECIAL_POINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5Generator__HasSpendAllSpecialPoints__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Has Spend All Special Type Points</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_GENERATOR___HAS_SPEND_ALL_SPECIAL_TYPE_POINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5Generator__HasSpendAllSpecialTypePoints__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Has Spend All Connection Points</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_GENERATOR___HAS_SPEND_ALL_CONNECTION_POINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5Generator__HasSpendAllConnectionPoints__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Has Spend All Resource Points</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_GENERATOR___HAS_SPEND_ALL_RESOURCE_POINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5Generator__HasSpendAllResourcePoints__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Has Spend All Magic Skills Points</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_GENERATOR___HAS_SPEND_ALL_MAGIC_SKILLS_POINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5Generator__HasSpendAllMagicSkillsPoints__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Has Spend All Magic Points</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_GENERATOR___HAS_SPEND_ALL_MAGIC_POINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5Generator__HasSpendAllMagicPoints__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Has Spend All Group Points</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_GENERATOR___HAS_SPEND_ALL_GROUP_POINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5Generator__HasSpendAllGroupPoints__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Has Spend All Knowlege Skill Points</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_GENERATOR___HAS_SPEND_ALL_KNOWLEGE_SKILL_POINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5Generator__HasSpendAllKnowlegeSkillPoints__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Has Spend All Karma Points</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_GENERATOR___HAS_SPEND_ALL_KARMA_POINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5Generator__HasSpendAllKarmaPoints__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Has Spend All Spell Points</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_GENERATOR___HAS_SPEND_ALL_SPELL_POINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5Generator__HasSpendAllSpellPoints__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Has Spend All Power Points</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_GENERATOR___HAS_SPEND_ALL_POWER_POINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5Generator__HasSpendAllPowerPoints__DiagnosticChain_Map();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.AttributeChangeImpl <em>Attribute Change</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.AttributeChangeImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getAttributeChange()
         * @generated
         */
		EClass ATTRIBUTE_CHANGE = eINSTANCE.getAttributeChange();

		/**
         * The meta object literal for the '<em><b>Attibute</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_CHANGE__ATTIBUTE = eINSTANCE.getAttributeChange_Attibute();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.PlayerCharacterImpl <em>Player Character</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.PlayerCharacterImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getPlayerCharacter()
         * @generated
         */
		EClass PLAYER_CHARACTER = eINSTANCE.getPlayerCharacter();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.MudanImpl <em>Mudan</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.MudanImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getMudan()
         * @generated
         */
		EClass MUDAN = eINSTANCE.getMudan();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGroupImpl <em>Character Group</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.CharacterGroupImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getCharacterGroup()
         * @generated
         */
		EClass CHARACTER_GROUP = eINSTANCE.getCharacterGroup();

		/**
         * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CHARACTER_GROUP__MEMBERS = eINSTANCE.getCharacterGroup_Members();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.ConnectionImpl <em>Connection</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.ConnectionImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getConnection()
         * @generated
         */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
         * The meta object literal for the '<em><b>Influence</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CONNECTION__INFLUENCE = eINSTANCE.getConnection_Influence();

		/**
         * The meta object literal for the '<em><b>Loyality</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CONNECTION__LOYALITY = eINSTANCE.getConnection_Loyality();

		/**
         * The meta object literal for the '<em><b>Character</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CONNECTION__CHARACTER = eINSTANCE.getConnection_Character();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.PersonaChangeImpl <em>Persona Change</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.PersonaChangeImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getPersonaChange()
         * @generated
         */
        EClass PERSONA_CHANGE = eINSTANCE.getPersonaChange();

        /**
         * The meta object literal for the '<em><b>Changeable</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PERSONA_CHANGE__CHANGEABLE = eINSTANCE.getPersonaChange_Changeable();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.PersonaValueChangeImpl <em>Persona Value Change</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.PersonaValueChangeImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getPersonaValueChange()
         * @generated
         */
		EClass PERSONA_VALUE_CHANGE = eINSTANCE.getPersonaValueChange();

		/**
         * The meta object literal for the '<em><b>From</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PERSONA_VALUE_CHANGE__FROM = eINSTANCE.getPersonaValueChange_From();

		/**
         * The meta object literal for the '<em><b>To</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PERSONA_VALUE_CHANGE__TO = eINSTANCE.getPersonaValueChange_To();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.GeneratorStateToEStringMapEntryImpl <em>Generator State To EString Map Entry</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.GeneratorStateToEStringMapEntryImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getGeneratorStateToEStringMapEntry()
         * @generated
         */
		EClass GENERATOR_STATE_TO_ESTRING_MAP_ENTRY = eINSTANCE.getGeneratorStateToEStringMapEntry();

		/**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GENERATOR_STATE_TO_ESTRING_MAP_ENTRY__KEY = eINSTANCE.getGeneratorStateToEStringMapEntry_Key();

		/**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute GENERATOR_STATE_TO_ESTRING_MAP_ENTRY__VALUE = eINSTANCE.getGeneratorStateToEStringMapEntry_Value();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.AdvancementImpl <em>Advancement</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.AdvancementImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getAdvancement()
         * @generated
         */
		EClass ADVANCEMENT = eINSTANCE.getAdvancement();

		/**
         * The meta object literal for the '<em><b>Karma Factor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ADVANCEMENT__KARMA_FACTOR = eINSTANCE.getAdvancement_KarmaFactor();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.IncreaseCharacterPartImpl <em>Increase Character Part</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.IncreaseCharacterPartImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getIncreaseCharacterPart()
         * @generated
         */
		EClass INCREASE_CHARACTER_PART = eINSTANCE.getIncreaseCharacterPart();

		/**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference INCREASE_CHARACTER_PART__TYPE = eINSTANCE.getIncreaseCharacterPart_Type();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.LifestyleToStartMoneyImpl <em>Lifestyle To Start Money</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.LifestyleToStartMoneyImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getLifestyleToStartMoney()
         * @generated
         */
        EClass LIFESTYLE_TO_START_MONEY = eINSTANCE.getLifestyleToStartMoney();

        /**
         * The meta object literal for the '<em><b>Number Of W</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LIFESTYLE_TO_START_MONEY__NUMBER_OF_W = eINSTANCE.getLifestyleToStartMoney_NumberOfW();

        /**
         * The meta object literal for the '<em><b>Money Factor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LIFESTYLE_TO_START_MONEY__MONEY_FACTOR = eINSTANCE.getLifestyleToStartMoney_MoneyFactor();

        /**
         * The meta object literal for the '<em><b>Life Styles</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LIFESTYLE_TO_START_MONEY__LIFE_STYLES = eINSTANCE.getLifestyleToStartMoney_LifeStyles();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.GruntGroupImpl <em>Grunt Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.GruntGroupImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getGruntGroup()
         * @generated
         */
        EClass GRUNT_GROUP = eINSTANCE.getGruntGroup();

        /**
         * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRUNT_GROUP__MEMBERS = eINSTANCE.getGruntGroup_Members();

        /**
         * The meta object literal for the '<em><b>Leader</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRUNT_GROUP__LEADER = eINSTANCE.getGruntGroup_Leader();

        /**
         * The meta object literal for the '<em><b>Professional Rating</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GRUNT_GROUP__PROFESSIONAL_RATING = eINSTANCE.getGruntGroup_ProfessionalRating();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.GruntMembersImpl <em>Grunt Members</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.GruntMembersImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getGruntMembers()
         * @generated
         */
        EClass GRUNT_MEMBERS = eINSTANCE.getGruntMembers();

        /**
         * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GRUNT_MEMBERS__COUNT = eINSTANCE.getGruntMembers_Count();

        /**
         * The meta object literal for the '<em><b>Nsc</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRUNT_MEMBERS__NSC = eINSTANCE.getGruntMembers_Nsc();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.PlayerManagementImpl <em>Player Management</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.PlayerManagementImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getPlayerManagement()
         * @generated
         */
        EClass PLAYER_MANAGEMENT = eINSTANCE.getPlayerManagement();

        /**
         * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PLAYER_MANAGEMENT__GROUPS = eINSTANCE.getPlayerManagement_Groups();

        /**
         * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PLAYER_MANAGEMENT__GENERATORS = eINSTANCE.getPlayerManagement_Generators();

        /**
         * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PLAYER_MANAGEMENT__ENTRIES = eINSTANCE.getPlayerManagement_Entries();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.GamemasterManagementImpl <em>Gamemaster Management</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.GamemasterManagementImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getGamemasterManagement()
         * @generated
         */
        EClass GAMEMASTER_MANAGEMENT = eINSTANCE.getGamemasterManagement();

        /**
         * The meta object literal for the '<em><b>Grunts</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GAMEMASTER_MANAGEMENT__GRUNTS = eINSTANCE.getGamemasterManagement_Grunts();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.CharacterAdvancementSystemImpl <em>Character Advancement System</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.CharacterAdvancementSystemImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getCharacterAdvancementSystem()
         * @generated
         */
        EClass CHARACTER_ADVANCEMENT_SYSTEM = eINSTANCE.getCharacterAdvancementSystem();

        /**
         * The meta object literal for the '<em><b>Character Advancements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CHARACTER_ADVANCEMENT_SYSTEM__CHARACTER_ADVANCEMENTS = eINSTANCE.getCharacterAdvancementSystem_CharacterAdvancements();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.Shr5RuleGeneratorImpl <em>Shr5 Rule Generator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5RuleGeneratorImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getShr5RuleGenerator()
         * @generated
         */
        EClass SHR5_RULE_GENERATOR = eINSTANCE.getShr5RuleGenerator();

        /**
         * The meta object literal for the '<em><b>Shr5 Generator</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SHR5_RULE_GENERATOR__SHR5_GENERATOR = eINSTANCE.getShr5RuleGenerator_Shr5Generator();

        /**
         * The meta object literal for the '<em><b>Has Spend All Points</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_RULE_GENERATOR___HAS_SPEND_ALL_POINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5RuleGenerator__HasSpendAllPoints__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Has Not More Max Attributes</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_RULE_GENERATOR___HAS_NOT_MORE_MAX_ATTRIBUTES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5RuleGenerator__HasNotMoreMaxAttributes__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Has No Skills Over Max</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_RULE_GENERATOR___HAS_NO_SKILLS_OVER_MAX__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5RuleGenerator__HasNoSkillsOverMax__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Has Not More Specalism</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_RULE_GENERATOR___HAS_NOT_MORE_SPECALISM__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5RuleGenerator__HasNotMoreSpecalism__DiagnosticChain_Map();

        /**
         * The meta object literal for the '<em><b>Has No Attributes Over Species Att</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_RULE_GENERATOR___HAS_NO_ATTRIBUTES_OVER_SPECIES_ATT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5RuleGenerator__HasNoAttributesOverSpeciesAtt__DiagnosticChain_Map();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.impl.Shr5KarmaGeneratorImpl <em>Shr5 Karma Generator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5KarmaGeneratorImpl
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getShr5KarmaGenerator()
         * @generated
         */
        EClass SHR5_KARMA_GENERATOR = eINSTANCE.getShr5KarmaGenerator();

        /**
         * The meta object literal for the '<em><b>Meta Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SHR5_KARMA_GENERATOR__META_TYPE = eINSTANCE.getShr5KarmaGenerator_MetaType();

        /**
         * The meta object literal for the '<em><b>Character Concept</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SHR5_KARMA_GENERATOR__CHARACTER_CONCEPT = eINSTANCE.getShr5KarmaGenerator_CharacterConcept();

        /**
         * The meta object literal for the '<em><b>Karma To Resource</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_KARMA_GENERATOR__KARMA_TO_RESOURCE = eINSTANCE.getShr5KarmaGenerator_KarmaToResource();

        /**
         * The meta object literal for the '<em><b>Karma Spend</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_KARMA_GENERATOR__KARMA_SPEND = eINSTANCE.getShr5KarmaGenerator_KarmaSpend();

        /**
         * The meta object literal for the '<em><b>Resource Spend</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_KARMA_GENERATOR__RESOURCE_SPEND = eINSTANCE.getShr5KarmaGenerator_ResourceSpend();

        /**
         * The meta object literal for the '<em><b>Start Karma</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_KARMA_GENERATOR__START_KARMA = eINSTANCE.getShr5KarmaGenerator_StartKarma();

        /**
         * The meta object literal for the '<em><b>Start Resources</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SHR5_KARMA_GENERATOR__START_RESOURCES = eINSTANCE.getShr5KarmaGenerator_StartResources();

        /**
         * The meta object literal for the '<em><b>Has Spend All Karma Points</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation SHR5_KARMA_GENERATOR___HAS_SPEND_ALL_KARMA_POINTS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getShr5KarmaGenerator__HasSpendAllKarmaPoints__DiagnosticChain_Map();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.GeneratorState <em>Generator State</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.GeneratorState
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getGeneratorState()
         * @generated
         */
		EEnum GENERATOR_STATE = eINSTANCE.getGeneratorState();

		/**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5Management.Sex <em>Sex</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5Management.Sex
         * @see de.urszeidler.eclipse.shr5Management.impl.Shr5managementPackageImpl#getSex()
         * @generated
         */
		EEnum SEX = eINSTANCE.getSex();

	}

} //Shr5managementPackage
