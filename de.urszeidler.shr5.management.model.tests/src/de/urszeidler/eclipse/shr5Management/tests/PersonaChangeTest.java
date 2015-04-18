/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.textui.TestRunner;

import org.eclipse.emf.common.util.EList;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Initation;
import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.MagieFokus;
import de.urszeidler.eclipse.shr5.MartialartStyle;
import de.urszeidler.eclipse.shr5.MysticAdept;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaKomplexForm;
import de.urszeidler.eclipse.shr5.PersonaMartialartStyle;
import de.urszeidler.eclipse.shr5.PersonaMartialartTechnique;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Spezialisierung;
import de.urszeidler.eclipse.shr5.Technomancer;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;

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
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost() <em>Karma Cost</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost()
     * @generated not
     */
    public void testGetKarmaCost_SkillSpecialism() {
        PersonaFertigkeit personaFertigkeit = playerCharacter.getPersona().getFertigkeiten().get(0);
        Spezialisierung spezialisierung = personaFertigkeit.getFertigkeit().getSpezialisierungen().get(0);
        getFixture().setChangeable(spezialisierung);

        playerCharacter.getChanges().add(getFixture());
        assertEquals(-7, getFixture().getKarmaCost());

        getFixture().applyChanges();
        assertEquals(true, personaFertigkeit.getSpezialisierungen().contains(spezialisierung));
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost() <em>Karma Cost</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost()
     * @generated not
     */
    public void testGetKarmaCost_FokusBinding() {
        MagieFokus magieFokus = Shr5Factory.eINSTANCE.createMagieFokus();
        magieFokus.setBindungsFaktor(2);
        magieFokus.setStufe(2);

        getFixture().setChangeable(magieFokus);

        playerCharacter.getChanges().add(getFixture());
        assertEquals(-4, getFixture().getKarmaCost());

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
        getFixture().setChangeable(personaFertigkeit);

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
    public void testApplyChanges_MartialArtStyle_Add() {
        PersonaFertigkeit personaFertigkeit = playerCharacter.getPersona().getFertigkeiten().get(0);
        PersonaMartialartStyle pmas = Shr5Factory.eINSTANCE.createPersonaMartialartStyle();
        MartialartStyle style = Shr5Factory.eINSTANCE.createMartialartStyle();
        style.getUsableWith().add(personaFertigkeit.getFertigkeit());
        pmas.setStyle(style);
        
        getFixture().setChangeable(pmas);

        playerCharacter.getChanges().add(getFixture());
        assertEquals(-7, getFixture().getKarmaCost());
        assertEquals(getFixture().getFrom(), 0);
        assertEquals(getFixture().getTo(), 1);

        getFixture().applyChanges();
        assertEquals(true, personaFertigkeit.getSpezialisierungen().contains(pmas));
        assertEquals(true, playerCharacter.getPersona().getMartialartStyles().contains(pmas));
        assertEquals(true, getFixture().isChangeApplied());
        assertNotNull(getFixture().getDateApplied());
    }

    /**
     * @see de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost()
     * @generated not
     */
    public void testApplyChanges_MartialArtTechnique_Add() {
        PersonaFertigkeit personaFertigkeit = playerCharacter.getPersona().getFertigkeiten().get(0);
        PersonaMartialartStyle pmas = Shr5Factory.eINSTANCE.createPersonaMartialartStyle();
        PersonaMartialartTechnique technique = Shr5Factory.eINSTANCE.createPersonaMartialartTechnique();
        personaFertigkeit.getSpezialisierungen().add(pmas);
        
        getFixture().setChangeable(technique);

        playerCharacter.getChanges().add(getFixture());
        assertEquals(-5, getFixture().getKarmaCost());
        assertEquals(getFixture().getFrom(), 0);
        assertEquals(getFixture().getTo(), 1);

        getFixture().applyChanges();
//        assertEquals(true, pmas.getTechniques().contains(technique)); // TODO: 
        assertEquals(true, getFixture().isChangeApplied());
        assertNotNull(getFixture().getDateApplied());
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
    public void testApplyChanges_SkillSpecalism_Add() {
        PersonaFertigkeit personaFertigkeit = playerCharacter.getPersona().getFertigkeiten().get(0);
        Spezialisierung spezialisierung = personaFertigkeit.getFertigkeit().getSpezialisierungen().get(0);
        getFixture().setChangeable(spezialisierung);

        playerCharacter.getChanges().add(getFixture());
        assertEquals(-7, getFixture().getKarmaCost());
        assertEquals(getFixture().getFrom(), 0);
        assertEquals(getFixture().getTo(), 1);

        getFixture().applyChanges();
        assertEquals(true, personaFertigkeit.getSpezialisierungen().contains(spezialisierung));
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
        // playerCharacter.getPersona().getFertigkeitsGruppen().add(fertigkeitsGruppe);
        // fertigkeitsGruppe.setStufe(1);
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

    /**
     * @see de.urszeidler.eclipse.shr5Management.Changes#applyChanges()
     * @generated not
     */
    public void testApplyChanges_SpellAdd() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMysticAdeptCharacter();
        getFixture().setCharacter(playerCharacter);

        PersonaZauber value = Shr5Factory.eINSTANCE.createPersonaZauber();
        // value.setKarmaKosten(10);
        getFixture().setChangeable(value);
        // assertFalse(ShadowrunManagmentTools.hasEigenschaft(playerCharacter, value));

        assertEquals(getFixture().getTo(), 1);
        getFixture().applyChanges();

        assertEquals(true, getFixture().isChangeApplied());
        assertNotNull(getFixture().getDateApplied());

        AbstraktPersona persona = playerCharacter.getPersona();
        // assertTrue(ShadowrunManagmentTools.hasEigenschaft(playerCharacter, value));
        if (persona instanceof MysticAdept) {
            MysticAdept ma = (MysticAdept)persona;
            EList<PersonaZauber> zauber = ma.getZauber();
            assertTrue(zauber.contains(value));
        } else
            fail();
    }

    /**
     * @see de.urszeidler.eclipse.shr5Management.Changes#applyChanges()
     * @generated not
     */
    public void testApplyChanges_BindFokus() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMysticAdeptCharacter();
        getFixture().setCharacter(playerCharacter);

        MagieFokus magieFokus = Shr5Factory.eINSTANCE.createMagieFokus();
        magieFokus.setBindungsFaktor(2);
        magieFokus.setStufe(2);

        getFixture().setChangeable(magieFokus);

        playerCharacter.getChanges().add(getFixture());
        assertEquals(-4, getFixture().getKarmaCost());
        assertEquals(getFixture().getTo(), 1);
        getFixture().applyChanges();

        assertEquals(true, getFixture().isChangeApplied());
        assertNotNull(getFixture().getDateApplied());

        AbstraktPersona persona = playerCharacter.getPersona();
        // assertTrue(ShadowrunManagmentTools.hasEigenschaft(playerCharacter, value));
        if (persona instanceof MysticAdept) {
            MysticAdept ma = (MysticAdept)persona;
            assertEquals(1, ma.getBoundFoki().size());
            assertTrue(ma.getBoundFoki().get(0).getFokus().equals(magieFokus));
        } else
            fail();
    }

    /**
     * @see de.urszeidler.eclipse.shr5Management.Changes#applyChanges()
     * @generated not
     */
    public void testApplyChanges_InitationAdd() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMysticAdeptCharacter();
        getFixture().setCharacter(playerCharacter);

        Initation value = Shr5Factory.eINSTANCE.createInitation();
        // value.setKarmaKosten(10);
        getFixture().setChangeable(value);
        // assertFalse(ShadowrunManagmentTools.hasEigenschaft(playerCharacter, value));

        assertEquals(getFixture().getTo(), 1);
        getFixture().applyChanges();

        assertEquals(true, getFixture().isChangeApplied());
        assertNotNull(getFixture().getDateApplied());

        AbstraktPersona persona = playerCharacter.getPersona();
        // assertTrue(ShadowrunManagmentTools.hasEigenschaft(playerCharacter, value));
        if (persona instanceof MysticAdept) {
            MysticAdept ma = (MysticAdept)persona;
            EList<Initation> zauber = ma.getInitationen();
            assertTrue(zauber.contains(value));
        } else
            fail();
    }

    /**
     * @see de.urszeidler.eclipse.shr5Management.Changes#applyChanges()
     * @generated not
     */
    public void testApplyChanges_KiPowerAdd() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMysticAdeptCharacter();
        getFixture().setCharacter(playerCharacter);

        KiKraft value = Shr5Factory.eINSTANCE.createKiKraft();
        // value.setKarmaKosten(10);
        getFixture().setChangeable(value);
        // assertFalse(ShadowrunManagmentTools.hasEigenschaft(playerCharacter, value));

        assertEquals(getFixture().getTo(), 1);
        getFixture().applyChanges();

        assertEquals(true, getFixture().isChangeApplied());
        assertNotNull(getFixture().getDateApplied());

        AbstraktPersona persona = playerCharacter.getPersona();
        // assertTrue(ShadowrunManagmentTools.hasEigenschaft(playerCharacter, value));
        if (persona instanceof MysticAdept) {
            MysticAdept ma = (MysticAdept)persona;
            EList<KiKraft> kikraft = ma.getKikraft();
            assertTrue(kikraft.contains(value));
        } else
            fail();
    }

    /**
     * @see de.urszeidler.eclipse.shr5Management.Changes#applyChanges()
     * @generated not
     */
    public void testApplyChanges_ResonazAdd() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createTechnoCharacter();
        getFixture().setCharacter(playerCharacter);

        PersonaKomplexForm value = Shr5Factory.eINSTANCE.createPersonaKomplexForm();
        // value.setKarmaKosten(10);
        getFixture().setChangeable(value);
        // assertFalse(ShadowrunManagmentTools.hasEigenschaft(playerCharacter, value));

        assertEquals(getFixture().getTo(), 1);
        getFixture().applyChanges();

        assertEquals(true, getFixture().isChangeApplied());
        assertNotNull(getFixture().getDateApplied());

        AbstraktPersona persona = playerCharacter.getPersona();
        // assertTrue(ShadowrunManagmentTools.hasEigenschaft(playerCharacter, value));
        if (persona instanceof Technomancer) {
            Technomancer ma = (Technomancer)persona;
            EList<PersonaKomplexForm> zauber = ma.getComplexForms();
            assertTrue(zauber.contains(value));
        } else
            fail();
    }

} // PersonaChangeTest
