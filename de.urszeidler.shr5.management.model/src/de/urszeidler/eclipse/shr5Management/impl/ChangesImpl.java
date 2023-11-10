/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Changes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ChangesImpl#getDate <em>Date</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ChangesImpl#getKarmaCost <em>Karma Cost</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ChangesImpl#getCharacter <em>Character</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ChangesImpl#isChangeApplied <em>Change Applied</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ChangesImpl#getDateApplied <em>Date Applied</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ChangesImpl extends MinimalEObjectImpl.Container implements Changes {
    /**
     * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected static final Date DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected Date date = DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getKarmaCost() <em>Karma Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKarmaCost()
     * @generated
     * @ordered
     */
    protected static final int KARMA_COST_EDEFAULT = 0;

    /**
     * The default value of the '{@link #isChangeApplied() <em>Change Applied</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isChangeApplied()
     * @generated
     * @ordered
     */
    protected static final boolean CHANGE_APPLIED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isChangeApplied() <em>Change Applied</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isChangeApplied()
     * @generated
     * @ordered
     */
    protected boolean changeApplied = CHANGE_APPLIED_EDEFAULT;

    /**
     * The default value of the '{@link #getDateApplied() <em>Date Applied</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDateApplied()
     * @generated
     * @ordered
     */
    protected static final Date DATE_APPLIED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDateApplied() <em>Date Applied</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDateApplied()
     * @generated
     * @ordered
     */
    protected Date dateApplied = DATE_APPLIED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChangesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.CHANGES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getDate() {
        return date;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDate(Date newDate) {
        Date oldDate = date;
        date = newDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHANGES__DATE, oldDate, date));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getKarmaCost() {
        throw new UnsupportedOperationException("Subclasses need to override getKarmaCost()");
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ManagedCharacter getCharacter() {
        if (eContainerFeatureID() != Shr5managementPackage.CHANGES__CHARACTER) return null;
        return (ManagedCharacter)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCharacter(ManagedCharacter newCharacter, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newCharacter, Shr5managementPackage.CHANGES__CHARACTER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCharacter(ManagedCharacter newCharacter) {
        if (newCharacter != eInternalContainer() || (eContainerFeatureID() != Shr5managementPackage.CHANGES__CHARACTER && newCharacter != null)) {
            if (EcoreUtil.isAncestor(this, newCharacter))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newCharacter != null)
                msgs = ((InternalEObject)newCharacter).eInverseAdd(this, Shr5managementPackage.MANAGED_CHARACTER__CHANGES, ManagedCharacter.class, msgs);
            msgs = basicSetCharacter(newCharacter, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHANGES__CHARACTER, newCharacter, newCharacter));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isChangeApplied() {
        return changeApplied;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setChangeApplied(boolean newChangeApplied) {
        boolean oldChangeApplied = changeApplied;
        changeApplied = newChangeApplied;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHANGES__CHANGE_APPLIED, oldChangeApplied, changeApplied));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getDateApplied() {
        return dateApplied;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDateApplied(Date newDateApplied) {
        Date oldDateApplied = dateApplied;
        dateApplied = newDateApplied;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHANGES__DATE_APPLIED, oldDateApplied, dateApplied));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void applyChanges() {
        throw new UnsupportedOperationException("Subclasses need to implement applyChanges() ");
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.CHANGES__CHARACTER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetCharacter((ManagedCharacter)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.CHANGES__CHARACTER:
                return basicSetCharacter(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case Shr5managementPackage.CHANGES__CHARACTER:
                return eInternalContainer().eInverseRemove(this, Shr5managementPackage.MANAGED_CHARACTER__CHANGES, ManagedCharacter.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.CHANGES__DATE:
                return getDate();
            case Shr5managementPackage.CHANGES__KARMA_COST:
                return getKarmaCost();
            case Shr5managementPackage.CHANGES__CHARACTER:
                return getCharacter();
            case Shr5managementPackage.CHANGES__CHANGE_APPLIED:
                return isChangeApplied();
            case Shr5managementPackage.CHANGES__DATE_APPLIED:
                return getDateApplied();
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
            case Shr5managementPackage.CHANGES__DATE:
                setDate((Date)newValue);
                return;
            case Shr5managementPackage.CHANGES__CHARACTER:
                setCharacter((ManagedCharacter)newValue);
                return;
            case Shr5managementPackage.CHANGES__CHANGE_APPLIED:
                setChangeApplied((Boolean)newValue);
                return;
            case Shr5managementPackage.CHANGES__DATE_APPLIED:
                setDateApplied((Date)newValue);
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
            case Shr5managementPackage.CHANGES__DATE:
                setDate(DATE_EDEFAULT);
                return;
            case Shr5managementPackage.CHANGES__CHARACTER:
                setCharacter((ManagedCharacter)null);
                return;
            case Shr5managementPackage.CHANGES__CHANGE_APPLIED:
                setChangeApplied(CHANGE_APPLIED_EDEFAULT);
                return;
            case Shr5managementPackage.CHANGES__DATE_APPLIED:
                setDateApplied(DATE_APPLIED_EDEFAULT);
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
            case Shr5managementPackage.CHANGES__DATE:
                return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
            case Shr5managementPackage.CHANGES__KARMA_COST:
                return getKarmaCost() != KARMA_COST_EDEFAULT;
            case Shr5managementPackage.CHANGES__CHARACTER:
                return getCharacter() != null;
            case Shr5managementPackage.CHANGES__CHANGE_APPLIED:
                return changeApplied != CHANGE_APPLIED_EDEFAULT;
            case Shr5managementPackage.CHANGES__DATE_APPLIED:
                return DATE_APPLIED_EDEFAULT == null ? dateApplied != null : !DATE_APPLIED_EDEFAULT.equals(dateApplied);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case Shr5managementPackage.CHANGES___APPLY_CHANGES:
                applyChanges();
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (date: ");
        result.append(date);
        result.append(", changeApplied: ");
        result.append(changeApplied);
        result.append(", dateApplied: ");
        result.append(dateApplied);
        result.append(')');
        return result.toString();
    }

    protected void internalApply() {
        dateApplied = new Date(System.currentTimeMillis());
        changeApplied = true;
        
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHANGES__DATE_APPLIED, null, dateApplied));
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHANGES__CHANGE_APPLIED, false, true));

    }

} // ChangesImpl
