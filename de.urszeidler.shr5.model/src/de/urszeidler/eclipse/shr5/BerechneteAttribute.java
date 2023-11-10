/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Berechnete Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains the calculatetd derived attributes like composure. Attribute only testst for example.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.BerechneteAttribute#getErrinerungsvermoegen <em>Errinerungsvermoegen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.BerechneteAttribute#getMenschenkenntnis <em>Menschenkenntnis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.BerechneteAttribute#getSelbstbeherrschung <em>Selbstbeherrschung</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getBerechneteAttribute()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BerechneteAttribute extends EObject {
    /**
     * Returns the value of the '<em><b>Errinerungsvermoegen</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The memory.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Errinerungsvermoegen</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getBerechneteAttribute_Errinerungsvermoegen()
     * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getErrinerungsvermoegen();

    /**
     * Returns the value of the '<em><b>Menschenkenntnis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Judge Intentions.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Menschenkenntnis</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getBerechneteAttribute_Menschenkenntnis()
     * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getMenschenkenntnis();

    /**
     * Returns the value of the '<em><b>Selbstbeherrschung</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Composure.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Selbstbeherrschung</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getBerechneteAttribute_Selbstbeherrschung()
     * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getSelbstbeherrschung();

} // BerechneteAttribute
