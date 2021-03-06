/**
 * 
 */
package de.urszeidler.shr5.ecp.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.wb.swt.ResourceManager;

import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.CharacterGeneratorSystem;
import de.urszeidler.eclipse.shr5Management.CharacterGroup;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.PlayerManagement;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.opener.ECPAttributModifikatorWertOpener;
import de.urszeidler.shr5.ecp.preferences.PreferenceConstants;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

/**
 * @author urs
 */
public class NewShr5GeneratorWizard extends Wizard implements INewWizard {

    private static final String CHARACTER_PERSPECTIVE = "de.urszeidler.shr5.product.application.ShadowrunCharacterPerspective";
    protected List<EObject> container;
    protected List<EObject> systems;
    protected List<EObject> groups;

    protected WritableValue selectedContainer = new WritableValue();
    protected WritableValue selectedSystem = new WritableValue();
    protected WritableValue selectedGroup = new WritableValue();
    private String perspectivenId;

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
        // EList<Resource> resources = edtingDomain.getResourceSet().getResources();
        EObject selected = ShadowrunEditingTools.extractFirstEObject(selection);
        if (selected instanceof ManagedCharacter) {
            ManagedCharacter mc = (ManagedCharacter)selected;
            selected = mc.eContainer();
        }
        if (selected instanceof CharacterGroup) {
            CharacterGroup g = (CharacterGroup)selected;
            selectedGroup.setValue(g);
            if (g.eContainer() instanceof PlayerManagement) {
                PlayerManagement pm = (PlayerManagement)g.eContainer();
                selectedContainer.setValue(pm);
            }
        }

        container = new ArrayList<EObject>();
        systems = new ArrayList<EObject>();
        groups = new ArrayList<EObject>();

        TreeIterator<Notifier> allContents = edtingDomain.getResourceSet().getAllContents();
        while (allContents.hasNext()) {
            Notifier obj = allContents.next();
            filterObjects(obj);
        }
        perspectivenId = workbench.getActiveWorkbenchWindow().getActivePage().getPerspective().getId();

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
            Shr5System t = (Shr5System)obj;
            if (t.getApplicableGenerators().contains(Shr5managementPackage.Literals.SHR5_GENERATOR))
                systems.add((EObject)obj);
        } else if (obj instanceof CharacterGroup) {
            groups.add((EObject)obj);
        }
    }

    @Override
    public void addPages() {
        addPage(new NewCharacterWizardPage(container, systems, groups, selectedContainer, selectedSystem, selectedGroup,
                Messages.NewShr5GeneratorWizard_name, Messages.NewShr5GeneratorWizard_titel, Messages.NewShr5GeneratorWizard_description,
                ResourceManager.getPluginImageDescriptor("de.urszeidler.shr5.ecp", "images/CoreGenerator32.png"))); //$NON-NLS-1$ //$NON-NLS-2$
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.jface.wizard.Wizard#performFinish()
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean performFinish() {
        CharacterGenerator<CharacterGeneratorSystem> generator = (CharacterGenerator<CharacterGeneratorSystem>)createGenerator();

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
    protected CharacterGenerator<?> createGenerator() {
        Shr5Generator generator = Shr5managementFactory.eINSTANCE.createShr5Generator();
        return generator;
    }

    /**
     * 
     */
    private void switchPerspective() {
        if (CHARACTER_PERSPECTIVE.equals(perspectivenId))
            return;

        boolean doSwitch = false;
        IPreferenceStore store = Activator.getDefault().getPreferenceStore();
        String value = store.getString(PreferenceConstants.SWITCH_CHARACTERBUILDING_PERSPECTIVE);
        if (MessageDialogWithToggle.ALWAYS.equals(value)) {
            doSwitch();
            return;
        }
        if (MessageDialogWithToggle.NEVER.equals(value)) {
            return;
        }
        MessageDialogWithToggle open = MessageDialogWithToggle.open(MessageDialogWithToggle.QUESTION_WITH_CANCEL, getShell(),
                Messages.NewShr5GeneratorWizard_switch_perspective_titel, Messages.NewShr5GeneratorWizard_switch_perspective_message,
                Messages.NewShr5GeneratorWizard_switch_perspective_not_again_message, false, store,
                PreferenceConstants.SWITCH_CHARACTERBUILDING_PERSPECTIVE, SWT.NONE);

        doSwitch = open.getReturnCode() == 2;
        if (doSwitch)
            doSwitch();
    }

    /**
     * 
     */
    private void doSwitch() {
        try {
            PlatformUI.getWorkbench().showPerspective(CHARACTER_PERSPECTIVE, PlatformUI.getWorkbench().getActiveWorkbenchWindow());
        } catch (WorkbenchException e) {
            e.printStackTrace();
        }
    }

}
