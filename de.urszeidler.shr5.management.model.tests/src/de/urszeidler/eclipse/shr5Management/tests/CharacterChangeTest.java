/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import de.urszeidler.eclipse.shr5Management.CharacterChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Character Change</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CharacterChangeTest extends DiaryEntryTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(CharacterChangeTest.class);
    }

    /**
     * Constructs a new Character Change test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CharacterChangeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Character Change test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected CharacterChange getFixture() {
        return (CharacterChange)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5managementFactory.eINSTANCE.createCharacterChange());
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

} //CharacterChangeTest
