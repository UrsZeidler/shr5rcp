/**
 */
package de.urszeidler.eclipse.shr5.runtime.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>runtime</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeTests extends TestSuite {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(suite());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Test suite() {
        TestSuite suite = new RuntimeTests("runtime Tests");
        suite.addTestSuite(EnviormentTest.class);
        suite.addTestSuite(RuntimeCharacterTest.class);
        suite.addTestSuite(GruntTeamTest.class);
        suite.addTestSuite(GruntRuntimeCharacterTest.class);
        suite.addTestSuite(DroneTest.class);
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuntimeTests(String name) {
        super(name);
    }

} //RuntimeTests
