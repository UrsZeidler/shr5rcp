/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kleindungs Modifikator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.KleindungsModifikator#getRating <em>Rating</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.KleindungsModifikator#getType <em>Type</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.KleindungsModifikator#getCapacity <em>Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getKleindungsModifikator()
 * @model
 * @generated
 */
public interface KleindungsModifikator extends Beschreibbar, Quelle, GeldWert {
    /**
     * Returns the value of the '<em><b>Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rating</em>' attribute.
     * @see #setRating(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getKleindungsModifikator_Rating()
     * @model
     * @generated
     */
    int getRating();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.KleindungsModifikator#getRating <em>Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rating</em>' attribute.
     * @see #getRating()
     * @generated
     */
    void setRating(int value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.armorModificationType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.armorModificationType
     * @see #setType(armorModificationType)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getKleindungsModifikator_Type()
     * @model
     * @generated
     */
    armorModificationType getType();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.KleindungsModifikator#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.armorModificationType
     * @see #getType()
     * @generated
     */
    void setType(armorModificationType value);

    /**
     * Returns the value of the '<em><b>Capacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capacity</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getKleindungsModifikator_Capacity()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getCapacity();

} // KleindungsModifikator
