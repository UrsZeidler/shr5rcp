package de.urszeidler.shr5.ecp.views;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.pdfbox.exceptions.CryptographyException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.ResourceManager;

import com.google.common.base.Joiner;

import de.urszeidler.commons.Duo;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Quelle;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.preferences.PreferenceConstants;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

public class SourceBookView extends ViewPart implements ISelectionListener {
    private DataBindingContext m_bindingContext;

    public static final String ID = "de.urszeidler.shr5.ecp.views.SourceBookView"; //$NON-NLS-1$
    private Composite container;
    private Quelle internalQuelle = Shr5Factory.eINSTANCE.createAutoSoft();
    private Quelle selection = Shr5Factory.eINSTANCE.createAutoSoft();
    private WritableValue displayedText = new WritableValue("", String.class);
    private Map<String, String> pageMap = new HashMap<String, String>();
    private Map<File, PDDocument> bookMap = new HashMap<File, PDDocument>();
    private StyledText styledText;
    private Label lblImage;
    private Label lblName;
    private Action nextAction;
    private Action prevAction;
    private Action gotoPageAction;

    public SourceBookView() {
    }

    @Override
    public void init(IViewSite site) throws PartInitException {
        site.getPage().addSelectionListener(this);
        super.init(site);
    }

    /**
     * Create contents of the view part.
     * 
     * @param parent
     */
    @Override
    public void createPartControl(Composite parent) {

        container = new Composite(parent, SWT.NONE);
        container.setLayout(new GridLayout(1, false));

        Composite composite = new Composite(container, SWT.NONE);
        composite.setLayout(new GridLayout(2, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

        lblImage = new Label(composite, SWT.NONE);
        GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
        layoutData.widthHint = 16;
        lblImage.setLayoutData(layoutData);
        lblImage.setText("");

        lblName = new Label(composite, SWT.NONE);
        GridData gd_lblName = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
        gd_lblName.widthHint = 168;
        lblName.setLayoutData(gd_lblName);
        lblName.setText("name");

        styledText = new StyledText(container, SWT.V_SCROLL | SWT.BORDER | SWT.READ_ONLY | SWT.WRAP);
        styledText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

        // emfFormBuilder.setNullString(Messages.EmfFormbuilder_non_selected);
        // emfFormBuilder.setBorderStyle(SWT.NONE);
        // emfFormBuilder.setDblListner(this);

        // ScrolledComposite scrolledComposite = new ScrolledComposite(container, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
        // scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        // scrolledComposite.setExpandHorizontal(true);
        // scrolledComposite.setExpandVertical(true);

        // canvas = new Canvas (container, SWT.NO_BACKGROUND |
        // SWT.NO_REDRAW_RESIZE | SWT.V_SCROLL | SWT.H_SCROLL);
        // final ScrollBar hBar = canvas.getHorizontalBar ();
        // canvas.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
        // hBar.addListener (SWT.Selection, new Listener () {
        // @Override
        // public void handleEvent (Event e) {
        // int hSelection = hBar.getSelection ();
        // int destX = -hSelection - origin.x;
        // Rectangle rect = image.getBounds();
        // canvas.scroll (destX, 0, 0, 0, rect.width, rect.height, false);
        // origin.x = -hSelection;
        // }
        // });
        // final ScrollBar vBar = canvas.getVerticalBar ();
        // vBar.addListener (SWT.Selection, new Listener () {
        // @Override
        // public void handleEvent (Event e) {
        // int vSelection = vBar.getSelection ();
        // int destY = -vSelection - origin.y;
        // Rectangle rect = image.getBounds ();
        // canvas.scroll (0, destY, 0, 0, rect.width, rect.height, false);
        // origin.y = -vSelection;
        // }
        // });
        // canvas.addListener (SWT.Resize, new Listener () {
        // @Override
        // public void handleEvent (Event e) {
        // Rectangle rect = image.getBounds ();
        // Rectangle client = canvas.getClientArea ();
        // hBar.setMaximum (rect.width);
        // vBar.setMaximum (rect.height);
        // hBar.setThumb (Math.min (rect.width, client.width));
        // vBar.setThumb (Math.min (rect.height, client.height));
        // int hPage = rect.width - client.width;
        // int vPage = rect.height - client.height;
        // int hSelection = hBar.getSelection ();
        // int vSelection = vBar.getSelection ();
        // if (hSelection >= hPage) {
        // if (hPage <= 0) hSelection = 0;
        // origin.x = -hSelection;
        // }
        // if (vSelection >= vPage) {
        // if (vPage <= 0) vSelection = 0;
        // origin.y = -vSelection;
        // }
        // canvas.redraw ();
        // }
        // });
        // canvas.addListener (SWT.Paint, new Listener () {
        // @Override
        // public void handleEvent (Event e) {
        // GC gc = e.gc;
        // gc.drawImage (image, origin.x, origin.y);
        // Rectangle rect = image.getBounds ();
        // Rectangle client = canvas.getClientArea ();
        // int marginWidth = client.width - rect.width;
        // if (marginWidth > 0) {
        // gc.fillRectangle (rect.width, 0, marginWidth, client.height);
        // }
        // int marginHeight = client.height - rect.height;
        // if (marginHeight > 0) {
        // gc.fillRectangle (0, rect.height, client.width, marginHeight);
        // }
        // }
        // });
        //
        //
        //

        createActions();
        initializeToolBar();
        initializeMenu();
        m_bindingContext = initDataBindings();

    }

    /**
     * Create the actions.
     */
    private void createActions() {
        // Create the actions
        {
            nextAction = new Action() {
                @Override
                public void run() {
                    try {
                        internalQuelle.setSrcBook(selection.getSrcBook());
                        internalQuelle.setPage(Integer.toString(Integer.parseInt(selection.getPage()) + 1));
                        setQuelle(internalQuelle);
                    } catch (Exception e) {
                    }
                }
            };
            nextAction.setToolTipText("go to the next page");
            nextAction.setImageDescriptor(ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/rightarrow.gif"));
        }
        {
            prevAction = new Action() {
                @Override
                public void run() {
                    try {
                        internalQuelle.setSrcBook(selection.getSrcBook());
                        internalQuelle.setPage(Integer.toString(Integer.parseInt(selection.getPage()) - 1));
                        setQuelle(internalQuelle);
                    } catch (Exception e) {
                    }
                }
            };
            prevAction.setToolTipText("one page back");
            prevAction.setImageDescriptor(ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/leftarrow.gif"));
            prevAction.setDescription("");
        }
        {
            gotoPageAction = new Action("") {
                @Override
                public void run() {
                    try {
                        internalQuelle.setSrcBook(selection.getSrcBook());
                        int pageNumber = Integer.parseInt(selection.getPage());
                        InputDialog inputDialog = new InputDialog(getSite().getShell(), "Jump to page", "Jump to page number.", Integer.toString(pageNumber), null);
                        if(inputDialog.open()==org.eclipse.jface.dialogs.Dialog.CANCEL)
                            return;
                        pageNumber = Integer.parseInt(inputDialog.getValue());
                        internalQuelle.setPage(Integer.toString(pageNumber));
                        setQuelle(internalQuelle);
                    } catch (Exception e) {
                    }
                }
                
            };
            gotoPageAction.setToolTipText("jump to page");
            gotoPageAction.setImageDescriptor(ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/doc_tab.gif"));
        }
    }

    /**
     * Initialize the toolbar.
     */
    private void initializeToolBar() {
        IToolBarManager toolbarManager = getViewSite().getActionBars().getToolBarManager();
        toolbarManager.add(prevAction);
        toolbarManager.add(nextAction);
        toolbarManager.add(gotoPageAction);
    }

    /**
     * Initialize the menu.
     */
    private void initializeMenu() {
        IMenuManager menuManager = getViewSite().getActionBars().getMenuManager();
    }

    @Override
    public void setFocus() {
        // Set the focus
    }

    @Override
    public void selectionChanged(IWorkbenchPart part, ISelection selection) {
        if (selection instanceof StructuredSelection) {
            StructuredSelection ss = (StructuredSelection)selection;
            Object firstElement = ss.getFirstElement();
            if (firstElement instanceof Quelle) {
                final Quelle q = (Quelle)firstElement;
                setQuelle(q);
            }
        }

    }

    /**
     * @param src
     */
    private void setQuelle(final Quelle src) {
        SourceBook srcBook = src.getSrcBook();
        if (srcBook == null)
            return;

        selection = src;
        Image image = AdapterFactoryUtil.getInstance().getLabelProvider().getImage(srcBook);
        lblImage.setImage(image);
        lblName.setText(String.format("%s page %s", AdapterFactoryUtil.getInstance().getLabelProvider().getText(srcBook), src.getPage()));

        final File file = getFileFromPreferences(srcBook);//
        if (file == null) {
            displayedText.setValue("");
            return;
        }

        final String key = src.getSrcBook().getName() + src.getPage();
        String text = pageMap.get(key);
        if (text == null) {
            Job job = new Job("get page text " + key) {
                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    try {
                        PDDocument pdDocument = getpdfDoc(file, monitor);
                        if (pdDocument == null)
                            return Status.OK_STATUS;
                        final String text1 = getTextFromPage(src, pdDocument);
                        pageMap.put(key, text1);
                        Display.getDefault().asyncExec(new Runnable() {
                            @Override
                            public void run() {
                                displayedText.setValue(text1);
                                processText(text1, src);
                            }
                        });
                    } catch (IOException e) {
                        Activator.logError(e);
                    }
                    return Status.OK_STATUS;
                }
            };
            job.setUser(false);
            job.schedule();
        } else {
            displayedText.setValue(text);
            processText(text, src);
        }
    }

    private void processText(String text, Quelle q) {
        if (q instanceof Beschreibbar) {
            Beschreibbar b = (Beschreibbar)q;
            String name = b.getName();
            if (name == null || name.isEmpty())
                return;
            String lowerCase = text.toLowerCase();

            Duo<Integer, Integer> match = findNearesMatch(name, lowerCase);
            int indexOf = match.getObjectA();
            if (indexOf == -1)
                return;

            String substring = lowerCase.substring(0, indexOf);
            String[] split = substring.split("\n");

            StyleRange styleRange = new StyleRange();
            styleRange.start = indexOf;
            styleRange.length = match.getObjectB();
            styleRange.fontStyle = SWT.BOLD;
            styleRange.background = ColorConstants.lightGray;

            styledText.setStyleRange(styleRange);
            if(substring.isEmpty())
                styledText.setTopIndex(0);
            else
                styledText.setTopIndex(split.length);
            styledText.setSelection(indexOf, indexOf+ match.getObjectB());
            styledText.showSelection();
        }
    }

    /**
     * @param name
     * @param lowerCase
     * @return {@link Duo} where a is the index and b is the length
     */
    private Duo<Integer, Integer> findNearesMatch(String name, String lowerCase) {
        int indexOf = findByName(name, lowerCase);
        if (indexOf == -1) {
            String[] split = name.split(" ");
            if (split.length == 2) {
                indexOf = findByName(split[0], lowerCase);
                if (indexOf == -1)
                    return new Duo<Integer, Integer>(findByName(split[1], lowerCase), split[0].length());
                else
                    return new Duo<Integer, Integer>(indexOf, split[0].length());
            } else if (split.length < 2)
                return  new Duo<Integer, Integer>(-1, split[0].length());

            for (int i = split.length - 1; i > 0; i--) {
                String searchstring = Joiner.on(" ").join(Arrays.copyOfRange(split, 0, i));
                indexOf = findByName(searchstring, lowerCase);
                if (indexOf != -1)
                    return new Duo<Integer, Integer>(indexOf, searchstring.length());
            }
        }
        return new Duo<Integer, Integer>(indexOf, name.length());
    }

    /**
     * @param name
     * @param lowerCase
     * @return
     */
    private int findByName(String name, String lowerCase) {
        if (name.length() < 3)
            return -1;

        String lowerCaseName = name.toLowerCase();
        int indexOf = lowerCase.indexOf(lowerCaseName + ":");
        if (indexOf == -1)
            indexOf = lowerCase.indexOf(lowerCaseName + " :");
        if (indexOf == -1)
            indexOf = lowerCase.indexOf(lowerCaseName);
        return indexOf;
    }

    private File getFileFromPreferences(SourceBook srcBook) {
        if (srcBook == null)
            return null;
        IPreferenceStore store = Activator.getDefault().getPreferenceStore();
        String id2 = ShadowrunEditingTools.getId(srcBook);
        String string = store.getString(PreferenceConstants.LINKED_SOURCEBOOKS + id2);
        if (string == null)
            return null;
        File file = new File(string);
        if (file.exists())
            return file;

        return null;
    }

    private String getTextFromPage(Quelle q, PDDocument pdDocument2) {
        IPreferenceStore store = Activator.getDefault().getPreferenceStore();
        String id2 = ShadowrunEditingTools.getId(q.getSrcBook());
        int offset = store.getInt(PreferenceConstants.LINKED_SOURCEBOOKS_OFFSET + id2);
        try {
            int page = Integer.parseInt(q.getPage());
            PDFTextStripper pdfTextStripper = new PDFTextStripper();
            pdfTextStripper.setStartPage(page + offset);
            pdfTextStripper.setEndPage(page + offset);
            pdfTextStripper.setAddMoreFormatting(true);

            String text = pdfTextStripper.getText(pdDocument2).trim();
            text = text.replaceAll("-\n", "");

            text = text.replaceAll("\n\n", "---STOP---");
            text = text.replaceAll("\n", " ");
            text = text.replaceAll("---STOP---", "\n\n");
            return text;
        } catch (IOException e) {
            Activator.logError(e);
        } catch (NumberFormatException e) {
            Activator.logError(e);
        }
        return "";
    }

    /**
     * @param file
     * @param monitor
     * @return
     * @throws IOException
     */
    private PDDocument getpdfDoc(final File file, IProgressMonitor monitor) throws IOException {
        PDDocument pdDocument = bookMap.get(file);
        if (pdDocument != null)
            return pdDocument;

        monitor.setTaskName("load ..." + file.getName());
        try {
            pdDocument = PDDocument.load(file);
            if (pdDocument.isEncrypted()) {
                monitor.setTaskName("decrypt ...");
                pdDocument.decrypt("");
                pdDocument.setAllSecurityToBeRemoved(true);
            }
            bookMap.put(file, pdDocument);
            return pdDocument;
        } catch (IOException e) {
            Activator.logError(e);
            return null;
        } catch (CryptographyException e) {
            Activator.logError(e);
            return null;
        }
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue observeTextStyledTextObserveWidget = WidgetProperties.text(SWT.Modify).observeDelayed(10, styledText);
        bindingContext.bindValue(observeTextStyledTextObserveWidget, displayedText, null, null);
        //
        return bindingContext;
    }
}
