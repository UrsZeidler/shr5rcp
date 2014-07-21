/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;

import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combat Turn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#getCombatants <em>Combatants</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#getActionPhases <em>Action Phases</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#getCurrentTurn <em>Current Turn</em>}</li>
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void doTurn();

} // CombatTurn
