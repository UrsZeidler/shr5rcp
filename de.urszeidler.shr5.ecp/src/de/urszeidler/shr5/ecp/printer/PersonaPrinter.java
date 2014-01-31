/**
 * 
 */
package de.urszeidler.shr5.ecp.printer;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.nebula.paperclips.core.LinePrint;
import org.eclipse.nebula.paperclips.core.Print;
import org.eclipse.nebula.paperclips.core.grid.DefaultGridLook;
import org.eclipse.nebula.paperclips.core.grid.GridPrint;
import org.eclipse.nebula.paperclips.core.text.TextPrint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Shr5Package;
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
     * Print the character sheet.
     * 
     * @param character
     * @return
     */
    public Print printCharacterSheet(ManagedCharacter character) {
        AbstraktPersona persona = character.getPersona();

        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d,d,d,d,d", look);

        Print verticalRule = new LinePrint(SWT.VERTICAL);
        Print horizontalRule = new LinePrint(SWT.HORIZONTAL);

        grid.add(SWT.DEFAULT, SWT.FILL, verticalRule, 1);
        grid.add(SWT.LEFT, SWT.DEFAULT, printPersonaData(character), 2);

        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(""), 1);
        grid.add(SWT.DEFAULT, SWT.FILL, verticalRule, 1);
        grid.add(SWT.LEFT, SWT.FILL, horizontalRule, 5);
        // grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(""), 1);

        grid.add(SWT.DEFAULT, SWT.FILL, verticalRule, 1);
        grid.add(SWT.LEFT, SWT.DEFAULT, printPersonaAttributes(persona), 1);
        grid.add(SWT.DEFAULT, SWT.FILL, horizontalRule, 1);
        grid.add(SWT.LEFT, SWT.DEFAULT, printAllPersonaSkills(persona), 1);
        grid.add(SWT.DEFAULT, SWT.FILL, verticalRule);

        grid.add(SWT.DEFAULT, SWT.FILL, verticalRule, 1);
        grid.add(SWT.LEFT, SWT.DEFAULT, printAllCharacterConnections(character), 2);

        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(""), 1);
        grid.add(SWT.DEFAULT, SWT.FILL, verticalRule, 1);
        grid.add(SWT.LEFT, SWT.FILL, horizontalRule, 5);

        return grid;
    }

    /**
     * Prints all skills usable from the persona.
     * 
     * @param persona
     * @return
     */
    private Print printAllCharacterConnections(ManagedCharacter character) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d,d,d,d,d", look);

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
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(itemDelegator.getText(fertigkeit), attributeFont), 3);
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
    private Print printPersonaAttributes(AbstraktPersona persona) {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d,d,d,r:d", look);

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(""));
        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("Attribute", boldFontData), 3);

        printeAttributes(persona, grid, Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE.getEAttributes());
        printeAttributes(persona, grid, Shr5Package.Literals.GEISTIGE_ATTRIBUTE.getEAttributes());
        printeAttributes(persona, grid, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE.getEAttributes());

        return grid;
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

        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("Name", attributeFont));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(persona.getName() + "", attributeFont), 5);

        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("Meta", attributeFont));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(itemDelegator.getText(persona.getSpezies()), attributeFont), 2);
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("Ethnie", attributeFont));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(itemDelegator.getText(persona.getSpezies()), attributeFont), 2);

        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("Streecred", attributeFont));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(character.getStreetCred() + "", attributeFont), 1);
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("Notoriety", attributeFont));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(character.getNotoriety() + "", attributeFont), 1);
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("Prom", attributeFont));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(character.getPublicAwareness() + "", attributeFont), 1);

        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("Karma", attributeFont));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("0", attributeFont), 1);
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("Karma Total", attributeFont));
        grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(character.getKarmaGaint() + "", attributeFont), 1);

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
