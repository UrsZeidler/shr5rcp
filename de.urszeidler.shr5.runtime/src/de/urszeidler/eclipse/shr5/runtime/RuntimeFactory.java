/**
 */
package de.urszeidler.eclipse.shr5.runtime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.urszeidler.eclipse.shr5.runtime.RuntimePackage
 * @generated
 */
public interface RuntimeFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RuntimeFactory eINSTANCE = de.urszeidler.eclipse.shr5.runtime.impl.RuntimeFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Extendet Data</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Extendet Data</em>'.
     * @generated
     */
    ExtendetData createExtendetData();

    /**
     * Returns a new object of class '<em>Enviorment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enviorment</em>'.
     * @generated
     */
    Enviorment createEnviorment();

    /**
     * Returns a new object of class '<em>Character</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Character</em>'.
     * @generated
     */
    RuntimeCharacter createRuntimeCharacter();

    /**
     * Returns a new object of class '<em>Team</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Team</em>'.
     * @generated
     */
    Team createTeam();

    /**
     * Returns a new object of class '<em>Grunt Team</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Grunt Team</em>'.
     * @generated
     */
    GruntTeam createGruntTeam();

    /**
     * Returns a new object of class '<em>Grunt Runtime Character</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Grunt Runtime Character</em>'.
     * @generated
     */
    GruntRuntimeCharacter createGruntRuntimeCharacter();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    RuntimePackage getRuntimePackage();

} //RuntimeFactory
