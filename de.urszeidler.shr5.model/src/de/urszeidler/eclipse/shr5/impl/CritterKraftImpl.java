/**
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.CritterDauer;
import de.urszeidler.eclipse.shr5.CritterHandlung;
import de.urszeidler.eclipse.shr5.CritterKraft;
import de.urszeidler.eclipse.shr5.CritterReichweite;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ZauberArt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Critter Kraft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CritterKraftImpl#getArt <em>Art</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CritterKraftImpl#getHandlung <em>Handlung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CritterKraftImpl#getReichweite <em>Reichweite</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CritterKraftImpl#getDauer <em>Dauer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CritterKraftImpl extends MagischeModsImpl implements CritterKraft {
	/**
	 * The default value of the '{@link #getArt() <em>Art</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArt()
	 * @generated
	 * @ordered
	 */
	protected static final ZauberArt ART_EDEFAULT = ZauberArt.MANA;

	/**
	 * The cached value of the '{@link #getArt() <em>Art</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArt()
	 * @generated
	 * @ordered
	 */
	protected ZauberArt art = ART_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandlung() <em>Handlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlung()
	 * @generated
	 * @ordered
	 */
	protected static final CritterHandlung HANDLUNG_EDEFAULT = CritterHandlung.KOMPLEX;

	/**
	 * The cached value of the '{@link #getHandlung() <em>Handlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlung()
	 * @generated
	 * @ordered
	 */
	protected CritterHandlung handlung = HANDLUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getReichweite() <em>Reichweite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReichweite()
	 * @generated
	 * @ordered
	 */
	protected static final CritterReichweite REICHWEITE_EDEFAULT = CritterReichweite.BLICKFELD;

	/**
	 * The cached value of the '{@link #getReichweite() <em>Reichweite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReichweite()
	 * @generated
	 * @ordered
	 */
	protected CritterReichweite reichweite = REICHWEITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDauer() <em>Dauer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDauer()
	 * @generated
	 * @ordered
	 */
	protected static final CritterDauer DAUER_EDEFAULT = CritterDauer.IMMER;

	/**
	 * The cached value of the '{@link #getDauer() <em>Dauer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDauer()
	 * @generated
	 * @ordered
	 */
	protected CritterDauer dauer = DAUER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CritterKraftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shr5Package.Literals.CRITTER_KRAFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZauberArt getArt() {
		return art;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArt(ZauberArt newArt) {
		ZauberArt oldArt = art;
		art = newArt == null ? ART_EDEFAULT : newArt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CRITTER_KRAFT__ART, oldArt, art));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CritterHandlung getHandlung() {
		return handlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlung(CritterHandlung newHandlung) {
		CritterHandlung oldHandlung = handlung;
		handlung = newHandlung == null ? HANDLUNG_EDEFAULT : newHandlung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CRITTER_KRAFT__HANDLUNG, oldHandlung, handlung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CritterReichweite getReichweite() {
		return reichweite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReichweite(CritterReichweite newReichweite) {
		CritterReichweite oldReichweite = reichweite;
		reichweite = newReichweite == null ? REICHWEITE_EDEFAULT : newReichweite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CRITTER_KRAFT__REICHWEITE, oldReichweite, reichweite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CritterDauer getDauer() {
		return dauer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDauer(CritterDauer newDauer) {
		CritterDauer oldDauer = dauer;
		dauer = newDauer == null ? DAUER_EDEFAULT : newDauer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CRITTER_KRAFT__DAUER, oldDauer, dauer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shr5Package.CRITTER_KRAFT__ART:
				return getArt();
			case Shr5Package.CRITTER_KRAFT__HANDLUNG:
				return getHandlung();
			case Shr5Package.CRITTER_KRAFT__REICHWEITE:
				return getReichweite();
			case Shr5Package.CRITTER_KRAFT__DAUER:
				return getDauer();
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
			case Shr5Package.CRITTER_KRAFT__ART:
				setArt((ZauberArt)newValue);
				return;
			case Shr5Package.CRITTER_KRAFT__HANDLUNG:
				setHandlung((CritterHandlung)newValue);
				return;
			case Shr5Package.CRITTER_KRAFT__REICHWEITE:
				setReichweite((CritterReichweite)newValue);
				return;
			case Shr5Package.CRITTER_KRAFT__DAUER:
				setDauer((CritterDauer)newValue);
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
			case Shr5Package.CRITTER_KRAFT__ART:
				setArt(ART_EDEFAULT);
				return;
			case Shr5Package.CRITTER_KRAFT__HANDLUNG:
				setHandlung(HANDLUNG_EDEFAULT);
				return;
			case Shr5Package.CRITTER_KRAFT__REICHWEITE:
				setReichweite(REICHWEITE_EDEFAULT);
				return;
			case Shr5Package.CRITTER_KRAFT__DAUER:
				setDauer(DAUER_EDEFAULT);
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
			case Shr5Package.CRITTER_KRAFT__ART:
				return art != ART_EDEFAULT;
			case Shr5Package.CRITTER_KRAFT__HANDLUNG:
				return handlung != HANDLUNG_EDEFAULT;
			case Shr5Package.CRITTER_KRAFT__REICHWEITE:
				return reichweite != REICHWEITE_EDEFAULT;
			case Shr5Package.CRITTER_KRAFT__DAUER:
				return dauer != DAUER_EDEFAULT;
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
		result.append(" (art: ");
		result.append(art);
		result.append(", handlung: ");
		result.append(handlung);
		result.append(", reichweite: ");
		result.append(reichweite);
		result.append(", dauer: ");
		result.append(dauer);
		result.append(')');
		return result.toString();
	}

} //CritterKraftImpl
