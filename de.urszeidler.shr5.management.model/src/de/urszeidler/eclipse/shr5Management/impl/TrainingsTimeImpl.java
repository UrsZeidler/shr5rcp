/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import de.urszeidler.eclipse.shr5.Erlernbar;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.CharacterDiary;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.PersonaMartialArtChange;
import de.urszeidler.eclipse.shr5Management.PersonaValueChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.TrainingRange;
import de.urszeidler.eclipse.shr5Management.TrainingRate;
import de.urszeidler.eclipse.shr5Management.TrainingsTime;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trainings Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.TrainingsTimeImpl#getDaysTrained <em>Days Trained</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.TrainingsTimeImpl#getDaysRemains <em>Days Remains</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.TrainingsTimeImpl#isTrainingComplete <em>Training Complete</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.TrainingsTimeImpl#getTraining <em>Training</em>}</li>
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
     * 
     * @see #getDaysTrained()
     * @generated
     * @ordered
     */
    protected static final int DAYS_TRAINED_EDEFAULT = 0;

    /**
     * The default value of the '{@link #getDaysRemains() <em>Days Remains</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getDaysRemains()
     * @generated
     * @ordered
     */
    protected static final int DAYS_REMAINS_EDEFAULT = 0;

    /**
     * The default value of the '{@link #isTrainingComplete() <em>Training Complete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #isTrainingComplete()
     * @generated
     * @ordered
     */
    protected static final boolean TRAINING_COMPLETE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTrainingComplete() <em>Training Complete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #isTrainingComplete()
     * @generated
     * @ordered
     */
    protected boolean trainingComplete = TRAINING_COMPLETE_EDEFAULT;

    /**
     * The cached value of the '{@link #getTraining() <em>Training</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getTraining()
     * @generated
     * @ordered
     */
    protected EList<TrainingRange> training;
    private EContentAdapter eContentAdapter;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected TrainingsTimeImpl() {
        super();
        eContentAdapter = new EContentAdapter() {
            @Override
            public void notifyChanged(Notification notification) {
                super.notifyChanged(notification);
                Object feature = notification.getFeature();
                if (Shr5managementPackage.Literals.PERSONA_CHANGE__CHANGEABLE.equals(feature)
//                        || Shr5managementPackage.Literals.TRAINING_RANGE__DAYS_TRAINED.equals(feature)
                       || Shr5managementPackage.Literals.TRAINING_RANGE__TRAINING_TIME.equals(feature)
                        || Shr5managementPackage.Literals.PERSONA_MARTIAL_ART_CHANGE__STYLE.equals(feature)
                        || Shr5managementPackage.Literals.PERSONA_MARTIAL_ART_CHANGE__TECHNIQUE.equals(feature)){
                    TrainingsTimeImpl.this.eNotify(new ENotificationImpl(TrainingsTimeImpl.this, Notification.SET,
                            Shr5managementPackage.Literals.TRAININGS_TIME__DAYS_REMAINS, 1, 2));
                    TrainingsTimeImpl.this.eNotify(new ENotificationImpl(TrainingsTimeImpl.this, Notification.SET,
                            Shr5managementPackage.Literals.TRAININGS_TIME__DAYS_TRAINED, 1, 2));
                }
            }

        };
        eContentAdapter.setTarget(this);
        this.eAdapters().add(eContentAdapter);

    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.TRAININGS_TIME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getDaysTrained() {
        return calcTrainDays();
    }

    //
    // /**
    // * <!-- begin-user-doc -->
    // * <!-- end-user-doc -->
    // * @generated not
    // */
    // public void setDaysTrained(int newDaysTrained) {
    // int oldDaysTrained = daysTrained;
    // daysTrained = newDaysTrained;
    // if (eNotificationRequired())
    // eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.TRAININGS_TIME__DAYS_TRAINED, oldDaysTrained, daysTrained));
    // if (eNotificationRequired())
    // eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.TRAININGS_TIME__DAYS_REMAINS, 1, 2));
    // }

    @Override
    public void setChange(Changes newChange) {
        Changes oldChange = getChange();
        super.setChange(newChange);
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.TRAININGS_TIME__DAYS_REMAINS, 1, 2));
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.TRAININGS_TIME__DAYS_TRAINED, 1, 2));

        if (newChange instanceof PersonaMartialArtChange) {
            PersonaMartialArtChange pac = (PersonaMartialArtChange)newChange;
            pac.eAdapters().add(eContentAdapter);
        }
        if (oldChange instanceof PersonaMartialArtChange) {
            PersonaMartialArtChange pac = (PersonaMartialArtChange)oldChange;
            pac.eAdapters().remove(eContentAdapter);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int getDaysRemains() {
        Changes change2 = getChange();
        EObject eContainer = eContainer();
        ManagedCharacter character = null;
        if (eContainer instanceof CharacterDiary && eContainer.eContainer() instanceof ManagedCharacter)
            character = (ManagedCharacter)eContainer.eContainer();
        if (change2 != null && character != null) {
            CharacterGenerator<?> chracterSource = character.getChracterSource();
            IncreaseCharacterPart part = null;
            if (change2 instanceof PersonaMartialArtChange) {
                PersonaMartialArtChange pmac = (PersonaMartialArtChange)change2;
                if (pmac.getChangeable() != null)
                    part = ShadowrunManagmentTools.findAdvancment(
                            chracterSource.getGenerator().getCharacterAdvancements().getCharacterAdvancements(),
                            Shr5Package.Literals.PERSONA_MARTIALART_STYLE);
                else
                    part = ShadowrunManagmentTools.findAdvancment(
                            chracterSource.getGenerator().getCharacterAdvancements().getCharacterAdvancements(),
                            Shr5Package.Literals.PERSONA_MARTIALART_TECHNIQUE);
            } else

            if (change2 instanceof PersonaChange) {
                PersonaChange pc = (PersonaChange)change2;
                Erlernbar changeable = pc.getChangeable();
                part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements().getCharacterAdvancements(),
                        changeable);

            } else if (change2 instanceof AttributeChange) {
                part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements().getCharacterAdvancements(),
                        EcorePackage.Literals.EATTRIBUTE);

            }
            if (part != null) {
                int to = ((PersonaValueChange)change2).getTo();
                TrainingRate tr = (TrainingRate)ShadowrunManagmentTools.findMatchingRange(to, part.getRangeTableEntries());

                int calcDays = ShadowrunManagmentTools.calcDays(tr);
                return (calcDays * to) - (getDaysTrained());
            }
        }
        return -1;
    }

    private int calcTrainDays() {
        int t = 0;
        for (TrainingRange trainingRange : getTraining()) {
            t += trainingRange.getDaysTrained();
        }
        return t;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isTrainingComplete() {
        return trainingComplete;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setTrainingComplete(boolean newTrainingComplete) {
        boolean oldTrainingComplete = trainingComplete;
        trainingComplete = newTrainingComplete;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.TRAININGS_TIME__TRAINING_COMPLETE, oldTrainingComplete,
                    trainingComplete));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<TrainingRange> getTraining() {
        if (training == null) {
            training = new EObjectContainmentWithInverseEList<TrainingRange>(TrainingRange.class, this,
                    Shr5managementPackage.TRAININGS_TIME__TRAINING, Shr5managementPackage.TRAINING_RANGE__TRAINING_TIME);
        }
        return training;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public boolean hasValidRange(DiagnosticChain diagnostics, Map<Object, Object> context) {
        EList<TrainingRange> training2 = getTraining();

        if (training2.size() == 0)
            return true;

        TrainingRange overlappingSample = null;
        if (training2.size() == 1)
            return checkRange(training2.get(0));

        Iterator<TrainingRange> iterator = training2.iterator();
        TrainingRange tr = iterator.next();
        Date baseDate = tr.getEnd();
        while (iterator.hasNext()) {
            tr = iterator.next();
            if (checkRange(tr) && tr.getEnd() != null && baseDate.before(tr.getEnd()) ) {
                baseDate = tr.getEnd();
            }else{
              overlappingSample = tr;
            }
        }

        if (overlappingSample !=null) {
            if (diagnostics != null) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Shr5managementValidator.DIAGNOSTIC_SOURCE,
                        Shr5managementValidator.TRAININGS_TIME__HAS_VALID_RANGE, EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
                                new Object[]{ "hasValidRange", EObjectValidator.getObjectLabel(overlappingSample, context) }), new Object[]{ overlappingSample  }));
            }
            return false;
        }
        return true;
    }

    private boolean checkRange(TrainingRange trainingRange) {
        if (trainingRange.getStart() == null || trainingRange.getEnd() == null)
            return false;
        return !trainingRange.getEnd().after(trainingRange.getStart());  //trainingRange.getStart().before(trainingRange.getEnd());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.TRAININGS_TIME__TRAINING:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTraining()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Shr5managementPackage.TRAININGS_TIME__TRAINING:
                return ((InternalEList<?>)getTraining()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
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
            case Shr5managementPackage.TRAININGS_TIME__TRAINING:
                return getTraining();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5managementPackage.TRAININGS_TIME__TRAINING_COMPLETE:
                setTrainingComplete((Boolean)newValue);
                return;
            case Shr5managementPackage.TRAININGS_TIME__TRAINING:
                getTraining().clear();
                getTraining().addAll((Collection<? extends TrainingRange>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.TRAININGS_TIME__TRAINING_COMPLETE:
                setTrainingComplete(TRAINING_COMPLETE_EDEFAULT);
                return;
            case Shr5managementPackage.TRAININGS_TIME__TRAINING:
                getTraining().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.TRAININGS_TIME__DAYS_TRAINED:
                return getDaysTrained() != DAYS_TRAINED_EDEFAULT;
            case Shr5managementPackage.TRAININGS_TIME__DAYS_REMAINS:
                return getDaysRemains() != DAYS_REMAINS_EDEFAULT;
            case Shr5managementPackage.TRAININGS_TIME__TRAINING_COMPLETE:
                return trainingComplete != TRAINING_COMPLETE_EDEFAULT;
            case Shr5managementPackage.TRAININGS_TIME__TRAINING:
                return training != null && !training.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case Shr5managementPackage.TRAININGS_TIME___HAS_VALID_RANGE__DIAGNOSTICCHAIN_MAP:
                return hasValidRange((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
        }
        return super.eInvoke(operationID, arguments);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (trainingComplete: ");
        result.append(trainingComplete);
        result.append(')');
        return result.toString();
    }

} // TrainingsTimeImpl
