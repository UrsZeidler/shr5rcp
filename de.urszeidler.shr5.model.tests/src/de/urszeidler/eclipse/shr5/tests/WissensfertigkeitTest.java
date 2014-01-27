/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Wissensfertigkeit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wissensfertigkeit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WissensfertigkeitTest extends FertigkeitTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(WissensfertigkeitTest.class);
    }

	/**
     * Constructs a new Wissensfertigkeit test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WissensfertigkeitTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Wissensfertigkeit test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected Wissensfertigkeit getFixture() {
        return (Wissensfertigkeit)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createWissensfertigkeit());
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

} //WissensfertigkeitTest
