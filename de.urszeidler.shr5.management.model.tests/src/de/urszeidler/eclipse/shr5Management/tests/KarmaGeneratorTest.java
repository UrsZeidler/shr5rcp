/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import java.math.BigDecimal;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Credstick;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Gegenstand;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.KomplexeForm;
import de.urszeidler.eclipse.shr5.Lifestyle;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaKomplexForm;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Technomancer;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.Zauberer;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.Connection;
import de.urszeidler.eclipse.shr5Management.KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.MetaType;
import de.urszeidler.eclipse.shr5Management.Mudan;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shr5 Karma Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#getResourceSpend() <em>Resource Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#getChoiseKarmaCost() <em>Choise Karma Cost</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#hasSpendAllKarmaPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Karma Points</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#hasSpendAllResources(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Resources</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class KarmaGeneratorTest extends Shr5RuleGeneratorTest {

    protected Mudan characterConcept;
    protected MetaType metaType;

    /**
     * Constructs a new Karma Generator test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KarmaGeneratorTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Karma Generator test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected KarmaGenerator<?> getFixture() {
        return (KarmaGenerator<?>)fixture;
    }

    protected void createBasicCategories() {
        shr5System = Shr5managementFactory.eINSTANCE.createShr5System();
        ((Shr5KarmaGenerator)getFixture()).setGenerator(shr5System);
    }


    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testGetKarmaSpend() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());

        PersonaFertigkeit fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        assertFalse(playerCharacter.getPersona().getFertigkeiten().contains(fertigkeit));
        fertigkeit.setFertigkeit(Shr5Factory.eINSTANCE.createFertigkeit());

        PersonaChange personaChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
        personaChange.setChangeable(fertigkeit);

        playerCharacter.getChanges().add(personaChange);
        assertEquals(-2, personaChange.getKarmaCost());
        personaChange.applyChanges();

        assertEquals("2 spend", 2, getFixture().getKarmaSpend());

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testGetKarmaSpend_concept_type() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(30);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());

        characterConcept.setCost(10);
        metaType.setCost(10);
        assertEquals("20 spend", 20, getFixture().getKarmaSpend());

        PersonaFertigkeit fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        assertFalse(playerCharacter.getPersona().getFertigkeiten().contains(fertigkeit));
        fertigkeit.setFertigkeit(Shr5Factory.eINSTANCE.createFertigkeit());

        PersonaChange personaChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
        personaChange.setChangeable(fertigkeit);

        playerCharacter.getChanges().add(personaChange);
        assertEquals(-2, personaChange.getKarmaCost());
        personaChange.applyChanges();

        assertEquals("22 spend", 22, getFixture().getKarmaSpend());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testGetKarmaSpend_connections() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        shr5System.setKarmaToConnectionFactor(2);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());

        Connection connection = Shr5managementFactory.eINSTANCE.createConnection();
        connection.setInfluence(1);
        playerCharacter.getConnections().add(connection);

        assertEquals("2 spend", 2, getFixture().getKarmaSpend());

        connection.setLoyality(2);
        assertEquals("6 spend", 6, getFixture().getKarmaSpend());
        shr5System.setKarmaToConnectionFactor(1);
        assertEquals("3 spend", 3, getFixture().getKarmaSpend());

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
        // PriorityCategorieTest.createBasicCategories();
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
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getChoiseKarmaCost() <em>Choise Karma Cost</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getChoiseKarmaCost()
     * @generated not
     */
    public void testGetChoiseKarmaCost() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(30);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getChoiseKarmaCost());

        characterConcept.setCost(10);
        metaType.setCost(10);
        assertEquals("20 spend", 20, getFixture().getChoiseKarmaCost());
      }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#hasSpendAllKarmaPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Spend All Karma Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#hasSpendAllKarmaPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    public void testHasSpendAllKarmaPoints__DiagnosticChain_Map() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("is false", false, getFixture().hasSpendAllKarmaPoints(diagnostics, context));
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));

        PersonaFertigkeit fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        assertFalse(playerCharacter.getPersona().getFertigkeiten().contains(fertigkeit));
        fertigkeit.setFertigkeit(Shr5Factory.eINSTANCE.createFertigkeit());

        PersonaChange personaChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
        personaChange.setChangeable(fertigkeit);

        playerCharacter.getChanges().add(personaChange);
        assertEquals(-2, personaChange.getKarmaCost());
        personaChange.applyChanges();

        assertEquals("is false", true, getFixture().hasSpendAllKarmaPoints(diagnostics, context));
        assertEquals("is false", true, getFixture().hasSpendAllPoints(diagnostics, context));

        getFixture().getGenerator().setMaxKarmaToKeep(0);
        assertEquals("is false", false, getFixture().hasSpendAllKarmaPoints(diagnostics, context));
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#hasSpendAllResources(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Resources</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.KarmaGenerator#hasSpendAllResources(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    public void testHasSpendAllResources__DiagnosticChain_Map() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        assertEquals("Should be 0", 0, getFixture().getResourceSpend());
        getFixture().getGenerator().setKarmaToResourceFactor(10);
        getFixture().setKarmaToResource(1);
        
        assertEquals("is false", false, getFixture().hasSpendAllResources(diagnostics, context));

        Credstick credstick = Shr5Factory.eINSTANCE.createCredstick();
        credstick.setWertValue(new BigDecimal(10));
        playerCharacter.getInventar().add(credstick);
        
        assertEquals("Should be 10", 10, getFixture().getResourceSpend());
        assertEquals("is true", true, getFixture().hasSpendAllResources(diagnostics, context));
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasSpendAllPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Spend All Points</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasSpendAllPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    public void testHasSpendAllPoints__DiagnosticChain_Map() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("is false", false, getFixture().hasSpendAllKarmaPoints(diagnostics, context));
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));

        PersonaFertigkeit fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        assertFalse(playerCharacter.getPersona().getFertigkeiten().contains(fertigkeit));
        fertigkeit.setFertigkeit(Shr5Factory.eINSTANCE.createFertigkeit());

        PersonaChange personaChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
        personaChange.setChangeable(fertigkeit);

        playerCharacter.getChanges().add(personaChange);
        assertEquals(-2, personaChange.getKarmaCost());
        personaChange.applyChanges();

        assertEquals("is false", true, getFixture().hasSpendAllKarmaPoints(diagnostics, context));
        assertEquals("is false", true, getFixture().hasSpendAllPoints(diagnostics, context));

        getFixture().getGenerator().setMaxKarmaToKeep(0);
        assertEquals("is false", false, getFixture().hasSpendAllKarmaPoints(diagnostics, context));
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testChangeFertigkeitByAdvacement() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());
        AbstraktPersona persona = playerCharacter.getPersona();
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();

        ShadowrunManagmentTools.changeFertigkeitByAdvacement(playerCharacter, fertigkeit, 5);
        PersonaFertigkeit findFertigkeit = ShadowrunTools.findFertigkeit(fertigkeit, persona);
        assertEquals("5 spend", 5, findFertigkeit.getStufe());
        assertEquals("30 spend", 30, getFixture().getKarmaSpend());

        ShadowrunManagmentTools.changeFertigkeitByAdvacement(playerCharacter, fertigkeit, 0);
        findFertigkeit = ShadowrunTools.findFertigkeit(fertigkeit, persona);
        assertNull("5 spend", findFertigkeit);
        assertEquals("0 spend", 0, getFixture().getKarmaSpend());

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testChangeFertigkeitsGruppeByAdvacement() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());
        AbstraktPersona persona = playerCharacter.getPersona();
        FertigkeitsGruppe fertigkeit = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();

        ShadowrunManagmentTools.changeFertigkeitsGruppeByAdvacement(playerCharacter, fertigkeit, 5);
        PersonaFertigkeitsGruppe findFertigkeit = ShadowrunTools.findGruppe(fertigkeit, persona);
        assertEquals("5 spend", 5, findFertigkeit.getStufe());
        assertEquals("75 spend", 75, getFixture().getKarmaSpend());

        ShadowrunManagmentTools.changeFertigkeitsGruppeByAdvacement(playerCharacter, fertigkeit, 0);
        findFertigkeit = ShadowrunTools.findGruppe(fertigkeit, persona);
        assertNull("5 spend", findFertigkeit);
        assertEquals("0 spend", 0, getFixture().getKarmaSpend());

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testChangeAttributeByAdvacement() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());
        AbstraktPersona persona = playerCharacter.getPersona();

        ShadowrunManagmentTools.changeAttributeByAdvacement(playerCharacter, Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, 5);

        assertEquals("5 spend", 5, persona.getKonstitutionBasis());
        assertEquals("75 spend", 75, getFixture().getKarmaSpend());

        ShadowrunManagmentTools.changeAttributeByAdvacement(playerCharacter, Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, 0);

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());

        persona.getSpezies().setKonstitutionMin(2);
        ShadowrunManagmentTools.changeAttributeByAdvacement(playerCharacter, Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, 6);
        assertEquals("5 spend", 6, persona.getKonstitutionBasis());
        assertEquals("90 spend", 90, getFixture().getKarmaSpend());

        ShadowrunManagmentTools.changeAttributeByAdvacement(playerCharacter, Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, 0);
        assertEquals("2 spend", 2, persona.getKonstitutionBasis());
        assertEquals("0 spend", 0, getFixture().getKarmaSpend());
        assertNull(ShadowrunManagmentTools.findCharacterAdvacements(playerCharacter, Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS));

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testChangeQuallityByAdvancement() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());
        AbstraktPersona persona = playerCharacter.getPersona();
        PersonaEigenschaft personaEigenschaft = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
        personaEigenschaft.setKarmaKosten(10);
        
        ShadowrunManagmentTools.changeErlernbarByAdvacement(playerCharacter, personaEigenschaft);
        
        KoerperPersona koerperPersona = (KoerperPersona)persona;

        //koerperPersona.getEigenschaften().add(personaEigenschaft);
        assertEquals("20 spend", 20,
                ShadowrunManagmentTools.calcKarmaSpendByQuallities(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        assertTrue(koerperPersona.getEigenschaften().contains(personaEigenschaft));
        PersonaChange advacements = ShadowrunManagmentTools.findCharacterAdvacements(playerCharacter, personaEigenschaft);
        assertNotNull(advacements);
        
        ShadowrunManagmentTools.changeErlernbarByAdvacement(playerCharacter, personaEigenschaft);
        
        assertEquals("0 spend", 0,
                ShadowrunManagmentTools.calcKarmaSpendByQuallities(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        assertFalse(koerperPersona.getEigenschaften().contains(personaEigenschaft));
        advacements = ShadowrunManagmentTools.findCharacterAdvacements(playerCharacter, personaEigenschaft);
        assertNull(advacements);
    
    }
    
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testChangeSpellByAdvancement() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createZaubererCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());
        AbstraktPersona persona = playerCharacter.getPersona();
        PersonaZauber personaZauber = Shr5Factory.eINSTANCE.createPersonaZauber();
        Zauber zauber = Shr5Factory.eINSTANCE.createZauber();
        personaZauber.setFormel(zauber);
        
        ShadowrunManagmentTools.changeErlernbarByAdvacement(playerCharacter, personaZauber);
        
        Zauberer koerperPersona = (Zauberer)persona;

        //koerperPersona.getEigenschaften().add(personaEigenschaft);
        assertEquals("5 spend", 5,
                ShadowrunManagmentTools.calcKarmaSpendBySpellsOrForms(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        assertTrue(koerperPersona.getZauber().contains(personaZauber));
        PersonaChange advacements = ShadowrunManagmentTools.findCharacterAdvacements(playerCharacter, personaZauber);
        assertNotNull(advacements);
        
        ShadowrunManagmentTools.changeErlernbarByAdvacement(playerCharacter, personaZauber);
        
        assertEquals("0 spend", 0,
                ShadowrunManagmentTools.calcKarmaSpendBySpellsOrForms(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        assertFalse(koerperPersona.getZauber().contains(personaZauber));
        advacements = ShadowrunManagmentTools.findCharacterAdvacements(playerCharacter, personaZauber);
        assertNull(advacements);
    
    }
    
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testChangeComplexformByAdvancement() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createTechnoCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());
        AbstraktPersona persona = playerCharacter.getPersona();
        PersonaKomplexForm personaZauber = Shr5Factory.eINSTANCE.createPersonaKomplexForm();
        KomplexeForm zauber = Shr5Factory.eINSTANCE.createKomplexeForm();
        personaZauber.setForm(zauber);
        
        ShadowrunManagmentTools.changeErlernbarByAdvacement(playerCharacter, personaZauber);
        
        Technomancer koerperPersona = (Technomancer)persona;

        //koerperPersona.getEigenschaften().add(personaEigenschaft);
        assertEquals("5 spend", 5,
                ShadowrunManagmentTools.calcKarmaSpendBySpellsOrForms(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        assertTrue(koerperPersona.getComplexForms().contains(personaZauber));
        PersonaChange advacements = ShadowrunManagmentTools.findCharacterAdvacements(playerCharacter, personaZauber);
        assertNotNull(advacements);
        
        ShadowrunManagmentTools.changeErlernbarByAdvacement(playerCharacter, personaZauber);
        
        assertEquals("0 spend", 0,
                ShadowrunManagmentTools.calcKarmaSpendBySpellsOrForms(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        assertFalse(koerperPersona.getComplexForms().contains(personaZauber));
        advacements = ShadowrunManagmentTools.findCharacterAdvacements(playerCharacter, personaZauber);
        assertNull(advacements);
    
    }
    
    
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testCalcKarma4Attribute() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());
        assertEquals("0 spend", 0,
                ShadowrunManagmentTools.calcKarmaSpendByAttributes(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));
        AbstraktPersona persona = playerCharacter.getPersona();

        ShadowrunManagmentTools.changeAttributeByAdvacement(playerCharacter, Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, 5);

        assertEquals("5 spend", 5, persona.getKonstitutionBasis());
        assertEquals("75 spend", 75, getFixture().getKarmaSpend());
        assertEquals("75 spend", 75,
                ShadowrunManagmentTools.calcKarmaSpendByAttributes(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        ShadowrunManagmentTools.changeAttributeByAdvacement(playerCharacter, Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, 0);

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());

        persona.getSpezies().setKonstitutionMin(2);
        ShadowrunManagmentTools.changeAttributeByAdvacement(playerCharacter, Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, 6);
        assertEquals("5 spend", 6, persona.getKonstitutionBasis());
        assertEquals("90 spend", 90, getFixture().getKarmaSpend());
        assertEquals("90 spend", 90,
                ShadowrunManagmentTools.calcKarmaSpendByAttributes(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        ShadowrunManagmentTools.changeAttributeByAdvacement(playerCharacter, Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, 0);
        assertEquals("2 spend", 2, persona.getKonstitutionBasis());
        assertEquals("0 spend", 0, getFixture().getKarmaSpend());
        assertNull(ShadowrunManagmentTools.findCharacterAdvacements(playerCharacter, Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS));
        assertEquals("0 spend", 0,
                ShadowrunManagmentTools.calcKarmaSpendByAttributes(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testCalcKarma4Attribute1() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());
        assertEquals("0 spend", 0,
                ShadowrunManagmentTools.calcKarmaSpendByAttributes(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));
        AbstraktPersona persona = playerCharacter.getPersona();

        ShadowrunManagmentTools.changeAttributeByAdvacement(playerCharacter, Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, 5);

        assertEquals("75 spend", 75,
                ShadowrunManagmentTools.calcKarmaSpendByAttributes(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        ShadowrunManagmentTools.changeAttributeByAdvacement(playerCharacter, Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, 0);

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());

        persona.getSpezies().setKonstitutionMin(2);
        ShadowrunManagmentTools.changeAttributeByAdvacement(playerCharacter, Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, 6);
        assertEquals("90 spend", 90,
                ShadowrunManagmentTools.calcKarmaSpendByAttributes(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        ShadowrunManagmentTools.changeAttributeByAdvacement(playerCharacter, Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, 0);
        assertNull(ShadowrunManagmentTools.findCharacterAdvacements(playerCharacter, Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS));
        assertEquals("0 spend", 0,
                ShadowrunManagmentTools.calcKarmaSpendByAttributes(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        ShadowrunManagmentTools.changeAttributeByAdvacement(playerCharacter, Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, 6);
        assertEquals("90 spend", 90,
                ShadowrunManagmentTools.calcKarmaSpendByAttributes(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        persona.getSpezies().setIntuitionMin(1);
        persona.setIntuitionBasis(6);
        assertEquals("190 spend", 190,
                ShadowrunManagmentTools.calcKarmaSpendByAttributes(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testCalcKarma4Fertigkeit() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());
        AbstraktPersona persona = playerCharacter.getPersona();
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();

        ShadowrunManagmentTools.changeFertigkeitByAdvacement(playerCharacter, fertigkeit, 5);
        PersonaFertigkeit findFertigkeit = ShadowrunTools.findFertigkeit(fertigkeit, persona);
        assertEquals("5 spend", 5, findFertigkeit.getStufe());
        assertEquals("30 spend", 30, getFixture().getKarmaSpend());
        assertEquals("30 spend", 30,
                ShadowrunManagmentTools.calcKarmaSpendBySkills(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        findFertigkeit.setStufe(6);
        assertEquals("42 spend", 42,
                ShadowrunManagmentTools.calcKarmaSpendBySkills(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testCalcKarma4Fertigkeit1() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());
        AbstraktPersona persona = playerCharacter.getPersona();
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();

        ShadowrunManagmentTools.changeFertigkeitByAdvacement(playerCharacter, fertigkeit, 5);
        PersonaFertigkeit findFertigkeit = ShadowrunTools.findFertigkeit(fertigkeit, persona);
        assertEquals("5 spend", 5, findFertigkeit.getStufe());
        assertEquals("30 spend", 30, getFixture().getKarmaSpend());
        assertEquals("30 spend", 30,
                ShadowrunManagmentTools.calcKarmaSpendBySkills(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        findFertigkeit.setStufe(6);
        assertEquals("42 spend", 42,
                ShadowrunManagmentTools.calcKarmaSpendBySkills(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();

        ShadowrunManagmentTools.changeFertigkeitByAdvacement(playerCharacter, fertigkeit, 5);
        findFertigkeit = ShadowrunTools.findFertigkeit(fertigkeit, persona);
        assertEquals("5 spend", 5, findFertigkeit.getStufe());
        assertEquals("72 spend", 72,
                ShadowrunManagmentTools.calcKarmaSpendBySkills(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));
        findFertigkeit.setStufe(6);
        assertEquals("84 spend", 84,
                ShadowrunManagmentTools.calcKarmaSpendBySkills(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testCalcKarma4Specalism() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());
        AbstraktPersona persona = playerCharacter.getPersona();
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();

        ShadowrunManagmentTools.changeFertigkeitByAdvacement(playerCharacter, fertigkeit, 5);
        PersonaFertigkeit findFertigkeit = ShadowrunTools.findFertigkeit(fertigkeit, persona);
        assertEquals("5 spend", 5, findFertigkeit.getStufe());
        assertEquals("30 spend", 30, getFixture().getKarmaSpend());
        assertEquals("30 spend", 30,
                ShadowrunManagmentTools.calcKarmaSpendBySkills(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        findFertigkeit.setStufe(6);
        assertEquals("42 spend", 42,
                ShadowrunManagmentTools.calcKarmaSpendBySkills(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));
        findFertigkeit.getSpezialisierungen().add(Shr5Factory.eINSTANCE.createSpezialisierung());
        assertEquals("7 spend", 7,
                ShadowrunManagmentTools.calcKarmaSpendBySpecalism(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();

        ShadowrunManagmentTools.changeFertigkeitByAdvacement(playerCharacter, fertigkeit, 5);
        findFertigkeit = ShadowrunTools.findFertigkeit(fertigkeit, persona);
        assertEquals("5 spend", 5, findFertigkeit.getStufe());
         findFertigkeit.getSpezialisierungen().add(Shr5Factory.eINSTANCE.createSpezialisierung());
        assertEquals("14 spend", 14,
                ShadowrunManagmentTools.calcKarmaSpendBySpecalism(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));
        findFertigkeit.getSpezialisierungen().add(Shr5Factory.eINSTANCE.createSpezialisierung());
        assertEquals("21 spend", 21,
                ShadowrunManagmentTools.calcKarmaSpendBySpecalism(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));
      
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testCalcKarma4FertigkeitsGruppe() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());
        AbstraktPersona persona = playerCharacter.getPersona();
        FertigkeitsGruppe fertigkeit = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();

        ShadowrunManagmentTools.changeFertigkeitsGruppeByAdvacement(playerCharacter, fertigkeit, 5);
        PersonaFertigkeitsGruppe findFertigkeit = ShadowrunTools.findGruppe(fertigkeit, persona);
        assertEquals("5 spend", 5, findFertigkeit.getStufe());
        assertEquals("75 spend", 75, getFixture().getKarmaSpend());
        assertEquals("75 spend", 75,
                ShadowrunManagmentTools.calcKarmaSpendBySkillGroups(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        findFertigkeit.setStufe(6);
        assertEquals("105 spend", 105,
                ShadowrunManagmentTools.calcKarmaSpendBySkillGroups(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testCalcKarma4FertigkeitsGruppe1() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());
        AbstraktPersona persona = playerCharacter.getPersona();
        FertigkeitsGruppe fertigkeit = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();

        ShadowrunManagmentTools.changeFertigkeitsGruppeByAdvacement(playerCharacter, fertigkeit, 5);
        PersonaFertigkeitsGruppe findFertigkeit = ShadowrunTools.findGruppe(fertigkeit, persona);
        assertEquals("5 spend", 5, findFertigkeit.getStufe());
        assertEquals("75 spend", 75, getFixture().getKarmaSpend());
        assertEquals("75 spend", 75,
                ShadowrunManagmentTools.calcKarmaSpendBySkillGroups(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        findFertigkeit.setStufe(6);
        assertEquals("105 spend", 105,
                ShadowrunManagmentTools.calcKarmaSpendBySkillGroups(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();

        ShadowrunManagmentTools.changeFertigkeitsGruppeByAdvacement(playerCharacter, fertigkeit, 5);
        findFertigkeit = ShadowrunTools.findGruppe(fertigkeit, persona);
        assertEquals("5 spend", 5, findFertigkeit.getStufe());
        assertEquals("180 spend", 180,
                ShadowrunManagmentTools.calcKarmaSpendBySkillGroups(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));
        findFertigkeit.setStufe(6);
        assertEquals("210 spend", 210,
                ShadowrunManagmentTools.calcKarmaSpendBySkillGroups(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testCalcKarma4Quallity() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());
        AbstraktPersona persona = playerCharacter.getPersona();
        PersonaEigenschaft personaEigenschaft = Shr5Factory.eINSTANCE.createPersonaEigenschaft();

        KoerperPersona koerperPersona = (KoerperPersona)persona;
        koerperPersona.getEigenschaften().add(personaEigenschaft);

        personaEigenschaft.setKarmaKosten(10);
        assertEquals("20 spend", 20,
                ShadowrunManagmentTools.calcKarmaSpendByQuallities(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testCalcKarma4Quallity1() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getGenerator().setMaxKarmaToKeep(1);
        getFixture().getGenerator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());
        AbstraktPersona persona = playerCharacter.getPersona();
        PersonaEigenschaft personaEigenschaft = Shr5Factory.eINSTANCE.createPersonaEigenschaft();

        KoerperPersona koerperPersona = (KoerperPersona)persona;
        koerperPersona.getEigenschaften().add(personaEigenschaft);

        personaEigenschaft.setKarmaKosten(10);
        assertEquals("20 spend", 20,
                ShadowrunManagmentTools.calcKarmaSpendByQuallities(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

        personaEigenschaft = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
        koerperPersona = (KoerperPersona)persona;
        koerperPersona.getEigenschaften().add(personaEigenschaft);

        personaEigenschaft.setKarmaKosten(10);
        assertEquals("40 spend", 40,
                ShadowrunManagmentTools.calcKarmaSpendByQuallities(playerCharacter, getFixture().getGenerator().getCharacterAdvancements()));

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testCalcKarmaSpend_connections() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getGenerator();
        getFixture().setCharacter(playerCharacter);
        shr5System.setKarmaToConnectionFactor(2);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getGenerator());

        assertEquals("0 spend", 0, getFixture().getKarmaSpend());

        Connection connection = Shr5managementFactory.eINSTANCE.createConnection();
        connection.setInfluence(1);
        playerCharacter.getConnections().add(connection);

        assertEquals("2 spend", 2, ShadowrunManagmentTools.calcKarmaSpendByConnections(playerCharacter, shr5System));

        connection.setLoyality(2);
        assertEquals("6 spend", 6, ShadowrunManagmentTools.calcKarmaSpendByConnections(playerCharacter, shr5System));
        shr5System.setKarmaToConnectionFactor(1);
        assertEquals("3 spend", 3, ShadowrunManagmentTools.calcKarmaSpendByConnections(playerCharacter, shr5System));
    }

} // Shr5KarmaGeneratorTest
