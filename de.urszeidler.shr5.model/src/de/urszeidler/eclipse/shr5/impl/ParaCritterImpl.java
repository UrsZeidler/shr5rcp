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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.BaseMagischePersona;
import de.urszeidler.eclipse.shr5.Initation;
import de.urszeidler.eclipse.shr5.ParaCritter;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Para Critter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ParaCritterImpl#getMagie <em>Magie</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ParaCritterImpl#getInitationen <em>Initationen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ParaCritterImpl#getMagieBasis <em>Magie Basis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParaCritterImpl extends MudanCritterImpl implements ParaCritter {
	/**
	 * The default value of the '{@link #getMagie() <em>Magie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagie()
	 * @generated
	 * @ordered
	 */
	protected static final int MAGIE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitationen() <em>Initationen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitationen()
	 * @generated
	 * @ordered
	 */
	protected EList<Initation> initationen;

	/**
	 * The default value of the '{@link #getMagieBasis() <em>Magie Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagieBasis()
	 * @generated
	 * @ordered
	 */
	protected static final int MAGIE_BASIS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMagieBasis() <em>Magie Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagieBasis()
	 * @generated
	 * @ordered
	 */
	protected int magieBasis = MAGIE_BASIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParaCritterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shr5Package.Literals.PARA_CRITTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getMagie() {
		return getEssenz()/100;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void setMagie(int newMagie) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Initation> getInitationen() {
		if (initationen == null) {
			initationen = new EObjectContainmentEList<Initation>(Initation.class, this, Shr5Package.PARA_CRITTER__INITATIONEN);
		}
		return initationen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMagieBasis() {
		return magieBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMagieBasis(int newMagieBasis) {
		int oldMagieBasis = magieBasis;
		magieBasis = newMagieBasis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.PARA_CRITTER__MAGIE_BASIS, oldMagieBasis, magieBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Shr5Package.PARA_CRITTER__INITATIONEN:
				return ((InternalEList<?>)getInitationen()).basicRemove(otherEnd, msgs);
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
			case Shr5Package.PARA_CRITTER__MAGIE:
				return getMagie();
			case Shr5Package.PARA_CRITTER__INITATIONEN:
				return getInitationen();
			case Shr5Package.PARA_CRITTER__MAGIE_BASIS:
				return getMagieBasis();
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
			case Shr5Package.PARA_CRITTER__INITATIONEN:
				getInitationen().clear();
				getInitationen().addAll((Collection<? extends Initation>)newValue);
				return;
			case Shr5Package.PARA_CRITTER__MAGIE_BASIS:
				setMagieBasis((Integer)newValue);
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
			case Shr5Package.PARA_CRITTER__INITATIONEN:
				getInitationen().clear();
				return;
			case Shr5Package.PARA_CRITTER__MAGIE_BASIS:
				setMagieBasis(MAGIE_BASIS_EDEFAULT);
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
			case Shr5Package.PARA_CRITTER__MAGIE:
				return getMagie() != MAGIE_EDEFAULT;
			case Shr5Package.PARA_CRITTER__INITATIONEN:
				return initationen != null && !initationen.isEmpty();
			case Shr5Package.PARA_CRITTER__MAGIE_BASIS:
				return magieBasis != MAGIE_BASIS_EDEFAULT;
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
		if (baseClass == BaseMagischePersona.class) {
			switch (derivedFeatureID) {
				case Shr5Package.PARA_CRITTER__MAGIE: return Shr5Package.BASE_MAGISCHE_PERSONA__MAGIE;
				case Shr5Package.PARA_CRITTER__INITATIONEN: return Shr5Package.BASE_MAGISCHE_PERSONA__INITATIONEN;
				case Shr5Package.PARA_CRITTER__MAGIE_BASIS: return Shr5Package.BASE_MAGISCHE_PERSONA__MAGIE_BASIS;
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
		if (baseClass == BaseMagischePersona.class) {
			switch (baseFeatureID) {
				case Shr5Package.BASE_MAGISCHE_PERSONA__MAGIE: return Shr5Package.PARA_CRITTER__MAGIE;
				case Shr5Package.BASE_MAGISCHE_PERSONA__INITATIONEN: return Shr5Package.PARA_CRITTER__INITATIONEN;
				case Shr5Package.BASE_MAGISCHE_PERSONA__MAGIE_BASIS: return Shr5Package.PARA_CRITTER__MAGIE_BASIS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (magieBasis: ");
		result.append(magieBasis);
		result.append(')');
		return result.toString();
	}

} //ParaCritterImpl
