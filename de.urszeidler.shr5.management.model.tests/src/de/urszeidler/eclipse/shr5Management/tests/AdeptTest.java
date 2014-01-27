/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5Management.Adept;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Adept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 * <li>{@link de.urszeidler.eclipse.shr5Management.Adept#calcPowerPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter) <em>Calc Power
 * Points Spend</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AdeptTest extends SpecialTypeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(AdeptTest.class);
    }

    /**
     * Constructs a new Adept test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public AdeptTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Adept test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected Adept getFixture() {
        return (Adept)fixture;
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
        setFixture(Shr5managementFactory.eINSTANCE.createAdept());
        character = createAdeptCharacter();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Adept#calcPowerPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
     * <em>Calc Power Points Spend</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Adept#calcPowerPointsSpend(de.urszeidler.eclipse.shr5Management.ManagedCharacter)
     * @generated not
     */
    public void testCalcPowerPointsSpend__ManagedCharacter() {
        assertEquals("0 spend", 0, getFixture().calcPowerPointsSpend(character));
        if (character.getPersona() instanceof KiAdept) {
            KiAdept ka = (KiAdept)character.getPersona();

            KiKraft kiKraft = Shr5Factory.eINSTANCE.createKiKraft();
            kiKraft.setKraftpunkte(100);
            ka.getKikraft().add(kiKraft);
            assertEquals("100 spend", 100, getFixture().calcPowerPointsSpend(character));
            kiKraft = Shr5Factory.eINSTANCE.createKiKraft();
            kiKraft.setKraftpunkte(100);
            ka.getKikraft().add(kiKraft);
            assertEquals("200 spend", 200, getFixture().calcPowerPointsSpend(character));
        }

    }

} // AdeptTest
