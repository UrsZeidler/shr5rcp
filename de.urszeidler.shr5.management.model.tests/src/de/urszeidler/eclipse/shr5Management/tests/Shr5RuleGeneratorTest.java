/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.QuellenConstrain;
import de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shr5 Rule Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#getShr5Generator() <em>Shr5 Generator</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasSpendAllPoints(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Spend All Points</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNotMoreMaxAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Not More Max Attributes</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNoSkillsOverMax(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has No Skills Over Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNotMoreSpecalism(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Not More Specalism</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNoAttributesOverSpeciesAtt(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has No Attributes Over Species Att</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNoConstrainVoilation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has No Constrain Voilation</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasLifestyleChoosen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Lifestyle Choosen</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class Shr5RuleGeneratorTest extends CharacterGeneratorTest {

    protected Shr5System shr5System;
    protected BasicDiagnostic diagnostics;
    @SuppressWarnings("rawtypes")
    protected Map context;

    /**
     * Constructs a new Shr5 Rule Generator test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Shr5RuleGeneratorTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Shr5 Rule Generator test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Shr5RuleGenerator getFixture() {
        return (Shr5RuleGenerator)fixture;
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#getShr5Generator() <em>Shr5 Generator</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#getShr5Generator()
     * @generated not
     */
    public void testGetShr5Generator() {
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
       fail("testHasSpendAllPoints__DiagnosticChain_Map need to be implemented in subtest");
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNotMoreMaxAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Not More Max Attributes</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNotMoreMaxAttributes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasNotMoreMaxAttributes__DiagnosticChain_Map() {
        createBasicCategories();
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        Spezies spezies = Shr5Factory.eINSTANCE.createSpezies();
        character.getPersona().setSpezies(spezies);
        spezies.setKonstitutionMax(5);
        spezies.setStaerkeMax(5);
        spezies.setReaktionMax(5);
        spezies.setGeschicklichkeitMax(5);
        spezies.setCharismaMax(5);
        spezies.setIntuitionMax(5);
        spezies.setWillenskraftMax(5);
        spezies.setLogikMax(5);

        getFixture().setCharacter(character);

        shr5System.setNumberOfMaxAttributes(2);
        Map<Object, Object> context = Collections.EMPTY_MAP;
        DiagnosticChain diagnostics = new BasicDiagnostic();
        assertEquals("is true", true, getFixture().hasNotMoreMaxAttributes(diagnostics, context));

        character.getPersona().setKonstitutionBasis(5);
        assertEquals("is true", true, getFixture().hasNotMoreMaxAttributes(diagnostics, context));
        character.getPersona().setReaktionBasis(5);
        assertEquals("is true", true, getFixture().hasNotMoreMaxAttributes(diagnostics, context));
        character.getPersona().setStaerkeBasis(5);
        assertEquals("is true", false, getFixture().hasNotMoreMaxAttributes(diagnostics, context));

        getFixture().setCharacter(character);
    }

    private void createBasicCategories() {
        shr5System = Shr5managementFactory.eINSTANCE.createShr5System();
        getFixture().setGenerator(shr5System);
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNoSkillsOverMax(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has No Skills Over Max</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNoSkillsOverMax(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasNoSkillsOverMax__DiagnosticChain_Map() {
        int max = 10;
        getFixture().getShr5Generator().setSkillMax(max);
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        assertEquals(true, getFixture().hasNoSkillsOverMax(diagnostics, context));

        AbstraktPersona persona = character.getPersona();
        PersonaFertigkeit personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        personaFertigkeit.setFertigkeit(Shr5Factory.eINSTANCE.createFertigkeit());
        personaFertigkeit.setStufe(max + 1);
        persona.getFertigkeiten().add(personaFertigkeit);

        assertEquals(false, getFixture().hasNoSkillsOverMax(diagnostics, context));
        personaFertigkeit.setStufe(max);
        assertEquals(true, getFixture().hasNoSkillsOverMax(diagnostics, context));
        getFixture().getShr5Generator().setSkillMax(max - 1);
        assertEquals(false, getFixture().hasNoSkillsOverMax(diagnostics, context));
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNotMoreSpecalism(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has Not More Specalism</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNotMoreSpecalism(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasNotMoreSpecalism__DiagnosticChain_Map() {
        getFixture().getShr5Generator().setNumberOfSpecalism(1);
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);

        assertEquals(true, getFixture().hasNotMoreSpecalism(diagnostics, context));

        AbstraktPersona persona = character.getPersona();
        PersonaFertigkeit personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        personaFertigkeit.setFertigkeit(Shr5Factory.eINSTANCE.createFertigkeit());
        personaFertigkeit.setStufe(1);
        personaFertigkeit.getSpezialisierungen().add(Shr5Factory.eINSTANCE.createSpezialisierung());
        persona.getFertigkeiten().add(personaFertigkeit);

        assertEquals(true, getFixture().hasNotMoreSpecalism(diagnostics, context));
        personaFertigkeit.getSpezialisierungen().add(Shr5Factory.eINSTANCE.createSpezialisierung());
        assertEquals(false, getFixture().hasNotMoreSpecalism(diagnostics, context));
        getFixture().getShr5Generator().setNumberOfSpecalism(2);
        assertEquals(true, getFixture().hasNotMoreSpecalism(diagnostics, context));
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNoAttributesOverSpeciesAtt(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Has No Attributes Over Species Att</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNoAttributesOverSpeciesAtt(org.eclipse.emf.common.util.DiagnosticChain,
     * java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasNoAttributesOverSpeciesAtt__DiagnosticChain_Map() {
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);
        Spezies spezies = Shr5Factory.eINSTANCE.createSpezies();
        character.getPersona().setSpezies(spezies);
        spezies.setKonstitutionMax(6);
        spezies.setStaerkeMax(6);
        spezies.setReaktionMax(6);
        spezies.setGeschicklichkeitMax(6);
        spezies.setCharismaMax(6);
        spezies.setIntuitionMax(6);
        spezies.setWillenskraftMax(6);
        spezies.setLogikMax(6);

        assertEquals(true, getFixture().hasNoAttributesOverSpeciesAtt(diagnostics, context));

        AbstraktPersona persona = character.getPersona();
        persona.setKonstitutionBasis(7);
        assertEquals(false, getFixture().hasNoAttributesOverSpeciesAtt(diagnostics, context));
        spezies.setKonstitutionMax(7);
        assertEquals(true, getFixture().hasNoAttributesOverSpeciesAtt(diagnostics, context));
        persona.setKonstitutionBasis(8);
        assertEquals(false, getFixture().hasNoAttributesOverSpeciesAtt(diagnostics, context));

        PersonaEigenschaft eigenschaft = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
        AttributModifikatorWert modifikatorWert = Shr5Factory.eINSTANCE.createAttributModifikatorWert();
        modifikatorWert.setAttribut(Shr5Package.Literals.SPEZIES__KONSTITUTION_MAX);
        modifikatorWert.setWert(1);
        eigenschaft.getMods().add(modifikatorWert);
        ((KoerperPersona)persona).getEigenschaften().add(eigenschaft);

        assertEquals(true, getFixture().hasNoAttributesOverSpeciesAtt(diagnostics, context));
        persona.setKonstitutionBasis(9);
        assertEquals(false, getFixture().hasNoAttributesOverSpeciesAtt(diagnostics, context));
        persona.setKonstitutionBasis(6);
        assertEquals(true, getFixture().hasNoAttributesOverSpeciesAtt(diagnostics, context));

        persona.setGeschicklichkeitBasis(7);
        assertEquals(false, getFixture().hasNoAttributesOverSpeciesAtt(diagnostics, context));
        spezies.setGeschicklichkeitMax(7);
        assertEquals(true, getFixture().hasNoAttributesOverSpeciesAtt(diagnostics, context));
        persona.setGeschicklichkeitBasis(8);
        assertEquals(false, getFixture().hasNoAttributesOverSpeciesAtt(diagnostics, context));

        eigenschaft = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
        modifikatorWert = Shr5Factory.eINSTANCE.createAttributModifikatorWert();
        modifikatorWert.setAttribut(Shr5Package.Literals.SPEZIES__GESCHICKLICHKEIT_MAX);
        modifikatorWert.setWert(1);
        eigenschaft.getMods().add(modifikatorWert);
        ((KoerperPersona)persona).getEigenschaften().add(eigenschaft);

        assertEquals(true, getFixture().hasNoAttributesOverSpeciesAtt(diagnostics, context));
        persona.setGeschicklichkeitBasis(9);
        assertEquals(false, getFixture().hasNoAttributesOverSpeciesAtt(diagnostics, context));

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNoConstrainVoilation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has No Constrain Voilation</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasNoConstrainVoilation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasNoConstrainVoilation__DiagnosticChain_Map() {
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);
        AbstraktPersona persona = character.getPersona();
        
        assertEquals(true, getFixture().hasNoConstrainVoilation(diagnostics, context));

        
        PersonaEigenschaft eigenschaft = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
        eigenschaft.setParentId("id1");
        
        QuellenConstrain quellenConstrain = Shr5managementFactory.eINSTANCE.createQuellenConstrain();
        quellenConstrain.setSource(eigenschaft);
        
        PersonaEigenschaft eigenschaft1 = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
        eigenschaft1.setParentId("id2");
        quellenConstrain.getTargets().add(eigenschaft1);
        
        getFixture().getShr5Generator().getAdditionalConstrains().add(quellenConstrain);
        
        ((KoerperPersona)persona).getEigenschaften().add(eigenschaft);
        ((KoerperPersona)persona).getEigenschaften().add(eigenschaft1);
        
        assertEquals(false, getFixture().hasNoConstrainVoilation(diagnostics, context));
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasLifestyleChoosen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Lifestyle Choosen</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#hasLifestyleChoosen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * @generated not
     */
    @SuppressWarnings("unchecked")
    public void testHasLifestyleChoosen__DiagnosticChain_Map() {
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        getFixture().setCharacter(character);
        
        assertFalse(getFixture().hasLifestyleChoosen(diagnostics, context));
        character.setChoosenLifestyle(Shr5Factory.eINSTANCE.createLifestyle());
        assertTrue(getFixture().hasLifestyleChoosen(diagnostics, context));
    }

} // Shr5RuleGeneratorTest
