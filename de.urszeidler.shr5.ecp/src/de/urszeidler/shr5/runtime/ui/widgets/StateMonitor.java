package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

/*
 * (c) urs zeidler
 */

/** 
 * <p> 
 * StateMonitor 
 * </p> 
 * Created : 19.01.2009 
 * @author urs 
 * @version $Revision$, $Id$ 
 */
public class StateMonitor extends Composite {

    private Group group = null;
    private Composite composite = null;
    private Composite composite1 = null;
    private Composite composite2 = null;
    private SingleStateMonitor singleStateMonitor = null;
    private SingleStateMonitor singleStateMonitor1 = null;

    public StateMonitor(Composite parent, int style) {
        super(parent, style);
        initialize();
    }

    private void initialize() {
        GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 1;
        createGroup();
        this.setLayout(gridLayout);
        setSize(new Point(300, 332));
    }

    /**
     * This method initializes group	
     *
     */
    private void createGroup() {
        GridLayout gridLayout1 = new GridLayout();
        gridLayout1.numColumns = 3;
        GridData gridData = new GridData();
        gridData.horizontalAlignment = GridData.FILL;
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = true;
        gridData.verticalAlignment = GridData.FILL;
        group = new Group(this, SWT.NONE);
        group.setLayoutData(gridData);
        group.setText("Zustands Monitor");
        group.setLayout(gridLayout1);
        createComposite();
        createComposite1();
        createComposite2();
    }

    /**
     * This method initializes composite	
     *
     */
    private void createComposite() {

        GridLayout gridLayout2 = new GridLayout();
        gridLayout2.horizontalSpacing = 0;
        gridLayout2.marginWidth = 1;
        gridLayout2.marginHeight = 2;
        gridLayout2.numColumns = 1;
        gridLayout2.makeColumnsEqualWidth = true;
        gridLayout2.verticalSpacing = 0;
        GridData gridData2 = new GridData();
        gridData2.horizontalAlignment = GridData.BEGINNING;
        gridData2.verticalAlignment = GridData.FILL;
        composite = new Composite(group, SWT.NONE);
        composite.setLayoutData(gridData2);
        createSingleStateMonitor();
        composite.setLayout(gridLayout2);

    }


    /**
     * This method initializes composite1	
     *
     */
    private void createComposite1() {
        GridData gridData1 = new GridData();
        gridData1.grabExcessHorizontalSpace = true;
        gridData1.verticalAlignment = GridData.FILL;
        gridData1.grabExcessVerticalSpace = true;
        gridData1.horizontalAlignment = GridData.FILL;
        composite1 = new Composite(group, SWT.NONE);
        composite1.setLayout(new GridLayout());
        composite1.setLayoutData(gridData1);
    }

    /**
     * This method initializes composite2	
     *
     */
    private void createComposite2() {
        GridLayout gridLayout2 = new GridLayout();
        gridLayout2.horizontalSpacing = 0;
        gridLayout2.marginWidth = 1;
        gridLayout2.marginHeight = 2;
        gridLayout2.numColumns = 1;
        gridLayout2.makeColumnsEqualWidth = true;
        gridLayout2.verticalSpacing = 0;
        GridData gridData2 = new GridData();
        gridData2.horizontalAlignment = GridData.BEGINNING;
        gridData2.verticalAlignment = GridData.FILL;
        composite2 = new Composite(group, SWT.NONE);
        composite2.setLayout(new GridLayout());
        createSingleStateMonitor1();
        composite2.setLayoutData(gridData2);
        
        
    }

    /**
     * This method initializes singleStateMonitor	
     *
     */
    private void createSingleStateMonitor() {
        singleStateMonitor = new SingleStateMonitor(composite, SWT.NONE);
    }

    /**
     * This method initializes singleStateMonitor1	
     *
     */
    private void createSingleStateMonitor1() {
        singleStateMonitor1 = new SingleStateMonitor(composite2, SWT.NONE);
    }

	public void setFristState(int value) {
		singleStateMonitor.setState(value);
	}

	public void setSecondState(int value) {
		singleStateMonitor1.setState(value);
	}

	public SingleStateMonitor getSingleStateMonitor() {
		return singleStateMonitor;
	}

	public SingleStateMonitor getSingleStateMonitor1() {
		return singleStateMonitor1;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
