/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opposed Skill Test Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.OpposedSkillTestCmdImpl#getObject <em>Object</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.gameplay.impl.OpposedSkillTestCmdImpl#getObjectSkill <em>Object Skill</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpposedSkillTestCmdImpl extends SkillTestCmdImpl implements OpposedSkillTestCmd {
    /**
     * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObject()
     * @generated
     * @ordered
     */
    protected RuntimeCharacter object;

    /**
     * The cached value of the '{@link #getObjectSkill() <em>Object Skill</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObjectSkill()
     * @generated
     * @ordered
     */
    protected Fertigkeit objectSkill;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpposedSkillTestCmdImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return GameplayPackage.Literals.OPPOSED_SKILL_TEST_CMD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuntimeCharacter getObject() {
        if (object != null && object.eIsProxy()) {
            InternalEObject oldObject = (InternalEObject)object;
            object = (RuntimeCharacter)eResolveProxy(oldObject);
            if (object != oldObject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameplayPackage.OPPOSED_SKILL_TEST_CMD__OBJECT, oldObject, object));
            }
        }
        return object;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RuntimeCharacter basicGetObject() {
        return object;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObject(RuntimeCharacter newObject) {
        RuntimeCharacter oldObject = object;
        object = newObject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.OPPOSED_SKILL_TEST_CMD__OBJECT, oldObject, object));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fertigkeit getObjectSkill() {
        if (objectSkill != null && objectSkill.eIsProxy()) {
            InternalEObject oldObjectSkill = (InternalEObject)objectSkill;
            objectSkill = (Fertigkeit)eResolveProxy(oldObjectSkill);
            if (objectSkill != oldObjectSkill) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, GameplayPackage.OPPOSED_SKILL_TEST_CMD__OBJECT_SKILL, oldObjectSkill, objectSkill));
            }
        }
        return objectSkill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Fertigkeit basicGetObjectSkill() {
        return objectSkill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObjectSkill(Fertigkeit newObjectSkill) {
        Fertigkeit oldObjectSkill = objectSkill;
        objectSkill = newObjectSkill;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, GameplayPackage.OPPOSED_SKILL_TEST_CMD__OBJECT_SKILL, oldObjectSkill, objectSkill));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case GameplayPackage.OPPOSED_SKILL_TEST_CMD__OBJECT:
                if (resolve) return getObject();
                return basicGetObject();
            case GameplayPackage.OPPOSED_SKILL_TEST_CMD__OBJECT_SKILL:
                if (resolve) return getObjectSkill();
                return basicGetObjectSkill();
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
            case GameplayPackage.OPPOSED_SKILL_TEST_CMD__OBJECT:
                setObject((RuntimeCharacter)newValue);
                return;
            case GameplayPackage.OPPOSED_SKILL_TEST_CMD__OBJECT_SKILL:
                setObjectSkill((Fertigkeit)newValue);
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
            case GameplayPackage.OPPOSED_SKILL_TEST_CMD__OBJECT:
                setObject((RuntimeCharacter)null);
                return;
            case GameplayPackage.OPPOSED_SKILL_TEST_CMD__OBJECT_SKILL:
                setObjectSkill((Fertigkeit)null);
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
            case GameplayPackage.OPPOSED_SKILL_TEST_CMD__OBJECT:
                return object != null;
            case GameplayPackage.OPPOSED_SKILL_TEST_CMD__OBJECT_SKILL:
                return objectSkill != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * Set the state and call the callback.
     */
    protected boolean prepareRedo() {
        getProbe().clear();
        getProbeMods().clear();
        setExecuting(true);

        if (isSetCmdCallback() && getCmdCallback() != null)
            return cmdCallback.prepareCommand(this, GameplayPackage.Literals.SUBJECT_COMMAND__SUBJECT,
                    GameplayPackage.Literals.OPPOSED_SKILL_TEST_CMD__OBJECT);
        return true;
    }

    
    @Override
    public void redo() {
        if(!prepareRedo()){
            cleanCommand();
            return;
        }

        SkillTestCmd subjectCommand = GameplayFactory.eINSTANCE.createSkillTestCmd();
        subjectCommand.setSubject(getSubject());
        subjectCommand.setCmdCallback(getCmdCallback());
        subjectCommand.setSkill(getSkill());
        subjectCommand.setThresholds(getThresholds());
        subjectCommand.setDate(getDate());
        if (isSetLimit())
            subjectCommand.setLimit(getLimit());

        getSubCommands().add(subjectCommand);

        SkillTestCmd objectCommand = GameplayFactory.eINSTANCE.createSkillTestCmd();
        objectCommand.setSubject(getObject());
        objectCommand.setCmdCallback(getCmdCallback());
        objectCommand.setSkill(getObjectSkill());
        objectCommand.setThresholds(getThresholds());
        objectCommand.setDate(getDate());
        if (isSetLimit())
            objectCommand.setLimit(getLimit());

        getSubCommands().add(objectCommand);

        subjectCommand.redo();
        objectCommand.redo();

        int total = subjectCommand.getNetHits()-objectCommand.getNetHits();
        
        this.netHits = total;
        afterRedo();
    }

} // OpposedSkillTestCmdImpl
