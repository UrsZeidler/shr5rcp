/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;

import org.eclipse.emf.common.util.EList;

import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combat Turn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One combat turn.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#getCombatants <em>Combatants</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#getActionPhases <em>Action Phases</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#getCurrentTurn <em>Current Turn</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getCombatTurn()
 * @model
 * @generated
 */
public interface CombatTurn extends Command {
    /**
     * Returns the value of the '<em><b>Combatants</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Combatants</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Combatants</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getCombatTurn_Combatants()
     * @model
     * @generated
     */
    EList<RuntimeCharacter> getCombatants();

    /**
     * Returns the value of the '<em><b>Action Phases</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.gameplay.InitativePass}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Action Phases</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Action Phases</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getCombatTurn_ActionPhases()
     * @model containment="true"
     * @generated
     */
    EList<InitativePass> getActionPhases();

    /**
     * Returns the value of the '<em><b>Current Turn</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Turn</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current Turn</em>' reference.
     * @see #setCurrentTurn(InitativePass)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getCombatTurn_CurrentTurn()
     * @model
     * @generated
     */
    InitativePass getCurrentTurn();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#getCurrentTurn <em>Current Turn</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current Turn</em>' reference.
     * @see #getCurrentTurn()
     * @generated
     */
    void setCurrentTurn(InitativePass value);

    /**
     * Returns the value of the '<em><b>Sequence</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sequence</em>' attribute.
     * @see #setSequence(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getCombatTurn_Sequence()
     * @model
     * @generated
     */
    int getSequence();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#getSequence <em>Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sequence</em>' attribute.
     * @see #getSequence()
     * @generated
     */
    void setSequence(int value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void doTurn();

} // CombatTurn
