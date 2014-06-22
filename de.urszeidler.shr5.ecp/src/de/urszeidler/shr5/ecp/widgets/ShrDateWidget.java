/**
 * 
 */
package de.urszeidler.shr5.ecp.widgets;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.observable.value.DateAndTimeObservableValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.ecp.edit.internal.swt.controls.ControlMessages;
import org.eclipse.emf.ecp.edit.internal.swt.controls.SingleControl;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;

/**
 * @author urs
 */
public class ShrDateWidget extends SingleControl {

    private DateTime dateWidget;

    /**
     * @wbp.parser.entryPoint
     */
    @Override
    protected void fillControlComposite(Composite composite) {
        final Composite dateTimeComposite = new Composite(composite, SWT.NONE);
        dateTimeComposite.setBackground(composite.getBackground());
        int numColumns = 3;
        if (isEmbedded()) {
            numColumns = 2;
        }
        GridLayoutFactory.fillDefaults().numColumns(numColumns).spacing(2, 0).equalWidth(false).applyTo(dateTimeComposite);

        GridDataFactory.fillDefaults().grab(true, false).align(SWT.FILL, SWT.BEGINNING).applyTo(dateTimeComposite);
        createDateAndTimeWidget(dateTimeComposite);

    }

    /**
     * This method creates the date widget, the time widget and the delete button.
     * 
     * @param composite the parent {@link Composite}
     */
    private void createDateAndTimeWidget(Composite composite) {

        dateWidget = new DateTime(composite, SWT.DATE | SWT.BORDER);
        dateWidget.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        dateWidget.setData(CUSTOM_VARIANT, "org_eclipse_emf_ecp_control_dateTime_date");
    }

    /**
     * {@inheritDoc}
     */
    public void setEditable(boolean isEditable) {
        dateWidget.setEnabled(isEditable);

    }

    @Override
    public Binding bindValue() {
        final IObservableValue dateObserver = SWTObservables.observeSelection(dateWidget);

        final IObservableValue target = new DateAndTimeObservableValue(dateObserver, new WritableValue());
        final Binding binding = getDataBindingContext().bindValue(target, getModelValue());
        return binding;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.emf.ecp.edit.internal.swt.controls.SingleControl#getUnsetLabelText()
     */
    @Override
    protected String getUnsetLabelText() {
        return ControlMessages.DateTimeControl_NoDateSetClickToSetDate;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.emf.ecp.edit.internal.swt.controls.SingleControl#getUnsetButtonTooltip()
     */
    @Override
    protected String getUnsetButtonTooltip() {
        return ControlMessages.DateTimeControl_UnsetDate;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.emf.ecp.edit.internal.swt.util.SWTControl#getControlForTooltip()
     */
    @Override
    protected Control[] getControlsForTooltip() {
        return new Control[]{ dateWidget };
    }

}
