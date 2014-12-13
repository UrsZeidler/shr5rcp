/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.SpellCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spell Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.SpellCommandImpl#getSpell <em>Spell</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SpellCommandImpl extends ProbeCommandImpl implements SpellCommand {
    /**
     * The cached value of the '{@link #getSpell() <em>Spell</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpell()
     * @generated
     * @ordered
     */
    protected Zauber spell;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SpellCommandImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.SPELL_COMMAND;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Zauber getSpell() {
        if (spell != null && spell.eIsProxy()) {
            InternalEObject oldSpell = (InternalEObject)spell;
            spell = (Zauber)eResolveProxy(oldSpell);
            if (spell != oldSpell) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameplayPackage.SPELL_COMMAND__SPELL, oldSpell, spell));
            }
        }
        return spell;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Zauber basicGetSpell() {
        return spell;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSpell(Zauber newSpell) {
        Zauber oldSpell = spell;
        spell = newSpell;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.SPELL_COMMAND__SPELL, oldSpell, spell));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GameplayPackage.SPELL_COMMAND__SPELL:
                if (resolve) return getSpell();
                return basicGetSpell();
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
            case GameplayPackage.SPELL_COMMAND__SPELL:
                setSpell((Zauber)newValue);
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
            case GameplayPackage.SPELL_COMMAND__SPELL:
                setSpell((Zauber)null);
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
            case GameplayPackage.SPELL_COMMAND__SPELL:
                return spell != null;
        }
        return super.eIsSet(featureID);
    }

} //SpellCommandImpl
