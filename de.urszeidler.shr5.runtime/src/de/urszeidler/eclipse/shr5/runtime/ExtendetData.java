/**
 */
package de.urszeidler.eclipse.shr5.runtime;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extendet Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Is the key of the extendetData Map.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.ExtendetData#getEObject <em>EObject</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.ExtendetData#getEFeature <em>EFeature</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getExtendetData()
 * @model
 * @generated
 */
public interface ExtendetData extends EObject {
    /**
     * Returns the value of the '<em><b>EObject</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EObject</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EObject</em>' reference.
     * @see #setEObject(EObject)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getExtendetData_EObject()
     * @model
     * @generated
     */
    EObject getEObject();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetData#getEObject <em>EObject</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EObject</em>' reference.
     * @see #getEObject()
     * @generated
     */
    void setEObject(EObject value);

    /**
     * Returns the value of the '<em><b>EFeature</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EFeature</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EFeature</em>' reference.
     * @see #setEFeature(EStructuralFeature)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getExtendetData_EFeature()
     * @model required="true"
     * @generated
     */
    EStructuralFeature getEFeature();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetData#getEFeature <em>EFeature</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EFeature</em>' reference.
     * @see #getEFeature()
     * @generated
     */
    void setEFeature(EStructuralFeature value);

} // ExtendetData
