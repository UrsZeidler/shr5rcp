/**
 */
package de.urszeidler.eclipse.shr5.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.KomplexeForm;
import de.urszeidler.eclipse.shr5.Localization;
import de.urszeidler.eclipse.shr5.ResonanzZiel;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.ZauberDauer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Komplexe Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KomplexeFormImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KomplexeFormImpl#getLocalizations <em>Localizations</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KomplexeFormImpl#getPage <em>Page</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KomplexeFormImpl#getSrcBook <em>Src Book</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KomplexeFormImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KomplexeFormImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KomplexeFormImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KomplexeFormImpl#getZiel <em>Ziel</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KomplexeFormImpl#getDauer <em>Dauer</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.KomplexeFormImpl#getSchwund <em>Schwund</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KomplexeFormImpl extends MinimalEObjectImpl.Container implements KomplexeForm {
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
     * The default value of the '{@link #getPage() <em>Page</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPage()
     * @generated
     * @ordered
     */
	protected static final String PAGE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getPage() <em>Page</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPage()
     * @generated
     * @ordered
     */
	protected String page = PAGE_EDEFAULT;

	/**
     * The cached value of the '{@link #getSrcBook() <em>Src Book</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSrcBook()
     * @generated
     * @ordered
     */
	protected SourceBook srcBook;

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
     * The default value of the '{@link #getZiel() <em>Ziel</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getZiel()
     * @generated
     * @ordered
     */
	protected static final ResonanzZiel ZIEL_EDEFAULT = ResonanzZiel.DATEI;

	/**
     * The cached value of the '{@link #getZiel() <em>Ziel</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getZiel()
     * @generated
     * @ordered
     */
	protected ResonanzZiel ziel = ZIEL_EDEFAULT;

	/**
     * The default value of the '{@link #getDauer() <em>Dauer</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDauer()
     * @generated
     * @ordered
     */
	protected static final ZauberDauer DAUER_EDEFAULT = ZauberDauer.SOFORT;

	/**
     * The cached value of the '{@link #getDauer() <em>Dauer</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDauer()
     * @generated
     * @ordered
     */
	protected ZauberDauer dauer = DAUER_EDEFAULT;

	/**
     * The default value of the '{@link #getSchwund() <em>Schwund</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSchwund()
     * @generated
     * @ordered
     */
	protected static final String SCHWUND_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getSchwund() <em>Schwund</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSchwund()
     * @generated
     * @ordered
     */
	protected String schwund = SCHWUND_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected KomplexeFormImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.KOMPLEXE_FORM;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.KOMPLEXE_FORM__PARENT_ID, oldParentId, parentId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Localization> getLocalizations() {
        if (localizations == null) {
            localizations = new EObjectContainmentEList<Localization>(Localization.class, this, Shr5Package.KOMPLEXE_FORM__LOCALIZATIONS);
        }
        return localizations;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getPage() {
        return page;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPage(String newPage) {
        String oldPage = page;
        page = newPage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.KOMPLEXE_FORM__PAGE, oldPage, page));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SourceBook getSrcBook() {
        if (srcBook != null && srcBook.eIsProxy()) {
            InternalEObject oldSrcBook = (InternalEObject)srcBook;
            srcBook = (SourceBook)eResolveProxy(oldSrcBook);
            if (srcBook != oldSrcBook) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.KOMPLEXE_FORM__SRC_BOOK, oldSrcBook, srcBook));
            }
        }
        return srcBook;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SourceBook basicGetSrcBook() {
        return srcBook;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSrcBook(SourceBook newSrcBook) {
        SourceBook oldSrcBook = srcBook;
        srcBook = newSrcBook;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.KOMPLEXE_FORM__SRC_BOOK, oldSrcBook, srcBook));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.KOMPLEXE_FORM__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.KOMPLEXE_FORM__IMAGE, oldImage, image));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.KOMPLEXE_FORM__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ResonanzZiel getZiel() {
        return ziel;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setZiel(ResonanzZiel newZiel) {
        ResonanzZiel oldZiel = ziel;
        ziel = newZiel == null ? ZIEL_EDEFAULT : newZiel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.KOMPLEXE_FORM__ZIEL, oldZiel, ziel));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ZauberDauer getDauer() {
        return dauer;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDauer(ZauberDauer newDauer) {
        ZauberDauer oldDauer = dauer;
        dauer = newDauer == null ? DAUER_EDEFAULT : newDauer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.KOMPLEXE_FORM__DAUER, oldDauer, dauer));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getSchwund() {
        return schwund;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSchwund(String newSchwund) {
        String oldSchwund = schwund;
        schwund = newSchwund;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.KOMPLEXE_FORM__SCHWUND, oldSchwund, schwund));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.KOMPLEXE_FORM__LOCALIZATIONS:
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
            case Shr5Package.KOMPLEXE_FORM__PARENT_ID:
                return getParentId();
            case Shr5Package.KOMPLEXE_FORM__LOCALIZATIONS:
                return getLocalizations();
            case Shr5Package.KOMPLEXE_FORM__PAGE:
                return getPage();
            case Shr5Package.KOMPLEXE_FORM__SRC_BOOK:
                if (resolve) return getSrcBook();
                return basicGetSrcBook();
            case Shr5Package.KOMPLEXE_FORM__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5Package.KOMPLEXE_FORM__IMAGE:
                return getImage();
            case Shr5Package.KOMPLEXE_FORM__NAME:
                return getName();
            case Shr5Package.KOMPLEXE_FORM__ZIEL:
                return getZiel();
            case Shr5Package.KOMPLEXE_FORM__DAUER:
                return getDauer();
            case Shr5Package.KOMPLEXE_FORM__SCHWUND:
                return getSchwund();
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
            case Shr5Package.KOMPLEXE_FORM__PARENT_ID:
                setParentId((String)newValue);
                return;
            case Shr5Package.KOMPLEXE_FORM__LOCALIZATIONS:
                getLocalizations().clear();
                getLocalizations().addAll((Collection<? extends Localization>)newValue);
                return;
            case Shr5Package.KOMPLEXE_FORM__PAGE:
                setPage((String)newValue);
                return;
            case Shr5Package.KOMPLEXE_FORM__SRC_BOOK:
                setSrcBook((SourceBook)newValue);
                return;
            case Shr5Package.KOMPLEXE_FORM__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5Package.KOMPLEXE_FORM__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5Package.KOMPLEXE_FORM__NAME:
                setName((String)newValue);
                return;
            case Shr5Package.KOMPLEXE_FORM__ZIEL:
                setZiel((ResonanzZiel)newValue);
                return;
            case Shr5Package.KOMPLEXE_FORM__DAUER:
                setDauer((ZauberDauer)newValue);
                return;
            case Shr5Package.KOMPLEXE_FORM__SCHWUND:
                setSchwund((String)newValue);
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
            case Shr5Package.KOMPLEXE_FORM__PARENT_ID:
                setParentId(PARENT_ID_EDEFAULT);
                return;
            case Shr5Package.KOMPLEXE_FORM__LOCALIZATIONS:
                getLocalizations().clear();
                return;
            case Shr5Package.KOMPLEXE_FORM__PAGE:
                setPage(PAGE_EDEFAULT);
                return;
            case Shr5Package.KOMPLEXE_FORM__SRC_BOOK:
                setSrcBook((SourceBook)null);
                return;
            case Shr5Package.KOMPLEXE_FORM__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5Package.KOMPLEXE_FORM__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5Package.KOMPLEXE_FORM__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5Package.KOMPLEXE_FORM__ZIEL:
                setZiel(ZIEL_EDEFAULT);
                return;
            case Shr5Package.KOMPLEXE_FORM__DAUER:
                setDauer(DAUER_EDEFAULT);
                return;
            case Shr5Package.KOMPLEXE_FORM__SCHWUND:
                setSchwund(SCHWUND_EDEFAULT);
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
            case Shr5Package.KOMPLEXE_FORM__PARENT_ID:
                return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
            case Shr5Package.KOMPLEXE_FORM__LOCALIZATIONS:
                return localizations != null && !localizations.isEmpty();
            case Shr5Package.KOMPLEXE_FORM__PAGE:
                return PAGE_EDEFAULT == null ? page != null : !PAGE_EDEFAULT.equals(page);
            case Shr5Package.KOMPLEXE_FORM__SRC_BOOK:
                return srcBook != null;
            case Shr5Package.KOMPLEXE_FORM__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5Package.KOMPLEXE_FORM__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5Package.KOMPLEXE_FORM__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5Package.KOMPLEXE_FORM__ZIEL:
                return ziel != ZIEL_EDEFAULT;
            case Shr5Package.KOMPLEXE_FORM__DAUER:
                return dauer != DAUER_EDEFAULT;
            case Shr5Package.KOMPLEXE_FORM__SCHWUND:
                return SCHWUND_EDEFAULT == null ? schwund != null : !SCHWUND_EDEFAULT.equals(schwund);
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
        if (baseClass == Beschreibbar.class) {
            switch (derivedFeatureID) {
                case Shr5Package.KOMPLEXE_FORM__BESCHREIBUNG: return Shr5Package.BESCHREIBBAR__BESCHREIBUNG;
                case Shr5Package.KOMPLEXE_FORM__IMAGE: return Shr5Package.BESCHREIBBAR__IMAGE;
                case Shr5Package.KOMPLEXE_FORM__NAME: return Shr5Package.BESCHREIBBAR__NAME;
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
        if (baseClass == Beschreibbar.class) {
            switch (baseFeatureID) {
                case Shr5Package.BESCHREIBBAR__BESCHREIBUNG: return Shr5Package.KOMPLEXE_FORM__BESCHREIBUNG;
                case Shr5Package.BESCHREIBBAR__IMAGE: return Shr5Package.KOMPLEXE_FORM__IMAGE;
                case Shr5Package.BESCHREIBBAR__NAME: return Shr5Package.KOMPLEXE_FORM__NAME;
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
        result.append(" (parentId: ");
        result.append(parentId);
        result.append(", page: ");
        result.append(page);
        result.append(", beschreibung: ");
        result.append(beschreibung);
        result.append(", image: ");
        result.append(image);
        result.append(", name: ");
        result.append(name);
        result.append(", ziel: ");
        result.append(ziel);
        result.append(", dauer: ");
        result.append(dauer);
        result.append(", schwund: ");
        result.append(schwund);
        result.append(')');
        return result.toString();
    }

} //KomplexeFormImpl
