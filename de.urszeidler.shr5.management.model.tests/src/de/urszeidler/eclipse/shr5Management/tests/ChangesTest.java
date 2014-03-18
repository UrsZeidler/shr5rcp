/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EcorePackage;

import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Changes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost() <em>Karma Cost</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Changes#applyChanges() <em>Apply Changes</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ChangesTest extends TestCase {

    /**
     * The fixture for this Changes test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Changes fixture = null;
    protected PlayerCharacter playerCharacter;
    protected Shr5System shr5System;

    /**
     * Constructs a new Changes test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public ChangesTest(String name) {
        super(name);
        playerCharacter = Shr5GeneratorTest.createMudanCharacter();
        shr5System = Shr5managementFactory.eINSTANCE.createShr5System();
        shr5System.setCharacterAdvancements(Shr5managementFactory.eINSTANCE.createCharacterAdvancementSystem());
        Shr5Generator generator = Shr5managementFactory.eINSTANCE.createShr5Generator();
        generator.setCharacter(playerCharacter);
        generator.setGenerator(shr5System);

        createAdvacements(shr5System);

        PersonaFertigkeit fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        Fertigkeit wfertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setFertigkeit(wfertigkeit);
        fertigkeit.setStufe(1);
        playerCharacter.getPersona().getFertigkeiten().add(fertigkeit);

    }

    /**
     * @param shr5System1
     */
    public static void createAdvacements(Shr5System shr5System1) {
        IncreaseCharacterPart part = Shr5managementFactory.eINSTANCE.createIncreaseCharacterPart();
        part.setKarmaFactor(2);
        part.setType(Shr5Package.Literals.FERTIGKEIT);
        
        shr5System1.getCharacterAdvancements().getCharacterAdvancements().add(part);

        part = Shr5managementFactory.eINSTANCE.createIncreaseCharacterPart();
        part.setKarmaFactor(1);
        part.setType(Shr5Package.Literals.SPRACHFERTIGKEIT);
        shr5System1.getCharacterAdvancements().getCharacterAdvancements().add(part);

        part = Shr5managementFactory.eINSTANCE.createIncreaseCharacterPart();
        part.setKarmaFactor(5);
        part.setType(Shr5Package.Literals.FERTIGKEITS_GRUPPE);
        shr5System1.getCharacterAdvancements().getCharacterAdvancements().add(part);

        part = Shr5managementFactory.eINSTANCE.createIncreaseCharacterPart();
        part.setKarmaFactor(5);
        part.setType(EcorePackage.Literals.EATTRIBUTE);
        shr5System1.getCharacterAdvancements().getCharacterAdvancements().add(part);

        part = Shr5managementFactory.eINSTANCE.createIncreaseCharacterPart();
        part.setKarmaFactor(2);
        part.setType(Shr5Package.Literals.PERSONA_EIGENSCHAFT);
        shr5System1.getCharacterAdvancements().getCharacterAdvancements().add(part);

        part = Shr5managementFactory.eINSTANCE.createIncreaseCharacterPart();
        part.setKarmaFactor(13);
        part.setType(Shr5Package.Literals.INITATION);
        shr5System1.getCharacterAdvancements().getCharacterAdvancements().add(part);
    }

    /**
     * Sets the fixture for this Changes test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(Changes fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Changes test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Changes getFixture() {
        return fixture;
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost() <em>Karma Cost</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost()
     * @generated not
     */
    public void testGetKarmaCost() {
        fail();
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Changes#applyChanges() <em>Apply Changes</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Changes#applyChanges()
     * @generated not
     */
    public void testApplyChanges() {
          fail();
    }

} // ChangesTest
