/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Priority Categorie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the basic categories. They can be used to define a priotity or a cost for an option.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.PriorityCategorie#getCategorieName <em>Categorie Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.PriorityCategorie#getCost <em>Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPriorityCategorie()
 * @model abstract="true"
 * @generated
 */
public interface PriorityCategorie extends EObject {
	/**
     * Returns the value of the '<em><b>Categorie Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Categorie Name</em>' attribute.
     * @see #setCategorieName(String)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPriorityCategorie_CategorieName()
     * @model
     * @generated
     */
	String getCategorieName();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.PriorityCategorie#getCategorieName <em>Categorie Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Categorie Name</em>' attribute.
     * @see #getCategorieName()
     * @generated
     */
	void setCategorieName(String value);

    /**
     * Returns the value of the '<em><b>Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cost</em>' attribute.
     * @see #setCost(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getPriorityCategorie_Cost()
     * @model
     * @generated
     */
    int getCost();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.PriorityCategorie#getCost <em>Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cost</em>' attribute.
     * @see #getCost()
     * @generated
     */
    void setCost(int value);

} // PriorityCategorie
