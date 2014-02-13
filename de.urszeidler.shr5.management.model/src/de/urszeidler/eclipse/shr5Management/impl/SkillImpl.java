/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Sprachfertigkeit;
import de.urszeidler.eclipse.shr5.Wissensfertigkeit;
import de.urszeidler.eclipse.shr5.impl.FertigkeitImpl;
import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.Skill;
import de.urszeidler.eclipse.shr5Management.SpecialType;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Skill</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.SkillImpl#getSkillPoints <em>Skill Points</em>}</li>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.SkillImpl#getGroupPoints <em>Group Points</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SkillImpl extends PriorityCategorieImpl implements Skill {
    /**
     * The default value of the '{@link #getSkillPoints() <em>Skill Points</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSkillPoints()
     * @generated
     * @ordered
     */
    protected static final int SKILL_POINTS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSkillPoints() <em>Skill Points</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSkillPoints()
     * @generated
     * @ordered
     */
    protected int skillPoints = SKILL_POINTS_EDEFAULT;

    /**
     * The default value of the '{@link #getGroupPoints() <em>Group Points</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getGroupPoints()
     * @generated
     * @ordered
     */
    protected static final int GROUP_POINTS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getGroupPoints() <em>Group Points</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getGroupPoints()
     * @generated
     * @ordered
     */
    protected int groupPoints = GROUP_POINTS_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SkillImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.SKILL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public int getSkillPoints() {
        return skillPoints;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setSkillPoints(int newSkillPoints) {
        int oldSkillPoints = skillPoints;
        skillPoints = newSkillPoints;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SKILL__SKILL_POINTS, oldSkillPoints, skillPoints));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public int getGroupPoints() {
        return groupPoints;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setGroupPoints(int newGroupPoints) {
        int oldGroupPoints = groupPoints;
        groupPoints = newGroupPoints;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.SKILL__GROUP_POINTS, oldGroupPoints, groupPoints));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int calcSkillSpend(ManagedCharacter context) {
        if (context == null || context.getPersona() == null)
            return 0;

        CharacterGenerator generator = context.getChracterSource();

        int spendByMagic = 0;
        if (generator instanceof Shr5Generator) {
            Shr5Generator shr5 = (Shr5Generator)generator;
            SpecialType magic = shr5.getMagic();
            if (magic != null) {
                int skillsSpend = magic.calcSkillsSpend(context);
                spendByMagic = skillsSpend * magic.getSkillValue();
            }
        }

        int kosten = 0;
        EList<PersonaFertigkeit> fertigkeiten = context.getPersona().getFertigkeiten();
        for (PersonaFertigkeit personaFertigkeit : fertigkeiten) {
            if (personaFertigkeit.getFertigkeit() != null && personaFertigkeit.getFertigkeit().getClass().equals(FertigkeitImpl.class))
                kosten = kosten + personaFertigkeit.getStufe();
        }
        EList<Changes> changes = context.getChanges();
        int counter = 0;
        for (Changes change : changes) {
            if (change.isChangeApplied())
                if (change instanceof PersonaChange) {
                    PersonaChange pv = (PersonaChange)change;
                    if (Shr5Package.Literals.PERSONA_FERTIGKEIT.equals(pv.getChangeable().eClass()))
                        counter++;
                }
        }
        // TODO need to remove the spend by karama
        return kosten - spendByMagic;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int calcGroupSpend(ManagedCharacter context) {
        if (context == null || context.getPersona() == null)
            return 0;

        int kosten = 0;
        EList<PersonaFertigkeitsGruppe> fertigkeiten = context.getPersona().getFertigkeitsGruppen();
        for (PersonaFertigkeitsGruppe personaFertigkeit : fertigkeiten) {
            kosten = kosten + personaFertigkeit.getStufe();
        }
        EList<Changes> changes = context.getChanges();
        int counter = 0;
        for (Changes change : changes) {
            if (change.isChangeApplied())
                if (change instanceof PersonaChange) {
                    PersonaChange pv = (PersonaChange)change;
                    if (Shr5Package.Literals.PERSONA_FERTIGKEITS_GRUPPE.equals(pv.getChangeable().eClass()))
                        counter++;
                }
        }
        return kosten - counter;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int calcKnowledgeSkillSpend(ManagedCharacter context) {
        if (context == null || context.getPersona() == null)
            return 0;

        int kosten = 0;
        EList<PersonaFertigkeit> fertigkeiten = context.getPersona().getFertigkeiten();
        for (PersonaFertigkeit personaFertigkeit : fertigkeiten) {
            if ((personaFertigkeit.getFertigkeit() instanceof Wissensfertigkeit) || personaFertigkeit.getFertigkeit() instanceof Sprachfertigkeit)
                kosten = kosten + personaFertigkeit.getStufe();
        }
        // TODO : substract from karma and nativ speaker
        return kosten;

    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated not
     */
    public int calcKnowledgeSkillPoints(ManagedCharacter context) {
        if (context == null || context.getPersona() == null)
            return 0;

        int intuition = context.getPersona().getIntuition();
        int logik = context.getPersona().getLogik();

        return (intuition + logik) * 2;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.SKILL__SKILL_POINTS:
                return getSkillPoints();
            case Shr5managementPackage.SKILL__GROUP_POINTS:
                return getGroupPoints();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5managementPackage.SKILL__SKILL_POINTS:
                setSkillPoints((Integer)newValue);
                return;
            case Shr5managementPackage.SKILL__GROUP_POINTS:
                setGroupPoints((Integer)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.SKILL__SKILL_POINTS:
                setSkillPoints(SKILL_POINTS_EDEFAULT);
                return;
            case Shr5managementPackage.SKILL__GROUP_POINTS:
                setGroupPoints(GROUP_POINTS_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.SKILL__SKILL_POINTS:
                return skillPoints != SKILL_POINTS_EDEFAULT;
            case Shr5managementPackage.SKILL__GROUP_POINTS:
                return groupPoints != GROUP_POINTS_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case Shr5managementPackage.SKILL___CALC_SKILL_SPEND__MANAGEDCHARACTER:
                return calcSkillSpend((ManagedCharacter)arguments.get(0));
            case Shr5managementPackage.SKILL___CALC_GROUP_SPEND__MANAGEDCHARACTER:
                return calcGroupSpend((ManagedCharacter)arguments.get(0));
            case Shr5managementPackage.SKILL___CALC_KNOWLEDGE_SKILL_SPEND__MANAGEDCHARACTER:
                return calcKnowledgeSkillSpend((ManagedCharacter)arguments.get(0));
            case Shr5managementPackage.SKILL___CALC_KNOWLEDGE_SKILL_POINTS__MANAGEDCHARACTER:
                return calcKnowledgeSkillPoints((ManagedCharacter)arguments.get(0));
        }
        return super.eInvoke(operationID, arguments);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (skillPoints: ");
        result.append(skillPoints);
        result.append(", groupPoints: ");
        result.append(groupPoints);
        result.append(')');
        return result.toString();
    }

} // SkillImpl
