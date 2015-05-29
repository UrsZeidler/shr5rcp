/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FeuerModus;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.Reichweite;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ranged Attack Cmd</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RangedAttackCmdTest extends OpposedSkillTestCmdTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(RangedAttackCmdTest.class);
    }

    /**
     * Constructs a new Ranged Attack Cmd test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RangedAttackCmdTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Ranged Attack Cmd test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected RangedAttackCmd getFixture() {
        return (RangedAttackCmd)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(GameplayFactory.eINSTANCE.createRangedAttackCmd());
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
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#isCanExecute() <em>Can Execute</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#isCanExecute()
     * @generated not
     */
    public void testIsCanExecute() {
        assertFalse(getFixture().isCanExecute());
        getFixture().setSubject(GameplayTools.createRuntimeCharacter());
        assertTrue(getFixture().isCanExecute());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#redo()
     * @generated not
     */
    public void testRedo() {
        RuntimeCharacter runtimeCharacter = GameplayTools.createRuntimeCharacter();
        RuntimeCharacter object = GameplayTools.createRuntimeCharacter();
        AbstraktPersona persona = runtimeCharacter.getCharacter().getPersona();
        persona.setGeschicklichkeitBasis(1);

        Feuerwaffe fw = Shr5Factory.eINSTANCE.createFeuerwaffe();
        fw.getModie().add(FeuerModus.EM);
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);

        PersonaFertigkeit personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        personaFertigkeit.setFertigkeit(fertigkeit);
        personaFertigkeit.setStufe(1);
        persona.getFertigkeiten().add(personaFertigkeit);

        fw.setFertigkeit(fertigkeit);
        getFixture().setSubject(runtimeCharacter);
        getFixture().setWeapon(fw);
        getFixture().setObject(object);

        getFixture().redo();

        assertTrue(getFixture().isExecuted());
        assertEquals(2, getFixture().getProbe().size());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#redo()
     * @generated not
     */
    public void testRedo_skip() {
        RuntimeCharacter runtimeCharacter = GameplayTools.createRuntimeCharacter();
        RuntimeCharacter object = GameplayTools.createRuntimeCharacter();
        AbstraktPersona persona = runtimeCharacter.getCharacter().getPersona();
        persona.setGeschicklichkeitBasis(1);

        Feuerwaffe fw = Shr5Factory.eINSTANCE.createFeuerwaffe();
        fw.getModie().add(FeuerModus.EM);
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);

        PersonaFertigkeit personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        personaFertigkeit.setFertigkeit(fertigkeit);
        personaFertigkeit.setStufe(1);
        persona.getFertigkeiten().add(personaFertigkeit);

        fw.setFertigkeit(fertigkeit);
        getFixture().setSubject(runtimeCharacter);
        getFixture().setWeapon(fw);
        getFixture().setObject(object);
        
        getFixture().setSkipTest(true);
        getFixture().setSuccesses(0);
        getFixture().redo();

        assertTrue(getFixture().isExecuted());
//        assertEquals(2, getFixture().getProbe().size());
        
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#redo()
     * @generated not
     */
    public void testRedo_skip_range_Short() {
        RuntimeCharacter runtimeCharacter = GameplayTools.createRuntimeCharacter();
        RuntimeCharacter object = GameplayTools.createRuntimeCharacter();
        AbstraktPersona persona = runtimeCharacter.getCharacter().getPersona();
        persona.setGeschicklichkeitBasis(1);

        Feuerwaffe fw = Shr5Factory.eINSTANCE.createFeuerwaffe();
        fw.getModie().add(FeuerModus.EM);
        Reichweite reichweite = Shr5Factory.eINSTANCE.createReichweite();
        reichweite.setMin(0);
        reichweite.setKurz(5);
        reichweite.setMittel(10);
        
        fw.setReichweite(reichweite);
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);

        PersonaFertigkeit personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        personaFertigkeit.setFertigkeit(fertigkeit);
        personaFertigkeit.setStufe(1);
        persona.getFertigkeiten().add(personaFertigkeit);

        fw.setFertigkeit(fertigkeit);
        getFixture().setSubject(runtimeCharacter);
        getFixture().setWeapon(fw);
        getFixture().setObject(object);
        getFixture().setRange(3);
        
        getFixture().setSkipTest(true);
        getFixture().setSuccesses(0);
        getFixture().redo();

        assertTrue(getFixture().isExecuted());
        assertEquals(0, getFixture().getMods());
        assertEquals(1, getFixture().getProbeMods().size());
//        assertEquals(2, getFixture().getProbe().size());
        
    }
    
    public void testRedo_skip_range_Med() {
        RuntimeCharacter runtimeCharacter = GameplayTools.createRuntimeCharacter();
        RuntimeCharacter object = GameplayTools.createRuntimeCharacter();
        AbstraktPersona persona = runtimeCharacter.getCharacter().getPersona();
        persona.setGeschicklichkeitBasis(1);

        Feuerwaffe fw = Shr5Factory.eINSTANCE.createFeuerwaffe();
        fw.getModie().add(FeuerModus.EM);
        Reichweite reichweite = Shr5Factory.eINSTANCE.createReichweite();
        reichweite.setMin(0);
        reichweite.setKurz(5);
        reichweite.setMittel(10);
        
        fw.setReichweite(reichweite);
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);

        PersonaFertigkeit personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        personaFertigkeit.setFertigkeit(fertigkeit);
        personaFertigkeit.setStufe(1);
        persona.getFertigkeiten().add(personaFertigkeit);

        fw.setFertigkeit(fertigkeit);
        getFixture().setSubject(runtimeCharacter);
        getFixture().setWeapon(fw);
        getFixture().setObject(object);
        getFixture().setRange(7);
        
        getFixture().setSkipTest(true);
        getFixture().setSuccesses(0);
        getFixture().redo();

        assertTrue(getFixture().isExecuted());
        assertEquals(-1, getFixture().getMods());
        assertEquals(1, getFixture().getProbeMods().size());
//        assertEquals(2, getFixture().getProbe().size());
        
    }
    
    public void testRedo_skip_range_Long() {
        RuntimeCharacter runtimeCharacter = GameplayTools.createRuntimeCharacter();
        RuntimeCharacter object = GameplayTools.createRuntimeCharacter();
        AbstraktPersona persona = runtimeCharacter.getCharacter().getPersona();
        persona.setGeschicklichkeitBasis(1);

        Feuerwaffe fw = Shr5Factory.eINSTANCE.createFeuerwaffe();
        fw.getModie().add(FeuerModus.EM);
        Reichweite reichweite = Shr5Factory.eINSTANCE.createReichweite();
        reichweite.setMin(0);
        reichweite.setKurz(5);
        reichweite.setMittel(10);
        reichweite.setWeit(20);
        reichweite.setExtrem(30);
        
        fw.setReichweite(reichweite);
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);

        PersonaFertigkeit personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        personaFertigkeit.setFertigkeit(fertigkeit);
        personaFertigkeit.setStufe(1);
        persona.getFertigkeiten().add(personaFertigkeit);

        fw.setFertigkeit(fertigkeit);
        getFixture().setSubject(runtimeCharacter);
        getFixture().setWeapon(fw);
        getFixture().setObject(object);
        getFixture().setRange(15);
        
        getFixture().setSkipTest(true);
        getFixture().setSuccesses(0);
        getFixture().redo();

        assertTrue(getFixture().isExecuted());
        assertEquals(-3, getFixture().getMods());
        assertEquals(1, getFixture().getProbeMods().size());
//        assertEquals(2, getFixture().getProbe().size());
        
    }

    public void testRedo_skip_range_Extrem() {
        RuntimeCharacter runtimeCharacter = GameplayTools.createRuntimeCharacter();
        RuntimeCharacter object = GameplayTools.createRuntimeCharacter();
        AbstraktPersona persona = runtimeCharacter.getCharacter().getPersona();
        persona.setGeschicklichkeitBasis(1);

        Feuerwaffe fw = Shr5Factory.eINSTANCE.createFeuerwaffe();
        fw.getModie().add(FeuerModus.EM);
        Reichweite reichweite = Shr5Factory.eINSTANCE.createReichweite();
        reichweite.setMin(0);
        reichweite.setKurz(5);
        reichweite.setMittel(10);
        reichweite.setWeit(20);
        reichweite.setExtrem(30);
        
        fw.setReichweite(reichweite);
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);

        PersonaFertigkeit personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        personaFertigkeit.setFertigkeit(fertigkeit);
        personaFertigkeit.setStufe(1);
        persona.getFertigkeiten().add(personaFertigkeit);

        fw.setFertigkeit(fertigkeit);
        getFixture().setSubject(runtimeCharacter);
        getFixture().setWeapon(fw);
        getFixture().setObject(object);
        getFixture().setRange(25);
        
        getFixture().setSkipTest(true);
        getFixture().setSuccesses(0);
        getFixture().redo();

        assertTrue(getFixture().isExecuted());
        assertEquals(-6, getFixture().getMods());
        assertEquals(1, getFixture().getProbeMods().size());
//        assertEquals(2, getFixture().getProbe().size());
        
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#redo()
     * @generated not
     */
    public void testRedo_Damage() {
        RuntimeCharacter runtimeCharacter = GameplayTools.createRuntimeCharacter();
        RuntimeCharacter object = GameplayTools.createRuntimeCharacter();
        AbstraktPersona persona = runtimeCharacter.getCharacter().getPersona();
        persona.setGeschicklichkeitBasis(1);

        Feuerwaffe fw = Shr5Factory.eINSTANCE.createFeuerwaffe();
        fw.setMagazin(Shr5Factory.eINSTANCE.createMagazin());
        fw.getMagazin().getBullets().add(Shr5Factory.eINSTANCE.createMunition());
        fw.setPraezision(20);
        fw.getModie().add(FeuerModus.EM);
        fw.setSchadenscode("10P");
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);

        PersonaFertigkeit personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        personaFertigkeit.setFertigkeit(fertigkeit);
        personaFertigkeit.setStufe(100);
        persona.getFertigkeiten().add(personaFertigkeit);

        fw.setFertigkeit(fertigkeit);
        getFixture().setSubject(runtimeCharacter);
        getFixture().setWeapon(fw);
        getFixture().setObject(object);
        getFixture().setNumberOfShoots(1);

        getFixture().redo();

        assertTrue(getFixture().isExecuted());
        assertEquals(101, getFixture().getProbe().size());
        assertEquals(20, getFixture().getSuccesses());
        assertEquals(2, getFixture().getSubCommands().size());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#undo() <em>Undo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#undo()
     * @generated not
     */
    public void testUndo() {
        // fail();
    }

    
} //RangedAttackCmdTest
