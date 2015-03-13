/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import de.urszeidler.eclipse.shr5Management.LifeModulesGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Life Modules Generator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LifeModulesGeneratorTest extends Shr5KarmaGeneratorTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(LifeModulesGeneratorTest.class);
    }

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
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5managementFactory.eINSTANCE.createLifeModulesGenerator());
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

} //LifeModulesGeneratorTest
