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
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getAttributeSpend <em>Attribute Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getResourceSpend <em>Resource Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getConnectionSpend <em>Connection Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSkillPointSpend <em>Skill Point Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpecialPointSpend <em>Special Point Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getGroupPointSpend <em>Group Point Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getKnownlegePointSpend <em>Knownlege Point Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getSpellPointSpend <em>Spell Point Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getStartKarma <em>Start Karma</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5Generator#getStartResources <em>Start Resources</em>}</li>
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
     * Returns the value of the '<em><b>Attribute Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute Spend</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute Spend</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_AttributeSpend()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getAttributeSpend();

    /**
     * Returns the value of the '<em><b>Resource Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Spend</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Spend</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_ResourceSpend()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getResourceSpend();

    /**
     * Returns the value of the '<em><b>Connection Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Spend</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Spend</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_ConnectionSpend()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getConnectionSpend();

    /**
     * Returns the value of the '<em><b>Skill Point Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Skill Point Spend</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Skill Point Spend</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_SkillPointSpend()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getSkillPointSpend();

    /**
     * Returns the value of the '<em><b>Special Point Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Special Point Spend</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Special Point Spend</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_SpecialPointSpend()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getSpecialPointSpend();

    /**
     * Returns the value of the '<em><b>Group Point Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group Point Spend</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group Point Spend</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_GroupPointSpend()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getGroupPointSpend();

    /**
     * Returns the value of the '<em><b>Knownlege Point Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Knownlege Point Spend</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Knownlege Point Spend</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_KnownlegePointSpend()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getKnownlegePointSpend();

    /**
     * Returns the value of the '<em><b>Spell Point Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Spell Point Spend</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Spell Point Spend</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_SpellPointSpend()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getSpellPointSpend();

    /**
     * Returns the value of the '<em><b>Start Karma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Karma</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Karma</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_StartKarma()
     * @model changeable="false"
     * @generated
     */
    int getStartKarma();

    /**
     * Returns the value of the '<em><b>Start Resources</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Resources</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Resources</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5Generator_StartResources()
     * @model changeable="false"
     * @generated
     */
    int getStartResources();

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
	boolean hasSpendAllPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean hasSpendAllAttributesPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean hasSpendAllSkillPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	boolean hasSpendAllSpecialPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	boolean hasSpendAllSpecialTypePoints(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	boolean hasSpendAllConnectionPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean hasSpendAllResourcePoints(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean hasSpendAllMagicSkillsPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean hasSpendAllMagicPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean hasSpendAllGroupPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean hasSpendAllKnowlegeSkillPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean hasSpendAllKarmaPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean hasSpendAllSpellPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    boolean hasSpendAllPowerPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Shr5Generator
