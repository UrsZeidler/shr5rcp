/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5Management.Attributes;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Attributes</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Attributes#calcAttributesSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Attributes Spend</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AttributesTest extends PriorityCategorieTest {

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(AttributesTest.class);
    }

	/**
	 * Constructs a new Attributes test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributesTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Attributes test case.
     * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected Attributes getFixture() {
        return (Attributes)fixture;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(Shr5managementFactory.eINSTANCE.createAttributes());
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
	@Override
	protected void tearDown() throws Exception {
        setFixture(null);
    }

	/**
	 * Tests the '
	 * {@link de.urszeidler.eclipse.shr5Management.Attributes#calcAttributesSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
	 * <em>Calc Attributes Spend</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5Management.Attributes#calcAttributesSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
	 * @generated not
	 */
	public void testCalcAttributesSpend__ManagedCharacter() {
		PlayerCharacter character = createMudanCharacter();

		character.getPersona().setCharismaBasis(1);
		assertEquals("1 point spend ", 1, getFixture().calcAttributesSpend(character));

		character.getPersona().setCharismaBasis(4);
		assertEquals("4 point spend ", 4, getFixture().calcAttributesSpend(character));
		character.getPersona().setGeschicklichkeitBasis(2);
		assertEquals("6 point spend ", 6, getFixture().calcAttributesSpend(character));
		character.getPersona().setLogikBasis(1);
		assertEquals("7 point spend ", 7, getFixture().calcAttributesSpend(character));
	}

} // AttributesTest
