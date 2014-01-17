/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.ParaCritter;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Para Critter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.BaseMagischePersona#getMagie() <em>Magie</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ParaCritterTest extends MudanCritterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParaCritterTest.class);
	}

	/**
	 * Constructs a new Para Critter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParaCritterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Para Critter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ParaCritter getFixture() {
		return (ParaCritter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Shr5Factory.eINSTANCE.createParaCritter());
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

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.BaseMagischePersona#getMagie() <em>Magie</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.BaseMagischePersona#getMagie()
	 * @generated not
	 */
	public void testGetMagie() {
		assertEquals("should be 6",6, getFixture().getMagie());
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.BaseMagischePersona#setMagie(int) <em>Magie</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.BaseMagischePersona#setMagie(int)
	 * @generated not
	 */
	public void testSetMagie() {
	}

} //ParaCritterTest
