/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay;

import de.urszeidler.eclipse.shr5.runtime.AbstractExtendetDataAware;
import de.urszeidler.eclipse.shr5.runtime.ExtendetData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Extendet Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Is used to the the extendet data via command.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.SetExtendetData#getDataAware <em>Data Aware</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.SetExtendetData#getData <em>Data</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.SetExtendetData#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSetExtendetData()
 * @model
 * @generated
 */
public interface SetExtendetData extends Command {
    /**
     * Returns the value of the '<em><b>Data Aware</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The target to set the extendet data to.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Data Aware</em>' reference.
     * @see #setDataAware(AbstractExtendetDataAware)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSetExtendetData_DataAware()
     * @model required="true"
     * @generated
     */
    AbstractExtendetDataAware getDataAware();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.SetExtendetData#getDataAware <em>Data Aware</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Aware</em>' reference.
     * @see #getDataAware()
     * @generated
     */
    void setDataAware(AbstractExtendetDataAware value);

    /**
     * Returns the value of the '<em><b>Data</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data</em>' containment reference.
     * @see #setData(ExtendetData)
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSetExtendetData_Data()
     * @model containment="true" required="true"
     * @generated
     */
    ExtendetData getData();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.SetExtendetData#getData <em>Data</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data</em>' containment reference.
     * @see #getData()
     * @generated
     */
    void setData(ExtendetData value);

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
     * @see de.urszeidler.eclipse.shr5.gameplay.GameplayPackage#getSetExtendetData_Value()
     * @model
     * @generated
     */
    Object getValue();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.gameplay.SetExtendetData#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(Object value);

} // SetExtendetData
