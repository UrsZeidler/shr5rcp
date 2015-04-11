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

import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.Localization;
import de.urszeidler.eclipse.shr5.Modifyable;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fertigkeits Gruppe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FertigkeitsGruppeImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FertigkeitsGruppeImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FertigkeitsGruppeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FertigkeitsGruppeImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FertigkeitsGruppeImpl#getLocalizations <em>Localizations</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FertigkeitsGruppeImpl#getPage <em>Page</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FertigkeitsGruppeImpl#getSrcBook <em>Src Book</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.FertigkeitsGruppeImpl#getFertigkeiten <em>Fertigkeiten</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FertigkeitsGruppeImpl extends MinimalEObjectImpl.Container implements FertigkeitsGruppe {
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
     * The cached value of the '{@link #getFertigkeiten() <em>Fertigkeiten</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFertigkeiten()
     * @generated
     * @ordered
     */
	protected EList<Fertigkeit> fertigkeiten;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FertigkeitsGruppeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.FERTIGKEITS_GRUPPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FERTIGKEITS_GRUPPE__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FERTIGKEITS_GRUPPE__PARENT_ID, oldParentId, parentId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Localization> getLocalizations() {
        if (localizations == null) {
            localizations = new EObjectContainmentEList<Localization>(Localization.class, this, Shr5Package.FERTIGKEITS_GRUPPE__LOCALIZATIONS);
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FERTIGKEITS_GRUPPE__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FERTIGKEITS_GRUPPE__IMAGE, oldImage, image));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FERTIGKEITS_GRUPPE__PAGE, oldPage, page));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.FERTIGKEITS_GRUPPE__SRC_BOOK, oldSrcBook, srcBook));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.FERTIGKEITS_GRUPPE__SRC_BOOK, oldSrcBook, srcBook));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Fertigkeit> getFertigkeiten() {
        if (fertigkeiten == null) {
            fertigkeiten = new EObjectContainmentEList<Fertigkeit>(Fertigkeit.class, this, Shr5Package.FERTIGKEITS_GRUPPE__FERTIGKEITEN);
        }
        return fertigkeiten;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.FERTIGKEITS_GRUPPE__LOCALIZATIONS:
                return ((InternalEList<?>)getLocalizations()).basicRemove(otherEnd, msgs);
            case Shr5Package.FERTIGKEITS_GRUPPE__FERTIGKEITEN:
                return ((InternalEList<?>)getFertigkeiten()).basicRemove(otherEnd, msgs);
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
            case Shr5Package.FERTIGKEITS_GRUPPE__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5Package.FERTIGKEITS_GRUPPE__IMAGE:
                return getImage();
            case Shr5Package.FERTIGKEITS_GRUPPE__NAME:
                return getName();
            case Shr5Package.FERTIGKEITS_GRUPPE__PARENT_ID:
                return getParentId();
            case Shr5Package.FERTIGKEITS_GRUPPE__LOCALIZATIONS:
                return getLocalizations();
            case Shr5Package.FERTIGKEITS_GRUPPE__PAGE:
                return getPage();
            case Shr5Package.FERTIGKEITS_GRUPPE__SRC_BOOK:
                if (resolve) return getSrcBook();
                return basicGetSrcBook();
            case Shr5Package.FERTIGKEITS_GRUPPE__FERTIGKEITEN:
                return getFertigkeiten();
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
            case Shr5Package.FERTIGKEITS_GRUPPE__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5Package.FERTIGKEITS_GRUPPE__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5Package.FERTIGKEITS_GRUPPE__NAME:
                setName((String)newValue);
                return;
            case Shr5Package.FERTIGKEITS_GRUPPE__PARENT_ID:
                setParentId((String)newValue);
                return;
            case Shr5Package.FERTIGKEITS_GRUPPE__LOCALIZATIONS:
                getLocalizations().clear();
                getLocalizations().addAll((Collection<? extends Localization>)newValue);
                return;
            case Shr5Package.FERTIGKEITS_GRUPPE__PAGE:
                setPage((String)newValue);
                return;
            case Shr5Package.FERTIGKEITS_GRUPPE__SRC_BOOK:
                setSrcBook((SourceBook)newValue);
                return;
            case Shr5Package.FERTIGKEITS_GRUPPE__FERTIGKEITEN:
                getFertigkeiten().clear();
                getFertigkeiten().addAll((Collection<? extends Fertigkeit>)newValue);
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
            case Shr5Package.FERTIGKEITS_GRUPPE__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5Package.FERTIGKEITS_GRUPPE__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5Package.FERTIGKEITS_GRUPPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5Package.FERTIGKEITS_GRUPPE__PARENT_ID:
                setParentId(PARENT_ID_EDEFAULT);
                return;
            case Shr5Package.FERTIGKEITS_GRUPPE__LOCALIZATIONS:
                getLocalizations().clear();
                return;
            case Shr5Package.FERTIGKEITS_GRUPPE__PAGE:
                setPage(PAGE_EDEFAULT);
                return;
            case Shr5Package.FERTIGKEITS_GRUPPE__SRC_BOOK:
                setSrcBook((SourceBook)null);
                return;
            case Shr5Package.FERTIGKEITS_GRUPPE__FERTIGKEITEN:
                getFertigkeiten().clear();
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
            case Shr5Package.FERTIGKEITS_GRUPPE__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5Package.FERTIGKEITS_GRUPPE__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5Package.FERTIGKEITS_GRUPPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5Package.FERTIGKEITS_GRUPPE__PARENT_ID:
                return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
            case Shr5Package.FERTIGKEITS_GRUPPE__LOCALIZATIONS:
                return localizations != null && !localizations.isEmpty();
            case Shr5Package.FERTIGKEITS_GRUPPE__PAGE:
                return PAGE_EDEFAULT == null ? page != null : !PAGE_EDEFAULT.equals(page);
            case Shr5Package.FERTIGKEITS_GRUPPE__SRC_BOOK:
                return srcBook != null;
            case Shr5Package.FERTIGKEITS_GRUPPE__FERTIGKEITEN:
                return fertigkeiten != null && !fertigkeiten.isEmpty();
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
                case Shr5Package.FERTIGKEITS_GRUPPE__PARENT_ID: return Shr5Package.IDENTIFIABLE__PARENT_ID;
                case Shr5Package.FERTIGKEITS_GRUPPE__LOCALIZATIONS: return Shr5Package.IDENTIFIABLE__LOCALIZATIONS;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (derivedFeatureID) {
                case Shr5Package.FERTIGKEITS_GRUPPE__PAGE: return Shr5Package.QUELLE__PAGE;
                case Shr5Package.FERTIGKEITS_GRUPPE__SRC_BOOK: return Shr5Package.QUELLE__SRC_BOOK;
                default: return -1;
            }
        }
        if (baseClass == Modifyable.class) {
            switch (derivedFeatureID) {
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
                case Shr5Package.IDENTIFIABLE__PARENT_ID: return Shr5Package.FERTIGKEITS_GRUPPE__PARENT_ID;
                case Shr5Package.IDENTIFIABLE__LOCALIZATIONS: return Shr5Package.FERTIGKEITS_GRUPPE__LOCALIZATIONS;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (baseFeatureID) {
                case Shr5Package.QUELLE__PAGE: return Shr5Package.FERTIGKEITS_GRUPPE__PAGE;
                case Shr5Package.QUELLE__SRC_BOOK: return Shr5Package.FERTIGKEITS_GRUPPE__SRC_BOOK;
                default: return -1;
            }
        }
        if (baseClass == Modifyable.class) {
            switch (baseFeatureID) {
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
        result.append(')');
        return result.toString();
    }

} //FertigkeitsGruppeImpl
