/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Sensor;
import de.urszeidler.eclipse.shr5.SensorFunction;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityFeature() <em>Capacity Feature</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#getCapacity() <em>Capacity</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains() <em>Capacity Remains</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#canAdd(org.eclipse.emf.ecore.EObject) <em>Can Add</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SensorTest extends TestCase {

    /**
     * The fixture for this Sensor test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Sensor fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(SensorTest.class);
    }

    /**
     * Constructs a new Sensor test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SensorTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Sensor test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(Sensor fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Sensor test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Sensor getFixture() {
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
        setFixture(Shr5Factory.eINSTANCE.createSensor());
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
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityFeature() <em>Capacity Feature</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacityFeature()
     * @generated not
     */
    public void testGetCapacityFeature() {
       assertEquals(Shr5Package.Literals.SENSOR__FUNCTIONS, getFixture().getCapacityFeature());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacity() <em>Capacity</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacity()
     * @generated not 
     */
    public void testGetCapacity() {
        getFixture().setCapacityValue(10);
        assertEquals(10, getFixture().getCapacity());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains() <em>Capacity Remains</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#getCapacityRemains()
     * @generated not
     */
    public void testGetCapacityRemains() {
        getFixture().setCapacityValue(10);
        assertEquals(10, getFixture().getCapacity());
        assertEquals(10, getFixture().getCapacityRemains());
        
        SensorFunction sf = Shr5Factory.eINSTANCE.createSensorFunction();
        getFixture().getFunctions().add(sf);
        assertEquals(9, getFixture().getCapacityRemains());
        
        sf = Shr5Factory.eINSTANCE.createSensorFunction();
        getFixture().getFunctions().add(sf);
        assertEquals(8, getFixture().getCapacityRemains());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GeldWert#getWert()
     * @generated not
     */
    public void testGetWert() {
        getFixture().setWertValue(new BigDecimal(10));
        getFixture().setRating(1);
        
        assertEquals(10, getFixture().getWert().intValue());
        getFixture().setRating(2);
        
        assertEquals(20, getFixture().getWert().intValue());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Capacity#canAdd(org.eclipse.emf.ecore.EObject) <em>Can Add</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Capacity#canAdd(org.eclipse.emf.ecore.EObject)
     * @generated not
     */
    public void testCanAdd__EObject() {
        getFixture().setCapacityValue(1);
        assertEquals(1, getFixture().getCapacity());
        assertEquals(1, getFixture().getCapacityRemains());
        
        
        
        SensorFunction sf = Shr5Factory.eINSTANCE.createSensorFunction();
        assertTrue(getFixture().canAdd(sf));
        
        getFixture().getFunctions().add(sf);
        assertEquals(0, getFixture().getCapacityRemains());
        
        sf = Shr5Factory.eINSTANCE.createSensorFunction();
        assertFalse(getFixture().canAdd(sf));
    }

} //SensorTest
