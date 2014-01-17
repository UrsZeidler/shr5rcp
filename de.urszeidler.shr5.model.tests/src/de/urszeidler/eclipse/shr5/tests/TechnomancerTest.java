/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Technomancer;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Technomancer</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getResonanz() <em>Resonanz</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getGeraetestufe() <em>Geraetestufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getAngriff() <em>Angriff</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getSchleicher() <em>Schleicher</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getDatenverarbeitung() <em>Datenverarbeitung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ResonanzPersona#getFirewall() <em>Firewall</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TechnomancerTest extends KoerperPersonaTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TechnomancerTest.class);
	}

	/**
	 * Constructs a new Technomancer test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TechnomancerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Technomancer test case.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Technomancer getFixture() {
		return (Technomancer)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Shr5Factory.eINSTANCE.createTechnomancer());
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
	 * {@link de.urszeidler.eclipse.shr5.ResonanzPersona#getResonanz()
	 * <em>Resonanz</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.ResonanzPersona#getResonanz()
	 * @generated not
	 */
	public void testGetResonanz() {
		assertEquals("should be 6", 6, getFixture().getResonanz());
	}

	/**
	 * Tests the '
	 * {@link de.urszeidler.eclipse.shr5.ResonanzPersona#getGeraetestufe()
	 * <em>Geraetestufe</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.ResonanzPersona#getGeraetestufe()
	 * @generated not
	 */
	public void testGetGeraetestufe() {
		assertEquals("should be 6", 6, getFixture().getGeraetestufe());
	}

	/**
	 * Tests the '
	 * {@link de.urszeidler.eclipse.shr5.ResonanzPersona#getAngriff()
	 * <em>Angriff</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.ResonanzPersona#getAngriff()
	 * @generated not
	 */
	public void testGetAngriff() {
		getFixture().setCharismaBasis(6);
		assertEquals("should be 6", 6, getFixture().getAngriff());
	}

	/**
	 * Tests the '
	 * {@link de.urszeidler.eclipse.shr5.ResonanzPersona#getSchleicher()
	 * <em>Schleicher</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.ResonanzPersona#getSchleicher()
	 * @generated not
	 */
	public void testGetSchleicher() {
		getFixture().setIntuitionBasis(6);
		assertEquals("should be 6", 6, getFixture().getSchleicher());
	}

	/**
	 * Tests the '
	 * {@link de.urszeidler.eclipse.shr5.ResonanzPersona#getDatenverarbeitung()
	 * <em>Datenverarbeitung</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.ResonanzPersona#getDatenverarbeitung()
	 * @generated not
	 */
	public void testGetDatenverarbeitung() {
		getFixture().setLogikBasis(6);
		assertEquals("should be 6", 6, getFixture().getDatenverarbeitung());
	}

	/**
	 * Tests the '
	 * {@link de.urszeidler.eclipse.shr5.ResonanzPersona#getFirewall()
	 * <em>Firewall</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.ResonanzPersona#getFirewall()
	 * @generated not
	 */
	public void testGetFirewall() {
		getFixture().setWillenskraftBasis(6);
		assertEquals("should be 6", 6, getFixture().getFirewall());
	}

} // TechnomancerTest
