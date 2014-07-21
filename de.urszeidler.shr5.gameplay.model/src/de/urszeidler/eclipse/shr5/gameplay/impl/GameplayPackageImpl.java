/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.CommandWrapper;
import de.urszeidler.eclipse.shr5.gameplay.ComplexAction;
import de.urszeidler.eclipse.shr5.gameplay.DamageTest;
import de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.ExecutionProtocol;
import de.urszeidler.eclipse.shr5.gameplay.ExecutionStack;
import de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.FreeAction;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.Initative;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.InterruptAction;
import de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.PhaseCmd;
import de.urszeidler.eclipse.shr5.gameplay.Probe;
import de.urszeidler.eclipse.shr5.gameplay.ProbeCommand;
import de.urszeidler.eclipse.shr5.gameplay.SimpleAction;
import de.urszeidler.eclipse.shr5.gameplay.SimpleActions;
import de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTest;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameplayPackageImpl extends EPackageImpl implements GameplayPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass executionStackEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass damageTestEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass commandEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subjectCommandEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass skillTestCmdEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass opposedSkillTestCmdEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass initativeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass executionProtocolEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass probeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass probeCommandEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass phaseCmdEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass combatTurnEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass succesTestEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extendetSkillTestCmdEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass defensTestCmdEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass succesTestCmdEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass initativePassEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass commandWrapperEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass complexActionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass simpleActionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass simpleActionsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass freeActionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interruptActionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType commandCallbackEDataType = null;

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
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private GameplayPackageImpl() {
        super(eNS_URI, GameplayFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link GameplayPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static GameplayPackage init() {
        if (isInited) return (GameplayPackage)EPackage.Registry.INSTANCE.getEPackage(GameplayPackage.eNS_URI);

        // Obtain or create and register package
        GameplayPackageImpl theGameplayPackage = (GameplayPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GameplayPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GameplayPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        RuntimePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theGameplayPackage.createPackageContents();

        // Initialize created meta-data
        theGameplayPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theGameplayPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(GameplayPackage.eNS_URI, theGameplayPackage);
        return theGameplayPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExecutionStack() {
        return executionStackEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExecutionStack_CurrentCommand() {
        return (EReference)executionStackEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExecutionStack_ExecutedCommands() {
        return (EReference)executionStackEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExecutionStack_Protocol() {
        return (EReference)executionStackEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDamageTest() {
        return damageTestEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDamageTest_Damage() {
        return (EAttribute)damageTestEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCommand() {
        return commandEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCommand_Executed() {
        return (EAttribute)commandEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCommand_SubCommands() {
        return (EReference)commandEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCommand_Date() {
        return (EAttribute)commandEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCommand_CmdCallback() {
        return (EAttribute)commandEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCommand_Executing() {
        return (EAttribute)commandEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCommand_CanExecute() {
        return (EAttribute)commandEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getCommand__Redo() {
        return commandEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getCommand__Undo() {
        return commandEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSubjectCommand() {
        return subjectCommandEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSubjectCommand_Subject() {
        return (EReference)subjectCommandEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSkillTestCmd() {
        return skillTestCmdEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSkillTestCmd_Skill() {
        return (EReference)skillTestCmdEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOpposedSkillTestCmd() {
        return opposedSkillTestCmdEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOpposedSkillTestCmd_Object() {
        return (EReference)opposedSkillTestCmdEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInitative() {
        return initativeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInitative_Ini() {
        return (EAttribute)initativeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInitative_ActualIni() {
        return (EAttribute)initativeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInitative_SizeInitative() {
        return (EAttribute)initativeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getInitative__NextPass__int() {
        return initativeEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExecutionProtocol() {
        return executionProtocolEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExecutionProtocol_Commands() {
        return (EReference)executionProtocolEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProbe() {
        return probeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProbe_Probe() {
        return (EAttribute)probeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProbe_Successes() {
        return (EAttribute)probeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProbe_Glitches() {
        return (EAttribute)probeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProbe_Limit() {
        return (EAttribute)probeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProbeCommand() {
        return probeCommandEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProbeCommand_Mods() {
        return (EAttribute)probeCommandEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPhaseCmd() {
        return phaseCmdEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPhaseCmd_Phase() {
        return (EAttribute)phaseCmdEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCombatTurn() {
        return combatTurnEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCombatTurn_Combatants() {
        return (EReference)combatTurnEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCombatTurn_ActionPhases() {
        return (EReference)combatTurnEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCombatTurn_CurrentTurn() {
        return (EReference)combatTurnEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getCombatTurn__DoTurn() {
        return combatTurnEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSuccesTest() {
        return succesTestEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSuccesTest_Thresholds() {
        return (EAttribute)succesTestEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSuccesTest_NetHits() {
        return (EAttribute)succesTestEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExtendetSkillTestCmd() {
        return extendetSkillTestCmdEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDefensTestCmd() {
        return defensTestCmdEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefensTestCmd_AttackersHits() {
        return (EAttribute)defensTestCmdEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSuccesTestCmd() {
        return succesTestCmdEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSuccesTestCmd_DicePool() {
        return (EAttribute)succesTestCmdEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInitativePass() {
        return initativePassEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInitativePass_Turn() {
        return (EAttribute)initativePassEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInitativePass_SizeInitative() {
        return (EAttribute)initativePassEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInitativePass_Action() {
        return (EReference)initativePassEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInitativePass_FreeAction() {
        return (EReference)initativePassEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInitativePass_InterruptAction() {
        return (EReference)initativePassEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCommandWrapper() {
        return commandWrapperEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getComplexAction() {
        return complexActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSimpleAction() {
        return simpleActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSimpleActions() {
        return simpleActionsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSimpleActions_Action1() {
        return (EReference)simpleActionsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSimpleActions_Action2() {
        return (EReference)simpleActionsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFreeAction() {
        return freeActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInterruptAction() {
        return interruptActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getCommandCallback() {
        return commandCallbackEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GameplayFactory getGameplayFactory() {
        return (GameplayFactory)getEFactoryInstance();
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
        executionStackEClass = createEClass(EXECUTION_STACK);
        createEReference(executionStackEClass, EXECUTION_STACK__CURRENT_COMMAND);
        createEReference(executionStackEClass, EXECUTION_STACK__EXECUTED_COMMANDS);
        createEReference(executionStackEClass, EXECUTION_STACK__PROTOCOL);

        damageTestEClass = createEClass(DAMAGE_TEST);
        createEAttribute(damageTestEClass, DAMAGE_TEST__DAMAGE);

        commandEClass = createEClass(COMMAND);
        createEAttribute(commandEClass, COMMAND__EXECUTED);
        createEReference(commandEClass, COMMAND__SUB_COMMANDS);
        createEAttribute(commandEClass, COMMAND__DATE);
        createEAttribute(commandEClass, COMMAND__CMD_CALLBACK);
        createEAttribute(commandEClass, COMMAND__EXECUTING);
        createEAttribute(commandEClass, COMMAND__CAN_EXECUTE);
        createEOperation(commandEClass, COMMAND___REDO);
        createEOperation(commandEClass, COMMAND___UNDO);

        subjectCommandEClass = createEClass(SUBJECT_COMMAND);
        createEReference(subjectCommandEClass, SUBJECT_COMMAND__SUBJECT);

        skillTestCmdEClass = createEClass(SKILL_TEST_CMD);
        createEReference(skillTestCmdEClass, SKILL_TEST_CMD__SKILL);

        opposedSkillTestCmdEClass = createEClass(OPPOSED_SKILL_TEST_CMD);
        createEReference(opposedSkillTestCmdEClass, OPPOSED_SKILL_TEST_CMD__OBJECT);

        initativeEClass = createEClass(INITATIVE);
        createEAttribute(initativeEClass, INITATIVE__INI);
        createEAttribute(initativeEClass, INITATIVE__ACTUAL_INI);
        createEAttribute(initativeEClass, INITATIVE__SIZE_INITATIVE);
        createEOperation(initativeEClass, INITATIVE___NEXT_PASS__INT);

        executionProtocolEClass = createEClass(EXECUTION_PROTOCOL);
        createEReference(executionProtocolEClass, EXECUTION_PROTOCOL__COMMANDS);

        probeEClass = createEClass(PROBE);
        createEAttribute(probeEClass, PROBE__PROBE);
        createEAttribute(probeEClass, PROBE__SUCCESSES);
        createEAttribute(probeEClass, PROBE__GLITCHES);
        createEAttribute(probeEClass, PROBE__LIMIT);

        probeCommandEClass = createEClass(PROBE_COMMAND);
        createEAttribute(probeCommandEClass, PROBE_COMMAND__MODS);

        phaseCmdEClass = createEClass(PHASE_CMD);
        createEAttribute(phaseCmdEClass, PHASE_CMD__PHASE);

        combatTurnEClass = createEClass(COMBAT_TURN);
        createEReference(combatTurnEClass, COMBAT_TURN__COMBATANTS);
        createEReference(combatTurnEClass, COMBAT_TURN__ACTION_PHASES);
        createEReference(combatTurnEClass, COMBAT_TURN__CURRENT_TURN);
        createEOperation(combatTurnEClass, COMBAT_TURN___DO_TURN);

        succesTestEClass = createEClass(SUCCES_TEST);
        createEAttribute(succesTestEClass, SUCCES_TEST__THRESHOLDS);
        createEAttribute(succesTestEClass, SUCCES_TEST__NET_HITS);

        extendetSkillTestCmdEClass = createEClass(EXTENDET_SKILL_TEST_CMD);

        defensTestCmdEClass = createEClass(DEFENS_TEST_CMD);
        createEAttribute(defensTestCmdEClass, DEFENS_TEST_CMD__ATTACKERS_HITS);

        succesTestCmdEClass = createEClass(SUCCES_TEST_CMD);
        createEAttribute(succesTestCmdEClass, SUCCES_TEST_CMD__DICE_POOL);

        initativePassEClass = createEClass(INITATIVE_PASS);
        createEAttribute(initativePassEClass, INITATIVE_PASS__TURN);
        createEAttribute(initativePassEClass, INITATIVE_PASS__SIZE_INITATIVE);
        createEReference(initativePassEClass, INITATIVE_PASS__ACTION);
        createEReference(initativePassEClass, INITATIVE_PASS__FREE_ACTION);
        createEReference(initativePassEClass, INITATIVE_PASS__INTERRUPT_ACTION);

        commandWrapperEClass = createEClass(COMMAND_WRAPPER);

        complexActionEClass = createEClass(COMPLEX_ACTION);

        simpleActionEClass = createEClass(SIMPLE_ACTION);

        simpleActionsEClass = createEClass(SIMPLE_ACTIONS);
        createEReference(simpleActionsEClass, SIMPLE_ACTIONS__ACTION1);
        createEReference(simpleActionsEClass, SIMPLE_ACTIONS__ACTION2);

        freeActionEClass = createEClass(FREE_ACTION);

        interruptActionEClass = createEClass(INTERRUPT_ACTION);

        // Create data types
        commandCallbackEDataType = createEDataType(COMMAND_CALLBACK);
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
        RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        damageTestEClass.getESuperTypes().add(this.getProbeCommand());
        subjectCommandEClass.getESuperTypes().add(this.getCommand());
        skillTestCmdEClass.getESuperTypes().add(this.getProbeCommand());
        opposedSkillTestCmdEClass.getESuperTypes().add(this.getSkillTestCmd());
        initativeEClass.getESuperTypes().add(this.getSubjectCommand());
        probeCommandEClass.getESuperTypes().add(this.getSubjectCommand());
        probeCommandEClass.getESuperTypes().add(this.getSuccesTest());
        combatTurnEClass.getESuperTypes().add(this.getCommand());
        succesTestEClass.getESuperTypes().add(this.getProbe());
        extendetSkillTestCmdEClass.getESuperTypes().add(this.getSkillTestCmd());
        defensTestCmdEClass.getESuperTypes().add(this.getProbeCommand());
        succesTestCmdEClass.getESuperTypes().add(this.getProbeCommand());
        initativePassEClass.getESuperTypes().add(this.getSubjectCommand());
        initativePassEClass.getESuperTypes().add(this.getPhaseCmd());
        commandWrapperEClass.getESuperTypes().add(this.getSubjectCommand());
        complexActionEClass.getESuperTypes().add(this.getCommandWrapper());
        simpleActionEClass.getESuperTypes().add(this.getSubjectCommand());
        simpleActionsEClass.getESuperTypes().add(this.getCommandWrapper());
        freeActionEClass.getESuperTypes().add(this.getSubjectCommand());
        interruptActionEClass.getESuperTypes().add(this.getSubjectCommand());

        // Initialize classes, features, and operations; add parameters
        initEClass(executionStackEClass, ExecutionStack.class, "ExecutionStack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExecutionStack_CurrentCommand(), this.getCommand(), null, "currentCommand", null, 0, 1, ExecutionStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExecutionStack_ExecutedCommands(), this.getCommand(), null, "executedCommands", null, 0, -1, ExecutionStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExecutionStack_Protocol(), this.getExecutionProtocol(), null, "protocol", null, 1, 1, ExecutionStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(damageTestEClass, DamageTest.class, "DamageTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDamageTest_Damage(), ecorePackage.getEString(), "damage", null, 0, 1, DamageTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(commandEClass, Command.class, "Command", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCommand_Executed(), ecorePackage.getEBoolean(), "executed", null, 1, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCommand_SubCommands(), this.getCommand(), null, "subCommands", null, 0, -1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCommand_Date(), theShr5Package.getShrDate(), "date", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCommand_CmdCallback(), this.getCommandCallback(), "cmdCallback", "", 0, 1, Command.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getCommand_Executing(), ecorePackage.getEBoolean(), "executing", "false", 1, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCommand_CanExecute(), ecorePackage.getEBoolean(), "canExecute", null, 1, 1, Command.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEOperation(getCommand__Redo(), null, "redo", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEOperation(getCommand__Undo(), null, "undo", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(subjectCommandEClass, SubjectCommand.class, "SubjectCommand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSubjectCommand_Subject(), theRuntimePackage.getRuntimeCharacter(), null, "subject", null, 1, 1, SubjectCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(skillTestCmdEClass, SkillTestCmd.class, "SkillTestCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSkillTestCmd_Skill(), theShr5Package.getPersonaFertigkeit(), null, "skill", null, 1, 1, SkillTestCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(opposedSkillTestCmdEClass, OpposedSkillTestCmd.class, "OpposedSkillTestCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOpposedSkillTestCmd_Object(), theRuntimePackage.getRuntimeCharacter(), null, "object", null, 0, 1, OpposedSkillTestCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(initativeEClass, Initative.class, "Initative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInitative_Ini(), ecorePackage.getEInt(), "ini", null, 0, 1, Initative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInitative_ActualIni(), ecorePackage.getEInt(), "actualIni", null, 0, 1, Initative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInitative_SizeInitative(), ecorePackage.getEBoolean(), "sizeInitative", "false", 0, 1, Initative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = initEOperation(getInitative__NextPass__int(), ecorePackage.getEInt(), "nextPass", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEInt(), "actualPhase", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(executionProtocolEClass, ExecutionProtocol.class, "ExecutionProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExecutionProtocol_Commands(), this.getCommand(), null, "commands", null, 0, -1, ExecutionProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(probeEClass, Probe.class, "Probe", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProbe_Probe(), ecorePackage.getEInt(), "probe", null, 0, -1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProbe_Successes(), ecorePackage.getEInt(), "successes", null, 1, 1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProbe_Glitches(), ecorePackage.getEInt(), "glitches", null, 1, 1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProbe_Limit(), ecorePackage.getEInt(), "limit", null, 0, 1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(probeCommandEClass, ProbeCommand.class, "ProbeCommand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProbeCommand_Mods(), ecorePackage.getEInt(), "mods", null, 0, 1, ProbeCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(phaseCmdEClass, PhaseCmd.class, "PhaseCmd", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPhaseCmd_Phase(), ecorePackage.getEInt(), "phase", null, 0, 1, PhaseCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(combatTurnEClass, CombatTurn.class, "CombatTurn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCombatTurn_Combatants(), theRuntimePackage.getRuntimeCharacter(), null, "combatants", null, 0, -1, CombatTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCombatTurn_ActionPhases(), this.getInitativePass(), null, "actionPhases", null, 0, -1, CombatTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCombatTurn_CurrentTurn(), this.getInitativePass(), null, "currentTurn", null, 0, 1, CombatTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getCombatTurn__DoTurn(), null, "doTurn", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(succesTestEClass, SuccesTest.class, "SuccesTest", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSuccesTest_Thresholds(), ecorePackage.getEInt(), "thresholds", null, 0, 1, SuccesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSuccesTest_NetHits(), ecorePackage.getEInt(), "netHits", null, 0, 1, SuccesTest.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(extendetSkillTestCmdEClass, ExtendetSkillTestCmd.class, "ExtendetSkillTestCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(defensTestCmdEClass, DefensTestCmd.class, "DefensTestCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDefensTestCmd_AttackersHits(), ecorePackage.getEInt(), "attackersHits", null, 0, 1, DefensTestCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(succesTestCmdEClass, SuccesTestCmd.class, "SuccesTestCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSuccesTestCmd_DicePool(), ecorePackage.getEInt(), "dicePool", null, 0, 1, SuccesTestCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(initativePassEClass, InitativePass.class, "InitativePass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInitativePass_Turn(), ecorePackage.getEInt(), "turn", null, 0, 1, InitativePass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInitativePass_SizeInitative(), ecorePackage.getEBoolean(), "sizeInitative", "false", 0, 1, InitativePass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInitativePass_Action(), this.getCommandWrapper(), null, "action", null, 1, 1, InitativePass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInitativePass_FreeAction(), this.getFreeAction(), null, "freeAction", null, 0, 1, InitativePass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInitativePass_InterruptAction(), this.getInterruptAction(), null, "interruptAction", null, 0, 1, InitativePass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(commandWrapperEClass, CommandWrapper.class, "CommandWrapper", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(complexActionEClass, ComplexAction.class, "ComplexAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(simpleActionEClass, SimpleAction.class, "SimpleAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(simpleActionsEClass, SimpleActions.class, "SimpleActions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSimpleActions_Action1(), this.getSimpleAction(), null, "action1", null, 1, 1, SimpleActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSimpleActions_Action2(), this.getSimpleAction(), null, "action2", null, 1, 1, SimpleActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(freeActionEClass, FreeAction.class, "FreeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(interruptActionEClass, InterruptAction.class, "InterruptAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize data types
        initEDataType(commandCallbackEDataType, CommandCallback.class, "CommandCallback", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //GameplayPackageImpl
