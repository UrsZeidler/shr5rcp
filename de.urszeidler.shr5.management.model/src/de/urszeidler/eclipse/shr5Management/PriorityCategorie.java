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
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.PriorityCategorie#getCategorieName <em>Categorie Name</em>}</li>
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
	 * @model required="true"
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

} // PriorityCategorie
