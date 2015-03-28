package de.urszeidler.shr5.ecp.dialogs;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.shr5.acceleo.sheets.AbstractGenerator;
import de.urszeidler.shr5.acceleo.sheets.BoardCharacterSheet;
import de.urszeidler.shr5.acceleo.sheets.BoardShr5GeneratorSheet;
import de.urszeidler.shr5.acceleo.sheets.FoCharacterSheet;
import de.urszeidler.shr5.acceleo.sheets.GenerateLifeModuleBoardSheet;
import de.urszeidler.shr5.acceleo.sheets.GenerateNpcCharacterSheet;
import de.urszeidler.shr5.acceleo.sheets.GenerateSvgVehicleSheet;
import de.urszeidler.shr5.acceleo.sheets.GeneratorSystemBoardSheet;
import de.urszeidler.shr5.acceleo.sheets.SimpleSvg;
import de.urszeidler.shr5.acceleo.sheets.SpiritFoSheet;
import de.urszeidler.shr5.acceleo.sheets.SvgCharacterSheet;
import de.urszeidler.shr5.acceleo.sheets.TableBoardShr5CharacterSheet;
import de.urszeidler.shr5.ecp.Activator;

public class ModelToTextExportDialog extends TitleAreaDialog {
    private Text text;
    private EObject object;
    private Map<EClass, Map<String, AbstractAcceleoGenerator>> transformerMap = new HashMap<EClass, Map<String, AbstractAcceleoGenerator>>();
    private Map<String, Image> imageMap = new HashMap<String, Image>();
    private Map<String, String> descriptionMap = new HashMap<String, String>();
    protected AbstractAcceleoGenerator generator;
    protected File folder;
    private Combo combo;
    private IDialogSettings dialogSettings;
    private Button button_open;

    /**
     * Create the dialog.
     * 
     * @param parentShell
     * @wbp.parser.constructor
     */
    public ModelToTextExportDialog(Shell parentShell) {
        super(parentShell);
        setShellStyle(SWT.TITLE);
    }

    /**
     * Create the dialog.
     * 
     * @param parentShell
     */
    public ModelToTextExportDialog(Shell parentShell, EObject object) {
        super(parentShell);
        this.object = object;
        String titel = AdapterFactoryUtil.getInstance().getLabelProvider().getText(object);
        setTitle(String.format(Messages.ModelToTextExportDialog_titel, titel));
        
        HashMap<String, AbstractAcceleoGenerator> hashMap = new HashMap<String, AbstractAcceleoGenerator>();
        hashMap.put(Messages.ModelToTextExportDialog_tf_BBcs, new BoardCharacterSheet());
        hashMap.put(Messages.ModelToTextExportDialog_tf_BBTcs, new TableBoardShr5CharacterSheet());
        hashMap.put(Messages.ModelToTextExportDialog_tf_ssvg, new SimpleSvg());
        hashMap.put(Messages.ModelToTextExportDialog_tf_ssvgv, new GenerateSvgVehicleSheet());
        hashMap.put(Messages.ModelToTextExportDialog_tf_csPDF, new SvgCharacterSheet());
        hashMap.put(Messages.ModelToTextExportDialog_tf_npcPDF, new GenerateNpcCharacterSheet());
        hashMap.put("Bound Spirits", new SpiritFoSheet());
        hashMap.put("Fo Character sheet", new FoCharacterSheet());

        imageMap.put(Messages.ModelToTextExportDialog_tf_csPDF, ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/characterSheet1.png"));
        imageMap.put(Messages.ModelToTextExportDialog_tf_ssvg, ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/simple-svg.png")); //$NON-NLS-2$ //$NON-NLS-3$
        imageMap.put(Messages.ModelToTextExportDialog_tf_BBcs, ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/textTransformations.png")); //$NON-NLS-2$ //$NON-NLS-3$
        imageMap.put(Messages.ModelToTextExportDialog_tf_BBTcs, ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/textTransformations.png")); //$NON-NLS-2$ //$NON-NLS-3$
        imageMap.put(Messages.ModelToTextExportDialog_tf_BBGcs, ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/textTransformations.png")); //$NON-NLS-2$ //$NON-NLS-3$
        imageMap.put("Generator system", ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/textTransformations.png")); //$NON-NLS-2$ //$NON-NLS-3$
        imageMap.put("Life Module", ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/textTransformations.png")); //$NON-NLS-2$ //$NON-NLS-3$
        descriptionMap.put(Messages.ModelToTextExportDialog_tf_ssvg, Messages.ModelToTextExportDialog_tf_ssvg_desc);
        
        descriptionMap.put(Messages.ModelToTextExportDialog_tf_csPDF, Messages.ModelToTextExportDialog_tf_csPDF_desc);
        descriptionMap.put(Messages.ModelToTextExportDialog_tf_ssvgv, Messages.ModelToTextExportDialog_tf_ssvgv_desc);
        descriptionMap.put(Messages.ModelToTextExportDialog_tf_BBcs, Messages.ModelToTextExportDialog_tf_BBcs_desc);
        descriptionMap.put(Messages.ModelToTextExportDialog_tf_BBTcs, Messages.ModelToTextExportDialog_tf_BBTcs_desc);
        descriptionMap.put(Messages.ModelToTextExportDialog_tf_npcPDF, Messages.ModelToTextExportDialog_tf_npcPDF_desc);
        descriptionMap.put("Generator system", "A simple text export for the generator system");
        descriptionMap.put("Life Module", "A simple text export for the a life module.");
        
        transformerMap.put(Shr5managementPackage.Literals.PLAYER_CHARACTER, hashMap);
        transformerMap.put(Shr5managementPackage.Literals.NON_PLAYER_CHARACTER, hashMap);

        HashMap<String, AbstractAcceleoGenerator> hashMap1 = new HashMap<String, AbstractAcceleoGenerator>();
        hashMap1.put(Messages.ModelToTextExportDialog_tf_BBGcs, new BoardShr5GeneratorSheet());
        transformerMap.put(Shr5managementPackage.Literals.SHR5_GENERATOR, hashMap1);

        hashMap = new HashMap<String, AbstractAcceleoGenerator>(hashMap);
        hashMap.putAll(hashMap1);
        transformerMap.put(Shr5managementPackage.Literals.CHARACTER_GROUP, hashMap);
        transformerMap.put(Shr5managementPackage.Literals.PLAYER_MANAGEMENT, hashMap);
        transformerMap.put(Shr5managementPackage.Literals.GAMEMASTER_MANAGEMENT, hashMap);

        hashMap1 = new HashMap<String, AbstractAcceleoGenerator>();
        hashMap1.put("Generator system", new GeneratorSystemBoardSheet());
        transformerMap.put(Shr5managementPackage.Literals.SHR5_SYSTEM, hashMap1);
        transformerMap.put(Shr5managementPackage.Literals.LIFE_MODULES_SYSTEM, hashMap1);

        hashMap1 = new HashMap<String, AbstractAcceleoGenerator>();
        hashMap1.put("Life Module", new GenerateLifeModuleBoardSheet());
        transformerMap.put(Shr5managementPackage.Literals.LIFE_MODULE, hashMap1);


        dialogSettings = Activator.getDefault().getDialogSettings();
    }

    /**
     * Create contents of the dialog.
     * 
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        Composite area = (Composite)super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayout(new GridLayout(3, false));
        container.setLayoutData(new GridData(GridData.FILL_BOTH));

        Label lblNewLabel = new Label(container, SWT.NONE);
        lblNewLabel.setToolTipText(Messages.ModelToTextExportDialog_select_m2m_tooltip);
        lblNewLabel.setText(Messages.ModelToTextExportDialog_select_m2m_lable);

        combo = new Combo(container, SWT.NONE);
        combo.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                String text2 = combo.getText();
                Image image = imageMap.get(text2);
//                if(image!=null)
                    setTitleImage(image);
                String message = descriptionMap.get(text2);
                setMessage(message);
            }
        });
        combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        new Label(container, SWT.NONE);

        Label lblNewLabel_1 = new Label(container, SWT.NONE);
        lblNewLabel_1.setToolTipText(Messages.ModelToTextExportDialog_select_dir_tooltip);
        lblNewLabel_1.setText(Messages.ModelToTextExportDialog_select_dir_lable);

        text = new Text(container, SWT.BORDER);
        text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Button btnNewButton = new Button(container, SWT.NONE);
        btnNewButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                DirectoryDialog directoryDialog = new DirectoryDialog(getShell());
                String open = directoryDialog.open();
                if (open == null)
                    open = Messages.ModelToTextExportDialog_select_dir_lable;
                text.setText(open);
                try {
                    folder = new File(open);
                } catch (Exception e2) {
                    setErrorMessage(e2.getLocalizedMessage());
                }
            }
        });
        btnNewButton.setText("...");//$NON-NLS-1$
        
        Label lblOpen = new Label(container, SWT.NONE);
        lblOpen.setText(Messages.ModelToTextExportDialog_lblOpen_text);
        
        button_open = new Button(container, SWT.CHECK);
        button_open.setText("");
        new Label(container, SWT.NONE);

        Map<String, AbstractAcceleoGenerator> map = transformerMap.get(object.eClass());
        if (map != null) {
            map.keySet();
            combo.setItems(map.keySet().toArray(new String[]{}));
        }

        String dir = dialogSettings.get("m2t.dir");//$NON-NLS-1$
        if (dir != null) {
            text.setText(dir);
            try {
                folder = new File(dir);
            } catch (Exception e2) {
                setErrorMessage(e2.getLocalizedMessage());
            }
        }
        String trans = dialogSettings.get("m2t.transformation");//$NON-NLS-1$
        if (trans != null)
            if(map.containsKey(trans))
                combo.setText(trans);
        
        setMessage(String.format(Messages.ModelToTextExportDialog_default_message, AdapterFactoryUtil.getInstance().getLabelProvider().getText(object)));
        return area;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void okPressed() {
        Map<String, AbstractAcceleoGenerator> map = transformerMap.get(object.eClass());
        String text2 = combo.getText();
        final boolean open = button_open.getSelection();
        if (map != null) {
            generator = map.get(text2);
        }
        if (generator != null) {
            Job job = new Job(text2 + Messages.ModelToTextExportDialog_progress) {
                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    try {
                        if (generator instanceof AbstractGenerator) {
                            AbstractGenerator g = (AbstractGenerator)generator;
                            g.setOpen(open);
                        }
                        
                        generator.initialize(object, folder, Collections.EMPTY_LIST);
                        Monitor m = BasicMonitor.toMonitor(monitor);
                        generator.doGenerate(m);
                    } catch (IOException e) {
                        Activator.logError(e);
                        setErrorMessage(e.getLocalizedMessage());
                        return Status.CANCEL_STATUS;
                    }
                    return Status.OK_STATUS;
                }
            };
            job.setUser(true);
            job.schedule();
        }
        dialogSettings.put("m2t.dir", text.getText());//$NON-NLS-1$
        dialogSettings.put("m2t.transformation", text2);//$NON-NLS-1$
        super.okPressed();
    }

    /**
     * Create contents of the button bar.
     * 
     * @param parent
     */
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        return new Point(450, 300);
    }

}
