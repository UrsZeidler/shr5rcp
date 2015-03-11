/**
 * 
 */
package de.urszeidler.eclipse.shr5.gameplay.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
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
import de.urszeidler.eclipse.shr5.Credstick;
import de.urszeidler.eclipse.shr5.CredstickTransaction;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FeuerModus;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.Kleidung;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.Magazin;
import de.urszeidler.eclipse.shr5.Munition;
import de.urszeidler.eclipse.shr5.Nahkampfwaffe;
import de.urszeidler.eclipse.shr5.Reichweite;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.CommandWrapper;
import de.urszeidler.eclipse.shr5.gameplay.ComplexAction;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.InterruptType;
import de.urszeidler.eclipse.shr5.gameplay.MeeleAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.ProbeMod;
import de.urszeidler.eclipse.shr5.gameplay.RangedAttackCmd;
import de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand;
import de.urszeidler.eclipse.shr5.gameplay.SimpleAction;
import de.urszeidler.eclipse.shr5.gameplay.SimpleActions;
import de.urszeidler.eclipse.shr5.runtime.ExtendetData;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5.runtime.Zustand;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.shr5.gameplay.dice.W6Dice;

/**
 * @author urs
 */
public class GameplayTools {

    public static final class PushTheLimitPredicate implements Predicate<Integer> {
        @Override
        public boolean apply(Integer input) {
            // the INteger to 100 is static bound so this should match
            return input == 6;
        }
    }

    /**
     * Create a runtime character.
     * 
     * @return
     */
    public static RuntimeCharacter createRuntimeCharacter() {
        ManagedCharacter character = Shr5managementFactory.eINSTANCE.createNonPlayerCharacter();
        AbstraktPersona persona = Shr5Factory.eINSTANCE.createMudanPersona();
        persona.setKonstitutionBasis(4);
        Spezies spezies = Shr5Factory.eINSTANCE.createSpezies();
        Nahkampfwaffe nahkampfwaffe = Shr5Factory.eINSTANCE.createNahkampfwaffe();
        nahkampfwaffe.setSchadenscode("STR+0P");
        spezies.setAngriff(nahkampfwaffe);
        persona.setSpezies(spezies);
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
        if (waffe == null)
            return null;

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
        // FeuerModus fm = (FeuerModus)subject.getExtendetData().get(data);
        // if (fm == null) {
        subject.getExtendetData().put(data, value);
        // }
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
     * Removes the probe mode.
     * 
     * @param subject
     * @param val
     * @param feature
     * @param mods
     */
    public static void removeProbeMode(EObject subject, EStructuralFeature feature, List<ProbeMod> mods) {
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(subject);
        data.setEFeature(feature);

        for (Iterator<ProbeMod> iterator = mods.iterator(); iterator.hasNext();) {
            ProbeMod probeMod = iterator.next();
            if (data.equals(probeMod.getType()))
                iterator.remove();
        }
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
            Nahkampfwaffe nw = GameplayTools.getMeleeWeapon(subject);// null;

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
     * Collectes the melee modififćators.
     * 
     * @param subject
     * @param mods
     * @return
     */
    public static int getMeleeCombatMod(RuntimeCharacter subject, List<ProbeMod> mods) {
        int mod = 0;
        ExtendetData data = RuntimeFactory.eINSTANCE.createExtendetData();
        data.setEObject(subject);
        data.setEFeature(RuntimePackage.Literals.NAHKAMP_MODIFIKATIONEN__CHARACTER_PRONE);

        if (mods != null && subject.getExtendetData().containsKey(data)) {
            ProbeMod probeMod = createProbeMod(subject, -1, RuntimePackage.Literals.NAHKAMP_MODIFIKATIONEN__CHARACTER_PRONE);
            mods.add(probeMod);
            mod++;
        }

        return mod;
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
        if(weapon==null)
            return 0;
        
        Reichweite reichweite = weapon.getReichweite();
        if (reichweite != null) {
            if (reichweite.getMin() <= range && reichweite.getKurz() > range) {
                mod = 0;
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
                removeProbeMode(weapon, Shr5Package.Literals.ABSTAKT_FERN_KAMPFWAFFE__REICHWEITE, mods);
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
        if (eObject == null)
            return null;
        eObject = findParentByType(eObject.eContainer(), eClass);
        return eObject;
    }

    public static List<EClass> getCharacterCommands() {
        ArrayList<EClass> list = new ArrayList<EClass>(7);
        list.add(GameplayPackage.Literals.SKILL_TEST_CMD);
        list.add(GameplayPackage.Literals.SUCCES_TEST_CMD);
        list.add(GameplayPackage.Literals.EXTENDET_SKILL_TEST_CMD);
        list.add(GameplayPackage.Literals.OPPOSED_SKILL_TEST_CMD);
        list.add(GameplayPackage.Literals.DEFENS_TEST_CMD);
        list.add(GameplayPackage.Literals.DAMAGE_TEST);
        list.add(GameplayPackage.Literals.MEELE_ATTACK_CMD);
        list.add(GameplayPackage.Literals.RANGED_ATTACK_CMD);
        list.add(GameplayPackage.Literals.DRAIN_COMMAND);
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

    /**
     * Return the defence mod for a modus and a number of shoots
     * 
     * @param rangedAttackCmd
     * @param probeMods
     * @return
     */
    public static int getFwDefenceMod(RangedAttackCmd rangedAttackCmd, EList<ProbeMod> probeMods) {
        FeuerModus modus = rangedAttackCmd.getModus();
        int numberOfShoots = rangedAttackCmd.getNumberOfShoots();
        if (numberOfShoots < 3)
            return 0;

        int mod = 0;
        switch (modus) {
            case HM:
                mod = -2;
                break;
            case SM:
                if (numberOfShoots > 5)
                    mod = -5;
                else
                    mod = -2;
                break;
            case AM:
                if (numberOfShoots > 19)
                    mod = 0;
                else if (numberOfShoots > 9)
                    mod = -9;
                else
                    mod = -5;
            default:
                break;
        }
        if (probeMods != null && mod != 0) {
            ProbeMod probeMod = createProbeMod(rangedAttackCmd.getObject(), mod, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN);
            probeMods.add(probeMod);
        }
        return mod;
    }

    /**
     * Removes the number of rounds from the clip of the weapon.
     * 
     * @param weapon
     * @param numberOfShoots
     * @return the bullets shot
     */
    public static List<Munition> reduceRounds(AbstaktFernKampfwaffe weapon, int numberOfShoots) {
        ArrayList<Munition> arrayList = new ArrayList<Munition>(numberOfShoots);
        try {
            if (weapon instanceof Feuerwaffe) {
                Feuerwaffe fw = (Feuerwaffe)weapon;
                Magazin magazin = fw.getMagazin();
                if (magazin != null) {
                    for (int i = 0; i < numberOfShoots; i++) {
                        if (magazin.getBullets().size() > 0) {
                            Munition munition = magazin.getBullets().get(0);
                            munition.setAnzahl(munition.getAnzahl() - 1);
                            arrayList.add(magazin.getBullets().remove(0));
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
        return arrayList;
    }

    /**
     * Returns the reach mod for the subject. It compares the reaches between subject and object.
     * 
     * @param attacker
     * @param attackerWeapon
     * @param defender
     * @param probeMods
     * @return
     */
    public static int getMeleeReachMod(RuntimeCharacter attacker, Nahkampfwaffe attackerWeapon, RuntimeCharacter defender, EList<ProbeMod> probeMods) {
        Nahkampfwaffe defenderWeapon = getMeleeWeapon(defender);
        int attackerMod = attackerWeapon.getReichweite()
                + attacker.getCharacter().getPersona().getModManager().getmodWert(Shr5Package.Literals.NAHKAMPFWAFFE__REICHWEITE);
        int defenderMod = defenderWeapon.getReichweite()
                + defender.getCharacter().getPersona().getModManager().getmodWert(Shr5Package.Literals.NAHKAMPFWAFFE__REICHWEITE);

        int mod = defenderMod - attackerMod;
        if (probeMods != null && mod != 0) {
            ProbeMod probeMod = createProbeMod(defender, mod, Shr5Package.Literals.NAHKAMPFWAFFE__REICHWEITE);
            probeMods.add(probeMod);
        }

        return mod;
    }

    /**
     * Returns from left to right the first melee weapon or the angriff of the {@link Spezies}.
     * 
     * @param object
     * @return
     */
    public static Nahkampfwaffe getMeleeWeapon(RuntimeCharacter object) {
        AbstraktGegenstand leftHand = object.getLeftHand();
        if (leftHand instanceof Nahkampfwaffe) {
            return (Nahkampfwaffe)leftHand;
        }
        AbstraktGegenstand rightHand = object.getRightHand();
        if (rightHand instanceof Nahkampfwaffe) {
            return (Nahkampfwaffe)rightHand;
        }
        AbstraktPersona persona = object.getCharacter().getPersona();
        return persona.getSpezies().getAngriff();
    }

    /**
     * Returns from left to right the first melee weapon or the angriff of the {@link Spezies}.
     * 
     * @param object
     * @return
     */
    public static AbstaktFernKampfwaffe getRangedWeapon(RuntimeCharacter object) {
        AbstraktGegenstand leftHand = object.getLeftHand();
        if (leftHand instanceof AbstaktFernKampfwaffe) {
            return (AbstaktFernKampfwaffe)leftHand;
        }
        AbstraktGegenstand rightHand = object.getRightHand();
        if (rightHand instanceof AbstaktFernKampfwaffe) {
            return (AbstaktFernKampfwaffe)rightHand;
        }
        return null;
    }

    public static Feuerwaffe getMagazingType(Magazin m) {
        Feuerwaffe type = m.getType();
        if (type != null)
            return type;

        EObject eContainer = m.eContainer();
        if (eContainer instanceof Feuerwaffe) {
            return (Feuerwaffe)eContainer;
        }
        return null;
    }

    public static int getEdgeValue(RuntimeCharacter subject) {
        AbstraktPersona persona = subject.getCharacter().getPersona();
        int edge = persona.getEdge() + persona.getModManager().getmodWert(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__EDGE);
        return edge;
    }

    public static List<Integer> rollPushTheLimit(int edgeValue) {
        W6Dice w6Dice = new W6Dice();
        List<Integer> probe = w6Dice.probe(edgeValue);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(probe);
        Collection<Integer> filter = Collections2.filter(probe, new PushTheLimitPredicate());

        while (!filter.isEmpty()) {
            probe = w6Dice.probe(filter.size());
            arrayList.addAll(probe);
            filter = Collections2.filter(probe, new PushTheLimitPredicate());
        }
        return arrayList;
    }

    /**
     * Simple method.
     * 
     * @param subject
     * @param i
     */
    public static void increaseEdgeValue(RuntimeCharacter subject, int i) {
        int usedEdge = subject.getUsedEdge();
        subject.setUsedEdge(usedEdge + i);
    }

    /**
     * @param persona
     * @return
     */
    public static int getArmorValue(RuntimeCharacter subject) {
        AbstraktPersona persona = subject.getCharacter().getPersona();
        int armor = 0;
        if (persona instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)persona;
            armor = armor + kp.getPanzer();
        }
        Kleidung k = subject.getArmor();
        if (k != null)
            armor = armor + k.getRuestung();
        return armor;
    }

    public static SetFeatureCommand createCredstickTransactionCommand(Credstick credstick, String message, BigDecimal amount, Date date) {
        CredstickTransaction transaction = Shr5Factory.eINSTANCE.createCredstickTransaction();
        transaction.setDescription(message);
        transaction.setDate(date);
        transaction.setAmount(amount);

        SetFeatureCommand setFeatureCommand = GameplayFactory.eINSTANCE.createSetFeatureCommand();
        setFeatureCommand.setObject(credstick);
        setFeatureCommand.setFeature(Shr5Package.Literals.CREDSTICK__TRANSACTIONLOG);
        setFeatureCommand.setValue(transaction);
        return setFeatureCommand;
    }

    /**
     * Get the limit attribute for a skill or null
     * 
     * @param skill
     * @return
     */
    public static EAttribute getLimitForSkill(Fertigkeit skill) {
        if (skill == null)
            return null;

        EAttribute attribut = skill.getAttribut();
        if (attribut.equals(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT)
                || attribut.equals(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__KONSTITUTION)
                || attribut.equals(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__STAERKE))
            return Shr5Package.Literals.CHRAKTER_LIMITS__KOERPERLICH;

        if (attribut.equals(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__INTUITION) || attribut.equals(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__LOGIK)
                || attribut.equals(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__WILLENSKRAFT))
            return Shr5Package.Literals.CHRAKTER_LIMITS__GEISTIG;

        if (attribut.equals(Shr5Package.Literals.GEISTIGE_ATTRIBUTE__CHARISMA))
            return Shr5Package.Literals.CHRAKTER_LIMITS__SOZIAL;

        return null;
    }

    /**
     * Return the eattribute for a name of the cyberdeck attributes.
     * 
     * @param attName
     * @return
     */
    public static EAttribute getCyberdeckAttribute(String attName) {
        if (Shr5Package.Literals.CYBERDECK__ATTRIBUTE1.getName().equals(attName))
            return Shr5Package.Literals.CYBERDECK__ATTRIBUTE1;
        if (Shr5Package.Literals.CYBERDECK__ATTRIBUTE2.getName().equals(attName))
            return Shr5Package.Literals.CYBERDECK__ATTRIBUTE2;
        if (Shr5Package.Literals.CYBERDECK__ATTRIBUTE3.getName().equals(attName))
            return Shr5Package.Literals.CYBERDECK__ATTRIBUTE3;
        if (Shr5Package.Literals.CYBERDECK__ATTRIBUTE4.getName().equals(attName))
            return Shr5Package.Literals.CYBERDECK__ATTRIBUTE4;

        return null;
    }

    public static ComplexAction createMeleeAction(RuntimeCharacter subject, RuntimeCharacter target, Nahkampfwaffe meleeWeapon) {
        ComplexAction complexAction = GameplayFactory.eINSTANCE.createComplexAction();
        MeeleAttackCmd meleeAttackCmd = GameplayFactory.eINSTANCE.createMeeleAttackCmd();
        meleeAttackCmd.setWeapon(meleeWeapon);
        meleeAttackCmd.setObject(target);

        complexAction.getSubCommands().add(meleeAttackCmd);
        return complexAction;
    }

    public static SimpleAction createRangedAction(InitativePass initativePass, int numberOfShoots, AbstaktFernKampfwaffe object, FeuerModus modus, RuntimeCharacter target, int distance) {
        SimpleAction simpleAction = GameplayTools.getSimpleAction(initativePass);
        if (simpleAction == null || object==null|| modus==null)
            return null;

        RangedAttackCmd rangedAttackCmd = GameplayFactory.eINSTANCE.createRangedAttackCmd();

        rangedAttackCmd.setNumberOfShoots(numberOfShoots);
        rangedAttackCmd.setWeapon(object);
        rangedAttackCmd.setModus(modus);
        rangedAttackCmd.setObject(target);
        rangedAttackCmd.setRange(distance);
        if (object instanceof Feuerwaffe) {
            Feuerwaffe fw = (Feuerwaffe)object;
            Magazin magazin = fw.getMagazin();
            if(magazin!=null)
                if(magazin.getBullets().size()==0)
                    return null;
        }

        simpleAction.getSubCommands().add(rangedAttackCmd);
        return simpleAction;
    }

}
