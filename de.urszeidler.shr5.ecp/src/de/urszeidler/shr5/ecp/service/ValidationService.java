/**
 * 
 */
package de.urszeidler.shr5.ecp.service;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;

/**
 * @author urs
 */
public interface ValidationService {

    void registerValidationTarget(ValidationTarget target);

    void updateValidation(EObject eobject);

    void updateValidation(EObject eobject, Diagnostic diagnostic);
}
