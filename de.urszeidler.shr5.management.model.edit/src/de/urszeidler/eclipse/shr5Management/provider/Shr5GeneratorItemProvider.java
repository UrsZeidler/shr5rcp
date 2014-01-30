/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.GeneratorState;
import de.urszeidler.eclipse.shr5Management.Shr5Generator;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.Shr5Generator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class Shr5GeneratorItemProvider extends CharacterGeneratorItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public Shr5GeneratorItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addResourcenPropertyDescriptor(object);
            addSkillsPropertyDescriptor(object);
            addAttributePropertyDescriptor(object);
            addMetaTypePropertyDescriptor(object);
            addMagicPropertyDescriptor(object);
            addKarmaToResourcePropertyDescriptor(object);
            addKarmaSpendPropertyDescriptor(object);
            addShr5GeneratorPropertyDescriptor(object);
            addAttributeSpendPropertyDescriptor(object);
            addResourceSpendPropertyDescriptor(object);
            addConnectionSpendPropertyDescriptor(object);
            addSkillPointSpendPropertyDescriptor(object);
            addSpecialPointSpendPropertyDescriptor(object);
            addGroupPointSpendPropertyDescriptor(object);
            addKnownlegePointSpendPropertyDescriptor(object);
            addSpellPointSpendPropertyDescriptor(object);
            addStartKarmaPropertyDescriptor(object);
            addStartResourcesPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Resourcen feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected void addResourcenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(// createItemPropertyDescriptor
                new ItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                        getString("_UI_Shr5Generator_resourcen_feature"), getString("_UI_PropertyDescriptor_description",
                                "_UI_Shr5Generator_resourcen_feature", "_UI_Shr5Generator_type"),
                        Shr5managementPackage.Literals.SHR5_GENERATOR__RESOURCEN, true, false, true, null, null, null) {

                    @Override
                    public Collection<?> getChoiceOfValues(Object object) {
                        Collection<?> choiceOfValues2 = super.getChoiceOfValues(object);
                        return filterPrioityChoices(object, choiceOfValues2);
                    }
                });
    }

    /**
     * This adds a property descriptor for the Skills feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected void addSkillsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(// createItemPropertyDescriptor
                new ItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                        getString("_UI_Shr5Generator_skills_feature"), getString("_UI_PropertyDescriptor_description",
                                "_UI_Shr5Generator_skills_feature", "_UI_Shr5Generator_type"), Shr5managementPackage.Literals.SHR5_GENERATOR__SKILLS,
                        true, false, true, null, null, null) {

                    @Override
                    public Collection<?> getChoiceOfValues(Object object) {
                        Collection<?> choiceOfValues2 = super.getChoiceOfValues(object);
                        return filterPrioityChoices(object, choiceOfValues2);
                    }
                });
    }

    /**
     * This adds a property descriptor for the Attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected void addAttributePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(// createItemPropertyDescriptor
                new ItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                        getString("_UI_Shr5Generator_attribute_feature"), getString("_UI_PropertyDescriptor_description",
                                "_UI_Shr5Generator_attribute_feature", "_UI_Shr5Generator_type"),
                        Shr5managementPackage.Literals.SHR5_GENERATOR__ATTRIBUTE, true, false, true, null, null, null) {
                    @Override
                    public Collection<?> getChoiceOfValues(Object object) {
                        Collection<?> choiceOfValues2 = super.getChoiceOfValues(object);
                        return filterPrioityChoices(object, choiceOfValues2);
                    }
                });
    }

    /**
     * This adds a property descriptor for the Meta Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected void addMetaTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(// createItemPropertyDescriptor
                new ItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                        getString("_UI_Shr5Generator_metaType_feature"), getString("_UI_PropertyDescriptor_description",
                                "_UI_Shr5Generator_metaType_feature", "_UI_Shr5Generator_type"),
                        Shr5managementPackage.Literals.SHR5_GENERATOR__META_TYPE, true, false, true, null, null, null) {
                    @Override
                    public Collection<?> getChoiceOfValues(Object object) {
                        Collection<?> choiceOfValues2 = super.getChoiceOfValues(object);
                        return filterPrioityChoices(object, choiceOfValues2);
                    }
                });
    }

    /**
     * This adds a property descriptor for the Magic feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected void addMagicPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(// createItemPropertyDescriptor
                new ItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                        getString("_UI_Shr5Generator_magic_feature"), getString("_UI_PropertyDescriptor_description",
                                "_UI_Shr5Generator_magic_feature", "_UI_Shr5Generator_type"), Shr5managementPackage.Literals.SHR5_GENERATOR__MAGIC,
                        true, false, true, null, null, null) {
                    @Override
                    public Collection<?> getChoiceOfValues(Object object) {
                        Collection<?> choiceOfValues2 = super.getChoiceOfValues(object);
                        return filterPrioityChoices(object, choiceOfValues2);
                    }
                });
    }

    /**
     * This adds a property descriptor for the Karma To Resource feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addKarmaToResourcePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_Shr5Generator_karmaToResource_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_karmaToResource_feature", "_UI_Shr5Generator_type"),
                Shr5managementPackage.Literals.SHR5_GENERATOR__KARMA_TO_RESOURCE, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Karma Spend feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addKarmaSpendPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_Shr5Generator_karmaSpend_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_karmaSpend_feature", "_UI_Shr5Generator_type"),
                Shr5managementPackage.Literals.SHR5_GENERATOR__KARMA_SPEND, false, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null,
                null));
    }

    /**
     * This adds a property descriptor for the Shr5 Generator feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addShr5GeneratorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_Shr5Generator_shr5Generator_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_shr5Generator_feature", "_UI_Shr5Generator_type"),
                Shr5managementPackage.Literals.SHR5_GENERATOR__SHR5_GENERATOR, true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Attribute Spend feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addAttributeSpendPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_Shr5Generator_attributeSpend_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_attributeSpend_feature", "_UI_Shr5Generator_type"),
                Shr5managementPackage.Literals.SHR5_GENERATOR__ATTRIBUTE_SPEND, false, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Resource Spend feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addResourceSpendPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_Shr5Generator_resourceSpend_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_resourceSpend_feature", "_UI_Shr5Generator_type"),
                Shr5managementPackage.Literals.SHR5_GENERATOR__RESOURCE_SPEND, false, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Connection Spend feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addConnectionSpendPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_Shr5Generator_connectionSpend_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_connectionSpend_feature", "_UI_Shr5Generator_type"),
                Shr5managementPackage.Literals.SHR5_GENERATOR__CONNECTION_SPEND, false, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Skill Point Spend feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addSkillPointSpendPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_Shr5Generator_skillPointSpend_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_skillPointSpend_feature", "_UI_Shr5Generator_type"),
                Shr5managementPackage.Literals.SHR5_GENERATOR__SKILL_POINT_SPEND, false, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Special Point Spend feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addSpecialPointSpendPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_Shr5Generator_specialPointSpend_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_specialPointSpend_feature", "_UI_Shr5Generator_type"),
                Shr5managementPackage.Literals.SHR5_GENERATOR__SPECIAL_POINT_SPEND, false, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Group Point Spend feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addGroupPointSpendPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_Shr5Generator_groupPointSpend_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_groupPointSpend_feature", "_UI_Shr5Generator_type"),
                Shr5managementPackage.Literals.SHR5_GENERATOR__GROUP_POINT_SPEND, false, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Knownlege Point Spend feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addKnownlegePointSpendPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_Shr5Generator_knownlegePointSpend_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_knownlegePointSpend_feature", "_UI_Shr5Generator_type"),
                Shr5managementPackage.Literals.SHR5_GENERATOR__KNOWNLEGE_POINT_SPEND, false, false, false,
                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Spell Point Spend feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addSpellPointSpendPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_Shr5Generator_spellPointSpend_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_spellPointSpend_feature", "_UI_Shr5Generator_type"),
                Shr5managementPackage.Literals.SHR5_GENERATOR__SPELL_POINT_SPEND, false, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                null, null));
    }

    /**
     * This adds a property descriptor for the Start Karma feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addStartKarmaPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_Shr5Generator_startKarma_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_startKarma_feature", "_UI_Shr5Generator_type"),
                Shr5managementPackage.Literals.SHR5_GENERATOR__START_KARMA, false, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null,
                null));
    }

    /**
     * This adds a property descriptor for the Start Resources feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addStartResourcesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                getResourceLocator(), getString("_UI_Shr5Generator_startResources_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_Shr5Generator_startResources_feature", "_UI_Shr5Generator_type"),
                Shr5managementPackage.Literals.SHR5_GENERATOR__START_RESOURCES, false, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                null, null));
    }

    /**
     * This returns Shr5Generator.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Shr5Generator"));
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
        Shr5Generator shr5Generator = (Shr5Generator)object;
        GeneratorState state = shr5Generator.getState();
        String label = shr5Generator.getCharacterName();
        if (state == GeneratorState.COMMITED)
            label = label + " COMMITED";

        return label == null || label.length() == 0 ? getString("_UI_Shr5Generator_type") : getString("_UI_Shr5Generator_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(Shr5Generator.class)) {
            case Shr5managementPackage.SHR5_GENERATOR__KARMA_TO_RESOURCE:
            case Shr5managementPackage.SHR5_GENERATOR__KARMA_SPEND:
            case Shr5managementPackage.SHR5_GENERATOR__ATTRIBUTE_SPEND:
            case Shr5managementPackage.SHR5_GENERATOR__RESOURCE_SPEND:
            case Shr5managementPackage.SHR5_GENERATOR__CONNECTION_SPEND:
            case Shr5managementPackage.SHR5_GENERATOR__SKILL_POINT_SPEND:
            case Shr5managementPackage.SHR5_GENERATOR__SPECIAL_POINT_SPEND:
            case Shr5managementPackage.SHR5_GENERATOR__GROUP_POINT_SPEND:
            case Shr5managementPackage.SHR5_GENERATOR__KNOWNLEGE_POINT_SPEND:
            case Shr5managementPackage.SHR5_GENERATOR__SPELL_POINT_SPEND:
            case Shr5managementPackage.SHR5_GENERATOR__START_KARMA:
            case Shr5managementPackage.SHR5_GENERATOR__START_RESOURCES:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

    /**
     * Filters only the elements from the system it is connect to.
     * 
     * @param object
     * @param choiceOfValues2
     * @return
     */
    protected Collection<?> filterPrioityChoices(Object object, Collection<?> choiceOfValues2) {
        ArrayList<EObject> list = new ArrayList<EObject>();
        if (object instanceof Shr5Generator) {
            Shr5Generator g = (Shr5Generator)object;
            EObject container = g.getShr5Generator();
            if (container != null) {
                Collection<?> choiceOfValues = choiceOfValues2;
                for (Object object2 : choiceOfValues) {
                    if (object2 instanceof EObject) {
                        EObject eo = (EObject)object2;
                        if (container.equals(eo.eContainer())) {
                            list.add(eo);
                        }
                    }
                }

            }
        }
        return list;// Collections.EMPTY_LIST;
    }

}
