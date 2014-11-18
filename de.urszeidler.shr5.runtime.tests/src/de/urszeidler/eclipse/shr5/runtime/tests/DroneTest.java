/**
 */
package de.urszeidler.eclipse.shr5.runtime.tests;

import de.urszeidler.eclipse.shr5.runtime.Drone;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DroneTest extends VehicleTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(DroneTest.class);
    }

    /**
     * Constructs a new Drone test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DroneTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Drone test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Drone getFixture() {
        return (Drone)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RuntimeFactory.eINSTANCE.createDrone());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }

} //DroneTest
