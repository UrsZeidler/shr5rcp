/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.InterruptAction;
import de.urszeidler.eclipse.shr5.gameplay.InterruptType;
import de.urszeidler.eclipse.shr5.runtime.ExtendetData;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interrupt Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.InterruptActionImpl#getIniCost <em>Ini Cost</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.InterruptActionImpl#getInterruptType <em>Interrupt Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterruptActionImpl extends SubjectCommandImpl implements InterruptAction {
    /**
     * The default value of the '{@link #getIniCost() <em>Ini Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIniCost()
     * @generated
     * @ordered
     */
    protected static final int INI_COST_EDEFAULT = 0;
    /**
     * The cached value of the '{@link #getIniCost() <em>Ini Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIniCost()
     * @generated
     * @ordered
     */
    protected int iniCost = INI_COST_EDEFAULT;

    /**
     * The default value of the '{@link #getInterruptType() <em>Interrupt Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterruptType()
     * @generated
     * @ordered
     */
    protected static final InterruptType INTERRUPT_TYPE_EDEFAULT = InterruptType.BLOCK;
    /**
     * The cached value of the '{@link #getInterruptType() <em>Interrupt Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterruptType()
     * @generated
     * @ordered
     */
    protected InterruptType interruptType = INTERRUPT_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InterruptActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.INTERRUPT_ACTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getIniCost() {
        return iniCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIniCost(int newIniCost) {
        int oldIniCost = iniCost;
        iniCost = newIniCost;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.INTERRUPT_ACTION__INI_COST, oldIniCost, iniCost));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterruptType getInterruptType() {
        return interruptType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInterruptType(InterruptType newInterruptType) {
        InterruptType oldInterruptType = interruptType;
        interruptType = newInterruptType == null ? INTERRUPT_TYPE_EDEFAULT : newInterruptType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.INTERRUPT_ACTION__INTERRUPT_TYPE, oldInterruptType, interruptType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GameplayPackage.INTERRUPT_ACTION__INI_COST:
                return getIniCost();
            case GameplayPackage.INTERRUPT_ACTION__INTERRUPT_TYPE:
                return getInterruptType();
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
            case GameplayPackage.INTERRUPT_ACTION__INI_COST:
                setIniCost((Integer)newValue);
                return;
            case GameplayPackage.INTERRUPT_ACTION__INTERRUPT_TYPE:
                setInterruptType((InterruptType)newValue);
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
            case GameplayPackage.INTERRUPT_ACTION__INI_COST:
                setIniCost(INI_COST_EDEFAULT);
                return;
            case GameplayPackage.INTERRUPT_ACTION__INTERRUPT_TYPE:
                setInterruptType(INTERRUPT_TYPE_EDEFAULT);
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
            case GameplayPackage.INTERRUPT_ACTION__INI_COST:
                return iniCost != INI_COST_EDEFAULT;
            case GameplayPackage.INTERRUPT_ACTION__INTERRUPT_TYPE:
                return interruptType != INTERRUPT_TYPE_EDEFAULT;
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
        result.append(" (iniCost: ");
        result.append(iniCost);
        result.append(", interruptType: ");
        result.append(interruptType);
        result.append(')');
        return result.toString();
    }

    @Override
    public void redo() {
        setExecuting(true);

        EObject eContainer2 = eContainer();
        final RuntimeCharacter su = getSubject();
        if (eContainer2 instanceof InitativePass) {
            InitativePass ip = (InitativePass)eContainer2;
            EObject eContainer3 = ip.eContainer();
            if (eContainer3 instanceof CombatTurn) {
                CombatTurn ct = (CombatTurn)eContainer3;
                EList<InitativePass> actionPhases = ct.getActionPhases();

                Collection<InitativePass> filter = Collections2.filter(actionPhases, new Predicate<InitativePass>() {

                    @Override
                    public boolean apply(InitativePass input) {
                        return su.equals(input.getSubject()) && !input.isExecuted();
                    }
                });
                ArrayList<InitativePass> removelist = new ArrayList<InitativePass>();
                for (InitativePass initativePass : filter) {
                    initativePass.setPhase(initativePass.getPhase() + getIniCost());
                    if (initativePass.getPhase() < 0)
                        removelist.add(initativePass);
                }
                if (!removelist.isEmpty()) {
                    actionPhases.removeAll(removelist);
                }
                ArrayList<InitativePass> list = new ArrayList<InitativePass>(actionPhases);
                Collections.sort(list, new CombatTurnImpl.InitativeComperator());
                actionPhases.clear();
                actionPhases.addAll(list);
            }
        }
        
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(getSubject());
        data.setEFeature(GameplayPackage.Literals.INTERRUPT_ACTION__INTERRUPT_TYPE);
        getSubject().addUniqueToList(data, getInterruptType());
        
        executeSubActions();
        setExecuted(true);
        setExecuting(false);
    }

} // InterruptActionImpl
