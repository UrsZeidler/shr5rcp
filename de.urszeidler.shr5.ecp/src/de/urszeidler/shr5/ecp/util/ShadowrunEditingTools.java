/*
 * 
 */
package de.urszeidler.shr5.ecp.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

import com.google.common.base.Function;

import de.urszeidler.commons.functors.Predicate;
import de.urszeidler.commons.functors.Transformer;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.KomplexeForm;
import de.urszeidler.eclipse.shr5.Lifestyle;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaKomplexForm;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.Probe;
import de.urszeidler.eclipse.shr5.gameplay.ProbeState;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTest;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.opener.ECPAttributModifikatorWertOpener;

/**
 * A collection of tool functions.
 * 
 * @author urs
 */
public class ShadowrunEditingTools {

    /**
     * @param choosenLifestyle
     * @param lifestyleToStartMoney
     * @return
     */
    public static LifestyleToStartMoney getLifestyleToMoney(Lifestyle choosenLifestyle, EList<LifestyleToStartMoney> lifestyleToStartMoney) {
        for (LifestyleToStartMoney lstsm : lifestyleToStartMoney) {
            EList<Lifestyle> lifeStyles = lstsm.getLifeStyles();

            for (Lifestyle lifestyle : lifeStyles) {
                String id = getId(lifestyle);
                if (id != null && id.equals(choosenLifestyle.getParentId()))
                    return lstsm;
                if (lifestyle.getName().equals(choosenLifestyle.getName()))
                    return lstsm;
            }
        }
        return null;
    }

    /**
     * Get the id from the object or null.
     * 
     * @param eObject
     * @return
     */
    public static String getId(EObject eObject) {
        if (eObject.eResource() instanceof XMLResource) {
            XMLResource xmlRes = (XMLResource)eObject.eResource();
            String id = xmlRes.getID(eObject);
            return id;
        }
        return null;
    }

    /**
     * Creates a transformer to make a copy of the input objects.
     * 
     * @return the transformer
     */
    public static Transformer<EObject, EObject> copyTransformer() {
        Transformer<EObject, EObject> transformer = new Transformer<EObject, EObject>() {

            @Override
            public EObject transform(EObject input) {
                EObject copy = EcoreUtil.copy(input);
                return copy;
            }
        };
        return transformer;
    }

    /**
     * Creates a transformer to make a {@link Zauber} object to a {@link PersonaZauber} object referencing the spell.
     * 
     * @return the transformer
     */
    public static Transformer<Zauber, PersonaZauber> zauber2PersonaZauberTransformer() {
        Transformer<Zauber, PersonaZauber> transformer = new Transformer<Zauber, PersonaZauber>() {

            @Override
            public PersonaZauber transform(Zauber input) {
                PersonaZauber personaZauber = Shr5Factory.eINSTANCE.createPersonaZauber();
                personaZauber.setFormel(input);
                personaZauber.setStufe(1);
                return personaZauber;
            }
        };
        return transformer;
    }

    /**
     * Set the persona fertigkeit to the value by applying a persona change. It clears the persona fertigkeit and the advancement is set to 0.
     * 
     * @param character
     * @param fertigkeit
     * @param value
     */
    public static void changeFertigkeitByAdvacement(ManagedCharacter character, Fertigkeit fertigkeit, Integer value) {
        final AbstraktPersona persona = character.getPersona();

        PersonaFertigkeit personaFertigkeit = ShadowrunTools.findFertigkeit(fertigkeit, persona);
        if (personaFertigkeit == null) {

            PersonaFertigkeit pf = ShadowrunEditingTools.fertigkeit2PersonafertigkeitTransformer(character).transform(fertigkeit);
            PersonaChange personaChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
            character.getChanges().add(personaChange);
            personaChange.setChangeable(pf);
            personaChange.setFrom(0);
            personaChange.setTo((Integer)value);
            personaChange.applyChanges();
        } else {
            if ((Integer)value == 0) {
                persona.getFertigkeiten().remove(personaFertigkeit);
                PersonaChange advacements = ShadowrunManagmentTools.findCharacterAdvacements(character, personaFertigkeit);
                if (advacements != null)
                    character.getChanges().remove(advacements);
            } else {
                PersonaChange advacements = ShadowrunManagmentTools.findCharacterAdvacements(character, personaFertigkeit);
                if (advacements != null) {
                    advacements.setTo((Integer)value);
                    advacements.applyChanges();

                    persona.eNotify(new ENotificationImpl((InternalEObject)persona, Notification.SET,
                            Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITEN, null, null));
                }
            }
        }

    }

    /**
     * Set the persona fertigkeit to the value by applying a persona change. It clears the persona fertigkeit and the advancement is set to 0.
     * 
     * @param character
     * @param fertigkeitsGruppe
     * @param value
     */
    public static void changeAttributeByAdvacement(ManagedCharacter character, EAttribute attribute, Integer value) {
        final AbstraktPersona persona = character.getPersona();
        EAttribute speciesMin = ShadowrunTools.base2SpeciesMin(attribute);

        Spezies spezies = persona.getSpezies();
        if (spezies == null)
            return;

        Integer eGet = (Integer)spezies.eGet(speciesMin);
        if (value < eGet)
            value = eGet;

        AttributeChange attributeChange = ShadowrunManagmentTools.findCharacterAdvacements(character, attribute);
        if (attributeChange == null) {
            attributeChange = Shr5managementFactory.eINSTANCE.createAttributeChange();
            attributeChange.setAttibute(attribute);
            character.getChanges().add(attributeChange);
            attributeChange.setFrom((Integer)eGet);
            attributeChange.setTo(value);
            attributeChange.applyChanges();
            persona.eNotify(new ENotificationImpl((InternalEObject)persona, Notification.SET, attribute, eGet, value));
        } else if (eGet == value) {
            character.getChanges().remove(attributeChange);
            persona.eSet(attribute, eGet);
        } else {
            attributeChange.setTo((Integer)value);
            attributeChange.applyChanges();
            persona.eNotify(new ENotificationImpl((InternalEObject)persona, Notification.SET, attribute, eGet, value));
        }

    }

    /**
     * Set the persona fertigkeit to the value by applying a persona change. It clears the persona fertigkeit and the advancement is set to 0.
     * 
     * @param character
     * @param fertigkeitsGruppe
     * @param value
     */
    public static void changeFertigkeitsGruppeByAdvacement(ManagedCharacter character, FertigkeitsGruppe fertigkeitsGruppe, Integer value) {
        final AbstraktPersona persona = character.getPersona();

        PersonaFertigkeitsGruppe personaFertigkeitsGruppe = ShadowrunTools.findGruppe(fertigkeitsGruppe, persona);
        if (personaFertigkeitsGruppe == null) {
            PersonaFertigkeitsGruppe pf = ShadowrunEditingTools.fertigkeitsGruppe2PersonafertigkeitsGruppeTransformer(character).transform(
                    fertigkeitsGruppe);
            PersonaChange personaChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
            character.getChanges().add(personaChange);
            personaChange.setChangeable(pf);
            personaChange.setFrom(0);
            personaChange.setTo((Integer)value);
            personaChange.applyChanges();
        } else {
            if ((Integer)value == 0) {
                persona.getFertigkeitsGruppen().remove(personaFertigkeitsGruppe);
                PersonaChange advacements = ShadowrunManagmentTools.findCharacterAdvacements(character, personaFertigkeitsGruppe);
                if (advacements != null)
                    character.getChanges().remove(advacements);
            } else {
                PersonaChange advacements = ShadowrunManagmentTools.findCharacterAdvacements(character, personaFertigkeitsGruppe);
                if (advacements != null) {
                    advacements.setTo((Integer)value);
                    advacements.applyChanges();

                    persona.eNotify(new ENotificationImpl((InternalEObject)persona, Notification.SET,
                            Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITEN, null, null));
                }
            }
        }

    }

    /**
     * Creates a transformer to make a {@link Fertigkeit} object to a {@link PersonaFertigkeit} object referencing the {@link Fertigkeit}. It creates
     * the {@link PersonaFertigkeit} or returns the found one.
     * 
     * @return the transformer
     */
    public static Transformer<Fertigkeit, PersonaFertigkeit> fertigkeit2PersonafertigkeitTransformer(final ManagedCharacter character) {
        final AbstraktPersona persona = character.getPersona();
        return fertigkeit2PersonafertigkeitTransformer(persona);
    }

    /**
     * Creates a transformer to make a {@link Fertigkeit} object to a {@link PersonaFertigkeit} object referencing the {@link Fertigkeit}. It creates
     * the {@link PersonaFertigkeit} or returns the found one.
     * 
     * @return the transformer
     */
    public static Transformer<Fertigkeit, PersonaFertigkeit> fertigkeit2PersonafertigkeitTransformer(final AbstraktPersona persona) {
        Transformer<Fertigkeit, PersonaFertigkeit> transformer = new Transformer<Fertigkeit, PersonaFertigkeit>() {
            @Override
            public PersonaFertigkeit transform(Fertigkeit input) {
                PersonaFertigkeit fertigkeit = ShadowrunTools.findFertigkeit(input, persona);
                if (fertigkeit == null) {
                    fertigkeit = Shr5Factory.eINSTANCE.createPersonaFertigkeit();
                    fertigkeit.setFertigkeit(input);
                }
                return fertigkeit;
            }
        };
        return transformer;
    }

    /**
     * Creates a transformer to make a {@link FertigkeitsGruppe} object to a {@link PersonaFertigkeitsGruppe} object referencing the
     * {@link FertigkeitsGruppe}. It creates
     * a new one or returns the one existing.
     * 
     * @return the transformer
     */
    public static Transformer<FertigkeitsGruppe, PersonaFertigkeitsGruppe> fertigkeitsGruppe2PersonafertigkeitsGruppeTransformer(
            final ManagedCharacter character) {
        final AbstraktPersona persona = character.getPersona();
        return fertigkeitsGruppe2PersonafertigkeitsGruppeTransformer(persona);
    }

    /**
     * Creates a transformer to make a {@link FertigkeitsGruppe} object to a {@link PersonaFertigkeitsGruppe} object referencing the spell. It creates
     * a new one or returns the one existing.
     * 
     * @return the transformer
     */
    public static Transformer<FertigkeitsGruppe, PersonaFertigkeitsGruppe> fertigkeitsGruppe2PersonafertigkeitsGruppeTransformer(
            final AbstraktPersona persona) {
        Transformer<FertigkeitsGruppe, PersonaFertigkeitsGruppe> transformer = new Transformer<FertigkeitsGruppe, PersonaFertigkeitsGruppe>() {
            @Override
            public PersonaFertigkeitsGruppe transform(FertigkeitsGruppe input) {
                PersonaFertigkeitsGruppe gruppe = ShadowrunTools.findGruppe(input, persona);
                if (gruppe == null) {
                    gruppe = Shr5Factory.eINSTANCE.createPersonaFertigkeitsGruppe();
                    gruppe.setGruppe(input);
                }
                return gruppe;
            }

        };
        return transformer;
    }

    /**
     * Creates a transformer to make a {@link KomplexeForm} object to a {@link PersonaKomplexForm} object referencing the spell.
     * 
     * @return the transformer
     */
    public static Transformer<KomplexeForm, PersonaKomplexForm> complexForm2PersonaComplexFormTransformer() {
        Transformer<KomplexeForm, PersonaKomplexForm> transformer = new Transformer<KomplexeForm, PersonaKomplexForm>() {
            @Override
            public PersonaKomplexForm transform(KomplexeForm input) {
                PersonaKomplexForm komplexForm = Shr5Factory.eINSTANCE.createPersonaKomplexForm();
                komplexForm.setStufe(1);
                komplexForm.setForm(input);
                return komplexForm;
            }

        };
        return transformer;
    }

    /**
     * Create a float string from an int with base 100.
     * 
     * @param essenz
     * @return
     */
    public static String powerPointsToFloat(int essenz) {
        return essenzToFloat(essenz);
    }

    /**
     * Create a float string from an int with base 100.
     * 
     * @param essenz
     * @return
     */
    public static String essenzToFloat(int essenz) {
        return ShadowrunTools.essenzToFloat(essenz);
    }

    /**
     * Extract the eclasses from acceptable for a feature in the contex of the object.
     * 
     * @param eobject
     * @param feature
     * @param editingDomain
     * @return the collection of eclasses accapable for the given feauture
     */
    public static Collection<EClass> provideNewClassTypes(EObject eobject, EStructuralFeature feature, EditingDomain editingDomain) {
        Collection<EClass> filteredEClasses = new HashSet<EClass>();
        Collection<?> newChildDescriptors = AdapterFactoryUtil.getInstance().getItemDelegator().getNewChildDescriptors(eobject, editingDomain, null);
        for (Object object2 : newChildDescriptors) {
            if (object2 instanceof CommandParameter) {
                CommandParameter cp = (CommandParameter)object2;
                if (cp.feature.equals(feature))
                    filteredEClasses.add(((EObject)cp.value).eClass());
            }

        }
        return filteredEClasses;
    }

    /**
     * Find all objects matching the predicate.
     * 
     * @param editingDomain
     * @param predicate
     * @return
     */
    public static List<EObject> findAllObjects(EditingDomain editingDomain, Predicate<Object> predicate) {
        ArrayList<EObject> list = new ArrayList<EObject>();
        TreeIterator<Notifier> allContents = editingDomain.getResourceSet().getAllContents();
        while (allContents.hasNext()) {
            Notifier obj = allContents.next();
            if (predicate.evaluate(obj))
                list.add((EObject)obj);
        }
        return list;
    }

    /**
     * Open the editor for the first object in the selection.
     * 
     * @param selection
     */
    public static void openEditorForFirstSelection(ISelection selection) {
        EObject eo = null;
        eo = extractFirstEObject(selection);
        if (eo != null)
            openEObject(eo);
    }

    /**
     * Extract the first eobject from the selection or null.
     * 
     * @param selection
     * @return
     */
    public static EObject extractFirstEObject(ISelection selection) {
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection is = (IStructuredSelection)selection;
            Object firstElement = is.getFirstElement();
            if (firstElement instanceof EObject) {
                return (EObject)firstElement;
            }
        }
        return null;
    }

    public static void openEObject(EObject eo) {
        ECPAttributModifikatorWertOpener.openEditor(eo, Activator.getDefault().getDefaultEcpProject());
    }

    public static Transformer<ManagedCharacter, RuntimeCharacter> managedCharacter2RuntimeTransformer() {

        return new Transformer<ManagedCharacter, RuntimeCharacter>() {
            @Override
            public RuntimeCharacter transform(ManagedCharacter input) {
                RuntimeCharacter runtimeCharacter = RuntimeFactory.eINSTANCE.createRuntimeCharacter();
                runtimeCharacter.setCharacter(input);
                return runtimeCharacter;
            }
        };
    }
    public static Function<ManagedCharacter, RuntimeCharacter> managedCharacter2RuntimeFunction() {

        return new Function<ManagedCharacter, RuntimeCharacter>() {
            @Override
            public RuntimeCharacter apply(ManagedCharacter input) {
                RuntimeCharacter runtimeCharacter = RuntimeFactory.eINSTANCE.createRuntimeCharacter();
                runtimeCharacter.setCharacter(input);
                return runtimeCharacter;
            }
        };
    }

    public static String command2String(Command cmd) {

        if (cmd instanceof SuccesTest) {
            SuccesTest st = (SuccesTest)cmd;// ([su]|[gl])/[lim]([nh]/[th])[dp][probe]x
            String state = "";
            if (st.getProbeState() != ProbeState.CRITICAL_GLITCH)
                state = toEEnumName(st.getTestState(), st, GameplayPackage.Literals.SUCCES_TEST__TEST_STATE) + "|"
                        + toEEnumName(st.getProbeState(), st, GameplayPackage.Literals.PROBE__PROBE_STATE);
            else
                state = toEEnumName(st.getProbeState(), st, GameplayPackage.Literals.PROBE__PROBE_STATE);

            return String.format("[%s](%s/%s|%s)(%s/%s)%s%s", state, st.getSuccesses(), st.getLimit(), st.getGlitches(), st.getNetHits(),
                    st.getThresholds(), st.getProbe().size(), st.getProbe().toString());
        } else if (cmd instanceof Probe) {
            String state = "";
            Probe st = (Probe)cmd;// ([su]|[gl])/[lim]|[dp][probe]
            state = toEEnumName(st.getProbeState(), st, GameplayPackage.Literals.PROBE__PROBE_STATE);

            return String.format("[%s](%s/%s|%s)%s%s", state, st.getSuccesses(), st.getLimit(), st.getGlitches(), st.getProbe().size(), st
                    .getProbe().toString());
        }

        return "";
    }

    public static String toEEnumName(Object literal, EObject eobject, EAttribute feature) {
        if (literal == null)
            return "";

        String text2 = literal.toString();
        IItemPropertyDescriptor propertyDescriptor = AdapterFactoryUtil.getInstance().getItemDelegator().getPropertyDescriptor(eobject, feature);
        if (propertyDescriptor != null)
            text2 = propertyDescriptor.getLabelProvider(eobject).getText(literal);

        return text2;

    }

}
