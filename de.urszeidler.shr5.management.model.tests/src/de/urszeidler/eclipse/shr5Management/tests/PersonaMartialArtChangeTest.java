/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.MartialartStyle;
import de.urszeidler.eclipse.shr5.MartialartTechnique;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaMartialartStyle;
import de.urszeidler.eclipse.shr5.PersonaMartialartTechnique;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5Management.PersonaMartialArtChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Persona Martial Art Change</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated not
 */
public class PersonaMartialArtChangeTest extends PersonaValueChangeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(PersonaMartialArtChangeTest.class);
    }

    /**
     * Constructs a new Persona Martial Art Change test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public PersonaMartialArtChangeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Persona Martial Art Change test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected PersonaMartialArtChange getFixture() {
        return (PersonaMartialArtChange)fixture;
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
        setFixture(Shr5managementFactory.eINSTANCE.createPersonaMartialArtChange());
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

    @Override
    public void testApplyChanges() {
        testApplyChanges_MartialArtStyle_Add();
        testApplyChanges_MartialArtTechnique_Add();
    }
    
     @Override
    public void testGetKarmaCost() {
       testGetKarmaCost_Style();
       testGetKarmaCost_Technique();
    }

    public void testGetKarmaCost_Style() {
        PersonaFertigkeit personaFertigkeit = playerCharacter.getPersona().getFertigkeiten().get(0);
        PersonaMartialartStyle pmas = Shr5Factory.eINSTANCE.createPersonaMartialartStyle();
        MartialartStyle style = Shr5Factory.eINSTANCE.createMartialartStyle();
        style.getUsableWith().add(personaFertigkeit.getFertigkeit());
        pmas.setStyle(style);

        getFixture().setChangeable(personaFertigkeit);
        getFixture().setStyle(pmas.getStyle());

        playerCharacter.getChanges().add(getFixture());
        assertEquals(-7, getFixture().getKarmaCost());
        assertEquals(getFixture().getFrom(), 0);
        assertEquals(getFixture().getTo(), 1);

    }

    public void testGetKarmaCost_Technique() {
        PersonaFertigkeit personaFertigkeit = playerCharacter.getPersona().getFertigkeiten().get(0);
        PersonaMartialartStyle pmas = Shr5Factory.eINSTANCE.createPersonaMartialartStyle();
        MartialartStyle style = Shr5Factory.eINSTANCE.createMartialartStyle();
        MartialartTechnique technique2 = Shr5Factory.eINSTANCE.createMartialartTechnique();
        style.getTechniques().add(technique2);
        style.getUsableWith().add(personaFertigkeit.getFertigkeit());
        pmas.setStyle(style);
        PersonaMartialartTechnique technique = Shr5Factory.eINSTANCE.createPersonaMartialartTechnique();
        technique.setTechnique(technique2);
        
        getFixture().setChangeable(null);
        getFixture().setStyle(pmas.getStyle());
        getFixture().setTechnique(technique2);

        playerCharacter.getChanges().add(getFixture());
        assertEquals(-5, getFixture().getKarmaCost());
        assertEquals(getFixture().getFrom(), 0);
        assertEquals(getFixture().getTo(), 1);

    }

    /**
     * @see de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost()
     * @generated not
     */
    public void testApplyChanges_MartialArtStyle_Add() {
        PersonaFertigkeit personaFertigkeit = playerCharacter.getPersona().getFertigkeiten().get(0);
        MartialartStyle style = Shr5Factory.eINSTANCE.createMartialartStyle();
        MartialartTechnique technique2 = Shr5Factory.eINSTANCE.createMartialartTechnique();
        style.getTechniques().add(technique2);
        style.getUsableWith().add(personaFertigkeit.getFertigkeit());

        getFixture().setChangeable(personaFertigkeit);
        getFixture().setStyle(style);
        getFixture().setTechnique(technique2);

        playerCharacter.getChanges().add(getFixture());
        assertEquals(-7, getFixture().getKarmaCost());
        assertEquals(getFixture().getFrom(), 0);
        assertEquals(getFixture().getTo(), 1);

        getFixture().applyChanges();
        assertEquals(true, personaFertigkeit.getSpezialisierungen().size()==1);
        PersonaMartialartStyle pmas = (PersonaMartialartStyle)personaFertigkeit.getSpezialisierungen().get(0);
        assertEquals(style, pmas.getStyle());
        
        assertEquals(1, pmas.getTechniques().size());
        PersonaMartialartTechnique martialartTechnique = pmas.getTechniques().get(0);
        assertEquals(martialartTechnique.getTechnique(), technique2);

        assertEquals(true, playerCharacter.getPersona().getMartialartStyles().size()==1);
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
        MartialartStyle style = Shr5Factory.eINSTANCE.createMartialartStyle();
        MartialartTechnique technique2 = Shr5Factory.eINSTANCE.createMartialartTechnique();
        style.getTechniques().add(technique2);
        style.getUsableWith().add(personaFertigkeit.getFertigkeit());
        pmas.setStyle(style);
        playerCharacter.getPersona().getMartialartStyles().add(pmas);
        
        getFixture().setChangeable(null);
        getFixture().setStyle(pmas.getStyle());
        getFixture().setTechnique(technique2);

        playerCharacter.getChanges().add(getFixture());
        assertEquals(-5, getFixture().getKarmaCost());
        assertEquals(getFixture().getFrom(), 0);
        assertEquals(getFixture().getTo(), 1);

        getFixture().applyChanges();
        assertEquals(1, pmas.getTechniques().size());
        PersonaMartialartTechnique martialartTechnique = pmas.getTechniques().get(0);
        assertEquals(martialartTechnique.getTechnique(), technique2);
        
        assertEquals(true, getFixture().isChangeApplied());
        assertNotNull(getFixture().getDateApplied());
    }

} // PersonaMartialArtChangeTest
