package de.urszeidler.shr5.ecp.editor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import de.urszeidler.commons.functors.Transformer;
import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.Modifizierbar;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;
import de.urszeidler.emf.commons.ui.util.DefaultReferenceManager;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry;
import de.urszeidler.emf.commons.ui.util.NullObject;
import de.urszeidler.shr5.ecp.dialogs.CreateAttributModifikatorDialog;
import de.urszeidler.shr5.ecp.dialogs.FeatureEditorDialogMagazine;
import de.urszeidler.shr5.ecp.dialogs.FeatureEditorDialogWert;
import de.urszeidler.shr5.ecp.dialogs.GenericEObjectDialog;
import de.urszeidler.shr5.ecp.dialogs.ReferenceValueDialog;
import de.urszeidler.shr5.ecp.editor.pages.Messages;
import de.urszeidler.shr5.ecp.util.ShadowrunEditingTools;

public class ShrReferenceManager extends DefaultReferenceManager {
    /**
     * 
     */
    private final AbstractShr5Editor shadowrunEditor;
    private EditingDomain editingDomain;

    public ShrReferenceManager(AbstractShr5Editor shadowrunEditor, AdapterFactoryItemDelegator itemDelegator, EditingDomain editingDomain) {
        super(itemDelegator);
        this.shadowrunEditor = shadowrunEditor;
        this.editingDomain = editingDomain;
    }

    public void handleManage(FormbuilderEntry e, EObject object) {
        if (Shr5managementPackage.Literals.FREE_STYLE_GENERATOR__SELECTED_TYPE.equals(e.getFeature())) {
            Collection<EClass> filteredEClasses = ShadowrunEditingTools.provideNewClassTypes(
                    Shr5managementFactory.eINSTANCE.createPlayerCharacter(), Shr5managementPackage.Literals.MANAGED_CHARACTER__PERSONA,
                    editingDomain);

            OwnChooseDialog dialog = new OwnChooseDialog(this.shadowrunEditor.getEditorSite().getShell(), filteredEClasses.toArray(new Object[]{}),
                    Messages.ShadowrunEditor_dlg_select_type, Messages.ShadowrunEditor_dlg_select_persona_type);
            dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
            setSingleRefernceFromDialog(e, dialog);
            return;
        } else if (Shr5Package.Literals.GEBUNDENER_GEIST__GEIST.equals(e.getFeature())
                || Shr5Package.Literals.SUBSTANCE_CONTAINER__SUBSTANCE.equals(e.getFeature())
                ) {
            List<EObject> copyAddToPersona = handleCopyAddToPersona((EReference)e.getFeature(), object);
            if (!copyAddToPersona.isEmpty()) {
                IObservable observable = e.getObservable();
                if (observable instanceof IObservableValue) {
                    IObservableValue ov = (IObservableValue)e.getObservable();
                    ov.setValue(copyAddToPersona.get(0));
                }
            }
            return;
        } else if (Shr5Package.Literals.MAGAZIN__BULLETS.equals(e.getFeature())) {
            // super.handleManage(e, object);
            IItemPropertyDescriptor propertyDescriptor = itemDelegator.getPropertyDescriptor(object, e.getFeature());
            List<?> values = (List<?>)propertyDescriptor.getChoiceOfValues(object);
            Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
            FeatureEditorDialogWert featureEditorDialog = new FeatureEditorDialogMagazine(shell, this, object, e.getFeature(), "Manage magazine",
                    values);
            int result = featureEditorDialog.open();
            if (result == Window.OK) {
                EList<?> eList = featureEditorDialog.getResult();
                IObservable observable = e.getObservable();
                if (observable instanceof IObservableList) {
                    IObservableList ol = (IObservableList)observable;
                    ol.clear();
                    ol.addAll(eList);
                } 
//                else if (observable instanceof IObservableValue) {
//                    IObservableValue ov = (IObservableValue)observable;
//
//                }
            }

            return;
        } else if (Shr5Package.Literals.FEUERWAFFE__MAGAZIN.equals(e.getFeature())) {
            IItemPropertyDescriptor propertyDescriptor = itemDelegator.getPropertyDescriptor(object, e.getFeature());
            List<?> values = (List<?>)propertyDescriptor.getChoiceOfValues(object);
            Object[] choises = NullObject.toChoises(values);
            OwnChooseDialog dialog = new OwnChooseDialog(this.shadowrunEditor.getEditorSite().getShell(), choises, Messages.ShadowrunEditor_dlg_select_type,
                    Messages.ShadowrunEditor_dlg_select_persona_type);
            dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
            setSingleRefernceFromDialog(e, dialog);
            return;
        }
        super.handleManage(e, object);
    }

    /**
     * Set the value to the formbuilder entry.
     * @param e
     * @param dialog
     */
    protected void setSingleRefernceFromDialog(FormbuilderEntry e, OwnChooseDialog dialog) {
        int open = dialog.open();
        if (open == Dialog.OK) {
            Object[] result = dialog.getResult();
            IObservable observable = e.getObservable();
            if (observable instanceof IObservableValue) {
                IObservableValue ov = (IObservableValue)e.getObservable();
                if (result.length > 0)
                    ov.setValue(result[0]);
                else
                    ov.setValue(null);
            }
        }
    }

    @Override
    protected Object provideObject(FormbuilderEntry e, EObject object) {
        if (Shr5Package.Literals.MODIFIZIERBAR__MODS.equals(e.getFeature())) {
            de.urszeidler.eclipse.shr5.AttributModifikatorWert amw = Shr5Factory.eINSTANCE.createAttributModifikatorWert();
            CreateAttributModifikatorDialog dialog = new CreateAttributModifikatorDialog(this.shadowrunEditor.getSite().getShell(), amw, (Modifizierbar)object,
                    Messages.ShadowrunEditor_dlg_add_AttibuteModificator);

            if (dialog.open() == Dialog.OK)
                return amw;
            else
                return null;
        } else if (Shr5Package.Literals.KOERPER_PERSONA__KOERPER_MODS.equals(e.getFeature())
                || Shr5Package.Literals.KOERPER_PERSONA__EIGENSCHAFTEN.equals(e.getFeature())
                || Shr5Package.Literals.KI_ADEPT__KIKRAFT.equals(e.getFeature())
                || Shr5Package.Literals.COMMLINK__STORED_PROGRAMS.equals(e.getFeature())
                || Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__STORED_PROGRAMS.equals(e.getFeature())
                || Shr5Package.Literals.CYBERDECK__STORED_PROGRAMS.equals(e.getFeature())
                || Shr5Package.Literals.LIFESTYLE__OPTIONS.equals(e.getFeature())
                || Shr5Package.Literals.FAHRZEUG__MODIFIZIERUNGEN.equals(e.getFeature())
                || Shr5Package.Literals.DROHNE__STORED_PROGRAMS.equals(e.getFeature())
                || Shr5managementPackage.Literals.MANAGED_CHARACTER__CONTRACTS.equals(e.getFeature())
                || Shr5managementPackage.Literals.MANAGED_CHARACTER__VEHICELS.equals(e.getFeature())
                || Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR.equals(e.getFeature())) {
            return handleCopyAddToPersona((EReference)e.getFeature(), object);

            // return null;
        } else if (Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITEN.equals(e.getFeature())) {
            Collection<EObject> objectsOfType = ItemPropertyDescriptor.getReachableObjectsOfType(object, Shr5Package.Literals.FERTIGKEIT);

            PersonaFertigkeit personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
            ReferenceValueDialog dialog = new ReferenceValueDialog(this.shadowrunEditor.getSite().getShell(), personaFertigkeit,
                    Shr5Package.Literals.PERSONA_FERTIGKEIT__FERTIGKEIT, Shr5Package.Literals.STEIGERBAR__STUFE, objectsOfType.toArray());

            if (dialog.open() == Dialog.OK)
                return personaFertigkeit;
            else
                return null;

        } else if (Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITS_GRUPPEN.equals(e.getFeature())) {
            Collection<EObject> objectsOfType = ItemPropertyDescriptor.getReachableObjectsOfType(object,
                    Shr5Package.Literals.FERTIGKEITS_GRUPPE);

            PersonaFertigkeitsGruppe personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
            ReferenceValueDialog dialog = new ReferenceValueDialog(this.shadowrunEditor.getSite().getShell(), personaFertigkeit,
                    Shr5Package.Literals.PERSONA_FERTIGKEITS_GRUPPE__GRUPPE, Shr5Package.Literals.STEIGERBAR__STUFE, objectsOfType.toArray());

            if (dialog.open() == Dialog.OK)
                return personaFertigkeit;
            else
                return null;

        } else if (Shr5Package.Literals.ZAUBERER__ZAUBER.equals(e.getFeature())) {
            Collection<EObject> objectsOfType = ItemPropertyDescriptor.getReachableObjectsOfType(object, Shr5Package.Literals.ZAUBER);

            ShrList basicList = Shr5Factory.eINSTANCE.createShrList();

            Transformer<Zauber, PersonaZauber> transformer = ShadowrunEditingTools.zauber2PersonaZauberTransformer();

            FeatureEditorDialog dialog = new FeatureEditorDialogWert(this.shadowrunEditor.getSite().getShell(), AdapterFactoryUtil.getInstance().getLabelProvider(), basicList,
                    Shr5Package.Literals.SHR_LIST__ENTRIES, Messages.ShadowrunEditor_dlg_select_spells, new ArrayList<EObject>(objectsOfType),object);

            int result = dialog.open();
            if (result == Window.OK) {
                EList<?> list = dialog.getResult();
                List<EObject> objectList = new ArrayList<EObject>();
                for (Object object1 : list) {
                    if (object1 instanceof EObject) {
                        objectList.add(transformer.transform((Zauber)object1));
                    }
                }

                return objectList;
            }

        } else if (Shr5managementPackage.Literals.MANAGED_CHARACTER__CONNECTIONS.equals(e.getFeature())){
            final EObject contextObject = object;
            EClass eClass = (EClass)e.getFeature().getEType();
            EObject eObject = eClass.getEPackage().getEFactoryInstance().create(eClass); 
            GenericEObjectDialog dialog = new GenericEObjectDialog(this.shadowrunEditor.getSite().getShell(), eObject, itemDelegator, this, new DefaultReferenceManager(itemDelegator){
                @Override
                public void handleManage(FormbuilderEntry e, EObject object) {
                    if (Shr5managementPackage.Literals.CONNECTION__CHARACTER.equals(e.getFeature())){
                        Collection<EObject> objectsOfType = ItemPropertyDescriptor.getReachableObjectsOfType(contextObject, Shr5managementPackage.Literals.MANAGED_CHARACTER);
                        OwnChooseDialog dialog = new OwnChooseDialog(Display.getCurrent().getActiveShell(), objectsOfType.toArray(new Object[]{}),
                                "Choose connection", "");
                        dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
                        setSingleRefernceFromDialog(e, dialog); 
                    }else
                    super.handleManage(e, object);
                }
                 
            });

            if (dialog.open() == Dialog.OK)
                return eObject;
            else
                return null;

            
            
    } else if (Shr5Package.Literals.ZAUBERER__GEBUNDENE_GEISTER.equals(e.getFeature())
                || Shr5Package.Literals.CREDSTICK__TRANSACTIONLOG.equals(e.getFeature())) {

            EClass eClass = (EClass)e.getFeature().getEType();// .eClass();
            Collection<EObject> objectsOfType = ItemPropertyDescriptor.getReachableObjectsOfType(object, eClass);
            EObject eObject = eClass.getEPackage().getEFactoryInstance().create(eClass); // Shr5managementFactory.eINSTANCE.createConnection();
            GenericEObjectDialog dialog = new GenericEObjectDialog(this.shadowrunEditor.getSite().getShell(), eObject, itemDelegator, this, this);

            if (dialog.open() == Dialog.OK)
                return eObject;
            else
                return null;
        }
        return defaultCreationDialog(e, object);
    }
    
    protected EObject defaultCreationDialog(FormbuilderEntry e, EObject object) {
        
        Collection<EClass> filteredEClasses = ShadowrunEditingTools.provideNewClassTypes(object, e.getFeature(), editingDomain);// provideNewClassTypes(object,
        // e.getFeature());
        if (filteredEClasses.size() == 1) {
            EClass eClass = filteredEClasses.iterator().next();
            return eClass.getEPackage().getEFactoryInstance().create(eClass);
        }
        
        OwnChooseDialog dialog = new OwnChooseDialog(this.shadowrunEditor.getEditorSite().getShell(), filteredEClasses.toArray(new Object[]{}),
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
    protected List<EObject> handleCopyAddToPersona(EReference object_ref, EObject orgObject) {
        Collection<EObject> collection = ItemPropertyDescriptor.getReachableObjectsOfType(orgObject, object_ref.getEType());
        ShrList basicList = Shr5Factory.eINSTANCE.createShrList();
    
        FeatureEditorDialog dialog = new FeatureEditorDialogWert(this.shadowrunEditor.getSite().getShell(), AdapterFactoryUtil.getInstance().getLabelProvider(), basicList,
                Shr5Package.Literals.SHR_LIST__ENTRIES, "Add " + AdapterFactoryUtil.getInstance().getLabelProvider().getText(object_ref), new ArrayList<EObject>(collection),orgObject);
    
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