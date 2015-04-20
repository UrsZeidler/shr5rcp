/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import java.util.Calendar;

import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EcorePackage;

import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.MartialartStyle;
import de.urszeidler.eclipse.shr5.MartialartTechnique;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaMartialartStyle;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.TimeUnits;
import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.CharacterAdvancementSystem;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.PersonaMartialArtChange;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.TrainingRange;
import de.urszeidler.eclipse.shr5Management.TrainingRate;
import de.urszeidler.eclipse.shr5Management.TrainingsTime;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Trainings Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains() <em>Days Remains</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TrainingsTimeTest extends CharacterChangeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(TrainingsTimeTest.class);
    }

    /**
     * Constructs a new Trainings Time test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TrainingsTimeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Trainings Time test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected TrainingsTime getFixture() {
        return (TrainingsTime)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5managementFactory.eINSTANCE.createTrainingsTime());
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
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains() <em>Days Remains</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains()
     * @generated not
     */
    public void testGetDaysRemains() {
        assertEquals(-1, getFixture().getDaysRemains());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains() <em>Days Remains</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains()
     * @generated not
     */
    public void testGetDaysRemains_Attribute_1() {
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();

        createAdvacementSystem(character);

        AttributeChange attributeChange = Shr5managementFactory.eINSTANCE.createAttributeChange();
        attributeChange.setAttibute(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__KONSTITUTION);
        Integer eGet = (Integer)character.getPersona().eGet(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__KONSTITUTION);

        attributeChange.setFrom(eGet);
        attributeChange.setTo(eGet + 1);

        getFixture().setChange(attributeChange);
        assertEquals(7, getFixture().getDaysRemains());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains() <em>Days Remains</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains()
     * @generated not
     */
    public void testGetDaysRemains_Skill_1() {
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        PersonaFertigkeit pf = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        pf.setFertigkeit(Shr5Factory.eINSTANCE.createFertigkeit());
        character.getPersona().getFertigkeiten().add(pf);

        createAdvacementSystem(character);

        PersonaChange attributeChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
        attributeChange.setChangeable(pf);

        attributeChange.setFrom(0);
        attributeChange.setTo(1);

        getFixture().setChange(attributeChange);
        assertEquals(1, getFixture().getDaysRemains());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains() <em>Days Remains</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains()
     * @generated not
     */
    public void testGetDaysRemains_Skill_2() {
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        PersonaFertigkeit pf = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        pf.setFertigkeit(Shr5Factory.eINSTANCE.createFertigkeit());
        character.getPersona().getFertigkeiten().add(pf);

        createAdvacementSystem(character);

        PersonaChange attributeChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
        attributeChange.setChangeable(pf);

        attributeChange.setFrom(4);
        attributeChange.setTo(5);

        getFixture().setChange(attributeChange);
        assertEquals(10, getFixture().getDaysRemains());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains() <em>Days Remains</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains()
     * @generated not
     */
    public void testGetDaysRemains_SkillGroup_1() {
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        PersonaFertigkeitsGruppe pf = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
        pf.setGruppe(Shr5Factory.eINSTANCE.createFertigkeitsGruppe());
        character.getPersona().getFertigkeitsGruppen().add(pf);

        createAdvacementSystem(character);

        PersonaChange attributeChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
        attributeChange.setChangeable(pf);

        attributeChange.setFrom(0);
        attributeChange.setTo(1);

        getFixture().setChange(attributeChange);
        assertEquals(7, getFixture().getDaysRemains());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains() <em>Days Remains</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains()
     * @generated not
     */
    public void testGetDaysRemains_SkillGroup_2() {
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        PersonaFertigkeitsGruppe pf = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
        pf.setGruppe(Shr5Factory.eINSTANCE.createFertigkeitsGruppe());
        character.getPersona().getFertigkeitsGruppen().add(pf);

        createAdvacementSystem(character);

        PersonaChange attributeChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
        attributeChange.setChangeable(pf);

        attributeChange.setFrom(4);
        attributeChange.setTo(5);

        getFixture().setChange(attributeChange);
        assertEquals(70, getFixture().getDaysRemains());
    }

    /**
     * @see de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost()
     * @generated not
     */
    public void testGetDaysRemains_MartialArtStyle() {
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        PersonaFertigkeit fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        Fertigkeit wfertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setFertigkeit(wfertigkeit);
        fertigkeit.setStufe(1);
        character.getPersona().getFertigkeiten().add(fertigkeit);

        wfertigkeit.getSpezialisierungen().add(Shr5Factory.eINSTANCE.createSpezialisierung());

        PersonaFertigkeit personaFertigkeit = character.getPersona().getFertigkeiten().get(0);
        PersonaMartialartStyle pmas = Shr5Factory.eINSTANCE.createPersonaMartialartStyle();
        MartialartStyle style = Shr5Factory.eINSTANCE.createMartialartStyle();
        style.getUsableWith().add(personaFertigkeit.getFertigkeit());

        pmas.setStyle(style);
        createAdvacementSystem(character);

        PersonaMartialArtChange martialArtChange = Shr5managementFactory.eINSTANCE.createPersonaMartialArtChange();
        martialArtChange.setChangeable(personaFertigkeit);
        martialArtChange.setStyle(style);

        getFixture().setChange(martialArtChange);
        assertEquals(30, getFixture().getDaysRemains());

    }

    /**
     * @see de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost()
     * @generated not
     */
    public void testApplyChanges_MartialArtTechnique_Add() {
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        PersonaFertigkeit fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        Fertigkeit wfertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setFertigkeit(wfertigkeit);
        fertigkeit.setStufe(1);
        character.getPersona().getFertigkeiten().add(fertigkeit);

        wfertigkeit.getSpezialisierungen().add(Shr5Factory.eINSTANCE.createSpezialisierung());

        PersonaFertigkeit personaFertigkeit = character.getPersona().getFertigkeiten().get(0);
        PersonaMartialartStyle pmas = Shr5Factory.eINSTANCE.createPersonaMartialartStyle();
//        PersonaMartialartTechnique pt = Shr5Factory.eINSTANCE.createPersonaMartialartTechnique();
        personaFertigkeit.getSpezialisierungen().add(pmas);
        MartialartStyle style = Shr5Factory.eINSTANCE.createMartialartStyle();
        MartialartTechnique technique = Shr5Factory.eINSTANCE.createMartialartTechnique();
        style.getTechniques().add(technique);
        style.getUsableWith().add(personaFertigkeit.getFertigkeit());
        pmas.setStyle(style);

        createAdvacementSystem(character);

        PersonaMartialArtChange martialArtChange = Shr5managementFactory.eINSTANCE.createPersonaMartialArtChange();
        martialArtChange.setChangeable(null);
        martialArtChange.setStyle(style);
        martialArtChange.setTechnique(technique);

        getFixture().setChange(martialArtChange);
        assertEquals(14, getFixture().getDaysRemains());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains() <em>Days Remains</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains()
     * @generated not
     */
    public void testGetDaysRemains_Range() {
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        PersonaFertigkeit pf = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        pf.setFertigkeit(Shr5Factory.eINSTANCE.createFertigkeit());
        character.getPersona().getFertigkeiten().add(pf);

        createAdvacementSystem(character);

        PersonaChange attributeChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
        attributeChange.setChangeable(pf);

        attributeChange.setFrom(4);
        attributeChange.setTo(5);

        getFixture().setChange(attributeChange);
        assertEquals(10, getFixture().getDaysRemains());
        
        Calendar calendar = Calendar.getInstance();
        TrainingRange tr = Shr5managementFactory.eINSTANCE.createTrainingRange();
        tr.setStart(calendar.getTime());
        getFixture().getTraining().add(tr);
        
        assertEquals(10, getFixture().getDaysRemains());
        tr.setEnd(calendar.getTime());
        assertEquals(9, getFixture().getDaysRemains());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains() <em>Days Remains</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains()
     * @generated not
     */
    public void testGetDaysRemains_Range1() {
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        PersonaFertigkeit pf = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        pf.setFertigkeit(Shr5Factory.eINSTANCE.createFertigkeit());
        character.getPersona().getFertigkeiten().add(pf);

        createAdvacementSystem(character);

        PersonaChange attributeChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
        attributeChange.setChangeable(pf);

        attributeChange.setFrom(4);
        attributeChange.setTo(5);

        getFixture().setChange(attributeChange);
        assertEquals(10, getFixture().getDaysRemains());
        
        Calendar calendar = Calendar.getInstance();
        TrainingRange tr = Shr5managementFactory.eINSTANCE.createTrainingRange();
        tr.setStart(calendar.getTime());
        getFixture().getTraining().add(tr);
        
        assertEquals(10, getFixture().getDaysRemains());
        tr.setEnd(calendar.getTime());
        assertEquals(9, getFixture().getDaysRemains());
        
        tr = Shr5managementFactory.eINSTANCE.createTrainingRange();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        tr.setStart(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        tr.setEnd(calendar.getTime());
        getFixture().getTraining().add(tr);
        assertEquals(7, getFixture().getDaysRemains());
    }


    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains() <em>Days Remains</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.TrainingsTime#getDaysRemains()
     * @generated not
     */
    public void testGetDaysRemains_Wrong_Range1() {
        PlayerCharacter character = PriorityCategorieTest.createMudanCharacter();
        PersonaFertigkeit pf = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        pf.setFertigkeit(Shr5Factory.eINSTANCE.createFertigkeit());
        character.getPersona().getFertigkeiten().add(pf);

        createAdvacementSystem(character);

        PersonaChange attributeChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
        attributeChange.setChangeable(pf);

        attributeChange.setFrom(4);
        attributeChange.setTo(5);

        getFixture().setChange(attributeChange);
        assertEquals(10, getFixture().getDaysRemains());
        
        Calendar calendar = Calendar.getInstance();
        TrainingRange tr = Shr5managementFactory.eINSTANCE.createTrainingRange();
        tr.setStart(calendar.getTime());
        getFixture().getTraining().add(tr);
        
        assertEquals(10, getFixture().getDaysRemains());
        tr.setEnd(calendar.getTime());
        assertEquals(9, getFixture().getDaysRemains());
        
        tr = Shr5managementFactory.eINSTANCE.createTrainingRange();
        calendar.add(Calendar.DAY_OF_YEAR, -1);
        tr.setStart(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, -1);
        tr.setEnd(calendar.getTime());
        getFixture().getTraining().add(tr);
        assertEquals(9, getFixture().getDaysRemains());
    }


    
    /**
     * @param character
     */
    private void createAdvacementSystem(PlayerCharacter character) {
        Shr5Generator generator = Shr5managementFactory.eINSTANCE.createShr5Generator();
        Shr5System system = Shr5managementFactory.eINSTANCE.createShr5System();
        CharacterAdvancementSystem cas = Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem();
        system.setCharacterAdvancements(cas);

        IncreaseCharacterPart a = Shr5managementFactory.eINSTANCE.createIncreaseCharacterPart();
        a.setKarmaFactor(1);
        a.setType(EcorePackage.Literals.EATTRIBUTE);
        TrainingRate tr = Shr5managementFactory.eINSTANCE.createTrainingRate();
        tr.setFactor(1);
        tr.setTimeUnit(TimeUnits.WEEK);
        a.getRangeTableEntries().add(tr);
        system.getCharacterAdvancements().getCharacterAdvancements().add(a);

        a = Shr5managementFactory.eINSTANCE.createIncreaseCharacterPart();
        a.setKarmaFactor(1);
        a.setType(Shr5Package.Literals.FERTIGKEIT);
        tr = Shr5managementFactory.eINSTANCE.createTrainingRate();
        tr.setFactor(1);
        tr.setTimeUnit(TimeUnits.DAY);
        tr.setFrom(1);
        tr.setTo(4);
        a.getRangeTableEntries().add(tr);
        tr = Shr5managementFactory.eINSTANCE.createTrainingRate();
        tr.setFactor(2);
        tr.setTimeUnit(TimeUnits.DAY);
        tr.setFrom(5);
        tr.setTo(8);
        a.getRangeTableEntries().add(tr);
        system.getCharacterAdvancements().getCharacterAdvancements().add(a);

        a = Shr5managementFactory.eINSTANCE.createIncreaseCharacterPart();
        a.setKarmaFactor(1);
        a.setType(Shr5Package.Literals.FERTIGKEITS_GRUPPE);
        tr = Shr5managementFactory.eINSTANCE.createTrainingRate();
        tr.setFactor(1);
        tr.setTimeUnit(TimeUnits.WEEK);
        tr.setFrom(1);
        tr.setTo(4);
        a.getRangeTableEntries().add(tr);
        tr = Shr5managementFactory.eINSTANCE.createTrainingRate();
        tr.setFactor(2);
        tr.setTimeUnit(TimeUnits.WEEK);
        tr.setFrom(5);
        tr.setTo(8);
        a.getRangeTableEntries().add(tr);
        system.getCharacterAdvancements().getCharacterAdvancements().add(a);

        
        a = Shr5managementFactory.eINSTANCE.createIncreaseCharacterPart();
        a.setKarmaFactor(1);
        a.setType(Shr5Package.Literals.PERSONA_MARTIALART_STYLE);
        tr = Shr5managementFactory.eINSTANCE.createTrainingRate();
        tr.setFactor(1);
        tr.setTimeUnit(TimeUnits.MONTH);
        a.getRangeTableEntries().add(tr);
        system.getCharacterAdvancements().getCharacterAdvancements().add(a);


        a = Shr5managementFactory.eINSTANCE.createIncreaseCharacterPart();
        a.setKarmaFactor(1);
        a.setType(Shr5Package.Literals.PERSONA_MARTIALART_TECHNIQUE);
        tr = Shr5managementFactory.eINSTANCE.createTrainingRate();
        tr.setFactor(2);
        tr.setTimeUnit(TimeUnits.WEEK);
        a.getRangeTableEntries().add(tr);
        system.getCharacterAdvancements().getCharacterAdvancements().add(a);


        system.setKarmaPoints(20);
        generator.setGenerator(system);
        generator.setCharacter(character);
        if (character.getDiary() == null)
            character.setDiary(Shr5managementFactory.eINSTANCE.createCharacterDiary());

        character.getDiary().getEntries().add(getFixture());
    }

} // TrainingsTimeTest
