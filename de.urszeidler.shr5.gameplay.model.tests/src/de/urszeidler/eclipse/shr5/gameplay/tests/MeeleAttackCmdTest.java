/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.Nahkampfwaffe;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Meele Attack Cmd</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeeleAttackCmdTest extends OpposedSkillTestCmdTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(MeeleAttackCmdTest.class);
    }

    /**
     * Constructs a new Meele Attack Cmd test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeeleAttackCmdTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Meele Attack Cmd test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected MeeleAttackCmd getFixture() {
        return (MeeleAttackCmd)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(GameplayFactory.eINSTANCE.createMeeleAttackCmd());
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

        Nahkampfwaffe nahkampfwaffe = Shr5Factory.eINSTANCE.createNahkampfwaffe();
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);

        PersonaFertigkeit personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        personaFertigkeit.setFertigkeit(fertigkeit);
        personaFertigkeit.setStufe(1);
        persona.getFertigkeiten().add(personaFertigkeit);

        nahkampfwaffe.setFertigkeit(fertigkeit);
        getFixture().setSubject(runtimeCharacter);
        getFixture().setWeapon(nahkampfwaffe);
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
    public void testRedo_Damage() {
        RuntimeCharacter runtimeCharacter = GameplayTools.createRuntimeCharacter();
        RuntimeCharacter object = GameplayTools.createRuntimeCharacter();
        AbstraktPersona persona = runtimeCharacter.getCharacter().getPersona();
        persona.setGeschicklichkeitBasis(1);

        Nahkampfwaffe nahkampfwaffe = Shr5Factory.eINSTANCE.createNahkampfwaffe();
        nahkampfwaffe.setPraezision(20);
        nahkampfwaffe.setSchadenscode("10P");
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);

        PersonaFertigkeit personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        personaFertigkeit.setFertigkeit(fertigkeit);
        personaFertigkeit.setStufe(100);
        persona.getFertigkeiten().add(personaFertigkeit);

        nahkampfwaffe.setFertigkeit(fertigkeit);
        getFixture().setSubject(runtimeCharacter);
        getFixture().setWeapon(nahkampfwaffe);
        getFixture().setObject(object);

        getFixture().redo();

        assertTrue(getFixture().isExecuted());
        assertEquals(101, getFixture().getProbe().size());
        assertEquals(20, getFixture().getSuccesses());
        assertEquals(2, getFixture().getSubCommands().size());
    }
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#redo()
     * @generated not
     */
    public void testRedo_Damage_skip() {
        RuntimeCharacter runtimeCharacter = GameplayTools.createRuntimeCharacter();
        RuntimeCharacter object = GameplayTools.createRuntimeCharacter();
        AbstraktPersona persona = runtimeCharacter.getCharacter().getPersona();
        persona.setGeschicklichkeitBasis(1);
        Spezies spezies = Shr5Factory.eINSTANCE.createSpezies();
        AttributModifikatorWert modifikatorWert = Shr5Factory.eINSTANCE.createAttributModifikatorWert();
        modifikatorWert.setAttribut(Shr5Package.Literals.NAHKAMPFWAFFE__REICHWEITE);
        modifikatorWert.setWert(10);
        spezies.getMods().add(modifikatorWert);
        persona.setSpezies(spezies);


        Nahkampfwaffe nahkampfwaffe = Shr5Factory.eINSTANCE.createNahkampfwaffe();
        nahkampfwaffe.setPraezision(20);
        nahkampfwaffe.setSchadenscode("10P");
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);

        PersonaFertigkeit personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        personaFertigkeit.setFertigkeit(fertigkeit);
        personaFertigkeit.setStufe(10);
        persona.getFertigkeiten().add(personaFertigkeit);

        nahkampfwaffe.setFertigkeit(fertigkeit);
        getFixture().setSubject(runtimeCharacter);
        getFixture().setWeapon(nahkampfwaffe);
        getFixture().setObject(object);

        getFixture().setSkipTest(true);
        getFixture().setSuccesses(10);
        getFixture().redo();

        assertTrue(getFixture().isExecuted());
//        assertEquals(101, getFixture().getProbe().size());
        assertEquals(10, getFixture().getSuccesses());
        assertEquals(2, getFixture().getSubCommands().size());
        DefensTestCmd command = (DefensTestCmd)getFixture().getSubCommands().get(0);
        assertEquals(-10, command.getMods());
        assertEquals(10, command.getAttackersHits());
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

} // MeeleAttackCmdTest
