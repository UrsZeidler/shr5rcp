/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5Management.Mudan;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mudan</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MudanTest extends SpecialTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MudanTest.class);
	}

	/**
	 * Constructs a new Mudan test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MudanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mudan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Mudan getFixture() {
		return (Mudan)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated not
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Shr5managementFactory.eINSTANCE.createMudan());
		character = createMudanCharacter();
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

	
} //MudanTest
