/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay;

import de.urszeidler.eclipse.shr5.runtime.ExtendetData;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probe Mod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a single probe modificator.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.ProbeMod#getValue <em>Value</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.ProbeMod#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getProbeMod()
 * @model
 * @generated
 */
public interface ProbeMod extends EObject {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(int)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getProbeMod_Value()
     * @model
     * @generated
     */
    int getValue();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.ProbeMod#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(int value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines the type of te modificator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(ExtendetData)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getProbeMod_Type()
     * @model containment="true" required="true"
     * @generated
     */
    ExtendetData getType();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.ProbeMod#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(ExtendetData value);

} // ProbeMod
