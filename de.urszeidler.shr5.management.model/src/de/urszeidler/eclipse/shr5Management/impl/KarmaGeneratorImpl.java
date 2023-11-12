/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.urszeidler.eclipse.shr5Management.KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.MetaType;
import de.urszeidler.eclipse.shr5Management.ModelPlugin;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.SpecialType;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shr5 Karma Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.KarmaGeneratorImpl#getMetaType <em>Meta Type</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.KarmaGeneratorImpl#getCharacterConcept <em>Character Concept</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.KarmaGeneratorImpl#getKarmaToResource <em>Karma To Resource</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.KarmaGeneratorImpl#getKarmaSpend <em>Karma Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.KarmaGeneratorImpl#getResourceSpend <em>Resource Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.KarmaGeneratorImpl#getStartKarma <em>Start Karma</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.KarmaGeneratorImpl#getStartResources <em>Start Resources</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.KarmaGeneratorImpl#getChoiseKarmaCost <em>Choise Karma Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class KarmaGeneratorImpl<G extends Shr5System> extends Shr5RuleGeneratorImpl<G> implements KarmaGenerator<G> {
    /**
     * The cached value of the '{@link #getMetaType() <em>Meta Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMetaType()
     * @generated
     * @ordered
     */
    protected MetaType metaType;

    /**
     * The cached value of the '{@link #getCharacterConcept() <em>Character Concept</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharacterConcept()
     * @generated
     * @ordered
     */
    protected SpecialType characterConcept;

    /**
     * The default value of the '{@link #getKarmaToResource() <em>Karma To Resource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKarmaToResource()
     * @generated
     * @ordered
     */
    protected static final int KARMA_TO_RESOURCE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getKarmaToResource() <em>Karma To Resource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKarmaToResource()
     * @generated
     * @ordered
     */
    protected int karmaToResource = KARMA_TO_RESOURCE_EDEFAULT;

    /**
     * The default value of the '{@link #getKarmaSpend() <em>Karma Spend</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKarmaSpend()
     * @generated
     * @ordered
     */
    protected static final int KARMA_SPEND_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getResourceSpend() <em>Resource Spend</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceSpend()
     * @generated
     * @ordered
     */
    protected static final int RESOURCE_SPEND_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getStartKarma() <em>Start Karma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartKarma()
     * @generated
     * @ordered
     */
    protected static final int START_KARMA_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getStartKarma() <em>Start Karma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartKarma()
     * @generated
     * @ordered
     */
    protected int startKarma = START_KARMA_EDEFAULT;

    /**
     * The default value of the '{@link #getStartResources() <em>Start Resources</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartResources()
     * @generated
     * @ordered
     */
    protected static final int START_RESOURCES_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getStartResources() <em>Start Resources</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartResources()
     * @generated
     * @ordered
     */
    protected int startResources = START_RESOURCES_EDEFAULT;

    /**
     * The default value of the '{@link #getChoiseKarmaCost() <em>Choise Karma Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChoiseKarmaCost()
     * @generated
     * @ordered
     */
    protected static final int CHOISE_KARMA_COST_EDEFAULT = 0;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KarmaGeneratorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.KARMA_GENERATOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MetaType getMetaType() {
        if (metaType != null && metaType.eIsProxy()) {
            InternalEObject oldMetaType = (InternalEObject)metaType;
            metaType = (MetaType)eResolveProxy(oldMetaType);
            if (metaType != oldMetaType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.KARMA_GENERATOR__META_TYPE, oldMetaType, metaType));
            }
        }
        return metaType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MetaType basicGetMetaType() {
        return metaType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public void setMetaType(MetaType newMetaType) {
        MetaType oldMetaType = metaType;
        metaType = newMetaType;
        if (eNotificationRequired()){
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_KARMA_GENERATOR__META_TYPE, oldMetaType, metaType));
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_KARMA_GENERATOR__CHOISE_KARMA_COST, oldMetaType, metaType));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SpecialType getCharacterConcept() {
        if (characterConcept != null && characterConcept.eIsProxy()) {
            InternalEObject oldCharacterConcept = (InternalEObject)characterConcept;
            characterConcept = (SpecialType)eResolveProxy(oldCharacterConcept);
            if (characterConcept != oldCharacterConcept) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.KARMA_GENERATOR__CHARACTER_CONCEPT, oldCharacterConcept, characterConcept));
            }
        }
        return characterConcept;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecialType basicGetCharacterConcept() {
        return characterConcept;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCharacterConcept(SpecialType newCharacterConcept) {
        SpecialType oldCharacterConcept = characterConcept;
        characterConcept = newCharacterConcept;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.KARMA_GENERATOR__CHARACTER_CONCEPT, oldCharacterConcept, characterConcept));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getKarmaToResource() {
        return karmaToResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void setKarmaToResource(int newKarmaToResource) {
        int oldKarmaToResource = karmaToResource;
        karmaToResource = newKarmaToResource;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_KARMA_GENERATOR__KARMA_TO_RESOURCE, oldKarmaToResource,
                    karmaToResource));
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_KARMA_GENERATOR__KARMA_SPEND, oldKarmaToResource,
                    karmaToResource));
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_KARMA_GENERATOR__RESOURCE_SPEND, oldKarmaToResource,
                    karmaToResource));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getKarmaSpend() {
        if (getGenerator() == null || getCharacterConcept() == null || getMetaType() == null || getCharacter() == null
                || getCharacter().getPersona() == null)
            return 0;

        int karmaSpend = ShadowrunManagmentTools.getKarmaSpend(getCharacter());
        int connectionsSpend = ShadowrunManagmentTools.calcConnectionsSpend(getCharacter()) * getGenerator().getKarmaToConnectionFactor();
        int basicCost = getChoiseKarmaCost();//getMetaType().getCost() + getCharacterConcept().getCost();
        return Math.abs(karmaSpend) + basicCost + connectionsSpend + getKarmaToResource();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getResourceSpend() {
        if (getCharacter() == null)
            return 0;

        BigDecimal resourcesSpend = ShadowrunManagmentTools.calcResourcesSpend(getCharacter());

        return resourcesSpend.intValue();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getStartKarma() {
        return startKarma;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartKarma(int newStartKarma) {
        int oldStartKarma = startKarma;
        startKarma = newStartKarma;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.KARMA_GENERATOR__START_KARMA, oldStartKarma, startKarma));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getStartResources() {
        return startResources;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartResources(int newStartResources) {
        int oldStartResources = startResources;
        startResources = newStartResources;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.KARMA_GENERATOR__START_RESOURCES, oldStartResources, startResources));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getChoiseKarmaCost() {
        int basicCost = 0;//
        if(getMetaType()!=null)
            basicCost += getMetaType().getCost();
        if(getCharacterConcept()!=null)
            basicCost += getCharacterConcept().getCost();
        return basicCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasSpendAllPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!canValidate())
            return true;

        if (!hasSpendAllKarmaPoints(null, null)) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_RULE_GENERATOR__HAS_SPEND_ALL_POINTS, ModelPlugin.INSTANCE.getString("_UI_NotSpendAllPoints",
                                new Object[]{ "hasSpendAllPoints", EObjectValidator.getObjectLabel(this, context) }), new Object[]{ this,
                                Shr5managementPackage.Literals.CHARACTER_GENERATOR__GENERATOR }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasSpendAllKarmaPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!canValidate())
            return true;

        int karmaPoints = getGenerator().getKarmaPoints();
        int diff = karmaPoints - getKarmaSpend();

        boolean test = getGenerator().getMaxKarmaToKeep() < diff;

        if (test || diff < 0) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.KARMA_GENERATOR__HAS_SPEND_ALL_KARMA_POINTS, ModelPlugin.INSTANCE.getString(
                                "_UI_NotSpendAllKarmaPoints", new Object[]{
                                        diff < 0 ? ModelPlugin.INSTANCE.getString("_UI_Less") : ModelPlugin.INSTANCE.getString("_UI_More"), diff }),
                        new Object[]{ this, Shr5managementPackage.Literals.CHARACTER_GENERATOR__GENERATOR }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public boolean hasSpendAllResources(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!canValidate())
            return true;

        int resourceSpend = getResourceSpend();
        int avail = getKarmaToResource() * getGenerator().getKarmaToResourceFactor();
        
        int diff = avail - resourceSpend;
        boolean test = getGenerator().getMaxResourceToKeep() < diff;
        if (test || diff < 0) {
            if (diagnostics != null) {
                diagnostics.add
                    (new BasicDiagnostic
                        (Diagnostic.ERROR,
                         Shr5managementValidator.DIAGNOSTIC_SOURCE,
                         Shr5managementValidator.KARMA_GENERATOR__HAS_SPEND_ALL_RESOURCES,
                         ModelPlugin.INSTANCE.getString("_UI_hasSpendAllResources", new Object[] { diff,
                                 diff < 0 ? ModelPlugin.INSTANCE.getString("_UI_Less") : ModelPlugin.INSTANCE.getString("_UI_More") }),
                         new Object [] { this,Shr5managementPackage.Literals.SHR5_GENERATOR__RESOURCEN }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.KARMA_GENERATOR__META_TYPE:
                if (resolve) return getMetaType();
                return basicGetMetaType();
            case Shr5managementPackage.KARMA_GENERATOR__CHARACTER_CONCEPT:
                if (resolve) return getCharacterConcept();
                return basicGetCharacterConcept();
            case Shr5managementPackage.KARMA_GENERATOR__KARMA_TO_RESOURCE:
                return getKarmaToResource();
            case Shr5managementPackage.KARMA_GENERATOR__KARMA_SPEND:
                return getKarmaSpend();
            case Shr5managementPackage.KARMA_GENERATOR__RESOURCE_SPEND:
                return getResourceSpend();
            case Shr5managementPackage.KARMA_GENERATOR__START_KARMA:
                return getStartKarma();
            case Shr5managementPackage.KARMA_GENERATOR__START_RESOURCES:
                return getStartResources();
            case Shr5managementPackage.KARMA_GENERATOR__CHOISE_KARMA_COST:
                return getChoiseKarmaCost();
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
            case Shr5managementPackage.KARMA_GENERATOR__META_TYPE:
                setMetaType((MetaType)newValue);
                return;
            case Shr5managementPackage.KARMA_GENERATOR__CHARACTER_CONCEPT:
                setCharacterConcept((SpecialType)newValue);
                return;
            case Shr5managementPackage.KARMA_GENERATOR__KARMA_TO_RESOURCE:
                setKarmaToResource((Integer)newValue);
                return;
            case Shr5managementPackage.KARMA_GENERATOR__START_KARMA:
                setStartKarma((Integer)newValue);
                return;
            case Shr5managementPackage.KARMA_GENERATOR__START_RESOURCES:
                setStartResources((Integer)newValue);
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
            case Shr5managementPackage.KARMA_GENERATOR__META_TYPE:
                setMetaType((MetaType)null);
                return;
            case Shr5managementPackage.KARMA_GENERATOR__CHARACTER_CONCEPT:
                setCharacterConcept((SpecialType)null);
                return;
            case Shr5managementPackage.KARMA_GENERATOR__KARMA_TO_RESOURCE:
                setKarmaToResource(KARMA_TO_RESOURCE_EDEFAULT);
                return;
            case Shr5managementPackage.KARMA_GENERATOR__START_KARMA:
                setStartKarma(START_KARMA_EDEFAULT);
                return;
            case Shr5managementPackage.KARMA_GENERATOR__START_RESOURCES:
                setStartResources(START_RESOURCES_EDEFAULT);
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
            case Shr5managementPackage.KARMA_GENERATOR__META_TYPE:
                return metaType != null;
            case Shr5managementPackage.KARMA_GENERATOR__CHARACTER_CONCEPT:
                return characterConcept != null;
            case Shr5managementPackage.KARMA_GENERATOR__KARMA_TO_RESOURCE:
                return karmaToResource != KARMA_TO_RESOURCE_EDEFAULT;
            case Shr5managementPackage.KARMA_GENERATOR__KARMA_SPEND:
                return getKarmaSpend() != KARMA_SPEND_EDEFAULT;
            case Shr5managementPackage.KARMA_GENERATOR__RESOURCE_SPEND:
                return getResourceSpend() != RESOURCE_SPEND_EDEFAULT;
            case Shr5managementPackage.KARMA_GENERATOR__START_KARMA:
                return startKarma != START_KARMA_EDEFAULT;
            case Shr5managementPackage.KARMA_GENERATOR__START_RESOURCES:
                return startResources != START_RESOURCES_EDEFAULT;
            case Shr5managementPackage.KARMA_GENERATOR__CHOISE_KARMA_COST:
                return getChoiseKarmaCost() != CHOISE_KARMA_COST_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case Shr5managementPackage.KARMA_GENERATOR___HAS_SPEND_ALL_KARMA_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasSpendAllKarmaPoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.KARMA_GENERATOR___HAS_SPEND_ALL_RESOURCES__DIAGNOSTICCHAIN_MAP:
                return hasSpendAllResources((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
        }
        return super.eInvoke(operationID, arguments);
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
        result.append(" (karmaToResource: ");
        result.append(karmaToResource);
        result.append(", startKarma: ");
        result.append(startKarma);
        result.append(", startResources: ");
        result.append(startResources);
        result.append(')');
        return result.toString();
    }

} // Shr5KarmaGeneratorImpl
