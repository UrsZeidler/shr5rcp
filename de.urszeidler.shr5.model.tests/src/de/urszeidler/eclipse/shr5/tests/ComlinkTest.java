/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import de.urszeidler.eclipse.shr5.Comlink;
import de.urszeidler.eclipse.shr5.Shr5Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Comlink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixDevice#getGeraetestufe() <em>Geraetestufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixDevice#getFirewall() <em>Firewall</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixDevice#getDatenverarbeitung() <em>Datenverarbeitung</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ComlinkTest extends AbstraktGegenstandTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ComlinkTest.class);
    }

    /**
     * Constructs a new Comlink test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComlinkTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Comlink test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Comlink getFixture() {
        return (Comlink)fixture;
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
        setFixture(Shr5Factory.eINSTANCE.createComlink());
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
