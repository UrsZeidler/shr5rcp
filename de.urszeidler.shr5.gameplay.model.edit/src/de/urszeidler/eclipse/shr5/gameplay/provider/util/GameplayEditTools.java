/**
 * 
 */
package de.urszeidler.eclipse.shr5.gameplay.provider.util;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.jface.viewers.LabelProvider;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.DamageTest;
import de.urszeidler.eclipse.shr5.gameplay.DefensTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.Probe;
import de.urszeidler.eclipse.shr5.gameplay.SkillTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTestCmd;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplaySwitch;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;

/**
 * @author urs
 */
public class GameplayEditTools {

    public static String probe2ProbeString(Probe probe) {
        final LabelProvider labelProvider = AdapterFactoryUtil.getInstance().getLabelProvider();

        GameplaySwitch<String> gameplaySwitch = new GameplaySwitch<String>() {
            @Override
            public String caseSkillTestCmd(SkillTestCmd object) {

                Fertigkeit skill = object.getSkill();
                AbstraktPersona persona = object.getSubject().getCharacter().getPersona();
                Integer fertigkeitValue = ShadowrunTools.findFertigkeitValue(skill, persona);
                EAttribute attribut = skill.getAttribut();
                Integer att = (Integer)persona.eGet(attribut);

                // int dice = GameplayTools.getSkillDicePool(skill, object.getSubject());

                return String.format("%s:%d %s:%d mods:%d = %d", labelProvider.getText(skill), fertigkeitValue, labelProvider.getText(attribut), att,
                        object.getMods(), GameplayTools.getSkillDicePool(skill, object.getSubject()) + object.getMods());
            }

            @Override
            public String caseSuccesTestCmd(SuccesTestCmd object) {
                return String.format("%d mods:%d = %d", object.getDicePool(), object.getMods(), object.getDicePool() + object.getMods());
            }

            @Override
            public String caseDefensTestCmd(DefensTestCmd object) {
                AbstraktPersona persona = object.getSubject().getCharacter().getPersona();
                return String.format("%d mods:%d = %d", persona.getAusweichen(), object.getMods(), persona.getAusweichen() + object.getMods());
            }

            @Override
            public String caseDamageTest(DamageTest object) {
                RuntimeCharacter subject = object.getSubject();
                int ruestung = GameplayTools.getArmorValue(subject);
                AbstraktPersona persona = object.getSubject().getCharacter().getPersona();
                int kon = persona.getKonstitution()
                        + persona.getModManager().getmodWert(Shr5Package.Literals.PROBEN_MODIFIKATOREN__SCHADENSWIEDERSTAND);
                return String.format("%d + %d %d dv mods:%d = %d", kon, ruestung, object.getDv(), object.getMods(), kon + ruestung + object.getDv()
                        + object.getMods());
            }
        };

        try {
            String doSwitch = gameplaySwitch.doSwitch(probe);
            if (doSwitch == null)
                return "";

            return doSwitch;

        } catch (Exception e) {
        }
        return "";
    }
}
