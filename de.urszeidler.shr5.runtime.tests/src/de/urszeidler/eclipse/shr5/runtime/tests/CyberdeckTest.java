/**
 */
package de.urszeidler.eclipse.shr5.runtime.tests;

import junit.textui.TestRunner;

import org.junit.Ignore;

import de.urszeidler.eclipse.shr5.runtime.Cyberdeck;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cyberdeck</b></em>'.
 * <!-- end-user-doc -->
 * @generated not
 */
@Ignore
public class CyberdeckTest extends MatrixDeviceTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(CyberdeckTest.class);
    }

    /**
     * Constructs a new Cyberdeck test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CyberdeckTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Cyberdeck test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Cyberdeck getFixture() {
        return (Cyberdeck)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RuntimeFactory.eINSTANCE.createCyberdeck());
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

} //CyberdeckTest
