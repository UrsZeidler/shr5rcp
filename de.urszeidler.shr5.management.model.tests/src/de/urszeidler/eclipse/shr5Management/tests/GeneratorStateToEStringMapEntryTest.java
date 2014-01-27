/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import java.util.Map;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generator State To EString Map Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorStateToEStringMapEntryTest extends TestCase {

	/**
     * The fixture for this Generator State To EString Map Entry test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Map.Entry<GeneratorState, String> fixture = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(GeneratorStateToEStringMapEntryTest.class);
    }

	/**
     * Constructs a new Generator State To EString Map Entry test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public GeneratorStateToEStringMapEntryTest(String name) {
        super(name);
    }

	/**
     * Sets the fixture for this Generator State To EString Map Entry test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void setFixture(Map.Entry<GeneratorState, String> fixture) {
        this.fixture = fixture;
    }

	/**
     * Returns the fixture for this Generator State To EString Map Entry test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Map.Entry<GeneratorState, String> getFixture() {
        return fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
        setFixture((Map.Entry<GeneratorState, String>)Shr5managementFactory.eINSTANCE.create(Shr5managementPackage.Literals.GENERATOR_STATE_TO_ESTRING_MAP_ENTRY));
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

} //GeneratorStateToEStringMapEntryTest
