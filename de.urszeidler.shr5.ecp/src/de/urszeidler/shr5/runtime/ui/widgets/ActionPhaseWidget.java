package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolItem;

import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.InterruptAction;

public class ActionPhaseWidget extends NameableComposite {

    private InitativePass initativePass;
    
    
    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     * @param grouname
     */
    public ActionPhaseWidget(Composite parent, int style, String grouname) {
        super(parent, style, grouname);

    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

    protected void updateToolbar() {
        ToolItem tltmI = new ToolItem(actionBar, SWT.NONE);
        tltmI.setToolTipText("Intercept");
        tltmI.setText("I");
        tltmI.addSelectionListener(new SelectionAdapter(){
            @Override
            public void widgetSelected(SelectionEvent e) {
                InterruptAction interruptAction = GameplayFactory.eINSTANCE.createInterruptAction();
                interruptAction.setIniCost(-5);
                //interruptAction.set
                initativePass.setInterruptAction(interruptAction);
                interruptAction.redo();
            }
            
        });
        
        ToolItem tltmD = new ToolItem(actionBar, SWT.NONE);
        tltmD.setToolTipText("Doge");
        tltmD.setText("d");
        
        ToolItem tltmB = new ToolItem(actionBar, SWT.NONE);
        tltmB.setToolTipText("Block");
        tltmB.setText("b");
        
        ToolItem tltmP = new ToolItem(actionBar, SWT.NONE);
        tltmP.setToolTipText("Parry");
        tltmP.setText("p");
        
        ToolItem tltmFb = new ToolItem(actionBar, SWT.NONE);
        tltmFb.setToolTipText("full block");
        tltmFb.setText("fb");
        
        ToolItem tltmFc = new ToolItem(actionBar, SWT.NONE);
        tltmFc.setToolTipText("full cover");
        tltmFc.setText("fc");

    }
    
    public void setCharacter(InitativePass pass) {
        this.initativePass = pass;
        this.setNameable(pass.getSubject().getCharacter().getPersona());

    }

}
