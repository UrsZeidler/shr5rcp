/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.Magazin;
import de.urszeidler.eclipse.shr5.Munition;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Magazin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagazinImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagazinImpl#getBullets <em>Bullets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MagazinImpl extends AbstraktGegenstandImpl implements Magazin {
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected Feuerwaffe type;

    /**
     * The cached value of the '{@link #getBullets() <em>Bullets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBullets()
     * @generated
     * @ordered
     */
    protected EList<Munition> bullets;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MagazinImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.MAGAZIN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Feuerwaffe getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (Feuerwaffe)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.MAGAZIN__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Feuerwaffe basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(Feuerwaffe newType) {
        Feuerwaffe oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MAGAZIN__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * workaround for Bug 89325
     * @generated not
     */
    public EList<Munition> getBullets() {
        if (bullets == null) {
            bullets = new EObjectResolvingEList<Munition>(Munition.class, this, Shr5Package.MAGAZIN__BULLETS){
                @Override
                protected boolean isUnique() {
                    return false;
                }
            };
        }
        return bullets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.MAGAZIN__TYPE:
                if (resolve) return getType();
                return basicGetType();
            case Shr5Package.MAGAZIN__BULLETS:
                return getBullets();
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
            case Shr5Package.MAGAZIN__TYPE:
                setType((Feuerwaffe)newValue);
                return;
            case Shr5Package.MAGAZIN__BULLETS:
                getBullets().clear();
                getBullets().addAll((Collection<? extends Munition>)newValue);
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
            case Shr5Package.MAGAZIN__TYPE:
                setType((Feuerwaffe)null);
                return;
            case Shr5Package.MAGAZIN__BULLETS:
                getBullets().clear();
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
            case Shr5Package.MAGAZIN__TYPE:
                return type != null;
            case Shr5Package.MAGAZIN__BULLETS:
                return bullets != null && !bullets.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //MagazinImpl
