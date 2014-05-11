/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Commlink;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Comlink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatixConditionMonitor#getMatrixZustandMax() <em>Matrix Zustand Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixDevice#getGeraetestufe() <em>Geraetestufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixDevice#getFirewall() <em>Firewall</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixDevice#getDatenverarbeitung() <em>Datenverarbeitung</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CommlinkTest extends AbstraktGegenstandTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(CommlinkTest.class);
    }

    /**
     * Constructs a new Commlink test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommlinkTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Commlink test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Commlink getFixture() {
        return (Commlink)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated not
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createCommlink());
        getFixture().setDeviceRating(2);
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
     * Tests the '{@link de.urszeidler.eclipse.shr5.MatixConditionMonitor#getMatrixZustandMax() <em>Matrix Zustand Max</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.MatixConditionMonitor#getMatrixZustandMax()
     * @generated not
     */
    public void testGetMatrixZustandMax() {
        assertEquals(9, getFixture().getMatrixZustandMax());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.MatrixDevice#getGeraetestufe() <em>Geraetestufe</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.MatrixDevice#getGeraetestufe()
     * @generated not
     */
    public void testGetGeraetestufe() {
        assertEquals(2, getFixture().getGeraetestufe());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.MatrixDevice#getFirewall() <em>Firewall</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.MatrixDevice#getFirewall()
     * @generated not
     */
    public void testGetFirewall() {
        assertEquals(2, getFixture().getFirewall());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.MatrixDevice#getDatenverarbeitung() <em>Datenverarbeitung</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.MatrixDevice#getDatenverarbeitung()
     * @generated not
     */
    public void testGetDatenverarbeitung() {
        assertEquals(2, getFixture().getDatenverarbeitung());
    }

} // ComlinkTest
