/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.Initative;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.shr5.gameplay.dice.IniDice;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.InitativeImpl#getIni <em>Ini</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.InitativeImpl#getActualIni <em>Actual Ini</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.InitativeImpl#isSizeInitative <em>Size Initative</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitativeImpl extends SubjectCommandImpl implements Initative {
    /**
     * The default value of the '{@link #getIni() <em>Ini</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIni()
     * @generated
     * @ordered
     */
    protected static final int INI_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getIni() <em>Ini</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIni()
     * @generated
     * @ordered
     */
    protected int ini = INI_EDEFAULT;

    /**
     * The default value of the '{@link #getActualIni() <em>Actual Ini</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActualIni()
     * @generated
     * @ordered
     */
    protected static final int ACTUAL_INI_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getActualIni() <em>Actual Ini</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActualIni()
     * @generated
     * @ordered
     */
    protected int actualIni = ACTUAL_INI_EDEFAULT;

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
    protected InitativeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.INITATIVE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getIni() {
        return ini;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIni(int newIni) {
        int oldIni = ini;
        ini = newIni;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.INITATIVE__INI, oldIni, ini));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getActualIni() {
        return actualIni;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActualIni(int newActualIni) {
        int oldActualIni = actualIni;
        actualIni = newActualIni;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.INITATIVE__ACTUAL_INI, oldActualIni, actualIni));
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
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.INITATIVE__SIZE_INITATIVE, oldSizeInitative, sizeInitative));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int nextPass(int actualPhase) {
        int physicalDamage = subject.getPhysicalDamage() / 3;
        int mentalDamage = subject.getMentalDamage() / 3;

        int ini1 = ini - (physicalDamage + mentalDamage);

        while (ini1 > actualPhase) {
            ini1 = ini1 - 10;
        }
        return ini1;
    }

    @Override
    public boolean isCanExecute() {
        return subject != null && subject.getCharacter() != null && subject.getCharacter().getPersona() != null && !executed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     */
    public void redo() {
        if (!isCanExecute())
            return;

        IniDice iniDice = new IniDice();
        AbstraktPersona persona = subject.getCharacter().getPersona();
        int initative = persona.getInitative() + GameplayTools.getWoundMod(getSubject());
        ini = iniDice.ini(initative, persona.getInitativWuerfel());
        executed = true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GameplayPackage.INITATIVE__INI:
                return getIni();
            case GameplayPackage.INITATIVE__ACTUAL_INI:
                return getActualIni();
            case GameplayPackage.INITATIVE__SIZE_INITATIVE:
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
            case GameplayPackage.INITATIVE__INI:
                setIni((Integer)newValue);
                return;
            case GameplayPackage.INITATIVE__ACTUAL_INI:
                setActualIni((Integer)newValue);
                return;
            case GameplayPackage.INITATIVE__SIZE_INITATIVE:
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
            case GameplayPackage.INITATIVE__INI:
                setIni(INI_EDEFAULT);
                return;
            case GameplayPackage.INITATIVE__ACTUAL_INI:
                setActualIni(ACTUAL_INI_EDEFAULT);
                return;
            case GameplayPackage.INITATIVE__SIZE_INITATIVE:
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
            case GameplayPackage.INITATIVE__INI:
                return ini != INI_EDEFAULT;
            case GameplayPackage.INITATIVE__ACTUAL_INI:
                return actualIni != ACTUAL_INI_EDEFAULT;
            case GameplayPackage.INITATIVE__SIZE_INITATIVE:
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
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case GameplayPackage.INITATIVE___NEXT_PASS__INT:
                return nextPass((Integer)arguments.get(0));
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (ini: ");
        result.append(ini);
        result.append(", actualIni: ");
        result.append(actualIni);
        result.append(", sizeInitative: ");
        result.append(sizeInitative);
        result.append(')');
        return result.toString();
    }

} // InitativeImpl
