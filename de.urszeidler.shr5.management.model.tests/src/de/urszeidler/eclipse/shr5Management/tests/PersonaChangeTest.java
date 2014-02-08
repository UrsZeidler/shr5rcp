/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import de.urszeidler.eclipse.shr5.Initation;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Persona Change</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonaChangeTest extends PersonaValueChangeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(PersonaChangeTest.class);
    }

    /**
     * Constructs a new Persona Change test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PersonaChangeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Persona Change test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected PersonaChange getFixture() {
        return (PersonaChange)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5managementFactory.eINSTANCE.createPersonaChange());
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
    public void testGetKarmaCost_Initation() {
        getFixture().setCharacter(playerCharacter);

        Initation value = Shr5Factory.eINSTANCE.createInitation();
        value.setStufe(1);
        //getFixture().setGarde(value);
       

        assertEquals(-13, getFixture().getKarmaCost());
    }
    
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost() <em>Karma Cost</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost()
     * @generated not
     */
    public void testGetKarmaCost_Quallity() {
        getFixture().setCharacter(playerCharacter);

        PersonaEigenschaft value = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
        value.setKarmaKosten(10);
//        getFixture().setQuallity(value);
//        getFixture().setAdded(false);

        assertEquals(-20, getFixture().getKarmaCost());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost() <em>Karma Cost</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost()
     * @generated not
     */
    public void testGetKarmaCost_Skill() {
        getFixture().setChangeable(playerCharacter.getPersona().getFertigkeiten().get(0));
        getFixture().setFrom(2);
        getFixture().setTo(3);
        
        playerCharacter.getChanges().add(getFixture());
        assertEquals(-6, getFixture().getKarmaCost());
    }


} //PersonaChangeTest
