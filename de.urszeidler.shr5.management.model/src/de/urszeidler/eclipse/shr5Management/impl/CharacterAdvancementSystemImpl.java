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

import de.urszeidler.eclipse.shr5Management.Advancement;
import de.urszeidler.eclipse.shr5Management.CharacterAdvancementSystem;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Advancement System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterAdvancementSystemImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterAdvancementSystemImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterAdvancementSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.CharacterAdvancementSystemImpl#getCharacterAdvancements <em>Character Advancements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterAdvancementSystemImpl extends MinimalEObjectImpl.Container implements CharacterAdvancementSystem {
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
     * The cached value of the '{@link #getCharacterAdvancements() <em>Character Advancements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharacterAdvancements()
     * @generated
     * @ordered
     */
    protected EList<Advancement> characterAdvancements;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CharacterAdvancementSystemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.CHARACTER_ADVANCEMENT_SYSTEM;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__IMAGE, oldImage, image));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Advancement> getCharacterAdvancements() {
        if (characterAdvancements == null) {
            characterAdvancements = new EObjectContainmentEList<Advancement>(Advancement.class, this, Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__CHARACTER_ADVANCEMENTS);
        }
        return characterAdvancements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__CHARACTER_ADVANCEMENTS:
                return ((InternalEList<?>)getCharacterAdvancements()).basicRemove(otherEnd, msgs);
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
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__IMAGE:
                return getImage();
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__NAME:
                return getName();
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__CHARACTER_ADVANCEMENTS:
                return getCharacterAdvancements();
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
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__NAME:
                setName((String)newValue);
                return;
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__CHARACTER_ADVANCEMENTS:
                getCharacterAdvancements().clear();
                getCharacterAdvancements().addAll((Collection<? extends Advancement>)newValue);
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
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__CHARACTER_ADVANCEMENTS:
                getCharacterAdvancements().clear();
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
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5managementPackage.CHARACTER_ADVANCEMENT_SYSTEM__CHARACTER_ADVANCEMENTS:
                return characterAdvancements != null && !characterAdvancements.isEmpty();
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

} //CharacterAdvancementSystemImpl
