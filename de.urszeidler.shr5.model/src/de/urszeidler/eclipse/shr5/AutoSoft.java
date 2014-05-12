/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Soft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the software for drones.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.AutoSoft#getRating <em>Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAutoSoft()
 * @model
 * @generated
 */
public interface AutoSoft extends Software {

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
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAutoSoft_Rating()
     * @model required="true"
     * @generated
     */
    int getRating();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AutoSoft#getRating <em>Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rating</em>' attribute.
     * @see #getRating()
     * @generated
     */
    void setRating(int value);
} // AutoSoft
