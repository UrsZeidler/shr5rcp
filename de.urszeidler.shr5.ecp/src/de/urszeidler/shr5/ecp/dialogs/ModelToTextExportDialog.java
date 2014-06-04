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

import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.shr5.acceleo.sheets.BoardCharacterSheet;
import de.urszeidler.shr5.acceleo.sheets.BoardShr5GeneratorSheet;
import de.urszeidler.shr5.acceleo.sheets.GenerateSvgVehicleSheet;
import de.urszeidler.shr5.acceleo.sheets.SimpleSvg;
import de.urszeidler.shr5.acceleo.sheets.SvgCharacterSheet;
import de.urszeidler.shr5.acceleo.sheets.TableBoardShr5CharacterSheet;
import de.urszeidler.shr5.ecp.Activator;

public class ModelToTextExportDialog extends TitleAreaDialog {
    private Text text;
    private EObject object;
    private Map<EClass, Map<String, AbstractAcceleoGenerator>> transformerMap = new HashMap<EClass, Map<String, AbstractAcceleoGenerator>>();
    protected AbstractAcceleoGenerator generator;
    protected File folder;
    private Combo combo;
    private IDialogSettings dialogSettings;

    /**
     * Create the dialog.
     * 
     * @param parentShell
     * @wbp.parser.constructor
     */
    public ModelToTextExportDialog(Shell parentShell) {
        super(parentShell);
    }

    /**
     * Create the dialog.
     * 
     * @param parentShell
     */
    public ModelToTextExportDialog(Shell parentShell, EObject object) {
        super(parentShell);
        this.object = object;

        HashMap<String, AbstractAcceleoGenerator> hashMap = new HashMap<String, AbstractAcceleoGenerator>();
        hashMap.put("BB Character Sheet", new BoardCharacterSheet());
        hashMap.put("BB Table Character Sheet", new TableBoardShr5CharacterSheet());
        hashMap.put("simple svg->pdf", new SimpleSvg());
        hashMap.put("simple vehicle->pdf", new GenerateSvgVehicleSheet());
        hashMap.put("characterSheet->pdf", new SvgCharacterSheet());

        transformerMap.put(Shr5managementPackage.Literals.PLAYER_CHARACTER, hashMap);
        transformerMap.put(Shr5managementPackage.Literals.NON_PLAYER_CHARACTER, hashMap);
   

        HashMap<String, AbstractAcceleoGenerator> hashMap1 = new HashMap<String, AbstractAcceleoGenerator>();
        hashMap1.put("BB shr5 generator sheet", new BoardShr5GeneratorSheet());
        transformerMap.put(Shr5managementPackage.Literals.SHR5_GENERATOR, hashMap1);
        
        hashMap = new HashMap<String, AbstractAcceleoGenerator>(hashMap);
        hashMap.putAll(hashMap1);
        transformerMap.put(Shr5managementPackage.Literals.CHARACTER_GROUP, hashMap);


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
        lblNewLabel.setText("select transformation");

        combo = new Combo(container, SWT.NONE);
        combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        new Label(container, SWT.NONE);

        Label lblNewLabel_1 = new Label(container, SWT.NONE);
        lblNewLabel_1.setText("select target directory");

        text = new Text(container, SWT.BORDER);
        text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Button btnNewButton = new Button(container, SWT.NONE);
        btnNewButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                DirectoryDialog directoryDialog = new DirectoryDialog(getShell());
                String open = directoryDialog.open();
                if (open == null)
                    open = "select directory";
                text.setText(open);
                try {
                    folder = new File(open);
                } catch (Exception e2) {
                    setErrorMessage(e2.getLocalizedMessage());
                }
            }
        });
        btnNewButton.setText("...");

        Map<String, AbstractAcceleoGenerator> map = transformerMap.get(object.eClass());
        if (map != null) {
            map.keySet();
            combo.setItems(map.keySet().toArray(new String[]{}));
        }

        String dir = dialogSettings.get("m2t.dir");
        if (dir != null) {
            text.setText(dir);
            try {
                folder = new File(dir);
            } catch (Exception e2) {
                setErrorMessage(e2.getLocalizedMessage());
            }
        }
        String trans = dialogSettings.get("m2t.transformation");
        if (trans != null)
            combo.setText(trans);
        return area;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void okPressed() {
        Map<String, AbstractAcceleoGenerator> map = transformerMap.get(object.eClass());
        String text2 = combo.getText();
        if (map != null) {
            generator = map.get(text2);
        }
        if (generator != null) {
            Job job = new Job(text2 + "is runing") {
                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    try {
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
        dialogSettings.put("m2t.dir", text.getText());
        dialogSettings.put("m2t.transformation", text2);
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
