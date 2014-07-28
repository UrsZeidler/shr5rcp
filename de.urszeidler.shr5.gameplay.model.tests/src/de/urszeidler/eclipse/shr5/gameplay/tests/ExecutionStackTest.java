/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.ExecutionStack;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Execution Stack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.ExecutionStack#redo() <em>Redo</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ExecutionStackTest extends TestCase {

    /**
     * The fixture for this Execution Stack test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExecutionStack fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ExecutionStackTest.class);
    }

    /**
     * Constructs a new Execution Stack test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionStackTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Execution Stack test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(ExecutionStack fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Execution Stack test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExecutionStack getFixture() {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(GameplayFactory.eINSTANCE.createExecutionStack());
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
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.ExecutionStack#redo() <em>Redo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.ExecutionStack#redo()
     * @generated not
     */
    public void testRedo() {
        RuntimeCharacter character1 = GameplayTools.createRuntimeCharacter();
        RuntimeCharacter character2 = GameplayTools.createRuntimeCharacter();

        CombatTurn combatTurn = GameplayFactory.eINSTANCE.createCombatTurn();
        combatTurn.getCombatants().add(character1);
        combatTurn.getCombatants().add(character2);
        
        assertFalse(combatTurn.isExecuting());  
        getFixture().setCurrentCommand(combatTurn);
        getFixture().redo();
        
        assertTrue(combatTurn.isExecuting());       
    }

} //ExecutionStackTest
