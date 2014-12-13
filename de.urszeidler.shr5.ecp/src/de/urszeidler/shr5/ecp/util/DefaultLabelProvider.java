/**
 * 
 */
package de.urszeidler.shr5.ecp.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import de.urszeidler.eclipse.shr5.gameplay.provider.GameplayEditPlugin;
import de.urszeidler.eclipse.shr5.provider.Shr5EditPlugin;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.provider.Shr5ManagementEditPlugin;
import de.urszeidler.shr5.scripting.provider.ScriptingEditPlugin;

/**
 * @author urs
 *
 */
public class DefaultLabelProvider extends LabelProvider {



    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
     */
    @Override
    public Image getImage(Object element) {
        return AdapterFactoryUtil.getInstance().getLabelProvider().getImage(element);
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
     */
    @Override
    public String getText(Object element) {
        if (element instanceof EClass) {
            EClass eclass = (EClass)element;
            
            String key = "_UI_" + eclass.getName() + "_type";
            try {
                String packageName = eclass.getEPackage().getName();
                if(packageName.equals("gameplay")){
                    return GameplayEditPlugin.INSTANCE.getString(key);
                }else if(packageName.equals("shr5Management")){
                    return Shr5ManagementEditPlugin.INSTANCE.getString(key);
                }else if(packageName.equals("scripting")){
                    return ScriptingEditPlugin.INSTANCE.getString(key);
                }
                
                
                return Shr5EditPlugin.INSTANCE.getString(key);
            } catch (Exception e) {
                return eclass.getName();
            }
        }
        
         return AdapterFactoryUtil.getInstance().getLabelProvider().getText(element);
    }

}
