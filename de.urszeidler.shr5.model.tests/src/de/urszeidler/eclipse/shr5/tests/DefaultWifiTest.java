/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.DefaultWifi;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Default Wifi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 * <li>{@link de.urszeidler.eclipse.shr5.MatixConditionMonitor#getMatrixZustandMax() <em>Matrix Zustand Max</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getGeraetestufe() <em>Geraetestufe</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getFirewall() <em>Firewall</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getDatenverarbeitung() <em>Datenverarbeitung</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DefaultWifiTest extends AbstraktGegenstandTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(DefaultWifiTest.class);
    }

    /**
     * Constructs a new Default Wifi test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public DefaultWifiTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Default Wifi test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected DefaultWifi getFixture() {
        return (DefaultWifi)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createDefaultWifi());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
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
     * 
     * @see de.urszeidler.eclipse.shr5.MatixConditionMonitor#getMatrixZustandMax()
     * @generated NOT
     */
    public void testGetMatrixZustandMax() {
        assertEquals(8, getFixture().getMatrixZustandMax());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getGeraetestufe() <em>Geraetestufe</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.MatrixAttributes#getGeraetestufe()
     * @generated NOT
     */
    public void testGetGeraetestufe() {
        getFixture().setDeviceRating(1);
        assertEquals(1, getFixture().getGeraetestufe());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getFirewall() <em>Firewall</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.MatrixAttributes#getFirewall()
     * @generated NOT
     */
    public void testGetFirewall() {
        getFixture().setDeviceRating(1);
        assertEquals(1, getFixture().getFirewall());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.MatrixAttributes#getDatenverarbeitung() <em>Datenverarbeitung</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.MatrixAttributes#getDatenverarbeitung()
     * @generated NOT
     */
    public void testGetDatenverarbeitung() {
        getFixture().setDeviceRating(1);
        assertEquals(1, getFixture().getDatenverarbeitung());
    }

} // DefaultWifiTest
