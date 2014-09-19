/**
 * 
 */
package de.urszeidler.eclipse.shr5.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Predicate;

import de.urszeidler.eclipse.shr5.AbstraktModifikatoren;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.GeldWert;
import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.Koerpermods;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.SchadensTyp;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Spezies;

/**
 * Collection of tool methods.
 * 
 * @author urs
 */
public class ShadowrunTools {

    private static final String EMPTY = "";
    private static Map<EAttribute, EAttribute> base2SpeciesMin;
    private static Map<EAttribute, EAttribute> base2SpeciesMax;
    private static Map<EAttribute, EAttribute> base2Calced;

    private static List<EAttribute> orderedAttibutes;
    private static List<EAttribute> orderedBasedAttibutes;
    private static List<EAttribute> orderedCalcedAttibutes;
    private static Pattern damagePattern = Pattern.compile("(\\d*)(\\D)");
    private static Pattern damagePattern1 = Pattern.compile("\\(([\\w]{3})\\+([0-9]*)\\)(\\D)");

    ;

    // the static initaliser
    static {
        base2SpeciesMin = new HashMap<EAttribute, EAttribute>();
        base2SpeciesMin.put(Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, Shr5Package.Literals.SPEZIES__KONSTITUTION_MIN);
        base2SpeciesMin.put(Shr5Package.Literals.ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS, Shr5Package.Literals.SPEZIES__GESCHICKLICHKEIT_MIN);
        base2SpeciesMin.put(Shr5Package.Literals.ABSTRAKT_PERSONA__REAKTION_BASIS, Shr5Package.Literals.SPEZIES__REAKTION_MIN);
        base2SpeciesMin.put(Shr5Package.Literals.ABSTRAKT_PERSONA__STAERKE_BASIS, Shr5Package.Literals.SPEZIES__STAERKE_MIN);
        base2SpeciesMin.put(Shr5Package.Literals.ABSTRAKT_PERSONA__CHARISMA_BASIS, Shr5Package.Literals.SPEZIES__CHARISMA_MIN);
        base2SpeciesMin.put(Shr5Package.Literals.ABSTRAKT_PERSONA__INTUITION_BASIS, Shr5Package.Literals.SPEZIES__INTUITION_MIN);
        base2SpeciesMin.put(Shr5Package.Literals.ABSTRAKT_PERSONA__LOGIK_BASIS, Shr5Package.Literals.SPEZIES__LOGIK_MIN);
        base2SpeciesMin.put(Shr5Package.Literals.ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS, Shr5Package.Literals.SPEZIES__WILLENSKRAFT_MIN);
        base2SpeciesMin.put(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE_BASIS, Shr5Package.Literals.SPEZIES__MAGIE_MIN);
        base2SpeciesMin.put(Shr5Package.Literals.RESONANZ_PERSONA__RESONANZ_BASIS, Shr5Package.Literals.SPEZIES__RESONANZ_MIN);
        base2SpeciesMin.put(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__EDGE_BASIS, Shr5Package.Literals.SPEZIES__EDGE_MIN);

        base2SpeciesMax = new HashMap<EAttribute, EAttribute>();
        base2SpeciesMax.put(Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, Shr5Package.Literals.SPEZIES__KONSTITUTION_MAX);
        base2SpeciesMax.put(Shr5Package.Literals.ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS, Shr5Package.Literals.SPEZIES__GESCHICKLICHKEIT_MAX);
        base2SpeciesMax.put(Shr5Package.Literals.ABSTRAKT_PERSONA__REAKTION_BASIS, Shr5Package.Literals.SPEZIES__REAKTION_MAX);
        base2SpeciesMax.put(Shr5Package.Literals.ABSTRAKT_PERSONA__STAERKE_BASIS, Shr5Package.Literals.SPEZIES__STAERKE_MAX);
        base2SpeciesMax.put(Shr5Package.Literals.ABSTRAKT_PERSONA__CHARISMA_BASIS, Shr5Package.Literals.SPEZIES__CHARISMA_MAX);
        base2SpeciesMax.put(Shr5Package.Literals.ABSTRAKT_PERSONA__INTUITION_BASIS, Shr5Package.Literals.SPEZIES__INTUITION_MAX);
        base2SpeciesMax.put(Shr5Package.Literals.ABSTRAKT_PERSONA__LOGIK_BASIS, Shr5Package.Literals.SPEZIES__LOGIK_MAX);
        base2SpeciesMax.put(Shr5Package.Literals.ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS, Shr5Package.Literals.SPEZIES__WILLENSKRAFT_MAX);
        base2SpeciesMax.put(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE_BASIS, Shr5Package.Literals.SPEZIES__MAGIE_MAX);
        base2SpeciesMax.put(Shr5Package.Literals.RESONANZ_PERSONA__RESONANZ_BASIS, Shr5Package.Literals.SPEZIES__RESONANZ_MAX);
        base2SpeciesMax.put(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__EDGE_BASIS, Shr5Package.Literals.SPEZIES__EDGE_MAX);

        base2Calced = new HashMap<EAttribute, EAttribute>();
        base2Calced.put(Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS, Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__KONSTITUTION);
        base2Calced.put(Shr5Package.Literals.ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS, Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__GESCHICKLICHKEIT);
        base2Calced.put(Shr5Package.Literals.ABSTRAKT_PERSONA__REAKTION_BASIS, Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__REAKTION);
        base2Calced.put(Shr5Package.Literals.ABSTRAKT_PERSONA__STAERKE_BASIS, Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__STAERKE);
        base2Calced.put(Shr5Package.Literals.ABSTRAKT_PERSONA__CHARISMA_BASIS, Shr5Package.Literals.GEISTIGE_ATTRIBUTE__CHARISMA);
        base2Calced.put(Shr5Package.Literals.ABSTRAKT_PERSONA__INTUITION_BASIS, Shr5Package.Literals.GEISTIGE_ATTRIBUTE__INTUITION);
        base2Calced.put(Shr5Package.Literals.ABSTRAKT_PERSONA__LOGIK_BASIS, Shr5Package.Literals.GEISTIGE_ATTRIBUTE__LOGIK);
        base2Calced.put(Shr5Package.Literals.ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS, Shr5Package.Literals.GEISTIGE_ATTRIBUTE__WILLENSKRAFT);
        base2Calced.put(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE_BASIS, Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE);
        base2Calced.put(Shr5Package.Literals.RESONANZ_PERSONA__RESONANZ_BASIS, Shr5Package.Literals.RESONANZ_PERSONA__RESONANZ);
        base2Calced.put(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__EDGE_BASIS, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__EDGE);

        orderedAttibutes = new ArrayList<EAttribute>();
        orderedAttibutes.add(Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS);
        orderedAttibutes.add(Shr5Package.Literals.ABSTRAKT_PERSONA__GESCHICKLICHKEIT_BASIS);
        orderedAttibutes.add(Shr5Package.Literals.ABSTRAKT_PERSONA__REAKTION_BASIS);
        orderedAttibutes.add(Shr5Package.Literals.ABSTRAKT_PERSONA__STAERKE_BASIS);
        orderedAttibutes.add(Shr5Package.Literals.ABSTRAKT_PERSONA__WILLENSKRAFT_BASIS);
        orderedAttibutes.add(Shr5Package.Literals.ABSTRAKT_PERSONA__LOGIK_BASIS);
        orderedAttibutes.add(Shr5Package.Literals.ABSTRAKT_PERSONA__INTUITION_BASIS);
        orderedAttibutes.add(Shr5Package.Literals.ABSTRAKT_PERSONA__CHARISMA_BASIS);
        orderedAttibutes.add(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__EDGE_BASIS);
        orderedAttibutes.add(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE_BASIS);
        orderedAttibutes.add(Shr5Package.Literals.RESONANZ_PERSONA__RESONANZ_BASIS);

        orderedBasedAttibutes = new ArrayList<EAttribute>(orderedAttibutes);
        orderedBasedAttibutes.remove(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE_BASIS);
        orderedBasedAttibutes.remove(Shr5Package.Literals.RESONANZ_PERSONA__RESONANZ_BASIS);
        orderedBasedAttibutes.remove(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__EDGE_BASIS);

        orderedCalcedAttibutes = new ArrayList<EAttribute>(orderedAttibutes);
        // orderedAttibutes.add(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__ESSENZ);
        // orderedAttibutes.add(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__AUSWEICHEN);

    }

    /**
     * The ordered list of the attributes.
     * 
     * @return the orderedAttibutes
     */
    public static List<EAttribute> getOrderedAttibutes() {
        return orderedAttibutes;
    }

    /**
     * The ordered list of the attributes, filtered by the persona.
     * 
     * @return the orderedAttibutes
     */
    public static List<EAttribute> getOrderedAttibutes(AbstraktPersona persona) {
        List<EAttribute> attributes = orderedAttibutes;
        return filterAttributesForPersona(persona, attributes);
    }

    /**
     * The ordered list of the base attributes (without edge and resonance or magic), filtered by the persona.
     * 
     * @return the orderedAttibutes
     */
    public static List<EAttribute> getOrderedBaseAttibutes(AbstraktPersona persona) {
        List<EAttribute> attributes = orderedBasedAttibutes;
        return filterAttributesForPersona(persona, attributes);
    }

    private static List<EAttribute> filterAttributesForPersona(AbstraktPersona persona, List<EAttribute> attributes) {
        EList<EAttribute> eAllAttributes = persona.eClass().getEAllAttributes();

        ArrayList<EAttribute> list = new ArrayList<EAttribute>(attributes.size());
        for (EAttribute eAttribute : attributes) {
            if (eAllAttributes.contains(eAttribute))
                list.add(eAttribute);
        }

        return list;
    }

    /**
     * Get the species min attribute for a persona attribute.
     * 
     * @param attribute
     * @return
     */
    public static EAttribute base2Calced(EAttribute attribute) {
        return base2Calced.get(attribute);
    }

    /**
     * Get the species min attribute for a persona attribute.
     * 
     * @param attribute
     * @return
     */
    public static EAttribute base2SpeciesMin(EAttribute attribute) {
        return base2SpeciesMin.get(attribute);
    }

    /**
     * Get the species max attribute for a persona attribute.
     * 
     * @param attribute
     * @return
     */
    public static EAttribute base2SpeciesMax(EAttribute attribute) {
        return base2SpeciesMax.get(attribute);
    }

    /**
     * Create the permutation of the given list of integer, all unique combinations are stored in the target set.
     * Can be used to get all valid cyberdeck combinations.
     * 
     * @param prefix
     * @param src
     * @param target
     */
    public static void permutation(List<Integer> prefix, List<Integer> src, Set<List<Integer>> target) {
        int n = src.size();
        if (n == 0) {
            target.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                List<Integer> list = new ArrayList<Integer>(n);
                list.addAll(src.subList(0, i));
                list.addAll(src.subList(i + 1, n));
                Integer remove = src.get(i);
                ArrayList<Integer> prefix2 = new ArrayList<Integer>(prefix);
                prefix2.add(remove);
                permutation(prefix2, list, target);
            }
        }
    }

    /**
     * Collects all fertigkeiten and groups in a list.
     * 
     * @param persona
     * @return
     */
    public static ArrayList<Beschreibbar> fertigkeitsGruppenToFertigkeiten(AbstraktPersona persona) {
        ArrayList<Beschreibbar> list = new ArrayList<Beschreibbar>();
        EList<PersonaFertigkeitsGruppe> fertigkeitsGruppen = persona.getFertigkeitsGruppen();
        for (PersonaFertigkeitsGruppe personaFertigkeitsGruppe : fertigkeitsGruppen) {
            FertigkeitsGruppe fertigkeitsGruppe = personaFertigkeitsGruppe.getGruppe();
            list.add(fertigkeitsGruppe);
            EList<Fertigkeit> fertigkeiten = fertigkeitsGruppe.getFertigkeiten();
            for (Fertigkeit fertigkeit : fertigkeiten) {
                list.add(fertigkeit);
            }
        }
        return list;
    }

    /**
     * Returns the values of the attribute, if the calculated value is not equals it will return as (val).
     * 
     * @param eAttribute
     * @param persona
     * @return
     */
    public static String attributeValue(AbstraktPersona persona, EAttribute eAttribute) {
        EAttribute base2Calced = ShadowrunTools.base2Calced(eAttribute);
        if (base2Calced == null)
            return EMPTY;

        Integer value = (Integer)persona.eGet(eAttribute);
        Integer calc = (Integer)persona.eGet(base2Calced);
        String a = EMPTY;
        if (value != calc)
            a = "(" + calc + ")";

        return value.toString() + a;
    }

    /**
     * Filters the skillgoups only having skill with the given attribute.
     * 
     * @param attribute the attribute
     * @return the filtered list
     */
    public static ArrayList<FertigkeitsGruppe> filterSkillGroups(EAttribute attribute, List<FertigkeitsGruppe> list) {
        ArrayList<FertigkeitsGruppe> arrayList = new ArrayList<FertigkeitsGruppe>(list.size());
        boolean included = true;
        for (FertigkeitsGruppe fertigkeitsGruppe : list) {
            if (fertigkeitsGruppe == null)
                continue;
            EList<Fertigkeit> fertigkeiten = fertigkeitsGruppe.getFertigkeiten();
            for (Fertigkeit fertigkeit : fertigkeiten) {
                if (!attribute.equals(fertigkeit.getAttribut())) {
                    included = false;
                    break;
                }
            }
            if (included)
                arrayList.add(fertigkeitsGruppe);
            included = true;
        }
        return arrayList;
    }

    /**
     * Returns the essence value for the modificator.
     * 
     * @param mod
     * @return
     */
    public static int getEssencesValue(AbstraktModifikatoren mod) {
        return getModificatorValue(mod, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__ESSENZ);
    }

    /**
     * Returns the summ of modificator values for the given eattribute.
     * 
     * @param mod the modificator
     * @param eattribute the attribute to get the value for
     * @return the sum
     */
    public static int getModificatorValue(AbstraktModifikatoren mod, EAttribute eattribute) {
        if (eattribute == null)
            return 0;
        List<AttributModifikatorWert> mods = mod.getMods();
        return getModificatorValue(eattribute, mods);
    }

    /**
     * Returns the sum of a list of {@link AbstraktModifikatoren} values for the given eattribute.
     * 
     * @param eattribute the attribute to get the value for
     * @param mod list of {@link AbstraktModifikatoren}
     * @return the sum
     */
    public static int getModificatorenValue(EAttribute eattribute, List<? extends AbstraktModifikatoren> mods) {
        int sum = 0;
        for (AbstraktModifikatoren attributModifikatorWert : mods) {
            sum = sum + getModificatorValue(eattribute, attributModifikatorWert.getMods());
        }
        return sum;
    }

    /**
     * Returns the sum of modificator values for the given eattribute.
     * 
     * @param mod the modificator
     * @param eattribute the attribute to get the value for
     * @return the sum
     */
    public static int getModificatorValue(EAttribute eattribute, List<AttributModifikatorWert> mods) {
        int sum = 0;
        for (AttributModifikatorWert attributModifikatorWert : mods) {
            if (eattribute.equals(attributModifikatorWert.getAttribut()))
                sum = sum + attributModifikatorWert.getWert();
        }
        return sum;
    }

    /**
     * Creates and initalise a character with the given spezies.
     * 
     * @param spezies
     * @param eclass
     * @param edge
     * @return
     */
    public static AbstraktPersona createPersona(Spezies spezies, EClass eclass, int edge) {
        EObject p = Shr5Factory.eINSTANCE.create(eclass);

        AbstraktPersona persona = (AbstraktPersona)p;
        persona.setSpezies(spezies);
        persona.setKonstitutionBasis(spezies.getKonstitutionMin());
        persona.setGeschicklichkeitBasis(spezies.getGeschicklichkeitMin());
        persona.setReaktionBasis(spezies.getReaktionMin());
        persona.setStaerkeBasis(spezies.getStaerkeMin());

        persona.setCharismaBasis(spezies.getCharismaMin());
        persona.setIntuitionBasis(spezies.getIntuitionMin());
        persona.setLogikBasis(spezies.getLogikMin());
        persona.setWillenskraftBasis(spezies.getWillenskraftMin());

        persona.setEdgeBasis(spezies.getEdgeMin());
        // persona.setEdgeBasis(edge);

        return persona;
    }

    /**
     * Returns the geldwert as rounded string.
     * 
     * @param list
     * @return
     */
    public static String calcListenWertToString(List<Object> list) {
        BigDecimal summ = calcListenWert(list);
        return summ.longValue() + EMPTY;
    }

    /**
     * Calcs the wert of all {@link GeldWert} in the given list.
     * 
     * @param list
     * @return
     */
    public static BigDecimal calcListenWert(List<? extends Object> list) {
        BigDecimal summ = new BigDecimal(0);
        for (Object eo : list) {
            if (eo instanceof GeldWert) {
                GeldWert wert = (GeldWert)eo;

                if (wert.getWert() != null)
                    summ = summ.add(wert.getWert());
            }
        }
        return summ;
    }

    /**
     * Find the value of the personafertigeitsgruppe for a persona.
     * 
     * @param fg the {@link FertigkeitsGruppe} to look for
     * @param persona the persona
     * @return the value or 0
     */
    public static int findFertigkeitValue(FertigkeitsGruppe fg, AbstraktPersona persona) {
        PersonaFertigkeitsGruppe pfg = findGruppe(fg, persona);
        if (pfg != null)
            return pfg.getStufe();

        return 0;
    }

    /**
     * Finds the values of {@link PersonaFertigkeitsGruppe} for a given {@link FertigkeitsGruppe} and persona.
     * 
     * @param fg the fertigkeit
     * @param persona the persina
     * @return null or the {@link PersonaFertigkeitsGruppe}r
     */
    public static PersonaFertigkeitsGruppe findGruppe(FertigkeitsGruppe fg, AbstraktPersona persona) {
        EList<PersonaFertigkeitsGruppe> fertigkeitsGruppen = persona.getFertigkeitsGruppen();
        for (PersonaFertigkeitsGruppe personaFertigkeitsGruppe : fertigkeitsGruppen) {
            if (fg.equals(personaFertigkeitsGruppe.getGruppe()))
                return personaFertigkeitsGruppe;
        }
        return null;
    }

    /**
     * Returns the dicepool for the fertigkeit or -1.
     * 
     * @param fertigkeit
     * @param persona
     * @return
     */
    public static Integer fertigkeitDicePoolValue(PersonaFertigkeit personaFertigkeit, AbstraktPersona persona) {
        if (personaFertigkeit == null || persona == null)
            return -1;

        Fertigkeit fertigkeit = personaFertigkeit.getFertigkeit();
        if (fertigkeit != null && fertigkeit.getAttribut() != null) {
            Integer value = (Integer)persona.eGet(fertigkeit.getAttribut());
            Integer fertigkeitValue = personaFertigkeit.getStufe();
            if (fertigkeitValue == 0)
                return value - 1;

            value = value + fertigkeitValue;
            return value;
        }

        return -1;
    }

//    /**
//     * Returns the dicepool for the fertigkeit.
//     * 
//     * @param fertigkeit
//     * @param persona
//     * @return
//     */
//    public static Integer fertigkeitDicePool(PersonaFertigkeit personaFertigkeit, AbstraktPersona persona) {
//        if (personaFertigkeit == null || persona == null)
//            return -1;
//
//        Fertigkeit fertigkeit = personaFertigkeit.getFertigkeit();
//        if (fertigkeit != null && fertigkeit.getAttribut() != null) {
//            Integer value = (Integer)persona.eGet(fertigkeit.getAttribut());
//            Integer fertigkeitValue = personaFertigkeit.getStufe();
//            if (fertigkeitValue == 0)
//                return value - 1;
//
//            value = value + fertigkeitValue;
//            return value;
//        }
//
//        return -1;
//    }

    /**
     * Returns the stufe or -1.
     * 
     * @param fertigkeit
     * @param persona
     * @return
     */
    public static Integer findFertigkeitValue(Fertigkeit fertigkeit, AbstraktPersona persona) {
        PersonaFertigkeit pf = findFertigkeit(fertigkeit, persona);
        if (pf != null)
            if (pf.getStufe() == 0)
                return -1;
            else
                return pf.getStufe();

        if (Shr5Package.Literals.FERTIGKEITS_GRUPPE__FERTIGKEITEN.equals(fertigkeit.eContainmentFeature())) {
            FertigkeitsGruppe eContainer = (FertigkeitsGruppe)fertigkeit.eContainer();
            PersonaFertigkeitsGruppe gruppe = findGruppe(eContainer, persona);
            if (gruppe != null)
                return gruppe.getStufe();
        }

        return -1;
    }

    /**
     * Returns the persona fertigkeit or null.
     * 
     * @param fertigkeit
     * @param persona
     * @return
     */
    public static PersonaFertigkeit findFertigkeit(Fertigkeit fertigkeit, AbstraktPersona persona) {
        if (fertigkeit == null || persona == null)
            return null;

        EList<PersonaFertigkeit> fertigkeiten = persona.getFertigkeiten();
        for (PersonaFertigkeit personaFertigkeit : fertigkeiten) {
            if (fertigkeit.equals(personaFertigkeit.getFertigkeit()))
                return personaFertigkeit;
        }
        return null;
    }

    /**
     * Calcs the race maximum for the given persona and the max feature.
     * 
     * @param persona
     * @param attribute
     * @return
     */
    public static int calcRaceMaximum(AbstraktPersona persona, EAttribute attribute) {
        if (persona == null)
            return -1;
        
        Spezies spezies = persona.getSpezies();
        if (spezies == null)
            return -1;

        int value = (Integer)spezies.eGet(attribute);
        int wert = persona.getModManager().getmodWert(attribute);

        return value + wert;
    }

    /**
     * Calcs the race maximum for the given persona and the max feature.
     * 
     * @param persona
     * @param attribute
     * @return
     */
    public static int calcRaceMaximum_(AbstraktPersona persona, EAttribute attribute) {
        if (persona == null)
            return -1;

        //TODO :  this is the wrong method it calcs the overRaceMax need to add the right  method also
        
        Spezies spezies = persona.getSpezies();
        if (spezies == null)
            return -1;

        int value = (Integer)spezies.eGet(attribute);
        int wert = persona.getModManager().getmodWert(attribute);
        int halfEven = (int)Math.ceil((float)(value + wert) / 2F);

        return value + halfEven;
    }

    public static boolean hasFertigkeitUnderGroup(FertigkeitsGruppe fg, AbstraktPersona persona) {
        EList<Fertigkeit> fertigkeiten = fg.getFertigkeiten();
        for (Fertigkeit fertigkeit : fertigkeiten) {
            if (findFertigkeit(fertigkeit, persona) != null)
                return true;
        }
        return false;
    }

    /**
     * calcs a simple Karma costs.
     * 
     * @param from
     * @param to
     * @param fac
     * @return
     */
    public static int calcKarmaCosts(int from, int to, int fac) {
        if (from < 0 || to <= 0)
            return 0;

        if (from >= to)
            return 0;

        int sum = 0;
        for (int i = from; i < to; i++) {
            sum += (i + 1) * fac;
        }
        return (int)sum;
    }

    /**
     * Calculated the sum of essence in the given list.
     * 
     * @param koerperMods
     * @return
     */
    public static int calcEssenceSum(List<Koerpermods> koerperMods) {
        int sum = 0;
        for (Koerpermods koerpermods2 : koerperMods) {
            sum = sum + getEssencesValue(koerpermods2);
        }
        return sum;
    }

    /**
     * Calcs the sum of ki power points.
     * 
     * @param kikraft
     * @return
     */
    public static int calcKiPowerSum(List<KiKraft> kikraft) {
        int sum = 0;
        for (KiKraft kiKraft2 : kikraft) {
            sum = sum + kiKraft2.getKraftpunkte();
        }
        return sum;
    }

    /**
     * Create a float string from an int with base 100.
     * 
     * @param essenz
     * @return
     */
    public static String essenzToFloat(int essenz) {
        float f = essenz / 100f;
        String string = String.format("%.2f", f);//$NON-NLS-1$
        return string;
    }

    public static DamageCode parseDamageCode(String damage,AbstraktPersona persona) {
        DamageCode damageCode = ShadowrunTools.parseDamageCode(damage);
        if (damageCode != null) {
            int power = damageCode.getPower();
            if(damageCode.getAttribute()!=null){
                Integer value = (Integer)persona.eGet(damageCode.getAttribute());
                power = value + power;
                return new DamageCode(power, damageCode.type);
            }else
                return damageCode;
        }
        
        return null;
        
    }
    
    public static DamageCode parseDamageCode(String damage) {
        if (damage == null)
            return null;

        Matcher matcher = damagePattern.matcher(damage.trim());
        if (matcher.matches()) {
            String p = matcher.group(1);
            String t = matcher.group(2);

            try {
                return new DamageCode(Integer.parseInt(p), SchadensTyp.KOERPERLICH);
            } catch (Exception e) {
            }
        } else {
            matcher = damagePattern1.matcher(damage.trim());
            if (matcher.matches()) {
                String a = matcher.group(1);
                String p = matcher.group(2);
                String t = matcher.group(3);
                try {
                    return new DamageCode(Integer.parseInt(p), SchadensTyp.KOERPERLICH, a);
                } catch (Exception e) {
                }
            }
        }

        return null;
    }

    /**
     * Repesent the parsed damage code.
     * 
     * @author urs
     */
    public static class DamageCode {
        public DamageCode(int power, SchadensTyp type) {
            super();
            this.power = power;
            this.type = type;
        }

        public DamageCode(int power, SchadensTyp type, String att) {
            this(power, type);
            this.attribute = getAttributeFromShortName(att);
        }

        private int power;
        private SchadensTyp type;
        private EAttribute attribute;

        public int getPower() {
            return power;
        }

        public SchadensTyp getType() {
            return type;
        }

        @Override
        public String toString() {
            if (attribute == null)
                return power + getTypeCode();
            else {
                return "(" + attributeToShortStr(attribute) + "+" + power + ")" + getTypeCode();
            }
        }

        private String attributeToShortStr(EAttribute att) {
            if (Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__STAERKE.equals(att))
                return "STR";
            else
                return "U";
        }

        private String getTypeCode() {
            if (type == SchadensTyp.KOERPERLICH)
                return "P";
            else if (type == SchadensTyp.GEISTIG)
                return "M";

            return "U";
        }

        public EAttribute getAttribute() {
            return attribute;
        }
    }

    /**
     * Return the attribute from the short name.
     * 
     * @param att
     * @return
     */
    public static EAttribute getAttributeFromShortName(String att) {
        String lower = att.toLowerCase();
        if ("str".equals(lower))
            return Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE__STAERKE;

        return null;
    }

    /**
     * Create a predicate to filter for the eclass.
     * @param eClass
     * @return
     */
    public static Predicate<? super EObject> eclassPredicate(final EClass eClass) {
       return new Predicate<EObject>() {
            @Override
            public boolean apply(EObject input) {
                return eClass.equals(input.eClass());
            }
        };
    }
}
