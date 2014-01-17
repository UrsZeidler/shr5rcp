/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.PersonaKomplexForm;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.Technomancer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technomancer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.TechnomancerImpl#getResonanz <em>Resonanz</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.TechnomancerImpl#getComplexForms <em>Complex Forms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechnomancerImpl extends SpecialTypeImpl implements Technomancer {
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
	 * The cached value of the '{@link #getResonanz() <em>Resonanz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResonanz()
	 * @generated
	 * @ordered
	 */
	protected int resonanz = RESONANZ_EDEFAULT;

	/**
	 * The default value of the '{@link #getComplexForms() <em>Complex Forms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexForms()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPLEX_FORMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getComplexForms() <em>Complex Forms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexForms()
	 * @generated
	 * @ordered
	 */
	protected int complexForms = COMPLEX_FORMS_EDEFAULT;

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
		return Shr5managementPackage.Literals.TECHNOMANCER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResonanz() {
		return resonanz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResonanz(int newResonanz) {
		int oldResonanz = resonanz;
		resonanz = newResonanz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.TECHNOMANCER__RESONANZ, oldResonanz, resonanz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getComplexForms() {
		return complexForms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexForms(int newComplexForms) {
		int oldComplexForms = complexForms;
		complexForms = newComplexForms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.TECHNOMANCER__COMPLEX_FORMS, oldComplexForms, complexForms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int calcComplexFormsSpend(ManagedCharacter context) {
		if (context == null || context.getPersona() == null)
			return 0;

		int kosten = 0;
		if (context.getPersona() instanceof de.urszeidler.eclipse.shr5.Technomancer) {
			de.urszeidler.eclipse.shr5.Technomancer technomancer = (de.urszeidler.eclipse.shr5.Technomancer) context.getPersona();
			EList<PersonaKomplexForm> fertigkeiten = technomancer.getComplexForms();
			for (PersonaKomplexForm personaFertigkeit : fertigkeiten) {
				kosten = kosten + personaFertigkeit.getStufe();
			}			
		}		
		return kosten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shr5managementPackage.TECHNOMANCER__RESONANZ:
				return getResonanz();
			case Shr5managementPackage.TECHNOMANCER__COMPLEX_FORMS:
				return getComplexForms();
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
			case Shr5managementPackage.TECHNOMANCER__RESONANZ:
				setResonanz((Integer)newValue);
				return;
			case Shr5managementPackage.TECHNOMANCER__COMPLEX_FORMS:
				setComplexForms((Integer)newValue);
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
			case Shr5managementPackage.TECHNOMANCER__RESONANZ:
				setResonanz(RESONANZ_EDEFAULT);
				return;
			case Shr5managementPackage.TECHNOMANCER__COMPLEX_FORMS:
				setComplexForms(COMPLEX_FORMS_EDEFAULT);
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
			case Shr5managementPackage.TECHNOMANCER__RESONANZ:
				return resonanz != RESONANZ_EDEFAULT;
			case Shr5managementPackage.TECHNOMANCER__COMPLEX_FORMS:
				return complexForms != COMPLEX_FORMS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Shr5managementPackage.TECHNOMANCER___CALC_COMPLEX_FORMS_SPEND__MANAGEDCHARACTER:
				return calcComplexFormsSpend((ManagedCharacter)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (resonanz: ");
		result.append(resonanz);
		result.append(", complexForms: ");
		result.append(complexForms);
		result.append(')');
		return result.toString();
	}

} //TechnomancerImpl
