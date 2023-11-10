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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.Localization;
import de.urszeidler.eclipse.shr5.Modifizierbar;
import de.urszeidler.eclipse.shr5.Nahkampfwaffe;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.Spezies;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spezies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getMods <em>Mods</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getLocalizations <em>Localizations</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getPage <em>Page</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getSrcBook <em>Src Book</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getKonstitutionMin <em>Konstitution Min</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getGeschicklichkeitMin <em>Geschicklichkeit Min</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getReaktionMin <em>Reaktion Min</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getStaerkeMin <em>Staerke Min</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getCharismaMin <em>Charisma Min</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getWillenskraftMin <em>Willenskraft Min</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getIntuitionMin <em>Intuition Min</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getLogikMin <em>Logik Min</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getEdgeMin <em>Edge Min</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getMagieMin <em>Magie Min</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getResonanzMin <em>Resonanz Min</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getEssenzMin <em>Essenz Min</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getKonstitutionMax <em>Konstitution Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getGeschicklichkeitMax <em>Geschicklichkeit Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getReaktionMax <em>Reaktion Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getStaerkeMax <em>Staerke Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getCharismaMax <em>Charisma Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getWillenskraftMax <em>Willenskraft Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getIntuitionMax <em>Intuition Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getLogikMax <em>Logik Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getEdgeMax <em>Edge Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getMagieMax <em>Magie Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getResonanzMax <em>Resonanz Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getEssenzMax <em>Essenz Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getLaufen <em>Laufen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getRennen <em>Rennen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getSprinten <em>Sprinten</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.SpeziesImpl#getAngriff <em>Angriff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpeziesImpl extends MinimalEObjectImpl.Container implements Spezies {
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
     * The default value of the '{@link #getKonstitutionMin() <em>Konstitution Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKonstitutionMin()
     * @generated
     * @ordered
     */
	protected static final int KONSTITUTION_MIN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getKonstitutionMin() <em>Konstitution Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKonstitutionMin()
     * @generated
     * @ordered
     */
	protected int konstitutionMin = KONSTITUTION_MIN_EDEFAULT;

	/**
     * The default value of the '{@link #getGeschicklichkeitMin() <em>Geschicklichkeit Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGeschicklichkeitMin()
     * @generated
     * @ordered
     */
	protected static final int GESCHICKLICHKEIT_MIN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getGeschicklichkeitMin() <em>Geschicklichkeit Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGeschicklichkeitMin()
     * @generated
     * @ordered
     */
	protected int geschicklichkeitMin = GESCHICKLICHKEIT_MIN_EDEFAULT;

	/**
     * The default value of the '{@link #getReaktionMin() <em>Reaktion Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReaktionMin()
     * @generated
     * @ordered
     */
	protected static final int REAKTION_MIN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getReaktionMin() <em>Reaktion Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReaktionMin()
     * @generated
     * @ordered
     */
	protected int reaktionMin = REAKTION_MIN_EDEFAULT;

	/**
     * The default value of the '{@link #getStaerkeMin() <em>Staerke Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStaerkeMin()
     * @generated
     * @ordered
     */
	protected static final int STAERKE_MIN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getStaerkeMin() <em>Staerke Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStaerkeMin()
     * @generated
     * @ordered
     */
	protected int staerkeMin = STAERKE_MIN_EDEFAULT;

	/**
     * The default value of the '{@link #getCharismaMin() <em>Charisma Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharismaMin()
     * @generated
     * @ordered
     */
	protected static final int CHARISMA_MIN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getCharismaMin() <em>Charisma Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharismaMin()
     * @generated
     * @ordered
     */
	protected int charismaMin = CHARISMA_MIN_EDEFAULT;

	/**
     * The default value of the '{@link #getWillenskraftMin() <em>Willenskraft Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWillenskraftMin()
     * @generated
     * @ordered
     */
	protected static final int WILLENSKRAFT_MIN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getWillenskraftMin() <em>Willenskraft Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWillenskraftMin()
     * @generated
     * @ordered
     */
	protected int willenskraftMin = WILLENSKRAFT_MIN_EDEFAULT;

	/**
     * The default value of the '{@link #getIntuitionMin() <em>Intuition Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIntuitionMin()
     * @generated
     * @ordered
     */
	protected static final int INTUITION_MIN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getIntuitionMin() <em>Intuition Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIntuitionMin()
     * @generated
     * @ordered
     */
	protected int intuitionMin = INTUITION_MIN_EDEFAULT;

	/**
     * The default value of the '{@link #getLogikMin() <em>Logik Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLogikMin()
     * @generated
     * @ordered
     */
	protected static final int LOGIK_MIN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getLogikMin() <em>Logik Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLogikMin()
     * @generated
     * @ordered
     */
	protected int logikMin = LOGIK_MIN_EDEFAULT;

	/**
     * The default value of the '{@link #getEdgeMin() <em>Edge Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEdgeMin()
     * @generated
     * @ordered
     */
	protected static final int EDGE_MIN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getEdgeMin() <em>Edge Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEdgeMin()
     * @generated
     * @ordered
     */
	protected int edgeMin = EDGE_MIN_EDEFAULT;

	/**
     * The default value of the '{@link #getMagieMin() <em>Magie Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMagieMin()
     * @generated
     * @ordered
     */
	protected static final int MAGIE_MIN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getMagieMin() <em>Magie Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMagieMin()
     * @generated
     * @ordered
     */
	protected int magieMin = MAGIE_MIN_EDEFAULT;

	/**
     * The default value of the '{@link #getResonanzMin() <em>Resonanz Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResonanzMin()
     * @generated
     * @ordered
     */
	protected static final int RESONANZ_MIN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getResonanzMin() <em>Resonanz Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResonanzMin()
     * @generated
     * @ordered
     */
	protected int resonanzMin = RESONANZ_MIN_EDEFAULT;

	/**
     * The default value of the '{@link #getEssenzMin() <em>Essenz Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEssenzMin()
     * @generated
     * @ordered
     */
	protected static final int ESSENZ_MIN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getEssenzMin() <em>Essenz Min</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEssenzMin()
     * @generated
     * @ordered
     */
	protected int essenzMin = ESSENZ_MIN_EDEFAULT;

	/**
     * The default value of the '{@link #getKonstitutionMax() <em>Konstitution Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKonstitutionMax()
     * @generated
     * @ordered
     */
	protected static final int KONSTITUTION_MAX_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getKonstitutionMax() <em>Konstitution Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKonstitutionMax()
     * @generated
     * @ordered
     */
	protected int konstitutionMax = KONSTITUTION_MAX_EDEFAULT;

	/**
     * The default value of the '{@link #getGeschicklichkeitMax() <em>Geschicklichkeit Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGeschicklichkeitMax()
     * @generated
     * @ordered
     */
	protected static final int GESCHICKLICHKEIT_MAX_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getGeschicklichkeitMax() <em>Geschicklichkeit Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGeschicklichkeitMax()
     * @generated
     * @ordered
     */
	protected int geschicklichkeitMax = GESCHICKLICHKEIT_MAX_EDEFAULT;

	/**
     * The default value of the '{@link #getReaktionMax() <em>Reaktion Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReaktionMax()
     * @generated
     * @ordered
     */
	protected static final int REAKTION_MAX_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getReaktionMax() <em>Reaktion Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReaktionMax()
     * @generated
     * @ordered
     */
	protected int reaktionMax = REAKTION_MAX_EDEFAULT;

	/**
     * The default value of the '{@link #getStaerkeMax() <em>Staerke Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStaerkeMax()
     * @generated
     * @ordered
     */
	protected static final int STAERKE_MAX_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getStaerkeMax() <em>Staerke Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStaerkeMax()
     * @generated
     * @ordered
     */
	protected int staerkeMax = STAERKE_MAX_EDEFAULT;

	/**
     * The default value of the '{@link #getCharismaMax() <em>Charisma Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharismaMax()
     * @generated
     * @ordered
     */
	protected static final int CHARISMA_MAX_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getCharismaMax() <em>Charisma Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharismaMax()
     * @generated
     * @ordered
     */
	protected int charismaMax = CHARISMA_MAX_EDEFAULT;

	/**
     * The default value of the '{@link #getWillenskraftMax() <em>Willenskraft Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWillenskraftMax()
     * @generated
     * @ordered
     */
	protected static final int WILLENSKRAFT_MAX_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getWillenskraftMax() <em>Willenskraft Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWillenskraftMax()
     * @generated
     * @ordered
     */
	protected int willenskraftMax = WILLENSKRAFT_MAX_EDEFAULT;

	/**
     * The default value of the '{@link #getIntuitionMax() <em>Intuition Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIntuitionMax()
     * @generated
     * @ordered
     */
	protected static final int INTUITION_MAX_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getIntuitionMax() <em>Intuition Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIntuitionMax()
     * @generated
     * @ordered
     */
	protected int intuitionMax = INTUITION_MAX_EDEFAULT;

	/**
     * The default value of the '{@link #getLogikMax() <em>Logik Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLogikMax()
     * @generated
     * @ordered
     */
	protected static final int LOGIK_MAX_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getLogikMax() <em>Logik Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLogikMax()
     * @generated
     * @ordered
     */
	protected int logikMax = LOGIK_MAX_EDEFAULT;

	/**
     * The default value of the '{@link #getEdgeMax() <em>Edge Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEdgeMax()
     * @generated
     * @ordered
     */
	protected static final int EDGE_MAX_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getEdgeMax() <em>Edge Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEdgeMax()
     * @generated
     * @ordered
     */
	protected int edgeMax = EDGE_MAX_EDEFAULT;

	/**
     * The default value of the '{@link #getMagieMax() <em>Magie Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMagieMax()
     * @generated
     * @ordered
     */
	protected static final int MAGIE_MAX_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getMagieMax() <em>Magie Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMagieMax()
     * @generated
     * @ordered
     */
	protected int magieMax = MAGIE_MAX_EDEFAULT;

	/**
     * The default value of the '{@link #getResonanzMax() <em>Resonanz Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResonanzMax()
     * @generated
     * @ordered
     */
	protected static final int RESONANZ_MAX_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getResonanzMax() <em>Resonanz Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getResonanzMax()
     * @generated
     * @ordered
     */
	protected int resonanzMax = RESONANZ_MAX_EDEFAULT;

	/**
     * The default value of the '{@link #getEssenzMax() <em>Essenz Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEssenzMax()
     * @generated
     * @ordered
     */
	protected static final int ESSENZ_MAX_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getEssenzMax() <em>Essenz Max</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getEssenzMax()
     * @generated
     * @ordered
     */
	protected int essenzMax = ESSENZ_MAX_EDEFAULT;

	/**
     * The default value of the '{@link #getLaufen() <em>Laufen</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLaufen()
     * @generated
     * @ordered
     */
	protected static final int LAUFEN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getLaufen() <em>Laufen</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLaufen()
     * @generated
     * @ordered
     */
	protected int laufen = LAUFEN_EDEFAULT;

	/**
     * The default value of the '{@link #getRennen() <em>Rennen</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRennen()
     * @generated
     * @ordered
     */
	protected static final int RENNEN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getRennen() <em>Rennen</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRennen()
     * @generated
     * @ordered
     */
	protected int rennen = RENNEN_EDEFAULT;

	/**
     * The default value of the '{@link #getSprinten() <em>Sprinten</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSprinten()
     * @generated
     * @ordered
     */
	protected static final int SPRINTEN_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getSprinten() <em>Sprinten</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSprinten()
     * @generated
     * @ordered
     */
	protected int sprinten = SPRINTEN_EDEFAULT;

	/**
     * The cached value of the '{@link #getAngriff() <em>Angriff</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAngriff()
     * @generated
     * @ordered
     */
    protected Nahkampfwaffe angriff;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SpeziesImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5Package.Literals.SPEZIES;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__IMAGE, oldImage, image));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EList<AttributModifikatorWert> getMods() {
        if (mods == null) {
            mods = new EObjectContainmentWithInverseEList<AttributModifikatorWert>(AttributModifikatorWert.class, this, Shr5Package.SPEZIES__MODS, Shr5Package.ATTRIBUT_MODIFIKATOR_WERT__MODIFIZIERTES);
        }
        return mods;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__PARENT_ID, oldParentId, parentId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Localization> getLocalizations() {
        if (localizations == null) {
            localizations = new EObjectContainmentEList<Localization>(Localization.class, this, Shr5Package.SPEZIES__LOCALIZATIONS);
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__PAGE, oldPage, page));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.SPEZIES__SRC_BOOK, oldSrcBook, srcBook));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__SRC_BOOK, oldSrcBook, srcBook));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getKonstitutionMin() {
        return konstitutionMin;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setKonstitutionMin(int newKonstitutionMin) {
        int oldKonstitutionMin = konstitutionMin;
        konstitutionMin = newKonstitutionMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__KONSTITUTION_MIN, oldKonstitutionMin, konstitutionMin));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getGeschicklichkeitMin() {
        return geschicklichkeitMin;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setGeschicklichkeitMin(int newGeschicklichkeitMin) {
        int oldGeschicklichkeitMin = geschicklichkeitMin;
        geschicklichkeitMin = newGeschicklichkeitMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__GESCHICKLICHKEIT_MIN, oldGeschicklichkeitMin, geschicklichkeitMin));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getReaktionMin() {
        return reaktionMin;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setReaktionMin(int newReaktionMin) {
        int oldReaktionMin = reaktionMin;
        reaktionMin = newReaktionMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__REAKTION_MIN, oldReaktionMin, reaktionMin));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getStaerkeMin() {
        return staerkeMin;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setStaerkeMin(int newStaerkeMin) {
        int oldStaerkeMin = staerkeMin;
        staerkeMin = newStaerkeMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__STAERKE_MIN, oldStaerkeMin, staerkeMin));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getCharismaMin() {
        return charismaMin;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setCharismaMin(int newCharismaMin) {
        int oldCharismaMin = charismaMin;
        charismaMin = newCharismaMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__CHARISMA_MIN, oldCharismaMin, charismaMin));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getWillenskraftMin() {
        return willenskraftMin;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setWillenskraftMin(int newWillenskraftMin) {
        int oldWillenskraftMin = willenskraftMin;
        willenskraftMin = newWillenskraftMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__WILLENSKRAFT_MIN, oldWillenskraftMin, willenskraftMin));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getIntuitionMin() {
        return intuitionMin;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setIntuitionMin(int newIntuitionMin) {
        int oldIntuitionMin = intuitionMin;
        intuitionMin = newIntuitionMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__INTUITION_MIN, oldIntuitionMin, intuitionMin));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getLogikMin() {
        return logikMin;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setLogikMin(int newLogikMin) {
        int oldLogikMin = logikMin;
        logikMin = newLogikMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__LOGIK_MIN, oldLogikMin, logikMin));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getEdgeMin() {
        return edgeMin;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setEdgeMin(int newEdgeMin) {
        int oldEdgeMin = edgeMin;
        edgeMin = newEdgeMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__EDGE_MIN, oldEdgeMin, edgeMin));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getMagieMin() {
        return magieMin;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setMagieMin(int newMagieMin) {
        int oldMagieMin = magieMin;
        magieMin = newMagieMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__MAGIE_MIN, oldMagieMin, magieMin));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getResonanzMin() {
        return resonanzMin;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setResonanzMin(int newResonanzMin) {
        int oldResonanzMin = resonanzMin;
        resonanzMin = newResonanzMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__RESONANZ_MIN, oldResonanzMin, resonanzMin));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getEssenzMin() {
        return essenzMin;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setEssenzMin(int newEssenzMin) {
        int oldEssenzMin = essenzMin;
        essenzMin = newEssenzMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__ESSENZ_MIN, oldEssenzMin, essenzMin));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getKonstitutionMax() {
        return konstitutionMax;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setKonstitutionMax(int newKonstitutionMax) {
        int oldKonstitutionMax = konstitutionMax;
        konstitutionMax = newKonstitutionMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__KONSTITUTION_MAX, oldKonstitutionMax, konstitutionMax));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getGeschicklichkeitMax() {
        return geschicklichkeitMax;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setGeschicklichkeitMax(int newGeschicklichkeitMax) {
        int oldGeschicklichkeitMax = geschicklichkeitMax;
        geschicklichkeitMax = newGeschicklichkeitMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__GESCHICKLICHKEIT_MAX, oldGeschicklichkeitMax, geschicklichkeitMax));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getReaktionMax() {
        return reaktionMax;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setReaktionMax(int newReaktionMax) {
        int oldReaktionMax = reaktionMax;
        reaktionMax = newReaktionMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__REAKTION_MAX, oldReaktionMax, reaktionMax));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getStaerkeMax() {
        return staerkeMax;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setStaerkeMax(int newStaerkeMax) {
        int oldStaerkeMax = staerkeMax;
        staerkeMax = newStaerkeMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__STAERKE_MAX, oldStaerkeMax, staerkeMax));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getCharismaMax() {
        return charismaMax;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setCharismaMax(int newCharismaMax) {
        int oldCharismaMax = charismaMax;
        charismaMax = newCharismaMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__CHARISMA_MAX, oldCharismaMax, charismaMax));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getWillenskraftMax() {
        return willenskraftMax;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setWillenskraftMax(int newWillenskraftMax) {
        int oldWillenskraftMax = willenskraftMax;
        willenskraftMax = newWillenskraftMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__WILLENSKRAFT_MAX, oldWillenskraftMax, willenskraftMax));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getIntuitionMax() {
        return intuitionMax;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setIntuitionMax(int newIntuitionMax) {
        int oldIntuitionMax = intuitionMax;
        intuitionMax = newIntuitionMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__INTUITION_MAX, oldIntuitionMax, intuitionMax));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getLogikMax() {
        return logikMax;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setLogikMax(int newLogikMax) {
        int oldLogikMax = logikMax;
        logikMax = newLogikMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__LOGIK_MAX, oldLogikMax, logikMax));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getEdgeMax() {
        return edgeMax;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setEdgeMax(int newEdgeMax) {
        int oldEdgeMax = edgeMax;
        edgeMax = newEdgeMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__EDGE_MAX, oldEdgeMax, edgeMax));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getMagieMax() {
        return magieMax;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setMagieMax(int newMagieMax) {
        int oldMagieMax = magieMax;
        magieMax = newMagieMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__MAGIE_MAX, oldMagieMax, magieMax));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getResonanzMax() {
        return resonanzMax;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setResonanzMax(int newResonanzMax) {
        int oldResonanzMax = resonanzMax;
        resonanzMax = newResonanzMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__RESONANZ_MAX, oldResonanzMax, resonanzMax));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getEssenzMax() {
        return essenzMax;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setEssenzMax(int newEssenzMax) {
        int oldEssenzMax = essenzMax;
        essenzMax = newEssenzMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__ESSENZ_MAX, oldEssenzMax, essenzMax));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getLaufen() {
        return laufen;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setLaufen(int newLaufen) {
        int oldLaufen = laufen;
        laufen = newLaufen;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__LAUFEN, oldLaufen, laufen));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getRennen() {
        return rennen;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setRennen(int newRennen) {
        int oldRennen = rennen;
        rennen = newRennen;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__RENNEN, oldRennen, rennen));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public int getSprinten() {
        return sprinten;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public void setSprinten(int newSprinten) {
        int oldSprinten = sprinten;
        sprinten = newSprinten;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__SPRINTEN, oldSprinten, sprinten));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Nahkampfwaffe getAngriff() {
        return angriff;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAngriff(Nahkampfwaffe newAngriff, NotificationChain msgs) {
        Nahkampfwaffe oldAngriff = angriff;
        angriff = newAngriff;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__ANGRIFF, oldAngriff, newAngriff);
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
    public void setAngriff(Nahkampfwaffe newAngriff) {
        if (newAngriff != angriff) {
            NotificationChain msgs = null;
            if (angriff != null)
                msgs = ((InternalEObject)angriff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5Package.SPEZIES__ANGRIFF, null, msgs);
            if (newAngriff != null)
                msgs = ((InternalEObject)newAngriff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Shr5Package.SPEZIES__ANGRIFF, null, msgs);
            msgs = basicSetAngriff(newAngriff, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.SPEZIES__ANGRIFF, newAngriff, newAngriff));
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
            case Shr5Package.SPEZIES__MODS:
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
            case Shr5Package.SPEZIES__MODS:
                return ((InternalEList<?>)getMods()).basicRemove(otherEnd, msgs);
            case Shr5Package.SPEZIES__LOCALIZATIONS:
                return ((InternalEList<?>)getLocalizations()).basicRemove(otherEnd, msgs);
            case Shr5Package.SPEZIES__ANGRIFF:
                return basicSetAngriff(null, msgs);
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
            case Shr5Package.SPEZIES__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5Package.SPEZIES__IMAGE:
                return getImage();
            case Shr5Package.SPEZIES__NAME:
                return getName();
            case Shr5Package.SPEZIES__MODS:
                return getMods();
            case Shr5Package.SPEZIES__PARENT_ID:
                return getParentId();
            case Shr5Package.SPEZIES__LOCALIZATIONS:
                return getLocalizations();
            case Shr5Package.SPEZIES__PAGE:
                return getPage();
            case Shr5Package.SPEZIES__SRC_BOOK:
                if (resolve) return getSrcBook();
                return basicGetSrcBook();
            case Shr5Package.SPEZIES__KONSTITUTION_MIN:
                return getKonstitutionMin();
            case Shr5Package.SPEZIES__GESCHICKLICHKEIT_MIN:
                return getGeschicklichkeitMin();
            case Shr5Package.SPEZIES__REAKTION_MIN:
                return getReaktionMin();
            case Shr5Package.SPEZIES__STAERKE_MIN:
                return getStaerkeMin();
            case Shr5Package.SPEZIES__CHARISMA_MIN:
                return getCharismaMin();
            case Shr5Package.SPEZIES__WILLENSKRAFT_MIN:
                return getWillenskraftMin();
            case Shr5Package.SPEZIES__INTUITION_MIN:
                return getIntuitionMin();
            case Shr5Package.SPEZIES__LOGIK_MIN:
                return getLogikMin();
            case Shr5Package.SPEZIES__EDGE_MIN:
                return getEdgeMin();
            case Shr5Package.SPEZIES__MAGIE_MIN:
                return getMagieMin();
            case Shr5Package.SPEZIES__RESONANZ_MIN:
                return getResonanzMin();
            case Shr5Package.SPEZIES__ESSENZ_MIN:
                return getEssenzMin();
            case Shr5Package.SPEZIES__KONSTITUTION_MAX:
                return getKonstitutionMax();
            case Shr5Package.SPEZIES__GESCHICKLICHKEIT_MAX:
                return getGeschicklichkeitMax();
            case Shr5Package.SPEZIES__REAKTION_MAX:
                return getReaktionMax();
            case Shr5Package.SPEZIES__STAERKE_MAX:
                return getStaerkeMax();
            case Shr5Package.SPEZIES__CHARISMA_MAX:
                return getCharismaMax();
            case Shr5Package.SPEZIES__WILLENSKRAFT_MAX:
                return getWillenskraftMax();
            case Shr5Package.SPEZIES__INTUITION_MAX:
                return getIntuitionMax();
            case Shr5Package.SPEZIES__LOGIK_MAX:
                return getLogikMax();
            case Shr5Package.SPEZIES__EDGE_MAX:
                return getEdgeMax();
            case Shr5Package.SPEZIES__MAGIE_MAX:
                return getMagieMax();
            case Shr5Package.SPEZIES__RESONANZ_MAX:
                return getResonanzMax();
            case Shr5Package.SPEZIES__ESSENZ_MAX:
                return getEssenzMax();
            case Shr5Package.SPEZIES__LAUFEN:
                return getLaufen();
            case Shr5Package.SPEZIES__RENNEN:
                return getRennen();
            case Shr5Package.SPEZIES__SPRINTEN:
                return getSprinten();
            case Shr5Package.SPEZIES__ANGRIFF:
                return getAngriff();
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
            case Shr5Package.SPEZIES__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5Package.SPEZIES__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5Package.SPEZIES__NAME:
                setName((String)newValue);
                return;
            case Shr5Package.SPEZIES__MODS:
                getMods().clear();
                getMods().addAll((Collection<? extends AttributModifikatorWert>)newValue);
                return;
            case Shr5Package.SPEZIES__PARENT_ID:
                setParentId((String)newValue);
                return;
            case Shr5Package.SPEZIES__LOCALIZATIONS:
                getLocalizations().clear();
                getLocalizations().addAll((Collection<? extends Localization>)newValue);
                return;
            case Shr5Package.SPEZIES__PAGE:
                setPage((String)newValue);
                return;
            case Shr5Package.SPEZIES__SRC_BOOK:
                setSrcBook((SourceBook)newValue);
                return;
            case Shr5Package.SPEZIES__KONSTITUTION_MIN:
                setKonstitutionMin((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__GESCHICKLICHKEIT_MIN:
                setGeschicklichkeitMin((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__REAKTION_MIN:
                setReaktionMin((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__STAERKE_MIN:
                setStaerkeMin((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__CHARISMA_MIN:
                setCharismaMin((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__WILLENSKRAFT_MIN:
                setWillenskraftMin((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__INTUITION_MIN:
                setIntuitionMin((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__LOGIK_MIN:
                setLogikMin((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__EDGE_MIN:
                setEdgeMin((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__MAGIE_MIN:
                setMagieMin((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__RESONANZ_MIN:
                setResonanzMin((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__ESSENZ_MIN:
                setEssenzMin((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__KONSTITUTION_MAX:
                setKonstitutionMax((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__GESCHICKLICHKEIT_MAX:
                setGeschicklichkeitMax((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__REAKTION_MAX:
                setReaktionMax((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__STAERKE_MAX:
                setStaerkeMax((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__CHARISMA_MAX:
                setCharismaMax((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__WILLENSKRAFT_MAX:
                setWillenskraftMax((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__INTUITION_MAX:
                setIntuitionMax((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__LOGIK_MAX:
                setLogikMax((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__EDGE_MAX:
                setEdgeMax((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__MAGIE_MAX:
                setMagieMax((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__RESONANZ_MAX:
                setResonanzMax((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__ESSENZ_MAX:
                setEssenzMax((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__LAUFEN:
                setLaufen((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__RENNEN:
                setRennen((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__SPRINTEN:
                setSprinten((Integer)newValue);
                return;
            case Shr5Package.SPEZIES__ANGRIFF:
                setAngriff((Nahkampfwaffe)newValue);
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
            case Shr5Package.SPEZIES__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__MODS:
                getMods().clear();
                return;
            case Shr5Package.SPEZIES__PARENT_ID:
                setParentId(PARENT_ID_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__LOCALIZATIONS:
                getLocalizations().clear();
                return;
            case Shr5Package.SPEZIES__PAGE:
                setPage(PAGE_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__SRC_BOOK:
                setSrcBook((SourceBook)null);
                return;
            case Shr5Package.SPEZIES__KONSTITUTION_MIN:
                setKonstitutionMin(KONSTITUTION_MIN_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__GESCHICKLICHKEIT_MIN:
                setGeschicklichkeitMin(GESCHICKLICHKEIT_MIN_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__REAKTION_MIN:
                setReaktionMin(REAKTION_MIN_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__STAERKE_MIN:
                setStaerkeMin(STAERKE_MIN_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__CHARISMA_MIN:
                setCharismaMin(CHARISMA_MIN_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__WILLENSKRAFT_MIN:
                setWillenskraftMin(WILLENSKRAFT_MIN_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__INTUITION_MIN:
                setIntuitionMin(INTUITION_MIN_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__LOGIK_MIN:
                setLogikMin(LOGIK_MIN_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__EDGE_MIN:
                setEdgeMin(EDGE_MIN_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__MAGIE_MIN:
                setMagieMin(MAGIE_MIN_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__RESONANZ_MIN:
                setResonanzMin(RESONANZ_MIN_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__ESSENZ_MIN:
                setEssenzMin(ESSENZ_MIN_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__KONSTITUTION_MAX:
                setKonstitutionMax(KONSTITUTION_MAX_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__GESCHICKLICHKEIT_MAX:
                setGeschicklichkeitMax(GESCHICKLICHKEIT_MAX_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__REAKTION_MAX:
                setReaktionMax(REAKTION_MAX_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__STAERKE_MAX:
                setStaerkeMax(STAERKE_MAX_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__CHARISMA_MAX:
                setCharismaMax(CHARISMA_MAX_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__WILLENSKRAFT_MAX:
                setWillenskraftMax(WILLENSKRAFT_MAX_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__INTUITION_MAX:
                setIntuitionMax(INTUITION_MAX_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__LOGIK_MAX:
                setLogikMax(LOGIK_MAX_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__EDGE_MAX:
                setEdgeMax(EDGE_MAX_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__MAGIE_MAX:
                setMagieMax(MAGIE_MAX_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__RESONANZ_MAX:
                setResonanzMax(RESONANZ_MAX_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__ESSENZ_MAX:
                setEssenzMax(ESSENZ_MAX_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__LAUFEN:
                setLaufen(LAUFEN_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__RENNEN:
                setRennen(RENNEN_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__SPRINTEN:
                setSprinten(SPRINTEN_EDEFAULT);
                return;
            case Shr5Package.SPEZIES__ANGRIFF:
                setAngriff((Nahkampfwaffe)null);
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
            case Shr5Package.SPEZIES__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5Package.SPEZIES__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5Package.SPEZIES__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5Package.SPEZIES__MODS:
                return mods != null && !mods.isEmpty();
            case Shr5Package.SPEZIES__PARENT_ID:
                return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
            case Shr5Package.SPEZIES__LOCALIZATIONS:
                return localizations != null && !localizations.isEmpty();
            case Shr5Package.SPEZIES__PAGE:
                return PAGE_EDEFAULT == null ? page != null : !PAGE_EDEFAULT.equals(page);
            case Shr5Package.SPEZIES__SRC_BOOK:
                return srcBook != null;
            case Shr5Package.SPEZIES__KONSTITUTION_MIN:
                return konstitutionMin != KONSTITUTION_MIN_EDEFAULT;
            case Shr5Package.SPEZIES__GESCHICKLICHKEIT_MIN:
                return geschicklichkeitMin != GESCHICKLICHKEIT_MIN_EDEFAULT;
            case Shr5Package.SPEZIES__REAKTION_MIN:
                return reaktionMin != REAKTION_MIN_EDEFAULT;
            case Shr5Package.SPEZIES__STAERKE_MIN:
                return staerkeMin != STAERKE_MIN_EDEFAULT;
            case Shr5Package.SPEZIES__CHARISMA_MIN:
                return charismaMin != CHARISMA_MIN_EDEFAULT;
            case Shr5Package.SPEZIES__WILLENSKRAFT_MIN:
                return willenskraftMin != WILLENSKRAFT_MIN_EDEFAULT;
            case Shr5Package.SPEZIES__INTUITION_MIN:
                return intuitionMin != INTUITION_MIN_EDEFAULT;
            case Shr5Package.SPEZIES__LOGIK_MIN:
                return logikMin != LOGIK_MIN_EDEFAULT;
            case Shr5Package.SPEZIES__EDGE_MIN:
                return edgeMin != EDGE_MIN_EDEFAULT;
            case Shr5Package.SPEZIES__MAGIE_MIN:
                return magieMin != MAGIE_MIN_EDEFAULT;
            case Shr5Package.SPEZIES__RESONANZ_MIN:
                return resonanzMin != RESONANZ_MIN_EDEFAULT;
            case Shr5Package.SPEZIES__ESSENZ_MIN:
                return essenzMin != ESSENZ_MIN_EDEFAULT;
            case Shr5Package.SPEZIES__KONSTITUTION_MAX:
                return konstitutionMax != KONSTITUTION_MAX_EDEFAULT;
            case Shr5Package.SPEZIES__GESCHICKLICHKEIT_MAX:
                return geschicklichkeitMax != GESCHICKLICHKEIT_MAX_EDEFAULT;
            case Shr5Package.SPEZIES__REAKTION_MAX:
                return reaktionMax != REAKTION_MAX_EDEFAULT;
            case Shr5Package.SPEZIES__STAERKE_MAX:
                return staerkeMax != STAERKE_MAX_EDEFAULT;
            case Shr5Package.SPEZIES__CHARISMA_MAX:
                return charismaMax != CHARISMA_MAX_EDEFAULT;
            case Shr5Package.SPEZIES__WILLENSKRAFT_MAX:
                return willenskraftMax != WILLENSKRAFT_MAX_EDEFAULT;
            case Shr5Package.SPEZIES__INTUITION_MAX:
                return intuitionMax != INTUITION_MAX_EDEFAULT;
            case Shr5Package.SPEZIES__LOGIK_MAX:
                return logikMax != LOGIK_MAX_EDEFAULT;
            case Shr5Package.SPEZIES__EDGE_MAX:
                return edgeMax != EDGE_MAX_EDEFAULT;
            case Shr5Package.SPEZIES__MAGIE_MAX:
                return magieMax != MAGIE_MAX_EDEFAULT;
            case Shr5Package.SPEZIES__RESONANZ_MAX:
                return resonanzMax != RESONANZ_MAX_EDEFAULT;
            case Shr5Package.SPEZIES__ESSENZ_MAX:
                return essenzMax != ESSENZ_MAX_EDEFAULT;
            case Shr5Package.SPEZIES__LAUFEN:
                return laufen != LAUFEN_EDEFAULT;
            case Shr5Package.SPEZIES__RENNEN:
                return rennen != RENNEN_EDEFAULT;
            case Shr5Package.SPEZIES__SPRINTEN:
                return sprinten != SPRINTEN_EDEFAULT;
            case Shr5Package.SPEZIES__ANGRIFF:
                return angriff != null;
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
        if (baseClass == Modifizierbar.class) {
            switch (derivedFeatureID) {
                case Shr5Package.SPEZIES__MODS: return Shr5Package.MODIFIZIERBAR__MODS;
                default: return -1;
            }
        }
        if (baseClass == Identifiable.class) {
            switch (derivedFeatureID) {
                case Shr5Package.SPEZIES__PARENT_ID: return Shr5Package.IDENTIFIABLE__PARENT_ID;
                case Shr5Package.SPEZIES__LOCALIZATIONS: return Shr5Package.IDENTIFIABLE__LOCALIZATIONS;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (derivedFeatureID) {
                case Shr5Package.SPEZIES__PAGE: return Shr5Package.QUELLE__PAGE;
                case Shr5Package.SPEZIES__SRC_BOOK: return Shr5Package.QUELLE__SRC_BOOK;
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
        if (baseClass == Modifizierbar.class) {
            switch (baseFeatureID) {
                case Shr5Package.MODIFIZIERBAR__MODS: return Shr5Package.SPEZIES__MODS;
                default: return -1;
            }
        }
        if (baseClass == Identifiable.class) {
            switch (baseFeatureID) {
                case Shr5Package.IDENTIFIABLE__PARENT_ID: return Shr5Package.SPEZIES__PARENT_ID;
                case Shr5Package.IDENTIFIABLE__LOCALIZATIONS: return Shr5Package.SPEZIES__LOCALIZATIONS;
                default: return -1;
            }
        }
        if (baseClass == Quelle.class) {
            switch (baseFeatureID) {
                case Shr5Package.QUELLE__PAGE: return Shr5Package.SPEZIES__PAGE;
                case Shr5Package.QUELLE__SRC_BOOK: return Shr5Package.SPEZIES__SRC_BOOK;
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
        result.append(", konstitutionMin: ");
        result.append(konstitutionMin);
        result.append(", geschicklichkeitMin: ");
        result.append(geschicklichkeitMin);
        result.append(", reaktionMin: ");
        result.append(reaktionMin);
        result.append(", staerkeMin: ");
        result.append(staerkeMin);
        result.append(", charismaMin: ");
        result.append(charismaMin);
        result.append(", willenskraftMin: ");
        result.append(willenskraftMin);
        result.append(", intuitionMin: ");
        result.append(intuitionMin);
        result.append(", logikMin: ");
        result.append(logikMin);
        result.append(", edgeMin: ");
        result.append(edgeMin);
        result.append(", magieMin: ");
        result.append(magieMin);
        result.append(", resonanzMin: ");
        result.append(resonanzMin);
        result.append(", essenzMin: ");
        result.append(essenzMin);
        result.append(", konstitutionMax: ");
        result.append(konstitutionMax);
        result.append(", geschicklichkeitMax: ");
        result.append(geschicklichkeitMax);
        result.append(", reaktionMax: ");
        result.append(reaktionMax);
        result.append(", staerkeMax: ");
        result.append(staerkeMax);
        result.append(", charismaMax: ");
        result.append(charismaMax);
        result.append(", willenskraftMax: ");
        result.append(willenskraftMax);
        result.append(", intuitionMax: ");
        result.append(intuitionMax);
        result.append(", logikMax: ");
        result.append(logikMax);
        result.append(", edgeMax: ");
        result.append(edgeMax);
        result.append(", magieMax: ");
        result.append(magieMax);
        result.append(", resonanzMax: ");
        result.append(resonanzMax);
        result.append(", essenzMax: ");
        result.append(essenzMax);
        result.append(", laufen: ");
        result.append(laufen);
        result.append(", rennen: ");
        result.append(rennen);
        result.append(", sprinten: ");
        result.append(sprinten);
        result.append(')');
        return result.toString();
    }

} //SpeziesImpl
