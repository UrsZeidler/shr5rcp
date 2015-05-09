/**
 * 
 */
package de.urszeidler.shr5.ecp.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;

import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.emf.commons.ui.editor.EObjectEditorInput;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.util.DefaultLabelProvider;

/**
 * @author urs
 */
public class ShrEditorInput extends EObjectEditorInput implements IPersistableElement {

    private static final String EID = "EID";
    private LabelProvider labelProvider = new DefaultLabelProvider();

    public ShrEditorInput(EObject eobject) {
        super(eobject);
    }

    public ShrEditorInput(EObject eobject, EditingDomain editingDomain) {
        super(eobject, editingDomain);
    }

    @Override
    public String getToolTipText() {
        return labelProvider.getText(getEobject());
    }

    @Override
    public IPersistableElement getPersistable() {
        return this;
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        Image image = labelProvider.getImage(getEobject());
        if (image == null)
            return null;
        return ImageDescriptor.createFromImage(image);
    }

    @Override
    public String getName() {
        return labelProvider.getText(getEobject());
    }

    @Override
    public void saveState(IMemento memento) {
        memento.putString(EID, ShadowrunTools.getResourceId(getEobject()));
    }

    @Override
    public String getFactoryId() {
        return ShrEditorInputFactory.ID;
    }

    public static ShrEditorInput createShrEditorInput(IMemento memento) {
        try {
            String id = memento.getString(EID);
            EObject eObjectFromId = ShadowrunTools.getEObjectFromId(id,
                    Activator.getDefault().getEdtingDomain().getResourceSet().getResources().get(0));
            return new ShrEditorInput(eObjectFromId, Activator.getDefault().getEdtingDomain());

        } catch (Exception e) {
          return null;
        }
    }
}
