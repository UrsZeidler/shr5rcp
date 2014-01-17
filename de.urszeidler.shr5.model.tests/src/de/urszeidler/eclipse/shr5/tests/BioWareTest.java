/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.BioWare;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bio Ware</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BioWareTest extends KoerpermodsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BioWareTest.class);
	}

	/**
	 * Constructs a new Bio Ware test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BioWareTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bio Ware test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BioWare getFixture() {
		return (BioWare)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Shr5Factory.eINSTANCE.createBioWare());
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

} //BioWareTest
