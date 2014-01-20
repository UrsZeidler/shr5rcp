/**
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.eclipse.shr5.Initation;
import de.urszeidler.eclipse.shr5.MetaMagie;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.InitationImpl#getStufe <em>Stufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.InitationImpl#getErlernt <em>Erlernt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitationImpl extends MinimalEObjectImpl.Container implements Initation {
	/**
     * The default value of the '{@link #getStufe() <em>Stufe</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStufe()
     * @generated
     * @ordered
     */
	protected static final int STUFE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getStufe() <em>Stufe</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStufe()
     * @generated
     * @ordered
     */
	protected int stufe = STUFE_EDEFAULT;

	/**
     * The cached value of the '{@link #getErlernt() <em>Erlernt</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getErlernt()
     * @generated
     * @ordered
     */
	protected MetaMagie erlernt;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected InitationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.INITATION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getStufe() {
        return stufe;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStufe(int newStufe) {
        int oldStufe = stufe;
        stufe = newStufe;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.INITATION__STUFE, oldStufe, stufe));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MetaMagie getErlernt() {
        if (erlernt != null && erlernt.eIsProxy()) {
            InternalEObject oldErlernt = (InternalEObject)erlernt;
            erlernt = (MetaMagie)eResolveProxy(oldErlernt);
            if (erlernt != oldErlernt) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.INITATION__ERLERNT, oldErlernt, erlernt));
            }
        }
        return erlernt;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MetaMagie basicGetErlernt() {
        return erlernt;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setErlernt(MetaMagie newErlernt) {
        MetaMagie oldErlernt = erlernt;
        erlernt = newErlernt;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.INITATION__ERLERNT, oldErlernt, erlernt));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.INITATION__STUFE:
                return getStufe();
            case Shr5Package.INITATION__ERLERNT:
                if (resolve) return getErlernt();
                return basicGetErlernt();
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
            case Shr5Package.INITATION__STUFE:
                setStufe((Integer)newValue);
                return;
            case Shr5Package.INITATION__ERLERNT:
                setErlernt((MetaMagie)newValue);
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
            case Shr5Package.INITATION__STUFE:
                setStufe(STUFE_EDEFAULT);
                return;
            case Shr5Package.INITATION__ERLERNT:
                setErlernt((MetaMagie)null);
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
            case Shr5Package.INITATION__STUFE:
                return stufe != STUFE_EDEFAULT;
            case Shr5Package.INITATION__ERLERNT:
                return erlernt != null;
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
        result.append(" (stufe: ");
        result.append(stufe);
        result.append(')');
        return result.toString();
    }

} //InitationImpl
