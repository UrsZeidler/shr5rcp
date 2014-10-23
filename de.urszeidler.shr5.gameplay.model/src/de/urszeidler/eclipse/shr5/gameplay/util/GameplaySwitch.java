/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.util;

import de.urszeidler.eclipse.shr5.gameplay.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
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
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.Initative;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.InterruptAction;
import de.urszeidler.eclipse.shr5.gameplay.Intervall;
import de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.PhaseCmd;
import de.urszeidler.eclipse.shr5.gameplay.Probe;
import de.urszeidler.eclipse.shr5.gameplay.ProbeCommand;
import de.urszeidler.eclipse.shr5.gameplay.ProbeMod;
import de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.SetExtendetData;
import de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand;
import de.urszeidler.eclipse.shr5.gameplay.SimpleAction;
import de.urszeidler.eclipse.shr5.gameplay.SimpleActions;
import de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTest;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage
 * @generated
 */
public class GameplaySwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static GameplayPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GameplaySwitch() {
        if (modelPackage == null) {
            modelPackage = GameplayPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case GameplayPackage.EXECUTION_STACK: {
                ExecutionStack executionStack = (ExecutionStack)theEObject;
                T result = caseExecutionStack(executionStack);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.DAMAGE_TEST: {
                DamageTest damageTest = (DamageTest)theEObject;
                T result = caseDamageTest(damageTest);
                if (result == null) result = caseProbeCommand(damageTest);
                if (result == null) result = caseSubjectCommand(damageTest);
                if (result == null) result = caseSuccesTest(damageTest);
                if (result == null) result = caseCommand(damageTest);
                if (result == null) result = caseProbe(damageTest);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.COMMAND: {
                Command command = (Command)theEObject;
                T result = caseCommand(command);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.SUBJECT_COMMAND: {
                SubjectCommand subjectCommand = (SubjectCommand)theEObject;
                T result = caseSubjectCommand(subjectCommand);
                if (result == null) result = caseCommand(subjectCommand);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.SKILL_TEST_CMD: {
                SkillTestCmd skillTestCmd = (SkillTestCmd)theEObject;
                T result = caseSkillTestCmd(skillTestCmd);
                if (result == null) result = caseProbeCommand(skillTestCmd);
                if (result == null) result = caseSubjectCommand(skillTestCmd);
                if (result == null) result = caseSuccesTest(skillTestCmd);
                if (result == null) result = caseCommand(skillTestCmd);
                if (result == null) result = caseProbe(skillTestCmd);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.OPPOSED_SKILL_TEST_CMD: {
                OpposedSkillTestCmd opposedSkillTestCmd = (OpposedSkillTestCmd)theEObject;
                T result = caseOpposedSkillTestCmd(opposedSkillTestCmd);
                if (result == null) result = caseSkillTestCmd(opposedSkillTestCmd);
                if (result == null) result = caseProbeCommand(opposedSkillTestCmd);
                if (result == null) result = caseSubjectCommand(opposedSkillTestCmd);
                if (result == null) result = caseSuccesTest(opposedSkillTestCmd);
                if (result == null) result = caseCommand(opposedSkillTestCmd);
                if (result == null) result = caseProbe(opposedSkillTestCmd);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.INITATIVE: {
                Initative initative = (Initative)theEObject;
                T result = caseInitative(initative);
                if (result == null) result = caseSubjectCommand(initative);
                if (result == null) result = caseCommand(initative);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.EXECUTION_PROTOCOL: {
                ExecutionProtocol executionProtocol = (ExecutionProtocol)theEObject;
                T result = caseExecutionProtocol(executionProtocol);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.PROBE: {
                Probe probe = (Probe)theEObject;
                T result = caseProbe(probe);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.PROBE_COMMAND: {
                ProbeCommand probeCommand = (ProbeCommand)theEObject;
                T result = caseProbeCommand(probeCommand);
                if (result == null) result = caseSubjectCommand(probeCommand);
                if (result == null) result = caseSuccesTest(probeCommand);
                if (result == null) result = caseCommand(probeCommand);
                if (result == null) result = caseProbe(probeCommand);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.PHASE_CMD: {
                PhaseCmd phaseCmd = (PhaseCmd)theEObject;
                T result = casePhaseCmd(phaseCmd);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.COMBAT_TURN: {
                CombatTurn combatTurn = (CombatTurn)theEObject;
                T result = caseCombatTurn(combatTurn);
                if (result == null) result = caseCommand(combatTurn);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.SUCCES_TEST: {
                SuccesTest succesTest = (SuccesTest)theEObject;
                T result = caseSuccesTest(succesTest);
                if (result == null) result = caseProbe(succesTest);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.EXTENDET_SKILL_TEST_CMD: {
                ExtendetSkillTestCmd extendetSkillTestCmd = (ExtendetSkillTestCmd)theEObject;
                T result = caseExtendetSkillTestCmd(extendetSkillTestCmd);
                if (result == null) result = caseSkillTestCmd(extendetSkillTestCmd);
                if (result == null) result = caseProbeCommand(extendetSkillTestCmd);
                if (result == null) result = caseSubjectCommand(extendetSkillTestCmd);
                if (result == null) result = caseSuccesTest(extendetSkillTestCmd);
                if (result == null) result = caseCommand(extendetSkillTestCmd);
                if (result == null) result = caseProbe(extendetSkillTestCmd);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.DEFENS_TEST_CMD: {
                DefensTestCmd defensTestCmd = (DefensTestCmd)theEObject;
                T result = caseDefensTestCmd(defensTestCmd);
                if (result == null) result = caseProbeCommand(defensTestCmd);
                if (result == null) result = caseSubjectCommand(defensTestCmd);
                if (result == null) result = caseSuccesTest(defensTestCmd);
                if (result == null) result = caseCommand(defensTestCmd);
                if (result == null) result = caseProbe(defensTestCmd);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.SUCCES_TEST_CMD: {
                SuccesTestCmd succesTestCmd = (SuccesTestCmd)theEObject;
                T result = caseSuccesTestCmd(succesTestCmd);
                if (result == null) result = caseProbeCommand(succesTestCmd);
                if (result == null) result = caseSubjectCommand(succesTestCmd);
                if (result == null) result = caseSuccesTest(succesTestCmd);
                if (result == null) result = caseCommand(succesTestCmd);
                if (result == null) result = caseProbe(succesTestCmd);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.INITATIVE_PASS: {
                InitativePass initativePass = (InitativePass)theEObject;
                T result = caseInitativePass(initativePass);
                if (result == null) result = caseSubjectCommand(initativePass);
                if (result == null) result = casePhaseCmd(initativePass);
                if (result == null) result = caseCommand(initativePass);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.COMMAND_WRAPPER: {
                CommandWrapper commandWrapper = (CommandWrapper)theEObject;
                T result = caseCommandWrapper(commandWrapper);
                if (result == null) result = caseSubjectCommand(commandWrapper);
                if (result == null) result = caseCommand(commandWrapper);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.COMPLEX_ACTION: {
                ComplexAction complexAction = (ComplexAction)theEObject;
                T result = caseComplexAction(complexAction);
                if (result == null) result = caseCommandWrapper(complexAction);
                if (result == null) result = caseSubjectCommand(complexAction);
                if (result == null) result = caseCommand(complexAction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.SIMPLE_ACTION: {
                SimpleAction simpleAction = (SimpleAction)theEObject;
                T result = caseSimpleAction(simpleAction);
                if (result == null) result = caseSubjectCommand(simpleAction);
                if (result == null) result = caseCommand(simpleAction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.SIMPLE_ACTIONS: {
                SimpleActions simpleActions = (SimpleActions)theEObject;
                T result = caseSimpleActions(simpleActions);
                if (result == null) result = caseCommandWrapper(simpleActions);
                if (result == null) result = caseSubjectCommand(simpleActions);
                if (result == null) result = caseCommand(simpleActions);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.FREE_ACTION: {
                FreeAction freeAction = (FreeAction)theEObject;
                T result = caseFreeAction(freeAction);
                if (result == null) result = caseSubjectCommand(freeAction);
                if (result == null) result = caseCommand(freeAction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.INTERRUPT_ACTION: {
                InterruptAction interruptAction = (InterruptAction)theEObject;
                T result = caseInterruptAction(interruptAction);
                if (result == null) result = caseSubjectCommand(interruptAction);
                if (result == null) result = caseCommand(interruptAction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.SET_FEATURE_COMMAND: {
                SetFeatureCommand setFeatureCommand = (SetFeatureCommand)theEObject;
                T result = caseSetFeatureCommand(setFeatureCommand);
                if (result == null) result = caseCommand(setFeatureCommand);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.MEELE_ATTACK_CMD: {
                MeeleAttackCmd meeleAttackCmd = (MeeleAttackCmd)theEObject;
                T result = caseMeeleAttackCmd(meeleAttackCmd);
                if (result == null) result = caseOpposedSkillTestCmd(meeleAttackCmd);
                if (result == null) result = caseSkillTestCmd(meeleAttackCmd);
                if (result == null) result = caseProbeCommand(meeleAttackCmd);
                if (result == null) result = caseSubjectCommand(meeleAttackCmd);
                if (result == null) result = caseSuccesTest(meeleAttackCmd);
                if (result == null) result = caseCommand(meeleAttackCmd);
                if (result == null) result = caseProbe(meeleAttackCmd);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.RANGED_ATTACK_CMD: {
                RangedAttackCmd rangedAttackCmd = (RangedAttackCmd)theEObject;
                T result = caseRangedAttackCmd(rangedAttackCmd);
                if (result == null) result = caseOpposedSkillTestCmd(rangedAttackCmd);
                if (result == null) result = caseSkillTestCmd(rangedAttackCmd);
                if (result == null) result = caseProbeCommand(rangedAttackCmd);
                if (result == null) result = caseSubjectCommand(rangedAttackCmd);
                if (result == null) result = caseSuccesTest(rangedAttackCmd);
                if (result == null) result = caseCommand(rangedAttackCmd);
                if (result == null) result = caseProbe(rangedAttackCmd);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.INTERVALL: {
                Intervall intervall = (Intervall)theEObject;
                T result = caseIntervall(intervall);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.PROBE_MOD: {
                ProbeMod probeMod = (ProbeMod)theEObject;
                T result = caseProbeMod(probeMod);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.SET_EXTENDET_DATA: {
                SetExtendetData setExtendetData = (SetExtendetData)theEObject;
                T result = caseSetExtendetData(setExtendetData);
                if (result == null) result = caseCommand(setExtendetData);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.SEMANTIC_ACTION: {
                SemanticAction semanticAction = (SemanticAction)theEObject;
                T result = caseSemanticAction(semanticAction);
                if (result == null) result = caseSubjectCommand(semanticAction);
                if (result == null) result = caseCommand(semanticAction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.DRAIN_COMMAND: {
                DrainCommand drainCommand = (DrainCommand)theEObject;
                T result = caseDrainCommand(drainCommand);
                if (result == null) result = caseProbeCommand(drainCommand);
                if (result == null) result = caseSubjectCommand(drainCommand);
                if (result == null) result = caseSuccesTest(drainCommand);
                if (result == null) result = caseCommand(drainCommand);
                if (result == null) result = caseProbe(drainCommand);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.SPELL_COMMAND: {
                SpellCommand spellCommand = (SpellCommand)theEObject;
                T result = caseSpellCommand(spellCommand);
                if (result == null) result = caseProbeCommand(spellCommand);
                if (result == null) result = caseSubjectCommand(spellCommand);
                if (result == null) result = caseSuccesTest(spellCommand);
                if (result == null) result = caseCommand(spellCommand);
                if (result == null) result = caseProbe(spellCommand);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case GameplayPackage.COMBAT_SPELL_CMD: {
                CombatSpellCmd combatSpellCmd = (CombatSpellCmd)theEObject;
                T result = caseCombatSpellCmd(combatSpellCmd);
                if (result == null) result = caseSpellCommand(combatSpellCmd);
                if (result == null) result = caseProbeCommand(combatSpellCmd);
                if (result == null) result = caseSubjectCommand(combatSpellCmd);
                if (result == null) result = caseSuccesTest(combatSpellCmd);
                if (result == null) result = caseCommand(combatSpellCmd);
                if (result == null) result = caseProbe(combatSpellCmd);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Execution Stack</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Execution Stack</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExecutionStack(ExecutionStack object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Damage Test</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Damage Test</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDamageTest(DamageTest object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Command</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommand(Command object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Subject Command</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Subject Command</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubjectCommand(SubjectCommand object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Skill Test Cmd</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Skill Test Cmd</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSkillTestCmd(SkillTestCmd object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Opposed Skill Test Cmd</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Opposed Skill Test Cmd</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOpposedSkillTestCmd(OpposedSkillTestCmd object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Initative</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Initative</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInitative(Initative object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Execution Protocol</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Execution Protocol</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExecutionProtocol(ExecutionProtocol object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Probe</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Probe</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProbe(Probe object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Probe Command</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Probe Command</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProbeCommand(ProbeCommand object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phase Cmd</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phase Cmd</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhaseCmd(PhaseCmd object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Combat Turn</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Combat Turn</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCombatTurn(CombatTurn object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Succes Test</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Succes Test</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSuccesTest(SuccesTest object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Extendet Skill Test Cmd</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Extendet Skill Test Cmd</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExtendetSkillTestCmd(ExtendetSkillTestCmd object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Defens Test Cmd</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Defens Test Cmd</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDefensTestCmd(DefensTestCmd object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Succes Test Cmd</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Succes Test Cmd</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSuccesTestCmd(SuccesTestCmd object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Initative Pass</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Initative Pass</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInitativePass(InitativePass object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Command Wrapper</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Command Wrapper</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommandWrapper(CommandWrapper object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Complex Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Complex Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComplexAction(ComplexAction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Simple Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimpleAction(SimpleAction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Simple Actions</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple Actions</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimpleActions(SimpleActions object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Free Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Free Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFreeAction(FreeAction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interrupt Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interrupt Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterruptAction(InterruptAction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Set Feature Command</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Set Feature Command</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSetFeatureCommand(SetFeatureCommand object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Meele Attack Cmd</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Meele Attack Cmd</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeeleAttackCmd(MeeleAttackCmd object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ranged Attack Cmd</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ranged Attack Cmd</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRangedAttackCmd(RangedAttackCmd object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Intervall</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Intervall</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntervall(Intervall object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Probe Mod</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Probe Mod</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProbeMod(ProbeMod object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Set Extendet Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Set Extendet Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSetExtendetData(SetExtendetData object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Semantic Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Semantic Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSemanticAction(SemanticAction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Drain Command</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Drain Command</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDrainCommand(DrainCommand object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spell Command</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spell Command</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSpellCommand(SpellCommand object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Combat Spell Cmd</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Combat Spell Cmd</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCombatSpellCmd(CombatSpellCmd object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //GameplaySwitch
