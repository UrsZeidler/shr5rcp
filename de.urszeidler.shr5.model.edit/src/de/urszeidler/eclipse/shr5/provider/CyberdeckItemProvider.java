/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.provider;


import de.urszeidler.eclipse.shr5.Cyberdeck;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
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

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.Cyberdeck} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CyberdeckItemProvider
    extends ComlinkItemProvider
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
    public CyberdeckItemProvider(AdapterFactory adapterFactory) {
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

            addAngriffPropertyDescriptor(object);
            addSchleicherPropertyDescriptor(object);
            addProgramSlotsPropertyDescriptor(object);
            addRunningProgrammsPropertyDescriptor(object);
            addAttribute1PropertyDescriptor(object);
            addAttribute2PropertyDescriptor(object);
            addAttribute3PropertyDescriptor(object);
            addAttribute4PropertyDescriptor(object);
            addConfigurationPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Angriff feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAngriffPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ActiveMatixDevice_angriff_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ActiveMatixDevice_angriff_feature", "_UI_ActiveMatixDevice_type"),
                 Shr5Package.Literals.ACTIVE_MATIX_DEVICE__ANGRIFF,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Schleicher feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSchleicherPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ActiveMatixDevice_schleicher_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ActiveMatixDevice_schleicher_feature", "_UI_ActiveMatixDevice_type"),
                 Shr5Package.Literals.ACTIVE_MATIX_DEVICE__SCHLEICHER,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Program Slots feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProgramSlotsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Cyberdeck_programSlots_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Cyberdeck_programSlots_feature", "_UI_Cyberdeck_type"),
                 Shr5Package.Literals.CYBERDECK__PROGRAM_SLOTS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Running Programms feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRunningProgrammsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Cyberdeck_runningProgramms_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Cyberdeck_runningProgramms_feature", "_UI_Cyberdeck_type"),
                 Shr5Package.Literals.CYBERDECK__RUNNING_PROGRAMMS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Attribute1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAttribute1PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Cyberdeck_attribute1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Cyberdeck_attribute1_feature", "_UI_Cyberdeck_type"),
                 Shr5Package.Literals.CYBERDECK__ATTRIBUTE1,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Attribute2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAttribute2PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Cyberdeck_attribute2_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Cyberdeck_attribute2_feature", "_UI_Cyberdeck_type"),
                 Shr5Package.Literals.CYBERDECK__ATTRIBUTE2,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Attribute3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAttribute3PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Cyberdeck_attribute3_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Cyberdeck_attribute3_feature", "_UI_Cyberdeck_type"),
                 Shr5Package.Literals.CYBERDECK__ATTRIBUTE3,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Attribute4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAttribute4PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Cyberdeck_attribute4_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Cyberdeck_attribute4_feature", "_UI_Cyberdeck_type"),
                 Shr5Package.Literals.CYBERDECK__ATTRIBUTE4,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Configuration feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConfigurationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Cyberdeck_configuration_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Cyberdeck_configuration_feature", "_UI_Cyberdeck_type"),
                 Shr5Package.Literals.CYBERDECK__CONFIGURATION,
                 true,
                 false,
                 true,
                 null,
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
            childrenFeatures.add(Shr5Package.Literals.CYBERDECK__STRORED_PROGRAMM);
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
     * This returns Cyberdeck.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Cyberdeck"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Cyberdeck)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Cyberdeck_type") :
            getString("_UI_Cyberdeck_type") + " " + label;
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

        switch (notification.getFeatureID(Cyberdeck.class)) {
            case Shr5Package.CYBERDECK__ANGRIFF:
            case Shr5Package.CYBERDECK__SCHLEICHER:
            case Shr5Package.CYBERDECK__PROGRAM_SLOTS:
            case Shr5Package.CYBERDECK__ATTRIBUTE1:
            case Shr5Package.CYBERDECK__ATTRIBUTE2:
            case Shr5Package.CYBERDECK__ATTRIBUTE3:
            case Shr5Package.CYBERDECK__ATTRIBUTE4:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case Shr5Package.CYBERDECK__STRORED_PROGRAMM:
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
                (Shr5Package.Literals.CYBERDECK__STRORED_PROGRAMM,
                 Shr5Factory.eINSTANCE.createProgram()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.CYBERDECK__STRORED_PROGRAMM,
                 Shr5Factory.eINSTANCE.createSoftwareAgent()));
    }

}
