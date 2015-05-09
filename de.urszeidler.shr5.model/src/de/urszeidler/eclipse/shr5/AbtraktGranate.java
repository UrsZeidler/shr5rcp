/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abtrakt Granate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the basic properties of a grenate, can optional hold a substance as gas genate for example.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbtraktGranate#getBlast <em>Blast</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.AbtraktGranate#getChemical <em>Chemical</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbtraktGranate()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbtraktGranate extends EObject {
    /**
     * Returns the value of the '<em><b>Blast</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Blast</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Blast</em>' attribute.
     * @see #setBlast(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbtraktGranate_Blast()
     * @model
     * @generated
     */
    String getBlast();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbtraktGranate#getBlast <em>Blast</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Blast</em>' attribute.
     * @see #getBlast()
     * @generated
     */
    void setBlast(String value);

    /**
     * Returns the value of the '<em><b>Chemical</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Chemical</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Chemical</em>' containment reference.
     * @see #setChemical(Substance)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getAbtraktGranate_Chemical()
     * @model containment="true"
     * @generated
     */
    Substance getChemical();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.AbtraktGranate#getChemical <em>Chemical</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Chemical</em>' containment reference.
     * @see #getChemical()
     * @generated
     */
    void setChemical(Substance value);

} // AbtraktGranate
