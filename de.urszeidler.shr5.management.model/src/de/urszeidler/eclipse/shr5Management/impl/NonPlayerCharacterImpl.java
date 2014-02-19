/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import de.urszeidler.eclipse.shr5Management.NonPlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import org.eclipse.emf.common.notify.Notification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Player Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.NonPlayerCharacterImpl#getProfessionalRating <em>Professional Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonPlayerCharacterImpl extends ManagedCharacterImpl implements NonPlayerCharacter {
	/**
     * The default value of the '{@link #getProfessionalRating() <em>Professional Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProfessionalRating()
     * @generated
     * @ordered
     */
    protected static final int PROFESSIONAL_RATING_EDEFAULT = 0;
    /**
     * The cached value of the '{@link #getProfessionalRating() <em>Professional Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProfessionalRating()
     * @generated
     * @ordered
     */
    protected int professionalRating = PROFESSIONAL_RATING_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected NonPlayerCharacterImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.NON_PLAYER_CHARACTER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getProfessionalRating() {
        return professionalRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProfessionalRating(int newProfessionalRating) {
        int oldProfessionalRating = professionalRating;
        professionalRating = newProfessionalRating;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.NON_PLAYER_CHARACTER__PROFESSIONAL_RATING, oldProfessionalRating, professionalRating));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.NON_PLAYER_CHARACTER__PROFESSIONAL_RATING:
                return getProfessionalRating();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5managementPackage.NON_PLAYER_CHARACTER__PROFESSIONAL_RATING:
                setProfessionalRating((Integer)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.NON_PLAYER_CHARACTER__PROFESSIONAL_RATING:
                setProfessionalRating(PROFESSIONAL_RATING_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.NON_PLAYER_CHARACTER__PROFESSIONAL_RATING:
                return professionalRating != PROFESSIONAL_RATING_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (professionalRating: ");
        result.append(professionalRating);
        result.append(')');
        return result.toString();
    }

} //NonPlayerCharacterImpl
