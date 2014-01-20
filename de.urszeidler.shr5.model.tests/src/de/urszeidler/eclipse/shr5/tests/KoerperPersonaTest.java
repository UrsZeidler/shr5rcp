/**
 */
package de.urszeidler.eclipse.shr5.tests;

import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.Koerpermods;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Koerper Persona</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Panzerung#getPanzer() <em>Panzer</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaZustand#getZustandKoerperlichMax() <em>Zustand Koerperlich Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaZustand#getZustandGeistigMax() <em>Zustand Geistig Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.PersonaZustand#getZustandGrenze() <em>Zustand Grenze</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class KoerperPersonaTest extends AbstraktPersonaTest {

	/**
	 * Constructs a new Koerper Persona test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public KoerperPersonaTest(String name) {
        super(name);
    }

	/**
	 * Returns the fixture for this Koerper Persona test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected KoerperPersona getFixture() {
        return (KoerperPersona)fixture;
    }

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.Panzerung#getPanzer()
	 * <em>Panzer</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.Panzerung#getPanzer()
	 * @generated not
	 */
	public void testGetPanzer() {
		assertEquals("should be 0", 0, getFixture().getPanzer());

		Koerpermods bioware = Shr5Factory.eINSTANCE.createBioWare();
		AttributModifikatorWert mod = Shr5Factory.eINSTANCE.createAttributModifikatorWert();

		mod.setAttribut(Shr5Package.Literals.PANZERUNG__PANZER);
		mod.setWert(2);
		bioware.getMods().add(mod);
		getFixture().getKoerperMods().add(bioware);

		assertEquals("should be 2", 2, getFixture().getPanzer());

	}

	/**
     * Tests the '{@link de.urszeidler.eclipse.shr5.PersonaZustand#getZustandKoerperlichMax() <em>Zustand Koerperlich Max</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.PersonaZustand#getZustandKoerperlichMax()
     * @generated not
     */
    public void testGetZustandKoerperlichMax() {
     getFixture().setKonstitutionBasis(4);
     assertEquals("should be 10", 10, getFixture().getZustandKoerperlichMax());
     getFixture().setKonstitutionBasis(5);
     assertEquals("should be 10", 10, getFixture().getZustandKoerperlichMax());
     getFixture().setKonstitutionBasis(5);
     assertEquals("should be 10", 10, getFixture().getZustandKoerperlichMax());
     getFixture().setKonstitutionBasis(6);
     assertEquals("should be 11", 11, getFixture().getZustandKoerperlichMax());        
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.PersonaZustand#getZustandGeistigMax() <em>Zustand Geistig Max</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.PersonaZustand#getZustandGeistigMax()
     * @generated not
     */
    public void testGetZustandGeistigMax() {
        getFixture().setWillenskraftBasis(4);
        assertEquals("should be 10", 10, getFixture().getZustandGeistigMax());
        getFixture().setWillenskraftBasis(5);
        assertEquals("should be 10", 10, getFixture().getZustandGeistigMax());
        getFixture().setWillenskraftBasis(6);
        assertEquals("should be 11", 11, getFixture().getZustandGeistigMax());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.PersonaZustand#getZustandGrenze() <em>Zustand Grenze</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.PersonaZustand#getZustandGrenze()
     * @generated not
     */
    public void testGetZustandGrenze() {
        getFixture().setKonstitutionBasis(4);
        assertEquals("should be 4", 4, getFixture().getZustandGrenze());
        getFixture().setKonstitutionBasis(5);
        assertEquals("should be 5", 5, getFixture().getZustandGrenze());
        

    }

    public void testBioWare() {
		getFixture().setKonstitutionBasis(1);
		assertEquals("should be 1", 1, fixture.getKonstitution());
		getFixture().setGeschicklichkeitBasis(1);
		assertEquals("should be 1", 1, fixture.getGeschicklichkeit());
		getFixture().setReaktionBasis(1);
		assertEquals("should be 1", 1, fixture.getReaktion());
		getFixture().setStaerkeBasis(1);
		assertEquals("should be 1", 1, fixture.getStaerke());

		Koerpermods bioware = Shr5Factory.eINSTANCE.createBioWare();
		AttributModifikatorWert mod = Shr5Factory.eINSTANCE.createAttributModifikatorWert();

		mod.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__KONSTITUTION);
		mod.setWert(1);
		bioware.getMods().add(mod);
		mod = Shr5Factory.eINSTANCE.createAttributModifikatorWert();
		mod.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);
		mod.setWert(1);
		bioware.getMods().add(mod);
		mod = Shr5Factory.eINSTANCE.createAttributModifikatorWert();
		mod.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__REAKTION);
		mod.setWert(1);
		bioware.getMods().add(mod);
		mod = Shr5Factory.eINSTANCE.createAttributModifikatorWert();
		mod.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__STAERKE);
		mod.setWert(1);
		bioware.getMods().add(mod);

		getFixture().getKoerperMods().add(bioware);

		assertEquals("should be 2", 2, fixture.getKonstitution());
		assertEquals("should be 2", 2, fixture.getGeschicklichkeit());
		assertEquals("should be 2", 2, fixture.getReaktion());
		assertEquals("should be 2", 2, fixture.getStaerke());
	}

	public void testEigenschafte() {
		getFixture().setIntuitionBasis(1);
		assertEquals("should be 1", 1, fixture.getIntuition());
		getFixture().setWillenskraftBasis(1);
		assertEquals("should be 1", 1, fixture.getWillenskraft());
		getFixture().setCharismaBasis(1);
		assertEquals("should be 1", 1, fixture.getCharisma());
		getFixture().setLogikBasis(1);
		assertEquals("should be 1", 1, fixture.getLogik());

		PersonaEigenschaft personaEigenschaft = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
		AttributModifikatorWert mod = Shr5Factory.eINSTANCE.createAttributModifikatorWert();

		mod.setAttribut(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__WILLENSKRAFT);
		mod.setWert(1);
		personaEigenschaft.getMods().add(mod);
		mod = Shr5Factory.eINSTANCE.createAttributModifikatorWert();
		mod.setAttribut(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__INTUITION);
		mod.setWert(1);
		personaEigenschaft.getMods().add(mod);
		mod = Shr5Factory.eINSTANCE.createAttributModifikatorWert();
		mod.setAttribut(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__CHARISMA);
		mod.setWert(1);
		personaEigenschaft.getMods().add(mod);
		mod = Shr5Factory.eINSTANCE.createAttributModifikatorWert();
		mod.setAttribut(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__LOGIK);
		mod.setWert(1);
		personaEigenschaft.getMods().add(mod);

		getFixture().getEigenschaften().add(personaEigenschaft);

		assertEquals("should be 2", 2, fixture.getIntuition());
		assertEquals("should be 2", 2, fixture.getWillenskraft());
		assertEquals("should be 2", 2, fixture.getCharisma());
		assertEquals("should be 2", 2, fixture.getLogik());
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
	public void testGetAusweichenMod() {
		getFixture().setReaktionBasis(1);
		getFixture().setIntuitionBasis(1);

		assertEquals("ausweichen need to be 2", 2, fixture.getAusweichen());

		PersonaEigenschaft personaEigenschaft = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
		AttributModifikatorWert mod = Shr5Factory.eINSTANCE.createAttributModifikatorWert();

		mod.setAttribut(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN);
		mod.setWert(1);
		personaEigenschaft.getMods().add(mod);
		getFixture().getEigenschaften().add(personaEigenschaft);
		assertEquals("ausweichen need to be 3", 3, fixture.getAusweichen());
	}

	/**
	 * Tests the '
	 * {@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitativWuerfel()
	 * <em>Initativ Wuerfel</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitativWuerfel()
	 * @generated not
	 */
	public void testGetInitativWuerfelMod() {
		assertEquals("limit need to be 1", 1, getFixture().getInitativWuerfel());

		PersonaEigenschaft personaEigenschaft = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
		AttributModifikatorWert mod = Shr5Factory.eINSTANCE.createAttributModifikatorWert();

		mod.setAttribut(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL);
		mod.setWert(1);
		personaEigenschaft.getMods().add(mod);
		getFixture().getEigenschaften().add(personaEigenschaft);

		assertEquals("limit need to be 2", 2, getFixture().getInitativWuerfel());
	}

	/**
	 * Tests the '
	 * {@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitativWuerfel()
	 * <em>Initativ Wuerfel</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitativWuerfel()
	 * @generated not
	 */
	public void testGetInitativeMod() {
		fixture.setReaktionBasis(1);
		fixture.setIntuitionBasis(1);

		assertEquals("limit need to be 2", 2, fixture.getInitative());

		PersonaEigenschaft personaEigenschaft = Shr5Factory.eINSTANCE.createPersonaEigenschaft();
		AttributModifikatorWert mod = Shr5Factory.eINSTANCE.createAttributModifikatorWert();
		mod.setAttribut(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE);
		mod.setWert(1);
		personaEigenschaft.getMods().add(mod);
		getFixture().getEigenschaften().add(personaEigenschaft);

		assertEquals("limit need to be 3", 3, fixture.getInitative());
	}

	/**
	 * Tests the '
	 * {@link de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitativWuerfel()
	 * <em>Initativ Wuerfel</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.SpezielleAttribute#getInitativWuerfel()
	 * @generated not
	 */
	public void testGetEssenzMod() {
		getFixture().getKoerperMods().clear();
		assertEquals("limit need to be 600", 600, getFixture().getEssenz());

		Koerpermods bioware = Shr5Factory.eINSTANCE.createBioWare();
		AttributModifikatorWert mod = Shr5Factory.eINSTANCE.createAttributModifikatorWert();

		mod.setAttribut(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__ESSENZ);
		mod.setWert(-100);
		bioware.getMods().add(mod);

		getFixture().getKoerperMods().add(bioware);

		assertEquals("limit need to be 500", 500, getFixture().getEssenz());
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
	public void testGetKoerperlichMod() {
		fixture.setStaerkeBasis(1);
		fixture.setKonstitutionBasis(2);
		fixture.setReaktionBasis(2);

		assertEquals("limit need to be 2", 2, fixture.getKoerperlich());
		Koerpermods bioware = Shr5Factory.eINSTANCE.createBioWare();
		AttributModifikatorWert mod = Shr5Factory.eINSTANCE.createAttributModifikatorWert();

		mod.setAttribut(Shr5Package.Literals.CHRAKTER_LIMITS__KOERPERLICH);
		mod.setWert(1);
		bioware.getMods().add(mod);

		getFixture().getKoerperMods().add(bioware);

		assertEquals("limit need to be 3", 3, fixture.getKoerperlich());

	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getGeistig()
	 * <em>Geistig</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.ChrakterLimits#getGeistig()
	 * @generated not
	 */
	public void testGetGeistigMod() {
		fixture.setLogikBasis(1);
		fixture.setIntuitionBasis(2);
		fixture.setWillenskraftBasis(2);

		assertEquals("limit need to be 2", 2, fixture.getGeistig());
		Koerpermods bioware = Shr5Factory.eINSTANCE.createBioWare();
		AttributModifikatorWert mod = Shr5Factory.eINSTANCE.createAttributModifikatorWert();

		mod.setAttribut(Shr5Package.Literals.CHRAKTER_LIMITS__GEISTIG);
		mod.setWert(1);
		bioware.getMods().add(mod);

		getFixture().getKoerperMods().add(bioware);

		assertEquals("limit need to be 3", 3, fixture.getGeistig());

	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5.ChrakterLimits#getSozial()
	 * <em>Sozial</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.urszeidler.eclipse.shr5.ChrakterLimits#getSozial()
	 * @generated not
	 */
	public void testGetSozialMod() {
		fixture.setCharismaBasis(3);
		fixture.setWillenskraftBasis(6);
		Koerpermods bioware = Shr5Factory.eINSTANCE.createBioWare();
		AttributModifikatorWert mod = Shr5Factory.eINSTANCE.createAttributModifikatorWert();

		mod.setAttribut(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__ESSENZ);
		mod.setWert(-100);
		bioware.getMods().add(mod);

		getFixture().getKoerperMods().add(bioware);

		assertEquals("limit need to be 5", 5, fixture.getSozial());
	}

} // KoerperPersonaTest
