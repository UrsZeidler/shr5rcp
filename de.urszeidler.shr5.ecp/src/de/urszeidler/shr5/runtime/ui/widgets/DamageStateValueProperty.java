/**
 * 
 */
package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.jface.databinding.swt.WidgetValueProperty;

/**
 * A property for the damage state.
 * 
 * @author urs
 */
public class DamageStateValueProperty extends WidgetValueProperty {

    public DamageStateValueProperty() {
        super();
    }

    @Override
    protected Object doGetValue(Object source) {
        return 0;
    }

    @Override
    protected void doSetValue(Object source, Object value) {
        if (source == null || value == null)
            return;
        ((StateMonitorWidget)source).setDamage(((Integer)value).intValue());
    }

    @Override
    public Object getValueType() {
        return Integer.TYPE;
    }

}
