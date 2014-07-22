/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Gameplay</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameplayAllTests extends TestSuite {

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
        TestSuite suite = new GameplayAllTests("Gameplay Tests");
        suite.addTest(GameplayTests.suite());
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GameplayAllTests(String name) {
        super(name);
    }

} //GameplayAllTests
