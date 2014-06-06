/**
 * 
 */
package de.urszeidler.shr5.ecp.service;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;

/**
 * @author urs
 *
 */
public interface ValidationTarget {

    void setValidation(EObject object, Diagnostic diagnostic);
}
