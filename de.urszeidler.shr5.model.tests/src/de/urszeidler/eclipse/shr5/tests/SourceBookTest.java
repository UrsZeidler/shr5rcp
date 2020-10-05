/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.junit.Ignore;

import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.SourceBook;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Source Book</b></em>'.
 * <!-- end-user-doc -->
 * @generated not
 */
@Ignore
public class SourceBookTest extends TestCase {

	/**
     * The fixture for this Source Book test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SourceBook fixture = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(SourceBookTest.class);
    }

	/**
     * Constructs a new Source Book test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SourceBookTest(String name) {
        super(name);
    }

	/**
     * Sets the fixture for this Source Book test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void setFixture(SourceBook fixture) {
        this.fixture = fixture;
    }

	/**
     * Returns the fixture for this Source Book test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SourceBook getFixture() {
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
        setFixture(Shr5Factory.eINSTANCE.createSourceBook());
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

} //SourceBookTest
