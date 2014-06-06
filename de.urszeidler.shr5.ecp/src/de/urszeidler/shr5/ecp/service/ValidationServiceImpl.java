/**
 * 
 */
package de.urszeidler.shr5.ecp.service;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.services.IServiceLocator;

/**
 * Keeps track of the validation results. And notify a target.
 * 
 * @author urs
 */
public class ValidationServiceImpl implements ValidationService {

    private IServiceLocator locator;
    private ValidationTarget target;
    private Map<EObject, Diagnostic> validationResults = new HashMap<EObject, Diagnostic>();

    public ValidationServiceImpl(IServiceLocator locator) {
        this.locator = locator;
    }

    @Override
    public void registerValidationTarget(ValidationTarget target) {
        this.target = target;

    }

    @Override
    public void updateValidation(EObject eobject) {
        Diagnostic diagnostic = validationResults.get(eobject);
        if (diagnostic != null)
            updateTarget(eobject, diagnostic);
    }

    @Override
    public void updateValidation(EObject eobject, Diagnostic diagnostic) {
        validationResults.put(eobject, diagnostic);
        updateTarget(eobject, diagnostic);
    }

    private void updateTarget(EObject eobject, Diagnostic diagnostic) {
        if (target != null)
            target.setValidation(eobject, diagnostic);
    }
}
