/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Zauber;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Zauber</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZauberTest extends TestCase {

	/**
	 * The fixture for this Zauber test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Zauber fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ZauberTest.class);
	}

	/**
	 * Constructs a new Zauber test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZauberTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Zauber test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Zauber fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Zauber test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Zauber getFixture() {
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
		setFixture(Shr5Factory.eINSTANCE.createZauber());
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

} //ZauberTest
