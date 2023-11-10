/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.Datasoft;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Wissensfertigkeit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datasoft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.impl.DatasoftImpl#getSkill <em>Skill</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasoftImpl extends BasicProgramImpl implements Datasoft {
    /**
     * The cached value of the '{@link #getSkill() <em>Skill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSkill()
     * @generated
     * @ordered
     */
    protected Wissensfertigkeit skill;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DatasoftImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5Package.Literals.DATASOFT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Wissensfertigkeit getSkill() {
        if (skill != null && skill.eIsProxy()) {
            InternalEObject oldSkill = (InternalEObject)skill;
            skill = (Wissensfertigkeit)eResolveProxy(oldSkill);
            if (skill != oldSkill) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5Package.DATASOFT__SKILL, oldSkill, skill));
            }
        }
        return skill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Wissensfertigkeit basicGetSkill() {
        return skill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSkill(Wissensfertigkeit newSkill) {
        Wissensfertigkeit oldSkill = skill;
        skill = newSkill;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5Package.DATASOFT__SKILL, oldSkill, skill));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5Package.DATASOFT__SKILL:
                if (resolve) return getSkill();
                return basicGetSkill();
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
            case Shr5Package.DATASOFT__SKILL:
                setSkill((Wissensfertigkeit)newValue);
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
            case Shr5Package.DATASOFT__SKILL:
                setSkill((Wissensfertigkeit)null);
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
            case Shr5Package.DATASOFT__SKILL:
                return skill != null;
        }
        return super.eIsSet(featureID);
    }

} //DatasoftImpl
