/**
 * 2014 Urs Zeidler
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

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.Localization;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SkillSoft;
import de.urszeidler.eclipse.shr5.SourceBook;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skill Soft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SkillSoftImpl#getWert <em>Wert</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SkillSoftImpl#getVerfuegbarkeit <em>Verfuegbarkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SkillSoftImpl#getWertValue <em>Wert Value</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SkillSoftImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SkillSoftImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SkillSoftImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SkillSoftImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SkillSoftImpl#getLocalizations <em>Localizations</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SkillSoftImpl#getPage <em>Page</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SkillSoftImpl#getSrcBook <em>Src Book</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SkillSoftImpl#getSkill <em>Skill</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SkillSoftImpl#getRating <em>Rating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillSoftImpl extends MinimalEObjectImpl.Container implements SkillSoft {
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
     * The cached value of the '{@link #getSkill() <em>Skill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSkill()
     * @generated
     * @ordered
     */
    protected Fertigkeit skill;

    /**
     * The default value of the '{@link #getRating() <em>Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRating()
     * @generated
     * @ordered
     */
    protected static final int RATING_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getRating() <em>Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRating()
     * @generated
     * @ordered
     */
    protected int rating = RATING_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SkillSoftImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.SKILL_SOFT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public BigDecimal getWert() {
        if(getWertValue()!=null)
        return getWertValue().multiply(new BigDecimal(getRating()));
        
        return BigDecimal.ZERO;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SKILL_SOFT__VERFUEGBARKEIT, oldVerfuegbarkeit, verfuegbarkeit));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SKILL_SOFT__WERT_VALUE, oldWertValue, wertValue));
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SKILL_SOFT__WERT, oldWertValue, wertValue));
        }}

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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SKILL_SOFT__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SKILL_SOFT__IMAGE, oldImage, image));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SKILL_SOFT__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SKILL_SOFT__PARENT_ID, oldParentId, parentId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Localization> getLocalizations() {
        if (localizations == null) {
            localizations = new EObjectContainmentEList<Localization>(Localization.class, this, Shr5Package.SKILL_SOFT__LOCALIZATIONS);
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SKILL_SOFT__PAGE, oldPage, page));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.SKILL_SOFT__SRC_BOOK, oldSrcBook, srcBook));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SKILL_SOFT__SRC_BOOK, oldSrcBook, srcBook));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Fertigkeit getSkill() {
        if (skill != null && skill.eIsProxy()) {
            InternalEObject oldSkill = (InternalEObject)skill;
            skill = (Fertigkeit)eResolveProxy(oldSkill);
            if (skill != oldSkill) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.SKILL_SOFT__SKILL, oldSkill, skill));
            }
        }
        return skill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fertigkeit basicGetSkill() {
        return skill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSkill(Fertigkeit newSkill) {
        Fertigkeit oldSkill = skill;
        skill = newSkill;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SKILL_SOFT__SKILL, oldSkill, skill));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getRating() {
        return rating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public void setRating(int newRating) {
        int oldRating = rating;
        rating = newRating;
        if (eNotificationRequired()){
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SKILL_SOFT__RATING, oldRating, rating));
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SKILL_SOFT__WERT, new BigDecimal(1), new BigDecimal(2)));

        }}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.SKILL_SOFT__LOCALIZATIONS:
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
            case Shr5Package.SKILL_SOFT__WERT:
                return getWert();
            case Shr5Package.SKILL_SOFT__VERFUEGBARKEIT:
                return getVerfuegbarkeit();
            case Shr5Package.SKILL_SOFT__WERT_VALUE:
                return getWertValue();
            case Shr5Package.SKILL_SOFT__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5Package.SKILL_SOFT__IMAGE:
                return getImage();
            case Shr5Package.SKILL_SOFT__NAME:
                return getName();
            case Shr5Package.SKILL_SOFT__PARENT_ID:
                return getParentId();
            case Shr5Package.SKILL_SOFT__LOCALIZATIONS:
                return getLocalizations();
            case Shr5Package.SKILL_SOFT__PAGE:
                return getPage();
            case Shr5Package.SKILL_SOFT__SRC_BOOK:
                if (resolve) return getSrcBook();
                return basicGetSrcBook();
            case Shr5Package.SKILL_SOFT__SKILL:
                if (resolve) return getSkill();
                return basicGetSkill();
            case Shr5Package.SKILL_SOFT__RATING:
                return getRating();
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
            case Shr5Package.SKILL_SOFT__VERFUEGBARKEIT:
                setVerfuegbarkeit((String)newValue);
                return;
            case Shr5Package.SKILL_SOFT__WERT_VALUE:
                setWertValue((BigDecimal)newValue);
                return;
            case Shr5Package.SKILL_SOFT__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5Package.SKILL_SOFT__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5Package.SKILL_SOFT__NAME:
                setName((String)newValue);
                return;
            case Shr5Package.SKILL_SOFT__PARENT_ID:
                setParentId((String)newValue);
                return;
            case Shr5Package.SKILL_SOFT__LOCALIZATIONS:
                getLocalizations().clear();
                getLocalizations().addAll((Collection<? extends Localization>)newValue);
                return;
            case Shr5Package.SKILL_SOFT__PAGE:
                setPage((String)newValue);
                return;
            case Shr5Package.SKILL_SOFT__SRC_BOOK:
                setSrcBook((SourceBook)newValue);
                return;
            case Shr5Package.SKILL_SOFT__SKILL:
                setSkill((Fertigkeit)newValue);
                return;
            case Shr5Package.SKILL_SOFT__RATING:
                setRating((Integer)newValue);
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
            case Shr5Package.SKILL_SOFT__VERFUEGBARKEIT:
                setVerfuegbarkeit(VERFUEGBARKEIT_EDEFAULT);
                return;
            case Shr5Package.SKILL_SOFT__WERT_VALUE:
                setWertValue(WERT_VALUE_EDEFAULT);
                return;
            case Shr5Package.SKILL_SOFT__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5Package.SKILL_SOFT__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5Package.SKILL_SOFT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5Package.SKILL_SOFT__PARENT_ID:
                setParentId(PARENT_ID_EDEFAULT);
                return;
            case Shr5Package.SKILL_SOFT__LOCALIZATIONS:
                getLocalizations().clear();
                return;
            case Shr5Package.SKILL_SOFT__PAGE:
                setPage(PAGE_EDEFAULT);
                return;
            case Shr5Package.SKILL_SOFT__SRC_BOOK:
                setSrcBook((SourceBook)null);
                return;
            case Shr5Package.SKILL_SOFT__SKILL:
                setSkill((Fertigkeit)null);
                return;
            case Shr5Package.SKILL_SOFT__RATING:
                setRating(RATING_EDEFAULT);
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
            case Shr5Package.SKILL_SOFT__WERT:
                return WERT_EDEFAULT == null ? getWert() != null : !WERT_EDEFAULT.equals(getWert());
            case Shr5Package.SKILL_SOFT__VERFUEGBARKEIT:
                return VERFUEGBARKEIT_EDEFAULT == null ? verfuegbarkeit != null : !VERFUEGBARKEIT_EDEFAULT.equals(verfuegbarkeit);
            case Shr5Package.SKILL_SOFT__WERT_VALUE:
                return WERT_VALUE_EDEFAULT == null ? wertValue != null : !WERT_VALUE_EDEFAULT.equals(wertValue);
            case Shr5Package.SKILL_SOFT__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5Package.SKILL_SOFT__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5Package.SKILL_SOFT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5Package.SKILL_SOFT__PARENT_ID:
                return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
            case Shr5Package.SKILL_SOFT__LOCALIZATIONS:
                return localizations != null && !localizations.isEmpty();
            case Shr5Package.SKILL_SOFT__PAGE:
                return PAGE_EDEFAULT == null ? page != null : !PAGE_EDEFAULT.equals(page);
            case Shr5Package.SKILL_SOFT__SRC_BOOK:
                return srcBook != null;
            case Shr5Package.SKILL_SOFT__SKILL:
                return skill != null;
            case Shr5Package.SKILL_SOFT__RATING:
                return rating != RATING_EDEFAULT;
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
                case Shr5Package.SKILL_SOFT__BESCHREIBUNG: return Shr5Package.BESCHREIBBAR__BESCHREIBUNG;
                case Shr5Package.SKILL_SOFT__IMAGE: return Shr5Package.BESCHREIBBAR__IMAGE;
                case Shr5Package.SKILL_SOFT__NAME: return Shr5Package.BESCHREIBBAR__NAME;
                default: return -1;
            }
        }
        if (baseClass == Identifiable.class) {
            switch (derivedFeatureID) {
                case Shr5Package.SKILL_SOFT__PARENT_ID: return Shr5Package.IDENTIFIABLE__PARENT_ID;
                case Shr5Package.SKILL_SOFT__LOCALIZATIONS: return Shr5Package.IDENTIFIABLE__LOCALIZATIONS;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (derivedFeatureID) {
                case Shr5Package.SKILL_SOFT__PAGE: return Shr5Package.QUELLE__PAGE;
                case Shr5Package.SKILL_SOFT__SRC_BOOK: return Shr5Package.QUELLE__SRC_BOOK;
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
                case Shr5Package.BESCHREIBBAR__BESCHREIBUNG: return Shr5Package.SKILL_SOFT__BESCHREIBUNG;
                case Shr5Package.BESCHREIBBAR__IMAGE: return Shr5Package.SKILL_SOFT__IMAGE;
                case Shr5Package.BESCHREIBBAR__NAME: return Shr5Package.SKILL_SOFT__NAME;
                default: return -1;
            }
        }
        if (baseClass == Identifiable.class) {
            switch (baseFeatureID) {
                case Shr5Package.IDENTIFIABLE__PARENT_ID: return Shr5Package.SKILL_SOFT__PARENT_ID;
                case Shr5Package.IDENTIFIABLE__LOCALIZATIONS: return Shr5Package.SKILL_SOFT__LOCALIZATIONS;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (baseFeatureID) {
                case Shr5Package.QUELLE__PAGE: return Shr5Package.SKILL_SOFT__PAGE;
                case Shr5Package.QUELLE__SRC_BOOK: return Shr5Package.SKILL_SOFT__SRC_BOOK;
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
        result.append(" (verfuegbarkeit: ");
        result.append(verfuegbarkeit);
        result.append(", wertValue: ");
        result.append(wertValue);
        result.append(", beschreibung: ");
        result.append(beschreibung);
        result.append(", image: ");
        result.append(image);
        result.append(", name: ");
        result.append(name);
        result.append(", parentId: ");
        result.append(parentId);
        result.append(", page: ");
        result.append(page);
        result.append(", rating: ");
        result.append(rating);
        result.append(')');
        return result.toString();
    }

} //SkillSoftImpl
