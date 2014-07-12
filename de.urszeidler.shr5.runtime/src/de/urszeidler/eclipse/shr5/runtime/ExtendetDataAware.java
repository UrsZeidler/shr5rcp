/**
 */
package de.urszeidler.eclipse.shr5.runtime;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extendet Data Aware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#getExtendetData <em>Extendet Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getExtendetDataAware()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ExtendetDataAware extends EObject {
    /**
     * Returns the value of the '<em><b>Extendet Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extendet Data</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extendet Data</em>' attribute.
     * @see #setExtendetData(Map)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getExtendetDataAware_ExtendetData()
     * @model required="true" transient="true"
     * @generated
     */
    Map<ExtendetData, Object> getExtendetData();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.ExtendetDataAware#getExtendetData <em>Extendet Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extendet Data</em>' attribute.
     * @see #getExtendetData()
     * @generated
     */
    void setExtendetData(Map<ExtendetData, Object> value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * add a value to the extendet data store
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    void addToExtendetData(ExtendetData data, Object value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * return an integer value or null
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    int getIntegerValue(ExtendetData data);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void increaseValue(ExtendetData data, int value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void decreaseValue(ExtendetData data, int value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean hasValue(ExtendetData data);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void addToList(ExtendetData data, Object value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void addUniqueToList(ExtendetData data, Object value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model many="false"
     * @generated
     */
    EList<?> getListValue(ExtendetData data);

} // ExtendetDataAware
