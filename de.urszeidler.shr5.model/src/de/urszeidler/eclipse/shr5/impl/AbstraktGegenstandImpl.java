/**
 */
package de.urszeidler.eclipse.shr5.impl;

import java.math.BigDecimal;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.Anwendbar;
import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.Localization;
import de.urszeidler.eclipse.shr5.MatrixDevice;
import de.urszeidler.eclipse.shr5.Modifizierbar;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.Spezialisierung;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstrakt Gegenstand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getLocalizations <em>Localizations</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getPage <em>Page</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getSrcBook <em>Src Book</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getWert <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getVerfuegbarkeit <em>Verfuegbarkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getWertValue <em>Wert Value</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getMods <em>Mods</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getFertigkeit <em>Fertigkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getSpezialisierung <em>Spezialisierung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktGegenstandImpl#getWifi <em>Wifi</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstraktGegenstandImpl extends MinimalEObjectImpl.Container implements AbstraktGegenstand {
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
     * The default value of the '{@link #getWert() <em>Wert</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWert()
     * @generated
     * @ordered
     */
	protected static final BigDecimal WERT_EDEFAULT = null;

	/**
     * The default value of the '{@link #getVerfuegbarkeit() <em>Verfuegbarkeit</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVerfuegbarkeit()
     * @generated
     * @ordered
     */
	protected static final String VERFUEGBARKEIT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getVerfuegbarkeit() <em>Verfuegbarkeit</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVerfuegbarkeit()
     * @generated
     * @ordered
     */
	protected String verfuegbarkeit = VERFUEGBARKEIT_EDEFAULT;

	/**
     * The default value of the '{@link #getWertValue() <em>Wert Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWertValue()
     * @generated
     * @ordered
     */
    protected static final BigDecimal WERT_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWertValue() <em>Wert Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWertValue()
     * @generated
     * @ordered
     */
    protected BigDecimal wertValue = WERT_VALUE_EDEFAULT;

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
     * The cached value of the '{@link #getMods() <em>Mods</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMods()
     * @generated
     * @ordered
     */
	protected EList<AttributModifikatorWert> mods;

	/**
     * The cached value of the '{@link #getFertigkeit() <em>Fertigkeit</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFertigkeit()
     * @generated
     * @ordered
     */
	protected Fertigkeit fertigkeit;

	/**
     * The cached value of the '{@link #getSpezialisierung() <em>Spezialisierung</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpezialisierung()
     * @generated
     * @ordered
     */
    protected Spezialisierung spezialisierung;

    /**
     * The cached value of the '{@link #getWifi() <em>Wifi</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWifi()
     * @generated
     * @ordered
     */
    protected MatrixDevice wifi;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated not
     */
	protected AbstraktGegenstandImpl() {
        super();
        
//        adapter = new EContentAdapter() {
//            public void notifyChanged(Notification notification) {
//              super.notifyChanged(notification);
//              System.out
//                  .println("Notfication received from the data model. Data model has changed!!!");
//            }
//          };  
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.ABSTRAKT_GEGENSTAND;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__PARENT_ID, oldParentId, parentId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Localization> getLocalizations() {
        if (localizations == null) {
            localizations = new EObjectContainmentEList<Localization>(Localization.class, this, Shr5Package.ABSTRAKT_GEGENSTAND__LOCALIZATIONS);
        }
        return localizations;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__PAGE, oldPage, page));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.ABSTRAKT_GEGENSTAND__SRC_BOOK, oldSrcBook, srcBook));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__SRC_BOOK, oldSrcBook, srcBook));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated not
     */
	public BigDecimal getWert() {
        return getWertValue();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public String getVerfuegbarkeit() {
        return verfuegbarkeit;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setVerfuegbarkeit(String newVerfuegbarkeit) {
        String oldVerfuegbarkeit = verfuegbarkeit;
        verfuegbarkeit = newVerfuegbarkeit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT, oldVerfuegbarkeit, verfuegbarkeit));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getWertValue() {
        return wertValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public void setWertValue(BigDecimal newWertValue) {
        BigDecimal oldWertValue = wertValue;
        wertValue = newWertValue;
        if (eNotificationRequired()){
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__WERT_VALUE, oldWertValue, wertValue));
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__WERT, oldWertValue, wertValue));
        }}

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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__IMAGE, oldImage, image));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EList<AttributModifikatorWert> getMods() {
        if (mods == null) {
            mods = new EObjectContainmentWithInverseEList<AttributModifikatorWert>(AttributModifikatorWert.class, this, Shr5Package.ABSTRAKT_GEGENSTAND__MODS, Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES);
        }
        return mods;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public Fertigkeit getFertigkeit() {
        if (fertigkeit != null && fertigkeit.eIsProxy()) {
            InternalEObject oldFertigkeit = (InternalEObject)fertigkeit;
            fertigkeit = (Fertigkeit)eResolveProxy(oldFertigkeit);
            if (fertigkeit != oldFertigkeit) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.ABSTRAKT_GEGENSTAND__FERTIGKEIT, oldFertigkeit, fertigkeit));
            }
        }
        return fertigkeit;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Fertigkeit basicGetFertigkeit() {
        return fertigkeit;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setFertigkeit(Fertigkeit newFertigkeit) {
        Fertigkeit oldFertigkeit = fertigkeit;
        fertigkeit = newFertigkeit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__FERTIGKEIT, oldFertigkeit, fertigkeit));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Spezialisierung getSpezialisierung() {
        if (spezialisierung != null && spezialisierung.eIsProxy()) {
            InternalEObject oldSpezialisierung = (InternalEObject)spezialisierung;
            spezialisierung = (Spezialisierung)eResolveProxy(oldSpezialisierung);
            if (spezialisierung != oldSpezialisierung) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.ABSTRAKT_GEGENSTAND__SPEZIALISIERUNG, oldSpezialisierung, spezialisierung));
            }
        }
        return spezialisierung;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Spezialisierung basicGetSpezialisierung() {
        return spezialisierung;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpezialisierung(Spezialisierung newSpezialisierung) {
        Spezialisierung oldSpezialisierung = spezialisierung;
        spezialisierung = newSpezialisierung;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__SPEZIALISIERUNG, oldSpezialisierung, spezialisierung));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MatrixDevice getWifi() {
        return wifi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWifi(MatrixDevice newWifi, NotificationChain msgs) {
        MatrixDevice oldWifi = wifi;
        wifi = newWifi;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__WIFI, oldWifi, newWifi);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWifi(MatrixDevice newWifi) {
        if (newWifi != wifi) {
            NotificationChain msgs = null;
            if (wifi != null)
                msgs = ((InternalEObject)wifi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5Package.ABSTRAKT_GEGENSTAND__WIFI, null, msgs);
            if (newWifi != null)
                msgs = ((InternalEObject)newWifi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Shr5Package.ABSTRAKT_GEGENSTAND__WIFI, null, msgs);
            msgs = basicSetWifi(newWifi, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_GEGENSTAND__WIFI, newWifi, newWifi));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.ABSTRAKT_GEGENSTAND__MODS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getMods()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.ABSTRAKT_GEGENSTAND__LOCALIZATIONS:
                return ((InternalEList<?>)getLocalizations()).basicRemove(otherEnd, msgs);
            case Shr5Package.ABSTRAKT_GEGENSTAND__MODS:
                return ((InternalEList<?>)getMods()).basicRemove(otherEnd, msgs);
            case Shr5Package.ABSTRAKT_GEGENSTAND__WIFI:
                return basicSetWifi(null, msgs);
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
            case Shr5Package.ABSTRAKT_GEGENSTAND__PARENT_ID:
                return getParentId();
            case Shr5Package.ABSTRAKT_GEGENSTAND__LOCALIZATIONS:
                return getLocalizations();
            case Shr5Package.ABSTRAKT_GEGENSTAND__PAGE:
                return getPage();
            case Shr5Package.ABSTRAKT_GEGENSTAND__SRC_BOOK:
                if (resolve) return getSrcBook();
                return basicGetSrcBook();
            case Shr5Package.ABSTRAKT_GEGENSTAND__WERT:
                return getWert();
            case Shr5Package.ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT:
                return getVerfuegbarkeit();
            case Shr5Package.ABSTRAKT_GEGENSTAND__WERT_VALUE:
                return getWertValue();
            case Shr5Package.ABSTRAKT_GEGENSTAND__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5Package.ABSTRAKT_GEGENSTAND__IMAGE:
                return getImage();
            case Shr5Package.ABSTRAKT_GEGENSTAND__NAME:
                return getName();
            case Shr5Package.ABSTRAKT_GEGENSTAND__MODS:
                return getMods();
            case Shr5Package.ABSTRAKT_GEGENSTAND__FERTIGKEIT:
                if (resolve) return getFertigkeit();
                return basicGetFertigkeit();
            case Shr5Package.ABSTRAKT_GEGENSTAND__SPEZIALISIERUNG:
                if (resolve) return getSpezialisierung();
                return basicGetSpezialisierung();
            case Shr5Package.ABSTRAKT_GEGENSTAND__WIFI:
                return getWifi();
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
            case Shr5Package.ABSTRAKT_GEGENSTAND__PARENT_ID:
                setParentId((String)newValue);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__LOCALIZATIONS:
                getLocalizations().clear();
                getLocalizations().addAll((Collection<? extends Localization>)newValue);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__PAGE:
                setPage((String)newValue);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__SRC_BOOK:
                setSrcBook((SourceBook)newValue);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT:
                setVerfuegbarkeit((String)newValue);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__WERT_VALUE:
                setWertValue((BigDecimal)newValue);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__NAME:
                setName((String)newValue);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__MODS:
                getMods().clear();
                getMods().addAll((Collection<? extends AttributModifikatorWert>)newValue);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__FERTIGKEIT:
                setFertigkeit((Fertigkeit)newValue);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__SPEZIALISIERUNG:
                setSpezialisierung((Spezialisierung)newValue);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__WIFI:
                setWifi((MatrixDevice)newValue);
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
            case Shr5Package.ABSTRAKT_GEGENSTAND__PARENT_ID:
                setParentId(PARENT_ID_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__LOCALIZATIONS:
                getLocalizations().clear();
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__PAGE:
                setPage(PAGE_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__SRC_BOOK:
                setSrcBook((SourceBook)null);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT:
                setVerfuegbarkeit(VERFUEGBARKEIT_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__WERT_VALUE:
                setWertValue(WERT_VALUE_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__MODS:
                getMods().clear();
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__FERTIGKEIT:
                setFertigkeit((Fertigkeit)null);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__SPEZIALISIERUNG:
                setSpezialisierung((Spezialisierung)null);
                return;
            case Shr5Package.ABSTRAKT_GEGENSTAND__WIFI:
                setWifi((MatrixDevice)null);
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
            case Shr5Package.ABSTRAKT_GEGENSTAND__PARENT_ID:
                return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
            case Shr5Package.ABSTRAKT_GEGENSTAND__LOCALIZATIONS:
                return localizations != null && !localizations.isEmpty();
            case Shr5Package.ABSTRAKT_GEGENSTAND__PAGE:
                return PAGE_EDEFAULT == null ? page != null : !PAGE_EDEFAULT.equals(page);
            case Shr5Package.ABSTRAKT_GEGENSTAND__SRC_BOOK:
                return srcBook != null;
            case Shr5Package.ABSTRAKT_GEGENSTAND__WERT:
                return WERT_EDEFAULT == null ? getWert() != null : !WERT_EDEFAULT.equals(getWert());
            case Shr5Package.ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT:
                return VERFUEGBARKEIT_EDEFAULT == null ? verfuegbarkeit != null : !VERFUEGBARKEIT_EDEFAULT.equals(verfuegbarkeit);
            case Shr5Package.ABSTRAKT_GEGENSTAND__WERT_VALUE:
                return WERT_VALUE_EDEFAULT == null ? wertValue != null : !WERT_VALUE_EDEFAULT.equals(wertValue);
            case Shr5Package.ABSTRAKT_GEGENSTAND__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5Package.ABSTRAKT_GEGENSTAND__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5Package.ABSTRAKT_GEGENSTAND__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5Package.ABSTRAKT_GEGENSTAND__MODS:
                return mods != null && !mods.isEmpty();
            case Shr5Package.ABSTRAKT_GEGENSTAND__FERTIGKEIT:
                return fertigkeit != null;
            case Shr5Package.ABSTRAKT_GEGENSTAND__SPEZIALISIERUNG:
                return spezialisierung != null;
            case Shr5Package.ABSTRAKT_GEGENSTAND__WIFI:
                return wifi != null;
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
        if (baseClass == GeldWert.class) {
            switch (derivedFeatureID) {
                case Shr5Package.ABSTRAKT_GEGENSTAND__WERT: return Shr5Package.GELD_WERT__WERT;
                case Shr5Package.ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT: return Shr5Package.GELD_WERT__VERFUEGBARKEIT;
                case Shr5Package.ABSTRAKT_GEGENSTAND__WERT_VALUE: return Shr5Package.GELD_WERT__WERT_VALUE;
                default: return -1;
            }
        }
        if (baseClass == Beschreibbar.class) {
            switch (derivedFeatureID) {
                case Shr5Package.ABSTRAKT_GEGENSTAND__BESCHREIBUNG: return Shr5Package.BESCHREIBBAR__BESCHREIBUNG;
                case Shr5Package.ABSTRAKT_GEGENSTAND__IMAGE: return Shr5Package.BESCHREIBBAR__IMAGE;
                case Shr5Package.ABSTRAKT_GEGENSTAND__NAME: return Shr5Package.BESCHREIBBAR__NAME;
                default: return -1;
            }
        }
        if (baseClass == Modifizierbar.class) {
            switch (derivedFeatureID) {
                case Shr5Package.ABSTRAKT_GEGENSTAND__MODS: return Shr5Package.MODIFIZIERBAR__MODS;
                default: return -1;
            }
        }
        if (baseClass == Anwendbar.class) {
            switch (derivedFeatureID) {
                case Shr5Package.ABSTRAKT_GEGENSTAND__FERTIGKEIT: return Shr5Package.ANWENDBAR__FERTIGKEIT;
                case Shr5Package.ABSTRAKT_GEGENSTAND__SPEZIALISIERUNG: return Shr5Package.ANWENDBAR__SPEZIALISIERUNG;
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
        if (baseClass == GeldWert.class) {
            switch (baseFeatureID) {
                case Shr5Package.GELD_WERT__WERT: return Shr5Package.ABSTRAKT_GEGENSTAND__WERT;
                case Shr5Package.GELD_WERT__VERFUEGBARKEIT: return Shr5Package.ABSTRAKT_GEGENSTAND__VERFUEGBARKEIT;
                case Shr5Package.GELD_WERT__WERT_VALUE: return Shr5Package.ABSTRAKT_GEGENSTAND__WERT_VALUE;
                default: return -1;
            }
        }
        if (baseClass == Beschreibbar.class) {
            switch (baseFeatureID) {
                case Shr5Package.BESCHREIBBAR__BESCHREIBUNG: return Shr5Package.ABSTRAKT_GEGENSTAND__BESCHREIBUNG;
                case Shr5Package.BESCHREIBBAR__IMAGE: return Shr5Package.ABSTRAKT_GEGENSTAND__IMAGE;
                case Shr5Package.BESCHREIBBAR__NAME: return Shr5Package.ABSTRAKT_GEGENSTAND__NAME;
                default: return -1;
            }
        }
        if (baseClass == Modifizierbar.class) {
            switch (baseFeatureID) {
                case Shr5Package.MODIFIZIERBAR__MODS: return Shr5Package.ABSTRAKT_GEGENSTAND__MODS;
                default: return -1;
            }
        }
        if (baseClass == Anwendbar.class) {
            switch (baseFeatureID) {
                case Shr5Package.ANWENDBAR__FERTIGKEIT: return Shr5Package.ABSTRAKT_GEGENSTAND__FERTIGKEIT;
                case Shr5Package.ANWENDBAR__SPEZIALISIERUNG: return Shr5Package.ABSTRAKT_GEGENSTAND__SPEZIALISIERUNG;
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
        result.append(" (parentId: ");
        result.append(parentId);
        result.append(", page: ");
        result.append(page);
        result.append(", verfuegbarkeit: ");
        result.append(verfuegbarkeit);
        result.append(", wertValue: ");
        result.append(wertValue);
        result.append(", beschreibung: ");
        result.append(beschreibung);
        result.append(", image: ");
        result.append(image);
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //AbstraktGegenstandImpl
