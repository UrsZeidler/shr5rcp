/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>shr5Management</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Shr5managementTests extends TestSuite {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(suite());
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static Test suite() {
        TestSuite suite = new Shr5managementTests("shr5Management Tests");
        suite.addTestSuite(NonPlayerCharacterTest.class);
        suite.addTestSuite(KarmaGaintTest.class);
        suite.addTestSuite(MetaTypeTest.class);
        suite.addTestSuite(AttributesTest.class);
        suite.addTestSuite(SkillTest.class);
        suite.addTestSuite(ResourcenTest.class);
        suite.addTestSuite(TechnomancerTest.class);
        suite.addTestSuite(SpellcasterTest.class);
        suite.addTestSuite(AdeptTest.class);
        suite.addTestSuite(FreeStyleGeneratorTest.class);
        suite.addTestSuite(Shr5GeneratorTest.class);
        suite.addTestSuite(AttributeChangeTest.class);
        suite.addTestSuite(PlayerCharacterTest.class);
        suite.addTestSuite(MudanTest.class);
        suite.addTestSuite(PersonaChangeTest.class);
        suite.addTestSuite(Shr5KarmaGeneratorTest.class);
        suite.addTestSuite(PackTest.class);
        suite.addTestSuite(SumToTenGeneratorTest.class);
        return suite;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shr5managementTests(String name) {
        super(name);
    }

} //Shr5managementTests
