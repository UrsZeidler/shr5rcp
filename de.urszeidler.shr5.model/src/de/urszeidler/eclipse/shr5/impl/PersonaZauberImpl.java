/**
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Zauber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona Zauber</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.PersonaZauberImpl#getStufe <em>Stufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.PersonaZauberImpl#getFormel <em>Formel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonaZauberImpl extends MinimalEObjectImpl.Container implements PersonaZauber {
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
     * The cached value of the '{@link #getFormel() <em>Formel</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFormel()
     * @generated
     * @ordered
     */
	protected Zauber formel;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PersonaZauberImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.PERSONA_ZAUBER;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getStufe() {
        return stufe;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setStufe(int newStufe) {
        int oldStufe = stufe;
        stufe = newStufe;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.PERSONA_ZAUBER__STUFE, oldStufe, stufe));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Zauber getFormel() {
        if (formel != null && formel.eIsProxy()) {
            InternalEObject oldFormel = (InternalEObject)formel;
            formel = (Zauber)eResolveProxy(oldFormel);
            if (formel != oldFormel) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.PERSONA_ZAUBER__FORMEL, oldFormel, formel));
            }
        }
        return formel;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Zauber basicGetFormel() {
        return formel;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setFormel(Zauber newFormel) {
        Zauber oldFormel = formel;
        formel = newFormel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.PERSONA_ZAUBER__FORMEL, oldFormel, formel));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.PERSONA_ZAUBER__STUFE:
                return getStufe();
            case Shr5Package.PERSONA_ZAUBER__FORMEL:
                if (resolve) return getFormel();
                return basicGetFormel();
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
            case Shr5Package.PERSONA_ZAUBER__STUFE:
                setStufe((Integer)newValue);
                return;
            case Shr5Package.PERSONA_ZAUBER__FORMEL:
                setFormel((Zauber)newValue);
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
            case Shr5Package.PERSONA_ZAUBER__STUFE:
                setStufe(STUFE_EDEFAULT);
                return;
            case Shr5Package.PERSONA_ZAUBER__FORMEL:
                setFormel((Zauber)null);
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
            case Shr5Package.PERSONA_ZAUBER__STUFE:
                return stufe != STUFE_EDEFAULT;
            case Shr5Package.PERSONA_ZAUBER__FORMEL:
                return formel != null;
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
        result.append(" (stufe: ");
        result.append(stufe);
        result.append(')');
        return result.toString();
    }

} //PersonaZauberImpl
