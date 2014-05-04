/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5.Quelle;

import de.urszeidler.eclipse.shr5Management.QuellenConstrain;
import de.urszeidler.eclipse.shr5Management.QuellenConstrainType;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quellen Constrain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.QuellenConstrainImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.QuellenConstrainImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.QuellenConstrainImpl#getConstrainType <em>Constrain Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuellenConstrainImpl extends MinimalEObjectImpl.Container implements QuellenConstrain {
    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected Quelle source;

    /**
     * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargets()
     * @generated
     * @ordered
     */
    protected EList<Quelle> targets;

    /**
     * The default value of the '{@link #getConstrainType() <em>Constrain Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstrainType()
     * @generated
     * @ordered
     */
    protected static final QuellenConstrainType CONSTRAIN_TYPE_EDEFAULT = QuellenConstrainType.NOT_TOGETHER;

    /**
     * The cached value of the '{@link #getConstrainType() <em>Constrain Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstrainType()
     * @generated
     * @ordered
     */
    protected QuellenConstrainType constrainType = CONSTRAIN_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected QuellenConstrainImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.QUELLEN_CONSTRAIN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Quelle getSource() {
        if (source != null && source.eIsProxy()) {
            InternalEObject oldSource = (InternalEObject)source;
            source = (Quelle)eResolveProxy(oldSource);
            if (source != oldSource) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.QUELLEN_CONSTRAIN__SOURCE, oldSource, source));
            }
        }
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Quelle basicGetSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSource(Quelle newSource) {
        Quelle oldSource = source;
        source = newSource;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.QUELLEN_CONSTRAIN__SOURCE, oldSource, source));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Quelle> getTargets() {
        if (targets == null) {
            targets = new EObjectResolvingEList<Quelle>(Quelle.class, this, Shr5managementPackage.QUELLEN_CONSTRAIN__TARGETS);
        }
        return targets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuellenConstrainType getConstrainType() {
        return constrainType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConstrainType(QuellenConstrainType newConstrainType) {
        QuellenConstrainType oldConstrainType = constrainType;
        constrainType = newConstrainType == null ? CONSTRAIN_TYPE_EDEFAULT : newConstrainType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.QUELLEN_CONSTRAIN__CONSTRAIN_TYPE, oldConstrainType, constrainType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.QUELLEN_CONSTRAIN__SOURCE:
                if (resolve) return getSource();
                return basicGetSource();
            case Shr5managementPackage.QUELLEN_CONSTRAIN__TARGETS:
                return getTargets();
            case Shr5managementPackage.QUELLEN_CONSTRAIN__CONSTRAIN_TYPE:
                return getConstrainType();
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
            case Shr5managementPackage.QUELLEN_CONSTRAIN__SOURCE:
                setSource((Quelle)newValue);
                return;
            case Shr5managementPackage.QUELLEN_CONSTRAIN__TARGETS:
                getTargets().clear();
                getTargets().addAll((Collection<? extends Quelle>)newValue);
                return;
            case Shr5managementPackage.QUELLEN_CONSTRAIN__CONSTRAIN_TYPE:
                setConstrainType((QuellenConstrainType)newValue);
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
            case Shr5managementPackage.QUELLEN_CONSTRAIN__SOURCE:
                setSource((Quelle)null);
                return;
            case Shr5managementPackage.QUELLEN_CONSTRAIN__TARGETS:
                getTargets().clear();
                return;
            case Shr5managementPackage.QUELLEN_CONSTRAIN__CONSTRAIN_TYPE:
                setConstrainType(CONSTRAIN_TYPE_EDEFAULT);
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
            case Shr5managementPackage.QUELLEN_CONSTRAIN__SOURCE:
                return source != null;
            case Shr5managementPackage.QUELLEN_CONSTRAIN__TARGETS:
                return targets != null && !targets.isEmpty();
            case Shr5managementPackage.QUELLEN_CONSTRAIN__CONSTRAIN_TYPE:
                return constrainType != CONSTRAIN_TYPE_EDEFAULT;
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
        result.append(" (constrainType: ");
        result.append(constrainType);
        result.append(')');
        return result.toString();
    }

} //QuellenConstrainImpl
