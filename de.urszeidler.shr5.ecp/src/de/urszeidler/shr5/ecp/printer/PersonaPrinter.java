/**
 * 
 */
package de.urszeidler.shr5.ecp.printer;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.nebula.paperclips.core.EmptyPrint;
import org.eclipse.nebula.paperclips.core.ImagePrint;
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
import de.urszeidler.eclipse.shr5Management.provider.Shr5managementItemProviderAdapterFactory;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaFertigkeitenWidget;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaFertigkeitenWidget.GroupWrapper;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

/**
 * @author urs
 */
public class PersonaPrinter {

    private static final String ONE_SPACE = " ";//$NON-NLS-1$
    private static final String EMPTY = "";//$NON-NLS-1$
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
        Shr5managementItemProviderAdapterFactory shr5managementItemProviderAdapterFactory = new de.urszeidler.eclipse.shr5Management.provider.Shr5managementItemProviderAdapterFactory();
        AdapterFactoryUtil.getInstance().getAdapterFactory().insertAdapterFactory(shr5managementItemProviderAdapterFactory);
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
        GridPrint grid = new GridPrint("d:g,d:g", look);//$NON-NLS-1$

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

        grid.addFooter(new EmptyPrint(), GridPrint.REMAINDER);
        grid.addFooter(new EmptyPrint(), GridPrint.REMAINDER);
        grid.addFooter(new TextPrint(Messages.Printer_footer_1, italicFontData), 2);
        grid.addFooter(new TextPrint(Messages.Printer_footer_2, italicFontData), 2);
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
        GridPrint grid = new GridPrint("d,d:g", look);//$NON-NLS-1$

        grid.add(new EmptyPrint());
        Image imageScaledBy = AdapterFactoryUtil.getInstance().getImageScaledBy(128, persona.getImage());
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
            grid.add(new TextPrint(entry.getValue().toString(), attributeFont));
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
        buffer.append(Messages.Printer_page);
        buffer.append(ge.getPage());
        return buffer.toString();
    }

    private Print printZauberList(List<PersonaZauber> zauber) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        GridPrint grid = new GridPrint("d:g,d", look);//$NON-NLS-1$

        grid.addHeader(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_spells, boldFontData), 2);
        grid.addHeader(new TextPrint(Messages.Printer_Name, italicFontData), 2);
        // grid.add(new TextPrint("Essenz", italicFontData));
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
     * Prints the ranged weapons.
     * 
     * @param persona
     * @return
     */
    private Print printPersonaRangedWeapons(ManagedCharacter character) {
        DefaultGridLook look = new DefaultGridLook(5, 10);
        GridPrint grid = new GridPrint("d:g", look);//$NON-NLS-1$
        EList<AbstraktGegenstand> inventar = character.getInventar();
        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_weapons, boldFontData));
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
        GridPrint grid = new GridPrint("d:g,d:g,d:g,d:g,d:g,d:g,", look);//$NON-NLS-1$

        // grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("", italicFontData), 2);
        // grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("reach", italicFontData));
        // grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("dmg", italicFontData));
        // grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("akk", italicFontData));
        // grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("ap", italicFontData));

        grid.add(new TextPrint(toName(fw), attributeFont), 2);
        grid.add(new TextPrint(fw.getSchadenscode(), attributeFont));
        grid.add(new TextPrint(printInteger(fw.getPraezision()), attributeFont));
        grid.add(new TextPrint(printInteger(fw.getDurchschlagsKraft()), attributeFont));
        grid.add(new TextPrint(printInteger(fw.getReichweite()), attributeFont));

        return grid;
    }

    /**
     * Print a detail for a feuerwaffe.
     */
    private GridPrint printFeuerwaffeDetail(Feuerwaffe fw) {
        DefaultGridLook look = new DefaultGridLook(3, 3);
        GridPrint grid = new GridPrint("d:g,d:g,d:g,d:g,d:g,d:g,d:g,d:g", look);//$NON-NLS-1$

        // grid.add(new TextPrint("Name", italicFontData), 5);
        // grid.add(new TextPrint("Type", italicFontData), 3);

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
            buffer.append(fernkampfwaffeModifikator.getEp() + toMod(fernkampfwaffeModifikator.getMods()));

        }
        return buffer.toString();
    }

    private String toMod(EList<AttributModifikatorWert> mods) {
        return mods.toString();
    }

    private String toReichweite(int min, int max) {
        return min + "-" + max;//$NON-NLS-1$
    }

    private GridPrint printFernkampWaffeDetail(AbstaktFernKampfwaffe fw) {
        DefaultGridLook look = new DefaultGridLook(3, 3);
        GridPrint grid = new GridPrint("d:g,d:g,d:g,d:g,d:g,d:g,d:g,d:g", look);//$NON-NLS-1$

        // grid.add(new TextPrint("Name", italicFontData), 5);
        // grid.add(new TextPrint("Type", italicFontData), 3);

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
        GridPrint grid = new GridPrint("d:g,d", look);//$NON-NLS-1$

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
     * Prints the given list of fertigkeiten.
     * 
     * @param grid
     * @param fertigkeiten
     * @param persona
     */
    private void printFertigkeitList(GridPrint grid, List<Fertigkeit> fertigkeiten, AbstraktPersona persona) {
        for (Fertigkeit fertigkeit : fertigkeiten) {
            Integer value = (Integer)persona.eGet(fertigkeit.getAttribut());
            Integer fertigkeitValue = ShadowrunTools.findFertigkeitValue(fertigkeit, persona);
            if (fertigkeitValue < 1 && !fertigkeit.isAusweichen()) {
                continue;
            } else {
                value = value + fertigkeitValue;
            }
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(toName(fertigkeit), attributeFont), 2);
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

        DefaultGridLook look = new DefaultGridLook(10, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d,d", look);//$NON-NLS-1$

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
        grid2.add(new TextPrint(EMPTY, attributeFont), 1);
        grid2.add(new TextPrint(Messages.Printer_movement, attributeFont), 3);
        grid2.add(new TextPrint(EMPTY, attributeFont), 1);

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
     * Prints the ini.
     * 
     * @param persona
     * @return
     */
    private String printInteger(int value) {
        return String.format("%d", value);//$NON-NLS-1$
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
        GridPrint grid = new GridPrint("d,d,d,d,d,d", look);//$NON-NLS-1$

        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(EMPTY, attributeFont));
        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(Messages.Printer_data, boldFontData), 5);

        grid.add(new TextPrint(Messages.Printer_Name, attributeFont));
        grid.add(new TextPrint(persona.getName(), attributeFont), 3);
        grid.add(new TextPrint(Messages.Printer_sex, attributeFont));
        grid.add(new TextPrint(itemDelegator.getText(character.getSex()), attributeFont));

        grid.add(new TextPrint(Messages.Printer_meta, attributeFont));
        grid.add(new TextPrint(itemDelegator.getText(persona.getSpezies()), attributeFont), 2);
        grid.add(new TextPrint(Messages.Printer_nativ, attributeFont));
        grid.add(new TextPrint(itemDelegator.getText(character.getNativeLanguage()), attributeFont), 2);

        grid.add(new TextPrint(Messages.Printer_street_cred, attributeFont));
        grid.add(new TextPrint(printInteger(character.getStreetCred()), attributeFont), 1);
        grid.add(new TextPrint(Messages.Printer_notoriety, attributeFont));
        grid.add(new TextPrint(printInteger(character.getNotoriety()), attributeFont), 1);
        grid.add(new TextPrint(Messages.Printer_prom, attributeFont));
        grid.add(new TextPrint(character.getPublicAwareness() + EMPTY, attributeFont), 1);

        grid.add(new TextPrint(Messages.Printer_karma, attributeFont));
        grid.add(new TextPrint(printInteger(character.getCurrentKarma()), attributeFont), 1);
        grid.add(new TextPrint(Messages.Printer_karma_total, attributeFont));
        grid.add(new TextPrint(printInteger(character.getKarmaGaint()), attributeFont), 1);

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
            attName = toFeatureName(persona, eAttribute);

            Object value = persona.eGet(eAttribute);
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(attName, attributeFont), 3);
            grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(value.toString(), attributeFont), 1);
        }
    }

    /**
     * Returns the localized feature name.
     * 
     * @param object
     * @param eAttribute
     * @return
     */
    public static String toFeatureName(EObject object, EStructuralFeature eAttribute) {
        IItemPropertyDescriptor descriptor = AdapterFactoryUtil.getInstance().getItemDelegator().getPropertyDescriptor(object, eAttribute);

        return descriptor.getDisplayName(eAttribute);
    }

}
