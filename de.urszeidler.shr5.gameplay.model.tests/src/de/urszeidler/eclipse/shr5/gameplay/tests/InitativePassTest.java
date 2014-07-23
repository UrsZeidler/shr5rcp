/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import de.urszeidler.eclipse.shr5.gameplay.ComplexAction;
import de.urszeidler.eclipse.shr5.gameplay.FreeAction;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.SimpleActions;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Initative Pass</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InitativePassTest extends SubjectCommandTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(InitativePassTest.class);
    }

    /**
     * Constructs a new Initative Pass test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InitativePassTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Initative Pass test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected InitativePass getFixture() {
        return (InitativePass)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated not 
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(GameplayFactory.eINSTANCE.createInitativePass());
        RuntimeCharacter character1 = GameplayTools.createRuntimeCharacter();
        getFixture().setSubject(character1);

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
        assertFalse(getFixture().isExecuted());
        FreeAction freeAction = GameplayFactory.eINSTANCE.createFreeAction();
        getFixture().setFreeAction(freeAction);
        getFixture().redo();
        assertTrue(getFixture().isExecuted());
        assertTrue(freeAction.isExecuted());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#redo()
     * @generated not
     */
    public void testRedo_complexAction() {
        assertFalse(getFixture().isExecuted());
        ComplexAction complexAction = GameplayFactory.eINSTANCE.createComplexAction();
        getFixture().setAction(complexAction);
        getFixture().redo();
        assertTrue(getFixture().isExecuted());
        assertTrue(complexAction.isExecuted());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#redo()
     * @generated not
     */
    public void testRedo_simpleAction() {
        assertFalse(getFixture().isExecuted());
        SimpleActions complexAction = GameplayFactory.eINSTANCE.createSimpleActions();
        getFixture().setAction(complexAction);
        getFixture().redo();
        assertTrue(getFixture().isExecuted());
        assertTrue(complexAction.isExecuted());
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
    
} //InitativePassTest
