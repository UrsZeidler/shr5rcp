/**
 * (c) Urs Zeidler
 */
package de.urszeidler.eclipse.shr5.gameplay.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.urszeidler.eclipse.shr5.gameplay.GameplayFactory;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.util.ShadowrunTools;
import de.urszeidler.eclipse.shr5.util.Shr5EditingTools;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;

/**
 * This is the item provider adapter for a {@link de.urszeidler.eclipse.shr5.gameplay.InitativePass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InitativePassItemProvider
    extends SubjectCommandItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InitativePassItemProvider(AdapterFactory adapterFactory) {
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

            addPhasePropertyDescriptor(object);
            addTurnPropertyDescriptor(object);
            addSizeInitativePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Phase feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPhasePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_PhaseCmd_phase_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_PhaseCmd_phase_feature", "_UI_PhaseCmd_type"),
                 GameplayPackage.Literals.PHASE_CMD__PHASE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Turn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTurnPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_InitativePass_turn_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InitativePass_turn_feature", "_UI_InitativePass_type"),
                 GameplayPackage.Literals.INITATIVE_PASS__TURN,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Size Initative feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSizeInitativePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_InitativePass_sizeInitative_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_InitativePass_sizeInitative_feature", "_UI_InitativePass_type"),
                 GameplayPackage.Literals.INITATIVE_PASS__SIZE_INITATIVE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
            childrenFeatures.add(GameplayPackage.Literals.INITATIVE_PASS__ACTION);
            childrenFeatures.add(GameplayPackage.Literals.INITATIVE_PASS__FREE_ACTION);
            childrenFeatures.add(GameplayPackage.Literals.INITATIVE_PASS__INTERRUPT_ACTION);
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
     * This returns InitativePass.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/InitativePass"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated not
     */
    @Override
    public String getText(Object object) {
        InitativePass initativePass = (InitativePass)object;
        if(!initativePass.isExecuted())
            return getString("_UI_InitativePass_type");

        String label =  Shr5EditingTools.getLabelForEObject((ComposeableAdapterFactory)this.adapterFactory, "", initativePass.getSubject());
        return getString("_UI_InitativePass_type_text",new Object[]{label,initativePass.getPhase(),initativePass.getTurn()});
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

        switch (notification.getFeatureID(InitativePass.class)) {
            case GameplayPackage.INITATIVE_PASS__PHASE:
            case GameplayPackage.INITATIVE_PASS__TURN:
            case GameplayPackage.INITATIVE_PASS__SIZE_INITATIVE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case GameplayPackage.INITATIVE_PASS__ACTION:
            case GameplayPackage.INITATIVE_PASS__FREE_ACTION:
            case GameplayPackage.INITATIVE_PASS__INTERRUPT_ACTION:
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
                (GameplayPackage.Literals.INITATIVE_PASS__ACTION,
                 GameplayFactory.eINSTANCE.createComplexAction()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.INITATIVE_PASS__ACTION,
                 GameplayFactory.eINSTANCE.createSimpleActions()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.INITATIVE_PASS__FREE_ACTION,
                 GameplayFactory.eINSTANCE.createFreeAction()));

        newChildDescriptors.add
            (createChildParameter
                (GameplayPackage.Literals.INITATIVE_PASS__INTERRUPT_ACTION,
                 GameplayFactory.eINSTANCE.createInterruptAction()));
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
            childFeature == GameplayPackage.Literals.INITATIVE_PASS__ACTION ||
            childFeature == GameplayPackage.Literals.INITATIVE_PASS__FREE_ACTION ||
            childFeature == GameplayPackage.Literals.INITATIVE_PASS__INTERRUPT_ACTION;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}
