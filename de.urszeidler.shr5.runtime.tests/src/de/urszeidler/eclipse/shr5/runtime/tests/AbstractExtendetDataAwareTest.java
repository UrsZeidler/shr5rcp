/**
 */
package de.urszeidler.eclipse.shr5.runtime.tests;

import org.eclipse.emf.common.util.EList;

import de.urszeidler.eclipse.shr5.runtime.AbstractExtendetDataAware;
import de.urszeidler.eclipse.shr5.runtime.ExtendetData;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract Extendet Data Aware</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 * <li>
 * {@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#addToExtendetData(de.urszeidler.eclipse.shr5.runtime.ExtendetData, java.lang.Object)
 * <em>Add To Extendet Data</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#getIntegerValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData) <em>Get Integer
 * Value</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#increaseValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData, int) <em>Increase
 * Value</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#decreaseValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData, int) <em>Decrease
 * Value</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#hasValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData) <em>Has Value</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#addToList(de.urszeidler.eclipse.shr5.runtime.ExtendetData, java.lang.Object) <em>
 * Add To List</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#addUniqueToList(de.urszeidler.eclipse.shr5.runtime.ExtendetData, java.lang.Object)
 * <em>Add Unique To List</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#getListValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData) <em>Get List Value
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class AbstractExtendetDataAwareTest extends TestCase {

    /**
     * The fixture for this Abstract Extendet Data Aware test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected AbstractExtendetDataAware fixture = null;

    /**
     * Constructs a new Abstract Extendet Data Aware test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public AbstractExtendetDataAwareTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Abstract Extendet Data Aware test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void setFixture(AbstractExtendetDataAware fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Abstract Extendet Data Aware test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected AbstractExtendetDataAware getFixture() {
        return fixture;
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#addToExtendetData(de.urszeidler.eclipse.shr5.runtime.ExtendetData, java.lang.Object)
     * <em>Add To Extendet Data</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#addToExtendetData(de.urszeidler.eclipse.shr5.runtime.ExtendetData, java.lang.Object)
     * @generated not
     */
    public void testExtendetData_Object() {

        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(getFixture());
        data.setEFeature(RuntimePackage.Literals.PHYICAL_STATE__MENTAL_DAMAGE);

        assertFalse(getFixture().hasValue(data));
        getFixture().addToExtendetData(data, 1);
        assertEquals(1, getFixture().getIntegerValue(data));
        getFixture().addToExtendetData(data, 1);
        assertEquals(2, getFixture().getIntegerValue(data));
        assertTrue(getFixture().hasValue(data));
        
        ExtendetData data1 = RuntimeFactory.eINSTANCE.createExtendetData();
        data1.setEObject(getFixture());
        data1.setEFeature(RuntimePackage.Literals.PHYICAL_STATE__OVER_DEAD);
        assertFalse(getFixture().hasValue(data1));
        data1.setEFeature(RuntimePackage.Literals.PHYICAL_STATE__MENTAL_DAMAGE);
        assertTrue(getFixture().hasValue(data));
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#addToExtendetData(de.urszeidler.eclipse.shr5.runtime.ExtendetData, java.lang.Object)
     * <em>Add To Extendet Data</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#addToExtendetData(de.urszeidler.eclipse.shr5.runtime.ExtendetData, java.lang.Object)
     * @generated not
     */
    public void testAddToExtendetData__ExtendetData_Object() {

        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(getFixture());
        data.setEFeature(RuntimePackage.Literals.PHYICAL_STATE__MENTAL_DAMAGE);

        getFixture().addToExtendetData(data, 1);
        assertEquals(1, getFixture().getIntegerValue(data));
        getFixture().addToExtendetData(data, 1);
        assertEquals(2, getFixture().getIntegerValue(data));
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#getIntegerValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData)
     * <em>Get Integer Value</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#getIntegerValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData)
     * @generated not
     */
    public void testGetIntegerValue__ExtendetData() {
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(getFixture());
        data.setEFeature(RuntimePackage.Literals.PHYICAL_STATE__MENTAL_DAMAGE);

        getFixture().addToExtendetData(data, 1);
        assertEquals(1, getFixture().getIntegerValue(data));
        getFixture().addToExtendetData(data, 1);
        assertEquals(2, getFixture().getIntegerValue(data));

        data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(getFixture());
        data.setEFeature(RuntimePackage.Literals.PHYICAL_STATE__PHYSICAL_DAMAGE);

        getFixture().addToExtendetData(data, 1);
        assertEquals(1, getFixture().getIntegerValue(data));
        getFixture().addToExtendetData(data, 1);
        assertEquals(2, getFixture().getIntegerValue(data));
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#increaseValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData, int)
     * <em>Increase Value</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#increaseValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData, int)
     * @generated not
     */
    public void testIncreaseValue__ExtendetData_int() {
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(getFixture());
        data.setEFeature(RuntimePackage.Literals.PHYICAL_STATE__MENTAL_DAMAGE);

        assertEquals(0, getFixture().getIntegerValue(data));
        getFixture().increaseValue(data, 1);
        assertEquals(1, getFixture().getIntegerValue(data));
        getFixture().increaseValue(data, 1);
        assertEquals(2, getFixture().getIntegerValue(data));
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#decreaseValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData, int)
     * <em>Decrease Value</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#decreaseValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData, int)
     * @generated not
     */
    public void testDecreaseValue__ExtendetData_int() {
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(getFixture());
        data.setEFeature(RuntimePackage.Literals.PHYICAL_STATE__MENTAL_DAMAGE);

        assertEquals(0, getFixture().getIntegerValue(data));
        getFixture().increaseValue(data, 1);
        assertEquals(1, getFixture().getIntegerValue(data));
        getFixture().increaseValue(data, 1);
        assertEquals(2, getFixture().getIntegerValue(data));

        getFixture().decreaseValue(data, 1);
        assertEquals(1, getFixture().getIntegerValue(data));
        getFixture().decreaseValue(data, 1);
        assertEquals(0, getFixture().getIntegerValue(data));

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#hasValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData)
     * <em>Has Value</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#hasValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData)
     * @generated not
     */
    public void testHasValue__ExtendetData() {
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(getFixture());
        data.setEFeature(RuntimePackage.Literals.PHYICAL_STATE__MENTAL_DAMAGE);

        assertEquals(false, getFixture().hasValue(data));
        assertEquals(0, getFixture().getIntegerValue(data));
        getFixture().increaseValue(data, 1);
        assertEquals(true, getFixture().hasValue(data));
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#addToList(de.urszeidler.eclipse.shr5.runtime.ExtendetData, java.lang.Object)
     * <em>Add To List</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#addToList(de.urszeidler.eclipse.shr5.runtime.ExtendetData, java.lang.Object)
     * @generated not
     */
    public void testAddToList__ExtendetData_Object() {
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(getFixture());
        data.setEFeature(RuntimePackage.Literals.PHYICAL_STATE__MENTAL_DAMAGE);

        assertEquals(false, getFixture().hasValue(data));
        getFixture().addToList(data, "1");

        assertEquals(true, getFixture().hasValue(data));
        EList<?> listValue = getFixture().getListValue(data);
        assertEquals(1, listValue.size());
        getFixture().addToList(data, "1");
        listValue = getFixture().getListValue(data);
        assertEquals(2, listValue.size());
    }

    /**
     * Tests the '
     * {@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#addUniqueToList(de.urszeidler.eclipse.shr5.runtime.ExtendetData, java.lang.Object)
     * <em>Add Unique To List</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#addUniqueToList(de.urszeidler.eclipse.shr5.runtime.ExtendetData, java.lang.Object)
     * @generated not
     */
    public void testAddUniqueToList__ExtendetData_Object() {
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(getFixture());
        data.setEFeature(RuntimePackage.Literals.PHYICAL_STATE__MENTAL_DAMAGE);

        assertEquals(false, getFixture().hasValue(data));
        getFixture().addUniqueToList(data, "1");

        assertEquals(true, getFixture().hasValue(data));
        EList<?> listValue = getFixture().getListValue(data);
        assertEquals(1, listValue.size());
        getFixture().addUniqueToList(data, "1");
        listValue = getFixture().getListValue(data);
        assertEquals(1, listValue.size());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#getListValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData)
     * <em>Get List Value</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#getListValue(de.urszeidler.eclipse.shr5.runtime.ExtendetData)
     * @generated not
     */
    public void testGetListValue__ExtendetData() {
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(getFixture());
        data.setEFeature(RuntimePackage.Literals.PHYICAL_STATE__MENTAL_DAMAGE);

        assertEquals(false, getFixture().hasValue(data));
        getFixture().addToList(data, "1");

        assertEquals(true, getFixture().hasValue(data));
        EList<?> listValue = getFixture().getListValue(data);
        assertEquals(1, listValue.size());
        getFixture().addToList(data, "1");
        listValue = getFixture().getListValue(data);
        assertEquals(2, listValue.size());
    }

} // AbstractExtendetDataAwareTest
