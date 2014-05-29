/**
 * 
 */
package de.urszeidler.shr5.ecp.wizards;

import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

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
    protected CharacterGenerator createGenerator() {
        return Shr5managementFactory.eINSTANCE.createShr5KarmaGenerator();
    }

    @Override
    public void addPages() {
        addPage(new NewCharacterWizardPage(container, systems, groups, selectedContainer, selectedSystem, selectedGroup, "Shr5KarmaGenerator",
                "Create a shr5 Karma Generator", "Creates a sh5  karma generator object for creating a character after the karma rules",
                ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/KarmaGenerator32.png")));
    }

}
