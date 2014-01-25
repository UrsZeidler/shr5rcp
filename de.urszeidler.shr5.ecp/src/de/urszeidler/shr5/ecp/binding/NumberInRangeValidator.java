package de.urszeidler.shr5.ecp.binding;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

/**
 * A simple validator for integer rages.
 * 
 * @author urs
 */
public class NumberInRangeValidator implements IValidator {
    private long min;
    private long max;
    protected String toMutchMessage = "To much.";
    protected String toLessMessage = "To less.";

    public NumberInRangeValidator(long min, long max) {
        this.min = min;
        this.max = max;
    }

    public NumberInRangeValidator(long min) {
        this.min = min;
        this.max = Long.MAX_VALUE;
    }

    @Override
    public IStatus validate(Object value) {
        if (!(value instanceof Number)) {
            throw new IllegalArgumentException("Parameter 'value' is not of type Number."); //$NON-NLS-1$
        }

        Number number = (Number)value;
        if (number.longValue() > max) {
            return ValidationStatus.error(toMutchMessage);
        }
        if (number.longValue() < min) {
            return ValidationStatus.error(toLessMessage);
        }

        return Status.OK_STATUS;
    }

    public void setToMutchMessage(String toMutchMessage) {
        this.toMutchMessage = toMutchMessage;
    }

    public void setToLessMessage(String toLessMessage) {
        this.toLessMessage = toLessMessage;
    }
}