/**
 * 
 */
package de.urszeidler.shr5.ecp.wizards.createItem;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EClass;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.shr5.ecp.wizards.Messages;

/**
 * @author urs
 */
public class NewManagementWizard extends AbstractNewItemWizard {
    public NewManagementWizard() {
        setWindowTitle(Messages.NewManagementWizard_titel);
//        setDefaultPageImageDescriptor(ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/newContractWizard.png"));
    }

    @Override
    protected Collection<EClass> provideClasses() {
        ArrayList<EClass> list = new ArrayList<EClass>();
        
        list.add(Shr5managementPackage.Literals.PACK);
        list.add(Shr5managementPackage.Literals.CHARACTER_ADVANCEMENT_SYSTEM);
        list.add(Shr5managementPackage.Literals.SHR5_SYSTEM);
        list.add(Shr5managementPackage.Literals.FREE_STYLE);
        
        list.add(Shr5Package.Literals.SHR_LIST);
        return list;
    }
}
