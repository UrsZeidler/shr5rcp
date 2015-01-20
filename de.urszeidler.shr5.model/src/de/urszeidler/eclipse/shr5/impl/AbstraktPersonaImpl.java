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

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.ChrakterLimits;
import de.urszeidler.eclipse.shr5.GeistigeAttribute;
import de.urszeidler.eclipse.shr5.KoerperlicheAttribute;
import de.urszeidler.eclipse.shr5.ModSetter;
import de.urszeidler.eclipse.shr5.ModifikatorAttribute;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SpezielleAttribute;
import de.urszeidler.eclipse.shr5.Spezies;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Abstrakt Persona</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getKonstitution <em>Konstitution</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getGeschicklichkeit <em>Geschicklichkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getReaktion <em>Reaktion</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getStaerke <em>Staerke</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getInitative <em>Initative</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getInitativWuerfel <em>Initativ Wuerfel</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getAusweichen <em>Ausweichen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getEssenz <em>Essenz</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getEdgeBasis <em>Edge Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getCharisma <em>Charisma</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getWillenskraft <em>Willenskraft</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getIntuition <em>Intuition</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getLogik <em>Logik</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getKoerperlich <em>Koerperlich</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getGeistig <em>Geistig</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getSozial <em>Sozial</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getKonstitutionBasis <em>Konstitution Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getGeschicklichkeitBasis <em>Geschicklichkeit Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getReaktionBasis <em>Reaktion Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getStaerkeBasis <em>Staerke Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getCharismaBasis <em>Charisma Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getWillenskraftBasis <em>Willenskraft Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getIntuitionBasis <em>Intuition Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getLogikBasis <em>Logik Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getFertigkeiten <em>Fertigkeiten</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getFertigkeitsGruppen <em>Fertigkeits Gruppen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getSpezies <em>Spezies</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.AbstraktPersonaImpl#getModManager <em>Mod Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstraktPersonaImpl extends MinimalEObjectImpl.Container implements AbstraktPersona {
	/**
     * The default value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getBeschreibung()
     * @generated
     * @ordered
     */
	protected static final String BESCHREIBUNG_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getBeschreibung()
     * @generated
     * @ordered
     */
	protected String beschreibung = BESCHREIBUNG_EDEFAULT;

	/**
     * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getImage()
     * @generated
     * @ordered
     */
	protected static final String IMAGE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getImage()
     * @generated
     * @ordered
     */
	protected String image = IMAGE_EDEFAULT;

	/**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected static final String NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
	protected String name = NAME_EDEFAULT;

	/**
     * The default value of the '{@link #getKonstitution() <em>Konstitution</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getKonstitution()
     * @generated
     * @ordered
     */
	protected static final int KONSTITUTION_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getGeschicklichkeit() <em>Geschicklichkeit</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getGeschicklichkeit()
     * @generated
     * @ordered
     */
	protected static final int GESCHICKLICHKEIT_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getReaktion() <em>Reaktion</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getReaktion()
     * @generated
     * @ordered
     */
	protected static final int REAKTION_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getStaerke() <em>Staerke</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getStaerke()
     * @generated
     * @ordered
     */
	protected static final int STAERKE_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getInitative() <em>Initative</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getInitative()
     * @generated
     * @ordered
     */
	protected static final int INITATIVE_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getInitativWuerfel() <em>Initativ Wuerfel</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getInitativWuerfel()
     * @generated
     * @ordered
     */
	protected static final int INITATIV_WUERFEL_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getAusweichen() <em>Ausweichen</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAusweichen()
     * @generated
     * @ordered
     */
	protected static final int AUSWEICHEN_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getEssenz() <em>Essenz</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getEssenz()
     * @generated
     * @ordered
     */
	protected static final int ESSENZ_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getEdgeBasis() <em>Edge Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getEdgeBasis()
     * @generated
     * @ordered
     */
	protected static final int EDGE_BASIS_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getEdgeBasis() <em>Edge Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getEdgeBasis()
     * @generated
     * @ordered
     */
	protected int edgeBasis = EDGE_BASIS_EDEFAULT;

	/**
     * The default value of the '{@link #getEdge() <em>Edge</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getEdge()
     * @generated
     * @ordered
     */
	protected static final int EDGE_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getCharisma() <em>Charisma</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCharisma()
     * @generated
     * @ordered
     */
	protected static final int CHARISMA_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getWillenskraft() <em>Willenskraft</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getWillenskraft()
     * @generated
     * @ordered
     */
	protected static final int WILLENSKRAFT_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getIntuition() <em>Intuition</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIntuition()
     * @generated
     * @ordered
     */
	protected static final int INTUITION_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getLogik() <em>Logik</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLogik()
     * @generated
     * @ordered
     */
	protected static final int LOGIK_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getKoerperlich() <em>Koerperlich</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getKoerperlich()
     * @generated
     * @ordered
     */
	protected static final int KOERPERLICH_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getGeistig() <em>Geistig</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getGeistig()
     * @generated
     * @ordered
     */
	protected static final int GEISTIG_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getSozial() <em>Sozial</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSozial()
     * @generated
     * @ordered
     */
	protected static final int SOZIAL_EDEFAULT = 0;

	/**
     * The default value of the '{@link #getKonstitutionBasis() <em>Konstitution Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getKonstitutionBasis()
     * @generated
     * @ordered
     */
	protected static final int KONSTITUTION_BASIS_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getKonstitutionBasis() <em>Konstitution Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getKonstitutionBasis()
     * @generated
     * @ordered
     */
	protected int konstitutionBasis = KONSTITUTION_BASIS_EDEFAULT;

	/**
     * The default value of the '{@link #getGeschicklichkeitBasis() <em>Geschicklichkeit Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getGeschicklichkeitBasis()
     * @generated
     * @ordered
     */
	protected static final int GESCHICKLICHKEIT_BASIS_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getGeschicklichkeitBasis() <em>Geschicklichkeit Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getGeschicklichkeitBasis()
     * @generated
     * @ordered
     */
	protected int geschicklichkeitBasis = GESCHICKLICHKEIT_BASIS_EDEFAULT;

	/**
     * The default value of the '{@link #getReaktionBasis() <em>Reaktion Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getReaktionBasis()
     * @generated
     * @ordered
     */
	protected static final int REAKTION_BASIS_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getReaktionBasis() <em>Reaktion Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getReaktionBasis()
     * @generated
     * @ordered
     */
	protected int reaktionBasis = REAKTION_BASIS_EDEFAULT;

	/**
     * The default value of the '{@link #getStaerkeBasis() <em>Staerke Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getStaerkeBasis()
     * @generated
     * @ordered
     */
	protected static final int STAERKE_BASIS_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getStaerkeBasis() <em>Staerke Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getStaerkeBasis()
     * @generated
     * @ordered
     */
	protected int staerkeBasis = STAERKE_BASIS_EDEFAULT;

	/**
     * The default value of the '{@link #getCharismaBasis() <em>Charisma Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getCharismaBasis()
     * @generated
     * @ordered
     */
	protected static final int CHARISMA_BASIS_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getCharismaBasis() <em>Charisma Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getCharismaBasis()
     * @generated
     * @ordered
     */
	protected int charismaBasis = CHARISMA_BASIS_EDEFAULT;

	/**
     * The default value of the '{@link #getWillenskraftBasis() <em>Willenskraft Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getWillenskraftBasis()
     * @generated
     * @ordered
     */
	protected static final int WILLENSKRAFT_BASIS_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getWillenskraftBasis() <em>Willenskraft Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getWillenskraftBasis()
     * @generated
     * @ordered
     */
	protected int willenskraftBasis = WILLENSKRAFT_BASIS_EDEFAULT;

	/**
     * The default value of the '{@link #getIntuitionBasis() <em>Intuition Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getIntuitionBasis()
     * @generated
     * @ordered
     */
	protected static final int INTUITION_BASIS_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getIntuitionBasis() <em>Intuition Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
     * @see #getIntuitionBasis()
     * @generated
     * @ordered
     */
	protected int intuitionBasis = INTUITION_BASIS_EDEFAULT;

	/**
     * The default value of the '{@link #getLogikBasis() <em>Logik Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLogikBasis()
     * @generated
     * @ordered
     */
	protected static final int LOGIK_BASIS_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getLogikBasis() <em>Logik Basis</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLogikBasis()
     * @generated
     * @ordered
     */
	protected int logikBasis = LOGIK_BASIS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFertigkeiten() <em>Fertigkeiten</em>}
	 * ' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getFertigkeiten()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonaFertigkeit> fertigkeiten;

	/**
	 * The cached value of the '{@link #getFertigkeitsGruppen()
	 * <em>Fertigkeits Gruppen</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFertigkeitsGruppen()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonaFertigkeitsGruppe> fertigkeitsGruppen;

	/**
     * The cached value of the '{@link #getSpezies() <em>Spezies</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSpezies()
     * @generated
     * @ordered
     */
	protected Spezies spezies;

	/**
	 * The default value of the '{@link #getModManager() <em>Mod Manager</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModManager()
	 * @generated not
	 * @ordered
	 */
	protected static final ModSetter MOD_MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModManager() <em>Mod Manager</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModManager()
	 * @generated not
	 * @ordered
	 */
	protected ModSetter modManager = new ModSetter();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	protected AbstraktPersonaImpl() {
		super();
		modManager.setPersona(this);

	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.ABSTRAKT_PERSONA;
    }

	// /**
	// * Refreshes the modManger.
	// */
	// @Override
	// public boolean eNotificationRequired() {
	// boolean isReq = super.eNotificationRequired();
	// // if (isReq)
	// modManager.setDirty(true);
	// return isReq;
	// }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
        return name;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_PERSONA__NAME, oldName, name));
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public String getBeschreibung() {
        return beschreibung;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public void setBeschreibung(String newBeschreibung) {
        String oldBeschreibung = beschreibung;
        beschreibung = newBeschreibung;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_PERSONA__BESCHREIBUNG, oldBeschreibung, beschreibung));
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public String getImage() {
        return image;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public void setImage(String newImage) {
        String oldImage = image;
        image = newImage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_PERSONA__IMAGE, oldImage, image));
    }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public int getKonstitution() {
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__KONSTITUTION);
		return getKonstitutionBasis() + getmodWert;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public int getGeschicklichkeit() {
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);
		return getGeschicklichkeitBasis() + getmodWert;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public int getReaktion() {
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__REAKTION);
		return getReaktionBasis() + getmodWert;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public int getStaerke() {
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__STAERKE);
		return getStaerkeBasis() + getmodWert;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public int getInitative() {
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE);
		return getReaktion() + getIntuition() + getmodWert;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public int getInitativWuerfel() {
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL);
		return 1 + getmodWert;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public int getAusweichen() {
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN);
		return getReaktion() + getIntuition() + getmodWert;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public int getEssenz() {
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__ESSENZ);
		if (getSpezies() != null) {
			int essenzMax = getSpezies().getEssenzMax() * 100;
			return essenzMax + getmodWert;
		}
		return 600 + getmodWert;
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public int getEdgeBasis() {
        return edgeBasis;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public void setEdgeBasis(int newEdgeBasis) {
        int oldEdgeBasis = edgeBasis;
        edgeBasis = newEdgeBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_PERSONA__EDGE_BASIS, oldEdgeBasis, edgeBasis));
    }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public int getEdge() {
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__EDGE);
		return getEdgeBasis() + getmodWert;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public int getCharisma() {
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__CHARISMA);
		return getCharismaBasis() + getmodWert;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public int getWillenskraft() {
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__WILLENSKRAFT);
		return getWillenskraftBasis() + getmodWert;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public int getIntuition() {
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__INTUITION);
		return getIntuitionBasis() + getmodWert;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public int getLogik() {
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__LOGIK);
		return getLogikBasis() + getmodWert;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public int getKoerperlich() {
		double baselimit1 = ((getStaerke() * 2) + getKonstitution() + getReaktion()) / 3.0;
		int baselimit = (int) Math.ceil(baselimit1);
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.CHRAKTER_LIMITS__KOERPERLICH);
		return baselimit + getmodWert;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public int getGeistig() {
		double baselimit1 = ((getLogik() * 2) + getIntuition() + getWillenskraft()) / 3.0;
		int baselimit = (int) Math.ceil(baselimit1);
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.CHRAKTER_LIMITS__GEISTIG);
		return baselimit + getmodWert;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public int getSozial() {
		double baselimit1 = ((getCharisma() * 2) + getWillenskraft() + (getEssenz() / 100)) / 3.0;
		int baselimit = (int) Math.ceil(baselimit1);
		int getmodWert = modManager.getmodWert(Shr5Package.Literals.CHRAKTER_LIMITS__SOZIAL);
		return baselimit + getmodWert;
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public int getKonstitutionBasis() {
        return konstitutionBasis;
    }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public void setKonstitutionBasis(int newKonstitutionBasis) {
		int oldKonstitutionBasis = konstitutionBasis;
		konstitutionBasis = newKonstitutionBasis;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_PERSONA__KONSTITUTION_BASIS,
					oldKonstitutionBasis, konstitutionBasis));
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.Literals.CHRAKTER_LIMITS__KOERPERLICH, 0, 1));

		}
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public int getGeschicklichkeitBasis() {
        return geschicklichkeitBasis;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public void setGeschicklichkeitBasis(int newGeschicklichkeitBasis) {
        int oldGeschicklichkeitBasis = geschicklichkeitBasis;
        geschicklichkeitBasis = newGeschicklichkeitBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS, oldGeschicklichkeitBasis, geschicklichkeitBasis));
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public int getReaktionBasis() {
        return reaktionBasis;
    }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public void setReaktionBasis(int newReaktionBasis) {
		int oldReaktionBasis = reaktionBasis;
		reaktionBasis = newReaktionBasis;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.Literals.ABSTRAKT_PERSONA__REAKTION_BASIS,
					oldReaktionBasis, reaktionBasis));
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__REAKTION,
					oldReaktionBasis, reaktionBasis));
			int diff = newReaktionBasis - oldReaktionBasis;

			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN,
					getAusweichen(), getAusweichen() + diff));
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE,
					getInitative(), getInitative() + diff));

			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.Literals.CHRAKTER_LIMITS__KOERPERLICH, 0, diff));

		}
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public int getStaerkeBasis() {
        return staerkeBasis;
    }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public void setStaerkeBasis(int newStaerkeBasis) {
		int oldStaerkeBasis = staerkeBasis;
		staerkeBasis = newStaerkeBasis;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_PERSONA__STAERKE_BASIS, oldStaerkeBasis,
					staerkeBasis));

			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.Literals.CHRAKTER_LIMITS__KOERPERLICH, 0, 1));

		}
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public int getCharismaBasis() {
        return charismaBasis;
    }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public void setCharismaBasis(int newCharismaBasis) {
		int oldCharismaBasis = charismaBasis;
		charismaBasis = newCharismaBasis;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_PERSONA__CHARISMA_BASIS, oldCharismaBasis,
					charismaBasis));
			// int diff = newCharismaBasis - oldCharismaBasis;

			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.Literals.CHRAKTER_LIMITS__SOZIAL, 0, 1));
		}
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public int getWillenskraftBasis() {
        return willenskraftBasis;
    }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public void setWillenskraftBasis(int newWillenskraftBasis) {
		int oldWillenskraftBasis = willenskraftBasis;
		willenskraftBasis = newWillenskraftBasis;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS,
					oldWillenskraftBasis, willenskraftBasis));

			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.Literals.CHRAKTER_LIMITS__GEISTIG, 0, 1));
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.Literals.CHRAKTER_LIMITS__SOZIAL, 0, 1));

		}
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public int getIntuitionBasis() {
        return intuitionBasis;
    }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public void setIntuitionBasis(int newIntuitionBasis) {
		int oldIntuitionBasis = intuitionBasis;
		intuitionBasis = newIntuitionBasis;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_PERSONA__INTUITION_BASIS,
					oldIntuitionBasis, intuitionBasis));
			int diff = newIntuitionBasis - oldIntuitionBasis;

			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN,
					getAusweichen(), getAusweichen() + diff));
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE,
					getInitative(), getInitative() + diff));
			eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.Literals.CHRAKTER_LIMITS__GEISTIG, 0, 1));

		}
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public int getLogikBasis() {
        return logikBasis;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated not
     */
	public void setLogikBasis(int newLogikBasis) {
        int oldLogikBasis = logikBasis;
        logikBasis = newLogikBasis;
        if (eNotificationRequired()){
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_PERSONA__LOGIK_BASIS, oldLogikBasis, logikBasis));
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.Literals.CHRAKTER_LIMITS__GEISTIG, 0, 1));   
        }
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EList<PersonaFertigkeit> getFertigkeiten() {
        if (fertigkeiten == null) {
            fertigkeiten = new EObjectContainmentEList<PersonaFertigkeit>(PersonaFertigkeit.class, this, Shr5Package.ABSTRAKT_PERSONA__FERTIGKEITEN);
        }
        return fertigkeiten;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public EList<PersonaFertigkeitsGruppe> getFertigkeitsGruppen() {
        if (fertigkeitsGruppen == null) {
            fertigkeitsGruppen = new EObjectContainmentEList<PersonaFertigkeitsGruppe>(PersonaFertigkeitsGruppe.class, this, Shr5Package.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN);
        }
        return fertigkeitsGruppen;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public Spezies getSpezies() {
        if (spezies != null && spezies.eIsProxy()) {
            InternalEObject oldSpezies = (InternalEObject)spezies;
            spezies = (Spezies)eResolveProxy(oldSpezies);
            if (spezies != oldSpezies) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.ABSTRAKT_PERSONA__SPEZIES, oldSpezies, spezies));
            }
        }
        return spezies;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public Spezies basicGetSpezies() {
        return spezies;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public void setSpezies(Spezies newSpezies) {
        Spezies oldSpezies = spezies;
        spezies = newSpezies;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.ABSTRAKT_PERSONA__SPEZIES, oldSpezies, spezies));
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	public ModSetter getModManager() {
        return modManager;
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.ABSTRAKT_PERSONA__FERTIGKEITEN:
                return ((InternalEList<?>)getFertigkeiten()).basicRemove(otherEnd, msgs);
            case Shr5Package.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN:
                return ((InternalEList<?>)getFertigkeitsGruppen()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.ABSTRAKT_PERSONA__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5Package.ABSTRAKT_PERSONA__IMAGE:
                return getImage();
            case Shr5Package.ABSTRAKT_PERSONA__NAME:
                return getName();
            case Shr5Package.ABSTRAKT_PERSONA__KONSTITUTION:
                return getKonstitution();
            case Shr5Package.ABSTRAKT_PERSONA__GESCHICKLICHKEIT:
                return getGeschicklichkeit();
            case Shr5Package.ABSTRAKT_PERSONA__REAKTION:
                return getReaktion();
            case Shr5Package.ABSTRAKT_PERSONA__STAERKE:
                return getStaerke();
            case Shr5Package.ABSTRAKT_PERSONA__INITATIVE:
                return getInitative();
            case Shr5Package.ABSTRAKT_PERSONA__INITATIV_WUERFEL:
                return getInitativWuerfel();
            case Shr5Package.ABSTRAKT_PERSONA__AUSWEICHEN:
                return getAusweichen();
            case Shr5Package.ABSTRAKT_PERSONA__ESSENZ:
                return getEssenz();
            case Shr5Package.ABSTRAKT_PERSONA__EDGE_BASIS:
                return getEdgeBasis();
            case Shr5Package.ABSTRAKT_PERSONA__EDGE:
                return getEdge();
            case Shr5Package.ABSTRAKT_PERSONA__CHARISMA:
                return getCharisma();
            case Shr5Package.ABSTRAKT_PERSONA__WILLENSKRAFT:
                return getWillenskraft();
            case Shr5Package.ABSTRAKT_PERSONA__INTUITION:
                return getIntuition();
            case Shr5Package.ABSTRAKT_PERSONA__LOGIK:
                return getLogik();
            case Shr5Package.ABSTRAKT_PERSONA__KOERPERLICH:
                return getKoerperlich();
            case Shr5Package.ABSTRAKT_PERSONA__GEISTIG:
                return getGeistig();
            case Shr5Package.ABSTRAKT_PERSONA__SOZIAL:
                return getSozial();
            case Shr5Package.ABSTRAKT_PERSONA__KONSTITUTION_BASIS:
                return getKonstitutionBasis();
            case Shr5Package.ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS:
                return getGeschicklichkeitBasis();
            case Shr5Package.ABSTRAKT_PERSONA__REAKTION_BASIS:
                return getReaktionBasis();
            case Shr5Package.ABSTRAKT_PERSONA__STAERKE_BASIS:
                return getStaerkeBasis();
            case Shr5Package.ABSTRAKT_PERSONA__CHARISMA_BASIS:
                return getCharismaBasis();
            case Shr5Package.ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS:
                return getWillenskraftBasis();
            case Shr5Package.ABSTRAKT_PERSONA__INTUITION_BASIS:
                return getIntuitionBasis();
            case Shr5Package.ABSTRAKT_PERSONA__LOGIK_BASIS:
                return getLogikBasis();
            case Shr5Package.ABSTRAKT_PERSONA__FERTIGKEITEN:
                return getFertigkeiten();
            case Shr5Package.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN:
                return getFertigkeitsGruppen();
            case Shr5Package.ABSTRAKT_PERSONA__SPEZIES:
                if (resolve) return getSpezies();
                return basicGetSpezies();
            case Shr5Package.ABSTRAKT_PERSONA__MOD_MANAGER:
                return getModManager();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5Package.ABSTRAKT_PERSONA__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__NAME:
                setName((String)newValue);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__EDGE_BASIS:
                setEdgeBasis((Integer)newValue);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__KONSTITUTION_BASIS:
                setKonstitutionBasis((Integer)newValue);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS:
                setGeschicklichkeitBasis((Integer)newValue);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__REAKTION_BASIS:
                setReaktionBasis((Integer)newValue);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__STAERKE_BASIS:
                setStaerkeBasis((Integer)newValue);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__CHARISMA_BASIS:
                setCharismaBasis((Integer)newValue);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS:
                setWillenskraftBasis((Integer)newValue);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__INTUITION_BASIS:
                setIntuitionBasis((Integer)newValue);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__LOGIK_BASIS:
                setLogikBasis((Integer)newValue);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__FERTIGKEITEN:
                getFertigkeiten().clear();
                getFertigkeiten().addAll((Collection<? extends PersonaFertigkeit>)newValue);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN:
                getFertigkeitsGruppen().clear();
                getFertigkeitsGruppen().addAll((Collection<? extends PersonaFertigkeitsGruppe>)newValue);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__SPEZIES:
                setSpezies((Spezies)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case Shr5Package.ABSTRAKT_PERSONA__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__EDGE_BASIS:
                setEdgeBasis(EDGE_BASIS_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__KONSTITUTION_BASIS:
                setKonstitutionBasis(KONSTITUTION_BASIS_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS:
                setGeschicklichkeitBasis(GESCHICKLICHKEIT_BASIS_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__REAKTION_BASIS:
                setReaktionBasis(REAKTION_BASIS_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__STAERKE_BASIS:
                setStaerkeBasis(STAERKE_BASIS_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__CHARISMA_BASIS:
                setCharismaBasis(CHARISMA_BASIS_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS:
                setWillenskraftBasis(WILLENSKRAFT_BASIS_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__INTUITION_BASIS:
                setIntuitionBasis(INTUITION_BASIS_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__LOGIK_BASIS:
                setLogikBasis(LOGIK_BASIS_EDEFAULT);
                return;
            case Shr5Package.ABSTRAKT_PERSONA__FERTIGKEITEN:
                getFertigkeiten().clear();
                return;
            case Shr5Package.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN:
                getFertigkeitsGruppen().clear();
                return;
            case Shr5Package.ABSTRAKT_PERSONA__SPEZIES:
                setSpezies((Spezies)null);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Shr5Package.ABSTRAKT_PERSONA__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5Package.ABSTRAKT_PERSONA__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5Package.ABSTRAKT_PERSONA__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5Package.ABSTRAKT_PERSONA__KONSTITUTION:
                return getKonstitution() != KONSTITUTION_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__GESCHICKLICHKEIT:
                return getGeschicklichkeit() != GESCHICKLICHKEIT_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__REAKTION:
                return getReaktion() != REAKTION_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__STAERKE:
                return getStaerke() != STAERKE_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__INITATIVE:
                return getInitative() != INITATIVE_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__INITATIV_WUERFEL:
                return getInitativWuerfel() != INITATIV_WUERFEL_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__AUSWEICHEN:
                return getAusweichen() != AUSWEICHEN_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__ESSENZ:
                return getEssenz() != ESSENZ_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__EDGE_BASIS:
                return edgeBasis != EDGE_BASIS_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__EDGE:
                return getEdge() != EDGE_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__CHARISMA:
                return getCharisma() != CHARISMA_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__WILLENSKRAFT:
                return getWillenskraft() != WILLENSKRAFT_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__INTUITION:
                return getIntuition() != INTUITION_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__LOGIK:
                return getLogik() != LOGIK_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__KOERPERLICH:
                return getKoerperlich() != KOERPERLICH_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__GEISTIG:
                return getGeistig() != GEISTIG_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__SOZIAL:
                return getSozial() != SOZIAL_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__KONSTITUTION_BASIS:
                return konstitutionBasis != KONSTITUTION_BASIS_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS:
                return geschicklichkeitBasis != GESCHICKLICHKEIT_BASIS_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__REAKTION_BASIS:
                return reaktionBasis != REAKTION_BASIS_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__STAERKE_BASIS:
                return staerkeBasis != STAERKE_BASIS_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__CHARISMA_BASIS:
                return charismaBasis != CHARISMA_BASIS_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS:
                return willenskraftBasis != WILLENSKRAFT_BASIS_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__INTUITION_BASIS:
                return intuitionBasis != INTUITION_BASIS_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__LOGIK_BASIS:
                return logikBasis != LOGIK_BASIS_EDEFAULT;
            case Shr5Package.ABSTRAKT_PERSONA__FERTIGKEITEN:
                return fertigkeiten != null && !fertigkeiten.isEmpty();
            case Shr5Package.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN:
                return fertigkeitsGruppen != null && !fertigkeitsGruppen.isEmpty();
            case Shr5Package.ABSTRAKT_PERSONA__SPEZIES:
                return spezies != null;
            case Shr5Package.ABSTRAKT_PERSONA__MOD_MANAGER:
                return MOD_MANAGER_EDEFAULT == null ? modManager != null : !MOD_MANAGER_EDEFAULT.equals(modManager);
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == ModifikatorAttribute.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == KoerperlicheAttribute.class) {
            switch (derivedFeatureID) {
                case Shr5Package.ABSTRAKT_PERSONA__KONSTITUTION: return Shr5Package.KOERPERLICHE_ATTRIBUTE__KONSTITUTION;
                case Shr5Package.ABSTRAKT_PERSONA__GESCHICKLICHKEIT: return Shr5Package.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT;
                case Shr5Package.ABSTRAKT_PERSONA__REAKTION: return Shr5Package.KOERPERLICHE_ATTRIBUTE__REAKTION;
                case Shr5Package.ABSTRAKT_PERSONA__STAERKE: return Shr5Package.KOERPERLICHE_ATTRIBUTE__STAERKE;
                default: return -1;
            }
        }
        if (baseClass == SpezielleAttribute.class) {
            switch (derivedFeatureID) {
                case Shr5Package.ABSTRAKT_PERSONA__INITATIVE: return Shr5Package.SPEZIELLE_ATTRIBUTE__INITATIVE;
                case Shr5Package.ABSTRAKT_PERSONA__INITATIV_WUERFEL: return Shr5Package.SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL;
                case Shr5Package.ABSTRAKT_PERSONA__AUSWEICHEN: return Shr5Package.SPEZIELLE_ATTRIBUTE__AUSWEICHEN;
                case Shr5Package.ABSTRAKT_PERSONA__ESSENZ: return Shr5Package.SPEZIELLE_ATTRIBUTE__ESSENZ;
                case Shr5Package.ABSTRAKT_PERSONA__EDGE_BASIS: return Shr5Package.SPEZIELLE_ATTRIBUTE__EDGE_BASIS;
                case Shr5Package.ABSTRAKT_PERSONA__EDGE: return Shr5Package.SPEZIELLE_ATTRIBUTE__EDGE;
                default: return -1;
            }
        }
        if (baseClass == GeistigeAttribute.class) {
            switch (derivedFeatureID) {
                case Shr5Package.ABSTRAKT_PERSONA__CHARISMA: return Shr5Package.GEISTIGE_ATTRIBUTE__CHARISMA;
                case Shr5Package.ABSTRAKT_PERSONA__WILLENSKRAFT: return Shr5Package.GEISTIGE_ATTRIBUTE__WILLENSKRAFT;
                case Shr5Package.ABSTRAKT_PERSONA__INTUITION: return Shr5Package.GEISTIGE_ATTRIBUTE__INTUITION;
                case Shr5Package.ABSTRAKT_PERSONA__LOGIK: return Shr5Package.GEISTIGE_ATTRIBUTE__LOGIK;
                default: return -1;
            }
        }
        if (baseClass == ChrakterLimits.class) {
            switch (derivedFeatureID) {
                case Shr5Package.ABSTRAKT_PERSONA__KOERPERLICH: return Shr5Package.CHRAKTER_LIMITS__KOERPERLICH;
                case Shr5Package.ABSTRAKT_PERSONA__GEISTIG: return Shr5Package.CHRAKTER_LIMITS__GEISTIG;
                case Shr5Package.ABSTRAKT_PERSONA__SOZIAL: return Shr5Package.CHRAKTER_LIMITS__SOZIAL;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == ModifikatorAttribute.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == KoerperlicheAttribute.class) {
            switch (baseFeatureID) {
                case Shr5Package.KOERPERLICHE_ATTRIBUTE__KONSTITUTION: return Shr5Package.ABSTRAKT_PERSONA__KONSTITUTION;
                case Shr5Package.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT: return Shr5Package.ABSTRAKT_PERSONA__GESCHICKLICHKEIT;
                case Shr5Package.KOERPERLICHE_ATTRIBUTE__REAKTION: return Shr5Package.ABSTRAKT_PERSONA__REAKTION;
                case Shr5Package.KOERPERLICHE_ATTRIBUTE__STAERKE: return Shr5Package.ABSTRAKT_PERSONA__STAERKE;
                default: return -1;
            }
        }
        if (baseClass == SpezielleAttribute.class) {
            switch (baseFeatureID) {
                case Shr5Package.SPEZIELLE_ATTRIBUTE__INITATIVE: return Shr5Package.ABSTRAKT_PERSONA__INITATIVE;
                case Shr5Package.SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL: return Shr5Package.ABSTRAKT_PERSONA__INITATIV_WUERFEL;
                case Shr5Package.SPEZIELLE_ATTRIBUTE__AUSWEICHEN: return Shr5Package.ABSTRAKT_PERSONA__AUSWEICHEN;
                case Shr5Package.SPEZIELLE_ATTRIBUTE__ESSENZ: return Shr5Package.ABSTRAKT_PERSONA__ESSENZ;
                case Shr5Package.SPEZIELLE_ATTRIBUTE__EDGE_BASIS: return Shr5Package.ABSTRAKT_PERSONA__EDGE_BASIS;
                case Shr5Package.SPEZIELLE_ATTRIBUTE__EDGE: return Shr5Package.ABSTRAKT_PERSONA__EDGE;
                default: return -1;
            }
        }
        if (baseClass == GeistigeAttribute.class) {
            switch (baseFeatureID) {
                case Shr5Package.GEISTIGE_ATTRIBUTE__CHARISMA: return Shr5Package.ABSTRAKT_PERSONA__CHARISMA;
                case Shr5Package.GEISTIGE_ATTRIBUTE__WILLENSKRAFT: return Shr5Package.ABSTRAKT_PERSONA__WILLENSKRAFT;
                case Shr5Package.GEISTIGE_ATTRIBUTE__INTUITION: return Shr5Package.ABSTRAKT_PERSONA__INTUITION;
                case Shr5Package.GEISTIGE_ATTRIBUTE__LOGIK: return Shr5Package.ABSTRAKT_PERSONA__LOGIK;
                default: return -1;
            }
        }
        if (baseClass == ChrakterLimits.class) {
            switch (baseFeatureID) {
                case Shr5Package.CHRAKTER_LIMITS__KOERPERLICH: return Shr5Package.ABSTRAKT_PERSONA__KOERPERLICH;
                case Shr5Package.CHRAKTER_LIMITS__GEISTIG: return Shr5Package.ABSTRAKT_PERSONA__GEISTIG;
                case Shr5Package.CHRAKTER_LIMITS__SOZIAL: return Shr5Package.ABSTRAKT_PERSONA__SOZIAL;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
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
        result.append(", edgeBasis: ");
        result.append(edgeBasis);
        result.append(", konstitutionBasis: ");
        result.append(konstitutionBasis);
        result.append(", geschicklichkeitBasis: ");
        result.append(geschicklichkeitBasis);
        result.append(", reaktionBasis: ");
        result.append(reaktionBasis);
        result.append(", staerkeBasis: ");
        result.append(staerkeBasis);
        result.append(", charismaBasis: ");
        result.append(charismaBasis);
        result.append(", willenskraftBasis: ");
        result.append(willenskraftBasis);
        result.append(", intuitionBasis: ");
        result.append(intuitionBasis);
        result.append(", logikBasis: ");
        result.append(logikBasis);
        result.append(", modManager: ");
        result.append(modManager);
        result.append(')');
        return result.toString();
    }

} // AbstraktPersonaImpl
