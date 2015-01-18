package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.shr5.runtime.ui.widgets.StateMonitorWidget.MonitorType;

/*
 * (c) urs zeidler
 */

public class SingleStateWidget extends Composite implements MouseListener {
    private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
    
    private IPropertyListener changeListener;
    private Label statelabel = null;
    private boolean markt = false;
    private int size = 12;
    private int spacing = size/10;

    private MonitorType type= MonitorType.physical;    
    
    public SingleStateWidget(Composite parent, int style) {
        super(parent, style);     
        initialize();
        setMarkt(false);
        
    }
    
    public SingleStateWidget(Composite parent, int style,int size) {
        super(parent, style);   
        this.size = size;
        this.spacing = size/10;
        initialize();
        setMarkt(false);
    }

    private void initialize() {
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);

        
        GridData gridData1 = new GridData();
        gridData1.horizontalAlignment = GridData.FILL;
        gridData1.grabExcessHorizontalSpace = false;
        gridData1.verticalAlignment = GridData.CENTER;
        GridData gridData = new GridData();
        gridData.heightHint = size;
        gridData.widthHint = size-1;
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 1;
        gridLayout.verticalSpacing = spacing;
        gridLayout.marginWidth = spacing;
        gridLayout.marginHeight = spacing;
        gridLayout.horizontalSpacing = spacing;
        statelabel = toolkit.createLabel(this, "", SWT.SHADOW_NONE);//  new Label(this, SWT.SHADOW_NONE);
        statelabel.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/damage-2.png"));
        //Statelabel.setText("");
        statelabel.setLayoutData(gridData);
        statelabel.addMouseListener(this);
        
        
        this.setLayout(gridLayout);
//        setSize(new Point(300, 200));
    }

    /**
     * @return the markt
     */
    public boolean isMarkt() {
        return this.markt;
    }

    /**
     * @param markt the markt to set
     */
    public void setMarkt(boolean markt) {
        String name = type.toString();
        if(markt){
            statelabel.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/damage-"+name+"-1.png"));
        }
        else{
            statelabel.setImage(ResourceManager.getPluginImage("de.urszeidler.shr5.ecp", "images/damage-"+name+"-2.png"));
        }            
        this.markt = markt;
    }

    @Override
    public void mouseDoubleClick(MouseEvent e) {
        if(changeListener!=null)
            changeListener.propertyChanged(this, 1);
    }

    @Override
    public void mouseDown(MouseEvent e) {
    }

    @Override
    public void mouseUp(MouseEvent e) {
    }

    public void setChangeListener(IPropertyListener changeListener) {
        this.changeListener = changeListener;
    }

    public void setType(MonitorType type) {
        this.type =type;        
    }

}
