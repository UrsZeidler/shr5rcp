/**
 */
package de.urszeidler.eclipse.shr5.tests;

import de.urszeidler.eclipse.shr5.Lifestyle;
import de.urszeidler.eclipse.shr5.Shr5Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lifestyle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LifestyleTest extends VertragTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LifestyleTest.class);
	}

	/**
	 * Constructs a new Lifestyle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifestyleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lifestyle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Lifestyle getFixture() {
		return (Lifestyle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Shr5Factory.eINSTANCE.createLifestyle());
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

} //LifestyleTest
