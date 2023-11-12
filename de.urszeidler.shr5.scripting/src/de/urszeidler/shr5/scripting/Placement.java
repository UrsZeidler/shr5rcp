/**
 */
package de.urszeidler.shr5.scripting;

import org.eclipse.emf.common.util.EList;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.runtime.Enviorment;
import de.urszeidler.eclipse.shr5.runtime.Team;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A placement is a setting or scene.
 * Here can a combat happen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.shr5.scripting.Placement#getNextPlacements <em>Next Placements</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Placement#getTeams <em>Teams</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Placement#getBackground <em>Background</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Placement#getInTheirFace <em>In Their Face</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Placement#getScript <em>Script</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Placement#getDebugging <em>Debugging</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Placement#getEnviorment <em>Enviorment</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Placement#getOptions <em>Options</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Placement#getHandouts <em>Handouts</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.Placement#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.shr5.scripting.ScriptingPackage#getPlacement()
 * @model
 * @generated
 */
public interface Placement extends Beschreibbar, TimeFrame {
    /**
     * Returns the value of the '<em><b>Next Placements</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.shr5.scripting.Placement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Next Placements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The list of availble placements for the scene change.
     * <!-- end-model-doc -->
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
     * <!-- begin-model-doc -->
     * The teams in the placement. Refers a team from the all features.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Teams</em>' reference list.
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getPlacement_Teams()
     * @model
     * @generated
     */
    EList<Team> getTeams();

    /**
     * Returns the value of the '<em><b>Background</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Background</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Background</em>' attribute.
     * @see #setBackground(String)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getPlacement_Background()
     * @model
     * @generated
     */
    String getBackground();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.Placement#getBackground <em>Background</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Background</em>' attribute.
     * @see #getBackground()
     * @generated
     */
    void setBackground(String value);

    /**
     * Returns the value of the '<em><b>In Their Face</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In Their Face</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>In Their Face</em>' attribute.
     * @see #setInTheirFace(String)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getPlacement_InTheirFace()
     * @model
     * @generated
     */
    String getInTheirFace();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.Placement#getInTheirFace <em>In Their Face</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>In Their Face</em>' attribute.
     * @see #getInTheirFace()
     * @generated
     */
    void setInTheirFace(String value);

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
     * Returns the value of the '<em><b>Debugging</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Debugging</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Debugging</em>' attribute.
     * @see #setDebugging(String)
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getPlacement_Debugging()
     * @model
     * @generated
     */
    String getDebugging();

    /**
     * Sets the value of the '{@link de.urszeidler.shr5.scripting.Placement#getDebugging <em>Debugging</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Debugging</em>' attribute.
     * @see #getDebugging()
     * @generated
     */
    void setDebugging(String value);

    /**
     * Returns the value of the '<em><b>Enviorment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enviorment</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The enviorment defines the outer modifications, like light, background count etc
     * <!-- end-model-doc -->
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

    /**
     * Returns the value of the '<em><b>Options</b></em>' attribute list.
     * The list contents are of type {@link de.urszeidler.shr5.scripting.PlacementOptions}.
     * The literals are from the enumeration {@link de.urszeidler.shr5.scripting.PlacementOptions}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The options for this placement, they define the available actions for the placement.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Options</em>' attribute list.
     * @see de.urszeidler.shr5.scripting.PlacementOptions
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getPlacement_Options()
     * @model upper="2"
     * @generated
     */
    EList<PlacementOptions> getOptions();

    /**
     * Returns the value of the '<em><b>Handouts</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.shr5.scripting.Handout}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A list of handouts in this scene.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Handouts</em>' containment reference list.
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getPlacement_Handouts()
     * @model containment="true"
     * @generated
     */
    EList<Handout> getHandouts();

    /**
     * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.shr5.scripting.Section}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sections</em>' containment reference list.
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#getPlacement_Sections()
     * @model containment="true"
     * @generated
     */
    EList<Section> getSections();

} // Placement
