/**
 */
package de.urszeidler.shr5.scripting;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.urszeidler.shr5.scripting.ScriptingPackage
 * @generated
 */
public interface ScriptingFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ScriptingFactory eINSTANCE = de.urszeidler.shr5.scripting.impl.ScriptingFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Script</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Script</em>'.
     * @generated
     */
    Script createScript();

    /**
     * Returns a new object of class '<em>Placement</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Placement</em>'.
     * @generated
     */
    Placement createPlacement();

    /**
     * Returns a new object of class '<em>Script History</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Script History</em>'.
     * @generated
     */
    ScriptHistory createScriptHistory();

    /**
     * Returns a new object of class '<em>Scripts</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Scripts</em>'.
     * @generated
     */
    Scripts createScripts();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ScriptingPackage getScriptingPackage();

} //ScriptingFactory
