/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gebundener Geist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.GebundenerGeist#getDienste <em>Dienste</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.GebundenerGeist#getGeist <em>Geist</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getGebundenerGeist()
 * @model
 * @generated
 */
public interface GebundenerGeist extends EObject {
    /**
     * Returns the value of the '<em><b>Dienste</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dienste</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dienste</em>' attribute.
     * @see #setDienste(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGebundenerGeist_Dienste()
     * @model
     * @generated
     */
    int getDienste();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.GebundenerGeist#getDienste <em>Dienste</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dienste</em>' attribute.
     * @see #getDienste()
     * @generated
     */
    void setDienste(int value);

    /**
     * Returns the value of the '<em><b>Geist</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Geist</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Geist</em>' reference.
     * @see #setGeist(Geist)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getGebundenerGeist_Geist()
     * @model required="true"
     * @generated
     */
    Geist getGeist();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.GebundenerGeist#getGeist <em>Geist</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Geist</em>' reference.
     * @see #getGeist()
     * @generated
     */
    void setGeist(Geist value);

} // GebundenerGeist
