/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5Management.LifeModule;
import de.urszeidler.eclipse.shr5Management.LifeModulesGenerator;
import de.urszeidler.eclipse.shr5Management.LifeModulesSystem;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Life Modules Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifeModulesGenerator#getModuleKarmaCost() <em>Module Karma Cost</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifeModulesGenerator#getStartingAge() <em>Starting Age</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class LifeModulesGeneratorTest extends KarmaGeneratorTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(LifeModulesGeneratorTest.class);
    }

    private LifeModulesSystem lmSystem;

    /**
     * Constructs a new Life Modules Generator test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LifeModulesGeneratorTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Life Modules Generator test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected LifeModulesGenerator getFixture() {
        return (LifeModulesGenerator)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated not
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5managementFactory.eINSTANCE.createLifeModulesGenerator());
        
        LifeModulesSystem system = Shr5managementFactory.eINSTANCE.createLifeModulesSystem();
        system.setKarmaPoints(20);
        getFixture().setGenerator(system);

        characterConcept = Shr5managementFactory.eINSTANCE.createMudan();
        characterConcept.setCost(0);
        metaType = Shr5managementFactory.eINSTANCE.createMetaType();
        getFixture().setCharacterConcept(characterConcept);
        getFixture().setMetaType(metaType);

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

    protected void createBasicCategories() {
        shr5System = Shr5managementFactory.eINSTANCE.createLifeModulesSystem();
        getFixture().setGenerator((LifeModulesSystem)shr5System);
    }

    
    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.LifeModulesGenerator#getModuleKarmaCost() <em>Module Karma Cost</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.LifeModulesGenerator#getModuleKarmaCost()
     * @generated not
     */
    public void testGetModuleKarmaCost() {
        LifeModule lm = Shr5managementFactory.eINSTANCE.createLifeModule();
        lm.setKarmaCost(10);
        getFixture().setNationality(lm);
        assertEquals(10, getFixture().getModuleKarmaCost());
        
        getFixture().setFormativeYears(lm);
        assertEquals(20, getFixture().getModuleKarmaCost());
        getFixture().setTeenYears(lm);
        assertEquals(30, getFixture().getModuleKarmaCost());
        getFixture().setFurtherEducation(lm);
        assertEquals(40, getFixture().getModuleKarmaCost());
        getFixture().getRealLife().add(lm);
        assertEquals(50, getFixture().getModuleKarmaCost());
        lm = Shr5managementFactory.eINSTANCE.createLifeModule();
        lm.setKarmaCost(10);
        getFixture().getRealLife().add(lm);
        assertEquals(60, getFixture().getModuleKarmaCost());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.LifeModulesGenerator#getStartingAge() <em>Starting Age</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.LifeModulesGenerator#getStartingAge()
     * @generated not
     */
    public void testGetStartingAge() {
        LifeModule lm = Shr5managementFactory.eINSTANCE.createLifeModule();
        lm.setTime(10);
        getFixture().setNationality(lm);
        assertEquals(10, getFixture().getStartingAge());
        
        getFixture().setFormativeYears(lm);
        assertEquals(20, getFixture().getStartingAge());
        getFixture().setTeenYears(lm);
        assertEquals(30, getFixture().getStartingAge());
        getFixture().setFurtherEducation(lm);
        assertEquals(40, getFixture().getStartingAge());
        getFixture().getRealLife().add(lm);
        assertEquals(50, getFixture().getStartingAge());
        lm = Shr5managementFactory.eINSTANCE.createLifeModule();
        lm.setKarmaCost(10);
        getFixture().getRealLife().add(lm);
    }

} // LifeModulesGeneratorTest
