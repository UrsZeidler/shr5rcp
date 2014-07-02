/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toxin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Toxin#getPower <em>Power</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Toxin#getPenetration <em>Penetration</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Toxin#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getToxin()
 * @model
 * @generated
 */
public interface Toxin extends Substance {
    /**
     * Returns the value of the '<em><b>Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power</em>' attribute.
     * @see #setPower(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getToxin_Power()
     * @model
     * @generated
     */
    int getPower();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Toxin#getPower <em>Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power</em>' attribute.
     * @see #getPower()
     * @generated
     */
    void setPower(int value);

    /**
     * Returns the value of the '<em><b>Penetration</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Penetration</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Penetration</em>' attribute.
     * @see #setPenetration(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getToxin_Penetration()
     * @model
     * @generated
     */
    int getPenetration();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Toxin#getPenetration <em>Penetration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Penetration</em>' attribute.
     * @see #getPenetration()
     * @generated
     */
    void setPenetration(int value);

    /**
     * Returns the value of the '<em><b>Effect</b></em>' attribute list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.SubstanceEffect}.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.SubstanceEffect}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Effect</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Effect</em>' attribute list.
     * @see de.urszeidler.eclipse.shr5.SubstanceEffect
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getToxin_Effect()
     * @model
     * @generated
     */
    EList<SubstanceEffect> getEffect();

} // Toxin
