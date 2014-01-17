/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.Magier;
import de.urszeidler.eclipse.shr5.MysticAdept;
import de.urszeidler.eclipse.shr5.Technomancer;
import de.urszeidler.eclipse.shr5Management.Adept;
import de.urszeidler.eclipse.shr5Management.MetaType;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Spellcaster;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Meta Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.MetaType#calcSpecialPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Special Points Spend</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class MetaTypeTest extends PriorityCategorieTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MetaTypeTest.class);
	}

	/**
	 * Constructs a new Meta Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Meta Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MetaType getFixture() {
		return (MetaType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Shr5managementFactory.eINSTANCE.createMetaType());
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
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.MetaType#calcSpecialPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Special Points Spend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.MetaType#calcSpecialPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
	 * @generated not
	 */
	public void testCalcSpecialPointsSpend__ManagedCharacter() {
		getFixture().setSpecialPoints(5);
		character = createMudanCharacter();

		assertEquals("0 points spend", 0,getFixture().calcSpecialPointsSpend(character));		
		character.getPersona().setEdgeBasis(5);
		assertEquals("5 points spend", 5,getFixture().calcSpecialPointsSpend(character));		
		
	}
	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.MetaType#calcSpecialPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Special Points Spend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.MetaType#calcSpecialPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
	 * @generated not
	 */
	public void testCalcSpecialPointsSpend__ManagedCharacter_MysticAdept() {
		getFixture().setSpecialPoints(5);
		
		character = createMysticAdeptCharacter();
		Shr5Generator generator = Shr5managementFactory.eINSTANCE.createShr5Generator();
		Spellcaster spellcaster = Shr5managementFactory.eINSTANCE.createSpellcaster();
		spellcaster.setMagic(0);
		generator.setMagic(spellcaster);
		character.setChracterSource(generator);
		
		MysticAdept ma  = (MysticAdept) character.getPersona();
		
		assertEquals("0 points spend", 0,getFixture().calcSpecialPointsSpend(character));		
		character.getPersona().setEdgeBasis(5);
		assertEquals("5 points spend", 5,getFixture().calcSpecialPointsSpend(character));		
		ma.setMagieBasis(2);
		assertEquals("3 points spend", 3,getFixture().calcSpecialPointsSpend(character));		
		
	}
	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.MetaType#calcSpecialPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Special Points Spend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.MetaType#calcSpecialPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
	 * @generated not
	 */
	public void testCalcSpecialPointsSpend__ManagedCharacter_KiAdept() {
		getFixture().setSpecialPoints(5);
		
		character = createAdeptCharacter();
		Shr5Generator generator = Shr5managementFactory.eINSTANCE.createShr5Generator();
		Adept spellcaster = Shr5managementFactory.eINSTANCE.createAdept();
		spellcaster.setMagic(0);
		generator.setMagic(spellcaster);
		character.setChracterSource(generator);
		
		KiAdept ma  = (KiAdept) character.getPersona();
		
		assertEquals("0 points spend", 0,getFixture().calcSpecialPointsSpend(character));		
		character.getPersona().setEdgeBasis(5);
		assertEquals("5 points spend", 5,getFixture().calcSpecialPointsSpend(character));		
		ma.setMagieBasis(2);
		assertEquals("3 points spend", 3,getFixture().calcSpecialPointsSpend(character));		
		
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.MetaType#calcSpecialPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Special Points Spend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.MetaType#calcSpecialPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
	 * @generated not
	 */
	public void testCalcSpecialPointsSpend__ManagedCharacter_Magier() {
		getFixture().setSpecialPoints(5);
		character = createZaubererCharacter();
		Shr5Generator generator = Shr5managementFactory.eINSTANCE.createShr5Generator();
		Spellcaster spellcaster = Shr5managementFactory.eINSTANCE.createSpellcaster();
		spellcaster.setMagic(0);
		generator.setMagic(spellcaster);
		character.setChracterSource(generator);

		Magier ma  = (Magier) character.getPersona();
		
		assertEquals("0 points spend", 0,getFixture().calcSpecialPointsSpend(character));		
		character.getPersona().setEdgeBasis(5);
		assertEquals("5 points spend", 5,getFixture().calcSpecialPointsSpend(character));		
		ma.setMagieBasis(2);

		assertEquals("3 points spend", 3,getFixture().calcSpecialPointsSpend(character));		
	}


	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.MetaType#calcSpecialPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Special Points Spend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.MetaType#calcSpecialPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
	 * @generated not
	 */
	public void testCalcSpecialPointsSpend__ManagedCharacter_Technomancer() {
		getFixture().setSpecialPoints(5);
		character = createTechnoCharacter();
		Shr5Generator generator = Shr5managementFactory.eINSTANCE.createShr5Generator();
		de.urszeidler.eclipse.shr5Management.Technomancer spellcaster = Shr5managementFactory.eINSTANCE.createTechnomancer();
		spellcaster.setResonanz(0);
		generator.setMagic(spellcaster);
		character.setChracterSource(generator);

		Technomancer ma  = (Technomancer) character.getPersona();
		
		assertEquals("0 points spend", 0,getFixture().calcSpecialPointsSpend(character));		
		character.getPersona().setEdgeBasis(5);
		assertEquals("5 points spend", 5,getFixture().calcSpecialPointsSpend(character));		
		
		ma.setResonanzBasis(2);
		assertEquals("3 points spend", 3,getFixture().calcSpecialPointsSpend(character));		
		
	}

} //MetaTypeTest
