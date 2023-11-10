/**
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.Bodenfahrzeug;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bodenfahrzeug</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.BodenfahrzeugImpl#getHandlingGelaende <em>Handling Gelaende</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.BodenfahrzeugImpl#getGeschwindigkeitGelaende <em>Geschwindigkeit Gelaende</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodenfahrzeugImpl extends PassagierFahrzeugImpl implements Bodenfahrzeug {
	/**
     * The default value of the '{@link #getHandlingGelaende() <em>Handling Gelaende</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHandlingGelaende()
     * @generated
     * @ordered
     */
	protected static final int HANDLING_GELAENDE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getHandlingGelaende() <em>Handling Gelaende</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHandlingGelaende()
     * @generated
     * @ordered
     */
	protected int handlingGelaende = HANDLING_GELAENDE_EDEFAULT;

	/**
     * The default value of the '{@link #getGeschwindigkeitGelaende() <em>Geschwindigkeit Gelaende</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeschwindigkeitGelaende()
     * @generated
     * @ordered
     */
    protected static final int GESCHWINDIGKEIT_GELAENDE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getGeschwindigkeitGelaende() <em>Geschwindigkeit Gelaende</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeschwindigkeitGelaende()
     * @generated
     * @ordered
     */
    protected int geschwindigkeitGelaende = GESCHWINDIGKEIT_GELAENDE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BodenfahrzeugImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.BODENFAHRZEUG;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getHandlingGelaende() {
        return handlingGelaende;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setHandlingGelaende(int newHandlingGelaende) {
        int oldHandlingGelaende = handlingGelaende;
        handlingGelaende = newHandlingGelaende;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.BODENFAHRZEUG__HANDLING_GELAENDE, oldHandlingGelaende, handlingGelaende));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getGeschwindigkeitGelaende() {
        return geschwindigkeitGelaende;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGeschwindigkeitGelaende(int newGeschwindigkeitGelaende) {
        int oldGeschwindigkeitGelaende = geschwindigkeitGelaende;
        geschwindigkeitGelaende = newGeschwindigkeitGelaende;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.BODENFAHRZEUG__GESCHWINDIGKEIT_GELAENDE, oldGeschwindigkeitGelaende, geschwindigkeitGelaende));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.BODENFAHRZEUG__HANDLING_GELAENDE:
                return getHandlingGelaende();
            case Shr5Package.BODENFAHRZEUG__GESCHWINDIGKEIT_GELAENDE:
                return getGeschwindigkeitGelaende();
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
            case Shr5Package.BODENFAHRZEUG__HANDLING_GELAENDE:
                setHandlingGelaende((Integer)newValue);
                return;
            case Shr5Package.BODENFAHRZEUG__GESCHWINDIGKEIT_GELAENDE:
                setGeschwindigkeitGelaende((Integer)newValue);
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
            case Shr5Package.BODENFAHRZEUG__HANDLING_GELAENDE:
                setHandlingGelaende(HANDLING_GELAENDE_EDEFAULT);
                return;
            case Shr5Package.BODENFAHRZEUG__GESCHWINDIGKEIT_GELAENDE:
                setGeschwindigkeitGelaende(GESCHWINDIGKEIT_GELAENDE_EDEFAULT);
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
            case Shr5Package.BODENFAHRZEUG__HANDLING_GELAENDE:
                return handlingGelaende != HANDLING_GELAENDE_EDEFAULT;
            case Shr5Package.BODENFAHRZEUG__GESCHWINDIGKEIT_GELAENDE:
                return geschwindigkeitGelaende != GESCHWINDIGKEIT_GELAENDE_EDEFAULT;
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (handlingGelaende: ");
        result.append(handlingGelaende);
        result.append(", geschwindigkeitGelaende: ");
        result.append(geschwindigkeitGelaende);
        result.append(')');
        return result.toString();
    }

} //BodenfahrzeugImpl
