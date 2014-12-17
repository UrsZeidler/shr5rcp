/**
 */
package de.urszeidler.eclipse.shr5.runtime.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import de.urszeidler.eclipse.shr5.MatrixDevice;
import de.urszeidler.eclipse.shr5.runtime.Cyberdeck;
import de.urszeidler.eclipse.shr5.runtime.Drone;
import de.urszeidler.eclipse.shr5.runtime.Enviorment;
import de.urszeidler.eclipse.shr5.runtime.ExtendetData;
import de.urszeidler.eclipse.shr5.runtime.GruntRuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.GruntTeam;
import de.urszeidler.eclipse.shr5.runtime.RiggerConsole;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5.runtime.Team;
import de.urszeidler.eclipse.shr5.runtime.Zustand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeFactoryImpl extends EFactoryImpl implements RuntimeFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static RuntimeFactory init() {
        try {
            RuntimeFactory theRuntimeFactory = (RuntimeFactory)EPackage.Registry.INSTANCE.getEFactory(RuntimePackage.eNS_URI);
            if (theRuntimeFactory != null) {
                return theRuntimeFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new RuntimeFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuntimeFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case RuntimePackage.EXTENDET_DATA: return createExtendetData();
            case RuntimePackage.ENVIORMENT: return createEnviorment();
            case RuntimePackage.RUNTIME_CHARACTER: return createRuntimeCharacter();
            case RuntimePackage.TEAM: return createTeam();
            case RuntimePackage.GRUNT_TEAM: return createGruntTeam();
            case RuntimePackage.GRUNT_RUNTIME_CHARACTER: return createGruntRuntimeCharacter();
            case RuntimePackage.DRONE: return createDrone();
            case RuntimePackage.MATRIX_DEVICE: return createMatrixDevice();
            case RuntimePackage.RIGGER_CONSOLE: return createRiggerConsole();
            case RuntimePackage.CYBERDECK: return createCyberdeck();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case RuntimePackage.ZUSTAND:
                return createZustandFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case RuntimePackage.ZUSTAND:
                return convertZustandToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtendetData createExtendetData() {
        ExtendetDataImpl extendetData = new ExtendetDataImpl();
        return extendetData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Enviorment createEnviorment() {
        EnviormentImpl enviorment = new EnviormentImpl();
        return enviorment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuntimeCharacter createRuntimeCharacter() {
        RuntimeCharacterImpl runtimeCharacter = new RuntimeCharacterImpl();
        return runtimeCharacter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Team createTeam() {
        TeamImpl team = new TeamImpl();
        return team;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GruntTeam createGruntTeam() {
        GruntTeamImpl gruntTeam = new GruntTeamImpl();
        return gruntTeam;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GruntRuntimeCharacter createGruntRuntimeCharacter() {
        GruntRuntimeCharacterImpl gruntRuntimeCharacter = new GruntRuntimeCharacterImpl();
        return gruntRuntimeCharacter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Drone createDrone() {
        DroneImpl drone = new DroneImpl();
        return drone;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public <M extends MatrixDevice> de.urszeidler.eclipse.shr5.runtime.MatrixDevice<M> createMatrixDevice() {
        MatrixDeviceImpl<M> matrixDevice = new MatrixDeviceImpl<M>();
        return matrixDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RiggerConsole createRiggerConsole() {
        RiggerConsoleImpl riggerConsole = new RiggerConsoleImpl();
        return riggerConsole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Cyberdeck createCyberdeck() {
        CyberdeckImpl cyberdeck = new CyberdeckImpl();
        return cyberdeck;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Zustand createZustandFromString(EDataType eDataType, String initialValue) {
        Zustand result = Zustand.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertZustandToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuntimePackage getRuntimePackage() {
        return (RuntimePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static RuntimePackage getPackage() {
        return RuntimePackage.eINSTANCE;
    }

} //RuntimeFactoryImpl
