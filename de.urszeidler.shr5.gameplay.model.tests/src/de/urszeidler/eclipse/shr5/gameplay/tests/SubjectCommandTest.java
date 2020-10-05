/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import junit.framework.TestCase;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.Kleidung;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;
import de.urszeidler.eclipse.shr5.gameplay.util.CommandCallback;
import de.urszeidler.eclipse.shr5.runtime.ExtendetData;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.Zustand;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;

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
    public class RuntimeCharacterImplementation implements RuntimeCharacter {
        @Override
        public void setZustand(Zustand value) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void setPhysicalDamage(int value) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void setMentalDamage(int value) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public Zustand getZustand() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public int getPhysicalDamage() {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public int getOverDead() {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public int getMentalDamage() {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public void eSetDeliver(boolean deliver) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void eNotify(Notification notification) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public boolean eDeliver() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public EList<Adapter> eAdapters() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public void eUnset(EStructuralFeature feature) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void eSet(EStructuralFeature feature, Object newValue) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public Resource eResource() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public boolean eIsSet(EStructuralFeature feature) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean eIsProxy() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Object eGet(EStructuralFeature feature, boolean resolve) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Object eGet(EStructuralFeature feature) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public EList<EObject> eCrossReferences() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public EList<EObject> eContents() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public EReference eContainmentFeature() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public EStructuralFeature eContainingFeature() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public EObject eContainer() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public EClass eClass() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public TreeIterator<EObject> eAllContents() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public void setExtendetData(Map<ExtendetData, Object> value) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void increaseValue(ExtendetData data, int value) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public boolean hasValue(ExtendetData data) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public EList<?> getListValue(ExtendetData data) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public int getIntegerValue(ExtendetData data) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public Map<ExtendetData, Object> getExtendetData() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public void decreaseValue(ExtendetData data, int value) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void addUniqueToList(ExtendetData data, Object value) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void addToList(ExtendetData data, Object value) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void addToExtendetData(ExtendetData data, Object value) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void setUsedEdge(int value) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void setRightHand(AbstraktGegenstand value) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void setLeftHand(AbstraktGegenstand value) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void setCharacter(ManagedCharacter value) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void setArmor(Kleidung value) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public int getUsedEdge() {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public AbstraktGegenstand getRightHand() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public AbstraktGegenstand getLeftHand() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public EList<AbstraktGegenstand> getInUse() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public ManagedCharacter getCharacter() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Kleidung getArmor() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public boolean canUseEdge() {
            // TODO Auto-generated method stub
            return false;
        }
    }

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
        getFixture().setSubject(new RuntimeCharacterImplementation());

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
//        getFixture().setSubject(new RuntimeCharacterImplementation());
//        getFixture().redo();
//        fail();
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

} //SubjectCommandTest
