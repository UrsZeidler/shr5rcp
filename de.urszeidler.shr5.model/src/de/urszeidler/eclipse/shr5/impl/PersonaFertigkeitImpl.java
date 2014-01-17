/**
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona Fertigkeit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.PersonaFertigkeitImpl#getFertigkeit <em>Fertigkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.PersonaFertigkeitImpl#getStufe <em>Stufe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonaFertigkeitImpl extends MinimalEObjectImpl.Container implements PersonaFertigkeit {
	/**
	 * The cached value of the '{@link #getFertigkeit() <em>Fertigkeit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFertigkeit()
	 * @generated
	 * @ordered
	 */
	protected Fertigkeit fertigkeit;

	/**
	 * The default value of the '{@link #getStufe() <em>Stufe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStufe()
	 * @generated
	 * @ordered
	 */
	protected static final int STUFE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStufe() <em>Stufe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStufe()
	 * @generated
	 * @ordered
	 */
	protected int stufe = STUFE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonaFertigkeitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shr5Package.Literals.PERSONA_FERTIGKEIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fertigkeit getFertigkeit() {
		if (fertigkeit != null && fertigkeit.eIsProxy()) {
			InternalEObject oldFertigkeit = (InternalEObject)fertigkeit;
			fertigkeit = (Fertigkeit)eResolveProxy(oldFertigkeit);
			if (fertigkeit != oldFertigkeit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.PERSONA_FERTIGKEIT__FERTIGKEIT, oldFertigkeit, fertigkeit));
			}
		}
		return fertigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fertigkeit basicGetFertigkeit() {
		return fertigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFertigkeit(Fertigkeit newFertigkeit) {
		Fertigkeit oldFertigkeit = fertigkeit;
		fertigkeit = newFertigkeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.PERSONA_FERTIGKEIT__FERTIGKEIT, oldFertigkeit, fertigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStufe() {
		return stufe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStufe(int newStufe) {
		int oldStufe = stufe;
		stufe = newStufe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.PERSONA_FERTIGKEIT__STUFE, oldStufe, stufe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shr5Package.PERSONA_FERTIGKEIT__FERTIGKEIT:
				if (resolve) return getFertigkeit();
				return basicGetFertigkeit();
			case Shr5Package.PERSONA_FERTIGKEIT__STUFE:
				return getStufe();
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
			case Shr5Package.PERSONA_FERTIGKEIT__FERTIGKEIT:
				setFertigkeit((Fertigkeit)newValue);
				return;
			case Shr5Package.PERSONA_FERTIGKEIT__STUFE:
				setStufe((Integer)newValue);
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
			case Shr5Package.PERSONA_FERTIGKEIT__FERTIGKEIT:
				setFertigkeit((Fertigkeit)null);
				return;
			case Shr5Package.PERSONA_FERTIGKEIT__STUFE:
				setStufe(STUFE_EDEFAULT);
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
			case Shr5Package.PERSONA_FERTIGKEIT__FERTIGKEIT:
				return fertigkeit != null;
			case Shr5Package.PERSONA_FERTIGKEIT__STUFE:
				return stufe != STUFE_EDEFAULT;
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
		result.append(" (stufe: ");
		result.append(stufe);
		result.append(')');
		return result.toString();
	}

} //PersonaFertigkeitImpl
