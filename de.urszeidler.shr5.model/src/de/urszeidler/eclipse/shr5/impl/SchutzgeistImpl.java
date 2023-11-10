/**
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.Schutzgeist;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schutzgeist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SchutzgeistImpl#getVorteile <em>Vorteile</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SchutzgeistImpl#getNachteile <em>Nachteile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchutzgeistImpl extends MagischeModsImpl implements Schutzgeist {
	/**
     * The default value of the '{@link #getVorteile() <em>Vorteile</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVorteile()
     * @generated
     * @ordered
     */
	protected static final String VORTEILE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getVorteile() <em>Vorteile</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVorteile()
     * @generated
     * @ordered
     */
	protected String vorteile = VORTEILE_EDEFAULT;

	/**
     * The default value of the '{@link #getNachteile() <em>Nachteile</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNachteile()
     * @generated
     * @ordered
     */
	protected static final String NACHTEILE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getNachteile() <em>Nachteile</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNachteile()
     * @generated
     * @ordered
     */
	protected String nachteile = NACHTEILE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SchutzgeistImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.SCHUTZGEIST;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getVorteile() {
        return vorteile;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setVorteile(String newVorteile) {
        String oldVorteile = vorteile;
        vorteile = newVorteile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SCHUTZGEIST__VORTEILE, oldVorteile, vorteile));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getNachteile() {
        return nachteile;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setNachteile(String newNachteile) {
        String oldNachteile = nachteile;
        nachteile = newNachteile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SCHUTZGEIST__NACHTEILE, oldNachteile, nachteile));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.SCHUTZGEIST__VORTEILE:
                return getVorteile();
            case Shr5Package.SCHUTZGEIST__NACHTEILE:
                return getNachteile();
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
            case Shr5Package.SCHUTZGEIST__VORTEILE:
                setVorteile((String)newValue);
                return;
            case Shr5Package.SCHUTZGEIST__NACHTEILE:
                setNachteile((String)newValue);
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
            case Shr5Package.SCHUTZGEIST__VORTEILE:
                setVorteile(VORTEILE_EDEFAULT);
                return;
            case Shr5Package.SCHUTZGEIST__NACHTEILE:
                setNachteile(NACHTEILE_EDEFAULT);
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
            case Shr5Package.SCHUTZGEIST__VORTEILE:
                return VORTEILE_EDEFAULT == null ? vorteile != null : !VORTEILE_EDEFAULT.equals(vorteile);
            case Shr5Package.SCHUTZGEIST__NACHTEILE:
                return NACHTEILE_EDEFAULT == null ? nachteile != null : !NACHTEILE_EDEFAULT.equals(nachteile);
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
        result.append(" (vorteile: ");
        result.append(vorteile);
        result.append(", nachteile: ");
        result.append(nachteile);
        result.append(')');
        return result.toString();
    }

} //SchutzgeistImpl
