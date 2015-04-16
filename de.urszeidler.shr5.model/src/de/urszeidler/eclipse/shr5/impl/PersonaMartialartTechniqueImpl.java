/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.urszeidler.eclipse.shr5.MartialartTechnique;
import de.urszeidler.eclipse.shr5.PersonaMartialartTechnique;
import de.urszeidler.eclipse.shr5.Shr5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona Martialart Technique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.PersonaMartialartTechniqueImpl#getTechnique <em>Technique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonaMartialartTechniqueImpl extends MinimalEObjectImpl.Container implements PersonaMartialartTechnique {
    /**
     * The cached value of the '{@link #getTechnique() <em>Technique</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTechnique()
     * @generated
     * @ordered
     */
    protected MartialartTechnique technique;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonaMartialartTechniqueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.PERSONA_MARTIALART_TECHNIQUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MartialartTechnique getTechnique() {
        if (technique != null && technique.eIsProxy()) {
            InternalEObject oldTechnique = (InternalEObject)technique;
            technique = (MartialartTechnique)eResolveProxy(oldTechnique);
            if (technique != oldTechnique) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.PERSONA_MARTIALART_TECHNIQUE__TECHNIQUE, oldTechnique, technique));
            }
        }
        return technique;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MartialartTechnique basicGetTechnique() {
        return technique;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTechnique(MartialartTechnique newTechnique) {
        MartialartTechnique oldTechnique = technique;
        technique = newTechnique;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.PERSONA_MARTIALART_TECHNIQUE__TECHNIQUE, oldTechnique, technique));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.PERSONA_MARTIALART_TECHNIQUE__TECHNIQUE:
                if (resolve) return getTechnique();
                return basicGetTechnique();
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
            case Shr5Package.PERSONA_MARTIALART_TECHNIQUE__TECHNIQUE:
                setTechnique((MartialartTechnique)newValue);
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
            case Shr5Package.PERSONA_MARTIALART_TECHNIQUE__TECHNIQUE:
                setTechnique((MartialartTechnique)null);
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
            case Shr5Package.PERSONA_MARTIALART_TECHNIQUE__TECHNIQUE:
                return technique != null;
        }
        return super.eIsSet(featureID);
    }

} //PersonaMartialartTechniqueImpl
