/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5Management.CharacterDiary;
import de.urszeidler.eclipse.shr5Management.DiaryEntry;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Diary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterDiaryImpl#getCharacterDate <em>Character Date</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterDiaryImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CharacterDiaryImpl extends MinimalEObjectImpl.Container implements CharacterDiary {
    /**
     * The default value of the '{@link #getCharacterDate() <em>Character Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharacterDate()
     * @generated
     * @ordered
     */
    protected static final Date CHARACTER_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCharacterDate() <em>Character Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharacterDate()
     * @generated
     * @ordered
     */
    protected Date characterDate = CHARACTER_DATE_EDEFAULT;

    /**
     * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntries()
     * @generated
     * @ordered
     */
    protected EList<DiaryEntry> entries;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CharacterDiaryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.CHARACTER_DIARY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getCharacterDate() {
        return characterDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCharacterDate(Date newCharacterDate) {
        Date oldCharacterDate = characterDate;
        characterDate = newCharacterDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHARACTER_DIARY__CHARACTER_DATE, oldCharacterDate, characterDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DiaryEntry> getEntries() {
        if (entries == null) {
            entries = new EObjectContainmentEList<DiaryEntry>(DiaryEntry.class, this, Shr5managementPackage.CHARACTER_DIARY__ENTRIES);
        }
        return entries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.CHARACTER_DIARY__ENTRIES:
                return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
            case Shr5managementPackage.CHARACTER_DIARY__CHARACTER_DATE:
                return getCharacterDate();
            case Shr5managementPackage.CHARACTER_DIARY__ENTRIES:
                return getEntries();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5managementPackage.CHARACTER_DIARY__CHARACTER_DATE:
                setCharacterDate((Date)newValue);
                return;
            case Shr5managementPackage.CHARACTER_DIARY__ENTRIES:
                getEntries().clear();
                getEntries().addAll((Collection<? extends DiaryEntry>)newValue);
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
            case Shr5managementPackage.CHARACTER_DIARY__CHARACTER_DATE:
                setCharacterDate(CHARACTER_DATE_EDEFAULT);
                return;
            case Shr5managementPackage.CHARACTER_DIARY__ENTRIES:
                getEntries().clear();
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
            case Shr5managementPackage.CHARACTER_DIARY__CHARACTER_DATE:
                return CHARACTER_DATE_EDEFAULT == null ? characterDate != null : !CHARACTER_DATE_EDEFAULT.equals(characterDate);
            case Shr5managementPackage.CHARACTER_DIARY__ENTRIES:
                return entries != null && !entries.isEmpty();
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
        result.append(" (characterDate: ");
        result.append(characterDate);
        result.append(')');
        return result.toString();
    }

} //CharacterDiaryImpl
