/**
 * 
 */
package de.urszeidler.shr5.ecp.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * @author urs
 */
public class SimpleNameLabelProvider extends DefaultLabelProvider {

    /*
     * (non-Javadoc)
     * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
     */
    @Override
    public String getText(Object element) {
        
        if (element instanceof EObject) {
            EObject eo = (EObject)element;
            EClass eClass = eo.eClass();
            String eClassName = getEClassName(eClass);
            String text = super.getText(element);
            
            text =  text.replaceFirst(eClassName, "");
            return text;
        }
        return super.getText(element);
    }

}
