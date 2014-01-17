/**
 */
package de.urszeidler.eclipse.shr5.tests;

import de.urszeidler.eclipse.shr5.MagischePersona;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Magische Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.BaseMagischePersona#getMagie() <em>Magie</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class MagischePersonaTest extends KoerperPersonaTest {

	/**
	 * Constructs a new Magische Persona test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MagischePersonaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Magische Persona test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MagischePersona getFixture() {
		return (MagischePersona)fixture;
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.BaseMagischePersona#getMagie() <em>Magie</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.BaseMagischePersona#getMagie()
	 * @generated not 
	 */
	public void testGetMagie() {
		assertEquals("should be 0",0, getFixture().getMagie());
		getFixture().setMagieBasis(6);		
		assertEquals("should be 6",6, getFixture().getMagie());

	}


} //MagischePersonaTest
