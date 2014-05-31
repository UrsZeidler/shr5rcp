/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.LifestyleOption;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lifestyle Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class LifestyleOptionTest extends TestCase {

    /**
     * The fixture for this Lifestyle Option test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LifestyleOption fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(LifestyleOptionTest.class);
    }

    /**
     * Constructs a new Lifestyle Option test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LifestyleOptionTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Lifestyle Option test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(LifestyleOption fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Lifestyle Option test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LifestyleOption getFixture() {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createLifestyleOption());
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
     * Tests the '{@link de.urszeidler.eclipse.shr5.GeldWert#getWert() <em>Wert</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GeldWert#getWert()
     * @generated not
     */
    public void testGetWert() {
        getFixture().setWertValue(new BigDecimal(100));

        assertEquals(100, getFixture().getWert().intValue());
    }

} //LifestyleOptionTest
