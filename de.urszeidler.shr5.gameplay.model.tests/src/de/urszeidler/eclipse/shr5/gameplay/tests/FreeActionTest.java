/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import de.urszeidler.eclipse.shr5.gameplay.FreeAction;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Free Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FreeActionTest extends SubjectCommandTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(FreeActionTest.class);
    }

    /**
     * Constructs a new Free Action test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FreeActionTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Free Action test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected FreeAction getFixture() {
        return (FreeAction)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(GameplayFactory.eINSTANCE.createFreeAction());
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

} //FreeActionTest
