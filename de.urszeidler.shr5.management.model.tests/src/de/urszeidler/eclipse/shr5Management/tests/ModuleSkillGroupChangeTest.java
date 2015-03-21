/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import de.urszeidler.eclipse.shr5Management.ModuleSkillGroupChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Module Skill Group Change</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleSkillGroupChangeTest extends ModuleTypeChangeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ModuleSkillGroupChangeTest.class);
    }

    /**
     * Constructs a new Module Skill Group Change test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModuleSkillGroupChangeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Module Skill Group Change test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ModuleSkillGroupChange getFixture() {
        return (ModuleSkillGroupChange)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5managementFactory.eINSTANCE.createModuleSkillGroupChange());
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

} //ModuleSkillGroupChangeTest
