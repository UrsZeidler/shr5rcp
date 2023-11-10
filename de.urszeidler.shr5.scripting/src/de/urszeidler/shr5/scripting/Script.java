/**
 */
package de.urszeidler.shr5.scripting;

import org.eclipse.emf.common.util.EList;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.runtime.Team;
import de.urszeidler.eclipse.shr5Management.GamemasterManagement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The script is made of a set of placements.
 * It contains all needed to play an adventure.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.shr5.scripting.Script#getPlacements <em>Placements</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Script#getAllTeams <em>All Teams</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Script#getPlayer <em>Player</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Script#getManagement <em>Management</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Script#getEntry <em>Entry</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Script#getHistory <em>History</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.shr5.scripting.ScriptingPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends Beschreibbar {
    /**
     * Returns the value of the '<em><b>Placements</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.shr5.scripting.Placement}.
     * It is bidirectional and its opposite is '{@link de.urszeidler.shr5.scripting.Placement#getScript <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Placements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * All the placements/scence in the script.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Placements</em>' containment reference list.
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getScript_Placements()
     * @see de.urszeidler.shr5.scripting.Placement#getScript
     * @model opposite="script" containment="true"
     * @generated
     */
    EList<Placement> getPlacements();

    /**
     * Returns the value of the '<em><b>All Teams</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.runtime.Team}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>All Teams</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * All he teams of the complete script. They are contained here and referd in the placements.
     * <!-- end-model-doc -->
     * @return the value of the '<em>All Teams</em>' containment reference list.
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getScript_AllTeams()
     * @model containment="true"
     * @generated
     */
    EList<Team> getAllTeams();

    /**
     * Returns the value of the '<em><b>Player</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Player</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Player</em>' containment reference.
     * @see #setPlayer(Team)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getScript_Player()
     * @model containment="true"
     * @generated
     */
    Team getPlayer();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.Script#getPlayer <em>Player</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Player</em>' containment reference.
     * @see #getPlayer()
     * @generated
     */
    void setPlayer(Team value);

    /**
     * Returns the value of the '<em><b>Management</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Management</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Here the characters only in the scrip exist, can be stored.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Management</em>' containment reference.
     * @see #setManagement(GamemasterManagement)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getScript_Management()
     * @model containment="true" required="true"
     * @generated
     */
    GamemasterManagement getManagement();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.Script#getManagement <em>Management</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Management</em>' containment reference.
     * @see #getManagement()
     * @generated
     */
    void setManagement(GamemasterManagement value);

    /**
     * Returns the value of the '<em><b>Entry</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entry</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The entry point for the script.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Entry</em>' reference.
     * @see #setEntry(Placement)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getScript_Entry()
     * @model required="true"
     * @generated
     */
    Placement getEntry();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.Script#getEntry <em>Entry</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entry</em>' reference.
     * @see #getEntry()
     * @generated
     */
    void setEntry(Placement value);

    /**
     * Returns the value of the '<em><b>History</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>History</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The basic history when playing the script.
     * <!-- end-model-doc -->
     * @return the value of the '<em>History</em>' containment reference.
     * @see #setHistory(ScriptHistory)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getScript_History()
     * @model containment="true"
     * @generated
     */
    ScriptHistory getHistory();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.Script#getHistory <em>History</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>History</em>' containment reference.
     * @see #getHistory()
     * @generated
     */
    void setHistory(ScriptHistory value);

} // Script
