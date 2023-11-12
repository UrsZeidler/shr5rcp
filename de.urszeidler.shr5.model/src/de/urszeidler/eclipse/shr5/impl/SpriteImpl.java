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
import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.InterfaceModus;
import de.urszeidler.eclipse.shr5.Localization;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.Sprite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sprite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getMatrixZustandMax <em>Matrix Zustand Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getGeraetestufe <em>Geraetestufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getFirewall <em>Firewall</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getDatenverarbeitung <em>Datenverarbeitung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getCurrentModus <em>Current Modus</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getAngriff <em>Angriff</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getSchleicher <em>Schleicher</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getResonanz <em>Resonanz</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getResonanzBasis <em>Resonanz Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getLocalizations <em>Localizations</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getPage <em>Page</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getSrcBook <em>Src Book</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getStufe <em>Stufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getAngriffMod <em>Angriff Mod</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getSchleicherMod <em>Schleicher Mod</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getDatenverarbeitungMod <em>Datenverarbeitung Mod</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getFirewallMod <em>Firewall Mod</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpriteImpl#getInitativeMod <em>Initative Mod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpriteImpl extends MinimalEObjectImpl.Container implements Sprite {
	/**
     * The default value of the '{@link #getMatrixZustandMax() <em>Matrix Zustand Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMatrixZustandMax()
     * @generated
     * @ordered
     */
    protected static final int MATRIX_ZUSTAND_MAX_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getGeraetestufe() <em>Geraetestufe</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGeraetestufe()
     * @generated
     * @ordered
     */
	protected static final int GERAETESTUFE_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getFirewall() <em>Firewall</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFirewall()
     * @generated
     * @ordered
     */
	protected static final int FIREWALL_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getDatenverarbeitung() <em>Datenverarbeitung</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDatenverarbeitung()
     * @generated
     * @ordered
     */
	protected static final int DATENVERARBEITUNG_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getCurrentModus() <em>Current Modus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentModus()
     * @generated
     * @ordered
     */
    protected static final InterfaceModus CURRENT_MODUS_EDEFAULT = InterfaceModus.AUGMENTED_REALITY;

    /**
     * The cached value of the '{@link #getCurrentModus() <em>Current Modus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentModus()
     * @generated
     * @ordered
     */
    protected InterfaceModus currentModus = CURRENT_MODUS_EDEFAULT;

    /**
     * The default value of the '{@link #getAngriff() <em>Angriff</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAngriff()
     * @generated
     * @ordered
     */
	protected static final int ANGRIFF_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getSchleicher() <em>Schleicher</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSchleicher()
     * @generated
     * @ordered
     */
	protected static final int SCHLEICHER_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getResonanz() <em>Resonanz</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResonanz()
     * @generated
     * @ordered
     */
	protected static final int RESONANZ_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getResonanzBasis() <em>Resonanz Basis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResonanzBasis()
     * @generated
     * @ordered
     */
	protected static final int RESONANZ_BASIS_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getResonanzBasis() <em>Resonanz Basis</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResonanzBasis()
     * @generated
     * @ordered
     */
	protected int resonanzBasis = RESONANZ_BASIS_EDEFAULT;

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
     * The default value of the '{@link #getStufe() <em>Stufe</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStufe()
     * @generated
     * @ordered
     */
	protected static final int STUFE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getStufe() <em>Stufe</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStufe()
     * @generated
     * @ordered
     */
	protected int stufe = STUFE_EDEFAULT;

	/**
     * The default value of the '{@link #getAngriffMod() <em>Angriff Mod</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAngriffMod()
     * @generated
     * @ordered
     */
	protected static final int ANGRIFF_MOD_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getAngriffMod() <em>Angriff Mod</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAngriffMod()
     * @generated
     * @ordered
     */
	protected int angriffMod = ANGRIFF_MOD_EDEFAULT;

	/**
     * The default value of the '{@link #getSchleicherMod() <em>Schleicher Mod</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSchleicherMod()
     * @generated
     * @ordered
     */
	protected static final int SCHLEICHER_MOD_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getSchleicherMod() <em>Schleicher Mod</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSchleicherMod()
     * @generated
     * @ordered
     */
	protected int schleicherMod = SCHLEICHER_MOD_EDEFAULT;

	/**
     * The default value of the '{@link #getDatenverarbeitungMod() <em>Datenverarbeitung Mod</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDatenverarbeitungMod()
     * @generated
     * @ordered
     */
	protected static final int DATENVERARBEITUNG_MOD_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getDatenverarbeitungMod() <em>Datenverarbeitung Mod</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDatenverarbeitungMod()
     * @generated
     * @ordered
     */
	protected int datenverarbeitungMod = DATENVERARBEITUNG_MOD_EDEFAULT;

	/**
     * The default value of the '{@link #getFirewallMod() <em>Firewall Mod</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFirewallMod()
     * @generated
     * @ordered
     */
	protected static final int FIREWALL_MOD_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getFirewallMod() <em>Firewall Mod</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFirewallMod()
     * @generated
     * @ordered
     */
	protected int firewallMod = FIREWALL_MOD_EDEFAULT;

	/**
     * The default value of the '{@link #getInitativeMod() <em>Initative Mod</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInitativeMod()
     * @generated
     * @ordered
     */
	protected static final int INITATIVE_MOD_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getInitativeMod() <em>Initative Mod</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInitativeMod()
     * @generated
     * @ordered
     */
	protected int initativeMod = INITATIVE_MOD_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SpriteImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.SPRITE;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getMatrixZustandMax() {
        int value = (int)Math.ceil(getStufe() / 2.0D);
        return 8 + value;
    }

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getResonanz() {
		return getStufe();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getGeraetestufe() {
		return getStufe();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getAngriff() {
		return getStufe() + getAngriffMod();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getSchleicher() {
		return getStufe() + getSchleicherMod();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getDatenverarbeitung() {
		return getStufe() + getDatenverarbeitungMod();
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InterfaceModus getCurrentModus() {
        return currentModus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCurrentModus(InterfaceModus newCurrentModus) {
        InterfaceModus oldCurrentModus = currentModus;
        currentModus = newCurrentModus == null ? CURRENT_MODUS_EDEFAULT : newCurrentModus;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPRITE__CURRENT_MODUS, oldCurrentModus, currentModus));
    }

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public int getFirewall() {
		return getStufe() + getFirewallMod();
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getResonanzBasis() {
        return resonanzBasis;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setResonanzBasis(int newResonanzBasis) {
        int oldResonanzBasis = resonanzBasis;
        resonanzBasis = newResonanzBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPRITE__RESONANZ_BASIS, oldResonanzBasis, resonanzBasis));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPRITE__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPRITE__IMAGE, oldImage, image));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPRITE__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPRITE__PARENT_ID, oldParentId, parentId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Localization> getLocalizations() {
        if (localizations == null) {
            localizations = new EObjectContainmentEList<Localization>(Localization.class, this, Shr5Package.SPRITE__LOCALIZATIONS);
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPRITE__PAGE, oldPage, page));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.SPRITE__SRC_BOOK, oldSrcBook, srcBook));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPRITE__SRC_BOOK, oldSrcBook, srcBook));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getStufe() {
        return stufe;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setStufe(int newStufe) {
        int oldStufe = stufe;
        stufe = newStufe;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPRITE__STUFE, oldStufe, stufe));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getAngriffMod() {
        return angriffMod;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setAngriffMod(int newAngriffMod) {
        int oldAngriffMod = angriffMod;
        angriffMod = newAngriffMod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPRITE__ANGRIFF_MOD, oldAngriffMod, angriffMod));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getSchleicherMod() {
        return schleicherMod;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setSchleicherMod(int newSchleicherMod) {
        int oldSchleicherMod = schleicherMod;
        schleicherMod = newSchleicherMod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPRITE__SCHLEICHER_MOD, oldSchleicherMod, schleicherMod));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getDatenverarbeitungMod() {
        return datenverarbeitungMod;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setDatenverarbeitungMod(int newDatenverarbeitungMod) {
        int oldDatenverarbeitungMod = datenverarbeitungMod;
        datenverarbeitungMod = newDatenverarbeitungMod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPRITE__DATENVERARBEITUNG_MOD, oldDatenverarbeitungMod, datenverarbeitungMod));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getFirewallMod() {
        return firewallMod;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setFirewallMod(int newFirewallMod) {
        int oldFirewallMod = firewallMod;
        firewallMod = newFirewallMod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPRITE__FIREWALL_MOD, oldFirewallMod, firewallMod));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getInitativeMod() {
        return initativeMod;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setInitativeMod(int newInitativeMod) {
        int oldInitativeMod = initativeMod;
        initativeMod = newInitativeMod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPRITE__INITATIVE_MOD, oldInitativeMod, initativeMod));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.SPRITE__LOCALIZATIONS:
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
            case Shr5Package.SPRITE__MATRIX_ZUSTAND_MAX:
                return getMatrixZustandMax();
            case Shr5Package.SPRITE__GERAETESTUFE:
                return getGeraetestufe();
            case Shr5Package.SPRITE__FIREWALL:
                return getFirewall();
            case Shr5Package.SPRITE__DATENVERARBEITUNG:
                return getDatenverarbeitung();
            case Shr5Package.SPRITE__CURRENT_MODUS:
                return getCurrentModus();
            case Shr5Package.SPRITE__ANGRIFF:
                return getAngriff();
            case Shr5Package.SPRITE__SCHLEICHER:
                return getSchleicher();
            case Shr5Package.SPRITE__RESONANZ:
                return getResonanz();
            case Shr5Package.SPRITE__RESONANZ_BASIS:
                return getResonanzBasis();
            case Shr5Package.SPRITE__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5Package.SPRITE__IMAGE:
                return getImage();
            case Shr5Package.SPRITE__NAME:
                return getName();
            case Shr5Package.SPRITE__PARENT_ID:
                return getParentId();
            case Shr5Package.SPRITE__LOCALIZATIONS:
                return getLocalizations();
            case Shr5Package.SPRITE__PAGE:
                return getPage();
            case Shr5Package.SPRITE__SRC_BOOK:
                if (resolve) return getSrcBook();
                return basicGetSrcBook();
            case Shr5Package.SPRITE__STUFE:
                return getStufe();
            case Shr5Package.SPRITE__ANGRIFF_MOD:
                return getAngriffMod();
            case Shr5Package.SPRITE__SCHLEICHER_MOD:
                return getSchleicherMod();
            case Shr5Package.SPRITE__DATENVERARBEITUNG_MOD:
                return getDatenverarbeitungMod();
            case Shr5Package.SPRITE__FIREWALL_MOD:
                return getFirewallMod();
            case Shr5Package.SPRITE__INITATIVE_MOD:
                return getInitativeMod();
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
            case Shr5Package.SPRITE__CURRENT_MODUS:
                setCurrentModus((InterfaceModus)newValue);
                return;
            case Shr5Package.SPRITE__RESONANZ_BASIS:
                setResonanzBasis((Integer)newValue);
                return;
            case Shr5Package.SPRITE__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5Package.SPRITE__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5Package.SPRITE__NAME:
                setName((String)newValue);
                return;
            case Shr5Package.SPRITE__PARENT_ID:
                setParentId((String)newValue);
                return;
            case Shr5Package.SPRITE__LOCALIZATIONS:
                getLocalizations().clear();
                getLocalizations().addAll((Collection<? extends Localization>)newValue);
                return;
            case Shr5Package.SPRITE__PAGE:
                setPage((String)newValue);
                return;
            case Shr5Package.SPRITE__SRC_BOOK:
                setSrcBook((SourceBook)newValue);
                return;
            case Shr5Package.SPRITE__STUFE:
                setStufe((Integer)newValue);
                return;
            case Shr5Package.SPRITE__ANGRIFF_MOD:
                setAngriffMod((Integer)newValue);
                return;
            case Shr5Package.SPRITE__SCHLEICHER_MOD:
                setSchleicherMod((Integer)newValue);
                return;
            case Shr5Package.SPRITE__DATENVERARBEITUNG_MOD:
                setDatenverarbeitungMod((Integer)newValue);
                return;
            case Shr5Package.SPRITE__FIREWALL_MOD:
                setFirewallMod((Integer)newValue);
                return;
            case Shr5Package.SPRITE__INITATIVE_MOD:
                setInitativeMod((Integer)newValue);
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
            case Shr5Package.SPRITE__CURRENT_MODUS:
                setCurrentModus(CURRENT_MODUS_EDEFAULT);
                return;
            case Shr5Package.SPRITE__RESONANZ_BASIS:
                setResonanzBasis(RESONANZ_BASIS_EDEFAULT);
                return;
            case Shr5Package.SPRITE__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5Package.SPRITE__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5Package.SPRITE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5Package.SPRITE__PARENT_ID:
                setParentId(PARENT_ID_EDEFAULT);
                return;
            case Shr5Package.SPRITE__LOCALIZATIONS:
                getLocalizations().clear();
                return;
            case Shr5Package.SPRITE__PAGE:
                setPage(PAGE_EDEFAULT);
                return;
            case Shr5Package.SPRITE__SRC_BOOK:
                setSrcBook((SourceBook)null);
                return;
            case Shr5Package.SPRITE__STUFE:
                setStufe(STUFE_EDEFAULT);
                return;
            case Shr5Package.SPRITE__ANGRIFF_MOD:
                setAngriffMod(ANGRIFF_MOD_EDEFAULT);
                return;
            case Shr5Package.SPRITE__SCHLEICHER_MOD:
                setSchleicherMod(SCHLEICHER_MOD_EDEFAULT);
                return;
            case Shr5Package.SPRITE__DATENVERARBEITUNG_MOD:
                setDatenverarbeitungMod(DATENVERARBEITUNG_MOD_EDEFAULT);
                return;
            case Shr5Package.SPRITE__FIREWALL_MOD:
                setFirewallMod(FIREWALL_MOD_EDEFAULT);
                return;
            case Shr5Package.SPRITE__INITATIVE_MOD:
                setInitativeMod(INITATIVE_MOD_EDEFAULT);
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
            case Shr5Package.SPRITE__MATRIX_ZUSTAND_MAX:
                return getMatrixZustandMax() != MATRIX_ZUSTAND_MAX_EDEFAULT;
            case Shr5Package.SPRITE__GERAETESTUFE:
                return getGeraetestufe() != GERAETESTUFE_EDEFAULT;
            case Shr5Package.SPRITE__FIREWALL:
                return getFirewall() != FIREWALL_EDEFAULT;
            case Shr5Package.SPRITE__DATENVERARBEITUNG:
                return getDatenverarbeitung() != DATENVERARBEITUNG_EDEFAULT;
            case Shr5Package.SPRITE__CURRENT_MODUS:
                return currentModus != CURRENT_MODUS_EDEFAULT;
            case Shr5Package.SPRITE__ANGRIFF:
                return getAngriff() != ANGRIFF_EDEFAULT;
            case Shr5Package.SPRITE__SCHLEICHER:
                return getSchleicher() != SCHLEICHER_EDEFAULT;
            case Shr5Package.SPRITE__RESONANZ:
                return getResonanz() != RESONANZ_EDEFAULT;
            case Shr5Package.SPRITE__RESONANZ_BASIS:
                return resonanzBasis != RESONANZ_BASIS_EDEFAULT;
            case Shr5Package.SPRITE__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5Package.SPRITE__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5Package.SPRITE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5Package.SPRITE__PARENT_ID:
                return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
            case Shr5Package.SPRITE__LOCALIZATIONS:
                return localizations != null && !localizations.isEmpty();
            case Shr5Package.SPRITE__PAGE:
                return PAGE_EDEFAULT == null ? page != null : !PAGE_EDEFAULT.equals(page);
            case Shr5Package.SPRITE__SRC_BOOK:
                return srcBook != null;
            case Shr5Package.SPRITE__STUFE:
                return stufe != STUFE_EDEFAULT;
            case Shr5Package.SPRITE__ANGRIFF_MOD:
                return angriffMod != ANGRIFF_MOD_EDEFAULT;
            case Shr5Package.SPRITE__SCHLEICHER_MOD:
                return schleicherMod != SCHLEICHER_MOD_EDEFAULT;
            case Shr5Package.SPRITE__DATENVERARBEITUNG_MOD:
                return datenverarbeitungMod != DATENVERARBEITUNG_MOD_EDEFAULT;
            case Shr5Package.SPRITE__FIREWALL_MOD:
                return firewallMod != FIREWALL_MOD_EDEFAULT;
            case Shr5Package.SPRITE__INITATIVE_MOD:
                return initativeMod != INITATIVE_MOD_EDEFAULT;
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
                case Shr5Package.SPRITE__BESCHREIBUNG: return Shr5Package.BESCHREIBBAR__BESCHREIBUNG;
                case Shr5Package.SPRITE__IMAGE: return Shr5Package.BESCHREIBBAR__IMAGE;
                case Shr5Package.SPRITE__NAME: return Shr5Package.BESCHREIBBAR__NAME;
                default: return -1;
            }
        }
        if (baseClass == Identifiable.class) {
            switch (derivedFeatureID) {
                case Shr5Package.SPRITE__PARENT_ID: return Shr5Package.IDENTIFIABLE__PARENT_ID;
                case Shr5Package.SPRITE__LOCALIZATIONS: return Shr5Package.IDENTIFIABLE__LOCALIZATIONS;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (derivedFeatureID) {
                case Shr5Package.SPRITE__PAGE: return Shr5Package.QUELLE__PAGE;
                case Shr5Package.SPRITE__SRC_BOOK: return Shr5Package.QUELLE__SRC_BOOK;
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
                case Shr5Package.BESCHREIBBAR__BESCHREIBUNG: return Shr5Package.SPRITE__BESCHREIBUNG;
                case Shr5Package.BESCHREIBBAR__IMAGE: return Shr5Package.SPRITE__IMAGE;
                case Shr5Package.BESCHREIBBAR__NAME: return Shr5Package.SPRITE__NAME;
                default: return -1;
            }
        }
        if (baseClass == Identifiable.class) {
            switch (baseFeatureID) {
                case Shr5Package.IDENTIFIABLE__PARENT_ID: return Shr5Package.SPRITE__PARENT_ID;
                case Shr5Package.IDENTIFIABLE__LOCALIZATIONS: return Shr5Package.SPRITE__LOCALIZATIONS;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (baseFeatureID) {
                case Shr5Package.QUELLE__PAGE: return Shr5Package.SPRITE__PAGE;
                case Shr5Package.QUELLE__SRC_BOOK: return Shr5Package.SPRITE__SRC_BOOK;
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
        result.append(" (currentModus: ");
        result.append(currentModus);
        result.append(", resonanzBasis: ");
        result.append(resonanzBasis);
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
        result.append(", stufe: ");
        result.append(stufe);
        result.append(", angriffMod: ");
        result.append(angriffMod);
        result.append(", schleicherMod: ");
        result.append(schleicherMod);
        result.append(", datenverarbeitungMod: ");
        result.append(datenverarbeitungMod);
        result.append(", firewallMod: ");
        result.append(firewallMod);
        result.append(", initativeMod: ");
        result.append(initativeMod);
        result.append(')');
        return result.toString();
    }

} //SpriteImpl
