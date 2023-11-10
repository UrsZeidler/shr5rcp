/**
 */
package de.urszeidler.shr5.scripting.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

import de.urszeidler.eclipse.shr5.gameplay.ExecutionStack;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.ScriptHistory;
import de.urszeidler.shr5.scripting.ScriptingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.ScriptHistoryImpl#getCommandStack <em>Command Stack</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.ScriptHistoryImpl#getCurrentDate <em>Current Date</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.ScriptHistoryImpl#getCurrentPlacement <em>Current Placement</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.ScriptHistoryImpl#getWrittenProtokol <em>Written Protokol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptHistoryImpl extends MinimalEObjectImpl.Container implements ScriptHistory {
    /**
     * The cached value of the '{@link #getCommandStack() <em>Command Stack</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommandStack()
     * @generated
     * @ordered
     */
    protected ExecutionStack commandStack;

    /**
     * The default value of the '{@link #getCurrentDate() <em>Current Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentDate()
     * @generated
     * @ordered
     */
    protected static final Date CURRENT_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCurrentDate() <em>Current Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentDate()
     * @generated
     * @ordered
     */
    protected Date currentDate = CURRENT_DATE_EDEFAULT;

    /**
     * The cached value of the '{@link #getCurrentPlacement() <em>Current Placement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentPlacement()
     * @generated
     * @ordered
     */
    protected Placement currentPlacement;

    /**
     * The cached value of the '{@link #getWrittenProtokol() <em>Written Protokol</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWrittenProtokol()
     * @generated
     * @ordered
     */
    protected EList<String> writtenProtokol;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScriptHistoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScriptingPackage.Literals.SCRIPT_HISTORY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExecutionStack getCommandStack() {
        return commandStack;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCommandStack(ExecutionStack newCommandStack, NotificationChain msgs) {
        ExecutionStack oldCommandStack = commandStack;
        commandStack = newCommandStack;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScriptingPackage.SCRIPT_HISTORY__COMMAND_STACK, oldCommandStack, newCommandStack);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCommandStack(ExecutionStack newCommandStack) {
        if (newCommandStack != commandStack) {
            NotificationChain msgs = null;
            if (commandStack != null)
                msgs = ((InternalEObject)commandStack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScriptingPackage.SCRIPT_HISTORY__COMMAND_STACK, null, msgs);
            if (newCommandStack != null)
                msgs = ((InternalEObject)newCommandStack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScriptingPackage.SCRIPT_HISTORY__COMMAND_STACK, null, msgs);
            msgs = basicSetCommandStack(newCommandStack, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.SCRIPT_HISTORY__COMMAND_STACK, newCommandStack, newCommandStack));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getCurrentDate() {
        return currentDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCurrentDate(Date newCurrentDate) {
        Date oldCurrentDate = currentDate;
        currentDate = newCurrentDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.SCRIPT_HISTORY__CURRENT_DATE, oldCurrentDate, currentDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Placement getCurrentPlacement() {
        if (currentPlacement != null && currentPlacement.eIsProxy()) {
            InternalEObject oldCurrentPlacement = (InternalEObject)currentPlacement;
            currentPlacement = (Placement)eResolveProxy(oldCurrentPlacement);
            if (currentPlacement != oldCurrentPlacement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScriptingPackage.SCRIPT_HISTORY__CURRENT_PLACEMENT, oldCurrentPlacement, currentPlacement));
            }
        }
        return currentPlacement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Placement basicGetCurrentPlacement() {
        return currentPlacement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCurrentPlacement(Placement newCurrentPlacement) {
        Placement oldCurrentPlacement = currentPlacement;
        currentPlacement = newCurrentPlacement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.SCRIPT_HISTORY__CURRENT_PLACEMENT, oldCurrentPlacement, currentPlacement));
    }

    /**
     * <!-- begin-user-doc -->
     * Simple fix for not unique.
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<String> getWrittenProtokol() {
        if (writtenProtokol == null) {
            writtenProtokol = new EDataTypeEList<String>(String.class, this, ScriptingPackage.SCRIPT_HISTORY__WRITTEN_PROTOKOL);
        }
        return writtenProtokol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScriptingPackage.SCRIPT_HISTORY__COMMAND_STACK:
                return basicSetCommandStack(null, msgs);
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
            case ScriptingPackage.SCRIPT_HISTORY__COMMAND_STACK:
                return getCommandStack();
            case ScriptingPackage.SCRIPT_HISTORY__CURRENT_DATE:
                return getCurrentDate();
            case ScriptingPackage.SCRIPT_HISTORY__CURRENT_PLACEMENT:
                if (resolve) return getCurrentPlacement();
                return basicGetCurrentPlacement();
            case ScriptingPackage.SCRIPT_HISTORY__WRITTEN_PROTOKOL:
                return getWrittenProtokol();
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
            case ScriptingPackage.SCRIPT_HISTORY__COMMAND_STACK:
                setCommandStack((ExecutionStack)newValue);
                return;
            case ScriptingPackage.SCRIPT_HISTORY__CURRENT_DATE:
                setCurrentDate((Date)newValue);
                return;
            case ScriptingPackage.SCRIPT_HISTORY__CURRENT_PLACEMENT:
                setCurrentPlacement((Placement)newValue);
                return;
            case ScriptingPackage.SCRIPT_HISTORY__WRITTEN_PROTOKOL:
                getWrittenProtokol().clear();
                getWrittenProtokol().addAll((Collection<? extends String>)newValue);
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
            case ScriptingPackage.SCRIPT_HISTORY__COMMAND_STACK:
                setCommandStack((ExecutionStack)null);
                return;
            case ScriptingPackage.SCRIPT_HISTORY__CURRENT_DATE:
                setCurrentDate(CURRENT_DATE_EDEFAULT);
                return;
            case ScriptingPackage.SCRIPT_HISTORY__CURRENT_PLACEMENT:
                setCurrentPlacement((Placement)null);
                return;
            case ScriptingPackage.SCRIPT_HISTORY__WRITTEN_PROTOKOL:
                getWrittenProtokol().clear();
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
            case ScriptingPackage.SCRIPT_HISTORY__COMMAND_STACK:
                return commandStack != null;
            case ScriptingPackage.SCRIPT_HISTORY__CURRENT_DATE:
                return CURRENT_DATE_EDEFAULT == null ? currentDate != null : !CURRENT_DATE_EDEFAULT.equals(currentDate);
            case ScriptingPackage.SCRIPT_HISTORY__CURRENT_PLACEMENT:
                return currentPlacement != null;
            case ScriptingPackage.SCRIPT_HISTORY__WRITTEN_PROTOKOL:
                return writtenProtokol != null && !writtenProtokol.isEmpty();
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (currentDate: ");
        result.append(currentDate);
        result.append(", writtenProtokol: ");
        result.append(writtenProtokol);
        result.append(')');
        return result.toString();
    }

} //ScriptHistoryImpl
