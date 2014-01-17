/**
 */
package de.urszeidler.eclipse.shr5.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator;
import de.urszeidler.eclipse.shr5.FeuerModus;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.FeuwerwaffenErweiterung;
import de.urszeidler.eclipse.shr5.MagazinTyp;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feuerwaffe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FeuerwaffeImpl#getMunitionstyp <em>Munitionstyp</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FeuerwaffeImpl#getModie <em>Modie</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FeuerwaffeImpl#getKapazitaet <em>Kapazitaet</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FeuerwaffeImpl#getErweiterung <em>Erweiterung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FeuerwaffeImpl#getRueckstoss <em>Rueckstoss</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FeuerwaffeImpl#getEinbau <em>Einbau</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeuerwaffeImpl extends AbstaktFernKampfwaffeImpl implements Feuerwaffe {
	/**
	 * The default value of the '{@link #getMunitionstyp() <em>Munitionstyp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMunitionstyp()
	 * @generated
	 * @ordered
	 */
	protected static final MagazinTyp MUNITIONSTYP_EDEFAULT = MagazinTyp.CLIP;

	/**
	 * The cached value of the '{@link #getMunitionstyp() <em>Munitionstyp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMunitionstyp()
	 * @generated
	 * @ordered
	 */
	protected MagazinTyp munitionstyp = MUNITIONSTYP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModie() <em>Modie</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModie()
	 * @generated
	 * @ordered
	 */
	protected EList<FeuerModus> modie;

	/**
	 * The default value of the '{@link #getKapazitaet() <em>Kapazitaet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKapazitaet()
	 * @generated
	 * @ordered
	 */
	protected static final int KAPAZITAET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKapazitaet() <em>Kapazitaet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKapazitaet()
	 * @generated
	 * @ordered
	 */
	protected int kapazitaet = KAPAZITAET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErweiterung() <em>Erweiterung</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErweiterung()
	 * @generated
	 * @ordered
	 */
	protected EList<FeuwerwaffenErweiterung> erweiterung;

	/**
	 * The default value of the '{@link #getRueckstoss() <em>Rueckstoss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRueckstoss()
	 * @generated
	 * @ordered
	 */
	protected static final int RUECKSTOSS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRueckstoss() <em>Rueckstoss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRueckstoss()
	 * @generated
	 * @ordered
	 */
	protected int rueckstoss = RUECKSTOSS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEinbau() <em>Einbau</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinbau()
	 * @generated
	 * @ordered
	 */
	protected EList<FernkampfwaffeModifikator> einbau;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeuerwaffeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shr5Package.Literals.FEUERWAFFE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MagazinTyp getMunitionstyp() {
		return munitionstyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMunitionstyp(MagazinTyp newMunitionstyp) {
		MagazinTyp oldMunitionstyp = munitionstyp;
		munitionstyp = newMunitionstyp == null ? MUNITIONSTYP_EDEFAULT : newMunitionstyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FEUERWAFFE__MUNITIONSTYP, oldMunitionstyp, munitionstyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeuerModus> getModie() {
		if (modie == null) {
			modie = new EDataTypeUniqueEList<FeuerModus>(FeuerModus.class, this, Shr5Package.FEUERWAFFE__MODIE);
		}
		return modie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKapazitaet() {
		return kapazitaet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKapazitaet(int newKapazitaet) {
		int oldKapazitaet = kapazitaet;
		kapazitaet = newKapazitaet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FEUERWAFFE__KAPAZITAET, oldKapazitaet, kapazitaet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeuwerwaffenErweiterung> getErweiterung() {
		if (erweiterung == null) {
			erweiterung = new EDataTypeUniqueEList<FeuwerwaffenErweiterung>(FeuwerwaffenErweiterung.class, this, Shr5Package.FEUERWAFFE__ERWEITERUNG);
		}
		return erweiterung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRueckstoss() {
		return rueckstoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRueckstoss(int newRueckstoss) {
		int oldRueckstoss = rueckstoss;
		rueckstoss = newRueckstoss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FEUERWAFFE__RUECKSTOSS, oldRueckstoss, rueckstoss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FernkampfwaffeModifikator> getEinbau() {
		if (einbau == null) {
			einbau = new EObjectContainmentEList<FernkampfwaffeModifikator>(FernkampfwaffeModifikator.class, this, Shr5Package.FEUERWAFFE__EINBAU);
		}
		return einbau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Shr5Package.FEUERWAFFE__EINBAU:
				return ((InternalEList<?>)getEinbau()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shr5Package.FEUERWAFFE__MUNITIONSTYP:
				return getMunitionstyp();
			case Shr5Package.FEUERWAFFE__MODIE:
				return getModie();
			case Shr5Package.FEUERWAFFE__KAPAZITAET:
				return getKapazitaet();
			case Shr5Package.FEUERWAFFE__ERWEITERUNG:
				return getErweiterung();
			case Shr5Package.FEUERWAFFE__RUECKSTOSS:
				return getRueckstoss();
			case Shr5Package.FEUERWAFFE__EINBAU:
				return getEinbau();
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
			case Shr5Package.FEUERWAFFE__MUNITIONSTYP:
				setMunitionstyp((MagazinTyp)newValue);
				return;
			case Shr5Package.FEUERWAFFE__MODIE:
				getModie().clear();
				getModie().addAll((Collection<? extends FeuerModus>)newValue);
				return;
			case Shr5Package.FEUERWAFFE__KAPAZITAET:
				setKapazitaet((Integer)newValue);
				return;
			case Shr5Package.FEUERWAFFE__ERWEITERUNG:
				getErweiterung().clear();
				getErweiterung().addAll((Collection<? extends FeuwerwaffenErweiterung>)newValue);
				return;
			case Shr5Package.FEUERWAFFE__RUECKSTOSS:
				setRueckstoss((Integer)newValue);
				return;
			case Shr5Package.FEUERWAFFE__EINBAU:
				getEinbau().clear();
				getEinbau().addAll((Collection<? extends FernkampfwaffeModifikator>)newValue);
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
			case Shr5Package.FEUERWAFFE__MUNITIONSTYP:
				setMunitionstyp(MUNITIONSTYP_EDEFAULT);
				return;
			case Shr5Package.FEUERWAFFE__MODIE:
				getModie().clear();
				return;
			case Shr5Package.FEUERWAFFE__KAPAZITAET:
				setKapazitaet(KAPAZITAET_EDEFAULT);
				return;
			case Shr5Package.FEUERWAFFE__ERWEITERUNG:
				getErweiterung().clear();
				return;
			case Shr5Package.FEUERWAFFE__RUECKSTOSS:
				setRueckstoss(RUECKSTOSS_EDEFAULT);
				return;
			case Shr5Package.FEUERWAFFE__EINBAU:
				getEinbau().clear();
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
			case Shr5Package.FEUERWAFFE__MUNITIONSTYP:
				return munitionstyp != MUNITIONSTYP_EDEFAULT;
			case Shr5Package.FEUERWAFFE__MODIE:
				return modie != null && !modie.isEmpty();
			case Shr5Package.FEUERWAFFE__KAPAZITAET:
				return kapazitaet != KAPAZITAET_EDEFAULT;
			case Shr5Package.FEUERWAFFE__ERWEITERUNG:
				return erweiterung != null && !erweiterung.isEmpty();
			case Shr5Package.FEUERWAFFE__RUECKSTOSS:
				return rueckstoss != RUECKSTOSS_EDEFAULT;
			case Shr5Package.FEUERWAFFE__EINBAU:
				return einbau != null && !einbau.isEmpty();
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
		result.append(" (munitionstyp: ");
		result.append(munitionstyp);
		result.append(", modie: ");
		result.append(modie);
		result.append(", kapazitaet: ");
		result.append(kapazitaet);
		result.append(", erweiterung: ");
		result.append(erweiterung);
		result.append(", rueckstoss: ");
		result.append(rueckstoss);
		result.append(')');
		return result.toString();
	}

} //FeuerwaffeImpl
