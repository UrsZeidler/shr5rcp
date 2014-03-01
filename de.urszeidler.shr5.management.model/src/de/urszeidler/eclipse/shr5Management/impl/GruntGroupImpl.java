/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5Management.GruntGroup;
import de.urszeidler.eclipse.shr5Management.GruntMembers;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
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
 * An implementation of the model object '<em><b>Grunt Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.GruntGroupImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.GruntGroupImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.GruntGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.GruntGroupImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.GruntGroupImpl#getLeader <em>Leader</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.GruntGroupImpl#getProfessionalRating <em>Professional Rating</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GruntGroupImpl extends MinimalEObjectImpl.Container implements GruntGroup {
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
     * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMembers()
     * @generated
     * @ordered
     */
    protected EList<GruntMembers> members;

    /**
     * The cached value of the '{@link #getLeader() <em>Leader</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeader()
     * @generated
     * @ordered
     */
    protected GruntMembers leader;

    /**
     * The default value of the '{@link #getProfessionalRating() <em>Professional Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProfessionalRating()
     * @generated
     * @ordered
     */
    protected static final int PROFESSIONAL_RATING_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getProfessionalRating() <em>Professional Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProfessionalRating()
     * @generated
     * @ordered
     */
    protected int professionalRating = PROFESSIONAL_RATING_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GruntGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.GRUNT_GROUP;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.GRUNT_GROUP__BESCHREIBUNG, oldBeschreibung, beschreibung));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.GRUNT_GROUP__IMAGE, oldImage, image));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.GRUNT_GROUP__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GruntMembers> getMembers() {
        if (members == null) {
            members = new EObjectContainmentEList<GruntMembers>(GruntMembers.class, this, Shr5managementPackage.GRUNT_GROUP__MEMBERS);
        }
        return members;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GruntMembers getLeader() {
        return leader;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLeader(GruntMembers newLeader, NotificationChain msgs) {
        GruntMembers oldLeader = leader;
        leader = newLeader;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5managementPackage.GRUNT_GROUP__LEADER, oldLeader, newLeader);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeader(GruntMembers newLeader) {
        if (newLeader != leader) {
            NotificationChain msgs = null;
            if (leader != null)
                msgs = ((InternalEObject)leader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5managementPackage.GRUNT_GROUP__LEADER, null, msgs);
            if (newLeader != null)
                msgs = ((InternalEObject)newLeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Shr5managementPackage.GRUNT_GROUP__LEADER, null, msgs);
            msgs = basicSetLeader(newLeader, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.GRUNT_GROUP__LEADER, newLeader, newLeader));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getProfessionalRating() {
        return professionalRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProfessionalRating(int newProfessionalRating) {
        int oldProfessionalRating = professionalRating;
        professionalRating = newProfessionalRating;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.GRUNT_GROUP__PROFESSIONAL_RATING, oldProfessionalRating, professionalRating));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.GRUNT_GROUP__MEMBERS:
                return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
            case Shr5managementPackage.GRUNT_GROUP__LEADER:
                return basicSetLeader(null, msgs);
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
            case Shr5managementPackage.GRUNT_GROUP__BESCHREIBUNG:
                return getBeschreibung();
            case Shr5managementPackage.GRUNT_GROUP__IMAGE:
                return getImage();
            case Shr5managementPackage.GRUNT_GROUP__NAME:
                return getName();
            case Shr5managementPackage.GRUNT_GROUP__MEMBERS:
                return getMembers();
            case Shr5managementPackage.GRUNT_GROUP__LEADER:
                return getLeader();
            case Shr5managementPackage.GRUNT_GROUP__PROFESSIONAL_RATING:
                return getProfessionalRating();
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
            case Shr5managementPackage.GRUNT_GROUP__BESCHREIBUNG:
                setBeschreibung((String)newValue);
                return;
            case Shr5managementPackage.GRUNT_GROUP__IMAGE:
                setImage((String)newValue);
                return;
            case Shr5managementPackage.GRUNT_GROUP__NAME:
                setName((String)newValue);
                return;
            case Shr5managementPackage.GRUNT_GROUP__MEMBERS:
                getMembers().clear();
                getMembers().addAll((Collection<? extends GruntMembers>)newValue);
                return;
            case Shr5managementPackage.GRUNT_GROUP__LEADER:
                setLeader((GruntMembers)newValue);
                return;
            case Shr5managementPackage.GRUNT_GROUP__PROFESSIONAL_RATING:
                setProfessionalRating((Integer)newValue);
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
            case Shr5managementPackage.GRUNT_GROUP__BESCHREIBUNG:
                setBeschreibung(BESCHREIBUNG_EDEFAULT);
                return;
            case Shr5managementPackage.GRUNT_GROUP__IMAGE:
                setImage(IMAGE_EDEFAULT);
                return;
            case Shr5managementPackage.GRUNT_GROUP__NAME:
                setName(NAME_EDEFAULT);
                return;
            case Shr5managementPackage.GRUNT_GROUP__MEMBERS:
                getMembers().clear();
                return;
            case Shr5managementPackage.GRUNT_GROUP__LEADER:
                setLeader((GruntMembers)null);
                return;
            case Shr5managementPackage.GRUNT_GROUP__PROFESSIONAL_RATING:
                setProfessionalRating(PROFESSIONAL_RATING_EDEFAULT);
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
            case Shr5managementPackage.GRUNT_GROUP__BESCHREIBUNG:
                return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
            case Shr5managementPackage.GRUNT_GROUP__IMAGE:
                return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
            case Shr5managementPackage.GRUNT_GROUP__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case Shr5managementPackage.GRUNT_GROUP__MEMBERS:
                return members != null && !members.isEmpty();
            case Shr5managementPackage.GRUNT_GROUP__LEADER:
                return leader != null;
            case Shr5managementPackage.GRUNT_GROUP__PROFESSIONAL_RATING:
                return professionalRating != PROFESSIONAL_RATING_EDEFAULT;
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
        result.append(", professionalRating: ");
        result.append(professionalRating);
        result.append(')');
        return result.toString();
    }

} //GruntGroupImpl
