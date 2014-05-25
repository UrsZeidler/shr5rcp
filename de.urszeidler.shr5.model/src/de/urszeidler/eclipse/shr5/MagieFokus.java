/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Magie Fokus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.MagieFokus#getBindungsFaktor <em>Bindungs Faktor</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getMagieFokus()
 * @model
 * @generated
 */
public interface MagieFokus extends AbstraktFokus {

    /**
     * Returns the value of the '<em><b>Bindungs Faktor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bindungs Faktor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bindungs Faktor</em>' attribute.
     * @see #setBindungsFaktor(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMagieFokus_BindungsFaktor()
     * @model required="true"
     * @generated
     */
    int getBindungsFaktor();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.MagieFokus#getBindungsFaktor <em>Bindungs Faktor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bindungs Faktor</em>' attribute.
     * @see #getBindungsFaktor()
     * @generated
     */
    void setBindungsFaktor(int value);
} // MagieFokus
