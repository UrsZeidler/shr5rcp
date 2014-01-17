/**
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona Fertigkeits Gruppe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.PersonaFertigkeitsGruppeImpl#getGruppe <em>Gruppe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.PersonaFertigkeitsGruppeImpl#getStufe <em>Stufe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonaFertigkeitsGruppeImpl extends MinimalEObjectImpl.Container implements PersonaFertigkeitsGruppe {
	/**
	 * The cached value of the '{@link #getGruppe() <em>Gruppe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGruppe()
	 * @generated
	 * @ordered
	 */
	protected FertigkeitsGruppe gruppe;

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
	protected PersonaFertigkeitsGruppeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shr5Package.Literals.PERSONA_FERTIGKEITS_GRUPPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FertigkeitsGruppe getGruppe() {
		if (gruppe != null && gruppe.eIsProxy()) {
			InternalEObject oldGruppe = (InternalEObject)gruppe;
			gruppe = (FertigkeitsGruppe)eResolveProxy(oldGruppe);
			if (gruppe != oldGruppe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.PERSONA_FERTIGKEITS_GRUPPE__GRUPPE, oldGruppe, gruppe));
			}
		}
		return gruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FertigkeitsGruppe basicGetGruppe() {
		return gruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGruppe(FertigkeitsGruppe newGruppe) {
		FertigkeitsGruppe oldGruppe = gruppe;
		gruppe = newGruppe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.PERSONA_FERTIGKEITS_GRUPPE__GRUPPE, oldGruppe, gruppe));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.PERSONA_FERTIGKEITS_GRUPPE__STUFE, oldStufe, stufe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shr5Package.PERSONA_FERTIGKEITS_GRUPPE__GRUPPE:
				if (resolve) return getGruppe();
				return basicGetGruppe();
			case Shr5Package.PERSONA_FERTIGKEITS_GRUPPE__STUFE:
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
			case Shr5Package.PERSONA_FERTIGKEITS_GRUPPE__GRUPPE:
				setGruppe((FertigkeitsGruppe)newValue);
				return;
			case Shr5Package.PERSONA_FERTIGKEITS_GRUPPE__STUFE:
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
			case Shr5Package.PERSONA_FERTIGKEITS_GRUPPE__GRUPPE:
				setGruppe((FertigkeitsGruppe)null);
				return;
			case Shr5Package.PERSONA_FERTIGKEITS_GRUPPE__STUFE:
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
			case Shr5Package.PERSONA_FERTIGKEITS_GRUPPE__GRUPPE:
				return gruppe != null;
			case Shr5Package.PERSONA_FERTIGKEITS_GRUPPE__STUFE:
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

} //PersonaFertigkeitsGruppeImpl
