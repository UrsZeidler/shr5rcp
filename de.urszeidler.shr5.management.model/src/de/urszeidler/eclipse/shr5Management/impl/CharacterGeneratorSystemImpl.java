/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.Localization;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5Management.CharacterAdvancementSystem;
import de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney;
import de.urszeidler.eclipse.shr5Management.QuellenConstrain;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Generator System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorSystemImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorSystemImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorSystemImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorSystemImpl#getLocalizations <em>Localizations</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorSystemImpl#getPage <em>Page</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorSystemImpl#getSrcBook <em>Src Book</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorSystemImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorSystemImpl#getLifestyleToStartMoney <em>Lifestyle To Start Money</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorSystemImpl#getCharacterAdvancements <em>Character Advancements</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterGeneratorSystemImpl#getAdditionalConstrains <em>Additional Constrains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CharacterGeneratorSystemImpl extends MinimalEObjectImpl.Container implements CharacterGeneratorSystem {
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
     * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' map.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInstructions()
     * @generated
     * @ordered
     */
	protected EMap<GeneratorState, String> instructions;

	/**
     * The cached value of the '{@link #getLifestyleToStartMoney() <em>Lifestyle To Start Money</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifestyleToStartMoney()
     * @generated
     * @ordered
     */
    protected EList<LifestyleToStartMoney> lifestyleToStartMoney;

    /**
     * The cached value of the '{@link #getCharacterAdvancements() <em>Character Advancements</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharacterAdvancements()
     * @generated
     * @ordered
     */
	protected CharacterAdvancementSystem characterAdvancements;

    /**
     * The cached value of the '{@link #getAdditionalConstrains() <em>Additional Constrains</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAdditionalConstrains()
     * @generated
     * @ordered
     */
    protected EList<QuellenConstrain> additionalConstrains;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CharacterGeneratorSystemImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.CHARACTER_GENERATOR_SYSTEM;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__PARENT_ID, oldParentId, parentId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Localization> getLocalizations() {
        if (localizations == null) {
            localizations = new EObjectContainmentEList<Localization>(Localization.class, this, Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__LOCALIZATIONS);
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__IMAGE, oldImage, image));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__PAGE, oldPage, page));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__SRC_BOOK, oldSrcBook, srcBook));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__SRC_BOOK, oldSrcBook, srcBook));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EMap<GeneratorState, String> getInstructions() {
        if (instructions == null) {
            instructions = new EcoreEMap<GeneratorState,String>(Shr5managementPackage.Literals.GENERATOR_STATE_TO_ESTRING_MAP_ENTRY, GeneratorStateToEStringMapEntryImpl.class, this, Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__INSTRUCTIONS);
        }
        return instructions;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CharacterAdvancementSystem getCharacterAdvancements() {
        if (characterAdvancements != null && characterAdvancements.eIsProxy()) {
            InternalEObject oldCharacterAdvancements = (InternalEObject)characterAdvancements;
            characterAdvancements = (CharacterAdvancementSystem)eResolveProxy(oldCharacterAdvancements);
            if (characterAdvancements != oldCharacterAdvancements) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__CHARACTER_ADVANCEMENTS, oldCharacterAdvancements, characterAdvancements));
            }
        }
        return characterAdvancements;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CharacterAdvancementSystem basicGetCharacterAdvancements() {
        return characterAdvancements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCharacterAdvancements(CharacterAdvancementSystem newCharacterAdvancements) {
        CharacterAdvancementSystem oldCharacterAdvancements = characterAdvancements;
        characterAdvancements = newCharacterAdvancements;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__CHARACTER_ADVANCEMENTS, oldCharacterAdvancements, characterAdvancements));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QuellenConstrain> getAdditionalConstrains() {
        if (additionalConstrains == null) {
            additionalConstrains = new EObjectContainmentEList<QuellenConstrain>(QuellenConstrain.class, this, Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__ADDITIONAL_CONSTRAINS);
        }
        return additionalConstrains;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LifestyleToStartMoney> getLifestyleToStartMoney() {
        if (lifestyleToStartMoney == null) {
            lifestyleToStartMoney = new EObjectContainmentEList<LifestyleToStartMoney>(LifestyleToStartMoney.class, this, Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__LIFESTYLE_TO_START_MONEY);
        }
        return lifestyleToStartMoney;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__LOCALIZATIONS:
                return ((InternalEList<?>)getLocalizations()).basicRemove(otherEnd, msgs);
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__INSTRUCTIONS:
                return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__LIFESTYLE_TO_START_MONEY:
                return ((InternalEList<?>)getLifestyleToStartMoney()).basicRemove(otherEnd, msgs);
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__ADDITIONAL_CONSTRAINS:
                return ((InternalEList<?>)getAdditionalConstrains()).basicRemove(otherEnd, msgs);
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
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__IMAGE:
                return getImage();
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__NAME:
                return getName();
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__PARENT_ID:
                return getParentId();
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__LOCALIZATIONS:
                return getLocalizations();
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__PAGE:
                return getPage();
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__SRC_BOOK:
                if (resolve) return getSrcBook();
                return basicGetSrcBook();
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__INSTRUCTIONS:
                if (coreType) return getInstructions();
                else return getInstructions().map();
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__LIFESTYLE_TO_START_MONEY:
                return getLifestyleToStartMoney();
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__CHARACTER_ADVANCEMENTS:
                if (resolve) return getCharacterAdvancements();
                return basicGetCharacterAdvancements();
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__ADDITIONAL_CONSTRAINS:
                return getAdditionalConstrains();
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
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__NAME:
                setName((String)newValue);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__PARENT_ID:
                setParentId((String)newValue);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__LOCALIZATIONS:
                getLocalizations().clear();
                getLocalizations().addAll((Collection<? extends Localization>)newValue);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__PAGE:
                setPage((String)newValue);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__SRC_BOOK:
                setSrcBook((SourceBook)newValue);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__INSTRUCTIONS:
                ((EStructuralFeature.Setting)getInstructions()).set(newValue);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__LIFESTYLE_TO_START_MONEY:
                getLifestyleToStartMoney().clear();
                getLifestyleToStartMoney().addAll((Collection<? extends LifestyleToStartMoney>)newValue);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__CHARACTER_ADVANCEMENTS:
                setCharacterAdvancements((CharacterAdvancementSystem)newValue);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__ADDITIONAL_CONSTRAINS:
                getAdditionalConstrains().clear();
                getAdditionalConstrains().addAll((Collection<? extends QuellenConstrain>)newValue);
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
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__PARENT_ID:
                setParentId(PARENT_ID_EDEFAULT);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__LOCALIZATIONS:
                getLocalizations().clear();
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__PAGE:
                setPage(PAGE_EDEFAULT);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__SRC_BOOK:
                setSrcBook((SourceBook)null);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__INSTRUCTIONS:
                getInstructions().clear();
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__LIFESTYLE_TO_START_MONEY:
                getLifestyleToStartMoney().clear();
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__CHARACTER_ADVANCEMENTS:
                setCharacterAdvancements((CharacterAdvancementSystem)null);
                return;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__ADDITIONAL_CONSTRAINS:
                getAdditionalConstrains().clear();
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
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__PARENT_ID:
                return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__LOCALIZATIONS:
                return localizations != null && !localizations.isEmpty();
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__PAGE:
                return PAGE_EDEFAULT == null ? page != null : !PAGE_EDEFAULT.equals(page);
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__SRC_BOOK:
                return srcBook != null;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__INSTRUCTIONS:
                return instructions != null && !instructions.isEmpty();
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__LIFESTYLE_TO_START_MONEY:
                return lifestyleToStartMoney != null && !lifestyleToStartMoney.isEmpty();
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__CHARACTER_ADVANCEMENTS:
                return characterAdvancements != null;
            case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__ADDITIONAL_CONSTRAINS:
                return additionalConstrains != null && !additionalConstrains.isEmpty();
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
                case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__PARENT_ID: return Shr5Package.IDENTIFIABLE__PARENT_ID;
                case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__LOCALIZATIONS: return Shr5Package.IDENTIFIABLE__LOCALIZATIONS;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (derivedFeatureID) {
                case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__PAGE: return Shr5Package.QUELLE__PAGE;
                case Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__SRC_BOOK: return Shr5Package.QUELLE__SRC_BOOK;
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
                case Shr5Package.IDENTIFIABLE__PARENT_ID: return Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__PARENT_ID;
                case Shr5Package.IDENTIFIABLE__LOCALIZATIONS: return Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__LOCALIZATIONS;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (baseFeatureID) {
                case Shr5Package.QUELLE__PAGE: return Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__PAGE;
                case Shr5Package.QUELLE__SRC_BOOK: return Shr5managementPackage.CHARACTER_GENERATOR_SYSTEM__SRC_BOOK;
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

} //CharacterGeneratorSystemImpl
