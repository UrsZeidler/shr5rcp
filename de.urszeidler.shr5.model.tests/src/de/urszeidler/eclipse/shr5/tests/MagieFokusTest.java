/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.MagieFokus;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Magie Fokus</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MagieFokusTest extends AbstraktFokusTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(MagieFokusTest.class);
    }

    /**
     * Constructs a new Magie Fokus test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MagieFokusTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Magie Fokus test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected MagieFokus getFixture() {
        return (MagieFokus)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createMagieFokus());
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
        getFixture().setBindungsFaktor(2);
        getFixture().setStufe(1);
        assertEquals(2, getFixture().getBindungskosten());  
        getFixture().setBindungsFaktor(2);
        getFixture().setStufe(2);
        assertEquals(4, getFixture().getBindungskosten());  
        getFixture().setBindungsFaktor(3);
        getFixture().setStufe(2);
        assertEquals(6, getFixture().getBindungskosten());  
    }
} //MagieFokusTest
