/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.ecore.EAttribute;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This change defines an attribute change.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.AttributeChange#getAttibute <em>Attibute</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getAttributeChange()
 * @model
 * @generated
 */
public interface AttributeChange extends PersonaValueChange {

    /**
     * Returns the value of the '<em><b>Attibute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attibute</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attibute</em>' reference.
     * @see #setAttibute(EAttribute)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getAttributeChange_Attibute()
     * @model
     * @generated
     */
    EAttribute getAttibute();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.AttributeChange#getAttibute <em>Attibute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attibute</em>' reference.
     * @see #getAttibute()
     * @generated
     */
    void setAttibute(EAttribute value);
} // AttributeChange
