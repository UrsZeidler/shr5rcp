/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Drohne;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Drohne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatixConditionMonitor#getMatrixZustandMax() <em>Matrix Zustand Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixDevice#getGeraetestufe() <em>Geraetestufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixDevice#getFirewall() <em>Firewall</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatrixDevice#getDatenverarbeitung() <em>Datenverarbeitung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Drohne#getProgramSlotCount() <em>Program Slot Count</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DrohneTest extends FahrzeugTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(DrohneTest.class);
    }

	/**
     * Constructs a new Drohne test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DrohneTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Drohne test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected Drohne getFixture() {
        return (Drohne)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createDrohne());
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
        getFixture().setPilot(2);        
        assertEquals(9, getFixture().getMatrixZustandMax());
        getFixture().setPilot(5);        
        assertEquals(11, getFixture().getMatrixZustandMax());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.MatrixDevice#getGeraetestufe() <em>Geraetestufe</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.MatrixDevice#getGeraetestufe()
     * @generated not
     */
    public void testGetGeraetestufe() {
       getFixture().setPilot(2);       
       assertEquals(2, getFixture().getGeraetestufe());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.MatrixDevice#getFirewall() <em>Firewall</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.MatrixDevice#getFirewall()
     * @generated not
     */
    public void testGetFirewall() {
        getFixture().setPilot(2);       
        assertEquals(2, getFixture().getFirewall());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.MatrixDevice#getDatenverarbeitung() <em>Datenverarbeitung</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.MatrixDevice#getDatenverarbeitung()
     * @generated not
     */
    public void testGetDatenverarbeitung() {
        getFixture().setPilot(2);       
        assertEquals(2, getFixture().getDatenverarbeitung());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Drohne#getProgramSlotCount() <em>Program Slot Count</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Drohne#getProgramSlotCount()
     * @generated not
     */
    public void testGetProgramSlotCount() {
        getFixture().setPilot(2);       
        assertEquals(1, getFixture().getProgramSlotCount());
        getFixture().setPilot(3);       
        assertEquals(1, getFixture().getProgramSlotCount());
        getFixture().setPilot(5);       
        assertEquals(2, getFixture().getProgramSlotCount());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.FahrzeugZustand#getZustandMax() <em>Zustand Max</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.FahrzeugZustand#getZustandMax()
     * @generated not
     */
    public void testGetZustandMax() {
        getFixture().setRumpf(5);
        assertEquals(8,getFixture().getZustandMax());
    }

} //DrohneTest
