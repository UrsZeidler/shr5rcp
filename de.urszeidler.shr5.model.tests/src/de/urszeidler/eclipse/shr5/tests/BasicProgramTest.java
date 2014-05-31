/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.framework.TestCase;
import de.urszeidler.eclipse.shr5.BasicProgram;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Basic Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class BasicProgramTest extends TestCase {

    /**
     * The fixture for this Basic Program test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BasicProgram fixture = null;

    /**
     * Constructs a new Basic Program test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BasicProgramTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Basic Program test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(BasicProgram fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Basic Program test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BasicProgram getFixture() {
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

} //BasicProgramTest
