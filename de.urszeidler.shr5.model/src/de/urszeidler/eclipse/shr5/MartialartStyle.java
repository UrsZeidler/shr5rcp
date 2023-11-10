/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Martialart Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.MartialartStyle#getTechniques <em>Techniques</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.MartialartStyle#getUsableWith <em>Usable With</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getMartialartStyle()
 * @model
 * @generated
 */
public interface MartialartStyle extends Beschreibbar, Quelle {
    /**
     * Returns the value of the '<em><b>Techniques</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.MartialartTechnique}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Techniques</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Techniques</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMartialartStyle_Techniques()
     * @model
     * @generated
     */
    EList<MartialartTechnique> getTechniques();

    /**
     * Returns the value of the '<em><b>Usable With</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Fertigkeit}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usable With</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The skills the style can be used as spec.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Usable With</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getMartialartStyle_UsableWith()
     * @model
     * @generated
     */
    EList<Fertigkeit> getUsableWith();

} // MartialartStyle
