/**
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.AbstaktWaffe;
import de.urszeidler.eclipse.shr5.SchadensTyp;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstakt Waffe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstaktWaffeImpl#getSchadenscode <em>Schadenscode</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstaktWaffeImpl#getSchadesTyp <em>Schades Typ</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstaktWaffeImpl#getPraezision <em>Praezision</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstaktWaffeImpl#getDurchschlagsKraft <em>Durchschlags Kraft</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstaktWaffeImpl extends AbstraktGegenstandImpl implements AbstaktWaffe {
	/**
	 * The default value of the '{@link #getSchadenscode() <em>Schadenscode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchadenscode()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHADENSCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchadenscode() <em>Schadenscode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchadenscode()
	 * @generated
	 * @ordered
	 */
	protected String schadenscode = SCHADENSCODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchadesTyp() <em>Schades Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchadesTyp()
	 * @generated
	 * @ordered
	 */
	protected static final SchadensTyp SCHADES_TYP_EDEFAULT = SchadensTyp.KOERPERLICH;

	/**
	 * The cached value of the '{@link #getSchadesTyp() <em>Schades Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchadesTyp()
	 * @generated
	 * @ordered
	 */
	protected SchadensTyp schadesTyp = SCHADES_TYP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPraezision() <em>Praezision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPraezision()
	 * @generated
	 * @ordered
	 */
	protected static final int PRAEZISION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPraezision() <em>Praezision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPraezision()
	 * @generated
	 * @ordered
	 */
	protected int praezision = PRAEZISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurchschlagsKraft() <em>Durchschlags Kraft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurchschlagsKraft()
	 * @generated
	 * @ordered
	 */
	protected static final int DURCHSCHLAGS_KRAFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDurchschlagsKraft() <em>Durchschlags Kraft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurchschlagsKraft()
	 * @generated
	 * @ordered
	 */
	protected int durchschlagsKraft = DURCHSCHLAGS_KRAFT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstaktWaffeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shr5Package.Literals.ABSTAKT_WAFFE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchadenscode() {
		return schadenscode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchadenscode(String newSchadenscode) {
		String oldSchadenscode = schadenscode;
		schadenscode = newSchadenscode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTAKT_WAFFE__SCHADENSCODE, oldSchadenscode, schadenscode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchadensTyp getSchadesTyp() {
		return schadesTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchadesTyp(SchadensTyp newSchadesTyp) {
		SchadensTyp oldSchadesTyp = schadesTyp;
		schadesTyp = newSchadesTyp == null ? SCHADES_TYP_EDEFAULT : newSchadesTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTAKT_WAFFE__SCHADES_TYP, oldSchadesTyp, schadesTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPraezision() {
		return praezision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPraezision(int newPraezision) {
		int oldPraezision = praezision;
		praezision = newPraezision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTAKT_WAFFE__PRAEZISION, oldPraezision, praezision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDurchschlagsKraft() {
		return durchschlagsKraft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurchschlagsKraft(int newDurchschlagsKraft) {
		int oldDurchschlagsKraft = durchschlagsKraft;
		durchschlagsKraft = newDurchschlagsKraft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTAKT_WAFFE__DURCHSCHLAGS_KRAFT, oldDurchschlagsKraft, durchschlagsKraft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shr5Package.ABSTAKT_WAFFE__SCHADENSCODE:
				return getSchadenscode();
			case Shr5Package.ABSTAKT_WAFFE__SCHADES_TYP:
				return getSchadesTyp();
			case Shr5Package.ABSTAKT_WAFFE__PRAEZISION:
				return getPraezision();
			case Shr5Package.ABSTAKT_WAFFE__DURCHSCHLAGS_KRAFT:
				return getDurchschlagsKraft();
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
			case Shr5Package.ABSTAKT_WAFFE__SCHADENSCODE:
				setSchadenscode((String)newValue);
				return;
			case Shr5Package.ABSTAKT_WAFFE__SCHADES_TYP:
				setSchadesTyp((SchadensTyp)newValue);
				return;
			case Shr5Package.ABSTAKT_WAFFE__PRAEZISION:
				setPraezision((Integer)newValue);
				return;
			case Shr5Package.ABSTAKT_WAFFE__DURCHSCHLAGS_KRAFT:
				setDurchschlagsKraft((Integer)newValue);
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
			case Shr5Package.ABSTAKT_WAFFE__SCHADENSCODE:
				setSchadenscode(SCHADENSCODE_EDEFAULT);
				return;
			case Shr5Package.ABSTAKT_WAFFE__SCHADES_TYP:
				setSchadesTyp(SCHADES_TYP_EDEFAULT);
				return;
			case Shr5Package.ABSTAKT_WAFFE__PRAEZISION:
				setPraezision(PRAEZISION_EDEFAULT);
				return;
			case Shr5Package.ABSTAKT_WAFFE__DURCHSCHLAGS_KRAFT:
				setDurchschlagsKraft(DURCHSCHLAGS_KRAFT_EDEFAULT);
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
			case Shr5Package.ABSTAKT_WAFFE__SCHADENSCODE:
				return SCHADENSCODE_EDEFAULT == null ? schadenscode != null : !SCHADENSCODE_EDEFAULT.equals(schadenscode);
			case Shr5Package.ABSTAKT_WAFFE__SCHADES_TYP:
				return schadesTyp != SCHADES_TYP_EDEFAULT;
			case Shr5Package.ABSTAKT_WAFFE__PRAEZISION:
				return praezision != PRAEZISION_EDEFAULT;
			case Shr5Package.ABSTAKT_WAFFE__DURCHSCHLAGS_KRAFT:
				return durchschlagsKraft != DURCHSCHLAGS_KRAFT_EDEFAULT;
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
		result.append(" (schadenscode: ");
		result.append(schadenscode);
		result.append(", schadesTyp: ");
		result.append(schadesTyp);
		result.append(", praezision: ");
		result.append(praezision);
		result.append(", durchschlagsKraft: ");
		result.append(durchschlagsKraft);
		result.append(')');
		return result.toString();
	}

} //AbstaktWaffeImpl
