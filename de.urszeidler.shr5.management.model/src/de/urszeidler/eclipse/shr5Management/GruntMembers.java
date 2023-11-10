/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grunt Members</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This decribes the members of a grunt group. So this defines a group of simular characters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.GruntMembers#getCount <em>Count</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.GruntMembers#getNsc <em>Nsc</em>}</li>
 * </ul>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getGruntMembers()
 * @model
 * @generated
 */
public interface GruntMembers extends EObject {
    /**
     * Returns the value of the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number of npcs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Count</em>' attribute.
     * @see #setCount(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getGruntMembers_Count()
     * @model required="true"
     * @generated
     */
    int getCount();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.GruntMembers#getCount <em>Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Count</em>' attribute.
     * @see #getCount()
     * @generated
     */
    void setCount(int value);

    /**
     * Returns the value of the '<em><b>Nsc</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nsc</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The npc of the grunt members.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Nsc</em>' reference.
     * @see #setNsc(NonPlayerCharacter)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getGruntMembers_Nsc()
     * @model required="true"
     * @generated
     */
    NonPlayerCharacter getNsc();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.GruntMembers#getNsc <em>Nsc</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nsc</em>' reference.
     * @see #getNsc()
     * @generated
     */
    void setNsc(NonPlayerCharacter value);

} // GruntMembers
