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

import de.urszeidler.eclipse.shr5.Echo;
import de.urszeidler.eclipse.shr5.PersonaKomplexForm;
import de.urszeidler.eclipse.shr5.ResonanzPersona;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Technomancer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technomancer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.TechnomancerImpl#getResonanz <em>Resonanz</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.TechnomancerImpl#getGeraetestufe <em>Geraetestufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.TechnomancerImpl#getAngriff <em>Angriff</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.TechnomancerImpl#getSchleicher <em>Schleicher</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.TechnomancerImpl#getDatenverarbeitung <em>Datenverarbeitung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.TechnomancerImpl#getFirewall <em>Firewall</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.TechnomancerImpl#getResonanzBasis <em>Resonanz Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.TechnomancerImpl#getComplexForms <em>Complex Forms</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.TechnomancerImpl#getEchos <em>Echos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechnomancerImpl extends KoerperPersonaImpl implements Technomancer {
	/**
     * The default value of the '{@link #getResonanz() <em>Resonanz</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResonanz()
     * @generated
     * @ordered
     */
	protected static final int RESONANZ_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getGeraetestufe() <em>Geraetestufe</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGeraetestufe()
     * @generated
     * @ordered
     */
	protected static final int GERAETESTUFE_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getAngriff() <em>Angriff</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAngriff()
     * @generated
     * @ordered
     */
	protected static final int ANGRIFF_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getSchleicher() <em>Schleicher</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSchleicher()
     * @generated
     * @ordered
     */
	protected static final int SCHLEICHER_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getDatenverarbeitung() <em>Datenverarbeitung</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDatenverarbeitung()
     * @generated
     * @ordered
     */
	protected static final int DATENVERARBEITUNG_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getFirewall() <em>Firewall</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFirewall()
     * @generated
     * @ordered
     */
	protected static final int FIREWALL_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getResonanzBasis() <em>Resonanz Basis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResonanzBasis()
     * @generated
     * @ordered
     */
	protected static final int RESONANZ_BASIS_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getResonanzBasis() <em>Resonanz Basis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResonanzBasis()
     * @generated
     * @ordered
     */
	protected int resonanzBasis = RESONANZ_BASIS_EDEFAULT;

	/**
     * The cached value of the '{@link #getComplexForms() <em>Complex Forms</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getComplexForms()
     * @generated
     * @ordered
     */
	protected EList<PersonaKomplexForm> complexForms;

	/**
     * The cached value of the '{@link #getEchos() <em>Echos</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEchos()
     * @generated
     * @ordered
     */
	protected EList<Echo> echos;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TechnomancerImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.TECHNOMANCER;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getResonanz() {
		return getEssenz()/100;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getGeraetestufe() {
		return getResonanz();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getAngriff() {
		return getCharisma();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getSchleicher() {
		return getIntuition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getDatenverarbeitung() {
		return getLogik();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getFirewall() {
		return getWillenskraft();
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getResonanzBasis() {
        return resonanzBasis;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setResonanzBasis(int newResonanzBasis) {
        int oldResonanzBasis = resonanzBasis;
        resonanzBasis = newResonanzBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.TECHNOMANCER__RESONANZ_BASIS, oldResonanzBasis, resonanzBasis));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PersonaKomplexForm> getComplexForms() {
        if (complexForms == null) {
            complexForms = new EObjectContainmentEList<PersonaKomplexForm>(PersonaKomplexForm.class, this, Shr5Package.TECHNOMANCER__COMPLEX_FORMS);
        }
        return complexForms;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Echo> getEchos() {
        if (echos == null) {
            echos = new EObjectContainmentEList<Echo>(Echo.class, this, Shr5Package.TECHNOMANCER__ECHOS);
        }
        return echos;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.TECHNOMANCER__COMPLEX_FORMS:
                return ((InternalEList<?>)getComplexForms()).basicRemove(otherEnd, msgs);
            case Shr5Package.TECHNOMANCER__ECHOS:
                return ((InternalEList<?>)getEchos()).basicRemove(otherEnd, msgs);
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
            case Shr5Package.TECHNOMANCER__RESONANZ:
                return getResonanz();
            case Shr5Package.TECHNOMANCER__GERAETESTUFE:
                return getGeraetestufe();
            case Shr5Package.TECHNOMANCER__ANGRIFF:
                return getAngriff();
            case Shr5Package.TECHNOMANCER__SCHLEICHER:
                return getSchleicher();
            case Shr5Package.TECHNOMANCER__DATENVERARBEITUNG:
                return getDatenverarbeitung();
            case Shr5Package.TECHNOMANCER__FIREWALL:
                return getFirewall();
            case Shr5Package.TECHNOMANCER__RESONANZ_BASIS:
                return getResonanzBasis();
            case Shr5Package.TECHNOMANCER__COMPLEX_FORMS:
                return getComplexForms();
            case Shr5Package.TECHNOMANCER__ECHOS:
                return getEchos();
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
            case Shr5Package.TECHNOMANCER__RESONANZ_BASIS:
                setResonanzBasis((Integer)newValue);
                return;
            case Shr5Package.TECHNOMANCER__COMPLEX_FORMS:
                getComplexForms().clear();
                getComplexForms().addAll((Collection<? extends PersonaKomplexForm>)newValue);
                return;
            case Shr5Package.TECHNOMANCER__ECHOS:
                getEchos().clear();
                getEchos().addAll((Collection<? extends Echo>)newValue);
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
            case Shr5Package.TECHNOMANCER__RESONANZ_BASIS:
                setResonanzBasis(RESONANZ_BASIS_EDEFAULT);
                return;
            case Shr5Package.TECHNOMANCER__COMPLEX_FORMS:
                getComplexForms().clear();
                return;
            case Shr5Package.TECHNOMANCER__ECHOS:
                getEchos().clear();
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
            case Shr5Package.TECHNOMANCER__RESONANZ:
                return getResonanz() != RESONANZ_EDEFAULT;
            case Shr5Package.TECHNOMANCER__GERAETESTUFE:
                return getGeraetestufe() != GERAETESTUFE_EDEFAULT;
            case Shr5Package.TECHNOMANCER__ANGRIFF:
                return getAngriff() != ANGRIFF_EDEFAULT;
            case Shr5Package.TECHNOMANCER__SCHLEICHER:
                return getSchleicher() != SCHLEICHER_EDEFAULT;
            case Shr5Package.TECHNOMANCER__DATENVERARBEITUNG:
                return getDatenverarbeitung() != DATENVERARBEITUNG_EDEFAULT;
            case Shr5Package.TECHNOMANCER__FIREWALL:
                return getFirewall() != FIREWALL_EDEFAULT;
            case Shr5Package.TECHNOMANCER__RESONANZ_BASIS:
                return resonanzBasis != RESONANZ_BASIS_EDEFAULT;
            case Shr5Package.TECHNOMANCER__COMPLEX_FORMS:
                return complexForms != null && !complexForms.isEmpty();
            case Shr5Package.TECHNOMANCER__ECHOS:
                return echos != null && !echos.isEmpty();
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
        if (baseClass == ResonanzPersona.class) {
            switch (derivedFeatureID) {
                case Shr5Package.TECHNOMANCER__RESONANZ: return Shr5Package.RESONANZ_PERSONA__RESONANZ;
                case Shr5Package.TECHNOMANCER__GERAETESTUFE: return Shr5Package.RESONANZ_PERSONA__GERAETESTUFE;
                case Shr5Package.TECHNOMANCER__ANGRIFF: return Shr5Package.RESONANZ_PERSONA__ANGRIFF;
                case Shr5Package.TECHNOMANCER__SCHLEICHER: return Shr5Package.RESONANZ_PERSONA__SCHLEICHER;
                case Shr5Package.TECHNOMANCER__DATENVERARBEITUNG: return Shr5Package.RESONANZ_PERSONA__DATENVERARBEITUNG;
                case Shr5Package.TECHNOMANCER__FIREWALL: return Shr5Package.RESONANZ_PERSONA__FIREWALL;
                case Shr5Package.TECHNOMANCER__RESONANZ_BASIS: return Shr5Package.RESONANZ_PERSONA__RESONANZ_BASIS;
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
        if (baseClass == ResonanzPersona.class) {
            switch (baseFeatureID) {
                case Shr5Package.RESONANZ_PERSONA__RESONANZ: return Shr5Package.TECHNOMANCER__RESONANZ;
                case Shr5Package.RESONANZ_PERSONA__GERAETESTUFE: return Shr5Package.TECHNOMANCER__GERAETESTUFE;
                case Shr5Package.RESONANZ_PERSONA__ANGRIFF: return Shr5Package.TECHNOMANCER__ANGRIFF;
                case Shr5Package.RESONANZ_PERSONA__SCHLEICHER: return Shr5Package.TECHNOMANCER__SCHLEICHER;
                case Shr5Package.RESONANZ_PERSONA__DATENVERARBEITUNG: return Shr5Package.TECHNOMANCER__DATENVERARBEITUNG;
                case Shr5Package.RESONANZ_PERSONA__FIREWALL: return Shr5Package.TECHNOMANCER__FIREWALL;
                case Shr5Package.RESONANZ_PERSONA__RESONANZ_BASIS: return Shr5Package.TECHNOMANCER__RESONANZ_BASIS;
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
        result.append(" (resonanzBasis: ");
        result.append(resonanzBasis);
        result.append(')');
        return result.toString();
    }

} //TechnomancerImpl
