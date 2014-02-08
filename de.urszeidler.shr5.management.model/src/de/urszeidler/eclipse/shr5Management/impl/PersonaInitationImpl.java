/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5.Initation;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.PersonaInitation;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona Initation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PersonaInitationImpl#getGarde <em>Garde</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonaInitationImpl extends ChangesImpl implements PersonaInitation {
    /**
     * The cached value of the '{@link #getGarde() <em>Garde</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGarde()
     * @generated
     * @ordered
     */
    protected Initation garde;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonaInitationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.PERSONA_INITATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Initation getGarde() {
        if (garde != null && garde.eIsProxy()) {
            InternalEObject oldGarde = (InternalEObject)garde;
            garde = (Initation)eResolveProxy(oldGarde);
            if (garde != oldGarde) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.PERSONA_INITATION__GARDE, oldGarde, garde));
            }
        }
        return garde;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Initation basicGetGarde() {
        return garde;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGarde(Initation newGarde) {
        Initation oldGarde = garde;
        garde = newGarde;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PERSONA_INITATION__GARDE, oldGarde, garde));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.PERSONA_INITATION__GARDE:
                if (resolve) return getGarde();
                return basicGetGarde();
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
            case Shr5managementPackage.PERSONA_INITATION__GARDE:
                setGarde((Initation)newValue);
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
            case Shr5managementPackage.PERSONA_INITATION__GARDE:
                setGarde((Initation)null);
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
            case Shr5managementPackage.PERSONA_INITATION__GARDE:
                return garde != null;
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

        Initation initation = getGarde();
        if (initation != null) {
            IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements(),
                    initation.eClass());
            if (part != null) {
                int karmaFactor = part.getKarmaFactor();                
                return -1 * Math.abs(karmaFactor * initation.getStufe());
            }
        }
        return 0;
    }


    
} //PersonaInitationImpl
