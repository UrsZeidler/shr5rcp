/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import de.urszeidler.eclipse.shr5.gameplay.ActionPhaseCmd;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.PhaseCmd;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Phase Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ActionPhaseCmdImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ActionPhaseCmdImpl#getTurn <em>Turn</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ActionPhaseCmdImpl#isSizeInitative <em>Size Initative</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionPhaseCmdImpl extends SubjectCommandImpl implements ActionPhaseCmd {
    /**
     * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected static final int PHASE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected int phase = PHASE_EDEFAULT;

    /**
     * The default value of the '{@link #getTurn() <em>Turn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTurn()
     * @generated
     * @ordered
     */
    protected static final int TURN_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getTurn() <em>Turn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTurn()
     * @generated
     * @ordered
     */
    protected int turn = TURN_EDEFAULT;

    /**
     * The default value of the '{@link #isSizeInitative() <em>Size Initative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSizeInitative()
     * @generated
     * @ordered
     */
    protected static final boolean SIZE_INITATIVE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSizeInitative() <em>Size Initative</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSizeInitative()
     * @generated
     * @ordered
     */
    protected boolean sizeInitative = SIZE_INITATIVE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActionPhaseCmdImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.ACTION_PHASE_CMD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPhase() {
        return phase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPhase(int newPhase) {
        int oldPhase = phase;
        phase = newPhase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.ACTION_PHASE_CMD__PHASE, oldPhase, phase));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTurn() {
        return turn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTurn(int newTurn) {
        int oldTurn = turn;
        turn = newTurn;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.ACTION_PHASE_CMD__TURN, oldTurn, turn));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSizeInitative() {
        return sizeInitative;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSizeInitative(boolean newSizeInitative) {
        boolean oldSizeInitative = sizeInitative;
        sizeInitative = newSizeInitative;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.ACTION_PHASE_CMD__SIZE_INITATIVE, oldSizeInitative, sizeInitative));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GameplayPackage.ACTION_PHASE_CMD__PHASE:
                return getPhase();
            case GameplayPackage.ACTION_PHASE_CMD__TURN:
                return getTurn();
            case GameplayPackage.ACTION_PHASE_CMD__SIZE_INITATIVE:
                return isSizeInitative();
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
            case GameplayPackage.ACTION_PHASE_CMD__PHASE:
                setPhase((Integer)newValue);
                return;
            case GameplayPackage.ACTION_PHASE_CMD__TURN:
                setTurn((Integer)newValue);
                return;
            case GameplayPackage.ACTION_PHASE_CMD__SIZE_INITATIVE:
                setSizeInitative((Boolean)newValue);
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
            case GameplayPackage.ACTION_PHASE_CMD__PHASE:
                setPhase(PHASE_EDEFAULT);
                return;
            case GameplayPackage.ACTION_PHASE_CMD__TURN:
                setTurn(TURN_EDEFAULT);
                return;
            case GameplayPackage.ACTION_PHASE_CMD__SIZE_INITATIVE:
                setSizeInitative(SIZE_INITATIVE_EDEFAULT);
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
            case GameplayPackage.ACTION_PHASE_CMD__PHASE:
                return phase != PHASE_EDEFAULT;
            case GameplayPackage.ACTION_PHASE_CMD__TURN:
                return turn != TURN_EDEFAULT;
            case GameplayPackage.ACTION_PHASE_CMD__SIZE_INITATIVE:
                return sizeInitative != SIZE_INITATIVE_EDEFAULT;
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
        if (baseClass == PhaseCmd.class) {
            switch (derivedFeatureID) {
                case GameplayPackage.ACTION_PHASE_CMD__PHASE: return GameplayPackage.PHASE_CMD__PHASE;
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
        if (baseClass == PhaseCmd.class) {
            switch (baseFeatureID) {
                case GameplayPackage.PHASE_CMD__PHASE: return GameplayPackage.ACTION_PHASE_CMD__PHASE;
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
        result.append(" (phase: ");
        result.append(phase);
        result.append(", turn: ");
        result.append(turn);
        result.append(", sizeInitative: ");
        result.append(sizeInitative);
        result.append(')');
        return result.toString();
    }

} //ActionPhaseCmdImpl
