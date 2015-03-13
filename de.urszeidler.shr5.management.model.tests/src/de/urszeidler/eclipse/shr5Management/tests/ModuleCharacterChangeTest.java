/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import de.urszeidler.eclipse.shr5Management.ModuleCharacterChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Module Character Change</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleCharacterChangeTest extends ModuleChangeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ModuleCharacterChangeTest.class);
    }

    /**
     * Constructs a new Module Character Change test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModuleCharacterChangeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Module Character Change test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ModuleCharacterChange getFixture() {
        return (ModuleCharacterChange)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5managementFactory.eINSTANCE.createModuleCharacterChange());
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

} //ModuleCharacterChangeTest
