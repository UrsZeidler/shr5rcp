/**
 * 
 */
package de.urszeidler.shr5.intro;

import java.util.Properties;

import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.IPreferencePage;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.preference.PreferenceNode;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.intro.IIntroPart;
import org.eclipse.ui.intro.IIntroSite;
import org.eclipse.ui.intro.config.IIntroAction;

import de.urszeidler.shr5.ecp.preferences.SourcebookViewerPreferences;

/**
 * @author urs
 */
public class OpenShrPrefs implements IIntroAction {

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

        if ("1".equals(pID)) {
            IPreferencePage page = new SourcebookViewerPreferences();
            PreferenceManager mgr = new PreferenceManager();
            IPreferenceNode node = new PreferenceNode("1", page);
            mgr.addToRoot(node);
            PreferenceDialog dialog = new PreferenceDialog(window.getShell(), mgr);
            dialog.create();
            dialog.setMessage(page.getTitle());
            dialog.open();
        }
    }

}
