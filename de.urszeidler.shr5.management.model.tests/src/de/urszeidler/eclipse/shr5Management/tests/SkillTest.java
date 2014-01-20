/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Skill;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Skill#calcSkillSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Skill Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Skill#calcGroupSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Group Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Skill#calcKnowledgeSkillSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Knowledge Skill Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Skill#calcKnowledgeSkillPoints(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Knowledge Skill Points</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SkillTest extends PriorityCategorieTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(SkillTest.class);
    }

	/**
     * Constructs a new Skill test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SkillTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Skill test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected Skill getFixture() {
        return (Skill)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(Shr5managementFactory.eINSTANCE.createSkill());
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
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.Skill#calcSkillSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Skill Spend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.Skill#calcSkillSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
	 * @generated not
	 */
	public void testCalcSkillSpend__ManagedCharacter() {
		PlayerCharacter character = createMudanCharacter();
		Fertigkeit wfertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
		
		assertEquals("0 points spend", 0,getFixture().calcSkillSpend(character));		
		PersonaFertigkeit fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
		fertigkeit.setStufe(1);
		fertigkeit.setFertigkeit(wfertigkeit);
		character.getPersona().getFertigkeiten().add(fertigkeit);
		assertEquals("1 points spend",1, getFixture().calcSkillSpend(character));		
		fertigkeit.setStufe(2);
		assertEquals("2 points spend",2, getFixture().calcSkillSpend(character));		
		
		fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
		fertigkeit.setStufe(1);
		fertigkeit.setFertigkeit(wfertigkeit);
		character.getPersona().getFertigkeiten().add(fertigkeit);
		assertEquals("3 points spend",3, getFixture().calcSkillSpend(character));		

	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.Skill#calcGroupSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Group Spend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.Skill#calcGroupSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
	 * @generated not
	 */
	public void testCalcGroupSpend__ManagedCharacter() {
		PlayerCharacter character = createMudanCharacter();
		
		assertEquals("0 points spend", 0,getFixture().calcGroupSpend(character));		
		PersonaFertigkeitsGruppe fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
		character.getPersona().getFertigkeitsGruppen().add(fertigkeit);
		fertigkeit.setStufe(1);
		assertEquals("1 points spend",1, getFixture().calcGroupSpend(character));		
		fertigkeit.setStufe(3);
		assertEquals("3 points spend",3, getFixture().calcGroupSpend(character));		
		fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
		character.getPersona().getFertigkeitsGruppen().add(fertigkeit);
		fertigkeit.setStufe(1);
		assertEquals("4 points spend",4, getFixture().calcGroupSpend(character));		

	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.Skill#calcKnowledgeSkillSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Knowledge Skill Spend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.Skill#calcKnowledgeSkillSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
	 * @generated not
	 */
	public void testCalcKnowledgeSkillSpend__ManagedCharacter() {
		PlayerCharacter character = createMudanCharacter();
		Fertigkeit wfertigkeit = Shr5Factory.eINSTANCE.createWissensfertigkeit();
		
		assertEquals("0 points spend", 0,getFixture().calcSkillSpend(character));		
		PersonaFertigkeit fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
		fertigkeit.setStufe(1);
		fertigkeit.setFertigkeit(wfertigkeit);
		character.getPersona().getFertigkeiten().add(fertigkeit);
		assertEquals("1 points spend",1, getFixture().calcKnowledgeSkillSpend(character));		
		fertigkeit.setStufe(2);
		assertEquals("2 points spend",2, getFixture().calcKnowledgeSkillSpend(character));		
		
		fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
		fertigkeit.setStufe(1);
		fertigkeit.setFertigkeit(wfertigkeit);
		character.getPersona().getFertigkeiten().add(fertigkeit);
		assertEquals("3 points spend",3, getFixture().calcKnowledgeSkillSpend(character));		
	}

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.Skill#calcKnowledgeSkillPoints(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Knowledge Skill Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.Skill#calcKnowledgeSkillPoints(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
	 * @generated not
	 */
	public void testCalcKnowledgeSkillPoints__ManagedCharacter() {
		PlayerCharacter character = createMudanCharacter();
		Fertigkeit wfertigkeit = Shr5Factory.eINSTANCE.createWissensfertigkeit();
		
		assertEquals("0 points", 0,getFixture().calcKnowledgeSkillPoints(character));
		character.getPersona().setLogikBasis(1);
		assertEquals("2 points", 2,getFixture().calcKnowledgeSkillPoints(character));
		
		character.getPersona().setLogikBasis(2);
		assertEquals("4 points",4,getFixture().calcKnowledgeSkillPoints(character));
		
		character.getPersona().setIntuitionBasis(2);
		assertEquals("8 points",8,getFixture().calcKnowledgeSkillPoints(character));

	}

} //SkillTest
