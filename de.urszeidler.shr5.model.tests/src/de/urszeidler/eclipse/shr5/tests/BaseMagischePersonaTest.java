/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.framework.TestCase;
import de.urszeidler.eclipse.shr5.BaseMagischePersona;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Base Magische Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.BaseMagischePersona#getMagie() <em>Magie</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class BaseMagischePersonaTest extends TestCase {

	/**
     * The fixture for this Base Magische Persona test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BaseMagischePersona fixture = null;

	/**
     * Constructs a new Base Magische Persona test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BaseMagischePersonaTest(String name) {
        super(name);
    }

	/**
     * Sets the fixture for this Base Magische Persona test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void setFixture(BaseMagischePersona fixture) {
        this.fixture = fixture;
    }

	/**
     * Returns the fixture for this Base Magische Persona test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BaseMagischePersona getFixture() {
        return fixture;
    }

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.BaseMagischePersona#getMagie() <em>Magie</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.BaseMagischePersona#getMagie()
	 * @generated not
	 */
	public void testGetMagie() {
		getFixture().setMagieBasis(6);
		
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
		getFixture().setMagieBasis(1);
		
		assertEquals("should be 1",1, getFixture().getMagie());
	}

} //BaseMagischePersonaTest
