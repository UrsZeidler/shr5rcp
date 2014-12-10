/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import org.eclipse.emf.ecore.EClass;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Spezies;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free Style Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getFreestyleGenerator <em>Freestyle Generator</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getSelectedPersona <em>Selected Persona</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getSelectedSpecies <em>Selected Species</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getSelectedType <em>Selected Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getFreeStyleGenerator()
 * @model
 * @generated
 */
public interface FreeStyleGenerator extends CharacterGenerator<FreeStyle> {

	/**
     * Returns the value of the '<em><b>Freestyle Generator</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Freestyle Generator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Freestyle Generator</em>' reference.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getFreeStyleGenerator_FreestyleGenerator()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
	FreeStyle getFreestyleGenerator();

    /**
     * Returns the value of the '<em><b>Selected Persona</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selected Persona</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selected Persona</em>' reference.
     * @see #setSelectedPersona(AbstraktPersona)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getFreeStyleGenerator_SelectedPersona()
     * @model
     * @generated
     */
    AbstraktPersona getSelectedPersona();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getSelectedPersona <em>Selected Persona</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selected Persona</em>' reference.
     * @see #getSelectedPersona()
     * @generated
     */
    void setSelectedPersona(AbstraktPersona value);

    /**
     * Returns the value of the '<em><b>Selected Species</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selected Species</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selected Species</em>' reference.
     * @see #setSelectedSpecies(Spezies)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getFreeStyleGenerator_SelectedSpecies()
     * @model
     * @generated
     */
    Spezies getSelectedSpecies();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getSelectedSpecies <em>Selected Species</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selected Species</em>' reference.
     * @see #getSelectedSpecies()
     * @generated
     */
    void setSelectedSpecies(Spezies value);

    /**
     * Returns the value of the '<em><b>Selected Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selected Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selected Type</em>' reference.
     * @see #setSelectedType(EClass)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getFreeStyleGenerator_SelectedType()
     * @model
     * @generated
     */
    EClass getSelectedType();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator#getSelectedType <em>Selected Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selected Type</em>' reference.
     * @see #getSelectedType()
     * @generated
     */
    void setSelectedType(EClass value);
} // FreeStyleGenerator
