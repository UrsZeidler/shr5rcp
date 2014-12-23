/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capacity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This interfaces defines a simple capacity contract which bounds the capacty of a given refenrence to an interger feature.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#getCapacityFeature <em>Capacity Feature</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Capacity#getCapacity <em>Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getCapacity()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Capacity extends EObject {
    /**
     * Returns the value of the '<em><b>Capacity Feature</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The reference which is limited by this capacity description.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Capacity Feature</em>' reference.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCapacity_CapacityFeature()
     * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    EReference getCapacityFeature();

    /**
     * Returns the value of the '<em><b>Capacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The capacity value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Capacity</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getCapacity_Capacity()
     * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getCapacity();

} // Capacity
