/**
 */
package de.urszeidler.eclipse.shr5.runtime.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Runtime</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeAllTests extends TestSuite {

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
        TestSuite suite = new RuntimeAllTests("Runtime Tests");
        suite.addTest(RuntimeTests.suite());
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuntimeAllTests(String name) {
        super(name);
    }

} //RuntimeAllTests
