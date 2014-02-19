/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.AttributeChangeImpl#getAttibute <em>Attibute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeChangeImpl extends PersonaValueChangeImpl implements AttributeChange {
    /**
     * The cached value of the '{@link #getAttibute() <em>Attibute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttibute()
     * @generated
     * @ordered
     */
    protected EAttribute attibute;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeChangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.ATTRIBUTE_CHANGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttibute() {
        if (attibute != null && attibute.eIsProxy()) {
            InternalEObject oldAttibute = (InternalEObject)attibute;
            attibute = (EAttribute)eResolveProxy(oldAttibute);
            if (attibute != oldAttibute) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.ATTRIBUTE_CHANGE__ATTIBUTE, oldAttibute, attibute));
            }
        }
        return attibute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute basicGetAttibute() {
        return attibute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void setAttibute(EAttribute newAttibute) {
        EAttribute oldAttibute = attibute;
        attibute = newAttibute;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.ATTRIBUTE_CHANGE__ATTIBUTE, oldAttibute, attibute));

        if (newAttibute == null)
            return;
        if (changeApplied)
            return;

        Integer eGet = (Integer)getCharacter().getPersona().eGet(getAttibute());

        setFrom(eGet);
        setTo(eGet + 1);
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.Literals.CHANGES__KARMA_COST, 0, 1));

    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.ATTRIBUTE_CHANGE__ATTIBUTE:
                if (resolve) return getAttibute();
                return basicGetAttibute();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5managementPackage.ATTRIBUTE_CHANGE__ATTIBUTE:
                setAttibute((EAttribute)newValue);
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
            case Shr5managementPackage.ATTRIBUTE_CHANGE__ATTIBUTE:
                setAttibute((EAttribute)null);
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
            case Shr5managementPackage.ATTRIBUTE_CHANGE__ATTIBUTE:
                return attibute != null;
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

        IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements(),
                EcorePackage.Literals.EATTRIBUTE);
        if (part != null) {
            int karmaFactor = part.getKarmaFactor();

            return -1 * karmaFactor * (getTo());
        }

        return 0;

    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void applyChanges() {
        if (getAttibute() == null)
            return;

        if (getCharacter() == null)
            return;

        internalApply();

        // Integer eGet = (Integer)getCharacter().getPersona().eGet(getAttibute());
        getCharacter().getPersona().eSet(getAttibute(), getTo());
    }

} // AttributeChangeImpl
