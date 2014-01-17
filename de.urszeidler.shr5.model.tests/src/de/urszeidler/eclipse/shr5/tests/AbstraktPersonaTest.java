/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.framework.TestCase;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Spezies;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Abstrakt Persona</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getKonstitution() <em>Konstitution</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getGeschicklichkeit() <em>Geschicklichkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getReaktion() <em>Reaktion</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getStaerke() <em>Staerke</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitative() <em>Initative</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitativWuerfel() <em>Initativ Wuerfel</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getAusweichen() <em>Ausweichen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getEssenz() <em>Essenz</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getEdge() <em>Edge</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getCharisma() <em>Charisma</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getWillenskraft() <em>Willenskraft</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getIntuition() <em>Intuition</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getLogik() <em>Logik</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getKoerperlich() <em>Koerperlich</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getGeistig() <em>Geistig</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getSozial() <em>Sozial</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AbstraktPersonaTest extends TestCase {

	/**
	 * The fixture for this Abstrakt Persona test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstraktPersona fixture = null;

	/**
	 * Constructs a new Abstrakt Persona test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AbstraktPersonaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Abstrakt Persona test case.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AbstraktPersona fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Abstrakt Persona test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AbstraktPersona getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getKonstitution() <em>Konstitution</em>}' feature getter.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getKonstitution()
	 * @generated not
	 */
	public void testGetKonstitution() {
		fixture.setKonstitutionBasis(1);		
		assertEquals("should be 1",1, fixture.getKonstitution());
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getGeschicklichkeit() <em>Geschicklichkeit</em>}' feature getter.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getGeschicklichkeit()
	 * @generated not
	 */
	public void testGetGeschicklichkeit() {
		getFixture().setGeschicklichkeitBasis(1);
		assertEquals("should be 1",1, fixture.getGeschicklichkeit());		
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getReaktion() <em>Reaktion</em>}' feature getter.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getReaktion()
	 * @generated not
	 */
	public void testGetReaktion() {
		getFixture().setReaktionBasis(1);
		assertEquals("should be 1",1, fixture.getReaktion());		
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getStaerke() <em>Staerke</em>}' feature getter.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getStaerke()
	 * @generated not
	 */
	public void testGetStaerke() {
		getFixture().setStaerkeBasis(1);
		assertEquals("should be 1",1, fixture.getStaerke());		
	}

	/**
	 * Tests the '
	 * {@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitative()
	 * <em>Initative</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitative()
	 * @generated not
	 */
	public void testGetInitative() {
		fixture.setReaktionBasis(1);
		fixture.setIntuitionBasis(1);
		
		assertEquals("limit need to be 2", 2, fixture.getInitative());
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitativWuerfel() <em>Initativ Wuerfel</em>}' feature getter.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitativWuerfel()
	 * @generated not
	 */
	public void testGetInitativWuerfel() {
		assertEquals("limit need to be 1", 1, getFixture().getInitativWuerfel());
	}

	/**
	 * Tests the '
	 * {@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getAusweichen()
	 * <em>Ausweichen</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getAusweichen()
	 * @generated not
	 */
	public void testGetAusweichen() {
		fixture.setReaktionBasis(1);
		fixture.setIntuitionBasis(1);
		
		assertEquals("limit need to be 2", 2, fixture.getAusweichen());
	}

	/**
	 * Tests the '
	 * {@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getEssenz()
	 * <em>Essenz</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getEssenz()
	 * @generated not
	 */
	public void testGetEssenz() {
		assertEquals("Essens need to be 600", 600, fixture.getEssenz());
	}

	/**
	 * Tests the '
	 * {@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getEssenz()
	 * <em>Essenz</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getEssenz()
	 * @generated not
	 */
	public void testGetEssenzFromSpezies() {
		Spezies spezies = Shr5Factory.eINSTANCE.createSpezies();
		spezies.setEssenzMax(1);
		fixture.setSpezies(spezies);
		
		assertEquals("Essens need to be 100", 100, fixture.getEssenz());
	}

	/**
	 * Tests the '
	 * {@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getEdge()
	 * <em>Edge</em>}' feature getter. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getEdge()
	 * @generated not
	 */
	public void testGetEdge() {
		fixture.setEdgeBasis(1);
		assertEquals("",1, fixture.getEdge());
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getCharisma() <em>Charisma</em>}' feature getter.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.GeistigeAttribute#getCharisma()
	 * @generated not
	 */
	public void testGetCharisma() {
		getFixture().setCharismaBasis(1);
		assertEquals("should be 1",1, fixture.getCharisma());		
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getWillenskraft() <em>Willenskraft</em>}' feature getter.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.GeistigeAttribute#getWillenskraft()
	 * @generated not
	 */
	public void testGetWillenskraft() {
		getFixture().setWillenskraftBasis(1);
		assertEquals("should be 1",1, fixture.getWillenskraft());		
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getIntuition() <em>Intuition</em>}' feature getter.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.GeistigeAttribute#getIntuition()
	 * @generated not
	 */
	public void testGetIntuition() {
		getFixture().setIntuitionBasis(1);
		assertEquals("should be 1",1, fixture.getIntuition());		
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getLogik() <em>Logik</em>}' feature getter.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.GeistigeAttribute#getLogik()
	 * @generated not
	 */
	public void testGetLogik() {
		getFixture().setLogikBasis(1);
		assertEquals("should be 1",1, fixture.getLogik());		
	}

	/**
	 * Tests the '
	 * {@link de.urszeidler.eclipse.shr5.ChrakterLimits#getKoerperlich()
	 * <em>Koerperlich</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.ChrakterLimits#getKoerperlich()
	 * @generated not
	 */
	public void testGetKoerperlich() {
		fixture.setStaerkeBasis(1);
		fixture.setKonstitutionBasis(2);
		fixture.setReaktionBasis(2);

		assertEquals("limit need to be 2", 2, fixture.getKoerperlich());
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getGeistig()
	 * <em>Geistig</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.ChrakterLimits#getGeistig()
	 * @generated not
	 */
	public void testGetGeistig() {
		fixture.setLogikBasis(1);
		fixture.setIntuitionBasis(2);
		fixture.setWillenskraftBasis(2);
		
		assertEquals("limit need to be 2", 2, fixture.getGeistig());
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getSozial()
	 * <em>Sozial</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.ChrakterLimits#getSozial()
	 * @generated not
	 */
	public void testGetSozial() {
		fixture.setCharismaBasis(3);
		fixture.setWillenskraftBasis(6);
		
		
		assertEquals("limit need to be 6", 6, fixture.getSozial());
	}

} // AbstraktPersonaTest
