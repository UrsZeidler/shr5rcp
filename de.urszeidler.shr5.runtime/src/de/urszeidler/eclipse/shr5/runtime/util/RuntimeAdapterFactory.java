/**
 */
package de.urszeidler.eclipse.shr5.runtime.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Fahrzeug;
import de.urszeidler.eclipse.shr5.MatrixDevice;
import de.urszeidler.eclipse.shr5.runtime.AbstractExtendetDataAware;
import de.urszeidler.eclipse.shr5.runtime.Cyberdeck;
import de.urszeidler.eclipse.shr5.runtime.Drone;
import de.urszeidler.eclipse.shr5.runtime.Enviorment;
import de.urszeidler.eclipse.shr5.runtime.ExtendetData;
import de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware;
import de.urszeidler.eclipse.shr5.runtime.GruntRuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.GruntTeam;
import de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen;
import de.urszeidler.eclipse.shr5.runtime.PhyicalState;
import de.urszeidler.eclipse.shr5.runtime.RiggerConsole;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5.runtime.Team;
import de.urszeidler.eclipse.shr5.runtime.Vehicle;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage
 * @generated
 */
public class RuntimeAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static RuntimePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuntimeAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = RuntimePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RuntimeSwitch<Adapter> modelSwitch =
        new RuntimeSwitch<Adapter>() {
            @Override
            public Adapter caseExtendetData(ExtendetData object) {
                return createExtendetDataAdapter();
            }
            @Override
            public Adapter caseEnviorment(Enviorment object) {
                return createEnviormentAdapter();
            }
            @Override
            public Adapter caseNahkampModifikationen(NahkampModifikationen object) {
                return createNahkampModifikationenAdapter();
            }
            @Override
            public Adapter caseExtendetDataAware(ExtendetDataAware object) {
                return createExtendetDataAwareAdapter();
            }
            @Override
            public Adapter casePhyicalState(PhyicalState object) {
                return createPhyicalStateAdapter();
            }
            @Override
            public Adapter caseRuntimeCharacter(RuntimeCharacter object) {
                return createRuntimeCharacterAdapter();
            }
            @Override
            public Adapter caseTeam(Team object) {
                return createTeamAdapter();
            }
            @Override
            public Adapter caseAbstractExtendetDataAware(AbstractExtendetDataAware object) {
                return createAbstractExtendetDataAwareAdapter();
            }
            @Override
            public Adapter caseGruntTeam(GruntTeam object) {
                return createGruntTeamAdapter();
            }
            @Override
            public Adapter caseGruntRuntimeCharacter(GruntRuntimeCharacter object) {
                return createGruntRuntimeCharacterAdapter();
            }
            @Override
            public <V extends Fahrzeug> Adapter caseVehicle(Vehicle<V> object) {
                return createVehicleAdapter();
            }
            @Override
            public Adapter caseDrone(Drone object) {
                return createDroneAdapter();
            }
            @Override
            public <M extends MatrixDevice> Adapter caseMatrixDevice(de.urszeidler.eclipse.shr5.runtime.MatrixDevice<M> object) {
                return createMatrixDeviceAdapter();
            }
            @Override
            public Adapter caseRiggerConsole(RiggerConsole object) {
                return createRiggerConsoleAdapter();
            }
            @Override
            public Adapter caseCyberdeck(Cyberdeck object) {
                return createCyberdeckAdapter();
            }
            @Override
            public Adapter caseBeschreibbar(Beschreibbar object) {
                return createBeschreibbarAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetData <em>Extendet Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetData
     * @generated
     */
    public Adapter createExtendetDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.runtime.Enviorment <em>Enviorment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.runtime.Enviorment
     * @generated
     */
    public Adapter createEnviormentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen <em>Nahkamp Modifikationen</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.runtime.NahkampModifikationen
     * @generated
     */
    public Adapter createNahkampModifikationenAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware <em>Extendet Data Aware</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware
     * @generated
     */
    public Adapter createExtendetDataAwareAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.runtime.PhyicalState <em>Phyical State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.runtime.PhyicalState
     * @generated
     */
    public Adapter createPhyicalStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter <em>Character</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter
     * @generated
     */
    public Adapter createRuntimeCharacterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.runtime.Team <em>Team</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.runtime.Team
     * @generated
     */
    public Adapter createTeamAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.runtime.AbstractExtendetDataAware <em>Abstract Extendet Data Aware</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.runtime.AbstractExtendetDataAware
     * @generated
     */
    public Adapter createAbstractExtendetDataAwareAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.runtime.GruntTeam <em>Grunt Team</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.runtime.GruntTeam
     * @generated
     */
    public Adapter createGruntTeamAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.runtime.GruntRuntimeCharacter <em>Grunt Runtime Character</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.runtime.GruntRuntimeCharacter
     * @generated
     */
    public Adapter createGruntRuntimeCharacterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.runtime.Vehicle <em>Vehicle</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.runtime.Vehicle
     * @generated
     */
    public Adapter createVehicleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.runtime.Drone <em>Drone</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.runtime.Drone
     * @generated
     */
    public Adapter createDroneAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.runtime.MatrixDevice <em>Matrix Device</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.runtime.MatrixDevice
     * @generated
     */
    public Adapter createMatrixDeviceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.runtime.RiggerConsole <em>Rigger Console</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.runtime.RiggerConsole
     * @generated
     */
    public Adapter createRiggerConsoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.runtime.Cyberdeck <em>Cyberdeck</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.runtime.Cyberdeck
     * @generated
     */
    public Adapter createCyberdeckAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.urszeidler.eclipse.shr5.Beschreibbar <em>Beschreibbar</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.urszeidler.eclipse.shr5.Beschreibbar
     * @generated
     */
    public Adapter createBeschreibbarAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //RuntimeAdapterFactory
