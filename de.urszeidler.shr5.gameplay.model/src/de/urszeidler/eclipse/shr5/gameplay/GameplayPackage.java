/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayFactory
 * @model kind="package"
 * @generated
 */
public interface GameplayPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "gameplay";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://urszeidler.de/shr5/gameplay/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "gameplay";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    GameplayPackage eINSTANCE = de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl.init();

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.ExecutionStackImpl <em>Execution Stack</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.ExecutionStackImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getExecutionStack()
     * @generated
     */
    int EXECUTION_STACK = 0;

    /**
     * The feature id for the '<em><b>Current Command</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_STACK__CURRENT_COMMAND = 0;

    /**
     * The feature id for the '<em><b>Protocol</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_STACK__PROTOCOL = 1;

    /**
     * The number of structural features of the '<em>Execution Stack</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_STACK_FEATURE_COUNT = 2;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_STACK___REDO = 0;

    /**
     * The number of operations of the '<em>Execution Stack</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_STACK_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.Command <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.Command
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getCommand()
     * @generated
     */
    int COMMAND = 2;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND__EXECUTED = 0;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND__SUB_COMMANDS = 1;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND__DATE = 2;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND__CMD_CALLBACK = 3;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND__EXECUTING = 4;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND__CAN_EXECUTE = 5;

    /**
     * The number of structural features of the '<em>Command</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND_FEATURE_COUNT = 6;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND___REDO = 0;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND___UNDO = 1;

    /**
     * The number of operations of the '<em>Command</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND_OPERATION_COUNT = 2;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.SubjectCommandImpl <em>Subject Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.SubjectCommandImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSubjectCommand()
     * @generated
     */
    int SUBJECT_COMMAND = 3;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_COMMAND__EXECUTED = COMMAND__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_COMMAND__SUB_COMMANDS = COMMAND__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_COMMAND__DATE = COMMAND__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_COMMAND__CMD_CALLBACK = COMMAND__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_COMMAND__EXECUTING = COMMAND__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_COMMAND__CAN_EXECUTE = COMMAND__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_COMMAND__SUBJECT = COMMAND_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Subject Command</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_COMMAND___REDO = COMMAND___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_COMMAND___UNDO = COMMAND___UNDO;

    /**
     * The number of operations of the '<em>Subject Command</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_COMMAND_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl <em>Probe Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getProbeCommand()
     * @generated
     */
    int PROBE_COMMAND = 9;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__EXECUTED = SUBJECT_COMMAND__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__SUB_COMMANDS = SUBJECT_COMMAND__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__DATE = SUBJECT_COMMAND__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__CMD_CALLBACK = SUBJECT_COMMAND__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__EXECUTING = SUBJECT_COMMAND__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__CAN_EXECUTE = SUBJECT_COMMAND__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__SUBJECT = SUBJECT_COMMAND__SUBJECT;

    /**
     * The feature id for the '<em><b>Probe</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__PROBE = SUBJECT_COMMAND_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Successes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__SUCCESSES = SUBJECT_COMMAND_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Glitches</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__GLITCHES = SUBJECT_COMMAND_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__LIMIT = SUBJECT_COMMAND_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Probe State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__PROBE_STATE = SUBJECT_COMMAND_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Probe Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__PROBE_MODS = SUBJECT_COMMAND_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Skip Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__SKIP_TEST = SUBJECT_COMMAND_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Push The Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__PUSH_THE_LIMIT = SUBJECT_COMMAND_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Second Chance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__SECOND_CHANCE = SUBJECT_COMMAND_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Close Call</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__CLOSE_CALL = SUBJECT_COMMAND_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Thresholds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__THRESHOLDS = SUBJECT_COMMAND_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Net Hits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__NET_HITS = SUBJECT_COMMAND_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Test State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__TEST_STATE = SUBJECT_COMMAND_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Mods</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__MODS = SUBJECT_COMMAND_FEATURE_COUNT + 13;

    /**
     * The number of structural features of the '<em>Probe Command</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND_FEATURE_COUNT = SUBJECT_COMMAND_FEATURE_COUNT + 14;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND___REDO = SUBJECT_COMMAND___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND___UNDO = SUBJECT_COMMAND___UNDO;

    /**
     * The number of operations of the '<em>Probe Command</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND_OPERATION_COUNT = SUBJECT_COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.DamageTestImpl <em>Damage Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.DamageTestImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getDamageTest()
     * @generated
     */
    int DAMAGE_TEST = 1;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__EXECUTED = PROBE_COMMAND__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__SUB_COMMANDS = PROBE_COMMAND__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__DATE = PROBE_COMMAND__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__CMD_CALLBACK = PROBE_COMMAND__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__EXECUTING = PROBE_COMMAND__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__CAN_EXECUTE = PROBE_COMMAND__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__SUBJECT = PROBE_COMMAND__SUBJECT;

    /**
     * The feature id for the '<em><b>Probe</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__PROBE = PROBE_COMMAND__PROBE;

    /**
     * The feature id for the '<em><b>Successes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__SUCCESSES = PROBE_COMMAND__SUCCESSES;

    /**
     * The feature id for the '<em><b>Glitches</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__GLITCHES = PROBE_COMMAND__GLITCHES;

    /**
     * The feature id for the '<em><b>Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__LIMIT = PROBE_COMMAND__LIMIT;

    /**
     * The feature id for the '<em><b>Probe State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__PROBE_STATE = PROBE_COMMAND__PROBE_STATE;

    /**
     * The feature id for the '<em><b>Probe Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__PROBE_MODS = PROBE_COMMAND__PROBE_MODS;

    /**
     * The feature id for the '<em><b>Skip Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__SKIP_TEST = PROBE_COMMAND__SKIP_TEST;

    /**
     * The feature id for the '<em><b>Push The Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__PUSH_THE_LIMIT = PROBE_COMMAND__PUSH_THE_LIMIT;

    /**
     * The feature id for the '<em><b>Second Chance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__SECOND_CHANCE = PROBE_COMMAND__SECOND_CHANCE;

    /**
     * The feature id for the '<em><b>Close Call</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__CLOSE_CALL = PROBE_COMMAND__CLOSE_CALL;

    /**
     * The feature id for the '<em><b>Thresholds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__THRESHOLDS = PROBE_COMMAND__THRESHOLDS;

    /**
     * The feature id for the '<em><b>Net Hits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__NET_HITS = PROBE_COMMAND__NET_HITS;

    /**
     * The feature id for the '<em><b>Test State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__TEST_STATE = PROBE_COMMAND__TEST_STATE;

    /**
     * The feature id for the '<em><b>Mods</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__MODS = PROBE_COMMAND__MODS;

    /**
     * The feature id for the '<em><b>Damage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__DAMAGE = PROBE_COMMAND_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Dv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__DV = PROBE_COMMAND_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Effective Damage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST__EFFECTIVE_DAMAGE = PROBE_COMMAND_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Damage Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST_FEATURE_COUNT = PROBE_COMMAND_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST___REDO = PROBE_COMMAND___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST___UNDO = PROBE_COMMAND___UNDO;

    /**
     * The number of operations of the '<em>Damage Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST_OPERATION_COUNT = PROBE_COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.SkillTestCmdImpl <em>Skill Test Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.SkillTestCmdImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSkillTestCmd()
     * @generated
     */
    int SKILL_TEST_CMD = 4;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__EXECUTED = PROBE_COMMAND__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__SUB_COMMANDS = PROBE_COMMAND__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__DATE = PROBE_COMMAND__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__CMD_CALLBACK = PROBE_COMMAND__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__EXECUTING = PROBE_COMMAND__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__CAN_EXECUTE = PROBE_COMMAND__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__SUBJECT = PROBE_COMMAND__SUBJECT;

    /**
     * The feature id for the '<em><b>Probe</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__PROBE = PROBE_COMMAND__PROBE;

    /**
     * The feature id for the '<em><b>Successes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__SUCCESSES = PROBE_COMMAND__SUCCESSES;

    /**
     * The feature id for the '<em><b>Glitches</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__GLITCHES = PROBE_COMMAND__GLITCHES;

    /**
     * The feature id for the '<em><b>Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__LIMIT = PROBE_COMMAND__LIMIT;

    /**
     * The feature id for the '<em><b>Probe State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__PROBE_STATE = PROBE_COMMAND__PROBE_STATE;

    /**
     * The feature id for the '<em><b>Probe Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__PROBE_MODS = PROBE_COMMAND__PROBE_MODS;

    /**
     * The feature id for the '<em><b>Skip Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__SKIP_TEST = PROBE_COMMAND__SKIP_TEST;

    /**
     * The feature id for the '<em><b>Push The Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__PUSH_THE_LIMIT = PROBE_COMMAND__PUSH_THE_LIMIT;

    /**
     * The feature id for the '<em><b>Second Chance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__SECOND_CHANCE = PROBE_COMMAND__SECOND_CHANCE;

    /**
     * The feature id for the '<em><b>Close Call</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__CLOSE_CALL = PROBE_COMMAND__CLOSE_CALL;

    /**
     * The feature id for the '<em><b>Thresholds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__THRESHOLDS = PROBE_COMMAND__THRESHOLDS;

    /**
     * The feature id for the '<em><b>Net Hits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__NET_HITS = PROBE_COMMAND__NET_HITS;

    /**
     * The feature id for the '<em><b>Test State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__TEST_STATE = PROBE_COMMAND__TEST_STATE;

    /**
     * The feature id for the '<em><b>Mods</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__MODS = PROBE_COMMAND__MODS;

    /**
     * The feature id for the '<em><b>Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD__SKILL = PROBE_COMMAND_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Skill Test Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD_FEATURE_COUNT = PROBE_COMMAND_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD___REDO = PROBE_COMMAND___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD___UNDO = PROBE_COMMAND___UNDO;

    /**
     * The number of operations of the '<em>Skill Test Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SKILL_TEST_CMD_OPERATION_COUNT = PROBE_COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.OpposedSkillTestCmdImpl <em>Opposed Skill Test Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.OpposedSkillTestCmdImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getOpposedSkillTestCmd()
     * @generated
     */
    int OPPOSED_SKILL_TEST_CMD = 5;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__EXECUTED = SKILL_TEST_CMD__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__SUB_COMMANDS = SKILL_TEST_CMD__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__DATE = SKILL_TEST_CMD__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__CMD_CALLBACK = SKILL_TEST_CMD__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__EXECUTING = SKILL_TEST_CMD__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__CAN_EXECUTE = SKILL_TEST_CMD__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__SUBJECT = SKILL_TEST_CMD__SUBJECT;

    /**
     * The feature id for the '<em><b>Probe</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__PROBE = SKILL_TEST_CMD__PROBE;

    /**
     * The feature id for the '<em><b>Successes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__SUCCESSES = SKILL_TEST_CMD__SUCCESSES;

    /**
     * The feature id for the '<em><b>Glitches</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__GLITCHES = SKILL_TEST_CMD__GLITCHES;

    /**
     * The feature id for the '<em><b>Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__LIMIT = SKILL_TEST_CMD__LIMIT;

    /**
     * The feature id for the '<em><b>Probe State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__PROBE_STATE = SKILL_TEST_CMD__PROBE_STATE;

    /**
     * The feature id for the '<em><b>Probe Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__PROBE_MODS = SKILL_TEST_CMD__PROBE_MODS;

    /**
     * The feature id for the '<em><b>Skip Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__SKIP_TEST = SKILL_TEST_CMD__SKIP_TEST;

    /**
     * The feature id for the '<em><b>Push The Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__PUSH_THE_LIMIT = SKILL_TEST_CMD__PUSH_THE_LIMIT;

    /**
     * The feature id for the '<em><b>Second Chance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__SECOND_CHANCE = SKILL_TEST_CMD__SECOND_CHANCE;

    /**
     * The feature id for the '<em><b>Close Call</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__CLOSE_CALL = SKILL_TEST_CMD__CLOSE_CALL;

    /**
     * The feature id for the '<em><b>Thresholds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__THRESHOLDS = SKILL_TEST_CMD__THRESHOLDS;

    /**
     * The feature id for the '<em><b>Net Hits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__NET_HITS = SKILL_TEST_CMD__NET_HITS;

    /**
     * The feature id for the '<em><b>Test State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__TEST_STATE = SKILL_TEST_CMD__TEST_STATE;

    /**
     * The feature id for the '<em><b>Mods</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__MODS = SKILL_TEST_CMD__MODS;

    /**
     * The feature id for the '<em><b>Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__SKILL = SKILL_TEST_CMD__SKILL;

    /**
     * The feature id for the '<em><b>Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__OBJECT = SKILL_TEST_CMD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Object Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD__OBJECT_SKILL = SKILL_TEST_CMD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Opposed Skill Test Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD_FEATURE_COUNT = SKILL_TEST_CMD_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD___REDO = SKILL_TEST_CMD___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD___UNDO = SKILL_TEST_CMD___UNDO;

    /**
     * The number of operations of the '<em>Opposed Skill Test Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD_OPERATION_COUNT = SKILL_TEST_CMD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.InitativeImpl <em>Initative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.InitativeImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getInitative()
     * @generated
     */
    int INITATIVE = 6;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE__EXECUTED = SUBJECT_COMMAND__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE__SUB_COMMANDS = SUBJECT_COMMAND__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE__DATE = SUBJECT_COMMAND__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE__CMD_CALLBACK = SUBJECT_COMMAND__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE__EXECUTING = SUBJECT_COMMAND__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE__CAN_EXECUTE = SUBJECT_COMMAND__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE__SUBJECT = SUBJECT_COMMAND__SUBJECT;

    /**
     * The feature id for the '<em><b>Ini</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE__INI = SUBJECT_COMMAND_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Actual Ini</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE__ACTUAL_INI = SUBJECT_COMMAND_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Size Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE__SIZE_INITATIVE = SUBJECT_COMMAND_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Initative</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_FEATURE_COUNT = SUBJECT_COMMAND_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE___REDO = SUBJECT_COMMAND___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE___UNDO = SUBJECT_COMMAND___UNDO;

    /**
     * The operation id for the '<em>Next Pass</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE___NEXT_PASS__INT = SUBJECT_COMMAND_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Initative</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_OPERATION_COUNT = SUBJECT_COMMAND_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.ExecutionProtocolImpl <em>Execution Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.ExecutionProtocolImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getExecutionProtocol()
     * @generated
     */
    int EXECUTION_PROTOCOL = 7;

    /**
     * The feature id for the '<em><b>Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PROTOCOL__COMMANDS = 0;

    /**
     * The number of structural features of the '<em>Execution Protocol</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PROTOCOL_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Execution Protocol</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_PROTOCOL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.Probe <em>Probe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.Probe
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getProbe()
     * @generated
     */
    int PROBE = 8;

    /**
     * The feature id for the '<em><b>Probe</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE__PROBE = 0;

    /**
     * The feature id for the '<em><b>Successes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE__SUCCESSES = 1;

    /**
     * The feature id for the '<em><b>Glitches</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE__GLITCHES = 2;

    /**
     * The feature id for the '<em><b>Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE__LIMIT = 3;

    /**
     * The feature id for the '<em><b>Probe State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE__PROBE_STATE = 4;

    /**
     * The feature id for the '<em><b>Probe Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE__PROBE_MODS = 5;

    /**
     * The feature id for the '<em><b>Skip Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE__SKIP_TEST = 6;

    /**
     * The feature id for the '<em><b>Push The Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE__PUSH_THE_LIMIT = 7;

    /**
     * The feature id for the '<em><b>Second Chance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE__SECOND_CHANCE = 8;

    /**
     * The feature id for the '<em><b>Close Call</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE__CLOSE_CALL = 9;

    /**
     * The number of structural features of the '<em>Probe</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_FEATURE_COUNT = 10;

    /**
     * The number of operations of the '<em>Probe</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.PhaseCmd <em>Phase Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.PhaseCmd
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getPhaseCmd()
     * @generated
     */
    int PHASE_CMD = 10;

    /**
     * The feature id for the '<em><b>Phase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHASE_CMD__PHASE = 0;

    /**
     * The number of structural features of the '<em>Phase Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHASE_CMD_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Phase Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHASE_CMD_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl <em>Combat Turn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getCombatTurn()
     * @generated
     */
    int COMBAT_TURN = 11;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBAT_TURN__EXECUTED = COMMAND__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBAT_TURN__SUB_COMMANDS = COMMAND__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBAT_TURN__DATE = COMMAND__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBAT_TURN__CMD_CALLBACK = COMMAND__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBAT_TURN__EXECUTING = COMMAND__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBAT_TURN__CAN_EXECUTE = COMMAND__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Combatants</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBAT_TURN__COMBATANTS = COMMAND_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Action Phases</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBAT_TURN__ACTION_PHASES = COMMAND_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Current Turn</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBAT_TURN__CURRENT_TURN = COMMAND_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBAT_TURN__SEQUENCE = COMMAND_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Combat Turn</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBAT_TURN_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBAT_TURN___REDO = COMMAND___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBAT_TURN___UNDO = COMMAND___UNDO;

    /**
     * The operation id for the '<em>Do Turn</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBAT_TURN___DO_TURN = COMMAND_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Combat Turn</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBAT_TURN_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 1;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTest <em>Succes Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.SuccesTest
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSuccesTest()
     * @generated
     */
    int SUCCES_TEST = 12;

    /**
     * The feature id for the '<em><b>Probe</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST__PROBE = PROBE__PROBE;

    /**
     * The feature id for the '<em><b>Successes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST__SUCCESSES = PROBE__SUCCESSES;

    /**
     * The feature id for the '<em><b>Glitches</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST__GLITCHES = PROBE__GLITCHES;

    /**
     * The feature id for the '<em><b>Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST__LIMIT = PROBE__LIMIT;

    /**
     * The feature id for the '<em><b>Probe State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST__PROBE_STATE = PROBE__PROBE_STATE;

    /**
     * The feature id for the '<em><b>Probe Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST__PROBE_MODS = PROBE__PROBE_MODS;

    /**
     * The feature id for the '<em><b>Skip Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST__SKIP_TEST = PROBE__SKIP_TEST;

    /**
     * The feature id for the '<em><b>Push The Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST__PUSH_THE_LIMIT = PROBE__PUSH_THE_LIMIT;

    /**
     * The feature id for the '<em><b>Second Chance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST__SECOND_CHANCE = PROBE__SECOND_CHANCE;

    /**
     * The feature id for the '<em><b>Close Call</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST__CLOSE_CALL = PROBE__CLOSE_CALL;

    /**
     * The feature id for the '<em><b>Thresholds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST__THRESHOLDS = PROBE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Net Hits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST__NET_HITS = PROBE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Test State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST__TEST_STATE = PROBE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Succes Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_FEATURE_COUNT = PROBE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Succes Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_OPERATION_COUNT = PROBE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.ExtendetSkillTestCmdImpl <em>Extendet Skill Test Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.ExtendetSkillTestCmdImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getExtendetSkillTestCmd()
     * @generated
     */
    int EXTENDET_SKILL_TEST_CMD = 13;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__EXECUTED = SKILL_TEST_CMD__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__SUB_COMMANDS = SKILL_TEST_CMD__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__DATE = SKILL_TEST_CMD__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__CMD_CALLBACK = SKILL_TEST_CMD__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__EXECUTING = SKILL_TEST_CMD__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__CAN_EXECUTE = SKILL_TEST_CMD__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__SUBJECT = SKILL_TEST_CMD__SUBJECT;

    /**
     * The feature id for the '<em><b>Probe</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__PROBE = SKILL_TEST_CMD__PROBE;

    /**
     * The feature id for the '<em><b>Successes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__SUCCESSES = SKILL_TEST_CMD__SUCCESSES;

    /**
     * The feature id for the '<em><b>Glitches</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__GLITCHES = SKILL_TEST_CMD__GLITCHES;

    /**
     * The feature id for the '<em><b>Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__LIMIT = SKILL_TEST_CMD__LIMIT;

    /**
     * The feature id for the '<em><b>Probe State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__PROBE_STATE = SKILL_TEST_CMD__PROBE_STATE;

    /**
     * The feature id for the '<em><b>Probe Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__PROBE_MODS = SKILL_TEST_CMD__PROBE_MODS;

    /**
     * The feature id for the '<em><b>Skip Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__SKIP_TEST = SKILL_TEST_CMD__SKIP_TEST;

    /**
     * The feature id for the '<em><b>Push The Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__PUSH_THE_LIMIT = SKILL_TEST_CMD__PUSH_THE_LIMIT;

    /**
     * The feature id for the '<em><b>Second Chance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__SECOND_CHANCE = SKILL_TEST_CMD__SECOND_CHANCE;

    /**
     * The feature id for the '<em><b>Close Call</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__CLOSE_CALL = SKILL_TEST_CMD__CLOSE_CALL;

    /**
     * The feature id for the '<em><b>Thresholds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__THRESHOLDS = SKILL_TEST_CMD__THRESHOLDS;

    /**
     * The feature id for the '<em><b>Net Hits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__NET_HITS = SKILL_TEST_CMD__NET_HITS;

    /**
     * The feature id for the '<em><b>Test State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__TEST_STATE = SKILL_TEST_CMD__TEST_STATE;

    /**
     * The feature id for the '<em><b>Mods</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__MODS = SKILL_TEST_CMD__MODS;

    /**
     * The feature id for the '<em><b>Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__SKILL = SKILL_TEST_CMD__SKILL;

    /**
     * The feature id for the '<em><b>Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__START_DATE = SKILL_TEST_CMD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Intervall</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD__INTERVALL = SKILL_TEST_CMD_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Extendet Skill Test Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD_FEATURE_COUNT = SKILL_TEST_CMD_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD___REDO = SKILL_TEST_CMD___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD___UNDO = SKILL_TEST_CMD___UNDO;

    /**
     * The number of operations of the '<em>Extendet Skill Test Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD_OPERATION_COUNT = SKILL_TEST_CMD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.DefensTestCmdImpl <em>Defens Test Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.DefensTestCmdImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getDefensTestCmd()
     * @generated
     */
    int DEFENS_TEST_CMD = 14;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__EXECUTED = PROBE_COMMAND__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__SUB_COMMANDS = PROBE_COMMAND__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__DATE = PROBE_COMMAND__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__CMD_CALLBACK = PROBE_COMMAND__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__EXECUTING = PROBE_COMMAND__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__CAN_EXECUTE = PROBE_COMMAND__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__SUBJECT = PROBE_COMMAND__SUBJECT;

    /**
     * The feature id for the '<em><b>Probe</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__PROBE = PROBE_COMMAND__PROBE;

    /**
     * The feature id for the '<em><b>Successes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__SUCCESSES = PROBE_COMMAND__SUCCESSES;

    /**
     * The feature id for the '<em><b>Glitches</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__GLITCHES = PROBE_COMMAND__GLITCHES;

    /**
     * The feature id for the '<em><b>Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__LIMIT = PROBE_COMMAND__LIMIT;

    /**
     * The feature id for the '<em><b>Probe State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__PROBE_STATE = PROBE_COMMAND__PROBE_STATE;

    /**
     * The feature id for the '<em><b>Probe Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__PROBE_MODS = PROBE_COMMAND__PROBE_MODS;

    /**
     * The feature id for the '<em><b>Skip Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__SKIP_TEST = PROBE_COMMAND__SKIP_TEST;

    /**
     * The feature id for the '<em><b>Push The Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__PUSH_THE_LIMIT = PROBE_COMMAND__PUSH_THE_LIMIT;

    /**
     * The feature id for the '<em><b>Second Chance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__SECOND_CHANCE = PROBE_COMMAND__SECOND_CHANCE;

    /**
     * The feature id for the '<em><b>Close Call</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__CLOSE_CALL = PROBE_COMMAND__CLOSE_CALL;

    /**
     * The feature id for the '<em><b>Thresholds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__THRESHOLDS = PROBE_COMMAND__THRESHOLDS;

    /**
     * The feature id for the '<em><b>Net Hits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__NET_HITS = PROBE_COMMAND__NET_HITS;

    /**
     * The feature id for the '<em><b>Test State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__TEST_STATE = PROBE_COMMAND__TEST_STATE;

    /**
     * The feature id for the '<em><b>Mods</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__MODS = PROBE_COMMAND__MODS;

    /**
     * The feature id for the '<em><b>Attackers Hits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD__ATTACKERS_HITS = PROBE_COMMAND_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Defens Test Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD_FEATURE_COUNT = PROBE_COMMAND_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD___REDO = PROBE_COMMAND___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD___UNDO = PROBE_COMMAND___UNDO;

    /**
     * The number of operations of the '<em>Defens Test Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFENS_TEST_CMD_OPERATION_COUNT = PROBE_COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.SuccesTestCmdImpl <em>Succes Test Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.SuccesTestCmdImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSuccesTestCmd()
     * @generated
     */
    int SUCCES_TEST_CMD = 15;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__EXECUTED = PROBE_COMMAND__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__SUB_COMMANDS = PROBE_COMMAND__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__DATE = PROBE_COMMAND__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__CMD_CALLBACK = PROBE_COMMAND__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__EXECUTING = PROBE_COMMAND__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__CAN_EXECUTE = PROBE_COMMAND__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__SUBJECT = PROBE_COMMAND__SUBJECT;

    /**
     * The feature id for the '<em><b>Probe</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__PROBE = PROBE_COMMAND__PROBE;

    /**
     * The feature id for the '<em><b>Successes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__SUCCESSES = PROBE_COMMAND__SUCCESSES;

    /**
     * The feature id for the '<em><b>Glitches</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__GLITCHES = PROBE_COMMAND__GLITCHES;

    /**
     * The feature id for the '<em><b>Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__LIMIT = PROBE_COMMAND__LIMIT;

    /**
     * The feature id for the '<em><b>Probe State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__PROBE_STATE = PROBE_COMMAND__PROBE_STATE;

    /**
     * The feature id for the '<em><b>Probe Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__PROBE_MODS = PROBE_COMMAND__PROBE_MODS;

    /**
     * The feature id for the '<em><b>Skip Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__SKIP_TEST = PROBE_COMMAND__SKIP_TEST;

    /**
     * The feature id for the '<em><b>Push The Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__PUSH_THE_LIMIT = PROBE_COMMAND__PUSH_THE_LIMIT;

    /**
     * The feature id for the '<em><b>Second Chance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__SECOND_CHANCE = PROBE_COMMAND__SECOND_CHANCE;

    /**
     * The feature id for the '<em><b>Close Call</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__CLOSE_CALL = PROBE_COMMAND__CLOSE_CALL;

    /**
     * The feature id for the '<em><b>Thresholds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__THRESHOLDS = PROBE_COMMAND__THRESHOLDS;

    /**
     * The feature id for the '<em><b>Net Hits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__NET_HITS = PROBE_COMMAND__NET_HITS;

    /**
     * The feature id for the '<em><b>Test State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__TEST_STATE = PROBE_COMMAND__TEST_STATE;

    /**
     * The feature id for the '<em><b>Mods</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__MODS = PROBE_COMMAND__MODS;

    /**
     * The feature id for the '<em><b>Dice Pool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD__DICE_POOL = PROBE_COMMAND_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Succes Test Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD_FEATURE_COUNT = PROBE_COMMAND_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD___REDO = PROBE_COMMAND___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD___UNDO = PROBE_COMMAND___UNDO;

    /**
     * The number of operations of the '<em>Succes Test Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_CMD_OPERATION_COUNT = PROBE_COMMAND_OPERATION_COUNT + 0;


    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.InitativePassImpl <em>Initative Pass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.InitativePassImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getInitativePass()
     * @generated
     */
    int INITATIVE_PASS = 16;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_PASS__EXECUTED = SUBJECT_COMMAND__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_PASS__SUB_COMMANDS = SUBJECT_COMMAND__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_PASS__DATE = SUBJECT_COMMAND__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_PASS__CMD_CALLBACK = SUBJECT_COMMAND__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_PASS__EXECUTING = SUBJECT_COMMAND__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_PASS__CAN_EXECUTE = SUBJECT_COMMAND__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_PASS__SUBJECT = SUBJECT_COMMAND__SUBJECT;

    /**
     * The feature id for the '<em><b>Phase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_PASS__PHASE = SUBJECT_COMMAND_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Turn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_PASS__TURN = SUBJECT_COMMAND_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Size Initative</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_PASS__SIZE_INITATIVE = SUBJECT_COMMAND_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Action</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_PASS__ACTION = SUBJECT_COMMAND_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Free Action</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_PASS__FREE_ACTION = SUBJECT_COMMAND_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Interrupt Action</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_PASS__INTERRUPT_ACTION = SUBJECT_COMMAND_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Initative Pass</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_PASS_FEATURE_COUNT = SUBJECT_COMMAND_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_PASS___REDO = SUBJECT_COMMAND___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_PASS___UNDO = SUBJECT_COMMAND___UNDO;

    /**
     * The number of operations of the '<em>Initative Pass</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITATIVE_PASS_OPERATION_COUNT = SUBJECT_COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.CommandWrapperImpl <em>Command Wrapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.CommandWrapperImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getCommandWrapper()
     * @generated
     */
    int COMMAND_WRAPPER = 17;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND_WRAPPER__EXECUTED = SUBJECT_COMMAND__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND_WRAPPER__SUB_COMMANDS = SUBJECT_COMMAND__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND_WRAPPER__DATE = SUBJECT_COMMAND__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND_WRAPPER__CMD_CALLBACK = SUBJECT_COMMAND__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND_WRAPPER__EXECUTING = SUBJECT_COMMAND__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND_WRAPPER__CAN_EXECUTE = SUBJECT_COMMAND__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND_WRAPPER__SUBJECT = SUBJECT_COMMAND__SUBJECT;

    /**
     * The number of structural features of the '<em>Command Wrapper</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND_WRAPPER_FEATURE_COUNT = SUBJECT_COMMAND_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND_WRAPPER___REDO = SUBJECT_COMMAND___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND_WRAPPER___UNDO = SUBJECT_COMMAND___UNDO;

    /**
     * The number of operations of the '<em>Command Wrapper</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND_WRAPPER_OPERATION_COUNT = SUBJECT_COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.ComplexActionImpl <em>Complex Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.ComplexActionImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getComplexAction()
     * @generated
     */
    int COMPLEX_ACTION = 18;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_ACTION__EXECUTED = COMMAND_WRAPPER__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_ACTION__SUB_COMMANDS = COMMAND_WRAPPER__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_ACTION__DATE = COMMAND_WRAPPER__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_ACTION__CMD_CALLBACK = COMMAND_WRAPPER__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_ACTION__EXECUTING = COMMAND_WRAPPER__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_ACTION__CAN_EXECUTE = COMMAND_WRAPPER__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_ACTION__SUBJECT = COMMAND_WRAPPER__SUBJECT;

    /**
     * The number of structural features of the '<em>Complex Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_ACTION_FEATURE_COUNT = COMMAND_WRAPPER_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_ACTION___REDO = COMMAND_WRAPPER___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_ACTION___UNDO = COMMAND_WRAPPER___UNDO;

    /**
     * The number of operations of the '<em>Complex Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPLEX_ACTION_OPERATION_COUNT = COMMAND_WRAPPER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.SimpleActionImpl <em>Simple Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.SimpleActionImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSimpleAction()
     * @generated
     */
    int SIMPLE_ACTION = 19;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTION__EXECUTED = SUBJECT_COMMAND__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTION__SUB_COMMANDS = SUBJECT_COMMAND__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTION__DATE = SUBJECT_COMMAND__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTION__CMD_CALLBACK = SUBJECT_COMMAND__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTION__EXECUTING = SUBJECT_COMMAND__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTION__CAN_EXECUTE = SUBJECT_COMMAND__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTION__SUBJECT = SUBJECT_COMMAND__SUBJECT;

    /**
     * The number of structural features of the '<em>Simple Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTION_FEATURE_COUNT = SUBJECT_COMMAND_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTION___REDO = SUBJECT_COMMAND___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTION___UNDO = SUBJECT_COMMAND___UNDO;

    /**
     * The number of operations of the '<em>Simple Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTION_OPERATION_COUNT = SUBJECT_COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.SimpleActionsImpl <em>Simple Actions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.SimpleActionsImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSimpleActions()
     * @generated
     */
    int SIMPLE_ACTIONS = 20;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTIONS__EXECUTED = COMMAND_WRAPPER__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTIONS__SUB_COMMANDS = COMMAND_WRAPPER__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTIONS__DATE = COMMAND_WRAPPER__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTIONS__CMD_CALLBACK = COMMAND_WRAPPER__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTIONS__EXECUTING = COMMAND_WRAPPER__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTIONS__CAN_EXECUTE = COMMAND_WRAPPER__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTIONS__SUBJECT = COMMAND_WRAPPER__SUBJECT;

    /**
     * The feature id for the '<em><b>Action1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTIONS__ACTION1 = COMMAND_WRAPPER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Action2</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTIONS__ACTION2 = COMMAND_WRAPPER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Simple Actions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTIONS_FEATURE_COUNT = COMMAND_WRAPPER_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTIONS___REDO = COMMAND_WRAPPER___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTIONS___UNDO = COMMAND_WRAPPER___UNDO;

    /**
     * The number of operations of the '<em>Simple Actions</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIMPLE_ACTIONS_OPERATION_COUNT = COMMAND_WRAPPER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.FreeActionImpl <em>Free Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.FreeActionImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getFreeAction()
     * @generated
     */
    int FREE_ACTION = 21;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FREE_ACTION__EXECUTED = SUBJECT_COMMAND__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FREE_ACTION__SUB_COMMANDS = SUBJECT_COMMAND__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FREE_ACTION__DATE = SUBJECT_COMMAND__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FREE_ACTION__CMD_CALLBACK = SUBJECT_COMMAND__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FREE_ACTION__EXECUTING = SUBJECT_COMMAND__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FREE_ACTION__CAN_EXECUTE = SUBJECT_COMMAND__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FREE_ACTION__SUBJECT = SUBJECT_COMMAND__SUBJECT;

    /**
     * The number of structural features of the '<em>Free Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FREE_ACTION_FEATURE_COUNT = SUBJECT_COMMAND_FEATURE_COUNT + 0;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FREE_ACTION___REDO = SUBJECT_COMMAND___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FREE_ACTION___UNDO = SUBJECT_COMMAND___UNDO;

    /**
     * The number of operations of the '<em>Free Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FREE_ACTION_OPERATION_COUNT = SUBJECT_COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.InterruptActionImpl <em>Interrupt Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.InterruptActionImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getInterruptAction()
     * @generated
     */
    int INTERRUPT_ACTION = 22;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERRUPT_ACTION__EXECUTED = SUBJECT_COMMAND__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERRUPT_ACTION__SUB_COMMANDS = SUBJECT_COMMAND__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERRUPT_ACTION__DATE = SUBJECT_COMMAND__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERRUPT_ACTION__CMD_CALLBACK = SUBJECT_COMMAND__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERRUPT_ACTION__EXECUTING = SUBJECT_COMMAND__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERRUPT_ACTION__CAN_EXECUTE = SUBJECT_COMMAND__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERRUPT_ACTION__SUBJECT = SUBJECT_COMMAND__SUBJECT;

    /**
     * The feature id for the '<em><b>Ini Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERRUPT_ACTION__INI_COST = SUBJECT_COMMAND_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Interrupt Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERRUPT_ACTION__INTERRUPT_TYPE = SUBJECT_COMMAND_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Interrupt Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERRUPT_ACTION_FEATURE_COUNT = SUBJECT_COMMAND_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERRUPT_ACTION___REDO = SUBJECT_COMMAND___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERRUPT_ACTION___UNDO = SUBJECT_COMMAND___UNDO;

    /**
     * The number of operations of the '<em>Interrupt Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERRUPT_ACTION_OPERATION_COUNT = SUBJECT_COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetFeatureCommandImpl <em>Set Feature Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.SetFeatureCommandImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSetFeatureCommand()
     * @generated
     */
    int SET_FEATURE_COMMAND = 23;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_FEATURE_COMMAND__EXECUTED = COMMAND__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_FEATURE_COMMAND__SUB_COMMANDS = COMMAND__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_FEATURE_COMMAND__DATE = COMMAND__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_FEATURE_COMMAND__CMD_CALLBACK = COMMAND__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_FEATURE_COMMAND__EXECUTING = COMMAND__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_FEATURE_COMMAND__CAN_EXECUTE = COMMAND__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_FEATURE_COMMAND__VALUE = COMMAND_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_FEATURE_COMMAND__OBJECT = COMMAND_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Feature</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_FEATURE_COMMAND__FEATURE = COMMAND_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Set Feature Command</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_FEATURE_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_FEATURE_COMMAND___REDO = COMMAND___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_FEATURE_COMMAND___UNDO = COMMAND___UNDO;

    /**
     * The number of operations of the '<em>Set Feature Command</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_FEATURE_COMMAND_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.MeeleAttackCmdImpl <em>Meele Attack Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.MeeleAttackCmdImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getMeeleAttackCmd()
     * @generated
     */
    int MEELE_ATTACK_CMD = 24;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__EXECUTED = OPPOSED_SKILL_TEST_CMD__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__SUB_COMMANDS = OPPOSED_SKILL_TEST_CMD__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__DATE = OPPOSED_SKILL_TEST_CMD__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__CMD_CALLBACK = OPPOSED_SKILL_TEST_CMD__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__EXECUTING = OPPOSED_SKILL_TEST_CMD__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__CAN_EXECUTE = OPPOSED_SKILL_TEST_CMD__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__SUBJECT = OPPOSED_SKILL_TEST_CMD__SUBJECT;

    /**
     * The feature id for the '<em><b>Probe</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__PROBE = OPPOSED_SKILL_TEST_CMD__PROBE;

    /**
     * The feature id for the '<em><b>Successes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__SUCCESSES = OPPOSED_SKILL_TEST_CMD__SUCCESSES;

    /**
     * The feature id for the '<em><b>Glitches</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__GLITCHES = OPPOSED_SKILL_TEST_CMD__GLITCHES;

    /**
     * The feature id for the '<em><b>Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__LIMIT = OPPOSED_SKILL_TEST_CMD__LIMIT;

    /**
     * The feature id for the '<em><b>Probe State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__PROBE_STATE = OPPOSED_SKILL_TEST_CMD__PROBE_STATE;

    /**
     * The feature id for the '<em><b>Probe Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__PROBE_MODS = OPPOSED_SKILL_TEST_CMD__PROBE_MODS;

    /**
     * The feature id for the '<em><b>Skip Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__SKIP_TEST = OPPOSED_SKILL_TEST_CMD__SKIP_TEST;

    /**
     * The feature id for the '<em><b>Push The Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__PUSH_THE_LIMIT = OPPOSED_SKILL_TEST_CMD__PUSH_THE_LIMIT;

    /**
     * The feature id for the '<em><b>Second Chance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__SECOND_CHANCE = OPPOSED_SKILL_TEST_CMD__SECOND_CHANCE;

    /**
     * The feature id for the '<em><b>Close Call</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__CLOSE_CALL = OPPOSED_SKILL_TEST_CMD__CLOSE_CALL;

    /**
     * The feature id for the '<em><b>Thresholds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__THRESHOLDS = OPPOSED_SKILL_TEST_CMD__THRESHOLDS;

    /**
     * The feature id for the '<em><b>Net Hits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__NET_HITS = OPPOSED_SKILL_TEST_CMD__NET_HITS;

    /**
     * The feature id for the '<em><b>Test State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__TEST_STATE = OPPOSED_SKILL_TEST_CMD__TEST_STATE;

    /**
     * The feature id for the '<em><b>Mods</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__MODS = OPPOSED_SKILL_TEST_CMD__MODS;

    /**
     * The feature id for the '<em><b>Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__SKILL = OPPOSED_SKILL_TEST_CMD__SKILL;

    /**
     * The feature id for the '<em><b>Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__OBJECT = OPPOSED_SKILL_TEST_CMD__OBJECT;

    /**
     * The feature id for the '<em><b>Object Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__OBJECT_SKILL = OPPOSED_SKILL_TEST_CMD__OBJECT_SKILL;

    /**
     * The feature id for the '<em><b>Weapon</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD__WEAPON = OPPOSED_SKILL_TEST_CMD_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Meele Attack Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD_FEATURE_COUNT = OPPOSED_SKILL_TEST_CMD_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD___REDO = OPPOSED_SKILL_TEST_CMD___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD___UNDO = OPPOSED_SKILL_TEST_CMD___UNDO;

    /**
     * The number of operations of the '<em>Meele Attack Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEELE_ATTACK_CMD_OPERATION_COUNT = OPPOSED_SKILL_TEST_CMD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.RangedAttackCmdImpl <em>Ranged Attack Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.RangedAttackCmdImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getRangedAttackCmd()
     * @generated
     */
    int RANGED_ATTACK_CMD = 25;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__EXECUTED = OPPOSED_SKILL_TEST_CMD__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__SUB_COMMANDS = OPPOSED_SKILL_TEST_CMD__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__DATE = OPPOSED_SKILL_TEST_CMD__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__CMD_CALLBACK = OPPOSED_SKILL_TEST_CMD__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__EXECUTING = OPPOSED_SKILL_TEST_CMD__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__CAN_EXECUTE = OPPOSED_SKILL_TEST_CMD__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__SUBJECT = OPPOSED_SKILL_TEST_CMD__SUBJECT;

    /**
     * The feature id for the '<em><b>Probe</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__PROBE = OPPOSED_SKILL_TEST_CMD__PROBE;

    /**
     * The feature id for the '<em><b>Successes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__SUCCESSES = OPPOSED_SKILL_TEST_CMD__SUCCESSES;

    /**
     * The feature id for the '<em><b>Glitches</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__GLITCHES = OPPOSED_SKILL_TEST_CMD__GLITCHES;

    /**
     * The feature id for the '<em><b>Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__LIMIT = OPPOSED_SKILL_TEST_CMD__LIMIT;

    /**
     * The feature id for the '<em><b>Probe State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__PROBE_STATE = OPPOSED_SKILL_TEST_CMD__PROBE_STATE;

    /**
     * The feature id for the '<em><b>Probe Mods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__PROBE_MODS = OPPOSED_SKILL_TEST_CMD__PROBE_MODS;

    /**
     * The feature id for the '<em><b>Skip Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__SKIP_TEST = OPPOSED_SKILL_TEST_CMD__SKIP_TEST;

    /**
     * The feature id for the '<em><b>Push The Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__PUSH_THE_LIMIT = OPPOSED_SKILL_TEST_CMD__PUSH_THE_LIMIT;

    /**
     * The feature id for the '<em><b>Second Chance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__SECOND_CHANCE = OPPOSED_SKILL_TEST_CMD__SECOND_CHANCE;

    /**
     * The feature id for the '<em><b>Close Call</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__CLOSE_CALL = OPPOSED_SKILL_TEST_CMD__CLOSE_CALL;

    /**
     * The feature id for the '<em><b>Thresholds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__THRESHOLDS = OPPOSED_SKILL_TEST_CMD__THRESHOLDS;

    /**
     * The feature id for the '<em><b>Net Hits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__NET_HITS = OPPOSED_SKILL_TEST_CMD__NET_HITS;

    /**
     * The feature id for the '<em><b>Test State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__TEST_STATE = OPPOSED_SKILL_TEST_CMD__TEST_STATE;

    /**
     * The feature id for the '<em><b>Mods</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__MODS = OPPOSED_SKILL_TEST_CMD__MODS;

    /**
     * The feature id for the '<em><b>Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__SKILL = OPPOSED_SKILL_TEST_CMD__SKILL;

    /**
     * The feature id for the '<em><b>Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__OBJECT = OPPOSED_SKILL_TEST_CMD__OBJECT;

    /**
     * The feature id for the '<em><b>Object Skill</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__OBJECT_SKILL = OPPOSED_SKILL_TEST_CMD__OBJECT_SKILL;

    /**
     * The feature id for the '<em><b>Modus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__MODUS = OPPOSED_SKILL_TEST_CMD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Range</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__RANGE = OPPOSED_SKILL_TEST_CMD_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Weapon</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__WEAPON = OPPOSED_SKILL_TEST_CMD_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Number Of Shoots</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD__NUMBER_OF_SHOOTS = OPPOSED_SKILL_TEST_CMD_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Ranged Attack Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD_FEATURE_COUNT = OPPOSED_SKILL_TEST_CMD_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD___REDO = OPPOSED_SKILL_TEST_CMD___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD___UNDO = OPPOSED_SKILL_TEST_CMD___UNDO;

    /**
     * The number of operations of the '<em>Ranged Attack Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGED_ATTACK_CMD_OPERATION_COUNT = OPPOSED_SKILL_TEST_CMD_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.IntervallImpl <em>Intervall</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.IntervallImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getIntervall()
     * @generated
     */
    int INTERVALL = 26;

    /**
     * The feature id for the '<em><b>Quantities</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVALL__QUANTITIES = 0;

    /**
     * The feature id for the '<em><b>Units</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVALL__UNITS = 1;

    /**
     * The number of structural features of the '<em>Intervall</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVALL_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Intervall</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTERVALL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeModImpl <em>Probe Mod</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.ProbeModImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getProbeMod()
     * @generated
     */
    int PROBE_MOD = 27;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_MOD__VALUE = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_MOD__TYPE = 1;

    /**
     * The number of structural features of the '<em>Probe Mod</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_MOD_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Probe Mod</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_MOD_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetExtendetDataImpl <em>Set Extendet Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.SetExtendetDataImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSetExtendetData()
     * @generated
     */
    int SET_EXTENDET_DATA = 28;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_EXTENDET_DATA__EXECUTED = COMMAND__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_EXTENDET_DATA__SUB_COMMANDS = COMMAND__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_EXTENDET_DATA__DATE = COMMAND__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_EXTENDET_DATA__CMD_CALLBACK = COMMAND__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_EXTENDET_DATA__EXECUTING = COMMAND__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_EXTENDET_DATA__CAN_EXECUTE = COMMAND__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Data Aware</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_EXTENDET_DATA__DATA_AWARE = COMMAND_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_EXTENDET_DATA__DATA = COMMAND_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_EXTENDET_DATA__VALUE = COMMAND_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Set Extendet Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_EXTENDET_DATA_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_EXTENDET_DATA___REDO = COMMAND___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_EXTENDET_DATA___UNDO = COMMAND___UNDO;

    /**
     * The number of operations of the '<em>Set Extendet Data</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_EXTENDET_DATA_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.SemanticActionImpl <em>Semantic Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.SemanticActionImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSemanticAction()
     * @generated
     */
    int SEMANTIC_ACTION = 29;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEMANTIC_ACTION__EXECUTED = SUBJECT_COMMAND__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEMANTIC_ACTION__SUB_COMMANDS = SUBJECT_COMMAND__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEMANTIC_ACTION__DATE = SUBJECT_COMMAND__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEMANTIC_ACTION__CMD_CALLBACK = SUBJECT_COMMAND__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Executing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEMANTIC_ACTION__EXECUTING = SUBJECT_COMMAND__EXECUTING;

    /**
     * The feature id for the '<em><b>Can Execute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEMANTIC_ACTION__CAN_EXECUTE = SUBJECT_COMMAND__CAN_EXECUTE;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEMANTIC_ACTION__SUBJECT = SUBJECT_COMMAND__SUBJECT;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEMANTIC_ACTION__TYPE = SUBJECT_COMMAND_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Message</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEMANTIC_ACTION__MESSAGE = SUBJECT_COMMAND_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Semantic Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEMANTIC_ACTION_FEATURE_COUNT = SUBJECT_COMMAND_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEMANTIC_ACTION___REDO = SUBJECT_COMMAND___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEMANTIC_ACTION___UNDO = SUBJECT_COMMAND___UNDO;

    /**
     * The number of operations of the '<em>Semantic Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEMANTIC_ACTION_OPERATION_COUNT = SUBJECT_COMMAND_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.InterruptType <em>Interrupt Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.InterruptType
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getInterruptType()
     * @generated
     */
    int INTERRUPT_TYPE = 30;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.ProbeState <em>Probe State</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.ProbeState
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getProbeState()
     * @generated
     */
    int PROBE_STATE = 31;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTestState <em>Succes Test State</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.SuccesTestState
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSuccesTestState()
     * @generated
     */
    int SUCCES_TEST_STATE = 32;

    /**
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.SemanticType <em>Semantic Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.SemanticType
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSemanticType()
     * @generated
     */
    int SEMANTIC_TYPE = 33;

    /**
     * The meta object id for the '<em>Command Callback</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getCommandCallback()
     * @generated
     */
    int COMMAND_CALLBACK = 34;

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.ExecutionStack <em>Execution Stack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Execution Stack</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ExecutionStack
     * @generated
     */
    EClass getExecutionStack();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.gameplay.ExecutionStack#getCurrentCommand <em>Current Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Current Command</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ExecutionStack#getCurrentCommand()
     * @see #getExecutionStack()
     * @generated
     */
    EReference getExecutionStack_CurrentCommand();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.eclipse.shr5.gameplay.ExecutionStack#getProtocol <em>Protocol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Protocol</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ExecutionStack#getProtocol()
     * @see #getExecutionStack()
     * @generated
     */
    EReference getExecutionStack_Protocol();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5.gameplay.ExecutionStack#redo() <em>Redo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Redo</em>' operation.
     * @see de.urszeidler.eclipse.shr5.gameplay.ExecutionStack#redo()
     * @generated
     */
    EOperation getExecutionStack__Redo();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.DamageTest <em>Damage Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Damage Test</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.DamageTest
     * @generated
     */
    EClass getDamageTest();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.DamageTest#getDamage <em>Damage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Damage</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.DamageTest#getDamage()
     * @see #getDamageTest()
     * @generated
     */
    EAttribute getDamageTest_Damage();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.DamageTest#getDv <em>Dv</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dv</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.DamageTest#getDv()
     * @see #getDamageTest()
     * @generated
     */
    EAttribute getDamageTest_Dv();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.DamageTest#getEffectiveDamage <em>Effective Damage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Effective Damage</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.DamageTest#getEffectiveDamage()
     * @see #getDamageTest()
     * @generated
     */
    EAttribute getDamageTest_EffectiveDamage();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.Command <em>Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Command</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Command
     * @generated
     */
    EClass getCommand();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Command#isExecuted <em>Executed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Executed</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#isExecuted()
     * @see #getCommand()
     * @generated
     */
    EAttribute getCommand_Executed();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.gameplay.Command#getSubCommands <em>Sub Commands</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Commands</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#getSubCommands()
     * @see #getCommand()
     * @generated
     */
    EReference getCommand_SubCommands();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Command#getDate <em>Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Date</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#getDate()
     * @see #getCommand()
     * @generated
     */
    EAttribute getCommand_Date();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Command#getCmdCallback <em>Cmd Callback</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cmd Callback</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#getCmdCallback()
     * @see #getCommand()
     * @generated
     */
    EAttribute getCommand_CmdCallback();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Command#isExecuting <em>Executing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Executing</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#isExecuting()
     * @see #getCommand()
     * @generated
     */
    EAttribute getCommand_Executing();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Command#isCanExecute <em>Can Execute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Can Execute</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#isCanExecute()
     * @see #getCommand()
     * @generated
     */
    EAttribute getCommand_CanExecute();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Redo</em>' operation.
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#redo()
     * @generated
     */
    EOperation getCommand__Redo();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#undo() <em>Undo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Undo</em>' operation.
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#undo()
     * @generated
     */
    EOperation getCommand__Undo();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.SubjectCommand <em>Subject Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Subject Command</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SubjectCommand
     * @generated
     */
    EClass getSubjectCommand();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.gameplay.SubjectCommand#getSubject <em>Subject</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Subject</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SubjectCommand#getSubject()
     * @see #getSubjectCommand()
     * @generated
     */
    EReference getSubjectCommand_Subject();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd <em>Skill Test Cmd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Skill Test Cmd</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd
     * @generated
     */
    EClass getSkillTestCmd();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd#getSkill <em>Skill</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Skill</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd#getSkill()
     * @see #getSkillTestCmd()
     * @generated
     */
    EReference getSkillTestCmd_Skill();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd <em>Opposed Skill Test Cmd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Opposed Skill Test Cmd</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd
     * @generated
     */
    EClass getOpposedSkillTestCmd();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd#getObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Object</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd#getObject()
     * @see #getOpposedSkillTestCmd()
     * @generated
     */
    EReference getOpposedSkillTestCmd_Object();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd#getObjectSkill <em>Object Skill</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Object Skill</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd#getObjectSkill()
     * @see #getOpposedSkillTestCmd()
     * @generated
     */
    EReference getOpposedSkillTestCmd_ObjectSkill();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.Initative <em>Initative</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Initative</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Initative
     * @generated
     */
    EClass getInitative();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Initative#getIni <em>Ini</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ini</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Initative#getIni()
     * @see #getInitative()
     * @generated
     */
    EAttribute getInitative_Ini();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Initative#getActualIni <em>Actual Ini</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Actual Ini</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Initative#getActualIni()
     * @see #getInitative()
     * @generated
     */
    EAttribute getInitative_ActualIni();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Initative#isSizeInitative <em>Size Initative</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size Initative</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Initative#isSizeInitative()
     * @see #getInitative()
     * @generated
     */
    EAttribute getInitative_SizeInitative();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5.gameplay.Initative#nextPass(int) <em>Next Pass</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Next Pass</em>' operation.
     * @see de.urszeidler.eclipse.shr5.gameplay.Initative#nextPass(int)
     * @generated
     */
    EOperation getInitative__NextPass__int();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.ExecutionProtocol <em>Execution Protocol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Execution Protocol</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ExecutionProtocol
     * @generated
     */
    EClass getExecutionProtocol();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.gameplay.ExecutionProtocol#getCommands <em>Commands</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Commands</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ExecutionProtocol#getCommands()
     * @see #getExecutionProtocol()
     * @generated
     */
    EReference getExecutionProtocol_Commands();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.Probe <em>Probe</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Probe</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Probe
     * @generated
     */
    EClass getProbe();

    /**
     * Returns the meta object for the attribute list '{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getProbe <em>Probe</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Probe</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Probe#getProbe()
     * @see #getProbe()
     * @generated
     */
    EAttribute getProbe_Probe();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getSuccesses <em>Successes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Successes</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Probe#getSuccesses()
     * @see #getProbe()
     * @generated
     */
    EAttribute getProbe_Successes();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getGlitches <em>Glitches</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Glitches</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Probe#getGlitches()
     * @see #getProbe()
     * @generated
     */
    EAttribute getProbe_Glitches();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getLimit <em>Limit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Limit</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Probe#getLimit()
     * @see #getProbe()
     * @generated
     */
    EAttribute getProbe_Limit();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getProbeState <em>Probe State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Probe State</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Probe#getProbeState()
     * @see #getProbe()
     * @generated
     */
    EAttribute getProbe_ProbeState();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getProbeMods <em>Probe Mods</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Probe Mods</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Probe#getProbeMods()
     * @see #getProbe()
     * @generated
     */
    EReference getProbe_ProbeMods();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Probe#isSkipTest <em>Skip Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Skip Test</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Probe#isSkipTest()
     * @see #getProbe()
     * @generated
     */
    EAttribute getProbe_SkipTest();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Probe#isPushTheLimit <em>Push The Limit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Push The Limit</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Probe#isPushTheLimit()
     * @see #getProbe()
     * @generated
     */
    EAttribute getProbe_PushTheLimit();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Probe#isSecondChance <em>Second Chance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Second Chance</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Probe#isSecondChance()
     * @see #getProbe()
     * @generated
     */
    EAttribute getProbe_SecondChance();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Probe#isCloseCall <em>Close Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Close Call</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Probe#isCloseCall()
     * @see #getProbe()
     * @generated
     */
    EAttribute getProbe_CloseCall();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.ProbeCommand <em>Probe Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Probe Command</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ProbeCommand
     * @generated
     */
    EClass getProbeCommand();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.ProbeCommand#getMods <em>Mods</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mods</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ProbeCommand#getMods()
     * @see #getProbeCommand()
     * @generated
     */
    EAttribute getProbeCommand_Mods();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.PhaseCmd <em>Phase Cmd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Phase Cmd</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.PhaseCmd
     * @generated
     */
    EClass getPhaseCmd();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.PhaseCmd#getPhase <em>Phase</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Phase</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.PhaseCmd#getPhase()
     * @see #getPhaseCmd()
     * @generated
     */
    EAttribute getPhaseCmd_Phase();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn <em>Combat Turn</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Combat Turn</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.CombatTurn
     * @generated
     */
    EClass getCombatTurn();

    /**
     * Returns the meta object for the reference list '{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#getCombatants <em>Combatants</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Combatants</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.CombatTurn#getCombatants()
     * @see #getCombatTurn()
     * @generated
     */
    EReference getCombatTurn_Combatants();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#getActionPhases <em>Action Phases</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Action Phases</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.CombatTurn#getActionPhases()
     * @see #getCombatTurn()
     * @generated
     */
    EReference getCombatTurn_ActionPhases();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#getCurrentTurn <em>Current Turn</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Current Turn</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.CombatTurn#getCurrentTurn()
     * @see #getCombatTurn()
     * @generated
     */
    EReference getCombatTurn_CurrentTurn();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#getSequence <em>Sequence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sequence</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.CombatTurn#getSequence()
     * @see #getCombatTurn()
     * @generated
     */
    EAttribute getCombatTurn_Sequence();

    /**
     * Returns the meta object for the '{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#doTurn() <em>Do Turn</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Do Turn</em>' operation.
     * @see de.urszeidler.eclipse.shr5.gameplay.CombatTurn#doTurn()
     * @generated
     */
    EOperation getCombatTurn__DoTurn();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTest <em>Succes Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Succes Test</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SuccesTest
     * @generated
     */
    EClass getSuccesTest();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTest#getThresholds <em>Thresholds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Thresholds</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SuccesTest#getThresholds()
     * @see #getSuccesTest()
     * @generated
     */
    EAttribute getSuccesTest_Thresholds();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTest#getNetHits <em>Net Hits</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Net Hits</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SuccesTest#getNetHits()
     * @see #getSuccesTest()
     * @generated
     */
    EAttribute getSuccesTest_NetHits();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTest#getTestState <em>Test State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Test State</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SuccesTest#getTestState()
     * @see #getSuccesTest()
     * @generated
     */
    EAttribute getSuccesTest_TestState();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd <em>Extendet Skill Test Cmd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Extendet Skill Test Cmd</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd
     * @generated
     */
    EClass getExtendetSkillTestCmd();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd#getStartDate <em>Start Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Start Date</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd#getStartDate()
     * @see #getExtendetSkillTestCmd()
     * @generated
     */
    EAttribute getExtendetSkillTestCmd_StartDate();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd#getIntervall <em>Intervall</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Intervall</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd#getIntervall()
     * @see #getExtendetSkillTestCmd()
     * @generated
     */
    EReference getExtendetSkillTestCmd_Intervall();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd <em>Defens Test Cmd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Defens Test Cmd</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd
     * @generated
     */
    EClass getDefensTestCmd();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd#getAttackersHits <em>Attackers Hits</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attackers Hits</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd#getAttackersHits()
     * @see #getDefensTestCmd()
     * @generated
     */
    EAttribute getDefensTestCmd_AttackersHits();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd <em>Succes Test Cmd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Succes Test Cmd</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd
     * @generated
     */
    EClass getSuccesTestCmd();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd#getDicePool <em>Dice Pool</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dice Pool</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd#getDicePool()
     * @see #getSuccesTestCmd()
     * @generated
     */
    EAttribute getSuccesTestCmd_DicePool();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.InitativePass <em>Initative Pass</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Initative Pass</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.InitativePass
     * @generated
     */
    EClass getInitativePass();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.InitativePass#getTurn <em>Turn</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Turn</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.InitativePass#getTurn()
     * @see #getInitativePass()
     * @generated
     */
    EAttribute getInitativePass_Turn();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.InitativePass#isSizeInitative <em>Size Initative</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size Initative</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.InitativePass#isSizeInitative()
     * @see #getInitativePass()
     * @generated
     */
    EAttribute getInitativePass_SizeInitative();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.eclipse.shr5.gameplay.InitativePass#getAction <em>Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Action</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.InitativePass#getAction()
     * @see #getInitativePass()
     * @generated
     */
    EReference getInitativePass_Action();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.eclipse.shr5.gameplay.InitativePass#getFreeAction <em>Free Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Free Action</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.InitativePass#getFreeAction()
     * @see #getInitativePass()
     * @generated
     */
    EReference getInitativePass_FreeAction();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.eclipse.shr5.gameplay.InitativePass#getInterruptAction <em>Interrupt Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Interrupt Action</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.InitativePass#getInterruptAction()
     * @see #getInitativePass()
     * @generated
     */
    EReference getInitativePass_InterruptAction();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.CommandWrapper <em>Command Wrapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Command Wrapper</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.CommandWrapper
     * @generated
     */
    EClass getCommandWrapper();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.ComplexAction <em>Complex Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Complex Action</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ComplexAction
     * @generated
     */
    EClass getComplexAction();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.SimpleAction <em>Simple Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Simple Action</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SimpleAction
     * @generated
     */
    EClass getSimpleAction();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.SimpleActions <em>Simple Actions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Simple Actions</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SimpleActions
     * @generated
     */
    EClass getSimpleActions();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.eclipse.shr5.gameplay.SimpleActions#getAction1 <em>Action1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Action1</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SimpleActions#getAction1()
     * @see #getSimpleActions()
     * @generated
     */
    EReference getSimpleActions_Action1();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.eclipse.shr5.gameplay.SimpleActions#getAction2 <em>Action2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Action2</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SimpleActions#getAction2()
     * @see #getSimpleActions()
     * @generated
     */
    EReference getSimpleActions_Action2();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.FreeAction <em>Free Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Free Action</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.FreeAction
     * @generated
     */
    EClass getFreeAction();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.InterruptAction <em>Interrupt Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interrupt Action</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.InterruptAction
     * @generated
     */
    EClass getInterruptAction();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.InterruptAction#getIniCost <em>Ini Cost</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ini Cost</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.InterruptAction#getIniCost()
     * @see #getInterruptAction()
     * @generated
     */
    EAttribute getInterruptAction_IniCost();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.InterruptAction#getInterruptType <em>Interrupt Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Interrupt Type</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.InterruptAction#getInterruptType()
     * @see #getInterruptAction()
     * @generated
     */
    EAttribute getInterruptAction_InterruptType();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand <em>Set Feature Command</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Set Feature Command</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand
     * @generated
     */
    EClass getSetFeatureCommand();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand#getValue()
     * @see #getSetFeatureCommand()
     * @generated
     */
    EAttribute getSetFeatureCommand_Value();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand#getObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Object</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand#getObject()
     * @see #getSetFeatureCommand()
     * @generated
     */
    EReference getSetFeatureCommand_Object();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand#getFeature <em>Feature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Feature</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand#getFeature()
     * @see #getSetFeatureCommand()
     * @generated
     */
    EReference getSetFeatureCommand_Feature();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd <em>Meele Attack Cmd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Meele Attack Cmd</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd
     * @generated
     */
    EClass getMeeleAttackCmd();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd#getWeapon <em>Weapon</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Weapon</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd#getWeapon()
     * @see #getMeeleAttackCmd()
     * @generated
     */
    EReference getMeeleAttackCmd_Weapon();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd <em>Ranged Attack Cmd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ranged Attack Cmd</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd
     * @generated
     */
    EClass getRangedAttackCmd();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd#getModus <em>Modus</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Modus</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd#getModus()
     * @see #getRangedAttackCmd()
     * @generated
     */
    EAttribute getRangedAttackCmd_Modus();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd#getRange <em>Range</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Range</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd#getRange()
     * @see #getRangedAttackCmd()
     * @generated
     */
    EAttribute getRangedAttackCmd_Range();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd#getWeapon <em>Weapon</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Weapon</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd#getWeapon()
     * @see #getRangedAttackCmd()
     * @generated
     */
    EReference getRangedAttackCmd_Weapon();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd#getNumberOfShoots <em>Number Of Shoots</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number Of Shoots</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd#getNumberOfShoots()
     * @see #getRangedAttackCmd()
     * @generated
     */
    EAttribute getRangedAttackCmd_NumberOfShoots();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.Intervall <em>Intervall</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Intervall</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Intervall
     * @generated
     */
    EClass getIntervall();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Intervall#getQuantities <em>Quantities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Quantities</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Intervall#getQuantities()
     * @see #getIntervall()
     * @generated
     */
    EAttribute getIntervall_Quantities();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.Intervall#getUnits <em>Units</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Units</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.Intervall#getUnits()
     * @see #getIntervall()
     * @generated
     */
    EAttribute getIntervall_Units();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.ProbeMod <em>Probe Mod</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Probe Mod</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ProbeMod
     * @generated
     */
    EClass getProbeMod();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.ProbeMod#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ProbeMod#getValue()
     * @see #getProbeMod()
     * @generated
     */
    EAttribute getProbeMod_Value();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.eclipse.shr5.gameplay.ProbeMod#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ProbeMod#getType()
     * @see #getProbeMod()
     * @generated
     */
    EReference getProbeMod_Type();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.SetExtendetData <em>Set Extendet Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Set Extendet Data</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SetExtendetData
     * @generated
     */
    EClass getSetExtendetData();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.gameplay.SetExtendetData#getDataAware <em>Data Aware</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Aware</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SetExtendetData#getDataAware()
     * @see #getSetExtendetData()
     * @generated
     */
    EReference getSetExtendetData_DataAware();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.eclipse.shr5.gameplay.SetExtendetData#getData <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SetExtendetData#getData()
     * @see #getSetExtendetData()
     * @generated
     */
    EReference getSetExtendetData_Data();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.SetExtendetData#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SetExtendetData#getValue()
     * @see #getSetExtendetData()
     * @generated
     */
    EAttribute getSetExtendetData_Value();

    /**
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.SemanticAction <em>Semantic Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Semantic Action</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SemanticAction
     * @generated
     */
    EClass getSemanticAction();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.SemanticAction#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SemanticAction#getType()
     * @see #getSemanticAction()
     * @generated
     */
    EAttribute getSemanticAction_Type();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.eclipse.shr5.gameplay.SemanticAction#getMessage <em>Message</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Message</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SemanticAction#getMessage()
     * @see #getSemanticAction()
     * @generated
     */
    EAttribute getSemanticAction_Message();

    /**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.gameplay.InterruptType <em>Interrupt Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Interrupt Type</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.InterruptType
     * @generated
     */
    EEnum getInterruptType();

    /**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.gameplay.ProbeState <em>Probe State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Probe State</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ProbeState
     * @generated
     */
    EEnum getProbeState();

    /**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTestState <em>Succes Test State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Succes Test State</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SuccesTestState
     * @generated
     */
    EEnum getSuccesTestState();

    /**
     * Returns the meta object for enum '{@link de.urszeidler.eclipse.shr5.gameplay.SemanticType <em>Semantic Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Semantic Type</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.SemanticType
     * @generated
     */
    EEnum getSemanticType();

    /**
     * Returns the meta object for data type '{@link de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback <em>Command Callback</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Command Callback</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback
     * @model instanceClass="de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback" serializeable="false"
     * @generated
     */
    EDataType getCommandCallback();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    GameplayFactory getGameplayFactory();

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
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.ExecutionStackImpl <em>Execution Stack</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.ExecutionStackImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getExecutionStack()
         * @generated
         */
        EClass EXECUTION_STACK = eINSTANCE.getExecutionStack();

        /**
         * The meta object literal for the '<em><b>Current Command</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXECUTION_STACK__CURRENT_COMMAND = eINSTANCE.getExecutionStack_CurrentCommand();

        /**
         * The meta object literal for the '<em><b>Protocol</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXECUTION_STACK__PROTOCOL = eINSTANCE.getExecutionStack_Protocol();

        /**
         * The meta object literal for the '<em><b>Redo</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation EXECUTION_STACK___REDO = eINSTANCE.getExecutionStack__Redo();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.DamageTestImpl <em>Damage Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.DamageTestImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getDamageTest()
         * @generated
         */
        EClass DAMAGE_TEST = eINSTANCE.getDamageTest();

        /**
         * The meta object literal for the '<em><b>Damage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DAMAGE_TEST__DAMAGE = eINSTANCE.getDamageTest_Damage();

        /**
         * The meta object literal for the '<em><b>Dv</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DAMAGE_TEST__DV = eINSTANCE.getDamageTest_Dv();

        /**
         * The meta object literal for the '<em><b>Effective Damage</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DAMAGE_TEST__EFFECTIVE_DAMAGE = eINSTANCE.getDamageTest_EffectiveDamage();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.Command <em>Command</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.Command
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getCommand()
         * @generated
         */
        EClass COMMAND = eINSTANCE.getCommand();

        /**
         * The meta object literal for the '<em><b>Executed</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMAND__EXECUTED = eINSTANCE.getCommand_Executed();

        /**
         * The meta object literal for the '<em><b>Sub Commands</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMMAND__SUB_COMMANDS = eINSTANCE.getCommand_SubCommands();

        /**
         * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMAND__DATE = eINSTANCE.getCommand_Date();

        /**
         * The meta object literal for the '<em><b>Cmd Callback</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMAND__CMD_CALLBACK = eINSTANCE.getCommand_CmdCallback();

        /**
         * The meta object literal for the '<em><b>Executing</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMAND__EXECUTING = eINSTANCE.getCommand_Executing();

        /**
         * The meta object literal for the '<em><b>Can Execute</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMMAND__CAN_EXECUTE = eINSTANCE.getCommand_CanExecute();

        /**
         * The meta object literal for the '<em><b>Redo</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMAND___REDO = eINSTANCE.getCommand__Redo();

        /**
         * The meta object literal for the '<em><b>Undo</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMMAND___UNDO = eINSTANCE.getCommand__Undo();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.SubjectCommandImpl <em>Subject Command</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.SubjectCommandImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSubjectCommand()
         * @generated
         */
        EClass SUBJECT_COMMAND = eINSTANCE.getSubjectCommand();

        /**
         * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUBJECT_COMMAND__SUBJECT = eINSTANCE.getSubjectCommand_Subject();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.SkillTestCmdImpl <em>Skill Test Cmd</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.SkillTestCmdImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSkillTestCmd()
         * @generated
         */
        EClass SKILL_TEST_CMD = eINSTANCE.getSkillTestCmd();

        /**
         * The meta object literal for the '<em><b>Skill</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SKILL_TEST_CMD__SKILL = eINSTANCE.getSkillTestCmd_Skill();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.OpposedSkillTestCmdImpl <em>Opposed Skill Test Cmd</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.OpposedSkillTestCmdImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getOpposedSkillTestCmd()
         * @generated
         */
        EClass OPPOSED_SKILL_TEST_CMD = eINSTANCE.getOpposedSkillTestCmd();

        /**
         * The meta object literal for the '<em><b>Object</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPPOSED_SKILL_TEST_CMD__OBJECT = eINSTANCE.getOpposedSkillTestCmd_Object();

        /**
         * The meta object literal for the '<em><b>Object Skill</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPPOSED_SKILL_TEST_CMD__OBJECT_SKILL = eINSTANCE.getOpposedSkillTestCmd_ObjectSkill();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.InitativeImpl <em>Initative</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.InitativeImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getInitative()
         * @generated
         */
        EClass INITATIVE = eINSTANCE.getInitative();

        /**
         * The meta object literal for the '<em><b>Ini</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INITATIVE__INI = eINSTANCE.getInitative_Ini();

        /**
         * The meta object literal for the '<em><b>Actual Ini</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INITATIVE__ACTUAL_INI = eINSTANCE.getInitative_ActualIni();

        /**
         * The meta object literal for the '<em><b>Size Initative</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INITATIVE__SIZE_INITATIVE = eINSTANCE.getInitative_SizeInitative();

        /**
         * The meta object literal for the '<em><b>Next Pass</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation INITATIVE___NEXT_PASS__INT = eINSTANCE.getInitative__NextPass__int();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.ExecutionProtocolImpl <em>Execution Protocol</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.ExecutionProtocolImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getExecutionProtocol()
         * @generated
         */
        EClass EXECUTION_PROTOCOL = eINSTANCE.getExecutionProtocol();

        /**
         * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXECUTION_PROTOCOL__COMMANDS = eINSTANCE.getExecutionProtocol_Commands();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.Probe <em>Probe</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.Probe
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getProbe()
         * @generated
         */
        EClass PROBE = eINSTANCE.getProbe();

        /**
         * The meta object literal for the '<em><b>Probe</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROBE__PROBE = eINSTANCE.getProbe_Probe();

        /**
         * The meta object literal for the '<em><b>Successes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROBE__SUCCESSES = eINSTANCE.getProbe_Successes();

        /**
         * The meta object literal for the '<em><b>Glitches</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROBE__GLITCHES = eINSTANCE.getProbe_Glitches();

        /**
         * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROBE__LIMIT = eINSTANCE.getProbe_Limit();

        /**
         * The meta object literal for the '<em><b>Probe State</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROBE__PROBE_STATE = eINSTANCE.getProbe_ProbeState();

        /**
         * The meta object literal for the '<em><b>Probe Mods</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROBE__PROBE_MODS = eINSTANCE.getProbe_ProbeMods();

        /**
         * The meta object literal for the '<em><b>Skip Test</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROBE__SKIP_TEST = eINSTANCE.getProbe_SkipTest();

        /**
         * The meta object literal for the '<em><b>Push The Limit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROBE__PUSH_THE_LIMIT = eINSTANCE.getProbe_PushTheLimit();

        /**
         * The meta object literal for the '<em><b>Second Chance</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROBE__SECOND_CHANCE = eINSTANCE.getProbe_SecondChance();

        /**
         * The meta object literal for the '<em><b>Close Call</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROBE__CLOSE_CALL = eINSTANCE.getProbe_CloseCall();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl <em>Probe Command</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.ProbeCommandImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getProbeCommand()
         * @generated
         */
        EClass PROBE_COMMAND = eINSTANCE.getProbeCommand();

        /**
         * The meta object literal for the '<em><b>Mods</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROBE_COMMAND__MODS = eINSTANCE.getProbeCommand_Mods();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.PhaseCmd <em>Phase Cmd</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.PhaseCmd
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getPhaseCmd()
         * @generated
         */
        EClass PHASE_CMD = eINSTANCE.getPhaseCmd();

        /**
         * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PHASE_CMD__PHASE = eINSTANCE.getPhaseCmd_Phase();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl <em>Combat Turn</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.CombatTurnImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getCombatTurn()
         * @generated
         */
        EClass COMBAT_TURN = eINSTANCE.getCombatTurn();

        /**
         * The meta object literal for the '<em><b>Combatants</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMBAT_TURN__COMBATANTS = eINSTANCE.getCombatTurn_Combatants();

        /**
         * The meta object literal for the '<em><b>Action Phases</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMBAT_TURN__ACTION_PHASES = eINSTANCE.getCombatTurn_ActionPhases();

        /**
         * The meta object literal for the '<em><b>Current Turn</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMBAT_TURN__CURRENT_TURN = eINSTANCE.getCombatTurn_CurrentTurn();

        /**
         * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMBAT_TURN__SEQUENCE = eINSTANCE.getCombatTurn_Sequence();

        /**
         * The meta object literal for the '<em><b>Do Turn</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation COMBAT_TURN___DO_TURN = eINSTANCE.getCombatTurn__DoTurn();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTest <em>Succes Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.SuccesTest
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSuccesTest()
         * @generated
         */
        EClass SUCCES_TEST = eINSTANCE.getSuccesTest();

        /**
         * The meta object literal for the '<em><b>Thresholds</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUCCES_TEST__THRESHOLDS = eINSTANCE.getSuccesTest_Thresholds();

        /**
         * The meta object literal for the '<em><b>Net Hits</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUCCES_TEST__NET_HITS = eINSTANCE.getSuccesTest_NetHits();

        /**
         * The meta object literal for the '<em><b>Test State</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUCCES_TEST__TEST_STATE = eINSTANCE.getSuccesTest_TestState();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.ExtendetSkillTestCmdImpl <em>Extendet Skill Test Cmd</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.ExtendetSkillTestCmdImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getExtendetSkillTestCmd()
         * @generated
         */
        EClass EXTENDET_SKILL_TEST_CMD = eINSTANCE.getExtendetSkillTestCmd();

        /**
         * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENDET_SKILL_TEST_CMD__START_DATE = eINSTANCE.getExtendetSkillTestCmd_StartDate();

        /**
         * The meta object literal for the '<em><b>Intervall</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENDET_SKILL_TEST_CMD__INTERVALL = eINSTANCE.getExtendetSkillTestCmd_Intervall();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.DefensTestCmdImpl <em>Defens Test Cmd</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.DefensTestCmdImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getDefensTestCmd()
         * @generated
         */
        EClass DEFENS_TEST_CMD = eINSTANCE.getDefensTestCmd();

        /**
         * The meta object literal for the '<em><b>Attackers Hits</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFENS_TEST_CMD__ATTACKERS_HITS = eINSTANCE.getDefensTestCmd_AttackersHits();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.SuccesTestCmdImpl <em>Succes Test Cmd</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.SuccesTestCmdImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSuccesTestCmd()
         * @generated
         */
        EClass SUCCES_TEST_CMD = eINSTANCE.getSuccesTestCmd();

        /**
         * The meta object literal for the '<em><b>Dice Pool</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUCCES_TEST_CMD__DICE_POOL = eINSTANCE.getSuccesTestCmd_DicePool();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.InitativePassImpl <em>Initative Pass</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.InitativePassImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getInitativePass()
         * @generated
         */
        EClass INITATIVE_PASS = eINSTANCE.getInitativePass();

        /**
         * The meta object literal for the '<em><b>Turn</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INITATIVE_PASS__TURN = eINSTANCE.getInitativePass_Turn();

        /**
         * The meta object literal for the '<em><b>Size Initative</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INITATIVE_PASS__SIZE_INITATIVE = eINSTANCE.getInitativePass_SizeInitative();

        /**
         * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INITATIVE_PASS__ACTION = eINSTANCE.getInitativePass_Action();

        /**
         * The meta object literal for the '<em><b>Free Action</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INITATIVE_PASS__FREE_ACTION = eINSTANCE.getInitativePass_FreeAction();

        /**
         * The meta object literal for the '<em><b>Interrupt Action</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INITATIVE_PASS__INTERRUPT_ACTION = eINSTANCE.getInitativePass_InterruptAction();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.CommandWrapperImpl <em>Command Wrapper</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.CommandWrapperImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getCommandWrapper()
         * @generated
         */
        EClass COMMAND_WRAPPER = eINSTANCE.getCommandWrapper();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.ComplexActionImpl <em>Complex Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.ComplexActionImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getComplexAction()
         * @generated
         */
        EClass COMPLEX_ACTION = eINSTANCE.getComplexAction();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.SimpleActionImpl <em>Simple Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.SimpleActionImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSimpleAction()
         * @generated
         */
        EClass SIMPLE_ACTION = eINSTANCE.getSimpleAction();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.SimpleActionsImpl <em>Simple Actions</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.SimpleActionsImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSimpleActions()
         * @generated
         */
        EClass SIMPLE_ACTIONS = eINSTANCE.getSimpleActions();

        /**
         * The meta object literal for the '<em><b>Action1</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIMPLE_ACTIONS__ACTION1 = eINSTANCE.getSimpleActions_Action1();

        /**
         * The meta object literal for the '<em><b>Action2</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIMPLE_ACTIONS__ACTION2 = eINSTANCE.getSimpleActions_Action2();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.FreeActionImpl <em>Free Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.FreeActionImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getFreeAction()
         * @generated
         */
        EClass FREE_ACTION = eINSTANCE.getFreeAction();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.InterruptActionImpl <em>Interrupt Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.InterruptActionImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getInterruptAction()
         * @generated
         */
        EClass INTERRUPT_ACTION = eINSTANCE.getInterruptAction();

        /**
         * The meta object literal for the '<em><b>Ini Cost</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERRUPT_ACTION__INI_COST = eINSTANCE.getInterruptAction_IniCost();

        /**
         * The meta object literal for the '<em><b>Interrupt Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERRUPT_ACTION__INTERRUPT_TYPE = eINSTANCE.getInterruptAction_InterruptType();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetFeatureCommandImpl <em>Set Feature Command</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.SetFeatureCommandImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSetFeatureCommand()
         * @generated
         */
        EClass SET_FEATURE_COMMAND = eINSTANCE.getSetFeatureCommand();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SET_FEATURE_COMMAND__VALUE = eINSTANCE.getSetFeatureCommand_Value();

        /**
         * The meta object literal for the '<em><b>Object</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SET_FEATURE_COMMAND__OBJECT = eINSTANCE.getSetFeatureCommand_Object();

        /**
         * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SET_FEATURE_COMMAND__FEATURE = eINSTANCE.getSetFeatureCommand_Feature();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.MeeleAttackCmdImpl <em>Meele Attack Cmd</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.MeeleAttackCmdImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getMeeleAttackCmd()
         * @generated
         */
        EClass MEELE_ATTACK_CMD = eINSTANCE.getMeeleAttackCmd();

        /**
         * The meta object literal for the '<em><b>Weapon</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MEELE_ATTACK_CMD__WEAPON = eINSTANCE.getMeeleAttackCmd_Weapon();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.RangedAttackCmdImpl <em>Ranged Attack Cmd</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.RangedAttackCmdImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getRangedAttackCmd()
         * @generated
         */
        EClass RANGED_ATTACK_CMD = eINSTANCE.getRangedAttackCmd();

        /**
         * The meta object literal for the '<em><b>Modus</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RANGED_ATTACK_CMD__MODUS = eINSTANCE.getRangedAttackCmd_Modus();

        /**
         * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RANGED_ATTACK_CMD__RANGE = eINSTANCE.getRangedAttackCmd_Range();

        /**
         * The meta object literal for the '<em><b>Weapon</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RANGED_ATTACK_CMD__WEAPON = eINSTANCE.getRangedAttackCmd_Weapon();

        /**
         * The meta object literal for the '<em><b>Number Of Shoots</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RANGED_ATTACK_CMD__NUMBER_OF_SHOOTS = eINSTANCE.getRangedAttackCmd_NumberOfShoots();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.IntervallImpl <em>Intervall</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.IntervallImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getIntervall()
         * @generated
         */
        EClass INTERVALL = eINSTANCE.getIntervall();

        /**
         * The meta object literal for the '<em><b>Quantities</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERVALL__QUANTITIES = eINSTANCE.getIntervall_Quantities();

        /**
         * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTERVALL__UNITS = eINSTANCE.getIntervall_Units();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.ProbeModImpl <em>Probe Mod</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.ProbeModImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getProbeMod()
         * @generated
         */
        EClass PROBE_MOD = eINSTANCE.getProbeMod();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROBE_MOD__VALUE = eINSTANCE.getProbeMod_Value();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROBE_MOD__TYPE = eINSTANCE.getProbeMod_Type();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.SetExtendetDataImpl <em>Set Extendet Data</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.SetExtendetDataImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSetExtendetData()
         * @generated
         */
        EClass SET_EXTENDET_DATA = eINSTANCE.getSetExtendetData();

        /**
         * The meta object literal for the '<em><b>Data Aware</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SET_EXTENDET_DATA__DATA_AWARE = eINSTANCE.getSetExtendetData_DataAware();

        /**
         * The meta object literal for the '<em><b>Data</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SET_EXTENDET_DATA__DATA = eINSTANCE.getSetExtendetData_Data();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SET_EXTENDET_DATA__VALUE = eINSTANCE.getSetExtendetData_Value();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.SemanticActionImpl <em>Semantic Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.SemanticActionImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSemanticAction()
         * @generated
         */
        EClass SEMANTIC_ACTION = eINSTANCE.getSemanticAction();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEMANTIC_ACTION__TYPE = eINSTANCE.getSemanticAction_Type();

        /**
         * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEMANTIC_ACTION__MESSAGE = eINSTANCE.getSemanticAction_Message();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.InterruptType <em>Interrupt Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.InterruptType
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getInterruptType()
         * @generated
         */
        EEnum INTERRUPT_TYPE = eINSTANCE.getInterruptType();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.ProbeState <em>Probe State</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.ProbeState
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getProbeState()
         * @generated
         */
        EEnum PROBE_STATE = eINSTANCE.getProbeState();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTestState <em>Succes Test State</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.SuccesTestState
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSuccesTestState()
         * @generated
         */
        EEnum SUCCES_TEST_STATE = eINSTANCE.getSuccesTestState();

        /**
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.SemanticType <em>Semantic Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.SemanticType
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getSemanticType()
         * @generated
         */
        EEnum SEMANTIC_TYPE = eINSTANCE.getSemanticType();

        /**
         * The meta object literal for the '<em>Command Callback</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getCommandCallback()
         * @generated
         */
        EDataType COMMAND_CALLBACK = eINSTANCE.getCommandCallback();

    }

} //GameplayPackage
