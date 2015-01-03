/**
 * 
 */
package de.urszeidler.shr5.ecp.wizards;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.CharacterGroup;
import de.urszeidler.eclipse.shr5Management.FreeStyle;
import de.urszeidler.eclipse.shr5Management.PlayerManagement;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * @author urs
 */
public class NewFreeStyleGeneratorWizard extends NewShr5GeneratorWizard {

    /**
     * 
     */
    public NewFreeStyleGeneratorWizard() {
    }

    /**
     * Is called while iterating over the content.
     * 
     * @param obj
     */
    protected void filterObjects(Notifier obj) {
        if (obj instanceof PlayerManagement) {
            container.add((EObject)obj);
        } else if (obj instanceof FreeStyle) {
            systems.add((EObject)obj);
        } else if (obj instanceof CharacterGroup) {
            groups.add((EObject)obj);
        }
    }

    @Override
    protected CharacterGenerator<FreeStyle> createGenerator() {
        return Shr5managementFactory.eINSTANCE.createFreeStyleGenerator();
    }

    @Override
    public void addPages() {
        addPage(new NewCharacterWizardPage(container, systems, groups, selectedContainer, selectedSystem, selectedGroup,
                Messages.NewFreeStyleGeneratorWizard_name, Messages.NewFreeStyleGeneratorWizard_titel,
                Messages.NewFreeStyleGeneratorWizard_description, ResourceManager.getPluginImageDescriptor(
                        "de.urszeidler.shr5.ecp", "images/FreestyleGenerator32.png"))); //$NON-NLS-1$ //$NON-NLS-2$
    }

}
