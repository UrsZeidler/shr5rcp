/**
 * 
 */
package de.urszeidler.eclipse.shr5.gameplay.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

import de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe;
import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FeuerModus;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.Nahkampfwaffe;
import de.urszeidler.eclipse.shr5.Reichweite;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.CommandWrapper;
import de.urszeidler.eclipse.shr5.gameplay.DamageTest;
import de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.ExtendetSkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.InterruptType;
import de.urszeidler.eclipse.shr5.gameplay.OpposedSkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.ProbeMod;
import de.urszeidler.eclipse.shr5.gameplay.SimpleAction;
import de.urszeidler.eclipse.shr5.gameplay.SimpleActions;
import de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd;
import de.urszeidler.eclipse.shr5.runtime.ExtendetData;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5.runtime.Zustand;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * @author urs
 */
public class GameplayTools {

    /**
     * Create a runtime character.
     * 
     * @return
     */
    public static RuntimeCharacter createRuntimeCharacter() {
        ManagedCharacter character = Shr5managementFactory.eINSTANCE.createNonPlayerCharacter();
        AbstraktPersona persona = Shr5Factory.eINSTANCE.createMudanPersona();
        persona.setKonstitutionBasis(4);
        character.setPersona(persona);

        RuntimeCharacter runtimeCharacter = RuntimeFactory.eINSTANCE.createRuntimeCharacter();
        runtimeCharacter.setCharacter(character);

        return runtimeCharacter;
    }

    public static void clearDefseMod(RuntimeCharacter subject) {
        if (subject == null)
            return;
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(subject);
        data.setEFeature(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN);
        subject.getExtendetData().remove(data);
    }

    /**
     * Get the firearm modus.
     * 
     * @param subject
     * @param waffe
     * @return
     */
    public static FeuerModus getFireArmModus(RuntimeCharacter subject, Feuerwaffe waffe) {
        EList<FeuerModus> modie = waffe.getModie();
        FeuerModus value = modie.get(0);
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(waffe);
        data.setEFeature(Shr5Package.Literals.FEUERWAFFE__MODIE);
        FeuerModus fm = (FeuerModus)subject.getExtendetData().get(data);
        if (fm != null)
            return fm;

        subject.getExtendetData().put(data, value);
        return value;
    }

    /**
     * Changes the fire mode of a weapon.
     * 
     * @param subject
     * @param waffe
     * @param value
     */
    public static void setFireModus(RuntimeCharacter subject, Feuerwaffe waffe, FeuerModus value) {
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(waffe);
        data.setEFeature(Shr5Package.Literals.FEUERWAFFE__MODIE);
//        FeuerModus fm = (FeuerModus)subject.getExtendetData().get(data);
//        if (fm == null) {
            subject.getExtendetData().put(data, value);
//        }
    }

    public static int getWoundMod(RuntimeCharacter subject, List<ProbeMod> mods) {
        if (subject == null)
            return 0;

        int pDamage = subject.getPhysicalDamage() / 3;
        int mDamage = subject.getMentalDamage() / 3;

        int val = -pDamage - mDamage;
        if (mods != null && val != 0) {
            EAttribute eAttribute = RuntimePackage.Literals.PHYICAL_STATE__ZUSTAND;
            ProbeMod probeMod = createProbeMod(subject, val, eAttribute);
            mods.add(probeMod);
        }
        return val;
    }

    protected static ProbeMod createProbeMod(EObject subject, int val, EStructuralFeature feature) {
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(subject);
        data.setEFeature(feature);
        ProbeMod probeMod = GameplayFactory.eINSTANCE.createProbeMod();
        probeMod.setType(data);
        probeMod.setValue(val);
        return probeMod;
    }

    /**
     * Calculates the current defense mod for the given character.
     * 
     * @param subject
     * @return
     */
    public static int getDefenceMod(RuntimeCharacter subject, List<ProbeMod> mods) {
        if (subject == null)
            return 0;

        AbstraktPersona persona = subject.getCharacter().getPersona();
        int mod = 0;

        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(subject);
        data.setEFeature(GameplayPackage.Literals.INTERRUPT_ACTION__INTERRUPT_TYPE);

        EList<?> listValue = subject.getListValue(data);
        if (listValue.contains(InterruptType.DODGE)) {

            listValue.remove(InterruptType.DODGE);
        } else if (listValue.contains(InterruptType.BLOCK)) {

            listValue.remove(InterruptType.BLOCK);
        } else if (listValue.contains(InterruptType.PARRY)) {
            Nahkampfwaffe nw = null;
            AbstraktGegenstand leftHand = subject.getLeftHand();
            if (leftHand instanceof Nahkampfwaffe) {
                nw = (Nahkampfwaffe)leftHand;

            } else {
                AbstraktGegenstand rightHand = subject.getRightHand();
                if (rightHand instanceof Nahkampfwaffe) {
                    nw = (Nahkampfwaffe)rightHand;

                }
            }

            Fertigkeit fertigkeit = nw.getFertigkeit();
            Integer fertigkeitValue = ShadowrunTools.findFertigkeitValue(fertigkeit, persona);
            if (fertigkeitValue > 0)
                mod = mod + fertigkeitValue;

            listValue.remove(InterruptType.PARRY);
        } else if (listValue.contains(InterruptType.FULL_DEFENSE)) {
            int willenskraft = persona.getWillenskraft();
            mod = willenskraft;
        }

        data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(subject);
        data.setEFeature(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN);

        int defenceValue = subject.getIntegerValue(data);
        if (mods != null && defenceValue != 0) {
            ProbeMod probeMod = createProbeMod(subject, defenceValue, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN);
            mods.add(probeMod);
        }

        mod = mod + defenceValue;
        return mod;
    }

    /**
     * Increases the defense modification.
     * 
     * @param subject
     * @param value
     */
    public static void inreaseDefenceMod(RuntimeCharacter subject, int value) {
        if (subject == null)
            return;

        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(subject);
        data.setEFeature(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN);
        // int integerValue = subject.getIntegerValue(data);
        subject.increaseValue(data, value);
    }

    /**
     * Clears all interrupt markers.
     * 
     * @param subject
     */
    public static void clearInterruptActions(RuntimeCharacter subject) {
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(subject);
        data.setEFeature(GameplayPackage.Literals.INTERRUPT_ACTION__INTERRUPT_TYPE);

        EList<?> listValue = subject.getListValue(data);
        if (!listValue.isEmpty())
            listValue.clear();
    }

    /**
     * Return the range mod for a given distance and the weapon.
     * 
     * @param subject
     * @param weapon
     * @param range
     * @param mods
     * @return
     */
    public static int getRangeMod(RuntimeCharacter subject, AbstaktFernKampfwaffe weapon, int range, List<ProbeMod> mods) {
        int mod = 0;
        Reichweite reichweite = weapon.getReichweite();
        if (reichweite != null) {
            if (reichweite.getMin() <= range && reichweite.getKurz() > range) {
                return 0;
            } else if (reichweite.getKurz() <= range && reichweite.getMittel() > range) {
                mod = -1;
            } else if (reichweite.getMittel() <= range && reichweite.getWeit() > range) {
                mod = -3;
            } else if (reichweite.getWeit() <= range && reichweite.getExtrem() > range) {
                mod = -6;
            } else
                mod = Integer.MIN_VALUE;

            if (mods != null) {
                ProbeMod probeMod = createProbeMod(weapon, mod, Shr5Package.Literals.ABSTAKT_FERN_KAMPFWAFFE__REICHWEITE);
                mods.add(probeMod);
            }
        }
        return mod;
    }

    // public static String printCommand(Command cmd) {
    //
    // if (cmd instanceof SuccesTest) {
    // SuccesTest st = (SuccesTest)cmd;// ([su]|[gl])/[lim]([nh]/[th])[dp][probe]x
    // return String.format("(%s|%s)%s(%s/%s)%s%s", st.getSuccesses(), st.getGlitches(), st.getLimit(), st.getNetHits(), st.getThresholds(), st
    // .getProbe().size(), st.getProbe().toString());
    // } else if (cmd instanceof Probe) {
    // Probe st = (Probe)cmd;// ([su]|[gl])/[lim]|[dp][probe]
    // return String
    // .format("(%s|%s)%s|%s%s", st.getSuccesses(), st.getGlitches(), st.getLimit(), st.getProbe().size(), st.getProbe().toString());
    // }
    //
    // return "";
    // }

    /**
     * Retuns the skill dice pool for a skill.
     * 
     * @param skill
     * @param subject
     * @return
     */
    public static int getSkillDicePool(Fertigkeit skill, RuntimeCharacter subject) {
        AbstraktPersona persona = subject.getCharacter().getPersona();
        Integer fertigkeitValue = ShadowrunTools.findFertigkeitValue(skill, persona);

        try {
            EAttribute attribut = skill.getAttribut();
            Integer att = (Integer)persona.eGet(attribut);
            return fertigkeitValue + att;

        } catch (Exception e) {

        }
        return -1;
    }

    /**
     * Creates and returns the first simple action which free.
     * 
     * @param initativePass
     * @return
     */
    public static void insertSimpleAction(InitativePass initativePass, SimpleAction simpleAction) {
        CommandWrapper action = initativePass.getAction();
        if (action instanceof SimpleActions) {
            SimpleActions sa = (SimpleActions)action;
            if (sa.getAction1() == null) {
                sa.setAction1(simpleAction);
            } else if (sa.getAction2() == null) {
                sa.setAction2(simpleAction);
            }
        } else {
            SimpleActions simpleActions = GameplayFactory.eINSTANCE.createSimpleActions();
            simpleActions.setAction1(simpleAction);
            initativePass.setAction(simpleActions);
        }
    }

    /**
     * Creates and returns the first simple action which free.
     * 
     * @param initativePass
     * @return
     */
    public static SimpleAction getSimpleAction(InitativePass initativePass) {
        CommandWrapper action = initativePass.getAction();
        if (action instanceof SimpleActions) {
            SimpleActions sa = (SimpleActions)action;
            if (sa.getAction1() == null) {
                SimpleAction simpleAction = GameplayFactory.eINSTANCE.createSimpleAction();
                sa.setAction1(simpleAction);
                return simpleAction;
            } else if (sa.getAction2() == null) {
                SimpleAction simpleAction = GameplayFactory.eINSTANCE.createSimpleAction();
                sa.setAction2(simpleAction);
                return simpleAction;

            }
            return null;
            // }
            // else if (action instanceof ComplexAction) {
            // ComplexAction ca = (ComplexAction)action;

        } else {
            SimpleActions simpleActions = GameplayFactory.eINSTANCE.createSimpleActions();
            SimpleAction simpleAction = GameplayFactory.eINSTANCE.createSimpleAction();
            simpleActions.setAction1(simpleAction);
            initativePass.setAction(simpleActions);
            return simpleAction;
        }
    }

    /**
     * Returns the combat turn the command is executed in.
     * 
     * @param cmd
     * @return
     */
    public static CombatTurn getCombatTurn(Command cmd) {
        return (CombatTurn)findParentByType(cmd, GameplayPackage.Literals.COMBAT_TURN);
    }

    /**
     * Finds the parent by the eContainer per eClass.
     * 
     * @param eObject
     * @param eClass
     * @return
     */
    private static EObject findParentByType(EObject eObject, EClass eClass) {
        if (eObject != null && eClass.equals(eObject.eClass()))
            return eObject;
        eObject = findParentByType(eObject.eContainer(), eClass);
        return eObject;
    }

    public static List<SubjectCommand> createCharacterCommands(RuntimeCharacter persona) {
        ArrayList<SubjectCommand> list = new ArrayList<SubjectCommand>(5);
        SuccesTestCmd succesTestCmd = GameplayFactory.eINSTANCE.createSuccesTestCmd();
        succesTestCmd.setSubject(persona);
        list.add(succesTestCmd);
        SkillTestCmd skillTestCmd = GameplayFactory.eINSTANCE.createSkillTestCmd();
        skillTestCmd.setSubject(persona);
        list.add(skillTestCmd);
        ExtendetSkillTestCmd extendetSkillTestCmd = GameplayFactory.eINSTANCE.createExtendetSkillTestCmd();
        extendetSkillTestCmd.setSubject(persona);
        list.add(extendetSkillTestCmd);
        OpposedSkillTestCmd opposedSkillTestCmd = GameplayFactory.eINSTANCE.createOpposedSkillTestCmd();
        opposedSkillTestCmd.setSubject(persona);
        list.add(opposedSkillTestCmd);
        DefensTestCmd defensTestCmd = GameplayFactory.eINSTANCE.createDefensTestCmd();
        defensTestCmd.setSubject(persona);
        list.add(defensTestCmd);
        DamageTest damageTest = GameplayFactory.eINSTANCE.createDamageTest();
        damageTest.setSubject(persona);
        list.add(damageTest);
        return list;
    }
    
    public static List<EClass> getCharacterCommands() {
        ArrayList<EClass> list = new ArrayList<EClass>(7);
        list.add(GameplayPackage.Literals.SKILL_TEST_CMD);
//        list.add(GameplayPackage.Literals.SUCCES_TEST);
        list.add(GameplayPackage.Literals.EXTENDET_SKILL_TEST_CMD);
        list.add(GameplayPackage.Literals.OPPOSED_SKILL_TEST_CMD);
        list.add(GameplayPackage.Literals.DEFENS_TEST_CMD);
        list.add(GameplayPackage.Literals.DAMAGE_TEST);
        return list;
    }

    public static List<RuntimeCharacter> getActiveCharacters(List<RuntimeCharacter> combatants) {
        return new ArrayList<RuntimeCharacter>(Collections2.filter(combatants, new Predicate<RuntimeCharacter>() {
            @Override
            public boolean apply(RuntimeCharacter input) {
                return input.getZustand() == Zustand.OK;
            }
        }));
    }

    /**
     * Get the recoile modification.
     * 
     * @param subject
     * @param feuerwaffe
     * @param probeMods
     * @return
     */
    public static int getRecoilMod(RuntimeCharacter subject, Feuerwaffe feuerwaffe, List<ProbeMod> probeMods) {
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(subject);
        data.setEFeature(Shr5Package.Literals.FEUERWAFFE__RUECKSTOSS);
        int rc = 1 + (subject.getCharacter().getPersona().getStaerke() / 3) + feuerwaffe.getRueckstoss();
        int recoil = Math.min(0, rc - subject.getIntegerValue(data));
        if (probeMods != null && recoil != 0) {
            ProbeMod probeMod = createProbeMod(subject, recoil, Shr5Package.Literals.FEUERWAFFE__RUECKSTOSS);
            probeMods.add(probeMod);
        }

        return recoil;
    }

    /**
     * Inceases the recoile mod by the value.
     * 
     * @param subject
     * @param weapon
     * @param value
     */
    public static void inceaseRecoilMod(RuntimeCharacter subject, AbstaktFernKampfwaffe weapon, int value) {
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(subject);
        data.setEFeature(Shr5Package.Literals.FEUERWAFFE__RUECKSTOSS);
        subject.increaseValue(data, value);
        data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(null);
        data.setEFeature(Shr5Package.Literals.FEUERWAFFE__RUECKSTOSS);
        subject.getExtendetData().put(data, Boolean.TRUE);
    }

    /**
     * Removes the recoil mod if the last turn was no increase.
     * 
     * @param subject
     * @param weapon
     * @param value
     */
    public static void clearRecoilMod(RuntimeCharacter subject) {
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(null);
        data.setEFeature(Shr5Package.Literals.FEUERWAFFE__RUECKSTOSS);
        Object object = subject.getExtendetData().get(data);
        if (object != null) {
            subject.getExtendetData().remove(data);
            return;
        }

        data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(subject);
        data.setEFeature(Shr5Package.Literals.FEUERWAFFE__RUECKSTOSS);
        subject.getExtendetData().remove(data);
    }

}
