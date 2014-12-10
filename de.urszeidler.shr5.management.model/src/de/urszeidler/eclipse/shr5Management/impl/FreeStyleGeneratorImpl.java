/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem;
import de.urszeidler.eclipse.shr5Management.FreeStyle;
import de.urszeidler.eclipse.shr5Management.FreeStyleGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Free Style Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.FreeStyleGeneratorImpl#getFreestyleGenerator <em>Freestyle Generator</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.FreeStyleGeneratorImpl#getSelectedPersona <em>Selected Persona</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.FreeStyleGeneratorImpl#getSelectedSpecies <em>Selected Species</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.FreeStyleGeneratorImpl#getSelectedType <em>Selected Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FreeStyleGeneratorImpl extends CharacterGeneratorImpl<FreeStyle> implements FreeStyleGenerator {
    /**
     * The cached value of the '{@link #getSelectedPersona() <em>Selected Persona</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelectedPersona()
     * @generated
     * @ordered
     */
    protected AbstraktPersona selectedPersona;
    /**
     * The cached value of the '{@link #getSelectedSpecies() <em>Selected Species</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelectedSpecies()
     * @generated
     * @ordered
     */
    protected Spezies selectedSpecies;
    /**
     * The cached value of the '{@link #getSelectedType() <em>Selected Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelectedType()
     * @generated
     * @ordered
     */
    protected EClass selectedType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FreeStyleGeneratorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.FREE_STYLE_GENERATOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * This is specialized for the more specific type known in this context.
     * @generated
     */
    @Override
    public void setGenerator(FreeStyle newGenerator) {
        super.setGenerator(newGenerator);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FreeStyle getFreestyleGenerator() {
        FreeStyle freestyleGenerator = basicGetFreestyleGenerator();
        return freestyleGenerator != null && freestyleGenerator.eIsProxy() ? (FreeStyle)eResolveProxy((InternalEObject)freestyleGenerator) : freestyleGenerator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public FreeStyle basicGetFreestyleGenerator() {
        CharacterGeneratorSystem system = getGenerator();
        if (system instanceof FreeStyle) {
            return (FreeStyle)system;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstraktPersona getSelectedPersona() {
        if (selectedPersona != null && selectedPersona.eIsProxy()) {
            InternalEObject oldSelectedPersona = (InternalEObject)selectedPersona;
            selectedPersona = (AbstraktPersona)eResolveProxy(oldSelectedPersona);
            if (selectedPersona != oldSelectedPersona) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_PERSONA, oldSelectedPersona, selectedPersona));
            }
        }
        return selectedPersona;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstraktPersona basicGetSelectedPersona() {
        return selectedPersona;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void setSelectedPersona(AbstraktPersona newSelectedPersona) {
        AbstraktPersona oldSelectedPersona = selectedPersona;
        selectedPersona = newSelectedPersona;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_PERSONA, oldSelectedPersona,
                    selectedPersona));
        if (selectedPersona != null) {
            setSelectedSpecies(null);
            setSelectedType(null);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Spezies getSelectedSpecies() {
        if (selectedSpecies != null && selectedSpecies.eIsProxy()) {
            InternalEObject oldSelectedSpecies = (InternalEObject)selectedSpecies;
            selectedSpecies = (Spezies)eResolveProxy(oldSelectedSpecies);
            if (selectedSpecies != oldSelectedSpecies) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_SPECIES, oldSelectedSpecies, selectedSpecies));
            }
        }
        return selectedSpecies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Spezies basicGetSelectedSpecies() {
        return selectedSpecies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSelectedSpecies(Spezies newSelectedSpecies) {
        Spezies oldSelectedSpecies = selectedSpecies;
        selectedSpecies = newSelectedSpecies;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_SPECIES, oldSelectedSpecies, selectedSpecies));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSelectedType() {
        if (selectedType != null && selectedType.eIsProxy()) {
            InternalEObject oldSelectedType = (InternalEObject)selectedType;
            selectedType = (EClass)eResolveProxy(oldSelectedType);
            if (selectedType != oldSelectedType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_TYPE, oldSelectedType, selectedType));
            }
        }
        return selectedType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass basicGetSelectedType() {
        return selectedType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void setSelectedType(EClass newSelectedType) {
        EClass oldSelectedType = selectedType;
        selectedType = newSelectedType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_TYPE, oldSelectedType,
                    selectedType));
        if (newSelectedType != null)
            setSelectedPersona(null);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.FREE_STYLE_GENERATOR__FREESTYLE_GENERATOR:
                if (resolve) return getFreestyleGenerator();
                return basicGetFreestyleGenerator();
            case Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_PERSONA:
                if (resolve) return getSelectedPersona();
                return basicGetSelectedPersona();
            case Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_SPECIES:
                if (resolve) return getSelectedSpecies();
                return basicGetSelectedSpecies();
            case Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_TYPE:
                if (resolve) return getSelectedType();
                return basicGetSelectedType();
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
            case Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_PERSONA:
                setSelectedPersona((AbstraktPersona)newValue);
                return;
            case Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_SPECIES:
                setSelectedSpecies((Spezies)newValue);
                return;
            case Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_TYPE:
                setSelectedType((EClass)newValue);
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
            case Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_PERSONA:
                setSelectedPersona((AbstraktPersona)null);
                return;
            case Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_SPECIES:
                setSelectedSpecies((Spezies)null);
                return;
            case Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_TYPE:
                setSelectedType((EClass)null);
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
            case Shr5managementPackage.FREE_STYLE_GENERATOR__FREESTYLE_GENERATOR:
                return basicGetFreestyleGenerator() != null;
            case Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_PERSONA:
                return selectedPersona != null;
            case Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_SPECIES:
                return selectedSpecies != null;
            case Shr5managementPackage.FREE_STYLE_GENERATOR__SELECTED_TYPE:
                return selectedType != null;
        }
        return super.eIsSet(featureID);
    }

} // FreeStyleGeneratorImpl
