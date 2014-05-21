package de.urszeidler.eclipse.shr5.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;

import junit.framework.TestCase;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;

public class ShadowrunToolsTest extends TestCase {

    public void testFilterSkillGroups() {
        ArrayList<FertigkeitsGruppe> arrayList = new ArrayList<FertigkeitsGruppe>();
        
        FertigkeitsGruppe fertigkeitsGruppe = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();
        Fertigkeit fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);
        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);
        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);        
        arrayList.add(fertigkeitsGruppe);
        
        fertigkeitsGruppe = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();
        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);
        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);
        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);
        arrayList.add(fertigkeitsGruppe);
        
        
        fertigkeitsGruppe = Shr5Factory.eINSTANCE.createFertigkeitsGruppe();
        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);
        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);
        fertigkeit = Shr5Factory.eINSTANCE.createFertigkeit();
        fertigkeit.setAttribut(Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__KONSTITUTION);
        fertigkeitsGruppe.getFertigkeiten().add(fertigkeit);
        arrayList.add(fertigkeitsGruppe);
        
        
        ArrayList<FertigkeitsGruppe> filterSkillGroups = ShadowrunTools.filterSkillGroups(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE, arrayList);
        assertEquals("",2, filterSkillGroups.size());
        
        
    }

    
    public void testPermutation() {

        ArrayList<Integer> prefix = new ArrayList<Integer>();
        ArrayList<Integer> src = new ArrayList<Integer>();
        Set<List<Integer>> target = new HashSet<List<Integer>>();
       
        src.add(1);
        src.add(2);
        src.add(3);
        src.add(4);
        
        ShadowrunTools.permutation(prefix, src, target);
        Assert.assertEquals(24, target.size());
        System.out.println(target.size() +"  "+target);
        
        //ShadowrunTools.permutation("", "1234");
    }
}
