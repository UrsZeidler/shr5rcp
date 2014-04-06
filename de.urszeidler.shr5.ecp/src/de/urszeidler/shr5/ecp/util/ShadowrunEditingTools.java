/*
 * 
 */
package de.urszeidler.shr5.ecp.util;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;

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
import de.urszeidler.eclipse.shr5.Zauber;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney;
import de.urszeidler.eclipse.shr5Management.ManagedCharacter;

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
                if (lifestyle.getName().equals(choosenLifestyle.getName())) {
                    return lstsm;
                }
            }
        }
        return null;
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
        float f = essenz / 100f;
        String string = String.format("%.2f", f);//$NON-NLS-1$
        return string;
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

}
