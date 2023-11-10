/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Sin#getLicences <em>Licences</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getSin()
 * @model
 * @generated
 */
public interface Sin extends Fakeable {

    /**
     * Returns the value of the '<em><b>Licences</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Lizenz}.
     * It is bidirectional and its opposite is '{@link de.urszeidler.eclipse.shr5.Lizenz#getLizenzTraeger <em>Lizenz Traeger</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Licences</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Licences</em>' reference list.
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getSin_Licences()
     * @see de.urszeidler.eclipse.shr5.Lizenz#getLizenzTraeger
     * @model opposite="lizenzTraeger"
     * @generated
     */
    EList<Lizenz> getLicences();
} // Sin
