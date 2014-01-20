/**
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona Eigenschaft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.PersonaEigenschaftImpl#getKarmaKosten <em>Karma Kosten</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonaEigenschaftImpl extends AbstraktModifikatorenImpl implements PersonaEigenschaft {
	/**
     * The default value of the '{@link #getKarmaKosten() <em>Karma Kosten</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKarmaKosten()
     * @generated
     * @ordered
     */
	protected static final int KARMA_KOSTEN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getKarmaKosten() <em>Karma Kosten</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKarmaKosten()
     * @generated
     * @ordered
     */
	protected int karmaKosten = KARMA_KOSTEN_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PersonaEigenschaftImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.PERSONA_EIGENSCHAFT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getKarmaKosten() {
        return karmaKosten;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setKarmaKosten(int newKarmaKosten) {
        int oldKarmaKosten = karmaKosten;
        karmaKosten = newKarmaKosten;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.PERSONA_EIGENSCHAFT__KARMA_KOSTEN, oldKarmaKosten, karmaKosten));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.PERSONA_EIGENSCHAFT__KARMA_KOSTEN:
                return getKarmaKosten();
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
            case Shr5Package.PERSONA_EIGENSCHAFT__KARMA_KOSTEN:
                setKarmaKosten((Integer)newValue);
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
            case Shr5Package.PERSONA_EIGENSCHAFT__KARMA_KOSTEN:
                setKarmaKosten(KARMA_KOSTEN_EDEFAULT);
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
            case Shr5Package.PERSONA_EIGENSCHAFT__KARMA_KOSTEN:
                return karmaKosten != KARMA_KOSTEN_EDEFAULT;
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
        result.append(" (karmaKosten: ");
        result.append(karmaKosten);
        result.append(')');
        return result.toString();
    }

} //PersonaEigenschaftImpl
