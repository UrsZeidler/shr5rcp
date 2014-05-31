/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.WeaponMount;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Weapon Mount</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WeaponMountTest extends FahrzeugModifikationTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(WeaponMountTest.class);
    }

    /**
     * Constructs a new Weapon Mount test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WeaponMountTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Weapon Mount test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected WeaponMount getFixture() {
        return (WeaponMount)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createWeaponMount());
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

} //WeaponMountTest
