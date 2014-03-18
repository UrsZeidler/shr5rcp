/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shr5 System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5SystemImpl#getKarmaToResourceFactor <em>Karma To Resource Factor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5SystemImpl#getKarmaToMagicFactor <em>Karma To Magic Factor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5SystemImpl#getNumberOfMaxAttributes <em>Number Of Max Attributes</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5SystemImpl#getKnowlegeSkillFactor <em>Knowlege Skill Factor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5SystemImpl#getCharismaToConnectionFactor <em>Charisma To Connection Factor</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5SystemImpl#getMaxResourceToKeep <em>Max Resource To Keep</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5SystemImpl#getMaxKarmaToResources <em>Max Karma To Resources</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5SystemImpl#getMaxKarmaToKeep <em>Max Karma To Keep</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5SystemImpl#getSkillMax <em>Skill Max</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5SystemImpl#getNumberOfSpecalism <em>Number Of Specalism</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5SystemImpl#getKarmaToConnectionFactor <em>Karma To Connection Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Shr5SystemImpl extends PrioritySystemImpl implements Shr5System {
	/**
     * The default value of the '{@link #getKarmaToResourceFactor() <em>Karma To Resource Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKarmaToResourceFactor()
     * @generated
     * @ordered
     */
	protected static final int KARMA_TO_RESOURCE_FACTOR_EDEFAULT = 0;
	/**
     * The cached value of the '{@link #getKarmaToResourceFactor() <em>Karma To Resource Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKarmaToResourceFactor()
     * @generated
     * @ordered
     */
	protected int karmaToResourceFactor = KARMA_TO_RESOURCE_FACTOR_EDEFAULT;
	/**
     * The default value of the '{@link #getKarmaToMagicFactor() <em>Karma To Magic Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKarmaToMagicFactor()
     * @generated
     * @ordered
     */
	protected static final int KARMA_TO_MAGIC_FACTOR_EDEFAULT = 0;
	/**
     * The cached value of the '{@link #getKarmaToMagicFactor() <em>Karma To Magic Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKarmaToMagicFactor()
     * @generated
     * @ordered
     */
	protected int karmaToMagicFactor = KARMA_TO_MAGIC_FACTOR_EDEFAULT;

	/**
     * The default value of the '{@link #getNumberOfMaxAttributes() <em>Number Of Max Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNumberOfMaxAttributes()
     * @generated
     * @ordered
     */
	protected static final int NUMBER_OF_MAX_ATTRIBUTES_EDEFAULT = 0;
	/**
     * The cached value of the '{@link #getNumberOfMaxAttributes() <em>Number Of Max Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNumberOfMaxAttributes()
     * @generated
     * @ordered
     */
	protected int numberOfMaxAttributes = NUMBER_OF_MAX_ATTRIBUTES_EDEFAULT;

	/**
     * The default value of the '{@link #getKnowlegeSkillFactor() <em>Knowlege Skill Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKnowlegeSkillFactor()
     * @generated
     * @ordered
     */
	protected static final int KNOWLEGE_SKILL_FACTOR_EDEFAULT = 0;
	/**
     * The cached value of the '{@link #getKnowlegeSkillFactor() <em>Knowlege Skill Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKnowlegeSkillFactor()
     * @generated
     * @ordered
     */
	protected int knowlegeSkillFactor = KNOWLEGE_SKILL_FACTOR_EDEFAULT;

	/**
     * The default value of the '{@link #getCharismaToConnectionFactor() <em>Charisma To Connection Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharismaToConnectionFactor()
     * @generated
     * @ordered
     */
	protected static final int CHARISMA_TO_CONNECTION_FACTOR_EDEFAULT = 0;
	/**
     * The cached value of the '{@link #getCharismaToConnectionFactor() <em>Charisma To Connection Factor</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharismaToConnectionFactor()
     * @generated
     * @ordered
     */
	protected int charismaToConnectionFactor = CHARISMA_TO_CONNECTION_FACTOR_EDEFAULT;

	/**
     * The default value of the '{@link #getMaxResourceToKeep() <em>Max Resource To Keep</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxResourceToKeep()
     * @generated
     * @ordered
     */
    protected static final int MAX_RESOURCE_TO_KEEP_EDEFAULT = 0;
    /**
     * The cached value of the '{@link #getMaxResourceToKeep() <em>Max Resource To Keep</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxResourceToKeep()
     * @generated
     * @ordered
     */
    protected int maxResourceToKeep = MAX_RESOURCE_TO_KEEP_EDEFAULT;
    /**
     * The default value of the '{@link #getMaxKarmaToResources() <em>Max Karma To Resources</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxKarmaToResources()
     * @generated
     * @ordered
     */
    protected static final int MAX_KARMA_TO_RESOURCES_EDEFAULT = 0;
    /**
     * The cached value of the '{@link #getMaxKarmaToResources() <em>Max Karma To Resources</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxKarmaToResources()
     * @generated
     * @ordered
     */
    protected int maxKarmaToResources = MAX_KARMA_TO_RESOURCES_EDEFAULT;
    /**
     * The default value of the '{@link #getMaxKarmaToKeep() <em>Max Karma To Keep</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxKarmaToKeep()
     * @generated
     * @ordered
     */
    protected static final int MAX_KARMA_TO_KEEP_EDEFAULT = 0;
    /**
     * The cached value of the '{@link #getMaxKarmaToKeep() <em>Max Karma To Keep</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxKarmaToKeep()
     * @generated
     * @ordered
     */
    protected int maxKarmaToKeep = MAX_KARMA_TO_KEEP_EDEFAULT;

    /**
     * The default value of the '{@link #getSkillMax() <em>Skill Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSkillMax()
     * @generated
     * @ordered
     */
    protected static final int SKILL_MAX_EDEFAULT = 0;
    /**
     * The cached value of the '{@link #getSkillMax() <em>Skill Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSkillMax()
     * @generated
     * @ordered
     */
    protected int skillMax = SKILL_MAX_EDEFAULT;
    /**
     * The default value of the '{@link #getNumberOfSpecalism() <em>Number Of Specalism</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumberOfSpecalism()
     * @generated
     * @ordered
     */
    protected static final int NUMBER_OF_SPECALISM_EDEFAULT = 0;
    /**
     * The cached value of the '{@link #getNumberOfSpecalism() <em>Number Of Specalism</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumberOfSpecalism()
     * @generated
     * @ordered
     */
    protected int numberOfSpecalism = NUMBER_OF_SPECALISM_EDEFAULT;

    /**
     * The default value of the '{@link #getKarmaToConnectionFactor() <em>Karma To Connection Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKarmaToConnectionFactor()
     * @generated
     * @ordered
     */
    protected static final int KARMA_TO_CONNECTION_FACTOR_EDEFAULT = 0;
    /**
     * The cached value of the '{@link #getKarmaToConnectionFactor() <em>Karma To Connection Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKarmaToConnectionFactor()
     * @generated
     * @ordered
     */
    protected int karmaToConnectionFactor = KARMA_TO_CONNECTION_FACTOR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Shr5SystemImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.SHR5_SYSTEM;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getKarmaToResourceFactor() {
        return karmaToResourceFactor;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setKarmaToResourceFactor(int newKarmaToResourceFactor) {
        int oldKarmaToResourceFactor = karmaToResourceFactor;
        karmaToResourceFactor = newKarmaToResourceFactor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_RESOURCE_FACTOR, oldKarmaToResourceFactor, karmaToResourceFactor));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getKarmaToMagicFactor() {
        return karmaToMagicFactor;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setKarmaToMagicFactor(int newKarmaToMagicFactor) {
        int oldKarmaToMagicFactor = karmaToMagicFactor;
        karmaToMagicFactor = newKarmaToMagicFactor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_MAGIC_FACTOR, oldKarmaToMagicFactor, karmaToMagicFactor));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getNumberOfMaxAttributes() {
        return numberOfMaxAttributes;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setNumberOfMaxAttributes(int newNumberOfMaxAttributes) {
        int oldNumberOfMaxAttributes = numberOfMaxAttributes;
        numberOfMaxAttributes = newNumberOfMaxAttributes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_SYSTEM__NUMBER_OF_MAX_ATTRIBUTES, oldNumberOfMaxAttributes, numberOfMaxAttributes));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getKnowlegeSkillFactor() {
        return knowlegeSkillFactor;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setKnowlegeSkillFactor(int newKnowlegeSkillFactor) {
        int oldKnowlegeSkillFactor = knowlegeSkillFactor;
        knowlegeSkillFactor = newKnowlegeSkillFactor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_SYSTEM__KNOWLEGE_SKILL_FACTOR, oldKnowlegeSkillFactor, knowlegeSkillFactor));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getCharismaToConnectionFactor() {
        return charismaToConnectionFactor;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCharismaToConnectionFactor(int newCharismaToConnectionFactor) {
        int oldCharismaToConnectionFactor = charismaToConnectionFactor;
        charismaToConnectionFactor = newCharismaToConnectionFactor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_SYSTEM__CHARISMA_TO_CONNECTION_FACTOR, oldCharismaToConnectionFactor, charismaToConnectionFactor));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaxResourceToKeep() {
        return maxResourceToKeep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxResourceToKeep(int newMaxResourceToKeep) {
        int oldMaxResourceToKeep = maxResourceToKeep;
        maxResourceToKeep = newMaxResourceToKeep;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_SYSTEM__MAX_RESOURCE_TO_KEEP, oldMaxResourceToKeep, maxResourceToKeep));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaxKarmaToResources() {
        return maxKarmaToResources;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxKarmaToResources(int newMaxKarmaToResources) {
        int oldMaxKarmaToResources = maxKarmaToResources;
        maxKarmaToResources = newMaxKarmaToResources;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_SYSTEM__MAX_KARMA_TO_RESOURCES, oldMaxKarmaToResources, maxKarmaToResources));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaxKarmaToKeep() {
        return maxKarmaToKeep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxKarmaToKeep(int newMaxKarmaToKeep) {
        int oldMaxKarmaToKeep = maxKarmaToKeep;
        maxKarmaToKeep = newMaxKarmaToKeep;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_SYSTEM__MAX_KARMA_TO_KEEP, oldMaxKarmaToKeep, maxKarmaToKeep));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSkillMax() {
        return skillMax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSkillMax(int newSkillMax) {
        int oldSkillMax = skillMax;
        skillMax = newSkillMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_SYSTEM__SKILL_MAX, oldSkillMax, skillMax));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getNumberOfSpecalism() {
        return numberOfSpecalism;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNumberOfSpecalism(int newNumberOfSpecalism) {
        int oldNumberOfSpecalism = numberOfSpecalism;
        numberOfSpecalism = newNumberOfSpecalism;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_SYSTEM__NUMBER_OF_SPECALISM, oldNumberOfSpecalism, numberOfSpecalism));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getKarmaToConnectionFactor() {
        return karmaToConnectionFactor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKarmaToConnectionFactor(int newKarmaToConnectionFactor) {
        int oldKarmaToConnectionFactor = karmaToConnectionFactor;
        karmaToConnectionFactor = newKarmaToConnectionFactor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_CONNECTION_FACTOR, oldKarmaToConnectionFactor, karmaToConnectionFactor));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_RESOURCE_FACTOR:
                return getKarmaToResourceFactor();
            case Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_MAGIC_FACTOR:
                return getKarmaToMagicFactor();
            case Shr5managementPackage.SHR5_SYSTEM__NUMBER_OF_MAX_ATTRIBUTES:
                return getNumberOfMaxAttributes();
            case Shr5managementPackage.SHR5_SYSTEM__KNOWLEGE_SKILL_FACTOR:
                return getKnowlegeSkillFactor();
            case Shr5managementPackage.SHR5_SYSTEM__CHARISMA_TO_CONNECTION_FACTOR:
                return getCharismaToConnectionFactor();
            case Shr5managementPackage.SHR5_SYSTEM__MAX_RESOURCE_TO_KEEP:
                return getMaxResourceToKeep();
            case Shr5managementPackage.SHR5_SYSTEM__MAX_KARMA_TO_RESOURCES:
                return getMaxKarmaToResources();
            case Shr5managementPackage.SHR5_SYSTEM__MAX_KARMA_TO_KEEP:
                return getMaxKarmaToKeep();
            case Shr5managementPackage.SHR5_SYSTEM__SKILL_MAX:
                return getSkillMax();
            case Shr5managementPackage.SHR5_SYSTEM__NUMBER_OF_SPECALISM:
                return getNumberOfSpecalism();
            case Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_CONNECTION_FACTOR:
                return getKarmaToConnectionFactor();
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
            case Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_RESOURCE_FACTOR:
                setKarmaToResourceFactor((Integer)newValue);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_MAGIC_FACTOR:
                setKarmaToMagicFactor((Integer)newValue);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__NUMBER_OF_MAX_ATTRIBUTES:
                setNumberOfMaxAttributes((Integer)newValue);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__KNOWLEGE_SKILL_FACTOR:
                setKnowlegeSkillFactor((Integer)newValue);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__CHARISMA_TO_CONNECTION_FACTOR:
                setCharismaToConnectionFactor((Integer)newValue);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__MAX_RESOURCE_TO_KEEP:
                setMaxResourceToKeep((Integer)newValue);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__MAX_KARMA_TO_RESOURCES:
                setMaxKarmaToResources((Integer)newValue);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__MAX_KARMA_TO_KEEP:
                setMaxKarmaToKeep((Integer)newValue);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__SKILL_MAX:
                setSkillMax((Integer)newValue);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__NUMBER_OF_SPECALISM:
                setNumberOfSpecalism((Integer)newValue);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_CONNECTION_FACTOR:
                setKarmaToConnectionFactor((Integer)newValue);
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
            case Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_RESOURCE_FACTOR:
                setKarmaToResourceFactor(KARMA_TO_RESOURCE_FACTOR_EDEFAULT);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_MAGIC_FACTOR:
                setKarmaToMagicFactor(KARMA_TO_MAGIC_FACTOR_EDEFAULT);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__NUMBER_OF_MAX_ATTRIBUTES:
                setNumberOfMaxAttributes(NUMBER_OF_MAX_ATTRIBUTES_EDEFAULT);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__KNOWLEGE_SKILL_FACTOR:
                setKnowlegeSkillFactor(KNOWLEGE_SKILL_FACTOR_EDEFAULT);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__CHARISMA_TO_CONNECTION_FACTOR:
                setCharismaToConnectionFactor(CHARISMA_TO_CONNECTION_FACTOR_EDEFAULT);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__MAX_RESOURCE_TO_KEEP:
                setMaxResourceToKeep(MAX_RESOURCE_TO_KEEP_EDEFAULT);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__MAX_KARMA_TO_RESOURCES:
                setMaxKarmaToResources(MAX_KARMA_TO_RESOURCES_EDEFAULT);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__MAX_KARMA_TO_KEEP:
                setMaxKarmaToKeep(MAX_KARMA_TO_KEEP_EDEFAULT);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__SKILL_MAX:
                setSkillMax(SKILL_MAX_EDEFAULT);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__NUMBER_OF_SPECALISM:
                setNumberOfSpecalism(NUMBER_OF_SPECALISM_EDEFAULT);
                return;
            case Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_CONNECTION_FACTOR:
                setKarmaToConnectionFactor(KARMA_TO_CONNECTION_FACTOR_EDEFAULT);
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
            case Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_RESOURCE_FACTOR:
                return karmaToResourceFactor != KARMA_TO_RESOURCE_FACTOR_EDEFAULT;
            case Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_MAGIC_FACTOR:
                return karmaToMagicFactor != KARMA_TO_MAGIC_FACTOR_EDEFAULT;
            case Shr5managementPackage.SHR5_SYSTEM__NUMBER_OF_MAX_ATTRIBUTES:
                return numberOfMaxAttributes != NUMBER_OF_MAX_ATTRIBUTES_EDEFAULT;
            case Shr5managementPackage.SHR5_SYSTEM__KNOWLEGE_SKILL_FACTOR:
                return knowlegeSkillFactor != KNOWLEGE_SKILL_FACTOR_EDEFAULT;
            case Shr5managementPackage.SHR5_SYSTEM__CHARISMA_TO_CONNECTION_FACTOR:
                return charismaToConnectionFactor != CHARISMA_TO_CONNECTION_FACTOR_EDEFAULT;
            case Shr5managementPackage.SHR5_SYSTEM__MAX_RESOURCE_TO_KEEP:
                return maxResourceToKeep != MAX_RESOURCE_TO_KEEP_EDEFAULT;
            case Shr5managementPackage.SHR5_SYSTEM__MAX_KARMA_TO_RESOURCES:
                return maxKarmaToResources != MAX_KARMA_TO_RESOURCES_EDEFAULT;
            case Shr5managementPackage.SHR5_SYSTEM__MAX_KARMA_TO_KEEP:
                return maxKarmaToKeep != MAX_KARMA_TO_KEEP_EDEFAULT;
            case Shr5managementPackage.SHR5_SYSTEM__SKILL_MAX:
                return skillMax != SKILL_MAX_EDEFAULT;
            case Shr5managementPackage.SHR5_SYSTEM__NUMBER_OF_SPECALISM:
                return numberOfSpecalism != NUMBER_OF_SPECALISM_EDEFAULT;
            case Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_CONNECTION_FACTOR:
                return karmaToConnectionFactor != KARMA_TO_CONNECTION_FACTOR_EDEFAULT;
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
        result.append(" (karmaToResourceFactor: ");
        result.append(karmaToResourceFactor);
        result.append(", karmaToMagicFactor: ");
        result.append(karmaToMagicFactor);
        result.append(", numberOfMaxAttributes: ");
        result.append(numberOfMaxAttributes);
        result.append(", knowlegeSkillFactor: ");
        result.append(knowlegeSkillFactor);
        result.append(", charismaToConnectionFactor: ");
        result.append(charismaToConnectionFactor);
        result.append(", maxResourceToKeep: ");
        result.append(maxResourceToKeep);
        result.append(", maxKarmaToResources: ");
        result.append(maxKarmaToResources);
        result.append(", maxKarmaToKeep: ");
        result.append(maxKarmaToKeep);
        result.append(", skillMax: ");
        result.append(skillMax);
        result.append(", numberOfSpecalism: ");
        result.append(numberOfSpecalism);
        result.append(", karmaToConnectionFactor: ");
        result.append(karmaToConnectionFactor);
        result.append(')');
        return result.toString();
    }

} //Shr5SystemImpl
