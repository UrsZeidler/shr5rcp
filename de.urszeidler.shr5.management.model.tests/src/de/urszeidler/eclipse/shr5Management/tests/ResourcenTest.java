/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import java.math.BigDecimal;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.BioWare;
import de.urszeidler.eclipse.shr5.Gegenstand;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resourcen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Resourcen#calcResourceSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Resource Spend</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ResourcenTest extends PriorityCategorieTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourcenTest.class);
	}

	/**
	 * Constructs a new Resourcen test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcenTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resourcen test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Resourcen getFixture() {
		return (Resourcen)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Shr5managementFactory.eINSTANCE.createResourcen());
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
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.Resourcen#calcResourceSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Resource Spend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.Resourcen#calcResourceSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
	 * @generated not
	 */
	public void testCalcResourceSpend__ManagedCharacter() {
		PlayerCharacter character = createMudanCharacter();
		
		assertEquals("0 points spend", 0,getFixture().calcResourceSpend(character));		
		Gegenstand gegenstand = Shr5Factory.eINSTANCE.createGegenstand();
		gegenstand.setWert(new BigDecimal(100));
		character.getInventar().add(gegenstand);		
		assertEquals("100 points spend", 100,getFixture().calcResourceSpend(character));		
		
		gegenstand = Shr5Factory.eINSTANCE.createGegenstand();
		gegenstand.setWert(new BigDecimal(100));
		character.getInventar().add(gegenstand);		
		assertEquals("200 points spend", 200,getFixture().calcResourceSpend(character));		
		
		BioWare bioware = Shr5Factory.eINSTANCE.createBioWare();
		bioware.setWert(new BigDecimal(100));
		((KoerperPersona)character.getPersona()).getKoerperMods().add(bioware);
		assertEquals("300 points spend", 300,getFixture().calcResourceSpend(character));		

	}

} //ResourcenTest
