package de.urszeidler.shr5.runtime.ui.dialogs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

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
    private Scale scale;
    private Label lblNewLabel;
    private Label lblMinute;
    private Label lblHoure;
    private double factor;
    protected DateFormat timeFormat;


    /**
     * Create the dialog.
     * 
     * @param parentShell
     * @param timeTrackFactor 
     */
    public TimetrackingDialog(Shell parentShell, double timeTrackFactor) {
        super(parentShell);
        timeFormat = new SimpleDateFormat("HH:mm:ss 'sec'");
        timeFormat.setTimeZone(TimeZone.getTimeZone("GMT-0:00"));  
        factor = timeTrackFactor;
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
                factor = scale.getSelection()/10d;
                updateLabels();
            }

        });
        scale.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        scale.setMaximum(200);
        scale.setMinimum(1);
        scale.setSelection((int)(factor*10));
        lblNewLabel = new Label(grpTimeFactor, SWT.NONE);
        lblNewLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        lblNewLabel.setText("factor");

        Group grpResult = new Group(container, SWT.NONE);
        grpResult.setLayout(new GridLayout(1, false));
        grpResult.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
        grpResult.setText("Result");
        
        Label lblRealtimeGametime = new Label(grpResult, SWT.NONE);
        lblRealtimeGametime.setText("realtime => gametime");

        lblMinute = new Label(grpResult, SWT.NONE);
        lblMinute.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        lblMinute.setText("minute");

        lblHoure = new Label(grpResult, SWT.NONE);
        lblHoure.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        lblHoure.setText("hour");
        
        updateLabels();
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

    protected void updateLabels() {
        lblNewLabel.setText("1 sec ==> "+ factor+" sec");
        lblMinute.setText("1 min==> "
                + timeFormat.format(new Date((long)((factor * (60*factor)) * 1000L))));
        long d = (long) (factor * (600*factor) * 1000L);
        long days = d/86400000L;
        lblHoure.setText("10 min==> "+days+" d"
                + timeFormat.format(new Date((long)d)));
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        return new Point(450, 390);
    }


    public double getFactor() {
       return factor;
    }
}
