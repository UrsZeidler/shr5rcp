/**
 */
package de.urszeidler.shr5.scripting.impl;

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

import de.urszeidler.eclipse.shr5.runtime.Team;
import de.urszeidler.eclipse.shr5Management.GamemasterManagement;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.ScriptHistory;
import de.urszeidler.shr5.scripting.ScriptingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.ScriptImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.ScriptImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.ScriptImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.ScriptImpl#getPlacements <em>Placements</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.ScriptImpl#getAllTeams <em>All Teams</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.ScriptImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.ScriptImpl#getManagement <em>Management</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.ScriptImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.ScriptImpl#getHistory <em>History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptImpl extends MinimalEObjectImpl.Container implements Script {
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
     * The cached value of the '{@link #getPlacements() <em>Placements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlacements()
     * @generated
     * @ordered
     */
    protected EList<Placement> placements;

    /**
     * The cached value of the '{@link #getAllTeams() <em>All Teams</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAllTeams()
     * @generated
     * @ordered
     */
    protected EList<Team> allTeams;

    /**
     * The cached value of the '{@link #getPlayer() <em>Player</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlayer()
     * @generated
     * @ordered
     */
    protected Team player;

    /**
     * The cached value of the '{@link #getManagement() <em>Management</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManagement()
     * @generated
     * @ordered
     */
    protected GamemasterManagement management;

    /**
     * The cached value of the '{@link #getEntry() <em>Entry</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntry()
     * @generated
     * @ordered
     */
    protected Placement entry;

    /**
     * The cached value of the '{@link #getHistory() <em>History</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHistory()
     * @generated
     * @ordered
     */
    protected ScriptHistory history;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScriptImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScriptingPackage.Literals.SCRIPT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.SCRIPT__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.SCRIPT__IMAGE, oldImage, image));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.SCRIPT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Placement> getPlacements() {
        if (placements == null) {
            placements = new EObjectContainmentWithInverseEList<Placement>(Placement.class, this, ScriptingPackage.SCRIPT__PLACEMENTS, ScriptingPackage.PLACEMENT__SCRIPT);
        }
        return placements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Team> getAllTeams() {
        if (allTeams == null) {
            allTeams = new EObjectContainmentEList<Team>(Team.class, this, ScriptingPackage.SCRIPT__ALL_TEAMS);
        }
        return allTeams;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Team getPlayer() {
        return player;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPlayer(Team newPlayer, NotificationChain msgs) {
        Team oldPlayer = player;
        player = newPlayer;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScriptingPackage.SCRIPT__PLAYER, oldPlayer, newPlayer);
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
    public void setPlayer(Team newPlayer) {
        if (newPlayer != player) {
            NotificationChain msgs = null;
            if (player != null)
                msgs = ((InternalEObject)player).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScriptingPackage.SCRIPT__PLAYER, null, msgs);
            if (newPlayer != null)
                msgs = ((InternalEObject)newPlayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScriptingPackage.SCRIPT__PLAYER, null, msgs);
            msgs = basicSetPlayer(newPlayer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.SCRIPT__PLAYER, newPlayer, newPlayer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GamemasterManagement getManagement() {
        return management;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetManagement(GamemasterManagement newManagement, NotificationChain msgs) {
        GamemasterManagement oldManagement = management;
        management = newManagement;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScriptingPackage.SCRIPT__MANAGEMENT, oldManagement, newManagement);
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
    public void setManagement(GamemasterManagement newManagement) {
        if (newManagement != management) {
            NotificationChain msgs = null;
            if (management != null)
                msgs = ((InternalEObject)management).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScriptingPackage.SCRIPT__MANAGEMENT, null, msgs);
            if (newManagement != null)
                msgs = ((InternalEObject)newManagement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScriptingPackage.SCRIPT__MANAGEMENT, null, msgs);
            msgs = basicSetManagement(newManagement, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.SCRIPT__MANAGEMENT, newManagement, newManagement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Placement getEntry() {
        if (entry != null && entry.eIsProxy()) {
            InternalEObject oldEntry = (InternalEObject)entry;
            entry = (Placement)eResolveProxy(oldEntry);
            if (entry != oldEntry) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScriptingPackage.SCRIPT__ENTRY, oldEntry, entry));
            }
        }
        return entry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Placement basicGetEntry() {
        return entry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEntry(Placement newEntry) {
        Placement oldEntry = entry;
        entry = newEntry;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.SCRIPT__ENTRY, oldEntry, entry));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ScriptHistory getHistory() {
        return history;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHistory(ScriptHistory newHistory, NotificationChain msgs) {
        ScriptHistory oldHistory = history;
        history = newHistory;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScriptingPackage.SCRIPT__HISTORY, oldHistory, newHistory);
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
    public void setHistory(ScriptHistory newHistory) {
        if (newHistory != history) {
            NotificationChain msgs = null;
            if (history != null)
                msgs = ((InternalEObject)history).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScriptingPackage.SCRIPT__HISTORY, null, msgs);
            if (newHistory != null)
                msgs = ((InternalEObject)newHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScriptingPackage.SCRIPT__HISTORY, null, msgs);
            msgs = basicSetHistory(newHistory, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.SCRIPT__HISTORY, newHistory, newHistory));
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
            case ScriptingPackage.SCRIPT__PLACEMENTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlacements()).basicAdd(otherEnd, msgs);
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
            case ScriptingPackage.SCRIPT__PLACEMENTS:
                return ((InternalEList<?>)getPlacements()).basicRemove(otherEnd, msgs);
            case ScriptingPackage.SCRIPT__ALL_TEAMS:
                return ((InternalEList<?>)getAllTeams()).basicRemove(otherEnd, msgs);
            case ScriptingPackage.SCRIPT__PLAYER:
                return basicSetPlayer(null, msgs);
            case ScriptingPackage.SCRIPT__MANAGEMENT:
                return basicSetManagement(null, msgs);
            case ScriptingPackage.SCRIPT__HISTORY:
                return basicSetHistory(null, msgs);
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
            case ScriptingPackage.SCRIPT__BESCHREIBUNG:
                return getBeschreibung();
            case ScriptingPackage.SCRIPT__IMAGE:
                return getImage();
            case ScriptingPackage.SCRIPT__NAME:
                return getName();
            case ScriptingPackage.SCRIPT__PLACEMENTS:
                return getPlacements();
            case ScriptingPackage.SCRIPT__ALL_TEAMS:
                return getAllTeams();
            case ScriptingPackage.SCRIPT__PLAYER:
                return getPlayer();
            case ScriptingPackage.SCRIPT__MANAGEMENT:
                return getManagement();
            case ScriptingPackage.SCRIPT__ENTRY:
                if (resolve) return getEntry();
                return basicGetEntry();
            case ScriptingPackage.SCRIPT__HISTORY:
                return getHistory();
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
            case ScriptingPackage.SCRIPT__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case ScriptingPackage.SCRIPT__IMAGE:
                setImage((String)newValue);
                return;
            case ScriptingPackage.SCRIPT__NAME:
                setName((String)newValue);
                return;
            case ScriptingPackage.SCRIPT__PLACEMENTS:
                getPlacements().clear();
                getPlacements().addAll((Collection<? extends Placement>)newValue);
                return;
            case ScriptingPackage.SCRIPT__ALL_TEAMS:
                getAllTeams().clear();
                getAllTeams().addAll((Collection<? extends Team>)newValue);
                return;
            case ScriptingPackage.SCRIPT__PLAYER:
                setPlayer((Team)newValue);
                return;
            case ScriptingPackage.SCRIPT__MANAGEMENT:
                setManagement((GamemasterManagement)newValue);
                return;
            case ScriptingPackage.SCRIPT__ENTRY:
                setEntry((Placement)newValue);
                return;
            case ScriptingPackage.SCRIPT__HISTORY:
                setHistory((ScriptHistory)newValue);
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
            case ScriptingPackage.SCRIPT__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case ScriptingPackage.SCRIPT__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case ScriptingPackage.SCRIPT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ScriptingPackage.SCRIPT__PLACEMENTS:
                getPlacements().clear();
                return;
            case ScriptingPackage.SCRIPT__ALL_TEAMS:
                getAllTeams().clear();
                return;
            case ScriptingPackage.SCRIPT__PLAYER:
                setPlayer((Team)null);
                return;
            case ScriptingPackage.SCRIPT__MANAGEMENT:
                setManagement((GamemasterManagement)null);
                return;
            case ScriptingPackage.SCRIPT__ENTRY:
                setEntry((Placement)null);
                return;
            case ScriptingPackage.SCRIPT__HISTORY:
                setHistory((ScriptHistory)null);
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
            case ScriptingPackage.SCRIPT__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case ScriptingPackage.SCRIPT__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case ScriptingPackage.SCRIPT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ScriptingPackage.SCRIPT__PLACEMENTS:
                return placements != null && !placements.isEmpty();
            case ScriptingPackage.SCRIPT__ALL_TEAMS:
                return allTeams != null && !allTeams.isEmpty();
            case ScriptingPackage.SCRIPT__PLAYER:
                return player != null;
            case ScriptingPackage.SCRIPT__MANAGEMENT:
                return management != null;
            case ScriptingPackage.SCRIPT__ENTRY:
                return entry != null;
            case ScriptingPackage.SCRIPT__HISTORY:
                return history != null;
        }
        return super.eIsSet(featureID);
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
        result.append(')');
        return result.toString();
    }

} //ScriptImpl
