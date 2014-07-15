/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.util;

import de.urszeidler.eclipse.shr5.gameplay.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage
 * @generated
 */
public class GameplayAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static GameplayPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GameplayAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = GameplayPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GameplaySwitch<Adapter> modelSwitch =
        new GameplaySwitch<Adapter>() {
            @Override
            public Adapter caseExecutionStack(ExecutionStack object) {
                return createExecutionStackAdapter();
            }
            @Override
            public Adapter caseDamageTest(DamageTest object) {
                return createDamageTestAdapter();
            }
            @Override
            public Adapter caseCommand(Command object) {
                return createCommandAdapter();
            }
            @Override
            public Adapter caseSubjectCommand(SubjectCommand object) {
                return createSubjectCommandAdapter();
            }
            @Override
            public Adapter caseSkillTestCmd(SkillTestCmd object) {
                return createSkillTestCmdAdapter();
            }
            @Override
            public Adapter caseOpposedSkillTestCmd(OpposedSkillTestCmd object) {
                return createOpposedSkillTestCmdAdapter();
            }
            @Override
            public Adapter caseInitative(Initative object) {
                return createInitativeAdapter();
            }
            @Override
            public Adapter caseExecutionProtocol(ExecutionProtocol object) {
                return createExecutionProtocolAdapter();
            }
            @Override
            public Adapter caseProbe(Probe object) {
                return createProbeAdapter();
            }
            @Override
            public Adapter caseProbeCommand(ProbeCommand object) {
                return createProbeCommandAdapter();
            }
            @Override
            public Adapter casePhaseCmd(PhaseCmd object) {
                return createPhaseCmdAdapter();
            }
            @Override
            public Adapter caseCombatTurn(CombatTurn object) {
                return createCombatTurnAdapter();
            }
            @Override
            public Adapter caseSuccesTest(SuccesTest object) {
                return createSuccesTestAdapter();
            }
            @Override
            public Adapter caseExtendetSkillTestCmd(ExtendetSkillTestCmd object) {
                return createExtendetSkillTestCmdAdapter();
            }
            @Override
            public Adapter caseDefensTestCmd(DefensTestCmd object) {
                return createDefensTestCmdAdapter();
            }
            @Override
            public Adapter caseSuccesTestCmd(SuccesTestCmd object) {
                return createSuccesTestCmdAdapter();
            }
            @Override
            public Adapter caseActionPhaseCmd(ActionPhaseCmd object) {
                return createActionPhaseCmdAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.gameplay.ExecutionStack <em>Execution Stack</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.gameplay.ExecutionStack
     * @generated
     */
    public Adapter createExecutionStackAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.gameplay.DamageTest <em>Damage Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.gameplay.DamageTest
     * @generated
     */
    public Adapter createDamageTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.gameplay.Command <em>Command</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.gameplay.Command
     * @generated
     */
    public Adapter createCommandAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.gameplay.SubjectCommand <em>Subject Command</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.gameplay.SubjectCommand
     * @generated
     */
    public Adapter createSubjectCommandAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd <em>Skill Test Cmd</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd
     * @generated
     */
    public Adapter createSkillTestCmdAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd <em>Opposed Skill Test Cmd</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd
     * @generated
     */
    public Adapter createOpposedSkillTestCmdAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.gameplay.Initative <em>Initative</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.gameplay.Initative
     * @generated
     */
    public Adapter createInitativeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.gameplay.ExecutionProtocol <em>Execution Protocol</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.gameplay.ExecutionProtocol
     * @generated
     */
    public Adapter createExecutionProtocolAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.gameplay.Probe <em>Probe</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.gameplay.Probe
     * @generated
     */
    public Adapter createProbeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.gameplay.ProbeCommand <em>Probe Command</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.gameplay.ProbeCommand
     * @generated
     */
    public Adapter createProbeCommandAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.gameplay.PhaseCmd <em>Phase Cmd</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.gameplay.PhaseCmd
     * @generated
     */
    public Adapter createPhaseCmdAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn <em>Combat Turn</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.gameplay.CombatTurn
     * @generated
     */
    public Adapter createCombatTurnAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTest <em>Succes Test</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.gameplay.SuccesTest
     * @generated
     */
    public Adapter createSuccesTestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd <em>Extendet Skill Test Cmd</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd
     * @generated
     */
    public Adapter createExtendetSkillTestCmdAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd <em>Defens Test Cmd</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd
     * @generated
     */
    public Adapter createDefensTestCmdAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd <em>Succes Test Cmd</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd
     * @generated
     */
    public Adapter createSuccesTestCmdAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.gameplay.ActionPhaseCmd <em>Action Phase Cmd</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.gameplay.ActionPhaseCmd
     * @generated
     */
    public Adapter createActionPhaseCmdAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //GameplayAdapterFactory
