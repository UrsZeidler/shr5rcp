/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.swt.graphics.Image;

import de.urszeidler.eclipse.shr5.Beschreibbar;
import de.urszeidler.eclipse.shr5.RiggerCommandConsole;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.RiggerCommandConsole} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RiggerCommandConsoleItemProvider
    extends AbstraktGegenstandItemProvider {
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

            addMatrixZustandMaxPropertyDescriptor(object);
            addGeraetestufePropertyDescriptor(object);
            addFirewallPropertyDescriptor(object);
            addDatenverarbeitungPropertyDescriptor(object);
            addCurrentModusPropertyDescriptor(object);
            addDeviceRatingPropertyDescriptor(object);
            addRauschunterdrueckungPropertyDescriptor(object);
            addZugriffPropertyDescriptor(object);
            addDatenverarbeitungBasisPropertyDescriptor(object);
            addFirewallBasisPropertyDescriptor(object);
            addZugriffBasisPropertyDescriptor(object);
            addRunningProgramsPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Matrix Zustand Max feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMatrixZustandMaxPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MatixConditionMonitor_matrixZustandMax_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MatixConditionMonitor_matrixZustandMax_feature", "_UI_MatixConditionMonitor_type"),
                 Shr5Package.Literals.MATIX_CONDITION_MONITOR__MATRIX_ZUSTAND_MAX,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Geraetestufe feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGeraetestufePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MatrixAttributes_geraetestufe_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MatrixAttributes_geraetestufe_feature", "_UI_MatrixAttributes_type"),
                 Shr5Package.Literals.MATRIX_ATTRIBUTES__GERAETESTUFE,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Firewall feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFirewallPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MatrixAttributes_firewall_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MatrixAttributes_firewall_feature", "_UI_MatrixAttributes_type"),
                 Shr5Package.Literals.MATRIX_ATTRIBUTES__FIREWALL,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Datenverarbeitung feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDatenverarbeitungPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MatrixAttributes_datenverarbeitung_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MatrixAttributes_datenverarbeitung_feature", "_UI_MatrixAttributes_type"),
                 Shr5Package.Literals.MATRIX_ATTRIBUTES__DATENVERARBEITUNG,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Current Modus feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCurrentModusPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_MatrixAttributes_currentModus_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_MatrixAttributes_currentModus_feature", "_UI_MatrixAttributes_type"),
                 Shr5Package.Literals.MATRIX_ATTRIBUTES__CURRENT_MODUS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Device Rating feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDeviceRatingPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AbstractMatrixDevice_deviceRating_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AbstractMatrixDevice_deviceRating_feature", "_UI_AbstractMatrixDevice_type"),
                 Shr5Package.Literals.ABSTRACT_MATRIX_DEVICE__DEVICE_RATING,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
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
     * This adds a property descriptor for the Running Programs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    protected void addRunningProgramsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (new ItemPropertyDescriptor//createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RiggerCommandConsole_runningPrograms_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RiggerCommandConsole_runningPrograms_feature", "_UI_RiggerCommandConsole_type"),
                 Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__RUNNING_PROGRAMS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null){
                @Override
                public Collection<?> getChoiceOfValues(Object object) {
                    return ((RiggerCommandConsole)(object)).getStoredPrograms();
                }

            });
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
            childrenFeatures.add(Shr5Package.Literals.MATRIX_DEVICE__PAN);
            childrenFeatures.add(Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__STORED_PROGRAMS);
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
     * This returns RiggerCommandConsole.gif.
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
            case Shr5Package.RIGGER_COMMAND_CONSOLE__MATRIX_ZUSTAND_MAX:
            case Shr5Package.RIGGER_COMMAND_CONSOLE__GERAETESTUFE:
            case Shr5Package.RIGGER_COMMAND_CONSOLE__FIREWALL:
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG:
            case Shr5Package.RIGGER_COMMAND_CONSOLE__CURRENT_MODUS:
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DEVICE_RATING:
            case Shr5Package.RIGGER_COMMAND_CONSOLE__RAUSCHUNTERDRUECKUNG:
            case Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF:
            case Shr5Package.RIGGER_COMMAND_CONSOLE__DATENVERARBEITUNG_BASIS:
            case Shr5Package.RIGGER_COMMAND_CONSOLE__FIREWALL_BASIS:
            case Shr5Package.RIGGER_COMMAND_CONSOLE__ZUGRIFF_BASIS:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case Shr5Package.RIGGER_COMMAND_CONSOLE__PAN:
            case Shr5Package.RIGGER_COMMAND_CONSOLE__STORED_PROGRAMS:
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
                (Shr5Package.Literals.MATRIX_DEVICE__PAN,
                 Shr5Factory.eINSTANCE.createPersonalAreaNetwork()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__STORED_PROGRAMS,
                 Shr5Factory.eINSTANCE.createAutoSoft()));

        newChildDescriptors.add
            (createChildParameter
                (Shr5Package.Literals.RIGGER_COMMAND_CONSOLE__STORED_PROGRAMS,
                 Shr5Factory.eINSTANCE.createCommonProgram()));
    }

}
