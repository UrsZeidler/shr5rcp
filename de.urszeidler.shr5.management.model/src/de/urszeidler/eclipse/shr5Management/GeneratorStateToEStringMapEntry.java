/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator State To EString Map Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.GeneratorStateToEStringMapEntry#getKey <em>Key</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.GeneratorStateToEStringMapEntry#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getGeneratorStateToEStringMapEntry()
 * @model
 * @generated
 */
public interface GeneratorStateToEStringMapEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The literals are from the enumeration {@link de.urszeidler.eclipse.shr5Management.GeneratorState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see de.urszeidler.eclipse.shr5Management.GeneratorState
	 * @see #setKey(GeneratorState)
	 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getGeneratorStateToEStringMapEntry_Key()
	 * @model required="true"
	 * @generated
	 */
	GeneratorState getKey();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.GeneratorStateToEStringMapEntry#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see de.urszeidler.eclipse.shr5Management.GeneratorState
	 * @see #getKey()
	 * @generated
	 */
	void setKey(GeneratorState value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getGeneratorStateToEStringMapEntry_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.GeneratorStateToEStringMapEntry#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // GeneratorStateToEStringMapEntry
