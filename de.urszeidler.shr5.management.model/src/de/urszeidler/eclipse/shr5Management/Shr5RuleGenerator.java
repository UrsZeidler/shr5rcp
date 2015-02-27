/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import de.urszeidler.eclipse.shr5.SourceBook;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shr5 Rule Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The shr5 rule generator collects the main rules for all character generation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#getShr5Generator <em>Shr5 Generator</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator#getAllowedSources <em>Allowed Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5RuleGenerator()
 * @model abstract="true"
 * @generated
 */
public interface Shr5RuleGenerator extends CharacterGenerator<Shr5System> {
    /**
     * Returns the value of the '<em><b>Shr5 Generator</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shr5 Generator</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The shr5Generator connects to the system.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Shr5 Generator</em>' reference.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5RuleGenerator_Shr5Generator()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    Shr5System getShr5Generator();

    /**
     * Returns the value of the '<em><b>Allowed Sources</b></em>' reference list.
     * The list contents are of type {@link de.urszeidler.eclipse.shr5.SourceBook}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Allowed Sources</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A list of sources which are allowed when building a character.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Allowed Sources</em>' reference list.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getShr5RuleGenerator_AllowedSources()
     * @model
     * @generated
     */
    EList<SourceBook> getAllowedSources();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The basic rule indicating not all is satified.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean hasSpendAllPoints(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Not more that shr5System.numberOfMaxAttributes with a vaule higer the default max.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean hasNotMoreMaxAttributes(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No skills over the shr5System.skillMax.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean hasNoSkillsOverMax(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Not more that shr5System.numberSpecalism for one skill.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean hasNotMoreSpecalism(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No attribute over the defined species max value.
     * There could be an exception defined by a modificator with the species max attributes.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean hasNoAttributesOverSpeciesAtt(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No attribute over the defined species max value.
     * There could be an exception defined by a modificator with the species max attributes.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean hasNoConstrainVoilation(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No attribute over the defined species max value.
     * There could be an exception defined by a modificator with the species max attributes.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean hasLifestyleChoosen(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No attribute over the defined species max value.
     * There could be an exception defined by a modificator with the species max attributes.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean hasOnlyAllowedSources(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Check for the kipowers, not more as magic.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean hasKiPowerOverLimit(DiagnosticChain diagnostics, Map<Object, Object> context);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Check for change the type or the species, wich is possible.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean hasBasicViolations(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Shr5RuleGenerator
