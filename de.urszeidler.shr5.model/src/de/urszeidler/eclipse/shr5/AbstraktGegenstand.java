/**
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstrakt Gegenstand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The basic item class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbstraktGegenstand#getWifi <em>Wifi</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstraktGegenstand()
 * @model abstract="true"
 * @generated
 */
public interface AbstraktGegenstand extends Quelle, GeldWert, Beschreibbar, Modifizierbar, Anwendbar {

    /**
     * Returns the value of the '<em><b>Wifi</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The optional wifi component of the item.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wifi</em>' containment reference.
     * @see #setWifi(MatrixDevice)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbstraktGegenstand_Wifi()
     * @model containment="true"
     * @generated
     */
    MatrixDevice getWifi();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbstraktGegenstand#getWifi <em>Wifi</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wifi</em>' containment reference.
     * @see #getWifi()
     * @generated
     */
    void setWifi(MatrixDevice value);
} // AbstraktGegenstand
