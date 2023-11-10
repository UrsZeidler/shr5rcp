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

import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.Localization;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.ZauberArt;
import de.urszeidler.eclipse.shr5.ZauberDauer;
import de.urszeidler.eclipse.shr5.ZauberReichweite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zauber</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ZauberImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ZauberImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ZauberImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ZauberImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ZauberImpl#getLocalizations <em>Localizations</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ZauberImpl#getPage <em>Page</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ZauberImpl#getSrcBook <em>Src Book</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ZauberImpl#getArt <em>Art</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ZauberImpl#getReichweite <em>Reichweite</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ZauberImpl#getSchaden <em>Schaden</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ZauberImpl#getDauer <em>Dauer</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ZauberImpl#getEntzug <em>Entzug</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ZauberImpl#getKategorie <em>Kategorie</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.ZauberImpl#getMerkmale <em>Merkmale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZauberImpl extends MinimalEObjectImpl.Container implements Zauber {
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
     * The default value of the '{@link #getArt() <em>Art</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getArt()
     * @generated
     * @ordered
     */
	protected static final ZauberArt ART_EDEFAULT = ZauberArt.MANA;

	/**
     * The cached value of the '{@link #getArt() <em>Art</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getArt()
     * @generated
     * @ordered
     */
	protected ZauberArt art = ART_EDEFAULT;

	/**
     * The default value of the '{@link #getReichweite() <em>Reichweite</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReichweite()
     * @generated
     * @ordered
     */
	protected static final ZauberReichweite REICHWEITE_EDEFAULT = ZauberReichweite.BLICKFELD;

	/**
     * The cached value of the '{@link #getReichweite() <em>Reichweite</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReichweite()
     * @generated
     * @ordered
     */
	protected ZauberReichweite reichweite = REICHWEITE_EDEFAULT;

	/**
     * The default value of the '{@link #getSchaden() <em>Schaden</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSchaden()
     * @generated
     * @ordered
     */
	protected static final String SCHADEN_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getSchaden() <em>Schaden</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSchaden()
     * @generated
     * @ordered
     */
	protected String schaden = SCHADEN_EDEFAULT;

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
     * The default value of the '{@link #getEntzug() <em>Entzug</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEntzug()
     * @generated
     * @ordered
     */
	protected static final String ENTZUG_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getEntzug() <em>Entzug</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEntzug()
     * @generated
     * @ordered
     */
	protected String entzug = ENTZUG_EDEFAULT;

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
     * The default value of the '{@link #getMerkmale() <em>Merkmale</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMerkmale()
     * @generated
     * @ordered
     */
	protected static final String MERKMALE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMerkmale() <em>Merkmale</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMerkmale()
     * @generated
     * @ordered
     */
	protected String merkmale = MERKMALE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ZauberImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.ZAUBER;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getName() {
        return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ZAUBER__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getParentId() {
        return parentId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentId(String newParentId) {
        String oldParentId = parentId;
        parentId = newParentId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ZAUBER__PARENT_ID, oldParentId, parentId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Localization> getLocalizations() {
        if (localizations == null) {
            localizations = new EObjectContainmentEList<Localization>(Localization.class, this, Shr5Package.ZAUBER__LOCALIZATIONS);
        }
        return localizations;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getBeschreibung() {
        return beschreibung;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setBeschreibung(String newBeschreibung) {
        String oldBeschreibung = beschreibung;
        beschreibung = newBeschreibung;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ZAUBER__BESCHREIBUNG, oldBeschreibung, beschreibung));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getImage() {
        return image;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setImage(String newImage) {
        String oldImage = image;
        image = newImage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ZAUBER__IMAGE, oldImage, image));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getPage() {
        return page;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setPage(String newPage) {
        String oldPage = page;
        page = newPage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ZAUBER__PAGE, oldPage, page));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public SourceBook getSrcBook() {
        if (srcBook != null && srcBook.eIsProxy()) {
            InternalEObject oldSrcBook = (InternalEObject)srcBook;
            srcBook = (SourceBook)eResolveProxy(oldSrcBook);
            if (srcBook != oldSrcBook) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.ZAUBER__SRC_BOOK, oldSrcBook, srcBook));
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
	@Override
    public void setSrcBook(SourceBook newSrcBook) {
        SourceBook oldSrcBook = srcBook;
        srcBook = newSrcBook;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ZAUBER__SRC_BOOK, oldSrcBook, srcBook));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public ZauberArt getArt() {
        return art;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setArt(ZauberArt newArt) {
        ZauberArt oldArt = art;
        art = newArt == null ? ART_EDEFAULT : newArt;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ZAUBER__ART, oldArt, art));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public ZauberReichweite getReichweite() {
        return reichweite;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setReichweite(ZauberReichweite newReichweite) {
        ZauberReichweite oldReichweite = reichweite;
        reichweite = newReichweite == null ? REICHWEITE_EDEFAULT : newReichweite;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ZAUBER__REICHWEITE, oldReichweite, reichweite));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getSchaden() {
        return schaden;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setSchaden(String newSchaden) {
        String oldSchaden = schaden;
        schaden = newSchaden;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ZAUBER__SCHADEN, oldSchaden, schaden));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public ZauberDauer getDauer() {
        return dauer;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setDauer(ZauberDauer newDauer) {
        ZauberDauer oldDauer = dauer;
        dauer = newDauer == null ? DAUER_EDEFAULT : newDauer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ZAUBER__DAUER, oldDauer, dauer));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getEntzug() {
        return entzug;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setEntzug(String newEntzug) {
        String oldEntzug = entzug;
        entzug = newEntzug;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ZAUBER__ENTZUG, oldEntzug, entzug));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getKategorie() {
        return kategorie;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setKategorie(String newKategorie) {
        String oldKategorie = kategorie;
        kategorie = newKategorie;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ZAUBER__KATEGORIE, oldKategorie, kategorie));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getMerkmale() {
        return merkmale;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setMerkmale(String newMerkmale) {
        String oldMerkmale = merkmale;
        merkmale = newMerkmale;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ZAUBER__MERKMALE, oldMerkmale, merkmale));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.ZAUBER__LOCALIZATIONS:
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
            case Shr5Package.ZAUBER__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5Package.ZAUBER__IMAGE:
                return getImage();
            case Shr5Package.ZAUBER__NAME:
                return getName();
            case Shr5Package.ZAUBER__PARENT_ID:
                return getParentId();
            case Shr5Package.ZAUBER__LOCALIZATIONS:
                return getLocalizations();
            case Shr5Package.ZAUBER__PAGE:
                return getPage();
            case Shr5Package.ZAUBER__SRC_BOOK:
                if (resolve) return getSrcBook();
                return basicGetSrcBook();
            case Shr5Package.ZAUBER__ART:
                return getArt();
            case Shr5Package.ZAUBER__REICHWEITE:
                return getReichweite();
            case Shr5Package.ZAUBER__SCHADEN:
                return getSchaden();
            case Shr5Package.ZAUBER__DAUER:
                return getDauer();
            case Shr5Package.ZAUBER__ENTZUG:
                return getEntzug();
            case Shr5Package.ZAUBER__KATEGORIE:
                return getKategorie();
            case Shr5Package.ZAUBER__MERKMALE:
                return getMerkmale();
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
            case Shr5Package.ZAUBER__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5Package.ZAUBER__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5Package.ZAUBER__NAME:
                setName((String)newValue);
                return;
            case Shr5Package.ZAUBER__PARENT_ID:
                setParentId((String)newValue);
                return;
            case Shr5Package.ZAUBER__LOCALIZATIONS:
                getLocalizations().clear();
                getLocalizations().addAll((Collection<? extends Localization>)newValue);
                return;
            case Shr5Package.ZAUBER__PAGE:
                setPage((String)newValue);
                return;
            case Shr5Package.ZAUBER__SRC_BOOK:
                setSrcBook((SourceBook)newValue);
                return;
            case Shr5Package.ZAUBER__ART:
                setArt((ZauberArt)newValue);
                return;
            case Shr5Package.ZAUBER__REICHWEITE:
                setReichweite((ZauberReichweite)newValue);
                return;
            case Shr5Package.ZAUBER__SCHADEN:
                setSchaden((String)newValue);
                return;
            case Shr5Package.ZAUBER__DAUER:
                setDauer((ZauberDauer)newValue);
                return;
            case Shr5Package.ZAUBER__ENTZUG:
                setEntzug((String)newValue);
                return;
            case Shr5Package.ZAUBER__KATEGORIE:
                setKategorie((String)newValue);
                return;
            case Shr5Package.ZAUBER__MERKMALE:
                setMerkmale((String)newValue);
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
            case Shr5Package.ZAUBER__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5Package.ZAUBER__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5Package.ZAUBER__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5Package.ZAUBER__PARENT_ID:
                setParentId(PARENT_ID_EDEFAULT);
                return;
            case Shr5Package.ZAUBER__LOCALIZATIONS:
                getLocalizations().clear();
                return;
            case Shr5Package.ZAUBER__PAGE:
                setPage(PAGE_EDEFAULT);
                return;
            case Shr5Package.ZAUBER__SRC_BOOK:
                setSrcBook((SourceBook)null);
                return;
            case Shr5Package.ZAUBER__ART:
                setArt(ART_EDEFAULT);
                return;
            case Shr5Package.ZAUBER__REICHWEITE:
                setReichweite(REICHWEITE_EDEFAULT);
                return;
            case Shr5Package.ZAUBER__SCHADEN:
                setSchaden(SCHADEN_EDEFAULT);
                return;
            case Shr5Package.ZAUBER__DAUER:
                setDauer(DAUER_EDEFAULT);
                return;
            case Shr5Package.ZAUBER__ENTZUG:
                setEntzug(ENTZUG_EDEFAULT);
                return;
            case Shr5Package.ZAUBER__KATEGORIE:
                setKategorie(KATEGORIE_EDEFAULT);
                return;
            case Shr5Package.ZAUBER__MERKMALE:
                setMerkmale(MERKMALE_EDEFAULT);
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
            case Shr5Package.ZAUBER__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5Package.ZAUBER__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5Package.ZAUBER__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5Package.ZAUBER__PARENT_ID:
                return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
            case Shr5Package.ZAUBER__LOCALIZATIONS:
                return localizations != null && !localizations.isEmpty();
            case Shr5Package.ZAUBER__PAGE:
                return PAGE_EDEFAULT == null ? page != null : !PAGE_EDEFAULT.equals(page);
            case Shr5Package.ZAUBER__SRC_BOOK:
                return srcBook != null;
            case Shr5Package.ZAUBER__ART:
                return art != ART_EDEFAULT;
            case Shr5Package.ZAUBER__REICHWEITE:
                return reichweite != REICHWEITE_EDEFAULT;
            case Shr5Package.ZAUBER__SCHADEN:
                return SCHADEN_EDEFAULT == null ? schaden != null : !SCHADEN_EDEFAULT.equals(schaden);
            case Shr5Package.ZAUBER__DAUER:
                return dauer != DAUER_EDEFAULT;
            case Shr5Package.ZAUBER__ENTZUG:
                return ENTZUG_EDEFAULT == null ? entzug != null : !ENTZUG_EDEFAULT.equals(entzug);
            case Shr5Package.ZAUBER__KATEGORIE:
                return KATEGORIE_EDEFAULT == null ? kategorie != null : !KATEGORIE_EDEFAULT.equals(kategorie);
            case Shr5Package.ZAUBER__MERKMALE:
                return MERKMALE_EDEFAULT == null ? merkmale != null : !MERKMALE_EDEFAULT.equals(merkmale);
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
                case Shr5Package.ZAUBER__PARENT_ID: return Shr5Package.IDENTIFIABLE__PARENT_ID;
                case Shr5Package.ZAUBER__LOCALIZATIONS: return Shr5Package.IDENTIFIABLE__LOCALIZATIONS;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (derivedFeatureID) {
                case Shr5Package.ZAUBER__PAGE: return Shr5Package.QUELLE__PAGE;
                case Shr5Package.ZAUBER__SRC_BOOK: return Shr5Package.QUELLE__SRC_BOOK;
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
                case Shr5Package.IDENTIFIABLE__PARENT_ID: return Shr5Package.ZAUBER__PARENT_ID;
                case Shr5Package.IDENTIFIABLE__LOCALIZATIONS: return Shr5Package.ZAUBER__LOCALIZATIONS;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (baseFeatureID) {
                case Shr5Package.QUELLE__PAGE: return Shr5Package.ZAUBER__PAGE;
                case Shr5Package.QUELLE__SRC_BOOK: return Shr5Package.ZAUBER__SRC_BOOK;
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (beschreibung: ");
        result.append(beschreibung);
        result.append(", image: ");
        result.append(image);
        result.append(", name: ");
        result.append(name);
        result.append(", parentId: ");
        result.append(parentId);
        result.append(", page: ");
        result.append(page);
        result.append(", art: ");
        result.append(art);
        result.append(", reichweite: ");
        result.append(reichweite);
        result.append(", schaden: ");
        result.append(schaden);
        result.append(", dauer: ");
        result.append(dauer);
        result.append(", entzug: ");
        result.append(entzug);
        result.append(", kategorie: ");
        result.append(kategorie);
        result.append(", merkmale: ");
        result.append(merkmale);
        result.append(')');
        return result.toString();
    }

} //ZauberImpl
