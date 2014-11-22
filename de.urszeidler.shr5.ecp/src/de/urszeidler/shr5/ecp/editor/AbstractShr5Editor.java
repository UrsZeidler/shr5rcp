package de.urszeidler.shr5.ecp.editor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;
import de.urszeidler.emf.commons.ui.editor.BasicEditor;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.dialogs.FeatureEditorDialogWert;
import de.urszeidler.shr5.ecp.editor.pages.Messages;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

/**
 * Holds the basic behavior.
 * 
 * @author urs
 */
public abstract class AbstractShr5Editor extends BasicEditor<EObject> {

    protected ReferenceManager manager;

    public AbstractShr5Editor() {
        super();
        manager = createReferenceManager();
    }

    /**
     * @return
     */
    protected ShrReferenceManager createReferenceManager() {
        return new ShrReferenceManager(this, AdapterFactoryUtil.getInstance().getItemDelegator(),getEditingDomain());
    }

    @Override
    protected void initAdatpterFactory() {
        adapterFactory = AdapterFactoryUtil.getInstance().getAdapterFactory();
        basicContentProvider = new AdapterFactoryContentProvider(adapterFactory);

        itemDelegator = new AdapterFactoryItemDelegator(adapterFactory);
        labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
    }

    @Override
    protected void logError(String message, Exception exception) {
        Activator.logError(message, exception);
    }

    @Override
    protected void setInputObject(EObject eobject) {
    }

    public AdapterFactoryLabelProvider getLabelProvider() {
        return labelProvider;
    }

    @Override
    public boolean isSaveOnCloseNeeded() {
        return false;
    }

    /**
     * This is for implementing {@link IEditorPart} and simply tests the command
     * stack.
     */
    @Override
    public boolean isDirty() {
        return false;
        // if (getEditingDomain() == null)
        // return false;
        //
        // return ((BasicCommandStack)
        // getEditingDomain().getCommandStack()).isSaveNeeded();
    }

    @Override
    public TabbedPropertySheetPage getTabbedPropertySheetPage() {
        return null;
    }

    @Override
    public String getContributorId() {
        return null;
    }

    @Override
    public void doSaveAs() {
    }

    @Override
    public boolean isSaveAsAllowed() {
        return false;
    }

    private EObject defaultCreationDialog(FormbuilderEntry e, EObject object) {
        
        Collection<EClass> filteredEClasses = ShadowrunEditingTools.provideNewClassTypes(object, e.getFeature(), editingDomain);// provideNewClassTypes(object,
        // e.getFeature());
        if (filteredEClasses.size() == 1) {
            EClass eClass = filteredEClasses.iterator().next();
            return eClass.getEPackage().getEFactoryInstance().create(eClass);
        }
        
        OwnChooseDialog dialog = new OwnChooseDialog(getEditorSite().getShell(), filteredEClasses.toArray(new Object[]{}),
                Messages.ShadowrunEditor_dlg_select_type, Messages.ShadowrunEditor_dlg_select_persona_type);
        dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
        int open = dialog.open();
        if (open == Dialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0) {
                EClass eClass = (EClass)result[0];
                return eClass.getEPackage().getEFactoryInstance().create(eClass);
            }
        }
        
        return null;
    }

    /**
     * @param object_ref
     * @param orgObject
     * @return
     */
    private List<EObject> handleCopyAddToPersona(EReference object_ref, EObject orgObject) {
        Collection<EObject> collection = ItemPropertyDescriptor.getReachableObjectsOfType(getEObject(), object_ref.getEType());
        ShrList basicList = Shr5Factory.eINSTANCE.createShrList();
    
        FeatureEditorDialog dialog = new FeatureEditorDialogWert(getSite().getShell(), labelProvider, basicList,
                Shr5Package.Literals.SHR_LIST__ENTRIES, "Add " + labelProvider.getText(object_ref), new ArrayList<EObject>(collection),orgObject);
    
        int result = dialog.open();
        if (result == Window.OK) {
            EList<?> list = dialog.getResult();
            List<EObject> objectList = new ArrayList<EObject>();
            for (Object object : list) {
                if (object instanceof EObject) {
                    EObject eo = (EObject)object;
                    EObject copy = copyWithParentId(eo);
                    objectList.add(copy);
                }
            }
    
            return objectList;
        }
        return null;
    }

    /**
     * Creates a copy of the eobject, when it is an {@link Identifiable} the parent id will be set to the id of the org object when the org object has
     * no parentId set. So the copied object has the org id as parentId or the parentId.
     * 
     * @param eo the org {@link EObject}
     * @return the copy
     */
    private EObject copyWithParentId(EObject eo) {
        EObject copy = EcoreUtil.copy(eo);
        if (eo.eResource() instanceof XMLResource) {
            XMLResource xmlRes = (XMLResource)eo.eResource();
            String id = xmlRes.getID(eo);
            if (copy instanceof Identifiable) {
                String parentId = ((Identifiable)eo).getParentId();
                if (parentId != null && !parentId.isEmpty())
                    id = parentId;
    
                Identifiable iden = (Identifiable)copy;
                iden.setParentId(id);
            }
        }
        return copy;
    }

}