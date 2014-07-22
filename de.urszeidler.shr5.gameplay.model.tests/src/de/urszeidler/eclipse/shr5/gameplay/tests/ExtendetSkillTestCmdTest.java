/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Extendet Skill Test Cmd</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendetSkillTestCmdTest extends SkillTestCmdTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ExtendetSkillTestCmdTest.class);
    }

    /**
     * Constructs a new Extendet Skill Test Cmd test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtendetSkillTestCmdTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Extendet Skill Test Cmd test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ExtendetSkillTestCmd getFixture() {
        return (ExtendetSkillTestCmd)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(GameplayFactory.eINSTANCE.createExtendetSkillTestCmd());
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

} //ExtendetSkillTestCmdTest
