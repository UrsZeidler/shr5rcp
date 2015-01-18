/**
 * 
 */
package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.jface.databinding.swt.WidgetValueProperty;
import org.eclipse.swt.SWT;

/**
 * A property for the damage state.
 * 
 * @author urs
 */
public class DamageStateValueProperty extends WidgetValueProperty {

    public DamageStateValueProperty() {
        super(SWT.CHANGED);
    }

    @Override
    protected Object doGetValue(Object source) {
        if (source == null)
            return 0;
        return ((StateMonitorWidget)source).getDamage();
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
