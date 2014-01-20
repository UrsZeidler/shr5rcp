/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.PersonaKomplexForm;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Technomancer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Technomancer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Technomancer#calcComplexFormsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Complex Forms Spend</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TechnomancerTest extends SpecialTypeTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(TechnomancerTest.class);
    }

	/**
     * Constructs a new Technomancer test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TechnomancerTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Technomancer test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected Technomancer getFixture() {
        return (Technomancer)fixture;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated not
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Shr5managementFactory.eINSTANCE.createTechnomancer());
		character = createTechnoCharacter();
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
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.Technomancer#calcComplexFormsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Complex Forms Spend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.Technomancer#calcComplexFormsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
	 * @generated not 
	 */
	public void testCalcComplexFormsSpend__ManagedCharacter() {
		PlayerCharacter character = createTechnoCharacter();
		
		
		de.urszeidler.eclipse.shr5.Technomancer t = (de.urszeidler.eclipse.shr5.Technomancer) character.getPersona();
		assertEquals("0 spend",0, getFixture().calcComplexFormsSpend(character));
		
		PersonaKomplexForm komplexeForm = Shr5Factory.eINSTANCE.createPersonaKomplexForm();
		t.getComplexForms().add(komplexeForm);
		komplexeForm.setStufe(1);
		assertEquals("1 spend",1, getFixture().calcComplexFormsSpend(character));
		komplexeForm.setStufe(2);
		assertEquals("2 spend",2, getFixture().calcComplexFormsSpend(character));
		komplexeForm = Shr5Factory.eINSTANCE.createPersonaKomplexForm();
		t.getComplexForms().add(komplexeForm);
		komplexeForm.setStufe(1);
		assertEquals("3 spend",3, getFixture().calcComplexFormsSpend(character));
		
	}

//	public void testCalcSkillsSpend__ManagedCharacter() {
//		PlayerCharacter character = createTechnoCharacter();
//		
//		assertEquals("0 spend",0, getFixture().calcSkillsSpend(character));
//		
//		Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
//		getFixture().getSelectableSkills().add(fertigkeit);
//		getFixture().setSkillNumber(2);
//		getFixture().setSkillValue(5);
//
//		PersonaFertigkeit pfertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
//		pfertigkeit.setStufe(5);
//		pfertigkeit.setFertigkeit(fertigkeit);
//		character.getPersona().getFertigkeiten().add(pfertigkeit);
//		
//		assertEquals("1 spend",1, getFixture().calcSkillsSpend(character));
//	}


	
} //TechnomancerTest
