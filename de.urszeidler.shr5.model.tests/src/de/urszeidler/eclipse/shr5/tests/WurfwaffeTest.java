/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Wurfwaffe;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wurfwaffe</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WurfwaffeTest extends AbstaktFernKampfwaffeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WurfwaffeTest.class);
	}

	/**
	 * Constructs a new Wurfwaffe test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WurfwaffeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Wurfwaffe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Wurfwaffe getFixture() {
		return (Wurfwaffe)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Shr5Factory.eINSTANCE.createWurfwaffe());
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

} //WurfwaffeTest
