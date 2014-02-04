/**
 * 
 */
package de.urszeidler.shr5.ecp.opener;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.ui.util.ECPModelElementOpenTester;
import org.eclipse.emf.ecp.ui.util.ECPModelElementOpener;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.AbstraktModifikatoren;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.KiAdept;
import de.urszeidler.eclipse.shr5.Reichweite;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.util.Shr5Switch;
import de.urszeidler.eclipse.shr5Management.FreeStyleGenerator;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementSwitch;
import de.urszeidler.emf.commons.ui.editor.EObjectEditorInput;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.editor.ShadowrunEditor;

/**
 * @author urs
 * 
 */
public class ECPAttributModifikatorWertOpener implements ECPModelElementOpener, ECPModelElementOpenTester {

	/**
	 * 
	 */
	public ECPAttributModifikatorWertOpener() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.ecp.ui.util.ECPModelElementOpener#openModelElement(java
	 * .lang.Object, org.eclipse.emf.ecp.core.ECPProject)
	 */
	@Override
	public void openModelElement(Object element, ECPProject ecpProject) {
		EObjectEditorInput eObjectEditorInput = new EObjectEditorInput((EObject) element, ecpProject.getEditingDomain());
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
					.openEditor(eObjectEditorInput, ShadowrunEditor.id, true);
		} catch (PartInitException e) {
			Activator.logError("Error open editor " + ShadowrunEditor.id + "for object :" + element, e);
		}

	}

	@Override
	public int isApplicable(Object eObject) {
		Shr5Switch<Integer> shr5Switch = new Shr5Switch<Integer>() {
			// @Override
			// public Integer caseBeschreibbar(Beschreibbar object) {
			// return 0;
			// }

			@Override
			public Integer caseSpezies(Spezies object) {
				return 2;
			}

			@Override
			public Integer caseReichweite(Reichweite object) {
				return 2;
			}

			@Override
			public Integer caseFertigkeit(Fertigkeit object) {
				return 2;
			}

			@Override
			public Integer caseFertigkeitsGruppe(FertigkeitsGruppe object) {
				return 2;
			}

			@Override
			public Integer caseAbstraktGegenstand(AbstraktGegenstand object) {
				return 2;
			}

			@Override
			public Integer caseAbstraktModifikatoren(AbstraktModifikatoren object) {
				return 2;
			}

			@Override
			public Integer caseAbstraktPersona(AbstraktPersona object) {
				return 2;
			}

			@Override
			public Integer caseShrList(ShrList object) {
				return 2;
			}

			@Override
			public Integer caseKiAdept(KiAdept object) {
				return 2;
			}

		};
		Integer doSwitch = shr5Switch.doSwitch((EObject) eObject);
		if (doSwitch != null)
			return doSwitch;

		Shr5managementSwitch<Integer> shr5managementSwitch = new Shr5managementSwitch<Integer>() {
			
		    @Override
		    public Integer caseFreeStyleGenerator(FreeStyleGenerator object) {
		        return 2;
		    }
		    @Override
			public Integer caseShr5Generator(Shr5Generator object) {
				return 2;
			}

			@Override
			public Integer caseManagedCharacter(ManagedCharacter object) {
				return 2;
			}
		};
		doSwitch = shr5managementSwitch.doSwitch((EObject) eObject);
		if (doSwitch == null)
			return 0;
		return doSwitch;
		// return 0;
	}

}
