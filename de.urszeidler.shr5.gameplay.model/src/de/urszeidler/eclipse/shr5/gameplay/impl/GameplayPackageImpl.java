/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.CombatSpellCmd;
import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.CommandWrapper;
import de.urszeidler.eclipse.shr5.gameplay.ComplexAction;
import de.urszeidler.eclipse.shr5.gameplay.DamageTest;
import de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.DrainCommand;
import de.urszeidler.eclipse.shr5.gameplay.ExecutionProtocol;
import de.urszeidler.eclipse.shr5.gameplay.ExecutionStack;
import de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.FreeAction;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.Initative;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.InterruptAction;
import de.urszeidler.eclipse.shr5.gameplay.InterruptType;
import de.urszeidler.eclipse.shr5.gameplay.Intervall;
import de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.PhaseCmd;
import de.urszeidler.eclipse.shr5.gameplay.Probe;
import de.urszeidler.eclipse.shr5.gameplay.ProbeCommand;
import de.urszeidler.eclipse.shr5.gameplay.ProbeMod;
import de.urszeidler.eclipse.shr5.gameplay.ProbeState;
import de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.SemanticAction;
import de.urszeidler.eclipse.shr5.gameplay.SemanticType;
import de.urszeidler.eclipse.shr5.gameplay.SetExtendetData;
import de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand;
import de.urszeidler.eclipse.shr5.gameplay.SimpleAction;
import de.urszeidler.eclipse.shr5.gameplay.SimpleActions;
import de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.SpellCommand;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTest;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTestState;
import de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;

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
    private EClass setFeatureCommandEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass meeleAttackCmdEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rangedAttackCmdEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass intervallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass probeModEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass setExtendetDataEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass semanticActionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass drainCommandEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass spellCommandEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass combatSpellCmdEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum interruptTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum probeStateEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum succesTestStateEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum semanticTypeEEnum = null;

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
    public EReference getExecutionStack_Protocol() {
        return (EReference)executionStackEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getExecutionStack__Redo() {
        return executionStackEClass.getEOperations().get(0);
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
    public EAttribute getDamageTest_Dv() {
        return (EAttribute)damageTestEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDamageTest_EffectiveDamage() {
        return (EAttribute)damageTestEClass.getEStructuralFeatures().get(2);
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
    public EReference getOpposedSkillTestCmd_ObjectSkill() {
        return (EReference)opposedSkillTestCmdEClass.getEStructuralFeatures().get(1);
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
    public EAttribute getProbe_ProbeState() {
        return (EAttribute)probeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProbe_ProbeMods() {
        return (EReference)probeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProbe_SkipTest() {
        return (EAttribute)probeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProbe_PushTheLimit() {
        return (EAttribute)probeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProbe_SecondChance() {
        return (EAttribute)probeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProbe_CloseCall() {
        return (EAttribute)probeEClass.getEStructuralFeatures().get(9);
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
    public EAttribute getCombatTurn_Sequence() {
        return (EAttribute)combatTurnEClass.getEStructuralFeatures().get(3);
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
    public EAttribute getSuccesTest_TestState() {
        return (EAttribute)succesTestEClass.getEStructuralFeatures().get(2);
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
    public EAttribute getExtendetSkillTestCmd_StartDate() {
        return (EAttribute)extendetSkillTestCmdEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtendetSkillTestCmd_Intervall() {
        return (EReference)extendetSkillTestCmdEClass.getEStructuralFeatures().get(1);
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
    public EAttribute getInterruptAction_IniCost() {
        return (EAttribute)interruptActionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInterruptAction_InterruptType() {
        return (EAttribute)interruptActionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSetFeatureCommand() {
        return setFeatureCommandEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSetFeatureCommand_Value() {
        return (EAttribute)setFeatureCommandEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSetFeatureCommand_Object() {
        return (EReference)setFeatureCommandEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSetFeatureCommand_Feature() {
        return (EReference)setFeatureCommandEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMeeleAttackCmd() {
        return meeleAttackCmdEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMeeleAttackCmd_Weapon() {
        return (EReference)meeleAttackCmdEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRangedAttackCmd() {
        return rangedAttackCmdEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRangedAttackCmd_Modus() {
        return (EAttribute)rangedAttackCmdEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRangedAttackCmd_Range() {
        return (EAttribute)rangedAttackCmdEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRangedAttackCmd_Weapon() {
        return (EReference)rangedAttackCmdEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRangedAttackCmd_NumberOfShoots() {
        return (EAttribute)rangedAttackCmdEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntervall() {
        return intervallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIntervall_Quantities() {
        return (EAttribute)intervallEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIntervall_Units() {
        return (EAttribute)intervallEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProbeMod() {
        return probeModEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProbeMod_Value() {
        return (EAttribute)probeModEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProbeMod_Type() {
        return (EReference)probeModEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSetExtendetData() {
        return setExtendetDataEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSetExtendetData_DataAware() {
        return (EReference)setExtendetDataEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSetExtendetData_Data() {
        return (EReference)setExtendetDataEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSetExtendetData_Value() {
        return (EAttribute)setExtendetDataEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSemanticAction() {
        return semanticActionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSemanticAction_Type() {
        return (EAttribute)semanticActionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSemanticAction_Message() {
        return (EAttribute)semanticActionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDrainCommand() {
        return drainCommandEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDrainCommand_Damage() {
        return (EAttribute)drainCommandEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDrainCommand_DamageType() {
        return (EAttribute)drainCommandEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSpellCommand() {
        return spellCommandEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSpellCommand_Spell() {
        return (EReference)spellCommandEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCombatSpellCmd() {
        return combatSpellCmdEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getInterruptType() {
        return interruptTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getProbeState() {
        return probeStateEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSuccesTestState() {
        return succesTestStateEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSemanticType() {
        return semanticTypeEEnum;
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
        createEReference(executionStackEClass, EXECUTION_STACK__PROTOCOL);
        createEOperation(executionStackEClass, EXECUTION_STACK___REDO);

        damageTestEClass = createEClass(DAMAGE_TEST);
        createEAttribute(damageTestEClass, DAMAGE_TEST__DAMAGE);
        createEAttribute(damageTestEClass, DAMAGE_TEST__DV);
        createEAttribute(damageTestEClass, DAMAGE_TEST__EFFECTIVE_DAMAGE);

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
        createEReference(opposedSkillTestCmdEClass, OPPOSED_SKILL_TEST_CMD__OBJECT_SKILL);

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
        createEAttribute(probeEClass, PROBE__PROBE_STATE);
        createEReference(probeEClass, PROBE__PROBE_MODS);
        createEAttribute(probeEClass, PROBE__SKIP_TEST);
        createEAttribute(probeEClass, PROBE__PUSH_THE_LIMIT);
        createEAttribute(probeEClass, PROBE__SECOND_CHANCE);
        createEAttribute(probeEClass, PROBE__CLOSE_CALL);

        probeCommandEClass = createEClass(PROBE_COMMAND);
        createEAttribute(probeCommandEClass, PROBE_COMMAND__MODS);

        phaseCmdEClass = createEClass(PHASE_CMD);
        createEAttribute(phaseCmdEClass, PHASE_CMD__PHASE);

        combatTurnEClass = createEClass(COMBAT_TURN);
        createEReference(combatTurnEClass, COMBAT_TURN__COMBATANTS);
        createEReference(combatTurnEClass, COMBAT_TURN__ACTION_PHASES);
        createEReference(combatTurnEClass, COMBAT_TURN__CURRENT_TURN);
        createEAttribute(combatTurnEClass, COMBAT_TURN__SEQUENCE);
        createEOperation(combatTurnEClass, COMBAT_TURN___DO_TURN);

        succesTestEClass = createEClass(SUCCES_TEST);
        createEAttribute(succesTestEClass, SUCCES_TEST__THRESHOLDS);
        createEAttribute(succesTestEClass, SUCCES_TEST__NET_HITS);
        createEAttribute(succesTestEClass, SUCCES_TEST__TEST_STATE);

        extendetSkillTestCmdEClass = createEClass(EXTENDET_SKILL_TEST_CMD);
        createEAttribute(extendetSkillTestCmdEClass, EXTENDET_SKILL_TEST_CMD__START_DATE);
        createEReference(extendetSkillTestCmdEClass, EXTENDET_SKILL_TEST_CMD__INTERVALL);

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
        createEAttribute(interruptActionEClass, INTERRUPT_ACTION__INI_COST);
        createEAttribute(interruptActionEClass, INTERRUPT_ACTION__INTERRUPT_TYPE);

        setFeatureCommandEClass = createEClass(SET_FEATURE_COMMAND);
        createEAttribute(setFeatureCommandEClass, SET_FEATURE_COMMAND__VALUE);
        createEReference(setFeatureCommandEClass, SET_FEATURE_COMMAND__OBJECT);
        createEReference(setFeatureCommandEClass, SET_FEATURE_COMMAND__FEATURE);

        meeleAttackCmdEClass = createEClass(MEELE_ATTACK_CMD);
        createEReference(meeleAttackCmdEClass, MEELE_ATTACK_CMD__WEAPON);

        rangedAttackCmdEClass = createEClass(RANGED_ATTACK_CMD);
        createEAttribute(rangedAttackCmdEClass, RANGED_ATTACK_CMD__MODUS);
        createEAttribute(rangedAttackCmdEClass, RANGED_ATTACK_CMD__RANGE);
        createEReference(rangedAttackCmdEClass, RANGED_ATTACK_CMD__WEAPON);
        createEAttribute(rangedAttackCmdEClass, RANGED_ATTACK_CMD__NUMBER_OF_SHOOTS);

        intervallEClass = createEClass(INTERVALL);
        createEAttribute(intervallEClass, INTERVALL__QUANTITIES);
        createEAttribute(intervallEClass, INTERVALL__UNITS);

        probeModEClass = createEClass(PROBE_MOD);
        createEAttribute(probeModEClass, PROBE_MOD__VALUE);
        createEReference(probeModEClass, PROBE_MOD__TYPE);

        setExtendetDataEClass = createEClass(SET_EXTENDET_DATA);
        createEReference(setExtendetDataEClass, SET_EXTENDET_DATA__DATA_AWARE);
        createEReference(setExtendetDataEClass, SET_EXTENDET_DATA__DATA);
        createEAttribute(setExtendetDataEClass, SET_EXTENDET_DATA__VALUE);

        semanticActionEClass = createEClass(SEMANTIC_ACTION);
        createEAttribute(semanticActionEClass, SEMANTIC_ACTION__TYPE);
        createEAttribute(semanticActionEClass, SEMANTIC_ACTION__MESSAGE);

        drainCommandEClass = createEClass(DRAIN_COMMAND);
        createEAttribute(drainCommandEClass, DRAIN_COMMAND__DAMAGE);
        createEAttribute(drainCommandEClass, DRAIN_COMMAND__DAMAGE_TYPE);

        spellCommandEClass = createEClass(SPELL_COMMAND);
        createEReference(spellCommandEClass, SPELL_COMMAND__SPELL);

        combatSpellCmdEClass = createEClass(COMBAT_SPELL_CMD);

        // Create enums
        interruptTypeEEnum = createEEnum(INTERRUPT_TYPE);
        probeStateEEnum = createEEnum(PROBE_STATE);
        succesTestStateEEnum = createEEnum(SUCCES_TEST_STATE);
        semanticTypeEEnum = createEEnum(SEMANTIC_TYPE);

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
        setFeatureCommandEClass.getESuperTypes().add(this.getCommand());
        meeleAttackCmdEClass.getESuperTypes().add(this.getOpposedSkillTestCmd());
        rangedAttackCmdEClass.getESuperTypes().add(this.getOpposedSkillTestCmd());
        setExtendetDataEClass.getESuperTypes().add(this.getCommand());
        semanticActionEClass.getESuperTypes().add(this.getSubjectCommand());
        drainCommandEClass.getESuperTypes().add(this.getProbeCommand());
        spellCommandEClass.getESuperTypes().add(this.getProbeCommand());
        combatSpellCmdEClass.getESuperTypes().add(this.getSpellCommand());

        // Initialize classes, features, and operations; add parameters
        initEClass(executionStackEClass, ExecutionStack.class, "ExecutionStack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExecutionStack_CurrentCommand(), this.getCommand(), null, "currentCommand", null, 0, 1, ExecutionStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExecutionStack_Protocol(), this.getExecutionProtocol(), null, "protocol", null, 1, 1, ExecutionStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getExecutionStack__Redo(), null, "redo", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(damageTestEClass, DamageTest.class, "DamageTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDamageTest_Damage(), ecorePackage.getEString(), "damage", null, 1, 1, DamageTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDamageTest_Dv(), ecorePackage.getEInt(), "dv", null, 1, 1, DamageTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDamageTest_EffectiveDamage(), ecorePackage.getEString(), "effectiveDamage", null, 0, 1, DamageTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(commandEClass, Command.class, "Command", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCommand_Executed(), ecorePackage.getEBoolean(), "executed", "false", 1, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
        initEReference(getSkillTestCmd_Skill(), theShr5Package.getFertigkeit(), null, "skill", null, 1, 1, SkillTestCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(opposedSkillTestCmdEClass, OpposedSkillTestCmd.class, "OpposedSkillTestCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOpposedSkillTestCmd_Object(), theRuntimePackage.getRuntimeCharacter(), null, "object", null, 0, 1, OpposedSkillTestCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOpposedSkillTestCmd_ObjectSkill(), theShr5Package.getFertigkeit(), null, "objectSkill", null, 0, 1, OpposedSkillTestCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
        initEAttribute(getProbe_Glitches(), ecorePackage.getEInt(), "glitches", null, 1, 1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProbe_Limit(), ecorePackage.getEInt(), "limit", null, 0, 1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProbe_ProbeState(), this.getProbeState(), "probeState", null, 1, 1, Probe.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getProbe_ProbeMods(), this.getProbeMod(), null, "probeMods", null, 0, -1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProbe_SkipTest(), ecorePackage.getEBoolean(), "skipTest", null, 1, 1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProbe_PushTheLimit(), ecorePackage.getEBoolean(), "pushTheLimit", null, 0, 1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProbe_SecondChance(), ecorePackage.getEBoolean(), "secondChance", null, 0, 1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProbe_CloseCall(), ecorePackage.getEBoolean(), "closeCall", null, 0, 1, Probe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(probeCommandEClass, ProbeCommand.class, "ProbeCommand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProbeCommand_Mods(), ecorePackage.getEInt(), "mods", null, 0, 1, ProbeCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(phaseCmdEClass, PhaseCmd.class, "PhaseCmd", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPhaseCmd_Phase(), ecorePackage.getEInt(), "phase", null, 0, 1, PhaseCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(combatTurnEClass, CombatTurn.class, "CombatTurn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCombatTurn_Combatants(), theRuntimePackage.getRuntimeCharacter(), null, "combatants", null, 0, -1, CombatTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCombatTurn_ActionPhases(), this.getInitativePass(), null, "actionPhases", null, 0, -1, CombatTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCombatTurn_CurrentTurn(), this.getInitativePass(), null, "currentTurn", null, 0, 1, CombatTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCombatTurn_Sequence(), ecorePackage.getEInt(), "sequence", null, 0, 1, CombatTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getCombatTurn__DoTurn(), null, "doTurn", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(succesTestEClass, SuccesTest.class, "SuccesTest", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSuccesTest_Thresholds(), ecorePackage.getEInt(), "thresholds", null, 0, 1, SuccesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSuccesTest_NetHits(), ecorePackage.getEInt(), "netHits", null, 0, 1, SuccesTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSuccesTest_TestState(), this.getSuccesTestState(), "testState", null, 0, 1, SuccesTest.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(extendetSkillTestCmdEClass, ExtendetSkillTestCmd.class, "ExtendetSkillTestCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExtendetSkillTestCmd_StartDate(), theShr5Package.getShrDate(), "startDate", null, 1, 1, ExtendetSkillTestCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExtendetSkillTestCmd_Intervall(), this.getIntervall(), null, "intervall", null, 1, 1, ExtendetSkillTestCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
        initEReference(getSimpleActions_Action1(), this.getSimpleAction(), null, "action1", null, 0, 1, SimpleActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSimpleActions_Action2(), this.getSimpleAction(), null, "action2", null, 0, 1, SimpleActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(freeActionEClass, FreeAction.class, "FreeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(interruptActionEClass, InterruptAction.class, "InterruptAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInterruptAction_IniCost(), ecorePackage.getEInt(), "iniCost", null, 0, 1, InterruptAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInterruptAction_InterruptType(), this.getInterruptType(), "interruptType", null, 0, 1, InterruptAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(setFeatureCommandEClass, SetFeatureCommand.class, "SetFeatureCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSetFeatureCommand_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, SetFeatureCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSetFeatureCommand_Object(), ecorePackage.getEObject(), null, "object", null, 0, 1, SetFeatureCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSetFeatureCommand_Feature(), ecorePackage.getEStructuralFeature(), null, "feature", null, 0, 1, SetFeatureCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(meeleAttackCmdEClass, MeeleAttackCmd.class, "MeeleAttackCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMeeleAttackCmd_Weapon(), theShr5Package.getNahkampfwaffe(), null, "weapon", null, 1, 1, MeeleAttackCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rangedAttackCmdEClass, RangedAttackCmd.class, "RangedAttackCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRangedAttackCmd_Modus(), theShr5Package.getFeuerModus(), "modus", null, 0, 1, RangedAttackCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRangedAttackCmd_Range(), ecorePackage.getEInt(), "range", null, 0, 1, RangedAttackCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRangedAttackCmd_Weapon(), theShr5Package.getAbstaktFernKampfwaffe(), null, "weapon", null, 0, 1, RangedAttackCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRangedAttackCmd_NumberOfShoots(), ecorePackage.getEInt(), "numberOfShoots", null, 0, 1, RangedAttackCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(intervallEClass, Intervall.class, "Intervall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIntervall_Quantities(), ecorePackage.getEInt(), "quantities", null, 1, 1, Intervall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIntervall_Units(), theShr5Package.getTimeUnits(), "units", null, 1, 1, Intervall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(probeModEClass, ProbeMod.class, "ProbeMod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProbeMod_Value(), ecorePackage.getEInt(), "value", null, 0, 1, ProbeMod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProbeMod_Type(), theRuntimePackage.getExtendetData(), null, "type", null, 1, 1, ProbeMod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(setExtendetDataEClass, SetExtendetData.class, "SetExtendetData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSetExtendetData_DataAware(), theRuntimePackage.getAbstractExtendetDataAware(), null, "dataAware", null, 1, 1, SetExtendetData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSetExtendetData_Data(), theRuntimePackage.getExtendetData(), null, "data", null, 1, 1, SetExtendetData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSetExtendetData_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, SetExtendetData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(semanticActionEClass, SemanticAction.class, "SemanticAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSemanticAction_Type(), this.getSemanticType(), "type", null, 0, 1, SemanticAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSemanticAction_Message(), ecorePackage.getEString(), "message", null, 0, 1, SemanticAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(drainCommandEClass, DrainCommand.class, "DrainCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDrainCommand_Damage(), ecorePackage.getEInt(), "damage", null, 1, 1, DrainCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDrainCommand_DamageType(), theShr5Package.getSchadensTyp(), "damageType", null, 0, 1, DrainCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(spellCommandEClass, SpellCommand.class, "SpellCommand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSpellCommand_Spell(), theShr5Package.getZauber(), null, "spell", null, 1, 1, SpellCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(combatSpellCmdEClass, CombatSpellCmd.class, "CombatSpellCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(interruptTypeEEnum, InterruptType.class, "InterruptType");
        addEEnumLiteral(interruptTypeEEnum, InterruptType.BLOCK);
        addEEnumLiteral(interruptTypeEEnum, InterruptType.DODGE);
        addEEnumLiteral(interruptTypeEEnum, InterruptType.HIT_THE_DIRT);
        addEEnumLiteral(interruptTypeEEnum, InterruptType.INTERCEPT);
        addEEnumLiteral(interruptTypeEEnum, InterruptType.PARRY);
        addEEnumLiteral(interruptTypeEEnum, InterruptType.FULL_DEFENSE);

        initEEnum(probeStateEEnum, ProbeState.class, "ProbeState");
        addEEnumLiteral(probeStateEEnum, ProbeState.NO_GLITCH);
        addEEnumLiteral(probeStateEEnum, ProbeState.GLITCH);
        addEEnumLiteral(probeStateEEnum, ProbeState.CRITICAL_GLITCH);

        initEEnum(succesTestStateEEnum, SuccesTestState.class, "SuccesTestState");
        addEEnumLiteral(succesTestStateEEnum, SuccesTestState.SUCCES);
        addEEnumLiteral(succesTestStateEEnum, SuccesTestState.FAILURE);

        initEEnum(semanticTypeEEnum, SemanticType.class, "SemanticType");
        addEEnumLiteral(semanticTypeEEnum, SemanticType.TALK);
        addEEnumLiteral(semanticTypeEEnum, SemanticType.GESTURE);
        addEEnumLiteral(semanticTypeEEnum, SemanticType.DESCRIPTION);

        // Initialize data types
        initEDataType(commandCallbackEDataType, CommandCallback.class, "CommandCallback", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //GameplayPackageImpl
