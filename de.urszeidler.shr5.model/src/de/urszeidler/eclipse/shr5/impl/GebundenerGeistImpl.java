/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.GebundenerGeist;
import de.urszeidler.eclipse.shr5.Geist;
import de.urszeidler.eclipse.shr5.Shr5Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gebundener Geist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GebundenerGeistImpl#getDienste <em>Dienste</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GebundenerGeistImpl#getGeist <em>Geist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GebundenerGeistImpl extends MinimalEObjectImpl.Container implements GebundenerGeist {
    /**
     * The default value of the '{@link #getDienste() <em>Dienste</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDienste()
     * @generated
     * @ordered
     */
    protected static final int DIENSTE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDienste() <em>Dienste</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDienste()
     * @generated
     * @ordered
     */
    protected int dienste = DIENSTE_EDEFAULT;

    /**
     * The cached value of the '{@link #getGeist() <em>Geist</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeist()
     * @generated
     * @ordered
     */
    protected Geist geist;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GebundenerGeistImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.GEBUNDENER_GEIST;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getDienste() {
        return dienste;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDienste(int newDienste) {
        int oldDienste = dienste;
        dienste = newDienste;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEBUNDENER_GEIST__DIENSTE, oldDienste, dienste));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Geist getGeist() {
        if (geist != null && geist.eIsProxy()) {
            InternalEObject oldGeist = (InternalEObject)geist;
            geist = (Geist)eResolveProxy(oldGeist);
            if (geist != oldGeist) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.GEBUNDENER_GEIST__GEIST, oldGeist, geist));
            }
        }
        return geist;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Geist basicGetGeist() {
        return geist;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGeist(Geist newGeist) {
        Geist oldGeist = geist;
        geist = newGeist;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEBUNDENER_GEIST__GEIST, oldGeist, geist));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.GEBUNDENER_GEIST__DIENSTE:
                return getDienste();
            case Shr5Package.GEBUNDENER_GEIST__GEIST:
                if (resolve) return getGeist();
                return basicGetGeist();
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
            case Shr5Package.GEBUNDENER_GEIST__DIENSTE:
                setDienste((Integer)newValue);
                return;
            case Shr5Package.GEBUNDENER_GEIST__GEIST:
                setGeist((Geist)newValue);
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
            case Shr5Package.GEBUNDENER_GEIST__DIENSTE:
                setDienste(DIENSTE_EDEFAULT);
                return;
            case Shr5Package.GEBUNDENER_GEIST__GEIST:
                setGeist((Geist)null);
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
            case Shr5Package.GEBUNDENER_GEIST__DIENSTE:
                return dienste != DIENSTE_EDEFAULT;
            case Shr5Package.GEBUNDENER_GEIST__GEIST:
                return geist != null;
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
        result.append(" (dienste: ");
        result.append(dienste);
        result.append(')');
        return result.toString();
    }

} //GebundenerGeistImpl
