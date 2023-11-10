/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.MagieFokus;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Magie Fokus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagieFokusImpl#getBindungsFaktor <em>Bindungs Faktor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MagieFokusImpl extends AbstraktFokusImpl implements MagieFokus {
    /**
     * The default value of the '{@link #getBindungsFaktor() <em>Bindungs Faktor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBindungsFaktor()
     * @generated
     * @ordered
     */
    protected static final int BINDUNGS_FAKTOR_EDEFAULT = 0;
    /**
     * The cached value of the '{@link #getBindungsFaktor() <em>Bindungs Faktor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBindungsFaktor()
     * @generated
     * @ordered
     */
    protected int bindungsFaktor = BINDUNGS_FAKTOR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MagieFokusImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.MAGIE_FOKUS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getBindungsFaktor() {
        return bindungsFaktor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public void setBindungsFaktor(int newBindungsFaktor) {
        int oldBindungsFaktor = bindungsFaktor;
        bindungsFaktor = newBindungsFaktor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MAGIE_FOKUS__BINDUNGS_FAKTOR, oldBindungsFaktor, bindungsFaktor));
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MAGIE_FOKUS__BINDUNGSKOSTEN, oldBindungsFaktor, bindungsFaktor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.MAGIE_FOKUS__BINDUNGS_FAKTOR:
                return getBindungsFaktor();
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
            case Shr5Package.MAGIE_FOKUS__BINDUNGS_FAKTOR:
                setBindungsFaktor((Integer)newValue);
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
            case Shr5Package.MAGIE_FOKUS__BINDUNGS_FAKTOR:
                setBindungsFaktor(BINDUNGS_FAKTOR_EDEFAULT);
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
            case Shr5Package.MAGIE_FOKUS__BINDUNGS_FAKTOR:
                return bindungsFaktor != BINDUNGS_FAKTOR_EDEFAULT;
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
        result.append(" (bindungsFaktor: ");
        result.append(bindungsFaktor);
        result.append(')');
        return result.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getBindungskosten() {
        return getStufe()*getBindungsFaktor();
    }

    public void setStufe(int newStufe){
        super.setStufe(newStufe);
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MAGIE_FOKUS__BINDUNGSKOSTEN, 0, 1));
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MAGIE_FOKUS__WERT_VALUE, 0, 1));
    }
    
} //MagieFokusImpl
