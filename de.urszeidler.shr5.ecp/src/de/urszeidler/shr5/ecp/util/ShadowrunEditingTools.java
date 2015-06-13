/*
 * 
 */
package de.urszeidler.shr5.ecp.util;

import java.awt.image.BufferedImage;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Shell;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;

import de.urszeidler.commons.functors.Predicate;
import de.urszeidler.commons.functors.Transformer;
import de.urszeidler.eclipse.shr5.AbstraktGegenstand;
import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.FertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Identifiable;
import de.urszeidler.eclipse.shr5.KomplexeForm;
import de.urszeidler.eclipse.shr5.Lifestyle;
import de.urszeidler.eclipse.shr5.MagischeTradition;
import de.urszeidler.eclipse.shr5.MartialartStyle;
import de.urszeidler.eclipse.shr5.MartialartTechnique;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.PersonaKomplexForm;
import de.urszeidler.eclipse.shr5.PersonaMartialartStyle;
import de.urszeidler.eclipse.shr5.PersonaMartialartTechnique;
import de.urszeidler.eclipse.shr5.PersonaZauber;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.SourceBook;
import de.urszeidler.eclipse.shr5.Spezies;
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.Probe;
import de.urszeidler.eclipse.shr5.gameplay.ProbeState;
import de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand;
import de.urszeidler.eclipse.shr5.gameplay.SuccesTest;
import de.urszeidler.eclipse.shr5.runtime.RuntimeCharacter;
import de.urszeidler.eclipse.shr5.runtime.RuntimeFactory;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5.util.Shr5ResourceFactoryImpl;
import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.PriorityCategorie;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;
import de.urszeidler.emf.commons.ui.dialogs.OwnChooseDialog;
import de.urszeidler.shr5.ecp.Activator;
import de.urszeidler.shr5.ecp.opener.ECPAttributModifikatorWertOpener;

/**
 * A collection of tool functions.
 * 
 * @author urs
 */
public class ShadowrunEditingTools {
    
    
    /**
     * Transform to the message string.
     * 
     * @return
     */
    public static Function<Diagnostic, String> diagnosticToStringTransformer() {
        return new Function<Diagnostic, String>() {
            @Override
            public String apply(Diagnostic input) {
                return input.getMessage();
            }
        };
    }

    /**
     * from "http://www.java2s.com/Code/Java/SWT-JFace-Eclipse/ConvertsabufferedimagetoSWTImageData.htm"
     * 
     * @param bufferedImage
     * @return
     */
    public static ImageData convertToSWT(BufferedImage bufferedImage) {
        if (bufferedImage.getColorModel() instanceof DirectColorModel) {
            DirectColorModel colorModel = (DirectColorModel)bufferedImage.getColorModel();
            PaletteData palette = new PaletteData(colorModel.getRedMask(), colorModel.getGreenMask(), colorModel.getBlueMask());
            ImageData data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(), colorModel.getPixelSize(), palette);
            for (int y = 0; y < data.height; y++) {
                for (int x = 0; x < data.width; x++) {
                    int rgb = bufferedImage.getRGB(x, y);
                    int pixel = palette.getPixel(new RGB((rgb >> 16) & 0xFF, (rgb >> 8) & 0xFF, rgb & 0xFF));
                    data.setPixel(x, y, pixel);
                    if (colorModel.hasAlpha()) {
                        data.setAlpha(x, y, (rgb >> 24) & 0xFF);
                    }
                }
            }
            return data;
        } else if (bufferedImage.getColorModel() instanceof IndexColorModel) {
            IndexColorModel colorModel = (IndexColorModel)bufferedImage.getColorModel();
            int size = colorModel.getMapSize();
            byte[] reds = new byte[size];
            byte[] greens = new byte[size];
            byte[] blues = new byte[size];
            colorModel.getReds(reds);
            colorModel.getGreens(greens);
            colorModel.getBlues(blues);
            RGB[] rgbs = new RGB[size];
            for (int i = 0; i < rgbs.length; i++) {
                rgbs[i] = new RGB(reds[i] & 0xFF, greens[i] & 0xFF, blues[i] & 0xFF);
            }
            PaletteData palette = new PaletteData(rgbs);
            ImageData data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(), colorModel.getPixelSize(), palette);
            data.transparentPixel = colorModel.getTransparentPixel();
            WritableRaster raster = bufferedImage.getRaster();
            int[] pixelArray = new int[1];
            for (int y = 0; y < data.height; y++) {
                for (int x = 0; x < data.width; x++) {
                    raster.getPixel(x, y, pixelArray);
                    data.setPixel(x, y, pixelArray[0]);
                }
            }
            return data;
        }
        return null;
    }

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

    // TODO : these methods belong to the shadowrunManagementTools
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
            // personaChange.setFrom(0);
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
                    advacements.setTo(Math.max(advacements.getFrom(), (Integer)value));
                    advacements.applyChanges();

                    persona.eNotify(new ENotificationImpl((InternalEObject)persona, Notification.SET,
                            Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITEN, null, null));
                } else if (advacements == null) {
                    PersonaChange personaChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
                    character.getChanges().add(personaChange);
                    personaChange.setChangeable(personaFertigkeit);
                    personaChange.setTo((Integer)value);
                    personaChange.applyChanges();
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
     * @deprecated use de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools#changeAttributeByAdvacement(ManagedCharacter, EAttribute,
     * Integer)
     */
    @Deprecated()
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
            character.getChanges().add(attributeChange);
            attributeChange.setAttibute(attribute);
            // attributeChange.setFrom((Integer)eGet);
            attributeChange.setTo(value);
            attributeChange.applyChanges();
            persona.eNotify(new ENotificationImpl((InternalEObject)persona, Notification.SET, attribute, eGet, value));
        } else if (eGet == value) {
            character.getChanges().remove(attributeChange);
            persona.eSet(attribute, eGet);
        } else {
            attributeChange.setTo(Math.max(attributeChange.getFrom(), (Integer)value));
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
                    advacements.setTo(Math.max(advacements.getFrom(), (Integer)value));
                    advacements.applyChanges();

                    persona.eNotify(new ENotificationImpl((InternalEObject)persona, Notification.SET,
                            Shr5Package.Literals.ABSTRAKT_PERSONA__FERTIGKEITEN, null, null));
                } else if (advacements == null) {
                    PersonaChange personaChange = Shr5managementFactory.eINSTANCE.createPersonaChange();
                    character.getChanges().add(personaChange);
                    personaChange.setChangeable(personaFertigkeitsGruppe);
                    personaChange.setTo((Integer)value);
                    personaChange.applyChanges();
                }
            }
        }

    }

    // TODO : move the transformer to the ShadowrunTools
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
     * Lookup a skill from the reource set by name.
     * 
     * @param sb
     * @return
     */
    public static String findObject(final String sb) {
        EditingDomain editingDomain = Activator.getDefault().getEdtingDomain();
        Collection<EObject> filteredObject = ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (sb != null)
                    if (input instanceof Beschreibbar) {
                        if (sb.equals(((Beschreibbar)input).getName()))
                            return true;
                    }
                return false;
            }
        });
        Iterator<EObject> iterator = filteredObject.iterator();
        if (iterator.hasNext())
            return getId(iterator.next());
        return "";
    }

    /**
     * Lookup a skill from the reource set by name.
     * 
     * @param sb
     * @return
     */
    public static String findTradition(final String sb) {
        EditingDomain editingDomain = Activator.getDefault().getEdtingDomain();
        Collection<EObject> filteredObject = ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (sb != null)
                    if (input instanceof MagischeTradition) {
                        if (sb.equals(((MagischeTradition)input).getName()))
                            return true;
                    }
                return false;
            }
        });
        Iterator<EObject> iterator = filteredObject.iterator();
        if (iterator.hasNext())
            return getId(iterator.next());
        return "";
    }

    /**
     * Lookup a skill from the reource set by name.
     * 
     * @param sb
     * @return
     */
    public static String findSkill(final String sb) {
        EditingDomain editingDomain = Activator.getDefault().getEdtingDomain();
        Collection<EObject> filteredObject = ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (sb != null)
                    if (input instanceof Fertigkeit) {
                        if (sb.equals(((Fertigkeit)input).getName()))
                            return true;
                    }
                return false;
            }
        });
        Iterator<EObject> iterator = filteredObject.iterator();
        if (iterator.hasNext())
            return getId(iterator.next());
        return "";
    }

    public static String findSkillGroup(final String sb) {
        EditingDomain editingDomain = Activator.getDefault().getEdtingDomain();
        Collection<EObject> filteredObject = ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (sb != null)
                    if (input instanceof FertigkeitsGruppe) {
                        if (sb.equals(((FertigkeitsGruppe)input).getName()))
                            return true;
                    }
                return false;
            }
        });
        Iterator<EObject> iterator = filteredObject.iterator();
        if (iterator.hasNext())
            return getId(iterator.next());
        return "";
    }

    public static String findSpecies(final String sb) {
        EditingDomain editingDomain = Activator.getDefault().getEdtingDomain();
        Collection<EObject> filteredObject = ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (sb != null)
                    if (input instanceof Spezies) {
                        if (sb.equals(((Spezies)input).getName()))
                            return true;
                    }
                return false;
            }
        });
        Iterator<EObject> iterator = filteredObject.iterator();
        if (iterator.hasNext())
            return getId(iterator.next());
        return "";
    }

    public static String findSourceBook(final String sb) {
        if ("SR5".equals(sb))
            return "f5ec713c-98cd-41f6-a0a4-4a8eaed55b66";
        EditingDomain editingDomain = Activator.getDefault().getEdtingDomain();
        Collection<EObject> filteredObject = ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (sb != null)
                    if (input instanceof SourceBook) {
                        if (sb.equals(((SourceBook)input).getName()))
                            return true;
                    }
                return false;
            }
        });
        Iterator<EObject> iterator = filteredObject.iterator();
        if (iterator.hasNext())
            return getId(iterator.next());
        return "";
    }

    public static String findPersonaType(String adept, String magician, String technomancer) {
        if ("true".equals(adept.toLowerCase()) && "true".equals(magician.toLowerCase()))
            return "shr5:" + Shr5Package.Literals.MYSTIC_ADEPT.getName();
        if ("true".equals(adept.toLowerCase()))
            return "shr5:" + Shr5Package.Literals.KI_ADEPT.getName();
        if ("true".equals(magician.toLowerCase()))
            return "shr5:" + Shr5Package.Literals.MAGIER.getName();
        return "shr5:" + Shr5Package.Literals.MUDAN_PERSONA.getName();
    }

    public static String findPriority(final String priorityName, final String systemName, String categoryName) {
        final EClass eclass;
        if ("resources".equals(categoryName))
            eclass = Shr5managementPackage.Literals.RESOURCEN;
        else if ("skills".equals(categoryName))
            eclass = Shr5managementPackage.Literals.SKILL;
        else if ("attribute".equals(categoryName))
            eclass = Shr5managementPackage.Literals.ATTRIBUTES;
        else
            eclass = Shr5managementPackage.Literals.RESOURCEN;

        EditingDomain editingDomain = Activator.getDefault().getEdtingDomain();
        Collection<EObject> filteredObject = ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (systemName != null)
                    if (input instanceof Shr5System) {
                        if (systemName.equals(((Shr5System)input).getName()))
                            return true;
                    }
                return false;
            }
        });
        Iterator<EObject> iterator = filteredObject.iterator();
        if (iterator.hasNext()) {

            Shr5System eObject = (Shr5System)iterator.next();
            Optional<PriorityCategorie> firstMatch = FluentIterable.from(eObject.getPriorities()).firstMatch(
                    new com.google.common.base.Predicate<PriorityCategorie>() {

                        @Override
                        public boolean apply(PriorityCategorie input) {
                            return input.eClass().equals(eclass) && priorityName.substring(0, 1).equals(input.getCategorieName());
                        }
                    });
            if (firstMatch.isPresent())
                return getId(firstMatch.get());
        }
        // return getId(iterator.next());
        return "";
    }

    /**
     * Copies the object with the id or the name and serialize it as xml.
     * 
     * @param name
     * @param id
     * @param nodeName
     * @return
     */
    public static String copyObject(final String name, final String id, final String nodeName) {
        EditingDomain editingDomain = Activator.getDefault().getEdtingDomain();
        Collection<EObject> filteredObject = ShadowrunEditingTools.findAllObjects(editingDomain, new Predicate<Object>() {
            @Override
            public boolean evaluate(Object input) {
                if (name != null)
                    if (input instanceof Beschreibbar) {
                        Beschreibbar input2 = (Beschreibbar)input;
                        if ("inventar".equals(nodeName))
                            if (!(input2 instanceof AbstraktGegenstand))
                                return false;

                        if (getId(input2).equals(id))
                            return true;

                        if (name.equals(input2.getName()))
                            return true;

                    }
                return false;
            }
        });
        Iterator<EObject> iterator = filteredObject.iterator();
        if (iterator.hasNext()) {
            EObject eobject = iterator.next();

            Map<Object, Object> options = new HashMap<Object, Object>();
            // options.put(XMIResource.OPTION_SUPPRESS_XMI, true);
            options.put(XMIResource.NO_NAMESPACE_SCHEMA_LOCATION, true);
            options.put(XMIResource.OPTION_ENCODING, "UTF-8");
            options.put(XMIResource.OPTION_SCHEMA_LOCATION, false);
            options.put(XMIResource.OPTION_DECLARE_XML, false);
            options.put(XMIResource.SCHEMA_LOCATION, false);

            EObject copyWithParentId = copyWithParentId(eobject);
            try {
                String type = copyWithParentId.eClass().getName();
                final Shr5ResourceFactoryImpl resourceSet = new Shr5ResourceFactoryImpl();
                final XMIResource resource = (XMIResource)resourceSet.createResource(URI.createURI("http:///My.xml"));
                resource.getContents().add(copyWithParentId);
                StringWriter out = new StringWriter();
                resource.save(out, options);
                return out.toString()
                        //
                        .replaceFirst("^<.* xmlns:shr5=\"http://urszeidler.de/shr5/1.0\"", "\n<" + nodeName + " xsi:type=\"shr5:" + type + "\" ")
                        .replaceAll("</shr5:.*>", "</" + nodeName + ">");
            } catch (final IOException e) {
            }

        }
        return "";
    }

    /**
     * Creates a copy of the eobject, when it is an {@link Identifiable} the parent id will be set to the id of the org object when the org object has
     * no parentId set. So the copied object has the org id as parentId or the parentId.
     * 
     * @param eo the org {@link EObject}
     * @return the copy
     */
    public static EObject copyWithParentId(EObject eo) {
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

            return String.format("[%s](%s/%s|%s)%s%s", state, st.getSuccesses(), st.getLimit(), st.getGlitches(), st.getProbe().size(), st.getProbe()
                    .toString());
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

    public static SetFeatureCommand changeItem(RuntimeCharacter subject, EReference references, Shell shell) {
        EObject object = null;

        IItemPropertyDescriptor propertyDescriptor = AdapterFactoryUtil.getInstance().getItemDelegator().getPropertyDescriptor(subject, references);
        List<?> values = (List<?>)propertyDescriptor.getChoiceOfValues(subject);
        OwnChooseDialog dialog = new OwnChooseDialog(shell, values.toArray(new Object[]{}), "Change item", "Select the item you want to choose.");

        dialog.setLabelProvider(AdapterFactoryUtil.getInstance().getLabelProvider());
        int open = dialog.open();
        if (open == Dialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length > 0) {
                object = (EObject)result[0];
            }

        }
        if (object == null)
            return null;
        SetFeatureCommand setFeatureCommand = GameplayFactory.eINSTANCE.createSetFeatureCommand();
        setFeatureCommand.setObject(subject);
        setFeatureCommand.setFeature(references);
        setFeatureCommand.setValue(object);
        return setFeatureCommand;
    }

    /**
     * Transform the eobjects to the label provider names.
     * 
     * @return
     */
    public static Function<EObject, String> eObject2StringTransformer() {
        return new Function<EObject, String>() {

            @Override
            public String apply(EObject input) {
                return AdapterFactoryUtil.getInstance().getLabelProvider().getText(input);
            }
        };
    }

    /**
     * Returns the localized feature name.
     * 
     * @param object
     * @param eAttribute
     * @return
     */
    public static String toFeatureName(EObject object, EStructuralFeature eAttribute) {
        IItemPropertyDescriptor descriptor = AdapterFactoryUtil.getInstance().getItemDelegator().getPropertyDescriptor(object, eAttribute);
        if (descriptor == null)
            return AdapterFactoryUtil.getInstance().getItemDelegator().getText(eAttribute);

        return descriptor.getDisplayName(eAttribute);
    }

    public static Transformer<MartialartStyle, PersonaMartialartStyle> martialArt2PersonaMartialArtTransformer() {
        return new Transformer<MartialartStyle, PersonaMartialartStyle>() {

            @Override
            public PersonaMartialartStyle transform(MartialartStyle input) {
                PersonaMartialartStyle style = Shr5Factory.eINSTANCE.createPersonaMartialartStyle();
                style.setStyle(input);
                return style;
            }
        };
    }

    public static Transformer<MartialartTechnique, PersonaMartialartTechnique> martialArtTechnique2PersonaMartialArtTransformer() {
        return new Transformer<MartialartTechnique, PersonaMartialartTechnique>() {

            @Override
            public PersonaMartialartTechnique transform(MartialartTechnique input) {
                PersonaMartialartTechnique technique = Shr5Factory.eINSTANCE.createPersonaMartialartTechnique();
                technique.setTechnique(input);
                return technique;
            }
        };
    }
}
