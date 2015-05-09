/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Granate;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Substance;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Granate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GranateTest extends WurfwaffeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(GranateTest.class);
    }

    /**
     * Constructs a new Granate test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GranateTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Granate test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Granate getFixture() {
        return (Granate)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated not
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createGranate());
        getFixture().setAnzahl(1);
        getFixture().setProAnzahl(1);
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
    public void testGetWert_Gas() {
        getFixture().setWertValue(new BigDecimal(10));        
        assertEquals(10,getFixture().getWert().intValue());
        
        getFixture().setAnzahl(2);
        assertEquals(20,getFixture().getWert().intValue());
        
        Substance substance= Shr5Factory.eINSTANCE.createToxin();
        substance.setAnzahl(1);
        substance.setProAnzahl(1);
        substance.setWertValue(new BigDecimal(5));
        getFixture().setChemical(substance);
        
        assertEquals(30,getFixture().getWert().intValue());
    }

    
} //GranateTest
