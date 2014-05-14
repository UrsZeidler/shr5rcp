/**
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.framework.TestCase;
import de.urszeidler.eclipse.shr5.Fahrzeug;
import de.urszeidler.eclipse.shr5.FahrzeugModifikation;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fahrzeug</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.FahrzeugZustand#getZustandMax() <em>Zustand Max</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class FahrzeugTest extends TestCase {

	/**
     * The fixture for this Fahrzeug test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Fahrzeug fixture = null;

	/**
     * Constructs a new Fahrzeug test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FahrzeugTest(String name) {
        super(name);
    }

	/**
     * Sets the fixture for this Fahrzeug test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void setFixture(Fahrzeug fixture) {
        this.fixture = fixture;
    }

	/**
     * Returns the fixture for this Fahrzeug test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Fahrzeug getFixture() {
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

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.FahrzeugZustand#getZustandMax() <em>Zustand Max</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.FahrzeugZustand#getZustandMax()
     * @generated not
     */
    public void testGetZustandMax() {
        getFixture().setRumpf(5);
        assertEquals(14,getFixture().getZustandMax());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GeldWert#getWert()
     * @generated not
     */
    public void testGetWert1() {
        getFixture().setWertValue(new BigDecimal(10));        
        assertEquals(10,getFixture().getWert().intValue());
        
        FahrzeugModifikation mod = Shr5Factory.eINSTANCE.createFahrzeugModifikation();
        mod.setWertValue(new BigDecimal(11));
        getFixture().getModifizierungen().add(mod);
        assertEquals(21,getFixture().getWert().intValue());

    }

} //FahrzeugTest
