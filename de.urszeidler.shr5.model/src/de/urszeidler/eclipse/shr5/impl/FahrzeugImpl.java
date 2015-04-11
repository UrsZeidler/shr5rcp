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
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.Anwendbar;
import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.Fahrzeug;
import de.urszeidler.eclipse.shr5.FahrzeugModifikation;
import de.urszeidler.eclipse.shr5.FahrzeugZustand;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.Localization;
import de.urszeidler.eclipse.shr5.Modifizierbar;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.SensorArray;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.Spezialisierung;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fahrzeug</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getLocalizations <em>Localizations</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getPage <em>Page</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getSrcBook <em>Src Book</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getWert <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getVerfuegbarkeit <em>Verfuegbarkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getWertValue <em>Wert Value</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getFertigkeit <em>Fertigkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getSpezialisierung <em>Spezialisierung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getMods <em>Mods</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getZustandMax <em>Zustand Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getHandling <em>Handling</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getGeschwindigkeit <em>Geschwindigkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getBeschleunigung <em>Beschleunigung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getRumpf <em>Rumpf</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getPilot <em>Pilot</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getFahrzeugTyp <em>Fahrzeug Typ</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getModifizierungen <em>Modifizierungen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getPanzer <em>Panzer</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getWeaponMounts <em>Weapon Mounts</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getSensorArray <em>Sensor Array</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FahrzeugImpl extends MinimalEObjectImpl.Container implements Fahrzeug {
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
     * The cached value of the '{@link #getMods() <em>Mods</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMods()
     * @generated
     * @ordered
     */
    protected EList<AttributModifikatorWert> mods;

    /**
     * The default value of the '{@link #getZustandMax() <em>Zustand Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZustandMax()
     * @generated
     * @ordered
     */
    protected static final int ZUSTAND_MAX_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getHandling() <em>Handling</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHandling()
     * @generated
     * @ordered
     */
    protected static final int HANDLING_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getHandling() <em>Handling</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHandling()
     * @generated
     * @ordered
     */
    protected int handling = HANDLING_EDEFAULT;

    /**
     * The default value of the '{@link #getGeschwindigkeit() <em>Geschwindigkeit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeschwindigkeit()
     * @generated
     * @ordered
     */
    protected static final int GESCHWINDIGKEIT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getGeschwindigkeit() <em>Geschwindigkeit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeschwindigkeit()
     * @generated
     * @ordered
     */
    protected int geschwindigkeit = GESCHWINDIGKEIT_EDEFAULT;

    /**
     * The default value of the '{@link #getBeschleunigung() <em>Beschleunigung</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeschleunigung()
     * @generated
     * @ordered
     */
    protected static final int BESCHLEUNIGUNG_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getBeschleunigung() <em>Beschleunigung</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeschleunigung()
     * @generated
     * @ordered
     */
    protected int beschleunigung = BESCHLEUNIGUNG_EDEFAULT;

    /**
     * The default value of the '{@link #getRumpf() <em>Rumpf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRumpf()
     * @generated
     * @ordered
     */
    protected static final int RUMPF_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getRumpf() <em>Rumpf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRumpf()
     * @generated
     * @ordered
     */
    protected int rumpf = RUMPF_EDEFAULT;

    /**
     * The default value of the '{@link #getPilot() <em>Pilot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPilot()
     * @generated
     * @ordered
     */
    protected static final int PILOT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPilot() <em>Pilot</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPilot()
     * @generated
     * @ordered
     */
    protected int pilot = PILOT_EDEFAULT;

    /**
     * The default value of the '{@link #getSensor() <em>Sensor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSensor()
     * @generated
     * @ordered
     */
    protected static final int SENSOR_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSensor() <em>Sensor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSensor()
     * @generated
     * @ordered
     */
    protected int sensor = SENSOR_EDEFAULT;

    /**
     * The default value of the '{@link #getFahrzeugTyp() <em>Fahrzeug Typ</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFahrzeugTyp()
     * @generated
     * @ordered
     */
    protected static final String FAHRZEUG_TYP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFahrzeugTyp() <em>Fahrzeug Typ</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFahrzeugTyp()
     * @generated
     * @ordered
     */
    protected String fahrzeugTyp = FAHRZEUG_TYP_EDEFAULT;

    /**
     * The cached value of the '{@link #getModifizierungen() <em>Modifizierungen</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModifizierungen()
     * @generated
     * @ordered
     */
    protected EList<FahrzeugModifikation> modifizierungen;

    /**
     * The default value of the '{@link #getPanzer() <em>Panzer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPanzer()
     * @generated
     * @ordered
     */
    protected static final int PANZER_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPanzer() <em>Panzer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPanzer()
     * @generated
     * @ordered
     */
    protected int panzer = PANZER_EDEFAULT;

    private EContentAdapter eContentAdapter;

    /**
     * The default value of the '{@link #getWeaponMounts() <em>Weapon Mounts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeaponMounts()
     * @generated
     * @ordered
     */
    protected static final int WEAPON_MOUNTS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSensorArray() <em>Sensor Array</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSensorArray()
     * @generated
     * @ordered
     */
    protected SensorArray sensorArray;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected FahrzeugImpl() {
        super();
        eContentAdapter = new EContentAdapter() {
            @Override
            public void notifyChanged(Notification notification) {
                super.notifyChanged(notification);
                Object feature = notification.getFeature();
                if (Shr5Package.Literals.FAHRZEUG__MODIFIZIERUNGEN.equals(feature) || Shr5Package.Literals.DROHNE__STORED_PROGRAMS.equals(feature))
                    FahrzeugImpl.this.eNotify(new ENotificationImpl(FahrzeugImpl.this, Notification.SET, Shr5Package.Literals.GELD_WERT__WERT, 1, 2));

            }

        };
        eContentAdapter.setTarget(this);
        this.eAdapters().add(eContentAdapter);

    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.FAHRZEUG;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__PARENT_ID, oldParentId, parentId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Localization> getLocalizations() {
        if (localizations == null) {
            localizations = new EObjectContainmentEList<Localization>(Localization.class, this, Shr5Package.FAHRZEUG__LOCALIZATIONS);
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__IMAGE, oldImage, image));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__PAGE, oldPage, page));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.FAHRZEUG__SRC_BOOK, oldSrcBook, srcBook));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__SRC_BOOK, oldSrcBook, srcBook));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public BigDecimal getWert() {
        if (getWertValue() == null)
            return null;

        BigDecimal listenWert = ShadowrunTools.calcListenWert(getModifizierungen());
        return getWertValue().add(listenWert);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVerfuegbarkeit() {
        return verfuegbarkeit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVerfuegbarkeit(String newVerfuegbarkeit) {
        String oldVerfuegbarkeit = verfuegbarkeit;
        verfuegbarkeit = newVerfuegbarkeit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__VERFUEGBARKEIT, oldVerfuegbarkeit, verfuegbarkeit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigDecimal getWertValue() {
        return wertValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void setWertValue(BigDecimal newWertValue) {
        BigDecimal oldWertValue = wertValue;
        wertValue = newWertValue;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__WERT_VALUE, oldWertValue, wertValue));
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__WERT, oldWertValue, wertValue));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fertigkeit getFertigkeit() {
        if (fertigkeit != null && fertigkeit.eIsProxy()) {
            InternalEObject oldFertigkeit = (InternalEObject)fertigkeit;
            fertigkeit = (Fertigkeit)eResolveProxy(oldFertigkeit);
            if (fertigkeit != oldFertigkeit) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.FAHRZEUG__FERTIGKEIT, oldFertigkeit, fertigkeit));
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
    public void setFertigkeit(Fertigkeit newFertigkeit) {
        Fertigkeit oldFertigkeit = fertigkeit;
        fertigkeit = newFertigkeit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__FERTIGKEIT, oldFertigkeit, fertigkeit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Spezialisierung getSpezialisierung() {
        if (spezialisierung != null && spezialisierung.eIsProxy()) {
            InternalEObject oldSpezialisierung = (InternalEObject)spezialisierung;
            spezialisierung = (Spezialisierung)eResolveProxy(oldSpezialisierung);
            if (spezialisierung != oldSpezialisierung) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.FAHRZEUG__SPEZIALISIERUNG, oldSpezialisierung, spezialisierung));
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
    public void setSpezialisierung(Spezialisierung newSpezialisierung) {
        Spezialisierung oldSpezialisierung = spezialisierung;
        spezialisierung = newSpezialisierung;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__SPEZIALISIERUNG, oldSpezialisierung, spezialisierung));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AttributModifikatorWert> getMods() {
        if (mods == null) {
            mods = new EObjectContainmentWithInverseEList<AttributModifikatorWert>(AttributModifikatorWert.class, this, Shr5Package.FAHRZEUG__MODS, Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES);
        }
        return mods;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getZustandMax() {
        return 12 + (getRumpf() / 2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getHandling() {
        return handling;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHandling(int newHandling) {
        int oldHandling = handling;
        handling = newHandling;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__HANDLING, oldHandling, handling));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGeschwindigkeit(int newGeschwindigkeit) {
        int oldGeschwindigkeit = geschwindigkeit;
        geschwindigkeit = newGeschwindigkeit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__GESCHWINDIGKEIT, oldGeschwindigkeit, geschwindigkeit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getBeschleunigung() {
        return beschleunigung;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBeschleunigung(int newBeschleunigung) {
        int oldBeschleunigung = beschleunigung;
        beschleunigung = newBeschleunigung;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__BESCHLEUNIGUNG, oldBeschleunigung, beschleunigung));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getRumpf() {
        return rumpf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRumpf(int newRumpf) {
        int oldRumpf = rumpf;
        rumpf = newRumpf;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__RUMPF, oldRumpf, rumpf));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPilot() {
        return pilot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPilot(int newPilot) {
        int oldPilot = pilot;
        pilot = newPilot;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__PILOT, oldPilot, pilot));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSensor() {
        return sensor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSensor(int newSensor) {
        int oldSensor = sensor;
        sensor = newSensor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__SENSOR, oldSensor, sensor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFahrzeugTyp() {
        return fahrzeugTyp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFahrzeugTyp(String newFahrzeugTyp) {
        String oldFahrzeugTyp = fahrzeugTyp;
        fahrzeugTyp = newFahrzeugTyp;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__FAHRZEUG_TYP, oldFahrzeugTyp, fahrzeugTyp));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FahrzeugModifikation> getModifizierungen() {
        if (modifizierungen == null) {
            modifizierungen = new EObjectContainmentEList<FahrzeugModifikation>(FahrzeugModifikation.class, this, Shr5Package.FAHRZEUG__MODIFIZIERUNGEN);
        }
        return modifizierungen;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPanzer() {
        return panzer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPanzer(int newPanzer) {
        int oldPanzer = panzer;
        panzer = newPanzer;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__PANZER, oldPanzer, panzer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getWeaponMounts() {
        return getRumpf() / 3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SensorArray getSensorArray() {
        return sensorArray;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSensorArray(SensorArray newSensorArray, NotificationChain msgs) {
        SensorArray oldSensorArray = sensorArray;
        sensorArray = newSensorArray;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__SENSOR_ARRAY, oldSensorArray, newSensorArray);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSensorArray(SensorArray newSensorArray) {
        if (newSensorArray != sensorArray) {
            NotificationChain msgs = null;
            if (sensorArray != null)
                msgs = ((InternalEObject)sensorArray).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5Package.FAHRZEUG__SENSOR_ARRAY, null, msgs);
            if (newSensorArray != null)
                msgs = ((InternalEObject)newSensorArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Shr5Package.FAHRZEUG__SENSOR_ARRAY, null, msgs);
            msgs = basicSetSensorArray(newSensorArray, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__SENSOR_ARRAY, newSensorArray, newSensorArray));
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
            case Shr5Package.FAHRZEUG__MODS:
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
            case Shr5Package.FAHRZEUG__LOCALIZATIONS:
                return ((InternalEList<?>)getLocalizations()).basicRemove(otherEnd, msgs);
            case Shr5Package.FAHRZEUG__MODS:
                return ((InternalEList<?>)getMods()).basicRemove(otherEnd, msgs);
            case Shr5Package.FAHRZEUG__MODIFIZIERUNGEN:
                return ((InternalEList<?>)getModifizierungen()).basicRemove(otherEnd, msgs);
            case Shr5Package.FAHRZEUG__SENSOR_ARRAY:
                return basicSetSensorArray(null, msgs);
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
            case Shr5Package.FAHRZEUG__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5Package.FAHRZEUG__IMAGE:
                return getImage();
            case Shr5Package.FAHRZEUG__NAME:
                return getName();
            case Shr5Package.FAHRZEUG__PARENT_ID:
                return getParentId();
            case Shr5Package.FAHRZEUG__LOCALIZATIONS:
                return getLocalizations();
            case Shr5Package.FAHRZEUG__PAGE:
                return getPage();
            case Shr5Package.FAHRZEUG__SRC_BOOK:
                if (resolve) return getSrcBook();
                return basicGetSrcBook();
            case Shr5Package.FAHRZEUG__WERT:
                return getWert();
            case Shr5Package.FAHRZEUG__VERFUEGBARKEIT:
                return getVerfuegbarkeit();
            case Shr5Package.FAHRZEUG__WERT_VALUE:
                return getWertValue();
            case Shr5Package.FAHRZEUG__FERTIGKEIT:
                if (resolve) return getFertigkeit();
                return basicGetFertigkeit();
            case Shr5Package.FAHRZEUG__SPEZIALISIERUNG:
                if (resolve) return getSpezialisierung();
                return basicGetSpezialisierung();
            case Shr5Package.FAHRZEUG__MODS:
                return getMods();
            case Shr5Package.FAHRZEUG__ZUSTAND_MAX:
                return getZustandMax();
            case Shr5Package.FAHRZEUG__HANDLING:
                return getHandling();
            case Shr5Package.FAHRZEUG__GESCHWINDIGKEIT:
                return getGeschwindigkeit();
            case Shr5Package.FAHRZEUG__BESCHLEUNIGUNG:
                return getBeschleunigung();
            case Shr5Package.FAHRZEUG__RUMPF:
                return getRumpf();
            case Shr5Package.FAHRZEUG__PILOT:
                return getPilot();
            case Shr5Package.FAHRZEUG__SENSOR:
                return getSensor();
            case Shr5Package.FAHRZEUG__FAHRZEUG_TYP:
                return getFahrzeugTyp();
            case Shr5Package.FAHRZEUG__MODIFIZIERUNGEN:
                return getModifizierungen();
            case Shr5Package.FAHRZEUG__PANZER:
                return getPanzer();
            case Shr5Package.FAHRZEUG__WEAPON_MOUNTS:
                return getWeaponMounts();
            case Shr5Package.FAHRZEUG__SENSOR_ARRAY:
                return getSensorArray();
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
            case Shr5Package.FAHRZEUG__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5Package.FAHRZEUG__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5Package.FAHRZEUG__NAME:
                setName((String)newValue);
                return;
            case Shr5Package.FAHRZEUG__PARENT_ID:
                setParentId((String)newValue);
                return;
            case Shr5Package.FAHRZEUG__LOCALIZATIONS:
                getLocalizations().clear();
                getLocalizations().addAll((Collection<? extends Localization>)newValue);
                return;
            case Shr5Package.FAHRZEUG__PAGE:
                setPage((String)newValue);
                return;
            case Shr5Package.FAHRZEUG__SRC_BOOK:
                setSrcBook((SourceBook)newValue);
                return;
            case Shr5Package.FAHRZEUG__VERFUEGBARKEIT:
                setVerfuegbarkeit((String)newValue);
                return;
            case Shr5Package.FAHRZEUG__WERT_VALUE:
                setWertValue((BigDecimal)newValue);
                return;
            case Shr5Package.FAHRZEUG__FERTIGKEIT:
                setFertigkeit((Fertigkeit)newValue);
                return;
            case Shr5Package.FAHRZEUG__SPEZIALISIERUNG:
                setSpezialisierung((Spezialisierung)newValue);
                return;
            case Shr5Package.FAHRZEUG__MODS:
                getMods().clear();
                getMods().addAll((Collection<? extends AttributModifikatorWert>)newValue);
                return;
            case Shr5Package.FAHRZEUG__HANDLING:
                setHandling((Integer)newValue);
                return;
            case Shr5Package.FAHRZEUG__GESCHWINDIGKEIT:
                setGeschwindigkeit((Integer)newValue);
                return;
            case Shr5Package.FAHRZEUG__BESCHLEUNIGUNG:
                setBeschleunigung((Integer)newValue);
                return;
            case Shr5Package.FAHRZEUG__RUMPF:
                setRumpf((Integer)newValue);
                return;
            case Shr5Package.FAHRZEUG__PILOT:
                setPilot((Integer)newValue);
                return;
            case Shr5Package.FAHRZEUG__SENSOR:
                setSensor((Integer)newValue);
                return;
            case Shr5Package.FAHRZEUG__FAHRZEUG_TYP:
                setFahrzeugTyp((String)newValue);
                return;
            case Shr5Package.FAHRZEUG__MODIFIZIERUNGEN:
                getModifizierungen().clear();
                getModifizierungen().addAll((Collection<? extends FahrzeugModifikation>)newValue);
                return;
            case Shr5Package.FAHRZEUG__PANZER:
                setPanzer((Integer)newValue);
                return;
            case Shr5Package.FAHRZEUG__SENSOR_ARRAY:
                setSensorArray((SensorArray)newValue);
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
            case Shr5Package.FAHRZEUG__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__PARENT_ID:
                setParentId(PARENT_ID_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__LOCALIZATIONS:
                getLocalizations().clear();
                return;
            case Shr5Package.FAHRZEUG__PAGE:
                setPage(PAGE_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__SRC_BOOK:
                setSrcBook((SourceBook)null);
                return;
            case Shr5Package.FAHRZEUG__VERFUEGBARKEIT:
                setVerfuegbarkeit(VERFUEGBARKEIT_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__WERT_VALUE:
                setWertValue(WERT_VALUE_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__FERTIGKEIT:
                setFertigkeit((Fertigkeit)null);
                return;
            case Shr5Package.FAHRZEUG__SPEZIALISIERUNG:
                setSpezialisierung((Spezialisierung)null);
                return;
            case Shr5Package.FAHRZEUG__MODS:
                getMods().clear();
                return;
            case Shr5Package.FAHRZEUG__HANDLING:
                setHandling(HANDLING_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__GESCHWINDIGKEIT:
                setGeschwindigkeit(GESCHWINDIGKEIT_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__BESCHLEUNIGUNG:
                setBeschleunigung(BESCHLEUNIGUNG_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__RUMPF:
                setRumpf(RUMPF_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__PILOT:
                setPilot(PILOT_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__SENSOR:
                setSensor(SENSOR_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__FAHRZEUG_TYP:
                setFahrzeugTyp(FAHRZEUG_TYP_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__MODIFIZIERUNGEN:
                getModifizierungen().clear();
                return;
            case Shr5Package.FAHRZEUG__PANZER:
                setPanzer(PANZER_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__SENSOR_ARRAY:
                setSensorArray((SensorArray)null);
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
            case Shr5Package.FAHRZEUG__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5Package.FAHRZEUG__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5Package.FAHRZEUG__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5Package.FAHRZEUG__PARENT_ID:
                return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
            case Shr5Package.FAHRZEUG__LOCALIZATIONS:
                return localizations != null && !localizations.isEmpty();
            case Shr5Package.FAHRZEUG__PAGE:
                return PAGE_EDEFAULT == null ? page != null : !PAGE_EDEFAULT.equals(page);
            case Shr5Package.FAHRZEUG__SRC_BOOK:
                return srcBook != null;
            case Shr5Package.FAHRZEUG__WERT:
                return WERT_EDEFAULT == null ? getWert() != null : !WERT_EDEFAULT.equals(getWert());
            case Shr5Package.FAHRZEUG__VERFUEGBARKEIT:
                return VERFUEGBARKEIT_EDEFAULT == null ? verfuegbarkeit != null : !VERFUEGBARKEIT_EDEFAULT.equals(verfuegbarkeit);
            case Shr5Package.FAHRZEUG__WERT_VALUE:
                return WERT_VALUE_EDEFAULT == null ? wertValue != null : !WERT_VALUE_EDEFAULT.equals(wertValue);
            case Shr5Package.FAHRZEUG__FERTIGKEIT:
                return fertigkeit != null;
            case Shr5Package.FAHRZEUG__SPEZIALISIERUNG:
                return spezialisierung != null;
            case Shr5Package.FAHRZEUG__MODS:
                return mods != null && !mods.isEmpty();
            case Shr5Package.FAHRZEUG__ZUSTAND_MAX:
                return getZustandMax() != ZUSTAND_MAX_EDEFAULT;
            case Shr5Package.FAHRZEUG__HANDLING:
                return handling != HANDLING_EDEFAULT;
            case Shr5Package.FAHRZEUG__GESCHWINDIGKEIT:
                return geschwindigkeit != GESCHWINDIGKEIT_EDEFAULT;
            case Shr5Package.FAHRZEUG__BESCHLEUNIGUNG:
                return beschleunigung != BESCHLEUNIGUNG_EDEFAULT;
            case Shr5Package.FAHRZEUG__RUMPF:
                return rumpf != RUMPF_EDEFAULT;
            case Shr5Package.FAHRZEUG__PILOT:
                return pilot != PILOT_EDEFAULT;
            case Shr5Package.FAHRZEUG__SENSOR:
                return sensor != SENSOR_EDEFAULT;
            case Shr5Package.FAHRZEUG__FAHRZEUG_TYP:
                return FAHRZEUG_TYP_EDEFAULT == null ? fahrzeugTyp != null : !FAHRZEUG_TYP_EDEFAULT.equals(fahrzeugTyp);
            case Shr5Package.FAHRZEUG__MODIFIZIERUNGEN:
                return modifizierungen != null && !modifizierungen.isEmpty();
            case Shr5Package.FAHRZEUG__PANZER:
                return panzer != PANZER_EDEFAULT;
            case Shr5Package.FAHRZEUG__WEAPON_MOUNTS:
                return getWeaponMounts() != WEAPON_MOUNTS_EDEFAULT;
            case Shr5Package.FAHRZEUG__SENSOR_ARRAY:
                return sensorArray != null;
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
                case Shr5Package.FAHRZEUG__PARENT_ID: return Shr5Package.IDENTIFIABLE__PARENT_ID;
                case Shr5Package.FAHRZEUG__LOCALIZATIONS: return Shr5Package.IDENTIFIABLE__LOCALIZATIONS;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (derivedFeatureID) {
                case Shr5Package.FAHRZEUG__PAGE: return Shr5Package.QUELLE__PAGE;
                case Shr5Package.FAHRZEUG__SRC_BOOK: return Shr5Package.QUELLE__SRC_BOOK;
                default: return -1;
            }
        }
        if (baseClass == GeldWert.class) {
            switch (derivedFeatureID) {
                case Shr5Package.FAHRZEUG__WERT: return Shr5Package.GELD_WERT__WERT;
                case Shr5Package.FAHRZEUG__VERFUEGBARKEIT: return Shr5Package.GELD_WERT__VERFUEGBARKEIT;
                case Shr5Package.FAHRZEUG__WERT_VALUE: return Shr5Package.GELD_WERT__WERT_VALUE;
                default: return -1;
            }
        }
        if (baseClass == Anwendbar.class) {
            switch (derivedFeatureID) {
                case Shr5Package.FAHRZEUG__FERTIGKEIT: return Shr5Package.ANWENDBAR__FERTIGKEIT;
                case Shr5Package.FAHRZEUG__SPEZIALISIERUNG: return Shr5Package.ANWENDBAR__SPEZIALISIERUNG;
                default: return -1;
            }
        }
        if (baseClass == Modifizierbar.class) {
            switch (derivedFeatureID) {
                case Shr5Package.FAHRZEUG__MODS: return Shr5Package.MODIFIZIERBAR__MODS;
                default: return -1;
            }
        }
        if (baseClass == FahrzeugZustand.class) {
            switch (derivedFeatureID) {
                case Shr5Package.FAHRZEUG__ZUSTAND_MAX: return Shr5Package.FAHRZEUG_ZUSTAND__ZUSTAND_MAX;
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
                case Shr5Package.IDENTIFIABLE__PARENT_ID: return Shr5Package.FAHRZEUG__PARENT_ID;
                case Shr5Package.IDENTIFIABLE__LOCALIZATIONS: return Shr5Package.FAHRZEUG__LOCALIZATIONS;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (baseFeatureID) {
                case Shr5Package.QUELLE__PAGE: return Shr5Package.FAHRZEUG__PAGE;
                case Shr5Package.QUELLE__SRC_BOOK: return Shr5Package.FAHRZEUG__SRC_BOOK;
                default: return -1;
            }
        }
        if (baseClass == GeldWert.class) {
            switch (baseFeatureID) {
                case Shr5Package.GELD_WERT__WERT: return Shr5Package.FAHRZEUG__WERT;
                case Shr5Package.GELD_WERT__VERFUEGBARKEIT: return Shr5Package.FAHRZEUG__VERFUEGBARKEIT;
                case Shr5Package.GELD_WERT__WERT_VALUE: return Shr5Package.FAHRZEUG__WERT_VALUE;
                default: return -1;
            }
        }
        if (baseClass == Anwendbar.class) {
            switch (baseFeatureID) {
                case Shr5Package.ANWENDBAR__FERTIGKEIT: return Shr5Package.FAHRZEUG__FERTIGKEIT;
                case Shr5Package.ANWENDBAR__SPEZIALISIERUNG: return Shr5Package.FAHRZEUG__SPEZIALISIERUNG;
                default: return -1;
            }
        }
        if (baseClass == Modifizierbar.class) {
            switch (baseFeatureID) {
                case Shr5Package.MODIFIZIERBAR__MODS: return Shr5Package.FAHRZEUG__MODS;
                default: return -1;
            }
        }
        if (baseClass == FahrzeugZustand.class) {
            switch (baseFeatureID) {
                case Shr5Package.FAHRZEUG_ZUSTAND__ZUSTAND_MAX: return Shr5Package.FAHRZEUG__ZUSTAND_MAX;
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
        result.append(", page: ");
        result.append(page);
        result.append(", verfuegbarkeit: ");
        result.append(verfuegbarkeit);
        result.append(", wertValue: ");
        result.append(wertValue);
        result.append(", handling: ");
        result.append(handling);
        result.append(", geschwindigkeit: ");
        result.append(geschwindigkeit);
        result.append(", beschleunigung: ");
        result.append(beschleunigung);
        result.append(", rumpf: ");
        result.append(rumpf);
        result.append(", pilot: ");
        result.append(pilot);
        result.append(", sensor: ");
        result.append(sensor);
        result.append(", fahrzeugTyp: ");
        result.append(fahrzeugTyp);
        result.append(", panzer: ");
        result.append(panzer);
        result.append(')');
        return result.toString();
    }

} // FahrzeugImpl
