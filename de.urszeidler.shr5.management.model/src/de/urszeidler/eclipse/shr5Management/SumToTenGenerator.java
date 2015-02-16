/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum To Ten Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getSumToTenGenerator()
 * @model
 * @generated
 */
public interface SumToTenGenerator extends Shr5Generator {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Check if the categies are correct.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean hasSumToTen(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SumToTenGenerator
