package de.urszeidler.shr5.runtime.ui.widgets;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * Defines a state monitor for one damage state.
 * 
 * @author urs
 */
public class StateMonitorWidget extends Composite {

    //private WritableValue damageState = new WritableValue();
    //private WritableValue conditionMonitor = new WritableValue();
    private int maxConditions;
    private Composite composite_state;
    private List<SingleStateWidget> stateMonitors;
    private int style;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public StateMonitorWidget(Composite parent, int style) {
        super(parent, style);
        maxConditions = 11;

        this.style = style;
        setLayout(new FillLayout(SWT.HORIZONTAL));
        init();
    }

    private void init() {
        if (composite_state != null)
            composite_state.dispose();

        composite_state = new Composite(this, SWT.NONE);
        GridLayout layout = new GridLayout(4, false);
        layout.horizontalSpacing = 0;
        layout.verticalSpacing = 0;
        composite_state.setLayout(layout);

        int value = maxConditions;
        stateMonitors = new ArrayList<SingleStateWidget>(value);
        for (int i = 1; i <= value; i++) {
            SingleStateWidget stateWidget = new SingleStateWidget(composite_state, style);
            GridData gridData = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
            stateWidget.setLayoutData(gridData);
            stateMonitors.add(stateWidget);
            if (i % 3 == 0) {
                Label label = new Label(composite_state, style);
                label.setText(""+((i/3))*-1);
            }
        }
    }

    public void setDamage(int damage){
        for (int i = 0; i < stateMonitors.size(); i++) {
            SingleStateWidget singleStateWidget = stateMonitors.get(i);
            singleStateWidget.setMarkt(i<damage);
        }
     }
    
    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

    public void setMaxConditions(int maxConditions) {
        this.maxConditions = maxConditions;
        init();
        this.layout(true, true);
    }

}
