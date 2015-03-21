package de.urszeidler.shr5.ecp.editor.actions;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.wb.swt.ResourceManager;

public class DuplicateObjectAction extends Action {
    private EObject theObject;

    public DuplicateObjectAction(EObject object) {
        this.theObject = object;
        setToolTipText("Create a copy of the object in this container.");
        setImageDescriptor(ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/print_edit.gif"));
    }

    @Override
    public void run() {
        EStructuralFeature eContainingFeature = theObject.eContainingFeature();
        EObject eContainer = theObject.eContainer();
        boolean canExecute = eContainer != null && eContainingFeature != null && eContainingFeature.isChangeable() && eContainingFeature.isMany();
        if (canExecute) {
            EObject copy = EcoreUtil.copy(theObject);
            List<EObject> eGet = (List<EObject>)eContainer.eGet(eContainingFeature);
            eGet.add(copy);
        }
    }
}