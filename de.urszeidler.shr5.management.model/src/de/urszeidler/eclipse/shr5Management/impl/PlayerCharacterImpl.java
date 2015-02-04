/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5Management.CharacterDiary;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import de.urszeidler.eclipse.shr5Management.PlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PlayerCharacterImpl#getDiary <em>Diary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlayerCharacterImpl extends ManagedCharacterImpl implements PlayerCharacter {
	/**
     * The cached value of the '{@link #getDiary() <em>Diary</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiary()
     * @generated
     * @ordered
     */
    protected CharacterDiary diary;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PlayerCharacterImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.PLAYER_CHARACTER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CharacterDiary getDiary() {
        return diary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiary(CharacterDiary newDiary, NotificationChain msgs) {
        CharacterDiary oldDiary = diary;
        diary = newDiary;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PLAYER_CHARACTER__DIARY, oldDiary, newDiary);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDiary(CharacterDiary newDiary) {
        if (newDiary != diary) {
            NotificationChain msgs = null;
            if (diary != null)
                msgs = ((InternalEObject)diary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5managementPackage.PLAYER_CHARACTER__DIARY, null, msgs);
            if (newDiary != null)
                msgs = ((InternalEObject)newDiary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Shr5managementPackage.PLAYER_CHARACTER__DIARY, null, msgs);
            msgs = basicSetDiary(newDiary, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PLAYER_CHARACTER__DIARY, newDiary, newDiary));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.PLAYER_CHARACTER__DIARY:
                return basicSetDiary(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.PLAYER_CHARACTER__DIARY:
                return getDiary();
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
            case Shr5managementPackage.PLAYER_CHARACTER__DIARY:
                setDiary((CharacterDiary)newValue);
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
            case Shr5managementPackage.PLAYER_CHARACTER__DIARY:
                setDiary((CharacterDiary)null);
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
            case Shr5managementPackage.PLAYER_CHARACTER__DIARY:
                return diary != null;
        }
        return super.eIsSet(featureID);
    }

} //PlayerCharacterImpl
