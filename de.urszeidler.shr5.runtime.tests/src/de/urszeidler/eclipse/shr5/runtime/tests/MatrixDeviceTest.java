/**
 */
package de.urszeidler.eclipse.shr5.runtime.tests;

import de.urszeidler.eclipse.shr5.runtime.MatrixDevice;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Matrix Device</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MatrixDeviceTest extends TestCase {

    /**
     * The fixture for this Matrix Device test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MatrixDevice<?> fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(MatrixDeviceTest.class);
    }

    /**
     * Constructs a new Matrix Device test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MatrixDeviceTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Matrix Device test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(MatrixDevice<?> fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Matrix Device test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MatrixDevice<?> getFixture() {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RuntimeFactory.eINSTANCE.createMatrixDevice());
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

} //MatrixDeviceTest
