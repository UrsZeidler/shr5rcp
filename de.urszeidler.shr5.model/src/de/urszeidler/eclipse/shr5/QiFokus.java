/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qi Fokus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.QiFokus#getPower <em>Power</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getQiFokus()
 * @model
 * @generated
 */
public interface QiFokus extends AbstraktFokus {

    /**
     * Returns the value of the '<em><b>Power</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power</em>' containment reference.
     * @see #setPower(KiKraft)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getQiFokus_Power()
     * @model containment="true" required="true"
     * @generated
     */
    KiKraft getPower();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.QiFokus#getPower <em>Power</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power</em>' containment reference.
     * @see #getPower()
     * @generated
     */
    void setPower(KiKraft value);
} // QiFokus
