/**
 * 
 */
package de.urszeidler.shr5.ecp.wizards;

import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * @author urs
 *
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
}
