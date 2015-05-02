/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import de.urszeidler.eclipse.shr5.FahrzeugErweiterung;
import de.urszeidler.eclipse.shr5.Shr5Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fahrzeug Erweiterung</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FahrzeugErweiterungTest extends FahrzeugModifikationTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(FahrzeugErweiterungTest.class);
    }

    /**
     * Constructs a new Fahrzeug Erweiterung test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FahrzeugErweiterungTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Fahrzeug Erweiterung test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected FahrzeugErweiterung getFixture() {
        return (FahrzeugErweiterung)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createFahrzeugErweiterung());
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

} //FahrzeugErweiterungTest
