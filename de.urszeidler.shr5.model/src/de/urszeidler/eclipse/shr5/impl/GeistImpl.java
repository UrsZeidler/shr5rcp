/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.AstraleProjektion;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.ChrakterLimits;
import de.urszeidler.eclipse.shr5.CritterKraft;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Geist;
import de.urszeidler.eclipse.shr5.GeistigeAttribute;
import de.urszeidler.eclipse.shr5.KoerperlicheAttribute;
import de.urszeidler.eclipse.shr5.ModifikatorAttribute;
import de.urszeidler.eclipse.shr5.Panzerung;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.SpezielleAttribute;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getPage <em>Page</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getSrcBook <em>Src Book</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getInitative <em>Initative</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getInitativWuerfel <em>Initativ Wuerfel</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getAusweichen <em>Ausweichen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getEssenz <em>Essenz</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getEdgeBasis <em>Edge Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getCharisma <em>Charisma</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getWillenskraft <em>Willenskraft</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getIntuition <em>Intuition</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getLogik <em>Logik</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getKonstitution <em>Konstitution</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getGeschicklichkeit <em>Geschicklichkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getReaktion <em>Reaktion</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getStaerke <em>Staerke</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getKoerperlich <em>Koerperlich</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getGeistig <em>Geistig</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getSozial <em>Sozial</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getPanzer <em>Panzer</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getStufe <em>Stufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getSkillGroups <em>Skill Groups</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getAstralesLimit <em>Astrales Limit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getAstraleKonstitution <em>Astrale Konstitution</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getAstraleGeschicklichkeit <em>Astrale Geschicklichkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getAstraleReaktion <em>Astrale Reaktion</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getAstraleStaerke <em>Astrale Staerke</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getAstraleInitative <em>Astrale Initative</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getAstraleInitativWuerfel <em>Astrale Initativ Wuerfel</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getAstralePanzerung <em>Astrale Panzerung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getKonstitutionBasis <em>Konstitution Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getGeschicklichkeitBasis <em>Geschicklichkeit Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getReaktionBasis <em>Reaktion Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getStaerkeBasis <em>Staerke Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getCharismaBasis <em>Charisma Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getWillenskraftBasis <em>Willenskraft Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getIntuitionBasis <em>Intuition Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getLogikBasis <em>Logik Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.GeistImpl#getPowers <em>Powers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeistImpl extends MinimalEObjectImpl.Container implements Geist {
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
     * The default value of the '{@link #getInitative() <em>Initative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitative()
     * @generated
     * @ordered
     */
    protected static final int INITATIVE_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getInitativWuerfel() <em>Initativ Wuerfel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitativWuerfel()
     * @generated
     * @ordered
     */
    protected static final int INITATIV_WUERFEL_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getAusweichen() <em>Ausweichen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAusweichen()
     * @generated
     * @ordered
     */
    protected static final int AUSWEICHEN_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getEssenz() <em>Essenz</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEssenz()
     * @generated
     * @ordered
     */
    protected static final int ESSENZ_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getEdgeBasis() <em>Edge Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEdgeBasis()
     * @generated
     * @ordered
     */
    protected static final int EDGE_BASIS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getEdgeBasis() <em>Edge Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEdgeBasis()
     * @generated
     * @ordered
     */
    protected int edgeBasis = EDGE_BASIS_EDEFAULT;

    /**
     * The default value of the '{@link #getEdge() <em>Edge</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEdge()
     * @generated
     * @ordered
     */
    protected static final int EDGE_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getCharisma() <em>Charisma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharisma()
     * @generated
     * @ordered
     */
    protected static final int CHARISMA_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getWillenskraft() <em>Willenskraft</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWillenskraft()
     * @generated
     * @ordered
     */
    protected static final int WILLENSKRAFT_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getIntuition() <em>Intuition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntuition()
     * @generated
     * @ordered
     */
    protected static final int INTUITION_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getLogik() <em>Logik</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogik()
     * @generated
     * @ordered
     */
    protected static final int LOGIK_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getKonstitution() <em>Konstitution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKonstitution()
     * @generated
     * @ordered
     */
    protected static final int KONSTITUTION_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getGeschicklichkeit() <em>Geschicklichkeit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeschicklichkeit()
     * @generated
     * @ordered
     */
    protected static final int GESCHICKLICHKEIT_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getReaktion() <em>Reaktion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReaktion()
     * @generated
     * @ordered
     */
    protected static final int REAKTION_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getStaerke() <em>Staerke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStaerke()
     * @generated
     * @ordered
     */
    protected static final int STAERKE_EDEFAULT = 0;

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
     * The default value of the '{@link #getKoerperlich() <em>Koerperlich</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKoerperlich()
     * @generated
     * @ordered
     */
    protected static final int KOERPERLICH_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getGeistig() <em>Geistig</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeistig()
     * @generated
     * @ordered
     */
    protected static final int GEISTIG_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getSozial() <em>Sozial</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSozial()
     * @generated
     * @ordered
     */
    protected static final int SOZIAL_EDEFAULT = 0;

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
     * The cached value of the '{@link #getSkillGroups() <em>Skill Groups</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSkillGroups()
     * @generated
     * @ordered
     */
    protected EList<FertigkeitsGruppe> skillGroups;

    /**
     * The cached value of the '{@link #getSkills() <em>Skills</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSkills()
     * @generated
     * @ordered
     */
    protected EList<Fertigkeit> skills;

    /**
     * The default value of the '{@link #getAstralesLimit() <em>Astrales Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAstralesLimit()
     * @generated
     * @ordered
     */
    protected static final int ASTRALES_LIMIT_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getAstraleKonstitution() <em>Astrale Konstitution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAstraleKonstitution()
     * @generated
     * @ordered
     */
    protected static final int ASTRALE_KONSTITUTION_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getAstraleGeschicklichkeit() <em>Astrale Geschicklichkeit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAstraleGeschicklichkeit()
     * @generated
     * @ordered
     */
    protected static final int ASTRALE_GESCHICKLICHKEIT_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getAstraleReaktion() <em>Astrale Reaktion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAstraleReaktion()
     * @generated
     * @ordered
     */
    protected static final int ASTRALE_REAKTION_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getAstraleStaerke() <em>Astrale Staerke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAstraleStaerke()
     * @generated
     * @ordered
     */
    protected static final int ASTRALE_STAERKE_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getAstraleInitative() <em>Astrale Initative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAstraleInitative()
     * @generated
     * @ordered
     */
    protected static final int ASTRALE_INITATIVE_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getAstraleInitativWuerfel() <em>Astrale Initativ Wuerfel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAstraleInitativWuerfel()
     * @generated
     * @ordered
     */
    protected static final int ASTRALE_INITATIV_WUERFEL_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getAstralePanzerung() <em>Astrale Panzerung</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAstralePanzerung()
     * @generated
     * @ordered
     */
    protected static final int ASTRALE_PANZERUNG_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getKonstitutionBasis() <em>Konstitution Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKonstitutionBasis()
     * @generated
     * @ordered
     */
    protected static final int KONSTITUTION_BASIS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getKonstitutionBasis() <em>Konstitution Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKonstitutionBasis()
     * @generated
     * @ordered
     */
    protected int konstitutionBasis = KONSTITUTION_BASIS_EDEFAULT;

    /**
     * The default value of the '{@link #getGeschicklichkeitBasis() <em>Geschicklichkeit Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeschicklichkeitBasis()
     * @generated
     * @ordered
     */
    protected static final int GESCHICKLICHKEIT_BASIS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getGeschicklichkeitBasis() <em>Geschicklichkeit Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeschicklichkeitBasis()
     * @generated
     * @ordered
     */
    protected int geschicklichkeitBasis = GESCHICKLICHKEIT_BASIS_EDEFAULT;

    /**
     * The default value of the '{@link #getReaktionBasis() <em>Reaktion Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReaktionBasis()
     * @generated
     * @ordered
     */
    protected static final int REAKTION_BASIS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getReaktionBasis() <em>Reaktion Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReaktionBasis()
     * @generated
     * @ordered
     */
    protected int reaktionBasis = REAKTION_BASIS_EDEFAULT;

    /**
     * The default value of the '{@link #getStaerkeBasis() <em>Staerke Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStaerkeBasis()
     * @generated
     * @ordered
     */
    protected static final int STAERKE_BASIS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getStaerkeBasis() <em>Staerke Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStaerkeBasis()
     * @generated
     * @ordered
     */
    protected int staerkeBasis = STAERKE_BASIS_EDEFAULT;

    /**
     * The default value of the '{@link #getCharismaBasis() <em>Charisma Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharismaBasis()
     * @generated
     * @ordered
     */
    protected static final int CHARISMA_BASIS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getCharismaBasis() <em>Charisma Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharismaBasis()
     * @generated
     * @ordered
     */
    protected int charismaBasis = CHARISMA_BASIS_EDEFAULT;

    /**
     * The default value of the '{@link #getWillenskraftBasis() <em>Willenskraft Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWillenskraftBasis()
     * @generated
     * @ordered
     */
    protected static final int WILLENSKRAFT_BASIS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getWillenskraftBasis() <em>Willenskraft Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWillenskraftBasis()
     * @generated
     * @ordered
     */
    protected int willenskraftBasis = WILLENSKRAFT_BASIS_EDEFAULT;

    /**
     * The default value of the '{@link #getIntuitionBasis() <em>Intuition Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntuitionBasis()
     * @generated
     * @ordered
     */
    protected static final int INTUITION_BASIS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getIntuitionBasis() <em>Intuition Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntuitionBasis()
     * @generated
     * @ordered
     */
    protected int intuitionBasis = INTUITION_BASIS_EDEFAULT;

    /**
     * The default value of the '{@link #getLogikBasis() <em>Logik Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogikBasis()
     * @generated
     * @ordered
     */
    protected static final int LOGIK_BASIS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLogikBasis() <em>Logik Basis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogikBasis()
     * @generated
     * @ordered
     */
    protected int logikBasis = LOGIK_BASIS_EDEFAULT;

    /**
     * The cached value of the '{@link #getPowers() <em>Powers</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowers()
     * @generated
     * @ordered
     */
    protected EList<CritterKraft> powers;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GeistImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.GEIST;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEIST__PARENT_ID, oldParentId, parentId));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEIST__PAGE, oldPage, page));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.GEIST__SRC_BOOK, oldSrcBook, srcBook));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEIST__SRC_BOOK, oldSrcBook, srcBook));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getAstralesLimit() {
        return Math.max(getSozial(), getGeistig());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getAstraleKonstitution() {
        return getWillenskraft();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getAstraleGeschicklichkeit() {
        return getLogik();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getAstraleReaktion() {
        return getIntuition();

    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getAstraleStaerke() {
        return getCharisma();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getAstraleInitative() {
        int value = getStufe() * 2;
        value = value + ShadowrunTools.getModificatorenValue(Shr5Package.Literals.ASTRALE_PROJEKTION__ASTRALE_INITATIVE, getPowers());

        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getAstraleInitativWuerfel() {
        return 3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getAstralePanzerung() {
        int value = 0;
        value = value + ShadowrunTools.getModificatorenValue(Shr5Package.Literals.ASTRALE_PROJEKTION__ASTRALE_PANZERUNG, getPowers());
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getKonstitutionBasis() {
        return konstitutionBasis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKonstitutionBasis(int newKonstitutionBasis) {
        int oldKonstitutionBasis = konstitutionBasis;
        konstitutionBasis = newKonstitutionBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEIST__KONSTITUTION_BASIS, oldKonstitutionBasis, konstitutionBasis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getGeschicklichkeitBasis() {
        return geschicklichkeitBasis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGeschicklichkeitBasis(int newGeschicklichkeitBasis) {
        int oldGeschicklichkeitBasis = geschicklichkeitBasis;
        geschicklichkeitBasis = newGeschicklichkeitBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEIST__GESCHICKLICHKEIT_BASIS, oldGeschicklichkeitBasis, geschicklichkeitBasis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getReaktionBasis() {
        return reaktionBasis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReaktionBasis(int newReaktionBasis) {
        int oldReaktionBasis = reaktionBasis;
        reaktionBasis = newReaktionBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEIST__REAKTION_BASIS, oldReaktionBasis, reaktionBasis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getStaerkeBasis() {
        return staerkeBasis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStaerkeBasis(int newStaerkeBasis) {
        int oldStaerkeBasis = staerkeBasis;
        staerkeBasis = newStaerkeBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEIST__STAERKE_BASIS, oldStaerkeBasis, staerkeBasis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getCharismaBasis() {
        return charismaBasis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCharismaBasis(int newCharismaBasis) {
        int oldCharismaBasis = charismaBasis;
        charismaBasis = newCharismaBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEIST__CHARISMA_BASIS, oldCharismaBasis, charismaBasis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getWillenskraftBasis() {
        return willenskraftBasis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWillenskraftBasis(int newWillenskraftBasis) {
        int oldWillenskraftBasis = willenskraftBasis;
        willenskraftBasis = newWillenskraftBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEIST__WILLENSKRAFT_BASIS, oldWillenskraftBasis, willenskraftBasis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getIntuitionBasis() {
        return intuitionBasis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIntuitionBasis(int newIntuitionBasis) {
        int oldIntuitionBasis = intuitionBasis;
        intuitionBasis = newIntuitionBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEIST__INTUITION_BASIS, oldIntuitionBasis, intuitionBasis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLogikBasis() {
        return logikBasis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLogikBasis(int newLogikBasis) {
        int oldLogikBasis = logikBasis;
        logikBasis = newLogikBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEIST__LOGIK_BASIS, oldLogikBasis, logikBasis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<CritterKraft> getPowers() {
        if (powers == null) {
            powers = new EObjectContainmentEList<CritterKraft>(CritterKraft.class, this, Shr5Package.GEIST__POWERS);
        }
        return powers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.GEIST__POWERS:
                return ((InternalEList<?>)getPowers()).basicRemove(otherEnd, msgs);
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
            case Shr5Package.GEIST__PARENT_ID:
                return getParentId();
            case Shr5Package.GEIST__PAGE:
                return getPage();
            case Shr5Package.GEIST__SRC_BOOK:
                if (resolve) return getSrcBook();
                return basicGetSrcBook();
            case Shr5Package.GEIST__INITATIVE:
                return getInitative();
            case Shr5Package.GEIST__INITATIV_WUERFEL:
                return getInitativWuerfel();
            case Shr5Package.GEIST__AUSWEICHEN:
                return getAusweichen();
            case Shr5Package.GEIST__ESSENZ:
                return getEssenz();
            case Shr5Package.GEIST__EDGE_BASIS:
                return getEdgeBasis();
            case Shr5Package.GEIST__EDGE:
                return getEdge();
            case Shr5Package.GEIST__CHARISMA:
                return getCharisma();
            case Shr5Package.GEIST__WILLENSKRAFT:
                return getWillenskraft();
            case Shr5Package.GEIST__INTUITION:
                return getIntuition();
            case Shr5Package.GEIST__LOGIK:
                return getLogik();
            case Shr5Package.GEIST__KONSTITUTION:
                return getKonstitution();
            case Shr5Package.GEIST__GESCHICKLICHKEIT:
                return getGeschicklichkeit();
            case Shr5Package.GEIST__REAKTION:
                return getReaktion();
            case Shr5Package.GEIST__STAERKE:
                return getStaerke();
            case Shr5Package.GEIST__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5Package.GEIST__IMAGE:
                return getImage();
            case Shr5Package.GEIST__NAME:
                return getName();
            case Shr5Package.GEIST__KOERPERLICH:
                return getKoerperlich();
            case Shr5Package.GEIST__GEISTIG:
                return getGeistig();
            case Shr5Package.GEIST__SOZIAL:
                return getSozial();
            case Shr5Package.GEIST__PANZER:
                return getPanzer();
            case Shr5Package.GEIST__STUFE:
                return getStufe();
            case Shr5Package.GEIST__SKILL_GROUPS:
                return getSkillGroups();
            case Shr5Package.GEIST__SKILLS:
                return getSkills();
            case Shr5Package.GEIST__ASTRALES_LIMIT:
                return getAstralesLimit();
            case Shr5Package.GEIST__ASTRALE_KONSTITUTION:
                return getAstraleKonstitution();
            case Shr5Package.GEIST__ASTRALE_GESCHICKLICHKEIT:
                return getAstraleGeschicklichkeit();
            case Shr5Package.GEIST__ASTRALE_REAKTION:
                return getAstraleReaktion();
            case Shr5Package.GEIST__ASTRALE_STAERKE:
                return getAstraleStaerke();
            case Shr5Package.GEIST__ASTRALE_INITATIVE:
                return getAstraleInitative();
            case Shr5Package.GEIST__ASTRALE_INITATIV_WUERFEL:
                return getAstraleInitativWuerfel();
            case Shr5Package.GEIST__ASTRALE_PANZERUNG:
                return getAstralePanzerung();
            case Shr5Package.GEIST__KONSTITUTION_BASIS:
                return getKonstitutionBasis();
            case Shr5Package.GEIST__GESCHICKLICHKEIT_BASIS:
                return getGeschicklichkeitBasis();
            case Shr5Package.GEIST__REAKTION_BASIS:
                return getReaktionBasis();
            case Shr5Package.GEIST__STAERKE_BASIS:
                return getStaerkeBasis();
            case Shr5Package.GEIST__CHARISMA_BASIS:
                return getCharismaBasis();
            case Shr5Package.GEIST__WILLENSKRAFT_BASIS:
                return getWillenskraftBasis();
            case Shr5Package.GEIST__INTUITION_BASIS:
                return getIntuitionBasis();
            case Shr5Package.GEIST__LOGIK_BASIS:
                return getLogikBasis();
            case Shr5Package.GEIST__POWERS:
                return getPowers();
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
            case Shr5Package.GEIST__PARENT_ID:
                setParentId((String)newValue);
                return;
            case Shr5Package.GEIST__PAGE:
                setPage((String)newValue);
                return;
            case Shr5Package.GEIST__SRC_BOOK:
                setSrcBook((SourceBook)newValue);
                return;
            case Shr5Package.GEIST__EDGE_BASIS:
                setEdgeBasis((Integer)newValue);
                return;
            case Shr5Package.GEIST__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5Package.GEIST__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5Package.GEIST__NAME:
                setName((String)newValue);
                return;
            case Shr5Package.GEIST__STUFE:
                setStufe((Integer)newValue);
                return;
            case Shr5Package.GEIST__SKILL_GROUPS:
                getSkillGroups().clear();
                getSkillGroups().addAll((Collection<? extends FertigkeitsGruppe>)newValue);
                return;
            case Shr5Package.GEIST__SKILLS:
                getSkills().clear();
                getSkills().addAll((Collection<? extends Fertigkeit>)newValue);
                return;
            case Shr5Package.GEIST__KONSTITUTION_BASIS:
                setKonstitutionBasis((Integer)newValue);
                return;
            case Shr5Package.GEIST__GESCHICKLICHKEIT_BASIS:
                setGeschicklichkeitBasis((Integer)newValue);
                return;
            case Shr5Package.GEIST__REAKTION_BASIS:
                setReaktionBasis((Integer)newValue);
                return;
            case Shr5Package.GEIST__STAERKE_BASIS:
                setStaerkeBasis((Integer)newValue);
                return;
            case Shr5Package.GEIST__CHARISMA_BASIS:
                setCharismaBasis((Integer)newValue);
                return;
            case Shr5Package.GEIST__WILLENSKRAFT_BASIS:
                setWillenskraftBasis((Integer)newValue);
                return;
            case Shr5Package.GEIST__INTUITION_BASIS:
                setIntuitionBasis((Integer)newValue);
                return;
            case Shr5Package.GEIST__LOGIK_BASIS:
                setLogikBasis((Integer)newValue);
                return;
            case Shr5Package.GEIST__POWERS:
                getPowers().clear();
                getPowers().addAll((Collection<? extends CritterKraft>)newValue);
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
            case Shr5Package.GEIST__PARENT_ID:
                setParentId(PARENT_ID_EDEFAULT);
                return;
            case Shr5Package.GEIST__PAGE:
                setPage(PAGE_EDEFAULT);
                return;
            case Shr5Package.GEIST__SRC_BOOK:
                setSrcBook((SourceBook)null);
                return;
            case Shr5Package.GEIST__EDGE_BASIS:
                setEdgeBasis(EDGE_BASIS_EDEFAULT);
                return;
            case Shr5Package.GEIST__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5Package.GEIST__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5Package.GEIST__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5Package.GEIST__STUFE:
                setStufe(STUFE_EDEFAULT);
                return;
            case Shr5Package.GEIST__SKILL_GROUPS:
                getSkillGroups().clear();
                return;
            case Shr5Package.GEIST__SKILLS:
                getSkills().clear();
                return;
            case Shr5Package.GEIST__KONSTITUTION_BASIS:
                setKonstitutionBasis(KONSTITUTION_BASIS_EDEFAULT);
                return;
            case Shr5Package.GEIST__GESCHICKLICHKEIT_BASIS:
                setGeschicklichkeitBasis(GESCHICKLICHKEIT_BASIS_EDEFAULT);
                return;
            case Shr5Package.GEIST__REAKTION_BASIS:
                setReaktionBasis(REAKTION_BASIS_EDEFAULT);
                return;
            case Shr5Package.GEIST__STAERKE_BASIS:
                setStaerkeBasis(STAERKE_BASIS_EDEFAULT);
                return;
            case Shr5Package.GEIST__CHARISMA_BASIS:
                setCharismaBasis(CHARISMA_BASIS_EDEFAULT);
                return;
            case Shr5Package.GEIST__WILLENSKRAFT_BASIS:
                setWillenskraftBasis(WILLENSKRAFT_BASIS_EDEFAULT);
                return;
            case Shr5Package.GEIST__INTUITION_BASIS:
                setIntuitionBasis(INTUITION_BASIS_EDEFAULT);
                return;
            case Shr5Package.GEIST__LOGIK_BASIS:
                setLogikBasis(LOGIK_BASIS_EDEFAULT);
                return;
            case Shr5Package.GEIST__POWERS:
                getPowers().clear();
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
            case Shr5Package.GEIST__PARENT_ID:
                return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
            case Shr5Package.GEIST__PAGE:
                return PAGE_EDEFAULT == null ? page != null : !PAGE_EDEFAULT.equals(page);
            case Shr5Package.GEIST__SRC_BOOK:
                return srcBook != null;
            case Shr5Package.GEIST__INITATIVE:
                return getInitative() != INITATIVE_EDEFAULT;
            case Shr5Package.GEIST__INITATIV_WUERFEL:
                return getInitativWuerfel() != INITATIV_WUERFEL_EDEFAULT;
            case Shr5Package.GEIST__AUSWEICHEN:
                return getAusweichen() != AUSWEICHEN_EDEFAULT;
            case Shr5Package.GEIST__ESSENZ:
                return getEssenz() != ESSENZ_EDEFAULT;
            case Shr5Package.GEIST__EDGE_BASIS:
                return edgeBasis != EDGE_BASIS_EDEFAULT;
            case Shr5Package.GEIST__EDGE:
                return getEdge() != EDGE_EDEFAULT;
            case Shr5Package.GEIST__CHARISMA:
                return getCharisma() != CHARISMA_EDEFAULT;
            case Shr5Package.GEIST__WILLENSKRAFT:
                return getWillenskraft() != WILLENSKRAFT_EDEFAULT;
            case Shr5Package.GEIST__INTUITION:
                return getIntuition() != INTUITION_EDEFAULT;
            case Shr5Package.GEIST__LOGIK:
                return getLogik() != LOGIK_EDEFAULT;
            case Shr5Package.GEIST__KONSTITUTION:
                return getKonstitution() != KONSTITUTION_EDEFAULT;
            case Shr5Package.GEIST__GESCHICKLICHKEIT:
                return getGeschicklichkeit() != GESCHICKLICHKEIT_EDEFAULT;
            case Shr5Package.GEIST__REAKTION:
                return getReaktion() != REAKTION_EDEFAULT;
            case Shr5Package.GEIST__STAERKE:
                return getStaerke() != STAERKE_EDEFAULT;
            case Shr5Package.GEIST__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5Package.GEIST__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5Package.GEIST__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5Package.GEIST__KOERPERLICH:
                return getKoerperlich() != KOERPERLICH_EDEFAULT;
            case Shr5Package.GEIST__GEISTIG:
                return getGeistig() != GEISTIG_EDEFAULT;
            case Shr5Package.GEIST__SOZIAL:
                return getSozial() != SOZIAL_EDEFAULT;
            case Shr5Package.GEIST__PANZER:
                return getPanzer() != PANZER_EDEFAULT;
            case Shr5Package.GEIST__STUFE:
                return stufe != STUFE_EDEFAULT;
            case Shr5Package.GEIST__SKILL_GROUPS:
                return skillGroups != null && !skillGroups.isEmpty();
            case Shr5Package.GEIST__SKILLS:
                return skills != null && !skills.isEmpty();
            case Shr5Package.GEIST__ASTRALES_LIMIT:
                return getAstralesLimit() != ASTRALES_LIMIT_EDEFAULT;
            case Shr5Package.GEIST__ASTRALE_KONSTITUTION:
                return getAstraleKonstitution() != ASTRALE_KONSTITUTION_EDEFAULT;
            case Shr5Package.GEIST__ASTRALE_GESCHICKLICHKEIT:
                return getAstraleGeschicklichkeit() != ASTRALE_GESCHICKLICHKEIT_EDEFAULT;
            case Shr5Package.GEIST__ASTRALE_REAKTION:
                return getAstraleReaktion() != ASTRALE_REAKTION_EDEFAULT;
            case Shr5Package.GEIST__ASTRALE_STAERKE:
                return getAstraleStaerke() != ASTRALE_STAERKE_EDEFAULT;
            case Shr5Package.GEIST__ASTRALE_INITATIVE:
                return getAstraleInitative() != ASTRALE_INITATIVE_EDEFAULT;
            case Shr5Package.GEIST__ASTRALE_INITATIV_WUERFEL:
                return getAstraleInitativWuerfel() != ASTRALE_INITATIV_WUERFEL_EDEFAULT;
            case Shr5Package.GEIST__ASTRALE_PANZERUNG:
                return getAstralePanzerung() != ASTRALE_PANZERUNG_EDEFAULT;
            case Shr5Package.GEIST__KONSTITUTION_BASIS:
                return konstitutionBasis != KONSTITUTION_BASIS_EDEFAULT;
            case Shr5Package.GEIST__GESCHICKLICHKEIT_BASIS:
                return geschicklichkeitBasis != GESCHICKLICHKEIT_BASIS_EDEFAULT;
            case Shr5Package.GEIST__REAKTION_BASIS:
                return reaktionBasis != REAKTION_BASIS_EDEFAULT;
            case Shr5Package.GEIST__STAERKE_BASIS:
                return staerkeBasis != STAERKE_BASIS_EDEFAULT;
            case Shr5Package.GEIST__CHARISMA_BASIS:
                return charismaBasis != CHARISMA_BASIS_EDEFAULT;
            case Shr5Package.GEIST__WILLENSKRAFT_BASIS:
                return willenskraftBasis != WILLENSKRAFT_BASIS_EDEFAULT;
            case Shr5Package.GEIST__INTUITION_BASIS:
                return intuitionBasis != INTUITION_BASIS_EDEFAULT;
            case Shr5Package.GEIST__LOGIK_BASIS:
                return logikBasis != LOGIK_BASIS_EDEFAULT;
            case Shr5Package.GEIST__POWERS:
                return powers != null && !powers.isEmpty();
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
        if (baseClass == ModifikatorAttribute.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == SpezielleAttribute.class) {
            switch (derivedFeatureID) {
                case Shr5Package.GEIST__INITATIVE: return Shr5Package.SPEZIELLE_ATTRIBUTE__INITATIVE;
                case Shr5Package.GEIST__INITATIV_WUERFEL: return Shr5Package.SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL;
                case Shr5Package.GEIST__AUSWEICHEN: return Shr5Package.SPEZIELLE_ATTRIBUTE__AUSWEICHEN;
                case Shr5Package.GEIST__ESSENZ: return Shr5Package.SPEZIELLE_ATTRIBUTE__ESSENZ;
                case Shr5Package.GEIST__EDGE_BASIS: return Shr5Package.SPEZIELLE_ATTRIBUTE__EDGE_BASIS;
                case Shr5Package.GEIST__EDGE: return Shr5Package.SPEZIELLE_ATTRIBUTE__EDGE;
                default: return -1;
            }
        }
        if (baseClass == GeistigeAttribute.class) {
            switch (derivedFeatureID) {
                case Shr5Package.GEIST__CHARISMA: return Shr5Package.GEISTIGE_ATTRIBUTE__CHARISMA;
                case Shr5Package.GEIST__WILLENSKRAFT: return Shr5Package.GEISTIGE_ATTRIBUTE__WILLENSKRAFT;
                case Shr5Package.GEIST__INTUITION: return Shr5Package.GEISTIGE_ATTRIBUTE__INTUITION;
                case Shr5Package.GEIST__LOGIK: return Shr5Package.GEISTIGE_ATTRIBUTE__LOGIK;
                default: return -1;
            }
        }
        if (baseClass == KoerperlicheAttribute.class) {
            switch (derivedFeatureID) {
                case Shr5Package.GEIST__KONSTITUTION: return Shr5Package.KOERPERLICHE_ATTRIBUTE__KONSTITUTION;
                case Shr5Package.GEIST__GESCHICKLICHKEIT: return Shr5Package.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT;
                case Shr5Package.GEIST__REAKTION: return Shr5Package.KOERPERLICHE_ATTRIBUTE__REAKTION;
                case Shr5Package.GEIST__STAERKE: return Shr5Package.KOERPERLICHE_ATTRIBUTE__STAERKE;
                default: return -1;
            }
        }
        if (baseClass == Beschreibbar.class) {
            switch (derivedFeatureID) {
                case Shr5Package.GEIST__BESCHREIBUNG: return Shr5Package.BESCHREIBBAR__BESCHREIBUNG;
                case Shr5Package.GEIST__IMAGE: return Shr5Package.BESCHREIBBAR__IMAGE;
                case Shr5Package.GEIST__NAME: return Shr5Package.BESCHREIBBAR__NAME;
                default: return -1;
            }
        }
        if (baseClass == ChrakterLimits.class) {
            switch (derivedFeatureID) {
                case Shr5Package.GEIST__KOERPERLICH: return Shr5Package.CHRAKTER_LIMITS__KOERPERLICH;
                case Shr5Package.GEIST__GEISTIG: return Shr5Package.CHRAKTER_LIMITS__GEISTIG;
                case Shr5Package.GEIST__SOZIAL: return Shr5Package.CHRAKTER_LIMITS__SOZIAL;
                default: return -1;
            }
        }
        if (baseClass == Panzerung.class) {
            switch (derivedFeatureID) {
                case Shr5Package.GEIST__PANZER: return Shr5Package.PANZERUNG__PANZER;
                default: return -1;
            }
        }
        if (baseClass == AstraleProjektion.class) {
            switch (derivedFeatureID) {
                case Shr5Package.GEIST__ASTRALES_LIMIT: return Shr5Package.ASTRALE_PROJEKTION__ASTRALES_LIMIT;
                case Shr5Package.GEIST__ASTRALE_KONSTITUTION: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_KONSTITUTION;
                case Shr5Package.GEIST__ASTRALE_GESCHICKLICHKEIT: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_GESCHICKLICHKEIT;
                case Shr5Package.GEIST__ASTRALE_REAKTION: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_REAKTION;
                case Shr5Package.GEIST__ASTRALE_STAERKE: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_STAERKE;
                case Shr5Package.GEIST__ASTRALE_INITATIVE: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_INITATIVE;
                case Shr5Package.GEIST__ASTRALE_INITATIV_WUERFEL: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_INITATIV_WUERFEL;
                case Shr5Package.GEIST__ASTRALE_PANZERUNG: return Shr5Package.ASTRALE_PROJEKTION__ASTRALE_PANZERUNG;
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
        if (baseClass == ModifikatorAttribute.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == SpezielleAttribute.class) {
            switch (baseFeatureID) {
                case Shr5Package.SPEZIELLE_ATTRIBUTE__INITATIVE: return Shr5Package.GEIST__INITATIVE;
                case Shr5Package.SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL: return Shr5Package.GEIST__INITATIV_WUERFEL;
                case Shr5Package.SPEZIELLE_ATTRIBUTE__AUSWEICHEN: return Shr5Package.GEIST__AUSWEICHEN;
                case Shr5Package.SPEZIELLE_ATTRIBUTE__ESSENZ: return Shr5Package.GEIST__ESSENZ;
                case Shr5Package.SPEZIELLE_ATTRIBUTE__EDGE_BASIS: return Shr5Package.GEIST__EDGE_BASIS;
                case Shr5Package.SPEZIELLE_ATTRIBUTE__EDGE: return Shr5Package.GEIST__EDGE;
                default: return -1;
            }
        }
        if (baseClass == GeistigeAttribute.class) {
            switch (baseFeatureID) {
                case Shr5Package.GEISTIGE_ATTRIBUTE__CHARISMA: return Shr5Package.GEIST__CHARISMA;
                case Shr5Package.GEISTIGE_ATTRIBUTE__WILLENSKRAFT: return Shr5Package.GEIST__WILLENSKRAFT;
                case Shr5Package.GEISTIGE_ATTRIBUTE__INTUITION: return Shr5Package.GEIST__INTUITION;
                case Shr5Package.GEISTIGE_ATTRIBUTE__LOGIK: return Shr5Package.GEIST__LOGIK;
                default: return -1;
            }
        }
        if (baseClass == KoerperlicheAttribute.class) {
            switch (baseFeatureID) {
                case Shr5Package.KOERPERLICHE_ATTRIBUTE__KONSTITUTION: return Shr5Package.GEIST__KONSTITUTION;
                case Shr5Package.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT: return Shr5Package.GEIST__GESCHICKLICHKEIT;
                case Shr5Package.KOERPERLICHE_ATTRIBUTE__REAKTION: return Shr5Package.GEIST__REAKTION;
                case Shr5Package.KOERPERLICHE_ATTRIBUTE__STAERKE: return Shr5Package.GEIST__STAERKE;
                default: return -1;
            }
        }
        if (baseClass == Beschreibbar.class) {
            switch (baseFeatureID) {
                case Shr5Package.BESCHREIBBAR__BESCHREIBUNG: return Shr5Package.GEIST__BESCHREIBUNG;
                case Shr5Package.BESCHREIBBAR__IMAGE: return Shr5Package.GEIST__IMAGE;
                case Shr5Package.BESCHREIBBAR__NAME: return Shr5Package.GEIST__NAME;
                default: return -1;
            }
        }
        if (baseClass == ChrakterLimits.class) {
            switch (baseFeatureID) {
                case Shr5Package.CHRAKTER_LIMITS__KOERPERLICH: return Shr5Package.GEIST__KOERPERLICH;
                case Shr5Package.CHRAKTER_LIMITS__GEISTIG: return Shr5Package.GEIST__GEISTIG;
                case Shr5Package.CHRAKTER_LIMITS__SOZIAL: return Shr5Package.GEIST__SOZIAL;
                default: return -1;
            }
        }
        if (baseClass == Panzerung.class) {
            switch (baseFeatureID) {
                case Shr5Package.PANZERUNG__PANZER: return Shr5Package.GEIST__PANZER;
                default: return -1;
            }
        }
        if (baseClass == AstraleProjektion.class) {
            switch (baseFeatureID) {
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALES_LIMIT: return Shr5Package.GEIST__ASTRALES_LIMIT;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_KONSTITUTION: return Shr5Package.GEIST__ASTRALE_KONSTITUTION;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_GESCHICKLICHKEIT: return Shr5Package.GEIST__ASTRALE_GESCHICKLICHKEIT;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_REAKTION: return Shr5Package.GEIST__ASTRALE_REAKTION;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_STAERKE: return Shr5Package.GEIST__ASTRALE_STAERKE;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_INITATIVE: return Shr5Package.GEIST__ASTRALE_INITATIVE;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_INITATIV_WUERFEL: return Shr5Package.GEIST__ASTRALE_INITATIV_WUERFEL;
                case Shr5Package.ASTRALE_PROJEKTION__ASTRALE_PANZERUNG: return Shr5Package.GEIST__ASTRALE_PANZERUNG;
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
        result.append(" (parentId: ");
        result.append(parentId);
        result.append(", page: ");
        result.append(page);
        result.append(", edgeBasis: ");
        result.append(edgeBasis);
        result.append(", beschreibung: ");
        result.append(beschreibung);
        result.append(", image: ");
        result.append(image);
        result.append(", name: ");
        result.append(name);
        result.append(", stufe: ");
        result.append(stufe);
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
        result.append(')');
        return result.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getCharisma() {
        int value = getStufe();
        value = value + getCharismaBasis();
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getWillenskraft() {
        int value = getStufe();
        value = value + getWillenskraftBasis();
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getIntuition() {
        int value = getStufe();
        value = value + getIntuitionBasis();
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getLogik() {
        int value = getStufe();
        value = value + getLogikBasis();
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getKonstitution() {
        int value = getStufe();
        value = value + getKonstitutionBasis();
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getGeschicklichkeit() {
        int value = getStufe();
        value = value + getGeschicklichkeitBasis();
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getReaktion() {
        int value = getStufe();
        value = value + getReaktionBasis();
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getStaerke() {
        int value = getStufe();
        value = value + getStaerkeBasis();
        return value;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEIST__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEIST__IMAGE, oldImage, image));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEIST__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getKoerperlich() {
        double baselimit1 = ((getStaerke() * 2) + getKonstitution() + getReaktion()) / 3.0;
        int baselimit = (int)Math.ceil(baselimit1);
        return baselimit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getGeistig() {
        double baselimit1 = ((getLogik() * 2) + getIntuition() + getWillenskraft()) / 3.0;
        int baselimit = (int)Math.ceil(baselimit1);
        return baselimit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getSozial() {
        double baselimit1 = ((getCharisma() * 2) + getWillenskraft() + (getEssenz() / 100)) / 3.0;
        int baselimit = (int)Math.ceil(baselimit1);
        return baselimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getInitative() {
        int value = getStufe() * 2;
        value = value + ShadowrunTools.getModificatorenValue(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__INITATIVE, getPowers());

        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getEdge() {
        int stufe2 = getStufe();

        int baselimit = (int)Math.ceil(stufe2 / 2);
        return baselimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getInitativWuerfel() {
        return 2;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getAusweichen() {
        int value = getReaktion() + getIntuition();
            value = value + ShadowrunTools.getModificatorenValue(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN,getPowers());

        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getEssenz() {
        int stufe2 = getStufe();
        return stufe2 * 100;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getEdgeBasis() {
        return edgeBasis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEdgeBasis(int newEdgeBasis) {
        int oldEdgeBasis = edgeBasis;
        edgeBasis = newEdgeBasis;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEIST__EDGE_BASIS, oldEdgeBasis, edgeBasis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getPanzer() {
        int value = 0;
            value = value + ShadowrunTools.getModificatorenValue(Shr5Package.Literals.PANZERUNG__PANZER, getPowers());
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getStufe() {
        return stufe;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStufe(int newStufe) {
        int oldStufe = stufe;
        stufe = newStufe;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.GEIST__STUFE, oldStufe, stufe));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FertigkeitsGruppe> getSkillGroups() {
        if (skillGroups == null) {
            skillGroups = new EObjectResolvingEList<FertigkeitsGruppe>(FertigkeitsGruppe.class, this, Shr5Package.GEIST__SKILL_GROUPS);
        }
        return skillGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Fertigkeit> getSkills() {
        if (skills == null) {
            skills = new EObjectResolvingEList<Fertigkeit>(Fertigkeit.class, this, Shr5Package.GEIST__SKILLS);
        }
        return skills;
    }

} // GeistImpl
