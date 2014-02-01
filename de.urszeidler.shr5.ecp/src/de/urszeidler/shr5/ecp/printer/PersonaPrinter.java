/**
 * 
 */
package de.urszeidler.shr5.ecp.printer;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.jface.resource.JFaceResources;
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
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;

import de.urszeidler.eclipse.shr5.AbstaktFernKampfwaffe;
import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.AstraleProjektion;
import de.urszeidler.eclipse.shr5.AttributModifikatorWert;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Feuerwaffe;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.KiKraft;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.Koerpermods;
import de.urszeidler.eclipse.shr5.Nahkampfwaffe;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Vertrag;
import de.urszeidler.eclipse.shr5.Zauberer;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.Connection;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaFertigkeitenWidget;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaFertigkeitenWidget.GroupWrapper;

/**
 * @author urs
 */
public class PersonaPrinter {

    private static PersonaPrinter instance;

    /**
     * Simple factory interface.
     * 
     * @author urs
     */
    public interface PrintFactory {
        Print createPrinter();
    }

    /**
     * The sigelton instance acces.
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
        initalizePrinter();
    }

    private FontData boldFontData;
    private FontData attributeFont;
    private AdapterFactoryItemDelegator itemDelegator;
    private FontData italicFontData;

    protected void initalizePrinter() {

        FontData[] defaultFont = JFaceResources.getDefaultFont().getFontData();
        boldFontData = new FontData(defaultFont[0].getName(), defaultFont[0].getHeight(), SWT.BOLD);
        italicFontData = new FontData(defaultFont[0].getName(), defaultFont[0].getHeight() - 2, SWT.ITALIC);
        attributeFont = new FontData(defaultFont[0].getName(), defaultFont[0].getHeight() - 2, defaultFont[0].getStyle());

        // persona = character.getPersona();
        itemDelegator = AdapterFactoryUtil.getInstance().getItemDelegator();
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
                return printCharacterSheet(character);
            }
        };
    }

    /**
     * Print the character sheet.
     * 
     * @param character
     * @return
     */
    public Print printCharacterSheet(ManagedCharacter character) {
        AbstraktPersona persona = character.getPersona();

        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d:g,d:g", look);

        LineBorder border = new LineBorder();
        border.setLineWidth(1);

        grid.add(new BorderPrint(printPersonaData(character), border), 1);
        grid.add(printPersonaDetails(persona), 1);

        grid.add(new BorderPrint(printPersonaAttributes(persona), border), 1);
        grid.add(new BorderPrint(printPersonaConditionMonitor(persona), border), 1);

        grid.add(new BorderPrint(printPersonaRangedWeapons(character), border), 2);

        grid.add(printAllPersonaSkills(persona));
        grid.add(printPersonaFormPart1(character));

        grid.add(new BorderPrint(printPersonaRangedWeapons1(character), border), 1);
        grid.add(new BorderPrint(printPersonaMeeleWeapons(character), border), 1);

        List<AbstraktGegenstand> gList = character.getInventar();
        grid.add(new BorderPrint(printGegenstandList(gList), border), 2);
        // grid.add(printPersonaContracts(character), 1);

        grid.addFooter(new TextPrint("Shr5 rich client platform", italicFontData));
        return grid;
    }

    /**
     * Prints the persona condition monitor.
     * 
     * @param persona
     * @return
     */
    private Print printPersonaDetails(AbstraktPersona persona) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d,d", look);

        Image imageScaledBy = AdapterFactoryUtil.getInstance().getImageScaledBy(128, persona.getImage());
        if (imageScaledBy != null) {
            grid.add(SWT.RIGHT, SWT.DEFAULT, new ImagePrint(imageScaledBy.getImageData()));
        }

        return grid;
    }

    /**
     * Prints the persona condition monitor.
     * 
     * @param persona
     * @return
     */
    private Print printPersonaFormPart1(ManagedCharacter character) {
        DefaultGridLook look = new DefaultGridLook(0, 0);
        GridPrint grid = new GridPrint("d:g", look);

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
        return grid;
    }

    private Print printGegenstandList(List<AbstraktGegenstand> g) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        GridPrint grid = new GridPrint("d:g,d,d,d", look);

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("Items", boldFontData), 4);
        grid.add(new TextPrint("Name", italicFontData), 1);
        grid.add(new TextPrint("Avail", italicFontData));
        grid.add(new TextPrint("Cost", italicFontData));
        grid.add(new TextPrint("Source", italicFontData));
        for (AbstraktGegenstand ge : g) {
            grid.add(new TextPrint(itemDelegator.getText(ge), attributeFont), 1);
            grid.add(new TextPrint(ge.getVerfuegbarkeit(), attributeFont), 1);
            grid.add(new TextPrint(ge.getWert().toString(), attributeFont), 1);
            grid.add(new TextPrint(toSource(ge), attributeFont), 1);
        }

        return grid;
    }

    /**
     * @param ge
     * @return
     */
    private String toSource(Quelle ge) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(itemDelegator.getText(ge.getSrcBook()));
        buffer.append(" page ");
        buffer.append(ge.getPage());
        return buffer.toString();
    }

    private Print printZauberList(List<PersonaZauber> zauber) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        GridPrint grid = new GridPrint("d:g,d", look);

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("Spells", boldFontData), 2);
        grid.add(new TextPrint("Name", italicFontData), 2);
        // grid.add(new TextPrint("Essenz", italicFontData));
        for (PersonaZauber z : zauber) {
            grid.add(new TextPrint(itemDelegator.getText(z.getFormel()), attributeFont), 2);
        }

        return grid;
    }

    private Print printKiKraftList(List<KiKraft> kikraft) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        GridPrint grid = new GridPrint("d:g,d", look);

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("Ki Powers", boldFontData), 2);
        grid.add(new TextPrint("Name", italicFontData), 2);
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
        GridPrint grid = new GridPrint("d:g,d", look);

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("BodyTec", boldFontData), 2);
        grid.add(new TextPrint("Name", italicFontData));
        grid.add(new TextPrint("Essenz", italicFontData));

        for (Koerpermods koerpermods2 : koerperMods) {
            grid.add(new TextPrint(itemDelegator.getText(koerpermods2), attributeFont));
            grid.add(new TextPrint("", attributeFont));
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
        GridPrint grid = new GridPrint("d:g,d", look);

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("Edges/Flaws", boldFontData), 2);
        grid.add(new TextPrint("Name", italicFontData));
        grid.add(new TextPrint("Karma", italicFontData));

        for (PersonaEigenschaft personaEigenschaft : eigenschaften) {
            grid.add(new TextPrint(itemDelegator.getText(personaEigenschaft), attributeFont));
            grid.add(new TextPrint(personaEigenschaft.getKarmaKosten() + "", attributeFont));
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
        GridPrint grid = new GridPrint("d:g,d,d,d,d,d,d,d", look);

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("Ranged Weapons", boldFontData), 8);

        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("Name", italicFontData), 2);
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("Dmg", italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("akk", italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("ap", italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("modus", italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("rc", italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("muni", italicFontData));

        EList<AbstraktGegenstand> inventar = character.getInventar();
        for (AbstraktGegenstand abstraktGegenstand : inventar) {
            if (abstraktGegenstand instanceof AbstaktFernKampfwaffe) {
                AbstaktFernKampfwaffe fw = (AbstaktFernKampfwaffe)abstraktGegenstand;
                printFernkampWaffeDetail(fw);

                grid.add(new TextPrint(itemDelegator.getText(fw), attributeFont), 2);
                grid.add(new TextPrint(fw.getSchadenscode(), attributeFont));
                grid.add(new TextPrint(fw.getPraezision() + "", attributeFont));
                grid.add(new TextPrint(fw.getDurchschlagsKraft() + "", attributeFont));
                if (fw instanceof Feuerwaffe) {
                    Feuerwaffe f = (Feuerwaffe)fw;
                    printFeuerwaffeDetail(f);

                    grid.add(new TextPrint(f.getModie().toString(), attributeFont));
                    grid.add(new TextPrint(f.getRueckstoss() + "", attributeFont));
                    grid.add(new TextPrint(f.getKapazitaet() + f.getMunitionstyp().getLiteral(), attributeFont));

                } else {
                    grid.add(new TextPrint("", attributeFont));
                    grid.add(new TextPrint("", attributeFont));
                    grid.add(new TextPrint("", attributeFont));
                }
            }
        }

        return grid;
    }

    /**
     * Prints the ranged weapons.
     * 
     * @param persona
     * @return
     */
    private Print printPersonaRangedWeapons(ManagedCharacter character) {
        DefaultGridLook look = new DefaultGridLook(5, 10);
        GridPrint grid = new GridPrint("d:g", look);
        EList<AbstraktGegenstand> inventar = character.getInventar();
        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("Weapons", boldFontData));
        for (AbstraktGegenstand abstraktGegenstand : inventar) {
            if (abstraktGegenstand instanceof Feuerwaffe) {
                Feuerwaffe f = (Feuerwaffe)abstraktGegenstand;
                grid.add(printFeuerwaffeDetail(f));
            } else if (abstraktGegenstand instanceof AbstaktFernKampfwaffe) {
                AbstaktFernKampfwaffe af = (AbstaktFernKampfwaffe)abstraktGegenstand;
                grid.add(printFernkampWaffeDetail(af));
            }
        }
        for (AbstraktGegenstand abstraktGegenstand : inventar) {
            if (abstraktGegenstand instanceof Nahkampfwaffe) {
                Nahkampfwaffe f = (Nahkampfwaffe)abstraktGegenstand;
                grid.add(printNahkampfwaffeDetail(f));
            }
        }

        return grid;
    }

    private Print printNahkampfwaffeDetail(Nahkampfwaffe fw) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d:g,d,d,d,d,d,", look);

        // grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("", italicFontData), 2);
        // grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("reach", italicFontData));
        // grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("dmg", italicFontData));
        // grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("akk", italicFontData));
        // grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("ap", italicFontData));

        grid.add(new TextPrint(toName(fw), attributeFont), 2);
        grid.add(new TextPrint(fw.getSchadenscode(), attributeFont));
        grid.add(new TextPrint(fw.getPraezision() + "", attributeFont));
        grid.add(new TextPrint(fw.getDurchschlagsKraft() + "", attributeFont));
        grid.add(new TextPrint(fw.getReichweite() + "", attributeFont));

        return grid;
    }

    /**
     * Print a detail for a feuerwaffe.
     */
    private GridPrint printFeuerwaffeDetail(Feuerwaffe fw) {
        DefaultGridLook look = new DefaultGridLook(3, 3);
        GridPrint grid = new GridPrint("d:g,d:g,d:g,d:g,d:g,d:g,d:g,d:g", look);

        // grid.add(new TextPrint("Name", italicFontData), 5);
        // grid.add(new TextPrint("Type", italicFontData), 3);

        grid.add(new TextPrint(toName(fw), attributeFont), 5);
        grid.add(new TextPrint(toName(fw.getReichweite()), attributeFont), 3);

        grid.add(new TextPrint("Dmg", italicFontData));
        grid.add(new TextPrint("akk", italicFontData));
        grid.add(new TextPrint("ap", italicFontData));
        grid.add(new TextPrint("modus", italicFontData));
        grid.add(new TextPrint("rc", italicFontData));
        grid.add(new TextPrint("muni", italicFontData));
        grid.add(new TextPrint("adons", italicFontData), 2);

        grid.add(new TextPrint(fw.getSchadenscode(), attributeFont));
        grid.add(new TextPrint(fw.getPraezision() + "", attributeFont));
        grid.add(new TextPrint(fw.getDurchschlagsKraft() + "", attributeFont));
        grid.add(new TextPrint(fw.getModie().toString(), attributeFont));
        grid.add(new TextPrint(fw.getRueckstoss() + "", attributeFont));
        grid.add(new TextPrint(fw.getKapazitaet() + fw.getMunitionstyp().getLiteral(), attributeFont));
        grid.add(new TextPrint(toMod(fw.getMods()), attributeFont), 2);

        grid.add(new TextPrint("short", italicFontData), 2);
        grid.add(new TextPrint("medium", italicFontData), 2);
        grid.add(new TextPrint("long", italicFontData), 2);
        grid.add(new TextPrint("extreme", italicFontData), 2);

        if (fw.getReichweite() != null) {
            grid.add(new TextPrint(toReichweite(fw.getReichweite().getMin(), fw.getReichweite().getKurz()), attributeFont), 2);
            grid.add(new TextPrint(toReichweite(fw.getReichweite().getKurz(), fw.getReichweite().getMittel()), attributeFont), 2);
            grid.add(new TextPrint(toReichweite(fw.getReichweite().getMittel(), fw.getReichweite().getWeit()), attributeFont), 2);
            grid.add(new TextPrint(toReichweite(fw.getReichweite().getWeit(), fw.getReichweite().getExtrem()), attributeFont), 2);
        }

        return grid;
    }

    private String toMod(EList<AttributModifikatorWert> mods) {
        return mods.toString();
    }

    private String toReichweite(int min, int max) {
        return min + "-" + max;
    }

    private GridPrint printFernkampWaffeDetail(AbstaktFernKampfwaffe fw) {
        DefaultGridLook look = new DefaultGridLook(3, 3);
        GridPrint grid = new GridPrint("d:g,d:g,d:g,d:g,d:g,d:g,d:g,d:g", look);

        // grid.add(new TextPrint("Name", italicFontData), 5);
        // grid.add(new TextPrint("Type", italicFontData), 3);

        grid.add(new TextPrint(toName(fw), attributeFont), 5);
        grid.add(new TextPrint(toName(fw.getReichweite()), attributeFont), 3);

        grid.add(new TextPrint("Dmg", italicFontData));
        grid.add(new TextPrint("akk", italicFontData));
        grid.add(new TextPrint("ap", italicFontData));
        grid.add(new TextPrint("", italicFontData));
        grid.add(new TextPrint("", italicFontData));
        grid.add(new TextPrint("", italicFontData));
        grid.add(new TextPrint("adons", italicFontData), 2);

        grid.add(new TextPrint(fw.getSchadenscode(), attributeFont));
        grid.add(new TextPrint(fw.getPraezision() + "", attributeFont));
        grid.add(new TextPrint(fw.getDurchschlagsKraft() + "", attributeFont));
        grid.add(new TextPrint("", attributeFont));
        grid.add(new TextPrint("", attributeFont));
        grid.add(new TextPrint("", attributeFont));
        grid.add(new TextPrint(fw.getMods().toString(), attributeFont), 2);

        grid.add(new TextPrint("short", italicFontData), 2);
        grid.add(new TextPrint("medium", italicFontData), 2);
        grid.add(new TextPrint("long", italicFontData), 2);
        grid.add(new TextPrint("extreme", italicFontData), 2);

        if (fw.getReichweite() != null) {
            grid.add(new TextPrint(toReichweite(fw.getReichweite().getMin(), fw.getReichweite().getKurz()), attributeFont), 2);
            grid.add(new TextPrint(toReichweite(fw.getReichweite().getKurz(), fw.getReichweite().getMittel()), attributeFont), 2);
            grid.add(new TextPrint(toReichweite(fw.getReichweite().getMittel(), fw.getReichweite().getWeit()), attributeFont), 2);
            grid.add(new TextPrint(toReichweite(fw.getReichweite().getWeit(), fw.getReichweite().getExtrem()), attributeFont), 2);
        }

        return grid;
    }

    private String toName(EObject fw) {
        return itemDelegator.getText(fw);
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
        GridPrint grid = new GridPrint("d:g,d", look);

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("Contracts", boldFontData), 2);
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("Name", italicFontData), 2);
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
        GridPrint grid = new GridPrint("d:g,d,d,d,d,d,", look);

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("Meele Weapons", boldFontData), 6);
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("Name", italicFontData), 2);
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("reach", italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("dmg", italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("akk", italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("ap", italicFontData));

        EList<AbstraktGegenstand> inventar = character.getInventar();
        for (AbstraktGegenstand abstraktGegenstand : inventar) {
            if (abstraktGegenstand instanceof Nahkampfwaffe) {
                Nahkampfwaffe fw = (Nahkampfwaffe)abstraktGegenstand;

                grid.add(new TextPrint(itemDelegator.getText(fw), attributeFont), 2);
                grid.add(new TextPrint(fw.getReichweite() + "", attributeFont));
                grid.add(new TextPrint(fw.getSchadenscode(), attributeFont));
                grid.add(new TextPrint(fw.getPraezision() + "", attributeFont));
                grid.add(new TextPrint(fw.getDurchschlagsKraft() + "", attributeFont));
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
        GridPrint grid = new GridPrint("d,d", look);

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("Monitor", boldFontData), 2);
        grid.add(SWT.LEFT, SWT.TOP, printConditionMonitor("Body", 13));
        grid.add(SWT.RIGHT, SWT.TOP, printConditionMonitor("Mental", 10));

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
        GridPrint grid = new GridPrint("c:p,c:p,c:p,d", look);

        grid.add(SWT.LEFT, SWT.TOP, new TextPrint(monitorName, italicFontData), GridPrint.REMAINDER);
        Border border = new LineBorder();
        int col = number / 3;
        for (int i = 0; i < col; i++) {
            grid.add(SWT.DEFAULT, SWT.FILL, new BorderPrint(new TextPrint(" "), border), 1);
            grid.add(SWT.DEFAULT, SWT.FILL, new BorderPrint(new TextPrint(" "), border), 1);
            grid.add(SWT.DEFAULT, SWT.FILL, new BorderPrint(new TextPrint(" "), border), 1);
            grid.add(SWT.DEFAULT, SWT.FILL, new TextPrint("-" + (i + 1) + " "), 1);
        }
        int rest = number % 3;
        for (int i = 0; i < rest; i++) {
            grid.add(SWT.DEFAULT, SWT.TOP, new BorderPrint(new TextPrint(" "), border), 1);
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
        GridPrint grid = new GridPrint("d:g,d,d,d,d", look);

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("", boldFontData), 2);
        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("Connections", boldFontData), 3);

        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("Name", italicFontData), 2);
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("Loyality", italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("Influence", italicFontData));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("---"));

        EList<Connection> connections = character.getConnections();
        for (Connection connection : connections) {
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(itemDelegator.getText(connection), 2));
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(connection.getLoyality() + ""));
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(connection.getInfluence() + ""));
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("---"));

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
        GridPrint grid = new GridPrint("d,d,d,d,d", look);

        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("", attributeFont));
        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("Skills", boldFontData), 4);

        grid.add(new TextPrint("Name", italicFontData), 3);
        grid.add(new TextPrint("Attrbute", italicFontData), 1);
        grid.add(new TextPrint("dice pool", italicFontData), 1);
        List<Object> root = PersonaFertigkeitenWidget.createFertigkeitGroupsRoot(persona);
        for (Object object : root) {
            if (object instanceof FertigkeitsGruppe) {
                FertigkeitsGruppe fg = (FertigkeitsGruppe)object;
                // printGroup
                PersonaFertigkeitsGruppe gruppe = ShadowrunTools.findGruppe(fg, persona);
                String stufe = "";
                if (gruppe != null) {
                    stufe = gruppe.getStufe() + "";
                }

                grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(itemDelegator.getText(fg), attributeFont), 4);
                grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(stufe, attributeFont), 1);
                List<Fertigkeit> fertigkeiten = fg.getFertigkeiten();
                printFertigkeitList(grid, fertigkeiten, persona);
            } else if (object instanceof GroupWrapper) {
                GroupWrapper gw = (GroupWrapper)object;
                grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(gw.getName(), attributeFont), 4);
                grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("", attributeFont), 1);
                List<Fertigkeit> fertigkeiten = gw.getEntries();
                printFertigkeitList(grid, fertigkeiten, persona);
            }
        }

        return grid;
    }

    /**
     * Prints the given list of fertigkeiten.
     * 
     * @param grid
     * @param fertigkeiten
     * @param persona
     */
    private void printFertigkeitList(GridPrint grid, List<Fertigkeit> fertigkeiten, AbstraktPersona persona) {
        for (Fertigkeit fertigkeit : fertigkeiten) {
            Integer value = (Integer)persona.eGet(fertigkeit.getAttribut());
            String attributeText = AdapterFactoryUtil.getInstance().getItemDelegator().getText(fertigkeit.getAttribut());
            Integer fertigkeitValue = ShadowrunTools.findFertigkeitValue(fertigkeit, persona);
            if (fertigkeitValue < 1 && !fertigkeit.isAusweichen()) {
                continue;
            } else {
                value = value + fertigkeitValue;
            }
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("  " + itemDelegator.getText(fertigkeit), attributeFont), 3);
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(attributeText, attributeFont), 1);
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(value + "", attributeFont), 1);
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
        GridPrint grid = new GridPrint("d,d:g", look);

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(""));
        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("Combat info", boldFontData), 1);

        GridPrint grid1 = new GridPrint("d:g,r:d", look);
        grid1.add(new TextPrint("doge", attributeFont));
        grid1.add(new TextPrint(persona.getAusweichen() + "", attributeFont));
        if (persona instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)persona;
            grid1.add(new TextPrint("armor", attributeFont));
            grid1.add(new TextPrint(kp.getPanzer() + "", attributeFont));

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

        DefaultGridLook look = new DefaultGridLook(10, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d,d", look);

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(""));
        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("Attribute", boldFontData), 1);

        GridPrint grid1 = new GridPrint("d,d,d,r:d", look);
        printeAttributes(persona, grid1, Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE.getEAttributes());
        printeAttributes(persona, grid1, Shr5Package.Literals.GEISTIGE_ATTRIBUTE.getEAttributes());
        grid1.add(new TextPrint("edge", attributeFont), 3);
        grid1.add(new TextPrint(persona.getEdgeBasis() + "", attributeFont), 1);

        grid.add(grid1);
        GridPrint grid2 = new GridPrint("d,d,d,r:d", look);

        grid2.add(new TextPrint("Essenz", attributeFont), 3);
        grid2.add(new TextPrint(essenzToFloat(persona.getEssenz()), attributeFont), 1);
        grid2.add(new TextPrint("Ini", attributeFont), 3);
        grid2.add(new TextPrint(toIni(persona.getInitative(), persona.getInitativWuerfel()), attributeFont), 1);
        if (persona instanceof AstraleProjektion) {
            AstraleProjektion ap = (AstraleProjektion)persona;
            grid2.add(new TextPrint("Astral Ini", attributeFont), 3);
            grid2.add(new TextPrint(toIni(ap.getAstraleInitative(), ap.getAstraleInitativWuerfel()), attributeFont), 1);
        }

        grid2.add(new TextPrint("Composure", attributeFont), 3);
        grid2.add(new TextPrint("", attributeFont), 1);
        grid2.add(new TextPrint("Juge Intention", attributeFont), 3);
        grid2.add(new TextPrint("", attributeFont), 1);
        grid2.add(new TextPrint("Memory", attributeFont), 3);
        grid2.add(new TextPrint("", attributeFont), 1);
        grid2.add(new TextPrint("Lift/Carry", attributeFont), 3);
        grid2.add(new TextPrint("", attributeFont), 1);
        grid2.add(new TextPrint("Movement", attributeFont), 3);
        grid2.add(new TextPrint("", attributeFont), 1);

        // grid2.add(new TextPrint("Ini", attributeFont), 3);
        // grid2.add(new TextPrint(toIni(persona), attributeFont), 1);

        // printeAttributes(persona, grid2, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE.getEAttributes());
        grid.add(grid2);

        if (persona instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)persona;

            GridPrint grid3 = new GridPrint("d,d,d,d,d,d", look);
            grid3.add(new TextPrint("Physical limit", attributeFont));
            grid3.add(new TextPrint(kp.getKoerperlich() + "", attributeFont));
            grid3.add(new TextPrint("Mental limit", attributeFont));
            grid3.add(new TextPrint(kp.getGeistig() + "", attributeFont));
            grid3.add(new TextPrint("Social limit", attributeFont));
            grid3.add(new TextPrint(kp.getSozial() + "", attributeFont));

            grid.add(grid3, 2);

        }
        return grid;
    }

    /**
     * Prints the ini.
     * 
     * @param persona
     * @return
     */
    private String toIni(int initative, int initativWuerfel) {
        return initative + " + " + initativWuerfel + "W";
    }

    /**
     * Create a float string from an int with base 100.
     * 
     * @param essenz
     * @return
     */
    private String essenzToFloat(int essenz) {
        float f = essenz / 100f;
        String string = String.format("%.2f", f);
        return string;
    }

    /**
     * Print the basic info like name and karma .
     * 
     * @param character
     * @return
     */
    private Print printPersonaData(ManagedCharacter character) {
        AbstraktPersona persona = character.getPersona();

        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d,d,d,d,d,d", look);

        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("", attributeFont));
        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("Data", boldFontData), 5);

        grid.add(new TextPrint("Name", attributeFont));
        grid.add(new TextPrint(persona.getName() + "", attributeFont), 3);
        grid.add(new TextPrint("Sex", attributeFont));
        grid.add(new TextPrint(character.getSex() + "", attributeFont));

        grid.add(new TextPrint("Meta", attributeFont));
        grid.add(new TextPrint(itemDelegator.getText(persona.getSpezies()), attributeFont), 2);
        grid.add(new TextPrint("Nativ", attributeFont));
        grid.add(new TextPrint(itemDelegator.getText(character.getNativeLanguage()), attributeFont), 2);

        grid.add(new TextPrint("Streecred", attributeFont));
        grid.add(new TextPrint(character.getStreetCred() + "", attributeFont), 1);
        grid.add(new TextPrint("Notoriety", attributeFont));
        grid.add(new TextPrint(character.getNotoriety() + "", attributeFont), 1);
        grid.add(new TextPrint("Prom", attributeFont));
        grid.add(new TextPrint(character.getPublicAwareness() + "", attributeFont), 1);

        grid.add(new TextPrint("Karma", attributeFont));
        grid.add(new TextPrint("0", attributeFont), 1);
        grid.add(new TextPrint("Karma Total", attributeFont));
        grid.add(new TextPrint(character.getKarmaGaint() + "", attributeFont), 1);

        return grid;
    }

    /**
     * Simple Print a set of attributes.
     * 
     * @param persona
     * @param grid
     * @param eAttributes
     */
    private void printeAttributes(AbstraktPersona persona, GridPrint grid, EList<EAttribute> eAttributes) {
        for (EAttribute eAttribute : eAttributes) {
            String attName = itemDelegator.getText(eAttribute);
            Object value = persona.eGet(eAttribute);
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(attName, attributeFont), 3);
            grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(value.toString(), attributeFont), 1);
        }
    }

}
