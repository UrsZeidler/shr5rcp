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
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.Anwendbar;
import de.urszeidler.eclipse.shr5.Fahrzeug;
import de.urszeidler.eclipse.shr5.FahrzeugModifikation;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;

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
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getPage <em>Page</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getSrcBook <em>Src Book</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getWert <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getVerfuegbarkeit <em>Verfuegbarkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getFertigkeit <em>Fertigkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getHandling <em>Handling</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getGeschwindigkeit <em>Geschwindigkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getBeschleunigung <em>Beschleunigung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getRumpf <em>Rumpf</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getPilot <em>Pilot</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getFahrzeugTyp <em>Fahrzeug Typ</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FahrzeugImpl#getModifizierungen <em>Modifizierungen</em>}</li>
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
     * The cached value of the '{@link #getWert() <em>Wert</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWert()
     * @generated
     * @ordered
     */
	protected BigDecimal wert = WERT_EDEFAULT;

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
     * The cached value of the '{@link #getFertigkeit() <em>Fertigkeit</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFertigkeit()
     * @generated
     * @ordered
     */
	protected Fertigkeit fertigkeit;

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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FahrzeugImpl() {
        super();
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
     * @generated
     */
	public BigDecimal getWert() {
        return wert;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setWert(BigDecimal newWert) {
        BigDecimal oldWert = wert;
        wert = newWert;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FAHRZEUG__WERT, oldWert, wert));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.FAHRZEUG__MODIFIZIERUNGEN:
                return ((InternalEList<?>)getModifizierungen()).basicRemove(otherEnd, msgs);
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
            case Shr5Package.FAHRZEUG__PAGE:
                return getPage();
            case Shr5Package.FAHRZEUG__SRC_BOOK:
                if (resolve) return getSrcBook();
                return basicGetSrcBook();
            case Shr5Package.FAHRZEUG__WERT:
                return getWert();
            case Shr5Package.FAHRZEUG__VERFUEGBARKEIT:
                return getVerfuegbarkeit();
            case Shr5Package.FAHRZEUG__FERTIGKEIT:
                if (resolve) return getFertigkeit();
                return basicGetFertigkeit();
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
            case Shr5Package.FAHRZEUG__PAGE:
                setPage((String)newValue);
                return;
            case Shr5Package.FAHRZEUG__SRC_BOOK:
                setSrcBook((SourceBook)newValue);
                return;
            case Shr5Package.FAHRZEUG__WERT:
                setWert((BigDecimal)newValue);
                return;
            case Shr5Package.FAHRZEUG__VERFUEGBARKEIT:
                setVerfuegbarkeit((String)newValue);
                return;
            case Shr5Package.FAHRZEUG__FERTIGKEIT:
                setFertigkeit((Fertigkeit)newValue);
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
            case Shr5Package.FAHRZEUG__PAGE:
                setPage(PAGE_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__SRC_BOOK:
                setSrcBook((SourceBook)null);
                return;
            case Shr5Package.FAHRZEUG__WERT:
                setWert(WERT_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__VERFUEGBARKEIT:
                setVerfuegbarkeit(VERFUEGBARKEIT_EDEFAULT);
                return;
            case Shr5Package.FAHRZEUG__FERTIGKEIT:
                setFertigkeit((Fertigkeit)null);
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
            case Shr5Package.FAHRZEUG__PAGE:
                return PAGE_EDEFAULT == null ? page != null : !PAGE_EDEFAULT.equals(page);
            case Shr5Package.FAHRZEUG__SRC_BOOK:
                return srcBook != null;
            case Shr5Package.FAHRZEUG__WERT:
                return WERT_EDEFAULT == null ? wert != null : !WERT_EDEFAULT.equals(wert);
            case Shr5Package.FAHRZEUG__VERFUEGBARKEIT:
                return VERFUEGBARKEIT_EDEFAULT == null ? verfuegbarkeit != null : !VERFUEGBARKEIT_EDEFAULT.equals(verfuegbarkeit);
            case Shr5Package.FAHRZEUG__FERTIGKEIT:
                return fertigkeit != null;
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
                default: return -1;
            }
        }
        if (baseClass == Anwendbar.class) {
            switch (derivedFeatureID) {
                case Shr5Package.FAHRZEUG__FERTIGKEIT: return Shr5Package.ANWENDBAR__FERTIGKEIT;
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
                default: return -1;
            }
        }
        if (baseClass == Anwendbar.class) {
            switch (baseFeatureID) {
                case Shr5Package.ANWENDBAR__FERTIGKEIT: return Shr5Package.FAHRZEUG__FERTIGKEIT;
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
        result.append(", page: ");
        result.append(page);
        result.append(", wert: ");
        result.append(wert);
        result.append(", verfuegbarkeit: ");
        result.append(verfuegbarkeit);
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
        result.append(')');
        return result.toString();
    }

} //FahrzeugImpl
