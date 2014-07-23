/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;
import de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback;
import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subject Command</b></em>'.
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
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Command#undo() <em>Undo</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class SubjectCommandTest extends TestCase {

    /**
     * The fixture for this Subject Command test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubjectCommand fixture = null;

    /**
     * Constructs a new Subject Command test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubjectCommandTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Subject Command test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(SubjectCommand fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Subject Command test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubjectCommand getFixture() {
        return fixture;
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#getCmdCallback() <em>Cmd Callback</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#setCmdCallback(de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback) <em>Cmd Callback</em>}' feature setter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#isCanExecute()
     * @generated not
     */
    public void testIsCanExecute() {
        fail();
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#redo()
     * @generated not
     */
    public void testRedo() {
        fail();
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#undo() <em>Undo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#undo()
     * @generated not
     */
    public void testUndo() {
        fail();
    }

} //SubjectCommandTest
