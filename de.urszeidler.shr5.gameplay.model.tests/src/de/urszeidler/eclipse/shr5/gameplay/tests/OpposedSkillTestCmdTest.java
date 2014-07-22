/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Opposed Skill Test Cmd</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpposedSkillTestCmdTest extends SkillTestCmdTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(OpposedSkillTestCmdTest.class);
    }

    /**
     * Constructs a new Opposed Skill Test Cmd test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpposedSkillTestCmdTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Opposed Skill Test Cmd test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected OpposedSkillTestCmd getFixture() {
        return (OpposedSkillTestCmd)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(GameplayFactory.eINSTANCE.createOpposedSkillTestCmd());
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

} //OpposedSkillTestCmdTest
