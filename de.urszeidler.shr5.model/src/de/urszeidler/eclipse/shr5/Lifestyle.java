/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifestyle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Lifestyle#getOptions <em>Options</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Lifestyle#isOwned <em>Owned</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getLifestyle()
 * @model
 * @generated
 */
public interface Lifestyle extends IntervallVertrag {

    /**
     * Returns the value of the '<em><b>Options</b></em>' containment reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.LifestyleOption}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Options</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getLifestyle_Options()
     * @model containment="true"
     * @generated
     */
    EList<LifestyleOption> getOptions();

    /**
     * Returns the value of the '<em><b>Owned</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned</em>' attribute.
     * @see #setOwned(boolean)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getLifestyle_Owned()
     * @model
     * @generated
     */
    boolean isOwned();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Lifestyle#isOwned <em>Owned</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owned</em>' attribute.
     * @see #isOwned()
     * @generated
     */
    void setOwned(boolean value);
} // Lifestyle
