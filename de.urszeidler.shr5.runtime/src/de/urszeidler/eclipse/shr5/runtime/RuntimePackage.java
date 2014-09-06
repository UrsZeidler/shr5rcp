/**
 */
package de.urszeidler.eclipse.shr5.runtime;

import de.urszeidler.eclipse.shr5.Shr5Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.urszeidler.eclipse.shr5.runtime.RuntimeFactory
 * @model kind="package"
 * @generated
 */
public interface RuntimePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "runtime";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://urszeidler.de/shr5/runtime/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "runtime";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RuntimePackage eINSTANCE = de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl.init();

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.runtime.impl.ExtendetDataImpl <em>Extendet Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.runtime.impl.ExtendetDataImpl
     * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getExtendetData()
     * @generated
     */
    int EXTENDET_DATA = 0;

    /**
     * The feature id for the '<em><b>EObject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_DATA__EOBJECT = 0;

    /**
     * The feature id for the '<em><b>EFeature</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_DATA__EFEATURE = 1;

    /**
     * The number of structural features of the '<em>Extendet Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_DATA_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Extendet Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_DATA_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware <em>Extendet Data Aware</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware
     * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getExtendetDataAware()
     * @generated
     */
    int EXTENDET_DATA_AWARE = 3;

    /**
     * The feature id for the '<em><b>Extendet Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_DATA_AWARE__EXTENDET_DATA = 0;

    /**
     * The number of structural features of the '<em>Extendet Data Aware</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_DATA_AWARE_FEATURE_COUNT = 1;

    /**
     * The operation id for the '<em>Add To Extendet Data</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_DATA_AWARE___ADD_TO_EXTENDET_DATA__EXTENDETDATA_OBJECT = 0;

    /**
     * The operation id for the '<em>Get Integer Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_DATA_AWARE___GET_INTEGER_VALUE__EXTENDETDATA = 1;

    /**
     * The operation id for the '<em>Increase Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_DATA_AWARE___INCREASE_VALUE__EXTENDETDATA_INT = 2;

    /**
     * The operation id for the '<em>Decrease Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_DATA_AWARE___DECREASE_VALUE__EXTENDETDATA_INT = 3;

    /**
     * The operation id for the '<em>Has Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_DATA_AWARE___HAS_VALUE__EXTENDETDATA = 4;

    /**
     * The operation id for the '<em>Add To List</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_DATA_AWARE___ADD_TO_LIST__EXTENDETDATA_OBJECT = 5;

    /**
     * The operation id for the '<em>Add Unique To List</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_DATA_AWARE___ADD_UNIQUE_TO_LIST__EXTENDETDATA_OBJECT = 6;

    /**
     * The operation id for the '<em>Get List Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_DATA_AWARE___GET_LIST_VALUE__EXTENDETDATA = 7;

    /**
     * The number of operations of the '<em>Extendet Data Aware</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_DATA_AWARE_OPERATION_COUNT = 8;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.runtime.impl.AbstractExtendetDataAwareImpl <em>Abstract Extendet Data Aware</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.runtime.impl.AbstractExtendetDataAwareImpl
     * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getAbstractExtendetDataAware()
     * @generated
     */
    int ABSTRACT_EXTENDET_DATA_AWARE = 7;

    /**
     * The feature id for the '<em><b>Extendet Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EXTENDET_DATA_AWARE__EXTENDET_DATA = EXTENDET_DATA_AWARE__EXTENDET_DATA;

    /**
     * The number of structural features of the '<em>Abstract Extendet Data Aware</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EXTENDET_DATA_AWARE_FEATURE_COUNT = EXTENDET_DATA_AWARE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Add To Extendet Data</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EXTENDET_DATA_AWARE___ADD_TO_EXTENDET_DATA__EXTENDETDATA_OBJECT = EXTENDET_DATA_AWARE___ADD_TO_EXTENDET_DATA__EXTENDETDATA_OBJECT;

    /**
     * The operation id for the '<em>Get Integer Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EXTENDET_DATA_AWARE___GET_INTEGER_VALUE__EXTENDETDATA = EXTENDET_DATA_AWARE___GET_INTEGER_VALUE__EXTENDETDATA;

    /**
     * The operation id for the '<em>Increase Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EXTENDET_DATA_AWARE___INCREASE_VALUE__EXTENDETDATA_INT = EXTENDET_DATA_AWARE___INCREASE_VALUE__EXTENDETDATA_INT;

    /**
     * The operation id for the '<em>Decrease Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EXTENDET_DATA_AWARE___DECREASE_VALUE__EXTENDETDATA_INT = EXTENDET_DATA_AWARE___DECREASE_VALUE__EXTENDETDATA_INT;

    /**
     * The operation id for the '<em>Has Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EXTENDET_DATA_AWARE___HAS_VALUE__EXTENDETDATA = EXTENDET_DATA_AWARE___HAS_VALUE__EXTENDETDATA;

    /**
     * The operation id for the '<em>Add To List</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EXTENDET_DATA_AWARE___ADD_TO_LIST__EXTENDETDATA_OBJECT = EXTENDET_DATA_AWARE___ADD_TO_LIST__EXTENDETDATA_OBJECT;

    /**
     * The operation id for the '<em>Add Unique To List</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EXTENDET_DATA_AWARE___ADD_UNIQUE_TO_LIST__EXTENDETDATA_OBJECT = EXTENDET_DATA_AWARE___ADD_UNIQUE_TO_LIST__EXTENDETDATA_OBJECT;

    /**
     * The operation id for the '<em>Get List Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EXTENDET_DATA_AWARE___GET_LIST_VALUE__EXTENDETDATA = EXTENDET_DATA_AWARE___GET_LIST_VALUE__EXTENDETDATA;

    /**
     * The number of operations of the '<em>Abstract Extendet Data Aware</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EXTENDET_DATA_AWARE_OPERATION_COUNT = EXTENDET_DATA_AWARE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.runtime.impl.EnviormentImpl <em>Enviorment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.runtime.impl.EnviormentImpl
     * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getEnviorment()
     * @generated
     */
    int ENVIORMENT = 1;

    /**
     * The feature id for the '<em><b>Extendet Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENVIORMENT__EXTENDET_DATA = ABSTRACT_EXTENDET_DATA_AWARE__EXTENDET_DATA;

    /**
     * The number of structural features of the '<em>Enviorment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENVIORMENT_FEATURE_COUNT = ABSTRACT_EXTENDET_DATA_AWARE_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Add To Extendet Data</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENVIORMENT___ADD_TO_EXTENDET_DATA__EXTENDETDATA_OBJECT = ABSTRACT_EXTENDET_DATA_AWARE___ADD_TO_EXTENDET_DATA__EXTENDETDATA_OBJECT;

    /**
     * The operation id for the '<em>Get Integer Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENVIORMENT___GET_INTEGER_VALUE__EXTENDETDATA = ABSTRACT_EXTENDET_DATA_AWARE___GET_INTEGER_VALUE__EXTENDETDATA;

    /**
     * The operation id for the '<em>Increase Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENVIORMENT___INCREASE_VALUE__EXTENDETDATA_INT = ABSTRACT_EXTENDET_DATA_AWARE___INCREASE_VALUE__EXTENDETDATA_INT;

    /**
     * The operation id for the '<em>Decrease Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENVIORMENT___DECREASE_VALUE__EXTENDETDATA_INT = ABSTRACT_EXTENDET_DATA_AWARE___DECREASE_VALUE__EXTENDETDATA_INT;

    /**
     * The operation id for the '<em>Has Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENVIORMENT___HAS_VALUE__EXTENDETDATA = ABSTRACT_EXTENDET_DATA_AWARE___HAS_VALUE__EXTENDETDATA;

    /**
     * The operation id for the '<em>Add To List</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENVIORMENT___ADD_TO_LIST__EXTENDETDATA_OBJECT = ABSTRACT_EXTENDET_DATA_AWARE___ADD_TO_LIST__EXTENDETDATA_OBJECT;

    /**
     * The operation id for the '<em>Add Unique To List</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENVIORMENT___ADD_UNIQUE_TO_LIST__EXTENDETDATA_OBJECT = ABSTRACT_EXTENDET_DATA_AWARE___ADD_UNIQUE_TO_LIST__EXTENDETDATA_OBJECT;

    /**
     * The operation id for the '<em>Get List Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENVIORMENT___GET_LIST_VALUE__EXTENDETDATA = ABSTRACT_EXTENDET_DATA_AWARE___GET_LIST_VALUE__EXTENDETDATA;

    /**
     * The number of operations of the '<em>Enviorment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENVIORMENT_OPERATION_COUNT = ABSTRACT_EXTENDET_DATA_AWARE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen <em>Nahkamp Modifikationen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen
     * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getNahkampModifikationen()
     * @generated
     */
    int NAHKAMP_MODIFIKATIONEN = 2;

    /**
     * The feature id for the '<em><b>Chracter Is Down</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAHKAMP_MODIFIKATIONEN__CHRACTER_IS_DOWN = 0;

    /**
     * The feature id for the '<em><b>Enemy Close Combat</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAHKAMP_MODIFIKATIONEN__ENEMY_CLOSE_COMBAT = 1;

    /**
     * The feature id for the '<em><b>Character Running</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAHKAMP_MODIFIKATIONEN__CHARACTER_RUNNING = 2;

    /**
     * The feature id for the '<em><b>Character Prone</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAHKAMP_MODIFIKATIONEN__CHARACTER_PRONE = 3;

    /**
     * The number of structural features of the '<em>Nahkamp Modifikationen</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAHKAMP_MODIFIKATIONEN_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Nahkamp Modifikationen</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAHKAMP_MODIFIKATIONEN_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.runtime.PhyicalState <em>Phyical State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.runtime.PhyicalState
     * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getPhyicalState()
     * @generated
     */
    int PHYICAL_STATE = 4;

    /**
     * The feature id for the '<em><b>Physical Damage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYICAL_STATE__PHYSICAL_DAMAGE = 0;

    /**
     * The feature id for the '<em><b>Mental Damage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYICAL_STATE__MENTAL_DAMAGE = 1;

    /**
     * The feature id for the '<em><b>Zustand</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYICAL_STATE__ZUSTAND = 2;

    /**
     * The feature id for the '<em><b>Over Dead</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYICAL_STATE__OVER_DEAD = 3;

    /**
     * The number of structural features of the '<em>Phyical State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYICAL_STATE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Phyical State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYICAL_STATE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.runtime.impl.RuntimeCharacterImpl <em>Character</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimeCharacterImpl
     * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getRuntimeCharacter()
     * @generated
     */
    int RUNTIME_CHARACTER = 5;

    /**
     * The feature id for the '<em><b>Extendet Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER__EXTENDET_DATA = ABSTRACT_EXTENDET_DATA_AWARE__EXTENDET_DATA;

    /**
     * The feature id for the '<em><b>Physical Damage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER__PHYSICAL_DAMAGE = ABSTRACT_EXTENDET_DATA_AWARE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Mental Damage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER__MENTAL_DAMAGE = ABSTRACT_EXTENDET_DATA_AWARE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Zustand</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER__ZUSTAND = ABSTRACT_EXTENDET_DATA_AWARE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Over Dead</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER__OVER_DEAD = ABSTRACT_EXTENDET_DATA_AWARE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Character</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER__CHARACTER = ABSTRACT_EXTENDET_DATA_AWARE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Right Hand</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER__RIGHT_HAND = ABSTRACT_EXTENDET_DATA_AWARE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Left Hand</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER__LEFT_HAND = ABSTRACT_EXTENDET_DATA_AWARE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>In Use</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER__IN_USE = ABSTRACT_EXTENDET_DATA_AWARE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Armor</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER__ARMOR = ABSTRACT_EXTENDET_DATA_AWARE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Used Edge</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER__USED_EDGE = ABSTRACT_EXTENDET_DATA_AWARE_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Character</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER_FEATURE_COUNT = ABSTRACT_EXTENDET_DATA_AWARE_FEATURE_COUNT + 10;

    /**
     * The operation id for the '<em>Add To Extendet Data</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER___ADD_TO_EXTENDET_DATA__EXTENDETDATA_OBJECT = ABSTRACT_EXTENDET_DATA_AWARE___ADD_TO_EXTENDET_DATA__EXTENDETDATA_OBJECT;

    /**
     * The operation id for the '<em>Get Integer Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER___GET_INTEGER_VALUE__EXTENDETDATA = ABSTRACT_EXTENDET_DATA_AWARE___GET_INTEGER_VALUE__EXTENDETDATA;

    /**
     * The operation id for the '<em>Increase Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER___INCREASE_VALUE__EXTENDETDATA_INT = ABSTRACT_EXTENDET_DATA_AWARE___INCREASE_VALUE__EXTENDETDATA_INT;

    /**
     * The operation id for the '<em>Decrease Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER___DECREASE_VALUE__EXTENDETDATA_INT = ABSTRACT_EXTENDET_DATA_AWARE___DECREASE_VALUE__EXTENDETDATA_INT;

    /**
     * The operation id for the '<em>Has Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER___HAS_VALUE__EXTENDETDATA = ABSTRACT_EXTENDET_DATA_AWARE___HAS_VALUE__EXTENDETDATA;

    /**
     * The operation id for the '<em>Add To List</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER___ADD_TO_LIST__EXTENDETDATA_OBJECT = ABSTRACT_EXTENDET_DATA_AWARE___ADD_TO_LIST__EXTENDETDATA_OBJECT;

    /**
     * The operation id for the '<em>Add Unique To List</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER___ADD_UNIQUE_TO_LIST__EXTENDETDATA_OBJECT = ABSTRACT_EXTENDET_DATA_AWARE___ADD_UNIQUE_TO_LIST__EXTENDETDATA_OBJECT;

    /**
     * The operation id for the '<em>Get List Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER___GET_LIST_VALUE__EXTENDETDATA = ABSTRACT_EXTENDET_DATA_AWARE___GET_LIST_VALUE__EXTENDETDATA;

    /**
     * The operation id for the '<em>Can Use Edge</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER___CAN_USE_EDGE = ABSTRACT_EXTENDET_DATA_AWARE_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Character</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUNTIME_CHARACTER_OPERATION_COUNT = ABSTRACT_EXTENDET_DATA_AWARE_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.runtime.impl.TeamImpl <em>Team</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.runtime.impl.TeamImpl
     * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getTeam()
     * @generated
     */
    int TEAM = 6;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEAM__BESCHREIBUNG = Shr5Package.BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEAM__IMAGE = Shr5Package.BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEAM__NAME = Shr5Package.BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEAM__MEMBERS = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Team</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEAM_FEATURE_COUNT = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Team</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEAM_OPERATION_COUNT = Shr5Package.BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.runtime.impl.GruntTeamImpl <em>Grunt Team</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.runtime.impl.GruntTeamImpl
     * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getGruntTeam()
     * @generated
     */
    int GRUNT_TEAM = 8;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_TEAM__BESCHREIBUNG = TEAM__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_TEAM__IMAGE = TEAM__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_TEAM__NAME = TEAM__NAME;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_TEAM__MEMBERS = TEAM__MEMBERS;

    /**
     * The feature id for the '<em><b>Grunt Group</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_TEAM__GRUNT_GROUP = TEAM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Grunt Team</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_TEAM_FEATURE_COUNT = TEAM_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Members</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_TEAM___BUILD_MEMBERS = TEAM_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Grunt Team</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_TEAM_OPERATION_COUNT = TEAM_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.runtime.impl.GruntRuntimeCharacterImpl <em>Grunt Runtime Character</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.runtime.impl.GruntRuntimeCharacterImpl
     * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getGruntRuntimeCharacter()
     * @generated
     */
    int GRUNT_RUNTIME_CHARACTER = 9;

    /**
     * The feature id for the '<em><b>Extendet Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER__EXTENDET_DATA = RUNTIME_CHARACTER__EXTENDET_DATA;

    /**
     * The feature id for the '<em><b>Physical Damage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER__PHYSICAL_DAMAGE = RUNTIME_CHARACTER__PHYSICAL_DAMAGE;

    /**
     * The feature id for the '<em><b>Mental Damage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER__MENTAL_DAMAGE = RUNTIME_CHARACTER__MENTAL_DAMAGE;

    /**
     * The feature id for the '<em><b>Zustand</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER__ZUSTAND = RUNTIME_CHARACTER__ZUSTAND;

    /**
     * The feature id for the '<em><b>Over Dead</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER__OVER_DEAD = RUNTIME_CHARACTER__OVER_DEAD;

    /**
     * The feature id for the '<em><b>Character</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER__CHARACTER = RUNTIME_CHARACTER__CHARACTER;

    /**
     * The feature id for the '<em><b>Right Hand</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER__RIGHT_HAND = RUNTIME_CHARACTER__RIGHT_HAND;

    /**
     * The feature id for the '<em><b>Left Hand</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER__LEFT_HAND = RUNTIME_CHARACTER__LEFT_HAND;

    /**
     * The feature id for the '<em><b>In Use</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER__IN_USE = RUNTIME_CHARACTER__IN_USE;

    /**
     * The feature id for the '<em><b>Armor</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER__ARMOR = RUNTIME_CHARACTER__ARMOR;

    /**
     * The feature id for the '<em><b>Used Edge</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER__USED_EDGE = RUNTIME_CHARACTER__USED_EDGE;

    /**
     * The number of structural features of the '<em>Grunt Runtime Character</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER_FEATURE_COUNT = RUNTIME_CHARACTER_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Add To Extendet Data</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER___ADD_TO_EXTENDET_DATA__EXTENDETDATA_OBJECT = RUNTIME_CHARACTER___ADD_TO_EXTENDET_DATA__EXTENDETDATA_OBJECT;

    /**
     * The operation id for the '<em>Get Integer Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER___GET_INTEGER_VALUE__EXTENDETDATA = RUNTIME_CHARACTER___GET_INTEGER_VALUE__EXTENDETDATA;

    /**
     * The operation id for the '<em>Increase Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER___INCREASE_VALUE__EXTENDETDATA_INT = RUNTIME_CHARACTER___INCREASE_VALUE__EXTENDETDATA_INT;

    /**
     * The operation id for the '<em>Decrease Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER___DECREASE_VALUE__EXTENDETDATA_INT = RUNTIME_CHARACTER___DECREASE_VALUE__EXTENDETDATA_INT;

    /**
     * The operation id for the '<em>Has Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER___HAS_VALUE__EXTENDETDATA = RUNTIME_CHARACTER___HAS_VALUE__EXTENDETDATA;

    /**
     * The operation id for the '<em>Add To List</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER___ADD_TO_LIST__EXTENDETDATA_OBJECT = RUNTIME_CHARACTER___ADD_TO_LIST__EXTENDETDATA_OBJECT;

    /**
     * The operation id for the '<em>Add Unique To List</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER___ADD_UNIQUE_TO_LIST__EXTENDETDATA_OBJECT = RUNTIME_CHARACTER___ADD_UNIQUE_TO_LIST__EXTENDETDATA_OBJECT;

    /**
     * The operation id for the '<em>Get List Value</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER___GET_LIST_VALUE__EXTENDETDATA = RUNTIME_CHARACTER___GET_LIST_VALUE__EXTENDETDATA;

    /**
     * The operation id for the '<em>Can Use Edge</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER___CAN_USE_EDGE = RUNTIME_CHARACTER___CAN_USE_EDGE;

    /**
     * The number of operations of the '<em>Grunt Runtime Character</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRUNT_RUNTIME_CHARACTER_OPERATION_COUNT = RUNTIME_CHARACTER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.runtime.Zustand <em>Zustand</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.runtime.Zustand
     * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getZustand()
     * @generated
     */
    int ZUSTAND = 10;


    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetData <em>Extendet Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Extendet Data</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetData
     * @generated
     */
    EClass getExtendetData();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetData#getEObject <em>EObject</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>EObject</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetData#getEObject()
     * @see #getExtendetData()
     * @generated
     */
    EReference getExtendetData_EObject();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetData#getEFeature <em>EFeature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>EFeature</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetData#getEFeature()
     * @see #getExtendetData()
     * @generated
     */
    EReference getExtendetData_EFeature();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.runtime.Enviorment <em>Enviorment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enviorment</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.Enviorment
     * @generated
     */
    EClass getEnviorment();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen <em>Nahkamp Modifikationen</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Nahkamp Modifikationen</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen
     * @generated
     */
    EClass getNahkampModifikationen();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#isChracterIsDown <em>Chracter Is Down</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Chracter Is Down</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#isChracterIsDown()
     * @see #getNahkampModifikationen()
     * @generated
     */
    EAttribute getNahkampModifikationen_ChracterIsDown();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#getEnemyCloseCombat <em>Enemy Close Combat</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Enemy Close Combat</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#getEnemyCloseCombat()
     * @see #getNahkampModifikationen()
     * @generated
     */
    EAttribute getNahkampModifikationen_EnemyCloseCombat();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#isCharacterRunning <em>Character Running</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Character Running</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#isCharacterRunning()
     * @see #getNahkampModifikationen()
     * @generated
     */
    EAttribute getNahkampModifikationen_CharacterRunning();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#isCharacterProne <em>Character Prone</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Character Prone</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen#isCharacterProne()
     * @see #getNahkampModifikationen()
     * @generated
     */
    EAttribute getNahkampModifikationen_CharacterProne();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware <em>Extendet Data Aware</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Extendet Data Aware</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware
     * @generated
     */
    EClass getExtendetDataAware();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#getExtendetData <em>Extendet Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Extendet Data</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#getExtendetData()
     * @see #getExtendetDataAware()
     * @generated
     */
    EAttribute getExtendetDataAware_ExtendetData();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#addToExtendetData(de.urszeidler.eclipse.shr5.runtime.ExtendetData, java.lang.Object) <em>Add To Extendet Data</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Add To Extendet Data</em>' operation.
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#addToExtendetData(de.urszeidler.eclipse.shr5.runtime.ExtendetData, java.lang.Object)
     * @generated
     */
    EOperation getExtendetDataAware__AddToExtendetData__ExtendetData_Object();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#getIntegerValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData) <em>Get Integer Value</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Integer Value</em>' operation.
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#getIntegerValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData)
     * @generated
     */
    EOperation getExtendetDataAware__GetIntegerValue__ExtendetData();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#increaseValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData, int) <em>Increase Value</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Increase Value</em>' operation.
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#increaseValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData, int)
     * @generated
     */
    EOperation getExtendetDataAware__IncreaseValue__ExtendetData_int();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#decreaseValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData, int) <em>Decrease Value</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Decrease Value</em>' operation.
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#decreaseValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData, int)
     * @generated
     */
    EOperation getExtendetDataAware__DecreaseValue__ExtendetData_int();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#hasValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData) <em>Has Value</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Has Value</em>' operation.
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#hasValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData)
     * @generated
     */
    EOperation getExtendetDataAware__HasValue__ExtendetData();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#addToList(de.urszeidler.eclipse.shr5.runtime.ExtendetData, java.lang.Object) <em>Add To List</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Add To List</em>' operation.
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#addToList(de.urszeidler.eclipse.shr5.runtime.ExtendetData, java.lang.Object)
     * @generated
     */
    EOperation getExtendetDataAware__AddToList__ExtendetData_Object();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#addUniqueToList(de.urszeidler.eclipse.shr5.runtime.ExtendetData, java.lang.Object) <em>Add Unique To List</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Add Unique To List</em>' operation.
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#addUniqueToList(de.urszeidler.eclipse.shr5.runtime.ExtendetData, java.lang.Object)
     * @generated
     */
    EOperation getExtendetDataAware__AddUniqueToList__ExtendetData_Object();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#getListValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData) <em>Get List Value</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get List Value</em>' operation.
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#getListValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData)
     * @generated
     */
    EOperation getExtendetDataAware__GetListValue__ExtendetData();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.runtime.PhyicalState <em>Phyical State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Phyical State</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.PhyicalState
     * @generated
     */
    EClass getPhyicalState();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.runtime.PhyicalState#getPhysicalDamage <em>Physical Damage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Physical Damage</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.PhyicalState#getPhysicalDamage()
     * @see #getPhyicalState()
     * @generated
     */
    EAttribute getPhyicalState_PhysicalDamage();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.runtime.PhyicalState#getMentalDamage <em>Mental Damage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mental Damage</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.PhyicalState#getMentalDamage()
     * @see #getPhyicalState()
     * @generated
     */
    EAttribute getPhyicalState_MentalDamage();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.runtime.PhyicalState#getZustand <em>Zustand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Zustand</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.PhyicalState#getZustand()
     * @see #getPhyicalState()
     * @generated
     */
    EAttribute getPhyicalState_Zustand();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.runtime.PhyicalState#getOverDead <em>Over Dead</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Over Dead</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.PhyicalState#getOverDead()
     * @see #getPhyicalState()
     * @generated
     */
    EAttribute getPhyicalState_OverDead();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter <em>Character</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Character</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter
     * @generated
     */
    EClass getRuntimeCharacter();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getCharacter <em>Character</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Character</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getCharacter()
     * @see #getRuntimeCharacter()
     * @generated
     */
    EReference getRuntimeCharacter_Character();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getRightHand <em>Right Hand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Right Hand</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getRightHand()
     * @see #getRuntimeCharacter()
     * @generated
     */
    EReference getRuntimeCharacter_RightHand();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getLeftHand <em>Left Hand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Left Hand</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getLeftHand()
     * @see #getRuntimeCharacter()
     * @generated
     */
    EReference getRuntimeCharacter_LeftHand();

    /**
     * Returns the meta object for the reference list '{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getInUse <em>In Use</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>In Use</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getInUse()
     * @see #getRuntimeCharacter()
     * @generated
     */
    EReference getRuntimeCharacter_InUse();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getArmor <em>Armor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Armor</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getArmor()
     * @see #getRuntimeCharacter()
     * @generated
     */
    EReference getRuntimeCharacter_Armor();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getUsedEdge <em>Used Edge</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Used Edge</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#getUsedEdge()
     * @see #getRuntimeCharacter()
     * @generated
     */
    EAttribute getRuntimeCharacter_UsedEdge();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#canUseEdge() <em>Can Use Edge</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Can Use Edge</em>' operation.
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#canUseEdge()
     * @generated
     */
    EOperation getRuntimeCharacter__CanUseEdge();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.runtime.Team <em>Team</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Team</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.Team
     * @generated
     */
    EClass getTeam();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.runtime.Team#getMembers <em>Members</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Members</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.Team#getMembers()
     * @see #getTeam()
     * @generated
     */
    EReference getTeam_Members();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.runtime.AbstractExtendetDataAware <em>Abstract Extendet Data Aware</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Extendet Data Aware</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.AbstractExtendetDataAware
     * @generated
     */
    EClass getAbstractExtendetDataAware();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.runtime.GruntTeam <em>Grunt Team</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Grunt Team</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.GruntTeam
     * @generated
     */
    EClass getGruntTeam();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.runtime.GruntTeam#getGruntGroup <em>Grunt Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Grunt Group</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.GruntTeam#getGruntGroup()
     * @see #getGruntTeam()
     * @generated
     */
    EReference getGruntTeam_GruntGroup();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5.runtime.GruntTeam#buildMembers() <em>Build Members</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Build Members</em>' operation.
     * @see de.urszeidler.eclipse.shr5.runtime.GruntTeam#buildMembers()
     * @generated
     */
    EOperation getGruntTeam__BuildMembers();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.runtime.GruntRuntimeCharacter <em>Grunt Runtime Character</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Grunt Runtime Character</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.GruntRuntimeCharacter
     * @generated
     */
    EClass getGruntRuntimeCharacter();

    /**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.runtime.Zustand <em>Zustand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Zustand</em>'.
     * @see de.urszeidler.eclipse.shr5.runtime.Zustand
     * @generated
     */
    EEnum getZustand();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    RuntimeFactory getRuntimeFactory();

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
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.runtime.impl.ExtendetDataImpl <em>Extendet Data</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.runtime.impl.ExtendetDataImpl
         * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getExtendetData()
         * @generated
         */
        EClass EXTENDET_DATA = eINSTANCE.getExtendetData();

        /**
         * The meta object literal for the '<em><b>EObject</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENDET_DATA__EOBJECT = eINSTANCE.getExtendetData_EObject();

        /**
         * The meta object literal for the '<em><b>EFeature</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENDET_DATA__EFEATURE = eINSTANCE.getExtendetData_EFeature();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.runtime.impl.EnviormentImpl <em>Enviorment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.runtime.impl.EnviormentImpl
         * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getEnviorment()
         * @generated
         */
        EClass ENVIORMENT = eINSTANCE.getEnviorment();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen <em>Nahkamp Modifikationen</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen
         * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getNahkampModifikationen()
         * @generated
         */
        EClass NAHKAMP_MODIFIKATIONEN = eINSTANCE.getNahkampModifikationen();

        /**
         * The meta object literal for the '<em><b>Chracter Is Down</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAHKAMP_MODIFIKATIONEN__CHRACTER_IS_DOWN = eINSTANCE.getNahkampModifikationen_ChracterIsDown();

        /**
         * The meta object literal for the '<em><b>Enemy Close Combat</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAHKAMP_MODIFIKATIONEN__ENEMY_CLOSE_COMBAT = eINSTANCE.getNahkampModifikationen_EnemyCloseCombat();

        /**
         * The meta object literal for the '<em><b>Character Running</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAHKAMP_MODIFIKATIONEN__CHARACTER_RUNNING = eINSTANCE.getNahkampModifikationen_CharacterRunning();

        /**
         * The meta object literal for the '<em><b>Character Prone</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAHKAMP_MODIFIKATIONEN__CHARACTER_PRONE = eINSTANCE.getNahkampModifikationen_CharacterProne();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware <em>Extendet Data Aware</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware
         * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getExtendetDataAware()
         * @generated
         */
        EClass EXTENDET_DATA_AWARE = eINSTANCE.getExtendetDataAware();

        /**
         * The meta object literal for the '<em><b>Extendet Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENDET_DATA_AWARE__EXTENDET_DATA = eINSTANCE.getExtendetDataAware_ExtendetData();

        /**
         * The meta object literal for the '<em><b>Add To Extendet Data</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EXTENDET_DATA_AWARE___ADD_TO_EXTENDET_DATA__EXTENDETDATA_OBJECT = eINSTANCE.getExtendetDataAware__AddToExtendetData__ExtendetData_Object();

        /**
         * The meta object literal for the '<em><b>Get Integer Value</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EXTENDET_DATA_AWARE___GET_INTEGER_VALUE__EXTENDETDATA = eINSTANCE.getExtendetDataAware__GetIntegerValue__ExtendetData();

        /**
         * The meta object literal for the '<em><b>Increase Value</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EXTENDET_DATA_AWARE___INCREASE_VALUE__EXTENDETDATA_INT = eINSTANCE.getExtendetDataAware__IncreaseValue__ExtendetData_int();

        /**
         * The meta object literal for the '<em><b>Decrease Value</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EXTENDET_DATA_AWARE___DECREASE_VALUE__EXTENDETDATA_INT = eINSTANCE.getExtendetDataAware__DecreaseValue__ExtendetData_int();

        /**
         * The meta object literal for the '<em><b>Has Value</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EXTENDET_DATA_AWARE___HAS_VALUE__EXTENDETDATA = eINSTANCE.getExtendetDataAware__HasValue__ExtendetData();

        /**
         * The meta object literal for the '<em><b>Add To List</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EXTENDET_DATA_AWARE___ADD_TO_LIST__EXTENDETDATA_OBJECT = eINSTANCE.getExtendetDataAware__AddToList__ExtendetData_Object();

        /**
         * The meta object literal for the '<em><b>Add Unique To List</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EXTENDET_DATA_AWARE___ADD_UNIQUE_TO_LIST__EXTENDETDATA_OBJECT = eINSTANCE.getExtendetDataAware__AddUniqueToList__ExtendetData_Object();

        /**
         * The meta object literal for the '<em><b>Get List Value</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EXTENDET_DATA_AWARE___GET_LIST_VALUE__EXTENDETDATA = eINSTANCE.getExtendetDataAware__GetListValue__ExtendetData();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.runtime.PhyicalState <em>Phyical State</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.runtime.PhyicalState
         * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getPhyicalState()
         * @generated
         */
        EClass PHYICAL_STATE = eINSTANCE.getPhyicalState();

        /**
         * The meta object literal for the '<em><b>Physical Damage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PHYICAL_STATE__PHYSICAL_DAMAGE = eINSTANCE.getPhyicalState_PhysicalDamage();

        /**
         * The meta object literal for the '<em><b>Mental Damage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PHYICAL_STATE__MENTAL_DAMAGE = eINSTANCE.getPhyicalState_MentalDamage();

        /**
         * The meta object literal for the '<em><b>Zustand</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PHYICAL_STATE__ZUSTAND = eINSTANCE.getPhyicalState_Zustand();

        /**
         * The meta object literal for the '<em><b>Over Dead</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PHYICAL_STATE__OVER_DEAD = eINSTANCE.getPhyicalState_OverDead();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.runtime.impl.RuntimeCharacterImpl <em>Character</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimeCharacterImpl
         * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getRuntimeCharacter()
         * @generated
         */
        EClass RUNTIME_CHARACTER = eINSTANCE.getRuntimeCharacter();

        /**
         * The meta object literal for the '<em><b>Character</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RUNTIME_CHARACTER__CHARACTER = eINSTANCE.getRuntimeCharacter_Character();

        /**
         * The meta object literal for the '<em><b>Right Hand</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RUNTIME_CHARACTER__RIGHT_HAND = eINSTANCE.getRuntimeCharacter_RightHand();

        /**
         * The meta object literal for the '<em><b>Left Hand</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RUNTIME_CHARACTER__LEFT_HAND = eINSTANCE.getRuntimeCharacter_LeftHand();

        /**
         * The meta object literal for the '<em><b>In Use</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RUNTIME_CHARACTER__IN_USE = eINSTANCE.getRuntimeCharacter_InUse();

        /**
         * The meta object literal for the '<em><b>Armor</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RUNTIME_CHARACTER__ARMOR = eINSTANCE.getRuntimeCharacter_Armor();

        /**
         * The meta object literal for the '<em><b>Used Edge</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RUNTIME_CHARACTER__USED_EDGE = eINSTANCE.getRuntimeCharacter_UsedEdge();

        /**
         * The meta object literal for the '<em><b>Can Use Edge</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation RUNTIME_CHARACTER___CAN_USE_EDGE = eINSTANCE.getRuntimeCharacter__CanUseEdge();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.runtime.impl.TeamImpl <em>Team</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.runtime.impl.TeamImpl
         * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getTeam()
         * @generated
         */
        EClass TEAM = eINSTANCE.getTeam();

        /**
         * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TEAM__MEMBERS = eINSTANCE.getTeam_Members();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.runtime.impl.AbstractExtendetDataAwareImpl <em>Abstract Extendet Data Aware</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.runtime.impl.AbstractExtendetDataAwareImpl
         * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getAbstractExtendetDataAware()
         * @generated
         */
        EClass ABSTRACT_EXTENDET_DATA_AWARE = eINSTANCE.getAbstractExtendetDataAware();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.runtime.impl.GruntTeamImpl <em>Grunt Team</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.runtime.impl.GruntTeamImpl
         * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getGruntTeam()
         * @generated
         */
        EClass GRUNT_TEAM = eINSTANCE.getGruntTeam();

        /**
         * The meta object literal for the '<em><b>Grunt Group</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRUNT_TEAM__GRUNT_GROUP = eINSTANCE.getGruntTeam_GruntGroup();

        /**
         * The meta object literal for the '<em><b>Build Members</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation GRUNT_TEAM___BUILD_MEMBERS = eINSTANCE.getGruntTeam__BuildMembers();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.runtime.impl.GruntRuntimeCharacterImpl <em>Grunt Runtime Character</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.runtime.impl.GruntRuntimeCharacterImpl
         * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getGruntRuntimeCharacter()
         * @generated
         */
        EClass GRUNT_RUNTIME_CHARACTER = eINSTANCE.getGruntRuntimeCharacter();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.runtime.Zustand <em>Zustand</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.runtime.Zustand
         * @see de.urszeidler.eclipse.shr5.runtime.impl.RuntimePackageImpl#getZustand()
         * @generated
         */
        EEnum ZUSTAND = eINSTANCE.getZustand();

    }

} //RuntimePackage
