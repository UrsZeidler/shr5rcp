/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import java.util.Calendar;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.TrainingRange;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Training Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.TrainingRange#getDaysTrained() <em>Days Trained</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TrainingRangeTest extends TestCase {

    /**
     * The fixture for this Training Range test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TrainingRange fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(TrainingRangeTest.class);
    }

    /**
     * Constructs a new Training Range test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TrainingRangeTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Training Range test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(TrainingRange fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Training Range test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TrainingRange getFixture() {
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
        setFixture(Shr5managementFactory.eINSTANCE.createTrainingRange());
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
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.TrainingRange#getDaysTrained() <em>Days Trained</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.TrainingRange#getDaysTrained()
     * @generated not
     */
    public void testGetDaysTrained() {
        Calendar instance = Calendar.getInstance();
        getFixture().setStart(instance.getTime());
        getFixture().setEnd(instance.getTime());
        
        assertEquals(1, getFixture().getDaysTrained());
    }


    
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.TrainingRange#getDaysTrained() <em>Days Trained</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.TrainingRange#getDaysTrained()
     * @generated not
     */
    public void testGetDaysTrained_0() {
        Calendar instance = Calendar.getInstance();
        getFixture().setStart(instance.getTime());
        instance.add(Calendar.DAY_OF_YEAR, -1);
        getFixture().setEnd(instance.getTime());
        
        assertEquals(0, getFixture().getDaysTrained());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.TrainingRange#getDaysTrained() <em>Days Trained</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.TrainingRange#getDaysTrained()
     * @generated not
     */
    public void testGetDaysTrained_1() {
        Calendar instance = Calendar.getInstance();
        getFixture().setStart(instance.getTime());
        instance.add(Calendar.DAY_OF_YEAR, 1);
        getFixture().setEnd(instance.getTime());
        
        assertEquals(2, getFixture().getDaysTrained());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.TrainingRange#getDaysTrained() <em>Days Trained</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.TrainingRange#getDaysTrained()
     * @generated not
     */
    public void testGetDaysTrained_2() {
        Calendar instance = Calendar.getInstance();
        getFixture().setStart(instance.getTime());
        instance.add(Calendar.DAY_OF_YEAR, 2);
        getFixture().setEnd(instance.getTime());
        
        assertEquals(3, getFixture().getDaysTrained());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.TrainingRange#getDaysTrained() <em>Days Trained</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.TrainingRange#getDaysTrained()
     * @generated not
     */
    public void testGetDaysTrained_null() {
        Calendar instance = Calendar.getInstance();
        getFixture().setStart(instance.getTime());
        
        assertEquals(0, getFixture().getDaysTrained());
    }

} //TrainingRangeTest
