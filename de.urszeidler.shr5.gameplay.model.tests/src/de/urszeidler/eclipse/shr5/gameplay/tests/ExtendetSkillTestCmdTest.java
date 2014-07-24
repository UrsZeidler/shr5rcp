/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import java.util.Date;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.Intervall;
import de.urszeidler.eclipse.shr5.gameplay.TimeUnits;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Extendet Skill Test Cmd</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ExtendetSkillTestCmdTest extends SkillTestCmdTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ExtendetSkillTestCmdTest.class);
    }

    /**
     * Constructs a new Extendet Skill Test Cmd test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public ExtendetSkillTestCmdTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Extendet Skill Test Cmd test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected ExtendetSkillTestCmd getFixture() {
        return (ExtendetSkillTestCmd)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated not
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(GameplayFactory.eINSTANCE.createExtendetSkillTestCmd());
        getFixture().setSubject(GameplayTools.createRuntimeCharacter());
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
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#isCanExecute() <em>Can Execute</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
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
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#redo()
     * @generated not
     */
    public void testRedo() {
        Date startDate = new Date(0);
        AbstraktPersona persona = getFixture().getSubject().getCharacter().getPersona();
        persona.setGeschicklichkeitBasis(1);
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);

        PersonaFertigkeit personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        personaFertigkeit.setFertigkeit(fertigkeit);
        personaFertigkeit.setStufe(100);
        persona.getFertigkeiten().add(personaFertigkeit);

        Intervall intervall = GameplayFactory.eINSTANCE.createIntervall();
        intervall.setQuantities(10);
        intervall.setUnits(TimeUnits.MIN);

        getFixture().setThresholds(10);
        getFixture().setLimit(2);
        getFixture().setIntervall(intervall);
        getFixture().setSkill(personaFertigkeit);
        getFixture().setDate(startDate);
        getFixture().redo();
        assertTrue(getFixture().isExecuted());

        assertEquals(startDate.getTime(), getFixture().getStartDate().getTime());
        assertEquals(5, getFixture().getSubCommands().size());
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
} // ExtendetSkillTestCmdTest
