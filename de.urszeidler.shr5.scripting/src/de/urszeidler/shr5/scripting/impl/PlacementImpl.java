/**
 */
package de.urszeidler.shr5.scripting.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.urszeidler.eclipse.shr5.runtime.Enviorment;
import de.urszeidler.eclipse.shr5.runtime.Team;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.ScriptingPackage;
import de.urszeidler.shr5.scripting.TimeFrame;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.PlacementImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.PlacementImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.PlacementImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.PlacementImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.PlacementImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.PlacementImpl#getActualDate <em>Actual Date</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.PlacementImpl#getNextPlacements <em>Next Placements</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.PlacementImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.PlacementImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.PlacementImpl#getInTheirFace <em>In Their Face</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.PlacementImpl#getScript <em>Script</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.PlacementImpl#getDebugging <em>Debugging</em>}</li>
 *   <li>{@link de.urszeidler.shr5.scripting.impl.PlacementImpl#getEnviorment <em>Enviorment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlacementImpl extends MinimalEObjectImpl.Container implements Placement {
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
     * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartDate()
     * @generated
     * @ordered
     */
    protected static final Date START_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartDate()
     * @generated
     * @ordered
     */
    protected Date startDate = START_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDate()
     * @generated
     * @ordered
     */
    protected static final Date END_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDate()
     * @generated
     * @ordered
     */
    protected Date endDate = END_DATE_EDEFAULT;

    /**
     * The default value of the '{@link #getActualDate() <em>Actual Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActualDate()
     * @generated
     * @ordered
     */
    protected static final Date ACTUAL_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getActualDate() <em>Actual Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActualDate()
     * @generated
     * @ordered
     */
    protected Date actualDate = ACTUAL_DATE_EDEFAULT;

    /**
     * The cached value of the '{@link #getNextPlacements() <em>Next Placements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNextPlacements()
     * @generated
     * @ordered
     */
    protected EList<Placement> nextPlacements;

    /**
     * The cached value of the '{@link #getTeams() <em>Teams</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTeams()
     * @generated
     * @ordered
     */
    protected EList<Team> teams;

    /**
     * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBackground()
     * @generated
     * @ordered
     */
    protected static final String BACKGROUND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBackground()
     * @generated
     * @ordered
     */
    protected String background = BACKGROUND_EDEFAULT;

    /**
     * The default value of the '{@link #getInTheirFace() <em>In Their Face</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInTheirFace()
     * @generated
     * @ordered
     */
    protected static final String IN_THEIR_FACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInTheirFace() <em>In Their Face</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInTheirFace()
     * @generated
     * @ordered
     */
    protected String inTheirFace = IN_THEIR_FACE_EDEFAULT;

    /**
     * The default value of the '{@link #getDebugging() <em>Debugging</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDebugging()
     * @generated
     * @ordered
     */
    protected static final String DEBUGGING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDebugging() <em>Debugging</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDebugging()
     * @generated
     * @ordered
     */
    protected String debugging = DEBUGGING_EDEFAULT;

    /**
     * The cached value of the '{@link #getEnviorment() <em>Enviorment</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnviorment()
     * @generated
     * @ordered
     */
    protected Enviorment enviorment;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PlacementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScriptingPackage.Literals.PLACEMENT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.PLACEMENT__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.PLACEMENT__IMAGE, oldImage, image));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.PLACEMENT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStartDate(Date newStartDate) {
        Date oldStartDate = startDate;
        startDate = newStartDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.PLACEMENT__START_DATE, oldStartDate, startDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEndDate(Date newEndDate) {
        Date oldEndDate = endDate;
        endDate = newEndDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.PLACEMENT__END_DATE, oldEndDate, endDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Date getActualDate() {
        return actualDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActualDate(Date newActualDate) {
        Date oldActualDate = actualDate;
        actualDate = newActualDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.PLACEMENT__ACTUAL_DATE, oldActualDate, actualDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Placement> getNextPlacements() {
        if (nextPlacements == null) {
            nextPlacements = new EObjectResolvingEList<Placement>(Placement.class, this, ScriptingPackage.PLACEMENT__NEXT_PLACEMENTS);
        }
        return nextPlacements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Team> getTeams() {
        if (teams == null) {
            teams = new EObjectResolvingEList<Team>(Team.class, this, ScriptingPackage.PLACEMENT__TEAMS);
        }
        return teams;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBackground() {
        return background;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBackground(String newBackground) {
        String oldBackground = background;
        background = newBackground;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.PLACEMENT__BACKGROUND, oldBackground, background));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInTheirFace() {
        return inTheirFace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInTheirFace(String newInTheirFace) {
        String oldInTheirFace = inTheirFace;
        inTheirFace = newInTheirFace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.PLACEMENT__IN_THEIR_FACE, oldInTheirFace, inTheirFace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script getScript() {
        if (eContainerFeatureID() != ScriptingPackage.PLACEMENT__SCRIPT) return null;
        return (Script)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetScript(Script newScript, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newScript, ScriptingPackage.PLACEMENT__SCRIPT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScript(Script newScript) {
        if (newScript != eInternalContainer() || (eContainerFeatureID() != ScriptingPackage.PLACEMENT__SCRIPT && newScript != null)) {
            if (EcoreUtil.isAncestor(this, newScript))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newScript != null)
                msgs = ((InternalEObject)newScript).eInverseAdd(this, ScriptingPackage.SCRIPT__PLACEMENTS, Script.class, msgs);
            msgs = basicSetScript(newScript, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.PLACEMENT__SCRIPT, newScript, newScript));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDebugging() {
        return debugging;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDebugging(String newDebugging) {
        String oldDebugging = debugging;
        debugging = newDebugging;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.PLACEMENT__DEBUGGING, oldDebugging, debugging));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Enviorment getEnviorment() {
        return enviorment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnviorment(Enviorment newEnviorment, NotificationChain msgs) {
        Enviorment oldEnviorment = enviorment;
        enviorment = newEnviorment;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScriptingPackage.PLACEMENT__ENVIORMENT, oldEnviorment, newEnviorment);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnviorment(Enviorment newEnviorment) {
        if (newEnviorment != enviorment) {
            NotificationChain msgs = null;
            if (enviorment != null)
                msgs = ((InternalEObject)enviorment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScriptingPackage.PLACEMENT__ENVIORMENT, null, msgs);
            if (newEnviorment != null)
                msgs = ((InternalEObject)newEnviorment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScriptingPackage.PLACEMENT__ENVIORMENT, null, msgs);
            msgs = basicSetEnviorment(newEnviorment, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScriptingPackage.PLACEMENT__ENVIORMENT, newEnviorment, newEnviorment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScriptingPackage.PLACEMENT__SCRIPT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetScript((Script)otherEnd, msgs);
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
            case ScriptingPackage.PLACEMENT__SCRIPT:
                return basicSetScript(null, msgs);
            case ScriptingPackage.PLACEMENT__ENVIORMENT:
                return basicSetEnviorment(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case ScriptingPackage.PLACEMENT__SCRIPT:
                return eInternalContainer().eInverseRemove(this, ScriptingPackage.SCRIPT__PLACEMENTS, Script.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ScriptingPackage.PLACEMENT__BESCHREIBUNG:
                return getBeschreibung();
            case ScriptingPackage.PLACEMENT__IMAGE:
                return getImage();
            case ScriptingPackage.PLACEMENT__NAME:
                return getName();
            case ScriptingPackage.PLACEMENT__START_DATE:
                return getStartDate();
            case ScriptingPackage.PLACEMENT__END_DATE:
                return getEndDate();
            case ScriptingPackage.PLACEMENT__ACTUAL_DATE:
                return getActualDate();
            case ScriptingPackage.PLACEMENT__NEXT_PLACEMENTS:
                return getNextPlacements();
            case ScriptingPackage.PLACEMENT__TEAMS:
                return getTeams();
            case ScriptingPackage.PLACEMENT__BACKGROUND:
                return getBackground();
            case ScriptingPackage.PLACEMENT__IN_THEIR_FACE:
                return getInTheirFace();
            case ScriptingPackage.PLACEMENT__SCRIPT:
                return getScript();
            case ScriptingPackage.PLACEMENT__DEBUGGING:
                return getDebugging();
            case ScriptingPackage.PLACEMENT__ENVIORMENT:
                return getEnviorment();
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
            case ScriptingPackage.PLACEMENT__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case ScriptingPackage.PLACEMENT__IMAGE:
                setImage((String)newValue);
                return;
            case ScriptingPackage.PLACEMENT__NAME:
                setName((String)newValue);
                return;
            case ScriptingPackage.PLACEMENT__START_DATE:
                setStartDate((Date)newValue);
                return;
            case ScriptingPackage.PLACEMENT__END_DATE:
                setEndDate((Date)newValue);
                return;
            case ScriptingPackage.PLACEMENT__ACTUAL_DATE:
                setActualDate((Date)newValue);
                return;
            case ScriptingPackage.PLACEMENT__NEXT_PLACEMENTS:
                getNextPlacements().clear();
                getNextPlacements().addAll((Collection<? extends Placement>)newValue);
                return;
            case ScriptingPackage.PLACEMENT__TEAMS:
                getTeams().clear();
                getTeams().addAll((Collection<? extends Team>)newValue);
                return;
            case ScriptingPackage.PLACEMENT__BACKGROUND:
                setBackground((String)newValue);
                return;
            case ScriptingPackage.PLACEMENT__IN_THEIR_FACE:
                setInTheirFace((String)newValue);
                return;
            case ScriptingPackage.PLACEMENT__SCRIPT:
                setScript((Script)newValue);
                return;
            case ScriptingPackage.PLACEMENT__DEBUGGING:
                setDebugging((String)newValue);
                return;
            case ScriptingPackage.PLACEMENT__ENVIORMENT:
                setEnviorment((Enviorment)newValue);
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
            case ScriptingPackage.PLACEMENT__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case ScriptingPackage.PLACEMENT__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case ScriptingPackage.PLACEMENT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ScriptingPackage.PLACEMENT__START_DATE:
                setStartDate(START_DATE_EDEFAULT);
                return;
            case ScriptingPackage.PLACEMENT__END_DATE:
                setEndDate(END_DATE_EDEFAULT);
                return;
            case ScriptingPackage.PLACEMENT__ACTUAL_DATE:
                setActualDate(ACTUAL_DATE_EDEFAULT);
                return;
            case ScriptingPackage.PLACEMENT__NEXT_PLACEMENTS:
                getNextPlacements().clear();
                return;
            case ScriptingPackage.PLACEMENT__TEAMS:
                getTeams().clear();
                return;
            case ScriptingPackage.PLACEMENT__BACKGROUND:
                setBackground(BACKGROUND_EDEFAULT);
                return;
            case ScriptingPackage.PLACEMENT__IN_THEIR_FACE:
                setInTheirFace(IN_THEIR_FACE_EDEFAULT);
                return;
            case ScriptingPackage.PLACEMENT__SCRIPT:
                setScript((Script)null);
                return;
            case ScriptingPackage.PLACEMENT__DEBUGGING:
                setDebugging(DEBUGGING_EDEFAULT);
                return;
            case ScriptingPackage.PLACEMENT__ENVIORMENT:
                setEnviorment((Enviorment)null);
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
            case ScriptingPackage.PLACEMENT__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case ScriptingPackage.PLACEMENT__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case ScriptingPackage.PLACEMENT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ScriptingPackage.PLACEMENT__START_DATE:
                return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
            case ScriptingPackage.PLACEMENT__END_DATE:
                return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
            case ScriptingPackage.PLACEMENT__ACTUAL_DATE:
                return ACTUAL_DATE_EDEFAULT == null ? actualDate != null : !ACTUAL_DATE_EDEFAULT.equals(actualDate);
            case ScriptingPackage.PLACEMENT__NEXT_PLACEMENTS:
                return nextPlacements != null && !nextPlacements.isEmpty();
            case ScriptingPackage.PLACEMENT__TEAMS:
                return teams != null && !teams.isEmpty();
            case ScriptingPackage.PLACEMENT__BACKGROUND:
                return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
            case ScriptingPackage.PLACEMENT__IN_THEIR_FACE:
                return IN_THEIR_FACE_EDEFAULT == null ? inTheirFace != null : !IN_THEIR_FACE_EDEFAULT.equals(inTheirFace);
            case ScriptingPackage.PLACEMENT__SCRIPT:
                return getScript() != null;
            case ScriptingPackage.PLACEMENT__DEBUGGING:
                return DEBUGGING_EDEFAULT == null ? debugging != null : !DEBUGGING_EDEFAULT.equals(debugging);
            case ScriptingPackage.PLACEMENT__ENVIORMENT:
                return enviorment != null;
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
        if (baseClass == TimeFrame.class) {
            switch (derivedFeatureID) {
                case ScriptingPackage.PLACEMENT__START_DATE: return ScriptingPackage.TIME_FRAME__START_DATE;
                case ScriptingPackage.PLACEMENT__END_DATE: return ScriptingPackage.TIME_FRAME__END_DATE;
                case ScriptingPackage.PLACEMENT__ACTUAL_DATE: return ScriptingPackage.TIME_FRAME__ACTUAL_DATE;
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
        if (baseClass == TimeFrame.class) {
            switch (baseFeatureID) {
                case ScriptingPackage.TIME_FRAME__START_DATE: return ScriptingPackage.PLACEMENT__START_DATE;
                case ScriptingPackage.TIME_FRAME__END_DATE: return ScriptingPackage.PLACEMENT__END_DATE;
                case ScriptingPackage.TIME_FRAME__ACTUAL_DATE: return ScriptingPackage.PLACEMENT__ACTUAL_DATE;
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
        result.append(", startDate: ");
        result.append(startDate);
        result.append(", endDate: ");
        result.append(endDate);
        result.append(", actualDate: ");
        result.append(actualDate);
        result.append(", background: ");
        result.append(background);
        result.append(", inTheirFace: ");
        result.append(inTheirFace);
        result.append(", debugging: ");
        result.append(debugging);
        result.append(')');
        return result.toString();
    }

} //PlacementImpl
