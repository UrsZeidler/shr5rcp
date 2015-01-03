/**
 * 
 */
package de.urszeidler.shr5.ecp.wizards.createItem;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EClass;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.shr5.ecp.wizards.Messages;

/**
 * @author urs
 */
public class NewDefinitionWizard extends AbstractNewItemWizard {
    public NewDefinitionWizard() {
        setWindowTitle(Messages.NewDefinitionWizard_titel);
//        setDefaultPageImageDescriptor(ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/newContractWizard.png"));
    }

    @Override
    protected Collection<EClass> provideClasses() {
        ArrayList<EClass> list = new ArrayList<EClass>();
        
        list.add(Shr5Package.Literals.SOURCE_BOOK);        
        list.add(Shr5Package.Literals.CRITTER);
        list.add(Shr5Package.Literals.CRITTER_KRAFT);
        list.add(Shr5Package.Literals.REICHWEITE);
//        list.add(Shr5Package.Literals.LIFESTYLE_OPTION);
         
        return list;
     }
}
