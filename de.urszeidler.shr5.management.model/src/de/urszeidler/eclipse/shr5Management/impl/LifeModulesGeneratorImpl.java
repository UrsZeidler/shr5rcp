/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.urszeidler.eclipse.shr5Management.LifeModule;
import de.urszeidler.eclipse.shr5Management.LifeModulesGenerator;
import de.urszeidler.eclipse.shr5Management.LifeModulesSystem;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Life Modules Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.LifeModulesGeneratorImpl#getNationality <em>Nationality</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.LifeModulesGeneratorImpl#getFormativeYears <em>Formative Years</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.LifeModulesGeneratorImpl#getTeenYears <em>Teen Years</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.LifeModulesGeneratorImpl#getFurtherEducation <em>Further Education</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.LifeModulesGeneratorImpl#getRealLife <em>Real Life</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.LifeModulesGeneratorImpl#getModuleKarmaCost <em>Module Karma Cost</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.LifeModulesGeneratorImpl#getStartingAge <em>Starting Age</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LifeModulesGeneratorImpl extends KarmaGeneratorImpl<LifeModulesSystem> implements LifeModulesGenerator {
    /**
     * The cached value of the '{@link #getNationality() <em>Nationality</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNationality()
     * @generated
     * @ordered
     */
    protected LifeModule nationality;

    /**
     * The cached value of the '{@link #getFormativeYears() <em>Formative Years</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFormativeYears()
     * @generated
     * @ordered
     */
    protected LifeModule formativeYears;

    /**
     * The cached value of the '{@link #getTeenYears() <em>Teen Years</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTeenYears()
     * @generated
     * @ordered
     */
    protected LifeModule teenYears;

    /**
     * The cached value of the '{@link #getFurtherEducation() <em>Further Education</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFurtherEducation()
     * @generated
     * @ordered
     */
    protected LifeModule furtherEducation;

    /**
     * The cached value of the '{@link #getRealLife() <em>Real Life</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealLife()
     * @generated
     * @ordered
     */
    protected EList<LifeModule> realLife;

    private EContentAdapter eContentAdapter;

    /**
     * The default value of the '{@link #getModuleKarmaCost() <em>Module Karma Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModuleKarmaCost()
     * @generated
     * @ordered
     */
    protected static final int MODULE_KARMA_COST_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getStartingAge() <em>Starting Age</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartingAge()
     * @generated
     * @ordered
     */
    protected static final int STARTING_AGE_EDEFAULT = 0;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    protected LifeModulesGeneratorImpl() {
        super();
        
        eContentAdapter = new EContentAdapter() {
            @Override
            public void notifyChanged(Notification notification) {
                super.notifyChanged(notification);
                Object feature = notification.getFeature();
                if (Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__NATIONALITY.equals(feature)
                        || Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__FORMATIVE_YEARS.equals(feature)
                        || Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__TEEN_YEARS.equals(feature)
                        || Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__FURTHER_EDUCATION.equals(feature)
                        || Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__REAL_LIFE.equals(feature)){
                    LifeModulesGeneratorImpl.this
                    .eNotify(new ENotificationImpl(LifeModulesGeneratorImpl.this, Notification.SET, Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__MODULE_KARMA_COST, 1, 2));
                    LifeModulesGeneratorImpl.this
                    .eNotify(new ENotificationImpl(LifeModulesGeneratorImpl.this, Notification.SET, Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR__STARTING_AGE, 1, 2));
                }
            }

        };
        eContentAdapter.setTarget(this);
        this.eAdapters().add(eContentAdapter);

    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.LIFE_MODULES_GENERATOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LifeModule getNationality() {
        if (nationality != null && nationality.eIsProxy()) {
            InternalEObject oldNationality = (InternalEObject)nationality;
            nationality = (LifeModule)eResolveProxy(oldNationality);
            if (nationality != oldNationality) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.LIFE_MODULES_GENERATOR__NATIONALITY, oldNationality, nationality));
            }
        }
        return nationality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LifeModule basicGetNationality() {
        return nationality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNationality(LifeModule newNationality) {
        LifeModule oldNationality = nationality;
        nationality = newNationality;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.LIFE_MODULES_GENERATOR__NATIONALITY, oldNationality, nationality));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LifeModule getFormativeYears() {
        if (formativeYears != null && formativeYears.eIsProxy()) {
            InternalEObject oldFormativeYears = (InternalEObject)formativeYears;
            formativeYears = (LifeModule)eResolveProxy(oldFormativeYears);
            if (formativeYears != oldFormativeYears) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.LIFE_MODULES_GENERATOR__FORMATIVE_YEARS, oldFormativeYears, formativeYears));
            }
        }
        return formativeYears;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LifeModule basicGetFormativeYears() {
        return formativeYears;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFormativeYears(LifeModule newFormativeYears) {
        LifeModule oldFormativeYears = formativeYears;
        formativeYears = newFormativeYears;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.LIFE_MODULES_GENERATOR__FORMATIVE_YEARS, oldFormativeYears, formativeYears));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LifeModule getTeenYears() {
        if (teenYears != null && teenYears.eIsProxy()) {
            InternalEObject oldTeenYears = (InternalEObject)teenYears;
            teenYears = (LifeModule)eResolveProxy(oldTeenYears);
            if (teenYears != oldTeenYears) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.LIFE_MODULES_GENERATOR__TEEN_YEARS, oldTeenYears, teenYears));
            }
        }
        return teenYears;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LifeModule basicGetTeenYears() {
        return teenYears;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTeenYears(LifeModule newTeenYears) {
        LifeModule oldTeenYears = teenYears;
        teenYears = newTeenYears;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.LIFE_MODULES_GENERATOR__TEEN_YEARS, oldTeenYears, teenYears));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LifeModule getFurtherEducation() {
        if (furtherEducation != null && furtherEducation.eIsProxy()) {
            InternalEObject oldFurtherEducation = (InternalEObject)furtherEducation;
            furtherEducation = (LifeModule)eResolveProxy(oldFurtherEducation);
            if (furtherEducation != oldFurtherEducation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.LIFE_MODULES_GENERATOR__FURTHER_EDUCATION, oldFurtherEducation, furtherEducation));
            }
        }
        return furtherEducation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LifeModule basicGetFurtherEducation() {
        return furtherEducation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFurtherEducation(LifeModule newFurtherEducation) {
        LifeModule oldFurtherEducation = furtherEducation;
        furtherEducation = newFurtherEducation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.LIFE_MODULES_GENERATOR__FURTHER_EDUCATION, oldFurtherEducation, furtherEducation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LifeModule> getRealLife() {
        if (realLife == null) {
            realLife = new EObjectResolvingEList<LifeModule>(LifeModule.class, this, Shr5managementPackage.LIFE_MODULES_GENERATOR__REAL_LIFE);
        }
        return realLife;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getModuleKarmaCost() {
        int basicCost = 0;
        if(getNationality()!=null)
            basicCost += getNationality().getKarmaCost();
        if(getFormativeYears()!=null)
            basicCost+= getFormativeYears().getKarmaCost();
        if(getTeenYears()!=null)
            basicCost+= getTeenYears().getKarmaCost();
        if(getFurtherEducation()!=null)
            basicCost += getFurtherEducation().getKarmaCost();
        for (LifeModule lm : getRealLife()) {
            basicCost += lm.getKarmaCost();
        }
        return basicCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getStartingAge() {
        int basicAge = 0;
        if(getNationality()!=null)
            basicAge += getNationality().getTime();
        if(getFormativeYears()!=null)
            basicAge+= getFormativeYears().getTime();
        if(getTeenYears()!=null)
            basicAge+= getTeenYears().getTime();
        if(getFurtherEducation()!=null)
            basicAge += getFurtherEducation().getTime();
        for (LifeModule lm : getRealLife()) {
            basicAge += lm.getTime();
        }
        return basicAge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__NATIONALITY:
                if (resolve) return getNationality();
                return basicGetNationality();
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__FORMATIVE_YEARS:
                if (resolve) return getFormativeYears();
                return basicGetFormativeYears();
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__TEEN_YEARS:
                if (resolve) return getTeenYears();
                return basicGetTeenYears();
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__FURTHER_EDUCATION:
                if (resolve) return getFurtherEducation();
                return basicGetFurtherEducation();
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__REAL_LIFE:
                return getRealLife();
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__MODULE_KARMA_COST:
                return getModuleKarmaCost();
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__STARTING_AGE:
                return getStartingAge();
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
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__NATIONALITY:
                setNationality((LifeModule)newValue);
                return;
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__FORMATIVE_YEARS:
                setFormativeYears((LifeModule)newValue);
                return;
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__TEEN_YEARS:
                setTeenYears((LifeModule)newValue);
                return;
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__FURTHER_EDUCATION:
                setFurtherEducation((LifeModule)newValue);
                return;
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__REAL_LIFE:
                getRealLife().clear();
                getRealLife().addAll((Collection<? extends LifeModule>)newValue);
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
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__NATIONALITY:
                setNationality((LifeModule)null);
                return;
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__FORMATIVE_YEARS:
                setFormativeYears((LifeModule)null);
                return;
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__TEEN_YEARS:
                setTeenYears((LifeModule)null);
                return;
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__FURTHER_EDUCATION:
                setFurtherEducation((LifeModule)null);
                return;
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__REAL_LIFE:
                getRealLife().clear();
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
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__NATIONALITY:
                return nationality != null;
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__FORMATIVE_YEARS:
                return formativeYears != null;
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__TEEN_YEARS:
                return teenYears != null;
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__FURTHER_EDUCATION:
                return furtherEducation != null;
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__REAL_LIFE:
                return realLife != null && !realLife.isEmpty();
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__MODULE_KARMA_COST:
                return getModuleKarmaCost() != MODULE_KARMA_COST_EDEFAULT;
            case Shr5managementPackage.LIFE_MODULES_GENERATOR__STARTING_AGE:
                return getStartingAge() != STARTING_AGE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getKarmaSpend() {
        if (getGenerator() == null || getCharacter() == null
                || getCharacter().getPersona() == null)
            return 0;

        int karmaSpend = ShadowrunManagmentTools.getKarmaSpend(getCharacter());
        int connectionsSpend = ShadowrunManagmentTools.calcConnectionsSpend(getCharacter()) * getGenerator().getKarmaToConnectionFactor();
        int basicCost = getChoiseKarmaCost();
        return Math.abs(karmaSpend) + basicCost+ getModuleKarmaCost() + connectionsSpend + getKarmaToResource();
    }

     
} //LifeModulesGeneratorImpl
