/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.SimpleAction;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleActionTest extends SubjectCommandTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(SimpleActionTest.class);
    }

    /**
     * Constructs a new Simple Action test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleActionTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Simple Action test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected SimpleAction getFixture() {
        return (SimpleAction)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated not
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(GameplayFactory.eINSTANCE.createSimpleAction());
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
        SuccesTestCmd succesTestCmd = GameplayFactory.eINSTANCE.createSuccesTestCmd();
        succesTestCmd.setDicePool(1);
        succesTestCmd.setThresholds(0);
        getFixture().getSubCommands().add(succesTestCmd);
        
        getFixture().redo();
        assertTrue(getFixture().isExecuted());
        assertTrue(succesTestCmd.isExecuted());
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

    
} //SimpleActionTest
