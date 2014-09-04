/**
 * (c) Urs Zeilder
 */
package de.urszeidler.eclipse.shr5.gameplay.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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

import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.CombatTurn} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CombatTurnItemProvider
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
    public CombatTurnItemProvider(AdapterFactory adapterFactory) {
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
            addCombatantsPropertyDescriptor(object);
            addCurrentTurnPropertyDescriptor(object);
            addSequencePropertyDescriptor(object);
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
     * This adds a property descriptor for the Combatants feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCombatantsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CombatTurn_combatants_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CombatTurn_combatants_feature", "_UI_CombatTurn_type"),
                 GameplayPackage.Literals.COMBAT_TURN__COMBATANTS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Current Turn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCurrentTurnPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CombatTurn_currentTurn_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CombatTurn_currentTurn_feature", "_UI_CombatTurn_type"),
                 GameplayPackage.Literals.COMBAT_TURN__CURRENT_TURN,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Sequence feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSequencePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CombatTurn_sequence_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CombatTurn_sequence_feature", "_UI_CombatTurn_type"),
                 GameplayPackage.Literals.COMBAT_TURN__SEQUENCE,
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
            childrenFeatures.add(GameplayPackage.Literals.COMMAND__SUB_COMMANDS);
            childrenFeatures.add(GameplayPackage.Literals.COMBAT_TURN__ACTION_PHASES);
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
     * This returns CombatTurn.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CombatTurn"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        CombatTurn combatTurn = (CombatTurn)object;
        return getString("_UI_CombatTurn_type") + " " + combatTurn.isExecuted();
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

        switch (notification.getFeatureID(CombatTurn.class)) {
            case GameplayPackage.COMBAT_TURN__EXECUTED:
            case GameplayPackage.COMBAT_TURN__DATE:
            case GameplayPackage.COMBAT_TURN__CMD_CALLBACK:
            case GameplayPackage.COMBAT_TURN__EXECUTING:
            case GameplayPackage.COMBAT_TURN__CAN_EXECUTE:
            case GameplayPackage.COMBAT_TURN__SEQUENCE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case GameplayPackage.COMBAT_TURN__SUB_COMMANDS:
            case GameplayPackage.COMBAT_TURN__ACTION_PHASES:
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
                (GameplayPackage.Literals.COMBAT_TURN__ACTION_PHASES,
                 GameplayFactory.eINSTANCE.createInitativePass()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify =
            childFeature == GameplayPackage.Literals.COMMAND__SUB_COMMANDS ||
            childFeature == GameplayPackage.Literals.COMBAT_TURN__ACTION_PHASES;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
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
