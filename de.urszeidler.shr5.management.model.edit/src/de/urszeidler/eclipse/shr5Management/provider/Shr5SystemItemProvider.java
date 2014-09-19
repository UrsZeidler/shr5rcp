/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.swt.graphics.Image;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.eclipse.shr5Management.Shr5System;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.Shr5System} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Shr5SystemItemProvider
	extends PrioritySystemItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shr5SystemItemProvider(AdapterFactory adapterFactory) {
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

            addKarmaToResourceFactorPropertyDescriptor(object);
            addKarmaToMagicFactorPropertyDescriptor(object);
            addNumberOfMaxAttributesPropertyDescriptor(object);
            addKnowlegeSkillFactorPropertyDescriptor(object);
            addCharismaToConnectionFactorPropertyDescriptor(object);
            addMaxResourceToKeepPropertyDescriptor(object);
            addMaxKarmaToResourcesPropertyDescriptor(object);
            addMaxKarmaToKeepPropertyDescriptor(object);
            addSkillMaxPropertyDescriptor(object);
            addNumberOfSpecalismPropertyDescriptor(object);
            addKarmaToConnectionFactorPropertyDescriptor(object);
            addBoundSprititServiceCostPropertyDescriptor(object);
            addApplicableGeneratorsPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
     * This adds a property descriptor for the Karma To Resource Factor feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addKarmaToResourceFactorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Shr5System_karmaToResourceFactor_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Shr5System_karmaToResourceFactor_feature", "_UI_Shr5System_type"),
                 Shr5managementPackage.Literals.SHR5_SYSTEM__KARMA_TO_RESOURCE_FACTOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Karma To Magic Factor feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addKarmaToMagicFactorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Shr5System_karmaToMagicFactor_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Shr5System_karmaToMagicFactor_feature", "_UI_Shr5System_type"),
                 Shr5managementPackage.Literals.SHR5_SYSTEM__KARMA_TO_MAGIC_FACTOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Number Of Max Attributes feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addNumberOfMaxAttributesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Shr5System_numberOfMaxAttributes_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Shr5System_numberOfMaxAttributes_feature", "_UI_Shr5System_type"),
                 Shr5managementPackage.Literals.SHR5_SYSTEM__NUMBER_OF_MAX_ATTRIBUTES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Knowlege Skill Factor feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addKnowlegeSkillFactorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Shr5System_knowlegeSkillFactor_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Shr5System_knowlegeSkillFactor_feature", "_UI_Shr5System_type"),
                 Shr5managementPackage.Literals.SHR5_SYSTEM__KNOWLEGE_SKILL_FACTOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Charisma To Connection Factor feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addCharismaToConnectionFactorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Shr5System_charismaToConnectionFactor_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Shr5System_charismaToConnectionFactor_feature", "_UI_Shr5System_type"),
                 Shr5managementPackage.Literals.SHR5_SYSTEM__CHARISMA_TO_CONNECTION_FACTOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Max Resource To Keep feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxResourceToKeepPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Shr5System_maxResourceToKeep_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Shr5System_maxResourceToKeep_feature", "_UI_Shr5System_type"),
                 Shr5managementPackage.Literals.SHR5_SYSTEM__MAX_RESOURCE_TO_KEEP,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Max Karma To Resources feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxKarmaToResourcesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Shr5System_maxKarmaToResources_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Shr5System_maxKarmaToResources_feature", "_UI_Shr5System_type"),
                 Shr5managementPackage.Literals.SHR5_SYSTEM__MAX_KARMA_TO_RESOURCES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Max Karma To Keep feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxKarmaToKeepPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Shr5System_maxKarmaToKeep_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Shr5System_maxKarmaToKeep_feature", "_UI_Shr5System_type"),
                 Shr5managementPackage.Literals.SHR5_SYSTEM__MAX_KARMA_TO_KEEP,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Skill Max feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSkillMaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Shr5System_skillMax_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Shr5System_skillMax_feature", "_UI_Shr5System_type"),
                 Shr5managementPackage.Literals.SHR5_SYSTEM__SKILL_MAX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Number Of Specalism feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNumberOfSpecalismPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Shr5System_numberOfSpecalism_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Shr5System_numberOfSpecalism_feature", "_UI_Shr5System_type"),
                 Shr5managementPackage.Literals.SHR5_SYSTEM__NUMBER_OF_SPECALISM,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Karma To Connection Factor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKarmaToConnectionFactorPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Shr5System_karmaToConnectionFactor_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Shr5System_karmaToConnectionFactor_feature", "_UI_Shr5System_type"),
                 Shr5managementPackage.Literals.SHR5_SYSTEM__KARMA_TO_CONNECTION_FACTOR,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Bound Spritit Service Cost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBoundSprititServiceCostPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Shr5System_boundSprititServiceCost_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Shr5System_boundSprititServiceCost_feature", "_UI_Shr5System_type"),
                 Shr5managementPackage.Literals.SHR5_SYSTEM__BOUND_SPRITIT_SERVICE_COST,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Applicable Generators feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addApplicableGeneratorsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Shr5System_applicableGenerators_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Shr5System_applicableGenerators_feature", "_UI_Shr5System_type"),
                 Shr5managementPackage.Literals.SHR5_SYSTEM__APPLICABLE_GENERATORS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This returns Shr5System.gif.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated not 
     */
	@Override
	public Object getImage(Object object) {
        Beschreibbar beschreibbar = (Beschreibbar) object;
        if (beschreibbar.getImage() != null) {
            Image image = AdapterFactoryUtil.getInstance().getImageScaledBy(16, beschreibbar.getImage());
            if (image != null)
                return image;
        }

        return overlayImage(object, getResourceLocator().getImage("full/obj16/Shr5System"));
    }

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        String label = ((Shr5System)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Shr5System_type") :
            getString("_UI_Shr5System_type") + " " + label;
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

        switch (notification.getFeatureID(Shr5System.class)) {
            case Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_RESOURCE_FACTOR:
            case Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_MAGIC_FACTOR:
            case Shr5managementPackage.SHR5_SYSTEM__NUMBER_OF_MAX_ATTRIBUTES:
            case Shr5managementPackage.SHR5_SYSTEM__KNOWLEGE_SKILL_FACTOR:
            case Shr5managementPackage.SHR5_SYSTEM__CHARISMA_TO_CONNECTION_FACTOR:
            case Shr5managementPackage.SHR5_SYSTEM__MAX_RESOURCE_TO_KEEP:
            case Shr5managementPackage.SHR5_SYSTEM__MAX_KARMA_TO_RESOURCES:
            case Shr5managementPackage.SHR5_SYSTEM__MAX_KARMA_TO_KEEP:
            case Shr5managementPackage.SHR5_SYSTEM__SKILL_MAX:
            case Shr5managementPackage.SHR5_SYSTEM__NUMBER_OF_SPECALISM:
            case Shr5managementPackage.SHR5_SYSTEM__KARMA_TO_CONNECTION_FACTOR:
            case Shr5managementPackage.SHR5_SYSTEM__BOUND_SPRITIT_SERVICE_COST:
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

}
