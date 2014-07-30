/**
 * 
 */
package de.urszeidler.shr5.ecp.service;

import org.eclipse.ui.services.AbstractServiceFactory;
import org.eclipse.ui.services.IServiceLocator;

/**
 * @author urs
 */
public class UIServiceFactory extends AbstractServiceFactory {

    private ValidationServiceImpl vService;
    private ScriptService sService;

    /**
     * 
     */
    public UIServiceFactory() {
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.services.AbstractServiceFactory#create(java.lang.Class, org.eclipse.ui.services.IServiceLocator,
     * org.eclipse.ui.services.IServiceLocator)
     */
    @Override
    public Object create(Class serviceInterface, IServiceLocator parentLocator, IServiceLocator locator) {
        if (serviceInterface.equals(ValidationService.class)) {
            if (vService == null) {
                vService = new ValidationServiceImpl(locator);
            }
            return vService;
        }else  if (serviceInterface.equals(ScriptService.class)) {
            if (sService == null) {
                sService = new ScriptServiceImpl(locator);
            }
            return sService;
        }
        return null;
    }

}
