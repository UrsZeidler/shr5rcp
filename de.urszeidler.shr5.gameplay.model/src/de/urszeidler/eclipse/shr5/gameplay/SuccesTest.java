/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Succes Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTest#getThresholds <em>Thresholds</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTest#getNetHits <em>Net Hits</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSuccesTest()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SuccesTest extends Probe {
    /**
     * Returns the value of the '<em><b>Thresholds</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Thresholds</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Thresholds</em>' attribute.
     * @see #setThresholds(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSuccesTest_Thresholds()
     * @model
     * @generated
     */
    int getThresholds();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTest#getThresholds <em>Thresholds</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thresholds</em>' attribute.
     * @see #getThresholds()
     * @generated
     */
    void setThresholds(int value);

    /**
     * Returns the value of the '<em><b>Net Hits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Net Hits</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Net Hits</em>' attribute.
     * @see #setNetHits(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSuccesTest_NetHits()
     * @model
     * @generated
     */
    int getNetHits();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.SuccesTest#getNetHits <em>Net Hits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Net Hits</em>' attribute.
     * @see #getNetHits()
     * @generated
     */
    void setNetHits(int value);

} // SuccesTest
