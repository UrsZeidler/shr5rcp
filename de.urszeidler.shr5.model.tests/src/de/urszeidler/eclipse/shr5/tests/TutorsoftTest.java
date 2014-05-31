/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import java.math.BigDecimal;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Tutorsoft;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tutorsoft</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TutorsoftTest extends BasicProgramTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(TutorsoftTest.class);
    }

    /**
     * Constructs a new Tutorsoft test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TutorsoftTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Tutorsoft test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Tutorsoft getFixture() {
        return (Tutorsoft)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createTutorsoft());
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
        getFixture().setWertValue(new BigDecimal(10));   
        getFixture().setRating(2);
        assertEquals(20,getFixture().getWert().intValue());

    }

} //TutorsoftTest
