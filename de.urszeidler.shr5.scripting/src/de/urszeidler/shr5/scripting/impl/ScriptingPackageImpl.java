/**
 */
package de.urszeidler.shr5.scripting.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.shr5.scripting.Handout;
import de.urszeidler.shr5.scripting.HandoutType;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.PlacementOptions;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.ScriptHistory;
import de.urszeidler.shr5.scripting.ScriptingFactory;
import de.urszeidler.shr5.scripting.ScriptingPackage;
import de.urszeidler.shr5.scripting.Scripts;
import de.urszeidler.shr5.scripting.Section;
import de.urszeidler.shr5.scripting.TimeFrame;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScriptingPackageImpl extends EPackageImpl implements ScriptingPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scriptEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass placementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timeFrameEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scriptHistoryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scriptsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass handoutEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum placementOptionsEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum handoutTypeEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.urszeidler.shr5.scripting.ScriptingPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ScriptingPackageImpl() {
        super(eNS_URI, ScriptingFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link ScriptingPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ScriptingPackage init() {
        if (isInited) return (ScriptingPackage)EPackage.Registry.INSTANCE.getEPackage(ScriptingPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredScriptingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        ScriptingPackageImpl theScriptingPackage = registeredScriptingPackage instanceof ScriptingPackageImpl ? (ScriptingPackageImpl)registeredScriptingPackage : new ScriptingPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        GameplayPackage.eINSTANCE.eClass();
        RuntimePackage.eINSTANCE.eClass();
        Shr5Package.eINSTANCE.eClass();
        Shr5managementPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theScriptingPackage.createPackageContents();

        // Initialize created meta-data
        theScriptingPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theScriptingPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ScriptingPackage.eNS_URI, theScriptingPackage);
        return theScriptingPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getScript() {
        return scriptEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScript_Placements() {
        return (EReference)scriptEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScript_AllTeams() {
        return (EReference)scriptEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScript_Player() {
        return (EReference)scriptEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScript_Management() {
        return (EReference)scriptEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScript_Entry() {
        return (EReference)scriptEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScript_History() {
        return (EReference)scriptEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPlacement() {
        return placementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPlacement_NextPlacements() {
        return (EReference)placementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPlacement_Teams() {
        return (EReference)placementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPlacement_Background() {
        return (EAttribute)placementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPlacement_InTheirFace() {
        return (EAttribute)placementEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPlacement_Script() {
        return (EReference)placementEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPlacement_Debugging() {
        return (EAttribute)placementEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPlacement_Enviorment() {
        return (EReference)placementEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPlacement_Options() {
        return (EAttribute)placementEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPlacement_Handouts() {
        return (EReference)placementEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPlacement_Sections() {
        return (EReference)placementEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTimeFrame() {
        return timeFrameEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTimeFrame_StartDate() {
        return (EAttribute)timeFrameEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTimeFrame_EndDate() {
        return (EAttribute)timeFrameEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTimeFrame_ActualDate() {
        return (EAttribute)timeFrameEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getScriptHistory() {
        return scriptHistoryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScriptHistory_CommandStack() {
        return (EReference)scriptHistoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScriptHistory_CurrentDate() {
        return (EAttribute)scriptHistoryEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScriptHistory_CurrentPlacement() {
        return (EReference)scriptHistoryEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScriptHistory_WrittenProtokol() {
        return (EAttribute)scriptHistoryEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getScripts() {
        return scriptsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScripts_Stories() {
        return (EReference)scriptsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScripts_Name() {
        return (EAttribute)scriptsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getHandout() {
        return handoutEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHandout_Type() {
        return (EAttribute)handoutEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHandout_Url() {
        return (EAttribute)handoutEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSection() {
        return sectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSection_Titel() {
        return (EAttribute)sectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSection_Text() {
        return (EAttribute)sectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getPlacementOptions() {
        return placementOptionsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getHandoutType() {
        return handoutTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ScriptingFactory getScriptingFactory() {
        return (ScriptingFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        scriptEClass = createEClass(SCRIPT);
        createEReference(scriptEClass, SCRIPT__PLACEMENTS);
        createEReference(scriptEClass, SCRIPT__ALL_TEAMS);
        createEReference(scriptEClass, SCRIPT__PLAYER);
        createEReference(scriptEClass, SCRIPT__MANAGEMENT);
        createEReference(scriptEClass, SCRIPT__ENTRY);
        createEReference(scriptEClass, SCRIPT__HISTORY);

        placementEClass = createEClass(PLACEMENT);
        createEReference(placementEClass, PLACEMENT__NEXT_PLACEMENTS);
        createEReference(placementEClass, PLACEMENT__TEAMS);
        createEAttribute(placementEClass, PLACEMENT__BACKGROUND);
        createEAttribute(placementEClass, PLACEMENT__IN_THEIR_FACE);
        createEReference(placementEClass, PLACEMENT__SCRIPT);
        createEAttribute(placementEClass, PLACEMENT__DEBUGGING);
        createEReference(placementEClass, PLACEMENT__ENVIORMENT);
        createEAttribute(placementEClass, PLACEMENT__OPTIONS);
        createEReference(placementEClass, PLACEMENT__HANDOUTS);
        createEReference(placementEClass, PLACEMENT__SECTIONS);

        timeFrameEClass = createEClass(TIME_FRAME);
        createEAttribute(timeFrameEClass, TIME_FRAME__START_DATE);
        createEAttribute(timeFrameEClass, TIME_FRAME__END_DATE);
        createEAttribute(timeFrameEClass, TIME_FRAME__ACTUAL_DATE);

        scriptHistoryEClass = createEClass(SCRIPT_HISTORY);
        createEReference(scriptHistoryEClass, SCRIPT_HISTORY__COMMAND_STACK);
        createEAttribute(scriptHistoryEClass, SCRIPT_HISTORY__CURRENT_DATE);
        createEReference(scriptHistoryEClass, SCRIPT_HISTORY__CURRENT_PLACEMENT);
        createEAttribute(scriptHistoryEClass, SCRIPT_HISTORY__WRITTEN_PROTOKOL);

        scriptsEClass = createEClass(SCRIPTS);
        createEReference(scriptsEClass, SCRIPTS__STORIES);
        createEAttribute(scriptsEClass, SCRIPTS__NAME);

        handoutEClass = createEClass(HANDOUT);
        createEAttribute(handoutEClass, HANDOUT__TYPE);
        createEAttribute(handoutEClass, HANDOUT__URL);

        sectionEClass = createEClass(SECTION);
        createEAttribute(sectionEClass, SECTION__TITEL);
        createEAttribute(sectionEClass, SECTION__TEXT);

        // Create enums
        placementOptionsEEnum = createEEnum(PLACEMENT_OPTIONS);
        handoutTypeEEnum = createEEnum(HANDOUT_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        Shr5Package theShr5Package = (Shr5Package)EPackage.Registry.INSTANCE.getEPackage(Shr5Package.eNS_URI);
        RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);
        Shr5managementPackage theShr5managementPackage = (Shr5managementPackage)EPackage.Registry.INSTANCE.getEPackage(Shr5managementPackage.eNS_URI);
        GameplayPackage theGameplayPackage = (GameplayPackage)EPackage.Registry.INSTANCE.getEPackage(GameplayPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        scriptEClass.getESuperTypes().add(theShr5Package.getBeschreibbar());
        placementEClass.getESuperTypes().add(theShr5Package.getBeschreibbar());
        placementEClass.getESuperTypes().add(this.getTimeFrame());
        handoutEClass.getESuperTypes().add(theShr5Package.getBeschreibbar());

        // Initialize classes, features, and operations; add parameters
        initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getScript_Placements(), this.getPlacement(), this.getPlacement_Script(), "placements", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getScript_AllTeams(), theRuntimePackage.getTeam(), null, "allTeams", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getScript_Player(), theRuntimePackage.getTeam(), null, "player", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getScript_Management(), theShr5managementPackage.getGamemasterManagement(), null, "management", null, 1, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getScript_Entry(), this.getPlacement(), null, "entry", null, 1, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getScript_History(), this.getScriptHistory(), null, "history", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(placementEClass, Placement.class, "Placement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPlacement_NextPlacements(), this.getPlacement(), null, "nextPlacements", null, 0, -1, Placement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPlacement_Teams(), theRuntimePackage.getTeam(), null, "teams", null, 0, -1, Placement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPlacement_Background(), ecorePackage.getEString(), "background", null, 0, 1, Placement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPlacement_InTheirFace(), ecorePackage.getEString(), "inTheirFace", null, 0, 1, Placement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPlacement_Script(), this.getScript(), this.getScript_Placements(), "script", null, 0, 1, Placement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPlacement_Debugging(), ecorePackage.getEString(), "debugging", null, 0, 1, Placement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPlacement_Enviorment(), theRuntimePackage.getEnviorment(), null, "enviorment", null, 1, 1, Placement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPlacement_Options(), this.getPlacementOptions(), "options", null, 0, 2, Placement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPlacement_Handouts(), this.getHandout(), null, "handouts", null, 0, -1, Placement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPlacement_Sections(), this.getSection(), null, "sections", null, 0, -1, Placement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(timeFrameEClass, TimeFrame.class, "TimeFrame", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTimeFrame_StartDate(), theShr5Package.getShrDate(), "startDate", null, 0, 1, TimeFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTimeFrame_EndDate(), theShr5Package.getShrDate(), "endDate", null, 0, 1, TimeFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTimeFrame_ActualDate(), theShr5Package.getShrDate(), "actualDate", null, 0, 1, TimeFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(scriptHistoryEClass, ScriptHistory.class, "ScriptHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getScriptHistory_CommandStack(), theGameplayPackage.getExecutionStack(), null, "commandStack", null, 0, 1, ScriptHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScriptHistory_CurrentDate(), theShr5Package.getShrDate(), "currentDate", null, 0, 1, ScriptHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getScriptHistory_CurrentPlacement(), this.getPlacement(), null, "currentPlacement", null, 0, 1, ScriptHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScriptHistory_WrittenProtokol(), ecorePackage.getEString(), "writtenProtokol", null, 0, -1, ScriptHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(scriptsEClass, Scripts.class, "Scripts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getScripts_Stories(), this.getScript(), null, "stories", null, 0, -1, Scripts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getScripts_Name(), ecorePackage.getEString(), "name", null, 1, 1, Scripts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(handoutEClass, Handout.class, "Handout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getHandout_Type(), this.getHandoutType(), "type", null, 0, 1, Handout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHandout_Url(), ecorePackage.getEString(), "url", null, 0, 1, Handout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSection_Titel(), ecorePackage.getEString(), "titel", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSection_Text(), ecorePackage.getEString(), "text", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(placementOptionsEEnum, PlacementOptions.class, "PlacementOptions");
        addEEnumLiteral(placementOptionsEEnum, PlacementOptions.COMBAT);
        addEEnumLiteral(placementOptionsEEnum, PlacementOptions.LEG_WORK);
        addEEnumLiteral(placementOptionsEEnum, PlacementOptions.HOME_GROUND);
        addEEnumLiteral(placementOptionsEEnum, PlacementOptions.MATRIX);
        addEEnumLiteral(placementOptionsEEnum, PlacementOptions.ASTRAL_SPACE);
        addEEnumLiteral(placementOptionsEEnum, PlacementOptions.SOCIAL_INTERACTION);

        initEEnum(handoutTypeEEnum, HandoutType.class, "HandoutType");
        addEEnumLiteral(handoutTypeEEnum, HandoutType.WEBPAGE);
        addEEnumLiteral(handoutTypeEEnum, HandoutType.IMAGE);
        addEEnumLiteral(handoutTypeEEnum, HandoutType.DOCUMENT);

        // Create resource
        createResource(eNS_URI);
    }

} //ScriptingPackageImpl
