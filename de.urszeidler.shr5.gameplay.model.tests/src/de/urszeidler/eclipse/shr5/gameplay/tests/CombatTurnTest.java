/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Combat Turn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 * <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#getCmdCallback() <em>Cmd Callback</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#isCanExecute() <em>Can Execute</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 * <li>{@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn#doTurn() <em>Do Turn</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#undo() <em>Undo</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CombatTurnTest extends TestCase {

    /**
     * The fixture for this Combat Turn test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected CombatTurn fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(CombatTurnTest.class);
    }

    /**
     * Constructs a new Combat Turn test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public CombatTurnTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Combat Turn test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void setFixture(CombatTurn fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Combat Turn test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
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
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(GameplayFactory.eINSTANCE.createCombatTurn());

        RuntimeCharacter character1 = createRuntimeCharacter();
        RuntimeCharacter character2 = createRuntimeCharacter();

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
     * Create a runtime character.
     * 
     * @return
     */
    protected RuntimeCharacter createRuntimeCharacter() {
        ManagedCharacter character = Shr5managementFactory.eINSTANCE.createNonPlayerCharacter();
        AbstraktPersona persona = Shr5Factory.eINSTANCE.createMudanPersona();
        persona.setKonstitutionBasis(4);
        character.setPersona(persona);

        RuntimeCharacter runtimeCharacter = RuntimeFactory.eINSTANCE.createRuntimeCharacter();
        runtimeCharacter.setCharacter(character);

        return runtimeCharacter;
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
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#getCmdCallback() <em>Cmd Callback</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#getCmdCallback()
     * @generated not
     */
    public void testGetCmdCallback() {
        assertNull(getFixture().getCmdCallback());

        getFixture().setCmdCallback(new CommandCallback() {

            @Override
            public void prepareCommand(Command cmd, EStructuralFeature... eStructuralFeatures) {

            }
        });
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

        getFixture().setCmdCallback(new CommandCallback() {

            @Override
            public void prepareCommand(Command cmd, EStructuralFeature... eStructuralFeatures) {

            }
        });
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

        getFixture().setCmdCallback(new CommandCallback() {

            @Override
            public void prepareCommand(Command cmd, EStructuralFeature... eStructuralFeatures) {

            }
        });
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

        getFixture().setCmdCallback(new CommandCallback() {

            @Override
            public void prepareCommand(Command cmd, EStructuralFeature... eStructuralFeatures) {

            }
        });
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
//        assertNull(getFixture().getCurrentTurn());
//        assertEquals(0,  getFixture().getSubCommands().size());
//        assertEquals(0,getFixture().getActionPhases().size());
//        
//        getFixture().redo();
//        
//       assertEquals(2,  getFixture().getSubCommands().size());
        testRedo();        
       assertEquals(2,getFixture().getActionPhases().size());
       assertNotNull(getFixture().getCurrentTurn());
       InitativePass turn1 = getFixture().getCurrentTurn();
       getFixture().doTurn();
       assertNotNull(getFixture().getCurrentTurn());
       assertNotSame(turn1, getFixture().getCurrentTurn());
       getFixture().doTurn();
       assertNull(getFixture().getCurrentTurn());
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
        assertEquals(0,  getFixture().getSubCommands().size());
        assertEquals(0,getFixture().getActionPhases().size());
        
        getFixture().redo();
        
       assertEquals(2,  getFixture().getSubCommands().size());
       assertEquals(2,getFixture().getActionPhases().size());
        
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

} // CombatTurnTest
