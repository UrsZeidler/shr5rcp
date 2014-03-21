/**
 * 
 */
package de.urszeidler.shr5.ecp.printer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.nebula.paperclips.core.BreakPrint;
import org.eclipse.nebula.paperclips.core.EmptyPrint;
import org.eclipse.nebula.paperclips.core.ImagePrint;
import org.eclipse.nebula.paperclips.core.LinePrint;
import org.eclipse.nebula.paperclips.core.Print;
import org.eclipse.nebula.paperclips.core.border.Border;
import org.eclipse.nebula.paperclips.core.border.BorderPrint;
import org.eclipse.nebula.paperclips.core.border.LineBorder;
import org.eclipse.nebula.paperclips.core.grid.DefaultGridLook;
import org.eclipse.nebula.paperclips.core.grid.GridPrint;
import org.eclipse.nebula.paperclips.core.text.TextPrint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;

import de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe;
import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.AstraleProjektion;
import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.FernkampfwaffeModifikator;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.Koerpermods;
import de.urszeidler.eclipse.shr5.ModSetter;
import de.urszeidler.eclipse.shr5.Nahkampfwaffe;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.Vertrag;
import de.urszeidler.eclipse.shr5.Zauberer;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.CharacterGroup;
import de.urszeidler.eclipse.shr5Management.Connection;
import de.urszeidler.eclipse.shr5Management.GruntGroup;
import de.urszeidler.eclipse.shr5Management.GruntMembers;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaFertigkeitenWidget;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaFertigkeitenWidget.GroupWrapper;
import de.urszeidler.shr5.ecp.preferences.PreferenceConstants;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

/**
 * @author urs
 */
public class PersonaPrinter extends BasicPrinter {

    private static PersonaPrinter instance;

    /**
     * The singleton instance access.
     * 
     * @return
     */
    public static PersonaPrinter getInstance() {
        if (instance == null)
            instance = new PersonaPrinter();
        return instance;
    }

    public PersonaPrinter() {
        super();
        store = Activator.getDefault().getPreferenceStore();
        store.addPropertyChangeListener(this);
        initalizePrinter();
    }

    /**
     * Returns the factory to create a new print of the character.
     * 
     * @param c
     * @return
     */
    public PrintFactory createPrintFactory(final ManagedCharacter c) {
        return new PrintFactory() {
            private ManagedCharacter character = c;

            @Override
            public Print createPrinter() {
                return createPagePrint(printCharacterSheet(character));
            }

            @Override
            public String getPrintTitel() {
                return Messages.PersonaPrinter_Character_sheet + c.getPersona().getName();
            }
        };
    }

    /**
     * Returns the factory to create a new print of the character.
     * 
     * @param c
     * @return
     */
    public PrintFactory createGruntPrintFactory(final GruntGroup c) {
        return new PrintFactory() {
            private GruntGroup character = c;

            @Override
            public Print createPrinter() {
                return createPagePrint(printGruntGroupSheet(character));
            }

            @Override
            public String getPrintTitel() {
                return Messages.PersonaPrinter_Grunt_sheet + c.getName();
            }
        };
    }

    /**
     * Returns the factory to create a new print of the character.
     * 
     * @param c
     * @return
     */
    public PrintFactory createCharacterGroupPrintFactory(final CharacterGroup c) {
        return new PrintFactory() {
            private CharacterGroup characterGroup = c;

            @Override
            public Print createPrinter() {
                return createPagePrint(printCharacterGroupSheet(characterGroup));
            }

            @Override
            public String getPrintTitel() {
                return Messages.PersonaPrinter_Character_Group_sheet + c.getName();
            }
        };
    }

    /**
     * Prints the sheets for all {@link ManagedCharacter} in the {@link CharacterGroup}.
     * 
     * @param group
     * @return
     */
    protected Print printCharacterGroupSheet(CharacterGroup group) {
        LineBorder border = new LineBorder();
        border.setLineWidth(1);

        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint body = new GridPrint("d:g", look);//$NON-NLS-1$

        body.add(printBeschreibbar(group));

        EList<ManagedCharacter> members = group.getMembers();
        for (ManagedCharacter managedCharacter : members) {
            body.add(printCharacterSheet(managedCharacter));
        }

        return body;

    }

    /**
     * Prints the decription as a header.
     * 
     * @param group
     * @return
     */
    private Print printBeschreibbar(Beschreibbar descr) {
        LineBorder border = new LineBorder();
        border.setLineWidth(1);

        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d:g", look);//$NON-NLS-1$

        return grid;
    }

    /**
     * Prints the gamemaster sheet for a grount group.
     * 
     * @param grunts
     * @return
     */
    protected Print printGruntGroupSheet(GruntGroup grunts) {
        LineBorder border = new LineBorder();
        border.setLineWidth(1);

        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint body = new GridPrint("d:g,d:g", look);//$NON-NLS-1$
        body.add(new BorderPrint(printGruntsData(grunts), border), 2);
        if (grunts.getLeader() != null && grunts.getLeader().getNsc() != null) {
            if (grunts.getLeader().getNsc().getPersona().getName() != null) {
                body.add(SWT.LEFT, SWT.BOTTOM, new TextPrint(grunts.getLeader().getNsc().getPersona().getName(), attributeFont));
                Image imageScaledBy = AdapterFactoryUtil.getInstance().getImageScaledBy(SMALL_SCALE,
                        grunts.getLeader().getNsc().getPersona().getImage());
                body.add(SWT.RIGHT, SWT.TOP, new ImagePrint(imageScaledBy.getImageData()));

            }
            body.add(new BorderPrint(printGruntMembersData(grunts.getLeader()), border), 2);
        }
        body.add(new BreakPrint(), GridPrint.REMAINDER);

        EList<GruntMembers> mebers = grunts.getMembers();
        for (GruntMembers gruntMenbers : mebers) {
            if (gruntMenbers.getNsc() != null && gruntMenbers.getNsc().getPersona() != null) {
                body.add(SWT.LEFT, SWT.BOTTOM, new TextPrint(gruntMenbers.getNsc().getPersona().getName(), attributeFont));
                Image imageScaledBy = AdapterFactoryUtil.getInstance().getImageScaledBy(SMALL_SCALE, gruntMenbers.getNsc().getPersona().getImage());
                body.add(SWT.RIGHT, SWT.TOP, new ImagePrint(imageScaledBy.getImageData()));
            }
            body.add(new BorderPrint(printGruntMembersData(gruntMenbers), border), 2);
        }

        return body;
    }

    /**
     * Print the Attributes and the condition monitors.
     * 
     * @param gruntMembers
     * @return
     */
    private Print printGruntMembersData(GruntMembers gruntMembers) {

        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d,d:g,d,d,d:g", look);//$NON-NLS-1$

        int zustandKoerperlichMax = 8;
        AbstraktPersona persona = gruntMembers.getNsc().getPersona();
        if (persona instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)persona;
            zustandKoerperlichMax = kp.getZustandKoerperlichMax();
        }
        grid.add(printPersonaAttributes(persona), 2);
        for (int i = 0; i < gruntMembers.getCount(); i++) {
            grid.add(SWT.LEFT, SWT.TOP,
                    printConditionMonitor(gruntMembers.getNsc().getPersona().getName() + ONE_SPACE + (i + 1), zustandKoerperlichMax));
        }
        grid.add(new EmptyPrint(), GridPrint.REMAINDER);
        grid.add(printPersonaWeaponsDetailList(gruntMembers.getNsc()), 5);
        grid.add(new LinePrint(SWT.HORIZONTAL), GridPrint.REMAINDER);

        DefaultGridLook look1 = new DefaultGridLook(5, 5);
        look.setHeaderGap(0);
        GridPrint grid1 = new GridPrint("d,d,d", look1);//$NON-NLS-1$

        grid1.add(printPersonaCombatAttributes(persona));
        grid1.add(printPersonaSkills(persona));
        grid1.add(printGegenstandList(gruntMembers.getNsc().getInventar()));

        grid.add(grid1, GridPrint.REMAINDER);
        return grid;
    }

    /**
     * Prints the basic grunt data.
     * 
     * @param gruntGroup
     * @return
     */
    private Print printGruntsData(GruntGroup gruntGroup) {

        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d:g,d:g", look);//$NON-NLS-1$

        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(EMPTY, attributeFont));
        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.PersonaPrinter_Grunts, boldFontData), 1);

        GridPrint innerGrid = new GridPrint("d,d", look);//$NON-NLS-1$
        innerGrid.add(new TextPrint(Messages.Printer_Name, attributeFont));
        innerGrid.add(new TextPrint(printString(gruntGroup.getName()), attributeFont), 1);
        innerGrid.add(new TextPrint(Messages.PersonaPrinter_Professinal_rating, attributeFont));
        innerGrid.add(new TextPrint(printInteger(gruntGroup.getProfessionalRating()), attributeFont), 1);

        grid.add(innerGrid);

        innerGrid = new GridPrint("d,d,d,d,d", look);//$NON-NLS-1$
        Image imageScaledBy = AdapterFactoryUtil.getInstance().getImageScaledBy(SMALL_SCALE, gruntGroup.getImage());
        if (imageScaledBy != null) {
            innerGrid.add(SWT.RIGHT, SWT.TOP, new ImagePrint(imageScaledBy.getImageData()));
        }

        grid.add(innerGrid);
        return grid;
    }

    /**
     * Print the character sheet.
     * 
     * @param character
     * @return
     */
    public Print printCharacterSheet(ManagedCharacter character) {

        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d:g,d:g", look);//$NON-NLS-1$

        LineBorder border = new LineBorder();
        border.setLineWidth(1);

        if (character.getPersona() == null)
            return grid;
        AbstraktPersona persona = character.getPersona();

        grid.add(new BorderPrint(printPersonaData(character), border), 2);
        // grid.add(printPersonaDetails(persona), 1);

        grid.add(new BorderPrint(printPersonaAttributes(persona), border), 1);
        grid.add(new BorderPrint(printPersonaConditionMonitor(persona), border), 1);

        grid.add(new BorderPrint(printPersonaWeaponsDetailList(character), border), 2);

        if (store.getBoolean(PreferenceConstants.PRINT_USEABLE_SKILLS))
            grid.add(printAllPersonaSkills(persona));
        else
            grid.add(printPersonaSkills(persona));

        grid.add(printPersonaFormPart1(character));

        grid.add(new BorderPrint(printPersonaRangedWeapons1(character), border), 1);
        grid.add(new BorderPrint(printPersonaMeeleWeapons(character), border), 1);

        List<AbstraktGegenstand> gList = character.getInventar();
        grid.add(new BorderPrint(printGegenstandList(gList), border), 2);
        grid.add(new BreakPrint(), GridPrint.REMAINDER);
        if (store.getBoolean(PreferenceConstants.PRINT_CHARACTER_ADVACEMENTS))
            grid.add(new BorderPrint(printCharacterAdvancementsList(character), border), 2);
        return grid;
    }

    /**
     * Prints the persona details.
     * 
     * @param persona
     * @return
     */
    @Deprecated
    private Print printPersonaDetails(AbstraktPersona persona) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d,d:g", look);//$NON-NLS-1$

        grid.add(new EmptyPrint());
        Image imageScaledBy = AdapterFactoryUtil.getInstance().getImageScaledBy(BIG_SCALE, persona.getImage());
        if (imageScaledBy != null) {
            grid.add(SWT.RIGHT, SWT.TOP, new ImagePrint(imageScaledBy.getImageData()));
        }

        return grid;
    }

    /**
     * Prints next to the fertigkeiten.
     * 
     * @param persona
     * @return
     */
    private Print printPersonaFormPart1(ManagedCharacter character) {
        DefaultGridLook look = new DefaultGridLook(0, 0);
        GridPrint grid = new GridPrint("d:g", look);//$NON-NLS-1$

        AbstraktPersona persona = character.getPersona();
        grid.add(printPersonaCombatAttributes(persona));

        if (persona instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)persona;

            EList<PersonaEigenschaft> eigenschaften = kp.getEigenschaften();
            if (!eigenschaften.isEmpty())
                grid.add(printPersonaEigenschaften(eigenschaften));
            EList<Koerpermods> koerperMods = kp.getKoerperMods();
            if (!koerperMods.isEmpty())
                grid.add(printPersonaBodyTec(koerperMods));
        }

        if (persona instanceof KiAdept) {
            KiAdept ka = (KiAdept)persona;
            EList<KiKraft> kikraft = ka.getKikraft();
            if (!kikraft.isEmpty())
                grid.add(printKiKraftList(kikraft));
        }
        if (persona instanceof Zauberer) {
            Zauberer z = (Zauberer)persona;
            EList<PersonaZauber> zauber = z.getZauber();
            if (!zauber.isEmpty())
                grid.add(printZauberList(zauber));

        }

        grid.add(printAllCharacterConnections(character));
        grid.add(printPersonaContracts(character));

        grid.add(printModList(persona));
        return grid;
    }

    private Print printModList(AbstraktPersona persona) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        GridPrint grid = new GridPrint("d:g,d", look);//$NON-NLS-1$

        grid.addHeader(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_Active_Modification, boldFontData), 2);
        ModSetter modManager = persona.getModManager();
        Set<Entry<EAttribute, Integer>> set = modManager.getModificatorMap().entrySet();
        for (Entry<EAttribute, Integer> entry : set) {
            grid.add(new TextPrint(toName(entry.getKey()), attributeFont));
            grid.add(new TextPrint(printInteger(entry.getValue()), attributeFont));
        }
        return grid;
    }

    private Print printGegenstandList(List<AbstraktGegenstand> g) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        GridPrint grid = new GridPrint("d:g,d,d,d", look);//$NON-NLS-1$

        grid.addHeader(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_Items, boldFontData), 4);
        grid.addHeader(new TextPrint(Messages.Printer_Name, italicFontData), 1);
        grid.addHeader(new TextPrint(Messages.Printer_available, italicFontData));
        grid.addHeader(new TextPrint(Messages.Printer_cost, italicFontData));
        grid.addHeader(new TextPrint(Messages.Printer_source, italicFontData));
        for (AbstraktGegenstand ge : g) {
            grid.add(new TextPrint(itemDelegator.getText(ge), attributeFont), 1);
            grid.add(new TextPrint(printString(ge.getVerfuegbarkeit()), attributeFont), 1);
            grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(printIntegerMoney(ge.getWert()), attributeFont), 1);
            grid.add(new TextPrint(toSource(ge), attributeFont), 1);
        }

        return grid;
    }

    private Print printZauberList(List<PersonaZauber> zauber) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        GridPrint grid = new GridPrint("d:g,d", look);//$NON-NLS-1$

        grid.addHeader(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_spells, boldFontData), 2);
        grid.addHeader(new TextPrint(Messages.Printer_Name, italicFontData), 2);
        for (PersonaZauber z : zauber) {
            grid.add(new TextPrint(itemDelegator.getText(z.getFormel()), attributeFont), 2);
        }

        return grid;
    }

    private Print printKiKraftList(List<KiKraft> kikraft) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        GridPrint grid = new GridPrint("d:g,d", look);//$NON-NLS-1$

        grid.addHeader(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_KiPower, boldFontData), 2);
        grid.addHeader(new TextPrint(Messages.Printer_Name, italicFontData), 2);
        // grid.add(new TextPrint("Essenz", italicFontData));
        for (KiKraft kiKraft2 : kikraft) {
            grid.add(new TextPrint(itemDelegator.getText(kiKraft2), attributeFont), 2);
        }

        return grid;
    }

    /**
     * Prints the persona condition monitor.
     * 
     * @param persona
     * @return
     */
    private Print printPersonaBodyTec(EList<Koerpermods> koerperMods) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        GridPrint grid = new GridPrint("d:g,d", look);//$NON-NLS-1$

        grid.addHeader(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_BodyTec, boldFontData), 2);
        grid.addHeader(new TextPrint(Messages.Printer_Name, italicFontData));
        grid.addHeader(new TextPrint(Messages.Printer_Essence, italicFontData));

        for (Koerpermods koerpermods2 : koerperMods) {
            grid.add(new TextPrint(itemDelegator.getText(koerpermods2), attributeFont));
            grid.add(new TextPrint(EMPTY, attributeFont));
        }

        return grid;
    }

    /**
     * Prints the persona condition monitor.
     * 
     * @param persona
     * @return
     */
    private Print printPersonaEigenschaften(EList<PersonaEigenschaft> eigenschaften) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d:g,d", look);//$NON-NLS-1$

        grid.addHeader(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_Edge_Flaws, boldFontData), 2);
        grid.addHeader(new TextPrint(Messages.Printer_Name, italicFontData));
        grid.addHeader(new TextPrint(Messages.Printer_karma, italicFontData));

        for (PersonaEigenschaft personaEigenschaft : eigenschaften) {
            grid.add(new TextPrint(itemDelegator.getText(personaEigenschaft), attributeFont));
            grid.add(new TextPrint(printInteger(personaEigenschaft.getKarmaKosten()), attributeFont));
        }

        return grid;
    }

    /**
     * Prints the character advancement list.
     * 
     * @param persona
     * @return
     */
    private Print printCharacterAdvancementsList(ManagedCharacter character) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d:g,d,d,d", look);//$NON-NLS-1$

        grid.addHeader(SWT.RIGHT, SWT.DEFAULT, new TextPrint("advancements", boldFontData), 4);
        grid.addHeader(new TextPrint(Messages.Printer_Name, italicFontData));
        grid.addHeader(new TextPrint("gamedate", italicFontData));
        grid.addHeader(new TextPrint("date applied", italicFontData));
        grid.addHeader(new TextPrint("karma", italicFontData));

        EList<Changes> changes = character.getChanges();
        for (Changes change : changes) {
            grid.add(new TextPrint(itemDelegator.getText(change), attributeFont));
            grid.add(new TextPrint(printDate(change.getDate()), attributeFont));
            grid.add(new TextPrint(printDate(change.getDateApplied()), attributeFont));
            grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(printInteger(change.getKarmaCost()), attributeFont));
        }

        return grid;
    }

    /**
     * Prints the ranged weapons.
     * 
     * @param persona
     * @return
     */
    private Print printPersonaRangedWeapons1(ManagedCharacter character) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d:g,d,d,d,d,d,d,d", look);//$NON-NLS-1$

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_RagneWeapons, boldFontData), 8);

        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_Name, italicFontData), 2);
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_dmg, italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_akk, italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_ap, italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_modus, italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_rc, italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_muni, italicFontData));

        EList<AbstraktGegenstand> inventar = character.getInventar();
        for (AbstraktGegenstand abstraktGegenstand : inventar) {
            if (abstraktGegenstand instanceof AbstaktFernKampfwaffe) {
                AbstaktFernKampfwaffe fw = (AbstaktFernKampfwaffe)abstraktGegenstand;
                printFernkampWaffeDetail(fw);

                grid.add(new TextPrint(itemDelegator.getText(fw), attributeFont), 2);
                grid.add(new TextPrint(fw.getSchadenscode(), attributeFont));
                grid.add(new TextPrint(printInteger(fw.getPraezision()), attributeFont));
                grid.add(new TextPrint(printInteger(fw.getDurchschlagsKraft()), attributeFont));
                if (fw instanceof Feuerwaffe) {
                    Feuerwaffe f = (Feuerwaffe)fw;
                    printFeuerwaffeDetail(f);

                    grid.add(new TextPrint(f.getModie().toString(), attributeFont));
                    grid.add(new TextPrint(printInteger(f.getRueckstoss()), attributeFont));
                    grid.add(new TextPrint(f.getKapazitaet() + f.getMunitionstyp().getLiteral(), attributeFont));

                } else {
                    grid.add(new TextPrint(EMPTY, attributeFont));
                    grid.add(new TextPrint(EMPTY, attributeFont));
                    grid.add(new TextPrint(EMPTY, attributeFont));
                }
            }
        }

        return grid;
    }

    /**
     * Prints the weapon in a list with the necessary information for gameplay.
     * 
     * @param persona
     * @return
     */
    private Print printPersonaWeaponsDetailList(ManagedCharacter character) {
        DefaultGridLook look = new DefaultGridLook(3, 5);
        GridPrint grid = new GridPrint("d:g", look);//$NON-NLS-1$
        EList<AbstraktGegenstand> inventar = character.getInventar();
        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_weapons, boldFontData));
        for (AbstraktGegenstand abstraktGegenstand : inventar) {
            if (abstraktGegenstand instanceof AbstaktFernKampfwaffe) {
                AbstaktFernKampfwaffe af = (AbstaktFernKampfwaffe)abstraktGegenstand;
                grid.add(printFernkampfwaffeDetailCompact(af));
            }
        }

        DefaultGridLook look1 = new DefaultGridLook(2, 2);
        look.setHeaderGap(2);
        GridPrint grid1 = new GridPrint("d:g,d:g,d:g,d:g,d:g,d:g", look1);//$NON-NLS-1$
        grid1.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_Name, italicFontData), 2);
        grid1.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_dmg, italicFontData));
        grid1.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_akk, italicFontData));
        grid1.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_ap, italicFontData));
        grid1.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_reach, italicFontData));

        for (AbstraktGegenstand abstraktGegenstand : inventar) {
            if (abstraktGegenstand instanceof Nahkampfwaffe) {
                Nahkampfwaffe fw = (Nahkampfwaffe)abstraktGegenstand;
                // grid.add(printNahkampfwaffeDetail(fw));

                grid1.add(new LinePrint(SWT.HORIZONTAL), GridPrint.REMAINDER);

                grid1.add(new TextPrint(toName(fw), attributeFont), 2);
                grid1.add(new TextPrint(fw.getSchadenscode(), attributeFont));
                grid1.add(new TextPrint(printInteger(fw.getPraezision()), attributeFont));
                grid1.add(new TextPrint(printInteger(fw.getDurchschlagsKraft()), attributeFont));
                grid1.add(new TextPrint(printInteger(fw.getReichweite()), attributeFont));

            }
        }
        grid.add(grid1);
        return grid;
    }

    /**
     * Print a detail for a feuerwaffe.
     */
    private GridPrint printFernkampfwaffeDetailCompact(AbstaktFernKampfwaffe fernkampfwaffe) {
        DefaultGridLook look = new DefaultGridLook(2, 2);
        GridPrint grid = new GridPrint("d:g,d:g,d:g,d:g,d:g,d:g,d:g,d:g", look);//$NON-NLS-1$

        grid.add(new LinePrint(SWT.HORIZONTAL), GridPrint.REMAINDER);

        grid.add(new TextPrint(toName(fernkampfwaffe), attributeFont), 5);
        grid.add(new TextPrint(toSimpleName(fernkampfwaffe.getReichweite()), attributeFont), 3);

        GridPrint innerGrid = new GridPrint("d:g,d:g,d:g,d:g,d:g,d:g", look);//$NON-NLS-1$

        innerGrid.add(new TextPrint(Messages.Printer_dmg, italicFontData));
        innerGrid.add(new TextPrint(Messages.Printer_akk, italicFontData));
        innerGrid.add(new TextPrint(Messages.Printer_ak, italicFontData));
        if (fernkampfwaffe instanceof Feuerwaffe) {
            innerGrid.add(new TextPrint(Messages.Printer_modus, italicFontData));
            innerGrid.add(new TextPrint(Messages.Printer_rc, italicFontData));
            innerGrid.add(new TextPrint(Messages.Printer_muni, italicFontData));
        } else
            innerGrid.add(new EmptyPrint(), GridPrint.REMAINDER);

        innerGrid.add(new TextPrint(fernkampfwaffe.getSchadenscode(), attributeFont));
        innerGrid.add(new TextPrint(fernkampfwaffe.getPraezision() + EMPTY, attributeFont));
        innerGrid.add(new TextPrint(fernkampfwaffe.getDurchschlagsKraft() + EMPTY, attributeFont));
        if (fernkampfwaffe instanceof Feuerwaffe) {
            Feuerwaffe fw = (Feuerwaffe)fernkampfwaffe;
            innerGrid.add(new TextPrint(toName(fw.getModie(), fernkampfwaffe, Shr5Package.Literals.FEUERWAFFE__MODIE), attributeFont));
            innerGrid.add(new TextPrint(fw.getRueckstoss() + EMPTY, attributeFont));
            innerGrid.add(new TextPrint(fw.getKapazitaet() + ONE_SPACE
                    + toName(fw.getMunitionstyp(), fernkampfwaffe, Shr5Package.Literals.FEUERWAFFE__MUNITIONSTYP), attributeFont));
        } else
            innerGrid.add(new EmptyPrint(), GridPrint.REMAINDER);

        innerGrid.add(new TextPrint(Messages.Printer_short, italicFontData));
        innerGrid.add(new TextPrint(Messages.Printer_medium, italicFontData));
        innerGrid.add(new TextPrint(Messages.Printer_long, italicFontData));
        innerGrid.add(new TextPrint(Messages.Printer_extreme, italicFontData));
        innerGrid.add(new EmptyPrint(), GridPrint.REMAINDER);

        if (fernkampfwaffe.getReichweite() != null) {
            innerGrid.add(new TextPrint(toReichweite(fernkampfwaffe.getReichweite().getMin(), fernkampfwaffe.getReichweite().getKurz()),
                    attributeFont));
            innerGrid.add(new TextPrint(toReichweite(fernkampfwaffe.getReichweite().getKurz(), fernkampfwaffe.getReichweite().getMittel()),
                    attributeFont));
            innerGrid.add(new TextPrint(toReichweite(fernkampfwaffe.getReichweite().getMittel(), fernkampfwaffe.getReichweite().getWeit()),
                    attributeFont));
            innerGrid.add(new TextPrint(toReichweite(fernkampfwaffe.getReichweite().getWeit(), fernkampfwaffe.getReichweite().getExtrem()),
                    attributeFont));
            innerGrid.add(new EmptyPrint(), GridPrint.REMAINDER);
        }

        GridPrint innerGrid1 = new GridPrint("d:g", look);//$NON-NLS-1$
        innerGrid1.add(new TextPrint(Messages.Printer_addons, italicFontData));
        if (fernkampfwaffe instanceof Feuerwaffe) {
            Feuerwaffe fw = (Feuerwaffe)fernkampfwaffe;
            innerGrid1.add(new TextPrint(toFWAddon(fw.getEinbau()), attributeFont));
        }
        grid.add(innerGrid, 6);
        grid.add(innerGrid1, 2);

        return grid;

    }

    /**
     * Print a detail for a feuerwaffe.
     */
    private GridPrint printFeuerwaffeDetail(Feuerwaffe fw) {
        DefaultGridLook look = new DefaultGridLook(3, 3);
        GridPrint grid = new GridPrint("d:g,d:g,d:g,d:g,d:g,d:g,d:g,d:g", look);//$NON-NLS-1$
        if (fw == null)
            return grid;

        grid.add(new LinePrint(SWT.HORIZONTAL), GridPrint.REMAINDER);

        grid.add(new TextPrint(toName(fw), attributeFont), 5);
        grid.add(new TextPrint(toName(fw.getReichweite()), attributeFont), 3);

        grid.add(new TextPrint(Messages.Printer_dmg, italicFontData));
        grid.add(new TextPrint(Messages.Printer_akk, italicFontData));
        grid.add(new TextPrint(Messages.Printer_ak, italicFontData));
        grid.add(new TextPrint(Messages.Printer_modus, italicFontData));
        grid.add(new TextPrint(Messages.Printer_rc, italicFontData));
        grid.add(new TextPrint(Messages.Printer_muni, italicFontData));
        grid.add(new TextPrint(Messages.Printer_addons, italicFontData), 2);

        grid.add(new TextPrint(fw.getSchadenscode(), attributeFont));
        grid.add(new TextPrint(fw.getPraezision() + EMPTY, attributeFont));
        grid.add(new TextPrint(fw.getDurchschlagsKraft() + EMPTY, attributeFont));
        grid.add(new TextPrint(fw.getModie().toString(), attributeFont));
        grid.add(new TextPrint(fw.getRueckstoss() + EMPTY, attributeFont));
        grid.add(new TextPrint(fw.getKapazitaet() + fw.getMunitionstyp().getLiteral(), attributeFont));
        grid.add(new TextPrint(toFWAddon(fw.getEinbau()), attributeFont), 2);

        grid.add(new TextPrint(Messages.Printer_short, italicFontData), 2);
        grid.add(new TextPrint(Messages.Printer_medium, italicFontData), 2);
        grid.add(new TextPrint(Messages.Printer_long, italicFontData), 2);
        grid.add(new TextPrint(Messages.Printer_extreme, italicFontData), 2);

        if (fw.getReichweite() != null) {
            grid.add(new TextPrint(toReichweite(fw.getReichweite().getMin(), fw.getReichweite().getKurz()), attributeFont), 2);
            grid.add(new TextPrint(toReichweite(fw.getReichweite().getKurz(), fw.getReichweite().getMittel()), attributeFont), 2);
            grid.add(new TextPrint(toReichweite(fw.getReichweite().getMittel(), fw.getReichweite().getWeit()), attributeFont), 2);
            grid.add(new TextPrint(toReichweite(fw.getReichweite().getWeit(), fw.getReichweite().getExtrem()), attributeFont), 2);
        }

        return grid;
    }

    private String toFWAddon(EList<FernkampfwaffeModifikator> einbau) {
        StringBuffer buffer = new StringBuffer();
        for (FernkampfwaffeModifikator fernkampfwaffeModifikator : einbau) {
            buffer.append(fernkampfwaffeModifikator.getName());
            buffer.append(EOL);
        }
        return buffer.toString();
    }

    @Deprecated
    private String toMod(EList<AttributModifikatorWert> mods) {
        StringBuffer buffer = new StringBuffer();

        for (AttributModifikatorWert attributModifikatorWert : mods) {
            EAttribute attribut = attributModifikatorWert.getAttribut();
            buffer.append(itemDelegator.getText(attribut));

            if (attribut.getEType() instanceof EEnum) {
                EEnumLiteral eEnumLiteral = ((EEnum)attribut.getEType()).getEEnumLiteral(attributModifikatorWert.getWert());
                buffer.append(":");
                buffer.append(itemDelegator.getText(eEnumLiteral));

            }
            buffer.append(EOL);
        }

        return buffer.toString();
    }

    private String toReichweite(int min, int max) {
        return min + "-" + max;//$NON-NLS-1$
    }

    private GridPrint printFernkampWaffeDetail(AbstaktFernKampfwaffe fw) {
        DefaultGridLook look = new DefaultGridLook(3, 3);
        GridPrint grid = new GridPrint("d:g,d:g,d:g,d:g,d:g,d:g,d:g,d:g", look);//$NON-NLS-1$
        if (fw == null)
            return grid;

        // grid.add(new TextPrint("Name", italicFontData), 5);
        // grid.add(new TextPrint("Type", italicFontData), 3);
        grid.add(new LinePrint(SWT.HORIZONTAL), GridPrint.REMAINDER);

        grid.add(new TextPrint(toName(fw), attributeFont), 5);
        grid.add(new TextPrint(toName(fw.getReichweite()), attributeFont), 3);

        grid.add(new TextPrint(Messages.Printer_dmg, italicFontData));
        grid.add(new TextPrint(Messages.Printer_akk, italicFontData));
        grid.add(new TextPrint(Messages.Printer_ap, italicFontData));
        grid.add(new TextPrint(EMPTY, italicFontData));
        grid.add(new TextPrint(EMPTY, italicFontData));
        grid.add(new TextPrint(EMPTY, italicFontData));
        grid.add(new TextPrint(Messages.Printer_addons, italicFontData), 2);

        grid.add(new TextPrint(fw.getSchadenscode(), attributeFont));
        grid.add(new TextPrint(printInteger(fw.getPraezision()), attributeFont));
        grid.add(new TextPrint(printInteger(fw.getDurchschlagsKraft()), attributeFont));
        grid.add(new TextPrint(EMPTY, attributeFont));
        grid.add(new TextPrint(EMPTY, attributeFont));
        grid.add(new TextPrint(EMPTY, attributeFont));
        grid.add(new TextPrint(fw.getMods().toString(), attributeFont), 2);

        grid.add(new TextPrint(Messages.Printer_short, italicFontData), 2);
        grid.add(new TextPrint(Messages.Printer_medium, italicFontData), 2);
        grid.add(new TextPrint(Messages.Printer_long, italicFontData), 2);
        grid.add(new TextPrint(Messages.Printer_extreme, italicFontData), 2);

        if (fw.getReichweite() != null) {
            grid.add(new TextPrint(toReichweite(fw.getReichweite().getMin(), fw.getReichweite().getKurz()), attributeFont), 2);
            grid.add(new TextPrint(toReichweite(fw.getReichweite().getKurz(), fw.getReichweite().getMittel()), attributeFont), 2);
            grid.add(new TextPrint(toReichweite(fw.getReichweite().getMittel(), fw.getReichweite().getWeit()), attributeFont), 2);
            grid.add(new TextPrint(toReichweite(fw.getReichweite().getWeit(), fw.getReichweite().getExtrem()), attributeFont), 2);
        }

        return grid;
    }

    /**
     * Prints the ranged weapons.
     * 
     * @param persona
     * @return
     */
    private Print printPersonaContracts(ManagedCharacter character) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d:g,d", look);//$NON-NLS-1$
        if (character == null)
            return grid;

        grid.addHeader(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_contracts, boldFontData), 2);
        grid.addHeader(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_Name, italicFontData), 2);
        EList<Vertrag> inventar = character.getContracts();
        for (Vertrag contract : inventar) {
            grid.add(new TextPrint(itemDelegator.getText(contract), attributeFont), 2);
        }

        return grid;
    }

    /**
     * Prints the ranged weapons.
     * 
     * @param persona
     * @return
     */
    private Print printPersonaMeeleWeapons(ManagedCharacter character) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d:g,d,d,d,d,d,", look);//$NON-NLS-1$
        if (character == null)
            return grid;

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_meele_weapons, boldFontData), 6);
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_Name, italicFontData), 2);
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_reach, italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_dmg, italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_akk, italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_ap, italicFontData));

        EList<AbstraktGegenstand> inventar = character.getInventar();
        for (AbstraktGegenstand abstraktGegenstand : inventar) {
            if (abstraktGegenstand instanceof Nahkampfwaffe) {
                Nahkampfwaffe fw = (Nahkampfwaffe)abstraktGegenstand;

                grid.add(new TextPrint(itemDelegator.getText(fw), attributeFont), 2);
                grid.add(new TextPrint(printInteger(fw.getReichweite()), attributeFont));
                grid.add(new TextPrint(fw.getSchadenscode(), attributeFont));
                grid.add(new TextPrint(printInteger(fw.getPraezision()), attributeFont));
                grid.add(new TextPrint(printInteger(fw.getDurchschlagsKraft()), attributeFont));
            }
        }

        return grid;
    }

    /**
     * Prints the persona condition monitor.
     * 
     * @param persona
     * @return
     */
    private Print printPersonaConditionMonitor(AbstraktPersona persona) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d,d", look);//$NON-NLS-1$
        if (persona == null)
            return grid;

        if (persona instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)persona;

            grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_monitor, boldFontData), 2);
            grid.add(SWT.LEFT, SWT.TOP, printConditionMonitor(Messages.Printer_body, kp.getZustandKoerperlichMax()));
            grid.add(SWT.RIGHT, SWT.TOP, printConditionMonitor(Messages.Printer_mental, kp.getZustandGeistigMax()));

        }

        return grid;
    }

    /**
     * Prints a condition monitor with the given number and name.
     * 
     * @param persona
     * @return
     */
    private Print printConditionMonitor(String monitorName, int number) {
        DefaultGridLook look = new DefaultGridLook(2, 2);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("c:p,c:p,c:p,d", look);//$NON-NLS-1$

        grid.add(SWT.LEFT, SWT.TOP, new TextPrint(monitorName, italicFontData), GridPrint.REMAINDER);
        Border border = new LineBorder();
        int col = number / 3;
        for (int i = 0; i < col; i++) {
            grid.add(SWT.DEFAULT, SWT.FILL, new BorderPrint(new TextPrint(ONE_SPACE), border), 1);
            grid.add(SWT.DEFAULT, SWT.FILL, new BorderPrint(new TextPrint(ONE_SPACE), border), 1);
            grid.add(SWT.DEFAULT, SWT.FILL, new BorderPrint(new TextPrint(ONE_SPACE), border), 1);
            grid.add(SWT.DEFAULT, SWT.FILL, new TextPrint("-" + (i + 1) + ONE_SPACE), 1); //$NON-NLS-1$
        }
        int rest = number % 3;
        for (int i = 0; i < rest; i++) {
            grid.add(SWT.DEFAULT, SWT.TOP, new BorderPrint(new TextPrint(ONE_SPACE), border), 1);
        }
        grid.add(SWT.LEFT, SWT.TOP, new EmptyPrint(), GridPrint.REMAINDER);
        return grid;
    }

    /**
     * Prints all persona connections.
     * 
     * @param persona
     * @return
     */
    private Print printAllCharacterConnections(ManagedCharacter character) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d:g,d,d,d,d", look);//$NON-NLS-1$
        if (character == null)
            return grid;

        grid.addHeader(SWT.RIGHT, SWT.DEFAULT, new TextPrint(EMPTY, boldFontData), 2);
        grid.addHeader(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_connections, boldFontData), 3);

        grid.addHeader(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_Name, italicFontData), 2);
        grid.addHeader(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_loyality, italicFontData));
        grid.addHeader(SWT.LEFT, SWT.DEFAULT, new TextPrint(Messages.Printer_influence, italicFontData));
        grid.addHeader(SWT.LEFT, SWT.DEFAULT, new TextPrint("---")); //$NON-NLS-1$

        EList<Connection> connections = character.getConnections();
        for (Connection connection : connections) {
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(itemDelegator.getText(connection), attributeFont), 2);
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(printInteger(connection.getLoyality()), attributeFont));
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(printInteger(connection.getInfluence()), attributeFont));
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("---", attributeFont)); //$NON-NLS-1$
        }

        return grid;
    }

    /**
     * Prints all skills usable from the persona.
     * 
     * @param persona
     * @return
     */
    private Print printAllPersonaSkills(AbstraktPersona persona) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d,d,d,d,d", look);//$NON-NLS-1$
        if (persona == null)
            return grid;

        grid.addHeader(SWT.LEFT, SWT.DEFAULT, new TextPrint(EMPTY, attributeFont));
        grid.addHeader(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_skills, boldFontData), 4);

        grid.addHeader(new TextPrint(Messages.Printer_Name, italicFontData), 2);
        grid.addHeader(new TextPrint(Messages.Printer_attributes, italicFontData), 1);
        grid.addHeader(new TextPrint(Messages.Printer_rtg, italicFontData), 1);
        grid.addHeader(new TextPrint(Messages.Printer_dice_pool, italicFontData), 1);
        List<Object> root = PersonaFertigkeitenWidget.createFertigkeitGroupsRoot(persona);
        for (Object object : root) {
            if (object instanceof FertigkeitsGruppe) {
                FertigkeitsGruppe fg = (FertigkeitsGruppe)object;
                // printGroup
                PersonaFertigkeitsGruppe gruppe = ShadowrunTools.findGruppe(fg, persona);
                String stufe = EMPTY;
                if (gruppe != null) {
                    stufe = printInteger(gruppe.getStufe());
                    grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(itemDelegator.getText(fg), attributeFont), 3);
                    grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(stufe, attributeFont), 1);
                    grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(EMPTY, attributeFont), 1);
                }

                List<Fertigkeit> fertigkeiten = fg.getFertigkeiten();
                printFertigkeitList(grid, fertigkeiten, persona);
            } else if (object instanceof GroupWrapper) {
                GroupWrapper gw = (GroupWrapper)object;
                grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(gw.getName(), attributeFont), 3);
                grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(EMPTY, attributeFont), 1);
                grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(EMPTY, attributeFont), 1);
                List<Fertigkeit> fertigkeiten = gw.getEntries();
                printFertigkeitList(grid, fertigkeiten, persona);
            }
        }

        return grid;
    }

    /**
     * Prints all persona skills.
     * 
     * @param persona
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private Print printPersonaSkills(AbstraktPersona persona) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d,d,d,d,d", look);//$NON-NLS-1$
        if (persona == null)
            return grid;

        grid.addHeader(SWT.LEFT, SWT.DEFAULT, new TextPrint(EMPTY, attributeFont));
        grid.addHeader(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_skills, boldFontData), 4);

        grid.addHeader(new TextPrint(Messages.Printer_Name, italicFontData), 2);
        grid.addHeader(new TextPrint(Messages.Printer_attributes, italicFontData), 1);
        grid.addHeader(new TextPrint(Messages.Printer_rtg, italicFontData), 1);
        grid.addHeader(new TextPrint(Messages.Printer_dice_pool, italicFontData), 1);
        List root = new ArrayList(persona.getFertigkeitsGruppen());
        // root.addAll(persona.getFertigkeiten());
        for (Object object : root) {
            if (object instanceof FertigkeitsGruppe) {
                FertigkeitsGruppe fg = (FertigkeitsGruppe)object;
                // printGroup
                PersonaFertigkeitsGruppe gruppe = ShadowrunTools.findGruppe(fg, persona);
                String stufe = EMPTY;
                if (gruppe != null) {
                    stufe = printInteger(gruppe.getStufe());
                    grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(toSimpleName(fg), attributeFont), 3);
                    grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(stufe, attributeFont), 1);
                    grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(EMPTY, attributeFont), 1);
                }

                List<Fertigkeit> fertigkeiten = fg.getFertigkeiten();
                printFertigkeitList(grid, fertigkeiten, persona);
            }
        }
        printPersonaFertigkeitList(grid, persona);

        return grid;
    }

    /**
     * Prints the given list of Persona fertigkeiten
     * 
     * @param grid
     * @param persona
     */
    private void printPersonaFertigkeitList(GridPrint grid, AbstraktPersona persona) {

        List<PersonaFertigkeit> fertigkeiten = persona.getFertigkeiten();

        for (PersonaFertigkeit pfertigkeit : fertigkeiten) {
            Fertigkeit fertigkeit = pfertigkeit.getFertigkeit();
            if (fertigkeit == null)
                continue;
            Integer value = (Integer)persona.eGet(fertigkeit.getAttribut());

            Integer fertigkeitValue = pfertigkeit.getStufe();
            value = value + fertigkeitValue;

            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(toFertigkeitAndSpec(pfertigkeit), attributeFont), 2);
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(toName(fertigkeit.getAttribut()), attributeFont), 1);
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(printInteger(fertigkeitValue), attributeFont), 1);
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(printInteger(value), attributeFont), 1);
        }
    }

    /**
     * Print the fertigkeit name and the spec.
     * 
     * @param pfertigkeit
     * @return
     */
    private String toFertigkeitAndSpec(PersonaFertigkeit pfertigkeit) {
        if (pfertigkeit == null)
            return EMPTY;

        String simpleName = toSimpleName(pfertigkeit.getFertigkeit());
        if (!pfertigkeit.getSpezialisierungen().isEmpty())
            simpleName = simpleName + ONE_SPACE + pfertigkeit.getSpezialisierungen().toString();
        return simpleName;
    }

    /**
     * Prints the given list of fertigkeiten. And fills the values of the persona fertigkeit if available.
     * 
     * @param grid
     * @param fertigkeiten
     * @param persona
     */
    private void printFertigkeitList(GridPrint grid, List<Fertigkeit> fertigkeiten, AbstraktPersona persona) {
        if (persona == null)
            return;
        final EList<EAttribute> eAllAttributes = persona.eClass().getEAllAttributes();

        for (Fertigkeit fertigkeit : fertigkeiten) {
            if (!eAllAttributes.contains(fertigkeit.getAttribut()))
                continue;

            Integer value = (Integer)persona.eGet(fertigkeit.getAttribut());
            Integer fertigkeitValue = ShadowrunTools.findFertigkeitValue(fertigkeit, persona);
            if (fertigkeitValue < 1 && !fertigkeit.isAusweichen()) {
                continue;
            } else {
                value = value + fertigkeitValue;
            }
            PersonaFertigkeit personaFertigkeit = ShadowrunTools.findFertigkeit(fertigkeit, persona);
            if (personaFertigkeit != null)
                grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(toFertigkeitAndSpec(personaFertigkeit), attributeFont), 2);
            else
                grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(toSimpleName(fertigkeit), attributeFont), 2);
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(toName(fertigkeit.getAttribut()), attributeFont), 1);
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(printInteger(fertigkeitValue), attributeFont), 1);
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(printInteger(value), attributeFont), 1);
        }
    }

    /**
     * Prints the attributes in one block.
     * 
     * @param persona
     * @return
     */
    private Print printPersonaCombatAttributes(AbstraktPersona persona) {

        DefaultGridLook look = new DefaultGridLook(10, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d,d:g", look);//$NON-NLS-1$
        if (persona == null)
            return grid;

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(EMPTY));
        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_combat_info, boldFontData), 1);

        GridPrint grid1 = new GridPrint("d:g,r:d", look);//$NON-NLS-1$
        grid1.add(new TextPrint(Messages.Printer_doge, attributeFont));
        grid1.add(new TextPrint(printInteger(persona.getAusweichen()), attributeFont));
        if (persona instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)persona;
            grid1.add(new TextPrint(Messages.Printer_armor, attributeFont));
            grid1.add(new TextPrint(printInteger(kp.getPanzer()), attributeFont));

        }

        grid.add(grid1, 2);
        return grid;
    }

    /**
     * Prints the attributes in one block.
     * 
     * @param persona
     * @return
     */
    private Print printPersonaAttributes(AbstraktPersona persona) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d,d", look);//$NON-NLS-1$
        if (persona == null)
            return grid;

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(EMPTY));
        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_attributes, boldFontData), 1);

        GridPrint grid1 = new GridPrint("d,d,d,r:d", look);//$NON-NLS-1$
        printeAttributes(persona, grid1, Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE.getEAttributes());
        printeAttributes(persona, grid1, Shr5Package.Literals.GEISTIGE_ATTRIBUTE.getEAttributes());
        grid1.add(new TextPrint(Messages.Printer_edge, attributeFont), 3);
        grid1.add(new TextPrint(printInteger(persona.getEdgeBasis()), attributeFont), 1);

        grid.add(grid1);
        GridPrint grid2 = new GridPrint("d,d,d,r:d", look);//$NON-NLS-1$

        grid2.add(new TextPrint(Messages.Printer_essence, attributeFont), 3);
        grid2.add(new TextPrint(essenzToFloat(persona.getEssenz()), attributeFont), 1);
        grid2.add(new TextPrint(Messages.Printer_ini, attributeFont), 3);
        grid2.add(new TextPrint(toIni(persona.getInitative(), persona.getInitativWuerfel()), attributeFont), 1);
        if (persona instanceof AstraleProjektion) {
            AstraleProjektion ap = (AstraleProjektion)persona;
            grid2.add(new TextPrint(Messages.Printer_ast_ini, attributeFont), 3);
            grid2.add(new TextPrint(toIni(ap.getAstraleInitative(), ap.getAstraleInitativWuerfel()), attributeFont), 1);
        }

        grid2.add(new TextPrint(Messages.Printer_composure, attributeFont), 3);
        grid2.add(new TextPrint(printInteger(persona.getWillenskraft() + persona.getCharisma()), attributeFont), 1);
        grid2.add(new TextPrint(Messages.Printer_juge_intetion, attributeFont), 3);
        grid2.add(new TextPrint(printInteger(persona.getIntuition() + persona.getCharisma()), attributeFont), 1);
        grid2.add(new TextPrint(Messages.Printer_memory, attributeFont), 3);
        grid2.add(new TextPrint(printInteger(persona.getWillenskraft() + persona.getLogik()), attributeFont), 1);
        grid2.add(new TextPrint(Messages.Printer_lift_carry, attributeFont), 3);
        grid2.add(new TextPrint(printLiftCarry(persona), attributeFont), 1);
        grid2.add(new TextPrint(Messages.Printer_movement, attributeFont), 3);
        grid2.add(new TextPrint(printMovement(persona), attributeFont), 1);

        // grid2.add(new TextPrint("Ini", attributeFont), 3);
        // grid2.add(new TextPrint(toIni(persona), attributeFont), 1);

        // printeAttributes(persona, grid2, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE.getEAttributes());
        grid.add(grid2);

        if (persona instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)persona;

            GridPrint grid3 = new GridPrint("d,d,d,d,d,d", look);//$NON-NLS-1$
            grid3.add(new TextPrint(Messages.Printer_physical_limit, attributeFont));
            grid3.add(new TextPrint(printInteger(kp.getKoerperlich()), attributeFont));
            grid3.add(new TextPrint(Messages.Printer_mental_limit, attributeFont));
            grid3.add(new TextPrint(printInteger(kp.getGeistig()), attributeFont));
            grid3.add(new TextPrint(Messages.Printer_social_limit, attributeFont));
            grid3.add(new TextPrint(printInteger(kp.getSozial()), attributeFont));

            grid.add(grid3, 2);

        }
        return grid;
    }

    private String printLiftCarry(AbstraktPersona persona) {
        if (persona == null)
            return EMPTY;

        int staerke = persona.getStaerke();

        return String.format("%dkg/%dkg", staerke * 15, staerke * 10);//$NON-NLS-1 //$NON-NLS-1$
    }

    /**
     * print the movement to string.
     * 
     * @param persona
     * @return
     */
    private String printMovement(AbstraktPersona persona) {
        if (persona == null)
            return EMPTY;
        Spezies spezies = persona.getSpezies();
        if (spezies != null) {

            int geschicklichkeit = persona.getGeschicklichkeit();
            return String.format("%d/%d/+%d", geschicklichkeit * spezies.getLaufen(), geschicklichkeit * spezies.getRennen(), spezies.getSprinten());//$NON-NLS-1$
        }
        return EMPTY;
    }

    /**
     * Prints the ini.
     * 
     * @param persona
     * @return
     */
    private String toIni(int initative, int initativWuerfel) {
        return initative + " + " + initativWuerfel + "W";//$NON-NLS-1$ //$NON-NLS-2$
    }

    /**
     * Create a float string from an int with base 100.
     * 
     * @param essenz
     * @return
     */
    private String essenzToFloat(int essenz) {
        return ShadowrunEditingTools.essenzToFloat(essenz);
    }

    /**
     * Print the basic info like name and karma and the image.
     * 
     * @param character
     * @return
     */
    private Print printPersonaData(ManagedCharacter character) {
        AbstraktPersona persona = character.getPersona();

        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d,d,d,d,d,d", look);//$NON-NLS-1$
        if (persona == null)
            return grid;

        grid.add(new TextPrint(Messages.Printer_Name, attributeFont));
        grid.add(new TextPrint(persona.getName(), attributeFont), 3);
        grid.add(new TextPrint(Messages.Printer_sex, attributeFont));
        grid.add(new TextPrint(toName(character.getSex(), character, Shr5managementPackage.Literals.MANAGED_CHARACTER__SEX), attributeFont));

        grid.add(new TextPrint(Messages.Printer_meta, attributeFont));
        grid.add(new TextPrint(toSimpleName(persona.getSpezies()), attributeFont), 2);
        grid.add(new TextPrint(Messages.Printer_nativ, attributeFont));
        grid.add(new TextPrint(toSimpleName(character.getNativeLanguage()), attributeFont), 2);

        grid.add(new TextPrint(Messages.Printer_street_cred, attributeFont));
        grid.add(new TextPrint(printInteger(character.getStreetCred()), attributeFont), 1);
        grid.add(new TextPrint(Messages.Printer_notoriety, attributeFont));
        grid.add(new TextPrint(printInteger(character.getNotoriety()), attributeFont), 1);
        grid.add(new TextPrint(Messages.Printer_prom, attributeFont));
        grid.add(new TextPrint(printInteger(character.getPublicAwareness()), attributeFont), 1);

        grid.add(new TextPrint(Messages.Printer_karma, attributeFont));
        grid.add(new TextPrint(printInteger(character.getCurrentKarma()), attributeFont), 1);
        grid.add(new TextPrint(Messages.Printer_karma_total, attributeFont));
        grid.add(new TextPrint(printInteger(character.getKarmaGaint()), attributeFont), 1);

        // DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid1 = new GridPrint("d,d:g", look);//$NON-NLS-1$

        grid1.add(new EmptyPrint());
        Image imageScaledBy = AdapterFactoryUtil.getInstance().getImageScaledBy(BIG_SCALE, persona.getImage());
        if (imageScaledBy != null) {
            grid1.add(SWT.RIGHT, SWT.TOP, new ImagePrint(imageScaledBy.getImageData()));
        }

        look.setHeaderGap(5);
        GridPrint outerGrid = new GridPrint("d:g,d:g", look);//$NON-NLS-1$
        outerGrid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(EMPTY, attributeFont));
        outerGrid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_data, boldFontData));

        outerGrid.add(grid);
        outerGrid.add(grid1);

        return outerGrid;
    }

    /**
     * Simple Print a set of attributes.
     * 
     * @param persona
     * @param grid
     * @param eAttributes
     */
    private void printeAttributes(AbstraktPersona persona, GridPrint grid, EList<EAttribute> eAttributes) {
        if (persona == null)
            return;

        for (EAttribute eAttribute : eAttributes) {
            String attName = itemDelegator.getText(eAttribute);
            attName = toFeatureName(persona, eAttribute);

            Object value = persona.eGet(eAttribute);
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(attName, attributeFont), 3);
            grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(value.toString(), attributeFont), 1);
        }
    }

}
