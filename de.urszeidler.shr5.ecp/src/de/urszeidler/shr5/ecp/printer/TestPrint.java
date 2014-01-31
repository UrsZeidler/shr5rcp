package de.urszeidler.shr5.ecp.printer;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.nebula.paperclips.core.LinePrint;
import org.eclipse.nebula.paperclips.core.PaperClips;
import org.eclipse.nebula.paperclips.core.Print;
import org.eclipse.nebula.paperclips.core.PrintJob;
import org.eclipse.nebula.paperclips.core.grid.DefaultGridLook;
import org.eclipse.nebula.paperclips.core.grid.GridPrint;
import org.eclipse.nebula.paperclips.core.text.TextPrint;
import org.eclipse.nebula.paperclips.widgets.PrintPreview;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.printing.Printer;
import org.eclipse.swt.printing.PrinterData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.SWTResourceManager;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaFertigkeitenWidget;
import de.urszeidler.shr5.ecp.editor.widgets.PersonaFertigkeitenWidget.GroupWrapper;

import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.graphics.Point;

public class TestPrint extends Composite {

    private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
    private Print document;
    private final ManagedCharacter character;// = Shr5managementFactory.eINSTANCE.createNonPlayerCharacter();
    private FontData boldFontData;
    private FontData attributeFont;
    private AbstraktPersona persona;
    private AdapterFactoryItemDelegator itemDelegator;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public TestPrint(Composite parent, int style) {
        super(parent, style);
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);

        character = Shr5managementFactory.eINSTANCE.createNonPlayerCharacter();
        character.setPersona(Shr5Factory.eINSTANCE.createMudanPersona());
        createWidgets();
    }

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public TestPrint(Composite parent, int style, ManagedCharacter character) {
        super(parent, style);
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);

        this.character = character;
        createWidgets();
    }

    protected void createWidgets() {
        createFonts();

        Composite shell = this;

        document = createCharacterPrint();
        final PrintJob job = new PrintJob("GridPrintVerticalAlignmentExample.java", document);
        shell.setLayout(new org.eclipse.swt.layout.GridLayout());

        Composite buttonPanel = new Composite(shell, SWT.NONE);
        buttonPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        buttonPanel.setLayout(new RowLayout(SWT.HORIZONTAL));

        ScrolledComposite scrolledComposite = new ScrolledComposite(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
        GridData gd_scrolledComposite = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);

        scrolledComposite.setLayoutData(gd_scrolledComposite);
        toolkit.adapt(scrolledComposite);
        toolkit.paintBordersFor(scrolledComposite);
        scrolledComposite.setExpandHorizontal(true);
        scrolledComposite.setExpandVertical(true);

        final PrintPreview preview = new PrintPreview(scrolledComposite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);

        preview.setLayout(new GridLayout(1, false));

        preview.setScale(0.5f);
        preview.setPageSpacing(new Point(5, 5));
        preview.setFitHorizontal(true);
        preview.setFitVertical(true);
        // preview.setPrinterData(Printer.getDefaultPrinterData());
        preview.setPrintJob(job);
        scrolledComposite.setContent(preview);
        scrolledComposite.setMinSize(preview.computeSize(SWT.DEFAULT, SWT.DEFAULT));

        Button prev = new Button(buttonPanel, SWT.PUSH);
        prev.setText("<< Prev");
        prev.addListener(SWT.Selection, new Listener() {
            public void handleEvent(Event event) {
                preview.setPageIndex(Math.max(preview.getPageIndex() - 1, 0));
            }
        });

        Button next = new Button(buttonPanel, SWT.PUSH);
        next.setText("Next >>");
        next.addListener(SWT.Selection, new Listener() {
            public void handleEvent(Event event) {
                preview.setPageIndex(Math.min(preview.getPageIndex() + 1, preview.getPageCount() - 1));
            }
        });

        Button print = new Button(buttonPanel, SWT.PUSH);
        print.setText("Print");
        print.addListener(SWT.Selection, new Listener() {
            public void handleEvent(Event event) {
                PrinterData[] list = Printer.getPrinterList();

                PaperClips.print(job, list[0]);
            }
        });
        PrinterData printerData;

    }

    private void createFonts() {

        FontData[] defaultFont = JFaceResources.getDefaultFont().getFontData();
        boldFontData = new FontData(defaultFont[0].getName(), defaultFont[0].getHeight(), SWT.BOLD);
        attributeFont = new FontData(defaultFont[0].getName(), defaultFont[0].getHeight() - 2, defaultFont[0].getStyle());

        persona = character.getPersona();
        itemDelegator = AdapterFactoryUtil.getInstance().getItemDelegator();
    }

    public Print createCharacterPrint() {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d,d,d,d,d", look);

        Print verticalRule = new LinePrint(SWT.VERTICAL);
        Print horizontalRule = new LinePrint(SWT.HORIZONTAL);
        grid.add(SWT.LEFT, SWT.DEFAULT, createPersonaDataPrint(), 5);

        // grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(""), 1);
        // grid.add(SWT.LEFT, SWT.FILL, horizontalRule, 4);
        // grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(""), 1);

        grid.add(SWT.DEFAULT, SWT.FILL, verticalRule, 5);
        grid.add(SWT.LEFT, SWT.DEFAULT, createAttributePrint(), 5);
        grid.add(SWT.DEFAULT, SWT.FILL, verticalRule, 5);
        grid.add(SWT.LEFT, SWT.DEFAULT, createPersonaFertigkeitenPrint(), 5);
        grid.add(SWT.DEFAULT, SWT.FILL, verticalRule);

        return grid;
    }

    private Print createPersonaFertigkeitenPrint() {
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
                printFertigkeitList(grid, fertigkeiten);
            } else if (object instanceof GroupWrapper) {
                GroupWrapper gw = (GroupWrapper)object;
                grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(gw.getName(), attributeFont), 4);
                grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint("", attributeFont), 1);
                List<Fertigkeit> fertigkeiten = gw.getEntries();
                printFertigkeitList(grid, fertigkeiten);
            }
        }

        return grid;
    }

    protected void printFertigkeitList(GridPrint grid, List<Fertigkeit> fertigkeiten) {
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

    public Print createPersonaDataPrint() {
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

    public Print createAttributePrint() {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d,d,d,r:d", look);

        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(""));
        grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint("Attribute", boldFontData), 3);

        printeAttributes(persona, itemDelegator, grid, Shr5Package.Literals.KOERPERLICHE_ATTRIBUTE.getEAttributes());
        printeAttributes(persona, itemDelegator, grid, Shr5Package.Literals.GEISTIGE_ATTRIBUTE.getEAttributes());
        printeAttributes(persona, itemDelegator, grid, Shr5Package.Literals.SPEZIELLE_ATTRIBUTE.getEAttributes());

        return grid;
    }

    private void printeAttributes(AbstraktPersona persona, AdapterFactoryItemDelegator itemDelegator, GridPrint grid, EList<EAttribute> eAttributes) {
        for (EAttribute eAttribute : eAttributes) {
            String attName = itemDelegator.getText(eAttribute);
            Object value = persona.eGet(eAttribute);
            grid.add(SWT.LEFT, SWT.DEFAULT, new TextPrint(attName, attributeFont), 3);
            grid.add(SWT.RIGHT, SWT.DEFAULT, new TextPrint(value.toString(), attributeFont), 1);
        }
    }

    private Print createPrint() {
        DefaultGridLook look = new DefaultGridLook(5, 5);
        look.setHeaderGap(5);
        GridPrint grid = new GridPrint("d:g, d, d:g, d, d:g, d, d:g", look);

        // ImageData imageData = new ImageData(
        // PaperclipsExampleTab.class
        // .getResourceAsStream("logo.png"));
        // ImagePrint image = new ImagePrint(imageData);
        // image.setDPI(300, 300);

        Print verticalRule = new LinePrint(SWT.VERTICAL);

        grid.addHeader(SWT.CENTER, SWT.DEFAULT, new TextPrint("Column 1"));
        grid.addHeader(SWT.DEFAULT, SWT.FILL, verticalRule);
        grid.addHeader(SWT.CENTER, SWT.DEFAULT, new TextPrint("Column 2"));
        grid.addHeader(SWT.DEFAULT, SWT.FILL, verticalRule);
        grid.addHeader(SWT.CENTER, SWT.DEFAULT, new TextPrint("Column 3"));
        grid.addHeader(SWT.DEFAULT, SWT.FILL, verticalRule);
        grid.addHeader(SWT.CENTER, SWT.DEFAULT, new TextPrint("Column 4"));

        grid.addHeader(new LinePrint(SWT.HORIZONTAL), GridPrint.REMAINDER);

        // grid.add(SWT.LEFT, SWT.CENTER, image);
        grid.add(SWT.DEFAULT, SWT.FILL, verticalRule);
        grid.add(SWT.DEFAULT, SWT.DEFAULT, new TextPrint("triple\nline\nleft\n"));
        grid.add(SWT.DEFAULT, SWT.FILL, verticalRule);
        grid.add(SWT.CENTER, SWT.CENTER, new TextPrint("double line\ncenter", SWT.CENTER));
        grid.add(SWT.DEFAULT, SWT.FILL, verticalRule);
        grid.add(SWT.RIGHT, SWT.BOTTOM, new TextPrint("single line right"));

        grid.add(new LinePrint(SWT.HORIZONTAL), GridPrint.REMAINDER);

        grid.add(SWT.CENTER, SWT.CENTER, new TextPrint("several\nlines\nof\ntext\nhere", SWT.CENTER));
        grid.add(SWT.DEFAULT, SWT.FILL, verticalRule);
        grid.add(SWT.LEFT, SWT.FILL, verticalRule);
        grid.add(SWT.DEFAULT, SWT.FILL, verticalRule);
        grid.add(SWT.CENTER, SWT.FILL, verticalRule);
        grid.add(SWT.DEFAULT, SWT.FILL, verticalRule);
        grid.add(SWT.RIGHT, SWT.FILL, verticalRule);

        return grid;
    }

}
