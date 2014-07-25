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
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getProbe <em>Probe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getSuccesses <em>Successes</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getGlitches <em>Glitches</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.Probe#getLimit <em>Limit</em>}</li>
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
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getProbe_Glitches()
     * @model required="true" changeable="false"
     * @generated
     */
    int getGlitches();

    /**
     * Returns the value of the '<em><b>Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
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

} // Probe
