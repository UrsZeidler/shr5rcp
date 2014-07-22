/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.Initative;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Initative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Initative#nextPass(int) <em>Next Pass</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class InitativeTest extends SubjectCommandTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(InitativeTest.class);
    }

    /**
     * Constructs a new Initative test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InitativeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Initative test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Initative getFixture() {
        return (Initative)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(GameplayFactory.eINSTANCE.createInitative());
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

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Initative#nextPass(int) <em>Next Pass</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.Initative#nextPass(int)
     * @generated
     */
    public void testNextPass__int() {
        // TODO: implement this operation test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

} //InitativeTest
