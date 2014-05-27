/**
 * 
 */
package de.urszeidler.shr5.ecp.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;

import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem;
import de.urszeidler.eclipse.shr5Management.CharacterGroup;
import de.urszeidler.eclipse.shr5Management.PlayerManagement;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.opener.ECPAttributModifikatorWertOpener;

/**
 * @author urs
 */
public class NewShr5GeneratorWizard extends Wizard implements INewWizard {

    private static final String SWITCH_PERSPECTIVE = "SWITCH_PERSPECTIVE";
    protected List<EObject> container;
    protected List<EObject> systems;
    protected List<EObject> groups;

    private WritableValue selectedContainer = new WritableValue();
    private WritableValue selectedSystem = new WritableValue();
    private WritableValue selectedGroup = new WritableValue();

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
        container = new ArrayList<EObject>();
        systems = new ArrayList<EObject>();
        groups = new ArrayList<EObject>();

        TreeIterator<Notifier> allContents = edtingDomain.getResourceSet().getAllContents();
        while (allContents.hasNext()) {
            Notifier obj = allContents.next();
            filterObjects(obj);
        }

        System.out.println(container);
    }

    /**
     * Is called while iterating over the content.
     * 
     * @param obj
     */
    protected void filterObjects(Notifier obj) {
        if (obj instanceof PlayerManagement) {
            container.add((EObject)obj);
        } else if (obj instanceof Shr5System) {
            systems.add((EObject)obj);
        } else if (obj instanceof CharacterGroup) {
            groups.add((EObject)obj);
        }
    }

    @Override
    public void addPages() {
        addPage(new NewCharacterWizardPage(container, systems, groups, selectedContainer, selectedSystem, selectedGroup));
        super.addPages();
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.jface.wizard.Wizard#performFinish()
     */
    @Override
    public boolean performFinish() {
        CharacterGenerator generator = createGenerator();

        generator.setSelectedGroup((CharacterGroup)selectedGroup.getValue());
        generator.setGenerator((CharacterGeneratorSystem)selectedSystem.getValue());
        EditingDomain edtingDomain = Activator.getDefault().getEdtingDomain();
        Command command = AddCommand.create(edtingDomain, selectedContainer.getValue(), Shr5managementPackage.Literals.PLAYER_MANAGEMENT__GENERATORS,
                generator);
        edtingDomain.getCommandStack().execute(command);

        switchPerspective();

        ECPAttributModifikatorWertOpener.openEditor(generator, Activator.getDefault().getDefaultEcpProject());

        return true;
    }

    /**
     * Factory method to create the generator object of this wizard.
     * 
     * @return
     */
    protected CharacterGenerator createGenerator() {
        Shr5Generator generator = Shr5managementFactory.eINSTANCE.createShr5Generator();
        return generator;
    }

    /**
     * 
     */
    private void switchPerspective() {
        boolean doSwitch = false;
        IPreferenceStore store = Activator.getDefault().getPreferenceStore();
        String value = store.getString(SWITCH_PERSPECTIVE);
        if (MessageDialogWithToggle.ALWAYS.equals(value)) {
            doSwitch();
            return;
        }
        if (MessageDialogWithToggle.NEVER.equals(value)) {
            return;
        }
        MessageDialogWithToggle open = MessageDialogWithToggle.open(MessageDialogWithToggle.QUESTION_WITH_CANCEL, getShell(), "Switch Perspective",
                "The prefered perspective is the character building perspectice. You want to switch ?", "don't ask again", false, store,
                SWITCH_PERSPECTIVE, SWT.NONE);
        
        doSwitch = open.getReturnCode() == 2;
        if (doSwitch)
            doSwitch();
    }

    /**
     * 
     */
    private void doSwitch() {
        try {
            PlatformUI.getWorkbench().showPerspective("de.urszeidler.shr5.product.application.ShadowrunCharacterPerspective",
                    PlatformUI.getWorkbench().getActiveWorkbenchWindow());
        } catch (WorkbenchException e) {
            e.printStackTrace();
        }
    }

}
