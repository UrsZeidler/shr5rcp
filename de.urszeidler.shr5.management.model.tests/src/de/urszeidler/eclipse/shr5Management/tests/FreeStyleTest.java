/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5Management.FreeStyle;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Free Style</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FreeStyleTest extends CharacterGeneratorSystemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FreeStyleTest.class);
	}

	/**
	 * Constructs a new Free Style test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeStyleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Free Style test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FreeStyle getFixture() {
		return (FreeStyle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Shr5managementFactory.eINSTANCE.createFreeStyle());
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

} //FreeStyleTest
