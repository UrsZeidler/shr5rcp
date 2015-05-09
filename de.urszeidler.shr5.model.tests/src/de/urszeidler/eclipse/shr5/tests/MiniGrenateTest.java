/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.MiniGrenate;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Substance;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mini Grenate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniGrenateTest extends MunitionTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(MiniGrenateTest.class);
    }

    /**
     * Constructs a new Mini Grenate test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MiniGrenateTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Mini Grenate test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected MiniGrenate getFixture() {
        return (MiniGrenate)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createMiniGrenate());
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
    public void testGetWert_Anzahl() {
        getFixture().setWertValue(new BigDecimal(10));        
        assertEquals(10,getFixture().getWert().intValue());
        
        getFixture().setAnzahl(2);
        assertEquals(20,getFixture().getWert().intValue());
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
        
        assertEquals(25,getFixture().getWert().intValue());
    }

} //MiniGrenateTest
