/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.Erlernbar;
import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.CharacterDiary;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.PersonaValueChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.TrainingRate;
import de.urszeidler.eclipse.shr5Management.TrainingsTime;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trainings Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.TrainingsTimeImpl#getDaysTrained <em>Days Trained</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.TrainingsTimeImpl#getDaysRemains <em>Days Remains</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.impl.TrainingsTimeImpl#isTrainingComplete <em>Training Complete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrainingsTimeImpl extends CharacterChangeImpl implements TrainingsTime {
    /**
     * The default value of the '{@link #getDaysTrained() <em>Days Trained</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDaysTrained()
     * @generated
     * @ordered
     */
    protected static final int DAYS_TRAINED_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDaysTrained() <em>Days Trained</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDaysTrained()
     * @generated
     * @ordered
     */
    protected int daysTrained = DAYS_TRAINED_EDEFAULT;

    /**
     * The default value of the '{@link #getDaysRemains() <em>Days Remains</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDaysRemains()
     * @generated
     * @ordered
     */
    protected static final int DAYS_REMAINS_EDEFAULT = 0;

    /**
     * The default value of the '{@link #isTrainingComplete() <em>Training Complete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTrainingComplete()
     * @generated
     * @ordered
     */
    protected static final boolean TRAINING_COMPLETE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTrainingComplete() <em>Training Complete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTrainingComplete()
     * @generated
     * @ordered
     */
    protected boolean trainingComplete = TRAINING_COMPLETE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TrainingsTimeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.TRAININGS_TIME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getDaysTrained() {
        return daysTrained;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDaysTrained(int newDaysTrained) {
        int oldDaysTrained = daysTrained;
        daysTrained = newDaysTrained;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.TRAININGS_TIME__DAYS_TRAINED, oldDaysTrained, daysTrained));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    public int getDaysRemains() {
        Changes change2 = getChange();
        EObject eContainer = eContainer();
        ManagedCharacter character = null;
        if ( eContainer instanceof CharacterDiary && eContainer.eContainer() instanceof ManagedCharacter )
            character = (ManagedCharacter)eContainer.eContainer();
        if(change2!=null && character !=null){
            CharacterGenerator<?> chracterSource = character.getChracterSource();
            IncreaseCharacterPart part = null;
            if (change2 instanceof PersonaChange) {
                PersonaChange pc = (PersonaChange)change2;
                Erlernbar changeable = pc.getChangeable();
                part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements()
                        .getCharacterAdvancements(), changeable.eClass());
                
            }else if (change2 instanceof AttributeChange) {
                part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements()
                        .getCharacterAdvancements(), EcorePackage.Literals.EATTRIBUTE);
                
            }
            if(part!=null){
            int to = ((PersonaValueChange)change2).getTo();
            TrainingRate tr = (TrainingRate)ShadowrunManagmentTools.findMatchingRange(to, part.getRangeTableEntries());
            
            int calcDays = ShadowrunManagmentTools.calcDays(tr);
            return (calcDays*to) - getDaysTrained();
            }
        }
        return -1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTrainingComplete() {
        return trainingComplete;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTrainingComplete(boolean newTrainingComplete) {
        boolean oldTrainingComplete = trainingComplete;
        trainingComplete = newTrainingComplete;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.TRAININGS_TIME__TRAINING_COMPLETE, oldTrainingComplete, trainingComplete));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.TRAININGS_TIME__DAYS_TRAINED:
                return getDaysTrained();
            case Shr5managementPackage.TRAININGS_TIME__DAYS_REMAINS:
                return getDaysRemains();
            case Shr5managementPackage.TRAININGS_TIME__TRAINING_COMPLETE:
                return isTrainingComplete();
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
            case Shr5managementPackage.TRAININGS_TIME__DAYS_TRAINED:
                setDaysTrained((Integer)newValue);
                return;
            case Shr5managementPackage.TRAININGS_TIME__TRAINING_COMPLETE:
                setTrainingComplete((Boolean)newValue);
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
            case Shr5managementPackage.TRAININGS_TIME__DAYS_TRAINED:
                setDaysTrained(DAYS_TRAINED_EDEFAULT);
                return;
            case Shr5managementPackage.TRAININGS_TIME__TRAINING_COMPLETE:
                setTrainingComplete(TRAINING_COMPLETE_EDEFAULT);
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
            case Shr5managementPackage.TRAININGS_TIME__DAYS_TRAINED:
                return daysTrained != DAYS_TRAINED_EDEFAULT;
            case Shr5managementPackage.TRAININGS_TIME__DAYS_REMAINS:
                return getDaysRemains() != DAYS_REMAINS_EDEFAULT;
            case Shr5managementPackage.TRAININGS_TIME__TRAINING_COMPLETE:
                return trainingComplete != TRAINING_COMPLETE_EDEFAULT;
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
        result.append(" (daysTrained: ");
        result.append(daysTrained);
        result.append(", trainingComplete: ");
        result.append(trainingComplete);
        result.append(')');
        return result.toString();
    }

} //TrainingsTimeImpl
