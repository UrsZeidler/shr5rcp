/**
 * 
 */
package de.urszeidler.shr5.intro;

import java.util.Properties;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.intro.IIntroPart;
import org.eclipse.ui.intro.IIntroSite;
import org.eclipse.ui.intro.config.IIntroAction;

import de.urszeidler.shr5.ecp.wizards.NewFreeStyleGeneratorWizard;
import de.urszeidler.shr5.ecp.wizards.NewLifeModuleGeneratorWizard;
import de.urszeidler.shr5.ecp.wizards.NewShr5GeneratorWizard;
import de.urszeidler.shr5.ecp.wizards.NewShr5KarmaGeneratorWizard;
import de.urszeidler.shr5.ecp.wizards.NewSumToTenGeneratorWizard;

/**
 * @author urs
 */
public class CreateGenerator implements IIntroAction {

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.intro.config.IIntroAction#run(org.eclipse.ui.intro.IIntroSite, java.util.Properties)
     */
    @Override
    public void run(IIntroSite site, Properties params) {
        final IIntroPart introPart = PlatformUI.getWorkbench().getIntroManager().getIntro();
        PlatformUI.getWorkbench().getIntroManager().closeIntro(introPart);
        IWorkbenchWindow window = site.getWorkbenchWindow();
        String pID = params.getProperty("id");
        INewWizard generatorWizard;
        if ("1".equals(pID))
            generatorWizard = new NewShr5GeneratorWizard();
        else if ("2".equals(pID))
            generatorWizard = new NewShr5KarmaGeneratorWizard();
        else if ("3".equals(pID))
            generatorWizard = new NewFreeStyleGeneratorWizard();
        else if ("4".equals(pID))
            generatorWizard = new NewLifeModuleGeneratorWizard();
        else if ("5".equals(pID))
            generatorWizard = new NewSumToTenGeneratorWizard();
        else
            return;

        generatorWizard.init(window.getWorkbench(), null);
        WizardDialog dialog = new WizardDialog(window.getShell(), generatorWizard);

        dialog.open();

    }

}
