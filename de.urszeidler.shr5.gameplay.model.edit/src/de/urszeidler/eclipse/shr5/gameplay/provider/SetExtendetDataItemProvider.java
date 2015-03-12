/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.SetExtendetData;
import de.urszeidler.eclipse.shr5.util.Shr5EditingTools;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.SetExtendetData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SetExtendetDataItemProvider
    extends ItemProviderAdapter
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
    public SetExtendetDataItemProvider(AdapterFactory adapterFactory) {
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

            addExecutedPropertyDescriptor(object);
            addDatePropertyDescriptor(object);
            addCmdCallbackPropertyDescriptor(object);
            addExecutingPropertyDescriptor(object);
            addCanExecutePropertyDescriptor(object);
            addHiddenPropertyDescriptor(object);
            addDataAwarePropertyDescriptor(object);
            addDataPropertyDescriptor(object);
            addValuePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Executed feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExecutedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Command_executed_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Command_executed_feature", "_UI_Command_type"),
                 GameplayPackage.Literals.COMMAND__EXECUTED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDatePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Command_date_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Command_date_feature", "_UI_Command_type"),
                 GameplayPackage.Literals.COMMAND__DATE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Cmd Callback feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCmdCallbackPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Command_cmdCallback_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Command_cmdCallback_feature", "_UI_Command_type"),
                 GameplayPackage.Literals.COMMAND__CMD_CALLBACK,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Executing feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExecutingPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Command_executing_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Command_executing_feature", "_UI_Command_type"),
                 GameplayPackage.Literals.COMMAND__EXECUTING,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Can Execute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCanExecutePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Command_canExecute_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Command_canExecute_feature", "_UI_Command_type"),
                 GameplayPackage.Literals.COMMAND__CAN_EXECUTE,
                 false,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Hidden feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHiddenPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Command_hidden_feature"),
                 getString("_UI_Command_hidden_description"),
                 GameplayPackage.Literals.COMMAND__HIDDEN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Data Aware feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDataAwarePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SetExtendetData_dataAware_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SetExtendetData_dataAware_feature", "_UI_SetExtendetData_type"),
                 GameplayPackage.Literals.SET_EXTENDET_DATA__DATA_AWARE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Data feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDataPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SetExtendetData_data_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SetExtendetData_data_feature", "_UI_SetExtendetData_type"),
                 GameplayPackage.Literals.SET_EXTENDET_DATA__DATA,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SetExtendetData_value_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SetExtendetData_value_feature", "_UI_SetExtendetData_type"),
                 GameplayPackage.Literals.SET_EXTENDET_DATA__VALUE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
            childrenFeatures.add(GameplayPackage.Literals.COMMAND__SUB_COMMANDS);
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
     * This returns SetExtendetData.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/SetExtendetData"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    @Override
    public String getText(Object object) {
        SetExtendetData setExtendetData = (SetExtendetData)object;
        String defaultVaule = getString("_UI_unset");
        ComposeableAdapterFactory factory = ((ComposeableAdapterFactory)this.adapterFactory).getRootAdapterFactory();
        String label_subject = Shr5EditingTools.getLabelForEObject(factory, defaultVaule, setExtendetData.getDataAware());
        String label_object = setExtendetData.getValue().toString();
        if (setExtendetData.getValue() instanceof EObject) 
         label_object = Shr5EditingTools.getLabelForEObject(factory, defaultVaule, (EObject)setExtendetData.getValue());
            
        return getString("_UI_SetExtendetData_type_text",new Object[]{ label_subject, setExtendetData.getData(), label_object });
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

        switch (notification.getFeatureID(SetExtendetData.class)) {
            case GameplayPackage.SET_EXTENDET_DATA__EXECUTED:
            case GameplayPackage.SET_EXTENDET_DATA__DATE:
            case GameplayPackage.SET_EXTENDET_DATA__CMD_CALLBACK:
            case GameplayPackage.SET_EXTENDET_DATA__EXECUTING:
            case GameplayPackage.SET_EXTENDET_DATA__CAN_EXECUTE:
            case GameplayPackage.SET_EXTENDET_DATA__HIDDEN:
            case GameplayPackage.SET_EXTENDET_DATA__VALUE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case GameplayPackage.SET_EXTENDET_DATA__SUB_COMMANDS:
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
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createDamageTest()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createSkillTestCmd()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createOpposedSkillTestCmd()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createInitative()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createCombatTurn()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createExtendetSkillTestCmd()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createDefensTestCmd()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createSuccesTestCmd()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createInitativePass()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createComplexAction()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createSimpleAction()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createSimpleActions()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createFreeAction()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createInterruptAction()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createSetFeatureCommand()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createMeeleAttackCmd()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createRangedAttackCmd()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createSetExtendetData()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createSemanticAction()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createDrainCommand()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.COMMAND__SUB_COMMANDS,
                 GameplayFactory.eINSTANCE.createCombatSpellCmd()));
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return GameplayEditPlugin.INSTANCE;
    }

}
