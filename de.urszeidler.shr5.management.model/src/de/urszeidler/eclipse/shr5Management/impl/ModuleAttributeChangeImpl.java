/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5Management.ModuleAttributeChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Attribute Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleAttributeChangeImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleAttributeChangeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ModuleAttributeChangeImpl#getSelectOne <em>Select One</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleAttributeChangeImpl extends ModuleChangeImpl implements ModuleAttributeChange {
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
     * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttribute()
     * @generated
     * @ordered
     */
    protected EAttribute attribute;

    /**
     * The cached value of the '{@link #getSelectOne() <em>Select One</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelectOne()
     * @generated
     * @ordered
     */
    protected EList<EAttribute> selectOne;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModuleAttributeChangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.MODULE_ATTRIBUTE_CHANGE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE__GRADE, oldGrade, grade));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute() {
        if (attribute != null && attribute.eIsProxy()) {
            InternalEObject oldAttribute = (InternalEObject)attribute;
            attribute = (EAttribute)eResolveProxy(oldAttribute);
            if (attribute != oldAttribute) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE__ATTRIBUTE, oldAttribute, attribute));
            }
        }
        return attribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute basicGetAttribute() {
        return attribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttribute(EAttribute newAttribute) {
        EAttribute oldAttribute = attribute;
        attribute = newAttribute;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE__ATTRIBUTE, oldAttribute, attribute));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EAttribute> getSelectOne() {
        if (selectOne == null) {
            selectOne = new EObjectResolvingEList<EAttribute>(EAttribute.class, this, Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE__SELECT_ONE);
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
            case Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE__GRADE:
                return getGrade();
            case Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE__ATTRIBUTE:
                if (resolve) return getAttribute();
                return basicGetAttribute();
            case Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE__SELECT_ONE:
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
            case Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE__GRADE:
                setGrade((Integer)newValue);
                return;
            case Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE__ATTRIBUTE:
                setAttribute((EAttribute)newValue);
                return;
            case Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE__SELECT_ONE:
                getSelectOne().clear();
                getSelectOne().addAll((Collection<? extends EAttribute>)newValue);
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
            case Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE__GRADE:
                setGrade(GRADE_EDEFAULT);
                return;
            case Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE__ATTRIBUTE:
                setAttribute((EAttribute)null);
                return;
            case Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE__SELECT_ONE:
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
            case Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE__GRADE:
                return grade != GRADE_EDEFAULT;
            case Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE__ATTRIBUTE:
                return attribute != null;
            case Shr5managementPackage.MODULE_ATTRIBUTE_CHANGE__SELECT_ONE:
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

} //ModuleAttributeChangeImpl
