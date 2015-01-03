/**
 * 
 */
package de.urszeidler.shr5.ecp.wizards;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.CharacterGroup;
import de.urszeidler.eclipse.shr5Management.PlayerManagement;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * @author urs
 */
public class NewShr5KarmaGeneratorWizard extends NewShr5GeneratorWizard {

    /**
     * 
     */
    public NewShr5KarmaGeneratorWizard() {
    }

    @Override
    protected CharacterGenerator<Shr5System> createGenerator() {
        return Shr5managementFactory.eINSTANCE.createShr5KarmaGenerator();
    }

    /**
     * Is called while iterating over the content.
     * 
     * @param obj
     */
    protected void filterObjects(Notifier obj) {
        if (obj instanceof PlayerManagement) {
            container.add((EObject)obj);
        } else if (obj instanceof Shr5System) {
            Shr5System t = (Shr5System)obj;
            if (t.getApplicableGenerators().contains(Shr5managementPackage.Literals.SHR5_KARMA_GENERATOR))
                systems.add((EObject)obj);
        } else if (obj instanceof CharacterGroup) {
            groups.add((EObject)obj);
        }
    }

    
    @Override
    public void addPages() {
        addPage(new NewCharacterWizardPage(container, systems, groups, selectedContainer, selectedSystem, selectedGroup,
                Messages.NewShr5KarmaGeneratorWizard_name, Messages.NewShr5KarmaGeneratorWizard_titel,
                Messages.NewShr5KarmaGeneratorWizard_description, ResourceManager.getPluginImageDescriptor(
                        "de.urszeidler.shr5.ecp", "images/KarmaGenerator32.png"))); //$NON-NLS-1$ //$NON-NLS-2$
    }

}
