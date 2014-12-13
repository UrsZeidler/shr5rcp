/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5Management.FreeStyleGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Free Style Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getFreestyleGenerator() <em>Freestyle Generator</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class FreeStyleGeneratorTest extends CharacterGeneratorTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(FreeStyleGeneratorTest.class);
    }

	/**
     * Constructs a new Free Style Generator test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FreeStyleGeneratorTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Free Style Generator test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected FreeStyleGenerator getFixture() {
        return (FreeStyleGenerator)fixture;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated not
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Shr5managementFactory.eINSTANCE.createFreeStyleGenerator());
		getFixture().setGenerator(Shr5managementFactory.eINSTANCE.createFreeStyle());
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
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getFreestyleGenerator() <em>Freestyle Generator</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getFreestyleGenerator()
	 * @generated not
	 */
	public void testGetFreestyleGenerator() {		
		assertNotNull(getFixture().getFreestyleGenerator());
		getFixture().setGenerator(Shr5managementFactory.eINSTANCE.createFreeStyle());
		assertNull(getFixture().getFreestyleGenerator());
	}

} //FreeStyleGeneratorTest
