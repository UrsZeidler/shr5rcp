/**
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.framework.TestCase;
import de.urszeidler.eclipse.shr5.FahrzeugModifikation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fahrzeug Modifikation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class FahrzeugModifikationTest extends TestCase {

	/**
     * The fixture for this Fahrzeug Modifikation test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FahrzeugModifikation fixture = null;

	/**
     * Constructs a new Fahrzeug Modifikation test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FahrzeugModifikationTest(String name) {
        super(name);
    }

	/**
     * Sets the fixture for this Fahrzeug Modifikation test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void setFixture(FahrzeugModifikation fixture) {
        this.fixture = fixture;
    }

	/**
     * Returns the fixture for this Fahrzeug Modifikation test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FahrzeugModifikation getFixture() {
        return fixture;
    }

	/**
     * Tests the '{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GeldWert#getWert()
     * @generated not
     */
    public void testGetWert() {
        getFixture().setWertValue(new BigDecimal(10));        
        assertEquals(10,getFixture().getWert().intValue());
    }

} //FahrzeugModifikationTest
