/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Fahrzeug;
import de.urszeidler.eclipse.shr5.Lifestyle;
import de.urszeidler.eclipse.shr5.Sprachfertigkeit;
import de.urszeidler.eclipse.shr5.Vertrag;
import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.Connection;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Sex;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Managed Character</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl#getPersona <em>Persona</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl#getChanges <em>Changes</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl#getChracterSource <em>Chracter Source</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl#getInventar <em>Inventar</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl#getContracts <em>Contracts</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl#getVehicels <em>Vehicels</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl#getChoosenLifestyle <em>Choosen Lifestyle</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl#getNativeLanguage <em>Native Language</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl#getSex <em>Sex</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl#getStreetCred <em>Street Cred</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl#getNotoriety <em>Notoriety</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl#getNotorietyBasic <em>Notoriety Basic</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl#getPublicAwareness <em>Public Awareness</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl#getKarmaGaint <em>Karma Gaint</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl#getCurrentKarma <em>Current Karma</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.ManagedCharacterImpl#getGeneratorSrc <em>Generator Src</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ManagedCharacterImpl extends MinimalEObjectImpl.Container implements ManagedCharacter {
    /**
     * The cached value of the '{@link #getPersona() <em>Persona</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPersona()
     * @generated
     * @ordered
     */
    protected AbstraktPersona persona;

    /**
     * The cached value of the '{@link #getChanges() <em>Changes</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getChanges()
     * @generated
     * @ordered
     */
    protected EList<Changes> changes;

    /**
     * The cached value of the '{@link #getChracterSource() <em>Chracter Source</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getChracterSource()
     * @generated
     * @ordered
     */
    protected CharacterGenerator chracterSource;

    /**
     * The cached value of the '{@link #getInventar() <em>Inventar</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getInventar()
     * @generated
     * @ordered
     */
    protected EList<AbstraktGegenstand> inventar;

    /**
     * The cached value of the '{@link #getContracts() <em>Contracts</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getContracts()
     * @generated
     * @ordered
     */
    protected EList<Vertrag> contracts;

    /**
     * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getConnections()
     * @generated
     * @ordered
     */
    protected EList<Connection> connections;

    /**
     * The cached value of the '{@link #getVehicels() <em>Vehicels</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getVehicels()
     * @generated
     * @ordered
     */
    protected EList<Fahrzeug> vehicels;

    /**
     * The cached value of the '{@link #getChoosenLifestyle() <em>Choosen Lifestyle</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getChoosenLifestyle()
     * @generated
     * @ordered
     */
    protected Lifestyle choosenLifestyle;

    /**
     * The cached value of the '{@link #getNativeLanguage() <em>Native Language</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getNativeLanguage()
     * @generated
     * @ordered
     */
    protected Sprachfertigkeit nativeLanguage;

    /**
     * The default value of the '{@link #getSex() <em>Sex</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSex()
     * @generated
     * @ordered
     */
    protected static final Sex SEX_EDEFAULT = Sex.FEMALE;

    /**
     * The cached value of the '{@link #getSex() <em>Sex</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSex()
     * @generated
     * @ordered
     */
    protected Sex sex = SEX_EDEFAULT;

    /**
     * The default value of the '{@link #getStreetCred() <em>Street Cred</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getStreetCred()
     * @generated
     * @ordered
     */
    protected static final int STREET_CRED_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getNotoriety() <em>Notoriety</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getNotoriety()
     * @generated
     * @ordered
     */
    protected static final int NOTORIETY_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getNotorietyBasic() <em>Notoriety Basic</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getNotorietyBasic()
     * @generated
     * @ordered
     */
    protected static final int NOTORIETY_BASIC_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getNotorietyBasic() <em>Notoriety Basic</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getNotorietyBasic()
     * @generated
     * @ordered
     */
    protected int notorietyBasic = NOTORIETY_BASIC_EDEFAULT;

    /**
     * The default value of the '{@link #getPublicAwareness() <em>Public Awareness</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublicAwareness()
     * @generated
     * @ordered
     */
    protected static final int PUBLIC_AWARENESS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPublicAwareness() <em>Public Awareness</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPublicAwareness()
     * @generated
     * @ordered
     */
    protected int publicAwareness = PUBLIC_AWARENESS_EDEFAULT;

    /**
     * The default value of the '{@link #getKarmaGaint() <em>Karma Gaint</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getKarmaGaint()
     * @generated
     * @ordered
     */
    protected static final int KARMA_GAINT_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getCurrentKarma() <em>Current Karma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentKarma()
     * @generated
     * @ordered
     */
    protected static final int CURRENT_KARMA_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getGeneratorSrc() <em>Generator Src</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneratorSrc()
     * @generated
     * @ordered
     */
    protected CharacterGenerator generatorSrc;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ManagedCharacterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.MANAGED_CHARACTER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AbstraktPersona getPersona() {
        return persona;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPersona(AbstraktPersona newPersona, NotificationChain msgs) {
        AbstraktPersona oldPersona = persona;
        persona = newPersona;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MANAGED_CHARACTER__PERSONA, oldPersona, newPersona);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPersona(AbstraktPersona newPersona) {
        if (newPersona != persona) {
            NotificationChain msgs = null;
            if (persona != null)
                msgs = ((InternalEObject)persona).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5managementPackage.MANAGED_CHARACTER__PERSONA, null, msgs);
            if (newPersona != null)
                msgs = ((InternalEObject)newPersona).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Shr5managementPackage.MANAGED_CHARACTER__PERSONA, null, msgs);
            msgs = basicSetPersona(newPersona, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MANAGED_CHARACTER__PERSONA, newPersona, newPersona));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Changes> getChanges() {
        if (changes == null) {
            changes = new EObjectContainmentWithInverseEList<Changes>(Changes.class, this, Shr5managementPackage.MANAGED_CHARACTER__CHANGES, Shr5managementPackage.CHANGES__CHARACTER);
        }
        return changes;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public CharacterGenerator getChracterSource() {
        if (chracterSource != null && chracterSource.eIsProxy()) {
            InternalEObject oldChracterSource = (InternalEObject)chracterSource;
            chracterSource = (CharacterGenerator)eResolveProxy(oldChracterSource);
            if (chracterSource != oldChracterSource) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.MANAGED_CHARACTER__CHRACTER_SOURCE, oldChracterSource, chracterSource));
            }
        }
        return chracterSource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public CharacterGenerator basicGetChracterSource() {
        return chracterSource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChracterSource(CharacterGenerator newChracterSource, NotificationChain msgs) {
        CharacterGenerator oldChracterSource = chracterSource;
        chracterSource = newChracterSource;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MANAGED_CHARACTER__CHRACTER_SOURCE, oldChracterSource, newChracterSource);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setChracterSource(CharacterGenerator newChracterSource) {
        if (newChracterSource != chracterSource) {
            NotificationChain msgs = null;
            if (chracterSource != null)
                msgs = ((InternalEObject)chracterSource).eInverseRemove(this, Shr5managementPackage.CHARACTER_GENERATOR__CHARACTER, CharacterGenerator.class, msgs);
            if (newChracterSource != null)
                msgs = ((InternalEObject)newChracterSource).eInverseAdd(this, Shr5managementPackage.CHARACTER_GENERATOR__CHARACTER, CharacterGenerator.class, msgs);
            msgs = basicSetChracterSource(newChracterSource, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MANAGED_CHARACTER__CHRACTER_SOURCE, newChracterSource, newChracterSource));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstraktGegenstand> getInventar() {
        if (inventar == null) {
            inventar = new EObjectContainmentEList<AbstraktGegenstand>(AbstraktGegenstand.class, this, Shr5managementPackage.MANAGED_CHARACTER__INVENTAR);
        }
        return inventar;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Vertrag> getContracts() {
        if (contracts == null) {
            contracts = new EObjectContainmentEList<Vertrag>(Vertrag.class, this, Shr5managementPackage.MANAGED_CHARACTER__CONTRACTS);
        }
        return contracts;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSex(Sex newSex) {
        Sex oldSex = sex;
        sex = newSex == null ? SEX_EDEFAULT : newSex;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MANAGED_CHARACTER__SEX, oldSex, sex));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Connection> getConnections() {
        if (connections == null) {
            connections = new EObjectContainmentEList<Connection>(Connection.class, this, Shr5managementPackage.MANAGED_CHARACTER__CONNECTIONS);
        }
        return connections;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Fahrzeug> getVehicels() {
        if (vehicels == null) {
            vehicels = new EObjectContainmentEList<Fahrzeug>(Fahrzeug.class, this, Shr5managementPackage.MANAGED_CHARACTER__VEHICELS);
        }
        return vehicels;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Lifestyle getChoosenLifestyle() {
        if (choosenLifestyle != null && choosenLifestyle.eIsProxy()) {
            InternalEObject oldChoosenLifestyle = (InternalEObject)choosenLifestyle;
            choosenLifestyle = (Lifestyle)eResolveProxy(oldChoosenLifestyle);
            if (choosenLifestyle != oldChoosenLifestyle) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.MANAGED_CHARACTER__CHOOSEN_LIFESTYLE, oldChoosenLifestyle, choosenLifestyle));
            }
        }
        return choosenLifestyle;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Lifestyle basicGetChoosenLifestyle() {
        return choosenLifestyle;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setChoosenLifestyle(Lifestyle newChoosenLifestyle) {
        Lifestyle oldChoosenLifestyle = choosenLifestyle;
        choosenLifestyle = newChoosenLifestyle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MANAGED_CHARACTER__CHOOSEN_LIFESTYLE, oldChoosenLifestyle, choosenLifestyle));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Sprachfertigkeit getNativeLanguage() {
        if (nativeLanguage != null && nativeLanguage.eIsProxy()) {
            InternalEObject oldNativeLanguage = (InternalEObject)nativeLanguage;
            nativeLanguage = (Sprachfertigkeit)eResolveProxy(oldNativeLanguage);
            if (nativeLanguage != oldNativeLanguage) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.MANAGED_CHARACTER__NATIVE_LANGUAGE, oldNativeLanguage, nativeLanguage));
            }
        }
        return nativeLanguage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Sprachfertigkeit basicGetNativeLanguage() {
        return nativeLanguage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setNativeLanguage(Sprachfertigkeit newNativeLanguage) {
        Sprachfertigkeit oldNativeLanguage = nativeLanguage;
        nativeLanguage = newNativeLanguage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MANAGED_CHARACTER__NATIVE_LANGUAGE, oldNativeLanguage, nativeLanguage));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getStreetCred() {
        return getKarmaGaint() / 10;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getNotoriety() {
        // TODO : need to calc the modificated notority
        return getNotorietyBasic();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getNotorietyBasic() {
        return notorietyBasic;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setNotorietyBasic(int newNotorietyBasic) {
        int oldNotorietyBasic = notorietyBasic;
        notorietyBasic = newNotorietyBasic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MANAGED_CHARACTER__NOTORIETY_BASIC, oldNotorietyBasic, notorietyBasic));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPublicAwareness() {
        return publicAwareness;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPublicAwareness(int newPublicAwareness) {
        int oldPublicAwareness = publicAwareness;
        publicAwareness = newPublicAwareness;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MANAGED_CHARACTER__PUBLIC_AWARENESS, oldPublicAwareness, publicAwareness));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getKarmaGaint() {
        return ShadowrunManagmentTools.getKarmaGaint(this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getCurrentKarma() {
        int addKarma = 0;

        if (getChracterSource() != null)
            if (getChracterSource() instanceof Shr5Generator) {
                Shr5Generator g = (Shr5Generator)getChracterSource();
                if (getChracterSource().getState() != GeneratorState.COMMITED) {
                    // TODO need to move karma spend in an abstracter way
                    addKarma = g.getShr5Generator().getKarmaPoints() - g.getKarmaSpend();
                    return addKarma;
                } else {
                    addKarma = g.getStartKarma();
                    return ShadowrunManagmentTools.getKarmaGaint(this) + addKarma;
                }
            }

        return ShadowrunManagmentTools.getKarmaGaint(this) + ShadowrunManagmentTools.getKarmaSpend(this) + addKarma;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CharacterGenerator getGeneratorSrc() {
        return generatorSrc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGeneratorSrc(CharacterGenerator newGeneratorSrc, NotificationChain msgs) {
        CharacterGenerator oldGeneratorSrc = generatorSrc;
        generatorSrc = newGeneratorSrc;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MANAGED_CHARACTER__GENERATOR_SRC, oldGeneratorSrc, newGeneratorSrc);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGeneratorSrc(CharacterGenerator newGeneratorSrc) {
        if (newGeneratorSrc != generatorSrc) {
            NotificationChain msgs = null;
            if (generatorSrc != null)
                msgs = ((InternalEObject)generatorSrc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Shr5managementPackage.MANAGED_CHARACTER__GENERATOR_SRC, null, msgs);
            if (newGeneratorSrc != null)
                msgs = ((InternalEObject)newGeneratorSrc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Shr5managementPackage.MANAGED_CHARACTER__GENERATOR_SRC, null, msgs);
            msgs = basicSetGeneratorSrc(newGeneratorSrc, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.MANAGED_CHARACTER__GENERATOR_SRC, newGeneratorSrc, newGeneratorSrc));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.MANAGED_CHARACTER__CHANGES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getChanges()).basicAdd(otherEnd, msgs);
            case Shr5managementPackage.MANAGED_CHARACTER__CHRACTER_SOURCE:
                if (chracterSource != null)
                    msgs = ((InternalEObject)chracterSource).eInverseRemove(this, Shr5managementPackage.CHARACTER_GENERATOR__CHARACTER, CharacterGenerator.class, msgs);
                return basicSetChracterSource((CharacterGenerator)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.MANAGED_CHARACTER__PERSONA:
                return basicSetPersona(null, msgs);
            case Shr5managementPackage.MANAGED_CHARACTER__CHANGES:
                return ((InternalEList<?>)getChanges()).basicRemove(otherEnd, msgs);
            case Shr5managementPackage.MANAGED_CHARACTER__CHRACTER_SOURCE:
                return basicSetChracterSource(null, msgs);
            case Shr5managementPackage.MANAGED_CHARACTER__INVENTAR:
                return ((InternalEList<?>)getInventar()).basicRemove(otherEnd, msgs);
            case Shr5managementPackage.MANAGED_CHARACTER__CONTRACTS:
                return ((InternalEList<?>)getContracts()).basicRemove(otherEnd, msgs);
            case Shr5managementPackage.MANAGED_CHARACTER__CONNECTIONS:
                return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
            case Shr5managementPackage.MANAGED_CHARACTER__VEHICELS:
                return ((InternalEList<?>)getVehicels()).basicRemove(otherEnd, msgs);
            case Shr5managementPackage.MANAGED_CHARACTER__GENERATOR_SRC:
                return basicSetGeneratorSrc(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.MANAGED_CHARACTER__PERSONA:
                return getPersona();
            case Shr5managementPackage.MANAGED_CHARACTER__CHANGES:
                return getChanges();
            case Shr5managementPackage.MANAGED_CHARACTER__CHRACTER_SOURCE:
                if (resolve) return getChracterSource();
                return basicGetChracterSource();
            case Shr5managementPackage.MANAGED_CHARACTER__INVENTAR:
                return getInventar();
            case Shr5managementPackage.MANAGED_CHARACTER__CONTRACTS:
                return getContracts();
            case Shr5managementPackage.MANAGED_CHARACTER__CONNECTIONS:
                return getConnections();
            case Shr5managementPackage.MANAGED_CHARACTER__VEHICELS:
                return getVehicels();
            case Shr5managementPackage.MANAGED_CHARACTER__CHOOSEN_LIFESTYLE:
                if (resolve) return getChoosenLifestyle();
                return basicGetChoosenLifestyle();
            case Shr5managementPackage.MANAGED_CHARACTER__NATIVE_LANGUAGE:
                if (resolve) return getNativeLanguage();
                return basicGetNativeLanguage();
            case Shr5managementPackage.MANAGED_CHARACTER__SEX:
                return getSex();
            case Shr5managementPackage.MANAGED_CHARACTER__STREET_CRED:
                return getStreetCred();
            case Shr5managementPackage.MANAGED_CHARACTER__NOTORIETY:
                return getNotoriety();
            case Shr5managementPackage.MANAGED_CHARACTER__NOTORIETY_BASIC:
                return getNotorietyBasic();
            case Shr5managementPackage.MANAGED_CHARACTER__PUBLIC_AWARENESS:
                return getPublicAwareness();
            case Shr5managementPackage.MANAGED_CHARACTER__KARMA_GAINT:
                return getKarmaGaint();
            case Shr5managementPackage.MANAGED_CHARACTER__CURRENT_KARMA:
                return getCurrentKarma();
            case Shr5managementPackage.MANAGED_CHARACTER__GENERATOR_SRC:
                return getGeneratorSrc();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5managementPackage.MANAGED_CHARACTER__PERSONA:
                setPersona((AbstraktPersona)newValue);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__CHANGES:
                getChanges().clear();
                getChanges().addAll((Collection<? extends Changes>)newValue);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__CHRACTER_SOURCE:
                setChracterSource((CharacterGenerator)newValue);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__INVENTAR:
                getInventar().clear();
                getInventar().addAll((Collection<? extends AbstraktGegenstand>)newValue);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__CONTRACTS:
                getContracts().clear();
                getContracts().addAll((Collection<? extends Vertrag>)newValue);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__CONNECTIONS:
                getConnections().clear();
                getConnections().addAll((Collection<? extends Connection>)newValue);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__VEHICELS:
                getVehicels().clear();
                getVehicels().addAll((Collection<? extends Fahrzeug>)newValue);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__CHOOSEN_LIFESTYLE:
                setChoosenLifestyle((Lifestyle)newValue);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__NATIVE_LANGUAGE:
                setNativeLanguage((Sprachfertigkeit)newValue);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__SEX:
                setSex((Sex)newValue);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__NOTORIETY_BASIC:
                setNotorietyBasic((Integer)newValue);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__PUBLIC_AWARENESS:
                setPublicAwareness((Integer)newValue);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__GENERATOR_SRC:
                setGeneratorSrc((CharacterGenerator)newValue);
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
            case Shr5managementPackage.MANAGED_CHARACTER__PERSONA:
                setPersona((AbstraktPersona)null);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__CHANGES:
                getChanges().clear();
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__CHRACTER_SOURCE:
                setChracterSource((CharacterGenerator)null);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__INVENTAR:
                getInventar().clear();
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__CONTRACTS:
                getContracts().clear();
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__CONNECTIONS:
                getConnections().clear();
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__VEHICELS:
                getVehicels().clear();
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__CHOOSEN_LIFESTYLE:
                setChoosenLifestyle((Lifestyle)null);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__NATIVE_LANGUAGE:
                setNativeLanguage((Sprachfertigkeit)null);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__SEX:
                setSex(SEX_EDEFAULT);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__NOTORIETY_BASIC:
                setNotorietyBasic(NOTORIETY_BASIC_EDEFAULT);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__PUBLIC_AWARENESS:
                setPublicAwareness(PUBLIC_AWARENESS_EDEFAULT);
                return;
            case Shr5managementPackage.MANAGED_CHARACTER__GENERATOR_SRC:
                setGeneratorSrc((CharacterGenerator)null);
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
            case Shr5managementPackage.MANAGED_CHARACTER__PERSONA:
                return persona != null;
            case Shr5managementPackage.MANAGED_CHARACTER__CHANGES:
                return changes != null && !changes.isEmpty();
            case Shr5managementPackage.MANAGED_CHARACTER__CHRACTER_SOURCE:
                return chracterSource != null;
            case Shr5managementPackage.MANAGED_CHARACTER__INVENTAR:
                return inventar != null && !inventar.isEmpty();
            case Shr5managementPackage.MANAGED_CHARACTER__CONTRACTS:
                return contracts != null && !contracts.isEmpty();
            case Shr5managementPackage.MANAGED_CHARACTER__CONNECTIONS:
                return connections != null && !connections.isEmpty();
            case Shr5managementPackage.MANAGED_CHARACTER__VEHICELS:
                return vehicels != null && !vehicels.isEmpty();
            case Shr5managementPackage.MANAGED_CHARACTER__CHOOSEN_LIFESTYLE:
                return choosenLifestyle != null;
            case Shr5managementPackage.MANAGED_CHARACTER__NATIVE_LANGUAGE:
                return nativeLanguage != null;
            case Shr5managementPackage.MANAGED_CHARACTER__SEX:
                return sex != SEX_EDEFAULT;
            case Shr5managementPackage.MANAGED_CHARACTER__STREET_CRED:
                return getStreetCred() != STREET_CRED_EDEFAULT;
            case Shr5managementPackage.MANAGED_CHARACTER__NOTORIETY:
                return getNotoriety() != NOTORIETY_EDEFAULT;
            case Shr5managementPackage.MANAGED_CHARACTER__NOTORIETY_BASIC:
                return notorietyBasic != NOTORIETY_BASIC_EDEFAULT;
            case Shr5managementPackage.MANAGED_CHARACTER__PUBLIC_AWARENESS:
                return publicAwareness != PUBLIC_AWARENESS_EDEFAULT;
            case Shr5managementPackage.MANAGED_CHARACTER__KARMA_GAINT:
                return getKarmaGaint() != KARMA_GAINT_EDEFAULT;
            case Shr5managementPackage.MANAGED_CHARACTER__CURRENT_KARMA:
                return getCurrentKarma() != CURRENT_KARMA_EDEFAULT;
            case Shr5managementPackage.MANAGED_CHARACTER__GENERATOR_SRC:
                return generatorSrc != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (sex: ");
        result.append(sex);
        result.append(", notorietyBasic: ");
        result.append(notorietyBasic);
        result.append(", publicAwareness: ");
        result.append(publicAwareness);
        result.append(')');
        return result.toString();
    }

} // ManagedCharacterImpl
