package de.urszeidler.shr5.runtime.ui.widgets;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * Defines a state monitor for one damage state.
 * 
 * @author urs
 */
public class StateMonitorWidget extends Composite implements IPropertyListener {

    private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
    private int maxConditions;
    private Composite composite_state;
    private List<SingleStateWidget> stateMonitors;
    private int style;
    private int column = 3;
    private boolean showLable = true;
    private int damage;

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

        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);
        init();
    }

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public StateMonitorWidget(Composite parent, int style, int column, boolean showlable) {
        super(parent, style);
        maxConditions = 11;
        this.column = column;
        this.showLable = showlable;

        this.style = style;
        setLayout(new FillLayout(SWT.HORIZONTAL));

        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);
        init();
    }

    private void init() {

        if (composite_state != null)
            composite_state.dispose();

        composite_state = new Composite(this, SWT.NONE);
        GridLayout layout = new GridLayout(column + 1, false);
        layout.marginWidth = 2;
        layout.marginHeight = 2;
        layout.horizontalSpacing = 0;
        layout.verticalSpacing = 0;
        composite_state.setLayout(layout);
        toolkit.adapt(composite_state);
        toolkit.paintBordersFor(composite_state);

        int value = maxConditions;
        stateMonitors = new ArrayList<SingleStateWidget>(value);
        for (int i = 1; i <= value; i++) {
            SingleStateWidget stateWidget = new SingleStateWidget(composite_state, style);
            GridData gridData = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
            stateWidget.setLayoutData(gridData);
            stateWidget.setChangeListener(this);
            stateMonitors.add(stateWidget);
            if (showLable)
                if (i % column == 0) {
                    Label label = toolkit.createLabel(composite_state, "", style);
                    label.setText("" + ((i / column)) * -1);
                }
        }
    }

    public void setDamage(int damage) {
        for (int i = 0; i < stateMonitors.size(); i++) {
            SingleStateWidget singleStateWidget = stateMonitors.get(i);
            singleStateWidget.setMarkt(i < damage);
            this.damage = damage;
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

    @Override
    public void propertyChanged(Object source, int propId) {
        if (source instanceof SingleStateWidget) {
            SingleStateWidget ssw = (SingleStateWidget)source;
            int indexOf = stateMonitors.indexOf(source) + 1;
            if (ssw.isMarkt()) {
                if (indexOf == damage)
                    setDamage(0);
                else
                    setDamage(indexOf);
            } else
                setDamage(indexOf);
            Event event = new Event();
            event.widget = this;
            notifyListeners(SWT.CHANGED, event);
        }

    }

    public int getDamage() {
        return damage;
    }

}
