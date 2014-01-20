/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import de.urszeidler.eclipse.shr5Management.QuallityChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quallity Change</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuallityChangeTest extends KarmaGaintTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(QuallityChangeTest.class);
    }

	/**
     * Constructs a new Quallity Change test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public QuallityChangeTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Quallity Change test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected QuallityChange getFixture() {
        return (QuallityChange)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(Shr5managementFactory.eINSTANCE.createQuallityChange());
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

} //QuallityChangeTest
