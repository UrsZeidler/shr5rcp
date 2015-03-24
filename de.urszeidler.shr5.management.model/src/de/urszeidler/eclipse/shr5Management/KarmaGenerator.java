/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Karma Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The karma generator supports only two choises, one for the meta type and another for the persona type. All other changes are direcly handled throu karama.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#getMetaType <em>Meta Type</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#getCharacterConcept <em>Character Concept</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#getKarmaToResource <em>Karma To Resource</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#getKarmaSpend <em>Karma Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#getResourceSpend <em>Resource Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#getStartKarma <em>Start Karma</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#getStartResources <em>Start Resources</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#getChoiseKarmaCost <em>Choise Karma Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getKarmaGenerator()
 * @model abstract="true"
 * @generated
 */
public interface KarmaGenerator<G extends Shr5System> extends Shr5RuleGenerator<G> {

    /**
     * Returns the value of the '<em><b>Meta Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The selected species.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Meta Type</em>' reference.
     * @see #setMetaType(MetaType)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getKarmaGenerator_MetaType()
     * @model required="true"
     * @generated
     */
    MetaType getMetaType();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#getMetaType <em>Meta Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Meta Type</em>' reference.
     * @see #getMetaType()
     * @generated
     */
    void setMetaType(MetaType value);

    /**
     * Returns the value of the '<em><b>Character Concept</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The character concept.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Character Concept</em>' reference.
     * @see #setCharacterConcept(SpecialType)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getKarmaGenerator_CharacterConcept()
     * @model required="true"
     * @generated
     */
    SpecialType getCharacterConcept();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#getCharacterConcept <em>Character Concept</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Character Concept</em>' reference.
     * @see #getCharacterConcept()
     * @generated
     */
    void setCharacterConcept(SpecialType value);

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
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getKarmaGenerator_KarmaToResource()
     * @model
     * @generated
     */
    int getKarmaToResource();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#getKarmaToResource <em>Karma To Resource</em>}' attribute.
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
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getKarmaGenerator_KarmaSpend()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getKarmaSpend();

    /**
     * Returns the value of the '<em><b>Resource Spend</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource Spend</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Spend</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getKarmaGenerator_ResourceSpend()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getResourceSpend();

    /**
     * Returns the value of the '<em><b>Start Karma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Karma</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Karma</em>' attribute.
     * @see #setStartKarma(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getKarmaGenerator_StartKarma()
     * @model
     * @generated
     */
    int getStartKarma();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#getStartKarma <em>Start Karma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Karma</em>' attribute.
     * @see #getStartKarma()
     * @generated
     */
    void setStartKarma(int value);

    /**
     * Returns the value of the '<em><b>Start Resources</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Resources</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Resources</em>' attribute.
     * @see #setStartResources(int)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getKarmaGenerator_StartResources()
     * @model
     * @generated
     */
    int getStartResources();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.KarmaGenerator#getStartResources <em>Start Resources</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Resources</em>' attribute.
     * @see #getStartResources()
     * @generated
     */
    void setStartResources(int value);

    /**
     * Returns the value of the '<em><b>Choise Karma Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Choise Karma Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Choise Karma Cost</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getKarmaGenerator_ChoiseKarmaCost()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getChoiseKarmaCost();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Checks if all karma points are spended.
     * <!-- end-model-doc -->
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
    boolean hasSpendAllResources(DiagnosticChain diagnostics, Map<Object, Object> context);
} // KarmaGenerator
