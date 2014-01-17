/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Zauberer;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.Spellcaster;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spellcaster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.SpellcasterImpl#getSpellPoints <em>Spell Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpellcasterImpl extends AdeptImpl implements Spellcaster {
	/**
	 * The default value of the '{@link #getSpellPoints() <em>Spell Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpellPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int SPELL_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpellPoints() <em>Spell Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpellPoints()
	 * @generated
	 * @ordered
	 */
	protected int spellPoints = SPELL_POINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpellcasterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shr5managementPackage.Literals.SPELLCASTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpellPoints() {
		return spellPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpellPoints(int newSpellPoints) {
		int oldSpellPoints = spellPoints;
		spellPoints = newSpellPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SPELLCASTER__SPELL_POINTS, oldSpellPoints, spellPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int calcSpellPointsSpend(ManagedCharacter context) {
		if (context == null || context.getPersona() == null)
			return 0;

		int kosten = 0;
		if (context.getPersona() instanceof Zauberer) {
			Zauberer magier = (Zauberer) context.getPersona();
			EList<PersonaZauber> zauber = magier.getZauber();
			for (PersonaZauber personaZauber : zauber) {
				kosten = kosten + personaZauber.getStufe();
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
			case Shr5managementPackage.SPELLCASTER__SPELL_POINTS:
				return getSpellPoints();
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
			case Shr5managementPackage.SPELLCASTER__SPELL_POINTS:
				setSpellPoints((Integer)newValue);
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
			case Shr5managementPackage.SPELLCASTER__SPELL_POINTS:
				setSpellPoints(SPELL_POINTS_EDEFAULT);
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
			case Shr5managementPackage.SPELLCASTER__SPELL_POINTS:
				return spellPoints != SPELL_POINTS_EDEFAULT;
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
			case Shr5managementPackage.SPELLCASTER___CALC_SPELL_POINTS_SPEND__MANAGEDCHARACTER:
				return calcSpellPointsSpend((ManagedCharacter)arguments.get(0));
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
		result.append(" (spellPoints: ");
		result.append(spellPoints);
		result.append(')');
		return result.toString();
	}

} //SpellcasterImpl
