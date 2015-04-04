/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import de.urszeidler.eclipse.shr5.KleindungsModifikator;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.armorModificationType;
import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Kleindungs Modifikator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.KleindungsModifikator#getCapacity() <em>Capacity</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class KleindungsModifikatorTest extends TestCase {

    /**
     * The fixture for this Kleindungs Modifikator test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KleindungsModifikator fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(KleindungsModifikatorTest.class);
    }

    /**
     * Constructs a new Kleindungs Modifikator test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KleindungsModifikatorTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Kleindungs Modifikator test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(KleindungsModifikator fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Kleindungs Modifikator test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KleindungsModifikator getFixture() {
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
        setFixture(Shr5Factory.eINSTANCE.createKleindungsModifikator());
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
     * Tests the '{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GeldWert#getWert()
     * @generated not
     */
    public void testGetWert() {
        getFixture().setRating(2);
        getFixture().setWertValue(new BigDecimal(10));
        
        assertEquals(getFixture().getWert().intValue(), 20);
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.KleindungsModifikator#getCapacity() <em>Capacity</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.KleindungsModifikator#getCapacity()
     * @generated not
     */
    public void testGetCapacity() {
        getFixture().setRating(2);
        assertEquals(2, getFixture().getCapacity());
        
        getFixture().setType(armorModificationType.CHEMICAL_SEAL);
        assertEquals(6, getFixture().getCapacity());

        getFixture().setType(armorModificationType.SHOCK_FRILLS);
        assertEquals(2, getFixture().getCapacity());

        
    }

} //KleindungsModifikatorTest
