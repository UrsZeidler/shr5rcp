/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.TimeUnits;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.TrainingRate;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Increase Character Part</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IncreaseCharacterPartTest extends AdvancementTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(IncreaseCharacterPartTest.class);
    }

	/**
     * Constructs a new Increase Character Part test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public IncreaseCharacterPartTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Increase Character Part test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected IncreaseCharacterPart getFixture() {
        return (IncreaseCharacterPart)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(Shr5managementFactory.eINSTANCE.createIncreaseCharacterPart());
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

	
    public void testInRange() throws Exception {
        TrainingRate tr = Shr5managementFactory.eINSTANCE.createTrainingRate();
        tr.setFactor(1);
        tr.setFrom(1);
        tr.setTo(4);
        tr.setTimeUnit(TimeUnits.WEEK);
        getFixture().getRangeTableEntries().add(tr);
        
        tr = Shr5managementFactory.eINSTANCE.createTrainingRate();
        tr.setFactor(1);
        tr.setFrom(5);
        tr.setTo(8);
        tr.setTimeUnit(TimeUnits.MONTH);
        getFixture().getRangeTableEntries().add(tr);
        

        TrainingRate findMatchingRange = (TrainingRate)ShadowrunManagmentTools.findMatchingRange(3,getFixture().getRangeTableEntries());
         assertEquals(TimeUnits.WEEK, findMatchingRange.getTimeUnit()); 
         findMatchingRange = (TrainingRate)ShadowrunManagmentTools.findMatchingRange(5,getFixture().getRangeTableEntries());
         assertEquals(TimeUnits.MONTH, findMatchingRange.getTimeUnit()); 
    }
} //IncreaseCharacterPartTest
