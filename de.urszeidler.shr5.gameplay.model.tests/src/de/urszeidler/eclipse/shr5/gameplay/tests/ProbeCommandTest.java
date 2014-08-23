/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import de.urszeidler.eclipse.shr5.gameplay.ProbeCommand;
import de.urszeidler.eclipse.shr5.gameplay.ProbeState;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTestState;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Probe Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getProbeState() <em>Probe State</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTest#getTestState() <em>Test State</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ProbeCommandTest extends SubjectCommandTest {

    /**
     * Constructs a new Probe Command test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProbeCommandTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Probe Command test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ProbeCommand getFixture() {
        return (ProbeCommand)fixture;
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getProbeState() <em>Probe State</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.Probe#getProbeState()
     * @generated not
     */
    public void testGetProbeState() {
        getFixture().getProbe().add(1);
        getFixture().getProbe().add(1);
        getFixture().getProbe().add(1);
        getFixture().getProbe().add(1);
        getFixture().setGlitches(4);
        getFixture().setExecuted(true);

        assertEquals(ProbeState.CRITICAL_GLITCH, getFixture().getProbeState());
        
        getFixture().getProbe().add(5);
        getFixture().setSuccesses(1);
        getFixture().getGlitches();
        assertEquals(ProbeState.GLITCH, getFixture().getProbeState());
        
        getFixture().getProbe().add(2);
        getFixture().getProbe().add(2);
        getFixture().getProbe().add(2);
        getFixture().getProbe().add(2);
        assertEquals(ProbeState.NO_GLITCH, getFixture().getProbeState());
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTest#getTestState() <em>Test State</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.urszeidler.eclipse.shr5.gameplay.SuccesTest#getTestState()
     * @generated
     */
    public void testGetTestState() {
        
        
        getFixture().getProbe().add(1);
        getFixture().getProbe().add(1);
        getFixture().getProbe().add(1);
        getFixture().getProbe().add(1);
        getFixture().setGlitches(4);
        getFixture().setExecuted(true);
        getFixture().setNetHits(-2);
        getFixture().setThresholds(2);
        
        assertEquals(SuccesTestState.FAILURE, getFixture().getTestState());
        
        getFixture().getProbe().add(5);
        getFixture().getProbe().add(5);
        getFixture().setSuccesses(2);
        getFixture().setNetHits(0);
        assertEquals(SuccesTestState.SUCCES, getFixture().getTestState());
        
    }

} //ProbeCommandTest
