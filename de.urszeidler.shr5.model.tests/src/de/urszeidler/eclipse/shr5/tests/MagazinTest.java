/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import de.urszeidler.eclipse.shr5.Magazin;
import de.urszeidler.eclipse.shr5.Shr5Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Magazin</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MagazinTest extends AbstraktGegenstandTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(MagazinTest.class);
    }

    /**
     * Constructs a new Magazin test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MagazinTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Magazin test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Magazin getFixture() {
        return (Magazin)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createMagazin());
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

} //MagazinTest
