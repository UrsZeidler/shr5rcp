/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.SimpleAction;
import de.urszeidler.eclipse.shr5.gameplay.SimpleActions;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Actions</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleActionsTest extends CommandWrapperTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(SimpleActionsTest.class);
    }

    /**
     * Constructs a new Simple Actions test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleActionsTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Simple Actions test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected SimpleActions getFixture() {
        return (SimpleActions)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated not
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(GameplayFactory.eINSTANCE.createSimpleActions());
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
        assertFalse(getFixture().isCanExecute());
        SimpleAction action1 = GameplayFactory.eINSTANCE.createSimpleAction();
        getFixture().setAction1(action1);
        SimpleAction action2 = GameplayFactory.eINSTANCE.createSimpleAction();
        getFixture().setAction2(action2);

        assertTrue(getFixture().isCanExecute());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#redo()
     * @generated not
     */
    public void testRedo() {
        SuccesTestCmd succesTestCmd = GameplayFactory.eINSTANCE.createSuccesTestCmd();
        succesTestCmd.setDicePool(1);
        succesTestCmd.setThresholds(0);
        getFixture().getSubCommands().add(succesTestCmd);
        SimpleAction action1 = GameplayFactory.eINSTANCE.createSimpleAction();
        getFixture().setAction1(action1);
        SimpleAction action2 = GameplayFactory.eINSTANCE.createSimpleAction();
        getFixture().setAction2(action2);
        
        getFixture().redo();
        assertTrue(getFixture().isExecuted());
        assertFalse(succesTestCmd.isExecuted());
        assertTrue(action1.isExecuted());
        assertTrue(action2.isExecuted());
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



} //SimpleActionsTest
