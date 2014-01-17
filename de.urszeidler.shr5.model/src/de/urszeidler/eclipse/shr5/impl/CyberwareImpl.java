/**
 */
package de.urszeidler.eclipse.shr5.impl;

import java.math.BigDecimal;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Cyberware;
import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cyberware</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberwareImpl#getWert <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberwareImpl#getVerfuegbarkeit <em>Verfuegbarkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberwareImpl#getPersona <em>Persona</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.CyberwareImpl#getEinbau <em>Einbau</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CyberwareImpl extends KoerpermodsImpl implements Cyberware {
	/**
	 * The default value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal WERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal wert = WERT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerfuegbarkeit() <em>Verfuegbarkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerfuegbarkeit()
	 * @generated
	 * @ordered
	 */
	protected static final String VERFUEGBARKEIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerfuegbarkeit() <em>Verfuegbarkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerfuegbarkeit()
	 * @generated
	 * @ordered
	 */
	protected String verfuegbarkeit = VERFUEGBARKEIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersona() <em>Persona</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersona()
	 * @generated
	 * @ordered
	 */
	protected AbstraktPersona persona;

	/**
	 * The cached value of the '{@link #getEinbau() <em>Einbau</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinbau()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstraktGegenstand> einbau;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CyberwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shr5Package.Literals.CYBERWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getWert() {
		return wert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWert(BigDecimal newWert) {
		BigDecimal oldWert = wert;
		wert = newWert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERWARE__WERT, oldWert, wert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVerfuegbarkeit() {
		return verfuegbarkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerfuegbarkeit(String newVerfuegbarkeit) {
		String oldVerfuegbarkeit = verfuegbarkeit;
		verfuegbarkeit = newVerfuegbarkeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERWARE__VERFUEGBARKEIT, oldVerfuegbarkeit, verfuegbarkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstraktPersona getPersona() {
		if (persona != null && persona.eIsProxy()) {
			InternalEObject oldPersona = (InternalEObject)persona;
			persona = (AbstraktPersona)eResolveProxy(oldPersona);
			if (persona != oldPersona) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.CYBERWARE__PERSONA, oldPersona, persona));
			}
		}
		return persona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstraktPersona basicGetPersona() {
		return persona;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersona(AbstraktPersona newPersona) {
		AbstraktPersona oldPersona = persona;
		persona = newPersona;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.CYBERWARE__PERSONA, oldPersona, persona));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstraktGegenstand> getEinbau() {
		if (einbau == null) {
			einbau = new EObjectContainmentEList<AbstraktGegenstand>(AbstraktGegenstand.class, this, Shr5Package.CYBERWARE__EINBAU);
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
			case Shr5Package.CYBERWARE__EINBAU:
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
			case Shr5Package.CYBERWARE__WERT:
				return getWert();
			case Shr5Package.CYBERWARE__VERFUEGBARKEIT:
				return getVerfuegbarkeit();
			case Shr5Package.CYBERWARE__PERSONA:
				if (resolve) return getPersona();
				return basicGetPersona();
			case Shr5Package.CYBERWARE__EINBAU:
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
			case Shr5Package.CYBERWARE__WERT:
				setWert((BigDecimal)newValue);
				return;
			case Shr5Package.CYBERWARE__VERFUEGBARKEIT:
				setVerfuegbarkeit((String)newValue);
				return;
			case Shr5Package.CYBERWARE__PERSONA:
				setPersona((AbstraktPersona)newValue);
				return;
			case Shr5Package.CYBERWARE__EINBAU:
				getEinbau().clear();
				getEinbau().addAll((Collection<? extends AbstraktGegenstand>)newValue);
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
			case Shr5Package.CYBERWARE__WERT:
				setWert(WERT_EDEFAULT);
				return;
			case Shr5Package.CYBERWARE__VERFUEGBARKEIT:
				setVerfuegbarkeit(VERFUEGBARKEIT_EDEFAULT);
				return;
			case Shr5Package.CYBERWARE__PERSONA:
				setPersona((AbstraktPersona)null);
				return;
			case Shr5Package.CYBERWARE__EINBAU:
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
			case Shr5Package.CYBERWARE__WERT:
				return WERT_EDEFAULT == null ? wert != null : !WERT_EDEFAULT.equals(wert);
			case Shr5Package.CYBERWARE__VERFUEGBARKEIT:
				return VERFUEGBARKEIT_EDEFAULT == null ? verfuegbarkeit != null : !VERFUEGBARKEIT_EDEFAULT.equals(verfuegbarkeit);
			case Shr5Package.CYBERWARE__PERSONA:
				return persona != null;
			case Shr5Package.CYBERWARE__EINBAU:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GeldWert.class) {
			switch (derivedFeatureID) {
				case Shr5Package.CYBERWARE__WERT: return Shr5Package.GELD_WERT__WERT;
				case Shr5Package.CYBERWARE__VERFUEGBARKEIT: return Shr5Package.GELD_WERT__VERFUEGBARKEIT;
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
		if (baseClass == GeldWert.class) {
			switch (baseFeatureID) {
				case Shr5Package.GELD_WERT__WERT: return Shr5Package.CYBERWARE__WERT;
				case Shr5Package.GELD_WERT__VERFUEGBARKEIT: return Shr5Package.CYBERWARE__VERFUEGBARKEIT;
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
		result.append(" (wert: ");
		result.append(wert);
		result.append(", verfuegbarkeit: ");
		result.append(verfuegbarkeit);
		result.append(')');
		return result.toString();
	}

} //CyberwareImpl
