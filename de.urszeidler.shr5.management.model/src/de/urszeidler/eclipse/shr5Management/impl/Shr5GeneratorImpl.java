/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.GebundenerGeist;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.MysticAdept;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaMartialartStyle;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Zauberer;
import de.urszeidler.eclipse.shr5Management.Adept;
import de.urszeidler.eclipse.shr5Management.Attributes;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.MetaType;
import de.urszeidler.eclipse.shr5Management.ModelPlugin;
import de.urszeidler.eclipse.shr5Management.Resourcen;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.Skill;
import de.urszeidler.eclipse.shr5Management.SpecialType;
import de.urszeidler.eclipse.shr5Management.Spellcaster;
import de.urszeidler.eclipse.shr5Management.Technomancer;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Shr5 Generator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getResourcen <em>Resourcen</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getMetaType <em>Meta Type</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getMagic <em>Magic</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getKarmaToResource <em>Karma To Resource</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getKarmaSpend <em>Karma Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getAttributeSpend <em>Attribute Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getResourceSpend <em>Resource Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getConnectionSpend <em>Connection Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getSkillPointSpend <em>Skill Point Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getSpecialPointSpend <em>Special Point Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getGroupPointSpend <em>Group Point Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getKnownlegePointSpend <em>Knownlege Point Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getSpellPointSpend <em>Spell Point Spend</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getStartKarma <em>Start Karma</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.Shr5GeneratorImpl#getStartResources <em>Start Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Shr5GeneratorImpl extends Shr5RuleGeneratorImpl<Shr5System> implements Shr5Generator {
    /**
     * The cached value of the '{@link #getResourcen() <em>Resourcen</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getResourcen()
     * @generated
     * @ordered
     */
    protected Resourcen resourcen;

    /**
     * The cached value of the '{@link #getSkills() <em>Skills</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSkills()
     * @generated
     * @ordered
     */
    protected Skill skills;

    /**
     * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAttribute()
     * @generated
     * @ordered
     */
    protected Attributes attribute;

    /**
     * The cached value of the '{@link #getMetaType() <em>Meta Type</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMetaType()
     * @generated
     * @ordered
     */
    protected MetaType metaType;

    /**
     * The cached value of the '{@link #getMagic() <em>Magic</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMagic()
     * @generated
     * @ordered
     */
    protected SpecialType magic;

    /**
     * The default value of the '{@link #getKarmaToResource() <em>Karma To Resource</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getKarmaToResource()
     * @generated
     * @ordered
     */
    protected static final int KARMA_TO_RESOURCE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getKarmaToResource() <em>Karma To Resource</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getKarmaToResource()
     * @generated
     * @ordered
     */
    protected int karmaToResource = KARMA_TO_RESOURCE_EDEFAULT;

    /**
     * The default value of the '{@link #getKarmaSpend() <em>Karma Spend</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getKarmaSpend()
     * @generated
     * @ordered
     */
    protected static final int KARMA_SPEND_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getAttributeSpend() <em>Attribute Spend</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeSpend()
     * @generated
     * @ordered
     */
    protected static final int ATTRIBUTE_SPEND_EDEFAULT = 0;

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
     * The default value of the '{@link #getConnectionSpend() <em>Connection Spend</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionSpend()
     * @generated
     * @ordered
     */
    protected static final int CONNECTION_SPEND_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getSkillPointSpend() <em>Skill Point Spend</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSkillPointSpend()
     * @generated
     * @ordered
     */
    protected static final int SKILL_POINT_SPEND_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getSpecialPointSpend() <em>Special Point Spend</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecialPointSpend()
     * @generated
     * @ordered
     */
    protected static final int SPECIAL_POINT_SPEND_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getGroupPointSpend() <em>Group Point Spend</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroupPointSpend()
     * @generated
     * @ordered
     */
    protected static final int GROUP_POINT_SPEND_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getKnownlegePointSpend() <em>Knownlege Point Spend</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKnownlegePointSpend()
     * @generated
     * @ordered
     */
    protected static final int KNOWNLEGE_POINT_SPEND_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getSpellPointSpend() <em>Spell Point Spend</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpellPointSpend()
     * @generated
     * @ordered
     */
    protected static final int SPELL_POINT_SPEND_EDEFAULT = 0;

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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected Shr5GeneratorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.SHR5_GENERATOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Resourcen getResourcen() {
        if (resourcen != null && resourcen.eIsProxy()) {
            InternalEObject oldResourcen = (InternalEObject)resourcen;
            resourcen = (Resourcen)eResolveProxy(oldResourcen);
            if (resourcen != oldResourcen) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.SHR5_GENERATOR__RESOURCEN, oldResourcen, resourcen));
            }
        }
        return resourcen;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Resourcen basicGetResourcen() {
        return resourcen;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResourcen(Resourcen newResourcen) {
        Resourcen oldResourcen = resourcen;
        resourcen = newResourcen;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_GENERATOR__RESOURCEN, oldResourcen, resourcen));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Skill getSkills() {
        if (skills != null && skills.eIsProxy()) {
            InternalEObject oldSkills = (InternalEObject)skills;
            skills = (Skill)eResolveProxy(oldSkills);
            if (skills != oldSkills) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.SHR5_GENERATOR__SKILLS, oldSkills, skills));
            }
        }
        return skills;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Skill basicGetSkills() {
        return skills;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSkills(Skill newSkills) {
        Skill oldSkills = skills;
        skills = newSkills;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_GENERATOR__SKILLS, oldSkills, skills));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Attributes getAttribute() {
        if (attribute != null && attribute.eIsProxy()) {
            InternalEObject oldAttribute = (InternalEObject)attribute;
            attribute = (Attributes)eResolveProxy(oldAttribute);
            if (attribute != oldAttribute) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.SHR5_GENERATOR__ATTRIBUTE, oldAttribute, attribute));
            }
        }
        return attribute;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Attributes basicGetAttribute() {
        return attribute;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAttribute(Attributes newAttribute) {
        Attributes oldAttribute = attribute;
        attribute = newAttribute;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_GENERATOR__ATTRIBUTE, oldAttribute, attribute));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MetaType getMetaType() {
        if (metaType != null && metaType.eIsProxy()) {
            InternalEObject oldMetaType = (InternalEObject)metaType;
            metaType = (MetaType)eResolveProxy(oldMetaType);
            if (metaType != oldMetaType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.SHR5_GENERATOR__META_TYPE, oldMetaType, metaType));
            }
        }
        return metaType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MetaType basicGetMetaType() {
        return metaType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMetaType(MetaType newMetaType) {
        MetaType oldMetaType = metaType;
        metaType = newMetaType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_GENERATOR__META_TYPE, oldMetaType, metaType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SpecialType getMagic() {
        if (magic != null && magic.eIsProxy()) {
            InternalEObject oldMagic = (InternalEObject)magic;
            magic = (SpecialType)eResolveProxy(oldMagic);
            if (magic != oldMagic) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.SHR5_GENERATOR__MAGIC, oldMagic, magic));
            }
        }
        return magic;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SpecialType basicGetMagic() {
        return magic;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMagic(SpecialType newMagic) {
        SpecialType oldMagic = magic;
        magic = newMagic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_GENERATOR__MAGIC, oldMagic, magic));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getKarmaToResource() {
        return karmaToResource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void setKarmaToResource(int newKarmaToResource) {
        int oldKarmaToResource = karmaToResource;
        karmaToResource = newKarmaToResource;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_GENERATOR__KARMA_TO_RESOURCE, oldKarmaToResource,
                    karmaToResource));
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_GENERATOR__KARMA_SPEND, oldKarmaToResource,
                    karmaToResource));
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_GENERATOR__RESOURCE_SPEND, oldKarmaToResource,
                    karmaToResource));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getKarmaSpend() {
        if (getCharacter() == null || getCharacter().getPersona() == null)
            return 0;
        int karmaKosten = 0;
        AbstraktPersona persona = getCharacter().getPersona();
        if (persona instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)persona;
            karmaKosten = karmaKosten + (ShadowrunManagmentTools.calcQuallityKarmaCost(kp.getEigenschaften()));
        }
        if (persona instanceof MysticAdept) {
            int sum = 0;
            MysticAdept ma = (MysticAdept)persona;
            EList<KiKraft> kikraft = ma.getKikraft();
            for (KiKraft kraft : kikraft) {
                sum = sum + kraft.getKraftpunkte();
            }
            sum = (int)Math.floor(sum / 100f);

            karmaKosten = karmaKosten + (sum * getGenerator().getKarmaToMagicFactor() * -1);
        }
        if (persona instanceof Zauberer) {
            Zauberer zauberer = (Zauberer)persona;
            EList<GebundenerGeist> gebundeneGeister = zauberer.getGebundeneGeister();
            int sum = 0;
            for (GebundenerGeist gebundenerGeist : gebundeneGeister) {
                sum = sum + gebundenerGeist.getDienste();
            }
            karmaKosten = karmaKosten + (sum * getGenerator().getBoundSprititServiceCost());
        }
        if (!persona.getMartialartStyles().isEmpty() && getGenerator().getCharacterAdvancements() != null) {
            int style = 0;
            int tequ = 0;
            IncreaseCharacterPart mas = ShadowrunManagmentTools.findAdvancment(getGenerator().getCharacterAdvancements().getCharacterAdvancements(),
                    Shr5Package.Literals.PERSONA_MARTIALART_STYLE);
            IncreaseCharacterPart mat = ShadowrunManagmentTools.findAdvancment(getGenerator().getCharacterAdvancements().getCharacterAdvancements(),
                    Shr5Package.Literals.PERSONA_MARTIALART_TECHNIQUE);

            if (mas != null && mat != null) {
                for (PersonaFertigkeit pf : persona.getFertigkeiten()) {
                    ImmutableList<PersonaMartialartStyle> list = FluentIterable.from(pf.getSpezialisierungen()).filter(PersonaMartialartStyle.class)
                            .toList();
                    for (PersonaMartialartStyle ms : list) {
                        tequ += Math.max(ms.getTechniques().size()-getGenerator().getFreeMartialArtTechniques(),0);
                    }
                    style += list.size();
                }
                karmaKosten += mas.getKarmaFactor() * style + mat.getKarmaFactor() * tequ;
            }
        }

        int karmaSpend = ShadowrunManagmentTools.getKarmaSpend(getCharacter()) * -1;
        karmaKosten = karmaKosten + karmaSpend;

        int spendByConnections = 0;
        int allPoints = ShadowrunManagmentTools.calcConnectionsPoints(getCharacter(), getGenerator());
        int pointsSpend = getConnectionSpend();
        if (allPoints - pointsSpend < 0)
            spendByConnections = Math.abs(allPoints - pointsSpend);

        karmaKosten = karmaKosten + spendByConnections;
        karmaKosten = karmaKosten + getKarmaToResource();
        return karmaKosten;// Math.abs(karmaKosten) + getKarmaToResource() + Math.abs(karmaSpend) + spendByConnections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getAttributeSpend() {
        if (getAttribute() == null)
            return -1;

        return getAttribute().calcAttributesSpend(getCharacter());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getResourceSpend() {
        if (getResourcen() == null)
            return -1;

        return getResourcen().calcResourceSpend(getCharacter());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getConnectionSpend() {
        ManagedCharacter managedCharacter = getCharacter();
        if (managedCharacter == null)
            return -1;

        return ShadowrunManagmentTools.calcConnectionsSpend(managedCharacter);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getSkillPointSpend() {
        if (getSkills() == null)
            return -1;

        return getSkills().calcSkillSpend(getCharacter());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getSpecialPointSpend() {
        if (getMetaType() == null)
            return -1;

        return getMetaType().calcSpecialPointsSpend(getCharacter());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getGroupPointSpend() {
        if (getSkills() == null)
            return -1;

        return getSkills().calcGroupSpend(getCharacter());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getKnownlegePointSpend() {
        if (getSkills() == null)
            return -1;

        return getSkills().calcKnowledgeSkillSpend(getCharacter());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getSpellPointSpend() {
        if (getMagic() == null)
            return -1;

        if (getMagic() instanceof Spellcaster) {
            Spellcaster sc = (Spellcaster)getMagic();
            return sc.calcSpellPointsSpend(getCharacter());
        } else if (getMagic() instanceof Technomancer) {
            Technomancer tm = (Technomancer)getMagic();
            tm.calcComplexFormsSpend(getCharacter());
        }
        return -1;
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_GENERATOR__START_KARMA, oldStartKarma, startKarma));
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
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SHR5_GENERATOR__START_RESOURCES, oldStartResources, startResources));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasCategoryOnlyOnce(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (state == GeneratorState.COMMITED)
            return true;

        HashSet<String> set = new HashSet<String>();
        List<String> doubles = new ArrayList<String>();
        if (getMetaType() != null)
            set.add(getMetaType().getCategorieName());
        if (getAttribute() != null)
            if (!set.add(getAttribute().getCategorieName())) {
                doubles.add(getAttribute().getCategorieName());
            }
        if (getMagic() != null)
            if (!set.add(getMagic().getCategorieName())) {
                doubles.add(getMagic().getCategorieName());
            }
        if (getSkills() != null)
            if (!set.add(getSkills().getCategorieName())) {
                doubles.add(getSkills().getCategorieName());
            }
        if (getResourcen() != null)
            if (!set.add(getResourcen().getCategorieName())) {
                doubles.add(getResourcen().getCategorieName());
            }

        String doubleStr = "";
        if (!doubles.isEmpty())
            doubleStr = "Categories choosen twice: " + doubles.toString();

        if (set.size() != 5) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_CATEGORY_ONLY_ONCE, ModelPlugin.INSTANCE.getString("_UI_CategoryOnlyOnce",
                                new Object[]{ doubleStr, EObjectValidator.getObjectLabel(this, context) }), new Object[]{ this,
                                Shr5managementPackage.Literals.CHARACTER_GENERATOR__GENERATOR }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasSpendAllPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!canValidate() || getGenerator() == null || getSkills() == null || getAttribute() == null || getResourcen() == null
                || getMetaType() == null || getMagic() == null || getCharacter() == null)
            return true;

        boolean spendAll = hasSpendAllAttributesPoints(null, null) && hasSpendAllConnectionPoints(null, null) && hasSpendAllGroupPoints(null, null)
                && hasSpendAllKarmaPoints(null, null) && hasSpendAllKnowlegeSkillPoints(null, null) && hasSpendAllMagicPoints(null, null)
                && hasSpendAllMagicSkillsPoints(null, null) && hasSpendAllResourcePoints(null, null) && hasSpendAllSkillPoints(null, null)
                && hasSpendAllSpecialPoints(null, null) && hasSpendAllSpecialTypePoints(null, null) && hasSpendAllSpellPoints(null, null)
                && hasOnlyAllowedSources(null, null);

        // int karmaPoints = getShr5Generator().getKarmaPoints();
        //
        // boolean haseSpendAllPoints = false;
        // if (magic instanceof Spellcaster) {
        // Spellcaster sc = (Spellcaster)magic;
        // if (sc.calcSpellPointsSpend(getCharacter()) != sc.getSpellPoints())
        // haseSpendAllPoints = true;
        // } else if (magic instanceof Technomancer) {
        // Technomancer tm = (Technomancer)magic;
        // if (tm.calcComplexFormsSpend(getCharacter()) != tm.getComplexForms())
        // haseSpendAllPoints = true;
        // }
        //
        // int skillPoints = getSkills().getSkillPoints();
        // int groupPoints = getSkills().getGroupPoints();
        // boolean notAllSpend = haseSpendAllPoints || getKarmaSpend() != karmaPoints
        // || getAttribute().calcAttributesSpend(getCharacter()) != getAttribute().getAttibutePoints()
        // || getShr5Generator().getMaxResourceToKeep() < getResourcen().getResource() - getResourcen().calcResourceSpend(getCharacter())
        // || getMagic().calcSkillsSpend(getCharacter()) != getMagic().getSkillNumber()
        // || getMetaType().calcSpecialPointsSpend(getCharacter()) != getMetaType().getSpecialPoints()
        // || getSkills().calcSkillSpend(getCharacter()) != skillPoints || getSkills().calcGroupSpend(getCharacter()) != groupPoints;

        // System.out.println("  " + !spendAll + "  " + notAllSpend);

        if (!spendAll) {
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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasSpendAllAttributesPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getCharacter() == null || getAttribute() == null)
            return true;
        if (state == GeneratorState.COMMITED)
            return true;

        int diff = getAttribute().getAttibutePoints() - getAttributeSpend();
        if (diff != 0) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_ATTRIBUTES_POINTS, ModelPlugin.INSTANCE.getString(
                                "_UI_NotSpendAllAttributesPoints", new Object[]{ diff,
                                        diff < 0 ? ModelPlugin.INSTANCE.getString("_UI_Less") : ModelPlugin.INSTANCE.getString("_UI_More") }),
                        new Object[]{ this, Shr5managementPackage.Literals.SHR5_GENERATOR__ATTRIBUTE }));
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
    public boolean hasSpendAllSkillPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getCharacter() == null || getSkills() == null)
            return true;
        if (state == GeneratorState.COMMITED)
            return true;

        int skillPoints = getSkills().getSkillPoints();
        int groupPoints = getSkills().getGroupPoints();

        int skillLeft = skillPoints - getSkillPointSpend();
        int groupLeft = groupPoints - getSkills().calcGroupSpend(getCharacter());
        if (skillLeft != 0 || groupLeft != 0) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_SKILL_POINTS, ModelPlugin.INSTANCE.getString(
                                "_UI_NotSpendSkillAllPoints",
                                new Object[]{ skillLeft, groupLeft, "hasSpendAllSkillPoints", EObjectValidator.getObjectLabel(this, context) }),
                        new Object[]{ this, Shr5managementPackage.Literals.SHR5_GENERATOR__SKILLS }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasSpendAllSpecialPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getCharacter() == null || getMetaType() == null)
            return true;
        if (state == GeneratorState.COMMITED)
            return true;

        int diff = getMetaType().getSpecialPoints() - getSpecialPointSpend();
        if (diff != 0) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_SPECIAL_POINTS, ModelPlugin.INSTANCE.getString(
                                "_UI_NotSpendAllSpecialPoints", new Object[]{ diff,
                                        diff < 0 ? ModelPlugin.INSTANCE.getString("_UI_Less") : ModelPlugin.INSTANCE.getString("_UI_More") }),
                        new Object[]{ this, Shr5managementPackage.Literals.SHR5_GENERATOR__META_TYPE }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    @Deprecated
    public boolean hasSpendAllSpecialTypePoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getCharacter() == null || getMagic() == null)
            return true;
        if (state == GeneratorState.COMMITED)
            return true;
        //
        boolean hasSpendAllPoints = false;
        // if (magic instanceof Spellcaster) {
        // Spellcaster sc = (Spellcaster)magic;
        // if (sc.calcSpellPointsSpend(getCharacter()) != sc.getSpellPoints())
        // hasSpendAllPoints = true;
        // } else if (magic instanceof Technomancer) {
        // Technomancer tm = (Technomancer)magic;
        // if (tm.calcComplexFormsSpend(getCharacter()) != tm.getComplexForms())
        // hasSpendAllPoints = true;
        // }

        hasSpendAllPoints = hasSpendAllMagicPoints(null, null) && hasSpendAllMagicSkillsPoints(null, null);

        if (!hasSpendAllPoints) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_SPECIAL_TYPE_POINTS, ModelPlugin.INSTANCE.getString(
                                "_UI_NotSpendAllSpecialTypePoints",
                                new Object[]{ "hasSpendAllSpecialTypePoints", EObjectValidator.getObjectLabel(this, context) }), new Object[]{ this,
                                Shr5managementPackage.Literals.SHR5_GENERATOR__MAGIC }));
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
    public boolean hasSpendAllConnectionPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getCharacter() == null || getGenerator() == null)
            return true;
        if (state == GeneratorState.COMMITED)
            return true;
        ManagedCharacter managedCharacter = getCharacter();
        if (managedCharacter == null)
            return true;
        AbstraktPersona persona = managedCharacter.getPersona();
        if (persona == null)
            return true;

        int allPoints = ShadowrunManagmentTools.calcConnectionsPoints(managedCharacter, getGenerator());
        int pointsSpend = getConnectionSpend();

        int diff = allPoints - pointsSpend;
        if (diff != 0) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_CONNECTION_POINTS, ModelPlugin.INSTANCE.getString(
                                "_UI_NotSpendAllConnectionPoints", new Object[]{ diff,
                                        diff < 0 ? ModelPlugin.INSTANCE.getString("_UI_Less") : ModelPlugin.INSTANCE.getString("_UI_More") }),
                        new Object[]{ this, Shr5managementPackage.Literals.CHARACTER_GENERATOR__GENERATOR }));
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
    public boolean hasSpendAllResourcePoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getCharacter() == null || getGenerator() == null || getResourcen() == null)
            return true;
        if (state == GeneratorState.COMMITED)
            return true;

        int karma2Res = getKarmaToResource() * getGenerator().getKarmaToResourceFactor();
        int diff = karma2Res + getResourcen().getResource() - getResourceSpend();
        boolean test = getGenerator().getMaxResourceToKeep() < diff;

        if (test || diff < 0) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_RESOURCE_POINTS, ModelPlugin.INSTANCE.getString(
                                "_UI_NotSpendAllResourcePoints", new Object[]{ diff,
                                        diff < 0 ? ModelPlugin.INSTANCE.getString("_UI_Less") : ModelPlugin.INSTANCE.getString("_UI_More") }),
                        new Object[]{ this, Shr5managementPackage.Literals.SHR5_GENERATOR__RESOURCEN }));
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
    public boolean hasSpendAllMagicSkillsPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getCharacter() == null || getMagic() == null)
            return true;
        if (state == GeneratorState.COMMITED)
            return true;

        int diff = getMagic().getSkillNumber() - getMagic().calcSkillsSpend(getCharacter());
        if (diff != 0) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_MAGIC_SKILLS_POINTS, ModelPlugin.INSTANCE.getString(
                                "_UI_NotSpendAllMagicSkillsPoints", new Object[]{ diff,
                                        diff < 0 ? ModelPlugin.INSTANCE.getString("_UI_Less") : ModelPlugin.INSTANCE.getString("_UI_More"),
                                        "hasSpendAllMagicSkillsPoints", EObjectValidator.getObjectLabel(this, context) }), new Object[]{ this,
                                Shr5managementPackage.Literals.SHR5_GENERATOR__MAGIC }));
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
    public boolean hasSpendAllMagicPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getCharacter() == null || getMagic() == null)
            return true;
        if (state == GeneratorState.COMMITED)
            return true;

        int diff = getMagic().getSkillNumber() - getMagic().calcSkillsSpend(getCharacter());
        if (diff != 0) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_MAGIC_POINTS, ModelPlugin.INSTANCE.getString(
                                "_UI_NotSpendAllMagicPoints", new Object[]{ diff,
                                        diff < 0 ? ModelPlugin.INSTANCE.getString("_UI_Less") : ModelPlugin.INSTANCE.getString("_UI_More"),
                                        "hasSpendAllMagicPoints", EObjectValidator.getObjectLabel(this, context) }), new Object[]{ this,
                                Shr5managementPackage.Literals.SHR5_GENERATOR__MAGIC }));
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
    public boolean hasSpendAllGroupPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getCharacter() == null || getSkills() == null)
            return true;
        if (state == GeneratorState.COMMITED)
            return true;

        int groupPoints = getSkills().getGroupPoints();

        int diff = groupPoints - getSkills().calcGroupSpend(getCharacter());
        if (diff != 0) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_GROUP_POINTS, ModelPlugin.INSTANCE.getString(
                                "_UI_NotSpendAllGroupPoints", new Object[]{ diff,
                                        diff < 0 ? ModelPlugin.INSTANCE.getString("_UI_Less") : ModelPlugin.INSTANCE.getString("_UI_More"),
                                        "hasSpendAllGroupPoints", EObjectValidator.getObjectLabel(this, context) }), new Object[]{ this,
                                Shr5managementPackage.Literals.SHR5_GENERATOR__SKILLS }));
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
    public boolean hasSpendAllKnowlegeSkillPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getCharacter() == null || getSkills() == null)
            return true;
        if (state == GeneratorState.COMMITED)
            return true;
        int diff = getSkills().calcKnowledgeSkillPoints(getCharacter()) - getKnownlegePointSpend();

        if (diff != 0) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_KNOWLEGE_SKILL_POINTS, ModelPlugin.INSTANCE.getString(
                                "_UI_NotSpendAllKnowlegeSkillPoints", new Object[]{ diff,
                                        diff < 0 ? ModelPlugin.INSTANCE.getString("_UI_Less") : ModelPlugin.INSTANCE.getString("_UI_More"),
                                        "hasSpendAllKnowlegeSkillPoints", EObjectValidator.getObjectLabel(this, context) }), new Object[]{ this,
                                Shr5managementPackage.Literals.SHR5_GENERATOR__SKILLS }));
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
        if (getGenerator() == null || getCharacter() == null)
            return true;
        if (state == GeneratorState.COMMITED)
            return true;

        int karmaPoints = getGenerator().getKarmaPoints();
        int diff = karmaPoints - getKarmaSpend();

        boolean test = getGenerator().getMaxKarmaToKeep() < diff;

        if (test || diff < 0) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_KARMA_POINTS, ModelPlugin.INSTANCE.getString(
                                "_UI_NotSpendAllKarmaPoints", new Object[]{ diff,
                                        diff < 0 ? ModelPlugin.INSTANCE.getString("_UI_Less") : ModelPlugin.INSTANCE.getString("_UI_More"),
                                        "hasSpendAllKarmaPoints", EObjectValidator.getObjectLabel(this, context) }), new Object[]{ this,
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
    public boolean hasSpendAllSpellPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getMagic() == null || getCharacter() == null)
            return true;
        if (state == GeneratorState.COMMITED)
            return true;

        String validationMessage = null;
        boolean hasSpendAllPoints = false;
        if (getMagic() instanceof Spellcaster) {
            Spellcaster sc = (Spellcaster)magic;
            int diff = sc.getSpellPoints() - sc.calcSpellPointsSpend(getCharacter());
            if (sc.calcSpellPointsSpend(getCharacter()) == sc.getSpellPoints())
                hasSpendAllPoints = true;

            validationMessage = ModelPlugin.INSTANCE.getString("_UI_NotSpendAllSpellPoints",
                    new Object[]{ diff, diff < 0 ? ModelPlugin.INSTANCE.getString("_UI_Less") : ModelPlugin.INSTANCE.getString("_UI_More") });
        } else if (getMagic() instanceof Technomancer) {
            Technomancer tm = (Technomancer)magic;
            int diff = tm.getComplexForms() - tm.calcComplexFormsSpend(getCharacter());
            if (tm.calcComplexFormsSpend(getCharacter()) == tm.getComplexForms())
                hasSpendAllPoints = true;

            validationMessage = ModelPlugin.INSTANCE.getString("_UI_NotSpendAllFormPoints",
                    new Object[]{ diff, diff < 0 ? ModelPlugin.INSTANCE.getString("_UI_Less") : ModelPlugin.INSTANCE.getString("_UI_More") });
        } else {
            hasSpendAllPoints = true;
        }

        if (!hasSpendAllPoints) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_SPELL_POINTS, validationMessage, new Object[]{ this,
                                Shr5managementPackage.Literals.SHR5_GENERATOR__MAGIC }));
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
    public boolean hasSpendAllPowerPoints(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getMagic() == null || getCharacter() == null || getGenerator() == null || getCharacter().getPersona() == null)
            return true;
        if (state == GeneratorState.COMMITED)
            return true;

        boolean hasSpendAll = true;
        if (getMagic().eClass().equals(Shr5managementPackage.Literals.ADEPT)) {
            Adept adept = (Adept)getMagic();
            int calcPowerPointsSpend = adept.calcPowerPointsSpend(getCharacter());

            KiAdept ka = (KiAdept)getCharacter().getPersona();
            int magieBasis = ka.getMagieBasis() * 100;

            hasSpendAll = magieBasis - Math.abs(calcPowerPointsSpend) == 0;

        } else if (getMagic().eClass().equals(Shr5managementPackage.Literals.SPELLCASTER)) {
            if (getCharacter().getPersona() instanceof MysticAdept) {
//                MysticAdept ma = (MysticAdept)getCharacter().getPersona();

            }

        } else {
            hasSpendAll = true;
        }

        if (!hasSpendAll) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_GENERATOR__HAS_SPEND_ALL_POWER_POINTS, ModelPlugin.INSTANCE.getString(
                                "_UI_NotSpendAllPowerPoints",
                                new Object[]{ "hasSpendAllPowerPoints", EObjectValidator.getObjectLabel(this, context) }), new Object[]{ this,
                                Shr5managementPackage.Literals.SHR5_GENERATOR__MAGIC }));
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
    public boolean hasBasicViolations(DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (getMagic() == null || getMetaType() == null || getCharacter() == null || getGenerator() == null || getCharacter().getPersona() == null)
            return true;
        if (state == GeneratorState.COMMITED)
            return true;

        boolean sameSpecies = getMetaType().getChoosableTypes().equals(getCharacter().getPersona().getSpezies());

        if (!sameSpecies) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.SHR5_RULE_GENERATOR__HAS_BASIC_VIOLATIONS, ModelPlugin.INSTANCE.getString(
                                "_UI_GenericInvariant_diagnostic",
                                new Object[]{ "hasBasicViolations", EObjectValidator.getObjectLabel(this, context) }), new Object[]{ this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.SHR5_GENERATOR__RESOURCEN:
                if (resolve) return getResourcen();
                return basicGetResourcen();
            case Shr5managementPackage.SHR5_GENERATOR__SKILLS:
                if (resolve) return getSkills();
                return basicGetSkills();
            case Shr5managementPackage.SHR5_GENERATOR__ATTRIBUTE:
                if (resolve) return getAttribute();
                return basicGetAttribute();
            case Shr5managementPackage.SHR5_GENERATOR__META_TYPE:
                if (resolve) return getMetaType();
                return basicGetMetaType();
            case Shr5managementPackage.SHR5_GENERATOR__MAGIC:
                if (resolve) return getMagic();
                return basicGetMagic();
            case Shr5managementPackage.SHR5_GENERATOR__KARMA_TO_RESOURCE:
                return getKarmaToResource();
            case Shr5managementPackage.SHR5_GENERATOR__KARMA_SPEND:
                return getKarmaSpend();
            case Shr5managementPackage.SHR5_GENERATOR__ATTRIBUTE_SPEND:
                return getAttributeSpend();
            case Shr5managementPackage.SHR5_GENERATOR__RESOURCE_SPEND:
                return getResourceSpend();
            case Shr5managementPackage.SHR5_GENERATOR__CONNECTION_SPEND:
                return getConnectionSpend();
            case Shr5managementPackage.SHR5_GENERATOR__SKILL_POINT_SPEND:
                return getSkillPointSpend();
            case Shr5managementPackage.SHR5_GENERATOR__SPECIAL_POINT_SPEND:
                return getSpecialPointSpend();
            case Shr5managementPackage.SHR5_GENERATOR__GROUP_POINT_SPEND:
                return getGroupPointSpend();
            case Shr5managementPackage.SHR5_GENERATOR__KNOWNLEGE_POINT_SPEND:
                return getKnownlegePointSpend();
            case Shr5managementPackage.SHR5_GENERATOR__SPELL_POINT_SPEND:
                return getSpellPointSpend();
            case Shr5managementPackage.SHR5_GENERATOR__START_KARMA:
                return getStartKarma();
            case Shr5managementPackage.SHR5_GENERATOR__START_RESOURCES:
                return getStartResources();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5managementPackage.SHR5_GENERATOR__RESOURCEN:
                setResourcen((Resourcen)newValue);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__SKILLS:
                setSkills((Skill)newValue);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__ATTRIBUTE:
                setAttribute((Attributes)newValue);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__META_TYPE:
                setMetaType((MetaType)newValue);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__MAGIC:
                setMagic((SpecialType)newValue);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__KARMA_TO_RESOURCE:
                setKarmaToResource((Integer)newValue);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__START_KARMA:
                setStartKarma((Integer)newValue);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__START_RESOURCES:
                setStartResources((Integer)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.SHR5_GENERATOR__RESOURCEN:
                setResourcen((Resourcen)null);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__SKILLS:
                setSkills((Skill)null);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__ATTRIBUTE:
                setAttribute((Attributes)null);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__META_TYPE:
                setMetaType((MetaType)null);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__MAGIC:
                setMagic((SpecialType)null);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__KARMA_TO_RESOURCE:
                setKarmaToResource(KARMA_TO_RESOURCE_EDEFAULT);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__START_KARMA:
                setStartKarma(START_KARMA_EDEFAULT);
                return;
            case Shr5managementPackage.SHR5_GENERATOR__START_RESOURCES:
                setStartResources(START_RESOURCES_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.SHR5_GENERATOR__RESOURCEN:
                return resourcen != null;
            case Shr5managementPackage.SHR5_GENERATOR__SKILLS:
                return skills != null;
            case Shr5managementPackage.SHR5_GENERATOR__ATTRIBUTE:
                return attribute != null;
            case Shr5managementPackage.SHR5_GENERATOR__META_TYPE:
                return metaType != null;
            case Shr5managementPackage.SHR5_GENERATOR__MAGIC:
                return magic != null;
            case Shr5managementPackage.SHR5_GENERATOR__KARMA_TO_RESOURCE:
                return karmaToResource != KARMA_TO_RESOURCE_EDEFAULT;
            case Shr5managementPackage.SHR5_GENERATOR__KARMA_SPEND:
                return getKarmaSpend() != KARMA_SPEND_EDEFAULT;
            case Shr5managementPackage.SHR5_GENERATOR__ATTRIBUTE_SPEND:
                return getAttributeSpend() != ATTRIBUTE_SPEND_EDEFAULT;
            case Shr5managementPackage.SHR5_GENERATOR__RESOURCE_SPEND:
                return getResourceSpend() != RESOURCE_SPEND_EDEFAULT;
            case Shr5managementPackage.SHR5_GENERATOR__CONNECTION_SPEND:
                return getConnectionSpend() != CONNECTION_SPEND_EDEFAULT;
            case Shr5managementPackage.SHR5_GENERATOR__SKILL_POINT_SPEND:
                return getSkillPointSpend() != SKILL_POINT_SPEND_EDEFAULT;
            case Shr5managementPackage.SHR5_GENERATOR__SPECIAL_POINT_SPEND:
                return getSpecialPointSpend() != SPECIAL_POINT_SPEND_EDEFAULT;
            case Shr5managementPackage.SHR5_GENERATOR__GROUP_POINT_SPEND:
                return getGroupPointSpend() != GROUP_POINT_SPEND_EDEFAULT;
            case Shr5managementPackage.SHR5_GENERATOR__KNOWNLEGE_POINT_SPEND:
                return getKnownlegePointSpend() != KNOWNLEGE_POINT_SPEND_EDEFAULT;
            case Shr5managementPackage.SHR5_GENERATOR__SPELL_POINT_SPEND:
                return getSpellPointSpend() != SPELL_POINT_SPEND_EDEFAULT;
            case Shr5managementPackage.SHR5_GENERATOR__START_KARMA:
                return startKarma != START_KARMA_EDEFAULT;
            case Shr5managementPackage.SHR5_GENERATOR__START_RESOURCES:
                return startResources != START_RESOURCES_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case Shr5managementPackage.SHR5_GENERATOR___HAS_CATEGORY_ONLY_ONCE__DIAGNOSTICCHAIN_MAP:
                return hasCategoryOnlyOnce((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_SPEND_ALL_ATTRIBUTES_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasSpendAllAttributesPoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_SPEND_ALL_SKILL_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasSpendAllSkillPoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_SPEND_ALL_SPECIAL_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasSpendAllSpecialPoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_SPEND_ALL_SPECIAL_TYPE_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasSpendAllSpecialTypePoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_SPEND_ALL_CONNECTION_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasSpendAllConnectionPoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_SPEND_ALL_RESOURCE_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasSpendAllResourcePoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_SPEND_ALL_MAGIC_SKILLS_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasSpendAllMagicSkillsPoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_SPEND_ALL_MAGIC_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasSpendAllMagicPoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_SPEND_ALL_GROUP_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasSpendAllGroupPoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_SPEND_ALL_KNOWLEGE_SKILL_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasSpendAllKnowlegeSkillPoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_SPEND_ALL_KARMA_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasSpendAllKarmaPoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_SPEND_ALL_SPELL_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasSpendAllSpellPoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
            case Shr5managementPackage.SHR5_GENERATOR___HAS_SPEND_ALL_POWER_POINTS__DIAGNOSTICCHAIN_MAP:
                return hasSpendAllPowerPoints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
        }
        return super.eInvoke(operationID, arguments);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
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

} // Shr5GeneratorImpl
