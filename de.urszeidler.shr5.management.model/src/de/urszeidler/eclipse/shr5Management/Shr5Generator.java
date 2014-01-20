/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shr5 Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getResourcen <em>Resourcen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSkills <em>Skills</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getMetaType <em>Meta Type</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getMagic <em>Magic</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getKarmaToResource <em>Karma To Resource</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getKarmaSpend <em>Karma Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getShr5Generator <em>Shr5 Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator()
 * @model
 * @generated
 */
public interface Shr5Generator extends CharacterGenerator {
	/**
     * Returns the value of the '<em><b>Resourcen</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resourcen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Resourcen</em>' reference.
     * @see #setResourcen(Resourcen)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_Resourcen()
     * @model required="true"
     * @generated
     */
	Resourcen getResourcen();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getResourcen <em>Resourcen</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resourcen</em>' reference.
     * @see #getResourcen()
     * @generated
     */
	void setResourcen(Resourcen value);

	/**
     * Returns the value of the '<em><b>Skills</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Skills</em>' reference.
     * @see #setSkills(Skill)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_Skills()
     * @model required="true"
     * @generated
     */
	Skill getSkills();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSkills <em>Skills</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Skills</em>' reference.
     * @see #getSkills()
     * @generated
     */
	void setSkills(Skill value);

	/**
     * Returns the value of the '<em><b>Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute</em>' reference.
     * @see #setAttribute(Attributes)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_Attribute()
     * @model required="true"
     * @generated
     */
	Attributes getAttribute();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getAttribute <em>Attribute</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute</em>' reference.
     * @see #getAttribute()
     * @generated
     */
	void setAttribute(Attributes value);

	/**
     * Returns the value of the '<em><b>Meta Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Meta Type</em>' reference.
     * @see #setMetaType(MetaType)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_MetaType()
     * @model required="true"
     * @generated
     */
	MetaType getMetaType();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getMetaType <em>Meta Type</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Meta Type</em>' reference.
     * @see #getMetaType()
     * @generated
     */
	void setMetaType(MetaType value);

	/**
     * Returns the value of the '<em><b>Magic</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Magic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Magic</em>' reference.
     * @see #setMagic(SpecialType)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_Magic()
     * @model required="true"
     * @generated
     */
	SpecialType getMagic();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getMagic <em>Magic</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Magic</em>' reference.
     * @see #getMagic()
     * @generated
     */
	void setMagic(SpecialType value);

	/**
     * Returns the value of the '<em><b>Karma To Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Karma To Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Karma To Resource</em>' attribute.
     * @see #setKarmaToResource(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_KarmaToResource()
     * @model
     * @generated
     */
	int getKarmaToResource();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getKarmaToResource <em>Karma To Resource</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Karma To Resource</em>' attribute.
     * @see #getKarmaToResource()
     * @generated
     */
	void setKarmaToResource(int value);

	/**
     * Returns the value of the '<em><b>Karma Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Karma Spend</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Karma Spend</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_KarmaSpend()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
	int getKarmaSpend();

	/**
     * Returns the value of the '<em><b>Shr5 Generator</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shr5 Generator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Shr5 Generator</em>' reference.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_Shr5Generator()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
	Shr5System getShr5Generator();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	boolean hasCategoryOnlyOnce(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	boolean hasNotSpendAllPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	boolean hasNotMoreMaxAttributes(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	boolean hasNotSpendAllAttributesPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	boolean hasNotSpendSkillAllPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	boolean hasNotSpendAllSpecialPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	boolean hasNotSpendAllSpecialTypePoints(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	boolean hasNotSpendAllConnectionPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean hasNotSpendAllResourcePoints(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Shr5Generator
