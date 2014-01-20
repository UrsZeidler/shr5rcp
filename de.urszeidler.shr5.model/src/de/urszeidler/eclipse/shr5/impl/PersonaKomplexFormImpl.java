/**
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.eclipse.shr5.KomplexeForm;
import de.urszeidler.eclipse.shr5.PersonaKomplexForm;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona Komplex Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.PersonaKomplexFormImpl#getForm <em>Form</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.PersonaKomplexFormImpl#getStufe <em>Stufe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonaKomplexFormImpl extends MinimalEObjectImpl.Container implements PersonaKomplexForm {
	/**
     * The cached value of the '{@link #getForm() <em>Form</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getForm()
     * @generated
     * @ordered
     */
	protected KomplexeForm form;

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
	protected PersonaKomplexFormImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.PERSONA_KOMPLEX_FORM;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public KomplexeForm getForm() {
        if (form != null && form.eIsProxy()) {
            InternalEObject oldForm = (InternalEObject)form;
            form = (KomplexeForm)eResolveProxy(oldForm);
            if (form != oldForm) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.PERSONA_KOMPLEX_FORM__FORM, oldForm, form));
            }
        }
        return form;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public KomplexeForm basicGetForm() {
        return form;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setForm(KomplexeForm newForm) {
        KomplexeForm oldForm = form;
        form = newForm;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.PERSONA_KOMPLEX_FORM__FORM, oldForm, form));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.PERSONA_KOMPLEX_FORM__STUFE, oldStufe, stufe));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.PERSONA_KOMPLEX_FORM__FORM:
                if (resolve) return getForm();
                return basicGetForm();
            case Shr5Package.PERSONA_KOMPLEX_FORM__STUFE:
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
            case Shr5Package.PERSONA_KOMPLEX_FORM__FORM:
                setForm((KomplexeForm)newValue);
                return;
            case Shr5Package.PERSONA_KOMPLEX_FORM__STUFE:
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
            case Shr5Package.PERSONA_KOMPLEX_FORM__FORM:
                setForm((KomplexeForm)null);
                return;
            case Shr5Package.PERSONA_KOMPLEX_FORM__STUFE:
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
            case Shr5Package.PERSONA_KOMPLEX_FORM__FORM:
                return form != null;
            case Shr5Package.PERSONA_KOMPLEX_FORM__STUFE:
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

} //PersonaKomplexFormImpl
