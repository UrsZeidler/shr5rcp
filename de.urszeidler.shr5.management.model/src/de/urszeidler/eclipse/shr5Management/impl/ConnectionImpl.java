/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.eclipse.shr5Management.Connection;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ConnectionImpl#getInfluence <em>Influence</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ConnectionImpl#getLoyality <em>Loyality</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ConnectionImpl#getCharacter <em>Character</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
     * The default value of the '{@link #getInfluence() <em>Influence</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInfluence()
     * @generated
     * @ordered
     */
	protected static final int INFLUENCE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getInfluence() <em>Influence</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInfluence()
     * @generated
     * @ordered
     */
	protected int influence = INFLUENCE_EDEFAULT;

	/**
     * The default value of the '{@link #getLoyality() <em>Loyality</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLoyality()
     * @generated
     * @ordered
     */
	protected static final int LOYALITY_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getLoyality() <em>Loyality</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLoyality()
     * @generated
     * @ordered
     */
	protected int loyality = LOYALITY_EDEFAULT;

	/**
     * The cached value of the '{@link #getCharacter() <em>Character</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharacter()
     * @generated
     * @ordered
     */
	protected ManagedCharacter character;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ConnectionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.CONNECTION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getInfluence() {
        return influence;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setInfluence(int newInfluence) {
        int oldInfluence = influence;
        influence = newInfluence;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CONNECTION__INFLUENCE, oldInfluence, influence));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getLoyality() {
        return loyality;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLoyality(int newLoyality) {
        int oldLoyality = loyality;
        loyality = newLoyality;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CONNECTION__LOYALITY, oldLoyality, loyality));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ManagedCharacter getCharacter() {
        if (character != null && character.eIsProxy()) {
            InternalEObject oldCharacter = (InternalEObject)character;
            character = (ManagedCharacter)eResolveProxy(oldCharacter);
            if (character != oldCharacter) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.CONNECTION__CHARACTER, oldCharacter, character));
            }
        }
        return character;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ManagedCharacter basicGetCharacter() {
        return character;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCharacter(ManagedCharacter newCharacter) {
        ManagedCharacter oldCharacter = character;
        character = newCharacter;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CONNECTION__CHARACTER, oldCharacter, character));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.CONNECTION__INFLUENCE:
                return getInfluence();
            case Shr5managementPackage.CONNECTION__LOYALITY:
                return getLoyality();
            case Shr5managementPackage.CONNECTION__CHARACTER:
                if (resolve) return getCharacter();
                return basicGetCharacter();
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
            case Shr5managementPackage.CONNECTION__INFLUENCE:
                setInfluence((Integer)newValue);
                return;
            case Shr5managementPackage.CONNECTION__LOYALITY:
                setLoyality((Integer)newValue);
                return;
            case Shr5managementPackage.CONNECTION__CHARACTER:
                setCharacter((ManagedCharacter)newValue);
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
            case Shr5managementPackage.CONNECTION__INFLUENCE:
                setInfluence(INFLUENCE_EDEFAULT);
                return;
            case Shr5managementPackage.CONNECTION__LOYALITY:
                setLoyality(LOYALITY_EDEFAULT);
                return;
            case Shr5managementPackage.CONNECTION__CHARACTER:
                setCharacter((ManagedCharacter)null);
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
            case Shr5managementPackage.CONNECTION__INFLUENCE:
                return influence != INFLUENCE_EDEFAULT;
            case Shr5managementPackage.CONNECTION__LOYALITY:
                return loyality != LOYALITY_EDEFAULT;
            case Shr5managementPackage.CONNECTION__CHARACTER:
                return character != null;
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
        result.append(" (influence: ");
        result.append(influence);
        result.append(", loyality: ");
        result.append(loyality);
        result.append(')');
        return result.toString();
    }

} //ConnectionImpl
