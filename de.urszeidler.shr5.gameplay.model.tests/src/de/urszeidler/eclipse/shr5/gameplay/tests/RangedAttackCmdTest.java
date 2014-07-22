/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ranged Attack Cmd</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RangedAttackCmdTest extends OpposedSkillTestCmdTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(RangedAttackCmdTest.class);
    }

    /**
     * Constructs a new Ranged Attack Cmd test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RangedAttackCmdTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Ranged Attack Cmd test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected RangedAttackCmd getFixture() {
        return (RangedAttackCmd)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(GameplayFactory.eINSTANCE.createRangedAttackCmd());
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

} //RangedAttackCmdTest
