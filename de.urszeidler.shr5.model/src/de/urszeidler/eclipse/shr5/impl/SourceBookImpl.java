/**
 */
package de.urszeidler.eclipse.shr5.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SourceBookImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SourceBookImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SourceBookImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SourceBookImpl#getStartShrTime <em>Start Shr Time</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SourceBookImpl#getEndShrTime <em>End Shr Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceBookImpl extends MinimalEObjectImpl.Container implements SourceBook {
	/**
     * The default value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBeschreibung()
     * @generated
     * @ordered
     */
	protected static final String BESCHREIBUNG_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBeschreibung()
     * @generated
     * @ordered
     */
	protected String beschreibung = BESCHREIBUNG_EDEFAULT;

	/**
     * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getImage()
     * @generated
     * @ordered
     */
	protected static final String IMAGE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getImage()
     * @generated
     * @ordered
     */
	protected String image = IMAGE_EDEFAULT;

	/**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected static final String NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected String name = NAME_EDEFAULT;

	/**
     * The default value of the '{@link #getStartShrTime() <em>Start Shr Time</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStartShrTime()
     * @generated
     * @ordered
     */
	protected static final Date START_SHR_TIME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getStartShrTime() <em>Start Shr Time</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStartShrTime()
     * @generated
     * @ordered
     */
	protected Date startShrTime = START_SHR_TIME_EDEFAULT;

	/**
     * The default value of the '{@link #getEndShrTime() <em>End Shr Time</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEndShrTime()
     * @generated
     * @ordered
     */
	protected static final Date END_SHR_TIME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getEndShrTime() <em>End Shr Time</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEndShrTime()
     * @generated
     * @ordered
     */
	protected Date endShrTime = END_SHR_TIME_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SourceBookImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.SOURCE_BOOK;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
        return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SOURCE_BOOK__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getBeschreibung() {
        return beschreibung;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBeschreibung(String newBeschreibung) {
        String oldBeschreibung = beschreibung;
        beschreibung = newBeschreibung;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SOURCE_BOOK__BESCHREIBUNG, oldBeschreibung, beschreibung));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getImage() {
        return image;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImage(String newImage) {
        String oldImage = image;
        image = newImage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SOURCE_BOOK__IMAGE, oldImage, image));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Date getStartShrTime() {
        return startShrTime;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStartShrTime(Date newStartShrTime) {
        Date oldStartShrTime = startShrTime;
        startShrTime = newStartShrTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SOURCE_BOOK__START_SHR_TIME, oldStartShrTime, startShrTime));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Date getEndShrTime() {
        return endShrTime;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setEndShrTime(Date newEndShrTime) {
        Date oldEndShrTime = endShrTime;
        endShrTime = newEndShrTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SOURCE_BOOK__END_SHR_TIME, oldEndShrTime, endShrTime));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.SOURCE_BOOK__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5Package.SOURCE_BOOK__IMAGE:
                return getImage();
            case Shr5Package.SOURCE_BOOK__NAME:
                return getName();
            case Shr5Package.SOURCE_BOOK__START_SHR_TIME:
                return getStartShrTime();
            case Shr5Package.SOURCE_BOOK__END_SHR_TIME:
                return getEndShrTime();
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
            case Shr5Package.SOURCE_BOOK__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5Package.SOURCE_BOOK__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5Package.SOURCE_BOOK__NAME:
                setName((String)newValue);
                return;
            case Shr5Package.SOURCE_BOOK__START_SHR_TIME:
                setStartShrTime((Date)newValue);
                return;
            case Shr5Package.SOURCE_BOOK__END_SHR_TIME:
                setEndShrTime((Date)newValue);
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
            case Shr5Package.SOURCE_BOOK__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5Package.SOURCE_BOOK__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5Package.SOURCE_BOOK__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5Package.SOURCE_BOOK__START_SHR_TIME:
                setStartShrTime(START_SHR_TIME_EDEFAULT);
                return;
            case Shr5Package.SOURCE_BOOK__END_SHR_TIME:
                setEndShrTime(END_SHR_TIME_EDEFAULT);
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
            case Shr5Package.SOURCE_BOOK__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5Package.SOURCE_BOOK__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5Package.SOURCE_BOOK__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5Package.SOURCE_BOOK__START_SHR_TIME:
                return START_SHR_TIME_EDEFAULT == null ? startShrTime != null : !START_SHR_TIME_EDEFAULT.equals(startShrTime);
            case Shr5Package.SOURCE_BOOK__END_SHR_TIME:
                return END_SHR_TIME_EDEFAULT == null ? endShrTime != null : !END_SHR_TIME_EDEFAULT.equals(endShrTime);
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
        result.append(" (beschreibung: ");
        result.append(beschreibung);
        result.append(", image: ");
        result.append(image);
        result.append(", name: ");
        result.append(name);
        result.append(", startShrTime: ");
        result.append(startShrTime);
        result.append(", endShrTime: ");
        result.append(endShrTime);
        result.append(')');
        return result.toString();
    }

} //SourceBookImpl
