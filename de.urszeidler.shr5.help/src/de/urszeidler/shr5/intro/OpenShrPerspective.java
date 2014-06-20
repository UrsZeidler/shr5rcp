/**
 * 
 */
package de.urszeidler.shr5.intro;

import java.util.Properties;

import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.intro.IIntroPart;
import org.eclipse.ui.intro.IIntroSite;
import org.eclipse.ui.intro.config.IIntroAction;

/**
 * @author urs
 */
public class OpenShrPerspective implements IIntroAction {

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
        try {
            window.getWorkbench().showPerspective(pID, window);
        } catch (WorkbenchException e) {
            //Activator.getDefault().
        }

    }

}
