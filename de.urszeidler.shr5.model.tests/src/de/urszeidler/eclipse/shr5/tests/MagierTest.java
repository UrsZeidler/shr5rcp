/**
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Enzug;
import de.urszeidler.eclipse.shr5.Magier;
import de.urszeidler.eclipse.shr5.MagischeTradition;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Magier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Zauberer#getEnzug() <em>Enzug</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstralesLimit() <em>Astrales Limit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleKonstitution() <em>Astrale Konstitution</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleGeschicklichkeit() <em>Astrale Geschicklichkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleReaktion() <em>Astrale Reaktion</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleStaerke() <em>Astrale Staerke</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleInitative() <em>Astrale Initative</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleInitativWuerfel() <em>Astrale Initativ Wuerfel</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstralePanzerung() <em>Astrale Panzerung</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class MagierTest extends MagischePersonaTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(MagierTest.class);
    }

	/**
     * Constructs a new Magier test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MagierTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Magier test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected Magier getFixture() {
        return (Magier)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createMagier());
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
	    MagischeTradition magischeTradition = Shr5Factory.eINSTANCE.createMagischeTradition();
		getFixture().setTradition(magischeTradition);
		getFixture().setLogikBasis(1);
		getFixture().setWillenskraftBasis(1);
		getFixture().setIntuitionBasis(2);
		
		magischeTradition.setEnzug(Enzug.WIL_LOG);
		assertEquals("need to be 2",2, getFixture().getEnzug());
		
		magischeTradition.setEnzug(Enzug.WIL_INT);
		assertEquals("need to be 3",3, getFixture().getEnzug());
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstralesLimit() <em>Astrales Limit</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstralesLimit()
	 * @generated not
	 */
	public void testGetAstralesLimit() {
		fixture.setLogikBasis(1);
		fixture.setIntuitionBasis(2);
		fixture.setWillenskraftBasis(2);
		
		assertEquals("limit need to be 2", 2, fixture.getGeistig());

		fixture.setCharismaBasis(3);
		fixture.setWillenskraftBasis(6);
		
		
		assertEquals("limit need to be 6", 6, fixture.getSozial());
		assertEquals("limit need to be 6", 6, getFixture().getAstralesLimit());
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleKonstitution() <em>Astrale Konstitution</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleKonstitution()
	 * @generated not
	 */
	public void testGetAstraleKonstitution() {
		getFixture().setWillenskraftBasis(1);
		assertEquals("should be 1",1, fixture.getWillenskraft());	
		assertEquals("should be 1",1, getFixture().getAstraleKonstitution());	
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleGeschicklichkeit() <em>Astrale Geschicklichkeit</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleGeschicklichkeit()
	 * @generated not
	 */
	public void testGetAstraleGeschicklichkeit() {
		getFixture().setLogikBasis(4);
		assertEquals("should be 4",4, fixture.getLogik());	
		assertEquals("should be 4",4, getFixture().getAstraleGeschicklichkeit());	
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleReaktion() <em>Astrale Reaktion</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleReaktion()
	 * @generated not
	 */
	public void testGetAstraleReaktion() {
		getFixture().setIntuitionBasis(3);
		assertEquals("should be 3",3, fixture.getIntuition());	
		assertEquals("should be 3",3, getFixture().getAstraleReaktion());	
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleStaerke() <em>Astrale Staerke</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleStaerke()
	 * @generated not
	 */
	public void testGetAstraleStaerke() {
		getFixture().setCharismaBasis(2);
		assertEquals("should be 2",2, fixture.getCharisma());	
		assertEquals("should be 2",2, getFixture().getAstraleStaerke());	
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleInitative() <em>Astrale Initative</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleInitative()
	 * @generated not
	 */
	public void testGetAstraleInitative() {
		getFixture().setIntuitionBasis(3);
		assertEquals("should be 3",3, fixture.getIntuition());	
		assertEquals("should be 6",6, getFixture().getAstraleInitative());	
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleInitativWuerfel() <em>Astrale Initativ Wuerfel</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleInitativWuerfel()
	 * @generated not
	 */
	public void testGetAstraleInitativWuerfel() {
		assertEquals("should be 2",2, getFixture().getAstraleInitativWuerfel());	
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstralePanzerung() <em>Astrale Panzerung</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstralePanzerung()
	 * @generated not
	 */
	public void testGetAstralePanzerung() {
		assertEquals("should be 0",0, getFixture().getAstralePanzerung());	
	}

} //MagierTest
