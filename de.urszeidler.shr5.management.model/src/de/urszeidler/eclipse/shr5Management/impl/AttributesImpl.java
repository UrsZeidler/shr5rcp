/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5Management.Attributes;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.AttributesImpl#getAttibutePoints <em>Attibute Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributesImpl extends PriorityCategorieImpl implements Attributes {
	/**
	 * The default value of the '{@link #getAttibutePoints() <em>Attibute Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttibutePoints()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTIBUTE_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttibutePoints() <em>Attibute Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttibutePoints()
	 * @generated
	 * @ordered
	 */
	protected int attibutePoints = ATTIBUTE_POINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shr5managementPackage.Literals.ATTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttibutePoints() {
		return attibutePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttibutePoints(int newAttibutePoints) {
		int oldAttibutePoints = attibutePoints;
		attibutePoints = newAttibutePoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.ATTRIBUTES__ATTIBUTE_POINTS, oldAttibutePoints, attibutePoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int calcAttributesSpend(ManagedCharacter context) {
		ManagedCharacter managedCharacter = context;
		if (managedCharacter == null)
			return 0;
		AbstraktPersona persona = managedCharacter.getPersona();
		if (persona == null)
			return 0;

		Spezies spezies = persona.getSpezies();
		if (spezies == null)
			return 0;

		int a = persona.getKonstitutionBasis() - spezies.getKonstitutionMin() + persona.getStaerkeBasis()
				- spezies.getStaerkeMin() + persona.getReaktionBasis() - spezies.getReaktionMin()
				+ persona.getGeschicklichkeitBasis() - spezies.getGeschicklichkeitMin()

				+ persona.getCharismaBasis() - spezies.getCharismaMin() + persona.getLogikBasis() - spezies.getLogikMin()
				+ persona.getWillenskraftBasis() - spezies.getWillenskraftMin() + persona.getIntuitionBasis()
				- spezies.getIntuitionMin();
		
		//TODO : need remove the karma 
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shr5managementPackage.ATTRIBUTES__ATTIBUTE_POINTS:
				return getAttibutePoints();
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
			case Shr5managementPackage.ATTRIBUTES__ATTIBUTE_POINTS:
				setAttibutePoints((Integer)newValue);
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
			case Shr5managementPackage.ATTRIBUTES__ATTIBUTE_POINTS:
				setAttibutePoints(ATTIBUTE_POINTS_EDEFAULT);
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
			case Shr5managementPackage.ATTRIBUTES__ATTIBUTE_POINTS:
				return attibutePoints != ATTIBUTE_POINTS_EDEFAULT;
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
			case Shr5managementPackage.ATTRIBUTES___CALC_ATTRIBUTES_SPEND__MANAGEDCHARACTER:
				return calcAttributesSpend((ManagedCharacter)arguments.get(0));
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
		result.append(" (attibutePoints: ");
		result.append(attibutePoints);
		result.append(')');
		return result.toString();
	}

} //AttributesImpl
