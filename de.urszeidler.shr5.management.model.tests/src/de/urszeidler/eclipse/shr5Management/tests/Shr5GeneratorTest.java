/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Map;

import junit.textui.TestRunner;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.GebundenerGeist;
import de.urszeidler.eclipse.shr5.Gegenstand;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.Lifestyle;
import de.urszeidler.eclipse.shr5.Magier;
import de.urszeidler.eclipse.shr5.MudanPersona;
import de.urszeidler.eclipse.shr5.MysticAdept;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaKomplexForm;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.Zauberer;
import de.urszeidler.eclipse.shr5Management.Attributes;
import de.urszeidler.eclipse.shr5Management.Connection;
import de.urszeidler.eclipse.shr5Management.MetaType;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Skill;
import de.urszeidler.eclipse.shr5Management.SpecialType;
import de.urszeidler.eclipse.shr5Management.Spellcaster;
import de.urszeidler.eclipse.shr5Management.Technomancer;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;

/**
 * <!-- begin-user-doc --> A test case for the model object ' <em><b>Shr5 Generator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getKarmaSpend() <em>Karma Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getAttributeSpend() <em>Attribute Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getResourceSpend() <em>Resource Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getConnectionSpend() <em>Connection Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSkillPointSpend() <em>Skill Point Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpecialPointSpend() <em>Special Point Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getGroupPointSpend() <em>Group Point Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getKnownlegePointSpend() <em>Knownlege Point Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpellPointSpend() <em>Spell Point Spend</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasCategoryOnlyOnce(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Category Only Once</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllAttributesPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Attributes Points</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSkillPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Skill Points</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpecialPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Special Points</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpecialTypePoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Special Type Points</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllConnectionPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Connection Points</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllResourcePoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Resource Points</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllMagicSkillsPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Magic Skills Points</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllMagicPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Magic Points</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllGroupPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Group Points</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllKnowlegeSkillPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Knowlege Skill Points</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllKarmaPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Karma Points</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpellPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Spell Points</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllPowerPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Power Points</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class Shr5GeneratorTest extends Shr5RuleGeneratorTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(Shr5GeneratorTest.class);
    }

    protected Attributes attributes;
    protected MetaType metaType;
    protected Skill skill;
    protected SpecialType mudan;
    protected Resourcen resourcen;

    /**
     * Constructs a new Shr5 Generator test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Shr5GeneratorTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Shr5 Generator test case. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected Shr5Generator getFixture() {
        return (Shr5Generator)fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated not
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5managementFactory.eINSTANCE.createShr5Generator());
        Shr5System system = Shr5managementFactory.eINSTANCE.createShr5System();
        system.setKarmaPoints(20);
        getFixture().setGenerator(system);

    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }

    /**
     * Creates a simple mudan character.
     * 
     * @return
     */
    public static PlayerCharacter createMudanCharacter() {
        PlayerCharacter character = Shr5managementFactory.eINSTANCE.createPlayerCharacter();
        MudanPersona persona = Shr5Factory.eINSTANCE.createMudanPersona();
        Spezies spezies = Shr5Factory.eINSTANCE.createSpezies();
        persona.setSpezies(spezies);

        character.setPersona(persona);
        return character;
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getResourceSpend() <em>Resource Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getResourceSpend()
     * @generated not
     */
    public void testcalcKarma4Resource() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);
        shr5System.setKarmaToResourceFactor(2000);

        assertEquals("Should be 0", 0, ShadowrunManagmentTools.calcKarmaSpendByResources(character));
        resourcen.setResource(10000);
        assertEquals("is 5", 5, ShadowrunManagmentTools.calcKarmaSpendByResources(character));

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpellPointSpend() <em>Spell Point Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpellPointSpend()
     * @generated not
     */
    public void testcalcKarma4Spells() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createZaubererCharacter();// .createMudanCharacter();
        getFixture().setCharacter(character);
        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getShr5Generator());


        assertEquals("should be 0", 0, ShadowrunManagmentTools.calcKarmaSpendBySpellsOrForms(character, shr5System.getCharacterAdvancements()));

        Zauberer z = (Zauberer)character.getPersona();
        PersonaZauber personaZauber = Shr5Factory.eINSTANCE.createPersonaZauber();
        z.getZauber().add(personaZauber);

        personaZauber = Shr5Factory.eINSTANCE.createPersonaZauber();
        z.getZauber().add(personaZauber);

        assertEquals("should be 10", 10, ShadowrunManagmentTools.calcKarmaSpendBySpellsOrForms(character, shr5System.getCharacterAdvancements()));

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpellPointSpend() <em>Spell Point Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpellPointSpend()
     * @generated not
     */
    public void testcalcKarma4Spells1() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMysticAdeptCharacter();// .createMudanCharacter();
        getFixture().setCharacter(character);
        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getShr5Generator());


        assertEquals("should be 0", 0, ShadowrunManagmentTools.calcKarmaSpendBySpellsOrForms(character, shr5System.getCharacterAdvancements()));

        Zauberer z = (Zauberer)character.getPersona();
        PersonaZauber personaZauber = Shr5Factory.eINSTANCE.createPersonaZauber();
        z.getZauber().add(personaZauber);

        personaZauber = Shr5Factory.eINSTANCE.createPersonaZauber();
        z.getZauber().add(personaZauber);

        assertEquals("should be 10", 10, ShadowrunManagmentTools.calcKarmaSpendBySpellsOrForms(character, shr5System.getCharacterAdvancements()));

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpellPointSpend() <em>Spell Point Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpellPointSpend()
     * @generated not
     */
    public void testcalcKarma4KomplexForms() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createTechnoCharacter();
        getFixture().setCharacter(character);
        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getShr5Generator());


        assertEquals("should be 0", 0, ShadowrunManagmentTools.calcKarmaSpendBySpellsOrForms(character, shr5System.getCharacterAdvancements()));

        de.urszeidler.eclipse.shr5.Technomancer t = (de.urszeidler.eclipse.shr5.Technomancer)character.getPersona();
        PersonaKomplexForm personaZauber = Shr5Factory.eINSTANCE.createPersonaKomplexForm();
        t.getComplexForms().add(personaZauber);

        personaZauber = Shr5Factory.eINSTANCE.createPersonaKomplexForm();
        t.getComplexForms().add(personaZauber);

        assertEquals("should be 10", 10, ShadowrunManagmentTools.calcKarmaSpendBySpellsOrForms(character, shr5System.getCharacterAdvancements()));

    }

    /**
     * Tests the ' {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getKarmaSpend()
     * <em>Karma Spend</em>}' feature getter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getKarmaSpend()
     * @generated not
     */
    public void testGetKarmaSpend() {

        PlayerCharacter playerCharacter = createMudanCharacter();
        getFixture().setCharacter(playerCharacter);

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());

        PersonaEigenschaft eigenschaft = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
        eigenschaft.setKarmaKosten(-2);
        ((KoerperPersona)playerCharacter.getPersona()).getEigenschaften().add(eigenschaft);
        assertEquals("2 spend", -2, getFixture().getKarmaSpend());

        eigenschaft = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
        eigenschaft.setKarmaKosten(-2);
        ((KoerperPersona)playerCharacter.getPersona()).getEigenschaften().add(eigenschaft);
        assertEquals("4 spend", -4, getFixture().getKarmaSpend());

    }

    /**
     * Tests the ' {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getKarmaSpend()
     * <em>Karma Spend</em>}' feature getter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getKarmaSpend()
     * @generated not
     */
    public void testGetKarmaSpend_MysticAdept() {
        createBasicCategories();
        shr5System.setKarmaToMagicFactor(1);

        PlayerCharacter playerCharacter = PriorityCategorieTest.createMysticAdeptCharacter();
        getFixture().setCharacter(playerCharacter);

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());

        PersonaEigenschaft eigenschaft = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
        eigenschaft.setKarmaKosten(2);
        ((KoerperPersona)playerCharacter.getPersona()).getEigenschaften().add(eigenschaft);
        assertEquals("2 spend", 2, getFixture().getKarmaSpend());

        eigenschaft = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
        eigenschaft.setKarmaKosten(2);
        ((KoerperPersona)playerCharacter.getPersona()).getEigenschaften().add(eigenschaft);
        assertEquals("4 spend", 4, getFixture().getKarmaSpend());

        KiAdept ka = (KiAdept)playerCharacter.getPersona();

        KiKraft kiKraft = Shr5Factory.eINSTANCE.createKiKraft();
        kiKraft.setKraftpunkte(-100);
        ka.getKikraft().add(kiKraft);
        assertEquals("5 spend", 5, getFixture().getKarmaSpend());
        kiKraft = Shr5Factory.eINSTANCE.createKiKraft();
        kiKraft.setKraftpunkte(-100);
        ka.getKikraft().add(kiKraft);
        assertEquals("6 spend", 6, getFixture().getKarmaSpend());

        kiKraft = Shr5Factory.eINSTANCE.createKiKraft();
        kiKraft.setKraftpunkte(-80);
        ka.getKikraft().add(kiKraft);
        assertEquals("7 spend", 7, getFixture().getKarmaSpend());

    }

    /**
     * Tests the ' {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getKarmaSpend()
     * <em>Karma Spend</em>}' feature getter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getKarmaSpend()
     * @generated not
     */
    public void testGetKarmaSpend_Zauberer_BoundSpirit() {
        createBasicCategories();
        shr5System.setBoundSprititServiceCost(1);

        PlayerCharacter playerCharacter = PriorityCategorieTest.createMysticAdeptCharacter();
        getFixture().setCharacter(playerCharacter);

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());

        
        MysticAdept persona = (MysticAdept)playerCharacter.getPersona();
        GebundenerGeist gebundenerGeist = Shr5Factory.eINSTANCE.createGebundenerGeist();       
        gebundenerGeist.setDienste(2);
        persona.getGebundeneGeister().add(gebundenerGeist);
        
        assertEquals("2 spend", 2, getFixture().getKarmaSpend());
 
        gebundenerGeist = Shr5Factory.eINSTANCE.createGebundenerGeist();       
        gebundenerGeist.setDienste(3);
        persona.getGebundeneGeister().add(gebundenerGeist);
        assertEquals("5 spend", 5, getFixture().getKarmaSpend());

    }

    /**
     * Tests the ' {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getShr5Generator()
     * <em>Shr5 Generator</em>}' feature getter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getShr5Generator()
     * @generated not
     */

    public void testGetShr5Generator() {

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getAttributeSpend() <em>Attribute Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getAttributeSpend()
     * @generated not
     */
    public void testGetAttributeSpend() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        assertEquals("Should be 0", 0, getFixture().getAttributeSpend());
        character.getPersona().setIntuitionBasis(1);
        assertEquals("Should be 1", 1, getFixture().getAttributeSpend());

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getResourceSpend() <em>Resource Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getResourceSpend()
     * @generated not
     */
    public void testGetResourceSpend() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        assertEquals("Should be 0", 0, getFixture().getResourceSpend());
        Gegenstand gegenstand = Shr5Factory.eINSTANCE.createGegenstand();
        gegenstand.setWertValue(new BigDecimal(99));
        character.getInventar().add(gegenstand);
        assertEquals("is 99", 99, getFixture().getResourceSpend());

        Lifestyle lifestyle = Shr5Factory.eINSTANCE.createLifestyle();
        lifestyle.setWertValue(new BigDecimal(1));
        character.getContracts().add(lifestyle);

        assertEquals("is 100", 100, getFixture().getResourceSpend());

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getConnectionSpend() <em>Connection Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getConnectionSpend()
     * @generated not
     */
    public void testGetConnectionSpend() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);
        getFixture().getShr5Generator().setCharismaToConnectionFactor(3);

        Connection connection = Shr5managementFactory.eINSTANCE.createConnection();
        getFixture().getCharacter().getConnections().add(connection);

        connection.setInfluence(1);
        assertEquals("shoul be 1", 1, getFixture().getConnectionSpend());
        connection.setLoyality(2);
        assertEquals("shoul be 3", 3, getFixture().getConnectionSpend());

        connection = Shr5managementFactory.eINSTANCE.createConnection();
        getFixture().getCharacter().getConnections().add(connection);
        connection.setInfluence(1);
        assertEquals("shoul be 4", 4, getFixture().getConnectionSpend());
        connection.setLoyality(2);
        assertEquals("shoul be 6", 6, getFixture().getConnectionSpend());

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSkillPointSpend() <em>Skill Point Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getSkillPointSpend()
     * @generated not
     */
    public void testGetSkillPointSpend() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        skill.setSkillPoints(2);
        assertEquals("should be 0", 0, getFixture().getSkillPointSpend());
        PersonaFertigkeit fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        Fertigkeit wfertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setFertigkeit(wfertigkeit);
        fertigkeit.setStufe(1);
        character.getPersona().getFertigkeiten().add(fertigkeit);
        assertEquals("should be 1", 1, getFixture().getSkillPointSpend());

        fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        wfertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setFertigkeit(wfertigkeit);
        fertigkeit.setStufe(2);
        character.getPersona().getFertigkeiten().add(fertigkeit);
        assertEquals("should be 3", 3, getFixture().getSkillPointSpend());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpecialPointSpend() <em>Special Point Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpecialPointSpend()
     * @generated not
     */
    public void testGetSpecialPointSpend() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        assertEquals("schould be 0", 0, getFixture().getSpecialPointSpend());
        character.getPersona().setEdgeBasis(1);
        assertEquals("schould be 1", 1, getFixture().getSpecialPointSpend());
        character.getPersona().setEdgeBasis(3);
        assertEquals("schould be 3", 3, getFixture().getSpecialPointSpend());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getGroupPointSpend() <em>Group Point Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getGroupPointSpend()
     * @generated not
     */
    public void testGetGroupPointSpend() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        assertEquals("should be 0", 0, getFixture().getGroupPointSpend());
        PersonaFertigkeitsGruppe pfg = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
        FertigkeitsGruppe fg = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();
        pfg.setGruppe(fg);
        pfg.setStufe(1);
        character.getPersona().getFertigkeitsGruppen().add(pfg);
        assertEquals("should be 1", 1, getFixture().getGroupPointSpend());

        pfg = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
        fg = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();
        pfg.setGruppe(fg);
        pfg.setStufe(1);
        character.getPersona().getFertigkeitsGruppen().add(pfg);
        assertEquals("should be 2", 2, getFixture().getGroupPointSpend());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getKnownlegePointSpend() <em>Knownlege Point Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getKnownlegePointSpend()
     * @generated not
     */
    public void testGetKnownlegePointSpend() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        assertEquals("should be 0", 0, getFixture().getKnownlegePointSpend());
        PersonaFertigkeit fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        Fertigkeit wfertigkeit = Shr5Factory.eINSTANCE.createWissensfertigkeit();
        fertigkeit.setFertigkeit(wfertigkeit);
        fertigkeit.setStufe(1);
        character.getPersona().getFertigkeiten().add(fertigkeit);
        assertEquals("should be 1", 1, getFixture().getKnownlegePointSpend());

        fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        wfertigkeit = Shr5Factory.eINSTANCE.createWissensfertigkeit();
        fertigkeit.setFertigkeit(wfertigkeit);
        fertigkeit.setStufe(2);
        character.getPersona().getFertigkeiten().add(fertigkeit);
        assertEquals("should be 3", 3, getFixture().getKnownlegePointSpend());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpellPointSpend() <em>Spell Point Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpellPointSpend()
     * @generated not
     */
    public void testGetSpellPointSpend() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        assertEquals("should be -1", -1, getFixture().getSpellPointSpend());

    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasCategoryOnlyOnce(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Category Only Once</em>}' operation. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasCategoryOnlyOnce(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasCategoryOnlyOnce__DiagnosticChain_Map() {
        createBasicCategories();

        attributes.setCategorieName("A");
        metaType.setCategorieName("B");
        skill.setCategorieName("C");
        mudan.setCategorieName("D");
        resourcen.setCategorieName("E");

        Map<Object, Object> context = Collections.EMPTY_MAP;
        DiagnosticChain diagnostics = new BasicDiagnostic();
        assertEquals("is true", true, getFixture().hasCategoryOnlyOnce(diagnostics, context));

        resourcen.setCategorieName("A");
        assertEquals("is true", false, getFixture().hasCategoryOnlyOnce(diagnostics, context));

    }

    protected void createBasicCategories() {
        attributes = Shr5managementFactory.eINSTANCE.createAttributes();
        metaType = Shr5managementFactory.eINSTANCE.createMetaType();
        skill = Shr5managementFactory.eINSTANCE.createSkill();
        mudan = Shr5managementFactory.eINSTANCE.createMudan();
        resourcen = Shr5managementFactory.eINSTANCE.createResourcen();

        shr5System = Shr5managementFactory.eINSTANCE.createShr5System();
        shr5System.getPriorities().add(attributes);
        shr5System.getPriorities().add(metaType);
        shr5System.getPriorities().add(skill);
        shr5System.getPriorities().add(mudan);
        shr5System.getPriorities().add(resourcen);
        shr5System.setKnowlegeSkillFactor(2);

        getFixture().setAttribute(attributes);
        getFixture().setMetaType(metaType);
        getFixture().setSkills(skill);
        getFixture().setMagic(mudan);
        getFixture().setResourcen(resourcen);
        getFixture().setGenerator(shr5System);

    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Not Spend All Points</em>}' operation. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    public void testHasSpendAllPoints__DiagnosticChain_Map() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        assertMudanOptions(character);

    }

    @SuppressWarnings("unchecked")
    public void testHasSpendAllPoints__DiagnosticChain_Map_KiAdept() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createAdeptCharacter();
        getFixture().setCharacter(character);

        assertMudanOptions(character);
        skill.setSkillPoints(skill.getSkillPoints() + 5);// We need to add the 5
                                                         // of fertigkeit we
                                                         // already added in
                                                         // the
                                                         // assertMudan...
        mudan = Shr5managementFactory.eINSTANCE.createAdept();
        getFixture().setMagic(mudan);
        mudan.setSkillNumber(1);
        mudan.setSkillValue(5);
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));
        Fertigkeit f = Shr5Factory.eINSTANCE.createFertigkeit();
        mudan.getSelectableSkills().add(f);
        PersonaFertigkeit pfertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        pfertigkeit.setStufe(5);
        pfertigkeit.setFertigkeit(f);
        character.getPersona().getFertigkeiten().add(pfertigkeit);
        assertEquals("is true", true, getFixture().hasSpendAllPoints(diagnostics, context));
    }

    @SuppressWarnings("unchecked")
    public void testHasSpendAllPoints__DiagnosticChain_Map_Magier() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createZaubererCharacter();
        getFixture().setCharacter(character);

        assertMudanOptions(character);
        skill.setSkillPoints(skill.getSkillPoints() + 5);// We need to add the 5
                                                         // of fertigkeit we
                                                         // already added in
                                                         // the
                                                         // assertMudan...
        mudan = Shr5managementFactory.eINSTANCE.createSpellcaster();
        getFixture().setMagic(mudan);
        mudan.setSkillNumber(1);
        mudan.setSkillValue(5);
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));
        Fertigkeit f = Shr5Factory.eINSTANCE.createFertigkeit();
        mudan.getSelectableSkills().add(f);
        PersonaFertigkeit pfertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        pfertigkeit.setStufe(5);
        pfertigkeit.setFertigkeit(f);
        character.getPersona().getFertigkeiten().add(pfertigkeit);
        assertEquals("is true", true, getFixture().hasSpendAllPoints(diagnostics, context));

        Spellcaster sc = (Spellcaster)mudan;
        sc.setSpellPoints(2);
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));

        Magier t = (Magier)character.getPersona();
        PersonaZauber zauber = Shr5Factory.eINSTANCE.createPersonaZauber();
        t.getZauber().add(zauber);
        zauber.setStufe(2);
        assertEquals("is true", true, getFixture().hasSpendAllPoints(diagnostics, context));
    }

    @SuppressWarnings("unchecked")
    public void testHasSpendAllPoints__DiagnosticChain_Map_MysticAdept() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMysticAdeptCharacter();
        getFixture().setCharacter(character);

        assertMudanOptions(character);
        skill.setSkillPoints(skill.getSkillPoints() + 5);// We need to add the 5
                                                         // of fertigkeit we
                                                         // already added in
                                                         // the
                                                         // assertMudan...
        mudan = Shr5managementFactory.eINSTANCE.createSpellcaster();
        getFixture().setMagic(mudan);
        mudan.setSkillNumber(1);
        mudan.setSkillValue(5);
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));
        Fertigkeit f = Shr5Factory.eINSTANCE.createFertigkeit();
        mudan.getSelectableSkills().add(f);
        PersonaFertigkeit pfertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        pfertigkeit.setStufe(5);
        pfertigkeit.setFertigkeit(f);
        character.getPersona().getFertigkeiten().add(pfertigkeit);
        assertEquals("is true", true, getFixture().hasSpendAllPoints(diagnostics, context));

        Spellcaster sc = (Spellcaster)mudan;
        sc.setSpellPoints(2);
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));

        MysticAdept t = (MysticAdept)character.getPersona();
        PersonaZauber zauber = Shr5Factory.eINSTANCE.createPersonaZauber();
        t.getZauber().add(zauber);
        zauber.setStufe(2);
        assertEquals("is true", true, getFixture().hasSpendAllPoints(diagnostics, context));

        t.setMagieBasis(2);
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));
        sc.setMagic(2);
        assertEquals("is true", true, getFixture().hasSpendAllPoints(diagnostics, context));
    }

    @SuppressWarnings("unchecked")
    public void testHasSpendAllPoints__DiagnosticChain_Map_Technomancer() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createTechnoCharacter();
        getFixture().setCharacter(character);

        assertMudanOptions(character);
        skill.setSkillPoints(skill.getSkillPoints() + 5);// We need to add the 5
                                                         // of fertigkeit we
                                                         // already added in
                                                         // the
                                                         // assertMudan...
        mudan = Shr5managementFactory.eINSTANCE.createTechnomancer();
        getFixture().setMagic(mudan);
        mudan.setSkillNumber(1);
        mudan.setSkillValue(5);
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));
        Fertigkeit f = Shr5Factory.eINSTANCE.createFertigkeit();
        mudan.getSelectableSkills().add(f);
        PersonaFertigkeit pfertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        pfertigkeit.setStufe(5);
        pfertigkeit.setFertigkeit(f);
        character.getPersona().getFertigkeiten().add(pfertigkeit);
        assertEquals("is true", true, getFixture().hasSpendAllPoints(diagnostics, context));

        Technomancer tm = (Technomancer)mudan;
        tm.setComplexForms(2);
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));
        de.urszeidler.eclipse.shr5.Technomancer t = (de.urszeidler.eclipse.shr5.Technomancer)character.getPersona();

        PersonaKomplexForm komplexeForm = Shr5Factory.eINSTANCE.createPersonaKomplexForm();
        t.getComplexForms().add(komplexeForm);
        komplexeForm.setStufe(2);
        assertEquals("is true", true, getFixture().hasSpendAllPoints(diagnostics, context));

        t.setResonanzBasis(2);
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));
        tm.setResonanz(2);
        assertEquals("is true", true, getFixture().hasSpendAllPoints(diagnostics, context));

    }

    @SuppressWarnings("unchecked")
    private void assertMudanOptions(PlayerCharacter character) {
        context = Collections.EMPTY_MAP;
        diagnostics = new BasicDiagnostic();
        assertEquals("is true", true, getFixture().hasSpendAllPoints(diagnostics, context));

        attributes.setAttibutePoints(2);
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));
        character.getPersona().setKonstitutionBasis(2);
        assertEquals("is true", true, getFixture().hasSpendAllPoints(diagnostics, context));

        skill.setSkillPoints(1);
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));
        PersonaFertigkeit fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        Fertigkeit wfertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setFertigkeit(wfertigkeit);
        fertigkeit.setStufe(1);
        character.getPersona().getFertigkeiten().add(fertigkeit);
        assertEquals("is true", true, getFixture().hasSpendAllPoints(diagnostics, context));

        skill.setGroupPoints(1);
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));
        PersonaFertigkeitsGruppe fertigkeitg = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
        character.getPersona().getFertigkeitsGruppen().add(fertigkeitg);
        fertigkeitg.setStufe(1);
        assertEquals("is true", true, getFixture().hasSpendAllPoints(diagnostics, context));

        metaType.setSpecialPoints(2);
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));
        character.getPersona().setEdgeBasis(2);
        assertEquals("is true", true, getFixture().hasSpendAllPoints(diagnostics, context));

        mudan.setSkillNumber(1);
        mudan.setSkillValue(5);
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));
        Fertigkeit f = Shr5Factory.eINSTANCE.createFertigkeit();
        mudan.getSelectableSkills().add(f);
        PersonaFertigkeit pfertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        pfertigkeit.setStufe(5);
        pfertigkeit.setFertigkeit(f);
        character.getPersona().getFertigkeiten().add(pfertigkeit);
        assertEquals("is true", true, getFixture().hasSpendAllPoints(diagnostics, context));

        resourcen.setResource(100);
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));
        Gegenstand gegenstand = Shr5Factory.eINSTANCE.createGegenstand();
        gegenstand.setWertValue(new BigDecimal(100));
        character.getInventar().add(gegenstand);
        assertEquals("is true", true, getFixture().hasSpendAllPoints(diagnostics, context));
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllAttributesPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Not Spend All Attributes Points</em>}' operation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllAttributesPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasSpendAllAttributesPoints__DiagnosticChain_Map() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        assertMudanOptions(character);

        attributes.setAttibutePoints(3);
        assertEquals("is false", false, getFixture().hasSpendAllAttributesPoints(diagnostics, context));
        character.getPersona().setLogikBasis(1);

        assertEquals("is true", true, getFixture().hasSpendAllAttributesPoints(diagnostics, context));

    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSkillPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Not Spend All Skill Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSkillPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasSpendAllSkillPoints__DiagnosticChain_Map() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        assertMudanOptions(character);

        skill.setSkillPoints(2);
        assertEquals("is false", false, getFixture().hasSpendAllSkillPoints(diagnostics, context));
        PersonaFertigkeit fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        Fertigkeit wfertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setFertigkeit(wfertigkeit);
        fertigkeit.setStufe(1);
        character.getPersona().getFertigkeiten().add(fertigkeit);
        assertEquals("is true", true, getFixture().hasSpendAllSkillPoints(diagnostics, context));

        character.getPersona().setLogikBasis(1);
        fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        Fertigkeit w1fertigkeit = Shr5Factory.eINSTANCE.createWissensfertigkeit();
        fertigkeit.setFertigkeit(w1fertigkeit);
        fertigkeit.setStufe(2);
        character.getPersona().getFertigkeiten().add(fertigkeit);
        assertEquals("is true", true, getFixture().hasSpendAllSkillPoints(diagnostics, context));

    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpecialPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Not Spend All Special Points</em>}' operation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpecialPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    public void testHasSpendAllSpecialPoints__DiagnosticChain_Map() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        assertMudanOptions(character);

        // TODO
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasBasicViolations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Basic Violations</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasBasicViolations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    public void testHasBasicViolations__DiagnosticChain_Map() {
        createBasicCategories();
        Spezies spezies = Shr5Factory.eINSTANCE.createSpezies();
        getFixture().getMetaType().setChoosableTypes(spezies);
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);
        character.getPersona().setSpezies(spezies);
        assertEquals("is true", true, getFixture().hasBasicViolations(diagnostics, context));
        character.getPersona().setSpezies(Shr5Factory.eINSTANCE.createSpezies());
        assertEquals("is false", false, getFixture().hasBasicViolations(diagnostics, context));
    }

    
    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpecialTypePoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Not Spend All Special Type Points</em>}' operation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpecialTypePoints(org.eclipse.emf.common.util.DiagnosticChain,
     * java.util.Map)
     * @generated not
     */
    public void testHasSpendAllSpecialTypePoints__DiagnosticChain_Map() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        assertMudanOptions(character);

        // assertEquals("is false", false,
        // getFixture().hasSpendAllSpecialTypePoints(diagnostics, context));
        // mudan.se
        // TODO
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllConnectionPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Not Spend All Connection Points</em>}' operation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllConnectionPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasSpendAllConnectionPoints__DiagnosticChain_Map() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);
        getFixture().getShr5Generator().setCharismaToConnectionFactor(3);
        assertEquals("is true", true, getFixture().hasSpendAllConnectionPoints(diagnostics, context));

        assertMudanOptions(character);
        getFixture().getCharacter().getPersona().setCharismaBasis(1);
        assertEquals("is true", false, getFixture().hasSpendAllConnectionPoints(diagnostics, context));

        Connection connection = Shr5managementFactory.eINSTANCE.createConnection();
        getFixture().getCharacter().getConnections().add(connection);
        assertEquals("is true", false, getFixture().hasSpendAllConnectionPoints(diagnostics, context));

        connection.setInfluence(1);
        assertEquals("is true", false, getFixture().hasSpendAllConnectionPoints(diagnostics, context));
        connection.setLoyality(2);
        assertEquals("is false", true, getFixture().hasSpendAllConnectionPoints(diagnostics, context));
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllResourcePoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Not Spend All Resource Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllResourcePoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasSpendAllResourcePoints__DiagnosticChain_Map() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        getFixture().getShr5Generator().setMaxResourceToKeep(1);
        resourcen.setResource(100);
        assertEquals("is false", false, getFixture().hasSpendAllResourcePoints(diagnostics, context));
        Gegenstand gegenstand = Shr5Factory.eINSTANCE.createGegenstand();
        gegenstand.setWertValue(new BigDecimal(99));
        character.getInventar().add(gegenstand);
        assertEquals("is true", true, getFixture().hasSpendAllResourcePoints(diagnostics, context));

    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllMagicSkillsPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Not Spend All Magic Skills Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllMagicSkillsPoints(org.eclipse.emf.common.util.DiagnosticChain,
     * java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasSpendAllMagicSkillsPoints__DiagnosticChain_Map() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        mudan.setSkillNumber(1);
        mudan.setSkillValue(5);
        assertEquals("is false", false, getFixture().hasSpendAllMagicSkillsPoints(diagnostics, context));
        Fertigkeit f = Shr5Factory.eINSTANCE.createFertigkeit();
        mudan.getSelectableSkills().add(f);
        PersonaFertigkeit pfertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        pfertigkeit.setStufe(5);
        pfertigkeit.setFertigkeit(f);
        character.getPersona().getFertigkeiten().add(pfertigkeit);
        assertEquals("is true", true, getFixture().hasSpendAllMagicSkillsPoints(diagnostics, context));
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllMagicPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Not Spend All Magic Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllMagicPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    public void testHasSpendAllMagicPoints__DiagnosticChain_Map() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllMagicPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Not Spend All Magic Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllMagicPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasSpendAllMagicPoints__DiagnosticChain_Map_KiAdept() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createAdeptCharacter();
        getFixture().setCharacter(character);

        mudan = Shr5managementFactory.eINSTANCE.createAdept();
        getFixture().setMagic(mudan);
        mudan.setSkillNumber(1);
        mudan.setSkillValue(5);
        assertEquals("is false", false, getFixture().hasSpendAllMagicPoints(diagnostics, context));
        Fertigkeit f = Shr5Factory.eINSTANCE.createFertigkeit();
        mudan.getSelectableSkills().add(f);
        PersonaFertigkeit pfertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        pfertigkeit.setStufe(5);
        pfertigkeit.setFertigkeit(f);
        character.getPersona().getFertigkeiten().add(pfertigkeit);
        assertEquals("is true", true, getFixture().hasSpendAllMagicPoints(diagnostics, context));
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllGroupPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Not Spend All Group Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllGroupPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasSpendAllGroupPoints__DiagnosticChain_Map() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);
        getFixture().getSkills().setGroupPoints(2);

        assertEquals("should be 0", 0, getFixture().getGroupPointSpend());
        assertEquals("is false", false, getFixture().hasSpendAllGroupPoints(diagnostics, context));
        PersonaFertigkeitsGruppe pfg = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
        FertigkeitsGruppe fg = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();
        pfg.setGruppe(fg);
        pfg.setStufe(1);
        character.getPersona().getFertigkeitsGruppen().add(pfg);
        assertEquals("is false", false, getFixture().hasSpendAllGroupPoints(diagnostics, context));

        pfg = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
        fg = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();
        pfg.setGruppe(fg);
        pfg.setStufe(1);
        character.getPersona().getFertigkeitsGruppen().add(pfg);
        assertEquals("is true", true, getFixture().hasSpendAllGroupPoints(diagnostics, context));

    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllKnowlegeSkillPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Not Spend All Knowlege Skill Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllKnowlegeSkillPoints(org.eclipse.emf.common.util.DiagnosticChain,
     * java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasSpendAllKnowlegeSkillPoints__DiagnosticChain_Map() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);
        character.getPersona().setIntuitionBasis(1);
        character.getPersona().setLogikBasis(2);

        assertEquals("should be 0", 0, getFixture().getKnownlegePointSpend());
        PersonaFertigkeit fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        Fertigkeit wfertigkeit = Shr5Factory.eINSTANCE.createWissensfertigkeit();
        fertigkeit.setFertigkeit(wfertigkeit);
        fertigkeit.setStufe(1);
        character.getPersona().getFertigkeiten().add(fertigkeit);
        assertEquals("should be 1", 1, getFixture().getKnownlegePointSpend());
        assertEquals("is false", false, getFixture().hasSpendAllKnowlegeSkillPoints(diagnostics, context));

        fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        wfertigkeit = Shr5Factory.eINSTANCE.createWissensfertigkeit();
        fertigkeit.setFertigkeit(wfertigkeit);
        fertigkeit.setStufe(5);
        character.getPersona().getFertigkeiten().add(fertigkeit);
        assertEquals("should be 6", 6, getFixture().getKnownlegePointSpend());
        assertEquals("is true", true, getFixture().hasSpendAllKnowlegeSkillPoints(diagnostics, context));

    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllKarmaPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Not Spend All Karma Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllKarmaPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasSpendAllKarmaPoints__DiagnosticChain_Map() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        getFixture().getShr5Generator().setKarmaPoints(10);

        assertEquals("is false", false, getFixture().hasSpendAllKarmaPoints(diagnostics, context));
        getFixture().setKarmaToResource(10);
        assertEquals("is true", true, getFixture().hasSpendAllKarmaPoints(diagnostics, context));

        getFixture().setKarmaToResource(8);
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpellPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Spend All Spell Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpellPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasSpendAllSpellPoints__DiagnosticChain_Map() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        assertEquals("is true", true, getFixture().hasSpendAllSpellPoints(diagnostics, context));
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllPowerPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Spend All Power Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllPowerPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasSpendAllPowerPoints__DiagnosticChain_Map() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        assertEquals("is true", true, getFixture().hasSpendAllPowerPoints(diagnostics, context));
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllPowerPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Spend All Power Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllPowerPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasSpendAllPowerPoints__DiagnosticChain_MapAdept() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createAdeptCharacter();
        getFixture().setCharacter(character);

        mudan = Shr5managementFactory.eINSTANCE.createAdept();
        getFixture().setMagic(mudan);

        KiAdept ka = (KiAdept)character.getPersona();
        ka.setMagieBasis(2);
        assertEquals("is false", false, getFixture().hasSpendAllPowerPoints(diagnostics, context));

        KiKraft kiKraft = Shr5Factory.eINSTANCE.createKiKraft();
        kiKraft.setKraftpunkte(100);
        ka.getKikraft().add(kiKraft);
        assertEquals("is false", false, getFixture().hasSpendAllPowerPoints(diagnostics, context));
        kiKraft = Shr5Factory.eINSTANCE.createKiKraft();
        kiKraft.setKraftpunkte(100);
        ka.getKikraft().add(kiKraft);
        assertEquals("is true", true, getFixture().hasSpendAllPowerPoints(diagnostics, context));

    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllPowerPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Spend All Power Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllPowerPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasSpendAllPowerPoints__DiagnosticChain_MapMysticAdept() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMysticAdeptCharacter();
        getFixture().setCharacter(character);

        mudan = Shr5managementFactory.eINSTANCE.createSpellcaster();
        getFixture().setMagic(mudan);

        KiAdept ka = (KiAdept)character.getPersona();
        ka.setMagieBasis(2);
        assertEquals("is true", true, getFixture().hasSpendAllPowerPoints(diagnostics, context));

        KiKraft kiKraft = Shr5Factory.eINSTANCE.createKiKraft();
        kiKraft.setKraftpunkte(100);
        ka.getKikraft().add(kiKraft);
        assertEquals("is true", true, getFixture().hasSpendAllPowerPoints(diagnostics, context));
        kiKraft = Shr5Factory.eINSTANCE.createKiKraft();
        kiKraft.setKraftpunkte(100);
        ka.getKikraft().add(kiKraft);
        assertEquals("is true", true, getFixture().hasSpendAllPowerPoints(diagnostics, context));
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpellPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Spend All Spell Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpellPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasSpendAllSpellPoints__DiagnosticChain_Map_MysticAdept() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMysticAdeptCharacter();
        getFixture().setCharacter(character);

        assertMudanOptions(character);
        skill.setSkillPoints(skill.getSkillPoints() + 5);
        mudan = Shr5managementFactory.eINSTANCE.createSpellcaster();
        getFixture().setMagic(mudan);

        Spellcaster sc = (Spellcaster)mudan;
        sc.setSpellPoints(2);
        assertEquals("is false", false, getFixture().hasSpendAllSpellPoints(diagnostics, context));

        MysticAdept t = (MysticAdept)character.getPersona();
        PersonaZauber zauber = Shr5Factory.eINSTANCE.createPersonaZauber();
        t.getZauber().add(zauber);
        zauber.setStufe(2);
        assertEquals("is true", true, getFixture().hasSpendAllSpellPoints(diagnostics, context));

    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpellPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Spend All Spell Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpellPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasSpendAllSpellPoints__DiagnosticChain_Map_Magier() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createZaubererCharacter();
        getFixture().setCharacter(character);

        assertMudanOptions(character);
        mudan = Shr5managementFactory.eINSTANCE.createSpellcaster();
        getFixture().setMagic(mudan);

        Spellcaster sc = (Spellcaster)mudan;
        sc.setSpellPoints(2);
        assertEquals("is false", false, getFixture().hasSpendAllSpellPoints(diagnostics, context));

        Magier t = (Magier)character.getPersona();
        PersonaZauber zauber = Shr5Factory.eINSTANCE.createPersonaZauber();
        t.getZauber().add(zauber);
        zauber.setStufe(2);
        assertEquals("is true", true, getFixture().hasSpendAllSpellPoints(diagnostics, context));
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpellPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Spend All Spell Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5Generator#hasSpendAllSpellPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasSpendAllSpellPoints__DiagnosticChain_Map_Technomacher() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createTechnoCharacter();
        getFixture().setCharacter(character);

        assertMudanOptions(character);
        skill.setSkillPoints(skill.getSkillPoints() + 5);
        mudan = Shr5managementFactory.eINSTANCE.createTechnomancer();
        getFixture().setMagic(mudan);

        Technomancer tm = (Technomancer)mudan;
        tm.setComplexForms(2);
        assertEquals("is false", false, getFixture().hasSpendAllSpellPoints(diagnostics, context));
        de.urszeidler.eclipse.shr5.Technomancer t = (de.urszeidler.eclipse.shr5.Technomancer)character.getPersona();

        PersonaKomplexForm komplexeForm = Shr5Factory.eINSTANCE.createPersonaKomplexForm();
        t.getComplexForms().add(komplexeForm);
        komplexeForm.setStufe(2);
        assertEquals("is true", true, getFixture().hasSpendAllSpellPoints(diagnostics, context));

        t.setResonanzBasis(2);
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));
        tm.setResonanz(2);
        assertEquals("is true", true, getFixture().hasSpendAllPoints(diagnostics, context));
    }

} // Shr5GeneratorTest
