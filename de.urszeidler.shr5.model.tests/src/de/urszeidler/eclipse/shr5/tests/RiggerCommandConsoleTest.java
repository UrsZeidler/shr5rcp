/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.RiggerCommandConsole;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rigger Command Console</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getRauschunterdrueckung() <em>Rauschunterdrueckung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getZugriff() <em>Zugriff</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RiggerCommandConsoleTest extends CommlinkTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(RiggerCommandConsoleTest.class);
    }

    /**
     * Constructs a new Rigger Command Console test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RiggerCommandConsoleTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Rigger Command Console test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected RiggerCommandConsole getFixture() {
        return (RiggerCommandConsole)fixture;
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
        setFixture(Shr5Factory.eINSTANCE.createRiggerCommandConsole());
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
     * Tests the '{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getRauschunterdrueckung() <em>Rauschunterdrueckung</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.RiggerCommandConsole#getRauschunterdrueckung()
     * @generated not
     */
    public void testGetRauschunterdrueckung() {
        getFixture().setZugriffBasis(1);
        assertEquals(1, getFixture().getRauschunterdrueckung());
        
        getFixture().setDeviceRating(4);
        assertEquals(3, getFixture().getRauschunterdrueckung());    
        getFixture().setDeviceRating(2);
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.RiggerCommandConsole#getZugriff() <em>Zugriff</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.RiggerCommandConsole#getZugriff()
     * @generated not
     */
    public void testGetZugriff() {
        getFixture().setZugriffBasis(1);
        assertEquals(1, getFixture().getZugriff());
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
        getFixture().setFirewallBasis(4);
        assertEquals(4, getFixture().getFirewall());
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
        getFixture().setDatenverarbeitungBasis(3);
        assertEquals(3, getFixture().getDatenverarbeitung());
    }

} // RiggerCommandConsoleTest
