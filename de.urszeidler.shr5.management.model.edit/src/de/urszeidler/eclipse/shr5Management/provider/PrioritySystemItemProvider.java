/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.urszeidler.eclipse.shr5Management.PrioritySystem;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5Management.PrioritySystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrioritySystemItemProvider
	extends CharacterGeneratorSystemItemProvider
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
	public PrioritySystemItemProvider(AdapterFactory adapterFactory) {
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

            addKarmaPointsPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
     * This adds a property descriptor for the Karma Points feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addKarmaPointsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PrioritySystem_karmaPoints_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PrioritySystem_karmaPoints_feature", "_UI_PrioritySystem_type"),
                 Shr5managementPackage.Literals.PRIORITY_SYSTEM__KARMA_POINTS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

	/**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(Shr5managementPackage.Literals.PRIORITY_SYSTEM__PRIORITIES);
        }
        return childrenFeatures;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        String label = ((PrioritySystem)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_PrioritySystem_type") :
            getString("_UI_PrioritySystem_type") + " " + label;
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

        switch (notification.getFeatureID(PrioritySystem.class)) {
            case Shr5managementPackage.PRIORITY_SYSTEM__KARMA_POINTS:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case Shr5managementPackage.PRIORITY_SYSTEM__PRIORITIES:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PRIORITY_SYSTEM__PRIORITIES,
                 Shr5managementFactory.eINSTANCE.createMetaType()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PRIORITY_SYSTEM__PRIORITIES,
                 Shr5managementFactory.eINSTANCE.createAttributes()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PRIORITY_SYSTEM__PRIORITIES,
                 Shr5managementFactory.eINSTANCE.createSkill()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PRIORITY_SYSTEM__PRIORITIES,
                 Shr5managementFactory.eINSTANCE.createResourcen()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PRIORITY_SYSTEM__PRIORITIES,
                 Shr5managementFactory.eINSTANCE.createTechnomancer()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PRIORITY_SYSTEM__PRIORITIES,
                 Shr5managementFactory.eINSTANCE.createAdept()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PRIORITY_SYSTEM__PRIORITIES,
                 Shr5managementFactory.eINSTANCE.createSpellcaster()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5managementPackage.Literals.PRIORITY_SYSTEM__PRIORITIES,
                 Shr5managementFactory.eINSTANCE.createMudan()));
    }

}
