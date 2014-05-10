/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Program#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getProgram()
 * @model
 * @generated
 */
public interface Program extends GeldWert, Beschreibbar, Quelle {
    /**
     * Returns the value of the '<em><b>Category</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category</em>' attribute.
     * @see #setCategory(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getProgram_Category()
     * @model required="true"
     * @generated
     */
    String getCategory();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Program#getCategory <em>Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Category</em>' attribute.
     * @see #getCategory()
     * @generated
     */
    void setCategory(String value);

} // Program
