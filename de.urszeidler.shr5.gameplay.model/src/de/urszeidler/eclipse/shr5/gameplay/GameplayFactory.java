/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage
 * @generated
 */
public interface GameplayFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    GameplayFactory eINSTANCE = de.urszeidler.eclipse.shr5.gameplay.impl.GameplayFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Execution Stack</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Execution Stack</em>'.
     * @generated
     */
    ExecutionStack createExecutionStack();

    /**
     * Returns a new object of class '<em>Damage Test</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Damage Test</em>'.
     * @generated
     */
    DamageTest createDamageTest();

    /**
     * Returns a new object of class '<em>Subject Command</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Subject Command</em>'.
     * @generated
     */
    SubjectCommand createSubjectCommand();

    /**
     * Returns a new object of class '<em>Skill Test Cmd</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Skill Test Cmd</em>'.
     * @generated
     */
    SkillTestCmd createSkillTestCmd();

    /**
     * Returns a new object of class '<em>Opposed Skill Test Cmd</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Opposed Skill Test Cmd</em>'.
     * @generated
     */
    OpposedSkillTestCmd createOpposedSkillTestCmd();

    /**
     * Returns a new object of class '<em>Initative</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Initative</em>'.
     * @generated
     */
    Initative createInitative();

    /**
     * Returns a new object of class '<em>Execution Protocol</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Execution Protocol</em>'.
     * @generated
     */
    ExecutionProtocol createExecutionProtocol();

    /**
     * Returns a new object of class '<em>Combat Turn</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Combat Turn</em>'.
     * @generated
     */
    CombatTurn createCombatTurn();

    /**
     * Returns a new object of class '<em>Extendet Skill Test Cmd</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Extendet Skill Test Cmd</em>'.
     * @generated
     */
    ExtendetSkillTestCmd createExtendetSkillTestCmd();

    /**
     * Returns a new object of class '<em>Defens Test Cmd</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Defens Test Cmd</em>'.
     * @generated
     */
    DefensTestCmd createDefensTestCmd();

    /**
     * Returns a new object of class '<em>Succes Test Cmd</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Succes Test Cmd</em>'.
     * @generated
     */
    SuccesTestCmd createSuccesTestCmd();

    /**
     * Returns a new object of class '<em>Action Phase Cmd</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action Phase Cmd</em>'.
     * @generated
     */
    ActionPhaseCmd createActionPhaseCmd();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    GameplayPackage getGameplayPackage();

} //GameplayFactory