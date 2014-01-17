/**
 */
package de.urszeidler.eclipse.shr5.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.Koerpermods;
import de.urszeidler.eclipse.shr5.Panzerung;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Koerper Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl#getPanzer <em>Panzer</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl#getKoerperMods <em>Koerper Mods</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KoerperPersonaImpl#getEigenschaften <em>Eigenschaften</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class KoerperPersonaImpl extends AbstraktPersonaImpl implements KoerperPersona {
	/**
	 * The default value of the '{@link #getPanzer() <em>Panzer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanzer()
	 * @generated
	 * @ordered
	 */
	protected static final int PANZER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKoerperMods() <em>Koerper Mods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKoerperMods()
	 * @generated
	 * @ordered
	 */
	protected EList<Koerpermods> koerperMods;

	/**
	 * The cached value of the '{@link #getEigenschaften() <em>Eigenschaften</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEigenschaften()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonaEigenschaft> eigenschaften;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KoerperPersonaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shr5Package.Literals.KOERPER_PERSONA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getPanzer() {
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.PANZERUNG__PANZER);
		return getmodWert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Koerpermods> getKoerperMods() {
		if (koerperMods == null) {
			koerperMods = new EObjectContainmentEList<Koerpermods>(Koerpermods.class, this, Shr5Package.KOERPER_PERSONA__KOERPER_MODS);
		}
		return koerperMods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonaEigenschaft> getEigenschaften() {
		if (eigenschaften == null) {
			eigenschaften = new EObjectContainmentEList<PersonaEigenschaft>(PersonaEigenschaft.class, this, Shr5Package.KOERPER_PERSONA__EIGENSCHAFTEN);
		}
		return eigenschaften;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Shr5Package.KOERPER_PERSONA__KOERPER_MODS:
				return ((InternalEList<?>)getKoerperMods()).basicRemove(otherEnd, msgs);
			case Shr5Package.KOERPER_PERSONA__EIGENSCHAFTEN:
				return ((InternalEList<?>)getEigenschaften()).basicRemove(otherEnd, msgs);
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
			case Shr5Package.KOERPER_PERSONA__PANZER:
				return getPanzer();
			case Shr5Package.KOERPER_PERSONA__KOERPER_MODS:
				return getKoerperMods();
			case Shr5Package.KOERPER_PERSONA__EIGENSCHAFTEN:
				return getEigenschaften();
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
			case Shr5Package.KOERPER_PERSONA__KOERPER_MODS:
				getKoerperMods().clear();
				getKoerperMods().addAll((Collection<? extends Koerpermods>)newValue);
				return;
			case Shr5Package.KOERPER_PERSONA__EIGENSCHAFTEN:
				getEigenschaften().clear();
				getEigenschaften().addAll((Collection<? extends PersonaEigenschaft>)newValue);
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
			case Shr5Package.KOERPER_PERSONA__KOERPER_MODS:
				getKoerperMods().clear();
				return;
			case Shr5Package.KOERPER_PERSONA__EIGENSCHAFTEN:
				getEigenschaften().clear();
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
			case Shr5Package.KOERPER_PERSONA__PANZER:
				return getPanzer() != PANZER_EDEFAULT;
			case Shr5Package.KOERPER_PERSONA__KOERPER_MODS:
				return koerperMods != null && !koerperMods.isEmpty();
			case Shr5Package.KOERPER_PERSONA__EIGENSCHAFTEN:
				return eigenschaften != null && !eigenschaften.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Panzerung.class) {
			switch (derivedFeatureID) {
				case Shr5Package.KOERPER_PERSONA__PANZER: return Shr5Package.PANZERUNG__PANZER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Panzerung.class) {
			switch (baseFeatureID) {
				case Shr5Package.PANZERUNG__PANZER: return Shr5Package.KOERPER_PERSONA__PANZER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //KoerperPersonaImpl
