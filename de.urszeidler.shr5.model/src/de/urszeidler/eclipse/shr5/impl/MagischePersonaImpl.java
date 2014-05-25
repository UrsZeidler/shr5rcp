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
import de.urszeidler.eclipse.shr5.FokusBinding;
import de.urszeidler.eclipse.shr5.Initation;
import de.urszeidler.eclipse.shr5.MagischePersona;
import de.urszeidler.eclipse.shr5.Schutzgeist;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Magische Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagischePersonaImpl#getMagie <em>Magie</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagischePersonaImpl#getInitationen <em>Initationen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagischePersonaImpl#getMagieBasis <em>Magie Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagischePersonaImpl#getBoundFoki <em>Bound Foki</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.MagischePersonaImpl#getMentor <em>Mentor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MagischePersonaImpl extends KoerperPersonaImpl implements MagischePersona {
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
     * The cached value of the '{@link #getBoundFoki() <em>Bound Foki</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBoundFoki()
     * @generated
     * @ordered
     */
    protected EList<FokusBinding> boundFoki;

    /**
     * The cached value of the '{@link #getMentor() <em>Mentor</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMentor()
     * @generated
     * @ordered
     */
	protected Schutzgeist mentor;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MagischePersonaImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.MAGISCHE_PERSONA;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getMagie() {
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
		return getMagieBasis() + getmodWert;
	}


	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Initation> getInitationen() {
        if (initationen == null) {
            initationen = new EObjectContainmentEList<Initation>(Initation.class, this, Shr5Package.MAGISCHE_PERSONA__INITATIONEN);
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MAGISCHE_PERSONA__MAGIE_BASIS, oldMagieBasis, magieBasis));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FokusBinding> getBoundFoki() {
        if (boundFoki == null) {
            boundFoki = new EObjectContainmentEList<FokusBinding>(FokusBinding.class, this, Shr5Package.MAGISCHE_PERSONA__BOUND_FOKI);
        }
        return boundFoki;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Schutzgeist getMentor() {
        if (mentor != null && mentor.eIsProxy()) {
            InternalEObject oldMentor = (InternalEObject)mentor;
            mentor = (Schutzgeist)eResolveProxy(oldMentor);
            if (mentor != oldMentor) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.MAGISCHE_PERSONA__MENTOR, oldMentor, mentor));
            }
        }
        return mentor;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Schutzgeist basicGetMentor() {
        return mentor;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMentor(Schutzgeist newMentor) {
        Schutzgeist oldMentor = mentor;
        mentor = newMentor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.MAGISCHE_PERSONA__MENTOR, oldMentor, mentor));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.MAGISCHE_PERSONA__INITATIONEN:
                return ((InternalEList<?>)getInitationen()).basicRemove(otherEnd, msgs);
            case Shr5Package.MAGISCHE_PERSONA__BOUND_FOKI:
                return ((InternalEList<?>)getBoundFoki()).basicRemove(otherEnd, msgs);
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
            case Shr5Package.MAGISCHE_PERSONA__MAGIE:
                return getMagie();
            case Shr5Package.MAGISCHE_PERSONA__INITATIONEN:
                return getInitationen();
            case Shr5Package.MAGISCHE_PERSONA__MAGIE_BASIS:
                return getMagieBasis();
            case Shr5Package.MAGISCHE_PERSONA__BOUND_FOKI:
                return getBoundFoki();
            case Shr5Package.MAGISCHE_PERSONA__MENTOR:
                if (resolve) return getMentor();
                return basicGetMentor();
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
            case Shr5Package.MAGISCHE_PERSONA__INITATIONEN:
                getInitationen().clear();
                getInitationen().addAll((Collection<? extends Initation>)newValue);
                return;
            case Shr5Package.MAGISCHE_PERSONA__MAGIE_BASIS:
                setMagieBasis((Integer)newValue);
                return;
            case Shr5Package.MAGISCHE_PERSONA__BOUND_FOKI:
                getBoundFoki().clear();
                getBoundFoki().addAll((Collection<? extends FokusBinding>)newValue);
                return;
            case Shr5Package.MAGISCHE_PERSONA__MENTOR:
                setMentor((Schutzgeist)newValue);
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
            case Shr5Package.MAGISCHE_PERSONA__INITATIONEN:
                getInitationen().clear();
                return;
            case Shr5Package.MAGISCHE_PERSONA__MAGIE_BASIS:
                setMagieBasis(MAGIE_BASIS_EDEFAULT);
                return;
            case Shr5Package.MAGISCHE_PERSONA__BOUND_FOKI:
                getBoundFoki().clear();
                return;
            case Shr5Package.MAGISCHE_PERSONA__MENTOR:
                setMentor((Schutzgeist)null);
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
            case Shr5Package.MAGISCHE_PERSONA__MAGIE:
                return getMagie() != MAGIE_EDEFAULT;
            case Shr5Package.MAGISCHE_PERSONA__INITATIONEN:
                return initationen != null && !initationen.isEmpty();
            case Shr5Package.MAGISCHE_PERSONA__MAGIE_BASIS:
                return magieBasis != MAGIE_BASIS_EDEFAULT;
            case Shr5Package.MAGISCHE_PERSONA__BOUND_FOKI:
                return boundFoki != null && !boundFoki.isEmpty();
            case Shr5Package.MAGISCHE_PERSONA__MENTOR:
                return mentor != null;
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
                case Shr5Package.MAGISCHE_PERSONA__MAGIE: return Shr5Package.BASE_MAGISCHE_PERSONA__MAGIE;
                case Shr5Package.MAGISCHE_PERSONA__INITATIONEN: return Shr5Package.BASE_MAGISCHE_PERSONA__INITATIONEN;
                case Shr5Package.MAGISCHE_PERSONA__MAGIE_BASIS: return Shr5Package.BASE_MAGISCHE_PERSONA__MAGIE_BASIS;
                case Shr5Package.MAGISCHE_PERSONA__BOUND_FOKI: return Shr5Package.BASE_MAGISCHE_PERSONA__BOUND_FOKI;
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
                case Shr5Package.BASE_MAGISCHE_PERSONA__MAGIE: return Shr5Package.MAGISCHE_PERSONA__MAGIE;
                case Shr5Package.BASE_MAGISCHE_PERSONA__INITATIONEN: return Shr5Package.MAGISCHE_PERSONA__INITATIONEN;
                case Shr5Package.BASE_MAGISCHE_PERSONA__MAGIE_BASIS: return Shr5Package.MAGISCHE_PERSONA__MAGIE_BASIS;
                case Shr5Package.BASE_MAGISCHE_PERSONA__BOUND_FOKI: return Shr5Package.MAGISCHE_PERSONA__BOUND_FOKI;
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

} //MagischePersonaImpl
