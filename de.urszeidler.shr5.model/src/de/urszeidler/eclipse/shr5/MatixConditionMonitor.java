/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matix Condition Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.MatixConditionMonitor#getMatrixZustandMax <em>Matrix Zustand Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getMatixConditionMonitor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MatixConditionMonitor extends EObject {

    /**
     * Returns the value of the '<em><b>Matrix Zustand Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Matrix Zustand Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Matrix Zustand Max</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMatixConditionMonitor_MatrixZustandMax()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getMatrixZustandMax();
} // MatixConditionMonitor
