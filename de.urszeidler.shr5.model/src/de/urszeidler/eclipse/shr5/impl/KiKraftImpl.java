/**
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ki Kraft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KiKraftImpl#getKraftpunkte <em>Kraftpunkte</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KiKraftImpl extends MagischeModsImpl implements KiKraft {
	/**
     * The default value of the '{@link #getKraftpunkte() <em>Kraftpunkte</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKraftpunkte()
     * @generated
     * @ordered
     */
	protected static final int KRAFTPUNKTE_EDEFAULT = 0;
	/**
     * The cached value of the '{@link #getKraftpunkte() <em>Kraftpunkte</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKraftpunkte()
     * @generated
     * @ordered
     */
	protected int kraftpunkte = KRAFTPUNKTE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected KiKraftImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.KI_KRAFT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getKraftpunkte() {
        return kraftpunkte;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setKraftpunkte(int newKraftpunkte) {
        int oldKraftpunkte = kraftpunkte;
        kraftpunkte = newKraftpunkte;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.KI_KRAFT__KRAFTPUNKTE, oldKraftpunkte, kraftpunkte));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.KI_KRAFT__KRAFTPUNKTE:
                return getKraftpunkte();
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
            case Shr5Package.KI_KRAFT__KRAFTPUNKTE:
                setKraftpunkte((Integer)newValue);
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
            case Shr5Package.KI_KRAFT__KRAFTPUNKTE:
                setKraftpunkte(KRAFTPUNKTE_EDEFAULT);
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
            case Shr5Package.KI_KRAFT__KRAFTPUNKTE:
                return kraftpunkte != KRAFTPUNKTE_EDEFAULT;
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
        result.append(" (kraftpunkte: ");
        result.append(kraftpunkte);
        result.append(')');
        return result.toString();
    }

} //KiKraftImpl
