/**
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.Localization;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import de.urszeidler.eclipse.shr5.Reichweite;
import de.urszeidler.eclipse.shr5.Shr5Package;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reichweite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ReichweiteImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ReichweiteImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ReichweiteImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ReichweiteImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ReichweiteImpl#getLocalizations <em>Localizations</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ReichweiteImpl#getMin <em>Min</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ReichweiteImpl#getKurz <em>Kurz</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ReichweiteImpl#getMittel <em>Mittel</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ReichweiteImpl#getWeit <em>Weit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ReichweiteImpl#getExtrem <em>Extrem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReichweiteImpl extends MinimalEObjectImpl.Container implements Reichweite {
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
     * The default value of the '{@link #getParentId() <em>Parent Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParentId()
     * @generated
     * @ordered
     */
    protected static final String PARENT_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getParentId() <em>Parent Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParentId()
     * @generated
     * @ordered
     */
    protected String parentId = PARENT_ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getLocalizations() <em>Localizations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalizations()
     * @generated
     * @ordered
     */
    protected EList<Localization> localizations;

    /**
     * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMin()
     * @generated
     * @ordered
     */
	protected static final int MIN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMin()
     * @generated
     * @ordered
     */
	protected int min = MIN_EDEFAULT;

	/**
     * The default value of the '{@link #getKurz() <em>Kurz</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKurz()
     * @generated
     * @ordered
     */
	protected static final int KURZ_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getKurz() <em>Kurz</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKurz()
     * @generated
     * @ordered
     */
	protected int kurz = KURZ_EDEFAULT;

	/**
     * The default value of the '{@link #getMittel() <em>Mittel</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMittel()
     * @generated
     * @ordered
     */
	protected static final int MITTEL_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getMittel() <em>Mittel</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMittel()
     * @generated
     * @ordered
     */
	protected int mittel = MITTEL_EDEFAULT;

	/**
     * The default value of the '{@link #getWeit() <em>Weit</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWeit()
     * @generated
     * @ordered
     */
	protected static final int WEIT_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getWeit() <em>Weit</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWeit()
     * @generated
     * @ordered
     */
	protected int weit = WEIT_EDEFAULT;

	/**
     * The default value of the '{@link #getExtrem() <em>Extrem</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExtrem()
     * @generated
     * @ordered
     */
	protected static final int EXTREM_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getExtrem() <em>Extrem</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getExtrem()
     * @generated
     * @ordered
     */
	protected int extrem = EXTREM_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ReichweiteImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.REICHWEITE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.REICHWEITE__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentId(String newParentId) {
        String oldParentId = parentId;
        parentId = newParentId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.REICHWEITE__PARENT_ID, oldParentId, parentId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Localization> getLocalizations() {
        if (localizations == null) {
            localizations = new EObjectContainmentEList<Localization>(Localization.class, this, Shr5Package.REICHWEITE__LOCALIZATIONS);
        }
        return localizations;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.REICHWEITE__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.REICHWEITE__IMAGE, oldImage, image));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getMin() {
        return min;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMin(int newMin) {
        int oldMin = min;
        min = newMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.REICHWEITE__MIN, oldMin, min));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getKurz() {
        return kurz;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setKurz(int newKurz) {
        int oldKurz = kurz;
        kurz = newKurz;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.REICHWEITE__KURZ, oldKurz, kurz));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getMittel() {
        return mittel;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMittel(int newMittel) {
        int oldMittel = mittel;
        mittel = newMittel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.REICHWEITE__MITTEL, oldMittel, mittel));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getWeit() {
        return weit;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setWeit(int newWeit) {
        int oldWeit = weit;
        weit = newWeit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.REICHWEITE__WEIT, oldWeit, weit));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getExtrem() {
        return extrem;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setExtrem(int newExtrem) {
        int oldExtrem = extrem;
        extrem = newExtrem;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.REICHWEITE__EXTREM, oldExtrem, extrem));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.REICHWEITE__LOCALIZATIONS:
                return ((InternalEList<?>)getLocalizations()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.REICHWEITE__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5Package.REICHWEITE__IMAGE:
                return getImage();
            case Shr5Package.REICHWEITE__NAME:
                return getName();
            case Shr5Package.REICHWEITE__PARENT_ID:
                return getParentId();
            case Shr5Package.REICHWEITE__LOCALIZATIONS:
                return getLocalizations();
            case Shr5Package.REICHWEITE__MIN:
                return getMin();
            case Shr5Package.REICHWEITE__KURZ:
                return getKurz();
            case Shr5Package.REICHWEITE__MITTEL:
                return getMittel();
            case Shr5Package.REICHWEITE__WEIT:
                return getWeit();
            case Shr5Package.REICHWEITE__EXTREM:
                return getExtrem();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
    @Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5Package.REICHWEITE__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5Package.REICHWEITE__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5Package.REICHWEITE__NAME:
                setName((String)newValue);
                return;
            case Shr5Package.REICHWEITE__PARENT_ID:
                setParentId((String)newValue);
                return;
            case Shr5Package.REICHWEITE__LOCALIZATIONS:
                getLocalizations().clear();
                getLocalizations().addAll((Collection<? extends Localization>)newValue);
                return;
            case Shr5Package.REICHWEITE__MIN:
                setMin((Integer)newValue);
                return;
            case Shr5Package.REICHWEITE__KURZ:
                setKurz((Integer)newValue);
                return;
            case Shr5Package.REICHWEITE__MITTEL:
                setMittel((Integer)newValue);
                return;
            case Shr5Package.REICHWEITE__WEIT:
                setWeit((Integer)newValue);
                return;
            case Shr5Package.REICHWEITE__EXTREM:
                setExtrem((Integer)newValue);
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
            case Shr5Package.REICHWEITE__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5Package.REICHWEITE__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5Package.REICHWEITE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5Package.REICHWEITE__PARENT_ID:
                setParentId(PARENT_ID_EDEFAULT);
                return;
            case Shr5Package.REICHWEITE__LOCALIZATIONS:
                getLocalizations().clear();
                return;
            case Shr5Package.REICHWEITE__MIN:
                setMin(MIN_EDEFAULT);
                return;
            case Shr5Package.REICHWEITE__KURZ:
                setKurz(KURZ_EDEFAULT);
                return;
            case Shr5Package.REICHWEITE__MITTEL:
                setMittel(MITTEL_EDEFAULT);
                return;
            case Shr5Package.REICHWEITE__WEIT:
                setWeit(WEIT_EDEFAULT);
                return;
            case Shr5Package.REICHWEITE__EXTREM:
                setExtrem(EXTREM_EDEFAULT);
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
            case Shr5Package.REICHWEITE__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5Package.REICHWEITE__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5Package.REICHWEITE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5Package.REICHWEITE__PARENT_ID:
                return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
            case Shr5Package.REICHWEITE__LOCALIZATIONS:
                return localizations != null && !localizations.isEmpty();
            case Shr5Package.REICHWEITE__MIN:
                return min != MIN_EDEFAULT;
            case Shr5Package.REICHWEITE__KURZ:
                return kurz != KURZ_EDEFAULT;
            case Shr5Package.REICHWEITE__MITTEL:
                return mittel != MITTEL_EDEFAULT;
            case Shr5Package.REICHWEITE__WEIT:
                return weit != WEIT_EDEFAULT;
            case Shr5Package.REICHWEITE__EXTREM:
                return extrem != EXTREM_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Identifiable.class) {
            switch (derivedFeatureID) {
                case Shr5Package.REICHWEITE__PARENT_ID: return Shr5Package.IDENTIFIABLE__PARENT_ID;
                case Shr5Package.REICHWEITE__LOCALIZATIONS: return Shr5Package.IDENTIFIABLE__LOCALIZATIONS;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Identifiable.class) {
            switch (baseFeatureID) {
                case Shr5Package.IDENTIFIABLE__PARENT_ID: return Shr5Package.REICHWEITE__PARENT_ID;
                case Shr5Package.IDENTIFIABLE__LOCALIZATIONS: return Shr5Package.REICHWEITE__LOCALIZATIONS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(", parentId: ");
        result.append(parentId);
        result.append(", min: ");
        result.append(min);
        result.append(", kurz: ");
        result.append(kurz);
        result.append(", mittel: ");
        result.append(mittel);
        result.append(", weit: ");
        result.append(weit);
        result.append(", extrem: ");
        result.append(extrem);
        result.append(')');
        return result.toString();
    }

} //ReichweiteImpl
