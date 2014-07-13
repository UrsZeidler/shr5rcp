/**
 */
package de.urszeidler.shr5.scripting.impl;

import de.urszeidler.eclipse.shr5.runtime.Enviorment;
import de.urszeidler.eclipse.shr5.runtime.Team;

import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.ScriptingPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
     * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBackground()
     * @generated
     * @ordered
     */
    protected EList<String> background;

    /**
     * The cached value of the '{@link #getInTheirFace() <em>In Their Face</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInTheirFace()
     * @generated
     * @ordered
     */
    protected EList<String> inTheirFace;

    /**
     * The cached value of the '{@link #getDebugging() <em>Debugging</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDebugging()
     * @generated
     * @ordered
     */
    protected EList<String> debugging;

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
    public EList<String> getBackground() {
        if (background == null) {
            background = new EDataTypeUniqueEList<String>(String.class, this, ScriptingPackage.PLACEMENT__BACKGROUND);
        }
        return background;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getInTheirFace() {
        if (inTheirFace == null) {
            inTheirFace = new EDataTypeUniqueEList<String>(String.class, this, ScriptingPackage.PLACEMENT__IN_THEIR_FACE);
        }
        return inTheirFace;
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
    public EList<String> getDebugging() {
        if (debugging == null) {
            debugging = new EDataTypeUniqueEList<String>(String.class, this, ScriptingPackage.PLACEMENT__DEBUGGING);
        }
        return debugging;
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
            case ScriptingPackage.PLACEMENT__NEXT_PLACEMENTS:
                getNextPlacements().clear();
                getNextPlacements().addAll((Collection<? extends Placement>)newValue);
                return;
            case ScriptingPackage.PLACEMENT__TEAMS:
                getTeams().clear();
                getTeams().addAll((Collection<? extends Team>)newValue);
                return;
            case ScriptingPackage.PLACEMENT__BACKGROUND:
                getBackground().clear();
                getBackground().addAll((Collection<? extends String>)newValue);
                return;
            case ScriptingPackage.PLACEMENT__IN_THEIR_FACE:
                getInTheirFace().clear();
                getInTheirFace().addAll((Collection<? extends String>)newValue);
                return;
            case ScriptingPackage.PLACEMENT__SCRIPT:
                setScript((Script)newValue);
                return;
            case ScriptingPackage.PLACEMENT__DEBUGGING:
                getDebugging().clear();
                getDebugging().addAll((Collection<? extends String>)newValue);
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
            case ScriptingPackage.PLACEMENT__NEXT_PLACEMENTS:
                getNextPlacements().clear();
                return;
            case ScriptingPackage.PLACEMENT__TEAMS:
                getTeams().clear();
                return;
            case ScriptingPackage.PLACEMENT__BACKGROUND:
                getBackground().clear();
                return;
            case ScriptingPackage.PLACEMENT__IN_THEIR_FACE:
                getInTheirFace().clear();
                return;
            case ScriptingPackage.PLACEMENT__SCRIPT:
                setScript((Script)null);
                return;
            case ScriptingPackage.PLACEMENT__DEBUGGING:
                getDebugging().clear();
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
            case ScriptingPackage.PLACEMENT__NEXT_PLACEMENTS:
                return nextPlacements != null && !nextPlacements.isEmpty();
            case ScriptingPackage.PLACEMENT__TEAMS:
                return teams != null && !teams.isEmpty();
            case ScriptingPackage.PLACEMENT__BACKGROUND:
                return background != null && !background.isEmpty();
            case ScriptingPackage.PLACEMENT__IN_THEIR_FACE:
                return inTheirFace != null && !inTheirFace.isEmpty();
            case ScriptingPackage.PLACEMENT__SCRIPT:
                return getScript() != null;
            case ScriptingPackage.PLACEMENT__DEBUGGING:
                return debugging != null && !debugging.isEmpty();
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
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (beschreibung: ");
        result.append(beschreibung);
        result.append(", image: ");
        result.append(image);
        result.append(", name: ");
        result.append(name);
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
