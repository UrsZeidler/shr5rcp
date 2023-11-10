/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Table Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an entrie in a ranged table. A ranged is based on an value
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.RangeTableEntry#getFrom <em>From</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.RangeTableEntry#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getRangeTableEntry()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RangeTableEntry extends EObject {
    /**
     * Returns the value of the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' attribute.
     * @see #setFrom(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getRangeTableEntry_From()
     * @model
     * @generated
     */
    int getFrom();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.RangeTableEntry#getFrom <em>From</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' attribute.
     * @see #getFrom()
     * @generated
     */
    void setFrom(int value);

    /**
     * Returns the value of the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To</em>' attribute.
     * @see #setTo(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getRangeTableEntry_To()
     * @model
     * @generated
     */
    int getTo();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.RangeTableEntry#getTo <em>To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To</em>' attribute.
     * @see #getTo()
     * @generated
     */
    void setTo(int value);

} // RangeTableEntry
