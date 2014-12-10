/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.framework.TestCase;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem;
import de.urszeidler.eclipse.shr5Management.GeneratorState;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Character Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getCurrentInstruction() <em>Current Instruction</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class CharacterGeneratorTest extends TestCase {

	/**
     * The fixture for this Character Generator test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CharacterGenerator<?> fixture = null;

	/**
     * Constructs a new Character Generator test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CharacterGeneratorTest(String name) {
        super(name);
    }

	/**
     * Sets the fixture for this Character Generator test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void setFixture(CharacterGenerator<?> fixture) {
        this.fixture = fixture;
    }

	/**
     * Returns the fixture for this Character Generator test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CharacterGenerator<?> getFixture() {
        return fixture;
    }

	/**
	 * Tests the '{@link de.urszeidler.eclipse.shr5Management.CharacterGenerator#getCurrentInstruction() <em>Current Instruction</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.urszeidler.eclipse.shr5Management.CharacterGenerator#getCurrentInstruction()
	 * @generated not
	 */
	public void testGetCurrentInstruction() {
		
		CharacterGeneratorSystem generator = getFixture().getGenerator();
		generator.getInstructions().put(GeneratorState.NEW, "1");
		generator.getInstructions().put(GeneratorState.READY_FOR_CREATION, "2");
		
		assertEquals("need to be 1","1", getFixture().getCurrentInstruction());
		getFixture().setState(GeneratorState.READY_FOR_CREATION);
		assertEquals("need to be 2","2", getFixture().getCurrentInstruction());
	}

} //CharacterGeneratorTest
