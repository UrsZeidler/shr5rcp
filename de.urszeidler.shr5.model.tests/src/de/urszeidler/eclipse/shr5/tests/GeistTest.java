/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Geist;
import de.urszeidler.eclipse.shr5.Shr5Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Geist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitative() <em>Initative</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitativWuerfel() <em>Initativ Wuerfel</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getAusweichen() <em>Ausweichen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getEssenz() <em>Essenz</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getEdge() <em>Edge</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getCharisma() <em>Charisma</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getWillenskraft() <em>Willenskraft</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getIntuition() <em>Intuition</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getLogik() <em>Logik</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getKonstitution() <em>Konstitution</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getGeschicklichkeit() <em>Geschicklichkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getReaktion() <em>Reaktion</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getStaerke() <em>Staerke</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getKoerperlich() <em>Koerperlich</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getGeistig() <em>Geistig</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getSozial() <em>Sozial</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Panzerung#getPanzer() <em>Panzer</em>}</li>
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
public class GeistTest extends TestCase {

    /**
     * The fixture for this Geist test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Geist fixture = null;


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(GeistTest.class);
    }

    /**
     * Constructs a new Geist test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeistTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Geist test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(Geist fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Geist test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Geist getFixture() {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated not
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5Factory.eINSTANCE.createGeist());
        getFixture().setStufe(1);
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
     * Tests the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstralesLimit() <em>Astrales Limit</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstralesLimit()
     * @generated not
     */
    public void testGetAstralesLimit() {
        assertEquals(2, getFixture().getAstralesLimit());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleKonstitution() <em>Astrale Konstitution</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleKonstitution()
     * @generated not
     */
    public void testGetAstraleKonstitution() {
        assertEquals(1, getFixture().getAstraleKonstitution());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleGeschicklichkeit() <em>Astrale Geschicklichkeit</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleGeschicklichkeit()
     * @generated not
     */
    public void testGetAstraleGeschicklichkeit() {
        assertEquals(1, getFixture().getAstraleGeschicklichkeit());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleReaktion() <em>Astrale Reaktion</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleReaktion()
     * @generated not
     */
    public void testGetAstraleReaktion() {
        assertEquals(1, getFixture().getAstraleReaktion());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleStaerke() <em>Astrale Staerke</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleStaerke()
     * @generated not
     */
    public void testGetAstraleStaerke() {
        assertEquals(1, getFixture().getAstraleStaerke());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleInitative() <em>Astrale Initative</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleInitative()
     * @generated not
     */
    public void testGetAstraleInitative() {
        assertEquals(2, getFixture().getAstraleInitative());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleInitativWuerfel() <em>Astrale Initativ Wuerfel</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstraleInitativWuerfel()
     * @generated not
     */
    public void testGetAstraleInitativWuerfel() {
        assertEquals(3, getFixture().getAstraleInitativWuerfel());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.AstraleProjektion#getAstralePanzerung() <em>Astrale Panzerung</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.AstraleProjektion#getAstralePanzerung()
     * @generated not
     */
    public void testGetAstralePanzerung() {
        assertEquals(0, getFixture().getAstralePanzerung());
    }

    
    
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitative() <em>Initative</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitative()
     * @generated not
     */
    public void testGetInitative() {
        assertEquals(2, getFixture().getInitative());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitativWuerfel() <em>Initativ Wuerfel</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitativWuerfel()
     * @generated not
     */
    public void testGetInitativWuerfel() {
        assertEquals(2, getFixture().getInitativWuerfel());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getAusweichen() <em>Ausweichen</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getAusweichen()
     * @generated not
     */
    public void testGetAusweichen() {
        assertEquals(2, getFixture().getAusweichen());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getEssenz() <em>Essenz</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getEssenz()
     * @generated not
     */
    public void testGetEssenz() {
        assertEquals(100, getFixture().getEssenz());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getEdge() <em>Edge</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getEdge()
     * @generated not
     */
    public void testGetEdge() {
        assertEquals(0, getFixture().getEdge());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getCharisma() <em>Charisma</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GeistigeAttribute#getCharisma()
     * @generated not
     */
    public void testGetCharisma() {
        assertEquals(1, getFixture().getCharisma());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getWillenskraft() <em>Willenskraft</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GeistigeAttribute#getWillenskraft()
     * @generated not
     */
    public void testGetWillenskraft() {
        assertEquals(1, getFixture().getWillenskraft());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getIntuition() <em>Intuition</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GeistigeAttribute#getIntuition()
     * @generated not
     */
    public void testGetIntuition() {
        assertEquals(1, getFixture().getIntuition());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.GeistigeAttribute#getLogik() <em>Logik</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.GeistigeAttribute#getLogik()
     * @generated not
     */
    public void testGetLogik() {
        assertEquals(1, getFixture().getLogik());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getKonstitution() <em>Konstitution</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getKonstitution()
     * @generated not
     */
    public void testGetKonstitution() {
        assertEquals(1, getFixture().getKonstitution());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getGeschicklichkeit() <em>Geschicklichkeit</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getGeschicklichkeit()
     * @generated not
     */
    public void testGetGeschicklichkeit() {
        assertEquals(1, getFixture().getGeschicklichkeit());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getReaktion() <em>Reaktion</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getReaktion()
     * @generated not
     */
    public void testGetReaktion() {
        assertEquals(1, getFixture().getReaktion());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getStaerke() <em>Staerke</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.KoerperlicheAttribute#getStaerke()
     * @generated not
     */
    public void testGetStaerke() {
        assertEquals(1, getFixture().getStaerke());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getKoerperlich() <em>Koerperlich</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ChrakterLimits#getKoerperlich()
     * @generated not
     */
    public void testGetKoerperlich() {
        assertEquals(2, getFixture().getKoerperlich());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getGeistig() <em>Geistig</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ChrakterLimits#getGeistig()
     * @generated not
     */
    public void testGetGeistig() {
        assertEquals(2, getFixture().getGeistig());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getSozial() <em>Sozial</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.ChrakterLimits#getSozial()
     * @generated not
     */
    public void testGetSozial() {
        assertEquals(2, getFixture().getSozial());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Panzerung#getPanzer() <em>Panzer</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Panzerung#getPanzer()
     * @generated not
     */
    public void testGetPanzer() {
        assertEquals(0, getFixture().getPanzer());
    }

    
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.Panzerung#getPanzer() <em>Panzer</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.Panzerung#getPanzer()
     * @generated not
     */
    public void testGeistComplete() {
        Geist geisterArt = getFixture();
        geisterArt.setKonstitutionBasis(1);
        assertEquals(2, getFixture().getKonstitution());
        
        geisterArt.setGeschicklichkeitBasis(2);
        assertEquals(3, getFixture().getGeschicklichkeit());
        
        geisterArt.setReaktionBasis(3);
        assertEquals(4, getFixture().getReaktion());
        
        geisterArt.setStaerkeBasis(2);
        assertEquals(3, getFixture().getStaerke());
        
        geisterArt.setIntuitionBasis(1);
        assertEquals(2, getFixture().getIntuition());
        
        geisterArt.setIntuitionBasis(2);
        assertEquals(3, getFixture().getIntuition());
        
        geisterArt.setWillenskraftBasis(3);
        assertEquals(4, getFixture().getWillenskraft());
        
        geisterArt.setCharismaBasis(2);
        assertEquals(3, getFixture().getCharisma());
        
        
        assertEquals(0, getFixture().getPanzer());
    }

    
} //GeistTest
