/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.emf.ecore.EStructuralFeature;

import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.DamageTest;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand;
import de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Set Feature Command</b></em>'.
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
public class SetFeatureCommandTest extends TestCase {
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
     * The fixture for this Set Feature Command test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SetFeatureCommand fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(SetFeatureCommandTest.class);
    }

    /**
     * Constructs a new Set Feature Command test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SetFeatureCommandTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Set Feature Command test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(SetFeatureCommand fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Set Feature Command test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SetFeatureCommand getFixture() {
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
        setFixture(GameplayFactory.eINSTANCE.createSetFeatureCommand());
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
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#isCanExecute()
     * @generated not 
     */
    public void testIsCanExecute() {
        assertFalse(getFixture().isCanExecute());
        
        DamageTest damageTest = GameplayFactory.eINSTANCE.createDamageTest();
        getFixture().setObject(damageTest);
        getFixture().setFeature(GameplayPackage.Literals.DAMAGE_TEST__DV);
        
        assertTrue(getFixture().isCanExecute());
        getFixture().setValue(Integer.valueOf(2));
        assertTrue(getFixture().isCanExecute());
        getFixture().setFeature(null);
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
        DamageTest damageTest = GameplayFactory.eINSTANCE.createDamageTest();
        getFixture().setObject(damageTest);
        getFixture().setFeature(GameplayPackage.Literals.DAMAGE_TEST__DV);
        
        assertTrue(getFixture().isCanExecute());
        getFixture().setValue(Integer.valueOf(2));
        assertTrue(getFixture().isCanExecute());
        
        getFixture().redo();
        
        assertEquals(2, damageTest.getDv());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Command#undo() <em>Undo</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.Command#undo()
     * @generated not
     */
    public void testUndo() {
    }

} //SetFeatureCommandTest
