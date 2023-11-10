/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Repesents a table from ranged entries, the entries must extend the RangeTabelEntry contract.
 * One entrie may be effective for a defined value.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.RangeTable#getRangeTableEntries <em>Range Table Entries</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getRangeTable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RangeTable<E extends RangeTableEntry> extends EObject {
    /**
     * Returns the value of the '<em><b>Range Table Entries</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Range Table Entries</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Range Table Entries</em>' containment reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getRangeTable_RangeTableEntries()
     * @model containment="true"
     * @generated
     */
    EList<E> getRangeTableEntries();

} // RangeTable
