/**
 * 
 */
package de.urszeidler.shr5.ecp.opener;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.ui.util.ECPModelElementOpenTester;
import org.eclipse.emf.ecp.ui.util.ECPModelElementOpener;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.AbstraktModifikatoren;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Drug;
import de.urszeidler.eclipse.shr5.Fahrzeug;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.Reichweite;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.Software;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.Toxin;
import de.urszeidler.eclipse.shr5.Vertrag;
import de.urszeidler.eclipse.shr5.runtime.GruntTeam;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.Team;
import de.urszeidler.eclipse.shr5.runtime.util.RuntimeSwitch;
import de.urszeidler.eclipse.shr5.util.Shr5Switch;
import de.urszeidler.eclipse.shr5Management.CharacterGroup;
import de.urszeidler.eclipse.shr5Management.FreeStyleGenerator;
import de.urszeidler.eclipse.shr5Management.GruntGroup;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.PlayerManagement;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementSwitch;
import de.urszeidler.emf.commons.ui.editor.EObjectEditorInput;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.editor.ShadowrunEditor;
import de.urszeidler.shr5.runtime.ui.editor.RuntimeEditor;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.util.ScriptingSwitch;

/**
 * @author urs
 */
public class ECPAttributModifikatorWertOpener implements ECPModelElementOpener, ECPModelElementOpenTester {
    private static int RET = 3;

    /**
	 * 
	 */
    public ECPAttributModifikatorWertOpener() {
    }

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.emf.ecp.ui.util.ECPModelElementOpener#openModelElement(java
     * .lang.Object, org.eclipse.emf.ecp.core.ECPProject)
     */
    @Override
    public void openModelElement(Object element, ECPProject ecpProject) {
        openEditor(element, ecpProject);

    }

    /**
     * @param element
     * @param ecpProject
     */
    public static void openEditor(Object element, ECPProject ecpProject) {
        EObject eObject = (EObject)element;
        String name = eObject.eClass().getEPackage().getName();
        EObjectEditorInput eObjectEditorInput = new EObjectEditorInput(eObject, ecpProject.getEditingDomain());
        try {
            if ("runtime".equals(name) || "scripting".equals(name)) {
                IEditorPart openEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                        .openEditor(eObjectEditorInput, RuntimeEditor.id, true);
                openEditor.setFocus();
            } else
                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(eObjectEditorInput, ShadowrunEditor.id, true);
        } catch (PartInitException e) {
            Activator.logError("Error open editor " + ShadowrunEditor.id + "for object :" + element, e);
        }
    }

    @Override
    public int isApplicable(Object eObject) {
        ScriptingSwitch<Integer> scriptingSwitchView = new ScriptingSwitch<Integer>() {
            @Override
            public Integer caseScript(Script object) {
                return RET;
            }

            @Override
            public Integer casePlacement(Placement object) {
                return RET;
            }
        };
        Integer doSwitch = scriptingSwitchView.doSwitch((EObject)eObject);
        if (doSwitch != null)
            return doSwitch;

        RuntimeSwitch<Integer> runtimeSwitch = new RuntimeSwitch<Integer>() {
            @Override
            public Integer caseRuntimeCharacter(RuntimeCharacter object) {
                return RET;
            }
            @Override
            public Integer caseTeam(Team object) {
                return RET;
            }
            
            @Override
            public Integer caseGruntTeam(GruntTeam object) {
                return RET;
            }
        };
        doSwitch = runtimeSwitch.doSwitch((EObject)eObject);
        if (doSwitch != null)
            return doSwitch;

        Shr5Switch<Integer> shr5Switch = new Shr5Switch<Integer>() {
            // @Override
            // public Integer caseBeschreibbar(Beschreibbar object) {
            // return 0;
            // }
            @Override
            public Integer caseSourceBook(SourceBook object) {
                return RET;
            }
            @Override
            public Integer caseSpezies(Spezies object) {
                return RET;
            }

            @Override
            public Integer caseReichweite(Reichweite object) {
                return RET;
            }

            @Override
            public Integer caseFertigkeit(Fertigkeit object) {
                return RET;
            }

            @Override
            public Integer caseFertigkeitsGruppe(FertigkeitsGruppe object) {
                return RET;
            }

            @Override
            public Integer caseAbstraktGegenstand(AbstraktGegenstand object) {
                return RET;
            }

            @Override
            public Integer caseAbstraktModifikatoren(AbstraktModifikatoren object) {
                return RET;
            }

            @Override
            public Integer caseAbstraktPersona(AbstraktPersona object) {
                return RET;
            }

            @Override
            public Integer caseShrList(ShrList object) {
                return RET;
            }

            @Override
            public Integer caseSoftware(Software object) {
                return RET;
            }

            @Override
            public Integer caseVertrag(Vertrag object) {
                return RET;
            }

            @Override
            public Integer caseKiAdept(KiAdept object) {
                return RET;
            }

            @Override
            public Integer caseFahrzeug(Fahrzeug object) {
                return RET;
            }

            @Override
            public Integer caseToxin(Toxin object) {
                return RET;
            }

            @Override
            public Integer caseDrug(Drug object) {
                return RET;
            }
        };
        doSwitch = shr5Switch.doSwitch((EObject)eObject);
        if (doSwitch != null)
            return doSwitch;

        Shr5managementSwitch<Integer> shr5managementSwitch = new Shr5managementSwitch<Integer>() {

            @Override
            public Integer caseFreeStyleGenerator(FreeStyleGenerator object) {
                return RET;
            }

            @Override
            public Integer caseShr5Generator(Shr5Generator object) {
                return RET;
            }

            @Override
            public Integer caseShr5KarmaGenerator(Shr5KarmaGenerator object) {
                return RET;
            }

            @Override
            public Integer caseManagedCharacter(ManagedCharacter object) {
                return RET;
            }

            @Override
            public Integer caseGruntGroup(GruntGroup object) {
                return RET;
            }

            @Override
            public Integer caseCharacterGroup(CharacterGroup object) {
                return RET;
            }

            @Override
            public Integer casePlayerManagement(PlayerManagement object) {
                return RET;
            }

            @Override
            public Integer caseShr5System(Shr5System object) {
                return RET;
            }
        };
        doSwitch = shr5managementSwitch.doSwitch((EObject)eObject);
        if (doSwitch == null)
            return 0;
        return doSwitch;
        // return 0;
    }

}
