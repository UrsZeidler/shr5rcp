/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import java.util.Calendar;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5Management.CharacterDiary;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Player Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.PlayerCharacter#getAge() <em>Age</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PlayerCharacterTest extends ManagedCharacterTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(PlayerCharacterTest.class);
    }

	/**
     * Constructs a new Player Character test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PlayerCharacterTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Player Character test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected PlayerCharacter getFixture() {
        return (PlayerCharacter)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(Shr5managementFactory.eINSTANCE.createPlayerCharacter());
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
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getAge() <em>Age</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getAge()
     * @generated not
     */
    public void testGetAge() {
        Calendar birth = Calendar.getInstance();
        getFixture().setDateofbirth(birth.getTime());
        
        CharacterDiary diary = Shr5managementFactory.eINSTANCE.createCharacterDiary();
        birth.add(Calendar.YEAR, 20);
        diary.setCharacterDate(birth.getTime());
        getFixture().setDiary(diary);
        
        assertEquals(20, getFixture().getAge());
        
        
    }


} //PlayerCharacterTest
