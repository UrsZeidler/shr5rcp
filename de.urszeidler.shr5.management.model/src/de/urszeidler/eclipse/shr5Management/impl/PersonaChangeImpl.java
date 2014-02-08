/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import de.urszeidler.eclipse.shr5.Erlernbar;
import de.urszeidler.eclipse.shr5.Initation;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.PersonaChangeImpl#getChangeable <em>Changeable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonaChangeImpl extends PersonaValueChangeImpl implements PersonaChange {
    /**
     * The cached value of the '{@link #getChangeable() <em>Changeable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChangeable()
     * @generated
     * @ordered
     */
    protected Erlernbar changeable;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonaChangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.PERSONA_CHANGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Erlernbar getChangeable() {
        if (changeable != null && changeable.eIsProxy()) {
            InternalEObject oldChangeable = (InternalEObject)changeable;
            changeable = (Erlernbar)eResolveProxy(oldChangeable);
            if (changeable != oldChangeable) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE, oldChangeable, changeable));
            }
        }
        return changeable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Erlernbar basicGetChangeable() {
        return changeable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChangeable(Erlernbar newChangeable) {
        Erlernbar oldChangeable = changeable;
        changeable = newChangeable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE, oldChangeable, changeable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE:
                if (resolve) return getChangeable();
                return basicGetChangeable();
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
            case Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE:
                setChangeable((Erlernbar)newValue);
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
            case Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE:
                setChangeable((Erlernbar)null);
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
            case Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE:
                return changeable != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * @generated not
     */
    public int getKarmaCost() {
        
        return 0;
    }    
    
    
    /**
     * @generated not
     */
    public int getKarmaCostQuallity() {
        if (getCharacter() == null)
            return 0;
        CharacterGenerator chracterSource = getCharacter().getChracterSource();
        if (chracterSource == null)
            return 0;

//        PersonaEigenschaft quallity = getQuallity();
//        if (quallity != null) {
//            IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements(),
//                    quallity.eClass());
//            if (part != null) {
//                int karmaFactor = part.getKarmaFactor();
//                return -1 * Math.abs(karmaFactor * quallity.getKarmaKosten());
//            }
//        }
        return 0;
    }

    
    /**
     * @generated not
     */
    public int getKarmaCostInitation() {
        if (getCharacter() == null)
            return 0;
        CharacterGenerator chracterSource = getCharacter().getChracterSource();
        if (chracterSource == null)
            return 0;

//        Initation initation = getGarde();
//        if (initation != null) {
//            IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements(),
//                    initation.eClass());
//            if (part != null) {
//                int karmaFactor = part.getKarmaFactor();                
//                return -1 * Math.abs(karmaFactor * initation.getStufe());
//            }
//        }
        return 0;
    }
    
    /**
     * @generated not
     */
    public int getKarmaCostSkill() {
        if (getCharacter() == null)
            return 0;
        CharacterGenerator chracterSource = getCharacter().getChracterSource();
        if (chracterSource == null)
            return 0;

//        PersonaFertigkeit skill2 = getChangeable();
//        if (skill2 != null) {
//            Fertigkeit fertigkeit = skill2.getFertigkeit();
//            EClass eClass = fertigkeit.eClass();
//
//            IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements(), eClass);
//            if (part != null) {
//                int karmaFactor = part.getKarmaFactor();
//                return -1 * karmaFactor * (getTo());
//            }
//        } else if (getSkillGroup() != null) {
//            IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements(),
//                    getSkillGroup().getGruppe().eClass());
//            if (part != null) {
//                int karmaFactor = part.getKarmaFactor();
//                return -1 * karmaFactor * (getTo());
//            }
//        }
        return 0;
    }

    
} //PersonaChangeImpl
