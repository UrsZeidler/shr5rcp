/**
 */
package de.urszeidler.eclipse.shr5.runtime.tests;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.runtime.GruntTeam;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5Management.GruntGroup;
import de.urszeidler.eclipse.shr5Management.GruntMembers;
import de.urszeidler.eclipse.shr5Management.NonPlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Grunt Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.GruntTeam#buildMembers() <em>Build Members</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class GruntTeamTest extends TeamTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(GruntTeamTest.class);
    }

    /**
     * Constructs a new Grunt Team test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GruntTeamTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Grunt Team test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected GruntTeam getFixture() {
        return (GruntTeam)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RuntimeFactory.eINSTANCE.createGruntTeam());
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
     * Tests the '{@link de.urszeidler.eclipse.shr5.runtime.GruntTeam#buildMembers() <em>Build Members</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.runtime.GruntTeam#buildMembers()
     * @generated not 
     */
    public void testBuildMembers() {
        NonPlayerCharacter character = Shr5managementFactory.eINSTANCE.createNonPlayerCharacter();
        AbstraktPersona persona = Shr5Factory.eINSTANCE.createMudanPersona();
        persona.setKonstitutionBasis(4);
        character.setPersona(persona);
        
        getFixture().buildMembers();
        assertEquals(0,getFixture().getMembers().size());    

        
        GruntGroup grountGroup = Shr5managementFactory.eINSTANCE.createGruntGroup();
        GruntMembers gruntMembers = Shr5managementFactory.eINSTANCE.createGruntMembers();
        gruntMembers.setCount(2);
        gruntMembers.setNsc(character);
        grountGroup.setLeader(gruntMembers);
        
        getFixture().setGruntGroup(grountGroup);
        
        //getFixture().buildMembers();
        assertEquals(2,getFixture().getMembers().size());    
        
        getFixture().buildMembers();
        assertEquals(2,getFixture().getMembers().size());    

    }

} //GruntTeamTest
