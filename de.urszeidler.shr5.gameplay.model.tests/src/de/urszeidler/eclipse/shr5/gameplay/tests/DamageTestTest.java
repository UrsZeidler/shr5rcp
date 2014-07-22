/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import de.urszeidler.eclipse.shr5.gameplay.DamageTest;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Damage Test</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DamageTestTest extends ProbeCommandTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(DamageTestTest.class);
    }

    /**
     * Constructs a new Damage Test test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DamageTestTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Damage Test test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected DamageTest getFixture() {
        return (DamageTest)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(GameplayFactory.eINSTANCE.createDamageTest());
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

} //DamageTestTest
