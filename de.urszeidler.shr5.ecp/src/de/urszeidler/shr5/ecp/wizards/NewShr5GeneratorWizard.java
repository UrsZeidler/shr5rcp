/**
 * 
 */
package de.urszeidler.shr5.ecp.wizards;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.urszeidler.eclipse.shr5.util.Shr5ResourceImpl;
import de.urszeidler.eclipse.shr5Management.PlayerManagement;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.shr5.ecp.Activator;

/**
 * @author urs
 */
public class NewShr5GeneratorWizard extends Wizard implements INewWizard {

    /**
     * 
     */
    public NewShr5GeneratorWizard() {
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
     */
    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        EditingDomain edtingDomain = Activator.getDefault().getEdtingDomain();
        EList<Resource> resources = edtingDomain.getResourceSet().getResources();
        Collection<EObject> container = new ArrayList<EObject>();
        Collection<EObject> systems = new ArrayList<EObject>();

        TreeIterator<Notifier> allContents = edtingDomain.getResourceSet().getAllContents();
        while (allContents.hasNext()) {
            Notifier obj = allContents.next();
            if (obj instanceof PlayerManagement) {
                container.add((EObject)obj);
            }else if (obj instanceof Shr5System) {
                systems.add((EObject)obj);                
            }
        }
         
        System.out.println(container);
    }

    @Override
    public void addPages() {
        addPage(new NewCharacterWizardPage());
        super.addPages();
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.jface.wizard.Wizard#performFinish()
     */
    @Override
    public boolean performFinish() {
        // TODO Auto-generated method stub
        return false;
    }

}
