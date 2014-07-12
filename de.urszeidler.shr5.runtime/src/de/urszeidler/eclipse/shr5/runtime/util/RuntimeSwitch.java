/**
 */
package de.urszeidler.eclipse.shr5.runtime.util;

import de.urszeidler.eclipse.shr5.Beschreibbar;

import de.urszeidler.eclipse.shr5.runtime.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage
 * @generated
 */
public class RuntimeSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static RuntimePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuntimeSwitch() {
        if (modelPackage == null) {
            modelPackage = RuntimePackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case RuntimePackage.EXTENDET_DATA: {
                ExtendetData extendetData = (ExtendetData)theEObject;
                T result = caseExtendetData(extendetData);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RuntimePackage.ENVIORMENT: {
                Enviorment enviorment = (Enviorment)theEObject;
                T result = caseEnviorment(enviorment);
                if (result == null) result = caseAbstractExtendetDataAware(enviorment);
                if (result == null) result = caseExtendetDataAware(enviorment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RuntimePackage.NAHKAMP_MODIFIKATIONEN: {
                NahkampModifikationen nahkampModifikationen = (NahkampModifikationen)theEObject;
                T result = caseNahkampModifikationen(nahkampModifikationen);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RuntimePackage.EXTENDET_DATA_AWARE: {
                ExtendetDataAware extendetDataAware = (ExtendetDataAware)theEObject;
                T result = caseExtendetDataAware(extendetDataAware);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RuntimePackage.PHYICAL_STATE: {
                PhyicalState phyicalState = (PhyicalState)theEObject;
                T result = casePhyicalState(phyicalState);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RuntimePackage.RUNTIME_CHARACTER: {
                RuntimeCharacter runtimeCharacter = (RuntimeCharacter)theEObject;
                T result = caseRuntimeCharacter(runtimeCharacter);
                if (result == null) result = caseAbstractExtendetDataAware(runtimeCharacter);
                if (result == null) result = casePhyicalState(runtimeCharacter);
                if (result == null) result = caseExtendetDataAware(runtimeCharacter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RuntimePackage.TEAM: {
                Team team = (Team)theEObject;
                T result = caseTeam(team);
                if (result == null) result = caseBeschreibbar(team);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case RuntimePackage.ABSTRACT_EXTENDET_DATA_AWARE: {
                AbstractExtendetDataAware abstractExtendetDataAware = (AbstractExtendetDataAware)theEObject;
                T result = caseAbstractExtendetDataAware(abstractExtendetDataAware);
                if (result == null) result = caseExtendetDataAware(abstractExtendetDataAware);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Extendet Data</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Extendet Data</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExtendetData(ExtendetData object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enviorment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enviorment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnviorment(Enviorment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Nahkamp Modifikationen</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Nahkamp Modifikationen</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNahkampModifikationen(NahkampModifikationen object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Extendet Data Aware</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Extendet Data Aware</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExtendetDataAware(ExtendetDataAware object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phyical State</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phyical State</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhyicalState(PhyicalState object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Character</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Character</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRuntimeCharacter(RuntimeCharacter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Team</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Team</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTeam(Team object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Extendet Data Aware</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Extendet Data Aware</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractExtendetDataAware(AbstractExtendetDataAware object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Beschreibbar</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Beschreibbar</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBeschreibbar(Beschreibbar object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //RuntimeSwitch
