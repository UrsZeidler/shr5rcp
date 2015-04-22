/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;

import de.urszeidler.eclipse.shr5.AbstraktPersona;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.util.Shr5EditingTools;
import de.urszeidler.eclipse.shr5Management.PersonaMartialArtChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.PersonaMartialArtChange} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonaMartialArtChangeItemProvider extends PersonaChangeItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PersonaMartialArtChangeItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addStylePropertyDescriptor(object);
            addTechniquePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Changeable feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected void addChangeablePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_PersonaChange_changeable_feature"), getString("_UI_PropertyDescriptor_description",
                        "_UI_PersonaChange_changeable_feature", "_UI_PersonaChange_type"), Shr5managementPackage.Literals.PERSONA_CHANGE__CHANGEABLE,
                true, false, true, null, null, null) {
            @Override
            protected Collection<?> getComboBoxObjects(Object object) {
                final PersonaMartialArtChange pmc = (PersonaMartialArtChange)object;
                if (pmc.getCharacter() != null) {
                    AbstraktPersona persona = pmc.getCharacter().getPersona();
                    ImmutableList<PersonaFertigkeit> list = FluentIterable.from(super.getComboBoxObjects(object)).filter(PersonaFertigkeit.class)
                            .filter(Predicates.in(persona.getFertigkeiten())).filter(new Predicate<PersonaFertigkeit>() {
                                @Override
                                public boolean apply(PersonaFertigkeit input) {
                                    if (pmc.getStyle() != null)
                                        return pmc.getStyle().getUsableWith().contains(input.getFertigkeit());
                                    else
                                        return true;
                                }
                            }).toList();

                    return new ArrayList<PersonaFertigkeit>(list);
                }
                return super.getComboBoxObjects(object);
            }
        });
    }

    /**
     * This adds a property descriptor for the Style feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected void addStylePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_PersonaMartialArtChange_style_feature"),
                getString("_UI_PersonaMartialArtChange_style_description"), Shr5managementPackage.Literals.PERSONA_MARTIAL_ART_CHANGE__STYLE, true,
                false, true, null, null, null) {

            @Override
            protected Collection<?> getComboBoxObjects(Object object) {
                final PersonaMartialArtChange pmc = (PersonaMartialArtChange)object;
                // if(pmc.getChangeable()!=null){
                // ImmutableList<?> list = FluentIterable.from(super.getComboBoxObjects(object)).filter(new Predicate<Object>() {
                //
                // @Override
                // public boolean apply(Object input) {
                // if (input instanceof MartialartStyle) {
                // MartialartStyle ms = (MartialartStyle)input;
                // return ms.getUsableWith().contains(pmc.getChangeable());
                // }
                // return false;
                // }
                // }).toList();
                //
                // return new ArrayList<Object>(list);
                // }
                return super.getComboBoxObjects(object);
            }
        });
    }

    /**
     * This adds a property descriptor for the Technique feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected void addTechniquePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_PersonaMartialArtChange_technique_feature"),
                getString("_UI_PersonaMartialArtChange_technique_description"), Shr5managementPackage.Literals.PERSONA_MARTIAL_ART_CHANGE__TECHNIQUE,
                true, false, true, null, null, null) {
            @Override
            protected Collection<?> getComboBoxObjects(Object object) {
                PersonaMartialArtChange pmc = (PersonaMartialArtChange)object;
                if (pmc.getStyle() != null) {
                    return pmc.getStyle().getTechniques();
                }
                return super.getComboBoxObjects(object);
            }

        });
    }

    /**
     * This returns PersonaMartialArtChange.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/PersonaMartialArtChange"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    @Override
    public String getText(Object object) {
        PersonaMartialArtChange mac = (PersonaMartialArtChange)object;
        if (mac.getStyle() == null && mac.getTechnique() == null && mac.getChangeable() == null)
            return getString("_UI_PersonaMartialArtChange_type");

        final ComposeableAdapterFactory factory = ((Shr5managementItemProviderAdapterFactory)this.adapterFactory).getRootAdapterFactory();

        final String unset = getString("_UI_Unset_text");
        String style = Shr5EditingTools.getLabelForEObject(factory, unset, mac.getStyle());
        String technique = Shr5EditingTools.getLabelForEObject(factory, unset, mac.getTechnique());
        String fertigkeit = Shr5EditingTools.getLabelForEObject(factory, unset, mac.getChangeable());

        if (mac.getChangeable() == null)
            return String.format("Learn %s for %s", technique,style);
        else
            return String.format("Learn %s and %s for %s", style, technique, fertigkeit);
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
