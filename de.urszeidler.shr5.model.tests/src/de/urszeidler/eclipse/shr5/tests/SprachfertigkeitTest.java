/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Sprachfertigkeit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sprachfertigkeit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SprachfertigkeitTest extends WissensfertigkeitTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(SprachfertigkeitTest.class);
    }

	/**
     * Constructs a new Sprachfertigkeit test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SprachfertigkeitTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Sprachfertigkeit test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected Sprachfertigkeit getFixture() {
        return (Sprachfertigkeit)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createSprachfertigkeit());
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

} //SprachfertigkeitTest
