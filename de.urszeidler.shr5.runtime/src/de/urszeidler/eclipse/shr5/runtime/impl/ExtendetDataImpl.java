/**
 */
package de.urszeidler.eclipse.shr5.runtime.impl;

import de.urszeidler.eclipse.shr5.runtime.ExtendetData;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extendet Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.ExtendetDataImpl#getEObject <em>EObject</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.ExtendetDataImpl#getEFeature <em>EFeature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendetDataImpl extends MinimalEObjectImpl.Container implements ExtendetData {
    /**
     * The cached value of the '{@link #getEObject() <em>EObject</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEObject()
     * @generated
     * @ordered
     */
    protected EObject eObject;

    /**
     * The cached value of the '{@link #getEFeature() <em>EFeature</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEFeature()
     * @generated
     * @ordered
     */
    protected EStructuralFeature eFeature;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtendetDataImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RuntimePackage.Literals.EXTENDET_DATA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getEObject() {
        if (eObject != null && eObject.eIsProxy()) {
            InternalEObject oldEObject = (InternalEObject)eObject;
            eObject = eResolveProxy(oldEObject);
            if (eObject != oldEObject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.EXTENDET_DATA__EOBJECT, oldEObject, eObject));
            }
        }
        return eObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject basicGetEObject() {
        return eObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEObject(EObject newEObject) {
        EObject oldEObject = eObject;
        eObject = newEObject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.EXTENDET_DATA__EOBJECT, oldEObject, eObject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EStructuralFeature getEFeature() {
        if (eFeature != null && eFeature.eIsProxy()) {
            InternalEObject oldEFeature = (InternalEObject)eFeature;
            eFeature = (EStructuralFeature)eResolveProxy(oldEFeature);
            if (eFeature != oldEFeature) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.EXTENDET_DATA__EFEATURE, oldEFeature, eFeature));
            }
        }
        return eFeature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EStructuralFeature basicGetEFeature() {
        return eFeature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEFeature(EStructuralFeature newEFeature) {
        EStructuralFeature oldEFeature = eFeature;
        eFeature = newEFeature;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.EXTENDET_DATA__EFEATURE, oldEFeature, eFeature));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RuntimePackage.EXTENDET_DATA__EOBJECT:
                if (resolve) return getEObject();
                return basicGetEObject();
            case RuntimePackage.EXTENDET_DATA__EFEATURE:
                if (resolve) return getEFeature();
                return basicGetEFeature();
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
            case RuntimePackage.EXTENDET_DATA__EOBJECT:
                setEObject((EObject)newValue);
                return;
            case RuntimePackage.EXTENDET_DATA__EFEATURE:
                setEFeature((EStructuralFeature)newValue);
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
            case RuntimePackage.EXTENDET_DATA__EOBJECT:
                setEObject((EObject)null);
                return;
            case RuntimePackage.EXTENDET_DATA__EFEATURE:
                setEFeature((EStructuralFeature)null);
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
            case RuntimePackage.EXTENDET_DATA__EOBJECT:
                return eObject != null;
            case RuntimePackage.EXTENDET_DATA__EFEATURE:
                return eFeature != null;
        }
        return super.eIsSet(featureID);
    }

    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((eFeature == null) ? 0 : eFeature.hashCode());
        result = prime * result + ((eObject == null) ? 0 : eObject.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ExtendetDataImpl other = (ExtendetDataImpl)obj;
        if (eFeature == null) {
            if (other.eFeature != null)
                return false;
        } else if (!eFeature.equals(other.eFeature))
            return false;
        if (eObject == null) {
            if (other.eObject != null)
                return false;
        } else if (!eObject.equals(other.eObject))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ExtendetDataImpl [");
        if (eObject != null) {
            builder.append("eObject=");
            builder.append(eObject.eClass().getName());
            builder.append(", ");
        }
        if (eFeature != null) {
            builder.append("eFeature=");
            builder.append(eFeature.getName());
        }
        builder.append("]");
        return builder.toString();
    }
} //ExtendetDataImpl
