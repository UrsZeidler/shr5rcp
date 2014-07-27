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
import de.urszeidler.eclipse.shr5.gameplay.InterruptType;
import de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand;

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
//        final InterruptType interruptType = InterruptType.INTERCEPT;
        InterruptType[] interruptTypes = InterruptType.values();
        for (InterruptType interruptType : interruptTypes) {
            createInterruptedAction(interruptType);
        }
        
//        
//        ToolItem tltmD = new ToolItem(actionBar, SWT.NONE);
//        tltmD.setToolTipText("Doge");
//        tltmD.setText("d");
//        
//        ToolItem tltmB = new ToolItem(actionBar, SWT.NONE);
//        tltmB.setToolTipText("Block");
//        tltmB.setText("b");
//        
//        ToolItem tltmP = new ToolItem(actionBar, SWT.NONE);
//        tltmP.setToolTipText("Parry");
//        tltmP.setText("p");
//        
//        ToolItem tltmFb = new ToolItem(actionBar, SWT.NONE);
//        tltmFb.setToolTipText("full block");
//        tltmFb.setText("fb");
//        
//        ToolItem tltmFc = new ToolItem(actionBar, SWT.NONE);
//        tltmFc.setToolTipText("full cover");
//        tltmFc.setText("fc");

    }

    private void createInterruptedAction(final InterruptType interruptType) {
        ToolItem tltmI = new ToolItem(actionBar, SWT.NONE);
        String literal = interruptType.getLiteral();
        tltmI.setToolTipText(literal);
        tltmI.setText(literal.substring(0, 1));
        tltmI.addSelectionListener(new SelectionAdapter(){
            @Override
            public void widgetSelected(SelectionEvent e) {
                InterruptAction interruptAction = GameplayFactory.eINSTANCE.createInterruptAction();
                if(interruptType==InterruptType.FULL_DEFENSE)
                    interruptAction.setIniCost(-10);
                else    
                    interruptAction.setIniCost(-5);
                interruptAction.setInterruptType(interruptType);
                initativePass.setInterruptAction(interruptAction);
                interruptAction.redo();
            }
            
        });
    }
    
    public void setCharacter(InitativePass pass) {
        this.initativePass = pass;
        this.setNameable(pass.getSubject().getCharacter().getPersona());

    }

}
