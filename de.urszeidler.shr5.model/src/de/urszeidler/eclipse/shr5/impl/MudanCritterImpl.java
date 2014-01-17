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

import de.urszeidler.eclipse.shr5.CritterKraft;
import de.urszeidler.eclipse.shr5.MudanCritter;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mudan Critter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MudanCritterImpl#getKraefte <em>Kraefte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MudanCritterImpl extends KoerperPersonaImpl implements MudanCritter {
	/**
	 * The cached value of the '{@link #getKraefte() <em>Kraefte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKraefte()
	 * @generated
	 * @ordered
	 */
	protected EList<CritterKraft> kraefte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MudanCritterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shr5Package.Literals.MUDAN_CRITTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CritterKraft> getKraefte() {
		if (kraefte == null) {
			kraefte = new EObjectContainmentEList<CritterKraft>(CritterKraft.class, this, Shr5Package.MUDAN_CRITTER__KRAEFTE);
		}
		return kraefte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Shr5Package.MUDAN_CRITTER__KRAEFTE:
				return ((InternalEList<?>)getKraefte()).basicRemove(otherEnd, msgs);
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
			case Shr5Package.MUDAN_CRITTER__KRAEFTE:
				return getKraefte();
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
			case Shr5Package.MUDAN_CRITTER__KRAEFTE:
				getKraefte().clear();
				getKraefte().addAll((Collection<? extends CritterKraft>)newValue);
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
			case Shr5Package.MUDAN_CRITTER__KRAEFTE:
				getKraefte().clear();
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
			case Shr5Package.MUDAN_CRITTER__KRAEFTE:
				return kraefte != null && !kraefte.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MudanCritterImpl
