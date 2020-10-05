/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.junit.Ignore;

import de.urszeidler.eclipse.shr5.GebundenerGeist;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Gebundener Geist</b></em>'.
 * <!-- end-user-doc -->
 * @generated not
 */
@Ignore
public class GebundenerGeistTest extends TestCase {

    /**
     * The fixture for this Gebundener Geist test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GebundenerGeist fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(GebundenerGeistTest.class);
    }

    /**
     * Constructs a new Gebundener Geist test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GebundenerGeistTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Gebundener Geist test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(GebundenerGeist fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Gebundener Geist test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GebundenerGeist getFixture() {
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
        setFixture(Shr5Factory.eINSTANCE.createGebundenerGeist());
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

} //GebundenerGeistTest
