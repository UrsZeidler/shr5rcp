/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5Management.ModuleTypeChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Type Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleTypeChangeImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleTypeChangeImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleTypeChangeImpl#getSelectOne <em>Select One</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModuleTypeChangeImpl<T> extends ModuleChangeImpl implements ModuleTypeChange<T> {
    /**
     * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrade()
     * @generated
     * @ordered
     */
    protected static final int GRADE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrade()
     * @generated
     * @ordered
     */
    protected int grade = GRADE_EDEFAULT;

    /**
     * The cached value of the '{@link #getSelected() <em>Selected</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelected()
     * @generated
     * @ordered
     */
    protected T selected;

    /**
     * The cached value of the '{@link #getSelectOne() <em>Select One</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelectOne()
     * @generated
     * @ordered
     */
    protected EList<T> selectOne;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModuleTypeChangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.MODULE_TYPE_CHANGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getGrade() {
        return grade;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGrade(int newGrade) {
        int oldGrade = grade;
        grade = newGrade;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MODULE_TYPE_CHANGE__GRADE, oldGrade, grade));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public T getSelected() {
        if (selected != null && ((EObject)selected).eIsProxy()) {
            InternalEObject oldSelected = (InternalEObject)selected;
            selected = (T)eResolveProxy(oldSelected);
            if (selected != oldSelected) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.MODULE_TYPE_CHANGE__SELECTED, oldSelected, selected));
            }
        }
        return selected;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public T basicGetSelected() {
        return selected;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSelected(T newSelected) {
        T oldSelected = selected;
        selected = newSelected;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MODULE_TYPE_CHANGE__SELECTED, oldSelected, selected));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<T> getSelectOne() {
        if (selectOne == null) {
            selectOne = new EObjectResolvingEList<T>(EObject.class, this, Shr5managementPackage.MODULE_TYPE_CHANGE__SELECT_ONE);
        }
        return selectOne;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.MODULE_TYPE_CHANGE__GRADE:
                return getGrade();
            case Shr5managementPackage.MODULE_TYPE_CHANGE__SELECTED:
                if (resolve) return getSelected();
                return basicGetSelected();
            case Shr5managementPackage.MODULE_TYPE_CHANGE__SELECT_ONE:
                return getSelectOne();
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
            case Shr5managementPackage.MODULE_TYPE_CHANGE__GRADE:
                setGrade((Integer)newValue);
                return;
            case Shr5managementPackage.MODULE_TYPE_CHANGE__SELECTED:
                setSelected((T)newValue);
                return;
            case Shr5managementPackage.MODULE_TYPE_CHANGE__SELECT_ONE:
                getSelectOne().clear();
                getSelectOne().addAll((Collection<? extends T>)newValue);
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
            case Shr5managementPackage.MODULE_TYPE_CHANGE__GRADE:
                setGrade(GRADE_EDEFAULT);
                return;
            case Shr5managementPackage.MODULE_TYPE_CHANGE__SELECTED:
                setSelected((T)null);
                return;
            case Shr5managementPackage.MODULE_TYPE_CHANGE__SELECT_ONE:
                getSelectOne().clear();
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
            case Shr5managementPackage.MODULE_TYPE_CHANGE__GRADE:
                return grade != GRADE_EDEFAULT;
            case Shr5managementPackage.MODULE_TYPE_CHANGE__SELECTED:
                return selected != null;
            case Shr5managementPackage.MODULE_TYPE_CHANGE__SELECT_ONE:
                return selectOne != null && !selectOne.isEmpty();
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
        result.append(" (grade: ");
        result.append(grade);
        result.append(')');
        return result.toString();
    }

} //ModuleTypeChangeImpl
