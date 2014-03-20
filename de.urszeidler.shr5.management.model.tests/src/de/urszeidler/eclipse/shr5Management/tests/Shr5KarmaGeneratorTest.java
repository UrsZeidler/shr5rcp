/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import java.math.BigDecimal;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Gegenstand;
import de.urszeidler.eclipse.shr5.Lifestyle;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5Management.Connection;
import de.urszeidler.eclipse.shr5Management.MetaType;
import de.urszeidler.eclipse.shr5Management.Mudan;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shr5 Karma Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 * <li>{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getResourceSpend() <em>Resource Spend</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 * <li>
 * {@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#hasSpendAllKarmaPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Has Spend All Karma Points</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class Shr5KarmaGeneratorTest extends Shr5RuleGeneratorTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(Shr5KarmaGeneratorTest.class);
    }

    private Mudan characterConcept;
    private MetaType metaType;

    /**
     * Constructs a new Shr5 Karma Generator test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public Shr5KarmaGeneratorTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Shr5 Karma Generator test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected Shr5KarmaGenerator getFixture() {
        return (Shr5KarmaGenerator)fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated not
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5managementFactory.eINSTANCE.createShr5KarmaGenerator());
        Shr5System system = Shr5managementFactory.eINSTANCE.createShr5System();
        system.setKarmaPoints(20);
        getFixture().setGenerator(system);

        characterConcept = Shr5managementFactory.eINSTANCE.createMudan();
        characterConcept.setCost(0);
        metaType = Shr5managementFactory.eINSTANCE.createMetaType();
        getFixture().setCharacterConcept(characterConcept);
        getFixture().setMetaType(metaType);

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
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend() <em>Karma Spend</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator#getKarmaSpend()
     * @generated not
     */
    public void testGetKarmaSpend() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getShr5Generator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getShr5Generator().setMaxKarmaToKeep(1);
        getFixture().getShr5Generator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getShr5Generator());

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
        shr5System = getFixture().getShr5Generator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getShr5Generator().setMaxKarmaToKeep(1);
        getFixture().getShr5Generator().setKarmaPoints(30);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getShr5Generator());

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
        shr5System = getFixture().getShr5Generator();
        getFixture().setCharacter(playerCharacter);
        shr5System.setKarmaToConnectionFactor(2);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getShr5Generator());

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
        gegenstand.setWert(new BigDecimal(99));
        character.getInventar().add(gegenstand);
        assertEquals("is 99", 99, getFixture().getResourceSpend());

        Lifestyle lifestyle = Shr5Factory.eINSTANCE.createLifestyle();
        lifestyle.setWert(new BigDecimal(1));
        character.getContracts().add(lifestyle);

        assertEquals("is 100", 100, getFixture().getResourceSpend());

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
    @SuppressWarnings("unchecked")
    public void testHasSpendAllKarmaPoints__DiagnosticChain_Map() {
        PlayerCharacter playerCharacter = PriorityCategorieTest.createMudanCharacter();
        shr5System = getFixture().getShr5Generator();
        getFixture().setCharacter(playerCharacter);
        getFixture().getShr5Generator().setMaxKarmaToKeep(1);
        getFixture().getShr5Generator().setKarmaPoints(3);

        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        ChangesTest.createAdvacements(getFixture().getShr5Generator());

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

        getFixture().getShr5Generator().setMaxKarmaToKeep(0);
        assertEquals("is false", false, getFixture().hasSpendAllKarmaPoints(diagnostics, context));
        assertEquals("is false", false, getFixture().hasSpendAllPoints(diagnostics, context));

    }

} // Shr5KarmaGeneratorTest
