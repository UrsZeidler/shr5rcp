package de.urszeidler.shr5.ecp.wizards.createItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

public class AbstractNewItemWizard extends Wizard implements INewWizard {

    private List<EObject> allContainers;
    private Collection<EClass> allTypes;
    // private EObject selectedContainer;

    protected WritableValue selectedContainerValue = new WritableValue();
    protected WritableValue selectedType = new WritableValue();
    protected WritableValue selectedName = new WritableValue();
    protected EditingDomain editingDomain;
    private EObject newObject;

    public AbstractNewItemWizard() {
        
    }

    @Override
    public void addPages() {
        addPage(new NewItemWizardPage(this));
        // addPage(new NewItemDetailWizardPage(this));
    }

    @Override
    public IWizardPage getNextPage(IWizardPage page) {
        if (page instanceof NewItemWizardPage) {
            NewItemWizardPage nip = (NewItemWizardPage)page;
            if (nip.isPageComplete())
                return new NewItemDetailWizardPage(this);
        }
        return super.getNextPage(page);
    }

    @Override
    public boolean performFinish() {
        if (getCreatedObject() == null)
            return false;

        ShadowrunEditingTools.openEObject(newObject);
        return true;
    }

    @Override
    public boolean performCancel() {
        if (getCreatedObject() == null)
            return true;

        ShrList sl = (ShrList)selectedContainerValue.getValue();
        sl.getEntries().remove(getCreatedObject());
        newObject = null;
        return true;
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {

        editingDomain = Activator.getDefault().getEdtingDomain();
        selectedContainerValue.setValue(ShadowrunEditingTools.extractFirstEObject(selection));
        allContainers = new ArrayList<EObject>();
        //
        TreeIterator<Notifier> allContents = editingDomain.getResourceSet().getAllContents();

        while (allContents.hasNext()) {
            Notifier obj = allContents.next();
            filterObjects(obj);
        }
        // perspectivenId = workbench.getActiveWorkbenchWindow().getActivePage().getPerspective().getId();
        allTypes = provideClasses();
        if(!(selectedContainerValue.getValue() instanceof ShrList)&& allContainers.size()>0)
            selectedContainerValue.setValue(allContainers.get(0));

    }

    /**
     * Provide the list of created able objects.
     * 
     * @return
     */
    protected Collection<EClass> provideClasses() {
        if(!(selectedContainerValue.getValue() instanceof ShrList)&& allContainers.size()>0)
                selectedContainerValue.setValue(allContainers.get(0));

        Collection<EClass> filteredEClasses = ShadowrunEditingTools.provideNewClassTypes((EObject)selectedContainerValue.getValue(),
                Shr5Package.Literals.SHR_LIST__ENTRIES, editingDomain);// provideNewClassTypes(object,

        if (!filteredEClasses.contains(Shr5managementPackage.Literals.PACK))
            filteredEClasses.add(Shr5managementPackage.Literals.PACK);
        
        filteredEClasses.add(Shr5managementPackage.Literals.SHR5_SYSTEM);
        filteredEClasses.add(Shr5managementPackage.Literals.FREE_STYLE);

        return filteredEClasses;
    }

    private void filterObjects(Notifier obj) {
        if (obj instanceof ShrList) {
            allContainers.add((EObject)obj);
        }

    }

    public List<EObject> getAllContainers() {
        return allContainers;
    }

    public Collection<EClass> getAllTypes() {
        return allTypes;
    }

    // public EObject getSelectedContainer() {
    // return selectedContainer;
    // }

    public WritableValue getSelectedContainerValue() {
        return selectedContainerValue;
    }

    public WritableValue getSelectedType() {
        return selectedType;
    }

    public WritableValue getSelectedName() {
        return selectedName;
    }

    public EditingDomain getEditingDomain() {
        return editingDomain;
    }

    public EObject getCreatedObject() {
        if (newObject == null) {
            EClass value = (EClass)selectedType.getValue();
            if(value==null)
                return null;
            newObject = null;
            try {
                EPackage ePackage = value.getEPackage();
                EFactory eFactoryInstance = ePackage.getEFactoryInstance();
                newObject = eFactoryInstance.create(value);
            } catch (Exception e) {
                try {
                    newObject = Shr5Factory.eINSTANCE.create(value);
                } catch (Exception e1) {
                    newObject = Shr5managementFactory.eINSTANCE.create(value);
                }
            }
            ShrList value2 = (ShrList)selectedContainerValue.getValue();
            value2.getEntries().add(newObject);
        }
        return newObject;
    }

}
