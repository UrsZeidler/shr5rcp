/**
 */
package de.urszeidler.eclipse.shr5.runtime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phyical State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.PhyicalState#getPhysicalDamage <em>Physical Damage</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.PhyicalState#getMentalDamage <em>Mental Damage</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.PhyicalState#getZustand <em>Zustand</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.PhyicalState#getOverDead <em>Over Dead</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getPhyicalState()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PhyicalState extends EObject {
    /**
     * Returns the value of the '<em><b>Physical Damage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Physical Damage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Physical Damage</em>' attribute.
     * @see #setPhysicalDamage(int)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getPhyicalState_PhysicalDamage()
     * @model
     * @generated
     */
    int getPhysicalDamage();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.PhyicalState#getPhysicalDamage <em>Physical Damage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Physical Damage</em>' attribute.
     * @see #getPhysicalDamage()
     * @generated
     */
    void setPhysicalDamage(int value);

    /**
     * Returns the value of the '<em><b>Mental Damage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mental Damage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mental Damage</em>' attribute.
     * @see #setMentalDamage(int)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getPhyicalState_MentalDamage()
     * @model
     * @generated
     */
    int getMentalDamage();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.PhyicalState#getMentalDamage <em>Mental Damage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mental Damage</em>' attribute.
     * @see #getMentalDamage()
     * @generated
     */
    void setMentalDamage(int value);

    /**
     * Returns the value of the '<em><b>Zustand</b></em>' attribute.
     * The default value is <code>"ok"</code>.
     * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5.runtime.Zustand}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Zustand</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The character state, can be ok, dying ... stunned.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Zustand</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.runtime.Zustand
     * @see #setZustand(Zustand)
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getPhyicalState_Zustand()
     * @model default="ok"
     * @generated
     */
    Zustand getZustand();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.runtime.PhyicalState#getZustand <em>Zustand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Zustand</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.runtime.Zustand
     * @see #getZustand()
     * @generated
     */
    void setZustand(Zustand value);

    /**
     * Returns the value of the '<em><b>Over Dead</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Over Dead</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Over Dead</em>' attribute.
     * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage#getPhyicalState_OverDead()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    int getOverDead();

} // PhyicalState
