/**
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.Gegenstand;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gegenstand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GegenstandImpl#getKategorie <em>Kategorie</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GegenstandImpl#getStufe <em>Stufe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GegenstandImpl extends AbstraktGegenstandImpl implements Gegenstand {
	/**
     * The default value of the '{@link #getKategorie() <em>Kategorie</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKategorie()
     * @generated
     * @ordered
     */
	protected static final String KATEGORIE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getKategorie() <em>Kategorie</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKategorie()
     * @generated
     * @ordered
     */
	protected String kategorie = KATEGORIE_EDEFAULT;

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
	protected GegenstandImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.GEGENSTAND;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getKategorie() {
        return kategorie;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setKategorie(String newKategorie) {
        String oldKategorie = kategorie;
        kategorie = newKategorie;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEGENSTAND__KATEGORIE, oldKategorie, kategorie));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEGENSTAND__STUFE, oldStufe, stufe));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.GEGENSTAND__KATEGORIE:
                return getKategorie();
            case Shr5Package.GEGENSTAND__STUFE:
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
            case Shr5Package.GEGENSTAND__KATEGORIE:
                setKategorie((String)newValue);
                return;
            case Shr5Package.GEGENSTAND__STUFE:
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
            case Shr5Package.GEGENSTAND__KATEGORIE:
                setKategorie(KATEGORIE_EDEFAULT);
                return;
            case Shr5Package.GEGENSTAND__STUFE:
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
            case Shr5Package.GEGENSTAND__KATEGORIE:
                return KATEGORIE_EDEFAULT == null ? kategorie != null : !KATEGORIE_EDEFAULT.equals(kategorie);
            case Shr5Package.GEGENSTAND__STUFE:
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
        result.append(" (kategorie: ");
        result.append(kategorie);
        result.append(", stufe: ");
        result.append(stufe);
        result.append(')');
        return result.toString();
    }

} //GegenstandImpl
