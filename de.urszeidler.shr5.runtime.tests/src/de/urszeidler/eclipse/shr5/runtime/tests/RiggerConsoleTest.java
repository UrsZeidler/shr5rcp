/**
 */
package de.urszeidler.eclipse.shr5.runtime.tests;

import junit.textui.TestRunner;

import org.junit.Ignore;

import de.urszeidler.eclipse.shr5.runtime.RiggerConsole;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rigger Console</b></em>'.
 * <!-- end-user-doc -->
 * @generated not
 */
@Ignore
public class RiggerConsoleTest extends MatrixDeviceTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(RiggerConsoleTest.class);
    }

    /**
     * Constructs a new Rigger Console test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RiggerConsoleTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Rigger Console test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected RiggerConsole getFixture() {
        return (RiggerConsole)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RuntimeFactory.eINSTANCE.createRiggerConsole());
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

} //RiggerConsoleTest
