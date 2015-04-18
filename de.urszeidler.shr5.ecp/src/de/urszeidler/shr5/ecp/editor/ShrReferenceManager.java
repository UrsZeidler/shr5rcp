package de.urszeidler.shr5.ecp.editor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;

import de.urszeidler.commons.functors.Transformer;
import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Cyberware;
import de.urszeidler.eclipse.shr5.CyberwareEnhancement;
import de.urszeidler.eclipse.shr5.Fahrzeug;
import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.Koerpermods;
import de.urszeidler.eclipse.shr5.MartialartStyle;
import de.urszeidler.eclipse.shr5.Modifizierbar;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaMartialartStyle;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.Vertrag;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.Changes;
import de.urszeidler.eclipse.shr5Management.CharacterDiary;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.PersonaValueChange;
import de.urszeidler.eclipse.shr5Management.Shr5RuleGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.TrainingsTime;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;
import de.urszeidler.emf.commons.ui.util.DefaultReferenceManager;
import de.urszeidler.emf.commons.ui.util.FormbuilderEntry;
import de.urszeidler.emf.commons.ui.util.NullObject;
import de.urszeidler.shr5.ecp.dialogs.CreateAttributModifikatorDialog;
import de.urszeidler.shr5.ecp.dialogs.FeatureEditorDialogMagazine;
import de.urszeidler.shr5.ecp.dialogs.FeatureEditorDialogWert;
import de.urszeidler.shr5.ecp.dialogs.FeatureEditorDialogWert.DialogType;
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

    @Override
    public Object handleAdd(FormbuilderEntry e, EObject object) {
        Object handleAdd = super.handleAdd(e, object);
        if (handleAdd != null && handleAdd instanceof EObject)
            ShadowrunEditingTools.openEObject((EObject)handleAdd);
        return handleAdd;
    }

    public void handleManage(FormbuilderEntry e, EObject object) {
        if (Shr5managementPackage.Literals.FREE_STYLE_GENERATOR__SELECTED_TYPE.equals(e.getFeature())) {
            Collection<EClass> filteredEClasses = ShadowrunEditingTools.provideNewClassTypes(Shr5managementFactory.eINSTANCE.createPlayerCharacter(),
                    Shr5managementPackage.Literals.MANAGED_CHARACTER__PERSONA, editingDomain);

            OwnChooseDialog dialog = new OwnChooseDialog(this.shadowrunEditor.getEditorSite().getShell(), filteredEClasses.toArray(new Object[]{}),
                    Messages.ShadowrunEditor_dlg_select_type, Messages.ShadowrunEditor_dlg_select_persona_type);
            dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
            setSingleRefernceFromDialog(e, dialog);
            return;
        } else if (Shr5Package.Literals.GEBUNDENER_GEIST__GEIST.equals(e.getFeature())
                || Shr5Package.Literals.SUBSTANCE_CONTAINER__SUBSTANCE.equals(e.getFeature())
                || Shr5Package.Literals.QI_FOKUS__POWER.equals(e.getFeature()) || Shr5Package.Literals.FAHRZEUG__SENSOR_ARRAY.equals(e.getFeature())
                || Shr5Package.Literals.WEAPON_MOUNT__WEAPON.equals(e.getFeature())) {
            EObject copyAddToPersona = handleCopySingleAddToPersona((EReference)e.getFeature(), object);
            if (copyAddToPersona != null) {
                IObservable observable = e.getObservable();
                if (observable instanceof IObservableValue) {
                    IObservableValue ov = (IObservableValue)e.getObservable();
                    ov.setValue(copyAddToPersona);
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
            }

            return;
        } else if (Shr5Package.Literals.FEUERWAFFE__MAGAZIN.equals(e.getFeature())) {
            IItemPropertyDescriptor propertyDescriptor = itemDelegator.getPropertyDescriptor(object, e.getFeature());
            List<?> values = (List<?>)propertyDescriptor.getChoiceOfValues(object);
            Object[] choises = NullObject.toChoises(values);
            OwnChooseDialog dialog = new OwnChooseDialog(this.shadowrunEditor.getEditorSite().getShell(), choises, "Select the magazine", "");
            dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
            setSingleRefernceFromDialog(e, dialog);
            return;
        } else if (Shr5Package.Literals.CYBER_IMPLANT_WEAPON__WEAPON.equals(e.getFeature())) {
            EObject newWeapon = defaultCreationDialog(e, object);
            setValue(e, newWeapon);
            // } else if (Shr5managementPackage.Literals.MODULE_SKILL_CHANGE__SKILLGROUP.equals(e.getFeature())) {
            // Collection<EObject> objectsOfType = ItemPropertyDescriptor.getReachableObjectsOfType(object, Shr5Package.Literals.FERTIGKEITS_GRUPPE);
            // PersonaFertigkeitsGruppe personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
            // ReferenceValueDialog dialog = new ReferenceValueDialog(this.shadowrunEditor.getSite().getShell(), personaFertigkeit,
            // Shr5Package.Literals.PERSONA_FERTIGKEITS_GRUPPE__GRUPPE, Shr5Package.Literals.STEIGERBAR__STUFE, objectsOfType.toArray());
            //
            // if (dialog.open() == Dialog.OK)
            // setValue(e, personaFertigkeit);
            //
            // return;
        } else if (Shr5managementPackage.Literals.MODULE_SKILL_CHANGE__SKILL.equals(e.getFeature())) {
            Collection<EObject> objectsOfType = ItemPropertyDescriptor.getReachableObjectsOfType(object, Shr5Package.Literals.FERTIGKEIT);

            Object[] choises = NullObject.toChoises(objectsOfType);
            OwnChooseDialog dialog = new OwnChooseDialog(this.shadowrunEditor.getEditorSite().getShell(), choises, "Select skill", "");
            dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
            setSingleRefernceFromDialog(e, dialog);
            return;
        } else if (Shr5managementPackage.Literals.CHARACTER_CHANGE__CHANGE.equals(e.getFeature())) {
            if (object instanceof TrainingsTime) {
                TrainingsTime tt = (TrainingsTime)object;
                if (tt.getDaysTrained() == 0)
                    createTrainingsTimes(tt, e);
                return;
            }
        }
        // else if (Shr5managementPackage.Literals.MODULE_CHARACTER_CHANGE__CHARACTER_CHANGE.equals(e.getFeature())){
        // EObject defaultCreationDialog = defaultCreationDialog(e, object);
        // if(defaultCreationDialog!=null)
        // setValue(e, defaultCreationDialog);
        // return;
        // }
        super.handleManage(e, object);
    }

    /**
     * Creates a set of possible trainig times to choose from
     * 
     * @param tt
     * @param e
     */
    private void createTrainingsTimes(TrainingsTime tt, FormbuilderEntry e) {
        EObject eContainer = tt.eContainer();
        if (eContainer instanceof CharacterDiary && eContainer.eContainer() instanceof ManagedCharacter) {
            final ManagedCharacter character = (ManagedCharacter)eContainer.eContainer();
            AbstraktPersona p = character.getPersona();
            List<EAttribute> orderedAttibutes = ShadowrunTools.getOrderedAttibutes(p);
            orderedAttibutes.remove(Shr5Package.Literals.SPEZIELLE_ATTRIBUTE__EDGE_BASIS);
            orderedAttibutes.remove(Shr5Package.Literals.BASE_MAGISCHE_PERSONA__MAGIE_BASIS);

            ImmutableList<AttributeChange> list = FluentIterable.from(orderedAttibutes).filter(new Predicate<EAttribute>() {

                @Override
                public boolean apply(EAttribute input) {
                    int base = (Integer)character.getPersona().getSpezies().eGet(ShadowrunTools.base2SpeciesMax(input));
                    Integer eGet = (Integer)character.getPersona().eGet(input);
                    return 1 + eGet < base * 1.5;
                }

            }).transform(new Function<EAttribute, AttributeChange>() {

                @Override
                public AttributeChange apply(EAttribute input) {
                    AttributeChange attributeChange = Shr5managementFactory.eINSTANCE.createAttributeChange();
                    attributeChange.setAttibute(input);
                    Integer eGet = (Integer)character.getPersona().eGet(input);

                    attributeChange.setFrom(eGet);
                    attributeChange.setTo(eGet + 1);
                    return attributeChange;
                }
            }).toList();

            ImmutableList<PersonaChange> list2 = FluentIterable.from(p.getFertigkeitsGruppen())
                    .transform(new Function<PersonaFertigkeitsGruppe, PersonaChange>() {

                        @Override
                        public PersonaChange apply(PersonaFertigkeitsGruppe input) {
                            PersonaChange attributeChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
                            attributeChange.setChangeable(input);

                            attributeChange.setFrom(input.getStufe());
                            attributeChange.setTo(input.getStufe() + 1);
                            return attributeChange;
                        }
                    }).toList();
            ImmutableList<PersonaChange> list3 = FluentIterable.from(p.getFertigkeiten()).transform(new Function<PersonaFertigkeit, PersonaChange>() {

                @Override
                public PersonaChange apply(PersonaFertigkeit input) {
                    PersonaChange attributeChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
                    attributeChange.setChangeable(input);

                    attributeChange.setFrom(input.getStufe());
                    attributeChange.setTo(input.getStufe() + 1);
                    return attributeChange;
                }
            }).toList();

            ArrayList<PersonaValueChange> a = new ArrayList<PersonaValueChange>();
            a.addAll(list);
            a.addAll(list2);
            a.addAll(list3);

            Object[] choises = NullObject.toChoises(a);
            OwnChooseDialog dialog = new OwnChooseDialog(this.shadowrunEditor.getEditorSite().getShell(), choises, "Select Training", "");
            dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
            PersonaValueChange singleRefernceFromDialog = (PersonaValueChange)getSingleRefernceFromDialog(dialog);
            if (singleRefernceFromDialog == null)
                return;
            Changes oldChanges = tt.getChange();
            setValue(e, singleRefernceFromDialog);
            character.getChanges().remove(oldChanges);
            character.getChanges().add(singleRefernceFromDialog);

        }
    }

    /**
     * Set the value to the formbuilder entry.
     * 
     * @param e
     * @param dialog
     * @return
     */
    protected Object getSingleRefernceFromDialog(OwnChooseDialog dialog) {
        int open = dialog.open();
        if (open == Dialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0)
                return result[0];
        }
        return null;
    }

    /**
     * Set the value to the formbuilder entry.
     * 
     * @param e
     * @param dialog
     */
    protected void setSingleRefernceFromDialog(FormbuilderEntry e, OwnChooseDialog dialog) {
        setValue(e, getSingleRefernceFromDialog(dialog));
    }

    /**
     * @param e
     * @param value
     */
    private void setValue(FormbuilderEntry e, Object value) {
        IObservable observable = e.getObservable();
        if (observable instanceof IObservableValue) {
            IObservableValue ov = (IObservableValue)e.getObservable();
            ov.setValue(value);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    protected Object provideObject(FormbuilderEntry e, EObject object) {
        if (Shr5Package.Literals.MODIFIZIERBAR__MODS.equals(e.getFeature())) {
            de.urszeidler.eclipse.shr5.AttributModifikatorWert amw = Shr5Factory.eINSTANCE.createAttributModifikatorWert();
            CreateAttributModifikatorDialog dialog = new CreateAttributModifikatorDialog(this.shadowrunEditor.getSite().getShell(), amw,
                    (Modifizierbar)object, Messages.ShadowrunEditor_dlg_add_AttibuteModificator);

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
                || Shr5Package.Literals.CYBERWARE__EINBAU.equals(e.getFeature()) || Shr5Package.Literals.FEUERWAFFE__EINBAU.equals(e.getFeature())
                || Shr5Package.Literals.KLEIDUNG__KMODS.equals(e.getFeature())
                || Shr5managementPackage.Literals.MANAGED_CHARACTER__CONTRACTS.equals(e.getFeature())
                || Shr5managementPackage.Literals.MANAGED_CHARACTER__VEHICELS.equals(e.getFeature())
                || Shr5managementPackage.Literals.MANAGED_CHARACTER__INVENTAR.equals(e.getFeature())) {
            return handleCopyAddToPersona((EReference)e.getFeature(), object);
        } else if (Shr5managementPackage.Literals.PACK__ITEMS.equals(e.getFeature())) {
            Collection<EObject> collection = ItemPropertyDescriptor.getReachableObjectsOfType(object, ((EReference)e.getFeature()).getEType());
            collection = filterProvidedObjects(collection);
            collection = FluentIterable
                    .from(collection)
                    .filter(Predicates.or(Predicates.instanceOf(Vertrag.class), Predicates.instanceOf(AbstraktGegenstand.class),
                            Predicates.instanceOf(Koerpermods.class), Predicates.instanceOf(Fahrzeug.class))).toList();

            ShrList basicList = Shr5Factory.eINSTANCE.createShrList();

            FeatureEditorDialog dialog = new FeatureEditorDialogWert(this.shadowrunEditor.getSite().getShell(), AdapterFactoryUtil.getInstance()
                    .getLabelProvider(), basicList, Shr5Package.Literals.SHR_LIST__ENTRIES, "Add to "
                    + AdapterFactoryUtil.getInstance().getLabelProvider().getText(object), new ArrayList<EObject>(collection), object,
                    DialogType.simple);

            return copyObjectsFromDialog(dialog);
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
            Collection<EObject> objectsOfType = ItemPropertyDescriptor.getReachableObjectsOfType(object, Shr5Package.Literals.FERTIGKEITS_GRUPPE);

            PersonaFertigkeitsGruppe personaFertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
            ReferenceValueDialog dialog = new ReferenceValueDialog(this.shadowrunEditor.getSite().getShell(), personaFertigkeit,
                    Shr5Package.Literals.PERSONA_FERTIGKEITS_GRUPPE__GRUPPE, Shr5Package.Literals.STEIGERBAR__STUFE, objectsOfType.toArray());

            if (dialog.open() == Dialog.OK)
                return personaFertigkeit;
            else
                return null;

        } else if(Shr5Package.Literals.ABSTRAKT_PERSONA__MARTIALART_STYLES.equals(e.getFeature())){
            Collection<EObject> objectsOfType = ItemPropertyDescriptor.getReachableObjectsOfType(object, Shr5Package.Literals.MARTIALART_STYLE);
            return provideTransformendObjects(object, objectsOfType, ShadowrunEditingTools.martialArt2PersonaMartialArtTransformer());
         } else if(Shr5Package.Literals.PERSONA_MARTIALART_STYLE__TECHNIQUES.equals(e.getFeature())){
             if (object instanceof PersonaMartialartStyle) {
                 PersonaMartialartStyle mt = (PersonaMartialartStyle)object;
                MartialartStyle technique = mt.getStyle();
                if(technique!=null)
                return provideTransformendObjects(object, new ArrayList<EObject>(technique.getTechniques()), ShadowrunEditingTools.martialArtTechnique2PersonaMartialArtTransformer());

            }
             Collection<EObject> objectsOfType = ItemPropertyDescriptor.getReachableObjectsOfType(object, Shr5Package.Literals.MARTIALART_TECHNIQUE);
             return provideTransformendObjects(object, objectsOfType, ShadowrunEditingTools.martialArtTechnique2PersonaMartialArtTransformer());
          } else if (Shr5Package.Literals.ZAUBERER__ZAUBER.equals(e.getFeature())) {
            Collection<EObject> objectsOfType = ItemPropertyDescriptor.getReachableObjectsOfType(object, Shr5Package.Literals.ZAUBER);

            ShrList basicList = Shr5Factory.eINSTANCE.createShrList();
            Transformer<Zauber, PersonaZauber> transformer = ShadowrunEditingTools.zauber2PersonaZauberTransformer();
            
            FeatureEditorDialog dialog = new FeatureEditorDialogWert(this.shadowrunEditor.getSite().getShell(), AdapterFactoryUtil.getInstance()
                    .getLabelProvider(), basicList, Shr5Package.Literals.SHR_LIST__ENTRIES, Messages.ShadowrunEditor_dlg_select_spells,
                    new ArrayList<EObject>(objectsOfType), object);

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

        } else if (Shr5managementPackage.Literals.MANAGED_CHARACTER__CONNECTIONS.equals(e.getFeature())) {
            final EClass type_lookup_class = Shr5managementPackage.Literals.MANAGED_CHARACTER;
            final EReference inner_feature = Shr5managementPackage.Literals.CONNECTION__CHARACTER;
            return provideInnerObject(e, object, type_lookup_class, inner_feature);
        } else if (Shr5Package.Literals.ZAUBERER__GEBUNDENE_GEISTER.equals(e.getFeature())) {
            final EClass type_lookup_class = Shr5Package.Literals.GEIST;
            final EReference inner_feature = Shr5Package.Literals.GEBUNDENER_GEIST__GEIST;
            return provideInnerObject(e, object, type_lookup_class, inner_feature);
        }
        // else if (Shr5Package.Literals.CREDSTICK__TRANSACTIONLOG.equals(e.getFeature())) {
        //
        // EClass eClass = (EClass)e.getFeature().getEType();// .eClass();
        // // Collection<EObject> objectsOfType = ItemPropertyDescriptor.getReachableObjectsOfType(object, eClass);
        // EObject eObject = eClass.getEPackage().getEFactoryInstance().create(eClass); // Shr5managementFactory.eINSTANCE.createConnection();
        // GenericEObjectDialog dialog = new GenericEObjectDialog(this.shadowrunEditor.getSite().getShell(), eObject, itemDelegator, this, this);
        //
        // if (dialog.open() == Dialog.OK)
        // return eObject;
        // else
        // return null;
        // }
        return defaultCreationDialog(e, object);
    }

    /**
     * @param object
     * @param objectsOfType
     * @param transformer
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private List<EObject> provideTransformendObjects(EObject object, Collection<EObject> objectsOfType,
            Transformer transformer) {
        ShrList basicList = Shr5Factory.eINSTANCE.createShrList();
        FeatureEditorDialog dialog = new FeatureEditorDialogWert(this.shadowrunEditor.getSite().getShell(), AdapterFactoryUtil.getInstance()
                .getLabelProvider(), basicList, Shr5Package.Literals.SHR_LIST__ENTRIES, Messages.ShadowrunEditor_dlg_select_spells,
                new ArrayList<EObject>(objectsOfType), object);

        int result = dialog.open();
        if (result == Window.OK) {
            EList<?> list = dialog.getResult();
            List<EObject> objectList = new ArrayList<EObject>();
            for (Object object1 : list) {
                if (object1 instanceof EObject) {
                    objectList.add((EObject)transformer.transform(object1));
                }
            }
            return objectList;
        }
        return null;
    }

    /**
     * @param e
     * @param object
     * @param type_lookup_class
     * @param inner_feature
     * @return
     */
    private Object provideInnerObject(FormbuilderEntry e, EObject object, final EClass type_lookup_class, final EReference inner_feature) {
        final EObject contextObject = object;
        EClass eClass = (EClass)e.getFeature().getEType();
        EObject eObject = eClass.getEPackage().getEFactoryInstance().create(eClass);
        GenericEObjectDialog dialog = new GenericEObjectDialog(this.shadowrunEditor.getSite().getShell(), eObject, itemDelegator, this,
                new DefaultReferenceManager(itemDelegator) {
                    @Override
                    public void handleManage(FormbuilderEntry e, EObject object) {
                        if (inner_feature.equals(e.getFeature())) {
                            Collection<EObject> objectsOfType = ItemPropertyDescriptor.getReachableObjectsOfType(contextObject, type_lookup_class);
                            OwnChooseDialog dialog = new OwnChooseDialog(Display.getCurrent().getActiveShell(),
                                    objectsOfType.toArray(new Object[]{}), "Choose connection", "");
                            dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
                            setSingleRefernceFromDialog(e, dialog);
                        } else
                            super.handleManage(e, object);
                    }

                });

        if (dialog.open() == Dialog.OK)
            return eObject;
        else
            return null;
    }

    protected EObject defaultCreationDialog(FormbuilderEntry e, EObject object) {

        Collection<EClass> filteredEClasses = ShadowrunEditingTools.provideNewClassTypes(object, e.getFeature(), editingDomain);// provideNewClassTypes(object,
        // e.getFeature());
        if (filteredEClasses.size() == 1) {
            EClass eClass = filteredEClasses.iterator().next();
            return eClass.getEPackage().getEFactoryInstance().create(eClass);
        }

        OwnChooseDialog dialog = new OwnChooseDialog(this.shadowrunEditor.getEditorSite().getShell(), filteredEClasses.toArray(new Object[]{}),
                ShadowrunEditingTools.toFeatureName(object, e.getFeature()), "");
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
     * Select one object and returns a copy.
     * 
     * @param object_ref
     * @param orgObject
     * @return
     */
    protected EObject handleCopySingleAddToPersona(EReference object_ref, EObject orgObject) {
        Collection<EObject> collection = ItemPropertyDescriptor.getReachableObjectsOfType(orgObject, object_ref.getEType());
        collection = filterProvidedObjects(collection);

        OwnChooseDialog dialog = new OwnChooseDialog(this.shadowrunEditor.getEditorSite().getShell(), NullObject.toChoises(collection),
                String.format("Add a %s object.", ShadowrunEditingTools.toFeatureName(orgObject, object_ref)), "");
        dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());

        int result = dialog.open();
        if (result == Window.OK) {
            Object[] list = dialog.getResult();

            if (list != null && list.length == 1 && list[0] instanceof EObject) {
                EObject eo = (EObject)list[0];
                EObject copy = copyWithParentId(eo);
                return copy;
            }
        }
        return null;
    }

    /**
     * Select a list of object for the feature and return a list of copied objects.
     * 
     * @param object_ref
     * @param orgObject
     * @return
     */
    protected List<EObject> handleCopyAddToPersona(EReference object_ref, EObject orgObject) {
        Collection<EObject> collection = ItemPropertyDescriptor.getReachableObjectsOfType(orgObject, object_ref.getEType());
        collection = filterProvidedObjects(collection);

        ShrList basicList = Shr5Factory.eINSTANCE.createShrList();

        FeatureEditorDialogWert dialog = new FeatureEditorDialogWert(this.shadowrunEditor.getSite().getShell(), AdapterFactoryUtil.getInstance()
                .getLabelProvider(), basicList, Shr5Package.Literals.SHR_LIST__ENTRIES, "Add "
                + AdapterFactoryUtil.getInstance().getLabelProvider().getText(object_ref), new ArrayList<EObject>(collection), orgObject);
        dialog.setIsUnique(false);
        return copyObjectsFromDialog(dialog);
    }

    /**
     * @param dialog
     * @return
     */
    private List<EObject> copyObjectsFromDialog(FeatureEditorDialog dialog) {
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

    public Collection<EObject> filterProvidedObjects(Collection<EObject> collection) {
        EObject theEObject = shadowrunEditor.getEObject();
        FluentIterable<EObject> fluentIterable = FluentIterable.from(collection);
        // filter the cyberwaretypes
        if (theEObject instanceof Cyberware) {
            final Cyberware cw = (Cyberware)theEObject;
            fluentIterable = fluentIterable.filter(new Predicate<EObject>() {

                @Override
                public boolean apply(EObject input) {
                    if (input instanceof CyberwareEnhancement) {
                        CyberwareEnhancement ce = (CyberwareEnhancement)input;
                        return ce.getType().equals(cw.getType());
                    }
                    return true;
                }
            });
        }

        // filter the allowed sources
        if (theEObject instanceof CharacterGenerator) {
            CharacterGenerator<?> generatorSrc = (CharacterGenerator<?>)theEObject;
            if (generatorSrc instanceof Shr5RuleGenerator) {
                Shr5RuleGenerator srg = (Shr5RuleGenerator)generatorSrc;
                EList<SourceBook> allowedSources = srg.getAllowedSources();
                if (!allowedSources.isEmpty())
                    fluentIterable = fluentIterable.filter(ShadowrunTools.allowedSourcePredicate(allowedSources));
                // return FluentIterable.from(collection).filter(ShadowrunTools.allowedSourcePredicate(allowedSources)).toList();
            }
        }
        // if (theEObject instanceof CharacterGenerator) {
        // CharacterGenerator<?> generatorSrc = (CharacterGenerator<?>)theEObject;
        // if (generatorSrc instanceof Shr5RuleGenerator) {
        // Shr5RuleGenerator srg = (Shr5RuleGenerator)generatorSrc;
        // EList<SourceBook> allowedSources = srg.getAllowedSources();
        // if (!allowedSources.isEmpty())
        // return FluentIterable.from(collection).filter(ShadowrunTools.allowedSourcePredicate(allowedSources)).toList();
        // }
        // }
        return fluentIterable.toList(); // collection;
    }

    /**
     * Creates a copy of the eobject, when it is an {@link Identifiable} the parent id will be set to the id of the org object when the org object has
     * no parentId set. So the copied object has the org id as parentId or the parentId.
     * 
     * @param eo the org {@link EObject}
     * @return the copy
     */
    public static EObject copyWithParentId(EObject eo) {
        return ShadowrunEditingTools.copyWithParentId(eo);
    }

}