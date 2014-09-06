/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Magazin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the bullet container (clip) for a fw.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Magazin#getType <em>Type</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Magazin#getBullets <em>Bullets</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getMagazin()
 * @model
 * @generated
 */
public interface Magazin extends AbstraktGegenstand {
    /**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The type defines which weapon this magazin can be used with.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(Feuerwaffe)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMagazin_Type()
     * @model required="true"
     * @generated
     */
    Feuerwaffe getType();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Magazin#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
    void setType(Feuerwaffe value);

    /**
     * Returns the value of the '<em><b>Bullets</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Munition}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This reference holds the current loaded amuntition, when used the first element should be removed.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bullets</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMagazin_Bullets()
     * @model
     * @generated
     */
    EList<Munition> getBullets();

} // Magazin
