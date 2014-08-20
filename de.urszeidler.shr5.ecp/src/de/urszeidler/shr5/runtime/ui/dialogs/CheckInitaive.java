package de.urszeidler.shr5.runtime.ui.dialogs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.Initative;
import de.urszeidler.shr5.runtime.ui.widgets.EditableInitativeComposite;

public class CheckInitaive extends TitleAreaDialog {
    private CombatTurn ct;


    /**
     * Create the dialog.
     * 
     * @param parentShell
     * @wbp.parser.constructor
     */
    public CheckInitaive(Shell parentShell) {
        super(parentShell);
        setShellStyle(SWT.RESIZE);
        setHelpAvailable(false);
    }

    public CheckInitaive(Shell shell, CombatTurn ct) {
       this(shell);
       this.ct = ct;
    }

    /**
     * Create contents of the dialog.
     * 
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        setMessage("In the current combat turn the ini is :");
        setTitle("Initative");
        Composite area = (Composite)super.createDialogArea(parent);
        

        Group container = new Group(area, SWT.H_SCROLL);
        container.setLayout(new FillLayout(SWT.HORIZONTAL));
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
        container.setText("Ini");
        
        ScrolledComposite scrolledComposite = new ScrolledComposite(container, SWT.H_SCROLL | SWT.V_SCROLL);
        scrolledComposite.setExpandHorizontal(true);
        scrolledComposite.setExpandVertical(true);
        
        Composite composite = new Composite(scrolledComposite, SWT.NONE);
        composite.setLayout(new GridLayout(1, false));
        scrolledComposite.setContent(composite);

        //scrolledComposite.setMinSize(new Point(450, 200));
        
         EList<Command> subCommands = ct.getSubCommands();
        for (Command command : subCommands) {
            EditableInitativeComposite editableInitativeComposite = new EditableInitativeComposite(composite,SWT.NONE,(Initative)command);
            editableInitativeComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        }
        scrolledComposite.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
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
        //createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }

    /**
     * Return the initial size of the dialog.
     */
    @Override
    protected Point getInitialSize() {
        return new Point(450, 380);
    }

}
