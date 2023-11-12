/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

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
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.Localization;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.Pack;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PackImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PackImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PackImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PackImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PackImpl#getLocalizations <em>Localizations</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PackImpl#getPage <em>Page</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PackImpl#getSrcBook <em>Src Book</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PackImpl#getWert <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PackImpl#getVerfuegbarkeit <em>Verfuegbarkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PackImpl#getWertValue <em>Wert Value</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PackImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackImpl extends MinimalEObjectImpl.Container implements Pack {
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
     * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItems()
     * @generated
     * @ordered
     */
    protected EList<Quelle> items;

    private EContentAdapter eContentAdapter;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected PackImpl() {
        super();
        eContentAdapter = new EContentAdapter() {
            @Override
            public void notifyChanged(Notification notification) {
                super.notifyChanged(notification);
                Object feature = notification.getFeature();
                if (Shr5managementPackage.Literals.PACK__ITEMS.equals(feature))
                    PackImpl.this.eNotify(new ENotificationImpl(PackImpl.this, Notification.SET, Shr5Package.Literals.GELD_WERT__WERT, 1, 2));
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
        return Shr5managementPackage.Literals.PACK;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PACK__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PACK__IMAGE, oldImage, image));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PACK__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PACK__PARENT_ID, oldParentId, parentId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Localization> getLocalizations() {
        if (localizations == null) {
            localizations = new EObjectContainmentEList<Localization>(Localization.class, this, Shr5managementPackage.PACK__LOCALIZATIONS);
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PACK__PAGE, oldPage, page));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.PACK__SRC_BOOK, oldSrcBook, srcBook));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PACK__SRC_BOOK, oldSrcBook, srcBook));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public BigDecimal getWert() {
        if (getWertValue() == null)
            return ShadowrunTools.calcListenWert(getItems());
        else
            return getWertValue().add(ShadowrunTools.calcListenWert(getItems()));

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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PACK__VERFUEGBARKEIT, oldVerfuegbarkeit, verfuegbarkeit));
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
     * 
     * @generated not
     */
    public void setWertValue(BigDecimal newWertValue) {
        BigDecimal oldWertValue = wertValue;
        wertValue = newWertValue;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PACK__WERT_VALUE, oldWertValue, wertValue));
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.Literals.GELD_WERT__WERT, oldWertValue, wertValue));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Quelle> getItems() {
        if (items == null) {
            items = new EObjectContainmentEList<Quelle>(Quelle.class, this, Shr5managementPackage.PACK__ITEMS);
        }
        return items;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.PACK__LOCALIZATIONS:
                return ((InternalEList<?>)getLocalizations()).basicRemove(otherEnd, msgs);
            case Shr5managementPackage.PACK__ITEMS:
                return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
            case Shr5managementPackage.PACK__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5managementPackage.PACK__IMAGE:
                return getImage();
            case Shr5managementPackage.PACK__NAME:
                return getName();
            case Shr5managementPackage.PACK__PARENT_ID:
                return getParentId();
            case Shr5managementPackage.PACK__LOCALIZATIONS:
                return getLocalizations();
            case Shr5managementPackage.PACK__PAGE:
                return getPage();
            case Shr5managementPackage.PACK__SRC_BOOK:
                if (resolve) return getSrcBook();
                return basicGetSrcBook();
            case Shr5managementPackage.PACK__WERT:
                return getWert();
            case Shr5managementPackage.PACK__VERFUEGBARKEIT:
                return getVerfuegbarkeit();
            case Shr5managementPackage.PACK__WERT_VALUE:
                return getWertValue();
            case Shr5managementPackage.PACK__ITEMS:
                return getItems();
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
            case Shr5managementPackage.PACK__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5managementPackage.PACK__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5managementPackage.PACK__NAME:
                setName((String)newValue);
                return;
            case Shr5managementPackage.PACK__PARENT_ID:
                setParentId((String)newValue);
                return;
            case Shr5managementPackage.PACK__LOCALIZATIONS:
                getLocalizations().clear();
                getLocalizations().addAll((Collection<? extends Localization>)newValue);
                return;
            case Shr5managementPackage.PACK__PAGE:
                setPage((String)newValue);
                return;
            case Shr5managementPackage.PACK__SRC_BOOK:
                setSrcBook((SourceBook)newValue);
                return;
            case Shr5managementPackage.PACK__VERFUEGBARKEIT:
                setVerfuegbarkeit((String)newValue);
                return;
            case Shr5managementPackage.PACK__WERT_VALUE:
                setWertValue((BigDecimal)newValue);
                return;
            case Shr5managementPackage.PACK__ITEMS:
                getItems().clear();
                getItems().addAll((Collection<? extends Quelle>)newValue);
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
            case Shr5managementPackage.PACK__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5managementPackage.PACK__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5managementPackage.PACK__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5managementPackage.PACK__PARENT_ID:
                setParentId(PARENT_ID_EDEFAULT);
                return;
            case Shr5managementPackage.PACK__LOCALIZATIONS:
                getLocalizations().clear();
                return;
            case Shr5managementPackage.PACK__PAGE:
                setPage(PAGE_EDEFAULT);
                return;
            case Shr5managementPackage.PACK__SRC_BOOK:
                setSrcBook((SourceBook)null);
                return;
            case Shr5managementPackage.PACK__VERFUEGBARKEIT:
                setVerfuegbarkeit(VERFUEGBARKEIT_EDEFAULT);
                return;
            case Shr5managementPackage.PACK__WERT_VALUE:
                setWertValue(WERT_VALUE_EDEFAULT);
                return;
            case Shr5managementPackage.PACK__ITEMS:
                getItems().clear();
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
            case Shr5managementPackage.PACK__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5managementPackage.PACK__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5managementPackage.PACK__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5managementPackage.PACK__PARENT_ID:
                return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
            case Shr5managementPackage.PACK__LOCALIZATIONS:
                return localizations != null && !localizations.isEmpty();
            case Shr5managementPackage.PACK__PAGE:
                return PAGE_EDEFAULT == null ? page != null : !PAGE_EDEFAULT.equals(page);
            case Shr5managementPackage.PACK__SRC_BOOK:
                return srcBook != null;
            case Shr5managementPackage.PACK__WERT:
                return WERT_EDEFAULT == null ? getWert() != null : !WERT_EDEFAULT.equals(getWert());
            case Shr5managementPackage.PACK__VERFUEGBARKEIT:
                return VERFUEGBARKEIT_EDEFAULT == null ? verfuegbarkeit != null : !VERFUEGBARKEIT_EDEFAULT.equals(verfuegbarkeit);
            case Shr5managementPackage.PACK__WERT_VALUE:
                return WERT_VALUE_EDEFAULT == null ? wertValue != null : !WERT_VALUE_EDEFAULT.equals(wertValue);
            case Shr5managementPackage.PACK__ITEMS:
                return items != null && !items.isEmpty();
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
                case Shr5managementPackage.PACK__PARENT_ID: return Shr5Package.IDENTIFIABLE__PARENT_ID;
                case Shr5managementPackage.PACK__LOCALIZATIONS: return Shr5Package.IDENTIFIABLE__LOCALIZATIONS;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (derivedFeatureID) {
                case Shr5managementPackage.PACK__PAGE: return Shr5Package.QUELLE__PAGE;
                case Shr5managementPackage.PACK__SRC_BOOK: return Shr5Package.QUELLE__SRC_BOOK;
                default: return -1;
            }
        }
        if (baseClass == GeldWert.class) {
            switch (derivedFeatureID) {
                case Shr5managementPackage.PACK__WERT: return Shr5Package.GELD_WERT__WERT;
                case Shr5managementPackage.PACK__VERFUEGBARKEIT: return Shr5Package.GELD_WERT__VERFUEGBARKEIT;
                case Shr5managementPackage.PACK__WERT_VALUE: return Shr5Package.GELD_WERT__WERT_VALUE;
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
                case Shr5Package.IDENTIFIABLE__PARENT_ID: return Shr5managementPackage.PACK__PARENT_ID;
                case Shr5Package.IDENTIFIABLE__LOCALIZATIONS: return Shr5managementPackage.PACK__LOCALIZATIONS;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (baseFeatureID) {
                case Shr5Package.QUELLE__PAGE: return Shr5managementPackage.PACK__PAGE;
                case Shr5Package.QUELLE__SRC_BOOK: return Shr5managementPackage.PACK__SRC_BOOK;
                default: return -1;
            }
        }
        if (baseClass == GeldWert.class) {
            switch (baseFeatureID) {
                case Shr5Package.GELD_WERT__WERT: return Shr5managementPackage.PACK__WERT;
                case Shr5Package.GELD_WERT__VERFUEGBARKEIT: return Shr5managementPackage.PACK__VERFUEGBARKEIT;
                case Shr5Package.GELD_WERT__WERT_VALUE: return Shr5managementPackage.PACK__WERT_VALUE;
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
        result.append(", verfuegbarkeit: ");
        result.append(verfuegbarkeit);
        result.append(", wertValue: ");
        result.append(wertValue);
        result.append(')');
        return result.toString();
    }

} // PackImpl
