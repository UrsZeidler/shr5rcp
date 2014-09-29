/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
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
import de.urszeidler.eclipse.shr5.gameplay.InterruptType;
import de.urszeidler.eclipse.shr5.gameplay.Intervall;
import de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.ProbeMod;
import de.urszeidler.eclipse.shr5.gameplay.ProbeState;
import de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.SetExtendetData;
import de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand;
import de.urszeidler.eclipse.shr5.gameplay.SimpleAction;
import de.urszeidler.eclipse.shr5.gameplay.SimpleActions;
import de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTestState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameplayFactoryImpl extends EFactoryImpl implements GameplayFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static GameplayFactory init() {
        try {
            GameplayFactory theGameplayFactory = (GameplayFactory)EPackage.Registry.INSTANCE.getEFactory(GameplayPackage.eNS_URI);
            if (theGameplayFactory != null) {
                return theGameplayFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new GameplayFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GameplayFactoryImpl() {
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
            case GameplayPackage.EXECUTION_STACK: return createExecutionStack();
            case GameplayPackage.DAMAGE_TEST: return createDamageTest();
            case GameplayPackage.SKILL_TEST_CMD: return createSkillTestCmd();
            case GameplayPackage.OPPOSED_SKILL_TEST_CMD: return createOpposedSkillTestCmd();
            case GameplayPackage.INITATIVE: return createInitative();
            case GameplayPackage.EXECUTION_PROTOCOL: return createExecutionProtocol();
            case GameplayPackage.COMBAT_TURN: return createCombatTurn();
            case GameplayPackage.EXTENDET_SKILL_TEST_CMD: return createExtendetSkillTestCmd();
            case GameplayPackage.DEFENS_TEST_CMD: return createDefensTestCmd();
            case GameplayPackage.SUCCES_TEST_CMD: return createSuccesTestCmd();
            case GameplayPackage.INITATIVE_PASS: return createInitativePass();
            case GameplayPackage.COMPLEX_ACTION: return createComplexAction();
            case GameplayPackage.SIMPLE_ACTION: return createSimpleAction();
            case GameplayPackage.SIMPLE_ACTIONS: return createSimpleActions();
            case GameplayPackage.FREE_ACTION: return createFreeAction();
            case GameplayPackage.INTERRUPT_ACTION: return createInterruptAction();
            case GameplayPackage.SET_FEATURE_COMMAND: return createSetFeatureCommand();
            case GameplayPackage.MEELE_ATTACK_CMD: return createMeeleAttackCmd();
            case GameplayPackage.RANGED_ATTACK_CMD: return createRangedAttackCmd();
            case GameplayPackage.INTERVALL: return createIntervall();
            case GameplayPackage.PROBE_MOD: return createProbeMod();
            case GameplayPackage.SET_EXTENDET_DATA: return createSetExtendetData();
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
            case GameplayPackage.INTERRUPT_TYPE:
                return createInterruptTypeFromString(eDataType, initialValue);
            case GameplayPackage.PROBE_STATE:
                return createProbeStateFromString(eDataType, initialValue);
            case GameplayPackage.SUCCES_TEST_STATE:
                return createSuccesTestStateFromString(eDataType, initialValue);
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
            case GameplayPackage.INTERRUPT_TYPE:
                return convertInterruptTypeToString(eDataType, instanceValue);
            case GameplayPackage.PROBE_STATE:
                return convertProbeStateToString(eDataType, instanceValue);
            case GameplayPackage.SUCCES_TEST_STATE:
                return convertSuccesTestStateToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionStack createExecutionStack() {
        ExecutionStackImpl executionStack = new ExecutionStackImpl();
        return executionStack;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DamageTest createDamageTest() {
        DamageTestImpl damageTest = new DamageTestImpl();
        return damageTest;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SkillTestCmd createSkillTestCmd() {
        SkillTestCmdImpl skillTestCmd = new SkillTestCmdImpl();
        return skillTestCmd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpposedSkillTestCmd createOpposedSkillTestCmd() {
        OpposedSkillTestCmdImpl opposedSkillTestCmd = new OpposedSkillTestCmdImpl();
        return opposedSkillTestCmd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Initative createInitative() {
        InitativeImpl initative = new InitativeImpl();
        return initative;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionProtocol createExecutionProtocol() {
        ExecutionProtocolImpl executionProtocol = new ExecutionProtocolImpl();
        return executionProtocol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CombatTurn createCombatTurn() {
        CombatTurnImpl combatTurn = new CombatTurnImpl();
        return combatTurn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtendetSkillTestCmd createExtendetSkillTestCmd() {
        ExtendetSkillTestCmdImpl extendetSkillTestCmd = new ExtendetSkillTestCmdImpl();
        return extendetSkillTestCmd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefensTestCmd createDefensTestCmd() {
        DefensTestCmdImpl defensTestCmd = new DefensTestCmdImpl();
        return defensTestCmd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SuccesTestCmd createSuccesTestCmd() {
        SuccesTestCmdImpl succesTestCmd = new SuccesTestCmdImpl();
        return succesTestCmd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InitativePass createInitativePass() {
        InitativePassImpl initativePass = new InitativePassImpl();
        return initativePass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplexAction createComplexAction() {
        ComplexActionImpl complexAction = new ComplexActionImpl();
        return complexAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleAction createSimpleAction() {
        SimpleActionImpl simpleAction = new SimpleActionImpl();
        return simpleAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleActions createSimpleActions() {
        SimpleActionsImpl simpleActions = new SimpleActionsImpl();
        return simpleActions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FreeAction createFreeAction() {
        FreeActionImpl freeAction = new FreeActionImpl();
        return freeAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterruptAction createInterruptAction() {
        InterruptActionImpl interruptAction = new InterruptActionImpl();
        return interruptAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SetFeatureCommand createSetFeatureCommand() {
        SetFeatureCommandImpl setFeatureCommand = new SetFeatureCommandImpl();
        return setFeatureCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeeleAttackCmd createMeeleAttackCmd() {
        MeeleAttackCmdImpl meeleAttackCmd = new MeeleAttackCmdImpl();
        return meeleAttackCmd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RangedAttackCmd createRangedAttackCmd() {
        RangedAttackCmdImpl rangedAttackCmd = new RangedAttackCmdImpl();
        return rangedAttackCmd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Intervall createIntervall() {
        IntervallImpl intervall = new IntervallImpl();
        return intervall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProbeMod createProbeMod() {
        ProbeModImpl probeMod = new ProbeModImpl();
        return probeMod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SetExtendetData createSetExtendetData() {
        SetExtendetDataImpl setExtendetData = new SetExtendetDataImpl();
        return setExtendetData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterruptType createInterruptTypeFromString(EDataType eDataType, String initialValue) {
        InterruptType result = InterruptType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertInterruptTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProbeState createProbeStateFromString(EDataType eDataType, String initialValue) {
        ProbeState result = ProbeState.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProbeStateToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SuccesTestState createSuccesTestStateFromString(EDataType eDataType, String initialValue) {
        SuccesTestState result = SuccesTestState.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSuccesTestStateToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GameplayPackage getGameplayPackage() {
        return (GameplayPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static GameplayPackage getPackage() {
        return GameplayPackage.eINSTANCE;
    }

} //GameplayFactoryImpl
