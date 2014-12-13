/**
 */
package de.urszeidler.eclipse.shr5.runtime.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.PhyicalState#getOverDead() <em>Over Dead</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#canUseEdge() <em>Can Use Edge</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RuntimeCharacterTest extends AbstractExtendetDataAwareTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(RuntimeCharacterTest.class);
    }

    /**
     * Constructs a new Character test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuntimeCharacterTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Character test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected RuntimeCharacter getFixture() {
        return (RuntimeCharacter)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(RuntimeFactory.eINSTANCE.createRuntimeCharacter());
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
     * Tests the '{@link de.urszeidler.eclipse.shr5.runtime.PhyicalState#getOverDead() <em>Over Dead</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.runtime.PhyicalState#getOverDead()
     * @generated not
     */
    public void testGetOverDead() {

        ManagedCharacter character = Shr5managementFactory.eINSTANCE.createNonPlayerCharacter();
        AbstraktPersona persona = Shr5Factory.eINSTANCE.createMudanPersona();
        persona.setKonstitutionBasis(4);
        character.setPersona(persona);
        getFixture().setCharacter(character);

        getFixture().setPhysicalDamage(10);
        assertEquals(0, getFixture().getOverDead());
        getFixture().setPhysicalDamage(11);
        assertEquals(1, getFixture().getOverDead());

    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#canUseEdge() <em>Can Use Edge</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter#canUseEdge()
     * @generated not
     */
    public void testCanUseEdge() {
        ManagedCharacter character = Shr5managementFactory.eINSTANCE.createNonPlayerCharacter();
        AbstraktPersona persona = Shr5Factory.eINSTANCE.createMudanPersona();
        persona.setKonstitutionBasis(4);
        character.setPersona(persona);
        getFixture().setCharacter(character);

        persona.setEdgeBasis(2);
        assertTrue(getFixture().canUseEdge());
        getFixture().setUsedEdge(2);
        assertFalse(getFixture().canUseEdge());
    }

} // RuntimeCharacterTest
