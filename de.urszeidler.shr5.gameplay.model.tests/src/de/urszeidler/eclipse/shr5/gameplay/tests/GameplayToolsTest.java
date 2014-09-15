/**
 * 
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;
import de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FeuerModus;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.Reichweite;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.gameplay.ProbeMod;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5.runtime.Zustand;

/**
 * @author urs
 */
public class GameplayToolsTest extends TestCase {

    /**
     * Test method for
     * {@link de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools#getWoundMod(de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter, java.util.List)}
     * .
     */
    public void testGetWoundMod() {
        RuntimeCharacter character1 = GameplayTools.createRuntimeCharacter();

        character1.setPhysicalDamage(3);
        assertEquals(-1, GameplayTools.getWoundMod(character1, null));
        character1.setPhysicalDamage(6);
        assertEquals(-2, GameplayTools.getWoundMod(character1, null));
        character1.setMentalDamage(3);
        assertEquals(-3, GameplayTools.getWoundMod(character1, null));
        character1.setPhysicalDamage(5);
        assertEquals(-2, GameplayTools.getWoundMod(character1, null));
        ArrayList<ProbeMod> arrayList = new ArrayList<ProbeMod>();
        assertEquals(-2, GameplayTools.getWoundMod(character1, arrayList));
        assertEquals(1, arrayList.size());
        ProbeMod probeMod = arrayList.get(0);
        assertEquals(-2, probeMod.getValue());
        assertEquals(character1, probeMod.getType().getEObject());
        assertEquals(RuntimePackage.Literals.PHYICAL_STATE__ZUSTAND, probeMod.getType().getEFeature());

        assertEquals(0, GameplayTools.getWoundMod(null, null));
    }

    /**
     * Test method for
     * {@link de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools#getRangeMod(de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter, de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe, int, java.util.List)}
     * .
     */
    public void testGetRangeMod() {
        RuntimeCharacter character1 = GameplayTools.createRuntimeCharacter();

        AbstaktFernKampfwaffe weapon = Shr5Factory.eINSTANCE.createFeuerwaffe();
        Reichweite reichweite = Shr5Factory.eINSTANCE.createReichweite();
        weapon.setReichweite(reichweite);

        reichweite.setMin(0);
        reichweite.setKurz(5);
        reichweite.setMittel(10);
        reichweite.setWeit(15);
        reichweite.setExtrem(20);
        assertEquals(0, GameplayTools.getRangeMod(character1, weapon, 0, null));
        assertEquals(0, GameplayTools.getRangeMod(character1, weapon, 4, null));
        assertEquals(-1, GameplayTools.getRangeMod(character1, weapon, 5, null));
        assertEquals(-3, GameplayTools.getRangeMod(character1, weapon, 10, null));
        assertEquals(-6, GameplayTools.getRangeMod(character1, weapon, 15, null));
        assertEquals(Integer.MIN_VALUE, GameplayTools.getRangeMod(character1, weapon, 21, null));
        ArrayList<ProbeMod> arrayList = new ArrayList<ProbeMod>();

        assertEquals(-6, GameplayTools.getRangeMod(character1, weapon, 15, arrayList));
        assertEquals(1, arrayList.size());
        ProbeMod probeMod = arrayList.get(0);
        assertEquals(-6, probeMod.getValue());
        assertEquals(weapon, probeMod.getType().getEObject());
        assertEquals(Shr5Package.Literals.ABSTAKT_FERN_KAMPFWAFFE__REICHWEITE, probeMod.getType().getEFeature());

    }

    public void testDefseMod() throws Exception {
        RuntimeCharacter character1 = GameplayTools.createRuntimeCharacter();

        GameplayTools.inreaseDefenceMod(character1, 1);
        assertEquals(1, GameplayTools.getDefenceMod(character1, null));
        ArrayList<ProbeMod> arrayList = new ArrayList<ProbeMod>();
        assertEquals(1, GameplayTools.getDefenceMod(character1, arrayList));
        assertEquals(1, arrayList.size());
        ProbeMod probeMod = arrayList.get(0);
        assertEquals(1, probeMod.getValue());
        assertEquals(character1, probeMod.getType().getEObject());
        assertEquals(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN, probeMod.getType().getEFeature());

        GameplayTools.clearDefseMod(character1);
        assertEquals(0, GameplayTools.getDefenceMod(character1, arrayList));
        GameplayTools.clearDefseMod(null);

        assertEquals(0, GameplayTools.getDefenceMod(null, arrayList));
    }

    public void testGetSkillDicePool() throws Exception {
        RuntimeCharacter character1 = GameplayTools.createRuntimeCharacter();

        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);

        character1.getCharacter().getPersona().setGeschicklichkeitBasis(5);
        assertEquals(4, GameplayTools.getSkillDicePool(fertigkeit, character1));
        PersonaFertigkeit personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
        personaFertigkeit.setFertigkeit(fertigkeit);
        personaFertigkeit.setStufe(5);
        character1.getCharacter().getPersona().getFertigkeiten().add(personaFertigkeit);

        assertEquals(10, GameplayTools.getSkillDicePool(fertigkeit, character1));

    }

    public void testRecoilMod() throws Exception {
        RuntimeCharacter character1 = GameplayTools.createRuntimeCharacter();
        character1.getCharacter().getPersona().setStaerkeBasis(3);

        Feuerwaffe weapon = Shr5Factory.eINSTANCE.createFeuerwaffe();
        Reichweite reichweite = Shr5Factory.eINSTANCE.createReichweite();
        weapon.setReichweite(reichweite);
        weapon.setRueckstoss(-2);

        assertEquals(0, GameplayTools.getRecoilMod(character1, weapon, null));

        GameplayTools.inceaseRecoilMod(character1, weapon, 1);
        assertEquals(-1, GameplayTools.getRecoilMod(character1, weapon, null));
        GameplayTools.inceaseRecoilMod(character1, weapon, -1);
        assertEquals(0, GameplayTools.getRecoilMod(character1, weapon, null));

        weapon.setRueckstoss(-1);
        GameplayTools.inceaseRecoilMod(character1, weapon, 1);
        assertEquals(0, GameplayTools.getRecoilMod(character1, weapon, null));

        GameplayTools.inceaseRecoilMod(character1, weapon, 1);
        assertEquals(-1, GameplayTools.getRecoilMod(character1, weapon, null));
        character1.getCharacter().getPersona().setStaerkeBasis(5);
        assertEquals(-1, GameplayTools.getRecoilMod(character1, weapon, null));
        character1.getCharacter().getPersona().setStaerkeBasis(6);
        assertEquals(0, GameplayTools.getRecoilMod(character1, weapon, null));

        GameplayTools.inceaseRecoilMod(character1, weapon, 1);
        assertEquals(-1, GameplayTools.getRecoilMod(character1, weapon, null));
        GameplayTools.clearRecoilMod(character1);
        assertEquals(-1, GameplayTools.getRecoilMod(character1, weapon, null));
        GameplayTools.clearRecoilMod(character1);
        assertEquals(0, GameplayTools.getRecoilMod(character1, weapon, null));

        GameplayTools.inceaseRecoilMod(character1, weapon, 3);

        ArrayList<ProbeMod> arrayList = new ArrayList<ProbeMod>();
        assertEquals(-1,  GameplayTools.getRecoilMod(character1, weapon, arrayList));
        assertEquals(1, arrayList.size());
        ProbeMod probeMod = arrayList.get(0);
        assertEquals(-1, probeMod.getValue());
        assertEquals(character1, probeMod.getType().getEObject());
        assertEquals(Shr5Package.Literals.FEUERWAFFE__RUECKSTOSS, probeMod.getType().getEFeature());

    }

    public void testFireModus() throws Exception {
        RuntimeCharacter character1 = GameplayTools.createRuntimeCharacter();
        character1.getCharacter().getPersona().setStaerkeBasis(3);

        Feuerwaffe weapon = Shr5Factory.eINSTANCE.createFeuerwaffe();
        Reichweite reichweite = Shr5Factory.eINSTANCE.createReichweite();
        weapon.setReichweite(reichweite);
        weapon.setRueckstoss(-2);
        weapon.getModie().add(FeuerModus.EM);
        weapon.getModie().add(FeuerModus.HM);

        assertEquals(FeuerModus.EM, GameplayTools.getFireArmModus(character1, weapon));

        GameplayTools.setFireModus(character1, weapon, FeuerModus.HM);
        assertEquals(FeuerModus.HM, GameplayTools.getFireArmModus(character1, weapon));

    }

    public void testGetActiveCharacters() throws Exception {
        RuntimeCharacter character1 = GameplayTools.createRuntimeCharacter();
        RuntimeCharacter character2 = GameplayTools.createRuntimeCharacter();

        ArrayList<RuntimeCharacter> arrayList = new ArrayList<RuntimeCharacter>();
        arrayList.add(character1);
        arrayList.add(character2);

        List<RuntimeCharacter> activeCharacters = GameplayTools.getActiveCharacters(arrayList);
        assertEquals(2, activeCharacters.size());

        character1.setZustand(Zustand.STERBEND);
        List<RuntimeCharacter> activeCharacters2 = GameplayTools.getActiveCharacters(arrayList);
        assertEquals(1, activeCharacters2.size());
        assertEquals(character2, activeCharacters2.get(0));
    }
    // /**
    // * Test method for {@link de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools#getSkillDicePool(de.urszeidler.eclipse.shr5.Fertigkeit,
    // de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter)}.
    // */
    // public void testGetSkillDicePool() {
    // fail("Not yet implemented"); // TODO
    // }

}
