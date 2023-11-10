/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fokus Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This represent an binding to a fokus.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.FokusBinding#getFokus <em>Fokus</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.FokusBinding#isActive <em>Active</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getFokusBinding()
 * @model
 * @generated
 */
public interface FokusBinding extends EObject {
    /**
     * Returns the value of the '<em><b>Fokus</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fokus</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fokus</em>' reference.
     * @see #setFokus(Fokus)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFokusBinding_Fokus()
     * @model required="true"
     * @generated
     */
    Fokus getFokus();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.FokusBinding#getFokus <em>Fokus</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fokus</em>' reference.
     * @see #getFokus()
     * @generated
     */
    void setFokus(Fokus value);

    /**
     * Returns the value of the '<em><b>Active</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Active</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Active</em>' attribute.
     * @see #setActive(boolean)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getFokusBinding_Active()
     * @model
     * @generated
     */
    boolean isActive();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.FokusBinding#isActive <em>Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Active</em>' attribute.
     * @see #isActive()
     * @generated
     */
    void setActive(boolean value);

} // FokusBinding
