/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import de.urszeidler.eclipse.shr5Management.KarmaGenerator;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.KarmaGenerator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KarmaGeneratorItemProvider extends Shr5RuleGeneratorItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KarmaGeneratorItemProvider(AdapterFactory adapterFactory) {
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

            addMetaTypePropertyDescriptor(object);
            addCharacterConceptPropertyDescriptor(object);
            addKarmaToResourcePropertyDescriptor(object);
            addKarmaSpendPropertyDescriptor(object);
            addResourceSpendPropertyDescriptor(object);
            addStartKarmaPropertyDescriptor(object);
            addStartResourcesPropertyDescriptor(object);
            addChoiseKarmaCostPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
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
                        getString("_UI_Shr5KarmaGenerator_metaType_feature"), getString("_UI_Shr5KarmaGenerator_metaType_description",
                                "_UI_Shr5KarmaGenerator_metaType_feature", "_UI_Shr5KarmaGenerator_type"),
                        Shr5managementPackage.Literals.KARMA_GENERATOR__META_TYPE, true, false, true, null, null, null) {
                    @Override
                    public Collection<?> getChoiceOfValues(Object object) {
                        Collection<?> choiceOfValues2 = super.getChoiceOfValues(object);
                        return filterPrioityChoices(object, choiceOfValues2);
                    }
                });
    }

    /**
     * This adds a property descriptor for the Character Concept feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    protected void addCharacterConceptPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(// createItemPropertyDescriptor
                new ItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
                        getString("_UI_Shr5KarmaGenerator_characterConcept_feature"), getString("_UI_Shr5KarmaGenerator_characterConcept_description",
                                "_UI_Shr5KarmaGenerator_characterConcept_feature", "_UI_Shr5KarmaGenerator_type"),
                        Shr5managementPackage.Literals.KARMA_GENERATOR__CHARACTER_CONCEPT, true, false, true, null, null, null) {
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
     * @generated
     */
    protected void addKarmaToResourcePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_KarmaGenerator_karmaToResource_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_KarmaGenerator_karmaToResource_feature", "_UI_KarmaGenerator_type"),
                 Shr5managementPackage.Literals.KARMA_GENERATOR__KARMA_TO_RESOURCE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Karma Spend feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKarmaSpendPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_KarmaGenerator_karmaSpend_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_KarmaGenerator_karmaSpend_feature", "_UI_KarmaGenerator_type"),
                 Shr5managementPackage.Literals.KARMA_GENERATOR__KARMA_SPEND,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Resource Spend feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addResourceSpendPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_KarmaGenerator_resourceSpend_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_KarmaGenerator_resourceSpend_feature", "_UI_KarmaGenerator_type"),
                 Shr5managementPackage.Literals.KARMA_GENERATOR__RESOURCE_SPEND,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Start Karma feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartKarmaPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_KarmaGenerator_startKarma_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_KarmaGenerator_startKarma_feature", "_UI_KarmaGenerator_type"),
                 Shr5managementPackage.Literals.KARMA_GENERATOR__START_KARMA,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Start Resources feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartResourcesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_KarmaGenerator_startResources_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_KarmaGenerator_startResources_feature", "_UI_KarmaGenerator_type"),
                 Shr5managementPackage.Literals.KARMA_GENERATOR__START_RESOURCES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Choise Karma Cost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChoiseKarmaCostPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_KarmaGenerator_choiseKarmaCost_feature"),
                 getString("_UI_KarmaGenerator_choiseKarmaCost_description"),
                 Shr5managementPackage.Literals.KARMA_GENERATOR__CHOISE_KARMA_COST,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns KarmaGenerator.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/KarmaGenerator"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((KarmaGenerator<?>)object).getCharacterName();
        return label == null || label.length() == 0 ?
            getString("_UI_KarmaGenerator_type") :
            getString("_UI_KarmaGenerator_type") + " " + label;
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

        switch (notification.getFeatureID(KarmaGenerator.class)) {
            case Shr5managementPackage.KARMA_GENERATOR__KARMA_TO_RESOURCE:
            case Shr5managementPackage.KARMA_GENERATOR__KARMA_SPEND:
            case Shr5managementPackage.KARMA_GENERATOR__RESOURCE_SPEND:
            case Shr5managementPackage.KARMA_GENERATOR__START_KARMA:
            case Shr5managementPackage.KARMA_GENERATOR__START_RESOURCES:
            case Shr5managementPackage.KARMA_GENERATOR__CHOISE_KARMA_COST:
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
    @SuppressWarnings("unchecked")
    protected Collection<?> filterPrioityChoices(Object object, Collection<?> choiceOfValues2) {
        ArrayList<EObject> list = new ArrayList<EObject>();
        if (object instanceof KarmaGenerator) {
            KarmaGenerator<Shr5System> g = (KarmaGenerator<Shr5System>)object;
            EObject container = g.getGenerator();
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
