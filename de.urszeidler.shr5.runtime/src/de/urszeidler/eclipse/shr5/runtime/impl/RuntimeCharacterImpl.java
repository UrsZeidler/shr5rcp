/**
 */
package de.urszeidler.eclipse.shr5.runtime.impl;

import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Kleidung;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.runtime.PhyicalState;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5.runtime.Zustand;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.RuntimeCharacterImpl#getPhysicalDamage <em>Physical Damage</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.RuntimeCharacterImpl#getMentalDamage <em>Mental Damage</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.RuntimeCharacterImpl#getZustand <em>Zustand</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.RuntimeCharacterImpl#getOverDead <em>Over Dead</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.RuntimeCharacterImpl#getCharacter <em>Character</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.RuntimeCharacterImpl#getRightHand <em>Right Hand</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.RuntimeCharacterImpl#getLeftHand <em>Left Hand</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.RuntimeCharacterImpl#getInUse <em>In Use</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.runtime.impl.RuntimeCharacterImpl#getArmor <em>Armor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuntimeCharacterImpl extends AbstractExtendetDataAwareImpl implements RuntimeCharacter {
    /**
     * The default value of the '{@link #getPhysicalDamage() <em>Physical Damage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhysicalDamage()
     * @generated
     * @ordered
     */
    protected static final int PHYSICAL_DAMAGE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPhysicalDamage() <em>Physical Damage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhysicalDamage()
     * @generated
     * @ordered
     */
    protected int physicalDamage = PHYSICAL_DAMAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getMentalDamage() <em>Mental Damage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMentalDamage()
     * @generated
     * @ordered
     */
    protected static final int MENTAL_DAMAGE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMentalDamage() <em>Mental Damage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMentalDamage()
     * @generated
     * @ordered
     */
    protected int mentalDamage = MENTAL_DAMAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getZustand() <em>Zustand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZustand()
     * @generated
     * @ordered
     */
    protected static final Zustand ZUSTAND_EDEFAULT = Zustand.OK;

    /**
     * The cached value of the '{@link #getZustand() <em>Zustand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZustand()
     * @generated
     * @ordered
     */
    protected Zustand zustand = ZUSTAND_EDEFAULT;

    /**
     * The default value of the '{@link #getOverDead() <em>Over Dead</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOverDead()
     * @generated
     * @ordered
     */
    protected static final int OVER_DEAD_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getCharacter() <em>Character</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCharacter()
     * @generated
     * @ordered
     */
    protected ManagedCharacter character;

    /**
     * The cached value of the '{@link #getRightHand() <em>Right Hand</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRightHand()
     * @generated
     * @ordered
     */
    protected AbstraktGegenstand rightHand;

    /**
     * The cached value of the '{@link #getLeftHand() <em>Left Hand</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeftHand()
     * @generated
     * @ordered
     */
    protected AbstraktGegenstand leftHand;

    /**
     * The cached value of the '{@link #getInUse() <em>In Use</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInUse()
     * @generated
     * @ordered
     */
    protected EList<AbstraktGegenstand> inUse;

    /**
     * The cached value of the '{@link #getArmor() <em>Armor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArmor()
     * @generated
     * @ordered
     */
    protected Kleidung armor;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RuntimeCharacterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RuntimePackage.Literals.RUNTIME_CHARACTER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPhysicalDamage() {
        return physicalDamage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPhysicalDamage(int newPhysicalDamage) {
        int oldPhysicalDamage = physicalDamage;
        physicalDamage = newPhysicalDamage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_CHARACTER__PHYSICAL_DAMAGE, oldPhysicalDamage, physicalDamage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMentalDamage() {
        return mentalDamage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMentalDamage(int newMentalDamage) {
        int oldMentalDamage = mentalDamage;
        mentalDamage = newMentalDamage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_CHARACTER__MENTAL_DAMAGE, oldMentalDamage, mentalDamage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Zustand getZustand() {
        return zustand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setZustand(Zustand newZustand) {
        Zustand oldZustand = zustand;
        zustand = newZustand == null ? ZUSTAND_EDEFAULT : newZustand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_CHARACTER__ZUSTAND, oldZustand, zustand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getOverDead() {
        if(getCharacter()==null || getCharacter().getPersona()==null)
            return 0;
        
        AbstraktPersona persona = getCharacter().getPersona();
        if (persona instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)persona;
            int a = getPhysicalDamage() - kp.getZustandKoerperlichMax();
            if (a > 0)
                return a;

        }
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManagedCharacter getCharacter() {
        if (character != null && character.eIsProxy()) {
            InternalEObject oldCharacter = (InternalEObject)character;
            character = (ManagedCharacter)eResolveProxy(oldCharacter);
            if (character != oldCharacter) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.RUNTIME_CHARACTER__CHARACTER, oldCharacter, character));
            }
        }
        return character;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManagedCharacter basicGetCharacter() {
        return character;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCharacter(ManagedCharacter newCharacter) {
        ManagedCharacter oldCharacter = character;
        character = newCharacter;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_CHARACTER__CHARACTER, oldCharacter, character));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstraktGegenstand getRightHand() {
        if (rightHand != null && rightHand.eIsProxy()) {
            InternalEObject oldRightHand = (InternalEObject)rightHand;
            rightHand = (AbstraktGegenstand)eResolveProxy(oldRightHand);
            if (rightHand != oldRightHand) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.RUNTIME_CHARACTER__RIGHT_HAND, oldRightHand, rightHand));
            }
        }
        return rightHand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstraktGegenstand basicGetRightHand() {
        return rightHand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRightHand(AbstraktGegenstand newRightHand) {
        AbstraktGegenstand oldRightHand = rightHand;
        rightHand = newRightHand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_CHARACTER__RIGHT_HAND, oldRightHand, rightHand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstraktGegenstand getLeftHand() {
        if (leftHand != null && leftHand.eIsProxy()) {
            InternalEObject oldLeftHand = (InternalEObject)leftHand;
            leftHand = (AbstraktGegenstand)eResolveProxy(oldLeftHand);
            if (leftHand != oldLeftHand) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.RUNTIME_CHARACTER__LEFT_HAND, oldLeftHand, leftHand));
            }
        }
        return leftHand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstraktGegenstand basicGetLeftHand() {
        return leftHand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeftHand(AbstraktGegenstand newLeftHand) {
        AbstraktGegenstand oldLeftHand = leftHand;
        leftHand = newLeftHand;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_CHARACTER__LEFT_HAND, oldLeftHand, leftHand));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstraktGegenstand> getInUse() {
        if (inUse == null) {
            inUse = new EObjectResolvingEList<AbstraktGegenstand>(AbstraktGegenstand.class, this, RuntimePackage.RUNTIME_CHARACTER__IN_USE);
        }
        return inUse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Kleidung getArmor() {
        if (armor != null && armor.eIsProxy()) {
            InternalEObject oldArmor = (InternalEObject)armor;
            armor = (Kleidung)eResolveProxy(oldArmor);
            if (armor != oldArmor) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.RUNTIME_CHARACTER__ARMOR, oldArmor, armor));
            }
        }
        return armor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Kleidung basicGetArmor() {
        return armor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setArmor(Kleidung newArmor) {
        Kleidung oldArmor = armor;
        armor = newArmor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.RUNTIME_CHARACTER__ARMOR, oldArmor, armor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RuntimePackage.RUNTIME_CHARACTER__PHYSICAL_DAMAGE:
                return getPhysicalDamage();
            case RuntimePackage.RUNTIME_CHARACTER__MENTAL_DAMAGE:
                return getMentalDamage();
            case RuntimePackage.RUNTIME_CHARACTER__ZUSTAND:
                return getZustand();
            case RuntimePackage.RUNTIME_CHARACTER__OVER_DEAD:
                return getOverDead();
            case RuntimePackage.RUNTIME_CHARACTER__CHARACTER:
                if (resolve) return getCharacter();
                return basicGetCharacter();
            case RuntimePackage.RUNTIME_CHARACTER__RIGHT_HAND:
                if (resolve) return getRightHand();
                return basicGetRightHand();
            case RuntimePackage.RUNTIME_CHARACTER__LEFT_HAND:
                if (resolve) return getLeftHand();
                return basicGetLeftHand();
            case RuntimePackage.RUNTIME_CHARACTER__IN_USE:
                return getInUse();
            case RuntimePackage.RUNTIME_CHARACTER__ARMOR:
                if (resolve) return getArmor();
                return basicGetArmor();
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
            case RuntimePackage.RUNTIME_CHARACTER__PHYSICAL_DAMAGE:
                setPhysicalDamage((Integer)newValue);
                return;
            case RuntimePackage.RUNTIME_CHARACTER__MENTAL_DAMAGE:
                setMentalDamage((Integer)newValue);
                return;
            case RuntimePackage.RUNTIME_CHARACTER__ZUSTAND:
                setZustand((Zustand)newValue);
                return;
            case RuntimePackage.RUNTIME_CHARACTER__CHARACTER:
                setCharacter((ManagedCharacter)newValue);
                return;
            case RuntimePackage.RUNTIME_CHARACTER__RIGHT_HAND:
                setRightHand((AbstraktGegenstand)newValue);
                return;
            case RuntimePackage.RUNTIME_CHARACTER__LEFT_HAND:
                setLeftHand((AbstraktGegenstand)newValue);
                return;
            case RuntimePackage.RUNTIME_CHARACTER__IN_USE:
                getInUse().clear();
                getInUse().addAll((Collection<? extends AbstraktGegenstand>)newValue);
                return;
            case RuntimePackage.RUNTIME_CHARACTER__ARMOR:
                setArmor((Kleidung)newValue);
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
            case RuntimePackage.RUNTIME_CHARACTER__PHYSICAL_DAMAGE:
                setPhysicalDamage(PHYSICAL_DAMAGE_EDEFAULT);
                return;
            case RuntimePackage.RUNTIME_CHARACTER__MENTAL_DAMAGE:
                setMentalDamage(MENTAL_DAMAGE_EDEFAULT);
                return;
            case RuntimePackage.RUNTIME_CHARACTER__ZUSTAND:
                setZustand(ZUSTAND_EDEFAULT);
                return;
            case RuntimePackage.RUNTIME_CHARACTER__CHARACTER:
                setCharacter((ManagedCharacter)null);
                return;
            case RuntimePackage.RUNTIME_CHARACTER__RIGHT_HAND:
                setRightHand((AbstraktGegenstand)null);
                return;
            case RuntimePackage.RUNTIME_CHARACTER__LEFT_HAND:
                setLeftHand((AbstraktGegenstand)null);
                return;
            case RuntimePackage.RUNTIME_CHARACTER__IN_USE:
                getInUse().clear();
                return;
            case RuntimePackage.RUNTIME_CHARACTER__ARMOR:
                setArmor((Kleidung)null);
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
            case RuntimePackage.RUNTIME_CHARACTER__PHYSICAL_DAMAGE:
                return physicalDamage != PHYSICAL_DAMAGE_EDEFAULT;
            case RuntimePackage.RUNTIME_CHARACTER__MENTAL_DAMAGE:
                return mentalDamage != MENTAL_DAMAGE_EDEFAULT;
            case RuntimePackage.RUNTIME_CHARACTER__ZUSTAND:
                return zustand != ZUSTAND_EDEFAULT;
            case RuntimePackage.RUNTIME_CHARACTER__OVER_DEAD:
                return getOverDead() != OVER_DEAD_EDEFAULT;
            case RuntimePackage.RUNTIME_CHARACTER__CHARACTER:
                return character != null;
            case RuntimePackage.RUNTIME_CHARACTER__RIGHT_HAND:
                return rightHand != null;
            case RuntimePackage.RUNTIME_CHARACTER__LEFT_HAND:
                return leftHand != null;
            case RuntimePackage.RUNTIME_CHARACTER__IN_USE:
                return inUse != null && !inUse.isEmpty();
            case RuntimePackage.RUNTIME_CHARACTER__ARMOR:
                return armor != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == PhyicalState.class) {
            switch (derivedFeatureID) {
                case RuntimePackage.RUNTIME_CHARACTER__PHYSICAL_DAMAGE: return RuntimePackage.PHYICAL_STATE__PHYSICAL_DAMAGE;
                case RuntimePackage.RUNTIME_CHARACTER__MENTAL_DAMAGE: return RuntimePackage.PHYICAL_STATE__MENTAL_DAMAGE;
                case RuntimePackage.RUNTIME_CHARACTER__ZUSTAND: return RuntimePackage.PHYICAL_STATE__ZUSTAND;
                case RuntimePackage.RUNTIME_CHARACTER__OVER_DEAD: return RuntimePackage.PHYICAL_STATE__OVER_DEAD;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == PhyicalState.class) {
            switch (baseFeatureID) {
                case RuntimePackage.PHYICAL_STATE__PHYSICAL_DAMAGE: return RuntimePackage.RUNTIME_CHARACTER__PHYSICAL_DAMAGE;
                case RuntimePackage.PHYICAL_STATE__MENTAL_DAMAGE: return RuntimePackage.RUNTIME_CHARACTER__MENTAL_DAMAGE;
                case RuntimePackage.PHYICAL_STATE__ZUSTAND: return RuntimePackage.RUNTIME_CHARACTER__ZUSTAND;
                case RuntimePackage.PHYICAL_STATE__OVER_DEAD: return RuntimePackage.RUNTIME_CHARACTER__OVER_DEAD;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (physicalDamage: ");
        result.append(physicalDamage);
        result.append(", mentalDamage: ");
        result.append(mentalDamage);
        result.append(", zustand: ");
        result.append(zustand);
        result.append(')');
        return result.toString();
    }

} // RuntimeCharacterImpl
