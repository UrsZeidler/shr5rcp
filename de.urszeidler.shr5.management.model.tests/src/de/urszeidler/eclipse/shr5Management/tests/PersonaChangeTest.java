/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Initation;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Persona Change</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class PersonaChangeTest extends PersonaValueChangeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(PersonaChangeTest.class);
    }

    /**
     * Constructs a new Persona Change test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public PersonaChangeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Persona Change test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected PersonaChange getFixture() {
        return (PersonaChange)fixture;
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
        setFixture(Shr5managementFactory.eINSTANCE.createPersonaChange());
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
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost() <em>Karma Cost</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost()
     * @generated not
     */
    public void testGetKarmaCost() {
        // fail();
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
        getFixture().setChangeable(value);

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
        getFixture().setChangeable(value);
        // getFixture().setQuallity(value);
        // getFixture().setAdded(false);

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
        PersonaFertigkeit personaFertigkeit = playerCharacter.getPersona().getFertigkeiten().get(0);
        int value = personaFertigkeit.getStufe();
        getFixture().setChangeable(personaFertigkeit);
        // getFixture().setFrom(2);
        // getFixture().setTo(3);

        playerCharacter.getChanges().add(getFixture());
        assertEquals((value + 1) * -2, getFixture().getKarmaCost());

        getFixture().applyChanges();
        assertEquals(value + 1, personaFertigkeit.getStufe());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Changes#applyChanges() <em>Apply Changes</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Changes#applyChanges()
     * @generated not
     */
    public void testApplyChanges() {
        PersonaFertigkeit personaFertigkeit = playerCharacter.getPersona().getFertigkeiten().get(0);
        int value = personaFertigkeit.getStufe();
        getFixture().setChangeable(personaFertigkeit);
        // getFixture().setFrom(2);
        // getFixture().setTo(3);

        playerCharacter.getChanges().add(getFixture());

        getFixture().applyChanges();

        assertEquals(true, getFixture().isChangeApplied());
        assertNotNull(getFixture().getDateApplied());

    }

    /**
     * @see de.urszeidler.eclipse.shr5Management.Changes#applyChanges()
     * @generated not
     */
    public void testApplyChanges_QuallityAdd() {
        getFixture().setCharacter(playerCharacter);

        PersonaEigenschaft value = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
        value.setKarmaKosten(10);
        getFixture().setChangeable(value);
        assertFalse(ShadowrunManagmentTools.hasEigenschaft(playerCharacter, value));

        assertEquals(getFixture().getTo(), 1);
        getFixture().applyChanges();

        assertEquals(true, getFixture().isChangeApplied());
        assertNotNull(getFixture().getDateApplied());

        assertTrue(ShadowrunManagmentTools.hasEigenschaft(playerCharacter, value));
    }

    /**
     * @see de.urszeidler.eclipse.shr5Management.Changes#applyChanges()
     * @generated not
     */
    public void testApplyChanges_QuallityRemove() {
        getFixture().setCharacter(playerCharacter);

        PersonaEigenschaft value = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
        if (playerCharacter.getPersona() instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)playerCharacter.getPersona();
            kp.getEigenschaften().add(value);
        }

        value.setKarmaKosten(10);
        getFixture().setChangeable(value);

        assertTrue(ShadowrunManagmentTools.hasEigenschaft(playerCharacter, value));

        assertEquals(getFixture().getTo(), 0);
        getFixture().applyChanges();

        assertEquals(true, getFixture().isChangeApplied());
        assertNotNull(getFixture().getDateApplied());
        assertFalse(ShadowrunManagmentTools.hasEigenschaft(playerCharacter, value));
    }

    /**
     * @see de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost()
     * @generated not
     */
    public void testApplyChanges_Skill_Increase() {
        PersonaFertigkeit personaFertigkeit = playerCharacter.getPersona().getFertigkeiten().get(0);
        int value = personaFertigkeit.getStufe();
        getFixture().setChangeable(personaFertigkeit);

        playerCharacter.getChanges().add(getFixture());
        assertEquals((value + 1) * -2, getFixture().getKarmaCost());
        assertEquals(getFixture().getFrom(), value);
        assertEquals(getFixture().getTo(), value + 1);

        getFixture().applyChanges();
        assertEquals(value + 1, personaFertigkeit.getStufe());
        assertEquals(true, getFixture().isChangeApplied());
        assertNotNull(getFixture().getDateApplied());
    }

    /**
     * @see de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost()
     * @generated not
     */
    public void testApplyChanges_Skill_New() {
        PersonaFertigkeit fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        assertFalse(playerCharacter.getPersona().getFertigkeiten().contains(fertigkeit));
        fertigkeit.setFertigkeit(Shr5Factory.eINSTANCE.createFertigkeit());

        getFixture().setChangeable(fertigkeit);

        playerCharacter.getChanges().add(getFixture());
        assertEquals(-2, getFixture().getKarmaCost());
        assertEquals(getFixture().getFrom(), 0);
        assertEquals(getFixture().getTo(), 1);

        getFixture().applyChanges();
        assertEquals(1, fertigkeit.getStufe());
        assertTrue(playerCharacter.getPersona().getFertigkeiten().contains(fertigkeit));
        assertEquals(true, getFixture().isChangeApplied());
        assertNotNull(getFixture().getDateApplied());
    }

    /**
     * @see de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost()
     * @generated not
     */
    public void testApplyChanges_SkillGroup_Increase() {
        PersonaFertigkeitsGruppe fertigkeitsGruppe = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
        fertigkeitsGruppe.setGruppe(Shr5Factory.eINSTANCE.createFertigkeitsGruppe());
        playerCharacter.getPersona().getFertigkeitsGruppen().add(fertigkeitsGruppe);
        fertigkeitsGruppe.setStufe(1);
        getFixture().setChangeable(fertigkeitsGruppe);

        playerCharacter.getChanges().add(getFixture());
        assertEquals(-10, getFixture().getKarmaCost());
        assertEquals(getFixture().getFrom(), 1);
        assertEquals(getFixture().getTo(), 2);

        getFixture().applyChanges();
        assertEquals(2, fertigkeitsGruppe.getStufe());
        assertEquals(true, getFixture().isChangeApplied());
        assertNotNull(getFixture().getDateApplied());
    }
    /**
     * @see de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost()
     * @generated not
     */
    public void testApplyChanges_SkillGroup_New() {
        PersonaFertigkeitsGruppe fertigkeitsGruppe = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
        fertigkeitsGruppe.setGruppe(Shr5Factory.eINSTANCE.createFertigkeitsGruppe());
        //playerCharacter.getPersona().getFertigkeitsGruppen().add(fertigkeitsGruppe);
        //fertigkeitsGruppe.setStufe(1);
        getFixture().setChangeable(fertigkeitsGruppe);

        playerCharacter.getChanges().add(getFixture());
        assertEquals(-5, getFixture().getKarmaCost());
        assertEquals(getFixture().getFrom(), 0);
        assertEquals(getFixture().getTo(), 1);

        getFixture().applyChanges();
        assertEquals(1, fertigkeitsGruppe.getStufe());
        assertTrue(playerCharacter.getPersona().getFertigkeitsGruppen().contains(fertigkeitsGruppe));
        assertEquals(true, getFixture().isChangeApplied());
        assertNotNull(getFixture().getDateApplied());
    }

} // PersonaChangeTest
