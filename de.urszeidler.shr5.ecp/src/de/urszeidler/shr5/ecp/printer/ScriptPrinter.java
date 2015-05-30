/**
 * 
 */
package de.urszeidler.shr5.ecp.printer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.nebula.paperclips.core.BreakPrint;
import org.eclipse.nebula.paperclips.core.EmptyPrint;
import org.eclipse.nebula.paperclips.core.ImagePrint;
import org.eclipse.nebula.paperclips.core.LinePrint;
import org.eclipse.nebula.paperclips.core.NoBreakPrint;
import org.eclipse.nebula.paperclips.core.Print;
import org.eclipse.nebula.paperclips.core.grid.DefaultGridLook;
import org.eclipse.nebula.paperclips.core.grid.GridPrint;
import org.eclipse.nebula.paperclips.core.text.TextPrint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.KoerperPersona;
import de.urszeidler.eclipse.shr5.runtime.GruntTeam;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.Team;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.ScriptingPackage;
import de.urszeidler.shr5.scripting.Section;

/**
 * @author urs
 */
public class ScriptPrinter extends PersonaPrinter {
    private static ScriptPrinter instance;

    /**
     * The singleton instance access.
     * 
     * @return
     */
    public static ScriptPrinter getInstance() {
        if (instance == null)
            instance = new ScriptPrinter();
        return instance;
    }

    public ScriptPrinter() {
        super();
        initalizePrinter();
    }

    /**
     * Returns the factory to create a new print of the character.
     * 
     * @param c
     * @return
     */
    public PrintFactory createPrintFactory(final Script c) {
        return new PrintFactory() {
            private Script script = c;

            @Override
            public Print createPrinter() {
                return createPagePrint(printScriptSheet(script));
            }

            @Override
            public String getPrintTitel() {
                return Messages.PersonaPrinter_Character_sheet + c.getName();
            }
        };
    }

    protected Print printScriptSheet(Script script) {
        DefaultGridLook look = new DefaultGridLook(0, 0);
        look.setHeaderGap(0);
        GridPrint grid = new GridPrint("d:g", look);//$NON-NLS-1$
        grid.add(printDescription(script));
        grid.add(new EmptyPrint(5, 20));
        for (Placement placement : script.getPlacements()) {
            grid.add(new TextPrint(toSimpleName(placement)));
        }

        grid.add(new BreakPrint(), GridPrint.REMAINDER);
        for (Placement placement : script.getPlacements()) {
            grid.add(new NoBreakPrint(printPlacement(placement)));

        }
        grid.add(new BreakPrint(), GridPrint.REMAINDER);
        grid.add(new TextPrint("Appendix enemy groups:", headFontData));
        for (Team team : script.getAllTeams()) {
            grid.add(new TextPrint(toSimpleName(team), attributeFont));
            if (team instanceof GruntTeam) {
                GruntTeam gt = (GruntTeam)team;
                grid.add(printGruntGroupSheet(gt.getGruntGroup()));
            } else
                grid.add(printTeamDetail(team));
        }

        return grid;
    }

    private Print printPlacement(Placement placement) {
        DefaultGridLook look = new DefaultGridLook(0, 0);
        look.setHeaderGap(0);
        GridPrint grid = new GridPrint("d:g", look);//$NON-NLS-1$
        grid.add(printDescription(placement));

        grid.add(new EmptyPrint(5, 20));
        grid.add(createBandPrint(new TextPrint("Time"), new TextPrint(formatDate(placement.getStartDate())),
                new TextPrint(formatDate(placement.getStartDate()))));
        if (placement.getInTheirFace()!=null &&!placement.getInTheirFace().isEmpty()) {
            grid.add(new TextPrint(ShadowrunEditingTools.toFeatureName(placement, ScriptingPackage.Literals.PLACEMENT__IN_THEIR_FACE), headFontData));
            grid.add(new TextPrint(printString(placement.getInTheirFace())));
            grid.add(new EmptyPrint(5, 25));
        }
        if (placement.getBackground()!=null && !placement.getBackground().isEmpty()) {
            grid.add(new TextPrint(ShadowrunEditingTools.toFeatureName(placement, ScriptingPackage.Literals.PLACEMENT__BACKGROUND), headFontData));
            grid.add(new TextPrint(printString(placement.getBackground())));
            grid.add(new EmptyPrint(5, 25));
        }
        if (placement.getDebugging()!=null &&!placement.getDebugging().isEmpty()) {
            grid.add(new TextPrint(ShadowrunEditingTools.toFeatureName(placement, ScriptingPackage.Literals.PLACEMENT__DEBUGGING), headFontData));
            grid.add(new TextPrint(printString(placement.getDebugging())));
            grid.add(new EmptyPrint(5, 25));
        }
        for (Section sec : placement.getSections()) {
            grid.add(new TextPrint(sec.getTitel(), headFontData));
            grid.add(new TextPrint(printString(sec.getText())));
            grid.add(new EmptyPrint(5, 25));
        }

        EList<Placement> nextPlacements = placement.getNextPlacements();
        if (!nextPlacements.isEmpty()) {
            grid.add(new TextPrint(ShadowrunEditingTools.toFeatureName(placement, ScriptingPackage.Literals.PLACEMENT__NEXT_PLACEMENTS),
                    tableHeaderFontData));
            for (Placement placement2 : nextPlacements) {
                grid.add(new TextPrint(toSimpleName(placement2), attributeFont));
            }
            grid.add(new EmptyPrint(5, 5));
        }
        EList<Team> teams = placement.getTeams();
        if (!teams.isEmpty()) {
            grid.add(new TextPrint(ShadowrunEditingTools.toFeatureName(placement, ScriptingPackage.Literals.PLACEMENT__TEAMS), tableHeaderFontData));
            for (Team team : teams) {
                grid.add(new TextPrint(toSimpleName(team), attributeFont));
            }
        }
        grid.add(new EmptyPrint(5, 30));

        return grid;
    }

    private String formatDate(Date date) {
        if(date==null)
            return "";
        return SimpleDateFormat.getDateTimeInstance(SimpleDateFormat.SHORT, SimpleDateFormat.LONG).format(date);
    }

    private Print printTeamDetail(Team team) {
        DefaultGridLook look = new DefaultGridLook(0, 0);
        look.setHeaderGap(0);
        GridPrint grid = new GridPrint("d,d:g", look);//$NON-NLS-1$

        EList<RuntimeCharacter> members = team.getMembers();
        HashMap<ManagedCharacter, AtomicInteger> list = new HashMap<ManagedCharacter, AtomicInteger>();
        for (RuntimeCharacter runtimeCharacter : members) {
            ManagedCharacter character = runtimeCharacter.getCharacter();
            if (list.get(character) == null) {
                list.put(character, new AtomicInteger());
            }
            list.get(character).incrementAndGet();
        }
        for (ManagedCharacter managedCharacter : list.keySet()) {
            grid.add(printNpcSheet(managedCharacter, list.get(managedCharacter).intValue()));
        }

        return grid;
    }

    private Print printNpcSheet(ManagedCharacter managedCharacter, int intValue) {
        DefaultGridLook look = new DefaultGridLook(10, 0);
        look.setHeaderGap(0);
        GridPrint grid = new GridPrint("d,d:g,d,d,d:g", look);//$NON-NLS-1$

        int zustandKoerperlichMax = 8;
        AbstraktPersona persona = managedCharacter.getPersona();
        if (persona instanceof KoerperPersona) {
            KoerperPersona kp = (KoerperPersona)persona;
            zustandKoerperlichMax = kp.getZustandKoerperlichMax();
        }
        grid.add(printPersonaAttributes(persona), 2);
        for (int i = 0; i < intValue; i++) {
            grid.add(SWT.LEFT, SWT.TOP, printConditionMonitor(persona.getName() + ONE_SPACE + (i + 1), zustandKoerperlichMax));
        }
        grid.add(new EmptyPrint(), GridPrint.REMAINDER);
        grid.add(printPersonaWeaponsDetailList(managedCharacter), 5);
        grid.add(new LinePrint(SWT.HORIZONTAL), GridPrint.REMAINDER);

        DefaultGridLook look1 = new DefaultGridLook(5, 5);
        look.setHeaderGap(0);
        GridPrint grid1 = new GridPrint("d,d,d", look1);//$NON-NLS-1$

        grid1.add(printPersonaCombatAttributes(persona));
        grid1.add(printPersonaSkills(persona));
        grid1.add(printGegenstandList(managedCharacter.getInventar(), Messages.Printer_Items));
        grid.add(grid1, GridPrint.REMAINDER);

        return grid;
    }

    /**
     * @param script
     * @return
     */
    private Print printDescription(Beschreibbar script) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d:g,d", look);//$NON-NLS-1$

        GridPrint innerGrid = new GridPrint("d:g", look);//$NON-NLS-1$
        grid.add(innerGrid);

        Image imageScaledBy = AdapterFactoryUtil.getInstance().getImageScaledBy(BIG_SCALE, script.getImage());
        if (imageScaledBy != null) {
            grid.add(SWT.RIGHT, SWT.TOP, new ImagePrint(imageScaledBy.getImageData()));
        }
        // grid.add(new LinePrint(), GridPrint.REMAINDER);
        innerGrid.add(new TextPrint(toSimpleName(script), head1));
        innerGrid.add(new TextPrint(printString(script.getBeschreibung())), GridPrint.REMAINDER);

        return grid;
    }

}
