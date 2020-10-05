/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.junit.Ignore;

import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Spezies;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Spezies</b></em>'.
 * <!-- end-user-doc -->
 * @generated not
 */
@Ignore
public class SpeziesTest extends TestCase {

	/**
     * The fixture for this Spezies test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Spezies fixture = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(SpeziesTest.class);
    }

	/**
     * Constructs a new Spezies test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SpeziesTest(String name) {
        super(name);
    }

	/**
     * Sets the fixture for this Spezies test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void setFixture(Spezies fixture) {
        this.fixture = fixture;
    }

	/**
     * Returns the fixture for this Spezies test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Spezies getFixture() {
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
        setFixture(Shr5Factory.eINSTANCE.createSpezies());
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

} //SpeziesTest
