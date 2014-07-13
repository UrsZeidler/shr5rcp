/**
 */
package de.urszeidler.shr5.scripting;

import de.urszeidler.eclipse.shr5.Beschreibbar;

import de.urszeidler.eclipse.shr5.runtime.Enviorment;
import de.urszeidler.eclipse.shr5.runtime.Team;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.shr5.scripting.Placement#getNextPlacements <em>Next Placements</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Placement#getTeams <em>Teams</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Placement#getBackground <em>Background</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Placement#getInTheirFace <em>In Their Face</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Placement#getScript <em>Script</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Placement#getDebugging <em>Debugging</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Placement#getEnviorment <em>Enviorment</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.shr5.scripting.ScriptingPackage#getPlacement()
 * @model
 * @generated
 */
public interface Placement extends Beschreibbar {
    /**
     * Returns the value of the '<em><b>Next Placements</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.shr5.scripting.Placement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Next Placements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Next Placements</em>' reference list.
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getPlacement_NextPlacements()
     * @model
     * @generated
     */
    EList<Placement> getNextPlacements();

    /**
     * Returns the value of the '<em><b>Teams</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.runtime.Team}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Teams</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Teams</em>' reference list.
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getPlacement_Teams()
     * @model
     * @generated
     */
    EList<Team> getTeams();

    /**
     * Returns the value of the '<em><b>Background</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Background</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Background</em>' attribute list.
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getPlacement_Background()
     * @model
     * @generated
     */
    EList<String> getBackground();

    /**
     * Returns the value of the '<em><b>In Their Face</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In Their Face</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>In Their Face</em>' attribute list.
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getPlacement_InTheirFace()
     * @model
     * @generated
     */
    EList<String> getInTheirFace();

    /**
     * Returns the value of the '<em><b>Script</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.urszeidler.shr5.scripting.Script#getPlacements <em>Placements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Script</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Script</em>' container reference.
     * @see #setScript(Script)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getPlacement_Script()
     * @see de.urszeidler.shr5.scripting.Script#getPlacements
     * @model opposite="placements" transient="false"
     * @generated
     */
    Script getScript();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.Placement#getScript <em>Script</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Script</em>' container reference.
     * @see #getScript()
     * @generated
     */
    void setScript(Script value);

    /**
     * Returns the value of the '<em><b>Debugging</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Debugging</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Debugging</em>' attribute list.
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getPlacement_Debugging()
     * @model
     * @generated
     */
    EList<String> getDebugging();

    /**
     * Returns the value of the '<em><b>Enviorment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enviorment</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enviorment</em>' containment reference.
     * @see #setEnviorment(Enviorment)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getPlacement_Enviorment()
     * @model containment="true" required="true"
     * @generated
     */
    Enviorment getEnviorment();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.Placement#getEnviorment <em>Enviorment</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enviorment</em>' containment reference.
     * @see #getEnviorment()
     * @generated
     */
    void setEnviorment(Enviorment value);

} // Placement
