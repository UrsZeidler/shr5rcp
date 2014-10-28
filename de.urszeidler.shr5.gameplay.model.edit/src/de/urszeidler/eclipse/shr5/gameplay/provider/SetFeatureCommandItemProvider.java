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
import de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.SetFeatureCommand} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SetFeatureCommandItemProvider
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
    public SetFeatureCommandItemProvider(AdapterFactory adapterFactory) {
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
            addValuePropertyDescriptor(object);
            addObjectPropertyDescriptor(object);
            addFeaturePropertyDescriptor(object);
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
                 getString("_UI_PropertyDescriptor_description", "_UI_Command_hidden_feature", "_UI_Command_type"),
                 GameplayPackage.Literals.COMMAND__HIDDEN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
                 getString("_UI_SetFeatureCommand_value_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SetFeatureCommand_value_feature", "_UI_SetFeatureCommand_type"),
                 GameplayPackage.Literals.SET_FEATURE_COMMAND__VALUE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Object feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addObjectPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SetFeatureCommand_object_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SetFeatureCommand_object_feature", "_UI_SetFeatureCommand_type"),
                 GameplayPackage.Literals.SET_FEATURE_COMMAND__OBJECT,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Feature feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFeaturePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_SetFeatureCommand_feature_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_SetFeatureCommand_feature_feature", "_UI_SetFeatureCommand_type"),
                 GameplayPackage.Literals.SET_FEATURE_COMMAND__FEATURE,
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
     * This returns SetFeatureCommand.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/SetFeatureCommand"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not 
     */
    @Override
    public String getText(Object object) {
        SetFeatureCommand setFeatureCommand = (SetFeatureCommand)object;
        
        String defaultVaule = getString("_UI_unset");
        ComposeableAdapterFactory factory = ((ComposeableAdapterFactory)this.adapterFactory).getRootAdapterFactory();
        String label_subject = GamplayEditingTools.getLabelForEObject(factory, defaultVaule, setFeatureCommand.getObject());
        String label_feature = GamplayEditingTools.getLabelForEObject(factory, defaultVaule, setFeatureCommand.getFeature());
        String label_object = setFeatureCommand.getValue().toString();
        if (setFeatureCommand.getValue() instanceof EObject) 
         label_object = GamplayEditingTools.getLabelForEObject(factory, defaultVaule, (EObject)setFeatureCommand.getValue());

        return getString("_UI_SetFeatureCommand_type_text",new Object[]{ label_subject,label_feature,label_object });// + " " + setFeatureCommand.isExecuted();
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

        switch (notification.getFeatureID(SetFeatureCommand.class)) {
            case GameplayPackage.SET_FEATURE_COMMAND__EXECUTED:
            case GameplayPackage.SET_FEATURE_COMMAND__DATE:
            case GameplayPackage.SET_FEATURE_COMMAND__CMD_CALLBACK:
            case GameplayPackage.SET_FEATURE_COMMAND__EXECUTING:
            case GameplayPackage.SET_FEATURE_COMMAND__CAN_EXECUTE:
            case GameplayPackage.SET_FEATURE_COMMAND__HIDDEN:
            case GameplayPackage.SET_FEATURE_COMMAND__VALUE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case GameplayPackage.SET_FEATURE_COMMAND__SUB_COMMANDS:
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
