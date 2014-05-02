/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.ChrakterLimits;
import de.urszeidler.eclipse.shr5.GeistigeAttribute;
import de.urszeidler.eclipse.shr5.KoerperlicheAttribute;
import de.urszeidler.eclipse.shr5.ModifikatorAttribute;
import de.urszeidler.eclipse.shr5.Panzerung;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.SpezielleAttribute;
import de.urszeidler.eclipse.shr5.StufenPersona;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stufen Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getPage <em>Page</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getSrcBook <em>Src Book</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getInitative <em>Initative</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getInitativWuerfel <em>Initativ Wuerfel</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getAusweichen <em>Ausweichen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getEssenz <em>Essenz</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getEdgeBasis <em>Edge Basis</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getCharisma <em>Charisma</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getWillenskraft <em>Willenskraft</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getIntuition <em>Intuition</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getLogik <em>Logik</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getKonstitution <em>Konstitution</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getGeschicklichkeit <em>Geschicklichkeit</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getReaktion <em>Reaktion</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getStaerke <em>Staerke</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getKoerperlich <em>Koerperlich</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getGeistig <em>Geistig</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getSozial <em>Sozial</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getPanzer <em>Panzer</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getStufe <em>Stufe</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getFertigkeiten <em>Fertigkeiten</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.StufenPersonaImpl#getFertigkeitsGruppen <em>Fertigkeits Gruppen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StufenPersonaImpl extends MinimalEObjectImpl.Container implements StufenPersona {
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
     * The cached value of the '{@link #getFertigkeiten() <em>Fertigkeiten</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFertigkeiten()
     * @generated
     * @ordered
     */
    protected EList<PersonaFertigkeit> fertigkeiten;

    /**
     * The cached value of the '{@link #getFertigkeitsGruppen() <em>Fertigkeits Gruppen</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFertigkeitsGruppen()
     * @generated
     * @ordered
     */
    protected EList<PersonaFertigkeitsGruppe> fertigkeitsGruppen;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StufenPersonaImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.STUFEN_PERSONA;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.STUFEN_PERSONA__PARENT_ID, oldParentId, parentId));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.STUFEN_PERSONA__PAGE, oldPage, page));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.STUFEN_PERSONA__SRC_BOOK, oldSrcBook, srcBook));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.STUFEN_PERSONA__SRC_BOOK, oldSrcBook, srcBook));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getInitative() {
        // TODO: implement this method to return the 'Initative' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getInitativWuerfel() {
        // TODO: implement this method to return the 'Initativ Wuerfel' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getAusweichen() {
        // TODO: implement this method to return the 'Ausweichen' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getEssenz() {
        // TODO: implement this method to return the 'Essenz' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.STUFEN_PERSONA__EDGE_BASIS, oldEdgeBasis, edgeBasis));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getEdge() {
        // TODO: implement this method to return the 'Edge' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getCharisma() {
        // TODO: implement this method to return the 'Charisma' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getWillenskraft() {
        // TODO: implement this method to return the 'Willenskraft' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getIntuition() {
        // TODO: implement this method to return the 'Intuition' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLogik() {
        // TODO: implement this method to return the 'Logik' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getKonstitution() {
        // TODO: implement this method to return the 'Konstitution' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getGeschicklichkeit() {
        // TODO: implement this method to return the 'Geschicklichkeit' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getReaktion() {
        // TODO: implement this method to return the 'Reaktion' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getStaerke() {
        // TODO: implement this method to return the 'Staerke' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.STUFEN_PERSONA__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.STUFEN_PERSONA__IMAGE, oldImage, image));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.STUFEN_PERSONA__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getKoerperlich() {
        // TODO: implement this method to return the 'Koerperlich' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getGeistig() {
        // TODO: implement this method to return the 'Geistig' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSozial() {
        // TODO: implement this method to return the 'Sozial' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPanzer() {
        // TODO: implement this method to return the 'Panzer' attribute
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.STUFEN_PERSONA__STUFE, oldStufe, stufe));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PersonaFertigkeit> getFertigkeiten() {
        if (fertigkeiten == null) {
            fertigkeiten = new EObjectContainmentEList<PersonaFertigkeit>(PersonaFertigkeit.class, this, Shr5Package.STUFEN_PERSONA__FERTIGKEITEN);
        }
        return fertigkeiten;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PersonaFertigkeitsGruppe> getFertigkeitsGruppen() {
        if (fertigkeitsGruppen == null) {
            fertigkeitsGruppen = new EObjectContainmentEList<PersonaFertigkeitsGruppe>(PersonaFertigkeitsGruppe.class, this, Shr5Package.STUFEN_PERSONA__FERTIGKEITS_GRUPPEN);
        }
        return fertigkeitsGruppen;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5Package.STUFEN_PERSONA__FERTIGKEITEN:
                return ((InternalEList<?>)getFertigkeiten()).basicRemove(otherEnd, msgs);
            case Shr5Package.STUFEN_PERSONA__FERTIGKEITS_GRUPPEN:
                return ((InternalEList<?>)getFertigkeitsGruppen()).basicRemove(otherEnd, msgs);
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
            case Shr5Package.STUFEN_PERSONA__PARENT_ID:
                return getParentId();
            case Shr5Package.STUFEN_PERSONA__PAGE:
                return getPage();
            case Shr5Package.STUFEN_PERSONA__SRC_BOOK:
                if (resolve) return getSrcBook();
                return basicGetSrcBook();
            case Shr5Package.STUFEN_PERSONA__INITATIVE:
                return getInitative();
            case Shr5Package.STUFEN_PERSONA__INITATIV_WUERFEL:
                return getInitativWuerfel();
            case Shr5Package.STUFEN_PERSONA__AUSWEICHEN:
                return getAusweichen();
            case Shr5Package.STUFEN_PERSONA__ESSENZ:
                return getEssenz();
            case Shr5Package.STUFEN_PERSONA__EDGE_BASIS:
                return getEdgeBasis();
            case Shr5Package.STUFEN_PERSONA__EDGE:
                return getEdge();
            case Shr5Package.STUFEN_PERSONA__CHARISMA:
                return getCharisma();
            case Shr5Package.STUFEN_PERSONA__WILLENSKRAFT:
                return getWillenskraft();
            case Shr5Package.STUFEN_PERSONA__INTUITION:
                return getIntuition();
            case Shr5Package.STUFEN_PERSONA__LOGIK:
                return getLogik();
            case Shr5Package.STUFEN_PERSONA__KONSTITUTION:
                return getKonstitution();
            case Shr5Package.STUFEN_PERSONA__GESCHICKLICHKEIT:
                return getGeschicklichkeit();
            case Shr5Package.STUFEN_PERSONA__REAKTION:
                return getReaktion();
            case Shr5Package.STUFEN_PERSONA__STAERKE:
                return getStaerke();
            case Shr5Package.STUFEN_PERSONA__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5Package.STUFEN_PERSONA__IMAGE:
                return getImage();
            case Shr5Package.STUFEN_PERSONA__NAME:
                return getName();
            case Shr5Package.STUFEN_PERSONA__KOERPERLICH:
                return getKoerperlich();
            case Shr5Package.STUFEN_PERSONA__GEISTIG:
                return getGeistig();
            case Shr5Package.STUFEN_PERSONA__SOZIAL:
                return getSozial();
            case Shr5Package.STUFEN_PERSONA__PANZER:
                return getPanzer();
            case Shr5Package.STUFEN_PERSONA__STUFE:
                return getStufe();
            case Shr5Package.STUFEN_PERSONA__FERTIGKEITEN:
                return getFertigkeiten();
            case Shr5Package.STUFEN_PERSONA__FERTIGKEITS_GRUPPEN:
                return getFertigkeitsGruppen();
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
            case Shr5Package.STUFEN_PERSONA__PARENT_ID:
                setParentId((String)newValue);
                return;
            case Shr5Package.STUFEN_PERSONA__PAGE:
                setPage((String)newValue);
                return;
            case Shr5Package.STUFEN_PERSONA__SRC_BOOK:
                setSrcBook((SourceBook)newValue);
                return;
            case Shr5Package.STUFEN_PERSONA__EDGE_BASIS:
                setEdgeBasis((Integer)newValue);
                return;
            case Shr5Package.STUFEN_PERSONA__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5Package.STUFEN_PERSONA__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5Package.STUFEN_PERSONA__NAME:
                setName((String)newValue);
                return;
            case Shr5Package.STUFEN_PERSONA__STUFE:
                setStufe((Integer)newValue);
                return;
            case Shr5Package.STUFEN_PERSONA__FERTIGKEITEN:
                getFertigkeiten().clear();
                getFertigkeiten().addAll((Collection<? extends PersonaFertigkeit>)newValue);
                return;
            case Shr5Package.STUFEN_PERSONA__FERTIGKEITS_GRUPPEN:
                getFertigkeitsGruppen().clear();
                getFertigkeitsGruppen().addAll((Collection<? extends PersonaFertigkeitsGruppe>)newValue);
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
            case Shr5Package.STUFEN_PERSONA__PARENT_ID:
                setParentId(PARENT_ID_EDEFAULT);
                return;
            case Shr5Package.STUFEN_PERSONA__PAGE:
                setPage(PAGE_EDEFAULT);
                return;
            case Shr5Package.STUFEN_PERSONA__SRC_BOOK:
                setSrcBook((SourceBook)null);
                return;
            case Shr5Package.STUFEN_PERSONA__EDGE_BASIS:
                setEdgeBasis(EDGE_BASIS_EDEFAULT);
                return;
            case Shr5Package.STUFEN_PERSONA__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5Package.STUFEN_PERSONA__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5Package.STUFEN_PERSONA__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5Package.STUFEN_PERSONA__STUFE:
                setStufe(STUFE_EDEFAULT);
                return;
            case Shr5Package.STUFEN_PERSONA__FERTIGKEITEN:
                getFertigkeiten().clear();
                return;
            case Shr5Package.STUFEN_PERSONA__FERTIGKEITS_GRUPPEN:
                getFertigkeitsGruppen().clear();
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
            case Shr5Package.STUFEN_PERSONA__PARENT_ID:
                return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
            case Shr5Package.STUFEN_PERSONA__PAGE:
                return PAGE_EDEFAULT == null ? page != null : !PAGE_EDEFAULT.equals(page);
            case Shr5Package.STUFEN_PERSONA__SRC_BOOK:
                return srcBook != null;
            case Shr5Package.STUFEN_PERSONA__INITATIVE:
                return getInitative() != INITATIVE_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__INITATIV_WUERFEL:
                return getInitativWuerfel() != INITATIV_WUERFEL_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__AUSWEICHEN:
                return getAusweichen() != AUSWEICHEN_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__ESSENZ:
                return getEssenz() != ESSENZ_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__EDGE_BASIS:
                return edgeBasis != EDGE_BASIS_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__EDGE:
                return getEdge() != EDGE_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__CHARISMA:
                return getCharisma() != CHARISMA_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__WILLENSKRAFT:
                return getWillenskraft() != WILLENSKRAFT_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__INTUITION:
                return getIntuition() != INTUITION_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__LOGIK:
                return getLogik() != LOGIK_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__KONSTITUTION:
                return getKonstitution() != KONSTITUTION_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__GESCHICKLICHKEIT:
                return getGeschicklichkeit() != GESCHICKLICHKEIT_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__REAKTION:
                return getReaktion() != REAKTION_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__STAERKE:
                return getStaerke() != STAERKE_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5Package.STUFEN_PERSONA__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5Package.STUFEN_PERSONA__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5Package.STUFEN_PERSONA__KOERPERLICH:
                return getKoerperlich() != KOERPERLICH_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__GEISTIG:
                return getGeistig() != GEISTIG_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__SOZIAL:
                return getSozial() != SOZIAL_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__PANZER:
                return getPanzer() != PANZER_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__STUFE:
                return stufe != STUFE_EDEFAULT;
            case Shr5Package.STUFEN_PERSONA__FERTIGKEITEN:
                return fertigkeiten != null && !fertigkeiten.isEmpty();
            case Shr5Package.STUFEN_PERSONA__FERTIGKEITS_GRUPPEN:
                return fertigkeitsGruppen != null && !fertigkeitsGruppen.isEmpty();
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
                case Shr5Package.STUFEN_PERSONA__INITATIVE: return Shr5Package.SPEZIELLE_ATTRIBUTE__INITATIVE;
                case Shr5Package.STUFEN_PERSONA__INITATIV_WUERFEL: return Shr5Package.SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL;
                case Shr5Package.STUFEN_PERSONA__AUSWEICHEN: return Shr5Package.SPEZIELLE_ATTRIBUTE__AUSWEICHEN;
                case Shr5Package.STUFEN_PERSONA__ESSENZ: return Shr5Package.SPEZIELLE_ATTRIBUTE__ESSENZ;
                case Shr5Package.STUFEN_PERSONA__EDGE_BASIS: return Shr5Package.SPEZIELLE_ATTRIBUTE__EDGE_BASIS;
                case Shr5Package.STUFEN_PERSONA__EDGE: return Shr5Package.SPEZIELLE_ATTRIBUTE__EDGE;
                default: return -1;
            }
        }
        if (baseClass == GeistigeAttribute.class) {
            switch (derivedFeatureID) {
                case Shr5Package.STUFEN_PERSONA__CHARISMA: return Shr5Package.GEISTIGE_ATTRIBUTE__CHARISMA;
                case Shr5Package.STUFEN_PERSONA__WILLENSKRAFT: return Shr5Package.GEISTIGE_ATTRIBUTE__WILLENSKRAFT;
                case Shr5Package.STUFEN_PERSONA__INTUITION: return Shr5Package.GEISTIGE_ATTRIBUTE__INTUITION;
                case Shr5Package.STUFEN_PERSONA__LOGIK: return Shr5Package.GEISTIGE_ATTRIBUTE__LOGIK;
                default: return -1;
            }
        }
        if (baseClass == KoerperlicheAttribute.class) {
            switch (derivedFeatureID) {
                case Shr5Package.STUFEN_PERSONA__KONSTITUTION: return Shr5Package.KOERPERLICHE_ATTRIBUTE__KONSTITUTION;
                case Shr5Package.STUFEN_PERSONA__GESCHICKLICHKEIT: return Shr5Package.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT;
                case Shr5Package.STUFEN_PERSONA__REAKTION: return Shr5Package.KOERPERLICHE_ATTRIBUTE__REAKTION;
                case Shr5Package.STUFEN_PERSONA__STAERKE: return Shr5Package.KOERPERLICHE_ATTRIBUTE__STAERKE;
                default: return -1;
            }
        }
        if (baseClass == Beschreibbar.class) {
            switch (derivedFeatureID) {
                case Shr5Package.STUFEN_PERSONA__BESCHREIBUNG: return Shr5Package.BESCHREIBBAR__BESCHREIBUNG;
                case Shr5Package.STUFEN_PERSONA__IMAGE: return Shr5Package.BESCHREIBBAR__IMAGE;
                case Shr5Package.STUFEN_PERSONA__NAME: return Shr5Package.BESCHREIBBAR__NAME;
                default: return -1;
            }
        }
        if (baseClass == ChrakterLimits.class) {
            switch (derivedFeatureID) {
                case Shr5Package.STUFEN_PERSONA__KOERPERLICH: return Shr5Package.CHRAKTER_LIMITS__KOERPERLICH;
                case Shr5Package.STUFEN_PERSONA__GEISTIG: return Shr5Package.CHRAKTER_LIMITS__GEISTIG;
                case Shr5Package.STUFEN_PERSONA__SOZIAL: return Shr5Package.CHRAKTER_LIMITS__SOZIAL;
                default: return -1;
            }
        }
        if (baseClass == Panzerung.class) {
            switch (derivedFeatureID) {
                case Shr5Package.STUFEN_PERSONA__PANZER: return Shr5Package.PANZERUNG__PANZER;
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
                case Shr5Package.SPEZIELLE_ATTRIBUTE__INITATIVE: return Shr5Package.STUFEN_PERSONA__INITATIVE;
                case Shr5Package.SPEZIELLE_ATTRIBUTE__INITATIV_WUERFEL: return Shr5Package.STUFEN_PERSONA__INITATIV_WUERFEL;
                case Shr5Package.SPEZIELLE_ATTRIBUTE__AUSWEICHEN: return Shr5Package.STUFEN_PERSONA__AUSWEICHEN;
                case Shr5Package.SPEZIELLE_ATTRIBUTE__ESSENZ: return Shr5Package.STUFEN_PERSONA__ESSENZ;
                case Shr5Package.SPEZIELLE_ATTRIBUTE__EDGE_BASIS: return Shr5Package.STUFEN_PERSONA__EDGE_BASIS;
                case Shr5Package.SPEZIELLE_ATTRIBUTE__EDGE: return Shr5Package.STUFEN_PERSONA__EDGE;
                default: return -1;
            }
        }
        if (baseClass == GeistigeAttribute.class) {
            switch (baseFeatureID) {
                case Shr5Package.GEISTIGE_ATTRIBUTE__CHARISMA: return Shr5Package.STUFEN_PERSONA__CHARISMA;
                case Shr5Package.GEISTIGE_ATTRIBUTE__WILLENSKRAFT: return Shr5Package.STUFEN_PERSONA__WILLENSKRAFT;
                case Shr5Package.GEISTIGE_ATTRIBUTE__INTUITION: return Shr5Package.STUFEN_PERSONA__INTUITION;
                case Shr5Package.GEISTIGE_ATTRIBUTE__LOGIK: return Shr5Package.STUFEN_PERSONA__LOGIK;
                default: return -1;
            }
        }
        if (baseClass == KoerperlicheAttribute.class) {
            switch (baseFeatureID) {
                case Shr5Package.KOERPERLICHE_ATTRIBUTE__KONSTITUTION: return Shr5Package.STUFEN_PERSONA__KONSTITUTION;
                case Shr5Package.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT: return Shr5Package.STUFEN_PERSONA__GESCHICKLICHKEIT;
                case Shr5Package.KOERPERLICHE_ATTRIBUTE__REAKTION: return Shr5Package.STUFEN_PERSONA__REAKTION;
                case Shr5Package.KOERPERLICHE_ATTRIBUTE__STAERKE: return Shr5Package.STUFEN_PERSONA__STAERKE;
                default: return -1;
            }
        }
        if (baseClass == Beschreibbar.class) {
            switch (baseFeatureID) {
                case Shr5Package.BESCHREIBBAR__BESCHREIBUNG: return Shr5Package.STUFEN_PERSONA__BESCHREIBUNG;
                case Shr5Package.BESCHREIBBAR__IMAGE: return Shr5Package.STUFEN_PERSONA__IMAGE;
                case Shr5Package.BESCHREIBBAR__NAME: return Shr5Package.STUFEN_PERSONA__NAME;
                default: return -1;
            }
        }
        if (baseClass == ChrakterLimits.class) {
            switch (baseFeatureID) {
                case Shr5Package.CHRAKTER_LIMITS__KOERPERLICH: return Shr5Package.STUFEN_PERSONA__KOERPERLICH;
                case Shr5Package.CHRAKTER_LIMITS__GEISTIG: return Shr5Package.STUFEN_PERSONA__GEISTIG;
                case Shr5Package.CHRAKTER_LIMITS__SOZIAL: return Shr5Package.STUFEN_PERSONA__SOZIAL;
                default: return -1;
            }
        }
        if (baseClass == Panzerung.class) {
            switch (baseFeatureID) {
                case Shr5Package.PANZERUNG__PANZER: return Shr5Package.STUFEN_PERSONA__PANZER;
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
        result.append(')');
        return result.toString();
    }

} //StufenPersonaImpl
