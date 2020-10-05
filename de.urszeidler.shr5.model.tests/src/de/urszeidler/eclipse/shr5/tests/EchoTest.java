/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.textui.TestRunner;

import org.junit.Ignore;

import de.urszeidler.eclipse.shr5.Echo;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Echo</b></em>'.
 * <!-- end-user-doc -->
 * @generated not
 */
@Ignore
public class EchoTest extends AbstraktModifikatorenTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(EchoTest.class);
    }

	/**
     * Constructs a new Echo test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EchoTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Echo test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected Echo getFixture() {
        return (Echo)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createEcho());
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

} //EchoTest
