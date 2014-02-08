/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import de.urszeidler.eclipse.shr5.Initation;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5Management.PersonaInitation;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Persona Initation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonaInitationTest extends ChangesTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(PersonaInitationTest.class);
    }

    /**
     * Constructs a new Persona Initation test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PersonaInitationTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Persona Initation test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected PersonaInitation getFixture() {
        return (PersonaInitation)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5managementFactory.eINSTANCE.createPersonaInitation());
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
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost() <em>Karma Cost</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost()
     * @generated not
     */
    public void testGetKarmaCost() {
        getFixture().setCharacter(playerCharacter);

        Initation value = Shr5Factory.eINSTANCE.createInitation();
        value.setStufe(1);
        getFixture().setGarde(value);
       

        assertEquals(-13, getFixture().getKarmaCost());
    }

} //PersonaInitationTest
