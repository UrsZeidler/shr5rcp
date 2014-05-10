/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import de.urszeidler.eclipse.shr5.Cyberdeck;
import de.urszeidler.eclipse.shr5.Shr5Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cyberdeck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.ActiveMatixDevice#getAngriff() <em>Angriff</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ActiveMatixDevice#getSchleicher() <em>Schleicher</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CyberdeckTest extends ComlinkTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(CyberdeckTest.class);
    }

    /**
     * Constructs a new Cyberdeck test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CyberdeckTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Cyberdeck test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Cyberdeck getFixture() {
        return (Cyberdeck)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated not
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createCyberdeck());
        getFixture().setDeviceRating(2);
        
        getFixture().getAttributes().add(2);
        getFixture().getAttributes().add(2);
        getFixture().getAttributes().add(2);
        getFixture().getAttributes().add(2);

        getFixture().getAttributes().add(2);

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
     * Tests the '{@link de.urszeidler.eclipse.shr5.ActiveMatixDevice#getAngriff() <em>Angriff</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ActiveMatixDevice#getAngriff()
     * @generated not
     */
    public void testGetAngriff() {
        assertEquals(2, getFixture().getAngriff());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.ActiveMatixDevice#getSchleicher() <em>Schleicher</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ActiveMatixDevice#getSchleicher()
     * @generated not
     */
    public void testGetSchleicher() {
        assertEquals(2, getFixture().getSchleicher());
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

} //CyberdeckTest
