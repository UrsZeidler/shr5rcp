/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Sprite;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Sprite</b></em>'. <!-- end-user-doc -->
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
public class SpriteTest extends TestCase {

	/**
	 * The fixture for this Sprite test case.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected Sprite fixture = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpriteTest.class);
	}

	/**
	 * Constructs a new Sprite test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SpriteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sprite test case.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Sprite fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sprite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sprite getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Shr5Factory.eINSTANCE.createSprite());
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
		getFixture().setStufe(5);

		assertEquals("should be 5", 5, getFixture().getResonanz());
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
		getFixture().setStufe(5);
		assertEquals("should be 5", 5, getFixture().getAngriff());
		getFixture().setAngriffMod(1);
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
		getFixture().setStufe(5);
		assertEquals("should be 5", 5, getFixture().getSchleicher());
		getFixture().setSchleicherMod(1);
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
		getFixture().setStufe(5);
		assertEquals("should be 5", 5, getFixture().getDatenverarbeitung());
		getFixture().setDatenverarbeitungMod(1);
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
		getFixture().setStufe(5);
		assertEquals("should be 5", 5, getFixture().getFirewall());
		getFixture().setFirewallMod(1);
		assertEquals("should be 6", 6, getFixture().getFirewall());	
	}

} // SpriteTest
