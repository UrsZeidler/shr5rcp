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
        addPage(new NewCharacterWizardPage(container, systems, groups, selectedContainer, selectedSystem, selectedGroup,
                Messages.NewShr5KarmaGeneratorWizard_name, Messages.NewShr5KarmaGeneratorWizard_titel,
                Messages.NewShr5KarmaGeneratorWizard_description, ResourceManager.getPluginImageDescriptor(
                        "de.urszeidler.shr5.ecp", "images/KarmaGenerator32.png"))); //$NON-NLS-1$ //$NON-NLS-2$
    }

}
