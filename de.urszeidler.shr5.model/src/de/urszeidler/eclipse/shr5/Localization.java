/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Localization#getLocal <em>Local</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Localization#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Localization#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getLocalization()
 * @model
 * @generated
 */
public interface Localization extends EObject {
    /**
     * Returns the value of the '<em><b>Local</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local</em>' attribute.
     * @see #setLocal(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getLocalization_Local()
     * @model required="true"
     * @generated
     */
    String getLocal();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Localization#getLocal <em>Local</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local</em>' attribute.
     * @see #getLocal()
     * @generated
     */
    void setLocal(String value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getLocalization_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Localization#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Page</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Page</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Page</em>' attribute.
     * @see #setPage(int)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getLocalization_Page()
     * @model
     * @generated
     */
    int getPage();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Localization#getPage <em>Page</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Page</em>' attribute.
     * @see #getPage()
     * @generated
     */
    void setPage(int value);

} // Localization
