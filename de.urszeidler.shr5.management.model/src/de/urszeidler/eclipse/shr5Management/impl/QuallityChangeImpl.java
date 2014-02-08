/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5.PersonaEigenschaft;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.QuallityChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;

import org.eclipse.emf.common.notify.Notification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quallity Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.QuallityChangeImpl#getQuallity <em>Quallity</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.QuallityChangeImpl#isAdded <em>Added</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class QuallityChangeImpl extends ChangesImpl implements QuallityChange {
    /**
     * The cached value of the '{@link #getQuallity() <em>Quallity</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getQuallity()
     * @generated
     * @ordered
     */
    protected PersonaEigenschaft quallity;
    /**
     * The default value of the '{@link #isAdded() <em>Added</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #isAdded()
     * @generated
     * @ordered
     */
    protected static final boolean ADDED_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isAdded() <em>Added</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #isAdded()
     * @generated
     * @ordered
     */
    protected boolean added = ADDED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected QuallityChangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.QUALLITY_CHANGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public PersonaEigenschaft getQuallity() {
        if (quallity != null && quallity.eIsProxy()) {
            InternalEObject oldQuallity = (InternalEObject)quallity;
            quallity = (PersonaEigenschaft)eResolveProxy(oldQuallity);
            if (quallity != oldQuallity) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.QUALLITY_CHANGE__QUALLITY, oldQuallity, quallity));
            }
        }
        return quallity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public PersonaEigenschaft basicGetQuallity() {
        return quallity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setQuallity(PersonaEigenschaft newQuallity) {
        PersonaEigenschaft oldQuallity = quallity;
        quallity = newQuallity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.QUALLITY_CHANGE__QUALLITY, oldQuallity, quallity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isAdded() {
        return added;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setAdded(boolean newAdded) {
        boolean oldAdded = added;
        added = newAdded;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.QUALLITY_CHANGE__ADDED, oldAdded, added));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.QUALLITY_CHANGE__QUALLITY:
                if (resolve)
                    return getQuallity();
                return basicGetQuallity();
            case Shr5managementPackage.QUALLITY_CHANGE__ADDED:
                return isAdded();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5managementPackage.QUALLITY_CHANGE__QUALLITY:
                setQuallity((PersonaEigenschaft)newValue);
                return;
            case Shr5managementPackage.QUALLITY_CHANGE__ADDED:
                setAdded((Boolean)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.QUALLITY_CHANGE__QUALLITY:
                setQuallity((PersonaEigenschaft)null);
                return;
            case Shr5managementPackage.QUALLITY_CHANGE__ADDED:
                setAdded(ADDED_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.QUALLITY_CHANGE__QUALLITY:
                return quallity != null;
            case Shr5managementPackage.QUALLITY_CHANGE__ADDED:
                return added != ADDED_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * @generated not
     */
    public int getKarmaCost() {
        if (getCharacter() == null)
            return 0;
        CharacterGenerator chracterSource = getCharacter().getChracterSource();
        if (chracterSource == null)
            return 0;

        PersonaEigenschaft quallity = getQuallity();
        if (quallity != null) {
            IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements(),
                    quallity.eClass());
            if (part != null) {
                int karmaFactor = part.getKarmaFactor();
                return -1 * Math.abs(karmaFactor * quallity.getKarmaKosten());
            }
        }
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (added: ");
        result.append(added);
        result.append(')');
        return result.toString();
    }

} // QuallityChangeImpl
