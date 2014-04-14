/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.BaseMagischePersona;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5Management.Adept;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.MetaType;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.SpecialType;
import de.urszeidler.eclipse.shr5Management.Technomancer;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Meta Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.MetaTypeImpl#getChoosableTypes <em>Choosable Types</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.MetaTypeImpl#getSpecialPoints <em>Special Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaTypeImpl extends PriorityCategorieImpl implements MetaType {
    /**
     * The cached value of the '{@link #getChoosableTypes() <em>Choosable Types</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getChoosableTypes()
     * @generated
     * @ordered
     */
    protected Spezies choosableTypes;

    /**
     * The default value of the '{@link #getSpecialPoints() <em>Special Points</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSpecialPoints()
     * @generated
     * @ordered
     */
    protected static final int SPECIAL_POINTS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSpecialPoints() <em>Special Points</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSpecialPoints()
     * @generated
     * @ordered
     */
    protected int specialPoints = SPECIAL_POINTS_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MetaTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.META_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Spezies getChoosableTypes() {
        if (choosableTypes != null && choosableTypes.eIsProxy()) {
            InternalEObject oldChoosableTypes = (InternalEObject)choosableTypes;
            choosableTypes = (Spezies)eResolveProxy(oldChoosableTypes);
            if (choosableTypes != oldChoosableTypes) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.META_TYPE__CHOOSABLE_TYPES, oldChoosableTypes, choosableTypes));
            }
        }
        return choosableTypes;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Spezies basicGetChoosableTypes() {
        return choosableTypes;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setChoosableTypes(Spezies newChoosableTypes) {
        Spezies oldChoosableTypes = choosableTypes;
        choosableTypes = newChoosableTypes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.META_TYPE__CHOOSABLE_TYPES, oldChoosableTypes, choosableTypes));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getSpecialPoints() {
        return specialPoints;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSpecialPoints(int newSpecialPoints) {
        int oldSpecialPoints = specialPoints;
        specialPoints = newSpecialPoints;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.META_TYPE__SPECIAL_POINTS, oldSpecialPoints, specialPoints));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int calcSpecialPointsSpend(ManagedCharacter context) {
        ManagedCharacter managedCharacter = context;
        if (managedCharacter == null)
            return 0;
        AbstraktPersona persona = managedCharacter.getPersona();
        if (persona == null)
            return 0;

        int edgeBasis = persona.getEdgeBasis();
        Spezies spezies = persona.getSpezies();
        if (spezies == null)
            return 0;

        int edgeMin = spezies.getEdgeMin();
        int edgeSpend = edgeBasis - edgeMin;
        int magicDefault = 0;
        int magicSpend = 0;

        CharacterGenerator generator = context.getChracterSource();

        if (generator instanceof Shr5Generator) {
            Shr5Generator shr5 = (Shr5Generator)generator;
            SpecialType magic = shr5.getMagic();
            if (magic instanceof Adept) {
                Adept sp = (Adept)magic;
                magicDefault = sp.getMagic();
            } else if (magic instanceof Technomancer) {
                Technomancer tm = (Technomancer)magic;
                magicDefault = tm.getResonanz();
            }
        }
        if (persona instanceof BaseMagischePersona) {
            BaseMagischePersona ma = (BaseMagischePersona)persona;
            magicSpend = ma.getMagieBasis() - magicDefault;
        } else if (persona instanceof de.urszeidler.eclipse.shr5.Technomancer) {
            de.urszeidler.eclipse.shr5.Technomancer tcm = (de.urszeidler.eclipse.shr5.Technomancer)persona;
            magicSpend = tcm.getResonanzBasis() - magicDefault;
        }

        return edgeSpend + magicSpend;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.META_TYPE__CHOOSABLE_TYPES:
                if (resolve) return getChoosableTypes();
                return basicGetChoosableTypes();
            case Shr5managementPackage.META_TYPE__SPECIAL_POINTS:
                return getSpecialPoints();
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
            case Shr5managementPackage.META_TYPE__CHOOSABLE_TYPES:
                setChoosableTypes((Spezies)newValue);
                return;
            case Shr5managementPackage.META_TYPE__SPECIAL_POINTS:
                setSpecialPoints((Integer)newValue);
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
            case Shr5managementPackage.META_TYPE__CHOOSABLE_TYPES:
                setChoosableTypes((Spezies)null);
                return;
            case Shr5managementPackage.META_TYPE__SPECIAL_POINTS:
                setSpecialPoints(SPECIAL_POINTS_EDEFAULT);
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
            case Shr5managementPackage.META_TYPE__CHOOSABLE_TYPES:
                return choosableTypes != null;
            case Shr5managementPackage.META_TYPE__SPECIAL_POINTS:
                return specialPoints != SPECIAL_POINTS_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case Shr5managementPackage.META_TYPE___CALC_SPECIAL_POINTS_SPEND__MANAGEDCHARACTER:
                return calcSpecialPointsSpend((ManagedCharacter)arguments.get(0));
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (specialPoints: ");
        result.append(specialPoints);
        result.append(')');
        return result.toString();
    }

} // MetaTypeImpl
