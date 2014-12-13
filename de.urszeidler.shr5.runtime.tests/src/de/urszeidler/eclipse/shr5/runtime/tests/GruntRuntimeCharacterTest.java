/**
 */
package de.urszeidler.eclipse.shr5.runtime.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.runtime.GruntRuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5Management.NonPlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Grunt Runtime Character</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GruntRuntimeCharacterTest extends RuntimeCharacterTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(GruntRuntimeCharacterTest.class);
    }

    /**
     * Constructs a new Grunt Runtime Character test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GruntRuntimeCharacterTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Grunt Runtime Character test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected GruntRuntimeCharacter getFixture() {
        return (GruntRuntimeCharacter)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated not
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RuntimeFactory.eINSTANCE.createGruntRuntimeCharacter());
        
        NonPlayerCharacter nonPlayerCharacter = Shr5managementFactory.eINSTANCE.createNonPlayerCharacter();
        nonPlayerCharacter.setPersona(Shr5Factory.eINSTANCE.createMudanPersona());
        getFixture().setCharacter(nonPlayerCharacter);

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

    
    public void testAddPhysicalDamage() throws Exception {
        
        getFixture().setPhysicalDamage(2);        
        assertEquals(2, getFixture().getPhysicalDamage());
    }
    
    public void testAddMentalDamage() throws Exception {
        getFixture().setMentalDamage(2);        
        assertEquals(2, getFixture().getPhysicalDamage());
        getFixture().setPhysicalDamage(getFixture().getPhysicalDamage() +2);        
        assertEquals(4, getFixture().getPhysicalDamage());
    }
} //GruntRuntimeCharacterTest
