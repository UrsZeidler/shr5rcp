/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5Management.SpecialType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Special Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.SpecialType#calcSkillsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Skills Spend</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class SpecialTypeTest extends PriorityCategorieTest {

	/**
	 * Constructs a new Special Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Special Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SpecialType getFixture() {
		return (SpecialType)fixture;
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.SpecialType#calcSkillsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Skills Spend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.SpecialType#calcSkillsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
	 * @generated not
	 */
	public void testCalcSkillsSpend__ManagedCharacter() {
		assertEquals("0 spend",0, getFixture().calcSkillsSpend(character));
		
		Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
		getFixture().getSelectableSkills().add(fertigkeit);
		getFixture().setSkillNumber(2);
		getFixture().setSkillValue(5);

		PersonaFertigkeit pfertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
		pfertigkeit.setStufe(5);
		pfertigkeit.setFertigkeit(fertigkeit);
		character.getPersona().getFertigkeiten().add(pfertigkeit);
		
		assertEquals("1 spend",1, getFixture().calcSkillsSpend(character));
	}

} //SpecialTypeTest
