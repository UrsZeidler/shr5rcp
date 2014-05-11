/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.provider;


import de.urszeidler.eclipse.shr5.RiggerCommandConsole;
import de.urszeidler.eclipse.shr5.Shr5Package;

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

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.RiggerCommandConsole} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RiggerCommandConsoleItemProvider
    extends CommlinkItemProvider
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
    public RiggerCommandConsoleItemProvider(AdapterFactory adapterFactory) {
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

            addRauschunterdrueckungPropertyDescriptor(object);
            addZugriffPropertyDescriptor(object);
            addDatenverarbeitungBasisPropertyDescriptor(object);
            addFirewallBasisPropertyDescriptor(object);
            addZugriffBasisPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Rauschunterdrueckung feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRauschunterdrueckungPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RiggerCommandConsole_rauschunterdrueckung_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RiggerCommandConsole_rauschunterdrueckung_feature", "_UI_RiggerCommandConsole_type"),
                 Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__RAUSCHUNTERDRUECKUNG,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Zugriff feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addZugriffPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RiggerCommandConsole_zugriff_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RiggerCommandConsole_zugriff_feature", "_UI_RiggerCommandConsole_type"),
                 Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__ZUGRIFF,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Datenverarbeitung Basis feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDatenverarbeitungBasisPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RiggerCommandConsole_datenverarbeitungBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RiggerCommandConsole_datenverarbeitungBasis_feature", "_UI_RiggerCommandConsole_type"),
                 Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG_BASIS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Firewall Basis feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFirewallBasisPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RiggerCommandConsole_firewallBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RiggerCommandConsole_firewallBasis_feature", "_UI_RiggerCommandConsole_type"),
                 Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__FIREWALL_BASIS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Zugriff Basis feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addZugriffBasisPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RiggerCommandConsole_zugriffBasis_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RiggerCommandConsole_zugriffBasis_feature", "_UI_RiggerCommandConsole_type"),
                 Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__ZUGRIFF_BASIS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns RiggerCommandConsole.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/RiggerCommandConsole"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((RiggerCommandConsole)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_RiggerCommandConsole_type") :
            getString("_UI_RiggerCommandConsole_type") + " " + label;
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

        switch (notification.getFeatureID(RiggerCommandConsole.class)) {
            case Shr5Package.RIGGER_COMMAND_CONSOLE__RAUSCHUNTERDRUECKUNG:
            case Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF:
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG_BASIS:
            case Shr5Package.RIGGER_COMMAND_CONSOLE__FIREWALL_BASIS:
            case Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF_BASIS:
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
