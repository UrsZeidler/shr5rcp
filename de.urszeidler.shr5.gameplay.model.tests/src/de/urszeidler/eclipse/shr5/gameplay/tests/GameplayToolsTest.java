/**
 * 
 */
package de.urszeidler.eclipse.shr5.gameplay.tests;

import junit.framework.TestCase;
import de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe;
import de.urszeidler.eclipse.shr5.Reichweite;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;

/**
 * @author urs
 *
 */
public class GameplayToolsTest extends TestCase {

    /**
     * Test method for {@link de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools#getWoundMod(de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter, java.util.List)}.
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
     }

    /**
     * Test method for {@link de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools#getRangeMod(de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter, de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe, int, java.util.List)}.
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
        assertEquals(0,GameplayTools.getRangeMod(character1, weapon, 0, null));
        assertEquals(0,GameplayTools.getRangeMod(character1, weapon, 4, null));
        assertEquals(-1,GameplayTools.getRangeMod(character1, weapon, 5, null));
        assertEquals(-3,GameplayTools.getRangeMod(character1, weapon, 10, null));
        assertEquals(-6,GameplayTools.getRangeMod(character1, weapon, 15, null));
        assertEquals(Integer.MIN_VALUE,GameplayTools.getRangeMod(character1, weapon, 21, null));
    }

//    /**
//     * Test method for {@link de.urszeidler.eclipse.shr5.gameplay.util.GameplayTools#getSkillDicePool(de.urszeidler.eclipse.shr5.Fertigkeit, de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter)}.
//     */
//    public void testGetSkillDicePool() {
//        fail("Not yet implemented"); // TODO
//    }

}
