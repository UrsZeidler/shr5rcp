/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The basic probe.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getProbe <em>Probe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getSuccesses <em>Successes</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getGlitches <em>Glitches</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getLimit <em>Limit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getProbeState <em>Probe State</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getProbeMods <em>Probe Mods</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Probe#isSkipTest <em>Skip Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getProbe()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Probe extends EObject {
    /**
     * Returns the value of the '<em><b>Probe</b></em>' attribute list.
     * The list contents are of type {@link java.lang.Integer}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Probe</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * THe dice thrown.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Probe</em>' attribute list.
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getProbe_Probe()
     * @model unique="false" changeable="false"
     * @generated
     */
    EList<Integer> getProbe();

    /**
     * Returns the value of the '<em><b>Successes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Successes</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The successes.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Successes</em>' attribute.
     * @see #setSuccesses(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getProbe_Successes()
     * @model unique="false" required="true"
     * @generated
     */
    int getSuccesses();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getSuccesses <em>Successes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Successes</em>' attribute.
     * @see #getSuccesses()
     * @generated
     */
    void setSuccesses(int value);

    /**
     * Returns the value of the '<em><b>Glitches</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Glitches</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Glitches</em>' attribute.
     * @see #setGlitches(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getProbe_Glitches()
     * @model required="true"
     * @generated
     */
    int getGlitches();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getGlitches <em>Glitches</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Glitches</em>' attribute.
     * @see #getGlitches()
     * @generated
     */
    void setGlitches(int value);

    /**
     * Returns the value of the '<em><b>Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The maximum hits counting for the probe.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Limit</em>' attribute.
     * @see #isSetLimit()
     * @see #unsetLimit()
     * @see #setLimit(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getProbe_Limit()
     * @model unsettable="true"
     * @generated
     */
    int getLimit();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getLimit <em>Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Limit</em>' attribute.
     * @see #isSetLimit()
     * @see #unsetLimit()
     * @see #getLimit()
     * @generated
     */
    void setLimit(int value);

    /**
     * Unsets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getLimit <em>Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLimit()
     * @see #getLimit()
     * @see #setLimit(int)
     * @generated
     */
    void unsetLimit();

    /**
     * Returns whether the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getLimit <em>Limit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Limit</em>' attribute is set.
     * @see #unsetLimit()
     * @see #getLimit()
     * @see #setLimit(int)
     * @generated
     */
    boolean isSetLimit();

    /**
     * Returns the value of the '<em><b>Probe State</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.gameplay.ProbeState}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Probe State</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Probe State</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.gameplay.ProbeState
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getProbe_ProbeState()
     * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    ProbeState getProbeState();

    /**
     * Returns the value of the '<em><b>Probe Mods</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.gameplay.ProbeMod}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Collects the probe modifactions.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Probe Mods</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getProbe_ProbeMods()
     * @model containment="true"
     * @generated
     */
    EList<ProbeMod> getProbeMods();

    /**
     * Returns the value of the '<em><b>Skip Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Skips the probe and uses the vaules raw.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Skip Test</em>' attribute.
     * @see #setSkipTest(boolean)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getProbe_SkipTest()
     * @model required="true"
     * @generated
     */
    boolean isSkipTest();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.Probe#isSkipTest <em>Skip Test</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skip Test</em>' attribute.
     * @see #isSkipTest()
     * @generated
     */
    void setSkipTest(boolean value);

} // Probe
