package de.urszeidler.shr5.runtime.ui.dialogs;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.widgets.Shell;

public class TimetrackingDialog extends TitleAreaDialog {
    private DataBindingContext m_bindingContext;
    private Scale scale;
    private Label lblNewLabel;
    private Label lblMinute;
    private Label lblHoure;
    private int factor;


    /**
     * Create the dialog.
     * 
     * @param parentShell
     */
    public TimetrackingDialog(Shell parentShell) {
        super(parentShell);
    }

    /**
     * Create contents of the dialog.
     * 
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        setMessage("Select the time tracking factor.");
        setTitle("Time tracking");
        Composite area = (Composite)super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayout(new GridLayout(1, false));
        container.setLayoutData(new GridData(GridData.FILL_BOTH));

        Group grpTimeFactor = new Group(container, SWT.NONE);
        grpTimeFactor.setLayout(new GridLayout(1, false));
        grpTimeFactor.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        grpTimeFactor.setText("Time factor");

        scale = new Scale(grpTimeFactor, SWT.NONE);
        scale.addSelectionListener(new SelectionAdapter() {
 
            @Override
            public void widgetSelected(SelectionEvent e) {
                factor = scale.getSelection();
                lblNewLabel.setText("==> " + SimpleDateFormat.getTimeInstance(SimpleDateFormat.LONG).format(new Date(scale.getSelection() * 1000L)));
                lblMinute.setText("==> "
                        + SimpleDateFormat.getTimeInstance(SimpleDateFormat.LONG).format(new Date(scale.getSelection() * 60 * 1000L)));
                lblHoure.setText("==> "
                        + SimpleDateFormat.getTimeInstance(SimpleDateFormat.LONG).format(new Date(scale.getSelection() * 3600 * 1000L)));
            }
        });
        scale.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        lblNewLabel = new Label(grpTimeFactor, SWT.NONE);
        lblNewLabel.setText("factor");

        Group grpResult = new Group(container, SWT.NONE);
        grpResult.setLayout(new GridLayout(1, false));
        grpResult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        grpResult.setText("Result");

        lblMinute = new Label(grpResult, SWT.NONE);
        lblMinute.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        lblMinute.setText("minute");

        lblHoure = new Label(grpResult, SWT.NONE);
        lblHoure.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        lblHoure.setText("hour");

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
//        m_bindingContext = initDataBindings();
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        return new Point(450, 390);
    }


    public int getFactor() {
       return factor;
    }
}
