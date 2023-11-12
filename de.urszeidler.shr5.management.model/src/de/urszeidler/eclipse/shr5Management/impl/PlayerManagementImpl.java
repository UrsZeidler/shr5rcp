/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

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

import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem;
import de.urszeidler.eclipse.shr5Management.CharacterGroup;
import de.urszeidler.eclipse.shr5Management.PlayerManagement;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PlayerManagementImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PlayerManagementImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PlayerManagementImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PlayerManagementImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PlayerManagementImpl#getGenerators <em>Generators</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PlayerManagementImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerManagementImpl extends MinimalEObjectImpl.Container implements PlayerManagement {
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
     * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroups()
     * @generated
     * @ordered
     */
    protected EList<CharacterGroup> groups;

    /**
     * The cached value of the '{@link #getGenerators() <em>Generators</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenerators()
     * @generated
     * @ordered
     */
    protected EList<CharacterGenerator<CharacterGeneratorSystem>> generators;

    /**
     * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntries()
     * @generated
     * @ordered
     */
    protected EList<PlayerManagement> entries;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PlayerManagementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.PLAYER_MANAGEMENT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PLAYER_MANAGEMENT__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PLAYER_MANAGEMENT__IMAGE, oldImage, image));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PLAYER_MANAGEMENT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<CharacterGroup> getGroups() {
        if (groups == null) {
            groups = new EObjectContainmentEList<CharacterGroup>(CharacterGroup.class, this, Shr5managementPackage.PLAYER_MANAGEMENT__GROUPS);
        }
        return groups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<CharacterGenerator<CharacterGeneratorSystem>> getGenerators() {
        if (generators == null) {
            generators = new EObjectContainmentEList<CharacterGenerator<CharacterGeneratorSystem>>(CharacterGenerator.class, this, Shr5managementPackage.PLAYER_MANAGEMENT__GENERATORS);
        }
        return generators;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<PlayerManagement> getEntries() {
        if (entries == null) {
            entries = new EObjectContainmentEList<PlayerManagement>(PlayerManagement.class, this, Shr5managementPackage.PLAYER_MANAGEMENT__ENTRIES);
        }
        return entries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.PLAYER_MANAGEMENT__GROUPS:
                return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
            case Shr5managementPackage.PLAYER_MANAGEMENT__GENERATORS:
                return ((InternalEList<?>)getGenerators()).basicRemove(otherEnd, msgs);
            case Shr5managementPackage.PLAYER_MANAGEMENT__ENTRIES:
                return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
            case Shr5managementPackage.PLAYER_MANAGEMENT__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5managementPackage.PLAYER_MANAGEMENT__IMAGE:
                return getImage();
            case Shr5managementPackage.PLAYER_MANAGEMENT__NAME:
                return getName();
            case Shr5managementPackage.PLAYER_MANAGEMENT__GROUPS:
                return getGroups();
            case Shr5managementPackage.PLAYER_MANAGEMENT__GENERATORS:
                return getGenerators();
            case Shr5managementPackage.PLAYER_MANAGEMENT__ENTRIES:
                return getEntries();
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
            case Shr5managementPackage.PLAYER_MANAGEMENT__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5managementPackage.PLAYER_MANAGEMENT__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5managementPackage.PLAYER_MANAGEMENT__NAME:
                setName((String)newValue);
                return;
            case Shr5managementPackage.PLAYER_MANAGEMENT__GROUPS:
                getGroups().clear();
                getGroups().addAll((Collection<? extends CharacterGroup>)newValue);
                return;
            case Shr5managementPackage.PLAYER_MANAGEMENT__GENERATORS:
                getGenerators().clear();
                getGenerators().addAll((Collection<? extends CharacterGenerator<CharacterGeneratorSystem>>)newValue);
                return;
            case Shr5managementPackage.PLAYER_MANAGEMENT__ENTRIES:
                getEntries().clear();
                getEntries().addAll((Collection<? extends PlayerManagement>)newValue);
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
            case Shr5managementPackage.PLAYER_MANAGEMENT__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5managementPackage.PLAYER_MANAGEMENT__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5managementPackage.PLAYER_MANAGEMENT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5managementPackage.PLAYER_MANAGEMENT__GROUPS:
                getGroups().clear();
                return;
            case Shr5managementPackage.PLAYER_MANAGEMENT__GENERATORS:
                getGenerators().clear();
                return;
            case Shr5managementPackage.PLAYER_MANAGEMENT__ENTRIES:
                getEntries().clear();
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
            case Shr5managementPackage.PLAYER_MANAGEMENT__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5managementPackage.PLAYER_MANAGEMENT__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5managementPackage.PLAYER_MANAGEMENT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5managementPackage.PLAYER_MANAGEMENT__GROUPS:
                return groups != null && !groups.isEmpty();
            case Shr5managementPackage.PLAYER_MANAGEMENT__GENERATORS:
                return generators != null && !generators.isEmpty();
            case Shr5managementPackage.PLAYER_MANAGEMENT__ENTRIES:
                return entries != null && !entries.isEmpty();
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

} //PlayerManagementImpl
