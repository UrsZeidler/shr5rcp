/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5Management.FreeStyle;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem;
import de.urszeidler.eclipse.shr5Management.FreeStyleGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Free Style Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.FreeStyleGeneratorImpl#getFreestyleGenerator <em>Freestyle Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FreeStyleGeneratorImpl extends CharacterGeneratorImpl implements FreeStyleGenerator {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FreeStyleGeneratorImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.FREE_STYLE_GENERATOR;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FreeStyle getFreestyleGenerator() {
        FreeStyle freestyleGenerator = basicGetFreestyleGenerator();
        return freestyleGenerator != null && freestyleGenerator.eIsProxy() ? (FreeStyle)eResolveProxy((InternalEObject)freestyleGenerator) : freestyleGenerator;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public FreeStyle basicGetFreestyleGenerator() {
		CharacterGeneratorSystem system = getGenerator();
		if (system instanceof FreeStyle) {
			return (FreeStyle) system;			
		}
		return null;
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.FREE_STYLE_GENERATOR__FREESTYLE_GENERATOR:
                if (resolve) return getFreestyleGenerator();
                return basicGetFreestyleGenerator();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.FREE_STYLE_GENERATOR__FREESTYLE_GENERATOR:
                return basicGetFreestyleGenerator() != null;
        }
        return super.eIsSet(featureID);
    }

} //FreeStyleGeneratorImpl
