/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>gameplay</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GameplayTests extends TestSuite {

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
        TestSuite suite = new GameplayTests("gameplay Tests");
        suite.addTestSuite(DamageTestTest.class);
        suite.addTestSuite(SkillTestCmdTest.class);
        suite.addTestSuite(OpposedSkillTestCmdTest.class);
        suite.addTestSuite(InitativeTest.class);
        suite.addTestSuite(CombatTurnTest.class);
        suite.addTestSuite(ExtendetSkillTestCmdTest.class);
        suite.addTestSuite(DefensTestCmdTest.class);
        suite.addTestSuite(SuccesTestCmdTest.class);
        suite.addTestSuite(InitativePassTest.class);
        suite.addTestSuite(ComplexActionTest.class);
        suite.addTestSuite(SimpleActionTest.class);
        suite.addTestSuite(SimpleActionsTest.class);
        suite.addTestSuite(FreeActionTest.class);
        suite.addTestSuite(InterruptActionTest.class);
        suite.addTestSuite(SetFeatureCommandTest.class);
        suite.addTestSuite(MeeleAttackCmdTest.class);
        suite.addTestSuite(RangedAttackCmdTest.class);
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GameplayTests(String name) {
        super(name);
    }

} //GameplayTests
