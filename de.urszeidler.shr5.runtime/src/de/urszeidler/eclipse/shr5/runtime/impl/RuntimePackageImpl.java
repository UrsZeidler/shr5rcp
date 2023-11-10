/**
 */
package de.urszeidler.eclipse.shr5.runtime.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.runtime.AbstractExtendetDataAware;
import de.urszeidler.eclipse.shr5.runtime.Cyberdeck;
import de.urszeidler.eclipse.shr5.runtime.Drone;
import de.urszeidler.eclipse.shr5.runtime.Enviorment;
import de.urszeidler.eclipse.shr5.runtime.ExtendetData;
import de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware;
import de.urszeidler.eclipse.shr5.runtime.GruntRuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.GruntTeam;
import de.urszeidler.eclipse.shr5.runtime.MatrixDevice;
import de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen;
import de.urszeidler.eclipse.shr5.runtime.PhyicalState;
import de.urszeidler.eclipse.shr5.runtime.RiggerConsole;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5.runtime.Team;
import de.urszeidler.eclipse.shr5.runtime.Vehicle;
import de.urszeidler.eclipse.shr5.runtime.Zustand;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimePackageImpl extends EPackageImpl implements RuntimePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extendetDataEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enviormentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nahkampModifikationenEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extendetDataAwareEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass phyicalStateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass runtimeCharacterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass teamEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractExtendetDataAwareEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gruntTeamEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gruntRuntimeCharacterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass vehicleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass droneEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass matrixDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass riggerConsoleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cyberdeckEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum zustandEEnum = null;

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
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private RuntimePackageImpl() {
        super(eNS_URI, RuntimeFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link RuntimePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static RuntimePackage init() {
        if (isInited) return (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

        // Obtain or create and register package
        Object registeredRuntimePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        RuntimePackageImpl theRuntimePackage = registeredRuntimePackage instanceof RuntimePackageImpl ? (RuntimePackageImpl)registeredRuntimePackage : new RuntimePackageImpl();

        isInited = true;

        // Initialize simple dependencies
        Shr5Package.eINSTANCE.eClass();
        Shr5managementPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theRuntimePackage.createPackageContents();

        // Initialize created meta-data
        theRuntimePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theRuntimePackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(RuntimePackage.eNS_URI, theRuntimePackage);
        return theRuntimePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExtendetData() {
        return extendetDataEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExtendetData_EObject() {
        return (EReference)extendetDataEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExtendetData_EFeature() {
        return (EReference)extendetDataEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEnviorment() {
        return enviormentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNahkampModifikationen() {
        return nahkampModifikationenEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNahkampModifikationen_ChracterIsDown() {
        return (EAttribute)nahkampModifikationenEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNahkampModifikationen_EnemyCloseCombat() {
        return (EAttribute)nahkampModifikationenEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNahkampModifikationen_CharacterRunning() {
        return (EAttribute)nahkampModifikationenEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNahkampModifikationen_CharacterProne() {
        return (EAttribute)nahkampModifikationenEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExtendetDataAware() {
        return extendetDataAwareEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtendetDataAware_ExtendetData() {
        return (EAttribute)extendetDataAwareEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getExtendetDataAware__AddToExtendetData__ExtendetData_Object() {
        return extendetDataAwareEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getExtendetDataAware__GetIntegerValue__ExtendetData() {
        return extendetDataAwareEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getExtendetDataAware__IncreaseValue__ExtendetData_int() {
        return extendetDataAwareEClass.getEOperations().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getExtendetDataAware__DecreaseValue__ExtendetData_int() {
        return extendetDataAwareEClass.getEOperations().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getExtendetDataAware__HasValue__ExtendetData() {
        return extendetDataAwareEClass.getEOperations().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getExtendetDataAware__AddToList__ExtendetData_Object() {
        return extendetDataAwareEClass.getEOperations().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getExtendetDataAware__AddUniqueToList__ExtendetData_Object() {
        return extendetDataAwareEClass.getEOperations().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getExtendetDataAware__GetListValue__ExtendetData() {
        return extendetDataAwareEClass.getEOperations().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPhyicalState() {
        return phyicalStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPhyicalState_PhysicalDamage() {
        return (EAttribute)phyicalStateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPhyicalState_MentalDamage() {
        return (EAttribute)phyicalStateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPhyicalState_Zustand() {
        return (EAttribute)phyicalStateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPhyicalState_OverDead() {
        return (EAttribute)phyicalStateEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRuntimeCharacter() {
        return runtimeCharacterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRuntimeCharacter_Character() {
        return (EReference)runtimeCharacterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRuntimeCharacter_RightHand() {
        return (EReference)runtimeCharacterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRuntimeCharacter_LeftHand() {
        return (EReference)runtimeCharacterEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRuntimeCharacter_InUse() {
        return (EReference)runtimeCharacterEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRuntimeCharacter_Armor() {
        return (EReference)runtimeCharacterEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRuntimeCharacter_UsedEdge() {
        return (EAttribute)runtimeCharacterEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getRuntimeCharacter__CanUseEdge() {
        return runtimeCharacterEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTeam() {
        return teamEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTeam_Members() {
        return (EReference)teamEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAbstractExtendetDataAware() {
        return abstractExtendetDataAwareEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGruntTeam() {
        return gruntTeamEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGruntTeam_GruntGroup() {
        return (EReference)gruntTeamEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EOperation getGruntTeam__BuildMembers() {
        return gruntTeamEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGruntRuntimeCharacter() {
        return gruntRuntimeCharacterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVehicle() {
        return vehicleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getVehicle_Vehicle() {
        return (EReference)vehicleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVehicle_VehicleCondition() {
        return (EAttribute)vehicleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVehicle_Modus() {
        return (EAttribute)vehicleEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVehicle_CurrentSpeed() {
        return (EAttribute)vehicleEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDrone() {
        return droneEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMatrixDevice() {
        return matrixDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMatrixDevice_Device() {
        return (EReference)matrixDeviceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMatrixDevice_MatrixCondition() {
        return (EAttribute)matrixDeviceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMatrixDevice_Marks() {
        return (EAttribute)matrixDeviceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRiggerConsole() {
        return riggerConsoleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCyberdeck() {
        return cyberdeckEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getZustand() {
        return zustandEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RuntimeFactory getRuntimeFactory() {
        return (RuntimeFactory)getEFactoryInstance();
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
        extendetDataEClass = createEClass(EXTENDET_DATA);
        createEReference(extendetDataEClass, EXTENDET_DATA__EOBJECT);
        createEReference(extendetDataEClass, EXTENDET_DATA__EFEATURE);

        enviormentEClass = createEClass(ENVIORMENT);

        nahkampModifikationenEClass = createEClass(NAHKAMP_MODIFIKATIONEN);
        createEAttribute(nahkampModifikationenEClass, NAHKAMP_MODIFIKATIONEN__CHRACTER_IS_DOWN);
        createEAttribute(nahkampModifikationenEClass, NAHKAMP_MODIFIKATIONEN__ENEMY_CLOSE_COMBAT);
        createEAttribute(nahkampModifikationenEClass, NAHKAMP_MODIFIKATIONEN__CHARACTER_RUNNING);
        createEAttribute(nahkampModifikationenEClass, NAHKAMP_MODIFIKATIONEN__CHARACTER_PRONE);

        extendetDataAwareEClass = createEClass(EXTENDET_DATA_AWARE);
        createEAttribute(extendetDataAwareEClass, EXTENDET_DATA_AWARE__EXTENDET_DATA);
        createEOperation(extendetDataAwareEClass, EXTENDET_DATA_AWARE___ADD_TO_EXTENDET_DATA__EXTENDETDATA_OBJECT);
        createEOperation(extendetDataAwareEClass, EXTENDET_DATA_AWARE___GET_INTEGER_VALUE__EXTENDETDATA);
        createEOperation(extendetDataAwareEClass, EXTENDET_DATA_AWARE___INCREASE_VALUE__EXTENDETDATA_INT);
        createEOperation(extendetDataAwareEClass, EXTENDET_DATA_AWARE___DECREASE_VALUE__EXTENDETDATA_INT);
        createEOperation(extendetDataAwareEClass, EXTENDET_DATA_AWARE___HAS_VALUE__EXTENDETDATA);
        createEOperation(extendetDataAwareEClass, EXTENDET_DATA_AWARE___ADD_TO_LIST__EXTENDETDATA_OBJECT);
        createEOperation(extendetDataAwareEClass, EXTENDET_DATA_AWARE___ADD_UNIQUE_TO_LIST__EXTENDETDATA_OBJECT);
        createEOperation(extendetDataAwareEClass, EXTENDET_DATA_AWARE___GET_LIST_VALUE__EXTENDETDATA);

        phyicalStateEClass = createEClass(PHYICAL_STATE);
        createEAttribute(phyicalStateEClass, PHYICAL_STATE__PHYSICAL_DAMAGE);
        createEAttribute(phyicalStateEClass, PHYICAL_STATE__MENTAL_DAMAGE);
        createEAttribute(phyicalStateEClass, PHYICAL_STATE__ZUSTAND);
        createEAttribute(phyicalStateEClass, PHYICAL_STATE__OVER_DEAD);

        runtimeCharacterEClass = createEClass(RUNTIME_CHARACTER);
        createEReference(runtimeCharacterEClass, RUNTIME_CHARACTER__CHARACTER);
        createEReference(runtimeCharacterEClass, RUNTIME_CHARACTER__RIGHT_HAND);
        createEReference(runtimeCharacterEClass, RUNTIME_CHARACTER__LEFT_HAND);
        createEReference(runtimeCharacterEClass, RUNTIME_CHARACTER__IN_USE);
        createEReference(runtimeCharacterEClass, RUNTIME_CHARACTER__ARMOR);
        createEAttribute(runtimeCharacterEClass, RUNTIME_CHARACTER__USED_EDGE);
        createEOperation(runtimeCharacterEClass, RUNTIME_CHARACTER___CAN_USE_EDGE);

        teamEClass = createEClass(TEAM);
        createEReference(teamEClass, TEAM__MEMBERS);

        abstractExtendetDataAwareEClass = createEClass(ABSTRACT_EXTENDET_DATA_AWARE);

        gruntTeamEClass = createEClass(GRUNT_TEAM);
        createEReference(gruntTeamEClass, GRUNT_TEAM__GRUNT_GROUP);
        createEOperation(gruntTeamEClass, GRUNT_TEAM___BUILD_MEMBERS);

        gruntRuntimeCharacterEClass = createEClass(GRUNT_RUNTIME_CHARACTER);

        vehicleEClass = createEClass(VEHICLE);
        createEReference(vehicleEClass, VEHICLE__VEHICLE);
        createEAttribute(vehicleEClass, VEHICLE__VEHICLE_CONDITION);
        createEAttribute(vehicleEClass, VEHICLE__MODUS);
        createEAttribute(vehicleEClass, VEHICLE__CURRENT_SPEED);

        droneEClass = createEClass(DRONE);

        matrixDeviceEClass = createEClass(MATRIX_DEVICE);
        createEReference(matrixDeviceEClass, MATRIX_DEVICE__DEVICE);
        createEAttribute(matrixDeviceEClass, MATRIX_DEVICE__MATRIX_CONDITION);
        createEAttribute(matrixDeviceEClass, MATRIX_DEVICE__MARKS);

        riggerConsoleEClass = createEClass(RIGGER_CONSOLE);

        cyberdeckEClass = createEClass(CYBERDECK);

        // Create enums
        zustandEEnum = createEEnum(ZUSTAND);
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
        Shr5managementPackage theShr5managementPackage = (Shr5managementPackage)EPackage.Registry.INSTANCE.getEPackage(Shr5managementPackage.eNS_URI);
        Shr5Package theShr5Package = (Shr5Package)EPackage.Registry.INSTANCE.getEPackage(Shr5Package.eNS_URI);

        // Create type parameters
        ETypeParameter vehicleEClass_V = addETypeParameter(vehicleEClass, "V");
        ETypeParameter matrixDeviceEClass_M = addETypeParameter(matrixDeviceEClass, "M");

        // Set bounds for type parameters
        EGenericType g1 = createEGenericType(theShr5Package.getFahrzeug());
        vehicleEClass_V.getEBounds().add(g1);
        g1 = createEGenericType(theShr5Package.getMatrixDevice());
        matrixDeviceEClass_M.getEBounds().add(g1);

        // Add supertypes to classes
        enviormentEClass.getESuperTypes().add(this.getAbstractExtendetDataAware());
        runtimeCharacterEClass.getESuperTypes().add(this.getAbstractExtendetDataAware());
        runtimeCharacterEClass.getESuperTypes().add(this.getPhyicalState());
        teamEClass.getESuperTypes().add(theShr5Package.getBeschreibbar());
        abstractExtendetDataAwareEClass.getESuperTypes().add(this.getExtendetDataAware());
        gruntTeamEClass.getESuperTypes().add(this.getTeam());
        gruntRuntimeCharacterEClass.getESuperTypes().add(this.getRuntimeCharacter());
        vehicleEClass.getESuperTypes().add(this.getAbstractExtendetDataAware());
        g1 = createEGenericType(this.getVehicle());
        EGenericType g2 = createEGenericType(theShr5Package.getDrohne());
        g1.getETypeArguments().add(g2);
        droneEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getMatrixDevice());
        g2 = createEGenericType(theShr5Package.getRiggerCommandConsole());
        g1.getETypeArguments().add(g2);
        riggerConsoleEClass.getEGenericSuperTypes().add(g1);
        g1 = createEGenericType(this.getMatrixDevice());
        g2 = createEGenericType(theShr5Package.getCyberdeck());
        g1.getETypeArguments().add(g2);
        cyberdeckEClass.getEGenericSuperTypes().add(g1);

        // Initialize classes, features, and operations; add parameters
        initEClass(extendetDataEClass, ExtendetData.class, "ExtendetData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExtendetData_EObject(), ecorePackage.getEObject(), null, "eObject", null, 0, 1, ExtendetData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExtendetData_EFeature(), ecorePackage.getEStructuralFeature(), null, "eFeature", null, 1, 1, ExtendetData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(enviormentEClass, Enviorment.class, "Enviorment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(nahkampModifikationenEClass, NahkampModifikationen.class, "NahkampModifikationen", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNahkampModifikationen_ChracterIsDown(), ecorePackage.getEBoolean(), "chracterIsDown", null, 0, 1, NahkampModifikationen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNahkampModifikationen_EnemyCloseCombat(), ecorePackage.getEInt(), "enemyCloseCombat", null, 0, 1, NahkampModifikationen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNahkampModifikationen_CharacterRunning(), ecorePackage.getEBoolean(), "characterRunning", null, 0, 1, NahkampModifikationen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNahkampModifikationen_CharacterProne(), ecorePackage.getEBoolean(), "characterProne", null, 0, 1, NahkampModifikationen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(extendetDataAwareEClass, ExtendetDataAware.class, "ExtendetDataAware", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType(this.getExtendetData());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        initEAttribute(getExtendetDataAware_ExtendetData(), g1, "extendetData", null, 1, 1, ExtendetDataAware.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = initEOperation(getExtendetDataAware__AddToExtendetData__ExtendetData_Object(), null, "addToExtendetData", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getExtendetData(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getExtendetDataAware__GetIntegerValue__ExtendetData(), ecorePackage.getEInt(), "getIntegerValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getExtendetData(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getExtendetDataAware__IncreaseValue__ExtendetData_int(), null, "increaseValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getExtendetData(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEInt(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getExtendetDataAware__DecreaseValue__ExtendetData_int(), null, "decreaseValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getExtendetData(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEInt(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getExtendetDataAware__HasValue__ExtendetData(), ecorePackage.getEBoolean(), "hasValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getExtendetData(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getExtendetDataAware__AddToList__ExtendetData_Object(), null, "addToList", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getExtendetData(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getExtendetDataAware__AddUniqueToList__ExtendetData_Object(), null, "addUniqueToList", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getExtendetData(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getExtendetDataAware__GetListValue__ExtendetData(), null, "getListValue", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getExtendetData(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEEList());
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        initEOperation(op, g1);

        initEClass(phyicalStateEClass, PhyicalState.class, "PhyicalState", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPhyicalState_PhysicalDamage(), ecorePackage.getEInt(), "physicalDamage", null, 0, 1, PhyicalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhyicalState_MentalDamage(), ecorePackage.getEInt(), "mentalDamage", null, 0, 1, PhyicalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhyicalState_Zustand(), this.getZustand(), "zustand", "ok", 0, 1, PhyicalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPhyicalState_OverDead(), ecorePackage.getEInt(), "overDead", null, 0, 1, PhyicalState.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(runtimeCharacterEClass, RuntimeCharacter.class, "RuntimeCharacter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRuntimeCharacter_Character(), theShr5managementPackage.getManagedCharacter(), null, "character", null, 1, 1, RuntimeCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuntimeCharacter_RightHand(), theShr5Package.getAbstraktGegenstand(), null, "rightHand", null, 0, 1, RuntimeCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuntimeCharacter_LeftHand(), theShr5Package.getAbstraktGegenstand(), null, "leftHand", null, 0, 1, RuntimeCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuntimeCharacter_InUse(), theShr5Package.getAbstraktGegenstand(), null, "inUse", null, 0, -1, RuntimeCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRuntimeCharacter_Armor(), theShr5Package.getKleidung(), null, "armor", null, 0, 1, RuntimeCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRuntimeCharacter_UsedEdge(), ecorePackage.getEInt(), "usedEdge", null, 0, 1, RuntimeCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getRuntimeCharacter__CanUseEdge(), ecorePackage.getEBoolean(), "canUseEdge", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(teamEClass, Team.class, "Team", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTeam_Members(), this.getRuntimeCharacter(), null, "members", null, 0, -1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractExtendetDataAwareEClass, AbstractExtendetDataAware.class, "AbstractExtendetDataAware", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(gruntTeamEClass, GruntTeam.class, "GruntTeam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGruntTeam_GruntGroup(), theShr5managementPackage.getGruntGroup(), null, "gruntGroup", null, 1, 1, GruntTeam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEOperation(getGruntTeam__BuildMembers(), null, "buildMembers", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(gruntRuntimeCharacterEClass, GruntRuntimeCharacter.class, "GruntRuntimeCharacter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(vehicleEClass, Vehicle.class, "Vehicle", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = createEGenericType(vehicleEClass_V);
        initEReference(getVehicle_Vehicle(), g1, null, "vehicle", null, 1, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVehicle_VehicleCondition(), ecorePackage.getEInt(), "vehicleCondition", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVehicle_Modus(), theShr5Package.getInterfaceModus(), "modus", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getVehicle_CurrentSpeed(), ecorePackage.getEInt(), "currentSpeed", null, 0, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(droneEClass, Drone.class, "Drone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(matrixDeviceEClass, MatrixDevice.class, "MatrixDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        g1 = createEGenericType(matrixDeviceEClass_M);
        initEReference(getMatrixDevice_Device(), g1, null, "device", null, 1, 1, MatrixDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMatrixDevice_MatrixCondition(), ecorePackage.getEInt(), "matrixCondition", null, 0, 1, MatrixDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMatrixDevice_Marks(), ecorePackage.getEInt(), "marks", null, 0, 1, MatrixDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(riggerConsoleEClass, RiggerConsole.class, "RiggerConsole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(cyberdeckEClass, Cyberdeck.class, "Cyberdeck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(zustandEEnum, Zustand.class, "Zustand");
        addEEnumLiteral(zustandEEnum, Zustand.OK);
        addEEnumLiteral(zustandEEnum, Zustand.BETAEUBT);
        addEEnumLiteral(zustandEEnum, Zustand.STERBEND);
        addEEnumLiteral(zustandEEnum, Zustand.TOT);

        // Create resource
        createResource(eNS_URI);
    }

} //RuntimePackageImpl
