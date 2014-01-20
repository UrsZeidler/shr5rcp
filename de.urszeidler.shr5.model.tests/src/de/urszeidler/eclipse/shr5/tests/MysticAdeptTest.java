/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.MagischeTradition;
import de.urszeidler.eclipse.shr5.MysticAdept;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mystic Adept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Zauberer#getEnzug() <em>Enzug</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class MysticAdeptTest extends KiAdeptTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(MysticAdeptTest.class);
    }

	/**
     * Constructs a new Mystic Adept test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MysticAdeptTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Mystic Adept test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected MysticAdept getFixture() {
        return (MysticAdept)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createMysticAdept());
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
	 * Tests the '{@link de.urszeidler.eclipse.shr5.Zauberer#getEnzug() <em>Enzug</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.Zauberer#getEnzug()
	 * @generated not
	 */
	public void testGetEnzug() {
		getFixture().setTradition(MagischeTradition.HERMETISCH);
		getFixture().setLogikBasis(1);
		getFixture().setWillenskraftBasis(1);
		getFixture().setIntuitionBasis(2);
		
		
		assertEquals("need to be 2",2, getFixture().getEnzug());
		
		getFixture().setTradition(MagischeTradition.SCHAMANISCH);
		assertEquals("need to be 3",3, getFixture().getEnzug());
	}

} //MysticAdeptTest
