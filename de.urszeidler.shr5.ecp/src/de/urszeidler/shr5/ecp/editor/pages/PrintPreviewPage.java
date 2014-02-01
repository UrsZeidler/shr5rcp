package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.nebula.paperclips.core.PaperClips;
import org.eclipse.nebula.paperclips.core.Print;
import org.eclipse.nebula.paperclips.core.PrintJob;
import org.eclipse.nebula.paperclips.widgets.PrintPreview;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.printing.PrintDialog;
import org.eclipse.swt.printing.PrinterData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5Management.NonPlayerCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.shr5.ecp.printer.PersonaPrinter;
import de.urszeidler.shr5.ecp.printer.PersonaPrinter.PrintFactory;

/**
 * This a a shameless copy of
 * http://code.google.com/p/swt-paperclips/source/browse/net.sf.paperclips.examples/src/net/sf/paperclips/examples/Snippet7.java
 * only adapted for the FormEditor and multi use.
 * 
 * @author urs
 */
public class PrintPreviewPage extends FormPage {
    private Button previousPage;
    private Label pageNumber;
    private Button nextPage;

    private ScrolledComposite scroll;
    private PrintPreview preview;
    private double[] scrollingPosition;

    protected PrintJob printJob;
    private Display display;
    protected Shell shell;
    private PrintFactory print;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public PrintPreviewPage(String id, String title) {
        super(id, title);

        NonPlayerCharacter character = Shr5managementFactory.eINSTANCE.createNonPlayerCharacter();
        character.setPersona(Shr5Factory.eINSTANCE.createMudanPersona());
        //print = PersonaPrinter.getInstance().printCharacterSheet(character);

    }

    /**
     * Create the form page.
     * 
     * @param editor
     * @param id
     * @param title
     * @wbp.parser.constructor
     * @wbp.eval.method.parameter id "Some id"
     * @wbp.eval.method.parameter title "Some title"
     */
    public PrintPreviewPage(FormEditor editor, String id, String title) {
        super(editor, id, title);

        NonPlayerCharacter character = Shr5managementFactory.eINSTANCE.createNonPlayerCharacter();
        character.setPersona(Shr5Factory.eINSTANCE.createMudanPersona());
        //print = PersonaPrinter.getInstance().printCharacterSheet(character);
    }

    /**
     * Create the form page.
     * 
     * @param editor
     * @param id
     * @param title
     */
    public PrintPreviewPage(FormEditor editor, String id, String title, PrintFactory print) {
        super(editor, id, title);

        NonPlayerCharacter character = Shr5managementFactory.eINSTANCE.createNonPlayerCharacter();
        character.setPersona(Shr5Factory.eINSTANCE.createMudanPersona());
        this.print = print;
    }

    /**
     * Create contents of the form.
     * 
     * @param managedForm
     */
    @Override
    protected void createFormContent(IManagedForm managedForm) {
        FormToolkit toolkit = managedForm.getToolkit();
        ScrolledForm form = managedForm.getForm();
        form.setText("Empty FormPage");
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        display = Display.getCurrent();
        shell = display.getActiveShell();

        createButtonPanel(body).setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        createScrollingPreview(body).setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        updateJob();
    }

    protected void updateJob() {
        printJob = new PrintJob("Default Print job", print.createPrinter());
        preview.setPrintJob(printJob);
        forgetScrollingPosition();
        updatePreviewSize();
        updatePageNumber();
    }

    private Control createButtonPanel(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);

        GridLayout layout = new GridLayout(17, false);
        layout.marginWidth = layout.marginHeight = 0;
        composite.setLayout(layout);

        createTextButton(composite, "refresh", "Portrait Orientation", new Listener() {
            public void handleEvent(Event event) {
                updateJob();
//                forgetScrollingPosition();
//                updatePreviewSize();
//                updatePageNumber();
            }
        });

        
        previousPage = createIconButton(composite, "backward_nav.gif", "Previous Page", new Listener() {
            public void handleEvent(Event event) {
                setPreviewPageIndex(preview.getPageIndex() - preview.getHorizontalPageCount() * preview.getVerticalPageCount());
            }
        });

        pageNumber = new Label(composite, SWT.NONE);

        nextPage = createIconButton(composite, "forward_nav.gif", "Next Page", new Listener() {
            public void handleEvent(Event event) {
                setPreviewPageIndex(preview.getPageIndex() + preview.getHorizontalPageCount() * preview.getVerticalPageCount());
            }
        });

        createIconButton(composite, "fit_horizontal.gif", "Fit Width", new Listener() {
            public void handleEvent(Event event) {
                preview.setFitHorizontal(true);
                preview.setFitVertical(false);
                rememberScrollingPosition();
                updatePreviewSize();
                restoreScrollingPosition();
            }
        });

        createIconButton(composite, "fit_vertical.gif", "Fit Height", new Listener() {
            public void handleEvent(Event event) {
                preview.setFitVertical(true);
                preview.setFitHorizontal(false);
                rememberScrollingPosition();
                updatePreviewSize();
                restoreScrollingPosition();
            }
        });

        createIconButton(composite, "fit_best.gif", "Fit Window", new Listener() {
            public void handleEvent(Event event) {
                preview.setFitVertical(true);
                preview.setFitHorizontal(true);
                rememberScrollingPosition();
                updatePreviewSize();
                restoreScrollingPosition();
            }
        });

        createIconButton(composite, "zoom_in.gif", "Zoom In", new Listener() {
            public void handleEvent(Event event) {
                setPreviewScale(preview.getAbsoluteScale() * 1.1f);
            }
        });

        createIconButton(composite, "zoom_out.gif", "Zoom Out", new Listener() {
            public void handleEvent(Event event) {
                setPreviewScale(preview.getAbsoluteScale() / 1.1f);
            }
        });

        createIconButton(composite, "zoom_scale.gif", "Zoom to Scale", new Listener() {
            public void handleEvent(Event event) {
                setPreviewScale(1);
            }
        });

        createTextButton(composite, "Port", "Portrait Orientation", new Listener() {
            public void handleEvent(Event event) {
                printJob.setOrientation(PaperClips.ORIENTATION_PORTRAIT);
                preview.setPrintJob(printJob);

                forgetScrollingPosition();
                updatePreviewSize();
                updatePageNumber();
            }
        });

        createTextButton(composite, "Land", "Landscape Orientation", new Listener() {
            public void handleEvent(Event event) {
                printJob.setOrientation(PaperClips.ORIENTATION_LANDSCAPE);
                preview.setPrintJob(printJob);

                forgetScrollingPosition();
                updatePreviewSize();
                updatePageNumber();
            }
        });

        createIconButton(composite, "print_edit.gif", "Print", new Listener() {
            public void handleEvent(Event event) {
                PrintDialog dialog = new PrintDialog(shell, SWT.NONE);
                PrinterData printerData = dialog.open();
                if (printerData != null) {
                    PaperClips.print(printJob, printerData);
                    preview.setPrinterData(printerData);
                }
            }
        });

        createLabel(composite, "Horz Pages");
        createPageCountSpinner(composite, new Listener() {
            public void handleEvent(Event event) {
                preview.setHorizontalPageCount(((Spinner)event.widget).getSelection());
                forgetScrollingPosition();
                updatePreviewSize();
                updatePageNumber();
            }
        });

        createLabel(composite, "Vert Pages");
        createPageCountSpinner(composite, new Listener() {
            public void handleEvent(Event event) {
                preview.setVerticalPageCount(((Spinner)event.widget).getSelection());
                forgetScrollingPosition();
                updatePreviewSize();
                updatePageNumber();
            }
        });

        return composite;
    }

    private Control createScrollingPreview(Composite parent) {
        scroll = new ScrolledComposite(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
        scroll.setExpandHorizontal(true);
        scroll.setExpandVertical(true);

        preview = new PrintPreview(scroll, SWT.NONE);
        scroll.setContent(preview);

        scroll.addListener(SWT.Resize, new Listener() {
            public void handleEvent(Event event) {
                Rectangle bounds = scroll.getClientArea();

                scroll.getHorizontalBar().setPageIncrement(bounds.width * 2 / 3);
                scroll.getVerticalBar().setPageIncrement(bounds.height * 2 / 3);

                if (preview.isFitHorizontal() ^ preview.isFitVertical()) {
                    rememberScrollingPosition();
                    updatePreviewSize();
                    restoreScrollingPosition();
                }
            }
        });

        preview.setFitVertical(true);
        preview.setFitHorizontal(true);

        Listener dragListener = new Listener() {
            private final Point dpi = display.getDPI();
            private boolean scrollable = false;

            private boolean dragging = false;
            private Point dragStartScrollOrigin = null;
            private Point dragStartMouseAnchor = null;

            public void handleEvent(Event event) {
                switch (event.type) {
                    case SWT.Resize:
                        forgetScrollingPosition();
                        Rectangle bounds = scroll.getClientArea();
                        Point size = preview.getSize();
                        scrollable = size.x > bounds.width || size.y > bounds.height;
                        if (!scrollable && dragging)
                            endDragging();
                        break;
                    case SWT.MouseDown:
                        forgetScrollingPosition();
                        if (scrollable && event.button == 1)
                            beginDragging(event);
                        break;
                    case SWT.MouseMove:
                        if (dragging) {
                            forgetScrollingPosition();
                            Point point = preview.toDisplay(event.x, event.y);
                            scroll.setOrigin(dragStartScrollOrigin.x + dragStartMouseAnchor.x - point.x, dragStartScrollOrigin.y
                                    + dragStartMouseAnchor.y - point.y);
                        }
                        break;
                    case SWT.MouseUp:
                        forgetScrollingPosition();
                        if (dragging)
                            endDragging();
                        break;
                    case SWT.MouseEnter:
                        display.addFilter(SWT.MouseWheel, this);
                        break;
                    case SWT.MouseWheel:
                        if (event.count != 0) {
                            if (scrollable && !dragging && (event.stateMask == SWT.NONE || event.stateMask == SWT.SHIFT)) {
                                forgetScrollingPosition();
                                bounds = scroll.getClientArea();
                                size = preview.getSize();
                                Point origin = scroll.getOrigin();
                                int direction = event.count > 0 ? -1 : 1;
                                // Prefer vertical scrolling unless user is
                                // pressing Shift
                                if (size.y > bounds.height && event.stateMask == SWT.NONE)
                                    origin.y += direction * Math.min(dpi.y, bounds.height / 4);
                                else if (size.x > bounds.width)
                                    origin.x += direction * Math.min(dpi.x, bounds.width / 4);
                                scroll.setOrigin(origin);
                                event.doit = false;
                            } else if (event.stateMask == SWT.CTRL) { // Ctrl+MouseWheel
                                // ->
                                // zoom
                                float scale = preview.getAbsoluteScale();
                                setPreviewScale(event.count > 0 ? scale / 1.1f : scale * 1.1f);
                            }
                        }
                        break;
                    case SWT.MouseExit:
                        display.removeFilter(SWT.MouseWheel, this);
                        break;
                }
            }

            private void beginDragging(Event event) {
                dragStartScrollOrigin = scroll.getOrigin();
                dragStartMouseAnchor = preview.toDisplay(event.x, event.y);
                dragging = true;
            }

            private void endDragging() {
                dragging = false;
                dragStartMouseAnchor = null;
                dragStartScrollOrigin = null;
            }
        };

        scroll.addListener(SWT.Resize, dragListener);
        preview.addListener(SWT.MouseDown, dragListener);
        preview.addListener(SWT.MouseMove, dragListener);
        preview.addListener(SWT.MouseUp, dragListener);

        // These are for mouse wheel handling
        preview.addListener(SWT.MouseEnter, dragListener);
        preview.addListener(SWT.MouseExit, dragListener);

        return scroll;
    }

    private Button createIconButton(Composite parent, String imageFilename, String toolTipText, Listener selectionListener) {
        Button button = createButton(parent, toolTipText, selectionListener);
        button.setImage(createImage(imageFilename));
        return button;
    }

    private Button createTextButton(Composite parent, String text, String toolTipText, Listener selectionListener) {
        Button button = createButton(parent, toolTipText, selectionListener);
        button.setText(text);
        return button;
    }

    private Button createButton(Composite parent, String toolTipText, Listener selectionListener) {
        Button button = new Button(parent, SWT.PUSH);
        button.setToolTipText(toolTipText);
        button.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
        button.addListener(SWT.Selection, selectionListener);
        return button;
    }

    private Spinner createPageCountSpinner(Composite parent, Listener selectionListener) {
        Spinner spinner = new Spinner(parent, SWT.BORDER);
        spinner.setMinimum(1);
        spinner.setMaximum(99);
        spinner.addListener(SWT.Selection, selectionListener);
        return spinner;
    }

    private void createLabel(Composite parent, String text) {
        new Label(parent, SWT.NONE).setText(text);
    }

    private Image createImage(String filename) {
        final Image image = ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/" + filename);

        return image;
    }

    private void updatePageNumber() {
        int pageIndex = preview.getPageIndex();
        int pageCount = preview.getPageCount();
        int visiblePageCount = preview.getHorizontalPageCount() * preview.getVerticalPageCount();
        String text = (visiblePageCount > 1 ? "Pages " + (pageIndex + 1) + "-" + Math.min(pageCount, pageIndex + visiblePageCount) : "Page "
                + (pageIndex + 1))
                + " of " + pageCount;
        pageNumber.setText(text);
        previousPage.setEnabled(pageIndex > 0);
        nextPage.setEnabled(pageIndex < pageCount - visiblePageCount);
        shell.layout(new Control[]{ pageNumber });
    }

    private void rememberScrollingPosition() {
        Point size = preview.getSize();
        if (size.x == 0 || size.y == 0) {
            forgetScrollingPosition();
        } else if (scrollingPosition == null) {
            Point origin = scroll.getOrigin();
            scrollingPosition = new double[]{ (double)origin.x / (double)size.x, (double)origin.y / (double)size.y };
        }
    }

    private void forgetScrollingPosition() {
        scrollingPosition = null;
    }

    private void restoreScrollingPosition() {
        if (scrollingPosition != null) {
            Point size = preview.getSize();
            scroll.setOrigin((int)Math.round(scrollingPosition[0] * size.x), (int)Math.round(scrollingPosition[1] * size.y));
        }
    }

    private void updatePreviewSize() {
        Point minSize;
        Rectangle bounds = scroll.getClientArea();
        if (preview.isFitHorizontal()) {
            if (preview.isFitVertical())
                minSize = new Point(0, 0); // Best fit
            else
                minSize = new Point(0, preview.computeSize(bounds.width, SWT.DEFAULT).y); // Fit to width
        } else {
            if (preview.isFitVertical())
                minSize = new Point(preview.computeSize(SWT.DEFAULT, bounds.height).x, 0); // Fit to height
            else
                minSize = preview.computeSize(SWT.DEFAULT, SWT.DEFAULT); // Custom
            // scale
        }
        scroll.setMinSize(minSize);
    }

    private void setPreviewScale(float scale) {
        preview.setFitVertical(false);
        preview.setFitHorizontal(false);
        preview.setScale(scale);
        rememberScrollingPosition();
        updatePreviewSize();
        restoreScrollingPosition();
    }

    private void setPreviewPageIndex(int pageIndex) {
        preview.setPageIndex(Math.max(Math.min(pageIndex, preview.getPageCount() - 1), 0));
        updatePageNumber();
    }

}
