/**
 */
package de.urszeidler.shr5.scripting;

import de.urszeidler.eclipse.shr5.Shr5Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.urszeidler.shr5.scripting.ScriptingFactory
 * @model kind="package"
 * @generated
 */
public interface ScriptingPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "scripting";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://shr.scripting/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "scripting";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ScriptingPackage eINSTANCE = de.urszeidler.shr5.scripting.impl.ScriptingPackageImpl.init();

    /**
     * The meta object id for the '{@link de.urszeidler.shr5.scripting.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.shr5.scripting.impl.ScriptImpl
     * @see de.urszeidler.shr5.scripting.impl.ScriptingPackageImpl#getScript()
     * @generated
     */
    int SCRIPT = 0;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT__BESCHREIBUNG = Shr5Package.BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT__IMAGE = Shr5Package.BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT__NAME = Shr5Package.BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Placements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT__PLACEMENTS = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>All Teams</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT__ALL_TEAMS = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Player</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT__PLAYER = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Management</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT__MANAGEMENT = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Entry</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT__ENTRY = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>History</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT__HISTORY = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Script</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_FEATURE_COUNT = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Script</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_OPERATION_COUNT = Shr5Package.BESCHREIBBAR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.urszeidler.shr5.scripting.impl.PlacementImpl <em>Placement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.shr5.scripting.impl.PlacementImpl
     * @see de.urszeidler.shr5.scripting.impl.ScriptingPackageImpl#getPlacement()
     * @generated
     */
    int PLACEMENT = 1;

    /**
     * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEMENT__BESCHREIBUNG = Shr5Package.BESCHREIBBAR__BESCHREIBUNG;

    /**
     * The feature id for the '<em><b>Image</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEMENT__IMAGE = Shr5Package.BESCHREIBBAR__IMAGE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEMENT__NAME = Shr5Package.BESCHREIBBAR__NAME;

    /**
     * The feature id for the '<em><b>Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEMENT__START_DATE = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>End Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEMENT__END_DATE = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Actual Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEMENT__ACTUAL_DATE = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Next Placements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEMENT__NEXT_PLACEMENTS = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Teams</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEMENT__TEAMS = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Background</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEMENT__BACKGROUND = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>In Their Face</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEMENT__IN_THEIR_FACE = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Script</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEMENT__SCRIPT = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Debugging</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEMENT__DEBUGGING = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Enviorment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEMENT__ENVIORMENT = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Placement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEMENT_FEATURE_COUNT = Shr5Package.BESCHREIBBAR_FEATURE_COUNT + 10;

    /**
     * The number of operations of the '<em>Placement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEMENT_OPERATION_COUNT = Shr5Package.BESCHREIBBAR_OPERATION_COUNT + 0;


    /**
     * The meta object id for the '{@link de.urszeidler.shr5.scripting.TimeFrame <em>Time Frame</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.shr5.scripting.TimeFrame
     * @see de.urszeidler.shr5.scripting.impl.ScriptingPackageImpl#getTimeFrame()
     * @generated
     */
    int TIME_FRAME = 2;

    /**
     * The feature id for the '<em><b>Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_FRAME__START_DATE = 0;

    /**
     * The feature id for the '<em><b>End Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_FRAME__END_DATE = 1;

    /**
     * The feature id for the '<em><b>Actual Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_FRAME__ACTUAL_DATE = 2;

    /**
     * The number of structural features of the '<em>Time Frame</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_FRAME_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Time Frame</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_FRAME_OPERATION_COUNT = 0;


    /**
     * The meta object id for the '{@link de.urszeidler.shr5.scripting.impl.ScriptHistoryImpl <em>Script History</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.shr5.scripting.impl.ScriptHistoryImpl
     * @see de.urszeidler.shr5.scripting.impl.ScriptingPackageImpl#getScriptHistory()
     * @generated
     */
    int SCRIPT_HISTORY = 3;

    /**
     * The feature id for the '<em><b>Command Stack</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_HISTORY__COMMAND_STACK = 0;

    /**
     * The feature id for the '<em><b>Current Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_HISTORY__CURRENT_DATE = 1;

    /**
     * The feature id for the '<em><b>Current Placement</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_HISTORY__CURRENT_PLACEMENT = 2;

    /**
     * The feature id for the '<em><b>Written Protokol</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_HISTORY__WRITTEN_PROTOKOL = 3;

    /**
     * The number of structural features of the '<em>Script History</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_HISTORY_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Script History</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPT_HISTORY_OPERATION_COUNT = 0;


    /**
     * The meta object id for the '{@link de.urszeidler.shr5.scripting.impl.ScriptsImpl <em>Scripts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.shr5.scripting.impl.ScriptsImpl
     * @see de.urszeidler.shr5.scripting.impl.ScriptingPackageImpl#getScripts()
     * @generated
     */
    int SCRIPTS = 4;

    /**
     * The feature id for the '<em><b>Stories</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPTS__STORIES = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPTS__NAME = 1;

    /**
     * The number of structural features of the '<em>Scripts</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPTS_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Scripts</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCRIPTS_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link de.urszeidler.shr5.scripting.Script <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Script</em>'.
     * @see de.urszeidler.shr5.scripting.Script
     * @generated
     */
    EClass getScript();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.shr5.scripting.Script#getPlacements <em>Placements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Placements</em>'.
     * @see de.urszeidler.shr5.scripting.Script#getPlacements()
     * @see #getScript()
     * @generated
     */
    EReference getScript_Placements();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.shr5.scripting.Script#getAllTeams <em>All Teams</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>All Teams</em>'.
     * @see de.urszeidler.shr5.scripting.Script#getAllTeams()
     * @see #getScript()
     * @generated
     */
    EReference getScript_AllTeams();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.shr5.scripting.Script#getPlayer <em>Player</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Player</em>'.
     * @see de.urszeidler.shr5.scripting.Script#getPlayer()
     * @see #getScript()
     * @generated
     */
    EReference getScript_Player();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.shr5.scripting.Script#getManagement <em>Management</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Management</em>'.
     * @see de.urszeidler.shr5.scripting.Script#getManagement()
     * @see #getScript()
     * @generated
     */
    EReference getScript_Management();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.shr5.scripting.Script#getEntry <em>Entry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entry</em>'.
     * @see de.urszeidler.shr5.scripting.Script#getEntry()
     * @see #getScript()
     * @generated
     */
    EReference getScript_Entry();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.shr5.scripting.Script#getHistory <em>History</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>History</em>'.
     * @see de.urszeidler.shr5.scripting.Script#getHistory()
     * @see #getScript()
     * @generated
     */
    EReference getScript_History();

    /**
     * Returns the meta object for class '{@link de.urszeidler.shr5.scripting.Placement <em>Placement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Placement</em>'.
     * @see de.urszeidler.shr5.scripting.Placement
     * @generated
     */
    EClass getPlacement();

    /**
     * Returns the meta object for the reference list '{@link de.urszeidler.shr5.scripting.Placement#getNextPlacements <em>Next Placements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Next Placements</em>'.
     * @see de.urszeidler.shr5.scripting.Placement#getNextPlacements()
     * @see #getPlacement()
     * @generated
     */
    EReference getPlacement_NextPlacements();

    /**
     * Returns the meta object for the reference list '{@link de.urszeidler.shr5.scripting.Placement#getTeams <em>Teams</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Teams</em>'.
     * @see de.urszeidler.shr5.scripting.Placement#getTeams()
     * @see #getPlacement()
     * @generated
     */
    EReference getPlacement_Teams();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.shr5.scripting.Placement#getBackground <em>Background</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Background</em>'.
     * @see de.urszeidler.shr5.scripting.Placement#getBackground()
     * @see #getPlacement()
     * @generated
     */
    EAttribute getPlacement_Background();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.shr5.scripting.Placement#getInTheirFace <em>In Their Face</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>In Their Face</em>'.
     * @see de.urszeidler.shr5.scripting.Placement#getInTheirFace()
     * @see #getPlacement()
     * @generated
     */
    EAttribute getPlacement_InTheirFace();

    /**
     * Returns the meta object for the container reference '{@link de.urszeidler.shr5.scripting.Placement#getScript <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Script</em>'.
     * @see de.urszeidler.shr5.scripting.Placement#getScript()
     * @see #getPlacement()
     * @generated
     */
    EReference getPlacement_Script();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.shr5.scripting.Placement#getDebugging <em>Debugging</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Debugging</em>'.
     * @see de.urszeidler.shr5.scripting.Placement#getDebugging()
     * @see #getPlacement()
     * @generated
     */
    EAttribute getPlacement_Debugging();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.shr5.scripting.Placement#getEnviorment <em>Enviorment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Enviorment</em>'.
     * @see de.urszeidler.shr5.scripting.Placement#getEnviorment()
     * @see #getPlacement()
     * @generated
     */
    EReference getPlacement_Enviorment();

    /**
     * Returns the meta object for class '{@link de.urszeidler.shr5.scripting.TimeFrame <em>Time Frame</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Time Frame</em>'.
     * @see de.urszeidler.shr5.scripting.TimeFrame
     * @generated
     */
    EClass getTimeFrame();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.shr5.scripting.TimeFrame#getStartDate <em>Start Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Start Date</em>'.
     * @see de.urszeidler.shr5.scripting.TimeFrame#getStartDate()
     * @see #getTimeFrame()
     * @generated
     */
    EAttribute getTimeFrame_StartDate();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.shr5.scripting.TimeFrame#getEndDate <em>End Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>End Date</em>'.
     * @see de.urszeidler.shr5.scripting.TimeFrame#getEndDate()
     * @see #getTimeFrame()
     * @generated
     */
    EAttribute getTimeFrame_EndDate();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.shr5.scripting.TimeFrame#getActualDate <em>Actual Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Actual Date</em>'.
     * @see de.urszeidler.shr5.scripting.TimeFrame#getActualDate()
     * @see #getTimeFrame()
     * @generated
     */
    EAttribute getTimeFrame_ActualDate();

    /**
     * Returns the meta object for class '{@link de.urszeidler.shr5.scripting.ScriptHistory <em>Script History</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Script History</em>'.
     * @see de.urszeidler.shr5.scripting.ScriptHistory
     * @generated
     */
    EClass getScriptHistory();

    /**
     * Returns the meta object for the containment reference '{@link de.urszeidler.shr5.scripting.ScriptHistory#getCommandStack <em>Command Stack</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Command Stack</em>'.
     * @see de.urszeidler.shr5.scripting.ScriptHistory#getCommandStack()
     * @see #getScriptHistory()
     * @generated
     */
    EReference getScriptHistory_CommandStack();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.shr5.scripting.ScriptHistory#getCurrentDate <em>Current Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Current Date</em>'.
     * @see de.urszeidler.shr5.scripting.ScriptHistory#getCurrentDate()
     * @see #getScriptHistory()
     * @generated
     */
    EAttribute getScriptHistory_CurrentDate();

    /**
     * Returns the meta object for the reference '{@link de.urszeidler.shr5.scripting.ScriptHistory#getCurrentPlacement <em>Current Placement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Current Placement</em>'.
     * @see de.urszeidler.shr5.scripting.ScriptHistory#getCurrentPlacement()
     * @see #getScriptHistory()
     * @generated
     */
    EReference getScriptHistory_CurrentPlacement();

    /**
     * Returns the meta object for the attribute list '{@link de.urszeidler.shr5.scripting.ScriptHistory#getWrittenProtokol <em>Written Protokol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Written Protokol</em>'.
     * @see de.urszeidler.shr5.scripting.ScriptHistory#getWrittenProtokol()
     * @see #getScriptHistory()
     * @generated
     */
    EAttribute getScriptHistory_WrittenProtokol();

    /**
     * Returns the meta object for class '{@link de.urszeidler.shr5.scripting.Scripts <em>Scripts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scripts</em>'.
     * @see de.urszeidler.shr5.scripting.Scripts
     * @generated
     */
    EClass getScripts();

    /**
     * Returns the meta object for the containment reference list '{@link de.urszeidler.shr5.scripting.Scripts#getStories <em>Stories</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Stories</em>'.
     * @see de.urszeidler.shr5.scripting.Scripts#getStories()
     * @see #getScripts()
     * @generated
     */
    EReference getScripts_Stories();

    /**
     * Returns the meta object for the attribute '{@link de.urszeidler.shr5.scripting.Scripts#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.urszeidler.shr5.scripting.Scripts#getName()
     * @see #getScripts()
     * @generated
     */
    EAttribute getScripts_Name();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ScriptingFactory getScriptingFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.urszeidler.shr5.scripting.impl.ScriptImpl <em>Script</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.shr5.scripting.impl.ScriptImpl
         * @see de.urszeidler.shr5.scripting.impl.ScriptingPackageImpl#getScript()
         * @generated
         */
        EClass SCRIPT = eINSTANCE.getScript();

        /**
         * The meta object literal for the '<em><b>Placements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCRIPT__PLACEMENTS = eINSTANCE.getScript_Placements();

        /**
         * The meta object literal for the '<em><b>All Teams</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCRIPT__ALL_TEAMS = eINSTANCE.getScript_AllTeams();

        /**
         * The meta object literal for the '<em><b>Player</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCRIPT__PLAYER = eINSTANCE.getScript_Player();

        /**
         * The meta object literal for the '<em><b>Management</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCRIPT__MANAGEMENT = eINSTANCE.getScript_Management();

        /**
         * The meta object literal for the '<em><b>Entry</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCRIPT__ENTRY = eINSTANCE.getScript_Entry();

        /**
         * The meta object literal for the '<em><b>History</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCRIPT__HISTORY = eINSTANCE.getScript_History();

        /**
         * The meta object literal for the '{@link de.urszeidler.shr5.scripting.impl.PlacementImpl <em>Placement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.shr5.scripting.impl.PlacementImpl
         * @see de.urszeidler.shr5.scripting.impl.ScriptingPackageImpl#getPlacement()
         * @generated
         */
        EClass PLACEMENT = eINSTANCE.getPlacement();

        /**
         * The meta object literal for the '<em><b>Next Placements</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PLACEMENT__NEXT_PLACEMENTS = eINSTANCE.getPlacement_NextPlacements();

        /**
         * The meta object literal for the '<em><b>Teams</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PLACEMENT__TEAMS = eINSTANCE.getPlacement_Teams();

        /**
         * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PLACEMENT__BACKGROUND = eINSTANCE.getPlacement_Background();

        /**
         * The meta object literal for the '<em><b>In Their Face</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PLACEMENT__IN_THEIR_FACE = eINSTANCE.getPlacement_InTheirFace();

        /**
         * The meta object literal for the '<em><b>Script</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PLACEMENT__SCRIPT = eINSTANCE.getPlacement_Script();

        /**
         * The meta object literal for the '<em><b>Debugging</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PLACEMENT__DEBUGGING = eINSTANCE.getPlacement_Debugging();

        /**
         * The meta object literal for the '<em><b>Enviorment</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PLACEMENT__ENVIORMENT = eINSTANCE.getPlacement_Enviorment();

        /**
         * The meta object literal for the '{@link de.urszeidler.shr5.scripting.TimeFrame <em>Time Frame</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.shr5.scripting.TimeFrame
         * @see de.urszeidler.shr5.scripting.impl.ScriptingPackageImpl#getTimeFrame()
         * @generated
         */
        EClass TIME_FRAME = eINSTANCE.getTimeFrame();

        /**
         * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIME_FRAME__START_DATE = eINSTANCE.getTimeFrame_StartDate();

        /**
         * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIME_FRAME__END_DATE = eINSTANCE.getTimeFrame_EndDate();

        /**
         * The meta object literal for the '<em><b>Actual Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TIME_FRAME__ACTUAL_DATE = eINSTANCE.getTimeFrame_ActualDate();

        /**
         * The meta object literal for the '{@link de.urszeidler.shr5.scripting.impl.ScriptHistoryImpl <em>Script History</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.shr5.scripting.impl.ScriptHistoryImpl
         * @see de.urszeidler.shr5.scripting.impl.ScriptingPackageImpl#getScriptHistory()
         * @generated
         */
        EClass SCRIPT_HISTORY = eINSTANCE.getScriptHistory();

        /**
         * The meta object literal for the '<em><b>Command Stack</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCRIPT_HISTORY__COMMAND_STACK = eINSTANCE.getScriptHistory_CommandStack();

        /**
         * The meta object literal for the '<em><b>Current Date</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_HISTORY__CURRENT_DATE = eINSTANCE.getScriptHistory_CurrentDate();

        /**
         * The meta object literal for the '<em><b>Current Placement</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCRIPT_HISTORY__CURRENT_PLACEMENT = eINSTANCE.getScriptHistory_CurrentPlacement();

        /**
         * The meta object literal for the '<em><b>Written Protokol</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPT_HISTORY__WRITTEN_PROTOKOL = eINSTANCE.getScriptHistory_WrittenProtokol();

        /**
         * The meta object literal for the '{@link de.urszeidler.shr5.scripting.impl.ScriptsImpl <em>Scripts</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.urszeidler.shr5.scripting.impl.ScriptsImpl
         * @see de.urszeidler.shr5.scripting.impl.ScriptingPackageImpl#getScripts()
         * @generated
         */
        EClass SCRIPTS = eINSTANCE.getScripts();

        /**
         * The meta object literal for the '<em><b>Stories</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCRIPTS__STORIES = eINSTANCE.getScripts_Stories();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCRIPTS__NAME = eINSTANCE.getScripts_Name();

    }

} //ScriptingPackage
