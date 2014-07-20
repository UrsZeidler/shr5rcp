package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

/*
 * (c) urs zeidler
 */

public class SimpleSingleState extends Composite {

    private Label Statelabel = null;
    private Label Suffixlabel = null;
    private boolean markt = false;
    
    
    private String suffixLabel;
    public SimpleSingleState(Composite parent, int style) {
        super(parent, style);
        initialize();
        setMarkt(false);
    }

    private void initialize() {
        GridData gridData1 = new GridData();
        gridData1.horizontalAlignment = GridData.FILL;
        gridData1.grabExcessHorizontalSpace = false;
        gridData1.verticalAlignment = GridData.CENTER;
        GridData gridData = new GridData();
        gridData.heightHint = 20;
        gridData.widthHint = 20;
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 3;
        gridLayout.verticalSpacing = 2;
        gridLayout.marginWidth = 2;
        gridLayout.marginHeight = 2;
        gridLayout.horizontalSpacing = 2;
        Statelabel = new Label(this, SWT.BORDER | SWT.SHADOW_IN);
        Statelabel.setText("");
        Statelabel.setLayoutData(gridData);
        Label filler = new Label(this, SWT.NONE);
        Suffixlabel = new Label(this, SWT.NONE);
        Suffixlabel.setText("   ");
        Suffixlabel.setLayoutData(gridData1);
        this.setLayout(gridLayout);
        setSize(new Point(300, 200));
    }

    /**
     * @return the suffixLabel
     */
    public String getSuffixLabel() {
        return this.suffixLabel;
    }

    /**
     * @param suffixLabel the suffixLabel to set
     */
    public void setSuffixLabel(String suffixLabel) {
        this.suffixLabel = suffixLabel;
        Suffixlabel.setText(suffixLabel);
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
