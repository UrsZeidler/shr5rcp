/**
 * 
 */
package de.urszeidler.shr5.runtime.ui.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.PartInitException;

import de.urszeidler.eclipse.shr5.runtime.GruntTeam;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimePackage;
import de.urszeidler.eclipse.shr5.runtime.Team;
import de.urszeidler.eclipse.shr5.runtime.util.RuntimeSwitch;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.DefaultReferenceManager;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry;
import de.urszeidler.shr5.ecp.editor.AbstractShr5Editor;
import de.urszeidler.shr5.ecp.editor.ShrEditingState;
import de.urszeidler.shr5.ecp.editor.pages.BeschreibbarContainterPage;
import de.urszeidler.shr5.ecp.editor.pages.DefaultEmfFormsPage;
import de.urszeidler.shr5.runtime.ui.editor.pages.PlacementPage;
import de.urszeidler.shr5.runtime.ui.editor.pages.RuntimeCharacterPage;
import de.urszeidler.shr5.runtime.ui.editor.pages.ScriptPage;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;
import de.urszeidler.shr5.scripting.util.ScriptingSwitch;

/**
 * @author urs
 *
 */
public class RuntimeEditor extends AbstractShr5Editor {

    private static final String EMPTY = ""; //$NON-NLS-1$
    private ShrEditingState editingMode = ShrEditingState.CUSTOM;
    public static final String id = "de.urszeidler.eclipse.shadowrun.presentation.editors.RuntimeEditorID"; //$NON-NLS-1$

    protected ReferenceManager manager = new DefaultReferenceManager(AdapterFactoryUtil.getInstance().getItemDelegator()){
        public void handleAdd(FormbuilderEntry e, EObject object) {
            
            super.handleAdd(e, object);
        };
        
        @Override
        protected Object provideObject(FormbuilderEntry e, EObject object) {
            //return super.provideObject(e, object);
            return defaultCreationDialog(e, object);
        }
        
    };

    @Override
    protected void addPages() {
        RuntimeSwitch<Object> runtimeSwitchEditor = new RuntimeSwitch<Object>(){
            @Override
            public Object caseRuntimeCharacter(RuntimeCharacter object) {
                try {
                    addPage(new RuntimeCharacterPage(RuntimeEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating SpeziesPage", e);//$NON-NLS-1$
                }
                return null;
            }
            
            @Override
            public Object caseGruntTeam(GruntTeam object) {
                try {
                    addPage(new BeschreibbarContainterPage(RuntimeEditor.this, EMPTY, labelProvider.getText(object.eClass()), object,
                           editingDomain, manager, RuntimePackage.Literals.GRUNT_TEAM__GRUNT_GROUP,RuntimePackage.Literals.TEAM__MEMBERS));
               } catch (PartInitException e) {
                   logError("error creating FertigkeitPage", e);//$NON-NLS-1$
               }
               return this;
            }
            
            @Override
            public Object caseTeam(Team object) {
                try {
                     addPage(new BeschreibbarContainterPage(RuntimeEditor.this, EMPTY, labelProvider.getText(object.eClass()), object,
                            editingDomain, manager, RuntimePackage.Literals.TEAM__MEMBERS));
                } catch (PartInitException e) {
                    logError("error creating FertigkeitPage", e);//$NON-NLS-1$
                }
                return this;
            }
           
        };
        
//        RuntimeSwitch<Object> runtimeSwitchView = new RuntimeSwitch<Object>(){
//            
//            
//        };
//        
        ScriptingSwitch<Object> scriptingSwitchView = new ScriptingSwitch<Object>(){
            
            
            @Override
            public Object caseScript(Script object) {
                try {
                    addPage(new ScriptPage(RuntimeEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating SpeziesPage", e);//$NON-NLS-1$
                }
                return null;
            }
            
            @Override
            public Object casePlacement(Placement object) {
                try {
                    addPage(new PlacementPage(RuntimeEditor.this, EMPTY, labelProvider.getText(object.eClass()), object, editingDomain, manager));
                } catch (PartInitException e) {
                    logError("error creating SpeziesPage", e);//$NON-NLS-1$
                }
                return null;
            }
        };
        
        if(editingMode==ShrEditingState.CUSTOM){
            runtimeSwitchEditor.doSwitch(theEObject);
            scriptingSwitchView.doSwitch(theEObject);            
        }
        
        try {
            addPage(new DefaultEmfFormsPage(RuntimeEditor.this, "Default_EMF_Form_Page", "default form", theEObject)); //$NON-NLS-1$
        } catch (PartInitException e) {
            logError("error creating DefaultEmfFormsPage", e);//$NON-NLS-1$
        }

    }
    

 

}
