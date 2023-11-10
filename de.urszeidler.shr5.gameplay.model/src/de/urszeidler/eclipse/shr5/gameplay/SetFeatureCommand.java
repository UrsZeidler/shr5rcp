/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Feature Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The the value to the ebject in the feature.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand#getValue <em>Value</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand#getObject <em>Object</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSetFeatureCommand()
 * @model
 * @generated
 */
public interface SetFeatureCommand extends Command {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(Object)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSetFeatureCommand_Value()
     * @model
     * @generated
     */
    Object getValue();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(Object value);

    /**
     * Returns the value of the '<em><b>Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object</em>' reference.
     * @see #setObject(EObject)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSetFeatureCommand_Object()
     * @model
     * @generated
     */
    EObject getObject();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand#getObject <em>Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object</em>' reference.
     * @see #getObject()
     * @generated
     */
    void setObject(EObject value);

    /**
     * Returns the value of the '<em><b>Feature</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feature</em>' reference.
     * @see #setFeature(EStructuralFeature)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSetFeatureCommand_Feature()
     * @model
     * @generated
     */
    EStructuralFeature getFeature();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand#getFeature <em>Feature</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Feature</em>' reference.
     * @see #getFeature()
     * @generated
     */
    void setFeature(EStructuralFeature value);

} // SetFeatureCommand
