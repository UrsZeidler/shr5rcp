package de.urszeidler.shr5.ecp.dialogs;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;
import org.eclipse.ui.dialogs.SelectionDialog;

import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;

public class ImageChooseDialog extends TitleAreaDialog {
    protected DataBindingContext m_bindingContext;
    private Text text;
    private WritableValue externalValue = new WritableValue(null, String.class);
    private String value;
    private String defaultValue;

    /**
     * Create the dialog.
     * 
     * @param parentShell
     */
    public ImageChooseDialog(Shell parentShell,String defaultValue) {
        super(parentShell);
        setHelpAvailable(false);
        this.defaultValue = defaultValue;
    }

    /**
     * Create contents of the dialog.
     * 
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        setMessage("Select an image from the workspace or the filesystem.");
        setTitle("Select image");
        Composite area = (Composite)super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayout(new GridLayout(1, false));
        container.setLayoutData(new GridData(GridData.FILL_BOTH));

        Group grpSelectSource = new Group(container, SWT.NONE);
        grpSelectSource.setLayout(new GridLayout(4, false));
        grpSelectSource.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        grpSelectSource.setText("select source");

        final Button btnRadioButton_1 = new Button(grpSelectSource, SWT.RADIO);
        btnRadioButton_1.setSelection(true);
        btnRadioButton_1.setText("workspace");

        final Button btnRadioButton = new Button(grpSelectSource, SWT.RADIO);
        btnRadioButton.setText("filesystem");
        new Label(grpSelectSource, SWT.NONE);
        new Label(grpSelectSource, SWT.NONE);

        text = new Text(grpSelectSource, SWT.BORDER);
        text.setSize(307, 29);
        text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));

        Button btnNewButton = new Button(grpSelectSource, SWT.NONE);
        btnNewButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (btnRadioButton_1.getSelection())
                    selectFromWorkspace();
                else
                    selectFromFilesystem();
            }
        });
        btnNewButton.setText("select");

        Group grpPreview = new Group(container, SWT.NONE);
        grpPreview.setLayout(new FillLayout(SWT.HORIZONTAL));
        GridData gd_grpPreview = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
        gd_grpPreview.heightHint = 115;
        grpPreview.setLayoutData(gd_grpPreview);
        grpPreview.setText("preview");

        final Label label = new Label(grpPreview, SWT.CENTER);

        if(defaultValue!=null && !defaultValue.isEmpty()){
            label.setImage(AdapterFactoryUtil.getInstance().getImageScaledBy(gd_grpPreview.heightHint-5, defaultValue));
            externalValue.setValue(defaultValue);
        }
        externalValue.addChangeListener(new IChangeListener() {

            @Override
            public void handleChange(ChangeEvent event) {
                String value = (String)externalValue.getValue();
                if (value != null) {
                    label.setImage(AdapterFactoryUtil.getInstance().getImageScaledBy(label.getBounds().height, value));
                }
            }
        });

        return area;
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
        m_bindingContext = initDataBindings();
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        return new Point(450, 395);
    }

    
    
    @Override
    protected void okPressed() {
        value = (String)externalValue.getValue();
        externalValue.dispose();
        super.okPressed();
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
         IObservableValue observeTextText_1ObserveWidget = WidgetProperties.text(SWT.Modify).observeDelayed(200, text);
         bindingContext.bindValue(observeTextText_1ObserveWidget, externalValue, null, null);
        //
        return bindingContext;
    }
    
    

    public String getValue() {
        return value;
    }

    /**
     * 
     */
    private void selectFromFilesystem() {
        FileDialog fd = new FileDialog(getShell(), SWT.OPEN);
        fd.setText("Open");
        fd.setFilterPath("");
        String[] filterExt = { "*.png", "*.jpg", ".gif", "*.*" };
        fd.setFilterExtensions(filterExt);
        String selected = fd.open();
        externalValue.setValue(selected);
    }

    /**
     * 
     */
    private void selectFromWorkspace() {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();

        SelectionDialog dlg;
        dlg = new ResourceListSelectionDialog(getShell(), workspace.getRoot(), 1);
        dlg.setTitle("Messages.BeschreibbarWidget_select_image");

        int open = dlg.open();
        if (open == Window.OK) {
            Object[] result = dlg.getResult();
            if (result != null) {
                externalValue.setValue(((IFile)result[0]).getFullPath().toString());
            }
        }
    }
}
