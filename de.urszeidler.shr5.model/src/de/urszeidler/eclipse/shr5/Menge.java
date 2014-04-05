/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This interface is used to define items coming in great numbers like amunition and others.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Menge#getAnzahl <em>Anzahl</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Menge#getProAnzahl <em>Pro Anzahl</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getMenge()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Menge extends EObject {
    /**
     * Returns the value of the '<em><b>Anzahl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The current count of items.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Anzahl</em>' attribute.
     * @see #setAnzahl(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMenge_Anzahl()
     * @model
     * @generated
     */
    int getAnzahl();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Menge#getAnzahl <em>Anzahl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Anzahl</em>' attribute.
     * @see #getAnzahl()
     * @generated
     */
    void setAnzahl(int value);

    /**
     * Returns the value of the '<em><b>Pro Anzahl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines the number of items for the cost, if the element is a GeldWert.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pro Anzahl</em>' attribute.
     * @see #setProAnzahl(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMenge_ProAnzahl()
     * @model
     * @generated
     */
    int getProAnzahl();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Menge#getProAnzahl <em>Pro Anzahl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pro Anzahl</em>' attribute.
     * @see #getProAnzahl()
     * @generated
     */
    void setProAnzahl(int value);

} // Menge
