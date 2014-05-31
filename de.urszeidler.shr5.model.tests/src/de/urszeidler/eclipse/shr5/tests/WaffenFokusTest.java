/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.WaffenFokus;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Waffen Fokus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Fokus#getBindungskosten() <em>Bindungskosten</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class WaffenFokusTest extends NahkampfwaffeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(WaffenFokusTest.class);
    }

    /**
     * Constructs a new Waffen Fokus test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WaffenFokusTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Waffen Fokus test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected WaffenFokus getFixture() {
        return (WaffenFokus)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createWaffenFokus());
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
        getFixture().setWertValue(new BigDecimal(100));

        getFixture().setStufe(1);
        assertEquals(100, getFixture().getWert().intValue());  
        getFixture().setStufe(2);
        assertEquals(200, getFixture().getWert().intValue());  
    }

    
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Fokus#getBindungskosten() <em>Bindungskosten</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Fokus#getBindungskosten()
     * @generated not
     */
    public void testGetBindungskosten() {
        
        getFixture().setStufe(1);
        assertEquals(3, getFixture().getBindungskosten());  
        getFixture().setStufe(3);
        assertEquals(9, getFixture().getBindungskosten());  
 
    }

} //WaffenFokusTest
