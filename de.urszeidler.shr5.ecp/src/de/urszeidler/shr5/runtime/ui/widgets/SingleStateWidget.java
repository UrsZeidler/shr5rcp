package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

/*
 * (c) urs zeidler
 */

public class SingleStateWidget extends Composite {

    private Label Statelabel = null;
    private boolean markt = false;
    private int size = 20;
    private int spacing = size/10;    
    
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
        GridData gridData1 = new GridData();
        gridData1.horizontalAlignment = GridData.FILL;
        gridData1.grabExcessHorizontalSpace = false;
        gridData1.verticalAlignment = GridData.CENTER;
        GridData gridData = new GridData();
        gridData.heightHint = size;
        gridData.widthHint = size;
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 1;
        gridLayout.verticalSpacing = spacing;
        gridLayout.marginWidth = spacing;
        gridLayout.marginHeight = spacing;
        gridLayout.horizontalSpacing = spacing;
        Statelabel = new Label(this, SWT.BORDER | SWT.SHADOW_IN);
        Statelabel.setText("");
        Statelabel.setLayoutData(gridData);
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
        if(markt)
            Statelabel.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
        else
            Statelabel.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
                   
        this.markt = markt;
    }

}
