/**
 */
package de.urszeidler.eclipse.shr5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quelle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Quelle#getPage <em>Page</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Quelle#getSrcBook <em>Src Book</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getQuelle()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Quelle extends EObject {
	/**
	 * Returns the value of the '<em><b>Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' attribute.
	 * @see #setPage(String)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getQuelle_Page()
	 * @model
	 * @generated
	 */
	String getPage();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Quelle#getPage <em>Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' attribute.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(String value);

	/**
	 * Returns the value of the '<em><b>Src Book</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Book</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Book</em>' reference.
	 * @see #setSrcBook(SourceBook)
	 * @see de.urszeidler.eclipse.shr5.Shr5Package#getQuelle_SrcBook()
	 * @model
	 * @generated
	 */
	SourceBook getSrcBook();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Quelle#getSrcBook <em>Src Book</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Book</em>' reference.
	 * @see #getSrcBook()
	 * @generated
	 */
	void setSrcBook(SourceBook value);

} // Quelle
