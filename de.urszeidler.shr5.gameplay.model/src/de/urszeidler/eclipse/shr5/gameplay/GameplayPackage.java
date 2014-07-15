/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
     * The feature id for the '<em><b>Executed Commands</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_STACK__EXECUTED_COMMANDS = 1;

    /**
     * The feature id for the '<em><b>Protocol</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_STACK__PROTOCOL = 2;

    /**
     * The number of structural features of the '<em>Execution Stack</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_STACK_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Execution Stack</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXECUTION_STACK_OPERATION_COUNT = 0;

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
     * The number of structural features of the '<em>Command</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMAND_FEATURE_COUNT = 4;

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
     * The feature id for the '<em><b>Thresholds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__THRESHOLDS = SUBJECT_COMMAND_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Net Hits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__NET_HITS = SUBJECT_COMMAND_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Mods</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND__MODS = SUBJECT_COMMAND_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Probe Command</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_COMMAND_FEATURE_COUNT = SUBJECT_COMMAND_FEATURE_COUNT + 7;

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
     * The number of structural features of the '<em>Damage Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAMAGE_TEST_FEATURE_COUNT = PROBE_COMMAND_FEATURE_COUNT + 1;

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
     * The number of structural features of the '<em>Opposed Skill Test Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPPOSED_SKILL_TEST_CMD_FEATURE_COUNT = SKILL_TEST_CMD_FEATURE_COUNT + 1;

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
     * The number of structural features of the '<em>Probe</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROBE_FEATURE_COUNT = 4;

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
     * The number of structural features of the '<em>Combat Turn</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBAT_TURN_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

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
     * The number of operations of the '<em>Combat Turn</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMBAT_TURN_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

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
     * The number of structural features of the '<em>Succes Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUCCES_TEST_FEATURE_COUNT = PROBE_FEATURE_COUNT + 2;

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
     * The number of structural features of the '<em>Extendet Skill Test Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDET_SKILL_TEST_CMD_FEATURE_COUNT = SKILL_TEST_CMD_FEATURE_COUNT + 0;

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
     * The meta object id for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.ActionPhaseCmdImpl <em>Action Phase Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.ActionPhaseCmdImpl
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getActionPhaseCmd()
     * @generated
     */
    int ACTION_PHASE_CMD = 16;

    /**
     * The feature id for the '<em><b>Executed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PHASE_CMD__EXECUTED = SUBJECT_COMMAND__EXECUTED;

    /**
     * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PHASE_CMD__SUB_COMMANDS = SUBJECT_COMMAND__SUB_COMMANDS;

    /**
     * The feature id for the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PHASE_CMD__DATE = SUBJECT_COMMAND__DATE;

    /**
     * The feature id for the '<em><b>Cmd Callback</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PHASE_CMD__CMD_CALLBACK = SUBJECT_COMMAND__CMD_CALLBACK;

    /**
     * The feature id for the '<em><b>Subject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PHASE_CMD__SUBJECT = SUBJECT_COMMAND__SUBJECT;

    /**
     * The feature id for the '<em><b>Phase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PHASE_CMD__PHASE = SUBJECT_COMMAND_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Action Phase Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PHASE_CMD_FEATURE_COUNT = SUBJECT_COMMAND_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Redo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PHASE_CMD___REDO = SUBJECT_COMMAND___REDO;

    /**
     * The operation id for the '<em>Undo</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PHASE_CMD___UNDO = SUBJECT_COMMAND___UNDO;

    /**
     * The number of operations of the '<em>Action Phase Cmd</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_PHASE_CMD_OPERATION_COUNT = SUBJECT_COMMAND_OPERATION_COUNT + 0;


    /**
     * The meta object id for the '<em>Comand Callback</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.util.ComandCallback
     * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getComandCallback()
     * @generated
     */
    int COMAND_CALLBACK = 17;


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
     * Returns the meta object for the reference list '{@link de.urszeidler.eclipse.shr5.gameplay.ExecutionStack#getExecutedCommands <em>Executed Commands</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Executed Commands</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ExecutionStack#getExecutedCommands()
     * @see #getExecutionStack()
     * @generated
     */
    EReference getExecutionStack_ExecutedCommands();

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
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd <em>Extendet Skill Test Cmd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Extendet Skill Test Cmd</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd
     * @generated
     */
    EClass getExtendetSkillTestCmd();

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
     * Returns the meta object for class '{@link de.urszeidler.eclipse.shr5.gameplay.ActionPhaseCmd <em>Action Phase Cmd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action Phase Cmd</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.ActionPhaseCmd
     * @generated
     */
    EClass getActionPhaseCmd();

    /**
     * Returns the meta object for data type '{@link de.urszeidler.eclipse.shr5.gameplay.util.ComandCallback <em>Comand Callback</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Comand Callback</em>'.
     * @see de.urszeidler.eclipse.shr5.gameplay.util.ComandCallback
     * @model instanceClass="de.urszeidler.eclipse.shr5.gameplay.util.ComandCallback" serializeable="false"
     * @generated
     */
    EDataType getComandCallback();

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
         * The meta object literal for the '<em><b>Executed Commands</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXECUTION_STACK__EXECUTED_COMMANDS = eINSTANCE.getExecutionStack_ExecutedCommands();

        /**
         * The meta object literal for the '<em><b>Protocol</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXECUTION_STACK__PROTOCOL = eINSTANCE.getExecutionStack_Protocol();

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
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.ExtendetSkillTestCmdImpl <em>Extendet Skill Test Cmd</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.ExtendetSkillTestCmdImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getExtendetSkillTestCmd()
         * @generated
         */
        EClass EXTENDET_SKILL_TEST_CMD = eINSTANCE.getExtendetSkillTestCmd();

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
         * The meta object literal for the '{@link de.urszeidler.eclipse.shr5.gameplay.impl.ActionPhaseCmdImpl <em>Action Phase Cmd</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.ActionPhaseCmdImpl
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getActionPhaseCmd()
         * @generated
         */
        EClass ACTION_PHASE_CMD = eINSTANCE.getActionPhaseCmd();

        /**
         * The meta object literal for the '<em>Comand Callback</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.eclipse.shr5.gameplay.util.ComandCallback
         * @see de.urszeidler.eclipse.shr5.gameplay.impl.GameplayPackageImpl#getComandCallback()
         * @generated
         */
        EDataType COMAND_CALLBACK = eINSTANCE.getComandCallback();

    }

} //GameplayPackage
