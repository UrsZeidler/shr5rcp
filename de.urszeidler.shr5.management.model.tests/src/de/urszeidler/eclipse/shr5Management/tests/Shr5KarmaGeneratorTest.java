/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shr5 Karma Generator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Shr5KarmaGeneratorTest extends KarmaGeneratorTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(Shr5KarmaGeneratorTest.class);
    }

    /**
     * Constructs a new Shr5 Karma Generator test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Shr5KarmaGeneratorTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Shr5 Karma Generator test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Shr5KarmaGenerator getFixture() {
        return (Shr5KarmaGenerator)fixture;
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated not
   */
  @Override
  protected void setUp() throws Exception {
      setFixture(Shr5managementFactory.eINSTANCE.createShr5KarmaGenerator());
      Shr5System system = Shr5managementFactory.eINSTANCE.createShr5System();
      system.setKarmaPoints(20);
      getFixture().setGenerator(system);

      characterConcept = Shr5managementFactory.eINSTANCE.createMudan();
      characterConcept.setCost(0);
      metaType = Shr5managementFactory.eINSTANCE.createMetaType();
      getFixture().setCharacterConcept(characterConcept);
      getFixture().setMetaType(metaType);

  }

} //Shr5KarmaGeneratorTest
