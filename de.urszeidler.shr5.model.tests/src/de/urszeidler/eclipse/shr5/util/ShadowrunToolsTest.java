package de.urszeidler.eclipse.shr5.util;

import java.util.ArrayList;

import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import junit.framework.TestCase;

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

}
