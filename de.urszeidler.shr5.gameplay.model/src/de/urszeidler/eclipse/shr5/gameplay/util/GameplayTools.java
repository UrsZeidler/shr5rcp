/**
 * 
 */
package de.urszeidler.eclipse.shr5.gameplay.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;

import de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe;
import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.Nahkampfwaffe;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.InterruptType;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTest;
import de.urszeidler.eclipse.shr5.runtime.ExtendetData;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
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

    public static int getWoundMod(RuntimeCharacter subject) {
        if (subject == null)
            return 0;

        int pDamage = subject.getPhysicalDamage() / 3;
        int mDamage = subject.getMentalDamage() / 3;

        return -pDamage - mDamage;

    }

    /**
     * Calculates the current defense mod for the given character.
     * 
     * @param subject
     * @return
     */
    public static int getDefenceMod(RuntimeCharacter subject) {
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

        mod = mod - subject.getIntegerValue(data);
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

    public static int getRangeMod(RuntimeCharacter subject, AbstaktFernKampfwaffe weapon, int range) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static String printCommand(Command cmd) {

        if (cmd instanceof SuccesTest) {
            SuccesTest st = (SuccesTest)cmd;
            return String.format("%s%s%s|%s", st.getLimit(), st.getProbe().toString(), st.getSuccesses(), st.getGlitches());
        }
        // if (cmd instanceof Probe) {
        // Probe new_name = (Probe)cmd;
        //
        // }

        return "";
    }

    /**
     * Retuns the skill dice pool for a skill.
     * @param skill
     * @param subject
     * @return
     */
    public static int getSkillDicePool(Fertigkeit skill, RuntimeCharacter subject) {
        AbstraktPersona persona = subject.getCharacter().getPersona();
        Integer fertigkeitValue = ShadowrunTools.findFertigkeitValue(skill, persona);

        EAttribute attribut = skill.getAttribut();
        Integer att = (Integer)persona.eGet(attribut);

        return fertigkeitValue + att;
    }

}
