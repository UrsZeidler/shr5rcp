/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import de.urszeidler.eclipse.shr5.Lifestyle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifestyle To Start Money</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney#getNumberOfW <em>Number Of W</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney#getMoneyFactor <em>Money Factor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney#getLifeStyles <em>Life Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifestyleToStartMoney()
 * @model
 * @generated
 */
public interface LifestyleToStartMoney extends EObject {
    /**
     * Returns the value of the '<em><b>Number Of W</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Number Of W</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Number Of W</em>' attribute.
     * @see #setNumberOfW(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifestyleToStartMoney_NumberOfW()
     * @model
     * @generated
     */
    int getNumberOfW();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney#getNumberOfW <em>Number Of W</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Number Of W</em>' attribute.
     * @see #getNumberOfW()
     * @generated
     */
    void setNumberOfW(int value);

    /**
     * Returns the value of the '<em><b>Money Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Money Factor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Money Factor</em>' attribute.
     * @see #setMoneyFactor(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifestyleToStartMoney_MoneyFactor()
     * @model
     * @generated
     */
    int getMoneyFactor();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney#getMoneyFactor <em>Money Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Money Factor</em>' attribute.
     * @see #getMoneyFactor()
     * @generated
     */
    void setMoneyFactor(int value);

    /**
     * Returns the value of the '<em><b>Life Styles</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.Lifestyle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Life Styles</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Life Styles</em>' reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getLifestyleToStartMoney_LifeStyles()
     * @model
     * @generated
     */
    EList<Lifestyle> getLifeStyles();

} // LifestyleToStartMoney
