/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.SetExtendetData;
import de.urszeidler.eclipse.shr5.gameplay.tests.SetFeatureCommandTest.CommandCallbackImplementation;
import de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback;
import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Set Extendet Data</b></em>'.
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
public class SetExtendetDataTest extends TestCase {
    public final class CommandCallbackImplementation implements CommandCallback {
        @Override
        public void prepareCommand(Command cmd, EStructuralFeature... eStructuralFeatures) {

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
     * The fixture for this Set Extendet Data test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SetExtendetData fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(SetExtendetDataTest.class);
    }

    /**
     * Constructs a new Set Extendet Data test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SetExtendetDataTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Set Extendet Data test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(SetExtendetData fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Set Extendet Data test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SetExtendetData getFixture() {
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
        setFixture(GameplayFactory.eINSTANCE.createSetExtendetData());
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
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#getCmdCallback()
     * @generated not
     */
    public void testGetCmdCallback() {
        assertNull(getFixture().getCmdCallback());

        getFixture().setCmdCallback(new CommandCallbackImplementation());
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

        getFixture().setCmdCallback(new CommandCallbackImplementation());
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
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#isSetCmdCallback()
     * @generated
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
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#isCanExecute()
     * @generated
     */
    public void testIsCanExecute() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#redo() <em>Redo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#redo()
     * @generated
     */
    public void testRedo() {
        // TODO: implement this operation test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#undo() <em>Undo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#undo()
     * @generated
     */
    public void testUndo() {
        // TODO: implement this operation test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail();
    }

} //SetExtendetDataTest
