/**
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Wurfwaffe;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wurfwaffe</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WurfwaffeTest extends AbstaktFernKampfwaffeTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(WurfwaffeTest.class);
    }

	/**
     * Constructs a new Wurfwaffe test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WurfwaffeTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Wurfwaffe test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected Wurfwaffe getFixture() {
        return (Wurfwaffe)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated not
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createWurfwaffe());
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

  
} //WurfwaffeTest
