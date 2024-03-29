/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.InterruptAction;
import de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Combat Turn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#getCmdCallback() <em>Cmd Callback</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#isCanExecute() <em>Can Execute</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#doTurn() <em>Do Turn</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#undo() <em>Undo</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CombatTurnTest extends TestCase {

    public final class CommandCallbackImplementation implements CommandCallback {
        @Override
        public boolean prepareCommand(Command cmd, EStructuralFeature... eStructuralFeatures) {
            return true;
        }

        @Override
        public void afterCommand(Command cmd, EStructuralFeature... eStructuralFeatures) {
           
            
        }

        @Override
        public void beforeExecute(Command cmd, EStructuralFeature... eStructuralFeatures) {
        }

        @Override
        public void beforeSubcommands(Command cmd, EStructuralFeature... eStructuralFeatures) {
         }
    }

    /**
     * The fixture for this Combat Turn test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CombatTurn fixture = null;
    private RuntimeCharacter character1;
    private RuntimeCharacter character2;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(CombatTurnTest.class);
    }

    /**
     * Constructs a new Combat Turn test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CombatTurnTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Combat Turn test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(CombatTurn fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Combat Turn test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CombatTurn getFixture() {
        return fixture;
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
        setFixture(GameplayFactory.eINSTANCE.createCombatTurn());

        character1 = GameplayTools.createRuntimeCharacter();
        character2 = GameplayTools.createRuntimeCharacter();

        // getFixture().setCmdCallback(new CommandCallback() {
        //
        // @Override
        // public void prepareCommand(Command cmd, EStructuralFeature... eStructuralFeatures) {
        //
        //
        // }
        // });

        getFixture().getCombatants().add(character1);
        getFixture().getCombatants().add(character2);

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
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#getCmdCallback() <em>Cmd Callback</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#getCmdCallback()
     * @generated not
     */
    public void testGetCmdCallback() {
        assertNull(getFixture().getCmdCallback());

        getFixture().setCmdCallback(new CommandCallbackImplementation());
        assertNotNull(getFixture().getCmdCallback());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#setCmdCallback(de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback)
     * <em>Cmd Callback</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#setCmdCallback(de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback)
     * @generated not
     */
    public void testSetCmdCallback() {
        assertNull(getFixture().getCmdCallback());

        getFixture().setCmdCallback(new CommandCallbackImplementation());
        assertNotNull(getFixture().getCmdCallback());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#unsetCmdCallback() <em>unsetCmdCallback()</em>}' method.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#unsetCmdCallback()
     * @generated not
     */
    public void testUnsetCmdCallback() {
        assertNull(getFixture().getCmdCallback());

        getFixture().setCmdCallback(new CommandCallbackImplementation());
        assertNotNull(getFixture().getCmdCallback());

        getFixture().setCmdCallback(null);
        assertNull(getFixture().getCmdCallback());
        getFixture().unsetCmdCallback();
        assertFalse(getFixture().isSetCmdCallback());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#isSetCmdCallback() <em>isSetCmdCallback()</em>}' method.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#isSetCmdCallback()
     * @generated not
     */
    public void testIsSetCmdCallback() {
        assertNull(getFixture().getCmdCallback());
        assertFalse(getFixture().isSetCmdCallback());

        getFixture().setCmdCallback(new CommandCallbackImplementation());
        assertNotNull(getFixture().getCmdCallback());
        assertTrue(getFixture().isSetCmdCallback());
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
        getFixture().getCombatants().clear();
        assertFalse(getFixture().isCanExecute());

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#doTurn() <em>Do Turn</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.CombatTurn#doTurn()
     * @generated not
     */
    public void testDoTurn() {
        // assertNull(getFixture().getCurrentTurn());
        // assertEquals(0, getFixture().getSubCommands().size());
        // assertEquals(0,getFixture().getActionPhases().size());
        //
        // getFixture().redo();
        //
        // assertEquals(2, getFixture().getSubCommands().size());
        testRedo();
        assertEquals(2, getFixture().getActionPhases().size());
        assertNotNull(getFixture().getCurrentTurn());
        InitativePass turn1 = getFixture().getCurrentTurn();
        getFixture().doTurn();
        assertNotNull(getFixture().getCurrentTurn());
        assertNotSame(turn1, getFixture().getCurrentTurn());
        getFixture().doTurn();
        assertNull(getFixture().getCurrentTurn());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#doTurn() <em>Do Turn</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.CombatTurn#doTurn()
     * @generated not
     */
    public void testDoTurn_Ini1() {
        AbstraktPersona persona = character1.getCharacter().getPersona();
        adjustPersona(persona);
        AbstraktPersona persona1 = character2.getCharacter().getPersona();
        adjustPersona(persona1);

        assertNull(getFixture().getCurrentTurn());
        assertEquals(0, getFixture().getSubCommands().size());
        assertEquals(0, getFixture().getActionPhases().size());

        getFixture().redo();

        assertEquals(4, getFixture().getActionPhases().size());
        assertEquals(2, getFixture().getSubCommands().size());
        //
        assertNotNull(getFixture().getCurrentTurn());

        InitativePass turn1 = getFixture().getCurrentTurn();
        assertEquals(11, turn1.getPhase());
        getFixture().doTurn();
        assertNotNull(getFixture().getCurrentTurn());
        assertNotSame(turn1, getFixture().getCurrentTurn());
        InitativePass turn2 = getFixture().getCurrentTurn();
        assertEquals(11, turn2.getPhase());
        getFixture().doTurn();

        InitativePass turn11 = getFixture().getCurrentTurn();
        assertEquals(1, turn11.getPhase());
        getFixture().doTurn();
        assertNotNull(getFixture().getCurrentTurn());
        assertNotSame(turn11, getFixture().getCurrentTurn());
        InitativePass turn12 = getFixture().getCurrentTurn();
        assertEquals(1, turn12.getPhase());
        getFixture().doTurn();

        assertNull(getFixture().getCurrentTurn());
    }

    protected void adjustPersona(AbstraktPersona persona) {
        if (persona instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)persona;
            PersonaEigenschaft personaEigenschaft = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
            AttributModifikatorWert modifikatorWert = Shr5Factory.eINSTANCE.createAttributModifikatorWert();
            modifikatorWert.setAttribut(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL);
            modifikatorWert.setWert(-1);
            personaEigenschaft.getMods().add(modifikatorWert);
            kp.getEigenschaften().add(personaEigenschaft);
        }
        persona.setReaktionBasis(5);
        persona.setIntuitionBasis(6);
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
        assertNull(getFixture().getCurrentTurn());
        assertEquals(0, getFixture().getSubCommands().size());
        assertEquals(0, getFixture().getActionPhases().size());

        getFixture().redo();

        assertEquals(2, getFixture().getSubCommands().size());
        assertEquals(2, getFixture().getActionPhases().size());

        assertNotNull(getFixture().getCurrentTurn());
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

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#doTurn() <em>Do Turn</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.CombatTurn#doTurn()
     * @generated not
     */
    public void testDoTurn_InterruptAction() {
        AbstraktPersona persona = character1.getCharacter().getPersona();
        adjustPersona(persona);
        persona.setIntuitionBasis(7);
        AbstraktPersona persona1 = character2.getCharacter().getPersona();
        adjustPersona(persona1);

        assertNull(getFixture().getCurrentTurn());
        assertEquals(0, getFixture().getSubCommands().size());
        assertEquals(0, getFixture().getActionPhases().size());

        getFixture().redo();

        assertEquals(4, getFixture().getActionPhases().size());
        assertEquals(2, getFixture().getSubCommands().size());
        //
        assertNotNull(getFixture().getCurrentTurn());

        InitativePass turn1 = getFixture().getActionPhases().get(1);
        InterruptAction ia = GameplayFactory.eINSTANCE.createInterruptAction();
        ia.setIniCost(-5);
        turn1.setInterruptAction(ia);
        ia.redo();
        assertEquals(6, turn1.getPhase());
        assertEquals(3, getFixture().getActionPhases().size());
        getFixture().doTurn();
        assertNotNull(getFixture().getCurrentTurn());
        assertSame(turn1, getFixture().getCurrentTurn());
        InitativePass turn2 = getFixture().getCurrentTurn();
        assertEquals(6, turn2.getPhase());
        getFixture().doTurn();

        InitativePass turn11 = getFixture().getCurrentTurn();
        assertEquals(2, turn11.getPhase());
        getFixture().doTurn();

        assertNull(getFixture().getCurrentTurn());
    }

} // CombatTurnTest
