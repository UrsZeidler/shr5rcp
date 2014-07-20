package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

/*
 * (c) urs zeidler
 */

public class SingleStateMonitor extends Composite {
    private SimpleSingleState simpleSingleState1 = null;
    private SimpleSingleState simpleSingleState2 = null;
    private SimpleSingleState simpleSingleState3 = null;
    private SimpleSingleState simpleSingleState4 = null;
    private SimpleSingleState simpleSingleState5 = null;
    private SimpleSingleState simpleSingleState6 = null;
    private SimpleSingleState simpleSingleState7 = null;
    private SimpleSingleState simpleSingleState8 = null;
    private SimpleSingleState simpleSingleState9 = null;
    private SimpleSingleState simpleSingleState10 = null;

	private SimpleSingleState[] simpleSingleState  = new SimpleSingleState[10];
    
    public SingleStateMonitor(Composite parent, int style) {
        super(parent, style);
        initialize();
    }

    private void initialize() {
       // setSize(new Point(300, 327));
         
        GridLayout gridLayout2 = new GridLayout();
        gridLayout2.horizontalSpacing = 0;
        gridLayout2.marginWidth = 1;
        gridLayout2.marginHeight = 2;
        gridLayout2.numColumns = 1;
        gridLayout2.makeColumnsEqualWidth = true;
        gridLayout2.verticalSpacing = 0;
        
        setLayout(gridLayout2);
        
        createSimpleSingleState1();
        createSimpleSingleState2();
        createSimpleSingleState3();
        createSimpleSingleState4();
        createSimpleSingleState5();
        createSimpleSingleState6();
        createSimpleSingleState7();
        createSimpleSingleState8();
        createSimpleSingleState9();
        createSimpleSingleState10();

    }

    
    

    /**
     * This method initializes simpleSingleState1   
     * @param composite3 
     *
     */
    private void createSimpleSingleState1() {
        simpleSingleState1 = new SimpleSingleState(this, SWT.NONE);
        simpleSingleState1.setSuffixLabel("-T ");
        simpleSingleState[9]=simpleSingleState1;
    }

    /**
     * This method initializes simpleSingleState2   
     *
     */
    private void createSimpleSingleState2() {
        simpleSingleState2 = new SimpleSingleState(this, SWT.NONE);
        simpleSingleState2.setSuffixLabel("");
        simpleSingleState[8]=simpleSingleState2;
    }

    /**
     * This method initializes simpleSingleState3   
     *
     */
    private void createSimpleSingleState3() {
        simpleSingleState3 = new SimpleSingleState(this, SWT.NONE);
        simpleSingleState3.setSuffixLabel("");
        simpleSingleState[7]=simpleSingleState3;
    }

    /**
     * This method initializes simpleSingleState4   
     *
     */
    private void createSimpleSingleState4() {
        simpleSingleState4 = new SimpleSingleState(this, SWT.NONE);
        simpleSingleState4.setSuffixLabel("");
        simpleSingleState[6]=simpleSingleState4;
    }

    /**
     * This method initializes simpleSingleState5   
     *
     */
    private void createSimpleSingleState5() {
        simpleSingleState5 = new SimpleSingleState(this, SWT.NONE);
        simpleSingleState5.setSuffixLabel("-S ");
        simpleSingleState[5]=simpleSingleState5;
    }

    /**
     * This method initializes simpleSingleState6   
     *
     */
    private void createSimpleSingleState6() {
        simpleSingleState6 = new SimpleSingleState(this, SWT.NONE);
        simpleSingleState6.setSuffixLabel("");
        simpleSingleState[4]=simpleSingleState6;
    }

    /**
     * This method initializes simpleSingleState7   
     *
     */
    private void createSimpleSingleState7() {
        simpleSingleState7 = new SimpleSingleState(this, SWT.NONE);
        simpleSingleState7.setSuffixLabel("");
        simpleSingleState[3]=simpleSingleState7;
    }

    /**
     * This method initializes simpleSingleState8   
     *
     */
    private void createSimpleSingleState8() {
        simpleSingleState8 = new SimpleSingleState(this, SWT.NONE);
        simpleSingleState8.setSuffixLabel("-M ");
        simpleSingleState[2]=simpleSingleState8;
    }

    /**
     * This method initializes simpleSingleState9   
     *
     */
    private void createSimpleSingleState9() {
        simpleSingleState9 = new SimpleSingleState(this, SWT.NONE);
        simpleSingleState9.setSuffixLabel("");
        simpleSingleState[1]=simpleSingleState9;
    }

    /**
     * This method initializes simpleSingleState10  
     *
     */
    private void createSimpleSingleState10() {
        simpleSingleState10 = new SimpleSingleState(this, SWT.NONE);
        simpleSingleState10.setSuffixLabel("-L ");
        simpleSingleState[0]=simpleSingleState10;
    }

    public void setState(int value){
    	for (int i = 1; i < 11; i++) {
			if(i<=value)
				simpleSingleState[i-1].setMarkt(true);
			else
				simpleSingleState[i-1].setMarkt(false);				
		}
    }
    
}  //  @jve:decl-index=0:visual-constraint="10,10"
