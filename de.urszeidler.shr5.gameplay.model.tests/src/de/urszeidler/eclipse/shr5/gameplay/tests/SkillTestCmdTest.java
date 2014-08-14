/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Skill Test Cmd</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SkillTestCmdTest extends ProbeCommandTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(SkillTestCmdTest.class);
    }

    /**
     * Constructs a new Skill Test Cmd test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SkillTestCmdTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Skill Test Cmd test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected SkillTestCmd getFixture() {
        return (SkillTestCmd)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated not
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(GameplayFactory.eINSTANCE.createSkillTestCmd());
        getFixture().setSubject(GameplayTools.createRuntimeCharacter());
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
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#isCanExecute()
     * @generated not
     */
    public void testIsCanExecute() {
        assertTrue(getFixture().isCanExecute());
        getFixture().setSubject(null);
        assertFalse(getFixture().isCanExecute());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#redo()
     * @generated not
     */
    public void testRedo() {
        AbstraktPersona persona = getFixture().getSubject().getCharacter().getPersona();
        persona.setGeschicklichkeitBasis(1);
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);

        PersonaFertigkeit personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        personaFertigkeit.setFertigkeit(fertigkeit);
        personaFertigkeit.setStufe(100);
        persona.getFertigkeiten().add(personaFertigkeit);

        getFixture().setThresholds(0);
         
        getFixture().setSkill(fertigkeit);
        getFixture().redo();
        assertTrue(getFixture().isExecuted());
       
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#undo() <em>Undo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#undo()
     * @generated not
     */
    public void testUndo() {
        //fail();
    }
} //SkillTestCmdTest
