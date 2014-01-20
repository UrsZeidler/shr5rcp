/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.framework.TestCase;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.Magier;
import de.urszeidler.eclipse.shr5.MudanPersona;
import de.urszeidler.eclipse.shr5.MysticAdept;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.PriorityCategorie;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Priority Categorie</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class PriorityCategorieTest extends TestCase {

	/**
     * The fixture for this Priority Categorie test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PriorityCategorie fixture = null;
	
	protected PlayerCharacter character;
	/**
     * Constructs a new Priority Categorie test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PriorityCategorieTest(String name) {
        super(name);
    }

	/**
     * Sets the fixture for this Priority Categorie test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void setFixture(PriorityCategorie fixture) {
        this.fixture = fixture;
    }

	/**
     * Returns the fixture for this Priority Categorie test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PriorityCategorie getFixture() {
        return fixture;
    }

	/**
	 * Creates a simple mudan character.
	 * 
	 * @return
	 */
	public static PlayerCharacter createMudanCharacter() {
		PlayerCharacter character = Shr5managementFactory.eINSTANCE.createPlayerCharacter();
		MudanPersona persona = Shr5Factory.eINSTANCE.createMudanPersona();
		Spezies spezies = Shr5Factory.eINSTANCE.createSpezies();
		persona.setSpezies(spezies);
	
		character.setPersona(persona);
		return character;
	}

	/**
	 * Creates a simple magier character.
	 * 
	 * @return
	 */
	public static PlayerCharacter createZaubererCharacter() {
		PlayerCharacter character = Shr5managementFactory.eINSTANCE.createPlayerCharacter();
		Magier persona = Shr5Factory.eINSTANCE.createMagier();
		Spezies spezies = Shr5Factory.eINSTANCE.createSpezies();
		persona.setSpezies(spezies);
	
		character.setPersona(persona);
		return character;
	}

	/**
	 * Creates a simple magier character.
	 * 
	 * @return
	 */
	public static PlayerCharacter createMysticAdeptCharacter() {
		PlayerCharacter character = Shr5managementFactory.eINSTANCE.createPlayerCharacter();
		MysticAdept persona = Shr5Factory.eINSTANCE.createMysticAdept();
		Spezies spezies = Shr5Factory.eINSTANCE.createSpezies();
		persona.setSpezies(spezies);
	
		character.setPersona(persona);
		return character;
	}

	/**
	 * Creates a simple technomancer character.
	 * 
	 * @return
	 */
	public static PlayerCharacter createAdeptCharacter() {
		PlayerCharacter character = Shr5managementFactory.eINSTANCE.createPlayerCharacter();
		KiAdept persona = Shr5Factory.eINSTANCE.createKiAdept();
		Spezies spezies = Shr5Factory.eINSTANCE.createSpezies();
		persona.setSpezies(spezies);
	
		character.setPersona(persona);
		return character;
	}

	/**
	 * Creates a simple technomancer character.
	 * 
	 * @return
	 */
	public static PlayerCharacter createTechnoCharacter() {
		PlayerCharacter character = Shr5managementFactory.eINSTANCE.createPlayerCharacter();
		de.urszeidler.eclipse.shr5.Technomancer persona = Shr5Factory.eINSTANCE.createTechnomancer();
		Spezies spezies = Shr5Factory.eINSTANCE.createSpezies();
		persona.setSpezies(spezies);
	
		character.setPersona(persona);
		return character;
	}

} //PriorityCategorieTest
