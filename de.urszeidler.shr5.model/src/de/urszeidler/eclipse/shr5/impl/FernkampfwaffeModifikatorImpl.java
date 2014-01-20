/**
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator;
import de.urszeidler.eclipse.shr5.FeuwerwaffenErweiterung;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fernkampfwaffe Modifikator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FernkampfwaffeModifikatorImpl#getEp <em>Ep</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FernkampfwaffeModifikatorImpl extends AbstraktModifikatorenImpl implements FernkampfwaffeModifikator {
	/**
     * The default value of the '{@link #getEp() <em>Ep</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEp()
     * @generated
     * @ordered
     */
	protected static final FeuwerwaffenErweiterung EP_EDEFAULT = FeuwerwaffenErweiterung.LAUF;

	/**
     * The cached value of the '{@link #getEp() <em>Ep</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEp()
     * @generated
     * @ordered
     */
	protected FeuwerwaffenErweiterung ep = EP_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FernkampfwaffeModifikatorImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.FERNKAMPFWAFFE_MODIFIKATOR;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FeuwerwaffenErweiterung getEp() {
        return ep;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setEp(FeuwerwaffenErweiterung newEp) {
        FeuwerwaffenErweiterung oldEp = ep;
        ep = newEp == null ? EP_EDEFAULT : newEp;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__EP, oldEp, ep));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__EP:
                return getEp();
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
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__EP:
                setEp((FeuwerwaffenErweiterung)newValue);
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
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__EP:
                setEp(EP_EDEFAULT);
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
            case Shr5Package.FERNKAMPFWAFFE_MODIFIKATOR__EP:
                return ep != EP_EDEFAULT;
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
        result.append(" (ep: ");
        result.append(ep);
        result.append(')');
        return result.toString();
    }

} //FernkampfwaffeModifikatorImpl
