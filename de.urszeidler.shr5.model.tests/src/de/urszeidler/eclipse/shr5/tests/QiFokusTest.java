/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.QiFokus;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Qi Fokus</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QiFokusTest extends AbstraktFokusTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(QiFokusTest.class);
    }

    /**
     * Constructs a new Qi Fokus test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QiFokusTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Qi Fokus test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected QiFokus getFixture() {
        return (QiFokus)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createQiFokus());
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
        KiKraft kiKraft= Shr5Factory.eINSTANCE.createKiKraft();
        kiKraft.setKraftpunkte(25);
        
        getFixture().setPower(kiKraft);
        assertEquals(2, getFixture().getBindungskosten());  
        assertEquals(1, getFixture().getStufe());  
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Fokus#getBindungskosten() <em>Bindungskosten</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Fokus#getBindungskosten()
     * @generated not
     */
    public void testGetBindungskosten1() {
        KiKraft kiKraft= Shr5Factory.eINSTANCE.createKiKraft();
        kiKraft.setKraftpunkte(-25);
        
        getFixture().setPower(kiKraft);
        assertEquals(2, getFixture().getBindungskosten());  
        assertEquals(1, getFixture().getStufe());  
    }

} //QiFokusTest
