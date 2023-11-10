/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.Intervall;
import de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extendet Skill Test Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ExtendetSkillTestCmdImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.ExtendetSkillTestCmdImpl#getIntervall <em>Intervall</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendetSkillTestCmdImpl extends SkillTestCmdImpl implements ExtendetSkillTestCmd {
    /**
     * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartDate()
     * @generated
     * @ordered
     */
    protected static final Date START_DATE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartDate()
     * @generated
     * @ordered
     */
    protected Date startDate = START_DATE_EDEFAULT;
    /**
     * The cached value of the '{@link #getIntervall() <em>Intervall</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntervall()
     * @generated
     * @ordered
     */
    protected Intervall intervall;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtendetSkillTestCmdImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.EXTENDET_SKILL_TEST_CMD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getStartDate() {
        return startDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartDate(Date newStartDate) {
        Date oldStartDate = startDate;
        startDate = newStartDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.EXTENDET_SKILL_TEST_CMD__START_DATE, oldStartDate, startDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Intervall getIntervall() {
        return intervall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIntervall(Intervall newIntervall, NotificationChain msgs) {
        Intervall oldIntervall = intervall;
        intervall = newIntervall;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GameplayPackage.EXTENDET_SKILL_TEST_CMD__INTERVALL, oldIntervall, newIntervall);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIntervall(Intervall newIntervall) {
        if (newIntervall != intervall) {
            NotificationChain msgs = null;
            if (intervall != null)
                msgs = ((InternalEObject)intervall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GameplayPackage.EXTENDET_SKILL_TEST_CMD__INTERVALL, null, msgs);
            if (newIntervall != null)
                msgs = ((InternalEObject)newIntervall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GameplayPackage.EXTENDET_SKILL_TEST_CMD__INTERVALL, null, msgs);
            msgs = basicSetIntervall(newIntervall, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.EXTENDET_SKILL_TEST_CMD__INTERVALL, newIntervall, newIntervall));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case GameplayPackage.EXTENDET_SKILL_TEST_CMD__INTERVALL:
                return basicSetIntervall(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GameplayPackage.EXTENDET_SKILL_TEST_CMD__START_DATE:
                return getStartDate();
            case GameplayPackage.EXTENDET_SKILL_TEST_CMD__INTERVALL:
                return getIntervall();
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
            case GameplayPackage.EXTENDET_SKILL_TEST_CMD__START_DATE:
                setStartDate((Date)newValue);
                return;
            case GameplayPackage.EXTENDET_SKILL_TEST_CMD__INTERVALL:
                setIntervall((Intervall)newValue);
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
            case GameplayPackage.EXTENDET_SKILL_TEST_CMD__START_DATE:
                setStartDate(START_DATE_EDEFAULT);
                return;
            case GameplayPackage.EXTENDET_SKILL_TEST_CMD__INTERVALL:
                setIntervall((Intervall)null);
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
            case GameplayPackage.EXTENDET_SKILL_TEST_CMD__START_DATE:
                return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
            case GameplayPackage.EXTENDET_SKILL_TEST_CMD__INTERVALL:
                return intervall != null;
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (startDate: ");
        result.append(startDate);
        result.append(')');
        return result.toString();
    }

    @Override
    public void redo() {
        prepareRedo();
        startDate = getDate();

        int threshold = getThresholds();
        int counter = 0;
        while (threshold > 0 && counter < 1000) {

            SkillTestCmd skillTest = GameplayFactory.eINSTANCE.createSkillTestCmd();
            skillTest.setSubject(getSubject());
            skillTest.setSkill(getSkill());
            skillTest.setDate(getDate());
            if (isSetLimit())
                skillTest.setLimit(getLimit());

            getSubCommands().add(skillTest);
            skillTest.redo();
            threshold = threshold - skillTest.getSuccesses();
            date = new Date(date.getTime() + (10 * intervall.getQuantities()));
            counter++;
        }
        afterRedo();
    }

} // ExtendetSkillTestCmdImpl
