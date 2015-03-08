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
public class NewPersonaPartWizard extends AbstractNewItemWizard {
    public NewPersonaPartWizard() {
        setWindowTitle(Messages.NewPersonaPartWizard_titel);
//        setDefaultPageImageDescriptor(ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/newContractWizard.png"));
    }

    @Override
    protected Collection<EClass> provideClasses() {
        ArrayList<EClass> list = new ArrayList<EClass>();
        
        list.add(Shr5Package.Literals.CYBERWARE);
        list.add(Shr5Package.Literals.CYBERWARE_ENHANCEMENT);
        list.add(Shr5Package.Literals.CYBER_IMPLANT_WEAPON);
        list.add(Shr5Package.Literals.BIO_WARE);
        
        list.add(Shr5Package.Literals.KI_KRAFT);
        list.add(Shr5Package.Literals.ZAUBER);
        list.add(Shr5Package.Literals.PERSONA_EIGENSCHAFT);
        list.add(Shr5Package.Literals.FERTIGKEITS_GRUPPE);
        list.add(Shr5Package.Literals.FERTIGKEIT);
        list.add(Shr5Package.Literals.WISSENSFERTIGKEIT);
        list.add(Shr5Package.Literals.SPRACHFERTIGKEIT);
        list.add(Shr5Package.Literals.META_MAGIE);        
        list.add(Shr5Package.Literals.SCHUTZGEIST);
        list.add(Shr5Package.Literals.KOMPLEXE_FORM);
        list.add(Shr5Package.Literals.ECHO);
        
        return list;
     }
}
