/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fernkampfwaffe Modifikator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FernkampfwaffeModifikatorTest extends AbstraktModifikatorenTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(FernkampfwaffeModifikatorTest.class);
    }

	/**
     * Constructs a new Fernkampfwaffe Modifikator test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FernkampfwaffeModifikatorTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Fernkampfwaffe Modifikator test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected FernkampfwaffeModifikator getFixture() {
        return (FernkampfwaffeModifikator)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createFernkampfwaffeModifikator());
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

} //FernkampfwaffeModifikatorTest
