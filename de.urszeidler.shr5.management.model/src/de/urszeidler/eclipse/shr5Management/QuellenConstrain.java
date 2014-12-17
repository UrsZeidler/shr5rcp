/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.urszeidler.eclipse.shr5.Quelle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quellen Constrain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a constrain for the source element by holding a list of other elements and an constrain type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.QuellenConstrain#getSource <em>Source</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.QuellenConstrain#getTargets <em>Targets</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.QuellenConstrain#getConstrainType <em>Constrain Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getQuellenConstrain()
 * @model
 * @generated
 */
public interface QuellenConstrain extends EObject {
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The source object for this constraint.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(Quelle)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getQuellenConstrain_Source()
     * @model required="true"
     * @generated
     */
    Quelle getSource();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.QuellenConstrain#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(Quelle value);

    /**
     * Returns the value of the '<em><b>Targets</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Quelle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Targets</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A list of objects applying the constrain.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Targets</em>' reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getQuellenConstrain_Targets()
     * @model
     * @generated
     */
    EList<Quelle> getTargets();

    /**
     * Returns the value of the '<em><b>Constrain Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5Management.QuellenConstrainType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constrain Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The kind of constrain, like not Together ...
     * <!-- end-model-doc -->
     * @return the value of the '<em>Constrain Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.QuellenConstrainType
     * @see #setConstrainType(QuellenConstrainType)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getQuellenConstrain_ConstrainType()
     * @model
     * @generated
     */
    QuellenConstrainType getConstrainType();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.QuellenConstrain#getConstrainType <em>Constrain Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Constrain Type</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.QuellenConstrainType
     * @see #getConstrainType()
     * @generated
     */
    void setConstrainType(QuellenConstrainType value);

} // QuellenConstrain
