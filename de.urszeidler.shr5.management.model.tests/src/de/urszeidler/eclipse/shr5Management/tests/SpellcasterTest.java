/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Magier;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Spellcaster;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Spellcaster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Spellcaster#calcSpellPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Spell Points Spend</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SpellcasterTest extends AdeptTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpellcasterTest.class);
	}

	/**
	 * Constructs a new Spellcaster test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpellcasterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Spellcaster test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Spellcaster getFixture() {
		return (Spellcaster)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated not
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Shr5managementFactory.eINSTANCE.createSpellcaster());
		character = createZaubererCharacter();
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
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.Spellcaster#calcSpellPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Spell Points Spend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.Spellcaster#calcSpellPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
	 * @generated not
	 */
	public void testCalcSpellPointsSpend__ManagedCharacter() {
		PlayerCharacter character = createZaubererCharacter();
		
		
		Magier t = (Magier) character.getPersona();
		assertEquals("0 spend",0, getFixture().calcSpellPointsSpend(character));
		PersonaZauber zauber = Shr5Factory.eINSTANCE.createPersonaZauber();
		t.getZauber().add(zauber);
		zauber.setStufe(1);
		assertEquals("1 spend",1, getFixture().calcSpellPointsSpend(character));
		zauber.setStufe(5);
		assertEquals("5 spend",5, getFixture().calcSpellPointsSpend(character));
		zauber = Shr5Factory.eINSTANCE.createPersonaZauber();
		t.getZauber().add(zauber);
		zauber.setStufe(1);
		assertEquals("6 spend",6, getFixture().calcSpellPointsSpend(character));
	}

	
} //SpellcasterTest
