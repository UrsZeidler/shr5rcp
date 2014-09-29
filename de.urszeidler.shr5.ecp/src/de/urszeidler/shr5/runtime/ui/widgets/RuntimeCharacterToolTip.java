/**
 * 
 */
package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Text;

import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;

/**
 * @author urs
 */
public class RuntimeCharacterToolTip extends ToolTip {

    private StateMonitorWidget stateMonitorWidgetMental;
    private StateMonitorWidget stateMonitorWidgetPhysical;

    private RuntimeCharacter character;

    private StateMonitorWidget stateMonitorWidgetOverDead;

    
    public RuntimeCharacterToolTip(Control control, int style, boolean manualActivation) {
        super(control, style, manualActivation);
        // TODO Auto-generated constructor stub
    }

    /**
     * @wbp.parser.constructor
     * @param control
     */
    public RuntimeCharacterToolTip(Control control) {
        super(control);
        // TODO Auto-generated constructor stub
    }

     /**
     * @wbp.parser.entryPoint
     */
    @Override
    protected Composite createToolTipContentArea(Event event, Composite parent) {
        Composite pane= new Composite(parent,SWT.NONE);  
        pane.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_INFO_BACKGROUND));  
        pane.setLayout(new GridLayout(1,false));  
        
        Composite composite = new Composite(pane, SWT.NONE);
        composite.setLayout(new GridLayout(3, false));
        composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
        
        stateMonitorWidgetPhysical = new StateMonitorWidget(composite, SWT.NONE);
        stateMonitorWidgetMental = new StateMonitorWidget(composite, SWT.NONE);
        stateMonitorWidgetOverDead = new StateMonitorWidget(composite, SWT.NONE);

        
        
        
        
        
        
        
        
        
        
        
        
        
        Text tooltip=new Text(pane, SWT.MULTI | SWT.WRAP | SWT.BORDER | SWT.V_SCROLL | SWT.READ_ONLY);  
        GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);  
        data.widthHint = 300;  
        data.heightHint = 50;  
        data.verticalIndent = 5;  
        tooltip.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_INFO_BACKGROUND));  
        tooltip.setText("gggggggggggggggggggggggggggggggggggggggggggggg");  
        tooltip.setLayoutData(data);  
        return pane;      }

}
