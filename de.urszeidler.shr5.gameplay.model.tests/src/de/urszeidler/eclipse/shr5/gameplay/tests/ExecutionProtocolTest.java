/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.junit.Ignore;

import de.urszeidler.eclipse.shr5.gameplay.ExecutionProtocol;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Execution Protocol</b></em>'.
 * <!-- end-user-doc -->
 * @generated not
 */
@Ignore
public class ExecutionProtocolTest extends TestCase {

    /**
     * The fixture for this Execution Protocol test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExecutionProtocol fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ExecutionProtocolTest.class);
    }

    /**
     * Constructs a new Execution Protocol test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionProtocolTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Execution Protocol test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(ExecutionProtocol fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Execution Protocol test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExecutionProtocol getFixture() {
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
        setFixture(GameplayFactory.eINSTANCE.createExecutionProtocol());
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

} //ExecutionProtocolTest
